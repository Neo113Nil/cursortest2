package c0;

import ac.o;
import android.graphics.Rect;
import android.view.View;
import hc.j;
import x1.f1;
import x1.j0;
import x1.l;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f1194g;

    public g(l lVar) {
        this.f1194g = lVar;
    }

    @Override // c0.a
    public final Object E(f1 f1Var, oc.a aVar, j jVar) {
        l lVar = this.f1194g;
        if (!((m) lVar).f8443g.f8456t) {
            u1.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        View view = (View) j0.a(x1.f.v(lVar));
        long L0 = f1Var.L0(0L);
        e1.c cVar = (e1.c) aVar.invoke();
        e1.c e10 = cVar != null ? cVar.e(L0) : null;
        if (e10 != null) {
            view.requestRectangleOnScreen(new Rect((int) e10.f1931a, (int) e10.f1932b, (int) e10.f1933c, (int) e10.f1934d), false);
        }
        return o.f277a;
    }
}
