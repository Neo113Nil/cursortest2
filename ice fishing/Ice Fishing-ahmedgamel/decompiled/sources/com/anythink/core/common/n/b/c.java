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
    private static final int f16330e = 201105;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16331f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16332g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f16333h = 2;

    /* renamed from: a, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.f f16334a;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.d f16335b;

    /* renamed from: c, reason: collision with root package name */
    int f16336c;

    /* renamed from: d, reason: collision with root package name */
    int f16337d;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f16338j;

    /* renamed from: k, reason: collision with root package name */
    private int f16339k;

    public final class a implements com.anythink.core.common.n.b.a.a.b {

        /* renamed from: a, reason: collision with root package name */
        boolean f16345a;

        /* renamed from: c, reason: collision with root package name */
        private final d.a f16347c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.n.c.v f16348d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.n.c.v f16349e;

        public a(final d.a aVar) {
            this.f16347c = aVar;
            com.anythink.core.common.n.c.v a9 = aVar.a(1);
            this.f16348d = a9;
            this.f16349e = new com.anythink.core.common.n.c.h(a9) { // from class: com.anythink.core.common.n.b.c.a.1
                @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (c.this) {
                        try {
                            a aVar2 = a.this;
                            if (aVar2.f16345a) {
                                return;
                            }
                            aVar2.f16345a = true;
                            c.this.f16336c++;
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
                    if (this.f16345a) {
                        return;
                    }
                    this.f16345a = true;
                    c.this.f16337d++;
                    com.anythink.core.common.n.b.a.c.a(this.f16348d);
                    try {
                        this.f16347c.c();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.a.b
        public final com.anythink.core.common.n.c.v b() {
            return this.f16349e;
        }
    }

    public static class b extends ag {

        /* renamed from: a, reason: collision with root package name */
        final d.c f16353a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f16354b;

        /* renamed from: c, reason: collision with root package name */
        private final String f16355c;

        /* renamed from: d, reason: collision with root package name */
        private final String f16356d;

        public b(final d.c cVar, String str, String str2) {
            this.f16353a = cVar;
            this.f16355c = str;
            this.f16356d = str2;
            this.f16354b = com.anythink.core.common.n.c.n.a(new com.anythink.core.common.n.c.i(cVar.a(1)) { // from class: com.anythink.core.common.n.b.c.b.1
                @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }

        @Override // com.anythink.core.common.n.b.ag
        public final x a() {
            String str = this.f16355c;
            if (str != null) {
                return x.b(str);
            }
            return null;
        }

        @Override // com.anythink.core.common.n.b.ag
        public final long b() {
            try {
                String str = this.f16356d;
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
            return this.f16354b;
        }
    }

    private c(File file, long j6) {
        this(file, j6, com.anythink.core.common.n.b.a.f.a.f16124a);
    }

    private static String a(v vVar) {
        return com.anythink.core.common.n.c.f.a(vVar.toString()).c().g();
    }

    private void c() {
        this.f16335b.i();
    }

    private void d() {
        this.f16335b.j();
    }

    private Iterator<String> e() {
        return new Iterator<String>() { // from class: com.anythink.core.common.n.b.c.2

            /* renamed from: a, reason: collision with root package name */
            final Iterator<d.c> f16341a;

            /* renamed from: b, reason: collision with root package name */
            String f16342b;

            /* renamed from: c, reason: collision with root package name */
            boolean f16343c;

            {
                this.f16341a = c.this.f16335b.k();
            }

            private String a() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.f16342b;
                this.f16342b = null;
                this.f16343c = true;
                return str;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.f16342b != null) {
                    return true;
                }
                this.f16343c = false;
                while (this.f16341a.hasNext()) {
                    try {
                        d.c next = this.f16341a.next();
                        try {
                            continue;
                            this.f16342b = com.anythink.core.common.n.c.n.a(next.a(0)).w();
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
                String str = this.f16342b;
                this.f16342b = null;
                this.f16343c = true;
                return str;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!this.f16343c) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.f16341a.remove();
            }
        };
    }

    private synchronized int f() {
        return this.f16337d;
    }

    private synchronized int g() {
        return this.f16336c;
    }

    private long h() {
        return this.f16335b.e();
    }

    private long i() {
        return this.f16335b.d();
    }

    private File j() {
        return this.f16335b.c();
    }

    private boolean k() {
        return this.f16335b.g();
    }

    private synchronized int l() {
        return this.i;
    }

    private synchronized int m() {
        return this.f16338j;
    }

    private synchronized int n() {
        return this.f16339k;
    }

    public final void b(ad adVar) {
        this.f16335b.c(a(adVar.f16267a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16335b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f16335b.flush();
    }

    private c(File file, long j6, com.anythink.core.common.n.b.a.f.a aVar) {
        this.f16334a = new com.anythink.core.common.n.b.a.a.f() { // from class: com.anythink.core.common.n.b.c.1
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
        this.f16335b = com.anythink.core.common.n.b.a.a.d.a(aVar, file, j6);
    }

    public static void a(af afVar, af afVar2) {
        d.a aVar;
        C0089c c0089c = new C0089c(afVar2);
        try {
            aVar = ((b) afVar.f16292g).f16353a.a();
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
        this.f16335b.a();
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
        this.f16339k++;
        if (cVar.f15663a != null) {
            this.i++;
        } else {
            if (cVar.f15664b != null) {
                this.f16338j++;
            }
        }
    }

    public final synchronized void a() {
        this.f16338j++;
    }

    public static int a(com.anythink.core.common.n.c.e eVar) {
        try {
            long r9 = eVar.r();
            String w3 = eVar.w();
            if (r9 >= 0 && r9 <= 2147483647L && w3.isEmpty()) {
                return (int) r9;
            }
            throw new IOException("expected an int but was \"" + r9 + w3 + "\"");
        } catch (NumberFormatException e9) {
            throw new IOException(e9.getMessage());
        }
    }

    public final af a(ad adVar) {
        try {
            d.c a9 = this.f16335b.a(a(adVar.f16267a));
            if (a9 == null) {
                return null;
            }
            try {
                C0089c c0089c = new C0089c(a9.a(0));
                af a10 = c0089c.a(a9);
                if (c0089c.a(adVar, a10)) {
                    return a10;
                }
                com.anythink.core.common.n.b.a.c.a(a10.f16292g);
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
        String str = afVar.f16286a.f16268b;
        if (com.anythink.core.common.n.b.a.c.f.a(str)) {
            try {
                b(afVar.f16286a);
            } catch (IOException unused) {
            }
            return null;
        }
        if (!str.equals("GET") || com.anythink.core.common.n.b.a.c.e.b(afVar)) {
            return null;
        }
        C0089c c0089c = new C0089c(afVar);
        try {
            aVar = this.f16335b.b(a(afVar.f16286a.f16267a));
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
        private static final String f16359a;

        /* renamed from: b, reason: collision with root package name */
        private static final String f16360b;

        /* renamed from: c, reason: collision with root package name */
        private final String f16361c;

        /* renamed from: d, reason: collision with root package name */
        private final u f16362d;

        /* renamed from: e, reason: collision with root package name */
        private final String f16363e;

        /* renamed from: f, reason: collision with root package name */
        private final ab f16364f;

        /* renamed from: g, reason: collision with root package name */
        private final int f16365g;

        /* renamed from: h, reason: collision with root package name */
        private final String f16366h;
        private final u i;

        /* renamed from: j, reason: collision with root package name */
        private final t f16367j;

        /* renamed from: k, reason: collision with root package name */
        private final long f16368k;

        /* renamed from: l, reason: collision with root package name */
        private final long f16369l;

        static {
            StringBuilder sb = new StringBuilder();
            com.anythink.core.common.n.b.a.g.c.e();
            sb.append(com.anythink.core.common.n.b.a.g.c.f());
            sb.append("-Sent-Millis");
            f16359a = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            com.anythink.core.common.n.b.a.g.c.e();
            sb2.append(com.anythink.core.common.n.b.a.g.c.f());
            sb2.append("-Received-Millis");
            f16360b = sb2.toString();
        }

        public C0089c(com.anythink.core.common.n.c.w wVar) {
            try {
                com.anythink.core.common.n.c.e a9 = com.anythink.core.common.n.c.n.a(wVar);
                this.f16361c = a9.w();
                this.f16363e = a9.w();
                u.a aVar = new u.a();
                int a10 = c.a(a9);
                for (int i = 0; i < a10; i++) {
                    aVar.a(a9.w());
                }
                this.f16362d = aVar.a();
                com.anythink.core.common.n.b.a.c.k a11 = com.anythink.core.common.n.b.a.c.k.a(a9.w());
                this.f16364f = a11.f15860d;
                this.f16365g = a11.f15861e;
                this.f16366h = a11.f15862f;
                u.a aVar2 = new u.a();
                int a12 = c.a(a9);
                for (int i4 = 0; i4 < a12; i4++) {
                    aVar2.a(a9.w());
                }
                String str = f16359a;
                String c9 = aVar2.c(str);
                String str2 = f16360b;
                String c10 = aVar2.c(str2);
                aVar2.b(str);
                aVar2.b(str2);
                this.f16368k = c9 != null ? Long.parseLong(c9) : 0L;
                this.f16369l = c10 != null ? Long.parseLong(c10) : 0L;
                this.i = aVar2.a();
                if (a()) {
                    String w3 = a9.w();
                    if (w3.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + w3 + "\"");
                    }
                    this.f16367j = t.a(!a9.g() ? ai.a(a9.w()) : ai.SSL_3_0, i.a(a9.w()), a(a9), a(a9));
                } else {
                    this.f16367j = null;
                }
                wVar.close();
            } catch (Throwable th) {
                wVar.close();
                throw th;
            }
        }

        public final void a(d.a aVar) {
            com.anythink.core.common.n.c.d a9 = com.anythink.core.common.n.c.n.a(aVar.a(0));
            a9.b(this.f16361c).l(10);
            a9.b(this.f16363e).l(10);
            a9.o(this.f16362d.a()).l(10);
            int a10 = this.f16362d.a();
            for (int i = 0; i < a10; i++) {
                a9.b(this.f16362d.a(i)).b(": ").b(this.f16362d.b(i)).l(10);
            }
            a9.b(new com.anythink.core.common.n.b.a.c.k(this.f16364f, this.f16365g, this.f16366h).toString()).l(10);
            a9.o(this.i.a() + 2).l(10);
            int a11 = this.i.a();
            for (int i4 = 0; i4 < a11; i4++) {
                a9.b(this.i.a(i4)).b(": ").b(this.i.b(i4)).l(10);
            }
            a9.b(f16359a).b(": ").o(this.f16368k).l(10);
            a9.b(f16360b).b(": ").o(this.f16369l).l(10);
            if (a()) {
                a9.l(10);
                a9.b(this.f16367j.b().bq).l(10);
                a(a9, this.f16367j.c());
                a(a9, this.f16367j.d());
                a9.b(this.f16367j.a().f16328f).l(10);
            }
            a9.close();
        }

        public C0089c(af afVar) {
            this.f16361c = afVar.f16286a.f16267a.toString();
            this.f16362d = com.anythink.core.common.n.b.a.c.e.c(afVar);
            this.f16363e = afVar.f16286a.f16268b;
            this.f16364f = afVar.f16287b;
            this.f16365g = afVar.f16288c;
            this.f16366h = afVar.f16289d;
            this.i = afVar.f16291f;
            this.f16367j = afVar.f16290e;
            this.f16368k = afVar.f16295k;
            this.f16369l = afVar.f16296l;
        }

        private boolean a() {
            return this.f16361c.startsWith("https://");
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
                    String w3 = eVar.w();
                    com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                    cVar.d(com.anythink.core.common.n.c.f.b(w3));
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
            return this.f16361c.equals(adVar.f16267a.toString()) && this.f16363e.equals(adVar.f16268b) && com.anythink.core.common.n.b.a.c.e.a(afVar, this.f16362d, adVar);
        }

        public final af a(d.c cVar) {
            String a9 = this.i.a("Content-Type");
            String a10 = this.i.a("Content-Length");
            ad b9 = new ad.a().a(this.f16361c).a(this.f16363e, (ae) null).a(this.f16362d).b();
            af.a aVar = new af.a();
            aVar.f16299a = b9;
            aVar.f16300b = this.f16364f;
            aVar.f16301c = this.f16365g;
            aVar.f16302d = this.f16366h;
            af.a a11 = aVar.a(this.i);
            a11.f16305g = new b(cVar, a9, a10);
            a11.f16303e = this.f16367j;
            a11.f16308k = this.f16368k;
            a11.f16309l = this.f16369l;
            return a11.a();
        }
    }
}
