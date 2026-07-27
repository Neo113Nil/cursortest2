package android.content.Context;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLevelListDrawableEpicStormPhoenix9427 implements FrostHunterPreviewNeoBeta3393 {
    public final long FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterRoomDaoMaxPrimeQuantum2063 FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterLightSensorForceFusion4241;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public byte[] FrostHunterFragmentBetaMegaVortex6025 = new byte[65536];
    public final byte[] FrostHunterCameraXPixelTurboCosmos9814 = new byte[4096];

    static {
        FrostHunterColorStateListInflaterNovaXLegend5808.FrostHunterAlphaAnimationNeoCosmos5761("media3.extractor");
    }

    public FrostHunterLevelListDrawableEpicStormPhoenix9427(FrostHunterRoomDaoMaxPrimeQuantum2063 frostHunterRoomDaoMaxPrimeQuantum2063, long j, long j2) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterRoomDaoMaxPrimeQuantum2063;
        this.FrostHunterKeyframeGammaGamma1197 = j;
        this.FrostHunterAlertDialogAuroraDelta3200 = j2;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final void FrostHunterAlertDialogAuroraDelta3200(int i) {
        FrostHunterServiceConnectionTurboPhoenixOmega6719(i, false);
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final int FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        FrostHunterLevelListDrawableEpicStormPhoenix9427 frostHunterLevelListDrawableEpicStormPhoenix9427;
        int min = Math.min(this.FrostHunterLightSensorForceFusion4241, i);
        FrostHunterResourcesTitanHyperVision5823(min);
        if (min == 0) {
            byte[] bArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
            min = frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterFragmentBetaMegaVortex6025(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
        }
        if (min != -1) {
            frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterKeyframeGammaGamma1197 += min;
        }
        return min;
    }

    public final boolean FrostHunterBundlePulseFusionHero2475(int i, boolean z) {
        FrostHunterRemoteConfigSpeedSpeed8566(i);
        int i2 = this.FrostHunterLightSensorForceFusion4241 - this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        while (i2 < i) {
            FrostHunterLevelListDrawableEpicStormPhoenix9427 frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
            int i3 = i;
            boolean z2 = z;
            i2 = frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterFragmentBetaMegaVortex6025(this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterLightSensorForceFusion4241 = frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterServiceConnectionTurboPhoenixOmega6719 + i2;
            this = frostHunterLevelListDrawableEpicStormPhoenix9427;
            i = i3;
            z = z2;
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 += i;
        return true;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final void FrostHunterCameraXTurboCelestialHero5430(int i) {
        FrostHunterBundlePulseFusionHero2475(i, false);
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.FrostHunterLightSensorForceFusion4241;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.FrostHunterFragmentBetaMegaVortex6025, 0, bArr, i, min);
            FrostHunterResourcesTitanHyperVision5823(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = FrostHunterFragmentBetaMegaVortex6025(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.FrostHunterKeyframeGammaGamma1197 += i4;
        }
        return i4 != -1;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        return this.FrostHunterKeyframeGammaGamma1197 + this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final void FrostHunterFlowMaxDragonHero5809() {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
    }

    public final int FrostHunterFragmentBetaMegaVortex6025(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.FrostHunterFlowMaxDragonHero5809.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final int FrostHunterLifecycleBlazeGammaElite2889(byte[] bArr, int i, int i2) {
        FrostHunterLevelListDrawableEpicStormPhoenix9427 frostHunterLevelListDrawableEpicStormPhoenix9427;
        int min;
        FrostHunterRemoteConfigSpeedSpeed8566(i2);
        int i3 = this.FrostHunterLightSensorForceFusion4241;
        int i4 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        int i5 = i3 - i4;
        if (i5 == 0) {
            frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
            min = frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterFragmentBetaMegaVortex6025(this.FrostHunterFragmentBetaMegaVortex6025, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterLightSensorForceFusion4241 += min;
        } else {
            frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterFragmentBetaMegaVortex6025, frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterServiceConnectionTurboPhoenixOmega6719, bArr, i, min);
        frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterServiceConnectionTurboPhoenixOmega6719 += min;
        return min;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final void FrostHunterLintTitanVortexQuantum9911(byte[] bArr, int i, int i2) {
        FrostHunterScaleAnimationStrikeSpark5059(bArr, i, i2, false);
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719 + i;
        byte[] bArr = this.FrostHunterFragmentBetaMegaVortex6025;
        if (i2 > bArr.length) {
            this.FrostHunterFragmentBetaMegaVortex6025 = Arrays.copyOf(this.FrostHunterFragmentBetaMegaVortex6025, FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final void FrostHunterResourcesTitanHyperVision5823(int i) {
        int i2 = this.FrostHunterLightSensorForceFusion4241 - i;
        this.FrostHunterLightSensorForceFusion4241 = i2;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
        byte[] bArr = this.FrostHunterFragmentBetaMegaVortex6025;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.FrostHunterFragmentBetaMegaVortex6025 = bArr2;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final boolean FrostHunterScaleAnimationStrikeSpark5059(byte[] bArr, int i, int i2, boolean z) {
        if (!FrostHunterBundlePulseFusionHero2475(i2, z)) {
            return false;
        }
        System.arraycopy(this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719 - i2, bArr, i, i2);
        return true;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719(int i, boolean z) {
        int min = Math.min(this.FrostHunterLightSensorForceFusion4241, i);
        FrostHunterResourcesTitanHyperVision5823(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.FrostHunterCameraXPixelTurboCosmos9814;
            i2 = FrostHunterFragmentBetaMegaVortex6025(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.FrostHunterKeyframeGammaGamma1197 += i2;
        }
        return i2 != -1;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final long FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final long getPosition() {
        return this.FrostHunterKeyframeGammaGamma1197;
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        FrostHunterLevelListDrawableEpicStormPhoenix9427 frostHunterLevelListDrawableEpicStormPhoenix9427;
        int i3 = this.FrostHunterLightSensorForceFusion4241;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.FrostHunterFragmentBetaMegaVortex6025, 0, bArr, i, min);
            FrostHunterResourcesTitanHyperVision5823(min);
            i4 = min;
        }
        if (i4 == 0) {
            frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
            i4 = frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterFragmentBetaMegaVortex6025(bArr, i, i2, 0, true);
        } else {
            frostHunterLevelListDrawableEpicStormPhoenix9427 = this;
        }
        if (i4 != -1) {
            frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterKeyframeGammaGamma1197 += i4;
        }
        return i4;
    }

    @Override // android.content.Context.FrostHunterPreviewNeoBeta3393
    public final void readFully(byte[] bArr, int i, int i2) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633(bArr, i, i2, false);
    }
}
