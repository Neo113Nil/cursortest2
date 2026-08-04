package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {
    private final AFc1eSDK AFAdRevenueData;
    private final AFf1eSDK getCurrencyIso4217Code;
    private final AFc1hSDK getMonetizationNetwork;

    public AFb1cSDK(AFc1eSDK aFc1eSDK, AFc1hSDK aFc1hSDK, AFf1eSDK aFf1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        this.AFAdRevenueData = aFc1eSDK;
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean AFAdRevenueData() {
        return !this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !this.AFAdRevenueData.getMediationNetwork() && AFj1kSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1kSDK.getMonetizationNetwork(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.appsflyer.internal.f] */
    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().d(new com.gamericefishpro.space.r9.e() { // from class: com.appsflyer.internal.f
                    @Override // com.gamericefishpro.space.r9.e
                    public final void c(Object obj) {
                        AFb1cSDK.getMonetizationNetwork(this.d, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                Unit unit = Unit.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id, "");
        aFc1eSDK.copydefault = new AFb1gSDK(scope, id);
    }
}
