package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFontFamilyHyperPulseBlaze7157 extends FrostHunterAsyncTaskPrimeGammaTitan9007 {
    public int FrostHunterCameraXTurboCelestialHero5430;
    public long FrostHunterLintTitanVortexQuantum9911;
    public int FrostHunterResourcesTitanHyperVision5823;

    public final boolean FrostHunterAlertDialogAuroraDelta3200(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        ByteBuffer byteBuffer;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(!frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(1073741824));
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(!frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(268435456));
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(!frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(4));
        if (FrostHunterKeyframeGammaGamma1197()) {
            if (this.FrostHunterCameraXTurboCelestialHero5430 >= this.FrostHunterResourcesTitanHyperVision5823) {
                return false;
            }
            ByteBuffer byteBuffer2 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
            if (byteBuffer2 != null && (byteBuffer = this.FrostHunterFragmentBetaMegaVortex6025) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.FrostHunterCameraXTurboCelestialHero5430;
        this.FrostHunterCameraXTurboCelestialHero5430 = i + 1;
        if (i == 0) {
            this.FrostHunterLightSensorForceFusion4241 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241;
            if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(1)) {
                this.FrostHunterFlowMaxDragonHero5809 = 1;
            }
        }
        ByteBuffer byteBuffer3 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
        if (byteBuffer3 != null) {
            FrostHunterRemoteConfigSpeedSpeed8566(byteBuffer3.remaining());
            this.FrostHunterFragmentBetaMegaVortex6025.put(byteBuffer3);
        }
        this.FrostHunterLintTitanVortexQuantum9911 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241;
        return true;
    }

    public final boolean FrostHunterKeyframeGammaGamma1197() {
        return this.FrostHunterCameraXTurboCelestialHero5430 > 0;
    }

    @Override // android.content.Context.FrostHunterAsyncTaskPrimeGammaTitan9007
    public final void FrostHunterLifecycleBlazeGammaElite2889() {
        super.FrostHunterLifecycleBlazeGammaElite2889();
        this.FrostHunterCameraXTurboCelestialHero5430 = 0;
    }
}
