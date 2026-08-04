package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.g2;
import com.gamericefishpro.space.t0.h2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j0 {
    public static final u c = new u(1, 0, 2);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        com.gamericefishpro.space.t0.a aVar;
        int iC;
        int iC2 = zVar.c(0);
        if (h2Var.n != 0) {
            com.gamericefishpro.space.t0.s.a("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            com.gamericefishpro.space.t0.s.a("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i = h2Var.t;
        int i2 = h2Var.v;
        int i3 = h2Var.u;
        int i4 = i;
        while (iC2 > 0) {
            i4 += h2Var.b[(h2Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                com.gamericefishpro.space.t0.s.a("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i5 = h2Var.b[(h2Var.r(i4) * 5) + 3];
        int iG = h2Var.g(h2Var.b, h2Var.r(h2Var.t));
        int iG2 = h2Var.g(h2Var.b, h2Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = h2Var.g(h2Var.b, h2Var.r(i6));
        int i7 = iG3 - iG2;
        h2Var.x(i7, Math.max(h2Var.t - 1, 0));
        h2Var.w(i5);
        int[] iArr = h2Var.b;
        int iR = h2Var.r(i6) * 5;
        com.gamericefishpro.space.ph.u.c(h2Var.r(i) * 5, iR, (i5 * 5) + iR, iArr, iArr);
        if (i7 > 0) {
            Object[] objArr = h2Var.c;
            int iH = h2Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, h2Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = h2Var.k;
        int i11 = h2Var.l;
        int length = h2Var.c.length;
        int i12 = h2Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = h2Var.r(i14);
            int i15 = i9;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = h2.i(h2.i(h2Var.g(iArr, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), h2Var.k, h2Var.l, h2Var.c.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = h2Var.p();
        int iB = g2.b(h2Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < h2Var.d.size() && (iC = h2Var.c((aVar = (com.gamericefishpro.space.t0.a) h2Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(aVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.gamericefishpro.space.t0.a aVar2 = (com.gamericefishpro.space.t0.a) arrayList.get(i18);
            int iC3 = h2Var.c(aVar2) + i17;
            if (iC3 >= h2Var.g) {
                aVar2.a = -(iP - iC3);
            } else {
                aVar2.a = iC3;
            }
            h2Var.d.add(g2.b(h2Var.d, iC3, iP), aVar2);
        }
        if (h2Var.I(i6, i5)) {
            com.gamericefishpro.space.t0.s.a("Unexpectedly removed anchors");
        }
        h2Var.m(i2, h2Var.u, i);
        if (i7 > 0) {
            h2Var.J(i8, i7, i6 - 1);
        }
    }
}
