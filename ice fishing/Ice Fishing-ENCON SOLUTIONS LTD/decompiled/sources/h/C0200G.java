package h;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200G implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0202I f3154a;

    public C0200G(AbstractC0202I abstractC0202I) {
        this.f3154a = abstractC0202I;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            AbstractC0202I abstractC0202I = this.f3154a;
            if (abstractC0202I.f3178v.getInputMethodMode() == 2 || abstractC0202I.f3178v.getContentView() == null) {
                return;
            }
            Handler handler = abstractC0202I.f3175r;
            RunnableC0199F runnableC0199F = abstractC0202I.f3171n;
            handler.removeCallbacks(runnableC0199F);
            runnableC0199F.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
