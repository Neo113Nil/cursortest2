package com.gamericefishpro.space.b1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.z;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.t0.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ f(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.v = obj;
        this.i = obj2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).intValue();
                ((h) this.v).e(this.i, (r) obj, com.gamericefishpro.space.t0.i.D(this.e) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((com.gamericefishpro.space.f0.j) this.v).e(this.e, this.i, (r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((com.gamericefishpro.space.g0.h) this.v).e(this.e, this.i, (r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            case 3:
                z zVar = (z) this.v;
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zVar.e(this.e, this.i, rVar, 0);
                } else {
                    rVar.V();
                }
                break;
            case 4:
                ((Integer) obj2).intValue();
                y3.d((com.gamericefishpro.space.u1.f) this.v, (Function0) this.i, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.i.a.f((com.gamericefishpro.space.h1.m) this.v, (Function0) this.i, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).intValue();
                com.gamericefishpro.space.t0.i.a((com.gamericefishpro.space.n.p) this.v, (Function2) this.i, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                com.gamericefishpro.space.t0.i.b((com.gamericefishpro.space.n.p[]) this.v, (Function2) this.i, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f(int i, z zVar, Object obj) {
        this.d = 3;
        this.v = zVar;
        this.e = i;
        this.i = obj;
    }

    public /* synthetic */ f(z zVar, int i, Object obj, int i2, int i3) {
        this.d = i3;
        this.v = zVar;
        this.e = i;
        this.i = obj;
    }
}
