package androidx.compose.foundation.text.input.internal.selection;

import android.content.ClipData;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda15;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.redwood.compose.HostFocusDirectorKt$depthFirst$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public AndroidClipboard clipboard;
    public final ClipboardPasteState clipboardPasteState;
    public final CoroutineScope coroutineScope;
    public Density density;
    public final DerivedSnapshotState derivedVisibleContentBounds$delegate;
    public boolean enabled;
    public PlatformHapticFeedback hapticFeedBack;
    public boolean isFocused;
    public final PlatformSelectionBehaviorsImpl platformSelectionBehaviors;
    public PressInteraction.Press pressInteraction;
    public int previousRawDragOffset;
    public SingleSelectionLayout previousSelectionLayout;
    public boolean readOnly;
    public Function0 receiveContentConfiguration;
    public Function0 requestAutofillAction;
    public final ParcelableSnapshotMutableState showCursorHandle$delegate;
    public final TransformedTextFieldState textFieldState;
    public final TextLayoutState textLayoutState;
    public final ParcelableSnapshotMutableState textToolbarShown$delegate;
    public final ParcelableSnapshotMutableState textToolbarState$delegate;
    public final ToolbarRequesterImpl toolbarRequester;
    public final ParcelableSnapshotMutableState isInTouchMode$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
    public final ParcelableSnapshotMutableState startTextLayoutPositionInWindow$delegate = Updater.mutableStateOf$default(new Offset(9205357640488583168L));
    public final ParcelableSnapshotMutableState rawHandleDragPosition$delegate = Updater.mutableStateOf$default(new Offset(9205357640488583168L));
    public final ParcelableSnapshotMutableState draggingHandle$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState directDragGestureInitiator$delegate = Updater.mutableStateOf$default(InputType.None);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputType {
        public static final /* synthetic */ InputType[] $VALUES;
        public static final InputType Mouse;
        public static final InputType None;
        public static final InputType Touch;

        static {
            InputType inputType = new InputType("None", 0);
            None = inputType;
            InputType inputType2 = new InputType("Touch", 1);
            Touch = inputType2;
            InputType inputType3 = new InputType("Mouse", 2);
            Mouse = inputType3;
            $VALUES = new InputType[]{inputType, inputType2, inputType3};
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes3.dex */
    public final class TextFieldTextDragObserver implements TextDragObserver {
        public final DialogHostKt$$ExternalSyntheticLambda0 requestFocus;
        public int dragBeginOffsetInText = -1;
        public long dragBeginPosition = 9205357640488583168L;
        public long dragTotalDistance = 0;
        public Handle actingHandle = Handle.SelectionEnd;
        public boolean isLongPressSelectionOnly = true;
        public SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustmentMode = SelectionAdjustment$Companion.None;

        public TextFieldTextDragObserver(DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0) {
            this.requestFocus = dialogHostKt$$ExternalSyntheticLambda0;
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public final void mo365onDownk4lQ0M() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public final void mo366onDragk4lQ0M(long j) {
            int intValue;
            int m410getOffsetForPosition3MmeM6k;
            SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0;
            AnnotatedString annotatedString;
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            boolean z = textFieldSelectionState.enabled;
            TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
            TextLayoutState textLayoutState = textFieldSelectionState.textLayoutState;
            if (!z || textLayoutState.getLayoutResult() == null || transformedTextFieldState.getVisualText().text.length() == 0) {
                return;
            }
            long m626plusMKHz9U = Offset.m626plusMKHz9U(this.dragTotalDistance, j);
            this.dragTotalDistance = m626plusMKHz9U;
            long m626plusMKHz9U2 = Offset.m626plusMKHz9U(this.dragBeginPosition, m626plusMKHz9U);
            if (this.dragBeginOffsetInText >= 0 || textLayoutState.m411isPositionOnTextk4lQ0M(m626plusMKHz9U2)) {
                TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                int length = (layoutResult == null || (annotatedString = layoutResult.layoutInput.text) == null) ? 0 : annotatedString.text.length();
                int i = this.dragBeginOffsetInText;
                Integer valueOf = Integer.valueOf(i);
                if (i < 0 || i > length) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : textLayoutState.m410getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                m410getOffsetForPosition3MmeM6k = textLayoutState.m410getOffsetForPosition3MmeM6k(m626plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && intValue == m410getOffsetForPosition3MmeM6k) {
                    return;
                }
                selectionAdjustment$Companion$$ExternalSyntheticLambda0 = this.selectionAdjustmentMode;
                textFieldSelectionState.setTextToolbarState(TextToolbarState.Selection);
            } else {
                intValue = textLayoutState.m410getOffsetForPosition3MmeM6k(this.dragBeginPosition, true);
                m410getOffsetForPosition3MmeM6k = textLayoutState.m410getOffsetForPosition3MmeM6k(m626plusMKHz9U2, true);
                selectionAdjustment$Companion$$ExternalSyntheticLambda0 = intValue == m410getOffsetForPosition3MmeM6k ? SelectionAdjustment$Companion.None : this.selectionAdjustmentMode;
            }
            SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda02 = selectionAdjustment$Companion$$ExternalSyntheticLambda0;
            int i2 = intValue;
            int i3 = m410getOffsetForPosition3MmeM6k;
            long j2 = transformedTextFieldState.getVisualText().selection;
            long m423updateSelectionQkiN0lo$foundation = textFieldSelectionState.m423updateSelectionQkiN0lo$foundation(textFieldSelectionState.textFieldState.getVisualText(), i2, i3, false, selectionAdjustment$Companion$$ExternalSyntheticLambda02, false, false, new HapticFeedbackType(9));
            if (this.dragBeginOffsetInText == -1 && !TextRange.m987getCollapsedimpl(m423updateSelectionQkiN0lo$foundation)) {
                this.dragBeginOffsetInText = (int) (m423updateSelectionQkiN0lo$foundation >> 32);
            }
            if (TextRange.m991getReversedimpl(m423updateSelectionQkiN0lo$foundation)) {
                m423updateSelectionQkiN0lo$foundation = SizeKt.TextRange((int) (m423updateSelectionQkiN0lo$foundation & BodyPartID.bodyIdMax), (int) (m423updateSelectionQkiN0lo$foundation >> 32));
            }
            if (!TextRange.m986equalsimpl0(m423updateSelectionQkiN0lo$foundation, j2)) {
                int i4 = (int) (m423updateSelectionQkiN0lo$foundation >> 32);
                int i5 = (int) (j2 >> 32);
                this.actingHandle = (i4 == i5 || ((int) (m423updateSelectionQkiN0lo$foundation & BodyPartID.bodyIdMax)) != ((int) (j2 & BodyPartID.bodyIdMax))) ? (i4 != i5 || ((int) (m423updateSelectionQkiN0lo$foundation & BodyPartID.bodyIdMax)) == ((int) (j2 & BodyPartID.bodyIdMax))) ? ((float) (i4 + ((int) (m423updateSelectionQkiN0lo$foundation & BodyPartID.bodyIdMax)))) / 2.0f > ((float) (i5 + ((int) (j2 & BodyPartID.bodyIdMax)))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart : Handle.SelectionEnd : Handle.SelectionStart;
                this.isLongPressSelectionOnly = false;
            }
            if (TextRange.m987getCollapsedimpl(j2) || !TextRange.m987getCollapsedimpl(m423updateSelectionQkiN0lo$foundation)) {
                transformedTextFieldState.m416selectCharsIn5zctL8(m423updateSelectionQkiN0lo$foundation);
            }
            textFieldSelectionState.m422updateHandleDraggingUv8p0NA(this.actingHandle, m626plusMKHz9U2);
        }

        public final void onDragStop() {
            if ((this.dragBeginPosition & 9223372034707292159L) != 9205357640488583168L) {
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                textFieldSelectionState.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                this.dragBeginPosition = 9205357640488583168L;
                this.dragTotalDistance = 0L;
                textFieldSelectionState.previousRawDragOffset = -1;
                this.selectionAdjustmentMode = SelectionAdjustment$Companion.None;
                textFieldSelectionState.directDragGestureInitiator$delegate.setValue(InputType.None);
                this.requestFocus.invoke();
                if (this.isLongPressSelectionOnly) {
                    textFieldSelectionState.maybeSuggestSelectionRange();
                }
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-3MmeM6k */
        public final void mo367onStart3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            boolean z = textFieldSelectionState.enabled;
            TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
            TextLayoutState textLayoutState = textFieldSelectionState.textLayoutState;
            if (z) {
                textFieldSelectionState.m422updateHandleDraggingUv8p0NA(this.actingHandle, j);
                textFieldSelectionState.setShowCursorHandle(false);
                textFieldSelectionState.directDragGestureInitiator$delegate.setValue(InputType.Touch);
                this.dragBeginPosition = j;
                this.dragTotalDistance = 0L;
                textFieldSelectionState.previousRawDragOffset = -1;
                this.isLongPressSelectionOnly = true;
                this.selectionAdjustmentMode = selectionAdjustment$Companion$$ExternalSyntheticLambda0;
                if (textLayoutState.getLayoutResult() == null) {
                    return;
                }
                if (textLayoutState.m411isPositionOnTextk4lQ0M(j)) {
                    if (transformedTextFieldState.getVisualText().text.length() == 0) {
                        return;
                    }
                    int m410getOffsetForPosition3MmeM6k = textLayoutState.m410getOffsetForPosition3MmeM6k(j, true);
                    long m423updateSelectionQkiN0lo$foundation = textFieldSelectionState.m423updateSelectionQkiN0lo$foundation(new TextFieldCharSequence(textFieldSelectionState.textFieldState.getVisualText(), TextRange.Zero, null, null, null, null, 60), m410getOffsetForPosition3MmeM6k, m410getOffsetForPosition3MmeM6k, false, this.selectionAdjustmentMode, false, false, new HapticFeedbackType(0));
                    transformedTextFieldState.m416selectCharsIn5zctL8(m423updateSelectionQkiN0lo$foundation);
                    textFieldSelectionState.setTextToolbarState(TextToolbarState.Selection);
                    this.dragBeginOffsetInText = (int) (m423updateSelectionQkiN0lo$foundation >> 32);
                    return;
                }
                int m410getOffsetForPosition3MmeM6k2 = textLayoutState.m410getOffsetForPosition3MmeM6k(j, true);
                PlatformHapticFeedback platformHapticFeedback = textFieldSelectionState.hapticFeedBack;
                if (platformHapticFeedback != null) {
                    platformHapticFeedback.m769performHapticFeedbackCdsT49E(0);
                }
                transformedTextFieldState.getClass();
                transformedTextFieldState.m416selectCharsIn5zctL8(SizeKt.TextRange(m410getOffsetForPosition3MmeM6k2, m410getOffsetForPosition3MmeM6k2));
                textFieldSelectionState.setShowCursorHandle(true);
                this.isLongPressSelectionOnly = false;
                textFieldSelectionState.setTextToolbarState(TextToolbarState.Cursor);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onUp() {
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z, boolean z2, boolean z3, ToolbarRequesterImpl toolbarRequesterImpl, CoroutineScope coroutineScope, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, AndroidClipboard androidClipboard) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.isFocused = z3;
        this.toolbarRequester = toolbarRequesterImpl;
        this.coroutineScope = coroutineScope;
        this.platformSelectionBehaviors = platformSelectionBehaviorsImpl;
        this.clipboard = androidClipboard;
        this.enabled = z;
        this.readOnly = z2;
        Boolean bool = Boolean.FALSE;
        this.showCursorHandle$delegate = Updater.mutableStateOf$default(bool);
        this.textToolbarState$delegate = Updater.mutableStateOf$default(TextToolbarState.None);
        this.textToolbarShown$delegate = Updater.mutableStateOf$default(bool);
        this.previousRawDragOffset = -1;
        this.derivedVisibleContentBounds$delegate = Updater.derivedStateOf(new BasicTextFieldKt$$ExternalSyntheticLambda15(this, 3));
        this.clipboardPasteState = new ClipboardPasteState(this.clipboard);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$detectCursorHandleDragGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, ContinuationImpl continuationImpl) {
        TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$1;
        int i;
        Ref$LongRef ref$LongRef;
        Throwable th;
        Ref$LongRef ref$LongRef2;
        textFieldSelectionState.getClass();
        if (continuationImpl instanceof TextFieldSelectionState$detectCursorHandleDragGestures$1) {
            textFieldSelectionState$detectCursorHandleDragGestures$1 = (TextFieldSelectionState$detectCursorHandleDragGestures$1) continuationImpl;
            int i2 = textFieldSelectionState$detectCursorHandleDragGestures$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                textFieldSelectionState$detectCursorHandleDragGestures$1.label = i2 - PKIFailureInfo.systemUnavail;
                TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$12 = textFieldSelectionState$detectCursorHandleDragGestures$1;
                Object obj = textFieldSelectionState$detectCursorHandleDragGestures$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textFieldSelectionState$detectCursorHandleDragGestures$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.element = 9205357640488583168L;
                    Ref$LongRef ref$LongRef4 = new Ref$LongRef();
                    ref$LongRef4.element = 9205357640488583168L;
                    try {
                        MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(12, ref$LongRef3, textFieldSelectionState, ref$LongRef4);
                        TextFieldSelectionState$$ExternalSyntheticLambda5 textFieldSelectionState$$ExternalSyntheticLambda5 = new TextFieldSelectionState$$ExternalSyntheticLambda5(ref$LongRef3, ref$LongRef4, textFieldSelectionState, 0);
                        TextFieldSelectionState$$ExternalSyntheticLambda5 textFieldSelectionState$$ExternalSyntheticLambda52 = new TextFieldSelectionState$$ExternalSyntheticLambda5(ref$LongRef3, ref$LongRef4, textFieldSelectionState, 2);
                        MenuKt$$ExternalSyntheticLambda1 menuKt$$ExternalSyntheticLambda1 = new MenuKt$$ExternalSyntheticLambda1(4, ref$LongRef4, textFieldSelectionState, ref$LongRef3);
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$0 = ref$LongRef3;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$1 = ref$LongRef4;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.label = 1;
                        if (DragGestureDetectorKt.detectDragGestures(pointerInputScope, menuKt$$ExternalSyntheticLambda0, textFieldSelectionState$$ExternalSyntheticLambda5, textFieldSelectionState$$ExternalSyntheticLambda52, menuKt$$ExternalSyntheticLambda1, textFieldSelectionState$detectCursorHandleDragGestures$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$LongRef = ref$LongRef3;
                        ref$LongRef2 = ref$LongRef4;
                    } catch (Throwable th2) {
                        ref$LongRef = ref$LongRef3;
                        th = th2;
                        ref$LongRef2 = ref$LongRef4;
                        detectCursorHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef, ref$LongRef2);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$LongRef2 = textFieldSelectionState$detectCursorHandleDragGestures$12.L$1;
                    ref$LongRef = textFieldSelectionState$detectCursorHandleDragGestures$12.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        detectCursorHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef, ref$LongRef2);
                        throw th;
                    }
                }
                detectCursorHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef, ref$LongRef2);
                return Unit.INSTANCE;
            }
        }
        textFieldSelectionState$detectCursorHandleDragGestures$1 = new TextFieldSelectionState$detectCursorHandleDragGestures$1(textFieldSelectionState, continuationImpl);
        TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$122 = textFieldSelectionState$detectCursorHandleDragGestures$1;
        Object obj2 = textFieldSelectionState$detectCursorHandleDragGestures$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionState$detectCursorHandleDragGestures$122.label;
        if (i != 0) {
        }
        detectCursorHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef, ref$LongRef2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$detectSelectionHandleDragGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, ContinuationImpl continuationImpl) {
        TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$1;
        int i;
        Handle handle;
        Ref$LongRef ref$LongRef;
        Ref$LongRef ref$LongRef2;
        Ref$LongRef ref$LongRef3;
        Ref$LongRef ref$LongRef4;
        if (continuationImpl instanceof TextFieldSelectionState$detectSelectionHandleDragGestures$1) {
            textFieldSelectionState$detectSelectionHandleDragGestures$1 = (TextFieldSelectionState$detectSelectionHandleDragGestures$1) continuationImpl;
            int i2 = textFieldSelectionState$detectSelectionHandleDragGestures$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                textFieldSelectionState$detectSelectionHandleDragGestures$1.label = i2 - PKIFailureInfo.systemUnavail;
                TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$12 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
                Object obj = textFieldSelectionState$detectSelectionHandleDragGestures$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textFieldSelectionState$detectSelectionHandleDragGestures$12.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                    ref$LongRef5.element = 9205357640488583168L;
                    Ref$LongRef ref$LongRef6 = new Ref$LongRef();
                    ref$LongRef6.element = 0L;
                    handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
                    try {
                        androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0(handle, textFieldSelectionState, ref$LongRef5, ref$LongRef6, z);
                        TextFieldSelectionState$$ExternalSyntheticLambda5 textFieldSelectionState$$ExternalSyntheticLambda5 = new TextFieldSelectionState$$ExternalSyntheticLambda5(ref$LongRef5, textFieldSelectionState, ref$LongRef6, 3);
                        TextFieldSelectionState$$ExternalSyntheticLambda5 textFieldSelectionState$$ExternalSyntheticLambda52 = new TextFieldSelectionState$$ExternalSyntheticLambda5(ref$LongRef5, textFieldSelectionState, ref$LongRef6, i3);
                        ref$LongRef4 = ref$LongRef5;
                        ref$LongRef3 = ref$LongRef6;
                        try {
                            LocalHomeGeoViewKt$$ExternalSyntheticLambda30 localHomeGeoViewKt$$ExternalSyntheticLambda30 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(handle, textFieldSelectionState, ref$LongRef3, ref$LongRef4, z);
                            ref$LongRef2 = ref$LongRef3;
                            ref$LongRef = ref$LongRef4;
                            try {
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.L$0 = ref$LongRef;
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.L$1 = ref$LongRef2;
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.L$2 = handle;
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.label = 1;
                                if (DragGestureDetectorKt.detectDragGestures(pointerInputScope, menuKt$$ExternalSyntheticLambda0, textFieldSelectionState$$ExternalSyntheticLambda5, textFieldSelectionState$$ExternalSyntheticLambda52, localHomeGeoViewKt$$ExternalSyntheticLambda30, textFieldSelectionState$detectSelectionHandleDragGestures$12) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                ref$LongRef3 = ref$LongRef2;
                                ref$LongRef4 = ref$LongRef;
                            } catch (Throwable th) {
                                th = th;
                                ref$LongRef3 = ref$LongRef2;
                                ref$LongRef4 = ref$LongRef;
                                if (textFieldSelectionState.getDraggingHandle() == handle) {
                                    detectSelectionHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef4, ref$LongRef3);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (textFieldSelectionState.getDraggingHandle() == handle) {
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ref$LongRef = ref$LongRef5;
                        ref$LongRef2 = ref$LongRef6;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    handle = textFieldSelectionState$detectSelectionHandleDragGestures$12.L$2;
                    ref$LongRef3 = textFieldSelectionState$detectSelectionHandleDragGestures$12.L$1;
                    ref$LongRef4 = textFieldSelectionState$detectSelectionHandleDragGestures$12.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        if (textFieldSelectionState.getDraggingHandle() == handle) {
                        }
                        throw th;
                    }
                }
                if (textFieldSelectionState.getDraggingHandle() == handle) {
                    detectSelectionHandleDragGestures$onDragStop(textFieldSelectionState, ref$LongRef4, ref$LongRef3);
                }
                return Unit.INSTANCE;
            }
        }
        textFieldSelectionState$detectSelectionHandleDragGestures$1 = new TextFieldSelectionState$detectSelectionHandleDragGestures$1(textFieldSelectionState, continuationImpl);
        TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$122 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
        Object obj2 = textFieldSelectionState$detectSelectionHandleDragGestures$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionState$detectSelectionHandleDragGestures$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        if (textFieldSelectionState.getDraggingHandle() == handle) {
        }
        return Unit.INSTANCE;
    }

    public static final void detectCursorHandleDragGestures$onDragStop(TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2) {
        if ((ref$LongRef.element & 9223372034707292159L) != 9205357640488583168L) {
            ref$LongRef.element = 9205357640488583168L;
            ref$LongRef2.element = 9205357640488583168L;
            textFieldSelectionState.clearHandleDragging();
        }
    }

    public static final void detectSelectionHandleDragGestures$onDragStop(TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2) {
        if ((ref$LongRef.element & 9223372034707292159L) != 9205357640488583168L) {
            textFieldSelectionState.clearHandleDragging();
            ref$LongRef.element = 9205357640488583168L;
            ref$LongRef2.element = 0L;
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    public final Rect calculateCursorRect(TextLayoutResult textLayoutResult, TextFieldCharSequence textFieldCharSequence) {
        if (!TextRange.m987getCollapsedimpl(textFieldCharSequence.selection)) {
            return Rect.Zero;
        }
        Rect cursorRect = textLayoutResult.getCursorRect((int) (textFieldCharSequence.selection >> 32));
        float floor = (float) Math.floor(this.density.mo236toPx0680j_4(2.0f));
        if (floor < 1.0f) {
            floor = 1.0f;
        }
        float f = textLayoutResult.layoutInput.layoutDirection == LayoutDirection.Ltr ? (floor / 2.0f) + cursorRect.left : cursorRect.right - (floor / 2.0f);
        float f2 = floor / 2.0f;
        float f3 = ((int) (textLayoutResult.size >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new Rect(floor2 - f2, cursorRect.top, floor2 + f2, cursorRect.bottom);
    }

    public final void clearHandleDragging() {
        this.draggingHandle$delegate.setValue(null);
        Recorder$$ExternalSyntheticOutline1.m(9205357640488583168L, this.rawHandleDragPosition$delegate);
        Recorder$$ExternalSyntheticOutline1.m(9205357640488583168L, this.startTextLayoutPositionInWindow$delegate);
    }

    public final Unit copy(boolean z, SuspendLambda suspendLambda) {
        AnnotatedString annotatedString;
        Unit clipEntry;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        if (TextRange.m987getCollapsedimpl(transformedTextFieldState.getVisualText().selection)) {
            annotatedString = null;
        } else {
            annotatedString = new AnnotatedString(RipplesKt.getSelectedText(transformedTextFieldState.getVisualText()).toString());
            if (z) {
                transformedTextFieldState.collapseSelectionToMax();
            }
        }
        return (annotatedString != null && (clipEntry = this.clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(annotatedString))) == CoroutineSingletons.COROUTINE_SUSPENDED) ? clipEntry : Unit.INSTANCE;
    }

    public final Unit cut(SuspendLambda suspendLambda) {
        AnnotatedString annotatedString;
        Unit clipEntry;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        if (TextRange.m987getCollapsedimpl(transformedTextFieldState.getVisualText().selection) || !getEditable$foundation()) {
            annotatedString = null;
        } else {
            annotatedString = new AnnotatedString(RipplesKt.getSelectedText(transformedTextFieldState.getVisualText()).toString());
            transformedTextFieldState.deleteSelectedText();
        }
        return (annotatedString != null && (clipEntry = this.clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(annotatedString))) == CoroutineSingletons.COROUTINE_SUSPENDED) ? clipEntry : Unit.INSTANCE;
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, SuspendLambda suspendLambda) {
        Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new HostFocusDirectorKt$depthFirst$1(this, null, 2), suspendLambda);
        return awaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if ((r0 != null ? androidx.compose.foundation.text.selection.SimpleLayoutKt.m448containsInclusiveUv8p0NA(r5, androidx.compose.foundation.text.selection.SimpleLayoutKt.visibleBounds(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextFieldHandleState getCursorHandleState$foundation(boolean z) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean booleanValue = ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
        boolean z2 = ((InputType) this.directDragGestureInitiator$delegate.getValue()) == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (booleanValue && z2 && TextRange.m987getCollapsedimpl(visualText.selection) && visualText.highlight == null && visualText.text.length() > 0) {
            if (draggingHandle != Handle.Cursor) {
                Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    long m630getBottomCenterF1C5BW0 = getCursorRect().m630getBottomCenterF1C5BW0();
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
                } catch (Throwable th) {
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            return new TextFieldHandleState(true, z ? getCursorRect().m630getBottomCenterF1C5BW0() : 9205357640488583168L, RecyclerView.DECELERATION_RATE, ResolvedTextDirection.Ltr, false);
        }
        return TextFieldHandleState.Hidden;
    }

    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        return layoutResult == null ? Rect.Zero : calculateCursorRect(layoutResult, this.textFieldState.getVisualText());
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final boolean getEditable$foundation() {
        return this.enabled && !this.readOnly;
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m419getHandleDragPositionF1C5BW0() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.rawHandleDragPosition$delegate;
        if ((((Offset) parcelableSnapshotMutableState.getValue()).packedValue & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.startTextLayoutPositionInWindow$delegate;
        if ((((Offset) parcelableSnapshotMutableState2.getValue()).packedValue & 9223372034707292159L) == 9205357640488583168L) {
            return MathUtilsKt.m397fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, ((Offset) parcelableSnapshotMutableState.getValue()).packedValue);
        }
        long j = ((Offset) parcelableSnapshotMutableState.getValue()).packedValue;
        long j2 = ((Offset) parcelableSnapshotMutableState2.getValue()).packedValue;
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return Offset.m626plusMKHz9U(j, Offset.m625minusMKHz9U(j2, textLayoutCoordinates != null ? textLayoutCoordinates.mo843localToWindowMKHz9U(0L) : 9205357640488583168L));
    }

    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m420getHandlePositiontuRUvjQ(boolean z) {
        long j;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return 0L;
        }
        long j2 = this.textFieldState.getVisualText().selection;
        if (z) {
            int i = TextRange.$r8$clinit;
            j = j2 >> 32;
        } else {
            int i2 = TextRange.$r8$clinit;
            j = BodyPartID.bodyIdMax & j2;
        }
        return SimpleLayoutKt.getSelectionHandleCoordinates(layoutResult, (int) j, z, TextRange.m991getReversedimpl(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if ((r1 != null ? androidx.compose.foundation.text.selection.SimpleLayoutKt.m448containsInclusiveUv8p0NA(r6, androidx.compose.foundation.text.selection.SimpleLayoutKt.visibleBounds(r1)) : false) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextFieldHandleState getSelectionHandleState$foundation(boolean z, boolean z2) {
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextFieldHandleState.Hidden;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long j = transformedTextFieldState.getVisualText().selection;
        if (TextRange.m987getCollapsedimpl(j)) {
            return TextFieldHandleState.Hidden;
        }
        long m420getHandlePositiontuRUvjQ = m420getHandlePositiontuRUvjQ(z);
        if (((InputType) this.directDragGestureInitiator$delegate.getValue()) == InputType.None) {
            if (getDraggingHandle() != handle) {
                LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            }
            if (transformedTextFieldState.getVisualText().highlight != null) {
                return TextFieldHandleState.Hidden;
            }
            ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(z ? (int) (j >> 32) : Math.max(((int) (j & BodyPartID.bodyIdMax)) - 1, 0));
            boolean m991getReversedimpl = TextRange.m991getReversedimpl(j);
            if (z2) {
                LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
                if (textLayoutCoordinates2 != null) {
                    m420getHandlePositiontuRUvjQ = MathUtilsKt.m394coerceIn3MmeM6k(m420getHandlePositiontuRUvjQ, SimpleLayoutKt.visibleBounds(textLayoutCoordinates2));
                }
            } else {
                m420getHandlePositiontuRUvjQ = 9205357640488583168L;
            }
            return new TextFieldHandleState(true, m420getHandlePositiontuRUvjQ, KeyMappingKt.getLineHeight(layoutResult, (int) (z ? j >> 32 : j & BodyPartID.bodyIdMax)), bidiRunDirection, m991getReversedimpl);
        }
        return TextFieldHandleState.Hidden;
    }

    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    public final void maybeSuggestSelectionRange() {
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = this.platformSelectionBehaviors;
        if (platformSelectionBehaviorsImpl == null) {
            return;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        CharSequence charSequence = transformedTextFieldState.getVisualText().text;
        long j = transformedTextFieldState.getVisualText().selection;
        if (charSequence.length() <= 0 || TextRange.m987getCollapsedimpl(j)) {
            return;
        }
        JobKt.launch$default(this.coroutineScope, null, CoroutineStart.UNDISPATCHED, new RepeatOnIntervalTaskRunner$repeatOn$2(platformSelectionBehaviorsImpl, charSequence, j, this, (Continuation) null), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (pasteAsPlainText(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (pasteAsPlainText(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object paste(ContinuationImpl continuationImpl) {
        TextFieldSelectionState$paste$1 textFieldSelectionState$paste$1;
        int i;
        if (continuationImpl instanceof TextFieldSelectionState$paste$1) {
            textFieldSelectionState$paste$1 = (TextFieldSelectionState$paste$1) continuationImpl;
            int i2 = textFieldSelectionState$paste$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                textFieldSelectionState$paste$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = textFieldSelectionState$paste$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textFieldSelectionState$paste$1.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        ClipEntry clipEntry = (ClipEntry) obj;
                        if (clipEntry != null) {
                            clipEntry.getClipMetadata();
                            throw null;
                        }
                        textFieldSelectionState$paste$1.label = 3;
                    } else {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                Function0 function0 = this.receiveContentConfiguration;
                if (function0 != null) {
                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(function0.invoke());
                }
                textFieldSelectionState$paste$1.label = 1;
            }
        }
        textFieldSelectionState$paste$1 = new TextFieldSelectionState$paste$1(this, continuationImpl);
        Object obj3 = textFieldSelectionState$paste$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionState$paste$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pasteAsPlainText(ContinuationImpl continuationImpl) {
        TextFieldSelectionState$pasteAsPlainText$1 textFieldSelectionState$pasteAsPlainText$1;
        int i;
        ClipEntry clipEntry;
        if (continuationImpl instanceof TextFieldSelectionState$pasteAsPlainText$1) {
            textFieldSelectionState$pasteAsPlainText$1 = (TextFieldSelectionState$pasteAsPlainText$1) continuationImpl;
            int i2 = textFieldSelectionState$pasteAsPlainText$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                textFieldSelectionState$pasteAsPlainText$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = textFieldSelectionState$pasteAsPlainText$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textFieldSelectionState$pasteAsPlainText$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidClipboard androidClipboard = this.clipboard;
                    textFieldSelectionState$pasteAsPlainText$1.label = 1;
                    ClipData primaryClip = androidClipboard.androidClipboardManager.getClipboardManager().getPrimaryClip();
                    obj = primaryClip != null ? new ClipEntry(primaryClip) : null;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        String str = (String) obj;
                        if (str != null) {
                            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                            TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, str, false, 10);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                clipEntry = (ClipEntry) obj;
                if (clipEntry != null) {
                    textFieldSelectionState$pasteAsPlainText$1.label = 2;
                    obj = ClipboardUtils_androidKt.readText(clipEntry);
                }
                return Unit.INSTANCE;
            }
        }
        textFieldSelectionState$pasteAsPlainText$1 = new TextFieldSelectionState$pasteAsPlainText$1(this, continuationImpl);
        Object obj3 = textFieldSelectionState$pasteAsPlainText$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionState$pasteAsPlainText$1.label;
        if (i != 0) {
        }
        clipEntry = (ClipEntry) obj3;
        if (clipEntry != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m421placeCursorAtNearestOffsetk4lQ0M(long j) {
        int m966getOffsetForPositionk4lQ0M;
        boolean z;
        long j2;
        long j3;
        int i;
        long TextRange;
        SelectionWedgeAffinity selectionWedgeAffinity;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (m966getOffsetForPositionk4lQ0M = layoutResult.multiParagraph.m966getOffsetForPositionk4lQ0M(j)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long m413mapFromTransformedjx7JFs = transformedTextFieldState.m413mapFromTransformedjx7JFs(m966getOffsetForPositionk4lQ0M);
        long m415mapToTransformedGEjPoXI = transformedTextFieldState.m415mapToTransformedGEjPoXI(m413mapFromTransformedjx7JFs);
        int ordinal = ((TextRange.m987getCollapsedimpl(m413mapFromTransformedjx7JFs) && TextRange.m987getCollapsedimpl(m415mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m987getCollapsedimpl(m413mapFromTransformedjx7JFs) || TextRange.m987getCollapsedimpl(m415mapToTransformedGEjPoXI)) ? (!TextRange.m987getCollapsedimpl(m413mapFromTransformedjx7JFs) || TextRange.m987getCollapsedimpl(m415mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal();
        SelectionWedgeAffinity selectionWedgeAffinity2 = null;
        if (ordinal == 0) {
            z = false;
            j2 = m413mapFromTransformedjx7JFs;
        } else if (ordinal == 1) {
            z = false;
            j2 = m413mapFromTransformedjx7JFs;
            if (MathUtilsKt.m396findClosestRect9KIMszo(j, layoutResult.getCursorRect((int) (m415mapToTransformedGEjPoXI >> 32)), layoutResult.getCursorRect((int) (m415mapToTransformedGEjPoXI & BodyPartID.bodyIdMax))) < 0) {
                WedgeAffinity wedgeAffinity = WedgeAffinity.Start;
                selectionWedgeAffinity = new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity);
            } else {
                WedgeAffinity wedgeAffinity2 = WedgeAffinity.End;
                selectionWedgeAffinity = new SelectionWedgeAffinity(wedgeAffinity2, wedgeAffinity2);
            }
            selectionWedgeAffinity2 = selectionWedgeAffinity;
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return false;
                }
                i = (int) (m413mapFromTransformedjx7JFs >> 32);
                z = false;
                TextRange = SizeKt.TextRange(i, i);
                if (!TextRange.m986equalsimpl0(TextRange, transformedTextFieldState.textFieldState.getValue$foundation().selection) && (selectionWedgeAffinity2 == null || selectionWedgeAffinity2.equals(transformedTextFieldState.getSelectionWedgeAffinity()))) {
                    return z;
                }
                transformedTextFieldState.m417selectUntransformedCharsIn5zctL8(TextRange);
                if (selectionWedgeAffinity2 != null) {
                    transformedTextFieldState.selectionWedgeAffinity$delegate.setValue(selectionWedgeAffinity2);
                }
                return true;
            }
            z = false;
            j2 = m413mapFromTransformedjx7JFs;
            if (MathUtilsKt.m396findClosestRect9KIMszo(j, layoutResult.getCursorRect((int) (m415mapToTransformedGEjPoXI >> 32)), layoutResult.getCursorRect((int) (m415mapToTransformedGEjPoXI & BodyPartID.bodyIdMax))) >= 0) {
                j3 = j2 & BodyPartID.bodyIdMax;
                i = (int) j3;
                TextRange = SizeKt.TextRange(i, i);
                if (!TextRange.m986equalsimpl0(TextRange, transformedTextFieldState.textFieldState.getValue$foundation().selection)) {
                }
                transformedTextFieldState.m417selectUntransformedCharsIn5zctL8(TextRange);
                if (selectionWedgeAffinity2 != null) {
                }
                return true;
            }
        }
        j3 = j2 >> 32;
        i = (int) j3;
        TextRange = SizeKt.TextRange(i, i);
        if (!TextRange.m986equalsimpl0(TextRange, transformedTextFieldState.textFieldState.getValue$foundation().selection)) {
        }
        transformedTextFieldState.m417selectUntransformedCharsIn5zctL8(TextRange);
        if (selectionWedgeAffinity2 != null) {
        }
        return true;
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startToolbarAndHandlesVisibilityObserver(ContinuationImpl continuationImpl) {
        TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1;
        int i;
        ToolbarRequesterImpl toolbarRequesterImpl;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode;
        StandaloneCoroutine standaloneCoroutine;
        try {
            if (continuationImpl instanceof TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) {
                textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = (TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) continuationImpl;
                int i2 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label;
                    toolbarRequesterImpl = this.toolbarRequester;
                    parcelableSnapshotMutableState = this.textToolbarState$delegate;
                    CancellationException cancellationException = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2 = new RealGcmRegistrar$unregister$2((Object) this, (Continuation) (objArr == true ? 1 : 0), 2);
                        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label = 1;
                        obj = JobKt.coroutineScope(realGcmRegistrar$unregister$2, textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } finally {
            setShowCursorHandle(false);
            if (((TextToolbarState) parcelableSnapshotMutableState.getValue()) != TextToolbarState.None && (textContextMenuToolbarHandlerNode = toolbarRequesterImpl.toolbarHandlerNode) != null && (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) != null) {
                standaloneCoroutine.cancel(null);
                textContextMenuToolbarHandlerNode.textToolbarJob = null;
            }
        }
        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = new TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1(this, continuationImpl);
        Object obj2 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label;
        toolbarRequesterImpl = this.toolbarRequester;
        parcelableSnapshotMutableState = this.textToolbarState$delegate;
        CancellationException cancellationException2 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0.hasMimeType("text/*") == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit updateClipboardEntry() {
        ClipboardPasteState clipboardPasteState = this.clipboardPasteState;
        AndroidClipboard androidClipboard = clipboardPasteState.clipboard;
        boolean z = androidClipboard.androidClipboardManager.getClipboardManager().hasPrimaryClip() && (r0 = androidClipboard.androidClipboardManager.getClipboardManager().getPrimaryClipDescription()) != null;
        clipboardPasteState._hasText = z;
        Unit unit = Unit.INSTANCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return unit;
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m422updateHandleDraggingUv8p0NA(Handle handle, long j) {
        this.draggingHandle$delegate.setValue(handle);
        Recorder$$ExternalSyntheticOutline1.m(j, this.rawHandleDragPosition$delegate);
    }

    /* renamed from: updateSelection-QkiN0lo$foundation, reason: not valid java name */
    public final long m423updateSelectionQkiN0lo$foundation(TextFieldCharSequence textFieldCharSequence, int i, int i2, boolean z, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, boolean z2, boolean z3, HapticFeedbackType hapticFeedbackType) {
        long j;
        PlatformHapticFeedback platformHapticFeedback;
        long j2 = textFieldCharSequence.selection;
        TextRange textRange = new TextRange(j2);
        if (z3 || (!z2 && TextRange.m987getCollapsedimpl(j2))) {
            textRange = null;
        }
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            j = TextRange.Zero;
        } else if (textRange == null && Intrinsics.areEqual(selectionAdjustment$Companion$$ExternalSyntheticLambda0, SelectionAdjustment$Companion.Character)) {
            j = SizeKt.TextRange(i, i2);
        } else {
            SingleSelectionLayout m451getTextFieldSelectionLayoutRcvTLA = SimpleLayoutKt.m451getTextFieldSelectionLayoutRcvTLA(layoutResult, i, i2, this.previousRawDragOffset, textRange != null ? textRange.packedValue : TextRange.Zero, textRange == null, z);
            if (textRange == null || m451getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
                long m441toTextRanged9O1mEE = selectionAdjustment$Companion$$ExternalSyntheticLambda0.adjust(m451getTextFieldSelectionLayoutRcvTLA).m441toTextRanged9O1mEE();
                this.previousSelectionLayout = m451getTextFieldSelectionLayoutRcvTLA;
                this.previousRawDragOffset = z ? i : i2;
                j = m441toTextRanged9O1mEE;
            } else {
                j = textRange.packedValue;
            }
        }
        if (hapticFeedbackType != null && ((TextRange.m990getMinimpl(j) != TextRange.m990getMinimpl(j2) || TextRange.m989getMaximpl(j) != TextRange.m989getMaximpl(j2)) && (platformHapticFeedback = this.hapticFeedBack) != null)) {
            platformHapticFeedback.m769performHapticFeedbackCdsT49E(hapticFeedbackType.m768unboximpl());
        }
        return j;
    }
}
