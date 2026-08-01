package com.google.android.datatransport;

import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetUtility {
    public final Bundle WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final WinterFlowArrayEngine WinterFlowHookDataSource = new WinterFlowArrayEngine();
    public final int WinterFlowRouterStructure;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowWidgetUtility(int i, int i2, Bundle bundle, int i3) {
        this.WinterFlowVariableVersionControl = i3;
        this.WinterFlowRouterStructure = i;
        this.WinterFlowCacheManagerAgent = i2;
        this.WinterFlowArrayNetwork = bundle;
    }

    public final void WinterFlowCacheManagerAgent(WinterFlowSchedulerMicroservice winterFlowSchedulerMicroservice) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 14 + winterFlowSchedulerMicroservice.toString().length());
        }
        this.WinterFlowHookDataSource.WinterFlowRouterStructure.WinterFlowResponseEngine(winterFlowSchedulerMicroservice);
    }

    public final void WinterFlowHookDataSource(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 16 + String.valueOf(bundle).length());
        }
        this.WinterFlowHookDataSource.WinterFlowRouterStructure(bundle);
    }

    public final boolean WinterFlowRouterStructure() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    public final String toString() {
        int i = this.WinterFlowCacheManagerAgent;
        int length = String.valueOf(i).length();
        int i2 = this.WinterFlowRouterStructure;
        int length2 = String.valueOf(i2).length();
        boolean WinterFlowRouterStructure = WinterFlowRouterStructure();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(WinterFlowRouterStructure).length() + 1);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(WinterFlowRouterStructure);
        sb.append("}");
        return sb.toString();
    }
}
