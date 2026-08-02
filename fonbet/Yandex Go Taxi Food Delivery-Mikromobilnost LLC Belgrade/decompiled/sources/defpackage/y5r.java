package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.d6r;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class y5r {
    public static final void a(String str, boolean z, boolean z2, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(502891513);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.a(z2) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            dlb1.a(ljs0.e(ljs0.c(c530Var, 1.0f), 48.0f), str, null, 0L, false, z, lzr.D, ((el51) btsVar.m(gl51.a)).c(), null, iib.d, null, slsVar, btsVar, ((i2 << 3) & 112) | 1572870 | ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), (i2 >> 6) & 112, 1308);
            btsVar = btsVar;
            if (z2) {
                btsVar.e0(795728553);
                btsVar.t(false);
            } else {
                btsVar.e0(795608428);
                dk91.a(1.0f, 390, 2, 0L, btsVar, an91.m(c530Var, 8.0f, 0.0f, 2));
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0(str, z, z2, slsVar, i);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void b(int r31, defpackage.fid r32, defpackage.tls r33, java.lang.String r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5r.b(int, fid, tls, java.lang.String, java.util.List):void");
    }

    public static final void c(d6r d6rVar, tls tlsVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2130455177);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(d6rVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = m4m0.b(ljs0.c(c530.a, 1.0f), ((el51) btsVar.m(gl51.a)).c(), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
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
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            d(d6rVar.a, btsVar, 0);
            f530 u = pw91.u(ljs0.c(new x2y(1.0f, true), 1.0f), pw91.o(btsVar), 14);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, u);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(95210187);
            for (d6r.b bVar : d6rVar.c) {
                b((i2 << 3) & 896, btsVar, tlsVar, bVar.a, bVar.b);
            }
            btsVar.t(false);
            btsVar.t(true);
            e(d6rVar.b, slsVar, btsVar, (i2 >> 3) & 112);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm((Object) d6rVar, (Object) tlsVar, slsVar, i, 8);
        }
    }

    public static final void d(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1461006189);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 o = an91.o(c530.a, 0.0f, 16.0f, 0.0f, 12.0f, 5);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new xvq(4);
                btsVar.o0(Q);
            }
            web1.c(fnq0.b(o, false, (tls) Q), 48.0f, false, 0.0f, null, null, wwg.S(-1818023049, true, new q0(str, 26), btsVar), null, null, null, null, null, false, btsVar, 1572912, 0, 8124);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 27);
        }
    }

    public static final void e(String str, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-135577336);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a.a(slsVar, ljs0.e(an91.l(ljs0.c(c530.a, 1.0f), 8.0f, 16.0f), 56.0f), ((YandexShapes) btsVar.m(qm51.a)).b(), ((el51) btsVar.m(gl51.a)).f(), 0L, null, false, null, null, null, wwg.S(-723696527, true, new le(str, 25), btsVar), btsVar, (i2 >> 3) & 14, 4080);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(str, slsVar, i, 22);
        }
    }
}
