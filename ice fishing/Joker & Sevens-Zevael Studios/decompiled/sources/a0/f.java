package a0;

import b0.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f44a;

    public f(oc.c cVar) {
        q0 q0Var = new q0();
        q0Var.f874b = new o0.e(new b0.h[16]);
        this.f44a = q0Var;
        cVar.invoke(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, oc.c cVar, u0.d dVar) {
        x4.c cVar2 = new x4.c();
        cVar2.f8290g = (pc.k) cVar;
        cVar2.f8291h = dVar;
        q0 q0Var = this.f44a;
        q0Var.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException(a4.d.g("size should be >=0, but was ", i10).toString());
        }
        if (i10 == 0) {
            return;
        }
        b0.h hVar = new b0.h(q0Var.f873a, i10, cVar2);
        q0Var.f873a += i10;
        ((o0.e) q0Var.f874b).b(hVar);
    }
}
