package android.content.Context;

import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBannerAdMaxSpark9420 extends FrostHunterTransitionGammaTitanSpeed7178 {
    public final /* synthetic */ int FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public /* synthetic */ FrostHunterBannerAdMaxSpark9420(int i) {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i;
    }

    @Override // android.content.Context.FrostHunterTransitionGammaTitanSpeed7178
    public final Intent FrostHunterMotionSceneAuroraMega2271(Context context, Object obj) {
        switch (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                putExtra.getClass();
                return putExtra;
            default:
                return (Intent) obj;
        }
    }

    @Override // android.content.Context.FrostHunterTransitionGammaTitanSpeed7178
    public final Object FrostHunterRewardedAdSpectraElite8288(Intent intent, int i) {
        switch (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (intArrayExtra[i2] == 0) {
                                z = true;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new FrostHunterRealtimeDatabasePulseStormOlympian4721(intent, i);
        }
    }

    @Override // android.content.Context.FrostHunterTransitionGammaTitanSpeed7178
    public FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterViewPhantomNeo1634(Context context, Object obj) {
        switch (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (FrostHunterRemoteConfigPhantomDelta1739.FrostHunterCameraXTurboCelestialHero5430(context, (String) obj) != 0) {
                    return null;
                }
                return new FrostHunterLayoutInflaterTurboHyperion3832(8, Boolean.TRUE);
            default:
                return super.FrostHunterViewPhantomNeo1634(context, obj);
        }
    }
}
