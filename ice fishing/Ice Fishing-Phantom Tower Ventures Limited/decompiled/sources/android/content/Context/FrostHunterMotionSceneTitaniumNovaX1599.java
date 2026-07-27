package android.content.Context;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionSceneTitaniumNovaX1599 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    public /* synthetic */ FrostHunterMotionSceneTitaniumNovaX1599(int i, int i2, int i3, int i4, int i5, int i6) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = i3;
        this.FrostHunterServiceEliteCelestialThunder1757 = i4;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i5;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static FrostHunterMotionSceneTitaniumNovaX1599 FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        char c;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(split[i6].trim());
            FrostHunterConstraintSetCloneOmegaHyperion9304.getClass();
            switch (FrostHunterConstraintSetCloneOmegaHyperion9304.hashCode()) {
                case 100571:
                    if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102749521:
                    if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("layer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("start")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new FrostHunterMotionSceneTitaniumNovaX1599(i, i2, i3, i4, i5, split.length);
    }
}
