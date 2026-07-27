package android.content.Context;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterChipGroupPhantomNovaPixel7139 extends ThreadLocal {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    public /* synthetic */ FrostHunterChipGroupPhantomNovaPixel7139(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    FrostHunterFaceDetectionOmegaBlazeInferno2129 frostHunterFaceDetectionOmegaBlazeInferno2129 = new FrostHunterFaceDetectionOmegaBlazeInferno2129(choreographer, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDialogFragmentTurboPhoenixDragon7627(myLooper));
                    return FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdMasterStrike9463(frostHunterFaceDetectionOmegaBlazeInferno2129, frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterResourcesTitanHyperVision5823);
                }
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761);
                return simpleDateFormat;
            case 2:
                return new Random();
            default:
                return new FrostHunterHandlerThreadHyperionCelestialEclipse6857();
        }
    }
}
