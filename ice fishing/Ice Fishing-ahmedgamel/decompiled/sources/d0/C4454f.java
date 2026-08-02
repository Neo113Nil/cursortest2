package d0;

import java.io.InputStream;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4454f extends C4450b {
    public C4454f(byte[] bArr) {
        super(bArr);
        this.f37122n.mark(Integer.MAX_VALUE);
    }

    public final void j(long j6) {
        int i = this.f37124v;
        if (i > j6) {
            this.f37124v = 0;
            this.f37122n.reset();
        } else {
            j6 -= i;
        }
        a((int) j6);
    }

    public C4454f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f37122n.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
