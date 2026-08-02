package defpackage;

import android.net.http.SslCertificate;
import android.util.Log;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class xk91 {
    public static mgv a;

    public static final void a(f530 f530Var, f930 f930Var, sls slsVar, tls tlsVar, fid fidVar, int i) {
        f930 f930Var2 = f930Var;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2099633636);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(f930Var2) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 k = f530Var.k(ljs0.c);
            so5 so5Var = x4c.H;
            sic a2 = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            crb1.c(null, wwg.S(299272105, true, new us4(7, slsVar), btsVar), null, wwg.S(195975911, true, new i0z(f930Var2), btsVar), null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
            x2y x2yVar = new x2y(1.0f, true);
            sic a3 = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, x2yVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            Integer num = f930Var.a;
            btsVar.e0(45916116);
            pa90 a4 = wya1.a(num.intValue(), 0, btsVar);
            btsVar.e0(-1411607277);
            btsVar.t(false);
            c530 c530Var = c530.a;
            o4b1.b(a4, null, c530Var, null, null, 0.0f, null, btsVar, 392, 56);
            ly3.B(c530Var, 16.0f, btsVar, false);
            jeb1.f(f930Var.b, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 0, 0, 16254);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            jeb1.f(f930Var.c, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16254);
            btsVar.t(true);
            f530 k2 = an91.k(c530Var, 8.0f);
            boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new jg0(17);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, k2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                f930Var2 = f930Var;
                tlsVar2 = tlsVar;
                Q2 = new g700(27, tlsVar2, f930Var2);
                btsVar.o0(Q2);
            } else {
                f930Var2 = f930Var;
                tlsVar2 = tlsVar;
            }
            ohb1.b(null, false, null, (sls) Q2, wwg.S(1033522808, true, new ctq(28, f930Var2), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(i, 14, tlsVar2, f530Var, f930Var2, slsVar);
        }
    }

    public static final mgv b() {
        mgv mgvVar = a;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("WarningOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 e = nnm.e(12.0f, 2.0f);
        e.d(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f);
        e.d(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f);
        e.d(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f);
        e.d(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f);
        e.c();
        e.j(12.0f, 4.0f);
        e.d(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f);
        e.d(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f);
        e.d(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f);
        e.d(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f);
        e.c();
        e.j(12.0f, 15.5f);
        e.d(12.828f, 15.5f, 13.5f, 16.172f, 13.5f, 17.0f);
        e.d(13.5f, 17.828f, 12.828f, 18.5f, 12.0f, 18.5f);
        e.d(11.172f, 18.5f, 10.5f, 17.828f, 10.5f, 17.0f);
        e.d(10.5f, 16.172f, 11.172f, 15.5f, 12.0f, 15.5f);
        e.c();
        e.j(13.0f, 14.0f);
        e.f(11.0f);
        e.h(10.75f, 6.0f);
        e.f(13.25f);
        e.h(13.0f, 14.0f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        mgv d = lgvVar.d();
        a = d;
        return d;
    }

    public static final int c(double d) {
        return m810.a((d * 3.6d) * 100.0d) / 100;
    }

    public static void d(tt5 tt5Var, final kne kneVar) {
        xv10 xv10Var;
        rs10 ld2Var = (kneVar == null || (xv10Var = kneVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", ld2Var, obj);
        if (kneVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: ysb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    kne kneVar2 = kneVar;
                    switch (i2) {
                        case 0:
                            SslCertificate.DName dName = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g = Collections.singletonList(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            SslCertificate.DName dName2 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g2 = Collections.singletonList(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            SslCertificate.DName dName3 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g3 = Collections.singletonList(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            SslCertificate.DName dName4 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g4 = Collections.singletonList(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", ld2Var, obj);
        if (kneVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: ysb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            SslCertificate.DName dName = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g = Collections.singletonList(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            SslCertificate.DName dName2 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g2 = Collections.singletonList(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            SslCertificate.DName dName3 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g3 = Collections.singletonList(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            SslCertificate.DName dName4 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g4 = Collections.singletonList(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", ld2Var, obj);
        if (kneVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: ysb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            SslCertificate.DName dName = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g = Collections.singletonList(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            SslCertificate.DName dName2 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g2 = Collections.singletonList(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            SslCertificate.DName dName3 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g3 = Collections.singletonList(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            SslCertificate.DName dName4 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g4 = Collections.singletonList(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", ld2Var, obj);
        if (kneVar == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: ysb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            SslCertificate.DName dName = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g = Collections.singletonList(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            SslCertificate.DName dName2 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g2 = Collections.singletonList(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            SslCertificate.DName dName3 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g3 = Collections.singletonList(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            SslCertificate.DName dName4 = (SslCertificate.DName) ((List) obj2).get(0);
                            try {
                                kneVar2.getClass();
                                g4 = Collections.singletonList(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        }
    }
}
