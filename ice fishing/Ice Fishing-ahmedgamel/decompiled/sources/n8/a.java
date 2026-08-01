package n8;

import C2.N;
import a.AbstractC0422a;
import com.google.android.gms.internal.ads.C3428jv;
import i8.C4594a;
import i8.l;
import i8.n;
import i8.o;
import i8.p;
import i8.r;
import i8.t;
import i8.u;
import i8.v;
import i8.x;
import i8.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import m8.m;
import m8.q;
import m8.s;
import p8.C4855a;
import q2.C4896n;
import v7.C5135p;
import y8.j;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39513a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f39514b;

    public a(i8.b cookieJar) {
        kotlin.jvm.internal.h.e(cookieJar, "cookieJar");
        this.f39514b = cookieJar;
    }

    public static int d(v vVar, int i) {
        String a9 = vVar.f38257y.a("Retry-After");
        if (a9 == null) {
            a9 = null;
        }
        if (a9 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        if (!compile.matcher(a9).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a9);
        kotlin.jvm.internal.h.d(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i8.o
    public final v a(h hVar) {
        boolean z3;
        x xVar;
        boolean z6;
        boolean z9;
        v i;
        SSLSocketFactory sSLSocketFactory;
        w8.c cVar;
        i8.d dVar;
        switch (this.f39513a) {
            case 0:
                boolean z10 = true;
                C4896n c4896n = hVar.f39521e;
                N j6 = c4896n.j();
                t tVar = (t) c4896n.f40195x;
                if (tVar != null) {
                    p b9 = tVar.b();
                    if (b9 != null) {
                        j6.o("Content-Type", b9.f38169a);
                    }
                    long a9 = tVar.a();
                    if (a9 != -1) {
                        j6.o("Content-Length", String.valueOf(a9));
                        ((G1.e) j6.f303w).d("Transfer-Encoding");
                    } else {
                        j6.o("Transfer-Encoding", "chunked");
                        ((G1.e) j6.f303w).d("Content-Length");
                    }
                }
                l lVar = (l) c4896n.f40194w;
                String a10 = lVar.a("Host");
                n url = (n) c4896n.f40192u;
                if (a10 == null) {
                    z3 = false;
                    j6.o("Host", j8.d.i(url, false));
                } else {
                    z3 = false;
                }
                if (lVar.a("Connection") == null) {
                    j6.o("Connection", com.anythink.expressad.foundation.g.f.g.b.f19340c);
                }
                if (lVar.a("Accept-Encoding") == null && lVar.a("Range") == null) {
                    j6.o("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
                } else {
                    z10 = z3;
                }
                i8.b bVar = (i8.b) this.f39514b;
                bVar.getClass();
                kotlin.jvm.internal.h.e(url, "url");
                if (lVar.a("User-Agent") == null) {
                    j6.o("User-Agent", "okhttp/5.2.1");
                }
                C4896n c4896n2 = new C4896n(j6);
                v b10 = hVar.b(c4896n2);
                l lVar2 = b10.f38257y;
                g.b(bVar, (n) c4896n2.f40192u, lVar2);
                u b11 = b10.b();
                b11.f38230a = c4896n2;
                if (z10) {
                    String a11 = lVar2.a("Content-Encoding");
                    if (a11 == null) {
                        a11 = null;
                    }
                    if (com.anythink.expressad.foundation.g.f.g.b.f19341d.equalsIgnoreCase(a11) && g.a(b10) && (xVar = b10.f38258z) != null) {
                        j jVar = new j(xVar.z());
                        G1.e d2 = lVar2.d();
                        d2.d("Content-Encoding");
                        d2.d("Content-Length");
                        b11.f38235f = d2.b().d();
                        String a12 = lVar2.a("Content-Type");
                        if (a12 == null) {
                            a12 = null;
                        }
                        b11.f38236g = new i(a12, -1L, y8.b.b(jVar));
                    }
                }
                return b11.a();
            default:
                C4896n c4896n3 = hVar.f39521e;
                q qVar = hVar.f39517a;
                C5135p suppressed = C5135p.f41442n;
                v vVar = null;
                int i6 = 0;
                C4896n c4896n4 = c4896n3;
                while (true) {
                    boolean z11 = true;
                    while (true) {
                        qVar.getClass();
                        if (qVar.f39380C != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (qVar) {
                            try {
                                if (qVar.f39382E) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (qVar.f39381D) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z11) {
                            r rVar = qVar.f39387n;
                            l8.d dVar2 = rVar.f38193A;
                            s sVar = qVar.f39389v;
                            int i9 = rVar.f38217x;
                            int i10 = rVar.f38218y;
                            int i11 = hVar.f39522f;
                            int i12 = hVar.f39523g;
                            z6 = true;
                            boolean z12 = rVar.f38199e;
                            boolean z13 = rVar.f38200f;
                            n url2 = (n) c4896n4.f40192u;
                            kotlin.jvm.internal.h.e(url2, "url");
                            if (kotlin.jvm.internal.h.a(url2.f38159a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f38208o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                w8.c cVar2 = rVar.f38212s;
                                dVar = rVar.f38213t;
                                cVar = cVar2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            m8.t tVar2 = new m8.t(dVar2, sVar, i9, i10, i11, i12, z12, z13, new C4594a(url2.f38162d, url2.f38163e, rVar.f38204k, rVar.f38207n, sSLSocketFactory, cVar, dVar, rVar.f38206m, rVar.f38211r, rVar.f38210q, rVar.f38205l), qVar.f39387n.f38219z, new m8.a(qVar, qVar.f39389v.f39411a, hVar));
                            r rVar2 = qVar.f39387n;
                            qVar.f39393z = rVar2.f38200f ? new m(tVar2, rVar2.f38193A) : new F1.a(25, tVar2);
                        } else {
                            z6 = true;
                        }
                        try {
                            if (qVar.f39384G) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b12 = hVar.b(c4896n4).b();
                                b12.f38230a = c4896n4;
                                if (vVar != null) {
                                    try {
                                        i = com.bumptech.glide.e.i(vVar);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z9 = z6;
                                        qVar.i(z9);
                                        throw th;
                                    }
                                } else {
                                    i = null;
                                }
                                b12.f38239k = i;
                                vVar = b12.a();
                                c4896n4 = b(vVar, qVar.f39380C);
                                if (c4896n4 == null) {
                                    qVar.i(false);
                                    return vVar;
                                }
                                j8.c.a(vVar.f38258z);
                                i6++;
                                if (i6 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i6);
                                }
                                qVar.i(z6);
                            } catch (IOException e9) {
                                if (!c(e9, qVar, c4896n4)) {
                                    byte[] bArr = j8.c.f38482a;
                                    kotlin.jvm.internal.h.e(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        X2.e.y(e9, (Exception) it.next());
                                    }
                                    throw e9;
                                }
                                kotlin.jvm.internal.h.e(suppressed, "<this>");
                                ArrayList arrayList = new ArrayList(suppressed.size() + 1);
                                arrayList.addAll(suppressed);
                                arrayList.add(e9);
                                qVar.i(true);
                                suppressed = arrayList;
                                z11 = false;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z9 = true;
                        }
                    }
                }
        }
    }

    public C4896n b(v vVar, C3428jv c3428jv) {
        i8.m mVar;
        v vVar2;
        y yVar = c3428jv != null ? c3428jv.b().f39396d : null;
        int i = vVar.f38255w;
        String str = (String) vVar.f38252n.f40193v;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((r) this.f39514b).f38201g.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    v vVar3 = vVar.f38247D;
                    if ((vVar3 == null || vVar3.f38255w != 503) && d(vVar, Integer.MAX_VALUE) == 0) {
                        return vVar.f38252n;
                    }
                } else {
                    if (i == 407) {
                        kotlin.jvm.internal.h.b(yVar);
                        if (yVar.f38263b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((r) this.f39514b).f38206m.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((r) this.f39514b).f38199e && (((vVar2 = vVar.f38247D) == null || vVar2.f38255w != 408) && d(vVar, 0) <= 0)) {
                        return vVar.f38252n;
                    }
                }
            } else if (c3428jv != null && !kotlin.jvm.internal.h.a(((m8.j) c3428jv.f31348w).c().l().f38074h.f38162d, ((f) c3428jv.f31349x).h().g().f38262a.f38074h.f38162d)) {
                m8.r b9 = c3428jv.b();
                synchronized (b9) {
                    b9.f39404m = true;
                }
                return vVar.f38252n;
            }
            return null;
        }
        r rVar = (r) this.f39514b;
        if (rVar.f38202h) {
            String a9 = vVar.f38257y.a("Location");
            if (a9 == null) {
                a9 = null;
            }
            if (a9 != null) {
                C4896n c4896n = vVar.f38252n;
                n nVar = (n) c4896n.f40192u;
                nVar.getClass();
                try {
                    mVar = new i8.m();
                    mVar.c(nVar, a9);
                } catch (IllegalArgumentException unused) {
                    mVar = null;
                }
                n a10 = mVar != null ? mVar.a() : null;
                if (a10 != null) {
                    if (kotlin.jvm.internal.h.a(a10.f38159a, ((n) c4896n.f40192u).f38159a) || rVar.i) {
                        N j6 = c4896n.j();
                        if (AbstractC0422a.s(str)) {
                            boolean equals = str.equals("PROPFIND");
                            int i6 = vVar.f38255w;
                            boolean z3 = equals || i6 == 308 || i6 == 307;
                            if (str.equals("PROPFIND") || i6 == 308 || i6 == 307) {
                                j6.p(str, z3 ? (t) c4896n.f40195x : null);
                            } else {
                                j6.p("GET", null);
                            }
                            if (!z3) {
                                ((G1.e) j6.f303w).d("Transfer-Encoding");
                                ((G1.e) j6.f303w).d("Content-Length");
                                ((G1.e) j6.f303w).d("Content-Type");
                            }
                        }
                        if (!j8.d.a((n) c4896n.f40192u, a10)) {
                            ((G1.e) j6.f303w).d("Authorization");
                        }
                        j6.f301u = a10;
                        return new C4896n(j6);
                    }
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, q qVar, C4896n c4896n) {
        boolean z3 = iOException instanceof C4855a;
        if (!((r) this.f39514b).f38199e) {
            return false;
        }
        if ((!z3 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z3) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C3428jv c3428jv = qVar.f39385H;
        if (c3428jv == null || !c3428jv.f31346u) {
            return false;
        }
        m8.j jVar = qVar.f39393z;
        kotlin.jvm.internal.h.b(jVar);
        m8.x c9 = jVar.c();
        C3428jv c3428jv2 = qVar.f39385H;
        return c9.s(c3428jv2 != null ? c3428jv2.b() : null);
    }

    public a(r client) {
        kotlin.jvm.internal.h.e(client, "client");
        this.f39514b = client;
    }
}
