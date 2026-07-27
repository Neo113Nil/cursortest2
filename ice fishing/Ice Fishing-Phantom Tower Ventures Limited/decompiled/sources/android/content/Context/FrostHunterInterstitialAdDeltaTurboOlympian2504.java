package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInterstitialAdDeltaTurboOlympian2504 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    public /* synthetic */ FrostHunterInterstitialAdDeltaTurboOlympian2504(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    public final FrostHunterGeocoderDragonPixel4082 FrostHunterAlphaAnimationNeoCosmos5761(Object obj, FrostHunterCameraViewTitaniumHyperionEclipse8189 frostHunterCameraViewTitaniumHyperionEclipse8189) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return FrostHunterLooperThreadStormCyberElite6638.FrostHunterFragmentBetaMegaVortex6025(((Uri) obj).toString());
            case 1:
                return FrostHunterLooperThreadStormCyberElite6638.FrostHunterAlphaAnimationNeoCosmos5761(((File) obj).getPath());
            case 2:
                return FrostHunterLooperThreadStormCyberElite6638.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterCoroutineScopePrimeSpark1417) obj).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXTurboCelestialHero5430());
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = frostHunterCameraViewTitaniumHyperionEclipse8189.FrostHunterAlphaAnimationNeoCosmos5761;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return FrostHunterLooperThreadStormCyberElite6638.FrostHunterFragmentBetaMegaVortex6025("android.resource://" + context.getPackageName() + "/" + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return FrostHunterLooperThreadStormCyberElite6638.FrostHunterFragmentBetaMegaVortex6025((String) obj);
        }
    }
}
