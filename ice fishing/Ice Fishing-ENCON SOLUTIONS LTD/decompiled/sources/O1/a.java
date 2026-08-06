package O1;

import J1.A;
import J1.C0050a;
import J1.C0051b;
import J1.l;
import J1.m;
import J1.n;
import J1.o;
import J1.p;
import J1.s;
import J1.u;
import J1.v;
import J1.w;
import J1.x;
import J1.y;
import J1.z;
import N1.k;
import Q1.C0078a;
import W1.q;
import i1.AbstractC0252i;
import i1.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1235b;

    public a(C0051b cookieJar) {
        i.e(cookieJar, "cookieJar");
        this.f1235b = cookieJar;
    }

    public static int d(y yVar, int i2) {
        String a2 = y.a(yVar, "Retry-After");
        if (a2 == null) {
            return i2;
        }
        Pattern compile = Pattern.compile("\\d+");
        i.d(compile, "compile(...)");
        if (!compile.matcher(a2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a2);
        i.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // J1.p
    public final y a(g gVar) {
        z zVar;
        List list;
        int i2;
        SSLSocketFactory sSLSocketFactory;
        V1.c cVar;
        J1.e eVar;
        switch (this.f1234a) {
            case 0:
                v vVar = gVar.f1242e;
                u a2 = vVar.a();
                w wVar = vVar.f980d;
                if (wVar != null) {
                    if (wVar.f983a != null) {
                        a2.b("Content-Type", "application/x-protobuf");
                    }
                    long j2 = wVar.f984b;
                    if (j2 != -1) {
                        a2.b("Content-Length", String.valueOf(j2));
                        ((l) a2.f974d).d("Transfer-Encoding");
                    } else {
                        a2.b("Transfer-Encoding", "chunked");
                        ((l) a2.f974d).d("Content-Length");
                    }
                }
                m mVar = vVar.f979c;
                String a3 = mVar.a("Host");
                boolean z2 = false;
                o url = vVar.f977a;
                if (a3 == null) {
                    a2.b("Host", K1.b.v(url, false));
                }
                if (mVar.a("Connection") == null) {
                    a2.b("Connection", "Keep-Alive");
                }
                if (mVar.a("Accept-Encoding") == null && mVar.a("Range") == null) {
                    a2.b("Accept-Encoding", "gzip");
                    z2 = true;
                }
                C0051b c0051b = (C0051b) this.f1235b;
                c0051b.getClass();
                i.e(url, "url");
                if (mVar.a("User-Agent") == null) {
                    a2.b("User-Agent", "okhttp/4.11.0");
                }
                y b2 = gVar.b(a2.a());
                m mVar2 = b2.f1005f;
                f.b(c0051b, url, mVar2);
                x b3 = b2.b();
                b3.f987a = vVar;
                if (z2 && "gzip".equalsIgnoreCase(y.a(b2, "Content-Encoding")) && f.a(b2) && (zVar = b2.f1006g) != null) {
                    W1.l lVar = new W1.l(zVar.c());
                    l c2 = mVar2.c();
                    c2.d("Content-Encoding");
                    c2.d("Content-Length");
                    b3.f992f = c2.b().c();
                    y.a(b2, "Content-Type");
                    b3.f993g = new z(-1L, new q(lVar), 1);
                }
                return b3.a();
            default:
                v vVar2 = gVar.f1242e;
                N1.i iVar = gVar.f1238a;
                List list2 = r.f3416a;
                y yVar = null;
                int i3 = 0;
                v request = vVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        iVar.getClass();
                        i.e(request, "request");
                        if (iVar.f1191i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.f1193k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f1192j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            N1.l lVar2 = iVar.f1185c;
                            o oVar = request.f977a;
                            boolean z4 = oVar.f912i;
                            s sVar = iVar.f1183a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = sVar.f953o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                V1.c cVar2 = sVar.f957s;
                                eVar = sVar.t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            list = list2;
                            i2 = i3;
                            iVar.f1189g = new N1.f(lVar2, new C0050a(oVar.f907d, oVar.f908e, sVar.f949k, sVar.f952n, sSLSocketFactory, cVar, eVar, sVar.f951m, sVar.f956r, sVar.f955q, sVar.f950l), iVar);
                        } else {
                            list = list2;
                            i2 = i3;
                        }
                        try {
                            if (iVar.f1195m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                y b4 = gVar.b(request);
                                if (yVar != null) {
                                    x b5 = b4.b();
                                    x b6 = yVar.b();
                                    b6.f993g = null;
                                    y a4 = b6.a();
                                    if (a4.f1006g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    b5.f996j = a4;
                                    b4 = b5.a();
                                }
                                yVar = b4;
                                request = b(yVar, iVar.f1191i);
                                if (request == null) {
                                    iVar.d(false);
                                    return yVar;
                                }
                                z zVar2 = yVar.f1006g;
                                if (zVar2 != null) {
                                    K1.b.d(zVar2);
                                }
                                i3 = i2 + 1;
                                if (i3 > 20) {
                                    throw new ProtocolException(i.h(Integer.valueOf(i3), "Too many follow-up requests: "));
                                }
                                iVar.d(true);
                                list2 = list;
                            } catch (N1.m e2) {
                                List list3 = list;
                                if (!c(e2.f1222b, iVar, request, false)) {
                                    IOException iOException = e2.f1221a;
                                    K1.b.z(iOException, list3);
                                    throw iOException;
                                }
                                list2 = AbstractC0252i.M(list3, e2.f1221a);
                                iVar.d(true);
                                z3 = false;
                                i3 = i2;
                            } catch (IOException e3) {
                                if (!c(e3, iVar, request, !(e3 instanceof C0078a))) {
                                    K1.b.z(e3, list);
                                    throw e3;
                                }
                                list2 = AbstractC0252i.M(list, e3);
                                iVar.d(true);
                                i3 = i2;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            iVar.d(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public v b(y yVar, N1.e eVar) {
        k kVar;
        String a2;
        n nVar;
        A a3 = (eVar == null || (kVar = (k) eVar.f1171e) == null) ? null : kVar.f1199b;
        int i2 = yVar.f1003d;
        String str = yVar.f1000a.f978b;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((s) this.f1235b).f945g.getClass();
                return null;
            }
            if (i2 == 421) {
                if (eVar == null || i.a(((N1.f) eVar.f1169c).f1173b.f820h.f907d, ((k) eVar.f1171e).f1199b.f803a.f820h.f907d)) {
                    return null;
                }
                k kVar2 = (k) eVar.f1171e;
                synchronized (kVar2) {
                    kVar2.f1208k = true;
                }
                return yVar.f1000a;
            }
            if (i2 == 503) {
                y yVar2 = yVar.f1009j;
                if ((yVar2 == null || yVar2.f1003d != 503) && d(yVar, Integer.MAX_VALUE) == 0) {
                    return yVar.f1000a;
                }
                return null;
            }
            if (i2 == 407) {
                i.b(a3);
                if (a3.f804b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((s) this.f1235b).f951m.getClass();
                return null;
            }
            if (i2 == 408) {
                if (!((s) this.f1235b).f944f) {
                    return null;
                }
                y yVar3 = yVar.f1009j;
                if ((yVar3 == null || yVar3.f1003d != 408) && d(yVar, 0) <= 0) {
                    return yVar.f1000a;
                }
                return null;
            }
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        s sVar = (s) this.f1235b;
        if (!sVar.f946h || (a2 = y.a(yVar, "Location")) == null) {
            return null;
        }
        v vVar = yVar.f1000a;
        o oVar = vVar.f977a;
        oVar.getClass();
        try {
            nVar = new n();
            nVar.c(oVar, a2);
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        o a4 = nVar == null ? null : nVar.a();
        if (a4 == null) {
            return null;
        }
        if (!i.a(a4.f904a, vVar.f977a.f904a) && !sVar.f947i) {
            return null;
        }
        u a5 = vVar.a();
        if (R1.l.u(str)) {
            boolean equals = str.equals("PROPFIND");
            int i3 = yVar.f1003d;
            boolean z2 = equals || i3 == 308 || i3 == 307;
            if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                a5.c(str, z2 ? vVar.f980d : null);
            } else {
                a5.c("GET", null);
            }
            if (!z2) {
                ((l) a5.f974d).d("Transfer-Encoding");
                ((l) a5.f974d).d("Content-Length");
                ((l) a5.f974d).d("Content-Type");
            }
        }
        if (!K1.b.a(vVar.f977a, a4)) {
            ((l) a5.f974d).d("Authorization");
        }
        a5.f973c = a4;
        return a5.a();
    }

    public boolean c(IOException iOException, N1.i iVar, v vVar, boolean z2) {
        N1.o oVar;
        boolean i2;
        k kVar;
        if (!((s) this.f1235b).f944f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        N1.f fVar = iVar.f1189g;
        i.b(fVar);
        int i3 = fVar.f1177f;
        if (i3 == 0 && fVar.f1178g == 0 && fVar.f1179h == 0) {
            i2 = false;
        } else {
            if (fVar.f1180i == null) {
                A a2 = null;
                if (i3 <= 1 && fVar.f1178g <= 1 && fVar.f1179h <= 0 && (kVar = fVar.f1174c.f1190h) != null) {
                    synchronized (kVar) {
                        if (kVar.f1209l == 0) {
                            if (K1.b.a(kVar.f1199b.f803a.f820h, fVar.f1173b.f820h)) {
                                a2 = kVar.f1199b;
                            }
                        }
                    }
                }
                if (a2 != null) {
                    fVar.f1180i = a2;
                } else {
                    N1.n nVar = fVar.f1175d;
                    if ((nVar == null || !nVar.a()) && (oVar = fVar.f1176e) != null) {
                        i2 = oVar.i();
                    }
                }
            }
            i2 = true;
        }
        return i2;
    }

    public a(s client) {
        i.e(client, "client");
        this.f1235b = client;
    }
}
