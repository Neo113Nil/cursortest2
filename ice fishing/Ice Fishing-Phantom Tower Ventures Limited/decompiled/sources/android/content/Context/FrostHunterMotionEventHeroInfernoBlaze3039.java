package android.content.Context;

import java.io.InputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionEventHeroInfernoBlaze3039 extends InputStream {
    public final InputStream FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809 = 1073741824;

    public FrostHunterMotionEventHeroInfernoBlaze3039(InputStream inputStream) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.FrostHunterCameraXPixelTurboCosmos9814.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.FrostHunterCameraXPixelTurboCosmos9814.read();
        if (read == -1) {
            this.FrostHunterFlowMaxDragonHero5809 = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.FrostHunterCameraXPixelTurboCosmos9814.read(bArr);
        if (read == -1) {
            this.FrostHunterFlowMaxDragonHero5809 = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.FrostHunterCameraXPixelTurboCosmos9814.read(bArr, i, i2);
        if (read == -1) {
            this.FrostHunterFlowMaxDragonHero5809 = 0;
        }
        return read;
    }
}
