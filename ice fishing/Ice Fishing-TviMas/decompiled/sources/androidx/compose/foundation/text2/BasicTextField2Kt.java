package androidx.compose.foundation.text2;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.SingleLineCodepointTransformation;
import androidx.compose.foundation.text2.input.TextFieldLineLimits;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt;
import androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicTextField2.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aÙ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001628\b\u0002\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018¢\u0006\u0002\b\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)\u001aí\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050-2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u001628\b\u0002\u0010\u0017\u001a2\u0012\u0004\u0012\u00020\u0019\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018¢\u0006\u0002\b\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\u001a\u0015\u00103\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u008e\u0002"}, d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "getDefaultTextFieldDecorator$annotations", "()V", "BasicTextField2", "", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/foundation/text2/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "lineLimits", "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", SDKConstants.PARAM_VALUE, "", "onValueChange", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "valueWithSelection", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextField2Kt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextField2Kt$DefaultTextFieldDecorator$1.INSTANCE;

    private static /* synthetic */ void getDefaultTextFieldDecorator$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField2(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier.Companion companion;
        KeyboardOptions keyboardOptions2;
        MutableInteractionSource mutableInteractionSource2;
        SolidColor solidColor;
        MutableInteractionSource mutableInteractionSource3;
        ScrollState scrollState2;
        TextFieldDecorator textFieldDecorator2;
        Brush brush2;
        CodepointTransformation codepointTransformation2;
        int i18;
        boolean z3;
        KeyboardActions keyboardActions2;
        TextFieldLineLimits textFieldLineLimits2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        boolean z4;
        InputTransformation inputTransformation2;
        TextStyle textStyle2;
        Object rememberedValue;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        MutableInteractionSource mutableInteractionSource4;
        Brush brush3;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final TextFieldLineLimits textFieldLineLimits3;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24;
        MutableInteractionSource mutableInteractionSource5;
        Brush brush4;
        Modifier modifier2;
        TextStyle textStyle3;
        final KeyboardActions keyboardActions3;
        final ScrollState scrollState3;
        boolean z5;
        InputTransformation inputTransformation3;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-797091052);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField2)P(15,11,9,3,12,4,14,7,6,8,10,5,1)186@11484L21,190@11642L213,200@12048L174,210@12291L1011:BasicTextField2.kt#g98mwb");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(inputTransformation) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(textStyle) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(keyboardOptions) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(keyboardActions) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i3 & 512;
                if (i11 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(textFieldLineLimits) ? 536870912 : 268435456;
                }
                i12 = i3 & 1024;
                if (i12 != 0) {
                    i13 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i13 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                } else {
                    i13 = i2;
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i2 & 112) == 0) {
                    i13 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                }
                int i20 = i13;
                i15 = i3 & 4096;
                if (i15 != 0) {
                    i20 |= 384;
                } else if ((i2 & 896) == 0) {
                    i20 |= startRestartGroup.changed(brush) ? 256 : 128;
                    i16 = i3 & 8192;
                    if (i16 == 0) {
                        i20 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i20 |= startRestartGroup.changed(codepointTransformation) ? 2048 : 1024;
                        i17 = i3 & 16384;
                        if (i17 != 0) {
                            i20 |= 24576;
                        } else if ((i2 & 57344) == 0) {
                            i20 |= startRestartGroup.changed(textFieldDecorator) ? 16384 : 8192;
                        }
                        if ((i2 & 458752) == 0) {
                            i20 |= ((i3 & 32768) == 0 && startRestartGroup.changed(scrollState)) ? 131072 : 65536;
                        }
                        if ((i4 & 1533916891) == 306783378 || (374491 & i20) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i19 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z7 = i5 != 0 ? true : z;
                                boolean z8 = i6 != 0 ? false : z2;
                                InputTransformation inputTransformation4 = i7 != 0 ? null : inputTransformation;
                                TextStyle textStyle4 = i8 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                keyboardOptions2 = i9 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                KeyboardActions keyboardActions4 = i10 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                TextFieldLineLimits textFieldLineLimits4 = i11 != 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = i12 != 0 ? null : function2;
                                MutableInteractionSource mutableInteractionSource6 = i14 != 0 ? null : mutableInteractionSource;
                                if (i15 != 0) {
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    solidColor = new SolidColor(Color.INSTANCE.m3433getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    solidColor = brush;
                                }
                                CodepointTransformation codepointTransformation3 = i16 != 0 ? null : codepointTransformation;
                                TextFieldDecorator textFieldDecorator3 = i17 != 0 ? null : textFieldDecorator;
                                if ((i3 & 32768) != 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    codepointTransformation2 = codepointTransformation3;
                                    i18 = i20 & (-458753);
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    z3 = z8;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    function22 = function25;
                                    brush2 = solidColor;
                                    inputTransformation2 = inputTransformation4;
                                    textStyle2 = textStyle4;
                                    keyboardActions2 = keyboardActions4;
                                    z4 = z7;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    scrollState2 = scrollState;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    brush2 = solidColor;
                                    codepointTransformation2 = codepointTransformation3;
                                    i18 = i20;
                                    z3 = z8;
                                    keyboardActions2 = keyboardActions4;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    function22 = function25;
                                    z4 = z7;
                                    inputTransformation2 = inputTransformation4;
                                    textStyle2 = textStyle4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32768) != 0) {
                                    i20 &= -458753;
                                }
                                companion = modifier;
                                z4 = z;
                                z3 = z2;
                                inputTransformation2 = inputTransformation;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                textFieldLineLimits2 = textFieldLineLimits;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush2 = brush;
                                codepointTransformation2 = codepointTransformation;
                                textFieldDecorator2 = textFieldDecorator;
                                scrollState2 = scrollState;
                                i18 = i20;
                                function22 = function2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-797091052, i4, i18, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:189)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                function23 = function22;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                brush3 = brush2;
                                rememberedValue = new TextFieldState(str, TextRangeKt.TextRange(str.length()), (DefaultConstructorMarker) null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                function23 = function22;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                brush3 = brush2;
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextFieldState textFieldState = (TextFieldState) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final MutableState mutableState = (MutableState) rememberedValue2;
                            mutableState.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null));
                            TextFieldValue BasicTextField2$lambda$2 = BasicTextField2$lambda$2(mutableState);
                            startRestartGroup.startReplaceableGroup(1290401378);
                            changed = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(function1);
                            TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits2;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                        invoke2(textFieldValue);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue) {
                                        TextFieldValue BasicTextField2$lambda$22;
                                        String text = textFieldValue.getText();
                                        BasicTextField2$lambda$22 = BasicTextField2Kt.BasicTextField2$lambda$2(mutableState);
                                        if (!Intrinsics.areEqual(text, BasicTextField2$lambda$22.getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i21 = i4 >> 3;
                            BasicTextField2(textFieldState, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState, BasicTextField2$lambda$2, (Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits5, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, (i21 & 234881024) | (i21 & 896) | 6 | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (3670016 & i21) | (29360128 & i21) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textFieldLineLimits3 = textFieldLineLimits5;
                            function24 = function23;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            brush4 = brush3;
                            modifier2 = companion;
                            textStyle3 = textStyle2;
                            keyboardActions3 = keyboardActions2;
                            scrollState3 = scrollState2;
                            z5 = z3;
                            inputTransformation3 = inputTransformation2;
                            z6 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z6 = z;
                            z5 = z2;
                            inputTransformation3 = inputTransformation;
                            textStyle3 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions3 = keyboardActions;
                            textFieldLineLimits3 = textFieldLineLimits;
                            function24 = function2;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush4 = brush;
                            codepointTransformation2 = codepointTransformation;
                            textFieldDecorator2 = textFieldDecorator;
                            scrollState3 = scrollState;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final boolean z9 = z6;
                            final boolean z10 = z5;
                            final InputTransformation inputTransformation5 = inputTransformation3;
                            final TextStyle textStyle5 = textStyle3;
                            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function24;
                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                            final Brush brush5 = brush4;
                            final CodepointTransformation codepointTransformation4 = codepointTransformation2;
                            final TextFieldDecorator textFieldDecorator4 = textFieldDecorator2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i22) {
                                    BasicTextField2Kt.BasicTextField2(str, function1, modifier3, z9, z10, inputTransformation5, textStyle5, keyboardOptions3, keyboardActions3, textFieldLineLimits3, function26, mutableInteractionSource7, brush5, codepointTransformation4, textFieldDecorator4, scrollState3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i17 = i3 & 16384;
                    if (i17 != 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i3 & 32768) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState textFieldState2 = (TextFieldState) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final MutableState<TextFieldValue> mutableState2 = (MutableState) rememberedValue2;
                    mutableState2.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState2), str, 0L, (TextRange) null, 6, (Object) null));
                    TextFieldValue BasicTextField2$lambda$22 = BasicTextField2$lambda$2(mutableState2);
                    startRestartGroup.startReplaceableGroup(1290401378);
                    changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(function1);
                    TextFieldLineLimits textFieldLineLimits52 = textFieldLineLimits2;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextFieldValue textFieldValue) {
                            TextFieldValue BasicTextField2$lambda$222;
                            String text = textFieldValue.getText();
                            BasicTextField2$lambda$222 = BasicTextField2Kt.BasicTextField2$lambda$2(mutableState2);
                            if (!Intrinsics.areEqual(text, BasicTextField2$lambda$222.getText())) {
                                function1.invoke(textFieldValue.getText());
                            }
                            mutableState2.setValue(textFieldValue);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    int i212 = i4 >> 3;
                    BasicTextField2(textFieldState2, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState2, BasicTextField2$lambda$22, (Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits52, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, (i212 & 234881024) | (i212 & 896) | 6 | (i212 & 7168) | (i212 & 57344) | (i212 & 458752) | (3670016 & i212) | (29360128 & i212) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textFieldLineLimits3 = textFieldLineLimits52;
                    function24 = function23;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    brush4 = brush3;
                    modifier2 = companion;
                    textStyle3 = textStyle2;
                    keyboardActions3 = keyboardActions2;
                    scrollState3 = scrollState2;
                    z5 = z3;
                    inputTransformation3 = inputTransformation2;
                    z6 = z4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i16 = i3 & 8192;
                if (i16 == 0) {
                }
                i17 = i3 & 16384;
                if (i17 != 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i3 & 32768) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextFieldState textFieldState22 = (TextFieldState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<TextFieldValue> mutableState22 = (MutableState) rememberedValue2;
                mutableState22.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState22), str, 0L, (TextRange) null, 6, (Object) null));
                TextFieldValue BasicTextField2$lambda$222 = BasicTextField2$lambda$2(mutableState22);
                startRestartGroup.startReplaceableGroup(1290401378);
                changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(function1);
                TextFieldLineLimits textFieldLineLimits522 = textFieldLineLimits2;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue) {
                        TextFieldValue BasicTextField2$lambda$2222;
                        String text = textFieldValue.getText();
                        BasicTextField2$lambda$2222 = BasicTextField2Kt.BasicTextField2$lambda$2(mutableState22);
                        if (!Intrinsics.areEqual(text, BasicTextField2$lambda$2222.getText())) {
                            function1.invoke(textFieldValue.getText());
                        }
                        mutableState22.setValue(textFieldValue);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                int i2122 = i4 >> 3;
                BasicTextField2(textFieldState22, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState22, BasicTextField2$lambda$222, (Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits522, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, (i2122 & 234881024) | (i2122 & 896) | 6 | (i2122 & 7168) | (i2122 & 57344) | (i2122 & 458752) | (3670016 & i2122) | (29360128 & i2122) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                textFieldLineLimits3 = textFieldLineLimits522;
                function24 = function23;
                mutableInteractionSource5 = mutableInteractionSource4;
                brush4 = brush3;
                modifier2 = companion;
                textStyle3 = textStyle2;
                keyboardActions3 = keyboardActions2;
                scrollState3 = scrollState2;
                z5 = z3;
                inputTransformation3 = inputTransformation2;
                z6 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
            }
            int i202 = i13;
            i15 = i3 & 4096;
            if (i15 != 0) {
            }
            i16 = i3 & 8192;
            if (i16 == 0) {
            }
            i17 = i3 & 16384;
            if (i17 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldState textFieldState222 = (TextFieldState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<TextFieldValue> mutableState222 = (MutableState) rememberedValue2;
            mutableState222.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState222), str, 0L, (TextRange) null, 6, (Object) null));
            TextFieldValue BasicTextField2$lambda$2222 = BasicTextField2$lambda$2(mutableState222);
            startRestartGroup.startReplaceableGroup(1290401378);
            changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changedInstance(function1);
            TextFieldLineLimits textFieldLineLimits5222 = textFieldLineLimits2;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                    invoke2(textFieldValue);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextFieldValue textFieldValue) {
                    TextFieldValue BasicTextField2$lambda$22222;
                    String text = textFieldValue.getText();
                    BasicTextField2$lambda$22222 = BasicTextField2Kt.BasicTextField2$lambda$2(mutableState222);
                    if (!Intrinsics.areEqual(text, BasicTextField2$lambda$22222.getText())) {
                        function1.invoke(textFieldValue.getText());
                    }
                    mutableState222.setValue(textFieldValue);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            int i21222 = i4 >> 3;
            BasicTextField2(textFieldState222, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState222, BasicTextField2$lambda$2222, (Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits5222, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, (i21222 & 234881024) | (i21222 & 896) | 6 | (i21222 & 7168) | (i21222 & 57344) | (i21222 & 458752) | (3670016 & i21222) | (29360128 & i21222) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            textFieldLineLimits3 = textFieldLineLimits5222;
            function24 = function23;
            mutableInteractionSource5 = mutableInteractionSource4;
            brush4 = brush3;
            modifier2 = companion;
            textStyle3 = textStyle2;
            keyboardActions3 = keyboardActions2;
            scrollState3 = scrollState2;
            z5 = z3;
            inputTransformation3 = inputTransformation2;
            z6 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
        }
        int i2022 = i13;
        i15 = i3 & 4096;
        if (i15 != 0) {
        }
        i16 = i3 & 8192;
        if (i16 == 0) {
        }
        i17 = i3 & 16384;
        if (i17 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextFieldState textFieldState2222 = (TextFieldState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<TextFieldValue> mutableState2222 = (MutableState) rememberedValue2;
        mutableState2222.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicTextField2$lambda$2(mutableState2222), str, 0L, (TextRange) null, 6, (Object) null));
        TextFieldValue BasicTextField2$lambda$22222 = BasicTextField2$lambda$2(mutableState2222);
        startRestartGroup.startReplaceableGroup(1290401378);
        changed = startRestartGroup.changed(mutableState2222) | startRestartGroup.changedInstance(function1);
        TextFieldLineLimits textFieldLineLimits52222 = textFieldLineLimits2;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
                TextFieldValue BasicTextField2$lambda$222222;
                String text = textFieldValue.getText();
                BasicTextField2$lambda$222222 = BasicTextField2Kt.BasicTextField2$lambda$2(mutableState2222);
                if (!Intrinsics.areEqual(text, BasicTextField2$lambda$222222.getText())) {
                    function1.invoke(textFieldValue.getText());
                }
                mutableState2222.setValue(textFieldValue);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        int i212222 = i4 >> 3;
        BasicTextField2(textFieldState2222, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState2222, BasicTextField2$lambda$22222, (Function1) rememberedValue3, false), z4, z3, inputTransformation2, textStyle2, keyboardOptions2, keyboardActions2, textFieldLineLimits52222, function23, mutableInteractionSource4, brush3, codepointTransformation2, textFieldDecorator2, scrollState2, startRestartGroup, (i212222 & 234881024) | (i212222 & 896) | 6 | (i212222 & 7168) | (i212222 & 57344) | (i212222 & 458752) | (3670016 & i212222) | (29360128 & i212222) | ((i18 << 27) & 1879048192), (i18 >> 3) & 65534, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        textFieldLineLimits3 = textFieldLineLimits52222;
        function24 = function23;
        mutableInteractionSource5 = mutableInteractionSource4;
        brush4 = brush3;
        modifier2 = companion;
        textStyle3 = textStyle2;
        keyboardActions3 = keyboardActions2;
        scrollState3 = scrollState2;
        z5 = z3;
        inputTransformation3 = inputTransformation2;
        z6 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField2$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x03c1, code lost:
    
        if (r8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0421  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v18, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r50v0, types: [androidx.compose.foundation.text2.TextFieldDecorator, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField2(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier.Companion companion;
        boolean z3;
        boolean z4;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        TextFieldLineLimits textFieldLineLimits2;
        CodepointTransformation codepointTransformation2;
        SolidColor solidColor;
        ScrollState scrollState2;
        int i18;
        CodepointTransformation codepointTransformation3;
        MutableInteractionSource mutableInteractionSource2;
        CodepointTransformation codepointTransformation4;
        TextFieldLineLimits textFieldLineLimits3;
        Brush brush2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        InputTransformation inputTransformation2;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        boolean changed;
        LayoutDirection layoutDirection;
        SingleLineCodepointTransformation singleLineCodepointTransformation;
        boolean changed2;
        Object rememberedValue;
        boolean changed3;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Modifier modifier2;
        Composer m2937constructorimpl;
        final InputTransformation inputTransformation3;
        final boolean z5;
        final boolean z6;
        final KeyboardActions keyboardActions3;
        final Brush brush3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final ScrollState scrollState3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final TextFieldLineLimits textFieldLineLimits4;
        final MutableInteractionSource mutableInteractionSource5;
        final ?? r14;
        final CodepointTransformation codepointTransformation5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(437246650);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField2)P(13,9,3,11,4,14,7,6,8,10,5,1)331@19539L21,335@19712L7,336@19767L7,337@19812L7,343@20182L25,346@20295L598,357@21091L48,359@21175L319,369@21547L7,370@21611L7,371@21665L7,372@21677L440,385@22123L125,423@23614L2468:BasicTextField2.kt#g98mwb");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 7168) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    int i20 = 8192;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 57344) == 0) {
                        i4 |= startRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i4 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= startRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    }
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i14 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i14 |= startRestartGroup.changed(brush) ? 32 : 16;
                    }
                    int i21 = i14;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i21 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i21 |= startRestartGroup.changed(codepointTransformation) ? 256 : 128;
                        i17 = i3 & 8192;
                        if (i17 != 0) {
                            i21 |= 3072;
                        } else if ((i2 & 7168) == 0) {
                            i21 |= startRestartGroup.changed((Object) textFieldDecorator) ? 2048 : 1024;
                            if ((i2 & 57344) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(scrollState)) {
                                    i20 = 16384;
                                }
                                i21 |= i20;
                            }
                            if ((i4 & 1533916891) == 306783378 || (46811 & i21) != 9362 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i19 == 0 ? Modifier.INSTANCE : modifier;
                                    z3 = i5 == 0 ? true : z;
                                    z4 = i6 == 0 ? false : z2;
                                    InputTransformation inputTransformation4 = i7 == 0 ? null : inputTransformation;
                                    textStyle2 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                    keyboardOptions2 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    keyboardActions2 = i10 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    TextFieldLineLimits textFieldLineLimits5 = i11 == 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = i12 == 0 ? null : function2;
                                    MutableInteractionSource mutableInteractionSource6 = i13 == 0 ? null : mutableInteractionSource;
                                    if (i15 == 0) {
                                        textFieldLineLimits2 = textFieldLineLimits5;
                                        codepointTransformation2 = null;
                                        solidColor = new SolidColor(Color.INSTANCE.m3433getBlack0d7_KjU(), null);
                                    } else {
                                        textFieldLineLimits2 = textFieldLineLimits5;
                                        codepointTransformation2 = null;
                                        solidColor = brush;
                                    }
                                    CodepointTransformation codepointTransformation6 = i16 == 0 ? codepointTransformation2 : codepointTransformation;
                                    CodepointTransformation codepointTransformation7 = i17 == 0 ? codepointTransformation2 : textFieldDecorator;
                                    if ((i3 & 16384) == 0) {
                                        scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        i21 &= -57345;
                                    } else {
                                        scrollState2 = scrollState;
                                    }
                                    i18 = i21;
                                    codepointTransformation3 = codepointTransformation7;
                                    mutableInteractionSource2 = mutableInteractionSource6;
                                    codepointTransformation4 = codepointTransformation6;
                                    textFieldLineLimits3 = textFieldLineLimits2;
                                    brush2 = solidColor;
                                    function22 = function24;
                                    inputTransformation2 = inputTransformation4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    companion = modifier;
                                    z3 = z;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    textStyle2 = textStyle;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    function22 = function2;
                                    brush2 = brush;
                                    codepointTransformation4 = codepointTransformation;
                                    codepointTransformation3 = textFieldDecorator;
                                    scrollState2 = scrollState;
                                    i18 = i21;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(437246650, i4, i18, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:334)");
                                }
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Density density = (Density) consume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                LayoutDirection layoutDirection2 = (LayoutDirection) consume2;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function22;
                                ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(localWindowInfo);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                WindowInfo windowInfo = (WindowInfo) consume3;
                                final boolean areEqual = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                                final Brush brush4 = brush2;
                                startRestartGroup.startReplaceableGroup(-957633428);
                                ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                                if (mutableInteractionSource2 != null) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource4 = (MutableInteractionSource) rememberedValue3;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                startRestartGroup.endReplaceableGroup();
                                Orientation orientation = !areEqual ? Orientation.Horizontal : Orientation.Vertical;
                                final TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits3;
                                CodepointTransformation codepointTransformation8 = codepointTransformation3;
                                final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                                final boolean isWindowFocused = windowInfo.isWindowFocused();
                                startRestartGroup.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                                final Orientation orientation2 = orientation;
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (changed) {
                                    layoutDirection = layoutDirection2;
                                } else {
                                    layoutDirection = layoutDirection2;
                                }
                                if (codepointTransformation4 != null) {
                                    SingleLineCodepointTransformation singleLineCodepointTransformation2 = SingleLineCodepointTransformation.INSTANCE;
                                    if (!areEqual) {
                                        singleLineCodepointTransformation2 = null;
                                    }
                                    singleLineCodepointTransformation = singleLineCodepointTransformation2;
                                } else {
                                    singleLineCodepointTransformation = codepointTransformation4;
                                }
                                TransformedTextFieldState transformedTextFieldState = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                                startRestartGroup.updateRememberedValue(transformedTextFieldState);
                                rememberedValue4 = transformedTextFieldState;
                                startRestartGroup.endReplaceableGroup();
                                final TransformedTextFieldState transformedTextFieldState2 = (TransformedTextFieldState) rememberedValue4;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(transformedTextFieldState2);
                                CodepointTransformation codepointTransformation9 = codepointTransformation4;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new TextLayoutState();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final TextLayoutState textLayoutState = (TextLayoutState) rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(transformedTextFieldState2);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new TextFieldSelectionState(transformedTextFieldState2, textLayoutState, density, z3, z4, !booleanValue && isWindowFocused);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                final TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) rememberedValue2;
                                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume4 = startRestartGroup.consume(localHapticFeedback);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final HapticFeedback hapticFeedback = (HapticFeedback) consume4;
                                ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume5 = startRestartGroup.consume(localClipboardManager);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final ClipboardManager clipboardManager = (ClipboardManager) consume5;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource4;
                                ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume6 = startRestartGroup.consume(localTextToolbar);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final TextToolbar textToolbar = (TextToolbar) consume6;
                                final boolean z7 = z3;
                                final boolean z8 = z4;
                                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        TextFieldSelectionState.this.update(hapticFeedback, clipboardManager, textToolbar, density, z7, z8);
                                    }
                                }, startRestartGroup, 0);
                                EffectsKt.DisposableEffect(textFieldSelectionState, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                        final TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                TextFieldSelectionState.this.dispose();
                                            }
                                        };
                                    }
                                }, startRestartGroup, 8);
                                Modifier scrollable$default = ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState2, textLayoutState, textFieldSelectionState, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual)), z3, mutableInteractionSource7), scrollState2, orientation2, !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation2, false), null, mutableInteractionSource7, 16, null);
                                startRestartGroup.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(scrollable$default);
                                modifier2 = companion;
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                                final TextStyle textStyle4 = textStyle2;
                                final boolean z9 = z3;
                                final boolean z10 = z4;
                                final ScrollState scrollState4 = scrollState2;
                                (codepointTransformation8 != null ? DefaultTextFieldDecorator : codepointTransformation8).Decoration(ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i22) {
                                        int i23;
                                        int i24;
                                        ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                                        if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                            }
                                            TextFieldLineLimits textFieldLineLimits7 = TextFieldLineLimits.this;
                                            if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                                                i23 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                                i24 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                            } else {
                                                i23 = 1;
                                                i24 = 1;
                                            }
                                            Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState.m1142getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4, i23, i24), textStyle4)).then(new TextFieldCoreModifier(booleanValue && isWindowFocused, textLayoutState, transformedTextFieldState2, textFieldSelectionState, brush4, z9 && !z10, scrollState4, orientation2));
                                            TextLayoutState textLayoutState2 = textLayoutState;
                                            TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2;
                                            TextStyle textStyle5 = textStyle4;
                                            boolean z11 = areEqual;
                                            Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                            boolean z12 = z9;
                                            boolean z13 = booleanValue;
                                            boolean z14 = isWindowFocused;
                                            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                            boolean z15 = z10;
                                            composer2.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                                            Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                                            BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState2, transformedTextFieldState3, textStyle5, z11, function26), composer2, 0);
                                            composer2.startReplaceableGroup(-39277302);
                                            ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                                            if (z12 && z13 && z14 && textFieldSelectionState2.isInTouchMode()) {
                                                BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState2, composer2, 8);
                                                if (!z15) {
                                                    BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState2, composer2, 8);
                                                }
                                            }
                                            composer2.endReplaceableGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                inputTransformation3 = inputTransformation2;
                                z5 = z3;
                                z6 = z4;
                                keyboardActions3 = keyboardActions2;
                                brush3 = brush4;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                scrollState3 = scrollState2;
                                function23 = function25;
                                textFieldLineLimits4 = textFieldLineLimits6;
                                mutableInteractionSource5 = mutableInteractionSource3;
                                r14 = codepointTransformation8;
                                codepointTransformation5 = codepointTransformation9;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                inputTransformation3 = inputTransformation;
                                textStyle3 = textStyle;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions3 = keyboardActions;
                                textFieldLineLimits4 = textFieldLineLimits;
                                function23 = function2;
                                mutableInteractionSource5 = mutableInteractionSource;
                                brush3 = brush;
                                codepointTransformation5 = codepointTransformation;
                                r14 = textFieldDecorator;
                                scrollState3 = scrollState;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier3 = modifier2;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i22) {
                                        BasicTextField2Kt.BasicTextField2(TextFieldState.this, modifier3, z5, z6, inputTransformation3, textStyle3, keyboardOptions3, keyboardActions3, textFieldLineLimits4, function23, mutableInteractionSource5, brush3, codepointTransformation5, r14, scrollState3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i2 & 57344) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        i18 = i21;
                        codepointTransformation3 = codepointTransformation7;
                        mutableInteractionSource2 = mutableInteractionSource6;
                        codepointTransformation4 = codepointTransformation6;
                        textFieldLineLimits3 = textFieldLineLimits2;
                        brush2 = solidColor;
                        function22 = function24;
                        inputTransformation2 = inputTransformation4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume7 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density2 = (Density) consume7;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection22 = (LayoutDirection) consume22;
                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function252 = function22;
                        ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume32 = startRestartGroup.consume(localWindowInfo2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        WindowInfo windowInfo2 = (WindowInfo) consume32;
                        final boolean areEqual2 = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                        final Brush brush42 = brush2;
                        startRestartGroup.startReplaceableGroup(-957633428);
                        ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                        if (mutableInteractionSource2 != null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        if (!areEqual2) {
                        }
                        final TextFieldLineLimits textFieldLineLimits62 = textFieldLineLimits3;
                        CodepointTransformation codepointTransformation82 = codepointTransformation3;
                        final boolean booleanValue2 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                        final boolean isWindowFocused2 = windowInfo2.isWindowFocused();
                        startRestartGroup.startReplaceableGroup(1618982084);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                        final Orientation orientation22 = orientation;
                        Object rememberedValue42 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        if (codepointTransformation4 != null) {
                        }
                        TransformedTextFieldState transformedTextFieldState3 = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                        startRestartGroup.updateRememberedValue(transformedTextFieldState3);
                        rememberedValue42 = transformedTextFieldState3;
                        startRestartGroup.endReplaceableGroup();
                        final TransformedTextFieldState transformedTextFieldState22 = (TransformedTextFieldState) rememberedValue42;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transformedTextFieldState22);
                        CodepointTransformation codepointTransformation92 = codepointTransformation4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue = new TextLayoutState();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        final TextLayoutState textLayoutState2 = (TextLayoutState) rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(transformedTextFieldState22);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue2 = new TextFieldSelectionState(transformedTextFieldState22, textLayoutState2, density2, z3, z4, !booleanValue2 && isWindowFocused2);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        final TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) rememberedValue2;
                        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume42 = startRestartGroup.consume(localHapticFeedback2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final HapticFeedback hapticFeedback2 = (HapticFeedback) consume42;
                        ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume52 = startRestartGroup.consume(localClipboardManager2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final ClipboardManager clipboardManager2 = (ClipboardManager) consume52;
                        MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource4;
                        ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume62 = startRestartGroup.consume(localTextToolbar2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TextToolbar textToolbar2 = (TextToolbar) consume62;
                        final boolean z72 = z3;
                        final boolean z82 = z4;
                        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                TextFieldSelectionState.this.update(hapticFeedback2, clipboardManager2, textToolbar2, density2, z72, z82);
                            }
                        }, startRestartGroup, 0);
                        EffectsKt.DisposableEffect(textFieldSelectionState2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final TextFieldSelectionState textFieldSelectionState22 = TextFieldSelectionState.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        TextFieldSelectionState.this.dispose();
                                    }
                                };
                            }
                        }, startRestartGroup, 8);
                        Modifier scrollable$default2 = ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState22, textLayoutState2, textFieldSelectionState2, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual2)), z3, mutableInteractionSource72), scrollState2, orientation22, !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState2.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation22, false), null, mutableInteractionSource72, 16, null);
                        startRestartGroup.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(scrollable$default2);
                        modifier2 = companion;
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m2937constructorimpl.getInserting()) {
                        }
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                        final TextStyle textStyle42 = textStyle2;
                        final boolean z92 = z3;
                        final boolean z102 = z4;
                        final ScrollState scrollState42 = scrollState2;
                        (codepointTransformation82 != null ? DefaultTextFieldDecorator : codepointTransformation82).Decoration(ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i22) {
                                int i23;
                                int i24;
                                ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                                if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                    }
                                    TextFieldLineLimits textFieldLineLimits7 = TextFieldLineLimits.this;
                                    if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                                        i23 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                        i24 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                    } else {
                                        i23 = 1;
                                        i24 = 1;
                                    }
                                    Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState2.m1142getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i23, i24), textStyle42)).then(new TextFieldCoreModifier(booleanValue2 && isWindowFocused2, textLayoutState2, transformedTextFieldState22, textFieldSelectionState2, brush42, z92 && !z102, scrollState42, orientation22));
                                    TextLayoutState textLayoutState22 = textLayoutState2;
                                    TransformedTextFieldState transformedTextFieldState32 = transformedTextFieldState22;
                                    TextStyle textStyle5 = textStyle42;
                                    boolean z11 = areEqual2;
                                    Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function252;
                                    boolean z12 = z92;
                                    boolean z13 = booleanValue2;
                                    boolean z14 = isWindowFocused2;
                                    TextFieldSelectionState textFieldSelectionState22 = textFieldSelectionState2;
                                    boolean z15 = z102;
                                    composer2.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(then);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor22);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                                    Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                    }
                                    modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                                    BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState22, transformedTextFieldState32, textStyle5, z11, function26), composer2, 0);
                                    composer2.startReplaceableGroup(-39277302);
                                    ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                                    if (z12 && z13 && z14 && textFieldSelectionState22.isInTouchMode()) {
                                        BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState22, composer2, 8);
                                        if (!z15) {
                                            BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState22, composer2, 8);
                                        }
                                    }
                                    composer2.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        inputTransformation3 = inputTransformation2;
                        z5 = z3;
                        z6 = z4;
                        keyboardActions3 = keyboardActions2;
                        brush3 = brush42;
                        textStyle3 = textStyle2;
                        keyboardOptions3 = keyboardOptions2;
                        scrollState3 = scrollState2;
                        function23 = function252;
                        textFieldLineLimits4 = textFieldLineLimits62;
                        mutableInteractionSource5 = mutableInteractionSource3;
                        r14 = codepointTransformation82;
                        codepointTransformation5 = codepointTransformation92;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i17 = i3 & 8192;
                    if (i17 != 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    i18 = i21;
                    codepointTransformation3 = codepointTransformation7;
                    mutableInteractionSource2 = mutableInteractionSource6;
                    codepointTransformation4 = codepointTransformation6;
                    textFieldLineLimits3 = textFieldLineLimits2;
                    brush2 = solidColor;
                    function22 = function24;
                    inputTransformation2 = inputTransformation4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume72 = startRestartGroup.consume(localDensity22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density22 = (Density) consume72;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection222 = (LayoutDirection) consume222;
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2522 = function22;
                    ProvidableCompositionLocal<WindowInfo> localWindowInfo22 = CompositionLocalsKt.getLocalWindowInfo();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume322 = startRestartGroup.consume(localWindowInfo22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    WindowInfo windowInfo22 = (WindowInfo) consume322;
                    final boolean areEqual22 = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                    final Brush brush422 = brush2;
                    startRestartGroup.startReplaceableGroup(-957633428);
                    ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                    if (mutableInteractionSource2 != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!areEqual22) {
                    }
                    final TextFieldLineLimits textFieldLineLimits622 = textFieldLineLimits3;
                    CodepointTransformation codepointTransformation822 = codepointTransformation3;
                    final boolean booleanValue22 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                    final boolean isWindowFocused22 = windowInfo22.isWindowFocused();
                    startRestartGroup.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                    final Orientation orientation222 = orientation;
                    Object rememberedValue422 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    if (codepointTransformation4 != null) {
                    }
                    TransformedTextFieldState transformedTextFieldState32 = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                    startRestartGroup.updateRememberedValue(transformedTextFieldState32);
                    rememberedValue422 = transformedTextFieldState32;
                    startRestartGroup.endReplaceableGroup();
                    final TransformedTextFieldState transformedTextFieldState222 = (TransformedTextFieldState) rememberedValue422;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transformedTextFieldState222);
                    CodepointTransformation codepointTransformation922 = codepointTransformation4;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue = new TextLayoutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final TextLayoutState textLayoutState22 = (TextLayoutState) rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(transformedTextFieldState222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue2 = new TextFieldSelectionState(transformedTextFieldState222, textLayoutState22, density22, z3, z4, !booleanValue22 && isWindowFocused22);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldSelectionState textFieldSelectionState22 = (TextFieldSelectionState) rememberedValue2;
                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume422 = startRestartGroup.consume(localHapticFeedback22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final HapticFeedback hapticFeedback22 = (HapticFeedback) consume422;
                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume522 = startRestartGroup.consume(localClipboardManager22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final ClipboardManager clipboardManager22 = (ClipboardManager) consume522;
                    MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource4;
                    ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume622 = startRestartGroup.consume(localTextToolbar22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TextToolbar textToolbar22 = (TextToolbar) consume622;
                    final boolean z722 = z3;
                    final boolean z822 = z4;
                    EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            TextFieldSelectionState.this.update(hapticFeedback22, clipboardManager22, textToolbar22, density22, z722, z822);
                        }
                    }, startRestartGroup, 0);
                    EffectsKt.DisposableEffect(textFieldSelectionState22, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final TextFieldSelectionState textFieldSelectionState222 = TextFieldSelectionState.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionState.this.dispose();
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    Modifier scrollable$default22 = ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState222, textLayoutState22, textFieldSelectionState22, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual22)), z3, mutableInteractionSource722), scrollState2, orientation222, !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState22.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation222, false), null, mutableInteractionSource722, 16, null);
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(scrollable$default22);
                    modifier2 = companion;
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m2937constructorimpl.getInserting()) {
                    }
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                    final TextStyle textStyle422 = textStyle2;
                    final boolean z922 = z3;
                    final boolean z1022 = z4;
                    final ScrollState scrollState422 = scrollState2;
                    (codepointTransformation822 != null ? DefaultTextFieldDecorator : codepointTransformation822).Decoration(ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i22) {
                            int i23;
                            int i24;
                            ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                            if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                                }
                                TextFieldLineLimits textFieldLineLimits7 = TextFieldLineLimits.this;
                                if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                                    i23 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                    i24 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                } else {
                                    i23 = 1;
                                    i24 = 1;
                                }
                                Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState22.m1142getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle422, i23, i24), textStyle422)).then(new TextFieldCoreModifier(booleanValue22 && isWindowFocused22, textLayoutState22, transformedTextFieldState222, textFieldSelectionState22, brush422, z922 && !z1022, scrollState422, orientation222));
                                TextLayoutState textLayoutState222 = textLayoutState22;
                                TransformedTextFieldState transformedTextFieldState322 = transformedTextFieldState222;
                                TextStyle textStyle5 = textStyle422;
                                boolean z11 = areEqual22;
                                Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function2522;
                                boolean z12 = z922;
                                boolean z13 = booleanValue22;
                                boolean z14 = isWindowFocused22;
                                TextFieldSelectionState textFieldSelectionState222 = textFieldSelectionState22;
                                boolean z15 = z1022;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(then);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor222);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                                Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                }
                                modifierMaterializerOf222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                                BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState222, transformedTextFieldState322, textStyle5, z11, function26), composer2, 0);
                                composer2.startReplaceableGroup(-39277302);
                                ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                                if (z12 && z13 && z14 && textFieldSelectionState222.isInTouchMode()) {
                                    BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState222, composer2, 8);
                                    if (!z15) {
                                        BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState222, composer2, 8);
                                    }
                                }
                                composer2.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    inputTransformation3 = inputTransformation2;
                    z5 = z3;
                    z6 = z4;
                    keyboardActions3 = keyboardActions2;
                    brush3 = brush422;
                    textStyle3 = textStyle2;
                    keyboardOptions3 = keyboardOptions2;
                    scrollState3 = scrollState2;
                    function23 = function2522;
                    textFieldLineLimits4 = textFieldLineLimits622;
                    mutableInteractionSource5 = mutableInteractionSource3;
                    r14 = codepointTransformation822;
                    codepointTransformation5 = codepointTransformation922;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                int i202 = 8192;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i212 = i14;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i17 = i3 & 8192;
                if (i17 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i19 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                i18 = i212;
                codepointTransformation3 = codepointTransformation7;
                mutableInteractionSource2 = mutableInteractionSource6;
                codepointTransformation4 = codepointTransformation6;
                textFieldLineLimits3 = textFieldLineLimits2;
                brush2 = solidColor;
                function22 = function24;
                inputTransformation2 = inputTransformation4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume722 = startRestartGroup.consume(localDensity222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density222 = (Density) consume722;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2222 = (LayoutDirection) consume2222;
                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25222 = function22;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo222 = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3222 = startRestartGroup.consume(localWindowInfo222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                WindowInfo windowInfo222 = (WindowInfo) consume3222;
                final boolean areEqual222 = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
                final Brush brush4222 = brush2;
                startRestartGroup.startReplaceableGroup(-957633428);
                ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
                if (mutableInteractionSource2 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (!areEqual222) {
                }
                final TextFieldLineLimits textFieldLineLimits6222 = textFieldLineLimits3;
                CodepointTransformation codepointTransformation8222 = codepointTransformation3;
                final boolean booleanValue222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
                final boolean isWindowFocused222 = windowInfo222.isWindowFocused();
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
                final Orientation orientation2222 = orientation;
                Object rememberedValue4222 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                if (codepointTransformation4 != null) {
                }
                TransformedTextFieldState transformedTextFieldState322 = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
                startRestartGroup.updateRememberedValue(transformedTextFieldState322);
                rememberedValue4222 = transformedTextFieldState322;
                startRestartGroup.endReplaceableGroup();
                final TransformedTextFieldState transformedTextFieldState2222 = (TransformedTextFieldState) rememberedValue4222;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(transformedTextFieldState2222);
                CodepointTransformation codepointTransformation9222 = codepointTransformation4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue = new TextLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final TextLayoutState textLayoutState222 = (TextLayoutState) rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(transformedTextFieldState2222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue2 = new TextFieldSelectionState(transformedTextFieldState2222, textLayoutState222, density222, z3, z4, !booleanValue222 && isWindowFocused222);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final TextFieldSelectionState textFieldSelectionState222 = (TextFieldSelectionState) rememberedValue2;
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222 = CompositionLocalsKt.getLocalHapticFeedback();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume4222 = startRestartGroup.consume(localHapticFeedback222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final HapticFeedback hapticFeedback222 = (HapticFeedback) consume4222;
                ProvidableCompositionLocal<ClipboardManager> localClipboardManager222 = CompositionLocalsKt.getLocalClipboardManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume5222 = startRestartGroup.consume(localClipboardManager222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final ClipboardManager clipboardManager222 = (ClipboardManager) consume5222;
                MutableInteractionSource mutableInteractionSource7222 = mutableInteractionSource4;
                ProvidableCompositionLocal<TextToolbar> localTextToolbar222 = CompositionLocalsKt.getLocalTextToolbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume6222 = startRestartGroup.consume(localTextToolbar222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TextToolbar textToolbar222 = (TextToolbar) consume6222;
                final boolean z7222 = z3;
                final boolean z8222 = z4;
                EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldSelectionState.this.update(hapticFeedback222, clipboardManager222, textToolbar222, density222, z7222, z8222);
                    }
                }, startRestartGroup, 0);
                EffectsKt.DisposableEffect(textFieldSelectionState222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final TextFieldSelectionState textFieldSelectionState2222 = TextFieldSelectionState.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionState.this.dispose();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                Modifier scrollable$default222 = ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState2222, textLayoutState222, textFieldSelectionState222, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual222)), z3, mutableInteractionSource7222), scrollState2, orientation2222, !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState222.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation2222, false), null, mutableInteractionSource7222, 16, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(scrollable$default222);
                modifier2 = companion;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting()) {
                }
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                modifierMaterializerOf222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
                final TextStyle textStyle4222 = textStyle2;
                final boolean z9222 = z3;
                final boolean z10222 = z4;
                final ScrollState scrollState4222 = scrollState2;
                (codepointTransformation8222 != null ? DefaultTextFieldDecorator : codepointTransformation8222).Decoration(ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i22) {
                        int i23;
                        int i24;
                        ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                        if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                            }
                            TextFieldLineLimits textFieldLineLimits7 = TextFieldLineLimits.this;
                            if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                                i23 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                                i24 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                            } else {
                                i23 = 1;
                                i24 = 1;
                            }
                            Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState222.m1142getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4222, i23, i24), textStyle4222)).then(new TextFieldCoreModifier(booleanValue222 && isWindowFocused222, textLayoutState222, transformedTextFieldState2222, textFieldSelectionState222, brush4222, z9222 && !z10222, scrollState4222, orientation2222));
                            TextLayoutState textLayoutState2222 = textLayoutState222;
                            TransformedTextFieldState transformedTextFieldState3222 = transformedTextFieldState2222;
                            TextStyle textStyle5 = textStyle4222;
                            boolean z11 = areEqual222;
                            Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25222;
                            boolean z12 = z9222;
                            boolean z13 = booleanValue222;
                            boolean z14 = isWindowFocused222;
                            TextFieldSelectionState textFieldSelectionState2222 = textFieldSelectionState222;
                            boolean z15 = z10222;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(then);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2222);
                            } else {
                                composer2.useNode();
                            }
                            Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                            Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                            }
                            modifierMaterializerOf2222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                            BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState2222, transformedTextFieldState3222, textStyle5, z11, function26), composer2, 0);
                            composer2.startReplaceableGroup(-39277302);
                            ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                            if (z12 && z13 && z14 && textFieldSelectionState2222.isInTouchMode()) {
                                BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState2222, composer2, 8);
                                if (!z15) {
                                    BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState2222, composer2, 8);
                                }
                            }
                            composer2.endReplaceableGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                inputTransformation3 = inputTransformation2;
                z5 = z3;
                z6 = z4;
                keyboardActions3 = keyboardActions2;
                brush3 = brush4222;
                textStyle3 = textStyle2;
                keyboardOptions3 = keyboardOptions2;
                scrollState3 = scrollState2;
                function23 = function25222;
                textFieldLineLimits4 = textFieldLineLimits6222;
                mutableInteractionSource5 = mutableInteractionSource3;
                r14 = codepointTransformation8222;
                codepointTransformation5 = codepointTransformation9222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            int i2022 = 8192;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i2122 = i14;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i17 = i3 & 8192;
            if (i17 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i19 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            i18 = i2122;
            codepointTransformation3 = codepointTransformation7;
            mutableInteractionSource2 = mutableInteractionSource6;
            codepointTransformation4 = codepointTransformation6;
            textFieldLineLimits3 = textFieldLineLimits2;
            brush2 = solidColor;
            function22 = function24;
            inputTransformation2 = inputTransformation4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume7222 = startRestartGroup.consume(localDensity2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2222 = (Density) consume7222;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22222 = (LayoutDirection) consume22222;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function252222 = function22;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo2222 = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume32222 = startRestartGroup.consume(localWindowInfo2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            WindowInfo windowInfo2222 = (WindowInfo) consume32222;
            final boolean areEqual2222 = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
            final Brush brush42222 = brush2;
            startRestartGroup.startReplaceableGroup(-957633428);
            ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
            if (mutableInteractionSource2 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (!areEqual2222) {
            }
            final TextFieldLineLimits textFieldLineLimits62222 = textFieldLineLimits3;
            CodepointTransformation codepointTransformation82222 = codepointTransformation3;
            final boolean booleanValue2222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
            final boolean isWindowFocused2222 = windowInfo2222.isWindowFocused();
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
            final Orientation orientation22222 = orientation;
            Object rememberedValue42222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            if (codepointTransformation4 != null) {
            }
            TransformedTextFieldState transformedTextFieldState3222 = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
            startRestartGroup.updateRememberedValue(transformedTextFieldState3222);
            rememberedValue42222 = transformedTextFieldState3222;
            startRestartGroup.endReplaceableGroup();
            final TransformedTextFieldState transformedTextFieldState22222 = (TransformedTextFieldState) rememberedValue42222;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(transformedTextFieldState22222);
            CodepointTransformation codepointTransformation92222 = codepointTransformation4;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue = new TextLayoutState();
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final TextLayoutState textLayoutState2222 = (TextLayoutState) rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(transformedTextFieldState22222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue2 = new TextFieldSelectionState(transformedTextFieldState22222, textLayoutState2222, density2222, z3, z4, !booleanValue2222 && isWindowFocused2222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final TextFieldSelectionState textFieldSelectionState2222 = (TextFieldSelectionState) rememberedValue2;
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2222 = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume42222 = startRestartGroup.consume(localHapticFeedback2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final HapticFeedback hapticFeedback2222 = (HapticFeedback) consume42222;
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager2222 = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume52222 = startRestartGroup.consume(localClipboardManager2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final ClipboardManager clipboardManager2222 = (ClipboardManager) consume52222;
            MutableInteractionSource mutableInteractionSource72222 = mutableInteractionSource4;
            ProvidableCompositionLocal<TextToolbar> localTextToolbar2222 = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume62222 = startRestartGroup.consume(localTextToolbar2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextToolbar textToolbar2222 = (TextToolbar) consume62222;
            final boolean z72222 = z3;
            final boolean z82222 = z4;
            EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionState.this.update(hapticFeedback2222, clipboardManager2222, textToolbar2222, density2222, z72222, z82222);
                }
            }, startRestartGroup, 0);
            EffectsKt.DisposableEffect(textFieldSelectionState2222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final TextFieldSelectionState textFieldSelectionState22222 = TextFieldSelectionState.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionState.this.dispose();
                        }
                    };
                }
            }, startRestartGroup, 8);
            Modifier scrollable$default2222 = ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState22222, textLayoutState2222, textFieldSelectionState2222, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual2222)), z3, mutableInteractionSource72222), scrollState2, orientation22222, !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState2222.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation22222, false), null, mutableInteractionSource72222, 16, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(scrollable$default2222);
            modifier2 = companion;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m2937constructorimpl.getInserting()) {
            }
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            modifierMaterializerOf2222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
            final TextStyle textStyle42222 = textStyle2;
            final boolean z92222 = z3;
            final boolean z102222 = z4;
            final ScrollState scrollState42222 = scrollState2;
            (codepointTransformation82222 != null ? DefaultTextFieldDecorator : codepointTransformation82222).Decoration(ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    int i23;
                    int i24;
                    ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                    if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                        }
                        TextFieldLineLimits textFieldLineLimits7 = TextFieldLineLimits.this;
                        if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                            i23 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                            i24 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                        } else {
                            i23 = 1;
                            i24 = 1;
                        }
                        Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState2222.m1142getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42222, i23, i24), textStyle42222)).then(new TextFieldCoreModifier(booleanValue2222 && isWindowFocused2222, textLayoutState2222, transformedTextFieldState22222, textFieldSelectionState2222, brush42222, z92222 && !z102222, scrollState42222, orientation22222));
                        TextLayoutState textLayoutState22222 = textLayoutState2222;
                        TransformedTextFieldState transformedTextFieldState32222 = transformedTextFieldState22222;
                        TextStyle textStyle5 = textStyle42222;
                        boolean z11 = areEqual2222;
                        Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function252222;
                        boolean z12 = z92222;
                        boolean z13 = booleanValue2222;
                        boolean z14 = isWindowFocused2222;
                        TextFieldSelectionState textFieldSelectionState22222 = textFieldSelectionState2222;
                        boolean z15 = z102222;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy22222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22222 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(then);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor22222);
                        } else {
                            composer2.useNode();
                        }
                        Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                        Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                        }
                        modifierMaterializerOf22222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                        BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState22222, transformedTextFieldState32222, textStyle5, z11, function26), composer2, 0);
                        composer2.startReplaceableGroup(-39277302);
                        ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                        if (z12 && z13 && z14 && textFieldSelectionState22222.isInTouchMode()) {
                            BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState22222, composer2, 8);
                            if (!z15) {
                                BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState22222, composer2, 8);
                            }
                        }
                        composer2.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            inputTransformation3 = inputTransformation2;
            z5 = z3;
            z6 = z4;
            keyboardActions3 = keyboardActions2;
            brush3 = brush42222;
            textStyle3 = textStyle2;
            keyboardOptions3 = keyboardOptions2;
            scrollState3 = scrollState2;
            function23 = function252222;
            textFieldLineLimits4 = textFieldLineLimits62222;
            mutableInteractionSource5 = mutableInteractionSource3;
            r14 = codepointTransformation82222;
            codepointTransformation5 = codepointTransformation92222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        int i20222 = 8192;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i21222 = i14;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i17 = i3 & 8192;
        if (i17 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        i18 = i21222;
        codepointTransformation3 = codepointTransformation7;
        mutableInteractionSource2 = mutableInteractionSource6;
        codepointTransformation4 = codepointTransformation6;
        textFieldLineLimits3 = textFieldLineLimits2;
        brush2 = solidColor;
        function22 = function24;
        inputTransformation2 = inputTransformation4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume72222 = startRestartGroup.consume(localDensity22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22222 = (Density) consume72222;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222222 = (LayoutDirection) consume222222;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2522222 = function22;
        ProvidableCompositionLocal<WindowInfo> localWindowInfo22222 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume322222 = startRestartGroup.consume(localWindowInfo22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        WindowInfo windowInfo22222 = (WindowInfo) consume322222;
        final boolean areEqual22222 = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.INSTANCE);
        final Brush brush422222 = brush2;
        startRestartGroup.startReplaceableGroup(-957633428);
        ComposerKt.sourceInformation(startRestartGroup, "341@20017L39");
        if (mutableInteractionSource2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!areEqual22222) {
        }
        final TextFieldLineLimits textFieldLineLimits622222 = textFieldLineLimits3;
        CodepointTransformation codepointTransformation822222 = codepointTransformation3;
        final boolean booleanValue22222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue();
        final boolean isWindowFocused22222 = windowInfo22222.isWindowFocused();
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(textFieldState) | startRestartGroup.changed(inputTransformation2) | startRestartGroup.changed(codepointTransformation4);
        final Orientation orientation222222 = orientation;
        Object rememberedValue422222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        if (codepointTransformation4 != null) {
        }
        TransformedTextFieldState transformedTextFieldState32222 = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation);
        startRestartGroup.updateRememberedValue(transformedTextFieldState32222);
        rememberedValue422222 = transformedTextFieldState32222;
        startRestartGroup.endReplaceableGroup();
        final TransformedTextFieldState transformedTextFieldState222222 = (TransformedTextFieldState) rememberedValue422222;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(transformedTextFieldState222222);
        CodepointTransformation codepointTransformation922222 = codepointTransformation4;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue = new TextLayoutState();
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final TextLayoutState textLayoutState22222 = (TextLayoutState) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(transformedTextFieldState222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue2 = new TextFieldSelectionState(transformedTextFieldState222222, textLayoutState22222, density22222, z3, z4, !booleanValue22222 && isWindowFocused22222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final TextFieldSelectionState textFieldSelectionState22222 = (TextFieldSelectionState) rememberedValue2;
        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22222 = CompositionLocalsKt.getLocalHapticFeedback();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume422222 = startRestartGroup.consume(localHapticFeedback22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final HapticFeedback hapticFeedback22222 = (HapticFeedback) consume422222;
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager22222 = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume522222 = startRestartGroup.consume(localClipboardManager22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final ClipboardManager clipboardManager22222 = (ClipboardManager) consume522222;
        MutableInteractionSource mutableInteractionSource722222 = mutableInteractionSource4;
        ProvidableCompositionLocal<TextToolbar> localTextToolbar22222 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume622222 = startRestartGroup.consume(localTextToolbar22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TextToolbar textToolbar22222 = (TextToolbar) consume622222;
        final boolean z722222 = z3;
        final boolean z822222 = z4;
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldSelectionState.this.update(hapticFeedback22222, clipboardManager22222, textToolbar22222, density22222, z722222, z822222);
            }
        }, startRestartGroup, 0);
        EffectsKt.DisposableEffect(textFieldSelectionState22222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                final TextFieldSelectionState textFieldSelectionState222222 = TextFieldSelectionState.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionState.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 8);
        Modifier scrollable$default22222 = ScrollableKt.scrollable$default(FocusableKt.focusable(companion.then(new TextFieldDecoratorModifier(transformedTextFieldState222222, textLayoutState22222, textFieldSelectionState22222, inputTransformation2, z3, z4, keyboardOptions2, keyboardActions2, areEqual22222)), z3, mutableInteractionSource722222), scrollState2, orientation222222, !z3 && scrollState2.getMaxValue() > 0 && textFieldSelectionState22222.getDraggingHandle() == null, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation222222, false), null, mutableInteractionSource722222, 16, null);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy22222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(scrollable$default22222);
        modifier2 = companion;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        modifierMaterializerOf22222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 481805554, "C425@23768L2308:BasicTextField2.kt#g98mwb");
        final TextStyle textStyle422222 = textStyle2;
        final boolean z922222 = z3;
        final boolean z1022222 = z4;
        final ScrollState scrollState422222 = scrollState2;
        (codepointTransformation822222 != null ? DefaultTextFieldDecorator : codepointTransformation822222).Decoration(ComposableLambdaKt.composableLambda(startRestartGroup, 1476233751, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$BasicTextField2$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i22) {
                int i23;
                int i24;
                ComposerKt.sourceInformation(composer2, "C436@24100L1966:BasicTextField2.kt#g98mwb");
                if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1476233751, i22, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
                    }
                    TextFieldLineLimits textFieldLineLimits7 = TextFieldLineLimits.this;
                    if (textFieldLineLimits7 instanceof TextFieldLineLimits.MultiLine) {
                        i23 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits7).getMinHeightInLines();
                        i24 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                    } else {
                        i23 = 1;
                        i24 = 1;
                    }
                    Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState22222.m1142getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle422222, i23, i24), textStyle422222)).then(new TextFieldCoreModifier(booleanValue22222 && isWindowFocused22222, textLayoutState22222, transformedTextFieldState222222, textFieldSelectionState22222, brush422222, z922222 && !z1022222, scrollState422222, orientation222222));
                    TextLayoutState textLayoutState222222 = textLayoutState22222;
                    TransformedTextFieldState transformedTextFieldState322222 = transformedTextFieldState222222;
                    TextStyle textStyle5 = textStyle422222;
                    boolean z11 = areEqual22222;
                    Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function2522222;
                    boolean z12 = z922222;
                    boolean z13 = booleanValue22222;
                    boolean z14 = isWindowFocused22222;
                    TextFieldSelectionState textFieldSelectionState222222 = textFieldSelectionState22222;
                    boolean z15 = z1022222;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy222222 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap222222 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222222 = LayoutKt.modifierMaterializerOf(then);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor222222);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                    }
                    modifierMaterializerOf222222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1666145625, "C460@25204L370:BasicTextField2.kt#g98mwb");
                    BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState222222, transformedTextFieldState322222, textStyle5, z11, function26), composer2, 0);
                    composer2.startReplaceableGroup(-39277302);
                    ComposerKt.sourceInformation(composer2, "472@25720L113,476@25895L117");
                    if (z12 && z13 && z14 && textFieldSelectionState222222.isInTouchMode()) {
                        BasicTextField2Kt.TextFieldSelectionHandles(textFieldSelectionState222222, composer2, 8);
                        if (!z15) {
                            BasicTextField2Kt.TextFieldCursorHandle(textFieldSelectionState222222, composer2, 8);
                        }
                    }
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        inputTransformation3 = inputTransformation2;
        z5 = z3;
        z6 = z4;
        keyboardActions3 = keyboardActions2;
        brush3 = brush422222;
        textStyle3 = textStyle2;
        keyboardOptions3 = keyboardOptions2;
        scrollState3 = scrollState2;
        function23 = function2522222;
        textFieldLineLimits4 = textFieldLineLimits622222;
        mutableInteractionSource5 = mutableInteractionSource3;
        r14 = codepointTransformation822222;
        codepointTransformation5 = codepointTransformation922222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(773754631);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)490@26277L629:BasicTextField2.kt#g98mwb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(773754631, i, -1, "androidx.compose.foundation.text2.TextFieldCursorHandle (BasicTextField2.kt:487)");
        }
        final TextFieldHandleState cursorHandle = textFieldSelectionState.getCursorHandle();
        if (cursorHandle.getVisible()) {
            long m1167getPositionF1C5BW0 = cursorHandle.m1167getPositionF1C5BW0();
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(1290415310);
            boolean changed = startRestartGroup.changed(cursorHandle);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, TextFieldHandleState.this.m1167getPositionF1C5BW0(), SelectionHandleAnchor.Middle, true, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m835CursorHandleULxng0E(m1167getPositionF1C5BW0, SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), textFieldSelectionState, new BasicTextField2Kt$TextFieldCursorHandle$2(textFieldSelectionState, null)), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    BasicTextField2Kt.TextFieldCursorHandle(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1194626330);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandles)528@27633L397:BasicTextField2.kt#g98mwb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1194626330, i, -1, "androidx.compose.foundation.text2.TextFieldSelectionHandles (BasicTextField2.kt:512)");
        }
        TextFieldHandleState startSelectionHandle = textFieldSelectionState.getStartSelectionHandle();
        startRestartGroup.startReplaceableGroup(-1453543870);
        ComposerKt.sourceInformation(startRestartGroup, "515@27123L401");
        if (startSelectionHandle.getVisible()) {
            AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$1
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo836provideF1C5BW0() {
                    return TextFieldSelectionState.this.getStartSelectionHandle().m1167getPositionF1C5BW0();
                }
            }, true, startSelectionHandle.getDirection(), startSelectionHandle.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textFieldSelectionState, new BasicTextField2Kt$TextFieldSelectionHandles$2(textFieldSelectionState, null)), startRestartGroup, 48);
        }
        startRestartGroup.endReplaceableGroup();
        TextFieldHandleState endSelectionHandle = textFieldSelectionState.getEndSelectionHandle();
        if (endSelectionHandle.getVisible()) {
            AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$3
                @Override // androidx.compose.foundation.text.selection.OffsetProvider
                /* renamed from: provide-F1C5BW0 */
                public final long mo836provideF1C5BW0() {
                    return TextFieldSelectionState.this.getEndSelectionHandle().m1167getPositionF1C5BW0();
                }
            }, false, endSelectionHandle.getDirection(), endSelectionHandle.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textFieldSelectionState, new BasicTextField2Kt$TextFieldSelectionHandles$4(textFieldSelectionState, null)), startRestartGroup, 48);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    BasicTextField2Kt.TextFieldSelectionHandles(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
