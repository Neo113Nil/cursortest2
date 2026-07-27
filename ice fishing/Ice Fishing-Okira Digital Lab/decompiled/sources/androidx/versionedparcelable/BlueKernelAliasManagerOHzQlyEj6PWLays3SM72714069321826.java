package androidx.versionedparcelable;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelAliasManagerOHzQlyEj6PWLays3SM72714069321826 implements Runnable {
    public final /* synthetic */ Runnable LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ SingleThreadCachedScheduler YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public BlueKernelAliasManagerOHzQlyEj6PWLays3SM72714069321826(SingleThreadCachedScheduler singleThreadCachedScheduler, long j, Runnable runnable) {
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = singleThreadCachedScheduler;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = j;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        } catch (InterruptedException e) {
            AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.submit(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
    }
}
