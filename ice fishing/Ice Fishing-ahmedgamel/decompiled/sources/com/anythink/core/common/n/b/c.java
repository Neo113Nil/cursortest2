package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.a.a.d;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.u;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    private static final int f15543e = 201105;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15544f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15545g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15546h = 2;

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.f f15547a;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.d f15548b;

    /* renamed from: c, reason: collision with root package name */
    int f15549c;

    /* renamed from: d, reason: collision with root package name */
    int f15550d;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15551j;

    /* renamed from: k, reason: collision with root package name */
    private int f15552k;

    public final class a implements com.anythink.core.common.n.b.a.a.b {

        /* renamed from: a, reason: collision with root package name */
        boolean f15558a;

        /* renamed from: c, reason: collision with root package name */
        private final d.a f15560c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.n.c.v f15561d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.n.c.v f15562e;

        public a(final d.a aVar) {
            this.f15560c = aVar;
            com.anythink.core.common.n.c.v a9 = aVar.a(1);
            this.f15561d = a9;
            this.f15562e = new com.anythink.core.common.n.c.h(a9) { // from class: com.anythink.core.common.n.b.c.a.1
                @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (c.this) {
                        try {
                            a aVar2 = a.this;
                            if (aVar2.f15558a) {
                                return;
                            }
                            aVar2.f15558a = true;
                            c.this.f15549c++;
                            super.close();
                            aVar.b();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
        }

        @Override // com.anythink.core.common.n.b.a.a.b
        public final void a() {
            synchronized (c.this) {
                try {
                    if (this.f15558a) {
                        return;
                    }
                    this.f15558a = true;
                    c.this.f15550d++;
                    com.anythink.core.common.n.b.a.c.a(this.f15561d);
                    try {
                        this.f15560c.c();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.a.b
        public final com.anythink.core.common.n.c.v b() {
            return this.f15562e;
        }
    }

    public static class b extends ag {

        /* renamed from: a, reason: collision with root package name */
        final d.c f15566a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15567b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15568c;

        /* renamed from: d, reason: collision with root package name */
        private final String f15569d;

        public b(final d.c cVar, String str, String str2) {
            this.f15566a = cVar;
            this.f15568c = str;
            this.f15569d = str2;
            this.f15567b = com.anythink.core.common.n.c.n.a(new com.anythink.core.common.n.c.i(cVar.a(1)) { // from class: com.anythink.core.common.n.b.c.b.1
                @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }

        @Override // com.anythink.core.common.n.b.ag
        public final x a() {
            String str = this.f15568c;
            if (str != null) {
                return x.b(str);
            }
            return null;
        }

        @Override // com.anythink.core.common.n.b.ag
        public final long b() {
            try {
                String str = this.f15569d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.anythink.core.common.n.b.ag
        public final com.anythink.core.common.n.c.e c() {
            return this.f15567b;
        }
    }

    private c(File file, long j6) {
        this(file, j6, com.anythink.core.common.n.b.a.f.a.f15337a);
    }

    private static String a(v vVar) {
        return com.anythink.core.common.n.c.f.a(vVar.toString()).c().g();
    }

    private void c() {
        this.f15548b.i();
    }

    private void d() {
        this.f15548b.j();
    }

    private Iterator<String> e() {
        return new Iterator<String>() { // from class: com.anythink.core.common.n.b.c.2

            /* renamed from: a, reason: collision with root package name */
            final Iterator<d.c> f15554a;

            /* renamed from: b, reason: collision with root package name */
            String f15555b;

            /* renamed from: c, reason: collision with root package name */
            boolean f15556c;

            {
                this.f15554a = c.this.f15548b.k();
            }

            private String a() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.f15555b;
                this.f15555b = null;
                this.f15556c = true;
                return str;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.f15555b != null) {
                    return true;
                }
                this.f15556c = false;
                while (this.f15554a.hasNext()) {
                    try {
                        d.c next = this.f15554a.next();
                        try {
                            continue;
                            this.f15555b = com.anythink.core.common.n.c.n.a(next.a(0)).w();
                            next.close();
                            return true;
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public final /* synthetic */ String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.f15555b;
                this.f15555b = null;
                this.f15556c = true;
                return str;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!this.f15556c) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.f15554a.remove();
            }
        };
    }

    private synchronized int f() {
        return this.f15550d;
    }

    private synchronized int g() {
        return this.f15549c;
    }

    private long h() {
        return this.f15548b.e();
    }

    private long i() {
        return this.f15548b.d();
    }

    private File j() {
        return this.f15548b.c();
    }

    private boolean k() {
        return this.f15548b.g();
    }

    private synchronized int l() {
        return this.i;
    }

    private synchronized int m() {
        return this.f15551j;
    }

    private synchronized int n() {
        return this.f15552k;
    }

    public final void b(ad adVar) {
        this.f15548b.c(a(adVar.f15480a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15548b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f15548b.flush();
    }

    private c(File file, long j6, com.anythink.core.common.n.b.a.f.a aVar) {
        this.f15547a = new com.anythink.core.common.n.b.a.a.f() { // from class: com.anythink.core.common.n.b.c.1
            @Override // com.anythink.core.common.n.b.a.a.f
            public final af a(ad adVar) {
                return c.this.a(adVar);
            }

            @Override // com.anythink.core.common.n.b.a.a.f
            public final void b(ad adVar) {
                c.this.b(adVar);
            }

            @Override // com.anythink.core.common.n.b.a.a.f
            public final com.anythink.core.common.n.b.a.a.b a(af afVar) {
                return c.this.a(afVar);
            }

            @Override // com.anythink.core.common.n.b.a.a.f
            public final void a(af afVar, af afVar2) {
                c.a(afVar, afVar2);
            }

            @Override // com.anythink.core.common.n.b.a.a.f
            public final void a() {
                c.this.a();
            }

            @Override // com.anythink.core.common.n.b.a.a.f
            public final void a(com.anythink.core.common.n.b.a.a.c cVar) {
                c.this.a(cVar);
            }
        };
        this.f15548b = com.anythink.core.common.n.b.a.a.d.a(aVar, file, j6);
    }

    public static void a(af afVar, af afVar2) {
        d.a aVar;
        C0089c c0089c = new C0089c(afVar2);
        try {
            aVar = ((b) afVar.f15505g).f15566a.a();
            if (aVar != null) {
                try {
                    c0089c.a(aVar);
                    aVar.b();
                } catch (IOException unused) {
                    a(aVar);
                }
            }
        } catch (IOException unused2) {
            aVar = null;
        }
    }

    private void b() {
        this.f15548b.a();
    }

    private static void a(d.a aVar) {
        if (aVar != null) {
            try {
                aVar.c();
            } catch (IOException unused) {
            }
        }
    }

    public final synchronized void a(com.anythink.core.common.n.b.a.a.c cVar) {
        this.f15552k++;
        if (cVar.f14876a != null) {
            this.i++;
        } else {
            if (cVar.f14877b != null) {
                this.f15551j++;
            }
        }
    }

    public final synchronized void a() {
        this.f15551j++;
    }

    public static int a(com.anythink.core.common.n.c.e eVar) {
        try {
            long r9 = eVar.r();
            String w6 = eVar.w();
            if (r9 >= 0 && r9 <= 2147483647L && w6.isEmpty()) {
                return (int) r9;
            }
            throw new IOException("expected an int but was \"" + r9 + w6 + "\"");
        } catch (NumberFormatException e9) {
            throw new IOException(e9.getMessage());
        }
    }

    public final af a(ad adVar) {
        try {
            d.c a9 = this.f15548b.a(a(adVar.f15480a));
            if (a9 == null) {
                return null;
            }
            try {
                C0089c c0089c = new C0089c(a9.a(0));
                af a10 = c0089c.a(a9);
                if (c0089c.a(adVar, a10)) {
                    return a10;
                }
                com.anythink.core.common.n.b.a.c.a(a10.f15505g);
                return null;
            } catch (IOException unused) {
                com.anythink.core.common.n.b.a.c.a(a9);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final com.anythink.core.common.n.b.a.a.b a(af afVar) {
        d.a aVar;
        String str = afVar.f15499a.f15481b;
        if (com.anythink.core.common.n.b.a.c.f.a(str)) {
            try {
                b(afVar.f15499a);
            } catch (IOException unused) {
            }
            return null;
        }
        if (!str.equals("GET") || com.anythink.core.common.n.b.a.c.e.b(afVar)) {
            return null;
        }
        C0089c c0089c = new C0089c(afVar);
        try {
            aVar = this.f15548b.b(a(afVar.f15499a.f15480a));
            if (aVar == null) {
                return null;
            }
            try {
                c0089c.a(aVar);
                return new a(aVar);
            } catch (IOException unused2) {
                a(aVar);
                return null;
            }
        } catch (IOException unused3) {
            aVar = null;
        }
    }

    /* renamed from: com.anythink.core.common.n.b.c$c, reason: collision with other inner class name */
    public static final class C0089c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f15572a;

        /* renamed from: b, reason: collision with root package name */
        private static final String f15573b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15574c;

        /* renamed from: d, reason: collision with root package name */
        private final u f15575d;

        /* renamed from: e, reason: collision with root package name */
        private final String f15576e;

        /* renamed from: f, reason: collision with root package name */
        private final ab f15577f;

        /* renamed from: g, reason: collision with root package name */
        private final int f15578g;

        /* renamed from: h, reason: collision with root package name */
        private final String f15579h;
        private final u i;

        /* renamed from: j, reason: collision with root package name */
        private final t f15580j;

        /* renamed from: k, reason: collision with root package name */
        private final long f15581k;

        /* renamed from: l, reason: collision with root package name */
        private final long f15582l;

        static {
            StringBuilder sb = new StringBuilder();
            com.anythink.core.common.n.b.a.g.c.e();
            sb.append(com.anythink.core.common.n.b.a.g.c.f());
            sb.append("-Sent-Millis");
            f15572a = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            com.anythink.core.common.n.b.a.g.c.e();
            sb2.append(com.anythink.core.common.n.b.a.g.c.f());
            sb2.append("-Received-Millis");
            f15573b = sb2.toString();
        }

        public C0089c(com.anythink.core.common.n.c.w wVar) {
            try {
                com.anythink.core.common.n.c.e a9 = com.anythink.core.common.n.c.n.a(wVar);
                this.f15574c = a9.w();
                this.f15576e = a9.w();
                u.a aVar = new u.a();
                int a10 = c.a(a9);
                for (int i = 0; i < a10; i++) {
                    aVar.a(a9.w());
                }
                this.f15575d = aVar.a();
                com.anythink.core.common.n.b.a.c.k a11 = com.anythink.core.common.n.b.a.c.k.a(a9.w());
                this.f15577f = a11.f15073d;
                this.f15578g = a11.f15074e;
                this.f15579h = a11.f15075f;
                u.a aVar2 = new u.a();
                int a12 = c.a(a9);
                for (int i6 = 0; i6 < a12; i6++) {
                    aVar2.a(a9.w());
                }
                String str = f15572a;
                String c9 = aVar2.c(str);
                String str2 = f15573b;
                String c10 = aVar2.c(str2);
                aVar2.b(str);
                aVar2.b(str2);
                this.f15581k = c9 != null ? Long.parseLong(c9) : 0L;
                this.f15582l = c10 != null ? Long.parseLong(c10) : 0L;
                this.i = aVar2.a();
                if (a()) {
                    String w6 = a9.w();
                    if (w6.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + w6 + "\"");
                    }
                    this.f15580j = t.a(!a9.g() ? ai.a(a9.w()) : ai.SSL_3_0, i.a(a9.w()), a(a9), a(a9));
                } else {
                    this.f15580j = null;
                }
                wVar.close();
            } catch (Throwable th) {
                wVar.close();
                throw th;
            }
        }

        public final void a(d.a aVar) {
            com.anythink.core.common.n.c.d a9 = com.anythink.core.common.n.c.n.a(aVar.a(0));
            a9.b(this.f15574c).l(10);
            a9.b(this.f15576e).l(10);
            a9.o(this.f15575d.a()).l(10);
            int a10 = this.f15575d.a();
            for (int i = 0; i < a10; i++) {
                a9.b(this.f15575d.a(i)).b(": ").b(this.f15575d.b(i)).l(10);
            }
            a9.b(new com.anythink.core.common.n.b.a.c.k(this.f15577f, this.f15578g, this.f15579h).toString()).l(10);
            a9.o(this.i.a() + 2).l(10);
            int a11 = this.i.a();
            for (int i6 = 0; i6 < a11; i6++) {
                a9.b(this.i.a(i6)).b(": ").b(this.i.b(i6)).l(10);
            }
            a9.b(f15572a).b(": ").o(this.f15581k).l(10);
            a9.b(f15573b).b(": ").o(this.f15582l).l(10);
            if (a()) {
                a9.l(10);
                a9.b(this.f15580j.b().bq).l(10);
                a(a9, this.f15580j.c());
                a(a9, this.f15580j.d());
                a9.b(this.f15580j.a().f15541f).l(10);
            }
            a9.close();
        }

        public C0089c(af afVar) {
            this.f15574c = afVar.f15499a.f15480a.toString();
            this.f15575d = com.anythink.core.common.n.b.a.c.e.c(afVar);
            this.f15576e = afVar.f15499a.f15481b;
            this.f15577f = afVar.f15500b;
            this.f15578g = afVar.f15501c;
            this.f15579h = afVar.f15502d;
            this.i = afVar.f15504f;
            this.f15580j = afVar.f15503e;
            this.f15581k = afVar.f15508k;
            this.f15582l = afVar.f15509l;
        }

        private boolean a() {
            return this.f15574c.startsWith("https://");
        }

        private static List<Certificate> a(com.anythink.core.common.n.c.e eVar) {
            int a9 = c.a(eVar);
            if (a9 == -1) {
                return Collections.EMPTY_LIST;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a9);
                for (int i = 0; i < a9; i++) {
                    String w6 = eVar.w();
                    com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                    cVar.d(com.anythink.core.common.n.c.f.b(w6));
                    arrayList.add(certificateFactory.generateCertificate(cVar.i()));
                }
                return arrayList;
            } catch (CertificateException e9) {
                throw new IOException(e9.getMessage());
            }
        }

        private static void a(com.anythink.core.common.n.c.d dVar, List<Certificate> list) {
            try {
                dVar.o(list.size()).l(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.b(com.anythink.core.common.n.c.f.a(list.get(i).getEncoded()).b()).l(10);
                }
            } catch (CertificateEncodingException e9) {
                throw new IOException(e9.getMessage());
            }
        }

        public final boolean a(ad adVar, af afVar) {
            return this.f15574c.equals(adVar.f15480a.toString()) && this.f15576e.equals(adVar.f15481b) && com.anythink.core.common.n.b.a.c.e.a(afVar, this.f15575d, adVar);
        }

        public final af a(d.c cVar) {
            String a9 = this.i.a("Content-Type");
            String a10 = this.i.a("Content-Length");
            ad b9 = new ad.a().a(this.f15574c).a(this.f15576e, (ae) null).a(this.f15575d).b();
            af.a aVar = new af.a();
            aVar.f15512a = b9;
            aVar.f15513b = this.f15577f;
            aVar.f15514c = this.f15578g;
            aVar.f15515d = this.f15579h;
            af.a a11 = aVar.a(this.i);
            a11.f15518g = new b(cVar, a9, a10);
            a11.f15516e = this.f15580j;
            a11.f15521k = this.f15581k;
            a11.f15522l = this.f15582l;
            return a11.a();
        }
    }
}
