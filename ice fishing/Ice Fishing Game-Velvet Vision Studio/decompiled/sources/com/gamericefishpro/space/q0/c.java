package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Function2 {
    public static final c e = new c(0);
    public static final c i = new c(1);
    public static final c v = new c(2);
    public static final c w = new c(3);
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i2) {
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.V();
                }
                break;
            case 1:
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!rVar2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.V();
                }
                break;
            case 2:
                com.gamericefishpro.space.t0.r rVar3 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!rVar3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rVar3.V();
                }
                break;
            default:
                com.gamericefishpro.space.t0.r rVar4 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!rVar4.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rVar4.V();
                }
                break;
        }
        return Unit.a;
    }
}
