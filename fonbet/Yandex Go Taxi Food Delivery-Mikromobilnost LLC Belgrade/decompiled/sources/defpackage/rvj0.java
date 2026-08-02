package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.text.Regex;
import okio.ByteString;

/* loaded from: classes9.dex */
public abstract class rvj0 implements Closeable {
    public static final qvj0 Companion = new qvj0();
    public static final rvj0 EMPTY = qvj0.a(null, ByteString.c);
    private Reader reader;

    @jxi
    public static final rvj0 create(wg10 wg10Var, byte[] bArr) {
        Companion.getClass();
        yp6 yp6Var = new yp6();
        yp6Var.write(bArr, 0, bArr.length);
        return new pvj0(wg10Var, bArr.length, yp6Var);
    }

    public final InputStream byteStream() {
        return source().p2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        ByteString th = null;
        if (contentLength > 2147483647L) {
            ny61.v(qv10.j(contentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        qq6 source = source();
        try {
            ByteString E0 = source.E0();
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            ByteString byteString = th;
            th = E0;
            th = byteString;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    ljo.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int h = th.h();
        if (contentLength == -1 || contentLength == h) {
            return th;
        }
        throw new IOException("Content-Length (" + contentLength + ") and stream length (" + h + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        byte[] th = null;
        if (contentLength > 2147483647L) {
            ny61.v(qv10.j(contentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        qq6 source = source();
        try {
            byte[] p0 = source.p0();
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = p0;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    ljo.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (contentLength == -1 || contentLength == length) {
            return th;
        }
        throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Reader charStream() {
        Charset charset;
        Reader reader = this.reader;
        if (reader == null) {
            qq6 source = source();
            wg10 contentType = contentType();
            if (contentType != null) {
                Regex regex = wg10.e;
                charset = contentType.a(null);
            }
            charset = uza.a;
            reader = new ovj0(source, charset);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        yf61.b(source());
    }

    public abstract long contentLength();

    public abstract wg10 contentType();

    public abstract qq6 source();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String string() throws IOException {
        Charset charset;
        qq6 source = source();
        String th = null;
        try {
            wg10 contentType = contentType();
            if (contentType != null) {
                Regex regex = wg10.e;
                charset = contentType.a(null);
            }
            charset = uza.a;
            String C0 = source.C0(bg61.g(source, charset));
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = C0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    ljo.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @jxi
    public static final rvj0 create(wg10 wg10Var, ByteString byteString) {
        Companion.getClass();
        return qvj0.a(wg10Var, byteString);
    }

    @jxi
    public static final rvj0 create(wg10 wg10Var, String str) {
        Companion.getClass();
        return qvj0.b(str, wg10Var);
    }

    public static final rvj0 create(String str, wg10 wg10Var) {
        Companion.getClass();
        return qvj0.b(str, wg10Var);
    }

    public static final rvj0 create(ByteString byteString, wg10 wg10Var) {
        Companion.getClass();
        return qvj0.a(wg10Var, byteString);
    }

    public static final rvj0 create(byte[] bArr, wg10 wg10Var) {
        Companion.getClass();
        yp6 yp6Var = new yp6();
        yp6Var.write(bArr, 0, bArr.length);
        return new pvj0(wg10Var, bArr.length, yp6Var);
    }

    public static final rvj0 create(qq6 qq6Var, wg10 wg10Var, long j) {
        Companion.getClass();
        return new pvj0(wg10Var, j, qq6Var);
    }

    @jxi
    public static final rvj0 create(wg10 wg10Var, long j, qq6 qq6Var) {
        Companion.getClass();
        return new pvj0(wg10Var, j, qq6Var);
    }
}
