package androidx.compose.foundation.text2;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.CodepointTransformationKt;
import androidx.compose.foundation.text2.input.ImeActionHandler;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.InputTransformationKt;
import androidx.compose.foundation.text2.input.TextFieldLineLimits;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.TextObfuscationMode;
import androidx.compose.foundation.text2.input.internal.StateSyncingModifierKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BasicSecureTextField.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aÔ\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u001928\b\u0002\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\u001c\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\u0002\b\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aè\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00030,2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u001928\b\u0002\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\u001c\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\u0002\b\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a \u0010/\u001a\u00020\u00032\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\u0002\b1H\u0003¢\u0006\u0002\u00102\u001a\u0010\u00103\u001a\u0002042\u0006\u0010\b\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002"}, d2 = {"LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/foundation/text2/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "onSubmit", "Landroidx/compose/foundation/text2/input/ImeActionHandler;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "textObfuscationMode", "Landroidx/compose/foundation/text2/input/TextObfuscationMode;", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "decorator", "Landroidx/compose/foundation/text2/TextFieldDecorator;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "BasicSecureTextField-mMrxcSU", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/ImeActionHandler;IIIZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", SDKConstants.PARAM_VALUE, "", "onValueChange", "Lkotlin/Function1;", "BasicSecureTextField-TLP4tmw", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/ImeActionHandler;IIIZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "KeyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "foundation_release", "valueWithSelection", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    /* renamed from: BasicSecureTextField-TLP4tmw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1070BasicSecureTextFieldTLP4tmw(final String str, final Function1<? super String, Unit> function1, Modifier modifier, ImeActionHandler imeActionHandler, int i, int i2, int i3, boolean z, InputTransformation inputTransformation, TextStyle textStyle, MutableInteractionSource mutableInteractionSource, Brush brush, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i4, final int i5, final int i6) {
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
        int i18;
        int i19;
        Modifier.Companion companion;
        ImeActionHandler imeActionHandler2;
        boolean z2;
        InputTransformation inputTransformation2;
        SolidColor solidColor;
        ScrollState scrollState2;
        Brush brush2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        int i20;
        TextFieldDecorator textFieldDecorator2;
        int i21;
        InputTransformation inputTransformation3;
        TextStyle textStyle2;
        MutableInteractionSource mutableInteractionSource2;
        int i22;
        int i23;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        TextFieldDecorator textFieldDecorator3;
        Object rememberedValue;
        TextStyle textStyle3;
        MutableInteractionSource mutableInteractionSource3;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        Brush brush3;
        TextFieldDecorator textFieldDecorator4;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24;
        final TextStyle textStyle4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier2;
        final InputTransformation inputTransformation4;
        int i24;
        final int i25;
        final int i26;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(917546540);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicSecureTextField)P(14,10,7,8,3:c#ui.text.input.ImeAction,12:c#foundation.text2.input.TextObfuscationMode,6:c#ui.text.input.KeyboardType,2,4,13,5!1,9)156@9390L21,158@9433L213,168@9839L174,178@10082L957:BasicSecureTextField.kt#g98mwb");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i27 = i6 & 4;
        if (i27 != 0) {
            i7 |= 384;
        } else if ((i4 & 896) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i4 & 7168) == 0) {
                i7 |= startRestartGroup.changed(imeActionHandler) ? 2048 : 1024;
                i9 = i6 & 16;
                int i28 = 8192;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i4 & 57344) == 0) {
                    i7 |= startRestartGroup.changed(i) ? 16384 : 8192;
                }
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i4 & 458752) == 0) {
                    i7 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 3670016) == 0) {
                    i7 |= startRestartGroup.changed(i3) ? 1048576 : 524288;
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 29360128) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 234881024) == 0) {
                    i7 |= startRestartGroup.changed(inputTransformation) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 1879048192) == 0) {
                    i7 |= startRestartGroup.changed(textStyle) ? 536870912 : 268435456;
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                    i16 = i5 | 6;
                } else if ((i5 & 14) == 0) {
                    i16 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                } else {
                    i16 = i5;
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                } else if ((i5 & 112) == 0) {
                    i16 |= startRestartGroup.changed(brush) ? 32 : 16;
                }
                int i29 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i29 |= 384;
                } else if ((i5 & 896) == 0) {
                    i29 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                        i29 |= 3072;
                    } else if ((i5 & 7168) == 0) {
                        i29 |= startRestartGroup.changed(textFieldDecorator) ? 2048 : 1024;
                        if ((i5 & 57344) == 0) {
                            if ((i6 & 16384) == 0 && startRestartGroup.changed(scrollState)) {
                                i28 = 16384;
                            }
                            i29 |= i28;
                        }
                        if ((i7 & 1533916891) == 306783378 || (46811 & i29) != 9362 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i27 != 0 ? Modifier.INSTANCE : modifier;
                                imeActionHandler2 = i8 != 0 ? null : imeActionHandler;
                                int m5409getDefaulteUduSuo = i9 != 0 ? ImeAction.INSTANCE.m5409getDefaulteUduSuo() : i;
                                int m1100getRevealLastTypedpyid5Pk = i10 != 0 ? TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk() : i2;
                                int m5462getPasswordPjHm6EE = i11 != 0 ? KeyboardType.INSTANCE.m5462getPasswordPjHm6EE() : i3;
                                z2 = i12 != 0 ? true : z;
                                InputTransformation inputTransformation5 = i13 != 0 ? null : inputTransformation;
                                TextStyle textStyle5 = i14 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                MutableInteractionSource mutableInteractionSource5 = i15 != 0 ? null : mutableInteractionSource;
                                if (i17 != 0) {
                                    inputTransformation2 = inputTransformation5;
                                    solidColor = new SolidColor(Color.INSTANCE.m3433getBlack0d7_KjU(), null);
                                } else {
                                    inputTransformation2 = inputTransformation5;
                                    solidColor = brush;
                                }
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = i18 != 0 ? null : function2;
                                TextFieldDecorator textFieldDecorator5 = i19 != 0 ? null : textFieldDecorator;
                                if ((i6 & 16384) != 0) {
                                    brush2 = solidColor;
                                    i20 = i29 & (-57345);
                                    textFieldDecorator2 = textFieldDecorator5;
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    i21 = m5409getDefaulteUduSuo;
                                    textStyle2 = textStyle5;
                                    mutableInteractionSource2 = mutableInteractionSource5;
                                    function22 = function25;
                                    i22 = m1100getRevealLastTypedpyid5Pk;
                                    i23 = m5462getPasswordPjHm6EE;
                                    inputTransformation3 = inputTransformation2;
                                } else {
                                    scrollState2 = scrollState;
                                    brush2 = solidColor;
                                    function22 = function25;
                                    i20 = i29;
                                    textFieldDecorator2 = textFieldDecorator5;
                                    i21 = m5409getDefaulteUduSuo;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle2 = textStyle5;
                                    mutableInteractionSource2 = mutableInteractionSource5;
                                    i22 = m1100getRevealLastTypedpyid5Pk;
                                    i23 = m5462getPasswordPjHm6EE;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i6 & 16384) != 0) {
                                    i29 &= -57345;
                                }
                                companion = modifier;
                                imeActionHandler2 = imeActionHandler;
                                i21 = i;
                                i22 = i2;
                                i23 = i3;
                                z2 = z;
                                inputTransformation3 = inputTransformation;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                function22 = function2;
                                textFieldDecorator2 = textFieldDecorator;
                                scrollState2 = scrollState;
                                i20 = i29;
                                textStyle2 = textStyle;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                textFieldDecorator3 = textFieldDecorator2;
                                function23 = function22;
                                ComposerKt.traceEventStart(917546540, i7, i20, "androidx.compose.foundation.text2.BasicSecureTextField (BasicSecureTextField.kt:157)");
                            } else {
                                function23 = function22;
                                textFieldDecorator3 = textFieldDecorator2;
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                textStyle3 = textStyle2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                rememberedValue = new TextFieldState(str, TextRangeKt.TextRange(str.length()), (DefaultConstructorMarker) null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                textStyle3 = textStyle2;
                                mutableInteractionSource3 = mutableInteractionSource2;
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
                            mutableState.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState), str, 0L, (TextRange) null, 6, (Object) null));
                            TextFieldValue BasicSecureTextField_TLP4tmw$lambda$2 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState);
                            startRestartGroup.startReplaceableGroup(1829191301);
                            changed = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(function1);
                            Brush brush4 = brush2;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                                        TextFieldValue BasicSecureTextField_TLP4tmw$lambda$22;
                                        String text = textFieldValue.getText();
                                        BasicSecureTextField_TLP4tmw$lambda$22 = BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState);
                                        if (!Intrinsics.areEqual(text, BasicSecureTextField_TLP4tmw$lambda$22.getText())) {
                                            function1.invoke(textFieldValue.getText());
                                        }
                                        mutableState.setValue(textFieldValue);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i30 = i7 >> 3;
                            m1071BasicSecureTextFieldmMrxcSU(textFieldState, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState, BasicSecureTextField_TLP4tmw$lambda$2, (Function1) rememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation3, textStyle3, mutableInteractionSource3, brush4, function23, textFieldDecorator3, scrollState2, startRestartGroup, (i30 & 234881024) | (i30 & 896) | 6 | (i30 & 7168) | (i30 & 57344) | (458752 & i30) | (3670016 & i30) | (29360128 & i30) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            brush3 = brush4;
                            textFieldDecorator4 = textFieldDecorator3;
                            function24 = function23;
                            textStyle4 = textStyle3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier2 = companion;
                            inputTransformation4 = inputTransformation3;
                            i24 = i23;
                            i25 = i22;
                            i26 = i21;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            imeActionHandler2 = imeActionHandler;
                            i26 = i;
                            i25 = i2;
                            i24 = i3;
                            z2 = z;
                            inputTransformation4 = inputTransformation;
                            textStyle4 = textStyle;
                            mutableInteractionSource4 = mutableInteractionSource;
                            brush3 = brush;
                            function24 = function2;
                            textFieldDecorator4 = textFieldDecorator;
                            scrollState2 = scrollState;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final ImeActionHandler imeActionHandler3 = imeActionHandler2;
                            final int i31 = i24;
                            final boolean z3 = z2;
                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final Brush brush5 = brush3;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function24;
                            final TextFieldDecorator textFieldDecorator6 = textFieldDecorator4;
                            final ScrollState scrollState3 = scrollState2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$2
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

                                public final void invoke(Composer composer2, int i32) {
                                    BasicSecureTextFieldKt.m1070BasicSecureTextFieldTLP4tmw(str, function1, modifier3, imeActionHandler3, i26, i25, i31, z3, inputTransformation4, textStyle4, mutableInteractionSource6, brush5, function26, textFieldDecorator6, scrollState3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i5 & 57344) == 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i27 != 0) {
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
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i6 & 16384) != 0) {
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
                    mutableState2.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState2), str, 0L, (TextRange) null, 6, (Object) null));
                    TextFieldValue BasicSecureTextField_TLP4tmw$lambda$22 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState2);
                    startRestartGroup.startReplaceableGroup(1829191301);
                    changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(function1);
                    Brush brush42 = brush2;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                            TextFieldValue BasicSecureTextField_TLP4tmw$lambda$222;
                            String text = textFieldValue.getText();
                            BasicSecureTextField_TLP4tmw$lambda$222 = BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState2);
                            if (!Intrinsics.areEqual(text, BasicSecureTextField_TLP4tmw$lambda$222.getText())) {
                                function1.invoke(textFieldValue.getText());
                            }
                            mutableState2.setValue(textFieldValue);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    int i302 = i7 >> 3;
                    m1071BasicSecureTextFieldmMrxcSU(textFieldState2, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState2, BasicSecureTextField_TLP4tmw$lambda$22, (Function1) rememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation3, textStyle3, mutableInteractionSource3, brush42, function23, textFieldDecorator3, scrollState2, startRestartGroup, (i302 & 234881024) | (i302 & 896) | 6 | (i302 & 7168) | (i302 & 57344) | (458752 & i302) | (3670016 & i302) | (29360128 & i302) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    brush3 = brush42;
                    textFieldDecorator4 = textFieldDecorator3;
                    function24 = function23;
                    textStyle4 = textStyle3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier2 = companion;
                    inputTransformation4 = inputTransformation3;
                    i24 = i23;
                    i25 = i22;
                    i26 = i21;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                if ((i5 & 57344) == 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i27 != 0) {
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
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if ((i6 & 16384) != 0) {
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
                mutableState22.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState22), str, 0L, (TextRange) null, 6, (Object) null));
                TextFieldValue BasicSecureTextField_TLP4tmw$lambda$222 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState22);
                startRestartGroup.startReplaceableGroup(1829191301);
                changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(function1);
                Brush brush422 = brush2;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                        TextFieldValue BasicSecureTextField_TLP4tmw$lambda$2222;
                        String text = textFieldValue.getText();
                        BasicSecureTextField_TLP4tmw$lambda$2222 = BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState22);
                        if (!Intrinsics.areEqual(text, BasicSecureTextField_TLP4tmw$lambda$2222.getText())) {
                            function1.invoke(textFieldValue.getText());
                        }
                        mutableState22.setValue(textFieldValue);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                int i3022 = i7 >> 3;
                m1071BasicSecureTextFieldmMrxcSU(textFieldState22, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState22, BasicSecureTextField_TLP4tmw$lambda$222, (Function1) rememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation3, textStyle3, mutableInteractionSource3, brush422, function23, textFieldDecorator3, scrollState2, startRestartGroup, (i3022 & 234881024) | (i3022 & 896) | 6 | (i3022 & 7168) | (i3022 & 57344) | (458752 & i3022) | (3670016 & i3022) | (29360128 & i3022) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                brush3 = brush422;
                textFieldDecorator4 = textFieldDecorator3;
                function24 = function23;
                textStyle4 = textStyle3;
                mutableInteractionSource4 = mutableInteractionSource3;
                modifier2 = companion;
                inputTransformation4 = inputTransformation3;
                i24 = i23;
                i25 = i22;
                i26 = i21;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            int i282 = 8192;
            if (i9 != 0) {
            }
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i292 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            if ((i5 & 57344) == 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i27 != 0) {
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
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if ((i6 & 16384) != 0) {
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
            mutableState222.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState222), str, 0L, (TextRange) null, 6, (Object) null));
            TextFieldValue BasicSecureTextField_TLP4tmw$lambda$2222 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState222);
            startRestartGroup.startReplaceableGroup(1829191301);
            changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changedInstance(function1);
            Brush brush4222 = brush2;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                    TextFieldValue BasicSecureTextField_TLP4tmw$lambda$22222;
                    String text = textFieldValue.getText();
                    BasicSecureTextField_TLP4tmw$lambda$22222 = BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState222);
                    if (!Intrinsics.areEqual(text, BasicSecureTextField_TLP4tmw$lambda$22222.getText())) {
                        function1.invoke(textFieldValue.getText());
                    }
                    mutableState222.setValue(textFieldValue);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            int i30222 = i7 >> 3;
            m1071BasicSecureTextFieldmMrxcSU(textFieldState222, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState222, BasicSecureTextField_TLP4tmw$lambda$2222, (Function1) rememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation3, textStyle3, mutableInteractionSource3, brush4222, function23, textFieldDecorator3, scrollState2, startRestartGroup, (i30222 & 234881024) | (i30222 & 896) | 6 | (i30222 & 7168) | (i30222 & 57344) | (458752 & i30222) | (3670016 & i30222) | (29360128 & i30222) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            brush3 = brush4222;
            textFieldDecorator4 = textFieldDecorator3;
            function24 = function23;
            textStyle4 = textStyle3;
            mutableInteractionSource4 = mutableInteractionSource3;
            modifier2 = companion;
            inputTransformation4 = inputTransformation3;
            i24 = i23;
            i25 = i22;
            i26 = i21;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        int i2822 = 8192;
        if (i9 != 0) {
        }
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i2922 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        if ((i5 & 57344) == 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i27 != 0) {
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
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if ((i6 & 16384) != 0) {
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
        mutableState2222.setValue(TextFieldValue.m5467copy3r_uNRQ$default(BasicSecureTextField_TLP4tmw$lambda$2(mutableState2222), str, 0L, (TextRange) null, 6, (Object) null));
        TextFieldValue BasicSecureTextField_TLP4tmw$lambda$22222 = BasicSecureTextField_TLP4tmw$lambda$2(mutableState2222);
        startRestartGroup.startReplaceableGroup(1829191301);
        changed = startRestartGroup.changed(mutableState2222) | startRestartGroup.changedInstance(function1);
        Brush brush42222 = brush2;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$1$1
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
                TextFieldValue BasicSecureTextField_TLP4tmw$lambda$222222;
                String text = textFieldValue.getText();
                BasicSecureTextField_TLP4tmw$lambda$222222 = BasicSecureTextFieldKt.BasicSecureTextField_TLP4tmw$lambda$2(mutableState2222);
                if (!Intrinsics.areEqual(text, BasicSecureTextField_TLP4tmw$lambda$222222.getText())) {
                    function1.invoke(textFieldValue.getText());
                }
                mutableState2222.setValue(textFieldValue);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        int i302222 = i7 >> 3;
        m1071BasicSecureTextFieldmMrxcSU(textFieldState2222, StateSyncingModifierKt.syncTextFieldState(companion, textFieldState2222, BasicSecureTextField_TLP4tmw$lambda$22222, (Function1) rememberedValue3, false), imeActionHandler2, i21, i22, i23, z2, inputTransformation3, textStyle3, mutableInteractionSource3, brush42222, function23, textFieldDecorator3, scrollState2, startRestartGroup, (i302222 & 234881024) | (i302222 & 896) | 6 | (i302222 & 7168) | (i302222 & 57344) | (458752 & i302222) | (3670016 & i302222) | (29360128 & i302222) | ((i20 << 27) & 1879048192), (i20 >> 3) & 8190, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        brush3 = brush42222;
        textFieldDecorator4 = textFieldDecorator3;
        function24 = function23;
        textStyle4 = textStyle3;
        mutableInteractionSource4 = mutableInteractionSource3;
        modifier2 = companion;
        inputTransformation4 = inputTransformation3;
        i24 = i23;
        i25 = i22;
        i26 = i21;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicSecureTextField_TLP4tmw$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b1, code lost:
    
        if (r1.changed(r50) == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0369  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.foundation.text2.TextFieldDecorator] */
    /* JADX WARN: Type inference failed for: r49v0, types: [androidx.compose.foundation.text2.TextFieldDecorator, java.lang.Object] */
    /* renamed from: BasicSecureTextField-mMrxcSU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1071BasicSecureTextFieldmMrxcSU(final TextFieldState textFieldState, Modifier modifier, ImeActionHandler imeActionHandler, int i, int i2, int i3, boolean z, InputTransformation inputTransformation, TextStyle textStyle, MutableInteractionSource mutableInteractionSource, Brush brush, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i4, final int i5, final int i6) {
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
        int i18;
        int i19;
        Modifier.Companion companion;
        ImeActionHandler imeActionHandler2;
        int m5409getDefaulteUduSuo;
        TextStyle textStyle2;
        InputTransformation inputTransformation2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        SolidColor solidColor;
        ScrollState scrollState2;
        MutableInteractionSource mutableInteractionSource2;
        Brush brush2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        int i20;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24;
        int i21;
        int i22;
        boolean z2;
        InputTransformation inputTransformation3;
        TextStyle textStyle3;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        final boolean m1095equalsimpl0;
        final CodepointTransformation codepointTransformation;
        CodepointTransformation mask;
        Modifier.Companion companion2;
        final int i23;
        final Modifier modifier2;
        final ?? r13;
        final ScrollState scrollState3;
        final int i24;
        final ImeActionHandler imeActionHandler3;
        final TextStyle textStyle4;
        final InputTransformation inputTransformation4;
        final boolean z3;
        final int i25;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25;
        ScopeUpdateScope endRestartGroup;
        ?? startRestartGroup = composer.startRestartGroup(1073441926);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicSecureTextField)P(11,7,8,3:c#ui.text.input.ImeAction,12:c#foundation.text2.input.TextObfuscationMode,6:c#ui.text.input.KeyboardType,2,4,13,5!1,9)277@16038L21,281@16205L24,282@16266L82,322@17467L1064:BasicSecureTextField.kt#g98mwb");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i26 = i6 & 2;
        if (i26 != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 896) == 0) {
                i7 |= startRestartGroup.changed(imeActionHandler) ? 256 : 128;
                i9 = i6 & 8;
                int i27 = 2048;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i7 |= startRestartGroup.changed(i) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i7 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                    }
                    i11 = i6 & 32;
                    if (i11 == 0) {
                        i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i4 & 458752) == 0) {
                        i7 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                    }
                    i12 = i6 & 64;
                    if (i12 == 0) {
                        i7 |= 1572864;
                    } else if ((i4 & 3670016) == 0) {
                        i7 |= startRestartGroup.changed(z) ? 1048576 : 524288;
                    }
                    i13 = i6 & 128;
                    if (i13 == 0) {
                        i7 |= 12582912;
                    } else if ((i4 & 29360128) == 0) {
                        i7 |= startRestartGroup.changed(inputTransformation) ? 8388608 : 4194304;
                    }
                    i14 = i6 & 256;
                    if (i14 == 0) {
                        i7 |= 100663296;
                    } else if ((i4 & 234881024) == 0) {
                        i7 |= startRestartGroup.changed(textStyle) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i15 = i6 & 512;
                    if (i15 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 1879048192) == 0) {
                        i7 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                    }
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                        i17 = i5 | 6;
                    } else if ((i5 & 14) == 0) {
                        i17 = i5 | (startRestartGroup.changed(brush) ? 4 : 2);
                    } else {
                        i17 = i5;
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                        i17 |= 48;
                    } else if ((i5 & 112) == 0) {
                        i17 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                    }
                    int i28 = i17;
                    i19 = i6 & 4096;
                    if (i19 == 0) {
                        i28 |= 384;
                    } else if ((i5 & 896) == 0) {
                        i28 |= startRestartGroup.changed(textFieldDecorator) ? 256 : 128;
                        if ((i5 & 7168) == 0) {
                            if ((i6 & 8192) != 0) {
                            }
                            i27 = 1024;
                            i28 |= i27;
                        }
                        if ((i7 & 1533916891) == 306783378 || (i28 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i26 != 0 ? Modifier.INSTANCE : modifier;
                                imeActionHandler2 = i8 != 0 ? null : imeActionHandler;
                                m5409getDefaulteUduSuo = i9 != 0 ? ImeAction.INSTANCE.m5409getDefaulteUduSuo() : i;
                                int m1100getRevealLastTypedpyid5Pk = i10 != 0 ? TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk() : i2;
                                int m5462getPasswordPjHm6EE = i11 != 0 ? KeyboardType.INSTANCE.m5462getPasswordPjHm6EE() : i3;
                                boolean z4 = i12 != 0 ? true : z;
                                InputTransformation inputTransformation5 = i13 != 0 ? null : inputTransformation;
                                TextStyle textStyle5 = i14 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                MutableInteractionSource mutableInteractionSource4 = i15 != 0 ? null : mutableInteractionSource;
                                if (i16 != 0) {
                                    inputTransformation2 = inputTransformation5;
                                    textStyle2 = textStyle5;
                                    function22 = null;
                                    solidColor = new SolidColor(Color.INSTANCE.m3433getBlack0d7_KjU(), null);
                                } else {
                                    textStyle2 = textStyle5;
                                    inputTransformation2 = inputTransformation5;
                                    function22 = null;
                                    solidColor = brush;
                                }
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = i18 != 0 ? function22 : function2;
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function27 = i19 != 0 ? function22 : textFieldDecorator;
                                if ((i6 & 8192) != 0) {
                                    brush2 = solidColor;
                                    function23 = function26;
                                    i20 = i28 & (-7169);
                                    function24 = function27;
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    i22 = m5462getPasswordPjHm6EE;
                                    z2 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle3 = textStyle2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    i21 = m1100getRevealLastTypedpyid5Pk;
                                } else {
                                    scrollState2 = scrollState;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    brush2 = solidColor;
                                    function23 = function26;
                                    i20 = i28;
                                    function24 = function27;
                                    i21 = m1100getRevealLastTypedpyid5Pk;
                                    i22 = m5462getPasswordPjHm6EE;
                                    z2 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle3 = textStyle2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i6 & 8192) != 0) {
                                    i28 &= -7169;
                                }
                                companion = modifier;
                                imeActionHandler2 = imeActionHandler;
                                m5409getDefaulteUduSuo = i;
                                i21 = i2;
                                i22 = i3;
                                z2 = z;
                                textStyle3 = textStyle;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                function23 = function2;
                                function24 = textFieldDecorator;
                                scrollState2 = scrollState;
                                i20 = i28;
                                inputTransformation3 = inputTransformation;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1073441926, i7, i20, "androidx.compose.foundation.text2.BasicSecureTextField (BasicSecureTextField.kt:280)");
                            }
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(coroutineScope);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new SecureTextFieldController(coroutineScope);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) rememberedValue2;
                            m1095equalsimpl0 = TextObfuscationMode.m1095equalsimpl0(i21, TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk());
                            if (!m1095equalsimpl0) {
                                secureTextFieldController.getPasswordRevealFilter().hide();
                            }
                            if (m1095equalsimpl0) {
                                mask = secureTextFieldController.getCodepointTransformation();
                            } else if (TextObfuscationMode.m1095equalsimpl0(i21, TextObfuscationMode.INSTANCE.m1099getHiddenpyid5Pk())) {
                                mask = CodepointTransformationKt.mask(CodepointTransformation.INSTANCE, Typography.bullet);
                            } else {
                                codepointTransformation = null;
                                Modifier semantics = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                return false;
                                            }
                                        }, 1, null);
                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                return false;
                                            }
                                        }, 1, null);
                                    }
                                });
                                if (!m1095equalsimpl0) {
                                    companion2 = secureTextFieldController.getFocusChangeModifier();
                                } else {
                                    companion2 = Modifier.INSTANCE;
                                }
                                final Modifier then = semantics.then(companion2);
                                final InputTransformation inputTransformation6 = inputTransformation3;
                                final int i29 = i22;
                                final int i30 = m5409getDefaulteUduSuo;
                                final ImeActionHandler imeActionHandler4 = imeActionHandler2;
                                final boolean z5 = z2;
                                final TextStyle textStyle6 = textStyle3;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function28 = function23;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                                final Brush brush4 = brush2;
                                final ?? r31 = function24;
                                final ScrollState scrollState4 = scrollState2;
                                DisableCutCopy(ComposableLambdaKt.composableLambda(startRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                                    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
                                    
                                        r2 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r2));
                                     */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer2, int i31) {
                                        InputTransformation inputTransformation7;
                                        KeyboardActions keyboardActions;
                                        ComposerKt.sourceInformation(composer2, "C323@17492L1033:BasicSecureTextField.kt#g98mwb");
                                        if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                                            }
                                            if (m1095equalsimpl0) {
                                                inputTransformation7 = InputTransformationKt.thenOrNull(inputTransformation6, secureTextFieldController.getPasswordRevealFilter());
                                            } else {
                                                inputTransformation7 = inputTransformation6;
                                            }
                                            InputTransformation inputTransformation8 = inputTransformation7;
                                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i29, i30, null, 17, null);
                                            ImeActionHandler imeActionHandler5 = imeActionHandler4;
                                            if (imeActionHandler5 == null || keyboardActions == null) {
                                                keyboardActions = KeyboardActions.INSTANCE.getDefault();
                                            }
                                            BasicTextField2Kt.BasicTextField2(textFieldState, then, z5, false, inputTransformation8, textStyle6, keyboardOptions, keyboardActions, singleLine, function28, mutableInteractionSource5, brush4, codepointTransformation, r31, scrollState4, composer2, 100666368, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i23 = i21;
                                modifier2 = companion;
                                r13 = function24;
                                scrollState3 = scrollState2;
                                i24 = i22;
                                imeActionHandler3 = imeActionHandler2;
                                textStyle4 = textStyle3;
                                inputTransformation4 = inputTransformation3;
                                z3 = z2;
                                i25 = m5409getDefaulteUduSuo;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                brush3 = brush2;
                                function25 = function23;
                            }
                            codepointTransformation = mask;
                            Modifier semantics2 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            return false;
                                        }
                                    }, 1, null);
                                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            return false;
                                        }
                                    }, 1, null);
                                }
                            });
                            if (!m1095equalsimpl0) {
                            }
                            final Modifier then2 = semantics2.then(companion2);
                            final InputTransformation inputTransformation62 = inputTransformation3;
                            final int i292 = i22;
                            final int i302 = m5409getDefaulteUduSuo;
                            final ImeActionHandler imeActionHandler42 = imeActionHandler2;
                            final boolean z52 = z2;
                            final TextStyle textStyle62 = textStyle3;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function282 = function23;
                            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                            final Brush brush42 = brush2;
                            final TextFieldDecorator r312 = function24;
                            final ScrollState scrollState42 = scrollState2;
                            DisableCutCopy(ComposableLambdaKt.composableLambda(startRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                                /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
                                
                                    r2 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r2));
                                 */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer2, int i31) {
                                    InputTransformation inputTransformation7;
                                    KeyboardActions keyboardActions;
                                    ComposerKt.sourceInformation(composer2, "C323@17492L1033:BasicSecureTextField.kt#g98mwb");
                                    if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                                        }
                                        if (m1095equalsimpl0) {
                                            inputTransformation7 = InputTransformationKt.thenOrNull(inputTransformation62, secureTextFieldController.getPasswordRevealFilter());
                                        } else {
                                            inputTransformation7 = inputTransformation62;
                                        }
                                        InputTransformation inputTransformation8 = inputTransformation7;
                                        TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i292, i302, null, 17, null);
                                        ImeActionHandler imeActionHandler5 = imeActionHandler42;
                                        if (imeActionHandler5 == null || keyboardActions == null) {
                                            keyboardActions = KeyboardActions.INSTANCE.getDefault();
                                        }
                                        BasicTextField2Kt.BasicTextField2(textFieldState, then2, z52, false, inputTransformation8, textStyle62, keyboardOptions, keyboardActions, singleLine, function282, mutableInteractionSource52, brush42, codepointTransformation, r312, scrollState42, composer2, 100666368, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i23 = i21;
                            modifier2 = companion;
                            r13 = function24;
                            scrollState3 = scrollState2;
                            i24 = i22;
                            imeActionHandler3 = imeActionHandler2;
                            textStyle4 = textStyle3;
                            inputTransformation4 = inputTransformation3;
                            z3 = z2;
                            i25 = m5409getDefaulteUduSuo;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            brush3 = brush2;
                            function25 = function23;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            imeActionHandler3 = imeActionHandler;
                            i25 = i;
                            i23 = i2;
                            i24 = i3;
                            z3 = z;
                            inputTransformation4 = inputTransformation;
                            textStyle4 = textStyle;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush3 = brush;
                            function25 = function2;
                            r13 = textFieldDecorator;
                            scrollState3 = scrollState;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$4
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

                                public final void invoke(Composer composer2, int i31) {
                                    BasicSecureTextFieldKt.m1071BasicSecureTextFieldmMrxcSU(TextFieldState.this, modifier2, imeActionHandler3, i25, i23, i24, z3, inputTransformation4, textStyle4, mutableInteractionSource3, brush3, function25, r13, scrollState3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i5 & 7168) == 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i26 != 0) {
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
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i6 & 8192) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(coroutineScope2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new SecureTextFieldController(coroutineScope2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    final SecureTextFieldController secureTextFieldController2 = (SecureTextFieldController) rememberedValue2;
                    m1095equalsimpl0 = TextObfuscationMode.m1095equalsimpl0(i21, TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk());
                    if (!m1095equalsimpl0) {
                    }
                    if (m1095equalsimpl0) {
                    }
                    codepointTransformation = mask;
                    Modifier semantics22 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return false;
                                }
                            }, 1, null);
                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return false;
                                }
                            }, 1, null);
                        }
                    });
                    if (!m1095equalsimpl0) {
                    }
                    final Modifier then22 = semantics22.then(companion2);
                    final InputTransformation inputTransformation622 = inputTransformation3;
                    final int i2922 = i22;
                    final int i3022 = m5409getDefaulteUduSuo;
                    final ImeActionHandler imeActionHandler422 = imeActionHandler2;
                    final boolean z522 = z2;
                    final TextStyle textStyle622 = textStyle3;
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2822 = function23;
                    final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
                    final Brush brush422 = brush2;
                    final TextFieldDecorator r3122 = function24;
                    final ScrollState scrollState422 = scrollState2;
                    DisableCutCopy(ComposableLambdaKt.composableLambda(startRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
                        
                            r2 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r2));
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer2, int i31) {
                            InputTransformation inputTransformation7;
                            KeyboardActions keyboardActions;
                            ComposerKt.sourceInformation(composer2, "C323@17492L1033:BasicSecureTextField.kt#g98mwb");
                            if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                                }
                                if (m1095equalsimpl0) {
                                    inputTransformation7 = InputTransformationKt.thenOrNull(inputTransformation622, secureTextFieldController2.getPasswordRevealFilter());
                                } else {
                                    inputTransformation7 = inputTransformation622;
                                }
                                InputTransformation inputTransformation8 = inputTransformation7;
                                TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i2922, i3022, null, 17, null);
                                ImeActionHandler imeActionHandler5 = imeActionHandler422;
                                if (imeActionHandler5 == null || keyboardActions == null) {
                                    keyboardActions = KeyboardActions.INSTANCE.getDefault();
                                }
                                BasicTextField2Kt.BasicTextField2(textFieldState, then22, z522, false, inputTransformation8, textStyle622, keyboardOptions, keyboardActions, singleLine, function2822, mutableInteractionSource522, brush422, codepointTransformation, r3122, scrollState422, composer2, 100666368, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i23 = i21;
                    modifier2 = companion;
                    r13 = function24;
                    scrollState3 = scrollState2;
                    i24 = i22;
                    imeActionHandler3 = imeActionHandler2;
                    textStyle4 = textStyle3;
                    inputTransformation4 = inputTransformation3;
                    z3 = z2;
                    i25 = m5409getDefaulteUduSuo;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    brush3 = brush2;
                    function25 = function23;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                i11 = i6 & 32;
                if (i11 == 0) {
                }
                i12 = i6 & 64;
                if (i12 == 0) {
                }
                i13 = i6 & 128;
                if (i13 == 0) {
                }
                i14 = i6 & 256;
                if (i14 == 0) {
                }
                i15 = i6 & 512;
                if (i15 == 0) {
                }
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                int i282 = i17;
                i19 = i6 & 4096;
                if (i19 == 0) {
                }
                if ((i5 & 7168) == 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i26 != 0) {
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
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if ((i6 & 8192) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(coroutineScope22);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new SecureTextFieldController(coroutineScope22);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final SecureTextFieldController secureTextFieldController22 = (SecureTextFieldController) rememberedValue2;
                m1095equalsimpl0 = TextObfuscationMode.m1095equalsimpl0(i21, TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk());
                if (!m1095equalsimpl0) {
                }
                if (m1095equalsimpl0) {
                }
                codepointTransformation = mask;
                Modifier semantics222 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return false;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return false;
                            }
                        }, 1, null);
                    }
                });
                if (!m1095equalsimpl0) {
                }
                final Modifier then222 = semantics222.then(companion2);
                final InputTransformation inputTransformation6222 = inputTransformation3;
                final int i29222 = i22;
                final int i30222 = m5409getDefaulteUduSuo;
                final ImeActionHandler imeActionHandler4222 = imeActionHandler2;
                final boolean z5222 = z2;
                final TextStyle textStyle6222 = textStyle3;
                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function28222 = function23;
                final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource2;
                final Brush brush4222 = brush2;
                final TextFieldDecorator r31222 = function24;
                final ScrollState scrollState4222 = scrollState2;
                DisableCutCopy(ComposableLambdaKt.composableLambda(startRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
                    
                        r2 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r2));
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer2, int i31) {
                        InputTransformation inputTransformation7;
                        KeyboardActions keyboardActions;
                        ComposerKt.sourceInformation(composer2, "C323@17492L1033:BasicSecureTextField.kt#g98mwb");
                        if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                            }
                            if (m1095equalsimpl0) {
                                inputTransformation7 = InputTransformationKt.thenOrNull(inputTransformation6222, secureTextFieldController22.getPasswordRevealFilter());
                            } else {
                                inputTransformation7 = inputTransformation6222;
                            }
                            InputTransformation inputTransformation8 = inputTransformation7;
                            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i29222, i30222, null, 17, null);
                            ImeActionHandler imeActionHandler5 = imeActionHandler4222;
                            if (imeActionHandler5 == null || keyboardActions == null) {
                                keyboardActions = KeyboardActions.INSTANCE.getDefault();
                            }
                            BasicTextField2Kt.BasicTextField2(textFieldState, then222, z5222, false, inputTransformation8, textStyle6222, keyboardOptions, keyboardActions, singleLine, function28222, mutableInteractionSource5222, brush4222, codepointTransformation, r31222, scrollState4222, composer2, 100666368, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                i23 = i21;
                modifier2 = companion;
                r13 = function24;
                scrollState3 = scrollState2;
                i24 = i22;
                imeActionHandler3 = imeActionHandler2;
                textStyle4 = textStyle3;
                inputTransformation4 = inputTransformation3;
                z3 = z2;
                i25 = m5409getDefaulteUduSuo;
                mutableInteractionSource3 = mutableInteractionSource2;
                brush3 = brush2;
                function25 = function23;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 8;
            int i272 = 2048;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            i11 = i6 & 32;
            if (i11 == 0) {
            }
            i12 = i6 & 64;
            if (i12 == 0) {
            }
            i13 = i6 & 128;
            if (i13 == 0) {
            }
            i14 = i6 & 256;
            if (i14 == 0) {
            }
            i15 = i6 & 512;
            if (i15 == 0) {
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            int i2822 = i17;
            i19 = i6 & 4096;
            if (i19 == 0) {
            }
            if ((i5 & 7168) == 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i26 != 0) {
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
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if ((i6 & 8192) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(coroutineScope222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new SecureTextFieldController(coroutineScope222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final SecureTextFieldController secureTextFieldController222 = (SecureTextFieldController) rememberedValue2;
            m1095equalsimpl0 = TextObfuscationMode.m1095equalsimpl0(i21, TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk());
            if (!m1095equalsimpl0) {
            }
            if (m1095equalsimpl0) {
            }
            codepointTransformation = mask;
            Modifier semantics2222 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return false;
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return false;
                        }
                    }, 1, null);
                }
            });
            if (!m1095equalsimpl0) {
            }
            final Modifier then2222 = semantics2222.then(companion2);
            final InputTransformation inputTransformation62222 = inputTransformation3;
            final int i292222 = i22;
            final int i302222 = m5409getDefaulteUduSuo;
            final ImeActionHandler imeActionHandler42222 = imeActionHandler2;
            final boolean z52222 = z2;
            final TextStyle textStyle62222 = textStyle3;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function282222 = function23;
            final MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource2;
            final Brush brush42222 = brush2;
            final TextFieldDecorator r312222 = function24;
            final ScrollState scrollState42222 = scrollState2;
            DisableCutCopy(ComposableLambdaKt.composableLambda(startRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
                
                    r2 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r2));
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer2, int i31) {
                    InputTransformation inputTransformation7;
                    KeyboardActions keyboardActions;
                    ComposerKt.sourceInformation(composer2, "C323@17492L1033:BasicSecureTextField.kt#g98mwb");
                    if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                        }
                        if (m1095equalsimpl0) {
                            inputTransformation7 = InputTransformationKt.thenOrNull(inputTransformation62222, secureTextFieldController222.getPasswordRevealFilter());
                        } else {
                            inputTransformation7 = inputTransformation62222;
                        }
                        InputTransformation inputTransformation8 = inputTransformation7;
                        TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i292222, i302222, null, 17, null);
                        ImeActionHandler imeActionHandler5 = imeActionHandler42222;
                        if (imeActionHandler5 == null || keyboardActions == null) {
                            keyboardActions = KeyboardActions.INSTANCE.getDefault();
                        }
                        BasicTextField2Kt.BasicTextField2(textFieldState, then2222, z52222, false, inputTransformation8, textStyle62222, keyboardOptions, keyboardActions, singleLine, function282222, mutableInteractionSource52222, brush42222, codepointTransformation, r312222, scrollState42222, composer2, 100666368, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            i23 = i21;
            modifier2 = companion;
            r13 = function24;
            scrollState3 = scrollState2;
            i24 = i22;
            imeActionHandler3 = imeActionHandler2;
            textStyle4 = textStyle3;
            inputTransformation4 = inputTransformation3;
            z3 = z2;
            i25 = m5409getDefaulteUduSuo;
            mutableInteractionSource3 = mutableInteractionSource2;
            brush3 = brush2;
            function25 = function23;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        int i2722 = 2048;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 == 0) {
        }
        i12 = i6 & 64;
        if (i12 == 0) {
        }
        i13 = i6 & 128;
        if (i13 == 0) {
        }
        i14 = i6 & 256;
        if (i14 == 0) {
        }
        i15 = i6 & 512;
        if (i15 == 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i28222 = i17;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        if ((i5 & 7168) == 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i26 != 0) {
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
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if ((i6 & 8192) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(coroutineScope2222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new SecureTextFieldController(coroutineScope2222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final SecureTextFieldController secureTextFieldController2222 = (SecureTextFieldController) rememberedValue2;
        m1095equalsimpl0 = TextObfuscationMode.m1095equalsimpl0(i21, TextObfuscationMode.INSTANCE.m1100getRevealLastTypedpyid5Pk());
        if (!m1095equalsimpl0) {
        }
        if (m1095equalsimpl0) {
        }
        codepointTransformation = mask;
        Modifier semantics22222 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return false;
                    }
                }, 1, null);
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return false;
                    }
                }, 1, null);
            }
        });
        if (!m1095equalsimpl0) {
        }
        final Modifier then22222 = semantics22222.then(companion2);
        final InputTransformation inputTransformation622222 = inputTransformation3;
        final int i2922222 = i22;
        final int i3022222 = m5409getDefaulteUduSuo;
        final ImeActionHandler imeActionHandler422222 = imeActionHandler2;
        final boolean z522222 = z2;
        final TextStyle textStyle622222 = textStyle3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2822222 = function23;
        final MutableInteractionSource mutableInteractionSource522222 = mutableInteractionSource2;
        final Brush brush422222 = brush2;
        final TextFieldDecorator r3122222 = function24;
        final ScrollState scrollState422222 = scrollState2;
        DisableCutCopy(ComposableLambdaKt.composableLambda(startRestartGroup, -1415093334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3
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

            /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
            
                r2 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r2));
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(Composer composer2, int i31) {
                InputTransformation inputTransformation7;
                KeyboardActions keyboardActions;
                ComposerKt.sourceInformation(composer2, "C323@17492L1033:BasicSecureTextField.kt#g98mwb");
                if ((i31 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1415093334, i31, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
                    }
                    if (m1095equalsimpl0) {
                        inputTransformation7 = InputTransformationKt.thenOrNull(inputTransformation622222, secureTextFieldController2222.getPasswordRevealFilter());
                    } else {
                        inputTransformation7 = inputTransformation622222;
                    }
                    InputTransformation inputTransformation8 = inputTransformation7;
                    TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, i2922222, i3022222, null, 17, null);
                    ImeActionHandler imeActionHandler5 = imeActionHandler422222;
                    if (imeActionHandler5 == null || keyboardActions == null) {
                        keyboardActions = KeyboardActions.INSTANCE.getDefault();
                    }
                    BasicTextField2Kt.BasicTextField2(textFieldState, then22222, z522222, false, inputTransformation8, textStyle622222, keyboardOptions, keyboardActions, singleLine, function2822222, mutableInteractionSource522222, brush422222, codepointTransformation, r3122222, scrollState422222, composer2, 100666368, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        i23 = i21;
        modifier2 = companion;
        r13 = function24;
        scrollState3 = scrollState2;
        i24 = i22;
        imeActionHandler3 = imeActionHandler2;
        textStyle4 = textStyle3;
        inputTransformation4 = inputTransformation3;
        z3 = z2;
        i25 = m5409getDefaulteUduSuo;
        mutableInteractionSource3 = mutableInteractionSource2;
        brush3 = brush2;
        function25 = function23;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardActions KeyboardActions(final ImeActionHandler imeActionHandler) {
        return new KeyboardActions(new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$KeyboardActions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                if (ImeActionHandler.this.mo1072onImeActionKlQnJC8(ImeAction.INSTANCE.m5410getDoneeUduSuo())) {
                    return;
                }
                keyboardActionScope.mo861defaultKeyboardActionKlQnJC8(ImeAction.INSTANCE.m5410getDoneeUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$KeyboardActions$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                if (ImeActionHandler.this.mo1072onImeActionKlQnJC8(ImeAction.INSTANCE.m5411getGoeUduSuo())) {
                    return;
                }
                keyboardActionScope.mo861defaultKeyboardActionKlQnJC8(ImeAction.INSTANCE.m5411getGoeUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$KeyboardActions$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                if (ImeActionHandler.this.mo1072onImeActionKlQnJC8(ImeAction.INSTANCE.m5412getNexteUduSuo())) {
                    return;
                }
                keyboardActionScope.mo861defaultKeyboardActionKlQnJC8(ImeAction.INSTANCE.m5412getNexteUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$KeyboardActions$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                if (ImeActionHandler.this.mo1072onImeActionKlQnJC8(ImeAction.INSTANCE.m5414getPreviouseUduSuo())) {
                    return;
                }
                keyboardActionScope.mo861defaultKeyboardActionKlQnJC8(ImeAction.INSTANCE.m5414getPreviouseUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$KeyboardActions$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                if (ImeActionHandler.this.mo1072onImeActionKlQnJC8(ImeAction.INSTANCE.m5415getSearcheUduSuo())) {
                    return;
                }
                keyboardActionScope.mo861defaultKeyboardActionKlQnJC8(ImeAction.INSTANCE.m5415getSearcheUduSuo());
            }
        }, new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$KeyboardActions$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                invoke2(keyboardActionScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                if (ImeActionHandler.this.mo1072onImeActionKlQnJC8(ImeAction.INSTANCE.m5416getSendeUduSuo())) {
                    return;
                }
                keyboardActionScope.mo861defaultKeyboardActionKlQnJC8(ImeAction.INSTANCE.m5416getSendeUduSuo());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(930154034);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisableCutCopy)491@23154L7,492@23192L680,511@23877L434:BasicSecureTextField.kt#g98mwb");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(930154034, i2, -1, "androidx.compose.foundation.text2.DisableCutCopy (BasicSecureTextField.kt:490)");
            }
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextToolbar textToolbar = (TextToolbar) consume;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(textToolbar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    {
                        this.$$delegate_0 = TextToolbar.this;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
                        TextToolbar.this.showMenu(rect, null, onPasteRequested, null, onSelectAllRequested);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) rememberedValue), ComposableLambdaKt.composableLambda(startRestartGroup, -1741121166, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$DisableCutCopy$1
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

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C512@23959L346:BasicSecureTextField.kt#g98mwb");
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1741121166, i3, -1, "androidx.compose.foundation.text2.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:512)");
                        }
                        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(Modifier.INSTANCE, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$DisableCutCopy$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m1073invokeZmokQxo(keyEvent.m4405unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m1073invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                KeyCommand mo860mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo860mapZmokQxo(keyEvent);
                                return Boolean.valueOf(mo860mapZmokQxo == KeyCommand.COPY || mo860mapZmokQxo == KeyCommand.CUT);
                            }
                        });
                        Function2<Composer, Integer, Unit> function22 = function2;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onPreviewKeyEvent);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1102005134, "C518@24286L9:BasicSecureTextField.kt#g98mwb");
                        function22.invoke(composer2, 0);
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
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text2.BasicSecureTextFieldKt$DisableCutCopy$2
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

                public final void invoke(Composer composer2, int i3) {
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
