package android.content.Context;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterHandlerThreadFusionOmegaHero7374 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final String FrostHunterLevelListDrawableFusionDragonHero2232;
    public final String FrostHunterLifecycleBlazeGammaElite2889;
    public final String FrostHunterRemoteConfigSpeedSpeed8566;
    public final List FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterHandlerThreadFusionOmegaHero7374(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        str2.getClass();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str2;
        this.FrostHunterBundlePulseFusionHero2475 = str3;
        list.getClass();
        this.FrostHunterServiceEliteCelestialThunder1757 = list;
        this.FrostHunterLifecycleBlazeGammaElite2889 = str4;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = str5;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", mProviderPackage: " + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", mQuery: " + this.FrostHunterBundlePulseFusionHero2475 + ", mSystemFont: " + this.FrostHunterLifecycleBlazeGammaElite2889 + ", mVariationSettings: " + this.FrostHunterLevelListDrawableFusionDragonHero2232 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.FrostHunterServiceEliteCelestialThunder1757;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
