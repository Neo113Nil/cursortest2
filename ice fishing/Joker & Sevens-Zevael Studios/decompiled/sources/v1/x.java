package v1;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x extends x1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oc.e f7165b;

    public x(a0 a0Var, oc.e eVar) {
        this.f7164a = a0Var;
        this.f7165b = eVar;
    }

    @Override // v1.e0
    public final f0 a(x1.o0 o0Var, List list, long j3) {
        a0 a0Var = this.f7164a;
        v vVar = a0Var.f7059n;
        vVar.f7144g = o0Var.getLayoutDirection();
        vVar.f7145h = o0Var.c();
        vVar.f7146i = o0Var.m();
        boolean t3 = o0Var.t();
        oc.e eVar = this.f7165b;
        if (t3 || a0Var.f7052g.f8047m == null) {
            a0Var.f7055j = 0;
            f0 f0Var = (f0) eVar.invoke(vVar, new s2.a(j3));
            return new w(f0Var, a0Var, a0Var.f7055j, f0Var, 1);
        }
        a0Var.f7056k = 0;
        f0 f0Var2 = (f0) eVar.invoke(a0Var.f7060o, new s2.a(j3));
        return new w(f0Var2, a0Var, a0Var.f7056k, f0Var2, 0);
    }
}
