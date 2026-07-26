package android.content.Context;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInAppPurchaseNebulaPrimeNebula1341 extends FrostHunterKeyEventSolarVortex1388 {
    public RandomAccessFile FrostHunterFragmentBetaMegaVortex6025;
    public long FrostHunterLightSensorForceFusion4241;
    public boolean FrostHunterScaleAnimationStrikeSpark5059;
    public Uri FrostHunterServiceConnectionTurboPhoenixOmega6719;

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        Uri uri = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        long j = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = uri;
        FrostHunterFragmentBetaMegaVortex6025();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.FrostHunterFragmentBetaMegaVortex6025 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (j2 == -1) {
                    j2 = this.FrostHunterFragmentBetaMegaVortex6025.length() - j;
                }
                this.FrostHunterLightSensorForceFusion4241 = j2;
                if (j2 < 0) {
                    throw new FrostHunterTextInputLayoutQuantumShadow7150(null, null, 2008);
                }
                this.FrostHunterScaleAnimationStrikeSpark5059 = true;
                FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
                return this.FrostHunterLightSensorForceFusion4241;
            } catch (IOException e) {
                throw new FrostHunterTextInputLayoutQuantumShadow7150(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FrostHunterTextInputLayoutQuantumShadow7150(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FrostHunterTextInputLayoutQuantumShadow7150("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, ErrorCodes.PROTOCOL_EXCEPTION);
        } catch (SecurityException e3) {
            throw new FrostHunterTextInputLayoutQuantumShadow7150(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FrostHunterTextInputLayoutQuantumShadow7150(e4, 2000);
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
                RandomAccessFile randomAccessFile = this.FrostHunterFragmentBetaMegaVortex6025;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FrostHunterTextInputLayoutQuantumShadow7150(e, 2000);
            }
        } finally {
            this.FrostHunterFragmentBetaMegaVortex6025 = null;
            if (this.FrostHunterScaleAnimationStrikeSpark5059) {
                this.FrostHunterScaleAnimationStrikeSpark5059 = false;
                FrostHunterRemoteConfigSpeedSpeed8566();
            }
        }
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.FrostHunterLightSensorForceFusion4241;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.FrostHunterFragmentBetaMegaVortex6025;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.FrostHunterLightSensorForceFusion4241 -= read;
                FrostHunterBundlePulseFusionHero2475(read);
            }
            return read;
        } catch (IOException e) {
            throw new FrostHunterTextInputLayoutQuantumShadow7150(e, 2000);
        }
    }
}
