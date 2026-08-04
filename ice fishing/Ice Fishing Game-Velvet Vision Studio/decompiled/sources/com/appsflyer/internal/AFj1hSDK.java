package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    public final String getMediationNetwork() {
        Object objQ;
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.c(obj, "");
            objQ = (String) obj;
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        return (String) (objQ instanceof com.gamericefishpro.space.oh.o ? "" : objQ);
    }
}
