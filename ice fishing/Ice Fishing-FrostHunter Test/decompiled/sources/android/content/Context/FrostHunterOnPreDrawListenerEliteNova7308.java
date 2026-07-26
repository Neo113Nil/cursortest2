package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnPreDrawListenerEliteNova7308 implements FrostHunterFontFamilySolarSpeedCelestial8941 {
    public final ByteBuffer FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterOnPreDrawListenerEliteNova7308(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.FrostHunterCameraXPixelTurboCosmos9814 = slice;
        this.FrostHunterFlowMaxDragonHero5809 = slice.capacity();
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return FrostHunterAdMobBlazeEclipseGamma6684.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        ByteBuffer byteBuffer = this.FrostHunterCameraXPixelTurboCosmos9814;
        int position = byteBuffer.position();
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return frostHunterMergeSpeedHyperionBlaze4246.write(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
