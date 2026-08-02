package n8;

import E2.M;
import com.google.android.gms.internal.ads.C3451jv;
import h.C4543G;
import i8.C4603a;
import i8.l;
import i8.m;
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
import m8.q;
import m8.s;
import m8.w;
import p8.C4855a;
import s2.C4945n;
import v7.C5125p;
import y8.j;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39680a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f39681b;

    public a(i8.b cookieJar) {
        kotlin.jvm.internal.h.e(cookieJar, "cookieJar");
        this.f39681b = cookieJar;
    }

    public static int d(v vVar, int i) {
        String a9 = vVar.f38376y.a("Retry-After");
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
        boolean z6;
        x xVar;
        boolean z9;
        boolean z10;
        v u6;
        SSLSocketFactory sSLSocketFactory;
        w8.c cVar;
        i8.d dVar;
        switch (this.f39680a) {
            case 0:
                boolean z11 = true;
                C4945n c4945n = hVar.f39688e;
                M j6 = c4945n.j();
                t tVar = (t) c4945n.f40494x;
                if (tVar != null) {
                    p b9 = tVar.b();
                    if (b9 != null) {
                        j6.o("Content-Type", b9.f38288a);
                    }
                    long a9 = tVar.a();
                    if (a9 != -1) {
                        j6.o("Content-Length", String.valueOf(a9));
                        ((I1.d) j6.f763w).g("Transfer-Encoding");
                    } else {
                        j6.o("Transfer-Encoding", "chunked");
                        ((I1.d) j6.f763w).g("Content-Length");
                    }
                }
                l lVar = (l) c4945n.f40493w;
                String a10 = lVar.a("Host");
                n url = (n) c4945n.f40491u;
                if (a10 == null) {
                    z6 = false;
                    j6.o("Host", j8.d.i(url, false));
                } else {
                    z6 = false;
                }
                if (lVar.a("Connection") == null) {
                    j6.o("Connection", com.anythink.expressad.foundation.g.f.g.b.f20127c);
                }
                if (lVar.a("Accept-Encoding") == null && lVar.a("Range") == null) {
                    j6.o("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
                } else {
                    z11 = z6;
                }
                i8.b bVar = (i8.b) this.f39681b;
                bVar.getClass();
                kotlin.jvm.internal.h.e(url, "url");
                if (lVar.a("User-Agent") == null) {
                    j6.o("User-Agent", "okhttp/5.2.1");
                }
                C4945n c4945n2 = new C4945n(j6);
                v b10 = hVar.b(c4945n2);
                l lVar2 = b10.f38376y;
                g.b(bVar, (n) c4945n2.f40491u, lVar2);
                u b11 = b10.b();
                b11.f38349a = c4945n2;
                if (z11) {
                    String a11 = lVar2.a("Content-Encoding");
                    if (a11 == null) {
                        a11 = null;
                    }
                    if (com.anythink.expressad.foundation.g.f.g.b.f20128d.equalsIgnoreCase(a11) && g.a(b10) && (xVar = b10.f38377z) != null) {
                        j jVar = new j(xVar.z());
                        I1.d d9 = lVar2.d();
                        d9.g("Content-Encoding");
                        d9.g("Content-Length");
                        b11.f38354f = d9.e().d();
                        String a12 = lVar2.a("Content-Type");
                        if (a12 == null) {
                            a12 = null;
                        }
                        b11.f38355g = new i(a12, -1L, y8.b.b(jVar));
                    }
                }
                return b11.a();
            default:
                C4945n c4945n3 = hVar.f39688e;
                m8.p pVar = hVar.f39684a;
                C5125p suppressed = C5125p.f41221n;
                v vVar = null;
                int i = 0;
                C4945n c4945n4 = c4945n3;
                while (true) {
                    boolean z12 = true;
                    while (true) {
                        pVar.getClass();
                        if (pVar.f39537C != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (pVar) {
                            try {
                                if (pVar.f39539E) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (pVar.f39538D) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z12) {
                            r rVar = pVar.f39544n;
                            l8.d dVar2 = rVar.f38312A;
                            m8.r rVar2 = pVar.f39546v;
                            int i4 = rVar.f38336x;
                            int i6 = rVar.f38337y;
                            int i9 = hVar.f39689f;
                            int i10 = hVar.f39690g;
                            z9 = true;
                            boolean z13 = rVar.f38318e;
                            boolean z14 = rVar.f38319f;
                            n url2 = (n) c4945n4.f40491u;
                            kotlin.jvm.internal.h.e(url2, "url");
                            if (kotlin.jvm.internal.h.a(url2.f38278a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f38327o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                w8.c cVar2 = rVar.f38331s;
                                dVar = rVar.f38332t;
                                cVar = cVar2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            s sVar = new s(dVar2, rVar2, i4, i6, i9, i10, z13, z14, new C4603a(url2.f38281d, url2.f38282e, rVar.f38323k, rVar.f38326n, sSLSocketFactory, cVar, dVar, rVar.f38325m, rVar.f38330r, rVar.f38329q, rVar.f38324l), pVar.f39544n.f38338z, new m8.a(pVar, pVar.f39546v.f39568a, hVar));
                            r rVar3 = pVar.f39544n;
                            pVar.f39550z = rVar3.f38319f ? new m8.l(sVar, rVar3.f38312A) : new C4543G(sVar);
                        } else {
                            z9 = true;
                        }
                        try {
                            if (pVar.f39541G) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b12 = hVar.b(c4945n4).b();
                                b12.f38349a = c4945n4;
                                if (vVar != null) {
                                    try {
                                        u6 = S0.f.u(vVar);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = z9;
                                        pVar.i(z10);
                                        throw th;
                                    }
                                } else {
                                    u6 = null;
                                }
                                b12.f38358k = u6;
                                vVar = b12.a();
                                c4945n4 = b(vVar, pVar.f39537C);
                                if (c4945n4 == null) {
                                    pVar.i(false);
                                    return vVar;
                                }
                                j8.c.a(vVar.f38377z);
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                pVar.i(z9);
                            } catch (IOException e9) {
                                if (!c(e9, pVar, c4945n4)) {
                                    byte[] bArr = j8.c.f38494a;
                                    kotlin.jvm.internal.h.e(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        A8.b.a(e9, (Exception) it.next());
                                    }
                                    throw e9;
                                }
                                kotlin.jvm.internal.h.e(suppressed, "<this>");
                                ArrayList arrayList = new ArrayList(suppressed.size() + 1);
                                arrayList.addAll(suppressed);
                                arrayList.add(e9);
                                pVar.i(true);
                                suppressed = arrayList;
                                z12 = false;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = true;
                        }
                    }
                }
        }
    }

    public C4945n b(v vVar, C3451jv c3451jv) {
        m mVar;
        v vVar2;
        y yVar = c3451jv != null ? c3451jv.b().f39553d : null;
        int i = vVar.f38374w;
        String str = (String) vVar.f38371n.f40492v;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((r) this.f39681b).f38320g.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    v vVar3 = vVar.f38366D;
                    if ((vVar3 == null || vVar3.f38374w != 503) && d(vVar, Integer.MAX_VALUE) == 0) {
                        return vVar.f38371n;
                    }
                } else {
                    if (i == 407) {
                        kotlin.jvm.internal.h.b(yVar);
                        if (yVar.f38382b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((r) this.f39681b).f38325m.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((r) this.f39681b).f38318e && (((vVar2 = vVar.f38366D) == null || vVar2.f38374w != 408) && d(vVar, 0) <= 0)) {
                        return vVar.f38371n;
                    }
                }
            } else if (c3451jv != null && !kotlin.jvm.internal.h.a(((m8.i) c3451jv.f32127w).b().f().f38193h.f38281d, ((f) c3451jv.f32128x).j().g().f38381a.f38193h.f38281d)) {
                q b9 = c3451jv.b();
                synchronized (b9) {
                    b9.f39561m = true;
                }
                return vVar.f38371n;
            }
            return null;
        }
        r rVar = (r) this.f39681b;
        if (rVar.f38321h) {
            String a9 = vVar.f38376y.a("Location");
            if (a9 == null) {
                a9 = null;
            }
            if (a9 != null) {
                C4945n c4945n = vVar.f38371n;
                n nVar = (n) c4945n.f40491u;
                nVar.getClass();
                try {
                    mVar = new m();
                    mVar.c(nVar, a9);
                } catch (IllegalArgumentException unused) {
                    mVar = null;
                }
                n a10 = mVar != null ? mVar.a() : null;
                if (a10 != null) {
                    if (kotlin.jvm.internal.h.a(a10.f38278a, ((n) c4945n.f40491u).f38278a) || rVar.i) {
                        M j6 = c4945n.j();
                        if (X2.a.p(str)) {
                            boolean equals = str.equals("PROPFIND");
                            int i4 = vVar.f38374w;
                            boolean z6 = equals || i4 == 308 || i4 == 307;
                            if (str.equals("PROPFIND") || i4 == 308 || i4 == 307) {
                                j6.p(str, z6 ? (t) c4945n.f40494x : null);
                            } else {
                                j6.p("GET", null);
                            }
                            if (!z6) {
                                ((I1.d) j6.f763w).g("Transfer-Encoding");
                                ((I1.d) j6.f763w).g("Content-Length");
                                ((I1.d) j6.f763w).g("Content-Type");
                            }
                        }
                        if (!j8.d.a((n) c4945n.f40491u, a10)) {
                            ((I1.d) j6.f763w).g("Authorization");
                        }
                        j6.f761u = a10;
                        return new C4945n(j6);
                    }
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, m8.p pVar, C4945n c4945n) {
        boolean z6 = iOException instanceof C4855a;
        if (!((r) this.f39681b).f38318e) {
            return false;
        }
        if ((!z6 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z6) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C3451jv c3451jv = pVar.f39542H;
        if (c3451jv == null || !c3451jv.f32125u) {
            return false;
        }
        m8.i iVar = pVar.f39550z;
        kotlin.jvm.internal.h.b(iVar);
        w b9 = iVar.b();
        C3451jv c3451jv2 = pVar.f39542H;
        return b9.k(c3451jv2 != null ? c3451jv2.b() : null);
    }

    public a(r client) {
        kotlin.jvm.internal.h.e(client, "client");
        this.f39681b = client;
    }
}
