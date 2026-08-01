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
    private static final int f15076b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15077c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f15078d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15079e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15080f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15081g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15082h = 6;
    private static final int i = 262144;

    /* renamed from: j, reason: collision with root package name */
    private final z f15083j;

    /* renamed from: k, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.e f15084k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f15085l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.core.common.n.c.d f15086m;

    /* renamed from: n, reason: collision with root package name */
    private int f15087n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f15088o = 262144;

    /* renamed from: p, reason: collision with root package name */
    private u f15089p;

    public final class b implements v {

        /* renamed from: b, reason: collision with root package name */
        private final j f15094b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15095c;

        public b() {
            this.f15094b = new j(a.this.f15086m.a());
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return this.f15094b;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f15095c) {
                return;
            }
            this.f15095c = true;
            a.this.f15086m.b("0\r\n\r\n");
            a.a(this.f15094b);
            a.this.f15087n = 3;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final synchronized void flush() {
            if (this.f15095c) {
                return;
            }
            a.this.f15086m.flush();
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15095c) {
                throw new IllegalStateException("closed");
            }
            if (j6 == 0) {
                return;
            }
            a.this.f15086m.n(j6);
            a.this.f15086m.b("\r\n");
            a.this.f15086m.a(cVar, j6);
            a.this.f15086m.b("\r\n");
        }
    }

    public class c extends AbstractC0086a {

        /* renamed from: e, reason: collision with root package name */
        private static final long f15096e = -1;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.b.v f15098f;

        /* renamed from: g, reason: collision with root package name */
        private long f15099g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f15100h;

        public c(com.anythink.core.common.n.b.v vVar) {
            super(a.this, (byte) 0);
            this.f15099g = f15096e;
            this.f15100h = true;
            this.f15098f = vVar;
        }

        private void c() {
            if (this.f15099g != f15096e) {
                a.this.f15085l.w();
            }
            try {
                this.f15099g = a.this.f15085l.s();
                String trim = a.this.f15085l.w().trim();
                if (this.f15099g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15099g + trim + "\"");
                }
                if (this.f15099g == 0) {
                    this.f15100h = false;
                    a aVar = a.this;
                    aVar.f15089p = aVar.h();
                    com.anythink.core.common.n.b.a.c.e.a(a.this.f15083j.e(), this.f15098f, a.this.f15089p);
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
            if (this.f15091b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f15100h) {
                return f15096e;
            }
            long j9 = this.f15099g;
            if (j9 == 0 || j9 == f15096e) {
                if (j9 != f15096e) {
                    a.this.f15085l.w();
                }
                try {
                    this.f15099g = a.this.f15085l.s();
                    String trim = a.this.f15085l.w().trim();
                    if (this.f15099g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15099g + trim + "\"");
                    }
                    if (this.f15099g == 0) {
                        this.f15100h = false;
                        a aVar = a.this;
                        aVar.f15089p = aVar.h();
                        com.anythink.core.common.n.b.a.c.e.a(a.this.f15083j.e(), this.f15098f, a.this.f15089p);
                        b();
                    }
                    if (!this.f15100h) {
                        return f15096e;
                    }
                } catch (NumberFormatException e9) {
                    throw new ProtocolException(e9.getMessage());
                }
            }
            long a_ = super.a_(cVar, Math.min(j6, this.f15099g));
            if (a_ != f15096e) {
                this.f15099g -= a_;
                return a_;
            }
            a.this.f15084k.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15091b) {
                return;
            }
            if (this.f15100h && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                a.this.f15084k.e();
                b();
            }
            this.f15091b = true;
        }
    }

    public class d extends AbstractC0086a {

        /* renamed from: e, reason: collision with root package name */
        private long f15102e;

        public d(long j6) {
            super(a.this, (byte) 0);
            this.f15102e = j6;
            if (j6 == 0) {
                b();
            }
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0086a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (j6 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
            }
            if (this.f15091b) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f15102e;
            if (j9 == 0) {
                return -1L;
            }
            long a_ = super.a_(cVar, Math.min(j9, j6));
            if (a_ == -1) {
                a.this.f15084k.e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j10 = this.f15102e - a_;
            this.f15102e = j10;
            if (j10 == 0) {
                b();
            }
            return a_;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15091b) {
                return;
            }
            if (this.f15102e != 0 && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                a.this.f15084k.e();
                b();
            }
            this.f15091b = true;
        }
    }

    public final class e implements v {

        /* renamed from: b, reason: collision with root package name */
        private final j f15104b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15105c;

        private e() {
            this.f15104b = new j(a.this.f15086m.a());
        }

        @Override // com.anythink.core.common.n.c.v
        public final x a() {
            return this.f15104b;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15105c) {
                return;
            }
            this.f15105c = true;
            a.a(this.f15104b);
            a.this.f15087n = 3;
        }

        @Override // com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            if (this.f15105c) {
                return;
            }
            a.this.f15086m.flush();
        }

        @Override // com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j6) {
            if (this.f15105c) {
                throw new IllegalStateException("closed");
            }
            com.anythink.core.common.n.b.a.c.a(cVar.b(), j6);
            a.this.f15086m.a(cVar, j6);
        }

        public /* synthetic */ e(a aVar, byte b9) {
            this();
        }
    }

    public class f extends AbstractC0086a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f15107e;

        private f() {
            super(a.this, (byte) 0);
        }

        @Override // com.anythink.core.common.n.b.a.d.a.AbstractC0086a, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            if (j6 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j6)));
            }
            if (this.f15091b) {
                throw new IllegalStateException("closed");
            }
            if (this.f15107e) {
                return -1L;
            }
            long a_ = super.a_(cVar, j6);
            if (a_ != -1) {
                return a_;
            }
            this.f15107e = true;
            b();
            return -1L;
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15091b) {
                return;
            }
            if (!this.f15107e) {
                b();
            }
            this.f15091b = true;
        }

        public /* synthetic */ f(a aVar, byte b9) {
            this();
        }
    }

    public a(z zVar, com.anythink.core.common.n.b.a.b.e eVar, com.anythink.core.common.n.c.e eVar2, com.anythink.core.common.n.c.d dVar) {
        this.f15083j = zVar;
        this.f15084k = eVar;
        this.f15085l = eVar2;
        this.f15086m = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u h() {
        u.a aVar = new u.a();
        while (true) {
            String g4 = g();
            if (g4.length() == 0) {
                return aVar.a();
            }
            com.anythink.core.common.n.b.a.a.f14869a.a(aVar, g4);
        }
    }

    private v i() {
        if (this.f15087n == 1) {
            this.f15087n = 2;
            return new b();
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    private v j() {
        if (this.f15087n == 1) {
            this.f15087n = 2;
            return new e(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    private w k() {
        if (this.f15087n == 4) {
            this.f15087n = 5;
            this.f15084k.e();
            return new f(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    /* renamed from: com.anythink.core.common.n.b.a.d.a$a, reason: collision with other inner class name */
    public abstract class AbstractC0086a implements w {

        /* renamed from: a, reason: collision with root package name */
        protected final j f15090a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f15091b;

        private AbstractC0086a() {
            this.f15090a = new j(a.this.f15085l.a());
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return this.f15090a;
        }

        @Override // com.anythink.core.common.n.c.w
        public long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            try {
                return a.this.f15085l.a_(cVar, j6);
            } catch (IOException e9) {
                a.this.f15084k.e();
                b();
                throw e9;
            }
        }

        public final void b() {
            if (a.this.f15087n == 6) {
                return;
            }
            if (a.this.f15087n == 5) {
                a.a(this.f15090a);
                a.this.f15087n = 6;
            } else {
                throw new IllegalStateException("state: " + a.this.f15087n);
            }
        }

        public /* synthetic */ AbstractC0086a(a aVar, byte b9) {
            this();
        }
    }

    private boolean f() {
        return this.f15087n == 6;
    }

    private String g() {
        String f3 = this.f15085l.f(this.f15088o);
        this.f15088o -= f3.length();
        return f3;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final w b(af afVar) {
        if (!com.anythink.core.common.n.b.a.c.e.d(afVar)) {
            return a(0L);
        }
        if ("chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) {
            com.anythink.core.common.n.b.v a9 = afVar.a().a();
            if (this.f15087n == 4) {
                this.f15087n = 5;
                return new c(a9);
            }
            throw new IllegalStateException("state: " + this.f15087n);
        }
        long a10 = com.anythink.core.common.n.b.a.c.e.a(afVar);
        if (a10 != -1) {
            return a(a10);
        }
        if (this.f15087n == 4) {
            this.f15087n = 5;
            this.f15084k.e();
            return new f(this, (byte) 0);
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void c() {
        this.f15086m.flush();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final u d() {
        if (this.f15087n != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        u uVar = this.f15089p;
        return uVar != null ? uVar : com.anythink.core.common.n.b.a.c.f15038c;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void e() {
        com.anythink.core.common.n.b.a.b.e eVar = this.f15084k;
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
        return this.f15084k;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final v a(ad adVar, long j6) {
        if (adVar.d() != null) {
            adVar.d();
        }
        if ("chunked".equalsIgnoreCase(adVar.a("Transfer-Encoding"))) {
            if (this.f15087n == 1) {
                this.f15087n = 2;
                return new b();
            }
            throw new IllegalStateException("state: " + this.f15087n);
        }
        if (j6 != -1) {
            if (this.f15087n == 1) {
                this.f15087n = 2;
                return new e(this, (byte) 0);
            }
            throw new IllegalStateException("state: " + this.f15087n);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void a(ad adVar) {
        Proxy.Type type = this.f15084k.a().b().type();
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
        this.f15086m.flush();
    }

    private static void b(j jVar) {
        x a9 = jVar.a();
        jVar.a(x.f15925c);
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
        if (this.f15087n == 0) {
            this.f15086m.b(str).b("\r\n");
            int a9 = uVar.a();
            for (int i6 = 0; i6 < a9; i6++) {
                this.f15086m.b(uVar.a(i6)).b(": ").b(uVar.b(i6)).b("\r\n");
            }
            this.f15086m.b("\r\n");
            this.f15087n = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final af.a a(boolean z3) {
        String str;
        int i6 = this.f15087n;
        if (i6 != 1 && i6 != 3) {
            throw new IllegalStateException("state: " + this.f15087n);
        }
        try {
            k a9 = k.a(g());
            af.a a10 = new af.a().a(a9.f15073d).a(a9.f15074e).a(a9.f15075f).a(h());
            if (z3 && a9.f15074e == 100) {
                return null;
            }
            if (a9.f15074e == 100) {
                this.f15087n = 3;
                return a10;
            }
            this.f15087n = 4;
            return a10;
        } catch (EOFException e9) {
            com.anythink.core.common.n.b.a.b.e eVar = this.f15084k;
            if (eVar != null) {
                str = eVar.a().a().a().l();
            } else {
                str = m.f16809e;
            }
            throw new IOException("unexpected end of stream on ".concat(String.valueOf(str)), e9);
        }
    }

    private w a(long j6) {
        if (this.f15087n == 4) {
            this.f15087n = 5;
            return new d(j6);
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    private w a(com.anythink.core.common.n.b.v vVar) {
        if (this.f15087n == 4) {
            this.f15087n = 5;
            return new c(vVar);
        }
        throw new IllegalStateException("state: " + this.f15087n);
    }

    public static /* synthetic */ void a(j jVar) {
        x a9 = jVar.a();
        jVar.a(x.f15925c);
        a9.f();
        a9.h_();
    }
}
