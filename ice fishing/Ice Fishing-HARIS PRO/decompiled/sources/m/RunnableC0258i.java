package m;

import android.view.View;
import l.InterfaceC0227k;
import l.MenuC0229m;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0258i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0254g f3955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0264l f3956b;

    public RunnableC0258i(C0264l c0264l, C0254g c0254g) {
        this.f3956b = c0264l;
        this.f3955a = c0254g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0227k interfaceC0227k;
        C0264l c0264l = this.f3956b;
        MenuC0229m menuC0229m = c0264l.f3961c;
        if (menuC0229m != null && (interfaceC0227k = menuC0229m.e) != null) {
            interfaceC0227k.r(menuC0229m);
        }
        View view = (View) c0264l.f3965h;
        if (view != null && view.getWindowToken() != null) {
            C0254g c0254g = this.f3955a;
            if (!c0254g.b()) {
                if (c0254g.e != null) {
                    c0254g.d(0, 0, false, false);
                }
            }
            c0264l.f3975t = c0254g;
        }
        c0264l.f3977v = null;
    }
}
