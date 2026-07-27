package h;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class H implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2087a;

    public H(J j2) {
        this.f2087a = j2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            J j2 = this.f2087a;
            if (j2.f2091A.getInputMethodMode() == 2 || j2.f2091A.getContentView() == null) {
                return;
            }
            Handler handler = j2.f2108w;
            RunnableC0156G runnableC0156G = j2.f2104s;
            handler.removeCallbacks(runnableC0156G);
            runnableC0156G.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
