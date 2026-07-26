package android.content.Context;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOrientationSensorOlympianHyperNova9803 extends MediaDataSource {
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterAlertDialogInfernoInfernoStrike1490 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterOrientationSensorOlympianHyperNova9803(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterAlertDialogInfernoInfernoStrike1490;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490 = this.FrostHunterFlowMaxDragonHero5809;
        DataInputStream dataInputStream = frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j);
                        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = frostHunterAlertDialogInfernoInfernoStrike1490.read(bArr, i, i2);
                if (read >= 0) {
                    this.FrostHunterCameraXPixelTurboCosmos9814 += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
