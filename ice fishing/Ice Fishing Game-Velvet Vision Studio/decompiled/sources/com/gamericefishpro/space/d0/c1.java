package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ c1(com.gamericefishpro.space.t0.d0 d0Var, com.gamericefishpro.space.b1.i iVar, com.gamericefishpro.space.t.c0 c0Var, int i) {
        this.i = d0Var;
        this.v = iVar;
        this.w = c0Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f2.u0[] u0VarArr = (com.gamericefishpro.space.f2.u0[]) this.i;
                d1 d1Var = (d1) this.v;
                int[] iArr = (int[]) this.w;
                com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj;
                int length = u0VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    com.gamericefishpro.space.f2.u0 u0Var = u0VarArr[i];
                    Intrinsics.b(u0Var);
                    u0Var.i();
                    t0Var.h(u0Var, iArr[i2], Math.round((1 + d1Var.b.a) * ((this.e - u0Var.e) / 2.0f)), 0.0f);
                    i++;
                    i2++;
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.t0.d0 d0Var = (com.gamericefishpro.space.t0.d0) this.i;
                com.gamericefishpro.space.b1.i iVar = (com.gamericefishpro.space.b1.i) this.v;
                com.gamericefishpro.space.t.c0 c0Var = (com.gamericefishpro.space.t.c0) this.w;
                if (obj == d0Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof com.gamericefishpro.space.f1.c0) {
                    int i3 = iVar.a - this.e;
                    int iD = c0Var.d(obj);
                    c0Var.g(Math.min(i3, iD >= 0 ? c0Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ c1(com.gamericefishpro.space.f2.u0[] u0VarArr, d1 d1Var, int i, int[] iArr) {
        this.i = u0VarArr;
        this.v = d1Var;
        this.e = i;
        this.w = iArr;
    }
}
