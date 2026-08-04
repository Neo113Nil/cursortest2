package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ m[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(m[] mVarArr, int i) {
        super(2);
        this.d = i;
        this.e = mVarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.valueOf(x.d((t0) obj, true, this.e, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(x.d((t0) obj, false, this.e, ((Number) obj2).floatValue()));
        }
    }
}
