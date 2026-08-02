package m;

import android.view.View;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4704i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final C4700g f39221n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4708k f39222u;

    public RunnableC4704i(C4708k c4708k, C4700g c4700g) {
        this.f39222u = c4708k;
        this.f39221n = c4700g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.k kVar;
        C4708k c4708k = this.f39222u;
        l.m mVar = c4708k.f39243v;
        if (mVar != null && (kVar = mVar.f38751x) != null) {
            kVar.h(mVar);
        }
        View view = (View) c4708k.f39226A;
        if (view != null && view.getWindowToken() != null) {
            C4700g c4700g = this.f39221n;
            if (!c4700g.b()) {
                if (c4700g.f38801e != null) {
                    c4700g.d(0, 0, false, false);
                }
            }
            c4708k.f39236L = c4700g;
        }
        c4708k.f39238N = null;
    }
}
