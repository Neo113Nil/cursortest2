package android.content.Context;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActionBarPulseQuantum4879 extends FrostHunterKeyEventSolarVortex1388 {
    public boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final AssetManager FrostHunterFragmentBetaMegaVortex6025;
    public InputStream FrostHunterLightSensorForceFusion4241;
    public long FrostHunterScaleAnimationStrikeSpark5059;
    public Uri FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterActionBarPulseQuantum4879(Context context) {
        super(false);
        this.FrostHunterFragmentBetaMegaVortex6025 = context.getAssets();
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        try {
            Uri uri = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
            long j = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889;
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            FrostHunterFragmentBetaMegaVortex6025();
            InputStream open = this.FrostHunterFragmentBetaMegaVortex6025.open(path, 1);
            this.FrostHunterLightSensorForceFusion4241 = open;
            if (open.skip(j) < j) {
                throw new FrostHunterPushNotificationAuroraForceAurora7331(null, 2008);
            }
            long j2 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (j2 != -1) {
                this.FrostHunterScaleAnimationStrikeSpark5059 = j2;
            } else {
                long available = this.FrostHunterLightSensorForceFusion4241.available();
                this.FrostHunterScaleAnimationStrikeSpark5059 = available;
                if (available == 2147483647L) {
                    this.FrostHunterScaleAnimationStrikeSpark5059 = -1L;
                }
            }
            this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = true;
            FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
            return this.FrostHunterScaleAnimationStrikeSpark5059;
        } catch (FrostHunterPushNotificationAuroraForceAurora7331 e) {
            throw e;
        } catch (IOException e2) {
            throw new FrostHunterPushNotificationAuroraForceAurora7331(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void close() {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
        try {
            try {
                InputStream inputStream = this.FrostHunterLightSensorForceFusion4241;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new FrostHunterPushNotificationAuroraForceAurora7331(e, 2000);
            }
        } finally {
            this.FrostHunterLightSensorForceFusion4241 = null;
            if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = false;
                FrostHunterRemoteConfigSpeedSpeed8566();
            }
        }
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.FrostHunterScaleAnimationStrikeSpark5059;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new FrostHunterPushNotificationAuroraForceAurora7331(e, 2000);
                }
            }
            InputStream inputStream = this.FrostHunterLightSensorForceFusion4241;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.FrostHunterScaleAnimationStrikeSpark5059;
                if (j2 != -1) {
                    this.FrostHunterScaleAnimationStrikeSpark5059 = j2 - read;
                }
                FrostHunterBundlePulseFusionHero2475(read);
                return read;
            }
        }
        return -1;
    }
}
