package com.google.android.datatransport;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseHandler implements Runnable {
    public final /* synthetic */ AdjustInstance WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Context WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ long WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDatabaseHandler(AdjustInstance adjustInstance, Context context, Object obj, long j, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowRouterRouter = adjustInstance;
        this.WinterFlowTransactionManagerStrategy = context;
        this.WinterFlowSyntax = obj;
        this.WinterFlowUnitTestResponse = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = this.WinterFlowVariableVersionControl;
        AdjustInstance adjustInstance = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        long j = this.WinterFlowUnitTestResponse;
        Context context = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustThirdPartySharingResult thirdPartySharingResult = SharedPreferencesManager.getDefaultInstance(context).getThirdPartySharingResult();
                if (thirdPartySharingResult == null) {
                    arrayList = adjustInstance.cachedThirdPartySharingTimeoutCallbacks;
                    ActivityHandler.queueGetThirdPartySharingSettingsWithTimeout(j, (OnThirdPartySharingSettingsReadListener) obj, arrayList, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new WinterFlowValidatorSystem(13, this, thirdPartySharingResult));
                    break;
                }
            case 1:
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context);
                if (adidFromActivityStateFile == null) {
                    arrayList2 = adjustInstance.cachedAdidReadTimeoutCallbacks;
                    ActivityHandler.queueGetAdidWithTimeout(j, (OnAdidReadListener) obj, arrayList2, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new WinterFlowValidatorSystem(14, this, adidFromActivityStateFile));
                    break;
                }
            default:
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context);
                if (attributionFromAttributionFile == null) {
                    arrayList3 = adjustInstance.cachedAttributionReadTimeoutCallbacks;
                    ActivityHandler.queueGetAttributionWithTimeout(j, (OnAttributionReadListener) obj, arrayList3, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new WinterFlowValidatorSystem(15, this, attributionFromAttributionFile));
                    break;
                }
        }
    }
}
