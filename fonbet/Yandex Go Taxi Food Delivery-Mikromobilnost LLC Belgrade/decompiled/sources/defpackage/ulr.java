package defpackage;

import androidx.recyclerview.widget.FlexStaggeredGridLayoutManager;
import core.flex.ui.OrientationAwareRecyclerView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ulr implements bki0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ulr(int i) {
        this.a = i;
    }

    @Override // defpackage.bki0
    public final void a(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        switch (this.a) {
            case 0:
                orientationAwareRecyclerView.setItemAnimator(null);
                break;
            case 1:
                if (orientationAwareRecyclerView.getAdapter() instanceof cfx) {
                    FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = new FlexStaggeredGridLayoutManager(new amt0((cfx) orientationAwareRecyclerView.getAdapter()), true);
                    flexStaggeredGridLayoutManager.W1();
                    orientationAwareRecyclerView.setLayoutManager(flexStaggeredGridLayoutManager);
                    break;
                }
                break;
            default:
                orientationAwareRecyclerView.setClipChildren(false);
                break;
        }
    }
}
