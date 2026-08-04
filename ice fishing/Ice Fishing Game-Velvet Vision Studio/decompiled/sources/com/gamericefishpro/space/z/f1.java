package com.gamericefishpro.space.z;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ j1 e;

    public /* synthetic */ f1(j1 j1Var, int i) {
        this.d = i;
        this.e = j1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(this.e.G);
            default:
                com.gamericefishpro.space.m1.u uVar = this.e.i0;
                if (!uVar.d.G) {
                    return null;
                }
                com.gamericefishpro.space.m1.s sVarF0 = uVar.F0();
                int iOrdinal = sVarF0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (sVarF0.a()) {
                    return uVar.D0(null);
                }
                com.gamericefishpro.space.m1.u uVarF = ((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).f();
                if (uVarF != null) {
                    return uVarF.D0(com.gamericefishpro.space.h2.k.r(uVar));
                }
                return null;
        }
    }
}
