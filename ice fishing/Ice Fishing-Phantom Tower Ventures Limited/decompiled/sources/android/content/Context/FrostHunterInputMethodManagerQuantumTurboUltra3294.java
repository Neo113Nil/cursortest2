package android.content.Context;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterInputMethodManagerQuantumTurboUltra3294 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;

    public /* synthetic */ FrostHunterInputMethodManagerQuantumTurboUltra3294(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = AlarmManagerSchedulerBroadcastReceiver.FrostHunterAlphaAnimationNeoCosmos5761;
                return;
            default:
                FrostHunterOrientationSensorPhoenixOmegaStorm9585 frostHunterOrientationSensorPhoenixOmegaStorm9585 = FrostHunterFilterSpectraTitan5298.FrostHunterShapeDrawableSolarOlympian7689;
                synchronized (frostHunterOrientationSensorPhoenixOmegaStorm9585) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterAlphaAnimationNeoCosmos5761;
                        int i3 = frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = (FrostHunterFilterSpectraTitan5298) objArr[i4];
                                boolean showLayoutBounds = frostHunterFilterSpectraTitan5298.getShowLayoutBounds();
                                Class cls = FrostHunterFilterSpectraTitan5298.FrostHunterLayoutLegendDelta7410;
                                frostHunterFilterSpectraTitan5298.setShowLayoutBounds(FrostHunterVectorDrawableForceMax1351.FrostHunterLintTitanVortexQuantum9911());
                                if (showLayoutBounds != frostHunterFilterSpectraTitan5298.getShowLayoutBounds()) {
                                    FrostHunterFilterSpectraTitan5298.FrostHunterLintTitanVortexQuantum9911(frostHunterFilterSpectraTitan5298.getRoot());
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                FrostHunterFilterSpectraTitan5298.FrostHunterLintTitanVortexQuantum9911(((FrostHunterFilterSpectraTitan5298) objArr[i4]).getRoot());
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
