package defpackage;

import android.net.http.SslCertificate;
import android.util.Log;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.a;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tk91 {
    public static au2 a;
    public static au2 b;

    public static final void a(final aa30 aa30Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2103603193);
        int i2 = (btsVar.k(aa30Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 d = i9a1.d(i9a1.f(ljs0.c));
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            s8d.a.getClass();
            final int i4 = 0;
            crb1.c(null, s8d.b, null, null, null, null, null, btsVar, 48, HProv.PP_DELETE_KEYSET);
            ydb1.a(null, null, wwg.S(153816334, true, new zls() { // from class: e930
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    aa30 aa30Var2 = aa30Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                String str = aa30Var2.a;
                                if (str == null) {
                                    str = "";
                                }
                                jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).e.d, btsVar2, 0, 0, 16382);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                btsVar3.e0(-379404206);
                                hk2 hk2Var = new hk2(0);
                                int h = hk2Var.h(xya1.e(btsVar3).g.a.a);
                                try {
                                    hk2Var.d(aa30Var2.b + " ");
                                    hk2Var.g(h);
                                    h = hk2Var.h(xya1.e(btsVar3).g.b.a);
                                    try {
                                        hk2Var.a.append((CharSequence) aa30Var2.c);
                                        hk2Var.g(h);
                                        kk2 i6 = hk2Var.i();
                                        btsVar3.t(false);
                                        jeb1.d(i6, null, null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, null, btsVar3, 0, 0, 65534);
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, null, null, false, btsVar, 384, 251);
            ydb1.a(null, null, wwg.S(-1309890555, true, new zls() { // from class: e930
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    aa30 aa30Var2 = aa30Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                String str = aa30Var2.a;
                                if (str == null) {
                                    str = "";
                                }
                                jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).e.d, btsVar2, 0, 0, 16382);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                btsVar3.e0(-379404206);
                                hk2 hk2Var = new hk2(0);
                                int h = hk2Var.h(xya1.e(btsVar3).g.a.a);
                                try {
                                    hk2Var.d(aa30Var2.b + " ");
                                    hk2Var.g(h);
                                    h = hk2Var.h(xya1.e(btsVar3).g.b.a);
                                    try {
                                        hk2Var.a.append((CharSequence) aa30Var2.c);
                                        hk2Var.g(h);
                                        kk2 i6 = hk2Var.i();
                                        btsVar3.t(false);
                                        jeb1.d(i6, null, null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, null, btsVar3, 0, 0, 65534);
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, x4c.D, SlotSize.S, false, btsVar, 1769856, ModuleDescriptor.MODULE_VERSION);
            btsVar = btsVar;
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            String str = aa30Var.i;
            Integer num = aa30Var.d;
            boolean z = aa30Var.k;
            String str2 = aa30Var.l;
            int i5 = i2 & 112;
            boolean z2 = i5 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new adp(10, tlsVar);
                btsVar.o0(Q);
            }
            tls tlsVar2 = (tls) Q;
            if (i5 == 32) {
                i4 = 1;
            }
            Object Q2 = btsVar.Q();
            if (i4 != 0 || Q2 == o430Var) {
                Q2 = new adp(11, tlsVar);
                btsVar.o0(Q2);
            }
            a.d(str, num, z, str2, tlsVar2, (tls) Q2, m, btsVar, 12583296);
            da30 da30Var = aa30Var.m;
            String str3 = aa30Var.h;
            if (str3 == null) {
                str3 = "";
            }
            b(da30Var, str3, aa30Var.j, tlsVar, btsVar, (i2 << 6) & 7168);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(aa30Var, tlsVar, i, 24);
        }
    }

    public static final void b(da30 da30Var, String str, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-300242110);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(da30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 l = an91.l(c530Var, 16.0f, 32.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
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
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            String str2 = da30Var.a;
            jeb1.f(str2 == null ? "" : str2, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 0, 0, 16382);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            String str3 = da30Var.b;
            String str4 = str3 != null ? str3 : "";
            boolean z2 = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new ft20(9, da30Var);
                btsVar.o0(Q);
            }
            jeb1.f(str4, fnq0.b(c530Var, false, (tls) Q), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 384, 0, 16376);
            btsVar = btsVar;
            int i3 = 1;
            n.y(btsVar, true, c530Var, 8.0f, btsVar);
            ButtonSize buttonSize = ButtonSize.S;
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            boolean z3 = (i2 & 7168) == 2048;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new kiu(14, tlsVar);
                btsVar.o0(Q2);
            }
            d17.c(null, z, buttonSize, buttonStyle, null, (sls) Q2, wwg.S(435846100, true, new kvx0(str, i3), btsVar), btsVar, ((i2 >> 3) & 112) | 1576320, 17);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) da30Var, (Object) str, z, tlsVar, i, 16);
        }
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("DotL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(12.0f, 19.0f);
        e.b(7.0f, 7.0f, true, false, 0.0f, -14.0f);
        e.b(7.0f, 7.0f, false, false, 0.0f, 14.0f);
        e.k(0.0f, -3.0f);
        e.b(4.0f, 4.0f, true, false, 0.0f, -8.0f);
        e.b(4.0f, 4.0f, false, false, 0.0f, 8.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final au2 d() {
        au2 au2Var = b;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(8.83f, 3.0f);
        uq90Var.g(6.34f);
        uq90Var.b(2.0f, 2.0f, false, true, 1.42f, 0.59f);
        uq90Var.h(20.4f, 7.4f);
        uq90Var.b(2.0f, 2.0f, false, true, 0.6f, 1.43f);
        uq90Var.p(6.34f);
        uq90Var.b(2.0f, 2.0f, false, true, -0.59f, 1.42f);
        uq90Var.h(16.6f, 20.4f);
        uq90Var.b(2.0f, 2.0f, false, true, -1.42f, 0.59f);
        uq90Var.h(8.83f, 20.99f);
        uq90Var.b(2.0f, 2.0f, false, true, -1.42f, -0.59f);
        uq90Var.h(3.6f, 16.6f);
        uq90Var.b(2.0f, 2.0f, false, true, -0.6f, -1.43f);
        uq90Var.h(3.0f, 8.83f);
        uq90Var.b(2.0f, 2.0f, false, true, 0.59f, -1.42f);
        uq90Var.h(7.4f, 3.6f);
        uq90Var.a(2.0f, 2.0f, false, true, 8.83f, 3.0f);
        uq90Var.j(11.0f, 14.0f);
        uq90Var.i(-0.25f, -8.0f);
        uq90Var.g(2.5f);
        uq90Var.h(13.0f, 14.0f);
        uq90Var.c();
        uq90Var.j(13.5f, 17.0f);
        uq90Var.b(1.5f, 1.5f, true, true, -3.0f, 0.0f);
        uq90Var.b(1.5f, 1.5f, false, true, 3.0f, 0.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        b = a2;
        return a2;
    }

    public static void e(tt5 tt5Var, final o2c o2cVar) {
        xv10 xv10Var;
        rs10 ld2Var = (o2cVar == null || (xv10Var = o2cVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", ld2Var, obj);
        if (o2cVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: xsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i2 = i;
                    o2c o2cVar2 = o2cVar;
                    switch (i2) {
                        case 0:
                            SslCertificate sslCertificate = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g = Collections.singletonList(sslCertificate.getIssuedBy());
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
                            SslCertificate sslCertificate2 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g2 = Collections.singletonList(sslCertificate2.getIssuedTo());
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
                            SslCertificate sslCertificate3 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                g3 = Collections.singletonList(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            SslCertificate sslCertificate4 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                g4 = Collections.singletonList(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            SslCertificate sslCertificate5 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.a.getClass();
                                g5 = Collections.singletonList(sslCertificate5.getX509Certificate());
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", ld2Var, obj);
        if (o2cVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: xsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i2;
                    o2c o2cVar2 = o2cVar;
                    switch (i22) {
                        case 0:
                            SslCertificate sslCertificate = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g = Collections.singletonList(sslCertificate.getIssuedBy());
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
                            SslCertificate sslCertificate2 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g2 = Collections.singletonList(sslCertificate2.getIssuedTo());
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
                            SslCertificate sslCertificate3 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                g3 = Collections.singletonList(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            SslCertificate sslCertificate4 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                g4 = Collections.singletonList(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            SslCertificate sslCertificate5 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.a.getClass();
                                g5 = Collections.singletonList(sslCertificate5.getX509Certificate());
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", ld2Var, obj);
        if (o2cVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: xsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i3;
                    o2c o2cVar2 = o2cVar;
                    switch (i22) {
                        case 0:
                            SslCertificate sslCertificate = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g = Collections.singletonList(sslCertificate.getIssuedBy());
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
                            SslCertificate sslCertificate2 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g2 = Collections.singletonList(sslCertificate2.getIssuedTo());
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
                            SslCertificate sslCertificate3 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                g3 = Collections.singletonList(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            SslCertificate sslCertificate4 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                g4 = Collections.singletonList(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            SslCertificate sslCertificate5 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.a.getClass();
                                g5 = Collections.singletonList(sslCertificate5.getX509Certificate());
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", ld2Var, obj);
        if (o2cVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: xsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i4;
                    o2c o2cVar2 = o2cVar;
                    switch (i22) {
                        case 0:
                            SslCertificate sslCertificate = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g = Collections.singletonList(sslCertificate.getIssuedBy());
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
                            SslCertificate sslCertificate2 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g2 = Collections.singletonList(sslCertificate2.getIssuedTo());
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
                            SslCertificate sslCertificate3 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                g3 = Collections.singletonList(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            SslCertificate sslCertificate4 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                g4 = Collections.singletonList(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            SslCertificate sslCertificate5 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.a.getClass();
                                g5 = Collections.singletonList(sslCertificate5.getX509Certificate());
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", ld2Var, obj);
        if (o2cVar == null) {
            m2vVar5.G(null);
        } else {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: xsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i5;
                    o2c o2cVar2 = o2cVar;
                    switch (i22) {
                        case 0:
                            SslCertificate sslCertificate = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g = Collections.singletonList(sslCertificate.getIssuedBy());
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
                            SslCertificate sslCertificate2 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                g2 = Collections.singletonList(sslCertificate2.getIssuedTo());
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
                            SslCertificate sslCertificate3 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                g3 = Collections.singletonList(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                        case 3:
                            SslCertificate sslCertificate4 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                g4 = Collections.singletonList(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            SslCertificate sslCertificate5 = (SslCertificate) ((List) obj2).get(0);
                            try {
                                o2cVar2.a.getClass();
                                g5 = Collections.singletonList(sslCertificate5.getX509Certificate());
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        }
    }
}
