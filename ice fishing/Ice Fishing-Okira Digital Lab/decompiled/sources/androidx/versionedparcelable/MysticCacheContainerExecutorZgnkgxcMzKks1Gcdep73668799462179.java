package androidx.versionedparcelable;

import android.content.Context;
import com.adjust.sdk.AdjustInstance;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class MysticCacheContainerExecutorZgnkgxcMzKks1Gcdep73668799462179 implements Runnable {
    public final /* synthetic */ Context LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ MysticCacheContainerExecutorZgnkgxcMzKks1Gcdep73668799462179(Context context, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Context context = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustInstance.lambda$setSendingReferrersAsNotSent$2(context);
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new MysticCacheContainerExecutorZgnkgxcMzKks1Gcdep73668799462179(context, 2));
                break;
            default:
                BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079(context, new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834, false);
                break;
        }
    }
}
