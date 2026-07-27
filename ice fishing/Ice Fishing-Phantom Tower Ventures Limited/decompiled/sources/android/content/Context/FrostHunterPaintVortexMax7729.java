package android.content.Context;

import android.content.Intent;
import android.content.IntentSender;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterPaintVortexMax7729 implements Runnable {
    public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterPaintVortexMax7729(int i, int i2, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i2;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterKeyframeGammaGamma1197 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterKeyframeGammaGamma1197;
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterChipNebulaCyberThunder6252 frostHunterChipNebulaCyberThunder6252 = (FrostHunterChipNebulaCyberThunder6252) obj2;
                Serializable serializable = (Serializable) ((FrostHunterLayoutInflaterTurboHyperion3832) obj).FrostHunterFlowMaxDragonHero5809;
                String str = (String) frostHunterChipNebulaCyberThunder6252.FrostHunterAlphaAnimationNeoCosmos5761.get(Integer.valueOf(i2));
                if (str != null) {
                    FrostHunterTextViewMaxSparkHyper5316 frostHunterTextViewMaxSparkHyper5316 = (FrostHunterTextViewMaxSparkHyper5316) frostHunterChipNebulaCyberThunder6252.FrostHunterLifecycleBlazeGammaElite2889.get(str);
                    if ((frostHunterTextViewMaxSparkHyper5316 != null ? frostHunterTextViewMaxSparkHyper5316.FrostHunterAlphaAnimationNeoCosmos5761 : null) != null) {
                        FrostHunterDataBindingSparkMasterPixel1556 frostHunterDataBindingSparkMasterPixel1556 = frostHunterTextViewMaxSparkHyper5316.FrostHunterAlphaAnimationNeoCosmos5761;
                        if (frostHunterChipNebulaCyberThunder6252.FrostHunterServiceEliteCelestialThunder1757.remove(str)) {
                            frostHunterDataBindingSparkMasterPixel1556.FrostHunterConstraintSetCloneMasterUltraRogue2633(serializable);
                            break;
                        }
                    } else {
                        frostHunterChipNebulaCyberThunder6252.FrostHunterRemoteConfigSpeedSpeed8566.remove(str);
                        frostHunterChipNebulaCyberThunder6252.FrostHunterLevelListDrawableFusionDragonHero2232.put(str, serializable);
                        break;
                    }
                }
                break;
            case 1:
                ((FrostHunterChipNebulaCyberThunder6252) obj2).FrostHunterAlphaAnimationNeoCosmos5761(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) ((FrostHunterCanvasSpectraPixelHyper7343) obj2).FrostHunterBundlePulseFusionHero2475).FrostHunterLintTitanVortexQuantum9911(i2, obj);
                break;
            default:
                FrostHunterApplicationInfoHeroForceSpark2431 frostHunterApplicationInfoHeroForceSpark2431 = (FrostHunterApplicationInfoHeroForceSpark2431) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    FrostHunterCamera2TurboSolar4584 frostHunterCamera2TurboSolar4584 = (FrostHunterCamera2TurboSolar4584) it.next();
                    if (!frostHunterCamera2TurboSolar4584.FrostHunterServiceEliteCelestialThunder1757) {
                        if (i2 != -1) {
                            frostHunterCamera2TurboSolar4584.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(i2);
                        }
                        frostHunterCamera2TurboSolar4584.FrostHunterBundlePulseFusionHero2475 = true;
                        frostHunterApplicationInfoHeroForceSpark2431.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCamera2TurboSolar4584.FrostHunterAlphaAnimationNeoCosmos5761);
                    }
                }
                break;
        }
    }
}
