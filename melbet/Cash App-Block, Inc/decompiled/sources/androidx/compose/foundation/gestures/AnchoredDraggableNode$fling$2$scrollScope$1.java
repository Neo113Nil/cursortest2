package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class AnchoredDraggableNode$fling$2$scrollScope$1 implements ScrollScope {
    public final /* synthetic */ Object $$this$anchoredDrag;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ AnchoredDraggableNode$fling$2$scrollScope$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$$this$anchoredDrag = obj2;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float f) {
        int i = this.$r8$classId;
        Object obj = this.$$this$anchoredDrag;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) obj2;
                float newOffsetForDelta$foundation = anchoredDraggableNode.state.newOffsetForDelta$foundation(f);
                float floatValue = newOffsetForDelta$foundation - anchoredDraggableNode.state.offset$delegate.getFloatValue();
                ((AnchoredDraggableState$anchoredDragScope$1) obj).dragTo(newOffsetForDelta$foundation, RecyclerView.DECELERATION_RATE);
                return floatValue;
            default:
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj2;
                if (Math.abs(f) == RecyclerView.DECELERATION_RATE || ((Boolean) scrollingLogic.isScrollableNodeAttached.invoke()).booleanValue()) {
                    return scrollingLogic.reverseIfNeeded(scrollingLogic.m247toFloatk4lQ0M(((ScrollingLogic$nestedScrollScope$1) obj).m250scrollByWithOverscrollOzD1aCk(2, scrollingLogic.m246reverseIfNeededMKHz9U(scrollingLogic.m248toOffsettuRUvjQ(f)))));
                }
                throw new FlingCancellationException("The fling animation was cancelled");
        }
    }
}
