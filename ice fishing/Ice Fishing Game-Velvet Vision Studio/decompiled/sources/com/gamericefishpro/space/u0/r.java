package com.gamericefishpro.space.u0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.y1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j0 {
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new r(i, 2, 0);
        int i2 = 1;
        e = new r(i2, i2, 1);
        f = new r(i, 2, 2);
        int i3 = 1;
        g = new r(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object objInvoke = ((Function0) zVar.d(0)).invoke();
                com.gamericefishpro.space.t0.a aVar = (com.gamericefishpro.space.t0.a) zVar.d(1);
                int iC = zVar.c(0);
                aVar.getClass();
                h2Var.U(h2Var.c(aVar), objInvoke);
                cVar.g(iC, objInvoke);
                cVar.d(objInvoke);
                break;
            case 1:
                com.gamericefishpro.space.t0.a aVar2 = (com.gamericefishpro.space.t0.a) zVar.d(0);
                int iC2 = zVar.c(0);
                cVar.l();
                aVar2.getClass();
                cVar.c(iC2, h2Var.D(h2Var.c(aVar2)));
                break;
            case 2:
                Object objD = zVar.d(0);
                com.gamericefishpro.space.t0.a aVar3 = (com.gamericefishpro.space.t0.a) zVar.d(1);
                int iC3 = zVar.c(0);
                if (objD instanceof y1) {
                    y1 y1Var = (y1) objD;
                    ((com.gamericefishpro.space.v0.e) qVar.e).b(y1Var);
                    ((com.gamericefishpro.space.t.i0) qVar.d).a(y1Var);
                }
                Object objK = h2Var.K(h2Var.c(aVar3), iC3, objD);
                if (objK instanceof y1) {
                    qVar.e((y1) objK);
                } else if (objK instanceof p1) {
                    ((p1) objK).d();
                }
                break;
            default:
                Object objD2 = zVar.d(0);
                int iC4 = zVar.c(0);
                if (objD2 instanceof y1) {
                    y1 y1Var2 = (y1) objD2;
                    ((com.gamericefishpro.space.v0.e) qVar.e).b(y1Var2);
                    ((com.gamericefishpro.space.t.i0) qVar.d).a(y1Var2);
                }
                Object objK2 = h2Var.K(h2Var.t, iC4, objD2);
                if (objK2 instanceof y1) {
                    qVar.e((y1) objK2);
                } else if (objK2 instanceof p1) {
                    ((p1) objK2).d();
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.u0.j0
    public com.gamericefishpro.space.t0.a b(com.gamericefishpro.space.d4.z zVar) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (com.gamericefishpro.space.t0.a) zVar.d(1);
            case 1:
                return (com.gamericefishpro.space.t0.a) zVar.d(0);
            default:
                return super.b(zVar);
        }
    }
}
