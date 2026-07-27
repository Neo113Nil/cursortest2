package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterAsyncTaskPrimeGammaTitan9007 extends FrostHunterFragmentManagerThunderMasterForce6340 {
    public FrostHunterFirebaseOlympianMax4818 FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public ByteBuffer FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterObjectDetectionDeltaQuantumHyperion3304 FrostHunterKeyframeGammaGamma1197 = new FrostHunterObjectDetectionDeltaQuantumHyperion3304();
    public long FrostHunterLightSensorForceFusion4241;
    public ByteBuffer FrostHunterScaleAnimationStrikeSpark5059;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;

    static {
        FrostHunterColorStateListInflaterNovaXLegend5808.FrostHunterAlphaAnimationNeoCosmos5761("media3.decoder");
    }

    public FrostHunterAsyncTaskPrimeGammaTitan9007(int i) {
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814() {
        ByteBuffer byteBuffer = this.FrostHunterFragmentBetaMegaVortex6025;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.FrostHunterScaleAnimationStrikeSpark5059;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.FrostHunterFragmentBetaMegaVortex6025;
        throw new FrostHunterImageViewTitaniumTitanium1518("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public void FrostHunterLifecycleBlazeGammaElite2889() {
        this.FrostHunterFlowMaxDragonHero5809 = 0;
        ByteBuffer byteBuffer = this.FrostHunterFragmentBetaMegaVortex6025;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.FrostHunterScaleAnimationStrikeSpark5059;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = false;
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        ByteBuffer byteBuffer = this.FrostHunterFragmentBetaMegaVortex6025;
        if (byteBuffer == null) {
            this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterLevelListDrawableFusionDragonHero2232(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.FrostHunterFragmentBetaMegaVortex6025 = byteBuffer;
            return;
        }
        ByteBuffer FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(i2);
        FrostHunterLevelListDrawableFusionDragonHero2232.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            FrostHunterLevelListDrawableFusionDragonHero2232.put(byteBuffer);
        }
        this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterLevelListDrawableFusionDragonHero2232;
    }
}
