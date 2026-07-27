package d0;

import java.io.InputStream;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4451f extends C4447b {
    public C4451f(byte[] bArr) {
        super(bArr);
        this.f37132n.mark(Integer.MAX_VALUE);
    }

    public final void g(long j9) {
        int i = this.f37134v;
        if (i > j9) {
            this.f37134v = 0;
            this.f37132n.reset();
        } else {
            j9 -= i;
        }
        a((int) j9);
    }

    public C4451f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f37132n.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
