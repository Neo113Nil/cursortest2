package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.w.m1;
import com.gamericefishpro.space.z.k1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements k1 {
    public static final com.gamericefishpro.space.u6.c j = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.r2.u(25), new com.gamericefishpro.space.x7.e(4));
    public final com.gamericefishpro.space.t0.c1 a;
    public float f;
    public final com.gamericefishpro.space.t0.d0 h;
    public final com.gamericefishpro.space.t0.d0 i;
    public final com.gamericefishpro.space.t0.c1 b = new com.gamericefishpro.space.t0.c1(0);
    public final com.gamericefishpro.space.t0.c1 c = new com.gamericefishpro.space.t0.c1(0);
    public final com.gamericefishpro.space.b0.i d = new com.gamericefishpro.space.b0.i();
    public final com.gamericefishpro.space.t0.c1 e = new com.gamericefishpro.space.t0.c1(Integer.MAX_VALUE);
    public final com.gamericefishpro.space.c8.h g = new com.gamericefishpro.space.c8.h(new m1(5, this));

    public c1(int i) {
        this.a = new com.gamericefishpro.space.t0.c1(i);
        final int i2 = 0;
        this.h = com.gamericefishpro.space.t0.i.p(new Function0(this) { // from class: com.gamericefishpro.space.y.b1
            public final /* synthetic */ c1 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        c1 c1Var = this.e;
                        return Boolean.valueOf(c1Var.a.g() < c1Var.e.g());
                    default:
                        return Boolean.valueOf(this.e.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = com.gamericefishpro.space.t0.i.p(new Function0(this) { // from class: com.gamericefishpro.space.y.b1
            public final /* synthetic */ c1 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        c1 c1Var = this.e;
                        return Boolean.valueOf(c1Var.a.g() < c1Var.e.g());
                    default:
                        return Boolean.valueOf(this.e.a.g() > 0);
                }
            }
        });
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean a() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean b() {
        return this.g.b();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final Object d(r0 r0Var, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        Object objD = this.g.d(r0Var, function2, cVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.z.k1
    public final float e(float f) {
        return this.g.e(f);
    }
}
