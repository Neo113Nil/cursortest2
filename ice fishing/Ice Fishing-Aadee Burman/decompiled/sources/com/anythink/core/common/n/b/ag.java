package com.anythink.core.common.n.b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class ag implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Reader f15524a;

    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15528a;

        /* renamed from: b, reason: collision with root package name */
        private final Charset f15529b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15530c;

        /* renamed from: d, reason: collision with root package name */
        private Reader f15531d;

        public a(com.anythink.core.common.n.c.e eVar, Charset charset) {
            this.f15528a = eVar;
            this.f15529b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f15530c = true;
            Reader reader = this.f15531d;
            if (reader != null) {
                reader.close();
            } else {
                this.f15528a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i6) {
            if (this.f15530c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f15531d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f15528a.i(), com.anythink.core.common.n.b.a.c.a(this.f15528a, this.f15529b));
                this.f15531d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i6);
        }
    }

    private static ag a(x xVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (xVar != null) {
            Charset a9 = xVar.a((Charset) null);
            if (a9 == null) {
                xVar = x.b(xVar + "; charset=utf-8");
            } else {
                charset = a9;
            }
        }
        com.anythink.core.common.n.c.c b9 = new com.anythink.core.common.n.c.c().b(str, charset);
        return a(xVar, b9.b(), b9);
    }

    private InputStream e() {
        return c().i();
    }

    private byte[] f() {
        long b9 = b();
        if (b9 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(b9)));
        }
        com.anythink.core.common.n.c.e c9 = c();
        try {
            byte[] y7 = c9.y();
            c9.close();
            if (b9 == -1 || b9 == y7.length) {
                return y7;
            }
            StringBuilder sb = new StringBuilder("Content-Length (");
            sb.append(b9);
            sb.append(") and stream length (");
            throw new IOException(u1.h.e(y7.length, ") disagree", sb));
        } catch (Throwable th) {
            if (c9 != null) {
                try {
                    c9.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Reader g() {
        Reader reader = this.f15524a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(c(), h());
        this.f15524a = aVar;
        return aVar;
    }

    private Charset h() {
        x a9 = a();
        return a9 != null ? a9.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public abstract x a();

    public abstract long b();

    public abstract com.anythink.core.common.n.c.e c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.anythink.core.common.n.b.a.c.a(c());
    }

    public final String d() {
        com.anythink.core.common.n.c.e c9 = c();
        try {
            String a9 = c9.a(com.anythink.core.common.n.b.a.c.a(c9, h()));
            c9.close();
            return a9;
        } catch (Throwable th) {
            if (c9 != null) {
                try {
                    c9.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ag a(x xVar, byte[] bArr) {
        return a(xVar, bArr.length, new com.anythink.core.common.n.c.c().d(bArr));
    }

    private static ag a(x xVar, com.anythink.core.common.n.c.f fVar) {
        return a(xVar, fVar.j(), new com.anythink.core.common.n.c.c().d(fVar));
    }

    public static ag a(final x xVar, final long j6, final com.anythink.core.common.n.c.e eVar) {
        if (eVar != null) {
            return new ag() { // from class: com.anythink.core.common.n.b.ag.1
                @Override // com.anythink.core.common.n.b.ag
                public final x a() {
                    return x.this;
                }

                @Override // com.anythink.core.common.n.b.ag
                public final long b() {
                    return j6;
                }

                @Override // com.anythink.core.common.n.b.ag
                public final com.anythink.core.common.n.c.e c() {
                    return eVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
