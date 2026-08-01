package com.google.android.datatransport;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerLayer implements Callable {
    public final /* synthetic */ ArrayList WinterFlowCacheManagerAgent;
    public final /* synthetic */ Context WinterFlowHookDataSource;
    public final /* synthetic */ String WinterFlowRouterStructure;

    public WinterFlowWorkerLayer(String str, Context context, ArrayList arrayList) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = context;
        this.WinterFlowCacheManagerAgent = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return WinterFlowSessionManagerService.WinterFlowRouterStructure(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
        } catch (Throwable unused) {
            return new WinterFlowSchedulerEventEmitter(-3);
        }
    }
}
