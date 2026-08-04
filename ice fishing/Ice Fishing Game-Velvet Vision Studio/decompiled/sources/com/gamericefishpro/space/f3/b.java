package com.gamericefishpro.space.f3;

import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d4.o0;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.d4.x0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ViewGroup v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewGroup viewGroup, int i) {
        super(1);
        this.i = i;
        this.v = viewGroup;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final o1 f(o1 o1Var, List list) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((z) this.v).m(o1Var);
            default:
                com.gamericefishpro.space.g3.n nVar = (com.gamericefishpro.space.g3.n) this.v;
                if (nVar.E) {
                    return o1Var;
                }
                View childAt = nVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, nVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, nVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? o1Var : o1Var.a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final com.gamericefishpro.space.u6.e g(x0 x0Var, com.gamericefishpro.space.u6.e eVar) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.h2.q qVar = ((z) this.v).S.Z.c;
                if (!qVar.j0.G) {
                    return eVar;
                }
                long jD = com.gamericefishpro.space.a.a.D(qVar.H(0L));
                int i = (int) (jD >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jD & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jF = com.gamericefishpro.space.f2.x.h(qVar).F();
                int i3 = (int) (jF >> 32);
                int i4 = (int) (jF & 4294967295L);
                long j = qVar.i;
                long jD2 = com.gamericefishpro.space.a.a.D(qVar.H((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jD2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jD2));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? eVar : new com.gamericefishpro.space.u6.e(1, j.k((com.gamericefishpro.space.u3.b) eVar.b, i, i2, i5, i7), j.k((com.gamericefishpro.space.u3.b) eVar.c, i, i2, i5, i7));
            default:
                com.gamericefishpro.space.g3.n nVar = (com.gamericefishpro.space.g3.n) this.v;
                if (nVar.E) {
                    return eVar;
                }
                View childAt = nVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, nVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, nVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return eVar;
                }
                com.gamericefishpro.space.u3.b bVarB = com.gamericefishpro.space.u3.b.b(iMax, iMax2, iMax3, iMax4);
                int i8 = bVarB.a;
                com.gamericefishpro.space.u3.b bVar = (com.gamericefishpro.space.u3.b) eVar.b;
                int i9 = bVarB.b;
                int i10 = bVarB.c;
                int i11 = bVarB.d;
                return new com.gamericefishpro.space.u6.e(1, o1.b(bVar, i8, i9, i10, i11), o1.b((com.gamericefishpro.space.u3.b) eVar.c, i8, i9, i10, i11));
        }
    }
}
