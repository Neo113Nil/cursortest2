package vd;

import bd.e0;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f7353h;

    public /* synthetic */ o(q qVar, int i10) {
        this.f7352g = i10;
        this.f7353h = qVar;
    }

    @Override // bd.f
    public final Object a(Object obj, fc.d dVar) {
        switch (this.f7352g) {
            case 0:
                e0 e0Var = this.f7353h.f7358c;
                e0Var.h(null, n.a((n) e0Var.getValue(), ((qd.j) obj).f5863a, null, 2));
                break;
            default:
                e0 e0Var2 = this.f7353h.f7358c;
                e0Var2.h(null, n.a((n) e0Var2.getValue(), 0, (List) obj, 1));
                break;
        }
        return ac.o.f277a;
    }
}
