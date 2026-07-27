package m;

import android.view.View;
import l.InterfaceC4682j;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4739i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final C4735g f39423n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4743k f39424u;

    public RunnableC4739i(C4743k c4743k, C4735g c4735g) {
        this.f39424u = c4743k;
        this.f39423n = c4735g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4682j interfaceC4682j;
        C4743k c4743k = this.f39424u;
        l.l lVar = c4743k.f39445v;
        if (lVar != null && (interfaceC4682j = lVar.f38966x) != null) {
            interfaceC4682j.j(lVar);
        }
        View view = (View) c4743k.f39428A;
        if (view != null && view.getWindowToken() != null) {
            C4735g c4735g = this.f39423n;
            if (!c4735g.b()) {
                if (c4735g.f39016e != null) {
                    c4735g.d(0, 0, false, false);
                }
            }
            c4743k.f39438L = c4735g;
        }
        c4743k.f39440N = null;
    }
}
