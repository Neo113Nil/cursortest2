package com.appsflyer.internal;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {
    private final AFc1eSDK AFAdRevenueData;
    private final AFf1eSDK getCurrencyIso4217Code;
    private final AFc1hSDK getMonetizationNetwork;

    public AFb1cSDK(AFc1eSDK aFc1eSDK, AFc1hSDK aFc1hSDK, AFf1eSDK aFf1eSDK) {
        aFc1eSDK.getClass();
        aFc1hSDK.getClass();
        aFf1eSDK.getClass();
        this.AFAdRevenueData = aFc1eSDK;
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean AFAdRevenueData() {
        return !this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !this.AFAdRevenueData.getMediationNetwork() && AFj1kSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1kSDK.getMonetizationNetwork(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Task appSetIdInfo = zze.getClient(context).getAppSetIdInfo();
                ((zzw) appSetIdInfo).addOnSuccessListener(TaskExecutors.MAIN_THREAD, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 22));
            } catch (Throwable th) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        aFb1cSDK.getClass();
        AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        id.getClass();
        aFc1eSDK.copydefault = new AFb1gSDK(scope, id);
    }
}
