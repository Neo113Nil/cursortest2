package com.anythink.core.common.n.b.a.c;

import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15068a = 20;

    /* renamed from: b, reason: collision with root package name */
    private final z f15069b;

    public j(z zVar) {
        this.f15069b = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0103, code lost:
    
        if (r8.equals("HEAD") == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    @Override // com.anythink.core.common.n.b.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final af a(w.a aVar) {
        com.anythink.core.common.n.b.a.b.c a9;
        ah a10;
        ad adVar;
        String a11;
        v c9;
        ad a12 = aVar.a();
        g gVar = (g) aVar;
        com.anythink.core.common.n.b.a.b.j g4 = gVar.g();
        int i = 0;
        af afVar = null;
        while (true) {
            g4.a(a12);
            if (g4.j()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    af a13 = gVar.a(a12, g4, null);
                    if (afVar != null) {
                        a13 = a13.h().c(afVar.h().a((ag) null).a()).a();
                    }
                    afVar = a13;
                    a9 = com.anythink.core.common.n.b.a.a.f14869a.a(afVar);
                    a10 = a9 != null ? a9.a().a() : null;
                } catch (com.anythink.core.common.n.b.a.b.h e9) {
                    if (!a(e9.b(), g4, false, a12)) {
                        throw e9.a();
                    }
                } catch (IOException e10) {
                    if (!a(e10, g4, !(e10 instanceof com.anythink.core.common.n.b.a.e.a), a12)) {
                        throw e10;
                    }
                }
                if (afVar == null) {
                    throw new IllegalStateException();
                }
                int c10 = afVar.c();
                String b9 = afVar.a().b();
                if (c10 == 307 || c10 == 308) {
                    if (!b9.equals("GET")) {
                    }
                    if (this.f15069b.o() && (a11 = afVar.a("Location")) != null && (c9 = afVar.a().a().c(a11)) != null && (c9.b().equals(afVar.a().a().b()) || this.f15069b.n())) {
                        ad.a e11 = afVar.a().e();
                        if (f.c(b9)) {
                            boolean equals = b9.equals("PROPFIND");
                            if (b9.equals("PROPFIND")) {
                                e11.a(b9, equals ? afVar.a().d() : null);
                            } else {
                                e11.a("GET", (ae) null);
                            }
                            if (!equals) {
                                e11.b("Transfer-Encoding");
                                e11.b("Content-Length");
                                e11.b("Content-Type");
                            }
                        }
                        if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c9)) {
                            e11.b("Authorization");
                        }
                        adVar = e11.a(c9).b();
                    }
                    adVar = null;
                } else if (c10 == 401) {
                    adVar = this.f15069b.k().authenticate(a10, afVar);
                } else if (c10 == 503) {
                    if ((afVar.j() == null || afVar.j().c() != 503) && a(afVar, Integer.MAX_VALUE) == 0) {
                        adVar = afVar.a();
                    }
                    adVar = null;
                } else if (c10 != 407) {
                    if (c10 != 408) {
                        switch (c10) {
                            case 300:
                            case BaseATView.a.f9775L /* 301 */:
                            case 302:
                            case BaseATView.a.f9777N /* 303 */:
                                if (this.f15069b.o()) {
                                    ad.a e112 = afVar.a().e();
                                    if (f.c(b9)) {
                                    }
                                    if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c9)) {
                                    }
                                    adVar = e112.a(c9).b();
                                    break;
                                }
                                break;
                            default:
                                adVar = null;
                                break;
                        }
                    } else if (this.f15069b.p()) {
                        afVar.a().d();
                        if ((afVar.j() == null || afVar.j().c() != 408) && a(afVar, 0) <= 0) {
                            adVar = afVar.a();
                        }
                    }
                    adVar = null;
                } else {
                    if ((a10 != null ? a10.b() : this.f15069b.c()).type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    adVar = this.f15069b.l().authenticate(a10, afVar);
                }
                if (adVar == null) {
                    if (a9 != null && a9.b()) {
                        g4.c();
                    }
                    return afVar;
                }
                adVar.d();
                com.anythink.core.common.n.b.a.c.a(afVar.g());
                if (g4.h()) {
                    a9.i();
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException("Too many follow-up requests: ".concat(String.valueOf(i)));
                }
                a12 = adVar;
            } finally {
                g4.f();
            }
        }
    }

    private boolean a(IOException iOException, com.anythink.core.common.n.b.a.b.j jVar, boolean z3, ad adVar) {
        if (this.f15069b.p()) {
            return !(z3 && a(iOException, adVar)) && a(iOException, z3) && jVar.g();
        }
        return false;
    }

    private static boolean a(IOException iOException, ad adVar) {
        adVar.d();
        return iOException instanceof FileNotFoundException;
    }

    private static boolean a(IOException iOException, boolean z3) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z3 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bd, code lost:
    
        if (r1.equals("HEAD") == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ad a(af afVar, ah ahVar) {
        String a9;
        v c9;
        Proxy c10;
        if (afVar != null) {
            int c11 = afVar.c();
            String b9 = afVar.a().b();
            if (c11 == 307 || c11 == 308) {
                if (!b9.equals("GET")) {
                }
                if (this.f15069b.o() && (a9 = afVar.a("Location")) != null && (c9 = afVar.a().a().c(a9)) != null && (c9.b().equals(afVar.a().a().b()) || this.f15069b.n())) {
                    ad.a e9 = afVar.a().e();
                    if (f.c(b9)) {
                        boolean equals = b9.equals("PROPFIND");
                        if (!b9.equals("PROPFIND")) {
                            e9.a("GET", (ae) null);
                        } else {
                            e9.a(b9, equals ? afVar.a().d() : null);
                        }
                        if (!equals) {
                            e9.b("Transfer-Encoding");
                            e9.b("Content-Length");
                            e9.b("Content-Type");
                        }
                    }
                    if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c9)) {
                        e9.b("Authorization");
                    }
                    return e9.a(c9).b();
                }
                return null;
            }
            if (c11 == 401) {
                return this.f15069b.k().authenticate(ahVar, afVar);
            }
            if (c11 != 503) {
                if (c11 == 407) {
                    if (ahVar != null) {
                        c10 = ahVar.b();
                    } else {
                        c10 = this.f15069b.c();
                    }
                    if (c10.type() == Proxy.Type.HTTP) {
                        return this.f15069b.l().authenticate(ahVar, afVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (c11 == 408) {
                    if (this.f15069b.p()) {
                        afVar.a().d();
                        if ((afVar.j() == null || afVar.j().c() != 408) && a(afVar, 0) <= 0) {
                            return afVar.a();
                        }
                    }
                } else {
                    switch (c11) {
                        case 300:
                        case BaseATView.a.f9775L /* 301 */:
                        case 302:
                        case BaseATView.a.f9777N /* 303 */:
                            if (this.f15069b.o()) {
                                ad.a e92 = afVar.a().e();
                                if (f.c(b9)) {
                                }
                                if (!com.anythink.core.common.n.b.a.c.a(afVar.a().a(), c9)) {
                                }
                                return e92.a(c9).b();
                            }
                            break;
                        default:
                            return null;
                    }
                }
            } else if ((afVar.j() == null || afVar.j().c() != 503) && a(afVar, Integer.MAX_VALUE) == 0) {
                return afVar.a();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    private static int a(af afVar, int i) {
        String a9 = afVar.a("Retry-After");
        if (a9 == null) {
            return i;
        }
        if (a9.matches("\\d+")) {
            return Integer.valueOf(a9).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
