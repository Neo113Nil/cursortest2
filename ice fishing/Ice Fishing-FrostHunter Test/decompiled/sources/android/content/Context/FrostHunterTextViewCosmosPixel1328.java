package android.content.Context;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextViewCosmosPixel1328 implements FrostHunterFontFamilySolarSpeedCelestial8941 {
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterOnItemClickListenerHeroSpark8665 FrostHunterCameraXPixelTurboCosmos9814;
    public long FrostHunterFlowMaxDragonHero5809;

    public FrostHunterTextViewCosmosPixel1328(FrostHunterOnItemClickListenerHeroSpark8665 frostHunterOnItemClickListenerHeroSpark8665, long j) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterOnItemClickListenerHeroSpark8665;
        this.FrostHunterFlowMaxDragonHero5809 = j;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return FrostHunterAdMobBlazeEclipseGamma6684.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        long j2;
        long j3;
        int i;
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("closed");
            return 0L;
        }
        FrostHunterOnItemClickListenerHeroSpark8665 frostHunterOnItemClickListenerHeroSpark8665 = this.FrostHunterCameraXPixelTurboCosmos9814;
        long j4 = this.FrostHunterFlowMaxDragonHero5809;
        if (j < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterViewPhantomNeo1634(1);
            byte[] bArr = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
            int i2 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (frostHunterOnItemClickListenerHeroSpark8665) {
                bArr.getClass();
                frostHunterOnItemClickListenerHeroSpark8665.FrostHunterKeyframeGammaGamma1197.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = frostHunterOnItemClickListenerHeroSpark8665.FrostHunterKeyframeGammaGamma1197.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (FrostHunterViewPhantomNeo1634.FrostHunterConstraintSetCloneMasterUltraRogue2633 == FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475) {
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterViewPhantomNeo1634);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += i;
                long j7 = i;
                j6 += j7;
                frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.FrostHunterFlowMaxDragonHero5809 += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FrostHunterOnItemClickListenerHeroSpark8665 frostHunterOnItemClickListenerHeroSpark8665 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            return;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = true;
        ReentrantLock reentrantLock = frostHunterOnItemClickListenerHeroSpark8665.FrostHunterAlertDialogAuroraDelta3200;
        reentrantLock.lock();
        try {
            int i = frostHunterOnItemClickListenerHeroSpark8665.FrostHunterFlowMaxDragonHero5809 - 1;
            frostHunterOnItemClickListenerHeroSpark8665.FrostHunterFlowMaxDragonHero5809 = i;
            if (i == 0) {
                if (frostHunterOnItemClickListenerHeroSpark8665.FrostHunterCameraXPixelTurboCosmos9814) {
                    synchronized (frostHunterOnItemClickListenerHeroSpark8665) {
                        frostHunterOnItemClickListenerHeroSpark8665.FrostHunterKeyframeGammaGamma1197.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
