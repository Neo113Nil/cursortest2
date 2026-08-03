package v1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 extends x1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f7100a = new m0();

    @Override // v1.e0
    public final f0 a(x1.o0 o0Var, List list, long j3) {
        int size = list.size();
        bc.w wVar = bc.w.f1068g;
        if (size == 0) {
            return o0Var.H(s2.a.j(j3), s2.a.i(j3), wVar, k0.f7092i);
        }
        if (size == 1) {
            j0 e10 = ((d0) list.get(0)).e(j3);
            return o0Var.H(s2.b.f(e10.f7085g, j3), s2.b.e(e10.f7086h, j3), wVar, new c1.h(e10, 4));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size2; i12++) {
            j0 e11 = ((d0) list.get(i12)).e(j3);
            i10 = Math.max(e11.f7085g, i10);
            i11 = Math.max(e11.f7086h, i11);
            arrayList.add(e11);
        }
        return o0Var.H(s2.b.f(i10, j3), s2.b.e(i11, j3), wVar, new u.n(1, arrayList));
    }
}
