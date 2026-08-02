package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionAdjustment$Companion$$ExternalSyntheticLambda0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SelectionAdjustment$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public final Selection adjust(SelectionLayout selectionLayout) {
        Selection.AnchorInfo access$updateSelectionBoundary;
        Selection.AnchorInfo anchorInfo;
        switch (this.$r8$classId) {
            case 0:
                return new Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().rawStartHandleOffset), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().rawEndHandleOffset), selectionLayout.getCrossStatus() == CrossStatus.CROSSED);
            case 1:
                return SimpleLayoutKt.ensureAtLeastOneChar(new Selection(selectionLayout.getStartInfo().anchorForOffset(selectionLayout.getStartInfo().rawStartHandleOffset), selectionLayout.getEndInfo().anchorForOffset(selectionLayout.getEndInfo().rawEndHandleOffset), selectionLayout.getCrossStatus() == CrossStatus.CROSSED), selectionLayout);
            case 2:
                return SimpleLayoutKt.access$adjustToBoundaries(selectionLayout, SelectionAdjustment$Companion.INSTANCE$1);
            case 3:
                return SimpleLayoutKt.access$adjustToBoundaries(selectionLayout, SelectionAdjustment$Companion.INSTANCE);
            default:
                Selection previousSelection = selectionLayout.getPreviousSelection();
                if (previousSelection == null) {
                    return SimpleLayoutKt.access$adjustToBoundaries(selectionLayout, SelectionAdjustment$Companion.INSTANCE$1);
                }
                Selection.AnchorInfo anchorInfo2 = previousSelection.end;
                Selection.AnchorInfo anchorInfo3 = previousSelection.start;
                if (selectionLayout.isStartHandle()) {
                    anchorInfo = SimpleLayoutKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getStartInfo(), anchorInfo3);
                    access$updateSelectionBoundary = anchorInfo2;
                    anchorInfo2 = anchorInfo3;
                    anchorInfo3 = anchorInfo;
                } else {
                    access$updateSelectionBoundary = SimpleLayoutKt.access$updateSelectionBoundary(selectionLayout, selectionLayout.getEndInfo(), anchorInfo2);
                    anchorInfo = access$updateSelectionBoundary;
                }
                if (Intrinsics.areEqual(anchorInfo, anchorInfo2)) {
                    return previousSelection;
                }
                if (selectionLayout.getCrossStatus() != CrossStatus.CROSSED && (selectionLayout.getCrossStatus() != CrossStatus.COLLAPSED || anchorInfo3.offset <= access$updateSelectionBoundary.offset)) {
                    r0 = false;
                }
                return SimpleLayoutKt.ensureAtLeastOneChar(new Selection(anchorInfo3, access$updateSelectionBoundary, r0), selectionLayout);
        }
    }
}
