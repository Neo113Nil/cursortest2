package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
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
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aú\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0002\u0010%\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020(H\u0002\u001a \u0010.\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0013H\u0000\u001a0\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0002\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-H\u0002\u001a2\u00108\u001a\u00020\u0001*\u0002092\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\r2\u0006\u00105\u001a\u000206H\u0080@¢\u0006\u0002\u0010=\u001a\u001d\u0010>\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(2\u0006\u0010?\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010@\u001a\u0015\u0010A\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\u0010B\u001a$\u0010C\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00105\u001a\u000206H\u0000\u001a \u0010D\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00105\u001a\u000206H\u0002\u001a\u001c\u0010E\u001a\u00020\u0007*\u00020\u00072\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020HH\u0002¨\u0006I²\u0006\n\u0010J\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "innerTextField", "textScrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "previewKeyEventToDeselectOnBack", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "requestFocusAndShowKeyboardIfNeeded", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "endInputSession", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "defaultTextFieldDraw", "notifyFocusedRect", "addContextMenuComponents", "textFieldSelectionManager", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "foundation", "writeable"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$23(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3 function3, TextFieldScrollerPosition textFieldScrollerPosition, int i3, int i4, int i5, Composer composer, int i6) {
        CoreTextField(textFieldValue, function1, modifier, textStyle, visualTransformation, function12, mutableInteractionSource, brush, z, i, i2, imeOptions, keyboardActions, z2, z3, function3, textFieldScrollerPosition, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextFieldRootBox$lambda$1(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, Composer composer, int i2) {
        CoreTextFieldRootBox(modifier, textFieldSelectionManager, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionToolbarAndHandles$lambda$1(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Composer composer, int i2) {
        SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldCursorHandle$lambda$4(TextFieldSelectionManager textFieldSelectionManager, int i, Composer composer, int i2) {
        TextFieldCursorHandle(textFieldSelectionManager, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$0$0(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0489, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0998, code lost:
    
        if (r8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L410;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x094b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, TextFieldScrollerPosition textFieldScrollerPosition, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        VisualTransformation visualTransformation2;
        int i9;
        Function1<? super TextLayoutResult, Unit> function13;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Composer composer2;
        final int i27;
        final ImeOptions imeOptions2;
        KeyboardActions keyboardActions2;
        final boolean z4;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final TextFieldScrollerPosition textFieldScrollerPosition2;
        final MutableInteractionSource mutableInteractionSource3;
        final Function1<? super TextLayoutResult, Unit> function14;
        final TextStyle textStyle3;
        final VisualTransformation visualTransformation3;
        final Brush brush2;
        final boolean z5;
        final int i28;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Function1<? super TextLayoutResult, Unit> function15;
        MutableInteractionSource mutableInteractionSource4;
        SolidColor solidColor;
        ImeOptions imeOptions3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> lambda$559628295$foundation;
        TextFieldScrollerPosition textFieldScrollerPosition3;
        boolean z7;
        boolean z8;
        int i29;
        final Function1<? super TextLayoutResult, Unit> function16;
        Modifier modifier3;
        int i30;
        boolean z9;
        VisualTransformation visualTransformation4;
        KeyboardActions keyboardActions3;
        ImeOptions imeOptions4;
        int i31;
        Brush brush3;
        MutableInteractionSource mutableInteractionSource5;
        Brush brush4;
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter;
        WindowInfo windowInfo;
        int i32;
        TextFieldScrollerPosition textFieldScrollerPosition4;
        TextFieldScrollerPosition textFieldScrollerPosition5;
        AnnotatedString annotatedString;
        TextStyle textStyle4;
        boolean z10;
        FontFamily.Resolver resolver;
        FocusManager focusManager;
        UndoManager undoManager;
        final TextInputService textInputService;
        boolean z11;
        boolean changedInstance;
        Object rememberedValue;
        final OffsetMapping offsetMapping;
        boolean z12;
        boolean z13;
        TextInputService textInputService2;
        TextFieldValue textFieldValue2;
        ImeOptions imeOptions5;
        TextFieldSelectionManager textFieldSelectionManager;
        CoroutineScope coroutineScope;
        BringIntoViewRequester bringIntoViewRequester;
        ImeOptions imeOptions6;
        boolean z14;
        boolean z15;
        final TextInputService textInputService3;
        ImeOptions imeOptions7;
        CoreTextFieldKt$CoreTextField$5$1 coreTextFieldKt$CoreTextField$5$1;
        final ImeOptions imeOptions8;
        final boolean z16;
        boolean changedInstance2;
        final WindowInfo windowInfo2;
        WindowInfo windowInfo3;
        boolean changedInstance3;
        Modifier modifier4;
        boolean changedInstance4;
        Object rememberedValue2;
        final boolean z17;
        boolean changed;
        Object rememberedValue3;
        boolean changedInstance5;
        Object rememberedValue4;
        final boolean z18;
        Modifier.Companion companion;
        String str;
        int i33;
        Composer startRestartGroup = composer.startRestartGroup(31062401);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextField)N(value,onValueChange,modifier,textStyle,visualTransformation,onTextLayout,interactionSource,cursorBrush,softWrap,maxLines,minLines,imeOptions,keyboardActions,enabled,readOnly,decorationBox,textScrollerPosition)209@11803L29,210@11873L58,211@11977L72,216@12107L7,217@12168L7,218@12236L7,219@12301L7,220@12346L7,221@12415L7,242@13257L277,254@13839L21,256@13885L453,285@14738L26,288@14831L24,289@14889L37,291@14946L51,297@15235L7,299@15330L7,300@15387L7,310@15761L206,323@16184L1514,358@17805L42,359@17873L971,359@17852L992,385@18889L196,398@19232L1606,452@21467L48,452@21441L74,454@21550L503,454@21521L532,486@22727L987,505@23831L7,506@23888L7,510@24026L327,519@24382L35,547@25644L5409,547@25591L5462:CoreTextField.kt#423gt5");
        if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i34 = i5 & 4;
        if (i34 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    visualTransformation2 = visualTransformation;
                    i6 |= startRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function13 = function12;
                    } else {
                        function13 = function12;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i3 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(brush) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i6 |= startRestartGroup.changed(z) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i14 = i5 & 512;
                        if (i14 != 0) {
                            i6 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i15 = i14;
                            i6 |= startRestartGroup.changed(i) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i16 = i5 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            if ((i4 & 48) == 0) {
                                if ((i5 & 2048) == 0 && startRestartGroup.changed(imeOptions)) {
                                    i33 = 32;
                                    i18 |= i33;
                                }
                                i33 = 16;
                                i18 |= i33;
                            }
                            int i35 = i18;
                            i19 = i5 & 4096;
                            if (i19 == 0) {
                                i20 = i35 | 384;
                            } else if ((i4 & 384) == 0) {
                                i20 = i35 | (startRestartGroup.changed(keyboardActions) ? 256 : 128);
                            } else {
                                i20 = i35;
                            }
                            i21 = i5 & 8192;
                            if (i21 == 0) {
                                i22 = i20 | 3072;
                            } else {
                                int i36 = i20;
                                if ((i4 & 3072) == 0) {
                                    i36 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                                }
                                i22 = i36;
                            }
                            i23 = i5 & 16384;
                            if (i23 == 0) {
                                i24 = i22 | 24576;
                            } else {
                                int i37 = i22;
                                if ((i4 & 24576) == 0) {
                                    i24 = i37 | (startRestartGroup.changed(z3) ? 16384 : 8192);
                                } else {
                                    i24 = i37;
                                }
                            }
                            i25 = i5 & 32768;
                            if (i25 == 0) {
                                i24 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i24 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            }
                            i26 = i5 & 65536;
                            if (i26 == 0) {
                                i24 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i24 |= startRestartGroup.changed(textFieldScrollerPosition) ? 1048576 : 524288;
                            }
                            if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "194@11128L2");
                                if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 2048) != 0) {
                                        i24 &= -113;
                                    }
                                    z9 = z;
                                    i31 = i;
                                    imeOptions4 = imeOptions;
                                    z7 = z2;
                                    z8 = z3;
                                    lambda$559628295$foundation = function3;
                                    textFieldScrollerPosition3 = textFieldScrollerPosition;
                                    mutableInteractionSource5 = mutableInteractionSource2;
                                    function16 = function13;
                                    modifier3 = modifier2;
                                    visualTransformation4 = visualTransformation2;
                                    i29 = i24;
                                    brush3 = brush;
                                    i30 = i2;
                                    keyboardActions3 = keyboardActions;
                                } else {
                                    if (i34 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i8 != 0) {
                                        visualTransformation2 = VisualTransformation.INSTANCE.getNone();
                                    }
                                    if (i9 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213794269, "CC(remember):CoreTextField.kt#9igjgp");
                                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda14
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit CoreTextField$lambda$0$0;
                                                    CoreTextField$lambda$0$0 = CoreTextFieldKt.CoreTextField$lambda$0$0((TextLayoutResult) obj);
                                                    return CoreTextField$lambda$0$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        function15 = (Function1) rememberedValue5;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    } else {
                                        function15 = function13;
                                    }
                                    if (i10 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if (i11 != 0) {
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        solidColor = new SolidColor(Color.INSTANCE.m6822getUnspecified0d7_KjU(), null);
                                    } else {
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        solidColor = brush;
                                    }
                                    boolean z19 = i13 != 0 ? true : z;
                                    int i38 = i15 != 0 ? Integer.MAX_VALUE : i;
                                    int i39 = i17 != 0 ? 1 : i2;
                                    if ((i5 & 2048) != 0) {
                                        imeOptions3 = ImeOptions.INSTANCE.getDefault();
                                        i24 &= -113;
                                    } else {
                                        imeOptions3 = imeOptions;
                                    }
                                    KeyboardActions keyboardActions4 = i19 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    boolean z20 = i21 != 0 ? true : z2;
                                    boolean z21 = i23 != 0 ? false : z3;
                                    lambda$559628295$foundation = i25 != 0 ? ComposableSingletons$CoreTextFieldKt.INSTANCE.getLambda$559628295$foundation() : function3;
                                    textFieldScrollerPosition3 = i26 != 0 ? null : textFieldScrollerPosition;
                                    z7 = z20;
                                    z8 = z21;
                                    i29 = i24;
                                    function16 = function15;
                                    modifier3 = modifier2;
                                    i30 = i39;
                                    z9 = z19;
                                    visualTransformation4 = visualTransformation2;
                                    keyboardActions3 = keyboardActions4;
                                    imeOptions4 = imeOptions3;
                                    i31 = i38;
                                    brush3 = solidColor;
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    brush4 = brush3;
                                    ComposerKt.traceEventStart(31062401, i6, i29, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                                } else {
                                    brush4 = brush3;
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213772642, "CC(remember):CoreTextField.kt#9igjgp");
                                Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = new FocusRequester();
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                FocusRequester focusRequester = (FocusRequester) rememberedValue6;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213770373, "CC(remember):CoreTextField.kt#9igjgp");
                                Object rememberedValue7 = startRestartGroup.rememberedValue();
                                int i40 = i6;
                                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue7 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2 = (LegacyPlatformTextInputServiceAdapter) rememberedValue7;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213767031, "CC(remember):CoreTextField.kt#9igjgp");
                                Object rememberedValue8 = startRestartGroup.rememberedValue();
                                boolean z22 = z9;
                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue8 = new TextInputService(legacyPlatformTextInputServiceAdapter2);
                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                }
                                TextInputService textInputService4 = (TextInputService) rememberedValue8;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                TextStyle textStyle5 = textStyle2;
                                final int i41 = i30;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Density density = (Density) consume;
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localFontFamilyResolver);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                FontFamily.Resolver resolver2 = (FontFamily.Resolver) consume2;
                                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(localTextSelectionColors);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long backgroundColor = ((TextSelectionColors) consume3).getBackgroundColor();
                                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume4 = startRestartGroup.consume(localFocusManager);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                FocusManager focusManager2 = (FocusManager) consume4;
                                ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume5 = startRestartGroup.consume(localWindowInfo);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                WindowInfo windowInfo4 = (WindowInfo) consume5;
                                keyboardActions2 = keyboardActions3;
                                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume6 = startRestartGroup.consume(localSoftwareKeyboardController);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume6;
                                final Orientation orientation = (i31 == 1 && !z22 && imeOptions4.getSingleLine()) ? Orientation.Horizontal : Orientation.Vertical;
                                Modifier modifier5 = modifier3;
                                if (textFieldScrollerPosition3 != null) {
                                    legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter2;
                                    windowInfo = windowInfo4;
                                    i32 = i31;
                                    startRestartGroup.startReplaceGroup(-213745742);
                                    startRestartGroup.endReplaceGroup();
                                    textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                } else {
                                    startRestartGroup.startReplaceGroup(-213744626);
                                    ComposerKt.sourceInformation(startRestartGroup, "228@12746L70,228@12675L141");
                                    legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter2;
                                    Object[] objArr = {orientation};
                                    Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                                    i32 = i31;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213742425, "CC(remember):CoreTextField.kt#9igjgp");
                                    boolean changed2 = startRestartGroup.changed(orientation.ordinal());
                                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (changed2) {
                                        windowInfo = windowInfo4;
                                    } else {
                                        windowInfo = windowInfo4;
                                    }
                                    rememberedValue9 = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            TextFieldScrollerPosition CoreTextField$lambda$4$0;
                                            CoreTextField$lambda$4$0 = CoreTextFieldKt.CoreTextField$lambda$4$0(Orientation.this);
                                            return CoreTextField$lambda$4$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) saver, (Function0) rememberedValue9, startRestartGroup, 0);
                                    startRestartGroup.endReplaceGroup();
                                }
                                if (textFieldScrollerPosition4.getOrientation() != orientation) {
                                    if (orientation == Orientation.Vertical) {
                                        str = "only single-line, non-wrap text fields can scroll horizontally";
                                    } else {
                                        str = "single-line, non-wrap text fields can only scroll horizontally";
                                    }
                                    throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(str));
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213725866, "CC(remember):CoreTextField.kt#9igjgp");
                                int i42 = i40 & 14;
                                boolean z23 = (i42 == 4) | ((i40 & 57344) == 16384);
                                Object rememberedValue10 = startRestartGroup.rememberedValue();
                                if (z23 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation4, textFieldValue.getAnnotatedString());
                                    TextRange composition = textFieldValue.getComposition();
                                    if (composition != null) {
                                        textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                        TransformedText m1876applyCompositionDecoration72CqOWE = TextFieldDelegate.INSTANCE.m1876applyCompositionDecoration72CqOWE(composition.getPackedValue(), filterWithValidation);
                                        if (m1876applyCompositionDecoration72CqOWE != null) {
                                            rememberedValue10 = m1876applyCompositionDecoration72CqOWE;
                                            startRestartGroup.updateRememberedValue(rememberedValue10);
                                        }
                                    } else {
                                        textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                    }
                                    rememberedValue10 = filterWithValidation;
                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                } else {
                                    textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                }
                                TransformedText transformedText = (TransformedText) rememberedValue10;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                AnnotatedString text = transformedText.getText();
                                OffsetMapping offsetMapping2 = transformedText.getOffsetMapping();
                                RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213705594, "CC(remember):CoreTextField.kt#9igjgp");
                                boolean changed3 = startRestartGroup.changed(softwareKeyboardController);
                                Object rememberedValue11 = startRestartGroup.rememberedValue();
                                if (changed3 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    annotatedString = text;
                                    textStyle4 = textStyle5;
                                    z10 = z22;
                                    resolver = resolver2;
                                    rememberedValue11 = new LegacyTextFieldState(new TextDelegate(text, textStyle5, 0, 0, z22, 0, density, resolver2, null, 300, null), currentRecomposeScope, softwareKeyboardController);
                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                } else {
                                    annotatedString = text;
                                    textStyle4 = textStyle5;
                                    z10 = z22;
                                    resolver = resolver2;
                                }
                                final LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) rememberedValue11;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                legacyTextFieldState.m1840updatefnh65Uc(textFieldValue.getAnnotatedString(), annotatedString, textStyle4, z10, density, resolver, function1, keyboardActions2, focusManager2, backgroundColor);
                                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = lambda$559628295$foundation;
                                legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213678725, "CC(remember):CoreTextField.kt#9igjgp");
                                Object rememberedValue12 = startRestartGroup.rememberedValue();
                                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    focusManager = focusManager2;
                                    rememberedValue12 = new UndoManager(0, 1, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                } else {
                                    focusManager = focusManager2;
                                }
                                UndoManager undoManager2 = (UndoManager) rememberedValue12;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                                Object rememberedValue13 = startRestartGroup.rememberedValue();
                                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue13 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                }
                                final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue13;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213673882, "CC(remember):CoreTextField.kt#9igjgp");
                                Object rememberedValue14 = startRestartGroup.rememberedValue();
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue14 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                }
                                final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue14;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213672044, "CC(remember):CoreTextField.kt#9igjgp");
                                Object rememberedValue15 = startRestartGroup.rememberedValue();
                                if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue15 = new TextFieldSelectionManager(undoManager2);
                                    startRestartGroup.updateRememberedValue(rememberedValue15);
                                }
                                final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue15;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textFieldSelectionManager2.setOffsetMapping$foundation(offsetMapping2);
                                textFieldSelectionManager2.setVisualTransformation$foundation(visualTransformation4);
                                textFieldSelectionManager2.setOnValueChange$foundation(legacyTextFieldState.getOnValueChange());
                                textFieldSelectionManager2.setState$foundation(legacyTextFieldState);
                                textFieldSelectionManager2.setValue$foundation(textFieldValue);
                                ProvidableCompositionLocal<Clipboard> localClipboard = CompositionLocalsKt.getLocalClipboard();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume7 = startRestartGroup.consume(localClipboard);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textFieldSelectionManager2.setClipboard$foundation((Clipboard) consume7);
                                textFieldSelectionManager2.setCoroutineScope$foundation(coroutineScope2);
                                ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume8 = startRestartGroup.consume(localTextToolbar);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textFieldSelectionManager2.setTextToolbar((TextToolbar) consume8);
                                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume9 = startRestartGroup.consume(localHapticFeedback);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) consume9);
                                textFieldSelectionManager2.setFocusRequester(focusRequester);
                                textFieldSelectionManager2.setEditable(!z8);
                                final boolean z24 = z7;
                                textFieldSelectionManager2.setEnabled(z24);
                                if (ComposeFoundationFlags.isSmartSelectionEnabled) {
                                    startRestartGroup.startReplaceGroup(1966756105);
                                    ComposerKt.sourceInformation(startRestartGroup, "307@15662L87");
                                    undoManager = undoManager2;
                                    textFieldSelectionManager2.setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.EditableText, textStyle4.getLocaleList(), startRestartGroup, 6));
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    undoManager = undoManager2;
                                    startRestartGroup.startReplaceGroup(1966902177);
                                    startRestartGroup.endReplaceGroup();
                                }
                                legacyTextFieldState.getHasFocus();
                                new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CoreTextField$lambda$10;
                                        CoreTextField$lambda$10 = CoreTextFieldKt.CoreTextField$lambda$10(TextFieldSelectionManager.this, (AnnotatedString) obj);
                                        return CoreTextField$lambda$10;
                                    }
                                };
                                new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda21
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        AnnotatedString CoreTextField$lambda$11;
                                        CoreTextField$lambda$11 = CoreTextFieldKt.CoreTextField$lambda$11(TextFieldSelectionManager.this);
                                        return CoreTextField$lambda$11;
                                    }
                                };
                                new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        AnnotatedString cutWithResult$foundation;
                                        cutWithResult$foundation = TextFieldSelectionManager.this.cutWithResult$foundation();
                                        return cutWithResult$foundation;
                                    }
                                };
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1264411026, "CC(rememberClipboardEventsHandler)N(onPaste,onCopy,onCut,isEnabled):ClipboardEventsHandler.jvmAndAndroid.kt#423gt5");
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213630965, "CC(remember):CoreTextField.kt#9igjgp");
                                int i43 = i29 & 7168;
                                int i44 = i29;
                                boolean changedInstance6 = (i43 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | ((i44 & 57344) == 16384) | startRestartGroup.changedInstance(textInputService4) | (i42 == 4);
                                int i45 = (i44 & 112) ^ 48;
                                if (i45 <= 32 || !startRestartGroup.changed(imeOptions4)) {
                                    textInputService = textInputService4;
                                    if ((i44 & 48) != 32) {
                                        z11 = false;
                                        changedInstance = changedInstance6 | z11 | startRestartGroup.changedInstance(offsetMapping2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(bringIntoViewRequester2) | startRestartGroup.changedInstance(textFieldSelectionManager2);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            offsetMapping = offsetMapping2;
                                            final ImeOptions imeOptions9 = imeOptions4;
                                            final boolean z25 = z8;
                                            rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit CoreTextField$lambda$13$0;
                                                    CoreTextField$lambda$13$0 = CoreTextFieldKt.CoreTextField$lambda$13$0(LegacyTextFieldState.this, z24, z25, textInputService, textFieldValue, imeOptions9, offsetMapping, textFieldSelectionManager2, coroutineScope2, bringIntoViewRequester2, (FocusState) obj);
                                                    return CoreTextField$lambda$13$0;
                                                }
                                            };
                                            z12 = z24;
                                            z13 = z25;
                                            textInputService2 = textInputService;
                                            textFieldValue2 = textFieldValue;
                                            imeOptions5 = imeOptions9;
                                            textFieldSelectionManager = textFieldSelectionManager2;
                                            coroutineScope = coroutineScope2;
                                            bringIntoViewRequester = bringIntoViewRequester2;
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        } else {
                                            coroutineScope = coroutineScope2;
                                            offsetMapping = offsetMapping2;
                                            imeOptions5 = imeOptions4;
                                            z13 = z8;
                                            z12 = z24;
                                            bringIntoViewRequester = bringIntoViewRequester2;
                                            textFieldSelectionManager = textFieldSelectionManager2;
                                            textFieldValue2 = textFieldValue;
                                            textInputService2 = textInputService;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z12, focusRequester, mutableInteractionSource6, (Function1) rememberedValue);
                                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z12 || z13) ? false : true), startRestartGroup, 0);
                                        Unit unit = Unit.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213577460, "CC(remember):CoreTextField.kt#9igjgp");
                                        boolean changed4 = startRestartGroup.changed(rememberUpdatedState) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService2) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                        TextInputService textInputService5 = textInputService2;
                                        if (i45 > 32 || !startRestartGroup.changed(imeOptions5)) {
                                            imeOptions6 = imeOptions5;
                                            if ((i44 & 48) != 32) {
                                                z14 = false;
                                                z15 = z14 | changed4;
                                                Object rememberedValue16 = startRestartGroup.rememberedValue();
                                                if (!z15 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                    ImeOptions imeOptions10 = imeOptions6;
                                                    textInputService3 = textInputService5;
                                                    imeOptions7 = imeOptions10;
                                                    coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(legacyTextFieldState, rememberUpdatedState, textInputService5, textFieldSelectionManager, imeOptions10, null);
                                                    startRestartGroup.updateRememberedValue(coreTextFieldKt$CoreTextField$5$1);
                                                } else {
                                                    imeOptions7 = imeOptions6;
                                                    coreTextFieldKt$CoreTextField$5$1 = rememberedValue16;
                                                    textInputService3 = textInputService5;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                imeOptions8 = imeOptions7;
                                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) coreTextFieldKt$CoreTextField$5$1, startRestartGroup, 6);
                                                int i46 = i44 >> 3;
                                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                z16 = z12;
                                                Modifier textFieldPointer = TextFieldPointerModifier_androidKt.textFieldPointer(Modifier.INSTANCE, textFieldSelectionManager3, z16, mutableInteractionSource6, legacyTextFieldState, focusRequester, z13, offsetMapping, startRestartGroup, ((i40 >> 9) & 7168) | (i46 & 896) | 196614 | ((i44 << 6) & 3670016));
                                                final OffsetMapping offsetMapping3 = offsetMapping;
                                                final Modifier textFieldDraw = CoreTextField_androidKt.textFieldDraw(Modifier.INSTANCE, legacyTextFieldState, textFieldValue2, offsetMapping3);
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213533337, "CC(remember):CoreTextField.kt#9igjgp");
                                                WindowInfo windowInfo5 = windowInfo;
                                                changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState) | (i43 == 2048) | startRestartGroup.changed(windowInfo5) | startRestartGroup.changedInstance(textFieldSelectionManager3) | (i42 == 4) | startRestartGroup.changedInstance(offsetMapping3);
                                                Object rememberedValue17 = startRestartGroup.rememberedValue();
                                                if (changedInstance2) {
                                                    windowInfo2 = windowInfo5;
                                                } else {
                                                    windowInfo2 = windowInfo5;
                                                    if (rememberedValue17 != Composer.INSTANCE.getEmpty()) {
                                                        windowInfo3 = windowInfo2;
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) rememberedValue17);
                                                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState, z13, z16, visualTransformation4 instanceof PasswordVisualTransformation, offsetMapping3, textFieldSelectionManager3, imeOptions8, focusRequester);
                                                        Brush brush5 = brush4;
                                                        Modifier textFieldCursor = CoreTextField_androidKt.textFieldCursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping3, brush5, (z16 || z13 || !windowInfo3.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                                        final VisualTransformation visualTransformation5 = visualTransformation4;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213463375, "CC(remember):CoreTextField.kt#9igjgp");
                                                        changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionManager3);
                                                        Object rememberedValue18 = startRestartGroup.rememberedValue();
                                                        if (changedInstance3) {
                                                            modifier4 = textFieldCursor;
                                                        } else {
                                                            modifier4 = textFieldCursor;
                                                        }
                                                        rememberedValue18 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                DisposableEffectResult CoreTextField$lambda$17$0;
                                                                CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(TextFieldSelectionManager.this, (DisposableEffectScope) obj);
                                                                return CoreTextField$lambda$17$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue18);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        EffectsKt.DisposableEffect(textFieldSelectionManager3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213460264, "CC(remember):CoreTextField.kt#9igjgp");
                                                        changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService3) | (i42 != 4) | ((i45 <= 32 && startRestartGroup.changed(imeOptions8)) || (i44 & 48) == 32);
                                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                                        if (!changedInstance4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda4
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    DisposableEffectResult CoreTextField$lambda$18$0;
                                                                    CoreTextField$lambda$18$0 = CoreTextFieldKt.CoreTextField$lambda$18$0(LegacyTextFieldState.this, textInputService3, textFieldValue, imeOptions8, (DisposableEffectScope) obj);
                                                                    return CoreTextField$lambda$18$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        EffectsKt.DisposableEffect(imeOptions8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, i46 & 14);
                                                        final int i47 = i32;
                                                        Modifier m1893textFieldKeyInput2WJ9YEU = TextFieldKeyInputKt.m1893textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager3, textFieldValue, legacyTextFieldState.getOnValueChange(), !z13, i47 != 1, offsetMapping3, undoManager, imeOptions8.getImeAction());
                                                        z17 = KeyboardType.m9390equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m9409getPasswordPjHm6EE()) && !KeyboardType.m9390equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m9408getNumberPasswordPjHm6EE());
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        boolean CoreTextField$lambda$14 = CoreTextField$lambda$14(rememberUpdatedState);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213422116, "CC(remember):CoreTextField.kt#9igjgp");
                                                        final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter3 = legacyPlatformTextInputServiceAdapter;
                                                        changed = startRestartGroup.changed(z17) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter3);
                                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                                        if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda5
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit CoreTextField$lambda$19$0;
                                                                    CoreTextField$lambda$19$0 = CoreTextFieldKt.CoreTextField$lambda$19$0(z17, legacyPlatformTextInputServiceAdapter3);
                                                                    return CoreTextField$lambda$19$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        Modifier stylusHandwriting = StylusHandwritingKt.stylusHandwriting(companion4, CoreTextField$lambda$14, z17, (Function0) rememberedValue3);
                                                        ProvidableCompositionLocal<Brush> localAutofillHighlightBrush = AutofillHighlightKt.getLocalAutofillHighlightBrush();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                        Object consume10 = startRestartGroup.consume(localAutofillHighlightBrush);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ProvidableCompositionLocal<Color> localAutofillHighlightColor = AutofillHighlightKt.getLocalAutofillHighlightColor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                        Object consume11 = startRestartGroup.consume(localAutofillHighlightColor);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        final Brush m1688resolveAutofillHighlightWkMShQ = AutofillHighlightKt.m1688resolveAutofillHighlightWkMShQ((Brush) consume10, ((Color) consume11).m6796unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213381208, "CC(remember):CoreTextField.kt#9igjgp");
                                                        changedInstance5 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(m1688resolveAutofillHighlightWkMShQ);
                                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                                        if (!changedInstance5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue4 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda15
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    Unit CoreTextField$lambda$20$0;
                                                                    CoreTextField$lambda$20$0 = CoreTextFieldKt.CoreTextField$lambda$20$0(LegacyTextFieldState.this, m1688resolveAutofillHighlightWkMShQ, (ContentDrawScope) obj);
                                                                    return CoreTextField$lambda$20$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        Modifier drawWithContent = DrawModifierKt.drawWithContent(companion5, (Function1) rememberedValue4);
                                                        OverscrollEffect rememberTextFieldOverscrollEffect = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(startRestartGroup, 0);
                                                        Modifier then = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5.then(drawWithContent), legacyPlatformTextInputServiceAdapter3, legacyTextFieldState, textFieldSelectionManager3).then(stylusHandwriting).then(textFieldFocusModifier), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager3).then(m1893textFieldKeyInput2WJ9YEU);
                                                        final TextFieldScrollerPosition textFieldScrollerPosition6 = textFieldScrollerPosition5;
                                                        Modifier addContextMenuComponents = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then, textFieldScrollerPosition6, mutableInteractionSource6, z16, rememberTextFieldOverscrollEffect).then(textFieldPointer).then(coreTextFieldSemanticsModifier), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda16
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                Unit CoreTextField$lambda$21;
                                                                CoreTextField$lambda$21 = CoreTextFieldKt.CoreTextField$lambda$21(LegacyTextFieldState.this, (LayoutCoordinates) obj);
                                                                return CoreTextField$lambda$21;
                                                            }
                                                        }), textFieldSelectionManager3, coroutineScope);
                                                        z18 = !z16 && legacyTextFieldState.getHasFocus() && legacyTextFieldState.isInTouchMode() && windowInfo3.isWindowFocused();
                                                        if (!z18) {
                                                            companion = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.INSTANCE, textFieldSelectionManager3);
                                                        } else {
                                                            companion = Modifier.INSTANCE;
                                                        }
                                                        final Modifier modifier6 = companion;
                                                        final Modifier modifier7 = modifier4;
                                                        final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                                                        final boolean z26 = z13;
                                                        final TextStyle textStyle6 = textStyle4;
                                                        Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda17
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                Unit CoreTextField$lambda$22;
                                                                CoreTextField$lambda$22 = CoreTextFieldKt.CoreTextField$lambda$22(Function3.this, legacyTextFieldState, textStyle6, i41, i47, textFieldScrollerPosition6, textFieldValue, visualTransformation5, modifier7, textFieldDraw, onGloballyPositioned, modifier6, bringIntoViewRequester3, textFieldSelectionManager3, z18, z26, function16, offsetMapping3, density, (Composer) obj, ((Integer) obj2).intValue());
                                                                return CoreTextField$lambda$22;
                                                            }
                                                        };
                                                        composer2 = startRestartGroup;
                                                        CoreTextFieldRootBox(addContextMenuComponents, textFieldSelectionManager3, ComposableLambdaKt.rememberComposableLambda(-814563849, true, function2, composer2, 54), composer2, 384);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        i28 = i41;
                                                        visualTransformation3 = visualTransformation5;
                                                        function32 = function33;
                                                        function14 = function16;
                                                        textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                        z4 = z16;
                                                        mutableInteractionSource3 = mutableInteractionSource6;
                                                        z6 = z13;
                                                        modifier2 = modifier5;
                                                        i27 = i47;
                                                        brush2 = brush5;
                                                        z5 = z10;
                                                        textStyle3 = textStyle4;
                                                        imeOptions2 = imeOptions8;
                                                    }
                                                }
                                                rememberedValue17 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit CoreTextField$lambda$16$0;
                                                        CoreTextField$lambda$16$0 = CoreTextFieldKt.CoreTextField$lambda$16$0(LegacyTextFieldState.this, z16, windowInfo2, textFieldSelectionManager3, textFieldValue, offsetMapping3, (LayoutCoordinates) obj);
                                                        return CoreTextField$lambda$16$0;
                                                    }
                                                };
                                                windowInfo3 = windowInfo2;
                                                startRestartGroup.updateRememberedValue(rememberedValue17);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                final Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) rememberedValue17);
                                                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState, z13, z16, visualTransformation4 instanceof PasswordVisualTransformation, offsetMapping3, textFieldSelectionManager3, imeOptions8, focusRequester);
                                                Brush brush52 = brush4;
                                                Modifier textFieldCursor2 = CoreTextField_androidKt.textFieldCursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping3, brush52, (z16 || z13 || !windowInfo3.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                                final VisualTransformation visualTransformation52 = visualTransformation4;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213463375, "CC(remember):CoreTextField.kt#9igjgp");
                                                changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionManager3);
                                                Object rememberedValue182 = startRestartGroup.rememberedValue();
                                                if (changedInstance3) {
                                                }
                                                rememberedValue182 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        DisposableEffectResult CoreTextField$lambda$17$0;
                                                        CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(TextFieldSelectionManager.this, (DisposableEffectScope) obj);
                                                        return CoreTextField$lambda$17$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue182);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                EffectsKt.DisposableEffect(textFieldSelectionManager3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue182, startRestartGroup, 0);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213460264, "CC(remember):CoreTextField.kt#9igjgp");
                                                changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService3) | (i42 != 4) | ((i45 <= 32 && startRestartGroup.changed(imeOptions8)) || (i44 & 48) == 32);
                                                rememberedValue2 = startRestartGroup.rememberedValue();
                                                if (!changedInstance4) {
                                                }
                                                rememberedValue2 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        DisposableEffectResult CoreTextField$lambda$18$0;
                                                        CoreTextField$lambda$18$0 = CoreTextFieldKt.CoreTextField$lambda$18$0(LegacyTextFieldState.this, textInputService3, textFieldValue, imeOptions8, (DisposableEffectScope) obj);
                                                        return CoreTextField$lambda$18$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                EffectsKt.DisposableEffect(imeOptions8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, i46 & 14);
                                                final int i472 = i32;
                                                Modifier m1893textFieldKeyInput2WJ9YEU2 = TextFieldKeyInputKt.m1893textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager3, textFieldValue, legacyTextFieldState.getOnValueChange(), !z13, i472 != 1, offsetMapping3, undoManager, imeOptions8.getImeAction());
                                                if (KeyboardType.m9390equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m9409getPasswordPjHm6EE())) {
                                                }
                                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                                boolean CoreTextField$lambda$142 = CoreTextField$lambda$14(rememberUpdatedState);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213422116, "CC(remember):CoreTextField.kt#9igjgp");
                                                final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter32 = legacyPlatformTextInputServiceAdapter;
                                                changed = startRestartGroup.changed(z17) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter32);
                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                if (!changed) {
                                                }
                                                rememberedValue3 = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit CoreTextField$lambda$19$0;
                                                        CoreTextField$lambda$19$0 = CoreTextFieldKt.CoreTextField$lambda$19$0(z17, legacyPlatformTextInputServiceAdapter32);
                                                        return CoreTextField$lambda$19$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                Modifier stylusHandwriting2 = StylusHandwritingKt.stylusHandwriting(companion42, CoreTextField$lambda$142, z17, (Function0) rememberedValue3);
                                                ProvidableCompositionLocal<Brush> localAutofillHighlightBrush2 = AutofillHighlightKt.getLocalAutofillHighlightBrush();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume102 = startRestartGroup.consume(localAutofillHighlightBrush2);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ProvidableCompositionLocal<Color> localAutofillHighlightColor2 = AutofillHighlightKt.getLocalAutofillHighlightColor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume112 = startRestartGroup.consume(localAutofillHighlightColor2);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                final Brush m1688resolveAutofillHighlightWkMShQ2 = AutofillHighlightKt.m1688resolveAutofillHighlightWkMShQ((Brush) consume102, ((Color) consume112).m6796unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                                Modifier.Companion companion52 = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213381208, "CC(remember):CoreTextField.kt#9igjgp");
                                                changedInstance5 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(m1688resolveAutofillHighlightWkMShQ2);
                                                rememberedValue4 = startRestartGroup.rememberedValue();
                                                if (!changedInstance5) {
                                                }
                                                rememberedValue4 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda15
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit CoreTextField$lambda$20$0;
                                                        CoreTextField$lambda$20$0 = CoreTextFieldKt.CoreTextField$lambda$20$0(LegacyTextFieldState.this, m1688resolveAutofillHighlightWkMShQ2, (ContentDrawScope) obj);
                                                        return CoreTextField$lambda$20$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                Modifier drawWithContent2 = DrawModifierKt.drawWithContent(companion52, (Function1) rememberedValue4);
                                                OverscrollEffect rememberTextFieldOverscrollEffect2 = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(startRestartGroup, 0);
                                                Modifier then2 = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5.then(drawWithContent2), legacyPlatformTextInputServiceAdapter32, legacyTextFieldState, textFieldSelectionManager3).then(stylusHandwriting2).then(textFieldFocusModifier), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager3).then(m1893textFieldKeyInput2WJ9YEU2);
                                                final TextFieldScrollerPosition textFieldScrollerPosition62 = textFieldScrollerPosition5;
                                                Modifier addContextMenuComponents2 = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then2, textFieldScrollerPosition62, mutableInteractionSource6, z16, rememberTextFieldOverscrollEffect2).then(textFieldPointer).then(coreTextFieldSemanticsModifier2), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda16
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit CoreTextField$lambda$21;
                                                        CoreTextField$lambda$21 = CoreTextFieldKt.CoreTextField$lambda$21(LegacyTextFieldState.this, (LayoutCoordinates) obj);
                                                        return CoreTextField$lambda$21;
                                                    }
                                                }), textFieldSelectionManager3, coroutineScope);
                                                if (z16) {
                                                }
                                                if (!z18) {
                                                }
                                                final Modifier modifier62 = companion;
                                                final Modifier modifier72 = modifier4;
                                                final BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                                                final boolean z262 = z13;
                                                final TextStyle textStyle62 = textStyle4;
                                                Function2 function22 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda17
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        Unit CoreTextField$lambda$22;
                                                        CoreTextField$lambda$22 = CoreTextFieldKt.CoreTextField$lambda$22(Function3.this, legacyTextFieldState, textStyle62, i41, i472, textFieldScrollerPosition62, textFieldValue, visualTransformation52, modifier72, textFieldDraw, onGloballyPositioned2, modifier62, bringIntoViewRequester32, textFieldSelectionManager3, z18, z262, function16, offsetMapping3, density, (Composer) obj, ((Integer) obj2).intValue());
                                                        return CoreTextField$lambda$22;
                                                    }
                                                };
                                                composer2 = startRestartGroup;
                                                CoreTextFieldRootBox(addContextMenuComponents2, textFieldSelectionManager3, ComposableLambdaKt.rememberComposableLambda(-814563849, true, function22, composer2, 54), composer2, 384);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i28 = i41;
                                                visualTransformation3 = visualTransformation52;
                                                function32 = function33;
                                                function14 = function16;
                                                textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                z4 = z16;
                                                mutableInteractionSource3 = mutableInteractionSource6;
                                                z6 = z13;
                                                modifier2 = modifier5;
                                                i27 = i472;
                                                brush2 = brush52;
                                                z5 = z10;
                                                textStyle3 = textStyle4;
                                                imeOptions2 = imeOptions8;
                                            }
                                        } else {
                                            imeOptions6 = imeOptions5;
                                        }
                                        z14 = true;
                                        z15 = z14 | changed4;
                                        Object rememberedValue162 = startRestartGroup.rememberedValue();
                                        if (z15) {
                                        }
                                        ImeOptions imeOptions102 = imeOptions6;
                                        textInputService3 = textInputService5;
                                        imeOptions7 = imeOptions102;
                                        coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(legacyTextFieldState, rememberUpdatedState, textInputService5, textFieldSelectionManager, imeOptions102, null);
                                        startRestartGroup.updateRememberedValue(coreTextFieldKt$CoreTextField$5$1);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        imeOptions8 = imeOptions7;
                                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) coreTextFieldKt$CoreTextField$5$1, startRestartGroup, 6);
                                        int i462 = i44 >> 3;
                                        final TextFieldSelectionManager textFieldSelectionManager32 = textFieldSelectionManager;
                                        z16 = z12;
                                        Modifier textFieldPointer2 = TextFieldPointerModifier_androidKt.textFieldPointer(Modifier.INSTANCE, textFieldSelectionManager32, z16, mutableInteractionSource6, legacyTextFieldState, focusRequester, z13, offsetMapping, startRestartGroup, ((i40 >> 9) & 7168) | (i462 & 896) | 196614 | ((i44 << 6) & 3670016));
                                        final OffsetMapping offsetMapping32 = offsetMapping;
                                        final Modifier textFieldDraw2 = CoreTextField_androidKt.textFieldDraw(Modifier.INSTANCE, legacyTextFieldState, textFieldValue2, offsetMapping32);
                                        Modifier.Companion companion32 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213533337, "CC(remember):CoreTextField.kt#9igjgp");
                                        WindowInfo windowInfo52 = windowInfo;
                                        changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState) | (i43 == 2048) | startRestartGroup.changed(windowInfo52) | startRestartGroup.changedInstance(textFieldSelectionManager32) | (i42 == 4) | startRestartGroup.changedInstance(offsetMapping32);
                                        Object rememberedValue172 = startRestartGroup.rememberedValue();
                                        if (changedInstance2) {
                                        }
                                        rememberedValue172 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit CoreTextField$lambda$16$0;
                                                CoreTextField$lambda$16$0 = CoreTextFieldKt.CoreTextField$lambda$16$0(LegacyTextFieldState.this, z16, windowInfo2, textFieldSelectionManager32, textFieldValue, offsetMapping32, (LayoutCoordinates) obj);
                                                return CoreTextField$lambda$16$0;
                                            }
                                        };
                                        windowInfo3 = windowInfo2;
                                        startRestartGroup.updateRememberedValue(rememberedValue172);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion32, (Function1) rememberedValue172);
                                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier22 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState, z13, z16, visualTransformation4 instanceof PasswordVisualTransformation, offsetMapping32, textFieldSelectionManager32, imeOptions8, focusRequester);
                                        Brush brush522 = brush4;
                                        Modifier textFieldCursor22 = CoreTextField_androidKt.textFieldCursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping32, brush522, (z16 || z13 || !windowInfo3.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                        final VisualTransformation visualTransformation522 = visualTransformation4;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213463375, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionManager32);
                                        Object rememberedValue1822 = startRestartGroup.rememberedValue();
                                        if (changedInstance3) {
                                        }
                                        rememberedValue1822 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                DisposableEffectResult CoreTextField$lambda$17$0;
                                                CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(TextFieldSelectionManager.this, (DisposableEffectScope) obj);
                                                return CoreTextField$lambda$17$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue1822);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.DisposableEffect(textFieldSelectionManager32, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue1822, startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213460264, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService3) | (i42 != 4) | ((i45 <= 32 && startRestartGroup.changed(imeOptions8)) || (i44 & 48) == 32);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changedInstance4) {
                                        }
                                        rememberedValue2 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                DisposableEffectResult CoreTextField$lambda$18$0;
                                                CoreTextField$lambda$18$0 = CoreTextFieldKt.CoreTextField$lambda$18$0(LegacyTextFieldState.this, textInputService3, textFieldValue, imeOptions8, (DisposableEffectScope) obj);
                                                return CoreTextField$lambda$18$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.DisposableEffect(imeOptions8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, i462 & 14);
                                        final int i4722 = i32;
                                        Modifier m1893textFieldKeyInput2WJ9YEU22 = TextFieldKeyInputKt.m1893textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager32, textFieldValue, legacyTextFieldState.getOnValueChange(), !z13, i4722 != 1, offsetMapping32, undoManager, imeOptions8.getImeAction());
                                        if (KeyboardType.m9390equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m9409getPasswordPjHm6EE())) {
                                        }
                                        Modifier.Companion companion422 = Modifier.INSTANCE;
                                        boolean CoreTextField$lambda$1422 = CoreTextField$lambda$14(rememberUpdatedState);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213422116, "CC(remember):CoreTextField.kt#9igjgp");
                                        final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter322 = legacyPlatformTextInputServiceAdapter;
                                        changed = startRestartGroup.changed(z17) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter322);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changed) {
                                        }
                                        rememberedValue3 = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit CoreTextField$lambda$19$0;
                                                CoreTextField$lambda$19$0 = CoreTextFieldKt.CoreTextField$lambda$19$0(z17, legacyPlatformTextInputServiceAdapter322);
                                                return CoreTextField$lambda$19$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier stylusHandwriting22 = StylusHandwritingKt.stylusHandwriting(companion422, CoreTextField$lambda$1422, z17, (Function0) rememberedValue3);
                                        ProvidableCompositionLocal<Brush> localAutofillHighlightBrush22 = AutofillHighlightKt.getLocalAutofillHighlightBrush();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume1022 = startRestartGroup.consume(localAutofillHighlightBrush22);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ProvidableCompositionLocal<Color> localAutofillHighlightColor22 = AutofillHighlightKt.getLocalAutofillHighlightColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume1122 = startRestartGroup.consume(localAutofillHighlightColor22);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Brush m1688resolveAutofillHighlightWkMShQ22 = AutofillHighlightKt.m1688resolveAutofillHighlightWkMShQ((Brush) consume1022, ((Color) consume1122).m6796unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                        Modifier.Companion companion522 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213381208, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance5 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(m1688resolveAutofillHighlightWkMShQ22);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (!changedInstance5) {
                                        }
                                        rememberedValue4 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit CoreTextField$lambda$20$0;
                                                CoreTextField$lambda$20$0 = CoreTextFieldKt.CoreTextField$lambda$20$0(LegacyTextFieldState.this, m1688resolveAutofillHighlightWkMShQ22, (ContentDrawScope) obj);
                                                return CoreTextField$lambda$20$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier drawWithContent22 = DrawModifierKt.drawWithContent(companion522, (Function1) rememberedValue4);
                                        OverscrollEffect rememberTextFieldOverscrollEffect22 = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(startRestartGroup, 0);
                                        Modifier then22 = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5.then(drawWithContent22), legacyPlatformTextInputServiceAdapter322, legacyTextFieldState, textFieldSelectionManager32).then(stylusHandwriting22).then(textFieldFocusModifier), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager32).then(m1893textFieldKeyInput2WJ9YEU22);
                                        final TextFieldScrollerPosition textFieldScrollerPosition622 = textFieldScrollerPosition5;
                                        Modifier addContextMenuComponents22 = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then22, textFieldScrollerPosition622, mutableInteractionSource6, z16, rememberTextFieldOverscrollEffect22).then(textFieldPointer2).then(coreTextFieldSemanticsModifier22), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda16
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit CoreTextField$lambda$21;
                                                CoreTextField$lambda$21 = CoreTextFieldKt.CoreTextField$lambda$21(LegacyTextFieldState.this, (LayoutCoordinates) obj);
                                                return CoreTextField$lambda$21;
                                            }
                                        }), textFieldSelectionManager32, coroutineScope);
                                        if (z16) {
                                        }
                                        if (!z18) {
                                        }
                                        final Modifier modifier622 = companion;
                                        final Modifier modifier722 = modifier4;
                                        final BringIntoViewRequester bringIntoViewRequester322 = bringIntoViewRequester;
                                        final boolean z2622 = z13;
                                        final TextStyle textStyle622 = textStyle4;
                                        Function2 function222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda17
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit CoreTextField$lambda$22;
                                                CoreTextField$lambda$22 = CoreTextFieldKt.CoreTextField$lambda$22(Function3.this, legacyTextFieldState, textStyle622, i41, i4722, textFieldScrollerPosition622, textFieldValue, visualTransformation522, modifier722, textFieldDraw2, onGloballyPositioned22, modifier622, bringIntoViewRequester322, textFieldSelectionManager32, z18, z2622, function16, offsetMapping32, density, (Composer) obj, ((Integer) obj2).intValue());
                                                return CoreTextField$lambda$22;
                                            }
                                        };
                                        composer2 = startRestartGroup;
                                        CoreTextFieldRootBox(addContextMenuComponents22, textFieldSelectionManager32, ComposableLambdaKt.rememberComposableLambda(-814563849, true, function222, composer2, 54), composer2, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i28 = i41;
                                        visualTransformation3 = visualTransformation522;
                                        function32 = function33;
                                        function14 = function16;
                                        textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                        z4 = z16;
                                        mutableInteractionSource3 = mutableInteractionSource6;
                                        z6 = z13;
                                        modifier2 = modifier5;
                                        i27 = i4722;
                                        brush2 = brush522;
                                        z5 = z10;
                                        textStyle3 = textStyle4;
                                        imeOptions2 = imeOptions8;
                                    }
                                } else {
                                    textInputService = textInputService4;
                                }
                                z11 = true;
                                changedInstance = changedInstance6 | z11 | startRestartGroup.changedInstance(offsetMapping2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(bringIntoViewRequester2) | startRestartGroup.changedInstance(textFieldSelectionManager2);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (changedInstance) {
                                }
                                offsetMapping = offsetMapping2;
                                final ImeOptions imeOptions92 = imeOptions4;
                                final boolean z252 = z8;
                                rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CoreTextField$lambda$13$0;
                                        CoreTextField$lambda$13$0 = CoreTextFieldKt.CoreTextField$lambda$13$0(LegacyTextFieldState.this, z24, z252, textInputService, textFieldValue, imeOptions92, offsetMapping, textFieldSelectionManager2, coroutineScope2, bringIntoViewRequester2, (FocusState) obj);
                                        return CoreTextField$lambda$13$0;
                                    }
                                };
                                z12 = z24;
                                z13 = z252;
                                textInputService2 = textInputService;
                                textFieldValue2 = textFieldValue;
                                imeOptions5 = imeOptions92;
                                textFieldSelectionManager = textFieldSelectionManager2;
                                coroutineScope = coroutineScope2;
                                bringIntoViewRequester = bringIntoViewRequester2;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier textFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z12, focusRequester, mutableInteractionSource6, (Function1) rememberedValue);
                                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z12 || z13) ? false : true), startRestartGroup, 0);
                                Unit unit2 = Unit.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213577460, "CC(remember):CoreTextField.kt#9igjgp");
                                boolean changed42 = startRestartGroup.changed(rememberUpdatedState2) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService2) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                TextInputService textInputService52 = textInputService2;
                                if (i45 > 32) {
                                }
                                imeOptions6 = imeOptions5;
                                if ((i44 & 48) != 32) {
                                }
                                z14 = true;
                                z15 = z14 | changed42;
                                Object rememberedValue1622 = startRestartGroup.rememberedValue();
                                if (z15) {
                                }
                                ImeOptions imeOptions1022 = imeOptions6;
                                textInputService3 = textInputService52;
                                imeOptions7 = imeOptions1022;
                                coreTextFieldKt$CoreTextField$5$1 = new CoreTextFieldKt$CoreTextField$5$1(legacyTextFieldState, rememberUpdatedState2, textInputService52, textFieldSelectionManager, imeOptions1022, null);
                                startRestartGroup.updateRememberedValue(coreTextFieldKt$CoreTextField$5$1);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                imeOptions8 = imeOptions7;
                                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) coreTextFieldKt$CoreTextField$5$1, startRestartGroup, 6);
                                int i4622 = i44 >> 3;
                                final TextFieldSelectionManager textFieldSelectionManager322 = textFieldSelectionManager;
                                z16 = z12;
                                Modifier textFieldPointer22 = TextFieldPointerModifier_androidKt.textFieldPointer(Modifier.INSTANCE, textFieldSelectionManager322, z16, mutableInteractionSource6, legacyTextFieldState, focusRequester, z13, offsetMapping, startRestartGroup, ((i40 >> 9) & 7168) | (i4622 & 896) | 196614 | ((i44 << 6) & 3670016));
                                final OffsetMapping offsetMapping322 = offsetMapping;
                                final Modifier textFieldDraw22 = CoreTextField_androidKt.textFieldDraw(Modifier.INSTANCE, legacyTextFieldState, textFieldValue2, offsetMapping322);
                                Modifier.Companion companion322 = Modifier.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213533337, "CC(remember):CoreTextField.kt#9igjgp");
                                WindowInfo windowInfo522 = windowInfo;
                                changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState) | (i43 == 2048) | startRestartGroup.changed(windowInfo522) | startRestartGroup.changedInstance(textFieldSelectionManager322) | (i42 == 4) | startRestartGroup.changedInstance(offsetMapping322);
                                Object rememberedValue1722 = startRestartGroup.rememberedValue();
                                if (changedInstance2) {
                                }
                                rememberedValue1722 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CoreTextField$lambda$16$0;
                                        CoreTextField$lambda$16$0 = CoreTextFieldKt.CoreTextField$lambda$16$0(LegacyTextFieldState.this, z16, windowInfo2, textFieldSelectionManager322, textFieldValue, offsetMapping322, (LayoutCoordinates) obj);
                                        return CoreTextField$lambda$16$0;
                                    }
                                };
                                windowInfo3 = windowInfo2;
                                startRestartGroup.updateRememberedValue(rememberedValue1722);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion322, (Function1) rememberedValue1722);
                                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier222 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState, z13, z16, visualTransformation4 instanceof PasswordVisualTransformation, offsetMapping322, textFieldSelectionManager322, imeOptions8, focusRequester);
                                Brush brush5222 = brush4;
                                Modifier textFieldCursor222 = CoreTextField_androidKt.textFieldCursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping322, brush5222, (z16 || z13 || !windowInfo3.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                final VisualTransformation visualTransformation5222 = visualTransformation4;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213463375, "CC(remember):CoreTextField.kt#9igjgp");
                                changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionManager322);
                                Object rememberedValue18222 = startRestartGroup.rememberedValue();
                                if (changedInstance3) {
                                }
                                rememberedValue18222 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        DisposableEffectResult CoreTextField$lambda$17$0;
                                        CoreTextField$lambda$17$0 = CoreTextFieldKt.CoreTextField$lambda$17$0(TextFieldSelectionManager.this, (DisposableEffectScope) obj);
                                        return CoreTextField$lambda$17$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue18222);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.DisposableEffect(textFieldSelectionManager322, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18222, startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213460264, "CC(remember):CoreTextField.kt#9igjgp");
                                changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService3) | (i42 != 4) | ((i45 <= 32 && startRestartGroup.changed(imeOptions8)) || (i44 & 48) == 32);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changedInstance4) {
                                }
                                rememberedValue2 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        DisposableEffectResult CoreTextField$lambda$18$0;
                                        CoreTextField$lambda$18$0 = CoreTextFieldKt.CoreTextField$lambda$18$0(LegacyTextFieldState.this, textInputService3, textFieldValue, imeOptions8, (DisposableEffectScope) obj);
                                        return CoreTextField$lambda$18$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.DisposableEffect(imeOptions8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, i4622 & 14);
                                final int i47222 = i32;
                                Modifier m1893textFieldKeyInput2WJ9YEU222 = TextFieldKeyInputKt.m1893textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager322, textFieldValue, legacyTextFieldState.getOnValueChange(), !z13, i47222 != 1, offsetMapping322, undoManager, imeOptions8.getImeAction());
                                if (KeyboardType.m9390equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m9409getPasswordPjHm6EE())) {
                                }
                                Modifier.Companion companion4222 = Modifier.INSTANCE;
                                boolean CoreTextField$lambda$14222 = CoreTextField$lambda$14(rememberUpdatedState2);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213422116, "CC(remember):CoreTextField.kt#9igjgp");
                                final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter3222 = legacyPlatformTextInputServiceAdapter;
                                changed = startRestartGroup.changed(z17) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter3222);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue3 = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit CoreTextField$lambda$19$0;
                                        CoreTextField$lambda$19$0 = CoreTextFieldKt.CoreTextField$lambda$19$0(z17, legacyPlatformTextInputServiceAdapter3222);
                                        return CoreTextField$lambda$19$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier stylusHandwriting222 = StylusHandwritingKt.stylusHandwriting(companion4222, CoreTextField$lambda$14222, z17, (Function0) rememberedValue3);
                                ProvidableCompositionLocal<Brush> localAutofillHighlightBrush222 = AutofillHighlightKt.getLocalAutofillHighlightBrush();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume10222 = startRestartGroup.consume(localAutofillHighlightBrush222);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ProvidableCompositionLocal<Color> localAutofillHighlightColor222 = AutofillHighlightKt.getLocalAutofillHighlightColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume11222 = startRestartGroup.consume(localAutofillHighlightColor222);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Brush m1688resolveAutofillHighlightWkMShQ222 = AutofillHighlightKt.m1688resolveAutofillHighlightWkMShQ((Brush) consume10222, ((Color) consume11222).m6796unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor());
                                Modifier.Companion companion5222 = Modifier.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -213381208, "CC(remember):CoreTextField.kt#9igjgp");
                                changedInstance5 = startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(m1688resolveAutofillHighlightWkMShQ222);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changedInstance5) {
                                }
                                rememberedValue4 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CoreTextField$lambda$20$0;
                                        CoreTextField$lambda$20$0 = CoreTextFieldKt.CoreTextField$lambda$20$0(LegacyTextFieldState.this, m1688resolveAutofillHighlightWkMShQ222, (ContentDrawScope) obj);
                                        return CoreTextField$lambda$20$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier drawWithContent222 = DrawModifierKt.drawWithContent(companion5222, (Function1) rememberedValue4);
                                OverscrollEffect rememberTextFieldOverscrollEffect222 = TextFieldScroll_androidKt.rememberTextFieldOverscrollEffect(startRestartGroup, 0);
                                Modifier then222 = previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5.then(drawWithContent222), legacyPlatformTextInputServiceAdapter3222, legacyTextFieldState, textFieldSelectionManager322).then(stylusHandwriting222).then(textFieldFocusModifier2), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager322).then(m1893textFieldKeyInput2WJ9YEU222);
                                final TextFieldScrollerPosition textFieldScrollerPosition6222 = textFieldScrollerPosition5;
                                Modifier addContextMenuComponents222 = addContextMenuComponents(OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(then222, textFieldScrollerPosition6222, mutableInteractionSource6, z16, rememberTextFieldOverscrollEffect222).then(textFieldPointer22).then(coreTextFieldSemanticsModifier222), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CoreTextField$lambda$21;
                                        CoreTextField$lambda$21 = CoreTextFieldKt.CoreTextField$lambda$21(LegacyTextFieldState.this, (LayoutCoordinates) obj);
                                        return CoreTextField$lambda$21;
                                    }
                                }), textFieldSelectionManager322, coroutineScope);
                                if (z16) {
                                }
                                if (!z18) {
                                }
                                final Modifier modifier6222 = companion;
                                final Modifier modifier7222 = modifier4;
                                final BringIntoViewRequester bringIntoViewRequester3222 = bringIntoViewRequester;
                                final boolean z26222 = z13;
                                final TextStyle textStyle6222 = textStyle4;
                                Function2 function2222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit CoreTextField$lambda$22;
                                        CoreTextField$lambda$22 = CoreTextFieldKt.CoreTextField$lambda$22(Function3.this, legacyTextFieldState, textStyle6222, i41, i47222, textFieldScrollerPosition6222, textFieldValue, visualTransformation5222, modifier7222, textFieldDraw22, onGloballyPositioned222, modifier6222, bringIntoViewRequester3222, textFieldSelectionManager322, z18, z26222, function16, offsetMapping322, density, (Composer) obj, ((Integer) obj2).intValue());
                                        return CoreTextField$lambda$22;
                                    }
                                };
                                composer2 = startRestartGroup;
                                CoreTextFieldRootBox(addContextMenuComponents222, textFieldSelectionManager322, ComposableLambdaKt.rememberComposableLambda(-814563849, true, function2222, composer2, 54), composer2, 384);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i28 = i41;
                                visualTransformation3 = visualTransformation5222;
                                function32 = function33;
                                function14 = function16;
                                textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                z4 = z16;
                                mutableInteractionSource3 = mutableInteractionSource6;
                                z6 = z13;
                                modifier2 = modifier5;
                                i27 = i47222;
                                brush2 = brush5222;
                                z5 = z10;
                                textStyle3 = textStyle4;
                                imeOptions2 = imeOptions8;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                i27 = i;
                                imeOptions2 = imeOptions;
                                keyboardActions2 = keyboardActions;
                                z4 = z2;
                                function32 = function3;
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function14 = function13;
                                textStyle3 = textStyle2;
                                visualTransformation3 = visualTransformation2;
                                brush2 = brush;
                                z5 = z;
                                i28 = i2;
                                z6 = z3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier8 = modifier2;
                                final KeyboardActions keyboardActions5 = keyboardActions2;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit CoreTextField$lambda$23;
                                        CoreTextField$lambda$23 = CoreTextFieldKt.CoreTextField$lambda$23(TextFieldValue.this, function1, modifier8, textStyle3, visualTransformation3, function14, mutableInteractionSource3, brush2, z5, i27, i28, imeOptions2, keyboardActions5, z4, z6, function32, textFieldScrollerPosition2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                        return CoreTextField$lambda$23;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i15 = i14;
                        i16 = i5 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i4 & 48) == 0) {
                        }
                        int i352 = i18;
                        i19 = i5 & 4096;
                        if (i19 == 0) {
                        }
                        i21 = i5 & 8192;
                        if (i21 == 0) {
                        }
                        i23 = i5 & 16384;
                        if (i23 == 0) {
                        }
                        i25 = i5 & 32768;
                        if (i25 == 0) {
                        }
                        i26 = i5 & 65536;
                        if (i26 == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    int i3522 = i18;
                    i19 = i5 & 4096;
                    if (i19 == 0) {
                    }
                    i21 = i5 & 8192;
                    if (i21 == 0) {
                    }
                    i23 = i5 & 16384;
                    if (i23 == 0) {
                    }
                    i25 = i5 & 32768;
                    if (i25 == 0) {
                    }
                    i26 = i5 & 65536;
                    if (i26 == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                visualTransformation2 = visualTransformation;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                int i35222 = i18;
                i19 = i5 & 4096;
                if (i19 == 0) {
                }
                i21 = i5 & 8192;
                if (i21 == 0) {
                }
                i23 = i5 & 16384;
                if (i23 == 0) {
                }
                i25 = i5 & 32768;
                if (i25 == 0) {
                }
                i26 = i5 & 65536;
                if (i26 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            visualTransformation2 = visualTransformation;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i352222 = i18;
            i19 = i5 & 4096;
            if (i19 == 0) {
            }
            i21 = i5 & 8192;
            if (i21 == 0) {
            }
            i23 = i5 & 16384;
            if (i23 == 0) {
            }
            i25 = i5 & 32768;
            if (i25 == 0) {
            }
            i26 = i5 & 65536;
            if (i26 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        visualTransformation2 = visualTransformation;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i3522222 = i18;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        i21 = i5 & 8192;
        if (i21 == 0) {
        }
        i23 = i5 & 16384;
        if (i23 == 0) {
        }
        i25 = i5 & 32768;
        if (i25 == 0) {
        }
        i26 = i5 & 65536;
        if (i26 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i24 & 599187) != 599186, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldScrollerPosition CoreTextField$lambda$4$0(Orientation orientation) {
        return new TextFieldScrollerPosition(orientation, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString CoreTextField$lambda$11(TextFieldSelectionManager textFieldSelectionManager) {
        return TextFieldSelectionManager.copyWithResult$foundation$default(textFieldSelectionManager, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$10(TextFieldSelectionManager textFieldSelectionManager, AnnotatedString annotatedString) {
        textFieldSelectionManager.paste$foundation(annotatedString);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$13$0(LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester, FocusState focusState) {
        TextLayoutResultProxy layoutResult;
        if (legacyTextFieldState.getHasFocus() == focusState.isFocused()) {
            return Unit.INSTANCE;
        }
        legacyTextFieldState.setHasFocus(focusState.isFocused());
        if (legacyTextFieldState.getHasFocus() && z && !z2) {
            startInputSession(textInputService, legacyTextFieldState, textFieldValue, imeOptions, offsetMapping);
        } else {
            endInputSession(legacyTextFieldState);
        }
        if (focusState.isFocused() && (layoutResult = legacyTextFieldState.getLayoutResult()) != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester, textFieldValue, legacyTextFieldState, layoutResult, offsetMapping, null), 3, null);
        }
        if (!focusState.isFocused()) {
            TextFieldSelectionManager.m2412deselect_kEHs6E$foundation$default(textFieldSelectionManager, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$16$0(LegacyTextFieldState legacyTextFieldState, boolean z, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping, LayoutCoordinates layoutCoordinates) {
        TextInputSession inputSession;
        legacyTextFieldState.setLayoutCoordinates(layoutCoordinates);
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
        }
        if (z) {
            if (legacyTextFieldState.getHandleState() == HandleState.Selection) {
                if (legacyTextFieldState.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                    textFieldSelectionManager.showSelectionToolbar$foundation();
                } else {
                    textFieldSelectionManager.hideSelectionToolbar$foundation();
                }
                legacyTextFieldState.setShowSelectionHandleStart(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                legacyTextFieldState.setShowSelectionHandleEnd(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                legacyTextFieldState.setShowCursorHandle(TextRange.m9135getCollapsedimpl(textFieldValue.getSelection()));
            } else if (legacyTextFieldState.getHandleState() == HandleState.Cursor) {
                legacyTextFieldState.setShowCursorHandle(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
            }
            notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
            TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
            if (layoutResult2 != null && (inputSession = legacyTextFieldState.getInputSession()) != null && legacyTextFieldState.getHasFocus()) {
                TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation(inputSession, textFieldValue, offsetMapping, layoutResult2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CoreTextField$lambda$18$0(LegacyTextFieldState legacyTextFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, DisposableEffectScope disposableEffectScope) {
        if (legacyTextFieldState.getHasFocus()) {
            legacyTextFieldState.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$18$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$19$0(boolean z, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        if (z) {
            legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$20$0(LegacyTextFieldState legacyTextFieldState, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (legacyTextFieldState.getAutofillHighlightOn() || legacyTextFieldState.getJustAutofilled()) {
            DrawScope.CC.m7378drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$21(LegacyTextFieldState legacyTextFieldState, LayoutCoordinates layoutCoordinates) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$22(Function3 function3, final LegacyTextFieldState legacyTextFieldState, final TextStyle textStyle, final int i, final int i2, final TextFieldScrollerPosition textFieldScrollerPosition, final TextFieldValue textFieldValue, final VisualTransformation visualTransformation, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, final Modifier modifier4, final BringIntoViewRequester bringIntoViewRequester, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, final boolean z2, final Function1 function1, final OffsetMapping offsetMapping, final Density density, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C548@25668L5379,548@25654L5393:CoreTextField.kt#423gt5");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-814563849, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
            }
            function3.invoke(ComposableLambdaKt.rememberComposableLambda(-44346382, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CoreTextField$lambda$22$0;
                    CoreTextField$lambda$22$0 = CoreTextFieldKt.CoreTextField$lambda$22$0(LegacyTextFieldState.this, textStyle, i, i2, textFieldScrollerPosition, textFieldValue, visualTransformation, modifier, modifier2, modifier3, modifier4, bringIntoViewRequester, textFieldSelectionManager, z, z2, function1, offsetMapping, density, (Composer) obj, ((Integer) obj2).intValue());
                    return CoreTextField$lambda$22$0;
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoreTextField$lambda$22$0(final LegacyTextFieldState legacyTextFieldState, TextStyle textStyle, int i, final int i2, TextFieldScrollerPosition textFieldScrollerPosition, final TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, final TextFieldSelectionManager textFieldSelectionManager, final boolean z, final boolean z2, final Function1 function1, final OffsetMapping offsetMapping, final Density density, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C562@26519L22,571@26906L4131,571@26870L4167:CoreTextField.kt#423gt5");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44346382, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
            }
            Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m1259heightInVpY3zN4$default(Modifier.INSTANCE, legacyTextFieldState.m1833getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle, i, i2);
            ComposerKt.sourceInformationMarkerStart(composer, 332827112, "CC(remember):CoreTextField.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(legacyTextFieldState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TextLayoutResultProxy layoutResult;
                        layoutResult = LegacyTextFieldState.this.getLayoutResult();
                        return layoutResult;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScroll_androidKt.textFieldScroll(heightInLines, textFieldScrollerPosition, textFieldValue, visualTransformation, (Function0) rememberedValue).then(modifier).then(modifier2), textStyle).then(modifier3).then(modifier4), bringIntoViewRequester), ComposableLambdaKt.rememberComposableLambda(1412697320, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CoreTextField$lambda$22$0$1;
                    CoreTextField$lambda$22$0$1 = CoreTextFieldKt.CoreTextField$lambda$22$0$1(TextFieldSelectionManager.this, legacyTextFieldState, z, z2, function1, textFieldValue, offsetMapping, density, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CoreTextField$lambda$22$0$1;
                }
            }, composer, 54), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e5, code lost:
    
        if (r16 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit CoreTextField$lambda$22$0$1(TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, Function1 function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C572@26924L3502,637@30444L359:CoreTextField.kt#423gt5");
        boolean z3 = true;
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412697320, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:572)");
            }
            CoreTextFieldKt$CoreTextField$8$1$1$2 coreTextFieldKt$CoreTextField$8$1$1$2 = new CoreTextFieldKt$CoreTextField$8$1$1$2(legacyTextFieldState, function1, textFieldValue, offsetMapping, density, i);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, coreTextFieldKt$CoreTextField$8$1$1$2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1613409842, "C:CoreTextField.kt#423gt5");
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (legacyTextFieldState.getHandleState() != HandleState.None && legacyTextFieldState.getLayoutCoordinates() != null) {
                LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
                Intrinsics.checkNotNull(layoutCoordinates);
                if (layoutCoordinates.isAttached()) {
                }
            }
            z3 = false;
            SelectionToolbarAndHandles(textFieldSelectionManager, z3, composer, 0);
            if (legacyTextFieldState.getHandleState() == HandleState.Cursor && !z2 && z) {
                composer.startReplaceGroup(-714666198);
                ComposerKt.sourceInformation(composer, "649@30965L40");
                TextFieldCursorHandle(textFieldSelectionManager, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-714589318);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2036174316);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)N(modifier,manager,content)662@31212L83:CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036174316, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:661)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1799443472, "C662@31260L33:CoreTextField.kt#423gt5");
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, (i2 >> 3) & 126);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CoreTextFieldRootBox$lambda$1;
                    CoreTextFieldRootBox$lambda$1 = CoreTextFieldKt.CoreTextFieldRootBox$lambda$1(Modifier.this, textFieldSelectionManager, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CoreTextFieldRootBox$lambda$1;
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1761invokeZmokQxo(keyEvent.m7966unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1761invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m1766cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m2412deselect_kEHs6E$foundation$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public static final void requestFocusAndShowKeyboardIfNeeded(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            FocusRequester.m6424requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        } else {
            if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m9138getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    private static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles)N(manager,show):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1014)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(1530097388);
                ComposerKt.sourceInformation(startRestartGroup, "");
                LegacyTextFieldState state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                    if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    startRestartGroup.startReplaceGroup(1530097387);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1530097388);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    if (TextRange.m9135getCollapsedimpl(textFieldSelectionManager.getValue$foundation().getSelection())) {
                        startRestartGroup.startReplaceGroup(2110860558);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(2109807302);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m9141getStartimpl(textFieldSelectionManager.getValue$foundation().getSelection()));
                        int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m9136getEndimpl(textFieldSelectionManager.getValue$foundation().getSelection()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                        LegacyTextFieldState state3 = textFieldSelectionManager.getState();
                        if (state3 == null || !state3.getShowSelectionHandleStart()) {
                            startRestartGroup.startReplaceGroup(2110490542);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(2110225306);
                            ComposerKt.sourceInformation(startRestartGroup, "1030@46532L220");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state4 = textFieldSelectionManager.getState();
                        if (state4 == null || !state4.getShowSelectionHandleEnd()) {
                            startRestartGroup.startReplaceGroup(2110838734);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(2110574459);
                            ComposerKt.sourceInformation(startRestartGroup, "1037@46884L219");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state5 = textFieldSelectionManager.getState();
                    if (state5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation()) {
                            state5.setShowFloatingToolbar(false);
                        }
                        if (state5.getHasFocus()) {
                            if (state5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1989076778);
                startRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectionToolbarAndHandles$lambda$1;
                    SelectionToolbarAndHandles$lambda$1 = CoreTextFieldKt.SelectionToolbarAndHandles$lambda$1(TextFieldSelectionManager.this, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectionToolbarAndHandles$lambda$1;
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        int i2;
        AnnotatedString transformedText$foundation;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)N(manager):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1061)");
            }
            LegacyTextFieldState state = textFieldSelectionManager.getState();
            if (state != null && state.getShowCursorHandle() && (transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation()) != null && transformedText$foundation.length() > 0) {
                startRestartGroup.startReplaceGroup(-2112351432);
                ComposerKt.sourceInformation(startRestartGroup, "1063@48047L50,1064@48160L7,1066@48220L12,1068@48305L645,1080@48982L385,1065@48177L1201");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1315066870, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed = startRestartGroup.changed(textFieldSelectionManager);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final long m2418getCursorPositiontuRUvjQ$foundation = textFieldSelectionManager.m2418getCursorPositiontuRUvjQ$foundation((Density) consume);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1315061372, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m2418getCursorPositiontuRUvjQ$foundation);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1704provideF1C5BW0() {
                            return m2418getCursorPositiontuRUvjQ$foundation;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1315058019, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textDragObserver) | startRestartGroup.changedInstance(textFieldSelectionManager);
                PointerInputEventHandler rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* compiled from: CoreTextField.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ TextDragObserver $observer;
                            final /* synthetic */ PointerInputScope $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$this_pointerInput = pointerInputScope;
                                this.$observer = textDragObserver;
                                this.$manager = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$observer, this.$manager, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00121(this.$this_pointerInput, this.$observer, null), 1, null);
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1, null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            /* compiled from: CoreTextField.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", i = {}, l = {1074}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C00121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ TextDragObserver $observer;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00121(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super C00121> continuation) {
                                    super(2, continuation);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = textDragObserver;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00121(this.$this_pointerInput, this.$observer, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(this.$this_pointerInput, this.$observer, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: CoreTextField.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", i = {}, l = {1077}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$manager = textFieldSelectionManager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                        this.label = 1;
                                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                                            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                                            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            */
                                        /*
                                            this = this;
                                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                            int r1 = r9.label
                                            r2 = 1
                                            if (r1 == 0) goto L17
                                            if (r1 != r2) goto Lf
                                            kotlin.ResultKt.throwOnFailure(r10)
                                            goto L34
                                        Lf:
                                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                            r10.<init>(r0)
                                            throw r10
                                        L17:
                                            kotlin.ResultKt.throwOnFailure(r10)
                                            androidx.compose.ui.input.pointer.PointerInputScope r1 = r9.$this_pointerInput
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.$manager
                                            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$$ExternalSyntheticLambda0 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$$ExternalSyntheticLambda0
                                            r5.<init>(r10)
                                            r6 = r9
                                            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                                            r9.label = r2
                                            r2 = 0
                                            r3 = 0
                                            r4 = 0
                                            r7 = 7
                                            r8 = 0
                                            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(r1, r2, r3, r4, r5, r6, r7, r8)
                                            if (r10 != r0) goto L34
                                            return r0
                                        L34:
                                            kotlin.Unit r10 = kotlin.Unit.INSTANCE
                                            return r10
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invokeSuspend$lambda$0(TextFieldSelectionManager textFieldSelectionManager, Offset offset) {
                                        textFieldSelectionManager.showSelectionToolbar$foundation();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, TextDragObserver.this, textFieldSelectionManager, null), continuation);
                                return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) rememberedValue3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1315036615, "CC(remember):CoreTextField.kt#9igjgp");
                    boolean changed3 = startRestartGroup.changed(m2418getCursorPositiontuRUvjQ$foundation);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TextFieldCursorHandle$lambda$3$0;
                                TextFieldCursorHandle$lambda$3$0 = CoreTextFieldKt.TextFieldCursorHandle$lambda$3$0(m2418getCursorPositiontuRUvjQ$foundation, (SemanticsPropertyReceiver) obj);
                                return TextFieldCursorHandle$lambda$3$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    AndroidCursorHandle_androidKt.m1684CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue4, 1, null), 0L, startRestartGroup, 0, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2111042550);
                    startRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TextFieldCursorHandle$lambda$4;
                        TextFieldCursorHandle$lambda$4 = CoreTextFieldKt.TextFieldCursorHandle$lambda$4(TextFieldSelectionManager.this, i, (Composer) obj, ((Integer) obj2).intValue());
                        return TextFieldCursorHandle$lambda$4;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit TextFieldCursorHandle$lambda$3$0(long j, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, j, SelectionHandleAnchor.Middle, true, null));
            return Unit.INSTANCE;
        }

        public static final Modifier defaultTextFieldDraw(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping) {
            return DrawModifierKt.drawBehind(modifier, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit defaultTextFieldDraw$lambda$0;
                    defaultTextFieldDraw$lambda$0 = CoreTextFieldKt.defaultTextFieldDraw$lambda$0(LegacyTextFieldState.this, textFieldValue, offsetMapping, (DrawScope) obj);
                    return defaultTextFieldDraw$lambda$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit defaultTextFieldDraw$lambda$0(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, DrawScope drawScope) {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult != null) {
                TextFieldDelegate.INSTANCE.m1877drawQ1vqE60$foundation(drawScope.getDrawContext().getCanvas(), textFieldValue, legacyTextFieldState.m1835getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState.m1832getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping, layoutResult.getValue(), legacyTextFieldState.getHighlightPaint(), legacyTextFieldState.getSelectionBackgroundColor());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextInputSession inputSession = legacyTextFieldState.getInputSession();
                if (inputSession == null) {
                    return;
                }
                LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return;
                }
                TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
                Unit unit = Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }

        private static final Modifier addContextMenuComponents(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, CoroutineScope coroutineScope) {
            return ComposeFoundationFlags.isNewContextMenuEnabled ? TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents(modifier, textFieldSelectionManager, coroutineScope) : modifier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult CoreTextField$lambda$17$0(final TextFieldSelectionManager textFieldSelectionManager, DisposableEffectScope disposableEffectScope) {
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$17$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean CoreTextField$lambda$14(State<Boolean> state) {
            return state.getValue().booleanValue();
        }
    }
