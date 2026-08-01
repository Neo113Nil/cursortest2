package m;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: m.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4725z0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f39270a;

    public C4725z0(B0 b02) {
        this.f39270a = b02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            B0 b02 = this.f39270a;
            if (b02.f38985S.getInputMethodMode() == 2 || b02.f38985S.getContentView() == null) {
                return;
            }
            Handler handler = b02.f38981O;
            RunnableC4723y0 runnableC4723y0 = b02.f38977K;
            handler.removeCallbacks(runnableC4723y0);
            runnableC4723y0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i6, int i9) {
    }
}
