package com.gamericefishpro.space.k7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d7.l;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.t0.r;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public /* synthetic */ b(int i, List list) {
        this.d = i;
        this.e = list;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f0.c cVar = (com.gamericefishpro.space.f0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                r rVar = (r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar.f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (rVar.S(i & 1, (i & 147) != 146)) {
                    com.gamericefishpro.space.d7.g gVar = (com.gamericefishpro.space.d7.g) this.e.get(iIntValue);
                    rVar.a0(-1731541983);
                    com.gamericefishpro.space.hj.c.b(gVar, rVar, 0);
                    rVar.p(false);
                } else {
                    rVar.V();
                }
                break;
            default:
                com.gamericefishpro.space.f0.c cVar2 = (com.gamericefishpro.space.f0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                r rVar2 = (r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(cVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.S(i2 & 1, (i2 & 147) != 146)) {
                    l lVar = (l) this.e.get(iIntValue3);
                    rVar2.a0(-1057196117);
                    a4.a(lVar, rVar2, 0);
                    rVar2.p(false);
                } else {
                    rVar2.V();
                }
                break;
        }
        return Unit.a;
    }
}
