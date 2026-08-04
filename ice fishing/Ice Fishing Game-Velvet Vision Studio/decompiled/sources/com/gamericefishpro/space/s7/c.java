package com.gamericefishpro.space.s7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f0.k;
import com.gamericefishpro.space.g5.q;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.tb.u;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        com.gamericefishpro.space.t0.f fVar = n.a;
        Object obj3 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = (r) obj;
                Context context = (Context) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar.E()) {
                    rVar.V();
                } else {
                    com.gamericefishpro.space.u1.f fVarB = com.gamericefishpro.space.i.a.d;
                    if (fVarB == null) {
                        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
                        m0 m0Var = new m0(s.b);
                        u uVar = new u(1);
                        uVar.B(18.0f, 16.08f);
                        uVar.u(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                        uVar.z(8.91f, 12.7f);
                        uVar.u(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        uVar.E(-0.04f, -0.47f, -0.09f, -0.7f);
                        uVar.A(7.05f, -4.11f);
                        uVar.u(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        uVar.u(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                        uVar.E(-1.34f, -3.0f, -3.0f, -3.0f);
                        uVar.E(-3.0f, 1.34f, -3.0f, 3.0f);
                        uVar.u(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        uVar.z(8.04f, 9.81f);
                        uVar.t(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        uVar.u(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        uVar.E(1.34f, 3.0f, 3.0f, 3.0f);
                        uVar.u(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                        uVar.A(7.12f, 4.16f);
                        uVar.u(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        uVar.u(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        uVar.u(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
                        uVar.E(-1.31f, -2.92f, -2.92f, -2.92f);
                        uVar.s();
                        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
                        fVarB = eVar.b();
                        com.gamericefishpro.space.i.a.d = fVarB;
                    }
                    com.gamericefishpro.space.u1.f fVar2 = fVarB;
                    long j = s.c;
                    rVar.a0(-143579692);
                    boolean zH = rVar.h(context);
                    Object objP = rVar.P();
                    if (zH || objP == fVar) {
                        objP = new q(context, 1);
                        rVar.k0(objP);
                    }
                    rVar.p(false);
                    com.gamericefishpro.space.hj.c.d("Share App", fVar2, j, (Function0) objP, rVar, 390);
                    a4.e(rVar, 0);
                    com.gamericefishpro.space.u1.f fVarG = d5.G();
                    long j2 = d.a;
                    rVar.a0(-143557268);
                    boolean zH2 = rVar.h(context);
                    Object objP2 = rVar.P();
                    if (zH2 || objP2 == fVar) {
                        objP2 = new q(context, 2);
                        rVar.k0(objP2);
                    }
                    rVar.p(false);
                    com.gamericefishpro.space.hj.c.d("Rate App", fVarG, j2, (Function0) objP2, rVar, 390);
                }
                break;
            default:
                r rVar2 = (r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar2.E()) {
                    rVar2.V();
                } else {
                    com.gamericefishpro.space.u1.f fVarB2 = y3.b;
                    if (fVarB2 == null) {
                        com.gamericefishpro.space.u1.e eVar2 = new com.gamericefishpro.space.u1.e("Filled.DeleteForever", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        g0 g0Var2 = com.gamericefishpro.space.u1.g0.a;
                        m0 m0Var2 = new m0(s.b);
                        u uVar2 = new u(1);
                        uVar2.B(6.0f, 19.0f);
                        uVar2.u(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        uVar2.y(8.0f);
                        uVar2.u(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        uVar2.z(18.0f, 7.0f);
                        uVar2.z(6.0f, 7.0f);
                        uVar2.G(12.0f);
                        uVar2.s();
                        uVar2.B(8.46f, 11.88f);
                        uVar2.A(1.41f, -1.41f);
                        uVar2.z(12.0f, 12.59f);
                        uVar2.A(2.12f, -2.12f);
                        uVar2.A(1.41f, 1.41f);
                        uVar2.z(13.41f, 14.0f);
                        uVar2.A(2.12f, 2.12f);
                        uVar2.A(-1.41f, 1.41f);
                        uVar2.z(12.0f, 15.41f);
                        uVar2.A(-2.12f, 2.12f);
                        uVar2.A(-1.41f, -1.41f);
                        uVar2.z(10.59f, 14.0f);
                        uVar2.A(-2.13f, -2.12f);
                        uVar2.s();
                        uVar2.B(15.5f, 4.0f);
                        uVar2.A(-1.0f, -1.0f);
                        uVar2.y(-5.0f);
                        uVar2.A(-1.0f, 1.0f);
                        uVar2.z(5.0f, 4.0f);
                        uVar2.G(2.0f);
                        uVar2.y(14.0f);
                        uVar2.z(19.0f, 4.0f);
                        uVar2.s();
                        com.gamericefishpro.space.u1.e.a(eVar2, (ArrayList) uVar2.e, m0Var2);
                        fVarB2 = eVar2.b();
                        y3.b = fVarB2;
                    }
                    com.gamericefishpro.space.u1.f fVar3 = fVarB2;
                    long j3 = d.b;
                    rVar2.a0(-143533986);
                    v0 v0Var = (v0) obj3;
                    Object objP3 = rVar2.P();
                    if (objP3 == fVar) {
                        objP3 = new k(v0Var, 4);
                        rVar2.k0(objP3);
                    }
                    rVar2.p(false);
                    com.gamericefishpro.space.hj.c.d("Delete Progress", fVar3, j3, (Function0) objP3, rVar2, 3462);
                    a4.e(rVar2, 0);
                    com.gamericefishpro.space.u1.f fVarY = com.gamericefishpro.space.wa.b.y();
                    long jC = s.c(s.c, 0.5f);
                    rVar2.a0(-143521864);
                    Object objP4 = rVar2.P();
                    if (objP4 == fVar) {
                        objP4 = new com.gamericefishpro.space.q0.n(8);
                        rVar2.k0(objP4);
                    }
                    rVar2.p(false);
                    com.gamericefishpro.space.hj.c.d("Version 1.0", fVarY, jC, (Function0) objP4, rVar2, 3456);
                }
                break;
        }
        return Unit.a;
    }
}
