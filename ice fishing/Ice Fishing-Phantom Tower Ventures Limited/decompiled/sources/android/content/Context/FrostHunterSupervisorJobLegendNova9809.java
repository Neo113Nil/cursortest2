package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSupervisorJobLegendNova9809 {
    public static final ThreadLocal FrostHunterServiceEliteCelestialThunder1757 = new ThreadLocal();
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public volatile int FrostHunterBundlePulseFusionHero2475 = 0;
    public final FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterSupervisorJobLegendNova9809(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, int i) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(16);
        if (FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterKeyframeGammaGamma1197;
        int i2 = FrostHunterAlphaAnimationNeoCosmos5761 + FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        ThreadLocal threadLocal = FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterInterpolatorAuroraPixel1637 frostHunterInterpolatorAuroraPixel1637 = (FrostHunterInterpolatorAuroraPixel1637) threadLocal.get();
        if (frostHunterInterpolatorAuroraPixel1637 == null) {
            frostHunterInterpolatorAuroraPixel1637 = new FrostHunterInterpolatorAuroraPixel1637();
            threadLocal.set(frostHunterInterpolatorAuroraPixel1637);
        }
        FrostHunterWindowManagerPrimeForce7319 frostHunterWindowManagerPrimeForce7319 = (FrostHunterWindowManagerPrimeForce7319) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809;
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterWindowManagerPrimeForce7319.FrostHunterAlphaAnimationNeoCosmos5761(6);
        if (FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
            int i = FrostHunterAlphaAnimationNeoCosmos5761 + frostHunterWindowManagerPrimeForce7319.FrostHunterCameraXPixelTurboCosmos9814;
            int i2 = (this.FrostHunterAlphaAnimationNeoCosmos5761 * 4) + ((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197;
            frostHunterInterpolatorAuroraPixel1637.FrostHunterKeyframeGammaGamma1197 = byteBuffer;
            if (byteBuffer != null) {
                frostHunterInterpolatorAuroraPixel1637.FrostHunterCameraXPixelTurboCosmos9814 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                frostHunterInterpolatorAuroraPixel1637.FrostHunterFlowMaxDragonHero5809 = i4;
                frostHunterInterpolatorAuroraPixel1637.FrostHunterAlertDialogAuroraDelta3200 = ((ByteBuffer) frostHunterInterpolatorAuroraPixel1637.FrostHunterKeyframeGammaGamma1197).getShort(i4);
                return frostHunterInterpolatorAuroraPixel1637;
            }
            frostHunterInterpolatorAuroraPixel1637.FrostHunterCameraXPixelTurboCosmos9814 = 0;
            frostHunterInterpolatorAuroraPixel1637.FrostHunterFlowMaxDragonHero5809 = 0;
            frostHunterInterpolatorAuroraPixel1637.FrostHunterAlertDialogAuroraDelta3200 = 0;
        }
        return frostHunterInterpolatorAuroraPixel1637;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(4);
        sb.append(Integer.toHexString(FrostHunterAlphaAnimationNeoCosmos5761 != 0 ? ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterKeyframeGammaGamma1197).getInt(FrostHunterAlphaAnimationNeoCosmos5761 + FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814) : 0));
        sb.append(", codepoints:");
        FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterAlphaAnimationNeoCosmos5761(16);
        if (FrostHunterAlphaAnimationNeoCosmos57612 != 0) {
            int i2 = FrostHunterAlphaAnimationNeoCosmos57612 + FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterCameraXPixelTurboCosmos9814;
            i = ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterKeyframeGammaGamma1197).getInt(((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterKeyframeGammaGamma1197).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(FrostHunterAlphaAnimationNeoCosmos5761(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
