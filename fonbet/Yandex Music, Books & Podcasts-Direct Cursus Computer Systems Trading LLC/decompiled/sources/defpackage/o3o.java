package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public abstract class o3o implements Closeable {
    public n3o a;

    public final String D() {
        Charset charset;
        ij3 z = z();
        try {
            twh o = o();
            if (o == null || (charset = o.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            String v0 = z.v0(cvt.s(z, charset));
            z.close();
            return v0;
        } finally {
        }
    }

    public final byte[] a() {
        long g = g();
        if (g > 2147483647L) {
            kac.f(dfi.d(g, "Cannot buffer entire body for content length: "));
            return null;
        }
        ij3 z = z();
        try {
            byte[] k0 = z.k0();
            z.close();
            int length = k0.length;
            if (g == -1 || g == length) {
                return k0;
            }
            throw new IOException("Content-Length (" + g + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader b() {
        Charset charset;
        n3o n3oVar = this.a;
        if (n3oVar == null) {
            ij3 z = z();
            twh o = o();
            if (o == null || (charset = o.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            n3oVar = new n3o(z, charset);
            this.a = n3oVar;
        }
        return n3oVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cvt.d(z());
    }

    public abstract long g();

    public abstract twh o();

    public abstract ij3 z();
}
