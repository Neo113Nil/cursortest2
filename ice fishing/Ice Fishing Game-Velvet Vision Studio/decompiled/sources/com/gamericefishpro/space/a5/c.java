package com.gamericefishpro.space.a5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.n;
import com.gamericefishpro.space.h0.v0;
import com.gamericefishpro.space.h0.z;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.z4.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ c(int i, String str, Function0 function0, Function0 function1, int i2) {
        this.d = 5;
        this.e = i;
        this.i = str;
        this.v = function0;
        this.w = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).intValue();
                com.gamericefishpro.space.d9.h.h((u) this.i, (g) this.v, (Function1) this.w, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iD = com.gamericefishpro.space.t0.i.D(this.e) | 1;
                ((com.gamericefishpro.space.b1.h) this.i).f(this.v, this.w, (r) obj, iD);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iD2 = com.gamericefishpro.space.t0.i.D(this.e | 1);
                ((com.gamericefishpro.space.e1.d) this.i).a(this.v, (com.gamericefishpro.space.b1.h) this.w, (r) obj, iD2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iD3 = com.gamericefishpro.space.t0.i.D(1);
                n.d((z) this.i, this.v, this.e, this.w, (r) obj, iD3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iD4 = com.gamericefishpro.space.t0.i.D(this.e | 1);
                ((v0) this.i).a(this.v, (com.gamericefishpro.space.b1.h) this.w, (r) obj, iD4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iD5 = com.gamericefishpro.space.t0.i.D(1);
                com.gamericefishpro.space.m7.a.a(this.e, (String) this.i, (Function0) this.v, (Function0) this.w, (r) obj, iD5);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c(z zVar, Object obj, int i, Object obj2, int i2) {
        this.d = 3;
        this.i = zVar;
        this.v = obj;
        this.e = i;
        this.w = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.i = obj;
        this.v = obj2;
        this.w = obj3;
        this.e = i;
    }
}
