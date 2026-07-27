package H;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f342e.mark(Integer.MAX_VALUE);
    }

    public final void b(long j2) {
        int i2 = this.f343f;
        if (i2 > j2) {
            this.f343f = 0;
            this.f342e.reset();
        } else {
            j2 -= i2;
        }
        a((int) j2);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f342e.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
