package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p1 implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q1 f4709g;

    public p1(q1 q1Var) {
        this.f4709g = q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oc.a
    public final Object invoke() {
        ArrayList arrayList = this.f4709g.f4714a;
        s.g0 g0Var = new s.g0(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var = (v0) arrayList.get(i10);
            Object obj = v0Var.f4781b;
            int i11 = v0Var.f4780a;
            Object u0Var = obj != null ? new u0(Integer.valueOf(i11), v0Var.f4781b) : Integer.valueOf(i11);
            int f10 = g0Var.f(u0Var);
            boolean z10 = f10 < 0;
            Object obj2 = z10 ? null : g0Var.f6268c[f10];
            if (obj2 != null) {
                if (obj2 instanceof s.a0) {
                    s.a0 a0Var = (s.a0) obj2;
                    a0Var.a(v0Var);
                    v0Var = a0Var;
                } else {
                    Object[] objArr = s.l0.f6302a;
                    s.a0 a0Var2 = new s.a0(2);
                    a0Var2.a(obj2);
                    a0Var2.a(v0Var);
                    v0Var = a0Var2;
                }
            }
            if (z10) {
                int i12 = ~f10;
                g0Var.f6267b[i12] = u0Var;
                g0Var.f6268c[i12] = v0Var;
            } else {
                g0Var.f6268c[f10] = v0Var;
            }
        }
        return new o0.a(g0Var);
    }
}
