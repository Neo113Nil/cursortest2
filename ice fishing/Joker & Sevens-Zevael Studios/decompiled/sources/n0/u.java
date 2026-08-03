package n0;

import java.util.ArrayList;
import m0.l2;
import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f5034c = new u(1, 0, 2);

    @Override // n0.i0
    public final void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var) {
        m0.a aVar;
        int c3;
        int a6 = k0Var.a(0);
        if (m2Var.f4671n != 0) {
            m0.t.c("Cannot move a group while inserting");
        }
        if (a6 < 0) {
            m0.t.c("Parameter offset is out of bounds");
        }
        if (a6 == 0) {
            return;
        }
        int i10 = m2Var.f4677t;
        int i11 = m2Var.f4679v;
        int i12 = m2Var.f4678u;
        int i13 = i10;
        while (a6 > 0) {
            i13 += m2Var.f4659b[(m2Var.r(i13) * 5) + 3];
            if (i13 > i12) {
                m0.t.c("Parameter offset is out of bounds");
            }
            a6--;
        }
        int i14 = m2Var.f4659b[(m2Var.r(i13) * 5) + 3];
        int g8 = m2Var.g(m2Var.f4659b, m2Var.r(m2Var.f4677t));
        int g10 = m2Var.g(m2Var.f4659b, m2Var.r(i13));
        int i15 = i13 + i14;
        int g11 = m2Var.g(m2Var.f4659b, m2Var.r(i15));
        int i16 = g11 - g10;
        m2Var.w(i16, Math.max(m2Var.f4677t - 1, 0));
        m2Var.v(i14);
        int[] iArr = m2Var.f4659b;
        int r5 = m2Var.r(i15) * 5;
        bc.l.P(m2Var.r(i10) * 5, r5, (i14 * 5) + r5, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = m2Var.f4660c;
            int h10 = m2Var.h(g10 + i16);
            System.arraycopy(objArr, h10, objArr, g8, m2Var.h(g11 + i16) - h10);
        }
        int i17 = g10 + i16;
        int i18 = i17 - g8;
        int i19 = m2Var.f4668k;
        int i20 = m2Var.f4669l;
        int length = m2Var.f4660c.length;
        int i21 = m2Var.f4670m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int r10 = m2Var.r(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(r10 * 5) + 4] = m2.i(m2.i(m2Var.g(iArr, r10) - i24, i21 < r10 ? 0 : i19, i20, length), m2Var.f4668k, m2Var.f4669l, m2Var.f4660c.length);
            i23++;
            i18 = i24;
            iArr = iArr2;
            i19 = i19;
        }
        int i25 = i15 + i14;
        int p8 = m2Var.p();
        int b2 = l2.b(m2Var.f4661d, i15, p8);
        ArrayList arrayList = new ArrayList();
        if (b2 >= 0) {
            while (b2 < m2Var.f4661d.size() && (c3 = m2Var.c((aVar = (m0.a) m2Var.f4661d.get(b2)))) >= i15 && c3 < i25) {
                arrayList.add(aVar);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            m0.a aVar2 = (m0.a) arrayList.get(i27);
            int c7 = m2Var.c(aVar2) + i26;
            if (c7 >= m2Var.f4664g) {
                aVar2.f4509a = -(p8 - c7);
            } else {
                aVar2.f4509a = c7;
            }
            m2Var.f4661d.add(l2.b(m2Var.f4661d, c7, p8), aVar2);
        }
        if (m2Var.H(i15, i14)) {
            m0.t.c("Unexpectedly removed anchors");
        }
        m2Var.m(i11, m2Var.f4678u, i10);
        if (i16 > 0) {
            m2Var.I(i17, i16, i15 - 1);
        }
    }
}
