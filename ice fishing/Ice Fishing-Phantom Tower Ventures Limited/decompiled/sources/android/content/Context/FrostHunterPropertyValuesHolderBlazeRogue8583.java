package android.content.Context;

import java.io.OutputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPropertyValuesHolderBlazeRogue8583 extends OutputStream {
    public long FrostHunterCameraXPixelTurboCosmos9814;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 += i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814++;
    }
}
