package android.content.Context;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStateListAnimatorQuantumHyperionTitanium1903 {
    public static final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final Uri FrostHunterAlphaAnimationNeoCosmos5761;
    public final byte[] FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final long FrostHunterLifecycleBlazeGammaElite2889;
    public final int FrostHunterRemoteConfigSpeedSpeed8566;
    public final Map FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterColorStateListInflaterNovaXLegend5808.FrostHunterAlphaAnimationNeoCosmos5761("media3.datasource");
    }

    public FrostHunterStateListAnimatorQuantumHyperionTitanium1903(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j >= 0);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j >= 0);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j2 > 0 || j2 == -1);
        uri.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = uri;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = (bArr == null || bArr.length == 0) ? null : bArr;
        this.FrostHunterServiceEliteCelestialThunder1757 = Collections.unmodifiableMap(new HashMap(map));
        this.FrostHunterLifecycleBlazeGammaElite2889 = j;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = j2;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append(", ");
        sb.append(this.FrostHunterLifecycleBlazeGammaElite2889);
        sb.append(", ");
        sb.append(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        sb.append(", null, ");
        sb.append(this.FrostHunterRemoteConfigSpeedSpeed8566);
        sb.append("]");
        return sb.toString();
    }
}
