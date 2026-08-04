package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.z.o1;
import com.gamericefishpro.space.z.q1;
import com.gamericefishpro.space.z.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.b0.i) this.e).b((com.gamericefishpro.space.b0.j) this.i);
                break;
            case 1:
                com.gamericefishpro.space.o1.h hVar = (com.gamericefishpro.space.o1.h) this.e;
                com.gamericefishpro.space.o1.o oVar = (com.gamericefishpro.space.o1.o) this.i;
                com.gamericefishpro.space.h2.h0 h0Var = (com.gamericefishpro.space.h2.h0) obj;
                h0Var.a();
                com.gamericefishpro.space.q1.d.j0(h0Var, hVar, oVar, 0.0f, null, 60);
                break;
            case 2:
                com.gamericefishpro.space.o1.b0 b0Var = (com.gamericefishpro.space.o1.b0) this.e;
                com.gamericefishpro.space.o1.o oVar2 = (com.gamericefishpro.space.o1.o) this.i;
                com.gamericefishpro.space.h2.h0 h0Var2 = (com.gamericefishpro.space.h2.h0) obj;
                h0Var2.a();
                com.gamericefishpro.space.q1.d.j0(h0Var2, b0Var.f, oVar2, 0.0f, null, 60);
                break;
            case 3:
                ((com.gamericefishpro.space.b0.i) this.e).b((com.gamericefishpro.space.b0.h) this.i);
                break;
            case 4:
                ((com.gamericefishpro.space.h0.l) this.e).a.k((com.gamericefishpro.space.z.f) this.i);
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                o1 o1Var = (o1) this.e;
                q1 q1Var = (q1) this.i;
                com.gamericefishpro.space.z.s sVar = (com.gamericefishpro.space.z.s) obj;
                float f = sVar.b ? -1.0f : 1.0f;
                long j = sVar.a;
                o1Var.a(1, com.gamericefishpro.space.n1.b.f(q1Var.d == com.gamericefishpro.space.z.v0.e ? com.gamericefishpro.space.n1.b.a(1, j) : com.gamericefishpro.space.n1.b.a(2, j), f));
                break;
            default:
                u1 u1Var = (u1) this.e;
                Function1 function1 = (Function1) this.i;
                ((Long) obj).longValue();
                float f2 = u1Var.e;
                u1Var.e = 0.0f;
                function1.invoke(Float.valueOf(f2));
                break;
        }
        return Unit.a;
    }
}
