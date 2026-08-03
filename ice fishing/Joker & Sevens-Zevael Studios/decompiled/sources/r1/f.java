package r1;

import s.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f5952a = new o0.e(new e[16]);

    /* renamed from: b, reason: collision with root package name */
    public final a0 f5953b = new a0(10);

    public boolean a(s.o oVar, v1.p pVar, x4.c cVar, boolean z10) {
        o0.e eVar = this.f5952a;
        Object[] objArr = eVar.f5134g;
        int i10 = eVar.f5136i;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((e) objArr[i11]).a(oVar, pVar, cVar, z10) || z11;
        }
        return z11;
    }

    public void b(x4.c cVar) {
        o0.e eVar = this.f5952a;
        int i10 = eVar.f5136i;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((e) eVar.f5134g[i10]).f5945d.f2091b == 0) {
                eVar.k(i10);
            }
        }
    }
}
