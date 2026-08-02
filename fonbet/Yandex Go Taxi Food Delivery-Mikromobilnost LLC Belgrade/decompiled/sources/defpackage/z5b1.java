package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.io.IOException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class z5b1 {
    public static final void a(k611 k611Var, f530 f530Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-633285683);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(k611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(1577779407);
            c(k611Var, f530Var, tlsVar, null, btsVar, (i2 & HProv.PP_DELETE_SAVED_PASSWD) | ((i2 >> 3) & 896));
            btsVar.t(false);
        } else {
            btsVar.e0(1577854334);
            b(k611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) k611Var, (Object) f530Var, z, tlsVar, i, 4);
        }
    }

    public static final void b(final k611 k611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1279547991);
        final int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(k611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 b = ljs0.b(ljs0.c(f530Var, 1.0f), 0.0f, SlotSize.XS.getSize(), 1);
            boolean e = btsVar.e(k611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new j24(22, k611Var);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(b, (tls) Q), wwg.S(-1901630637, true, new zls() { // from class: ak5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    k611 k611Var2 = k611Var;
                    switch (i7) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 b2 = ljs0.b(ljs0.q(c530.a, SlotSize.L.getSize()), 0.0f, SlotSize.XS.getSize(), 1);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, b2);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                k611Var2.getClass();
                                xtb1.a(null, k611Var2.c, null, null, btsVar2, 0, 12);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                qgy.b(k611Var2.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(1 & intValue3, (intValue3 & 17) != 16)) {
                                ytb1.a(0, btsVar4, null, k611Var2.b);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(-532910536, true, new zls() { // from class: ak5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i6;
                    zy11 zy11Var = zy11.a;
                    k611 k611Var2 = k611Var;
                    switch (i7) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 b2 = ljs0.b(ljs0.q(c530.a, SlotSize.L.getSize()), 0.0f, SlotSize.XS.getSize(), 1);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, b2);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                k611Var2.getClass();
                                xtb1.a(null, k611Var2.c, null, null, btsVar2, 0, 12);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                qgy.b(k611Var2.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(1 & intValue3, (intValue3 & 17) != 16)) {
                                ytb1.a(0, btsVar4, null, k611Var2.b);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, wwg.S(-1267437250, true, new zls() { // from class: ak5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i3;
                    zy11 zy11Var = zy11.a;
                    k611 k611Var2 = k611Var;
                    switch (i7) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 b2 = ljs0.b(ljs0.q(c530.a, SlotSize.L.getSize()), 0.0f, SlotSize.XS.getSize(), 1);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, b2);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                k611Var2.getClass();
                                xtb1.a(null, k611Var2.c, null, null, btsVar2, 0, 12);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                qgy.b(k611Var2.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(1 & intValue3, (intValue3 & 17) != 16)) {
                                ytb1.a(0, btsVar4, null, k611Var2.b);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(k611Var, f530Var, i, i4);
        }
    }

    public static final void c(k611 k611Var, f530 f530Var, tls tlsVar, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        bts btsVar;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1360459827);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(k611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                ety0Var3 = xya1.d(btsVar2).f.c;
            } else {
                btsVar2.Y();
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            String str = k611Var.d;
            String str2 = k611Var.f;
            boolean k = btsVar2.k(str) | btsVar2.k(str2);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                String str3 = k611Var.d;
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str2.length() <= 0) {
                    str2 = null;
                }
                Q = a.X(j73.A(new String[]{str3, str2}), ". ", null, null, null, 62);
                btsVar2.o0(Q);
            }
            String str4 = (String) Q;
            boolean c = hja1.c(btsVar2);
            String str5 = k611Var.b;
            boolean k2 = btsVar2.k(str4);
            Object Q2 = btsVar2.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new h0(str4, 19);
                btsVar2.o0(Q2);
            }
            f530 b = fnq0.b(f530Var, true, (tls) Q2);
            e3d.a.getClass();
            btsVar = btsVar2;
            a5l0.d(str5, b, 0.0f, 0.0f, null, 0.0f, ety0Var3, null, e3d.b, wwg.S(-41916963, true, new r2z0(k611Var, ety0Var3, c, tlsVar2, 3), btsVar2), btsVar, 906166272, 156);
            ety0Var2 = ety0Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) k611Var, tlsVar, (Object) f530Var, (Object) ety0Var2, i, 9);
        }
    }

    public static final osv d(c cVar, float f, float f2, nsv nsvVar, String str, fid fidVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        return e(cVar, valueOf, valueOf2, gtq0.f, nsvVar, str, fidVar, (i & 1022) | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
    }

    public static final osv e(c cVar, Number number, Number number2, gl11 gl11Var, nsv nsvVar, String str, fid fidVar, int i, int i2) {
        c cVar2;
        Number number3;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            cVar2 = cVar;
            osv osvVar = new osv(cVar2, number, number2, gl11Var, nsvVar);
            number3 = number2;
            btsVar.o0(osvVar);
            Q = osvVar;
        } else {
            cVar2 = cVar;
            number3 = number2;
        }
        osv osvVar2 = (osv) Q;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && btsVar.e(number)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && btsVar.e(number3)) || (i & 384) == 256);
        if ((((57344 & i) ^ HProv.ALG_CLASS_DATA_ENCRYPT) <= 16384 || !btsVar.e(nsvVar)) && (i & HProv.ALG_CLASS_DATA_ENCRYPT) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object Q2 = btsVar.Q();
        if (z3 || Q2 == o430Var) {
            jo0 jo0Var = new jo0(number, osvVar2, number3, nsvVar, 16);
            btsVar.o0(jo0Var);
            Q2 = jo0Var;
        }
        zpn.i((sls) Q2, btsVar);
        boolean e = btsVar.e(cVar2);
        Object Q3 = btsVar.Q();
        if (e || Q3 == o430Var) {
            Q3 = new mgu(7, cVar2, osvVar2);
            btsVar.o0(Q3);
        }
        zpn.a(osvVar2, (tls) Q3, btsVar);
        return osvVar2;
    }

    public static oqp0 f(String str, String str2, String str3, Throwable th) {
        String str4;
        if (th instanceof SSLPeerUnverifiedException) {
            str4 = "Certificate pinning failure";
        } else if (th instanceof SSLHandshakeException) {
            str4 = "Handshake failed";
            if (!d6b1.a("Handshake failed", th)) {
                str4 = "Chain validation failed";
                if (!d6b1.a("Chain validation failed", th)) {
                    str4 = "Unacceptable certificate";
                    if (!d6b1.a("Unacceptable certificate", th)) {
                        str4 = "CertPathValidatorException";
                        if (!d6b1.a("CertPathValidatorException", th)) {
                            str4 = "Connection closed by peer";
                            if (!d6b1.a("Connection closed by peer", th)) {
                                str4 = "connection closed";
                                if (!d6b1.a("connection closed", th)) {
                                    str4 = "SSLHandshakeException";
                                }
                            }
                        }
                    }
                }
            }
        } else if (th instanceof SSLException) {
            str4 = "Unable to parse TLS packet header";
            if (!d6b1.a("Unable to parse TLS packet header", th)) {
                str4 = "SSL Failure";
            }
        } else {
            str4 = th instanceof IOException ? "Connection Errors" : "Unknown Exception";
        }
        return new oqp0(th, str, str4, str2, str3, th.getMessage());
    }

    public static final c g(String str, fid fidVar, int i) {
        if ((i & 1) != 0) {
            str = "InfiniteTransition";
        }
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = new c(str);
            btsVar.o0(Q);
        }
        c cVar = (c) Q;
        cVar.a(btsVar, 0);
        return cVar;
    }
}
