package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aî\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u000123\b\u0002\u0010\u001e\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b H\u0001¢\u0006\u0002\u0010$\u001a0\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020'2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b H\u0003¢\u0006\u0002\u0010)\u001a\u001d\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,\u001a\u0015\u0010-\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H\u0002\u001a\u0010\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u000204H\u0000\u001a \u00105\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0002\u001a0\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:2\u0006\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0002\u001a \u0010;\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0001H\u0002\u001a2\u0010?\u001a\u00020\u0003*\u00020@2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000f2\u0006\u00106\u001a\u000207H\u0080@¢\u0006\u0002\u0010D\u001a\u001c\u0010E\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u0010&\u001a\u00020'H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006F²\u0006\n\u0010G\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"USE_WINDOW_FOCUS_ENABLED", "", "CoreTextField", "", SDKConstants.PARAM_VALUE, "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/foundation/text/TextFieldState;", "isWindowFocusedBehindFlag", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    public static final boolean USE_WINDOW_FOCUS_ENABLED = false;

    public static final boolean isWindowFocusedBehindFlag(WindowInfo windowInfo) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0739 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
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
        int i18;
        int i19;
        Modifier modifier2;
        SolidColor solidColor;
        ImeOptions imeOptions2;
        boolean z4;
        Modifier modifier3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        boolean z5;
        int i20;
        Brush brush2;
        KeyboardActions keyboardActions2;
        boolean z6;
        VisualTransformation visualTransformation2;
        Function1<? super TextLayoutResult, Unit> function13;
        int i21;
        TextStyle textStyle2;
        MutableInteractionSource mutableInteractionSource2;
        Object rememberedValue;
        final TextInputService textInputService;
        final Orientation orientation;
        boolean changed;
        Object rememberedValue2;
        TextFieldScrollerPosition textFieldScrollerPosition;
        boolean changed2;
        Object rememberedValue3;
        TextRange composition;
        TextFieldScrollerPosition textFieldScrollerPosition2;
        MutableInteractionSource mutableInteractionSource3;
        boolean changed3;
        Object rememberedValue4;
        Object rememberedValue5;
        Object rememberedValue6;
        Object rememberedValue7;
        Object rememberedValue8;
        boolean z7;
        Modifier.Companion companion;
        Composer composer2;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function14;
        final VisualTransformation visualTransformation3;
        final Brush brush3;
        final boolean z8;
        final int i22;
        final KeyboardActions keyboardActions3;
        final boolean z9;
        final int i23;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        final boolean z10;
        final Modifier modifier4;
        final ImeOptions imeOptions3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope endRestartGroup;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(-958708118);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextField)P(14,10,8,13,15,9,4!1,12,6,7,3,5,2,11)214@11969L29,218@12167L7,219@12206L7,220@12267L7,221@12335L7,222@12400L7,223@12445L7,224@12514L7,229@12730L135,235@12906L268,247@13479L21,248@13517L397,277@14313L26,280@14399L51,286@14702L7,287@14753L7,288@14810L7,292@14921L24,293@14979L37,588@27132L86,592@27224L515,641@29030L4637:CoreTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i25 = i5 & 4;
        if (i25 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(brush) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                if ((i4 & 112) == 0) {
                    if ((i5 & 2048) == 0 && startRestartGroup.changed(imeOptions)) {
                        i24 = 32;
                        i15 |= i24;
                    }
                    i24 = 16;
                    i15 |= i24;
                }
                int i26 = i15;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i26 |= 384;
                } else if ((i4 & 896) == 0) {
                    i26 |= startRestartGroup.changed(keyboardActions) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i26 |= 3072;
                    } else if ((i4 & 7168) == 0) {
                        i26 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i26 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i26 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i26 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i26) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion2 = i25 != 0 ? Modifier.INSTANCE : modifier;
                                TextStyle textStyle4 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                VisualTransformation none = i8 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = i9 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                MutableInteractionSource mutableInteractionSource5 = i10 != 0 ? null : mutableInteractionSource;
                                if (i11 != 0) {
                                    modifier2 = companion2;
                                    solidColor = new SolidColor(Color.INSTANCE.m3443getUnspecified0d7_KjU(), null);
                                } else {
                                    modifier2 = companion2;
                                    solidColor = brush;
                                }
                                boolean z11 = i12 != 0 ? true : z;
                                int i27 = i13 != 0 ? Integer.MAX_VALUE : i;
                                int i28 = i14 != 0 ? 1 : i2;
                                if ((i5 & 2048) != 0) {
                                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                    i26 &= -113;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                KeyboardActions keyboardActions4 = i16 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                z4 = i17 != 0 ? true : z2;
                                boolean z12 = i18 != 0 ? false : z3;
                                if (i19 != 0) {
                                    modifier3 = modifier2;
                                    z5 = z11;
                                    i20 = i28;
                                    brush2 = solidColor;
                                    keyboardActions2 = keyboardActions4;
                                    z6 = z12;
                                    function32 = ComposableSingletons$CoreTextFieldKt.INSTANCE.m854getLambda1$foundation_release();
                                } else {
                                    modifier3 = modifier2;
                                    function32 = function3;
                                    z5 = z11;
                                    i20 = i28;
                                    brush2 = solidColor;
                                    keyboardActions2 = keyboardActions4;
                                    z6 = z12;
                                }
                                visualTransformation2 = none;
                                function13 = coreTextFieldKt$CoreTextField$1;
                                i21 = i27;
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                textStyle2 = textStyle4;
                                mutableInteractionSource2 = mutableInteractionSource6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 2048) != 0) {
                                    i26 &= -113;
                                }
                                modifier3 = modifier;
                                textStyle2 = textStyle;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                z5 = z;
                                i21 = i;
                                i20 = i2;
                                imeOptions2 = imeOptions;
                                keyboardActions2 = keyboardActions;
                                z4 = z2;
                                z6 = z3;
                                function32 = function3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-958708118, i6, i26, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:213)");
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final FocusRequester focusRequester = (FocusRequester) rememberedValue;
                            ProvidableCompositionLocal<TextInputService> localTextInputService = CompositionLocalsKt.getLocalTextInputService();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localTextInputService);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textInputService = (TextInputService) consume;
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density = (Density) consume2;
                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume4 = startRestartGroup.consume(localTextSelectionColors);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long backgroundColor = ((TextSelectionColors) consume4).getBackgroundColor();
                            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume5 = startRestartGroup.consume(localFocusManager);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FocusManager focusManager = (FocusManager) consume5;
                            Modifier modifier5 = modifier3;
                            ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume6 = startRestartGroup.consume(localWindowInfo);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final WindowInfo windowInfo = (WindowInfo) consume6;
                            int i29 = i26;
                            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume7 = startRestartGroup.consume(localSoftwareKeyboardController);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume7;
                            orientation = (i21 == 1 || z5 || !imeOptions2.getSingleLine()) ? Orientation.Vertical : Orientation.Horizontal;
                            Object[] objArr = {orientation};
                            Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                            final int i30 = i21;
                            startRestartGroup.startReplaceableGroup(294183095);
                            changed = startRestartGroup.changed(orientation);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final TextFieldScrollerPosition invoke() {
                                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m3024rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                                composition = textFieldValue.getComposition();
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                if (composition != null) {
                                    Object m910applyCompositionDecoration72CqOWE = TextFieldDelegate.INSTANCE.m910applyCompositionDecoration72CqOWE(composition.getPackedValue(), filterWithValidation);
                                    if (m910applyCompositionDecoration72CqOWE != null) {
                                        rememberedValue3 = m910applyCompositionDecoration72CqOWE;
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                }
                                rememberedValue3 = filterWithValidation;
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TransformedText transformedText = (TransformedText) rememberedValue3;
                            AnnotatedString text = transformedText.getText();
                            final OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                            RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed3 = startRestartGroup.changed(softwareKeyboardController);
                            final ImeOptions imeOptions4 = imeOptions2;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z5, 0, density, resolver, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope, softwareKeyboardController);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldState textFieldState = (TextFieldState) rememberedValue4;
                            textFieldState.m933updatefnh65Uc(textFieldValue.getAnnotatedString(), text, textStyle2, z5, density, resolver, function1, keyboardActions2, focusManager, backgroundColor);
                            textFieldState.getProcessor().reset(textFieldValue, textFieldState.getInputSession());
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new UndoManager(0, 1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceableGroup();
                            UndoManager undoManager = (UndoManager) rememberedValue5;
                            UndoManager.snapshotIfNeeded$default(undoManager, textFieldValue, 0L, 2, null);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new TextFieldSelectionManager(undoManager);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) rememberedValue6;
                            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager.setState$foundation_release(textFieldState);
                            textFieldSelectionManager.setValue$foundation_release(textFieldValue);
                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume8 = startRestartGroup.consume(localClipboardManager);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) consume8);
                            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume9 = startRestartGroup.consume(localTextToolbar);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setTextToolbar((TextToolbar) consume9);
                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume10 = startRestartGroup.consume(localHapticFeedback);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) consume10);
                            textFieldSelectionManager.setFocusRequester(focusRequester);
                            textFieldSelectionManager.setEditable(!z6);
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue7 = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue8;
                            final boolean z13 = z4;
                            final boolean z14 = z6;
                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                            Modifier textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z4, focusRequester, mutableInteractionSource7, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                    invoke2(focusState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(FocusState focusState) {
                                    TextLayoutResultProxy layoutResult;
                                    if (TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                        return;
                                    }
                                    TextFieldState.this.setHasFocus(focusState.isFocused());
                                    if (textInputService != null) {
                                        if (!TextFieldState.this.getHasFocus() || !z13 || z14) {
                                            CoreTextFieldKt.endInputSession(TextFieldState.this);
                                        } else {
                                            CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldValue, imeOptions4, offsetMapping);
                                        }
                                        if (focusState.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester, textFieldValue, TextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                        }
                                    }
                                    if (focusState.isFocused()) {
                                        return;
                                    }
                                    TextFieldSelectionManager.m1056deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                }
                            });
                            startRestartGroup.startReplaceableGroup(-55007276);
                            ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
                            if (textInputService != null) {
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new CoreTextFieldKt$CoreTextField$2(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z4 && !z6), startRestartGroup, 0), textInputService, textFieldSelectionManager, imeOptions4, null), startRestartGroup, 70);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final boolean z15 = z6;
                            Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(Modifier.INSTANCE, new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z16) {
                                    TextFieldState.this.setInTouchMode(z16);
                                }
                            }), mutableInteractionSource7, z4, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    m855invokek4lQ0M(offset.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m855invokek4lQ0M(long j) {
                                    CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester, !z15);
                                    if (TextFieldState.this.getHasFocus()) {
                                        if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                            if (layoutResult != null) {
                                                TextFieldState textFieldState2 = TextFieldState.this;
                                                TextFieldDelegate.INSTANCE.m912setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2.getProcessor(), offsetMapping, textFieldState2.getOnValueChange());
                                                if (textFieldState2.getTextDelegate().getText().length() > 0) {
                                                    textFieldState2.setHandleState(HandleState.Cursor);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        textFieldSelectionManager.m1060deselect_kEHs6E$foundation_release(Offset.m3155boximpl(j));
                                    }
                                }
                            }), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            final Modifier drawBehind = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        OffsetMapping offsetMapping2 = offsetMapping;
                                        TextFieldState textFieldState2 = TextFieldState.this;
                                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping2, layoutResult.getValue(), textFieldState2.getSelectionPaint());
                                    }
                                }
                            });
                            final boolean z16 = z4;
                            final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                    TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                    }
                                    if (z16) {
                                        if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                            if (TextFieldState.this.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo)) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            } else {
                                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                            }
                                            TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                            TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                            TextFieldState.this.setShowCursorHandle(TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()));
                                        } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                            TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                        }
                                        CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping);
                                        TextLayoutResultProxy layoutResult2 = TextFieldState.this.getLayoutResult();
                                        if (layoutResult2 != null) {
                                            TextFieldState textFieldState2 = TextFieldState.this;
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            OffsetMapping offsetMapping2 = offsetMapping;
                                            TextInputSession inputSession = textFieldState2.getInputSession();
                                            if (inputSession == null || !textFieldState2.getHasFocus()) {
                                                return;
                                            }
                                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                        }
                                    }
                                }
                            });
                            final boolean z17 = visualTransformation2 instanceof PasswordVisualTransformation;
                            final boolean z18 = z4;
                            final boolean z19 = z6;
                            Modifier semantics = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                    SemanticsPropertiesKt.m5078setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                    if (!z18) {
                                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                    }
                                    if (z17) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    }
                                    final TextFieldState textFieldState2 = textFieldState;
                                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(List<TextLayoutResult> list) {
                                            boolean z20;
                                            if (TextFieldState.this.getLayoutResult() != null) {
                                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                                Intrinsics.checkNotNull(layoutResult);
                                                list.add(layoutResult.getValue());
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            return Boolean.valueOf(z20);
                                        }
                                    }, 1, null);
                                    final boolean z20 = z19;
                                    final boolean z21 = z18;
                                    final TextFieldState textFieldState3 = textFieldState;
                                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                            Unit unit;
                                            if (z20 || !z21) {
                                                return false;
                                            }
                                            TextInputSession inputSession = textFieldState3.getInputSession();
                                            if (inputSession != null) {
                                                TextFieldState textFieldState4 = textFieldState3;
                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                                unit = Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                textFieldState3.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            }
                                            return true;
                                        }
                                    }, 1, null);
                                    final boolean z22 = z19;
                                    final boolean z23 = z18;
                                    final TextFieldState textFieldState4 = textFieldState;
                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                            Unit unit;
                                            if (z22 || !z23) {
                                                return false;
                                            }
                                            TextInputSession inputSession = textFieldState4.getInputSession();
                                            if (inputSession != null) {
                                                TextFieldState textFieldState5 = textFieldState4;
                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                                unit = Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                textFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5233getStartimpl(textFieldValue3.getSelection()), TextRange.m5228getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5233getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            }
                                            return true;
                                        }
                                    }, 1, null);
                                    final OffsetMapping offsetMapping2 = offsetMapping;
                                    final boolean z24 = z18;
                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                    final TextFieldState textFieldState5 = textFieldState;
                                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                        }

                                        public final Boolean invoke(int i31, int i32, boolean z25) {
                                            if (!z25) {
                                                i31 = OffsetMapping.this.transformedToOriginal(i31);
                                            }
                                            if (!z25) {
                                                i32 = OffsetMapping.this.transformedToOriginal(i32);
                                            }
                                            boolean z26 = false;
                                            if (z24 && (i31 != TextRange.m5233getStartimpl(textFieldValue3.getSelection()) || i32 != TextRange.m5228getEndimpl(textFieldValue3.getSelection()))) {
                                                if (Math.min(i31, i32) >= 0 && Math.max(i31, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                                    if (z25 || i31 == i32) {
                                                        textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                    } else {
                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                    }
                                                    textFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i31, i32), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                    z26 = true;
                                                } else {
                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                }
                                            }
                                            return Boolean.valueOf(z26);
                                        }
                                    }, 1, null);
                                    int imeAction = imeOptions4.getImeAction();
                                    final TextFieldState textFieldState6 = textFieldState;
                                    final ImeOptions imeOptions5 = imeOptions4;
                                    SemanticsPropertiesKt.m5074onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5394boximpl(imeOptions5.getImeAction()));
                                            return true;
                                        }
                                    }, 2, null);
                                    final TextFieldState textFieldState7 = textFieldState;
                                    final FocusRequester focusRequester2 = focusRequester;
                                    final boolean z25 = z19;
                                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2, !z25);
                                            return true;
                                        }
                                    }, 1, null);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                            return true;
                                        }
                                    }, 1, null);
                                    if (!TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()) && !z17) {
                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                return true;
                                            }
                                        }, 1, null);
                                        if (z18 && !z19) {
                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextFieldSelectionManager.this.cut$foundation_release();
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                    if (!z18 || z19) {
                                        return;
                                    }
                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.paste$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            });
                            final Modifier cursor = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState, textFieldValue, offsetMapping, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo)) ? false : true);
                            EffectsKt.DisposableEffect(textFieldSelectionManager, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                        }
                                    };
                                }
                            }, startRestartGroup, 8);
                            EffectsKt.DisposableEffect(imeOptions4, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    if (TextInputService.this != null && textFieldState.getHasFocus()) {
                                        textFieldState.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, textFieldValue, textFieldState.getProcessor(), imeOptions4, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
                                    }
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }
                            }, startRestartGroup, (i29 >> 3) & 14);
                            final TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier5.then(textFieldFocusModifier), textFieldState, focusManager), textFieldState, textFieldSelectionManager).then(TextFieldKeyInputKt.m919textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, textFieldState, textFieldSelectionManager, textFieldValue, textFieldState.getOnValueChange(), !z6, i30 == 1, offsetMapping, undoManager, imeOptions4.getImeAction())), textFieldScrollerPosition3, mutableInteractionSource7, z4).then(pointerHoverIcon$default).then(semantics), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                }
                            });
                            z7 = !z4 && textFieldState.getHasFocus() && textFieldState.isInTouchMode() && isWindowFocusedBehindFlag(windowInfo);
                            if (z7) {
                                companion = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.INSTANCE, textFieldSelectionManager);
                            } else {
                                companion = Modifier.INSTANCE;
                            }
                            final Modifier modifier6 = companion;
                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34 = function32;
                            final TextStyle textStyle5 = textStyle2;
                            final int i31 = i20;
                            boolean z20 = z4;
                            final VisualTransformation visualTransformation4 = visualTransformation2;
                            VisualTransformation visualTransformation5 = visualTransformation2;
                            final boolean z21 = z7;
                            final boolean z22 = z6;
                            final Function1<? super TextLayoutResult, Unit> function15 = function13;
                            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i32) {
                                    ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                                    if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                                        }
                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34;
                                        final TextFieldState textFieldState2 = textFieldState;
                                        final TextStyle textStyle6 = textStyle5;
                                        final int i33 = i31;
                                        final int i34 = i30;
                                        final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                        final Modifier modifier7 = cursor;
                                        final Modifier modifier8 = drawBehind;
                                        final Modifier modifier9 = onGloballyPositioned;
                                        final Modifier modifier10 = modifier6;
                                        final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                        final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                        final boolean z23 = z21;
                                        final boolean z24 = z22;
                                        final Function1<TextLayoutResult, Unit> function16 = function15;
                                        final OffsetMapping offsetMapping2 = offsetMapping;
                                        final Density density2 = density;
                                        function35.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i35) {
                                                ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                                if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                                    }
                                                    Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldState.this.m931getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                                    TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                    final TextFieldState textFieldState3 = TextFieldState.this;
                                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition5, textFieldValue3, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final TextLayoutResultProxy invoke() {
                                                            return TextFieldState.this.getLayoutResult();
                                                        }
                                                    }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2);
                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                    final TextFieldState textFieldState4 = TextFieldState.this;
                                                    final boolean z25 = z23;
                                                    final boolean z26 = z24;
                                                    final Function1<TextLayoutResult, Unit> function17 = function16;
                                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                                    final OffsetMapping offsetMapping3 = offsetMapping2;
                                                    final Density density3 = density2;
                                                    final int i36 = i34;
                                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, -363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer5, int i37) {
                                                            ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                                            if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                                }
                                                                final TextFieldState textFieldState5 = textFieldState4;
                                                                final Function1<TextLayoutResult, Unit> function18 = function17;
                                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                final Density density4 = density3;
                                                                final int i38 = i36;
                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    /* renamed from: measure-3p2s80s */
                                                                    public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                        Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                                        TextFieldState textFieldState6 = TextFieldState.this;
                                                                        Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                        try {
                                                                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                            try {
                                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                                TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                createNonObservableSnapshot.dispose();
                                                                                Triple<Integer, Integer, TextLayoutResult> m911layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m911layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                int intValue = m911layout_EkL_Y$foundation_release.component1().intValue();
                                                                                int intValue2 = m911layout_EkL_Y$foundation_release.component2().intValue();
                                                                                TextLayoutResult component3 = m911layout_EkL_Y$foundation_release.component3();
                                                                                if (!Intrinsics.areEqual(value, component3)) {
                                                                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                                    function18.invoke(component3);
                                                                                    CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                                }
                                                                                TextFieldState.this.m932setMinHeightForSingleLineField0680j_4(density4.mo310toDpu2uoSUM(i38 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                                return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                        invoke2(placementScope);
                                                                                        return Unit.INSTANCE;
                                                                                    }
                                                                                });
                                                                            } finally {
                                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            createNonObservableSnapshot.dispose();
                                                                            throw th;
                                                                        }
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i39) {
                                                                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                    }
                                                                };
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                boolean z27 = false;
                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer5);
                                                                Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                if (textFieldState4.getHandleState() != HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                    if (layoutCoordinates.isAttached() && z25) {
                                                                        z27 = true;
                                                                    }
                                                                }
                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z26 && z25) {
                                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = startRestartGroup;
                            CoreTextFieldRootBox(onGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, function2), composer2, 448);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            function14 = function13;
                            visualTransformation3 = visualTransformation5;
                            brush3 = brush2;
                            z8 = z5;
                            i22 = i20;
                            keyboardActions3 = keyboardActions2;
                            z9 = z6;
                            i23 = i30;
                            function33 = function32;
                            z10 = z20;
                            modifier4 = modifier5;
                            imeOptions3 = imeOptions4;
                            mutableInteractionSource4 = mutableInteractionSource7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource4 = mutableInteractionSource;
                            brush3 = brush;
                            z8 = z;
                            i23 = i;
                            imeOptions3 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z10 = z2;
                            z9 = z3;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i22 = i2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i32) {
                                    CoreTextFieldKt.CoreTextField(TextFieldValue.this, function1, modifier4, textStyle3, visualTransformation3, function14, mutableInteractionSource4, brush3, z8, i23, i22, imeOptions3, keyboardActions3, z10, z9, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i25 != 0) {
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
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    visualTransformation2 = none;
                    function13 = coreTextFieldKt$CoreTextField$1;
                    i21 = i27;
                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource5;
                    textStyle2 = textStyle4;
                    mutableInteractionSource2 = mutableInteractionSource62;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
                    ProvidableCompositionLocal<TextInputService> localTextInputService2 = CompositionLocalsKt.getLocalTextInputService();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume11 = startRestartGroup.consume(localTextInputService2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textInputService = (TextInputService) consume11;
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density2 = (Density) consume22;
                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localFontFamilyResolver2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) consume32;
                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2 = TextSelectionColorsKt.getLocalTextSelectionColors();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume42 = startRestartGroup.consume(localTextSelectionColors2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long backgroundColor2 = ((TextSelectionColors) consume42).getBackgroundColor();
                    ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume52 = startRestartGroup.consume(localFocusManager2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FocusManager focusManager2 = (FocusManager) consume52;
                    Modifier modifier52 = modifier3;
                    ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume62 = startRestartGroup.consume(localWindowInfo2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final WindowInfo windowInfo2 = (WindowInfo) consume62;
                    int i292 = i26;
                    ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume72 = startRestartGroup.consume(localSoftwareKeyboardController2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) consume72;
                    if (i21 == 1) {
                    }
                    Object[] objArr2 = {orientation};
                    Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    final int i302 = i21;
                    startRestartGroup.startReplaceableGroup(294183095);
                    changed = startRestartGroup.changed(orientation);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final TextFieldScrollerPosition invoke() {
                            return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m3024rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                    composition = textFieldValue.getComposition();
                    textFieldScrollerPosition2 = textFieldScrollerPosition;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    if (composition != null) {
                    }
                    rememberedValue3 = filterWithValidation2;
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    final TransformedText transformedText2 = (TransformedText) rememberedValue3;
                    AnnotatedString text2 = transformedText2.getText();
                    final OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                    RecomposeScope currentRecomposeScope2 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(softwareKeyboardController2);
                    final ImeOptions imeOptions42 = imeOptions2;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue4 = new TextFieldState(new TextDelegate(text2, textStyle2, 0, 0, z5, 0, density2, resolver2, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope2, softwareKeyboardController2);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldState textFieldState2 = (TextFieldState) rememberedValue4;
                    textFieldState2.m933updatefnh65Uc(textFieldValue.getAnnotatedString(), text2, textStyle2, z5, density2, resolver2, function1, keyboardActions2, focusManager2, backgroundColor2);
                    textFieldState2.getProcessor().reset(textFieldValue, textFieldState2.getInputSession());
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    UndoManager undoManager2 = (UndoManager) rememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue6;
                    textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                    textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager2.setOnValueChange$foundation_release(textFieldState2.getOnValueChange());
                    textFieldSelectionManager2.setState$foundation_release(textFieldState2);
                    textFieldSelectionManager2.setValue$foundation_release(textFieldValue);
                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume82 = startRestartGroup.consume(localClipboardManager2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setClipboardManager$foundation_release((ClipboardManager) consume82);
                    ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume92 = startRestartGroup.consume(localTextToolbar2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setTextToolbar((TextToolbar) consume92);
                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume102 = startRestartGroup.consume(localHapticFeedback2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) consume102);
                    textFieldSelectionManager2.setFocusRequester(focusRequester2);
                    textFieldSelectionManager2.setEditable(!z6);
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue8;
                    final boolean z132 = z4;
                    final boolean z142 = z6;
                    MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                    Modifier textFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z4, focusRequester2, mutableInteractionSource72, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                            invoke2(focusState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(FocusState focusState) {
                            TextLayoutResultProxy layoutResult;
                            if (TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                return;
                            }
                            TextFieldState.this.setHasFocus(focusState.isFocused());
                            if (textInputService != null) {
                                if (!TextFieldState.this.getHasFocus() || !z132 || z142) {
                                    CoreTextFieldKt.endInputSession(TextFieldState.this);
                                } else {
                                    CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldValue, imeOptions42, offsetMapping2);
                                }
                                if (focusState.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2, textFieldValue, TextFieldState.this, layoutResult, offsetMapping2, null), 3, null);
                                }
                            }
                            if (focusState.isFocused()) {
                                return;
                            }
                            TextFieldSelectionManager.m1056deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                        }
                    });
                    startRestartGroup.startReplaceableGroup(-55007276);
                    ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
                    if (textInputService != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final boolean z152 = z6;
                    Modifier pointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(Modifier.INSTANCE, new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z162) {
                            TextFieldState.this.setInTouchMode(z162);
                        }
                    }), mutableInteractionSource72, z4, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                            m855invokek4lQ0M(offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m855invokek4lQ0M(long j) {
                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2, !z152);
                            if (TextFieldState.this.getHasFocus()) {
                                if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        TextFieldState textFieldState22 = TextFieldState.this;
                                        TextFieldDelegate.INSTANCE.m912setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState22.getProcessor(), offsetMapping2, textFieldState22.getOnValueChange());
                                        if (textFieldState22.getTextDelegate().getText().length() > 0) {
                                            textFieldState22.setHandleState(HandleState.Cursor);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                textFieldSelectionManager2.m1060deselect_kEHs6E$foundation_release(Offset.m3155boximpl(j));
                            }
                        }
                    }), textFieldSelectionManager2.getMouseSelectionObserver(), textFieldSelectionManager2.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    final Modifier drawBehind2 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                TextFieldValue textFieldValue2 = textFieldValue;
                                OffsetMapping offsetMapping22 = offsetMapping2;
                                TextFieldState textFieldState22 = TextFieldState.this;
                                TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping22, layoutResult.getValue(), textFieldState22.getSelectionPaint());
                            }
                        }
                    });
                    final boolean z162 = z4;
                    final Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                            }
                            if (z162) {
                                if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                    if (TextFieldState.this.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo2)) {
                                        textFieldSelectionManager2.showSelectionToolbar$foundation_release();
                                    } else {
                                        textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                                    }
                                    TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                    TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, false));
                                    TextFieldState.this.setShowCursorHandle(TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()));
                                } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                    TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                }
                                CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping2);
                                TextLayoutResultProxy layoutResult2 = TextFieldState.this.getLayoutResult();
                                if (layoutResult2 != null) {
                                    TextFieldState textFieldState22 = TextFieldState.this;
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    OffsetMapping offsetMapping22 = offsetMapping2;
                                    TextInputSession inputSession = textFieldState22.getInputSession();
                                    if (inputSession == null || !textFieldState22.getHasFocus()) {
                                        return;
                                    }
                                    TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping22, layoutResult2);
                                }
                            }
                        }
                    });
                    final boolean z172 = visualTransformation2 instanceof PasswordVisualTransformation;
                    final boolean z182 = z4;
                    final boolean z192 = z6;
                    Modifier semantics2 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                            SemanticsPropertiesKt.m5078setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                            if (!z182) {
                                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                            }
                            if (z172) {
                                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                            }
                            final TextFieldState textFieldState22 = textFieldState2;
                            SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(List<TextLayoutResult> list) {
                                    boolean z202;
                                    if (TextFieldState.this.getLayoutResult() != null) {
                                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                        Intrinsics.checkNotNull(layoutResult);
                                        list.add(layoutResult.getValue());
                                        z202 = true;
                                    } else {
                                        z202 = false;
                                    }
                                    return Boolean.valueOf(z202);
                                }
                            }, 1, null);
                            final boolean z202 = z192;
                            final boolean z212 = z182;
                            final TextFieldState textFieldState3 = textFieldState2;
                            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(AnnotatedString annotatedString) {
                                    Unit unit;
                                    if (z202 || !z212) {
                                        return false;
                                    }
                                    TextInputSession inputSession = textFieldState3.getInputSession();
                                    if (inputSession != null) {
                                        TextFieldState textFieldState4 = textFieldState3;
                                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                        unit = Unit.INSTANCE;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        textFieldState3.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    }
                                    return true;
                                }
                            }, 1, null);
                            final boolean z222 = z192;
                            final boolean z23 = z182;
                            final TextFieldState textFieldState4 = textFieldState2;
                            final TextFieldValue textFieldValue2 = textFieldValue;
                            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(AnnotatedString annotatedString) {
                                    Unit unit;
                                    if (z222 || !z23) {
                                        return false;
                                    }
                                    TextInputSession inputSession = textFieldState4.getInputSession();
                                    if (inputSession != null) {
                                        TextFieldState textFieldState5 = textFieldState4;
                                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                        unit = Unit.INSTANCE;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        TextFieldValue textFieldValue3 = textFieldValue2;
                                        textFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5233getStartimpl(textFieldValue3.getSelection()), TextRange.m5228getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5233getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    }
                                    return true;
                                }
                            }, 1, null);
                            final OffsetMapping offsetMapping22 = offsetMapping2;
                            final boolean z24 = z182;
                            final TextFieldValue textFieldValue3 = textFieldValue;
                            final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                            final TextFieldState textFieldState5 = textFieldState2;
                            SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                    return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                }

                                public final Boolean invoke(int i312, int i32, boolean z25) {
                                    if (!z25) {
                                        i312 = OffsetMapping.this.transformedToOriginal(i312);
                                    }
                                    if (!z25) {
                                        i32 = OffsetMapping.this.transformedToOriginal(i32);
                                    }
                                    boolean z26 = false;
                                    if (z24 && (i312 != TextRange.m5233getStartimpl(textFieldValue3.getSelection()) || i32 != TextRange.m5228getEndimpl(textFieldValue3.getSelection()))) {
                                        if (Math.min(i312, i32) >= 0 && Math.max(i312, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                            if (z25 || i312 == i32) {
                                                textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                            } else {
                                                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager22, false, 1, null);
                                            }
                                            textFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i312, i32), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            z26 = true;
                                        } else {
                                            textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                        }
                                    }
                                    return Boolean.valueOf(z26);
                                }
                            }, 1, null);
                            int imeAction = imeOptions42.getImeAction();
                            final TextFieldState textFieldState6 = textFieldState2;
                            final ImeOptions imeOptions5 = imeOptions42;
                            SemanticsPropertiesKt.m5074onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5394boximpl(imeOptions5.getImeAction()));
                                    return true;
                                }
                            }, 2, null);
                            final TextFieldState textFieldState7 = textFieldState2;
                            final FocusRequester focusRequester22 = focusRequester2;
                            final boolean z25 = z192;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22, !z25);
                                    return true;
                                }
                            }, 1, null);
                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                            SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (!TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()) && !z172) {
                                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2;
                                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                        return true;
                                    }
                                }, 1, null);
                                if (z182 && !z192) {
                                    final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2;
                                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.cut$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            }
                            if (!z182 || z192) {
                                return;
                            }
                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2;
                            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.paste$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    });
                    final Modifier cursor2 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState2, textFieldValue, offsetMapping2, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo2)) ? false : true);
                    EffectsKt.DisposableEffect(textFieldSelectionManager2, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final TextFieldSelectionManager textFieldSelectionManager22 = TextFieldSelectionManager.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions42, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            if (TextInputService.this != null && textFieldState2.getHasFocus()) {
                                textFieldState2.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, textFieldValue, textFieldState2.getProcessor(), imeOptions42, textFieldState2.getOnValueChange(), textFieldState2.getOnImeActionPerformed()));
                            }
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                    }, startRestartGroup, (i292 >> 3) & 14);
                    final TextFieldScrollerPosition textFieldScrollerPosition32 = textFieldScrollerPosition2;
                    Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier52.then(textFieldFocusModifier2), textFieldState2, focusManager2), textFieldState2, textFieldSelectionManager2).then(TextFieldKeyInputKt.m919textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, textFieldState2, textFieldSelectionManager2, textFieldValue, textFieldState2.getOnValueChange(), !z6, i302 == 1, offsetMapping2, undoManager2, imeOptions42.getImeAction())), textFieldScrollerPosition32, mutableInteractionSource72, z4).then(pointerHoverIcon$default2).then(semantics2), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                        }
                    });
                    if (z4) {
                    }
                    if (z7) {
                    }
                    final Modifier modifier62 = companion;
                    final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342 = function32;
                    final TextStyle textStyle52 = textStyle2;
                    final int i312 = i20;
                    boolean z202 = z4;
                    final VisualTransformation visualTransformation42 = visualTransformation2;
                    VisualTransformation visualTransformation52 = visualTransformation2;
                    final boolean z212 = z7;
                    final boolean z222 = z6;
                    final Function1<? super TextLayoutResult, Unit> function152 = function13;
                    Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i32) {
                            ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                            if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                                }
                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342;
                                final TextFieldState textFieldState22 = textFieldState2;
                                final TextStyle textStyle6 = textStyle52;
                                final int i33 = i312;
                                final int i34 = i302;
                                final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition32;
                                final TextFieldValue textFieldValue2 = textFieldValue;
                                final VisualTransformation visualTransformation6 = visualTransformation42;
                                final Modifier modifier7 = cursor2;
                                final Modifier modifier8 = drawBehind2;
                                final Modifier modifier9 = onGloballyPositioned3;
                                final Modifier modifier10 = modifier62;
                                final BringIntoViewRequester bringIntoViewRequester22 = bringIntoViewRequester2;
                                final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                                final boolean z23 = z212;
                                final boolean z24 = z222;
                                final Function1<? super TextLayoutResult, Unit> function16 = function152;
                                final OffsetMapping offsetMapping22 = offsetMapping2;
                                final Density density22 = density2;
                                function35.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i35) {
                                        ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                        if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                            }
                                            Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldState.this.m931getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                            TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                            TextFieldValue textFieldValue3 = textFieldValue2;
                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                            final TextFieldState textFieldState3 = TextFieldState.this;
                                            Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition5, textFieldValue3, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final TextLayoutResultProxy invoke() {
                                                    return TextFieldState.this.getLayoutResult();
                                                }
                                            }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester22);
                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                                            final TextFieldState textFieldState4 = TextFieldState.this;
                                            final boolean z25 = z23;
                                            final boolean z26 = z24;
                                            final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                            final TextFieldValue textFieldValue4 = textFieldValue2;
                                            final OffsetMapping offsetMapping3 = offsetMapping22;
                                            final Density density3 = density22;
                                            final int i36 = i34;
                                            SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, -363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i37) {
                                                    ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                                    if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                        }
                                                        final TextFieldState textFieldState5 = textFieldState4;
                                                        final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                        final TextFieldValue textFieldValue5 = textFieldValue4;
                                                        final OffsetMapping offsetMapping4 = offsetMapping3;
                                                        final Density density4 = density3;
                                                        final int i38 = i36;
                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            /* renamed from: measure-3p2s80s */
                                                            public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                                TextFieldState textFieldState6 = TextFieldState.this;
                                                                Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                try {
                                                                    Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                    try {
                                                                        TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                        createNonObservableSnapshot.dispose();
                                                                        Triple<Integer, Integer, TextLayoutResult> m911layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m911layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                        int intValue = m911layout_EkL_Y$foundation_release.component1().intValue();
                                                                        int intValue2 = m911layout_EkL_Y$foundation_release.component2().intValue();
                                                                        TextLayoutResult component3 = m911layout_EkL_Y$foundation_release.component3();
                                                                        if (!Intrinsics.areEqual(value, component3)) {
                                                                            TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                            function18.invoke(component3);
                                                                            CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                        }
                                                                        TextFieldState.this.m932setMinHeightForSingleLineField0680j_4(density4.mo310toDpu2uoSUM(i38 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                        return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                invoke2(placementScope);
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        });
                                                                    } finally {
                                                                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                    }
                                                                } catch (Throwable th) {
                                                                    createNonObservableSnapshot.dispose();
                                                                    throw th;
                                                                }
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i39) {
                                                                TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                            }
                                                        };
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        boolean z27 = false;
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer m2937constructorimpl = Updater.m2937constructorimpl(composer5);
                                                        Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                        if (textFieldState4.getHandleState() != HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                            LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                            if (layoutCoordinates.isAttached() && z25) {
                                                                z27 = true;
                                                            }
                                                        }
                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                        if (textFieldState4.getHandleState() == HandleState.Cursor && !z26 && z25) {
                                                            CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CoreTextFieldRootBox(onGloballyPositioned22, textFieldSelectionManager2, ComposableLambdaKt.composableLambda(composer2, -374338080, true, function22), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    function14 = function13;
                    visualTransformation3 = visualTransformation52;
                    brush3 = brush2;
                    z8 = z5;
                    i22 = i20;
                    keyboardActions3 = keyboardActions2;
                    z9 = z6;
                    i23 = i302;
                    function33 = function32;
                    z10 = z202;
                    modifier4 = modifier52;
                    imeOptions3 = imeOptions42;
                    mutableInteractionSource4 = mutableInteractionSource72;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i25 != 0) {
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
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                visualTransformation2 = none;
                function13 = coreTextFieldKt$CoreTextField$1;
                i21 = i27;
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource5;
                textStyle2 = textStyle4;
                mutableInteractionSource2 = mutableInteractionSource622;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final FocusRequester focusRequester22 = (FocusRequester) rememberedValue;
                ProvidableCompositionLocal<TextInputService> localTextInputService22 = CompositionLocalsKt.getLocalTextInputService();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume112 = startRestartGroup.consume(localTextInputService22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textInputService = (TextInputService) consume112;
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density22 = (Density) consume222;
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localFontFamilyResolver22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FontFamily.Resolver resolver22 = (FontFamily.Resolver) consume322;
                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors22 = TextSelectionColorsKt.getLocalTextSelectionColors();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume422 = startRestartGroup.consume(localTextSelectionColors22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long backgroundColor22 = ((TextSelectionColors) consume422).getBackgroundColor();
                ProvidableCompositionLocal<FocusManager> localFocusManager22 = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume522 = startRestartGroup.consume(localFocusManager22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FocusManager focusManager22 = (FocusManager) consume522;
                Modifier modifier522 = modifier3;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo22 = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume622 = startRestartGroup.consume(localWindowInfo22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final WindowInfo windowInfo22 = (WindowInfo) consume622;
                int i2922 = i26;
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController22 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume722 = startRestartGroup.consume(localSoftwareKeyboardController22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SoftwareKeyboardController softwareKeyboardController22 = (SoftwareKeyboardController) consume722;
                if (i21 == 1) {
                }
                Object[] objArr22 = {orientation};
                Saver<TextFieldScrollerPosition, Object> saver22 = TextFieldScrollerPosition.INSTANCE.getSaver();
                final int i3022 = i21;
                startRestartGroup.startReplaceableGroup(294183095);
                changed = startRestartGroup.changed(orientation);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldScrollerPosition invoke() {
                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m3024rememberSaveable(objArr22, (Saver) saver22, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                TransformedText filterWithValidation22 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                composition = textFieldValue.getComposition();
                textFieldScrollerPosition2 = textFieldScrollerPosition;
                mutableInteractionSource3 = mutableInteractionSource2;
                if (composition != null) {
                }
                rememberedValue3 = filterWithValidation22;
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                final TransformedText transformedText22 = (TransformedText) rememberedValue3;
                AnnotatedString text22 = transformedText22.getText();
                final OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                RecomposeScope currentRecomposeScope22 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(softwareKeyboardController22);
                final ImeOptions imeOptions422 = imeOptions2;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue4 = new TextFieldState(new TextDelegate(text22, textStyle2, 0, 0, z5, 0, density22, resolver22, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope22, softwareKeyboardController22);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                final TextFieldState textFieldState22 = (TextFieldState) rememberedValue4;
                textFieldState22.m933updatefnh65Uc(textFieldValue.getAnnotatedString(), text22, textStyle2, z5, density22, resolver22, function1, keyboardActions2, focusManager22, backgroundColor22);
                textFieldState22.getProcessor().reset(textFieldValue, textFieldState22.getInputSession());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                UndoManager undoManager22 = (UndoManager) rememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager22, textFieldValue, 0L, 2, null);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextFieldSelectionManager textFieldSelectionManager22 = (TextFieldSelectionManager) rememberedValue6;
                textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping22);
                textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager22.setOnValueChange$foundation_release(textFieldState22.getOnValueChange());
                textFieldSelectionManager22.setState$foundation_release(textFieldState22);
                textFieldSelectionManager22.setValue$foundation_release(textFieldValue);
                ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume822 = startRestartGroup.consume(localClipboardManager22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setClipboardManager$foundation_release((ClipboardManager) consume822);
                ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume922 = startRestartGroup.consume(localTextToolbar22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setTextToolbar((TextToolbar) consume922);
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume1022 = startRestartGroup.consume(localHapticFeedback22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager22.setHapticFeedBack((HapticFeedback) consume1022);
                textFieldSelectionManager22.setFocusRequester(focusRequester22);
                textFieldSelectionManager22.setEditable(!z6);
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue8;
                final boolean z1322 = z4;
                final boolean z1422 = z6;
                MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource3;
                Modifier textFieldFocusModifier22 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z4, focusRequester22, mutableInteractionSource722, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                        invoke2(focusState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(FocusState focusState) {
                        TextLayoutResultProxy layoutResult;
                        if (TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                            return;
                        }
                        TextFieldState.this.setHasFocus(focusState.isFocused());
                        if (textInputService != null) {
                            if (!TextFieldState.this.getHasFocus() || !z1322 || z1422) {
                                CoreTextFieldKt.endInputSession(TextFieldState.this);
                            } else {
                                CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldValue, imeOptions422, offsetMapping22);
                            }
                            if (focusState.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester22, textFieldValue, TextFieldState.this, layoutResult, offsetMapping22, null), 3, null);
                            }
                        }
                        if (focusState.isFocused()) {
                            return;
                        }
                        TextFieldSelectionManager.m1056deselect_kEHs6E$foundation_release$default(textFieldSelectionManager22, null, 1, null);
                    }
                });
                startRestartGroup.startReplaceableGroup(-55007276);
                ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
                if (textInputService != null) {
                }
                startRestartGroup.endReplaceableGroup();
                final boolean z1522 = z6;
                Modifier pointerHoverIcon$default22 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(Modifier.INSTANCE, new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z1622) {
                        TextFieldState.this.setInTouchMode(z1622);
                    }
                }), mutableInteractionSource722, z4, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m855invokek4lQ0M(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m855invokek4lQ0M(long j) {
                        CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22, !z1522);
                        if (TextFieldState.this.getHasFocus()) {
                            if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                if (layoutResult != null) {
                                    TextFieldState textFieldState222 = TextFieldState.this;
                                    TextFieldDelegate.INSTANCE.m912setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState222.getProcessor(), offsetMapping22, textFieldState222.getOnValueChange());
                                    if (textFieldState222.getTextDelegate().getText().length() > 0) {
                                        textFieldState222.setHandleState(HandleState.Cursor);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            textFieldSelectionManager22.m1060deselect_kEHs6E$foundation_release(Offset.m3155boximpl(j));
                        }
                    }
                }), textFieldSelectionManager22.getMouseSelectionObserver(), textFieldSelectionManager22.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                final Modifier drawBehind22 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            TextFieldValue textFieldValue2 = textFieldValue;
                            OffsetMapping offsetMapping222 = offsetMapping22;
                            TextFieldState textFieldState222 = TextFieldState.this;
                            TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping222, layoutResult.getValue(), textFieldState222.getSelectionPaint());
                        }
                    }
                });
                final boolean z1622 = z4;
                final Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                        }
                        if (z1622) {
                            if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                if (TextFieldState.this.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo22)) {
                                    textFieldSelectionManager22.showSelectionToolbar$foundation_release();
                                } else {
                                    textFieldSelectionManager22.hideSelectionToolbar$foundation_release();
                                }
                                TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                                TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, false));
                                TextFieldState.this.setShowCursorHandle(TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()));
                            } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                            }
                            CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping22);
                            TextLayoutResultProxy layoutResult2 = TextFieldState.this.getLayoutResult();
                            if (layoutResult2 != null) {
                                TextFieldState textFieldState222 = TextFieldState.this;
                                TextFieldValue textFieldValue2 = textFieldValue;
                                OffsetMapping offsetMapping222 = offsetMapping22;
                                TextInputSession inputSession = textFieldState222.getInputSession();
                                if (inputSession == null || !textFieldState222.getHasFocus()) {
                                    return;
                                }
                                TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping222, layoutResult2);
                            }
                        }
                    }
                });
                final boolean z1722 = visualTransformation2 instanceof PasswordVisualTransformation;
                final boolean z1822 = z4;
                final boolean z1922 = z6;
                Modifier semantics22 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                        SemanticsPropertiesKt.m5078setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                        if (!z1822) {
                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                        }
                        if (z1722) {
                            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                        }
                        final TextFieldState textFieldState222 = textFieldState22;
                        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(List<TextLayoutResult> list) {
                                boolean z2022;
                                if (TextFieldState.this.getLayoutResult() != null) {
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    Intrinsics.checkNotNull(layoutResult);
                                    list.add(layoutResult.getValue());
                                    z2022 = true;
                                } else {
                                    z2022 = false;
                                }
                                return Boolean.valueOf(z2022);
                            }
                        }, 1, null);
                        final boolean z2022 = z1922;
                        final boolean z2122 = z1822;
                        final TextFieldState textFieldState3 = textFieldState22;
                        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(AnnotatedString annotatedString) {
                                Unit unit;
                                if (z2022 || !z2122) {
                                    return false;
                                }
                                TextInputSession inputSession = textFieldState3.getInputSession();
                                if (inputSession != null) {
                                    TextFieldState textFieldState4 = textFieldState3;
                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                    unit = Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                if (unit == null) {
                                    textFieldState3.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                }
                                return true;
                            }
                        }, 1, null);
                        final boolean z2222 = z1922;
                        final boolean z23 = z1822;
                        final TextFieldState textFieldState4 = textFieldState22;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(AnnotatedString annotatedString) {
                                Unit unit;
                                if (z2222 || !z23) {
                                    return false;
                                }
                                TextInputSession inputSession = textFieldState4.getInputSession();
                                if (inputSession != null) {
                                    TextFieldState textFieldState5 = textFieldState4;
                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                    unit = Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                if (unit == null) {
                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                    textFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5233getStartimpl(textFieldValue3.getSelection()), TextRange.m5228getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5233getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                }
                                return true;
                            }
                        }, 1, null);
                        final OffsetMapping offsetMapping222 = offsetMapping22;
                        final boolean z24 = z1822;
                        final TextFieldValue textFieldValue3 = textFieldValue;
                        final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                        final TextFieldState textFieldState5 = textFieldState22;
                        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                            }

                            public final Boolean invoke(int i3122, int i32, boolean z25) {
                                if (!z25) {
                                    i3122 = OffsetMapping.this.transformedToOriginal(i3122);
                                }
                                if (!z25) {
                                    i32 = OffsetMapping.this.transformedToOriginal(i32);
                                }
                                boolean z26 = false;
                                if (z24 && (i3122 != TextRange.m5233getStartimpl(textFieldValue3.getSelection()) || i32 != TextRange.m5228getEndimpl(textFieldValue3.getSelection()))) {
                                    if (Math.min(i3122, i32) >= 0 && Math.max(i3122, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                        if (z25 || i3122 == i32) {
                                            textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                        } else {
                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager222, false, 1, null);
                                        }
                                        textFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i3122, i32), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                        z26 = true;
                                    } else {
                                        textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                    }
                                }
                                return Boolean.valueOf(z26);
                            }
                        }, 1, null);
                        int imeAction = imeOptions422.getImeAction();
                        final TextFieldState textFieldState6 = textFieldState22;
                        final ImeOptions imeOptions5 = imeOptions422;
                        SemanticsPropertiesKt.m5074onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5394boximpl(imeOptions5.getImeAction()));
                                return true;
                            }
                        }, 2, null);
                        final TextFieldState textFieldState7 = textFieldState22;
                        final FocusRequester focusRequester222 = focusRequester22;
                        final boolean z25 = z1922;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester222, !z25);
                                return true;
                            }
                        }, 1, null);
                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (!TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()) && !z1722) {
                            final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager22;
                            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (z1822 && !z1922) {
                                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager22;
                                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.this.cut$foundation_release();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        }
                        if (!z1822 || z1922) {
                            return;
                        }
                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager22;
                        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.paste$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                });
                final Modifier cursor22 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState22, textFieldValue, offsetMapping22, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo22)) ? false : true);
                EffectsKt.DisposableEffect(textFieldSelectionManager22, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final TextFieldSelectionManager textFieldSelectionManager222 = TextFieldSelectionManager.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions422, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        if (TextInputService.this != null && textFieldState22.getHasFocus()) {
                            textFieldState22.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, textFieldValue, textFieldState22.getProcessor(), imeOptions422, textFieldState22.getOnValueChange(), textFieldState22.getOnImeActionPerformed()));
                        }
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, startRestartGroup, (i2922 >> 3) & 14);
                final TextFieldScrollerPosition textFieldScrollerPosition322 = textFieldScrollerPosition2;
                Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier522.then(textFieldFocusModifier22), textFieldState22, focusManager22), textFieldState22, textFieldSelectionManager22).then(TextFieldKeyInputKt.m919textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, textFieldState22, textFieldSelectionManager22, textFieldValue, textFieldState22.getOnValueChange(), !z6, i3022 == 1, offsetMapping22, undoManager22, imeOptions422.getImeAction())), textFieldScrollerPosition322, mutableInteractionSource722, z4).then(pointerHoverIcon$default22).then(semantics22), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                    }
                });
                if (z4) {
                }
                if (z7) {
                }
                final Modifier modifier622 = companion;
                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3422 = function32;
                final TextStyle textStyle522 = textStyle2;
                final int i3122 = i20;
                boolean z2022 = z4;
                final VisualTransformation visualTransformation422 = visualTransformation2;
                VisualTransformation visualTransformation522 = visualTransformation2;
                final boolean z2122 = z7;
                final boolean z2222 = z6;
                final Function1<? super TextLayoutResult, Unit> function1522 = function13;
                Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i32) {
                        ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                        if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                            }
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function3422;
                            final TextFieldState textFieldState222 = textFieldState22;
                            final TextStyle textStyle6 = textStyle522;
                            final int i33 = i3122;
                            final int i34 = i3022;
                            final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition322;
                            final TextFieldValue textFieldValue2 = textFieldValue;
                            final VisualTransformation visualTransformation6 = visualTransformation422;
                            final Modifier modifier7 = cursor22;
                            final Modifier modifier8 = drawBehind22;
                            final Modifier modifier9 = onGloballyPositioned32;
                            final Modifier modifier10 = modifier622;
                            final BringIntoViewRequester bringIntoViewRequester222 = bringIntoViewRequester22;
                            final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                            final boolean z23 = z2122;
                            final boolean z24 = z2222;
                            final Function1<? super TextLayoutResult, Unit> function16 = function1522;
                            final OffsetMapping offsetMapping222 = offsetMapping22;
                            final Density density222 = density22;
                            function35.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i35) {
                                    ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                    if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                        }
                                        Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldState.this.m931getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                        TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                        TextFieldValue textFieldValue3 = textFieldValue2;
                                        VisualTransformation visualTransformation7 = visualTransformation6;
                                        final TextFieldState textFieldState3 = TextFieldState.this;
                                        Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition5, textFieldValue3, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final TextLayoutResultProxy invoke() {
                                                return TextFieldState.this.getLayoutResult();
                                            }
                                        }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester222);
                                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                                        final TextFieldState textFieldState4 = TextFieldState.this;
                                        final boolean z25 = z23;
                                        final boolean z26 = z24;
                                        final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                        final TextFieldValue textFieldValue4 = textFieldValue2;
                                        final OffsetMapping offsetMapping3 = offsetMapping222;
                                        final Density density3 = density222;
                                        final int i36 = i34;
                                        SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, -363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i37) {
                                                ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                                if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                    }
                                                    final TextFieldState textFieldState5 = textFieldState4;
                                                    final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                    final TextFieldValue textFieldValue5 = textFieldValue4;
                                                    final OffsetMapping offsetMapping4 = offsetMapping3;
                                                    final Density density4 = density3;
                                                    final int i38 = i36;
                                                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        /* renamed from: measure-3p2s80s */
                                                        public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                            Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                            TextFieldState textFieldState6 = TextFieldState.this;
                                                            Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                            try {
                                                                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                try {
                                                                    TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                    TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                    createNonObservableSnapshot.dispose();
                                                                    Triple<Integer, Integer, TextLayoutResult> m911layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m911layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                    int intValue = m911layout_EkL_Y$foundation_release.component1().intValue();
                                                                    int intValue2 = m911layout_EkL_Y$foundation_release.component2().intValue();
                                                                    TextLayoutResult component3 = m911layout_EkL_Y$foundation_release.component3();
                                                                    if (!Intrinsics.areEqual(value, component3)) {
                                                                        TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                        function18.invoke(component3);
                                                                        CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                    }
                                                                    TextFieldState.this.m932setMinHeightForSingleLineField0680j_4(density4.mo310toDpu2uoSUM(i38 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                    return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                            invoke2(placementScope);
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    });
                                                                } finally {
                                                                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                }
                                                            } catch (Throwable th) {
                                                                createNonObservableSnapshot.dispose();
                                                                throw th;
                                                            }
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i39) {
                                                            TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                            return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                        }
                                                    };
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    boolean z27 = false;
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer5);
                                                    Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                    if (textFieldState4.getHandleState() != HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                        LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                        Intrinsics.checkNotNull(layoutCoordinates);
                                                        if (layoutCoordinates.isAttached() && z25) {
                                                            z27 = true;
                                                        }
                                                    }
                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                    if (textFieldState4.getHandleState() == HandleState.Cursor && !z26 && z25) {
                                                        CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                composer2 = startRestartGroup;
                CoreTextFieldRootBox(onGloballyPositioned222, textFieldSelectionManager22, ComposableLambdaKt.composableLambda(composer2, -374338080, true, function222), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                function14 = function13;
                visualTransformation3 = visualTransformation522;
                brush3 = brush2;
                z8 = z5;
                i22 = i20;
                keyboardActions3 = keyboardActions2;
                z9 = z6;
                i23 = i3022;
                function33 = function32;
                z10 = z2022;
                modifier4 = modifier522;
                imeOptions3 = imeOptions422;
                mutableInteractionSource4 = mutableInteractionSource722;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 112) == 0) {
            }
            int i262 = i15;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i25 != 0) {
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
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            visualTransformation2 = none;
            function13 = coreTextFieldKt$CoreTextField$1;
            i21 = i27;
            MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource5;
            textStyle2 = textStyle4;
            mutableInteractionSource2 = mutableInteractionSource6222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final FocusRequester focusRequester222 = (FocusRequester) rememberedValue;
            ProvidableCompositionLocal<TextInputService> localTextInputService222 = CompositionLocalsKt.getLocalTextInputService();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume1122 = startRestartGroup.consume(localTextInputService222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textInputService = (TextInputService) consume1122;
            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localDensity222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density222 = (Density) consume2222;
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver222 = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localFontFamilyResolver222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FontFamily.Resolver resolver222 = (FontFamily.Resolver) consume3222;
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors222 = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4222 = startRestartGroup.consume(localTextSelectionColors222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long backgroundColor222 = ((TextSelectionColors) consume4222).getBackgroundColor();
            ProvidableCompositionLocal<FocusManager> localFocusManager222 = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume5222 = startRestartGroup.consume(localFocusManager222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager222 = (FocusManager) consume5222;
            Modifier modifier5222 = modifier3;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo222 = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume6222 = startRestartGroup.consume(localWindowInfo222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final WindowInfo windowInfo222 = (WindowInfo) consume6222;
            int i29222 = i262;
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController222 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume7222 = startRestartGroup.consume(localSoftwareKeyboardController222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SoftwareKeyboardController softwareKeyboardController222 = (SoftwareKeyboardController) consume7222;
            if (i21 == 1) {
            }
            Object[] objArr222 = {orientation};
            Saver<TextFieldScrollerPosition, Object> saver222 = TextFieldScrollerPosition.INSTANCE.getSaver();
            final int i30222 = i21;
            startRestartGroup.startReplaceableGroup(294183095);
            changed = startRestartGroup.changed(orientation);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TextFieldScrollerPosition invoke() {
                    return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m3024rememberSaveable(objArr222, (Saver) saver222, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            TransformedText filterWithValidation222 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
            composition = textFieldValue.getComposition();
            textFieldScrollerPosition2 = textFieldScrollerPosition;
            mutableInteractionSource3 = mutableInteractionSource2;
            if (composition != null) {
            }
            rememberedValue3 = filterWithValidation222;
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final TransformedText transformedText222 = (TransformedText) rememberedValue3;
            AnnotatedString text222 = transformedText222.getText();
            final OffsetMapping offsetMapping222 = transformedText222.getOffsetMapping();
            RecomposeScope currentRecomposeScope222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(softwareKeyboardController222);
            final ImeOptions imeOptions4222 = imeOptions2;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = new TextFieldState(new TextDelegate(text222, textStyle2, 0, 0, z5, 0, density222, resolver222, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope222, softwareKeyboardController222);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            final TextFieldState textFieldState222 = (TextFieldState) rememberedValue4;
            textFieldState222.m933updatefnh65Uc(textFieldValue.getAnnotatedString(), text222, textStyle2, z5, density222, resolver222, function1, keyboardActions2, focusManager222, backgroundColor222);
            textFieldState222.getProcessor().reset(textFieldValue, textFieldState222.getInputSession());
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            UndoManager undoManager222 = (UndoManager) rememberedValue5;
            UndoManager.snapshotIfNeeded$default(undoManager222, textFieldValue, 0L, 2, null);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextFieldSelectionManager textFieldSelectionManager222 = (TextFieldSelectionManager) rememberedValue6;
            textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping222);
            textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager222.setOnValueChange$foundation_release(textFieldState222.getOnValueChange());
            textFieldSelectionManager222.setState$foundation_release(textFieldState222);
            textFieldSelectionManager222.setValue$foundation_release(textFieldValue);
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager222 = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume8222 = startRestartGroup.consume(localClipboardManager222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setClipboardManager$foundation_release((ClipboardManager) consume8222);
            ProvidableCompositionLocal<TextToolbar> localTextToolbar222 = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume9222 = startRestartGroup.consume(localTextToolbar222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setTextToolbar((TextToolbar) consume9222);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222 = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume10222 = startRestartGroup.consume(localHapticFeedback222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager222.setHapticFeedBack((HapticFeedback) consume10222);
            textFieldSelectionManager222.setFocusRequester(focusRequester222);
            textFieldSelectionManager222.setEditable(!z6);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) rememberedValue8;
            final boolean z13222 = z4;
            final boolean z14222 = z6;
            MutableInteractionSource mutableInteractionSource7222 = mutableInteractionSource3;
            Modifier textFieldFocusModifier222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z4, focusRequester222, mutableInteractionSource7222, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                    invoke2(focusState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FocusState focusState) {
                    TextLayoutResultProxy layoutResult;
                    if (TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                        return;
                    }
                    TextFieldState.this.setHasFocus(focusState.isFocused());
                    if (textInputService != null) {
                        if (!TextFieldState.this.getHasFocus() || !z13222 || z14222) {
                            CoreTextFieldKt.endInputSession(TextFieldState.this);
                        } else {
                            CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldValue, imeOptions4222, offsetMapping222);
                        }
                        if (focusState.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester222, textFieldValue, TextFieldState.this, layoutResult, offsetMapping222, null), 3, null);
                        }
                    }
                    if (focusState.isFocused()) {
                        return;
                    }
                    TextFieldSelectionManager.m1056deselect_kEHs6E$foundation_release$default(textFieldSelectionManager222, null, 1, null);
                }
            });
            startRestartGroup.startReplaceableGroup(-55007276);
            ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
            if (textInputService != null) {
            }
            startRestartGroup.endReplaceableGroup();
            final boolean z15222 = z6;
            Modifier pointerHoverIcon$default222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(Modifier.INSTANCE, new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z16222) {
                    TextFieldState.this.setInTouchMode(z16222);
                }
            }), mutableInteractionSource7222, z4, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m855invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m855invokek4lQ0M(long j) {
                    CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester222, !z15222);
                    if (TextFieldState.this.getHasFocus()) {
                        if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                TextFieldState textFieldState2222 = TextFieldState.this;
                                TextFieldDelegate.INSTANCE.m912setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2222.getProcessor(), offsetMapping222, textFieldState2222.getOnValueChange());
                                if (textFieldState2222.getTextDelegate().getText().length() > 0) {
                                    textFieldState2222.setHandleState(HandleState.Cursor);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        textFieldSelectionManager222.m1060deselect_kEHs6E$foundation_release(Offset.m3155boximpl(j));
                    }
                }
            }), textFieldSelectionManager222.getMouseSelectionObserver(), textFieldSelectionManager222.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            final Modifier drawBehind222 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        TextFieldValue textFieldValue2 = textFieldValue;
                        OffsetMapping offsetMapping2222 = offsetMapping222;
                        TextFieldState textFieldState2222 = TextFieldState.this;
                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping2222, layoutResult.getValue(), textFieldState2222.getSelectionPaint());
                    }
                }
            });
            final boolean z16222 = z4;
            final Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                    TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                    }
                    if (z16222) {
                        if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                            if (TextFieldState.this.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo222)) {
                                textFieldSelectionManager222.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager222.hideSelectionToolbar$foundation_release();
                            }
                            TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                            TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, false));
                            TextFieldState.this.setShowCursorHandle(TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()));
                        } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                            TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                        }
                        CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping222);
                        TextLayoutResultProxy layoutResult2 = TextFieldState.this.getLayoutResult();
                        if (layoutResult2 != null) {
                            TextFieldState textFieldState2222 = TextFieldState.this;
                            TextFieldValue textFieldValue2 = textFieldValue;
                            OffsetMapping offsetMapping2222 = offsetMapping222;
                            TextInputSession inputSession = textFieldState2222.getInputSession();
                            if (inputSession == null || !textFieldState2222.getHasFocus()) {
                                return;
                            }
                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2222, layoutResult2);
                        }
                    }
                }
            });
            final boolean z17222 = visualTransformation2 instanceof PasswordVisualTransformation;
            final boolean z18222 = z4;
            final boolean z19222 = z6;
            Modifier semantics222 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                    SemanticsPropertiesKt.m5078setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                    if (!z18222) {
                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                    }
                    if (z17222) {
                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                    }
                    final TextFieldState textFieldState2222 = textFieldState222;
                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(List<TextLayoutResult> list) {
                            boolean z20222;
                            if (TextFieldState.this.getLayoutResult() != null) {
                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                Intrinsics.checkNotNull(layoutResult);
                                list.add(layoutResult.getValue());
                                z20222 = true;
                            } else {
                                z20222 = false;
                            }
                            return Boolean.valueOf(z20222);
                        }
                    }, 1, null);
                    final boolean z20222 = z19222;
                    final boolean z21222 = z18222;
                    final TextFieldState textFieldState3 = textFieldState222;
                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AnnotatedString annotatedString) {
                            Unit unit;
                            if (z20222 || !z21222) {
                                return false;
                            }
                            TextInputSession inputSession = textFieldState3.getInputSession();
                            if (inputSession != null) {
                                TextFieldState textFieldState4 = textFieldState3;
                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                textFieldState3.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            }
                            return true;
                        }
                    }, 1, null);
                    final boolean z22222 = z19222;
                    final boolean z23 = z18222;
                    final TextFieldState textFieldState4 = textFieldState222;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AnnotatedString annotatedString) {
                            Unit unit;
                            if (z22222 || !z23) {
                                return false;
                            }
                            TextInputSession inputSession = textFieldState4.getInputSession();
                            if (inputSession != null) {
                                TextFieldState textFieldState5 = textFieldState4;
                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                TextFieldValue textFieldValue3 = textFieldValue2;
                                textFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5233getStartimpl(textFieldValue3.getSelection()), TextRange.m5228getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5233getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            }
                            return true;
                        }
                    }, 1, null);
                    final OffsetMapping offsetMapping2222 = offsetMapping222;
                    final boolean z24 = z18222;
                    final TextFieldValue textFieldValue3 = textFieldValue;
                    final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                    final TextFieldState textFieldState5 = textFieldState222;
                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                        }

                        public final Boolean invoke(int i31222, int i32, boolean z25) {
                            if (!z25) {
                                i31222 = OffsetMapping.this.transformedToOriginal(i31222);
                            }
                            if (!z25) {
                                i32 = OffsetMapping.this.transformedToOriginal(i32);
                            }
                            boolean z26 = false;
                            if (z24 && (i31222 != TextRange.m5233getStartimpl(textFieldValue3.getSelection()) || i32 != TextRange.m5228getEndimpl(textFieldValue3.getSelection()))) {
                                if (Math.min(i31222, i32) >= 0 && Math.max(i31222, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                    if (z25 || i31222 == i32) {
                                        textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                    } else {
                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2222, false, 1, null);
                                    }
                                    textFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i31222, i32), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    z26 = true;
                                } else {
                                    textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                }
                            }
                            return Boolean.valueOf(z26);
                        }
                    }, 1, null);
                    int imeAction = imeOptions4222.getImeAction();
                    final TextFieldState textFieldState6 = textFieldState222;
                    final ImeOptions imeOptions5 = imeOptions4222;
                    SemanticsPropertiesKt.m5074onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5394boximpl(imeOptions5.getImeAction()));
                            return true;
                        }
                    }, 2, null);
                    final TextFieldState textFieldState7 = textFieldState222;
                    final FocusRequester focusRequester2222 = focusRequester222;
                    final boolean z25 = z19222;
                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2222, !z25);
                            return true;
                        }
                    }, 1, null);
                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (!TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()) && !z17222) {
                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager222;
                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (z18222 && !z19222) {
                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager222;
                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.cut$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    }
                    if (!z18222 || z19222) {
                        return;
                    }
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager222;
                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.this.paste$foundation_release();
                            return true;
                        }
                    }, 1, null);
                }
            });
            final Modifier cursor222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState222, textFieldValue, offsetMapping222, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo222)) ? false : true);
            EffectsKt.DisposableEffect(textFieldSelectionManager222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final TextFieldSelectionManager textFieldSelectionManager2222 = TextFieldSelectionManager.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            }, startRestartGroup, 8);
            EffectsKt.DisposableEffect(imeOptions4222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    if (TextInputService.this != null && textFieldState222.getHasFocus()) {
                        textFieldState222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, textFieldValue, textFieldState222.getProcessor(), imeOptions4222, textFieldState222.getOnValueChange(), textFieldState222.getOnImeActionPerformed()));
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, startRestartGroup, (i29222 >> 3) & 14);
            final TextFieldScrollerPosition textFieldScrollerPosition3222 = textFieldScrollerPosition2;
            Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier5222.then(textFieldFocusModifier222), textFieldState222, focusManager222), textFieldState222, textFieldSelectionManager222).then(TextFieldKeyInputKt.m919textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, textFieldState222, textFieldSelectionManager222, textFieldValue, textFieldState222.getOnValueChange(), !z6, i30222 == 1, offsetMapping222, undoManager222, imeOptions4222.getImeAction())), textFieldScrollerPosition3222, mutableInteractionSource7222, z4).then(pointerHoverIcon$default222).then(semantics222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                }
            });
            if (z4) {
            }
            if (z7) {
            }
            final Modifier modifier6222 = companion;
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34222 = function32;
            final TextStyle textStyle5222 = textStyle2;
            final int i31222 = i20;
            boolean z20222 = z4;
            final VisualTransformation visualTransformation4222 = visualTransformation2;
            VisualTransformation visualTransformation5222 = visualTransformation2;
            final boolean z21222 = z7;
            final boolean z22222 = z6;
            final Function1<? super TextLayoutResult, Unit> function15222 = function13;
            Function2<Composer, Integer, Unit> function2222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i32) {
                    ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                    if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                        }
                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34222;
                        final TextFieldState textFieldState2222 = textFieldState222;
                        final TextStyle textStyle6 = textStyle5222;
                        final int i33 = i31222;
                        final int i34 = i30222;
                        final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition3222;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        final VisualTransformation visualTransformation6 = visualTransformation4222;
                        final Modifier modifier7 = cursor222;
                        final Modifier modifier8 = drawBehind222;
                        final Modifier modifier9 = onGloballyPositioned322;
                        final Modifier modifier10 = modifier6222;
                        final BringIntoViewRequester bringIntoViewRequester2222 = bringIntoViewRequester222;
                        final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                        final boolean z23 = z21222;
                        final boolean z24 = z22222;
                        final Function1<? super TextLayoutResult, Unit> function16 = function15222;
                        final OffsetMapping offsetMapping2222 = offsetMapping222;
                        final Density density2222 = density222;
                        function35.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i35) {
                                ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                                if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                    }
                                    Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldState.this.m931getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                    TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                    final TextFieldState textFieldState3 = TextFieldState.this;
                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition5, textFieldValue3, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final TextLayoutResultProxy invoke() {
                                            return TextFieldState.this.getLayoutResult();
                                        }
                                    }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2222);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                                    final TextFieldState textFieldState4 = TextFieldState.this;
                                    final boolean z25 = z23;
                                    final boolean z26 = z24;
                                    final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                    final OffsetMapping offsetMapping3 = offsetMapping2222;
                                    final Density density3 = density2222;
                                    final int i36 = i34;
                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, -363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i37) {
                                            ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                            if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                }
                                                final TextFieldState textFieldState5 = textFieldState4;
                                                final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                final OffsetMapping offsetMapping4 = offsetMapping3;
                                                final Density density4 = density3;
                                                final int i38 = i36;
                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    /* renamed from: measure-3p2s80s */
                                                    public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                        Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                        TextFieldState textFieldState6 = TextFieldState.this;
                                                        Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                        try {
                                                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                            try {
                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                createNonObservableSnapshot.dispose();
                                                                Triple<Integer, Integer, TextLayoutResult> m911layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m911layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                int intValue = m911layout_EkL_Y$foundation_release.component1().intValue();
                                                                int intValue2 = m911layout_EkL_Y$foundation_release.component2().intValue();
                                                                TextLayoutResult component3 = m911layout_EkL_Y$foundation_release.component3();
                                                                if (!Intrinsics.areEqual(value, component3)) {
                                                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                    function18.invoke(component3);
                                                                    CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue5, offsetMapping4);
                                                                }
                                                                TextFieldState.this.m932setMinHeightForSingleLineField0680j_4(density4.mo310toDpu2uoSUM(i38 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                        invoke2(placementScope);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                });
                                                            } finally {
                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                            }
                                                        } catch (Throwable th) {
                                                            createNonObservableSnapshot.dispose();
                                                            throw th;
                                                        }
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i39) {
                                                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                    }
                                                };
                                                composer5.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                boolean z27 = false;
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer5);
                                                Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                if (textFieldState4.getHandleState() != HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                    if (layoutCoordinates.isAttached() && z25) {
                                                        z27 = true;
                                                    }
                                                }
                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z26 && z25) {
                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CoreTextFieldRootBox(onGloballyPositioned2222, textFieldSelectionManager222, ComposableLambdaKt.composableLambda(composer2, -374338080, true, function2222), composer2, 448);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            function14 = function13;
            visualTransformation3 = visualTransformation5222;
            brush3 = brush2;
            z8 = z5;
            i22 = i20;
            keyboardActions3 = keyboardActions2;
            z9 = z6;
            i23 = i30222;
            function33 = function32;
            z10 = z20222;
            modifier4 = modifier5222;
            imeOptions3 = imeOptions4222;
            mutableInteractionSource4 = mutableInteractionSource7222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 112) == 0) {
        }
        int i2622 = i15;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i25 != 0) {
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
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        visualTransformation2 = none;
        function13 = coreTextFieldKt$CoreTextField$1;
        i21 = i27;
        MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource5;
        textStyle2 = textStyle4;
        mutableInteractionSource2 = mutableInteractionSource62222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final FocusRequester focusRequester2222 = (FocusRequester) rememberedValue;
        ProvidableCompositionLocal<TextInputService> localTextInputService2222 = CompositionLocalsKt.getLocalTextInputService();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume11222 = startRestartGroup.consume(localTextInputService2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textInputService = (TextInputService) consume11222;
        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localDensity2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density2222 = (Density) consume22222;
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2222 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localFontFamilyResolver2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FontFamily.Resolver resolver2222 = (FontFamily.Resolver) consume32222;
        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2222 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume42222 = startRestartGroup.consume(localTextSelectionColors2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long backgroundColor2222 = ((TextSelectionColors) consume42222).getBackgroundColor();
        ProvidableCompositionLocal<FocusManager> localFocusManager2222 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume52222 = startRestartGroup.consume(localFocusManager2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FocusManager focusManager2222 = (FocusManager) consume52222;
        Modifier modifier52222 = modifier3;
        ProvidableCompositionLocal<WindowInfo> localWindowInfo2222 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume62222 = startRestartGroup.consume(localWindowInfo2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final WindowInfo windowInfo2222 = (WindowInfo) consume62222;
        int i292222 = i2622;
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2222 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume72222 = startRestartGroup.consume(localSoftwareKeyboardController2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SoftwareKeyboardController softwareKeyboardController2222 = (SoftwareKeyboardController) consume72222;
        if (i21 == 1) {
        }
        Object[] objArr2222 = {orientation};
        Saver<TextFieldScrollerPosition, Object> saver2222 = TextFieldScrollerPosition.INSTANCE.getSaver();
        final int i302222 = i21;
        startRestartGroup.startReplaceableGroup(294183095);
        changed = startRestartGroup.changed(orientation);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldScrollerPosition invoke() {
                return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m3024rememberSaveable(objArr2222, (Saver) saver2222, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(textFieldValue) | startRestartGroup.changed(visualTransformation2);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        TransformedText filterWithValidation2222 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
        composition = textFieldValue.getComposition();
        textFieldScrollerPosition2 = textFieldScrollerPosition;
        mutableInteractionSource3 = mutableInteractionSource2;
        if (composition != null) {
        }
        rememberedValue3 = filterWithValidation2222;
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        final TransformedText transformedText2222 = (TransformedText) rememberedValue3;
        AnnotatedString text2222 = transformedText2222.getText();
        final OffsetMapping offsetMapping2222 = transformedText2222.getOffsetMapping();
        RecomposeScope currentRecomposeScope2222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(softwareKeyboardController2222);
        final ImeOptions imeOptions42222 = imeOptions2;
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue4 = new TextFieldState(new TextDelegate(text2222, textStyle2, 0, 0, z5, 0, density2222, resolver2222, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope2222, softwareKeyboardController2222);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        final TextFieldState textFieldState2222 = (TextFieldState) rememberedValue4;
        textFieldState2222.m933updatefnh65Uc(textFieldValue.getAnnotatedString(), text2222, textStyle2, z5, density2222, resolver2222, function1, keyboardActions2, focusManager2222, backgroundColor2222);
        textFieldState2222.getProcessor().reset(textFieldValue, textFieldState2222.getInputSession());
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        UndoManager undoManager2222 = (UndoManager) rememberedValue5;
        UndoManager.snapshotIfNeeded$default(undoManager2222, textFieldValue, 0L, 2, null);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextFieldSelectionManager textFieldSelectionManager2222 = (TextFieldSelectionManager) rememberedValue6;
        textFieldSelectionManager2222.setOffsetMapping$foundation_release(offsetMapping2222);
        textFieldSelectionManager2222.setVisualTransformation$foundation_release(visualTransformation2);
        textFieldSelectionManager2222.setOnValueChange$foundation_release(textFieldState2222.getOnValueChange());
        textFieldSelectionManager2222.setState$foundation_release(textFieldState2222);
        textFieldSelectionManager2222.setValue$foundation_release(textFieldValue);
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager2222 = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume82222 = startRestartGroup.consume(localClipboardManager2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setClipboardManager$foundation_release((ClipboardManager) consume82222);
        ProvidableCompositionLocal<TextToolbar> localTextToolbar2222 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume92222 = startRestartGroup.consume(localTextToolbar2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setTextToolbar((TextToolbar) consume92222);
        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2222 = CompositionLocalsKt.getLocalHapticFeedback();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume102222 = startRestartGroup.consume(localHapticFeedback2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager2222.setHapticFeedBack((HapticFeedback) consume102222);
        textFieldSelectionManager2222.setFocusRequester(focusRequester2222);
        textFieldSelectionManager2222.setEditable(!z6);
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final BringIntoViewRequester bringIntoViewRequester2222 = (BringIntoViewRequester) rememberedValue8;
        final boolean z132222 = z4;
        final boolean z142222 = z6;
        MutableInteractionSource mutableInteractionSource72222 = mutableInteractionSource3;
        Modifier textFieldFocusModifier2222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.INSTANCE, z4, focusRequester2222, mutableInteractionSource72222, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusState focusState) {
                TextLayoutResultProxy layoutResult;
                if (TextFieldState.this.getHasFocus() == focusState.isFocused()) {
                    return;
                }
                TextFieldState.this.setHasFocus(focusState.isFocused());
                if (textInputService != null) {
                    if (!TextFieldState.this.getHasFocus() || !z132222 || z142222) {
                        CoreTextFieldKt.endInputSession(TextFieldState.this);
                    } else {
                        CoreTextFieldKt.startInputSession(textInputService, TextFieldState.this, textFieldValue, imeOptions42222, offsetMapping2222);
                    }
                    if (focusState.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2222, textFieldValue, TextFieldState.this, layoutResult, offsetMapping2222, null), 3, null);
                    }
                }
                if (focusState.isFocused()) {
                    return;
                }
                TextFieldSelectionManager.m1056deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2222, null, 1, null);
            }
        });
        startRestartGroup.startReplaceableGroup(-55007276);
        ComposerKt.sourceInformation(startRestartGroup, "344@17012L42,345@17063L1006");
        if (textInputService != null) {
        }
        startRestartGroup.endReplaceableGroup();
        final boolean z152222 = z6;
        Modifier pointerHoverIcon$default2222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(Modifier.INSTANCE, new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z162222) {
                TextFieldState.this.setInTouchMode(z162222);
            }
        }), mutableInteractionSource72222, z4, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m855invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m855invokek4lQ0M(long j) {
                CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2222, !z152222);
                if (TextFieldState.this.getHasFocus()) {
                    if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            TextFieldState textFieldState22222 = TextFieldState.this;
                            TextFieldDelegate.INSTANCE.m912setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState22222.getProcessor(), offsetMapping2222, textFieldState22222.getOnValueChange());
                            if (textFieldState22222.getTextDelegate().getText().length() > 0) {
                                textFieldState22222.setHandleState(HandleState.Cursor);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    textFieldSelectionManager2222.m1060deselect_kEHs6E$foundation_release(Offset.m3155boximpl(j));
                }
            }
        }), textFieldSelectionManager2222.getMouseSelectionObserver(), textFieldSelectionManager2222.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        final Modifier drawBehind2222 = DrawModifierKt.drawBehind(Modifier.INSTANCE, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldValue textFieldValue2 = textFieldValue;
                    OffsetMapping offsetMapping22222 = offsetMapping2222;
                    TextFieldState textFieldState22222 = TextFieldState.this;
                    TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping22222, layoutResult.getValue(), textFieldState22222.getSelectionPaint());
                }
            }
        });
        final boolean z162222 = z4;
        final Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                TextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                }
                if (z162222) {
                    if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                        if (TextFieldState.this.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo2222)) {
                            textFieldSelectionManager2222.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager2222.hideSelectionToolbar$foundation_release();
                        }
                        TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                        TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, false));
                        TextFieldState.this.setShowCursorHandle(TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()));
                    } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                        TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                    }
                    CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping2222);
                    TextLayoutResultProxy layoutResult2 = TextFieldState.this.getLayoutResult();
                    if (layoutResult2 != null) {
                        TextFieldState textFieldState22222 = TextFieldState.this;
                        TextFieldValue textFieldValue2 = textFieldValue;
                        OffsetMapping offsetMapping22222 = offsetMapping2222;
                        TextInputSession inputSession = textFieldState22222.getInputSession();
                        if (inputSession == null || !textFieldState22222.getHasFocus()) {
                            return;
                        }
                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping22222, layoutResult2);
                    }
                }
            }
        });
        final boolean z172222 = visualTransformation2 instanceof PasswordVisualTransformation;
        final boolean z182222 = z4;
        final boolean z192222 = z6;
        Modifier semantics2222 = SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                SemanticsPropertiesKt.m5078setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                if (!z182222) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                if (z172222) {
                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                }
                final TextFieldState textFieldState22222 = textFieldState2222;
                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(List<TextLayoutResult> list) {
                        boolean z202222;
                        if (TextFieldState.this.getLayoutResult() != null) {
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            Intrinsics.checkNotNull(layoutResult);
                            list.add(layoutResult.getValue());
                            z202222 = true;
                        } else {
                            z202222 = false;
                        }
                        return Boolean.valueOf(z202222);
                    }
                }, 1, null);
                final boolean z202222 = z192222;
                final boolean z212222 = z182222;
                final TextFieldState textFieldState3 = textFieldState2222;
                SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(AnnotatedString annotatedString) {
                        Unit unit;
                        if (z202222 || !z212222) {
                            return false;
                        }
                        TextInputSession inputSession = textFieldState3.getInputSession();
                        if (inputSession != null) {
                            TextFieldState textFieldState4 = textFieldState3;
                            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            textFieldState3.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        }
                        return true;
                    }
                }, 1, null);
                final boolean z222222 = z192222;
                final boolean z23 = z182222;
                final TextFieldState textFieldState4 = textFieldState2222;
                final TextFieldValue textFieldValue2 = textFieldValue;
                SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(AnnotatedString annotatedString) {
                        Unit unit;
                        if (z222222 || !z23) {
                            return false;
                        }
                        TextInputSession inputSession = textFieldState4.getInputSession();
                        if (inputSession != null) {
                            TextFieldState textFieldState5 = textFieldState4;
                            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            TextFieldValue textFieldValue3 = textFieldValue2;
                            textFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5233getStartimpl(textFieldValue3.getSelection()), TextRange.m5228getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5233getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        }
                        return true;
                    }
                }, 1, null);
                final OffsetMapping offsetMapping22222 = offsetMapping2222;
                final boolean z24 = z182222;
                final TextFieldValue textFieldValue3 = textFieldValue;
                final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                final TextFieldState textFieldState5 = textFieldState2222;
                SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                    }

                    public final Boolean invoke(int i312222, int i32, boolean z25) {
                        if (!z25) {
                            i312222 = OffsetMapping.this.transformedToOriginal(i312222);
                        }
                        if (!z25) {
                            i32 = OffsetMapping.this.transformedToOriginal(i32);
                        }
                        boolean z26 = false;
                        if (z24 && (i312222 != TextRange.m5233getStartimpl(textFieldValue3.getSelection()) || i32 != TextRange.m5228getEndimpl(textFieldValue3.getSelection()))) {
                            if (Math.min(i312222, i32) >= 0 && Math.max(i312222, i32) <= textFieldValue3.getAnnotatedString().length()) {
                                if (z25 || i312222 == i32) {
                                    textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                                } else {
                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager22222, false, 1, null);
                                }
                                textFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i312222, i32), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                z26 = true;
                            } else {
                                textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                            }
                        }
                        return Boolean.valueOf(z26);
                    }
                }, 1, null);
                int imeAction = imeOptions42222.getImeAction();
                final TextFieldState textFieldState6 = textFieldState2222;
                final ImeOptions imeOptions5 = imeOptions42222;
                SemanticsPropertiesKt.m5074onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5394boximpl(imeOptions5.getImeAction()));
                        return true;
                    }
                }, 2, null);
                final TextFieldState textFieldState7 = textFieldState2222;
                final FocusRequester focusRequester22222 = focusRequester2222;
                final boolean z25 = z192222;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22222, !z25);
                        return true;
                    }
                }, 1, null);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                        return true;
                    }
                }, 1, null);
                if (!TextRange.m5227getCollapsedimpl(textFieldValue.getSelection()) && !z172222) {
                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2222;
                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (z182222 && !z192222) {
                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2222;
                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.cut$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                }
                if (!z182222 || z192222) {
                    return;
                }
                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2222;
                SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldSelectionManager.this.paste$foundation_release();
                        return true;
                    }
                }, 1, null);
            }
        });
        final Modifier cursor2222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, textFieldState2222, textFieldValue, offsetMapping2222, brush2, (z4 || z6 || !isWindowFocusedBehindFlag(windowInfo2222)) ? false : true);
        EffectsKt.DisposableEffect(textFieldSelectionManager2222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                final TextFieldSelectionManager textFieldSelectionManager22222 = TextFieldSelectionManager.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
            }
        }, startRestartGroup, 8);
        EffectsKt.DisposableEffect(imeOptions42222, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                if (TextInputService.this != null && textFieldState2222.getHasFocus()) {
                    textFieldState2222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, textFieldValue, textFieldState2222.getProcessor(), imeOptions42222, textFieldState2222.getOnValueChange(), textFieldState2222.getOnImeActionPerformed()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, startRestartGroup, (i292222 >> 3) & 14);
        final TextFieldScrollerPosition textFieldScrollerPosition32222 = textFieldScrollerPosition2;
        Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier52222.then(textFieldFocusModifier2222), textFieldState2222, focusManager2222), textFieldState2222, textFieldSelectionManager2222).then(TextFieldKeyInputKt.m919textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, textFieldState2222, textFieldSelectionManager2222, textFieldValue, textFieldState2222.getOnValueChange(), !z6, i302222 == 1, offsetMapping2222, undoManager2222, imeOptions42222.getImeAction())), textFieldScrollerPosition32222, mutableInteractionSource72222, z4).then(pointerHoverIcon$default2222).then(semantics2222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
            }
        });
        if (z4) {
        }
        if (z7) {
        }
        final Modifier modifier62222 = companion;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342222 = function32;
        final TextStyle textStyle52222 = textStyle2;
        final int i312222 = i20;
        boolean z202222 = z4;
        final VisualTransformation visualTransformation42222 = visualTransformation2;
        VisualTransformation visualTransformation52222 = visualTransformation2;
        final boolean z212222 = z7;
        final boolean z222222 = z6;
        final Function1<? super TextLayoutResult, Unit> function152222 = function13;
        Function2<Composer, Integer, Unit> function22222 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i32) {
                ComposerKt.sourceInformation(composer3, "C642@29093L4568:CoreTextField.kt#423gt5");
                if ((i32 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-374338080, i32, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                    }
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342222;
                    final TextFieldState textFieldState22222 = textFieldState2222;
                    final TextStyle textStyle6 = textStyle52222;
                    final int i33 = i312222;
                    final int i34 = i302222;
                    final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition32222;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final VisualTransformation visualTransformation6 = visualTransformation42222;
                    final Modifier modifier7 = cursor2222;
                    final Modifier modifier8 = drawBehind2222;
                    final Modifier modifier9 = onGloballyPositioned3222;
                    final Modifier modifier10 = modifier62222;
                    final BringIntoViewRequester bringIntoViewRequester22222 = bringIntoViewRequester2222;
                    final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                    final boolean z23 = z212222;
                    final boolean z24 = z222222;
                    final Function1<? super TextLayoutResult, Unit> function16 = function152222;
                    final OffsetMapping offsetMapping22222 = offsetMapping2222;
                    final Density density22222 = density2222;
                    function35.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i35) {
                            ComposerKt.sourceInformation(composer4, "C667@30284L3367:CoreTextField.kt#423gt5");
                            if ((i35 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2032502107, i35, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                }
                                Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldState.this.m931getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i33, i34);
                                TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                TextFieldValue textFieldValue3 = textFieldValue2;
                                VisualTransformation visualTransformation7 = visualTransformation6;
                                final TextFieldState textFieldState3 = TextFieldState.this;
                                Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition5, textFieldValue3, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final TextLayoutResultProxy invoke() {
                                        return TextFieldState.this.getLayoutResult();
                                    }
                                }).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester22222);
                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22222;
                                final TextFieldState textFieldState4 = TextFieldState.this;
                                final boolean z25 = z23;
                                final boolean z26 = z24;
                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                final TextFieldValue textFieldValue4 = textFieldValue2;
                                final OffsetMapping offsetMapping3 = offsetMapping22222;
                                final Density density3 = density22222;
                                final int i36 = i34;
                                SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, -363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i37) {
                                        ComposerKt.sourceInformation(composer5, "C668@30338L2699,721@33055L322,734@33579L40:CoreTextField.kt#423gt5");
                                        if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-363167407, i37, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                            }
                                            final TextFieldState textFieldState5 = textFieldState4;
                                            final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                            final TextFieldValue textFieldValue5 = textFieldValue4;
                                            final OffsetMapping offsetMapping4 = offsetMapping3;
                                            final Density density4 = density3;
                                            final int i38 = i36;
                                            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                /* renamed from: measure-3p2s80s */
                                                public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                    Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                    TextFieldState textFieldState6 = TextFieldState.this;
                                                    Snapshot createNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                    try {
                                                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                        try {
                                                            TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                            createNonObservableSnapshot.dispose();
                                                            Triple<Integer, Integer, TextLayoutResult> m911layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m911layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                            int intValue = m911layout_EkL_Y$foundation_release.component1().intValue();
                                                            int intValue2 = m911layout_EkL_Y$foundation_release.component2().intValue();
                                                            TextLayoutResult component3 = m911layout_EkL_Y$foundation_release.component3();
                                                            if (!Intrinsics.areEqual(value, component3)) {
                                                                TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                                                                function18.invoke(component3);
                                                                CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue5, offsetMapping4);
                                                            }
                                                            TextFieldState.this.m932setMinHeightForSingleLineField0680j_4(density4.mo310toDpu2uoSUM(i38 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                            return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            });
                                                        } finally {
                                                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                        }
                                                    } catch (Throwable th) {
                                                        createNonObservableSnapshot.dispose();
                                                        throw th;
                                                    }
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i39) {
                                                    TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                    return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                }
                                            };
                                            composer5.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            boolean z27 = false;
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer m2937constructorimpl = Updater.m2937constructorimpl(composer5);
                                            Updater.m2944setimpl(m2937constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            ComposerKt.sourceInformationMarkerStart(composer5, 1017247175, "C:CoreTextField.kt#423gt5");
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                            if (textFieldState4.getHandleState() != HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                Intrinsics.checkNotNull(layoutCoordinates);
                                                if (layoutCoordinates.isAttached() && z25) {
                                                    z27 = true;
                                                }
                                            }
                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                            if (textFieldState4.getHandleState() == HandleState.Cursor && !z26 && z25) {
                                                CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CoreTextFieldRootBox(onGloballyPositioned22222, textFieldSelectionManager2222, ComposableLambdaKt.composableLambda(composer2, -374338080, true, function22222), composer2, 448);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        function14 = function13;
        visualTransformation3 = visualTransformation52222;
        brush3 = brush2;
        z8 = z5;
        i22 = i20;
        keyboardActions3 = keyboardActions2;
        z9 = z6;
        i23 = i302222;
        function33 = function32;
        z10 = z202222;
        modifier4 = modifier52222;
        imeOptions3 = imeOptions42222;
        mutableInteractionSource4 = mutableInteractionSource72222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)747@33825L95:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087268488, "C748@33881L33:CoreTextField.kt#423gt5");
        startRestartGroup.startReplaceableGroup(-1985516685);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ContextMenuArea)P(1)29@1062L9:ContextMenu.android.kt#423gt5");
        function2.invoke(startRestartGroup, Integer.valueOf(((((i >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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

                public final void invoke(Composer composer2, int i2) {
                    CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m857invokeZmokQxo(keyEvent.m4405unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m857invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (TextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m859cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m1056deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (keyboardController = textFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        textFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5230getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m5903getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles)1101@48248L202:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)");
        }
        if (z) {
            TextFieldState state = textFieldSelectionManager.getState();
            TextLayoutResult textLayoutResult = null;
            if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                if (!(textFieldSelectionManager.getState() != null ? r3.getIsLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m5227getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m5233getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m5228getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498386756);
                    ComposerKt.sourceInformation(startRestartGroup, "1094@47925L203");
                    TextFieldState state2 = textFieldSelectionManager.getState();
                    if (state2 != null && state2.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state4 = textFieldSelectionManager.getState();
                if (state4 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state4.setShowFloatingToolbar(false);
                    }
                    if (state4.getHasFocus()) {
                        if (state4.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
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
                    CoreTextFieldKt.SelectionToolbarAndHandles(TextFieldSelectionManager.this, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        AnnotatedString transformedText$foundation_release;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)1127@49342L50,1128@49455L7,1129@49472L1101:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)");
        }
        TextFieldState state = textFieldSelectionManager.getState();
        if (state != null && state.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(textFieldSelectionManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final long m1062getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m1062getCursorPositiontuRUvjQ$foundation_release((Density) consume);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, textFieldSelectionManager, null));
            startRestartGroup.startReplaceableGroup(294220498);
            boolean changed2 = startRestartGroup.changed(m1062getCursorPositiontuRUvjQ$foundation_release);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m1062getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m835CursorHandleULxng0E(m1062getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
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
                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    return;
                }
                LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return;
                }
                TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                Unit unit = Unit.INSTANCE;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
