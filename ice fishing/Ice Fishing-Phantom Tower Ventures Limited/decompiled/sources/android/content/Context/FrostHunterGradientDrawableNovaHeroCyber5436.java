package android.content.Context;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradientDrawableNovaHeroCyber5436 extends FilterInputStream {
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public long FrostHunterFlowMaxDragonHero5809;

    public FrostHunterGradientDrawableNovaHeroCyber5436(InputStream inputStream) {
        super(inputStream);
        this.FrostHunterFlowMaxDragonHero5809 = -1L;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.FrostHunterFlowMaxDragonHero5809 = this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.FrostHunterCameraXPixelTurboCosmos9814 -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.FrostHunterFlowMaxDragonHero5809 == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.FrostHunterCameraXPixelTurboCosmos9814 = this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.FrostHunterCameraXPixelTurboCosmos9814));
        this.FrostHunterCameraXPixelTurboCosmos9814 -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.FrostHunterCameraXPixelTurboCosmos9814--;
        }
        return read;
    }
}
