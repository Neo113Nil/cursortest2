package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yx360.design.compose.atoms.inlineNotification.DsInlineNotification$Tone;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ula1 {
    public static final void a(int i, int i2, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(593885584);
        if ((((btsVar.c(i) ? 4 : 2) | i2) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            DsInlineNotification$Tone dsInlineNotification$Tone = DsInlineNotification$Tone.Danger;
            qnm qnmVar = qnm.a;
            f530Var2 = f530Var;
            ut91.b(dsInlineNotification$Tone, ba91.c(xk91.b(), btsVar), ohb1.d(oyh0.folder_add_chat_overflow_notification_title, new Object[]{Integer.valueOf(i)}, btsVar), f530Var2, null, ohb1.e(btsVar, oyh0.folder_add_chat_overflow_notification_subtitle), btsVar, 3142, 176);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(i, f530Var2, i2, 0);
        }
    }

    public static final void b(tls tlsVar, lhj0 lhj0Var, mhj0 mhj0Var, fid fidVar, int i) {
        int i2;
        lhj0 lhj0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1003869767);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lhj0Var2 = lhj0Var;
            i2 |= btsVar.k(lhj0Var2) ? 32 : 16;
        } else {
            lhj0Var2 = lhj0Var;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(mhj0Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n.f(mhj0Var.f, btsVar);
            }
            oz40 oz40Var = (oz40) Q;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new agc0(27, tlsVar, mhj0Var);
                btsVar.o0(Q2);
            }
            d(mhj0Var, (sls) Q2, btsVar, (i2 >> 6) & 14);
            String str = mhj0Var.e;
            g.b(uic.a, !(str == null || evu0.J(str)), null, null, k.f(null, 3), null, wwg.S(1891987847, true, new r5y((Object) tlsVar, (Object) lhj0Var2, oz40Var, (Object) mhj0Var, 15), btsVar), btsVar, 1597446, 22);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(tlsVar, lhj0Var, mhj0Var, i, 7);
        }
    }

    public static final void c(mxq mxqVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        a aVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1005016907);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(mxqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        }
        byte b = 0;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            boolean z = (i2 & 896) == 256;
            int i4 = i2 & 14;
            boolean z2 = z | (i4 == 4);
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new bdp(4, tlsVar2, mxqVar);
                btsVar2.o0(Q2);
            }
            f530 b2 = q791.b(c530.a, zx40Var, null, false, null, null, (sls) Q2, 28);
            boolean z3 = i4 == 4;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new dzm(27, mxqVar);
                btsVar2.o0(Q3);
            }
            f530 b3 = fnq0.b(b2, false, (tls) Q3);
            hts0 hts0Var = mxqVar.g;
            a aVar2 = null;
            if (hts0Var == null) {
                btsVar2.e0(-240954676);
                btsVar2.t(false);
                aVar = null;
            } else {
                btsVar2.e0(-240954675);
                a S = wwg.S(-1031573564, true, new v61(hts0Var, i3, b), btsVar2);
                btsVar2.t(false);
                aVar = S;
            }
            a S2 = wwg.S(748732313, true, new loj(22, mxqVar), btsVar2);
            jvs0 jvs0Var = mxqVar.h;
            if (jvs0Var == null) {
                btsVar2.e0(-239903094);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-239903093);
                aVar2 = wwg.S(296991754, true, new w61(jvs0Var, tlsVar, tlsVar2, i3), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(b3, 0.0f, false, 0.0f, null, aVar, S2, null, null, aVar2, null, oa01.d, false, btsVar, 1572864, 0, 5534);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(mxqVar, tlsVar, tlsVar2, i, 9);
        }
    }

    public static final void d(mhj0 mhj0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1015822237);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(mhj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            slsVar2 = slsVar;
            d17.c(an91.m(c530.a, 12.0f, 0.0f, 2), false, null, null, null, slsVar2, wwg.S(314966913, true, new pdf0(6, mhj0Var), btsVar), btsVar, ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | 1572870, 30);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(mhj0Var, slsVar2, i, 15);
        }
    }

    public static final void e(nhj0 nhj0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(122034670);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nhj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 1000.0f, null, false, null, null, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 8175);
            boolean z2 = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                z = true;
                Q = n.f(!evu0.J(nhj0Var.b), btsVar);
            } else {
                z = true;
            }
            int i4 = 0;
            a S = wwg.S(-732131742, z, new bhj0(tlsVar, nhj0Var, i4), btsVar);
            a S2 = wwg.S(543512206, z, new dhj0(i4, nhj0Var, tlsVar, (oz40) Q), btsVar);
            btsVar = btsVar;
            c.a(null, a, null, false, false, null, null, null, null, null, S, S2, btsVar, 0, 54, 1021);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(nhj0Var, tlsVar, i, 16);
        }
    }

    public static final void f(f530 f530Var, lhj0 lhj0Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        g43 g43Var;
        oz40 oz40Var;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-485987068);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(lhj0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n.f(lhj0Var.c, btsVar);
            }
            oz40 oz40Var2 = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q2;
            so5 so5Var = x4c.G;
            g43 g43Var2 = lr20.c;
            sic a = qic.a(g43Var2, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                g43Var = g43Var2;
                Q3 = new ttm(17, oz40Var2);
                btsVar.o0(Q3);
            } else {
                g43Var = g43Var2;
            }
            f530 b = fnq0.b(c, true, (tls) Q3);
            int i3 = i2 & 112;
            boolean z = (i3 == 32) | ((i2 & 896) == 256);
            Object Q4 = btsVar.Q();
            if (z || Q4 == o430Var) {
                Q4 = new chj0(oz40Var2, tlsVar, lhj0Var);
                btsVar.o0(Q4);
            }
            g43 g43Var3 = g43Var;
            f530 k = an91.k(q791.b(b, zx40Var, null, false, null, null, (sls) Q4, 28), 16.0f);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            sic a3 = qic.a(g43Var3, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            String str = lhj0Var.a;
            mhj0 mhj0Var = lhj0Var.d;
            jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, 0, 0, 32766);
            btsVar = btsVar;
            if (evu0.J(lhj0Var.b)) {
                oz40Var = oz40Var2;
                c530Var = c530Var2;
                btsVar.e0(-993649586);
                btsVar.t(false);
            } else {
                btsVar.e0(-993817110);
                oz40Var = oz40Var2;
                c530Var = c530Var2;
                jeb1.f(lhj0Var.b, an91.o(c530Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 48, 0, 16380);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new teb(20);
                btsVar.o0(Q5);
            }
            ijb1.b(((Boolean) oz40Var.getValue()).booleanValue(), fnq0.a(c530Var, (tls) Q5), null, null, null, null, false, btsVar, 0, HProv.PP_SAME_MEDIA);
            btsVar.t(true);
            if (!((Boolean) oz40Var.getValue()).booleanValue() || mhj0Var == null) {
                tlsVar2 = tlsVar;
                btsVar.e0(-1605473944);
                btsVar.t(false);
            } else {
                btsVar.e0(-1605633470);
                int i4 = ((i2 >> 6) & 14) | i3;
                tlsVar2 = tlsVar;
                b(tlsVar2, lhj0Var, mhj0Var, btsVar, i4);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(f530Var, (Object) lhj0Var, (Object) tlsVar2, i, 4);
        }
    }

    public static ex81 g(ex81 ex81Var, String[] strArr, Map map) {
        int i = 0;
        if (ex81Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (ex81) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                ex81 ex81Var2 = new ex81();
                int length = strArr.length;
                while (i < length) {
                    ex81Var2.a((ex81) map.get(strArr[i]));
                    i++;
                }
                return ex81Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ex81Var.a((ex81) map.get(strArr[0]));
                return ex81Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ex81Var.a((ex81) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ex81Var;
    }
}
