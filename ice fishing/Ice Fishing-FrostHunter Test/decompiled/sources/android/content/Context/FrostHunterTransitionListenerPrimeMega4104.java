package android.content.Context;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionListenerPrimeMega4104 implements Runnable {
    public final /* synthetic */ ArrayList FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ AdjustTimeoutCallback FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Context FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterTransitionListenerPrimeMega4104(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = adjustTimeoutCallback;
        this.FrostHunterAlertDialogAuroraDelta3200 = arrayList;
        this.FrostHunterKeyframeGammaGamma1197 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.FrostHunterFlowMaxDragonHero5809.getOnAdidReadListener() != null) {
                    synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
                        this.FrostHunterAlertDialogAuroraDelta3200.remove(this.FrostHunterFlowMaxDragonHero5809);
                    }
                    new Handler(this.FrostHunterKeyframeGammaGamma1197.getMainLooper()).post(new FrostHunterPlaceholderInfernoSparkTurbo6992(0, this));
                    return;
                }
                return;
            default:
                if (this.FrostHunterFlowMaxDragonHero5809.getOnAttributionReadListener() != null) {
                    synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
                        this.FrostHunterAlertDialogAuroraDelta3200.remove(this.FrostHunterFlowMaxDragonHero5809);
                    }
                    new Handler(this.FrostHunterKeyframeGammaGamma1197.getMainLooper()).post(new FrostHunterPlaceholderInfernoSparkTurbo6992(1, this));
                    return;
                }
                return;
        }
    }
}
