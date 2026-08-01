package com.google.android.datatransport;

import android.content.Context;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadDeployment implements Callable {
    public final /* synthetic */ Object WinterFlowCacheManagerAgent;
    public final /* synthetic */ Context WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowThreadDeployment(Context context, Object obj, int i) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = context;
        this.WinterFlowCacheManagerAgent = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Reflection.getPlayAdId(this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
            default:
                return Reflection.isPlayTrackingEnabled(this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
        }
    }
}
