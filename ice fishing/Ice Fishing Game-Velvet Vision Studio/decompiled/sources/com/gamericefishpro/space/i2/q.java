package com.gamericefishpro.space.i2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2) {
        super(1);
        this.d = i2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(((com.gamericefishpro.space.m1.u) obj).H0(this.e));
            case 1:
                return Boolean.valueOf(((com.gamericefishpro.space.m1.u) obj).H0(this.e));
            case 2:
                return Boolean.valueOf(((com.gamericefishpro.space.m1.u) obj).H0(this.e));
            default:
                return Boolean.valueOf(((com.gamericefishpro.space.m1.u) obj).A0(this.e));
        }
    }
}
