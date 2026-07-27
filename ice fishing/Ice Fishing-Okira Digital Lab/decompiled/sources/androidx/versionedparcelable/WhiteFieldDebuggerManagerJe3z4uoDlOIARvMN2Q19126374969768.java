package androidx.versionedparcelable;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class WhiteFieldDebuggerManagerJe3z4uoDlOIARvMN2Q19126374969768 implements Runnable {
    public final /* synthetic */ Object BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final /* synthetic */ Context LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ AdjustInstance TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ long YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ WhiteFieldDebuggerManagerJe3z4uoDlOIARvMN2Q19126374969768(AdjustInstance adjustInstance, Context context, Object obj, long j, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = adjustInstance;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = obj;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        AdjustInstance adjustInstance = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        Object obj = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        long j = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        Context context = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context);
                if (adidFromActivityStateFile == null) {
                    arrayList = adjustInstance.cachedAdidReadTimeoutCallbacks;
                    ActivityHandler.queueGetAdidWithTimeout(j, (OnAdidReadListener) obj, arrayList, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(9, this, adidFromActivityStateFile));
                    break;
                }
            default:
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context);
                if (attributionFromAttributionFile == null) {
                    arrayList2 = adjustInstance.cachedAttributionReadTimeoutCallbacks;
                    ActivityHandler.queueGetAttributionWithTimeout(j, (OnAttributionReadListener) obj, arrayList2, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(10, this, attributionFromAttributionFile));
                    break;
                }
        }
    }
}
