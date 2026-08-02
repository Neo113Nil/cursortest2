package com.anythink.core.common.n.b.a.d;

import com.anythink.core.common.n.b.a.c.i;
import com.anythink.core.common.n.b.a.c.k;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.j;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import com.anythink.core.common.n.c.x;
import com.anythink.core.common.v.m;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements com.anythink.core.common.n.b.a.c.c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f15863b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15864c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f15865d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15866e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15867f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15868g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15869h = 6;
    private static final int i = 262144;

    /* renamed from: j, reason: collision with root package name */
    private final z f15870j;

    /* renamed from: k, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.e f15871k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f15872l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.core.common.n.c.d f15873m;

    /* renamed from: n, reason: collision with root package name */
    private int f15874n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f15875o = 262144;

    /* renamed from: p, reason: collision with root package name */
    private u f15876p;

    public final class b implements v {

        /* renamed from: b, reason: collision with root package name */
        private final j f15881b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15882c;

        public b() {
            this.f15881b = new j(a.this.f15873m.a());
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return this.f15881b;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f15882c) {
                return;
            }
            this.f15882c = true;
            a.this.f15873m.b("0\r\n\r\n");
            a.a(this.f15881b);
            a.this.f15874n = 3;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final synchronized void flush() {
            if (this.f15882c) {
                return;
            }
            a.this.f15873m.flush();
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15882c) {
                throw new IllegalStateException("closed");
            }
            if (j6 == 0) {
                return;
            }
            a.this.f15873m.n(j6);
            a.this.f15873m.b("\r\n");
            a.this.f15873m.a(cVar, j6);
            a.this.f15873m.b("\r\n");
        }
    }

    public class c extends AbstractC0086a {

        /* renamed from: e, reason: collision with root package name */
        private static final long f15883e = -1;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.b.v f15885f;

        /* renamed from: g, reason: collision with root package name */
        private long f15886g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f15887h;

        public c(com.anythink.core.common.n.b.v vVar) {
            super(a.this, (byte) 0);
            this.f15886g = f15883e;
            this.f15887h = true;
            this.f15885f = vVar;
        }

        private void c() {
            if (this.f15886g != f15883e) {
                a.this.f15872l.w();
            }
            try {
                this.f15886g = a.this.f15872l.s();
                String trim = a.this.f15872l.w().trim();
                if (this.f15886g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15886g + trim + "\"");
                }
                if (this.f15886g == 0) {
                    this.f15887h = false;
                    a aVar = a.this;
                    aVar.f15876p = aVar.h();
                    com.anythink.core.common.n.b.a.c.e.a(a.this.f15870j.e(), this.f15885f, a.this.f15876p);
                    b();
                }
            } catch (NumberFormatException e9) {
                throw new ProtocolException(e9.getMessage());
            }
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0086a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (j6 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
            }
            if (this.f15878b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f15887h) {
                return f15883e;
            }
            long j9 = this.f15886g;
            if (j9 == 0 || j9 == f15883e) {
                if (j9 != f15883e) {
                    a.this.f15872l.w();
                }
                try {
                    this.f15886g = a.this.f15872l.s();
                    String trim = a.this.f15872l.w().trim();
                    if (this.f15886g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15886g + trim + "\"");
                    }
                    if (this.f15886g == 0) {
                        this.f15887h = false;
                        a aVar = a.this;
                        aVar.f15876p = aVar.h();
                        com.anythink.core.common.n.b.a.c.e.a(a.this.f15870j.e(), this.f15885f, a.this.f15876p);
                        b();
                    }
                    if (!this.f15887h) {
                        return f15883e;
                    }
                } catch (NumberFormatException e9) {
                    throw new ProtocolException(e9.getMessage());
                }
            }
            long a_ = super.a_(cVar, Math.min(j6, this.f15886g));
            if (a_ != f15883e) {
                this.f15886g -= a_;
                return a_;
            }
            a.this.f15871k.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15878b) {
                return;
            }
            if (this.f15887h && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                a.this.f15871k.e();
                b();
            }
            this.f15878b = true;
        }
    }

    public class d extends AbstractC0086a {

        /* renamed from: e, reason: collision with root package name */
        private long f15889e;

        public d(long j6) {
            super(a.this, (byte) 0);
            this.f15889e = j6;
            if (j6 == 0) {
                b();
            }
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0086a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (j6 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
            }
            if (this.f15878b) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f15889e;
            if (j9 == 0) {
                return -1L;
            }
            long a_ = super.a_(cVar, Math.min(j9, j6));
            if (a_ == -1) {
                a.this.f15871k.e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j10 = this.f15889e - a_;
            this.f15889e = j10;
            if (j10 == 0) {
                b();
            }
            return a_;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15878b) {
                return;
            }
            if (this.f15889e != 0 && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                a.this.f15871k.e();
                b();
            }
            this.f15878b = true;
        }
    }

    public final class e implements v {

        /* renamed from: b, reason: collision with root package name */
        private final j f15891b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15892c;

        private e() {
            this.f15891b = new j(a.this.f15873m.a());
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return this.f15891b;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15892c) {
                return;
            }
            this.f15892c = true;
            a.a(this.f15891b);
            a.this.f15874n = 3;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.f15892c) {
                return;
            }
            a.this.f15873m.flush();
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15892c) {
                throw new IllegalStateException("closed");
            }
            com.anythink.core.common.n.b.a.c.a(cVar.b(), j6);
            a.this.f15873m.a(cVar, j6);
        }

        public /* synthetic */ e(a aVar, byte b9) {
            this();
        }
    }

    public class f extends AbstractC0086a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f15894e;

        private f() {
            super(a.this, (byte) 0);
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0086a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (j6 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
            }
            if (this.f15878b) {
                throw new IllegalStateException("closed");
            }
            if (this.f15894e) {
                return -1L;
            }
            long a_ = super.a_(cVar, j6);
            if (a_ != -1) {
                return a_;
            }
            this.f15894e = true;
            b();
            return -1L;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15878b) {
                return;
            }
            if (!this.f15894e) {
                b();
            }
            this.f15878b = true;
        }

        public /* synthetic */ f(a aVar, byte b9) {
            this();
        }
    }

    public a(z zVar, com.anythink.core.common.n.b.a.b.e eVar, com.anythink.core.common.n.c.e eVar2, com.anythink.core.common.n.c.d dVar) {
        this.f15870j = zVar;
        this.f15871k = eVar;
        this.f15872l = eVar2;
        this.f15873m = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u h() {
        u.a aVar = new u.a();
        while (true) {
            String g9 = g();
            if (g9.length() == 0) {
                return aVar.a();
            }
            com.anythink.core.common.n.b.a.a.f15656a.a(aVar, g9);
        }
    }

    private v i() {
        if (this.f15874n == 1) {
            this.f15874n = 2;
            return new b();
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    private v j() {
        if (this.f15874n == 1) {
            this.f15874n = 2;
            return new e(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    private w k() {
        if (this.f15874n == 4) {
            this.f15874n = 5;
            this.f15871k.e();
            return new f(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    /* renamed from: com.anythink.core.common.n.b.a.d.a$a, reason: collision with other inner class name */
    public abstract class AbstractC0086a implements w {

        /* renamed from: a, reason: collision with root package name */
        protected final j f15877a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f15878b;

        private AbstractC0086a() {
            this.f15877a = new j(a.this.f15872l.a());
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return this.f15877a;
        }

        @Override // com.anythink.core.common.n.c.w
        public long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            try {
                return a.this.f15872l.a_(cVar, j6);
            } catch (IOException e9) {
                a.this.f15871k.e();
                b();
                throw e9;
            }
        }

        public final void b() {
            if (a.this.f15874n == 6) {
                return;
            }
            if (a.this.f15874n == 5) {
                a.a(this.f15877a);
                a.this.f15874n = 6;
            } else {
                throw new IllegalStateException("state: " + a.this.f15874n);
            }
        }

        public /* synthetic */ AbstractC0086a(a aVar, byte b9) {
            this();
        }
    }

    private boolean f() {
        return this.f15874n == 6;
    }

    private String g() {
        String f2 = this.f15872l.f(this.f15875o);
        this.f15875o -= f2.length();
        return f2;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final w b(af afVar) {
        if (!com.anythink.core.common.n.b.a.c.e.d(afVar)) {
            return a(0L);
        }
        if ("chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) {
            com.anythink.core.common.n.b.v a9 = afVar.a().a();
            if (this.f15874n == 4) {
                this.f15874n = 5;
                return new c(a9);
            }
            throw new IllegalStateException("state: " + this.f15874n);
        }
        long a10 = com.anythink.core.common.n.b.a.c.e.a(afVar);
        if (a10 != -1) {
            return a(a10);
        }
        if (this.f15874n == 4) {
            this.f15874n = 5;
            this.f15871k.e();
            return new f(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void c() {
        this.f15873m.flush();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final u d() {
        if (this.f15874n != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        u uVar = this.f15876p;
        return uVar != null ? uVar : com.anythink.core.common.n.b.a.c.f15825c;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void e() {
        com.anythink.core.common.n.b.a.b.e eVar = this.f15871k;
        if (eVar != null) {
            eVar.f();
        }
    }

    public final void c(af afVar) {
        long a9 = com.anythink.core.common.n.b.a.c.e.a(afVar);
        if (a9 == -1) {
            return;
        }
        w a10 = a(a9);
        com.anythink.core.common.n.b.a.c.a(a10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        a10.close();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.b.a.b.e a() {
        return this.f15871k;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final v a(ad adVar, long j6) {
        if (adVar.d() != null) {
            adVar.d();
        }
        if ("chunked".equalsIgnoreCase(adVar.a("Transfer-Encoding"))) {
            if (this.f15874n == 1) {
                this.f15874n = 2;
                return new b();
            }
            throw new IllegalStateException("state: " + this.f15874n);
        }
        if (j6 != -1) {
            if (this.f15874n == 1) {
                this.f15874n = 2;
                return new e(this, (byte) 0);
            }
            throw new IllegalStateException("state: " + this.f15874n);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void a(ad adVar) {
        Proxy.Type type = this.f15871k.a().b().type();
        StringBuilder sb = new StringBuilder();
        sb.append(adVar.b());
        sb.append(' ');
        if (!adVar.g() && type == Proxy.Type.HTTP) {
            sb.append(adVar.a());
        } else {
            sb.append(i.a(adVar.a()));
        }
        sb.append(" HTTP/1.1");
        a(adVar.c(), sb.toString());
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void b() {
        this.f15873m.flush();
    }

    private static void b(j jVar) {
        x a9 = jVar.a();
        jVar.a(x.f16712c);
        a9.f();
        a9.h_();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final long a(af afVar) {
        if (!com.anythink.core.common.n.b.a.c.e.d(afVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) {
            return -1L;
        }
        return com.anythink.core.common.n.b.a.c.e.a(afVar);
    }

    public final void a(u uVar, String str) {
        if (this.f15874n == 0) {
            this.f15873m.b(str).b("\r\n");
            int a9 = uVar.a();
            for (int i4 = 0; i4 < a9; i4++) {
                this.f15873m.b(uVar.a(i4)).b(": ").b(uVar.b(i4)).b("\r\n");
            }
            this.f15873m.b("\r\n");
            this.f15874n = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final af.a a(boolean z6) {
        String str;
        int i4 = this.f15874n;
        if (i4 != 1 && i4 != 3) {
            throw new IllegalStateException("state: " + this.f15874n);
        }
        try {
            k a9 = k.a(g());
            af.a a10 = new af.a().a(a9.f15860d).a(a9.f15861e).a(a9.f15862f).a(h());
            if (z6 && a9.f15861e == 100) {
                return null;
            }
            if (a9.f15861e == 100) {
                this.f15874n = 3;
                return a10;
            }
            this.f15874n = 4;
            return a10;
        } catch (EOFException e9) {
            com.anythink.core.common.n.b.a.b.e eVar = this.f15871k;
            if (eVar != null) {
                str = eVar.a().a().a().l();
            } else {
                str = m.f17596e;
            }
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(str)), e9);
        }
    }

    private w a(long j6) {
        if (this.f15874n == 4) {
            this.f15874n = 5;
            return new d(j6);
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    private w a(com.anythink.core.common.n.b.v vVar) {
        if (this.f15874n == 4) {
            this.f15874n = 5;
            return new c(vVar);
        }
        throw new IllegalStateException("state: " + this.f15874n);
    }

    public static /* synthetic */ void a(j jVar) {
        x a9 = jVar.a();
        jVar.a(x.f16712c);
        a9.f();
        a9.h_();
    }
}
