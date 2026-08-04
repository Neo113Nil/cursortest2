package com.gamericefishpro.space.k7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int i;

    public /* synthetic */ g(Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) obj;
        Integer num = (Integer) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                num.intValue();
                y3.h(this.e, rVar, i.D(this.i | 1));
                break;
            case 1:
                num.getClass();
                h.c(this.e, rVar, i.D(this.i | 1));
                break;
            case 2:
                num.intValue();
                com.gamericefishpro.space.hj.c.f(this.e, rVar, i.D(this.i | 1));
                break;
            case 3:
                num.intValue();
                d5.e(this.e, rVar, i.D(this.i | 1));
                break;
            case 4:
                num.intValue();
                com.gamericefishpro.space.hj.c.e(this.e, rVar, i.D(this.i | 1));
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                num.intValue();
                com.gamericefishpro.space.b9.a.d(this.e, rVar, i.D(this.i | 1));
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                num.intValue();
                d5.f(this.e, rVar, i.D(this.i | 1));
                break;
            default:
                num.intValue();
                com.gamericefishpro.space.u6.f.b(this.e, rVar, i.D(this.i | 1));
                break;
        }
        return Unit.a;
    }
}
