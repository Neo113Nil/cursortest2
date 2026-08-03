package e;

import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import b0.q;
import d.v;
import d.x;
import d.y;
import s.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1905h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1906i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1907j;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f1904g = i10;
        this.f1905h = obj;
        this.f1906i = obj2;
        this.f1907j = obj3;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1904g) {
            case 0:
                y yVar = (y) this.f1905h;
                u uVar = (u) this.f1906i;
                g gVar = (g) this.f1907j;
                yVar.getClass();
                pc.j.e(uVar, "owner");
                pc.j.e(gVar, "onBackPressedCallback");
                w h10 = uVar.h();
                if (h10.f723c != p.f697g) {
                    gVar.f1532b.add(new v(yVar, h10, gVar));
                    yVar.d();
                    gVar.f1533c = new x(0, yVar, y.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
                }
                return new q(4, gVar);
            default:
                v0.d dVar = (v0.d) this.f1905h;
                v0.h hVar = (v0.h) this.f1907j;
                g0 g0Var = dVar.f7037h;
                Object obj2 = this.f1906i;
                if (!g0Var.b(obj2)) {
                    dVar.f7036g.remove(obj2);
                    g0Var.m(obj2, hVar);
                    return new h5.a(dVar, obj2, hVar, 2);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
    }
}
