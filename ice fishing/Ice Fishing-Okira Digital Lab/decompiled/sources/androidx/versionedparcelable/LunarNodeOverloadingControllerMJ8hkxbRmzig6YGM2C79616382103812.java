package androidx.versionedparcelable;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class LunarNodeOverloadingControllerMJ8hkxbRmzig6YGM2C79616382103812 implements Runnable {
    public final /* synthetic */ AdjustTimeoutCallback LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ Context TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ ArrayList YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ LunarNodeOverloadingControllerMJ8hkxbRmzig6YGM2C79616382103812(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = adjustTimeoutCallback;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = arrayList;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.getOnAdidReadListener() != null) {
                    synchronized (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.remove(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                    }
                    new Handler(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getMainLooper()).post(new XenoGridMiddlewareProxyJzLfJFHvkbfuk64ssP73805766878050(0, this));
                    return;
                }
                return;
            default:
                if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.getOnAttributionReadListener() != null) {
                    synchronized (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.remove(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                    }
                    new Handler(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getMainLooper()).post(new XenoGridMiddlewareProxyJzLfJFHvkbfuk64ssP73805766878050(1, this));
                    return;
                }
                return;
        }
    }
}
