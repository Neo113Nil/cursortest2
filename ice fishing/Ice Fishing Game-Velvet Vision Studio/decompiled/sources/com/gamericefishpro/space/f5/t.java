package com.gamericefishpro.space.f5;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Bundle e;

    public /* synthetic */ t(Bundle bundle, int i) {
        this.d = i;
        this.e = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zN;
        String argName = (String) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(argName, "argName");
                Bundle source = this.e;
                Intrinsics.checkNotNullParameter(source, "source");
                zN = com.gamericefishpro.space.u6.f.n(argName, source);
                break;
            default:
                Intrinsics.checkNotNullParameter(argName, "key");
                Bundle source2 = this.e;
                Intrinsics.checkNotNullParameter(source2, "source");
                zN = com.gamericefishpro.space.u6.f.n(argName, source2);
                break;
        }
        return Boolean.valueOf(!zN);
    }
}
