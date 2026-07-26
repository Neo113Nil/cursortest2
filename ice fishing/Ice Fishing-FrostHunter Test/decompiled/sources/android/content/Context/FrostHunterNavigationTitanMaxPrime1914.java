package android.content.Context;

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

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterNavigationTitanMaxPrime1914 implements Runnable {
    public final /* synthetic */ long FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Context FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ AdjustInstance FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterNavigationTitanMaxPrime1914(AdjustInstance adjustInstance, Context context, Object obj, long j, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterKeyframeGammaGamma1197 = adjustInstance;
        this.FrostHunterFlowMaxDragonHero5809 = context;
        this.FrostHunterFragmentBetaMegaVortex6025 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        AdjustInstance adjustInstance = this.FrostHunterKeyframeGammaGamma1197;
        Object obj = this.FrostHunterFragmentBetaMegaVortex6025;
        long j = this.FrostHunterAlertDialogAuroraDelta3200;
        Context context = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context);
                if (adidFromActivityStateFile == null) {
                    arrayList = adjustInstance.cachedAdidReadTimeoutCallbacks;
                    ActivityHandler.queueGetAdidWithTimeout(j, (OnAdidReadListener) obj, arrayList, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new FrostHunterActivityRogueFusionRogue5543(9, this, adidFromActivityStateFile));
                    break;
                }
            default:
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context);
                if (attributionFromAttributionFile == null) {
                    arrayList2 = adjustInstance.cachedAttributionReadTimeoutCallbacks;
                    ActivityHandler.queueGetAttributionWithTimeout(j, (OnAttributionReadListener) obj, arrayList2, context);
                    break;
                } else {
                    new Handler(context.getMainLooper()).post(new FrostHunterActivityRogueFusionRogue5543(10, this, attributionFromAttributionFile));
                    break;
                }
        }
    }
}
