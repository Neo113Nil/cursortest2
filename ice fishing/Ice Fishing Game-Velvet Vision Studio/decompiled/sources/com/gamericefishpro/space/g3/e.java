package com.gamericefishpro.space.g3;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.i2.a1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.v.k0;
import com.gamericefishpro.space.v.y;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj) {
        super(2);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        boolean z = false;
        Object obj3 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = rVar.P();
                    if (objP == com.gamericefishpro.space.t0.n.a) {
                        objP = d.d;
                        rVar.k0(objP);
                    }
                    AtomicInteger atomicInteger = com.gamericefishpro.space.o2.m.a;
                    com.gamericefishpro.space.d9.h.i(new com.gamericefishpro.space.o2.b((Function1) objP, false), (Function2) ((v0) obj3).getValue(), rVar, 0);
                } else {
                    rVar.V();
                }
                return Unit.a;
            case 1:
                ((Number) obj2).intValue();
                ((n) obj3).a((com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 2:
                com.gamericefishpro.space.h1.m mVar = (com.gamericefishpro.space.h1.m) obj;
                com.gamericefishpro.space.h1.k kVar = (com.gamericefishpro.space.h1.k) obj2;
                if (!(kVar instanceof com.gamericefishpro.space.h1.h)) {
                    return mVar.c(kVar);
                }
                e0.c(3, null);
                throw null;
            case 3:
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((com.gamericefishpro.space.i2.a) obj3).a(rVar2, 0);
                } else {
                    rVar2.V();
                }
                return Unit.a;
            case 4:
                ((Number) obj2).intValue();
                ((a1) obj3).a((com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((com.gamericefishpro.space.j1.d) obj3).m(((Number) obj).intValue(), (com.gamericefishpro.space.o2.o) obj2);
                return Unit.a;
            default:
                y yVar = (y) obj;
                y yVar2 = (y) obj2;
                y yVar3 = y.i;
                if (yVar == yVar3 && yVar2 == yVar3 && !((k0) obj3).a.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.gamericefishpro.space.i2.a aVar, int i, int i2) {
        super(2);
        this.d = i2;
        this.e = aVar;
    }
}
