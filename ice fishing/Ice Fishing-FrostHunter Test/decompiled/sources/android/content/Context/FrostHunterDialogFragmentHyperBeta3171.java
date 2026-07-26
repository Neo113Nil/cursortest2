package android.content.Context;

import java.io.Writer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDialogFragmentHyperBeta3171 extends Writer {
    public final StringBuilder FrostHunterCameraXPixelTurboCosmos9814 = new StringBuilder(128);

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        StringBuilder sb = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        FrostHunterAlphaAnimationNeoCosmos5761();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                FrostHunterAlphaAnimationNeoCosmos5761();
            } else {
                this.FrostHunterCameraXPixelTurboCosmos9814.append(c);
            }
        }
    }
}
