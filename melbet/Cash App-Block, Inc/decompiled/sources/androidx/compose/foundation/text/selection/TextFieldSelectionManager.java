package androidx.compose.foundation.text.selection;

import android.content.ClipDescription;
import androidx.camera.video.VideoCapture;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda8;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldSelectionManager {
    public AndroidClipboard clipboard;
    public CoroutineScope coroutineScope;
    public final ParcelableSnapshotMutableState currentDragPosition$delegate;
    public long dragBeginPosition;
    public TextRange dragBeginSelection;
    public long dragTotalDistance;
    public final ParcelableSnapshotMutableState draggingHandle$delegate;
    public final ParcelableSnapshotMutableState editable$delegate;
    public final ParcelableSnapshotMutableState enabled$delegate;
    public FocusRequester focusRequester;
    public PlatformHapticFeedback hapticFeedBack;
    public final ParcelableSnapshotMutableState hasAvailableTextToPaste$delegate;
    public TextRange latestSelection;
    public final VideoCapture.AnonymousClass3 mouseSelectionObserver;
    public TextFieldValue oldValue;
    public PlatformSelectionBehaviorsImpl platformSelectionBehaviors;
    public int previousRawDragOffset;
    public SingleSelectionLayout previousSelectionLayout;
    public Function0 requestAutofillAction;
    public LegacyTextFieldState state;
    public boolean textToolbarShownViaProvider;
    public final ToolbarRequesterImpl toolbarRequester;
    public final TextFieldSelectionManager$touchSelectionObserver$1 touchSelectionObserver;
    public final UndoManager undoManager;
    public OffsetMapping offsetMapping = ValidatingOffsetMappingKt.ValidatingEmptyOffsetMappingIdentity;
    public Function1 onValueChange = new ButtonKt$$ExternalSyntheticLambda2(6);
    public final ParcelableSnapshotMutableState valueState = Updater.mutableStateOf$default(new TextFieldValue((String) null, 0, 7));

    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1] */
    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        Boolean bool = Boolean.TRUE;
        this.editable$delegate = Updater.mutableStateOf$default(bool);
        this.enabled$delegate = Updater.mutableStateOf$default(bool);
        this.dragBeginPosition = 0L;
        this.dragTotalDistance = 0L;
        this.draggingHandle$delegate = Updater.mutableStateOf$default(null);
        this.currentDragPosition$delegate = Updater.mutableStateOf$default(null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, 7);
        this.hasAvailableTextToPaste$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.toolbarRequester = new ToolbarRequesterImpl();
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            public TextRange runningSelection;
            public boolean isLongPressSelectionOnly = true;
            public SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustmentMode = SelectionAdjustment$Companion.None;

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public final void mo365onDownk4lQ0M() {
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void mo366onDragk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                long m454access$updateSelectionjSglsI8;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (!textFieldSelectionManager.getEnabled() || textFieldSelectionManager.getValue$foundation().annotatedString.text.length() == 0) {
                    return;
                }
                textFieldSelectionManager.dragTotalDistance = Offset.m626plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
                if (legacyTextFieldState != null && (layoutResult = legacyTextFieldState.getLayoutResult()) != null) {
                    textFieldSelectionManager.currentDragPosition$delegate.setValue(new Offset(Offset.m626plusMKHz9U(textFieldSelectionManager.dragBeginPosition, textFieldSelectionManager.dragTotalDistance)));
                    if (textFieldSelectionManager.dragBeginSelection == null) {
                        Offset m457getCurrentDragPosition_m7T9E = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                        m457getCurrentDragPosition_m7T9E.getClass();
                        if (!layoutResult.m370isPositionOnTextk4lQ0M(m457getCurrentDragPosition_m7T9E.packedValue)) {
                            int transformedToOriginal = textFieldSelectionManager.offsetMapping.transformedToOriginal(layoutResult.m369getOffsetForPosition3MmeM6k(textFieldSelectionManager.dragBeginPosition, true));
                            OffsetMapping offsetMapping = textFieldSelectionManager.offsetMapping;
                            Offset m457getCurrentDragPosition_m7T9E2 = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                            m457getCurrentDragPosition_m7T9E2.getClass();
                            SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0 = transformedToOriginal == offsetMapping.transformedToOriginal(layoutResult.m369getOffsetForPosition3MmeM6k(m457getCurrentDragPosition_m7T9E2.packedValue, true)) ? SelectionAdjustment$Companion.None : SelectionAdjustment$Companion.Word;
                            TextFieldValue value$foundation = textFieldSelectionManager.getValue$foundation();
                            Offset m457getCurrentDragPosition_m7T9E3 = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                            m457getCurrentDragPosition_m7T9E3.getClass();
                            m454access$updateSelectionjSglsI8 = TextFieldSelectionManager.m454access$updateSelectionjSglsI8(textFieldSelectionManager, value$foundation, m457getCurrentDragPosition_m7T9E3.packedValue, false, false, selectionAdjustment$Companion$$ExternalSyntheticLambda0, true, new HapticFeedbackType(9));
                            this.runningSelection = new TextRange(m454access$updateSelectionjSglsI8);
                            if (!TextRange.m985equalsimpl(textFieldSelectionManager.dragBeginSelection, m454access$updateSelectionjSglsI8)) {
                                this.isLongPressSelectionOnly = false;
                            }
                        }
                    }
                    TextRange textRange = textFieldSelectionManager.dragBeginSelection;
                    int m369getOffsetForPosition3MmeM6k = textRange != null ? (int) (textRange.packedValue >> 32) : layoutResult.m369getOffsetForPosition3MmeM6k(textFieldSelectionManager.dragBeginPosition, false);
                    Offset m457getCurrentDragPosition_m7T9E4 = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                    m457getCurrentDragPosition_m7T9E4.getClass();
                    int m369getOffsetForPosition3MmeM6k2 = layoutResult.m369getOffsetForPosition3MmeM6k(m457getCurrentDragPosition_m7T9E4.packedValue, false);
                    if (textFieldSelectionManager.dragBeginSelection == null && m369getOffsetForPosition3MmeM6k == m369getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    TextFieldValue value$foundation2 = textFieldSelectionManager.getValue$foundation();
                    Offset m457getCurrentDragPosition_m7T9E5 = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                    m457getCurrentDragPosition_m7T9E5.getClass();
                    m454access$updateSelectionjSglsI8 = TextFieldSelectionManager.m454access$updateSelectionjSglsI8(textFieldSelectionManager, value$foundation2, m457getCurrentDragPosition_m7T9E5.packedValue, false, false, this.selectionAdjustmentMode, true, new HapticFeedbackType(9));
                    this.runningSelection = new TextRange(m454access$updateSelectionjSglsI8);
                    if (!TextRange.m985equalsimpl(textFieldSelectionManager.dragBeginSelection, m454access$updateSelectionjSglsI8)) {
                    }
                }
                textFieldSelectionManager.updateFloatingToolbar(false);
            }

            public final void onEnd() {
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.draggingHandle$delegate.setValue(null);
                textFieldSelectionManager.currentDragPosition$delegate.setValue(null);
                this.selectionAdjustmentMode = SelectionAdjustment$Companion.None;
                textFieldSelectionManager.updateFloatingToolbar(true);
                TextRange textRange = this.runningSelection;
                boolean m987getCollapsedimpl = TextRange.m987getCollapsedimpl(textRange != null ? textRange.packedValue : textFieldSelectionManager.getValue$foundation().selection);
                textFieldSelectionManager.setHandleState(m987getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
                if (legacyTextFieldState != null) {
                    legacyTextFieldState.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(!m987getCollapsedimpl && SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true)));
                }
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                if (legacyTextFieldState2 != null) {
                    legacyTextFieldState2.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(!m987getCollapsedimpl && SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false)));
                }
                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.state;
                if (legacyTextFieldState3 != null) {
                    legacyTextFieldState3.showCursorHandle$delegate.setValue(Boolean.valueOf(m987getCollapsedimpl && SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true)));
                }
                if (this.isLongPressSelectionOnly) {
                    TextFieldSelectionManager.m453access$maybeSuggestSelectionOEnZFl4(textFieldSelectionManager, textFieldSelectionManager.dragBeginSelection);
                }
                textFieldSelectionManager.dragBeginSelection = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public final void mo367onStart3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSelectionManager.draggingHandle$delegate;
                if (textFieldSelectionManager.getEnabled() && ((Handle) parcelableSnapshotMutableState.getValue()) == null) {
                    parcelableSnapshotMutableState.setValue(Handle.SelectionEnd);
                    textFieldSelectionManager.previousRawDragOffset = -1;
                    this.isLongPressSelectionOnly = true;
                    this.selectionAdjustmentMode = selectionAdjustment$Companion$$ExternalSyntheticLambda0;
                    textFieldSelectionManager.hideSelectionToolbar$foundation();
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
                    if (legacyTextFieldState == null || (layoutResult2 = legacyTextFieldState.getLayoutResult()) == null || !layoutResult2.m370isPositionOnTextk4lQ0M(j)) {
                        j2 = j;
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                        if (legacyTextFieldState2 != null && (layoutResult = legacyTextFieldState2.getLayoutResult()) != null) {
                            int transformedToOriginal = textFieldSelectionManager.offsetMapping.transformedToOriginal(layoutResult.m369getOffsetForPosition3MmeM6k(j2, true));
                            TextFieldValue m455createTextFieldValueFDrldGo = TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().annotatedString, SizeKt.TextRange(transformedToOriginal, transformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation(false);
                            PlatformHapticFeedback platformHapticFeedback = textFieldSelectionManager.hapticFeedBack;
                            if (platformHapticFeedback != null) {
                                platformHapticFeedback.m769performHapticFeedbackCdsT49E(0);
                            }
                            textFieldSelectionManager.onValueChange.invoke(m455createTextFieldValueFDrldGo);
                            textFieldSelectionManager.latestSelection = new TextRange(m455createTextFieldValueFDrldGo.selection);
                        }
                        this.isLongPressSelectionOnly = false;
                    } else {
                        if (textFieldSelectionManager.getValue$foundation().annotatedString.text.length() == 0) {
                            return;
                        }
                        textFieldSelectionManager.enterSelectionMode$foundation(false);
                        long m454access$updateSelectionjSglsI8 = TextFieldSelectionManager.m454access$updateSelectionjSglsI8(textFieldSelectionManager, TextFieldValue.m1001copy3r_uNRQ$default(textFieldSelectionManager.getValue$foundation(), (AnnotatedString) null, TextRange.Zero, 5), j, true, false, this.selectionAdjustmentMode, true, new HapticFeedbackType(0));
                        j2 = j;
                        textFieldSelectionManager.dragBeginSelection = new TextRange(m454access$updateSelectionjSglsI8);
                        this.runningSelection = new TextRange(m454access$updateSelectionjSglsI8);
                    }
                    textFieldSelectionManager.setHandleState(HandleState.None);
                    textFieldSelectionManager.dragBeginPosition = j2;
                    textFieldSelectionManager.currentDragPosition$delegate.setValue(new Offset(j2));
                    textFieldSelectionManager.dragTotalDistance = 0L;
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
            }
        };
        this.mouseSelectionObserver = new VideoCapture.AnonymousClass3(this);
    }

    public static final Pair access$getContextTextAndSelection(TextFieldSelectionManager textFieldSelectionManager) {
        String str;
        TextRange textRange;
        AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
        if (transformedText$foundation == null || (str = transformedText$foundation.text) == null || (textRange = textFieldSelectionManager.latestSelection) == null) {
            return null;
        }
        long j = textRange.packedValue;
        return new Pair(str, new TextRange(SizeKt.TextRange(textFieldSelectionManager.offsetMapping.originalToTransformed((int) (j >> 32)), textFieldSelectionManager.offsetMapping.originalToTransformed((int) (j & BodyPartID.bodyIdMax)))));
    }

    /* renamed from: access$maybeSuggestSelection-OEnZFl4, reason: not valid java name */
    public static final void m453access$maybeSuggestSelectionOEnZFl4(TextFieldSelectionManager textFieldSelectionManager, TextRange textRange) {
        AnnotatedString transformedText$foundation;
        String str;
        CoroutineScope coroutineScope;
        if (textRange == null) {
            return;
        }
        long j = textRange.packedValue;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = textFieldSelectionManager.platformSelectionBehaviors;
        if (platformSelectionBehaviorsImpl == null || (transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation()) == null || (str = transformedText$foundation.text) == null) {
            return;
        }
        OffsetMapping offsetMapping = textFieldSelectionManager.offsetMapping;
        long TextRange = SizeKt.TextRange(offsetMapping.originalToTransformed((int) (j >> 32)), offsetMapping.originalToTransformed((int) (j & BodyPartID.bodyIdMax)));
        if (str.length() <= 0 || TextRange.m987getCollapsedimpl(TextRange) || (coroutineScope = textFieldSelectionManager.coroutineScope) == null) {
            return;
        }
        JobKt.launch$default(coroutineScope, null, null, new ContentInViewNode$launchAnimation$2.AnonymousClass1(platformSelectionBehaviorsImpl, str, TextRange, textRange, textFieldSelectionManager, offsetMapping, null), 3);
    }

    /* renamed from: access$updateSelection-jSglsI8, reason: not valid java name */
    public static final long m454access$updateSelectionjSglsI8(TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, long j, boolean z, boolean z2, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, boolean z3, HapticFeedbackType hapticFeedbackType) {
        TextLayoutResultProxy layoutResult;
        char c;
        PlatformHapticFeedback platformHapticFeedback;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.Zero;
        }
        OffsetMapping offsetMapping = textFieldSelectionManager.offsetMapping;
        long j2 = textFieldValue.selection;
        AnnotatedString annotatedString = textFieldValue.annotatedString;
        int i = TextRange.$r8$clinit;
        long TextRange = SizeKt.TextRange(offsetMapping.originalToTransformed((int) (j2 >> 32)), textFieldSelectionManager.offsetMapping.originalToTransformed((int) (j2 & BodyPartID.bodyIdMax)));
        boolean z4 = false;
        int m369getOffsetForPosition3MmeM6k = layoutResult.m369getOffsetForPosition3MmeM6k(j, false);
        int i2 = (z2 || z) ? m369getOffsetForPosition3MmeM6k : (int) (TextRange >> 32);
        int i3 = (!z2 || z) ? m369getOffsetForPosition3MmeM6k : (int) (TextRange & BodyPartID.bodyIdMax);
        SingleSelectionLayout singleSelectionLayout = textFieldSelectionManager.previousSelectionLayout;
        int i4 = -1;
        if (z || singleSelectionLayout == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = textFieldSelectionManager.previousRawDragOffset;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        SingleSelectionLayout m451getTextFieldSelectionLayoutRcvTLA = SimpleLayoutKt.m451getTextFieldSelectionLayoutRcvTLA(layoutResult.value, i2, i3, i4, TextRange, z, z2);
        if (m451getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(singleSelectionLayout)) {
            textFieldSelectionManager.previousSelectionLayout = m451getTextFieldSelectionLayoutRcvTLA;
            textFieldSelectionManager.previousRawDragOffset = m369getOffsetForPosition3MmeM6k;
            Selection adjust = selectionAdjustment$Companion$$ExternalSyntheticLambda0.adjust(m451getTextFieldSelectionLayoutRcvTLA);
            long TextRange2 = SizeKt.TextRange(textFieldSelectionManager.offsetMapping.transformedToOriginal(adjust.start.offset), textFieldSelectionManager.offsetMapping.transformedToOriginal(adjust.end.offset));
            if (!TextRange.m986equalsimpl0(TextRange2, j2)) {
                boolean z5 = TextRange.m991getReversedimpl(TextRange2) != TextRange.m991getReversedimpl(j2) && TextRange.m986equalsimpl0(SizeKt.TextRange((int) (BodyPartID.bodyIdMax & TextRange2), (int) (TextRange2 >> c)), j2);
                boolean z6 = TextRange.m987getCollapsedimpl(TextRange2) && TextRange.m987getCollapsedimpl(j2);
                if (z3 && annotatedString.text.length() > 0 && !z5 && !z6 && hapticFeedbackType != null && (platformHapticFeedback = textFieldSelectionManager.hapticFeedBack) != null) {
                    platformHapticFeedback.m769performHapticFeedbackCdsT49E(hapticFeedbackType.value);
                }
                textFieldSelectionManager.onValueChange.invoke(m455createTextFieldValueFDrldGo(annotatedString, TextRange2));
                textFieldSelectionManager.latestSelection = new TextRange(TextRange2);
                if (!z3) {
                    textFieldSelectionManager.updateFloatingToolbar(!TextRange.m987getCollapsedimpl(TextRange2));
                }
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                if (legacyTextFieldState2 != null) {
                    legacyTextFieldState2.isInTouchMode$delegate.setValue(Boolean.valueOf(z3));
                }
                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.state;
                if (legacyTextFieldState3 != null) {
                    legacyTextFieldState3.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(!TextRange.m987getCollapsedimpl(TextRange2) && SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true)));
                }
                LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.state;
                if (legacyTextFieldState4 != null) {
                    legacyTextFieldState4.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(!TextRange.m987getCollapsedimpl(TextRange2) && SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false)));
                }
                LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.state;
                if (legacyTextFieldState5 != null) {
                    if (TextRange.m987getCollapsedimpl(TextRange2) && SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true)) {
                        z4 = true;
                    }
                    legacyTextFieldState5.showCursorHandle$delegate.setValue(Boolean.valueOf(z4));
                }
                return TextRange2;
            }
        }
        return j2;
    }

    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public static TextFieldValue m455createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null);
    }

    public final StandaloneCoroutine copy$foundation(boolean z) {
        CoroutineScope coroutineScope = this.coroutineScope;
        Continuation continuation = null;
        if (coroutineScope != null) {
            return JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new RealBoostSyncer$refresh$1(this, z, continuation, 1), 1);
        }
        return null;
    }

    public final void cut$foundation() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null, 0), 1);
        }
    }

    /* renamed from: deselect-_kEHs6E$foundation, reason: not valid java name */
    public final void m456deselect_kEHs6E$foundation(Offset offset) {
        if (!TextRange.m987getCollapsedimpl(getValue$foundation().selection)) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            int m989getMaximpl = (offset == null || layoutResult == null) ? TextRange.m989getMaximpl(getValue$foundation().selection) : this.offsetMapping.transformedToOriginal(layoutResult.m369getOffsetForPosition3MmeM6k(offset.packedValue, true));
            TextFieldValue m1001copy3r_uNRQ$default = TextFieldValue.m1001copy3r_uNRQ$default(getValue$foundation(), (AnnotatedString) null, SizeKt.TextRange(m989getMaximpl, m989getMaximpl), 5);
            this.onValueChange.invoke(m1001copy3r_uNRQ$default);
            this.latestSelection = new TextRange(m1001copy3r_uNRQ$default.selection);
        }
        setHandleState((offset == null || getValue$foundation().annotatedString.text.length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation(boolean z) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
        }
        this.oldValue = getValue$foundation();
        updateFloatingToolbar(z);
        setHandleState(HandleState.Selection);
    }

    public final Modifier getContextMenuAreaModifier() {
        if (!getEnabled()) {
            return Modifier.Companion.$$INSTANCE;
        }
        Continuation continuation = null;
        return TextContextMenuModifierKt.textContextMenuToolbarHandler(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(new TextFieldSelectionManager$cut$1(this, continuation, 1)), this.toolbarRequester, new Scene.AnonymousClass1(this, continuation, 5), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, continuation, 0), new CoreTextFieldKt$$ExternalSyntheticLambda8(this, 2));
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m457getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation, reason: not valid java name */
    public final long m458getHandlePositiontuRUvjQ$foundation(boolean z) {
        TextLayoutResultProxy layoutResult;
        long j;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return 9205357640488583168L;
        }
        TextLayoutResult textLayoutResult = layoutResult.value;
        AnnotatedString transformedText$foundation = getTransformedText$foundation();
        if (transformedText$foundation == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.areEqual(transformedText$foundation.text, textLayoutResult.layoutInput.text.text)) {
            return 9205357640488583168L;
        }
        TextFieldValue value$foundation = getValue$foundation();
        if (z) {
            long j2 = value$foundation.selection;
            int i = TextRange.$r8$clinit;
            j = j2 >> 32;
        } else {
            long j3 = value$foundation.selection;
            int i2 = TextRange.$r8$clinit;
            j = j3 & BodyPartID.bodyIdMax;
        }
        return SimpleLayoutKt.getSelectionHandleCoordinates(textLayoutResult, this.offsetMapping.originalToTransformed((int) j), z, TextRange.m991getReversedimpl(getValue$foundation().selection));
    }

    public final AnnotatedString getTransformedText$foundation() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            return legacyTextFieldState.textDelegate.text;
        }
        return null;
    }

    public final TextFieldValue getValue$foundation() {
        return (TextFieldValue) this.valueState.getValue();
    }

    public final void hideSelectionToolbar$foundation() {
        StandaloneCoroutine standaloneCoroutine;
        TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = this.toolbarRequester.toolbarHandlerNode;
        if (textContextMenuToolbarHandlerNode == null || (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) == null) {
            return;
        }
        standaloneCoroutine.cancel(null);
        textContextMenuToolbarHandlerNode.textToolbarJob = null;
    }

    public final void paste$foundation() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null, 2), 1);
        }
    }

    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.handleState$delegate.setValue(handleState);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.isInTouchMode$delegate.getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showSelectionToolbar$foundation() {
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getEnabled()) {
                LegacyTextFieldState legacyTextFieldState = this.state;
                if (legacyTextFieldState != null) {
                }
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                this.toolbarRequester.show();
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateClipboardEntry$foundation(ContinuationImpl continuationImpl) {
        TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        int i;
        if (continuationImpl instanceof TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (TextFieldSelectionManager$updateClipboardEntry$1) continuationImpl;
            int i2 = textFieldSelectionManager$updateClipboardEntry$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = textFieldSelectionManager$updateClipboardEntry$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textFieldSelectionManager$updateClipboardEntry$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidClipboard androidClipboard = this.clipboard;
                    if (androidClipboard != null) {
                        textFieldSelectionManager$updateClipboardEntry$1.L$0 = this;
                        textFieldSelectionManager$updateClipboardEntry$1.label = 1;
                        ClipDescription primaryClipDescription = androidClipboard.androidClipboardManager.getClipboardManager().getPrimaryClipDescription();
                        obj = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = textFieldSelectionManager$updateClipboardEntry$1.L$0;
                SafeTrace.throwOnFailure(obj);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.hasAvailableTextToPaste$delegate.setValue(bool);
                return Unit.INSTANCE;
            }
        }
        textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, continuationImpl);
        Object obj3 = textFieldSelectionManager$updateClipboardEntry$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textFieldSelectionManager$updateClipboardEntry$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        this.hasAvailableTextToPaste$delegate.setValue(bool2);
        return Unit.INSTANCE;
    }

    public final void updateFloatingToolbar(boolean z) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z));
        }
        if (z) {
            showSelectionToolbar$foundation();
        } else {
            hideSelectionToolbar$foundation();
        }
    }
}
