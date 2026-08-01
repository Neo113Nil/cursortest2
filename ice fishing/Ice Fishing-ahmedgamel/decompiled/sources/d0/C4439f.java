package d0;

import java.io.InputStream;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4439f extends C4435b {
    public C4439f(byte[] bArr) {
        super(bArr);
        this.f36969n.mark(Integer.MAX_VALUE);
    }

    public final void j(long j6) {
        int i = this.f36971v;
        if (i > j6) {
            this.f36971v = 0;
            this.f36969n.reset();
        } else {
            j6 -= i;
        }
        a((int) j6);
    }

    public C4439f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f36969n.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
