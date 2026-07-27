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
    private static final int f15701e = 201105;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15702f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15703g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15704h = 2;

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.f f15705a;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.d f15706b;

    /* renamed from: c, reason: collision with root package name */
    int f15707c;

    /* renamed from: d, reason: collision with root package name */
    int f15708d;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15709j;

    /* renamed from: k, reason: collision with root package name */
    private int f15710k;

    public final class a implements com.anythink.core.common.n.b.a.a.b {

        /* renamed from: a, reason: collision with root package name */
        boolean f15716a;

        /* renamed from: c, reason: collision with root package name */
        private final d.a f15718c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.n.c.v f15719d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.n.c.v f15720e;

        public a(final d.a aVar) {
            this.f15718c = aVar;
            com.anythink.core.common.n.c.v a9 = aVar.a(1);
            this.f15719d = a9;
            this.f15720e = new com.anythink.core.common.n.c.h(a9) { // from class: com.anythink.core.common.n.b.c.a.1
                @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (c.this) {
                        try {
                            a aVar2 = a.this;
                            if (aVar2.f15716a) {
                                return;
                            }
                            aVar2.f15716a = true;
                            c.this.f15707c++;
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
                    if (this.f15716a) {
                        return;
                    }
                    this.f15716a = true;
                    c.this.f15708d++;
                    com.anythink.core.common.n.b.a.c.a(this.f15719d);
                    try {
                        this.f15718c.c();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.a.b
        public final com.anythink.core.common.n.c.v b() {
            return this.f15720e;
        }
    }

    public static class b extends ag {

        /* renamed from: a, reason: collision with root package name */
        final d.c f15724a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15725b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15726c;

        /* renamed from: d, reason: collision with root package name */
        private final String f15727d;

        public b(final d.c cVar, String str, String str2) {
            this.f15724a = cVar;
            this.f15726c = str;
            this.f15727d = str2;
            this.f15725b = com.anythink.core.common.n.c.n.a(new com.anythink.core.common.n.c.i(cVar.a(1)) { // from class: com.anythink.core.common.n.b.c.b.1
                @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }

        @Override // com.anythink.core.common.n.b.ag
        public final x a() {
            String str = this.f15726c;
            if (str != null) {
                return x.b(str);
            }
            return null;
        }

        @Override // com.anythink.core.common.n.b.ag
        public final long b() {
            try {
                String str = this.f15727d;
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
            return this.f15725b;
        }
    }

    private c(File file, long j9) {
        this(file, j9, com.anythink.core.common.n.b.a.f.a.f15495a);
    }

    private static String a(v vVar) {
        return com.anythink.core.common.n.c.f.a(vVar.toString()).c().g();
    }

    private void c() {
        this.f15706b.i();
    }

    private void d() {
        this.f15706b.j();
    }

    private Iterator<String> e() {
        return new Iterator<String>() { // from class: com.anythink.core.common.n.b.c.2

            /* renamed from: a, reason: collision with root package name */
            final Iterator<d.c> f15712a;

            /* renamed from: b, reason: collision with root package name */
            String f15713b;

            /* renamed from: c, reason: collision with root package name */
            boolean f15714c;

            {
                this.f15712a = c.this.f15706b.k();
            }

            private String a() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.f15713b;
                this.f15713b = null;
                this.f15714c = true;
                return str;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.f15713b != null) {
                    return true;
                }
                this.f15714c = false;
                while (this.f15712a.hasNext()) {
                    try {
                        d.c next = this.f15712a.next();
                        try {
                            continue;
                            this.f15713b = com.anythink.core.common.n.c.n.a(next.a(0)).w();
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
                String str = this.f15713b;
                this.f15713b = null;
                this.f15714c = true;
                return str;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!this.f15714c) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.f15712a.remove();
            }
        };
    }

    private synchronized int f() {
        return this.f15708d;
    }

    private synchronized int g() {
        return this.f15707c;
    }

    private long h() {
        return this.f15706b.e();
    }

    private long i() {
        return this.f15706b.d();
    }

    private File j() {
        return this.f15706b.c();
    }

    private boolean k() {
        return this.f15706b.g();
    }

    private synchronized int l() {
        return this.i;
    }

    private synchronized int m() {
        return this.f15709j;
    }

    private synchronized int n() {
        return this.f15710k;
    }

    public final void b(ad adVar) {
        this.f15706b.c(a(adVar.f15638a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15706b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f15706b.flush();
    }

    private c(File file, long j9, com.anythink.core.common.n.b.a.f.a aVar) {
        this.f15705a = new com.anythink.core.common.n.b.a.a.f() { // from class: com.anythink.core.common.n.b.c.1
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
        this.f15706b = com.anythink.core.common.n.b.a.a.d.a(aVar, file, j9);
    }

    public static void a(af afVar, af afVar2) {
        d.a aVar;
        C0088c c0088c = new C0088c(afVar2);
        try {
            aVar = ((b) afVar.f15663g).f15724a.a();
            if (aVar != null) {
                try {
                    c0088c.a(aVar);
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
        this.f15706b.a();
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
        this.f15710k++;
        if (cVar.f15034a != null) {
            this.i++;
        } else {
            if (cVar.f15035b != null) {
                this.f15709j++;
            }
        }
    }

    public final synchronized void a() {
        this.f15709j++;
    }

    public static int a(com.anythink.core.common.n.c.e eVar) {
        try {
            long r9 = eVar.r();
            String w9 = eVar.w();
            if (r9 >= 0 && r9 <= 2147483647L && w9.isEmpty()) {
                return (int) r9;
            }
            throw new IOException("expected an int but was \"" + r9 + w9 + "\"");
        } catch (NumberFormatException e6) {
            throw new IOException(e6.getMessage());
        }
    }

    public final af a(ad adVar) {
        try {
            d.c a9 = this.f15706b.a(a(adVar.f15638a));
            if (a9 == null) {
                return null;
            }
            try {
                C0088c c0088c = new C0088c(a9.a(0));
                af a10 = c0088c.a(a9);
                if (c0088c.a(adVar, a10)) {
                    return a10;
                }
                com.anythink.core.common.n.b.a.c.a(a10.f15663g);
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
        String str = afVar.f15657a.f15639b;
        if (com.anythink.core.common.n.b.a.c.f.a(str)) {
            try {
                b(afVar.f15657a);
            } catch (IOException unused) {
            }
            return null;
        }
        if (!str.equals("GET") || com.anythink.core.common.n.b.a.c.e.b(afVar)) {
            return null;
        }
        C0088c c0088c = new C0088c(afVar);
        try {
            aVar = this.f15706b.b(a(afVar.f15657a.f15638a));
            if (aVar == null) {
                return null;
            }
            try {
                c0088c.a(aVar);
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
    public static final class C0088c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f15730a;

        /* renamed from: b, reason: collision with root package name */
        private static final String f15731b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15732c;

        /* renamed from: d, reason: collision with root package name */
        private final u f15733d;

        /* renamed from: e, reason: collision with root package name */
        private final String f15734e;

        /* renamed from: f, reason: collision with root package name */
        private final ab f15735f;

        /* renamed from: g, reason: collision with root package name */
        private final int f15736g;

        /* renamed from: h, reason: collision with root package name */
        private final String f15737h;
        private final u i;

        /* renamed from: j, reason: collision with root package name */
        private final t f15738j;

        /* renamed from: k, reason: collision with root package name */
        private final long f15739k;

        /* renamed from: l, reason: collision with root package name */
        private final long f15740l;

        static {
            StringBuilder sb = new StringBuilder();
            com.anythink.core.common.n.b.a.g.c.e();
            sb.append(com.anythink.core.common.n.b.a.g.c.f());
            sb.append("-Sent-Millis");
            f15730a = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            com.anythink.core.common.n.b.a.g.c.e();
            sb2.append(com.anythink.core.common.n.b.a.g.c.f());
            sb2.append("-Received-Millis");
            f15731b = sb2.toString();
        }

        public C0088c(com.anythink.core.common.n.c.w wVar) {
            try {
                com.anythink.core.common.n.c.e a9 = com.anythink.core.common.n.c.n.a(wVar);
                this.f15732c = a9.w();
                this.f15734e = a9.w();
                u.a aVar = new u.a();
                int a10 = c.a(a9);
                for (int i = 0; i < a10; i++) {
                    aVar.a(a9.w());
                }
                this.f15733d = aVar.a();
                com.anythink.core.common.n.b.a.c.k a11 = com.anythink.core.common.n.b.a.c.k.a(a9.w());
                this.f15735f = a11.f15231d;
                this.f15736g = a11.f15232e;
                this.f15737h = a11.f15233f;
                u.a aVar2 = new u.a();
                int a12 = c.a(a9);
                for (int i4 = 0; i4 < a12; i4++) {
                    aVar2.a(a9.w());
                }
                String str = f15730a;
                String c4 = aVar2.c(str);
                String str2 = f15731b;
                String c9 = aVar2.c(str2);
                aVar2.b(str);
                aVar2.b(str2);
                this.f15739k = c4 != null ? Long.parseLong(c4) : 0L;
                this.f15740l = c9 != null ? Long.parseLong(c9) : 0L;
                this.i = aVar2.a();
                if (a()) {
                    String w9 = a9.w();
                    if (w9.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + w9 + "\"");
                    }
                    this.f15738j = t.a(!a9.g() ? ai.a(a9.w()) : ai.SSL_3_0, i.a(a9.w()), a(a9), a(a9));
                } else {
                    this.f15738j = null;
                }
                wVar.close();
            } catch (Throwable th) {
                wVar.close();
                throw th;
            }
        }

        public final void a(d.a aVar) {
            com.anythink.core.common.n.c.d a9 = com.anythink.core.common.n.c.n.a(aVar.a(0));
            a9.b(this.f15732c).l(10);
            a9.b(this.f15734e).l(10);
            a9.o(this.f15733d.a()).l(10);
            int a10 = this.f15733d.a();
            for (int i = 0; i < a10; i++) {
                a9.b(this.f15733d.a(i)).b(": ").b(this.f15733d.b(i)).l(10);
            }
            a9.b(new com.anythink.core.common.n.b.a.c.k(this.f15735f, this.f15736g, this.f15737h).toString()).l(10);
            a9.o(this.i.a() + 2).l(10);
            int a11 = this.i.a();
            for (int i4 = 0; i4 < a11; i4++) {
                a9.b(this.i.a(i4)).b(": ").b(this.i.b(i4)).l(10);
            }
            a9.b(f15730a).b(": ").o(this.f15739k).l(10);
            a9.b(f15731b).b(": ").o(this.f15740l).l(10);
            if (a()) {
                a9.l(10);
                a9.b(this.f15738j.b().bq).l(10);
                a(a9, this.f15738j.c());
                a(a9, this.f15738j.d());
                a9.b(this.f15738j.a().f15699f).l(10);
            }
            a9.close();
        }

        public C0088c(af afVar) {
            this.f15732c = afVar.f15657a.f15638a.toString();
            this.f15733d = com.anythink.core.common.n.b.a.c.e.c(afVar);
            this.f15734e = afVar.f15657a.f15639b;
            this.f15735f = afVar.f15658b;
            this.f15736g = afVar.f15659c;
            this.f15737h = afVar.f15660d;
            this.i = afVar.f15662f;
            this.f15738j = afVar.f15661e;
            this.f15739k = afVar.f15666k;
            this.f15740l = afVar.f15667l;
        }

        private boolean a() {
            return this.f15732c.startsWith("https://");
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
                    String w9 = eVar.w();
                    com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                    cVar.d(com.anythink.core.common.n.c.f.b(w9));
                    arrayList.add(certificateFactory.generateCertificate(cVar.i()));
                }
                return arrayList;
            } catch (CertificateException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        private static void a(com.anythink.core.common.n.c.d dVar, List<Certificate> list) {
            try {
                dVar.o(list.size()).l(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.b(com.anythink.core.common.n.c.f.a(list.get(i).getEncoded()).b()).l(10);
                }
            } catch (CertificateEncodingException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        public final boolean a(ad adVar, af afVar) {
            return this.f15732c.equals(adVar.f15638a.toString()) && this.f15734e.equals(adVar.f15639b) && com.anythink.core.common.n.b.a.c.e.a(afVar, this.f15733d, adVar);
        }

        public final af a(d.c cVar) {
            String a9 = this.i.a("Content-Type");
            String a10 = this.i.a("Content-Length");
            ad b9 = new ad.a().a(this.f15732c).a(this.f15734e, (ae) null).a(this.f15733d).b();
            af.a aVar = new af.a();
            aVar.f15670a = b9;
            aVar.f15671b = this.f15735f;
            aVar.f15672c = this.f15736g;
            aVar.f15673d = this.f15737h;
            af.a a11 = aVar.a(this.i);
            a11.f15676g = new b(cVar, a9, a10);
            a11.f15674e = this.f15738j;
            a11.f15679k = this.f15739k;
            a11.f15680l = this.f15740l;
            return a11.a();
        }
    }
}
