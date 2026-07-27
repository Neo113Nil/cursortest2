package m;

import android.view.View;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4691i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final C4687g f39152n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4695k f39153u;

    public RunnableC4691i(C4695k c4695k, C4687g c4687g) {
        this.f39153u = c4695k;
        this.f39152n = c4687g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.k kVar;
        C4695k c4695k = this.f39153u;
        l.m mVar = c4695k.f39174v;
        if (mVar != null && (kVar = mVar.f38824x) != null) {
            kVar.k(mVar);
        }
        View view = (View) c4695k.f39157A;
        if (view != null && view.getWindowToken() != null) {
            C4687g c4687g = this.f39152n;
            if (!c4687g.b()) {
                if (c4687g.f38874e != null) {
                    c4687g.d(0, 0, false, false);
                }
            }
            c4695k.f39167L = c4687g;
        }
        c4695k.f39169N = null;
    }
}
