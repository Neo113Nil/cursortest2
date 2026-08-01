package com.google.android.datatransport;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationAgent extends AsyncTaskExecutor {
    public final /* synthetic */ AdjustInstance WinterFlowCacheManagerAgent;
    public final /* synthetic */ OnLastDeeplinkReadListener WinterFlowHookDataSource;
    public final /* synthetic */ Context WinterFlowRouterStructure;

    public WinterFlowDeserializationAgent(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.WinterFlowCacheManagerAgent = adjustInstance;
        this.WinterFlowRouterStructure = context;
        this.WinterFlowHookDataSource = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        String cachedDeeplink;
        cachedDeeplink = this.WinterFlowCacheManagerAgent.getCachedDeeplink(this.WinterFlowRouterStructure);
        try {
            return Uri.parse(cachedDeeplink);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.WinterFlowHookDataSource.onLastDeeplinkRead((Uri) obj);
    }
}
