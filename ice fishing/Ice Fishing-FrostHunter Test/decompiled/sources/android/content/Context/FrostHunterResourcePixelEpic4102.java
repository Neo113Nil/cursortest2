package android.content.Context;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterResourcePixelEpic4102 {
    public final List FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterPushNotificationUltraQuantum3493 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterResourcePixelEpic4102(List list, FrostHunterPushNotificationUltraQuantum3493 frostHunterPushNotificationUltraQuantum3493) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = list;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterPushNotificationUltraQuantum3493;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = frostHunterPushNotificationUltraQuantum3493 != null ? (MotionEvent) ((FrostHunterKotlinQuantumRogue5892) frostHunterPushNotificationUltraQuantum3493.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809 : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = frostHunterPushNotificationUltraQuantum3493 != null ? (MotionEvent) ((FrostHunterKotlinQuantumRogue5892) frostHunterPushNotificationUltraQuantum3493.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809 : null;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = frostHunterPushNotificationUltraQuantum3493 != null ? (MotionEvent) ((FrostHunterKotlinQuantumRogue5892) frostHunterPushNotificationUltraQuantum3493.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809 : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = frostHunterPushNotificationUltraQuantum3493 != null ? (MotionEvent) ((FrostHunterKotlinQuantumRogue5892) frostHunterPushNotificationUltraQuantum3493.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809 : null;
        int i = 0;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                FrostHunterViewHyperEliteHyper5851 frostHunterViewHyperEliteHyper5851 = (FrostHunterViewHyperEliteHyper5851) list.get(i);
                if (FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterScaleAnimationStrikeSpark5059(frostHunterViewHyperEliteHyper5851)) {
                    i = 2;
                } else if (FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterViewHyperEliteHyper5851)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.FrostHunterBundlePulseFusionHero2475 = i;
    }
}
