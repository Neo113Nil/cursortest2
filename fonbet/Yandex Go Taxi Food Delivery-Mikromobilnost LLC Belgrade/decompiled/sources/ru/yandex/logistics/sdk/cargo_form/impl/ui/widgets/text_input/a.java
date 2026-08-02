package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input;

import androidx.compose.runtime.f;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an51;
import defpackage.an91;
import defpackage.b64;
import defpackage.bmt0;
import defpackage.bts;
import defpackage.but0;
import defpackage.byk0;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cma1;
import defpackage.cms;
import defpackage.cqy0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.doj;
import defpackage.eja1;
import defpackage.el51;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.g43;
import defpackage.gi91;
import defpackage.gl51;
import defpackage.hk2;
import defpackage.hoy0;
import defpackage.j5y;
import defpackage.jl40;
import defpackage.jpy0;
import defpackage.jvs0;
import defpackage.khl0;
import defpackage.kk2;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.mt0;
import defpackage.n;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.rx21;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tlb1;
import defpackage.tls;
import defpackage.tse0;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.ypu;
import defpackage.yur;
import defpackage.zgb1;
import defpackage.zm51;
import defpackage.zpn;
import defpackage.zx40;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(String str, f530 f530Var, fid fidVar, int i, int i2) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1262003297);
        int i3 = i2 | (btsVar2.k(str) ? 4 : 2) | (btsVar2.c(i) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar2.e0(1604395133);
            hk2 hk2Var = new hk2(0);
            a7u0 a7u0Var = an51.a;
            bmt0 bmt0Var = ((zm51) btsVar2.m(a7u0Var)).g.a;
            lzr lzrVar = lzr.E;
            a7u0 a7u0Var2 = gl51.a;
            int h = hk2Var.h(bmt0.a(bmt0Var, ((el51) btsVar2.m(a7u0Var2)).n(), lzrVar, 65530));
            try {
                hk2Var.d(String.valueOf(str.length()));
                hk2Var.g(h);
                h = hk2Var.h(bmt0.a(((zm51) btsVar2.m(a7u0Var)).g.a, ((el51) btsVar2.m(a7u0Var2)).o(), null, 65534));
                try {
                    hk2Var.d("/" + i);
                    hk2Var.g(h);
                    kk2 i4 = hk2Var.i();
                    btsVar2.t(false);
                    btsVar = btsVar2;
                    wqy0.c(i4, f530Var, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, null, null, btsVar, (i3 >> 3) & 112, 0, 262140);
                } finally {
                }
            } finally {
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new doj(str, i, f530Var, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0255, code lost:
    
        if (defpackage.jl40.l(r15.Q(), java.lang.Integer.valueOf(r7)) == false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(jpy0 jpy0Var, wls wlsVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        wls wlsVar2;
        jpy0 jpy0Var2;
        tls tlsVar3;
        Object mt0Var;
        Object obj;
        int i3;
        jpy0 jpy0Var3;
        tls tlsVar4;
        zx40 zx40Var;
        f530 d;
        Integer num;
        dmw0 dmw0Var;
        int i4;
        boolean z;
        Object obj2;
        boolean z2;
        String str = jpy0Var.c;
        CharSequence charSequence = jpy0Var.j;
        Integer num2 = jpy0Var.l;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1649199280);
        dmw0 dmw0Var2 = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(jpy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            wlsVar2 = wlsVar;
            i2 |= btsVar.e(wlsVar2) ? 32 : 16;
        } else {
            wlsVar2 = wlsVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            Object obj3 = did.a;
            if (Q == obj3) {
                int length = str.length();
                Q = f.j(new hoy0(str, eja1.c(length, length), 4));
                btsVar = btsVar;
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            int intValue = num2.intValue();
            int i5 = i2 & 14;
            boolean z3 = i5 == 4;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == obj3) {
                obj = obj3;
                i3 = i2;
                mt0Var = new mt0(intValue, wlsVar2, jpy0Var, oz40Var, 8);
                jpy0Var3 = jpy0Var;
                btsVar.o0(mt0Var);
            } else {
                i3 = i2;
                mt0Var = Q2;
                jpy0Var3 = jpy0Var;
                obj = obj3;
            }
            tls tlsVar5 = (tls) mt0Var;
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = ly3.i(btsVar);
            }
            zx40 zx40Var2 = (zx40) Q3;
            oz40 b = androidx.compose.foundation.interaction.a.b(zx40Var2, btsVar, 6);
            Object Q4 = btsVar.Q();
            if (Q4 == obj) {
                Q4 = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q4;
            if (((Boolean) b.getValue()).booleanValue()) {
                btsVar.e0(1166103783);
                cqy0 cqy0Var = jpy0Var3.f;
                if (cqy0Var == null) {
                    btsVar.e0(1166103782);
                    btsVar.t(false);
                    tlsVar4 = tlsVar5;
                    zx40Var = zx40Var2;
                    z2 = false;
                    d = null;
                } else {
                    tlsVar4 = tlsVar5;
                    zx40Var = zx40Var2;
                    z2 = false;
                    btsVar.e0(1166103783);
                    d = d(cqy0Var, btsVar);
                    btsVar.t(false);
                }
                btsVar.t(z2);
            } else {
                tlsVar4 = tlsVar5;
                zx40Var = zx40Var2;
                btsVar.e0(1166190087);
                cqy0 cqy0Var2 = jpy0Var3.g;
                if (cqy0Var2 == null) {
                    btsVar.e0(1166190086);
                    btsVar.t(false);
                    d = null;
                } else {
                    btsVar.e0(1166190087);
                    d = d(cqy0Var2, btsVar);
                    btsVar.t(false);
                }
                btsVar.t(false);
            }
            c530 c530Var = c530.a;
            if (d == null) {
                btsVar.e0(37620999);
                boolean booleanValue = ((Boolean) b.getValue()).booleanValue();
                byk0 b2 = ((YandexShapes) btsVar.m(qm51.a)).b();
                a7u0 a7u0Var = gl51.a;
                num = num2;
                dmw0Var = dmw0Var2;
                long n = ((el51) btsVar.m(a7u0Var)).n();
                boolean d2 = btsVar.d(n) | btsVar.k(b2);
                Object Q5 = btsVar.Q();
                if (d2 || Q5 == obj) {
                    i4 = i3;
                    Q5 = new j5y(n, b2, 7);
                    btsVar.o0(Q5);
                } else {
                    i4 = i3;
                }
                d = m4m0.b(ymb1.l(rx21.c(c530Var, booleanValue, (tls) Q5), b2), ((el51) btsVar.m(a7u0Var)).g(), b2);
                z = false;
            } else {
                num = num2;
                dmw0Var = dmw0Var2;
                i4 = i3;
                z = false;
                btsVar.e0(37614985);
            }
            btsVar.t(z);
            boolean z4 = i5 == 4;
            Object Q6 = btsVar.Q();
            if (z4 || Q6 == obj) {
                Q6 = new TextInputKt$TextInputContent$3$1(jpy0Var3, oz40Var, null);
                btsVar.o0(Q6);
            }
            zpn.e(btsVar, (wls) Q6, str);
            Boolean valueOf = Boolean.valueOf(jpy0Var3.m);
            boolean z5 = i5 == 4;
            Object Q7 = btsVar.Q();
            if (z5 || Q7 == obj) {
                Q7 = new TextInputKt$TextInputContent$4$1(jpy0Var3, yurVar, oz40Var, null);
                btsVar.o0(Q7);
            }
            zpn.e(btsVar, (wls) Q7, valueOf);
            f530 m = an91.m(c530Var, jpy0Var3.n, 0.0f, 2);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar3 = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar3, a);
            wls wlsVar4 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar4, o);
            wls wlsVar5 = androidx.compose.ui.node.d.g;
            if (btsVar.S) {
                obj2 = obj;
            } else {
                obj2 = obj;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar5);
            wls wlsVar6 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar6, d3);
            f530 k = ljs0.g(ljs0.c(c530Var, 1.0f), jpy0Var3.d, 0.0f, 2).k(d);
            sic a2 = qic.a(lr20.g, so5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar3, a2);
            qje.W(btsVar, wlsVar4, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar5);
            }
            qje.W(btsVar, wlsVar6, d4);
            f530 b3 = gi91.b(ljs0.c(c530Var, 1.0f), yurVar);
            hoy0 hoy0Var = (hoy0) oz40Var.getValue();
            byk0 b4 = ((YandexShapes) btsVar.m(qm51.a)).b();
            ety0 ety0Var = ((zm51) btsVar.m(an51.a)).e;
            long j = ldc.l;
            int i6 = i4;
            Object obj4 = obj2;
            bts btsVar2 = btsVar;
            btsVar = btsVar2;
            tlb1.a(0, 12582912, 1572864, 65368, btsVar, tlsVar4, null, wwg.S(-1374464295, true, new but0(15, jpy0Var3), btsVar), null, null, null, b3, zx40Var, b4, tlb1.d(j, 0L, j, j, 0L, 0L, btsVar2, 14158854, 2097051), hoy0Var, ety0Var, null, false, false, false);
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar3, a3);
            qje.W(btsVar, wlsVar4, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar5);
            }
            qje.W(btsVar, wlsVar6, d5);
            btsVar.e0(1814325748);
            a(((hoy0) oz40Var.getValue()).a.b, an91.o(new ypu(x4c.I), 0.0f, 0.0f, 16.0f, 8.0f, 3), btsVar, num.intValue(), 0);
            btsVar.t(false);
            lhl0 a4 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d6 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar3, a4);
            qje.W(btsVar, wlsVar4, o4);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode4))) {
                b64.z(hashCode4, btsVar, hashCode4, wlsVar5);
            }
            oeb1.c(btsVar, n.d(btsVar, d6, wlsVar6, 1.0f, true));
            jpy0Var2 = jpy0Var3;
            tlsVar3 = tlsVar2;
            c(jpy0Var3.i, tlsVar, tlsVar3, null, btsVar, (i6 >> 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            tse0.t(btsVar, true, true, true);
            if (charSequence == null) {
                btsVar.e0(1197179319);
                btsVar.t(false);
            } else {
                btsVar.e0(1197179320);
                boolean z6 = (i5 == 4) | ((i6 & 7168) == 2048);
                Object Q8 = btsVar.Q();
                if (z6 || Q8 == obj4) {
                    Q8 = new TextInputKt$TextInputContent$5$2$1$1(tlsVar3, jpy0Var2, null);
                    btsVar.o0(Q8);
                }
                zpn.e(btsVar, (wls) Q8, charSequence);
                zgb1.a(charSequence, an91.o(c530Var, 16.0f, 8.0f, 16.0f, 0.0f, 8), 8388611, false, null, null, false, null, btsVar, 384, 248);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            jpy0Var2 = jpy0Var;
            tlsVar3 = tlsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(jpy0Var2, wlsVar, tlsVar, tlsVar3, i, 17);
        }
    }

    public static final void c(List list, tls tlsVar, tls tlsVar2, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(760280803);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        tls tlsVar3 = tlsVar;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 32 : 16;
        }
        tls tlsVar4 = tlsVar2;
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar4) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 0.0f, 8.0f, 8.0f, 3);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(203695110);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a((jvs0) it.next(), false, false, tlsVar4, tlsVar3, btsVar, ((i3 << 3) & 7168) | ((i3 << 9) & HProv.ALG_CLASS_ALL), 6);
                tlsVar3 = tlsVar;
                tlsVar4 = tlsVar2;
            }
            btsVar.t(false);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) list, (cms) tlsVar, (cms) tlsVar2, f530Var2, i, 18);
        }
    }

    public static final f530 d(final cqy0 cqy0Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        final byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
        final int i = 1;
        boolean z = false;
        boolean z2 = cqy0Var.b != null;
        boolean k = btsVar.k(cqy0Var) | btsVar.k(b);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        Object obj = Q;
        if (k || Q == o430Var) {
            final boolean z3 = z ? 1 : 0;
            tls tlsVar = new tls() { // from class: fpy0
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i2 = z3;
                    byk0 byk0Var = b;
                    cqy0 cqy0Var2 = cqy0Var;
                    f530 f530Var = (f530) obj2;
                    switch (i2) {
                        case 0:
                            ma6 ma6Var = cqy0Var2.b;
                            if (ma6Var == null) {
                                ny61.g("Required value was null.");
                                break;
                            } else {
                                break;
                            }
                        default:
                            ldc ldcVar = cqy0Var2.a;
                            if (ldcVar == null) {
                                ny61.g("Required value was null.");
                                break;
                            } else {
                                break;
                            }
                    }
                    return null;
                }
            };
            btsVar.o0(tlsVar);
            obj = tlsVar;
        }
        f530 l = ymb1.l(rx21.c(c530.a, z2, (tls) obj), b);
        boolean z4 = cqy0Var.a != null;
        boolean k2 = btsVar.k(cqy0Var) | btsVar.k(b);
        Object Q2 = btsVar.Q();
        Object obj2 = Q2;
        if (k2 || Q2 == o430Var) {
            tls tlsVar2 = new tls() { // from class: fpy0
                @Override // defpackage.tls
                public final Object invoke(Object obj22) {
                    int i2 = i;
                    byk0 byk0Var = b;
                    cqy0 cqy0Var2 = cqy0Var;
                    f530 f530Var = (f530) obj22;
                    switch (i2) {
                        case 0:
                            ma6 ma6Var = cqy0Var2.b;
                            if (ma6Var == null) {
                                ny61.g("Required value was null.");
                                break;
                            } else {
                                break;
                            }
                        default:
                            ldc ldcVar = cqy0Var2.a;
                            if (ldcVar == null) {
                                ny61.g("Required value was null.");
                                break;
                            } else {
                                break;
                            }
                    }
                    return null;
                }
            };
            btsVar.o0(tlsVar2);
            obj2 = tlsVar2;
        }
        return rx21.c(l, z4, (tls) obj2);
    }
}
