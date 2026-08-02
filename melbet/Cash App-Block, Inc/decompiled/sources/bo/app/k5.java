package bo.app;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class k5 implements Closeable {
    public final InputStream[] a;

    public k5(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.a) {
            Charset charset = bh.a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }
}
