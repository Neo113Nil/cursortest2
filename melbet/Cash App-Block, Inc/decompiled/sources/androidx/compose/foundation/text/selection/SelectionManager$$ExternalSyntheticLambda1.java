package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionManager$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelectionManager f$0;

    public /* synthetic */ SelectionManager$$ExternalSyntheticLambda1(SelectionManager selectionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Selection.AnchorInfo anchorInfo;
        Selection.AnchorInfo anchorInfo2;
        int i = this.$r8$classId;
        SelectionManager selectionManager = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                selectionManager.containerLayoutCoordinates = layoutCoordinates;
                if (((Boolean) selectionManager.hasFocus$delegate.getValue()).booleanValue() && selectionManager.getSelection() != null) {
                    Offset offset = layoutCoordinates != null ? new Offset(layoutCoordinates.mo843localToWindowMKHz9U(0L)) : null;
                    if (!Intrinsics.areEqual(selectionManager.previousPosition, offset)) {
                        selectionManager.previousPosition = offset;
                        selectionManager.updateHandleOffsets();
                        selectionManager.updateSelectionToolbar();
                    }
                }
                break;
            case 1:
                break;
            case 2:
                if (selectionManager.selectionRegistrar.getSubselections().containsKey(((Long) obj).longValue())) {
                    selectionManager.onRelease();
                    selectionManager.setSelection(null);
                }
                break;
            case 3:
                long longValue = ((Long) obj).longValue();
                Selection selection = selectionManager.getSelection();
                if (selection != null && (anchorInfo2 = selection.start) != null && longValue == anchorInfo2.selectableId) {
                    selectionManager.startHandlePosition$delegate.setValue(null);
                }
                Selection selection2 = selectionManager.getSelection();
                if (selection2 != null && (anchorInfo = selection2.end) != null && longValue == anchorInfo.selectableId) {
                    selectionManager.endHandlePosition$delegate.setValue(null);
                }
                if (selectionManager.selectionRegistrar.getSubselections().containsKey(longValue)) {
                    selectionManager.updateSelectionToolbar();
                }
                break;
            case 4:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                Rect rect = (Rect) selectionManager.derivedContentRect$delegate.getValue();
                if (rect != null) {
                    LayoutCoordinates layoutCoordinates3 = selectionManager.containerLayoutCoordinates;
                    if (layoutCoordinates3 == null) {
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 5:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = selectionManager.hasFocus$delegate;
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                if (!focusStateImpl.getHasFocus() && ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                    selectionManager.onRelease();
                }
                parcelableSnapshotMutableState.setValue(Boolean.valueOf(focusStateImpl.getHasFocus()));
                break;
            case 6:
                selectionManager.setInTouchMode(((Boolean) obj).booleanValue());
                break;
            case 7:
                selectionManager.setSelection((Selection) obj);
                break;
            default:
                if (selectionManager.selectionRegistrar.getSubselections().containsKey(((Long) obj).longValue())) {
                    selectionManager.positionChangeState$delegate.setValue(Unit.INSTANCE);
                    selectionManager.updateHandleOffsets();
                    selectionManager.updateSelectionToolbar();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
