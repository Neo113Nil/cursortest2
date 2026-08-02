package androidx.compose.foundation.text.selection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class SelectionManager$handleDragObserver$1 implements TextDragObserver {
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object this$0;

    public SelectionManager$handleDragObserver$1(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        this.this$0 = textFieldSelectionManager;
        this.$isStartHandle = z;
    }

    private final void onCancel$androidx$compose$foundation$text$selection$TextFieldSelectionManager$handleDragObserver$1() {
    }

    /* renamed from: onStart-3MmeM6k$androidx$compose$foundation$text$selection$TextFieldSelectionManager$handleDragObserver$1, reason: not valid java name */
    private final void m445xb63f3ac2(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
    }

    @Override // androidx.compose.foundation.text.TextDragObserver
    public final void onCancel() {
        switch (this.$r8$classId) {
            case 0:
                SelectionManager selectionManager = (SelectionManager) this.this$0;
                selectionManager.showToolbar = true;
                selectionManager.updateSelectionToolbar();
                selectionManager.draggingHandle$delegate.setValue(null);
                selectionManager.currentDragPosition$delegate.setValue(null);
                break;
        }
    }

    @Override // androidx.compose.foundation.text.TextDragObserver
    /* renamed from: onDown-k-4lQ0M */
    public final void mo365onDownk4lQ0M() {
        Selection selection;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult;
        int i = this.$r8$classId;
        boolean z = this.$isStartHandle;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                SelectionManager selectionManager = (SelectionManager) obj;
                if ((z ? (Offset) selectionManager.startHandlePosition$delegate.getValue() : (Offset) selectionManager.endHandlePosition$delegate.getValue()) != null && (selection = selectionManager.getSelection()) != null) {
                    MultiWidgetSelectionDelegate anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(z ? selection.start : selection.end);
                    if (anchorSelectable$foundation != null && (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) != null) {
                        long m436getHandlePositiondBAh8RU = anchorSelectable$foundation.m436getHandlePositiondBAh8RU(selection, z);
                        if ((9223372034707292159L & m436getHandlePositiondBAh8RU) != 9205357640488583168L) {
                            selectionManager.currentDragPosition$delegate.setValue(new Offset(selectionManager.requireContainerCoordinates$foundation().mo839localPositionOfR5De75A(layoutCoordinates, SelectionHandlesKt.m442getAdjustedCoordinatesk4lQ0M(m436getHandlePositiondBAh8RU))));
                            selectionManager.draggingHandle$delegate.setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
                            selectionManager.showToolbar = false;
                            selectionManager.updateSelectionToolbar();
                            break;
                        }
                    }
                }
                break;
            default:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                textFieldSelectionManager.draggingHandle$delegate.setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
                long m442getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m442getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m458getHandlePositiontuRUvjQ$foundation(z));
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
                if (legacyTextFieldState != null && (layoutResult = legacyTextFieldState.getLayoutResult()) != null) {
                    long m372translateInnerToDecorationCoordinatesMKHz9U$foundation = layoutResult.m372translateInnerToDecorationCoordinatesMKHz9U$foundation(m442getAdjustedCoordinatesk4lQ0M);
                    textFieldSelectionManager.dragBeginPosition = m372translateInnerToDecorationCoordinatesMKHz9U$foundation;
                    textFieldSelectionManager.currentDragPosition$delegate.setValue(new Offset(m372translateInnerToDecorationCoordinatesMKHz9U$foundation));
                    textFieldSelectionManager.dragTotalDistance = 0L;
                    textFieldSelectionManager.previousRawDragOffset = -1;
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.state;
                    if (legacyTextFieldState2 != null) {
                        legacyTextFieldState2.isInTouchMode$delegate.setValue(Boolean.TRUE);
                    }
                    textFieldSelectionManager.updateFloatingToolbar(false);
                    break;
                }
                break;
        }
    }

    @Override // androidx.compose.foundation.text.TextDragObserver
    /* renamed from: onDrag-k-4lQ0M */
    public final void mo366onDragk4lQ0M(long j) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                SelectionManager selectionManager = (SelectionManager) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = selectionManager.dragBeginPosition$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = selectionManager.dragTotalDistance$delegate;
                if (selectionManager.getDraggingHandle() != null) {
                    parcelableSnapshotMutableState2.setValue(new Offset(Offset.m626plusMKHz9U(((Offset) parcelableSnapshotMutableState2.getValue()).packedValue, j)));
                    long m626plusMKHz9U = Offset.m626plusMKHz9U(((Offset) parcelableSnapshotMutableState.getValue()).packedValue, ((Offset) parcelableSnapshotMutableState2.getValue()).packedValue);
                    if (selectionManager.m444updateSelectionjyLRC_s$foundation(m626plusMKHz9U, ((Offset) selectionManager.dragBeginPosition$delegate.getValue()).packedValue, this.$isStartHandle, SelectionAdjustment$Companion.CharacterWithWordAccelerate)) {
                        parcelableSnapshotMutableState.setValue(new Offset(m626plusMKHz9U));
                        parcelableSnapshotMutableState2.setValue(new Offset(0L));
                        break;
                    }
                }
                break;
            default:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                long m626plusMKHz9U2 = Offset.m626plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j);
                textFieldSelectionManager.dragTotalDistance = m626plusMKHz9U2;
                textFieldSelectionManager.currentDragPosition$delegate.setValue(new Offset(Offset.m626plusMKHz9U(textFieldSelectionManager.dragBeginPosition, m626plusMKHz9U2)));
                TextFieldValue value$foundation = textFieldSelectionManager.getValue$foundation();
                Offset m457getCurrentDragPosition_m7T9E = textFieldSelectionManager.m457getCurrentDragPosition_m7T9E();
                m457getCurrentDragPosition_m7T9E.getClass();
                TextFieldSelectionManager.m454access$updateSelectionjSglsI8(textFieldSelectionManager, value$foundation, m457getCurrentDragPosition_m7T9E.packedValue, false, this.$isStartHandle, SelectionAdjustment$Companion.CharacterWithWordAccelerate, true, new HapticFeedbackType(9));
                textFieldSelectionManager.updateFloatingToolbar(false);
                break;
        }
    }

    @Override // androidx.compose.foundation.text.TextDragObserver
    /* renamed from: onStart-3MmeM6k */
    public final void mo367onStart3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
        switch (this.$r8$classId) {
            case 0:
                SelectionManager selectionManager = (SelectionManager) this.this$0;
                if (selectionManager.getDraggingHandle() != null) {
                    Selection selection = selectionManager.getSelection();
                    selection.getClass();
                    boolean z = this.$isStartHandle;
                    Object obj = selectionManager.selectionRegistrar._selectableMap.get((z ? selection.start : selection.end).selectableId);
                    if (obj == null) {
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        break;
                    } else {
                        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) obj;
                        LayoutCoordinates layoutCoordinates = multiWidgetSelectionDelegate.getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                            OptionalProvider$$ExternalSyntheticLambda0.m$1();
                            break;
                        } else {
                            long m436getHandlePositiondBAh8RU = multiWidgetSelectionDelegate.m436getHandlePositiondBAh8RU(selection, z);
                            if ((9223372034707292159L & m436getHandlePositiondBAh8RU) != 9205357640488583168L) {
                                Recorder$$ExternalSyntheticOutline1.m(selectionManager.requireContainerCoordinates$foundation().mo839localPositionOfR5De75A(layoutCoordinates, SelectionHandlesKt.m442getAdjustedCoordinatesk4lQ0M(m436getHandlePositiondBAh8RU)), selectionManager.dragBeginPosition$delegate);
                                Recorder$$ExternalSyntheticOutline1.m(0L, selectionManager.dragTotalDistance$delegate);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.compose.foundation.text.TextDragObserver
    public final void onStop() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                SelectionManager selectionManager = (SelectionManager) obj;
                selectionManager.showToolbar = true;
                selectionManager.updateSelectionToolbar();
                selectionManager.draggingHandle$delegate.setValue(null);
                selectionManager.currentDragPosition$delegate.setValue(null);
                break;
            default:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                textFieldSelectionManager.draggingHandle$delegate.setValue(null);
                textFieldSelectionManager.currentDragPosition$delegate.setValue(null);
                textFieldSelectionManager.updateFloatingToolbar(true);
                break;
        }
    }

    @Override // androidx.compose.foundation.text.TextDragObserver
    public final void onUp() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                SelectionManager selectionManager = (SelectionManager) obj;
                selectionManager.showToolbar = true;
                selectionManager.updateSelectionToolbar();
                selectionManager.draggingHandle$delegate.setValue(null);
                selectionManager.currentDragPosition$delegate.setValue(null);
                break;
            default:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                textFieldSelectionManager.draggingHandle$delegate.setValue(null);
                textFieldSelectionManager.currentDragPosition$delegate.setValue(null);
                textFieldSelectionManager.updateFloatingToolbar(true);
                break;
        }
    }

    public SelectionManager$handleDragObserver$1(boolean z, SelectionManager selectionManager) {
        this.$isStartHandle = z;
        this.this$0 = selectionManager;
    }
}
