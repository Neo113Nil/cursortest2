package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector;

import androidx.compose.foundation.layout.IntrinsicSize;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj91;
import defpackage.fnq0;
import defpackage.g8m0;
import defpackage.gl51;
import defpackage.i43;
import defpackage.j690;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lkm0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.ma6;
import defpackage.mfe0;
import defpackage.mkm0;
import defpackage.o430;
import defpackage.o8k0;
import defpackage.ohd;
import defpackage.okm0;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.q791;
import defpackage.qic;
import defpackage.qj4;
import defpackage.qje;
import defpackage.qkm0;
import defpackage.qm51;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sm91;
import defpackage.teb;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vnf0;
import defpackage.wfz;
import defpackage.wls;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.y3b1;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(mkm0 mkm0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        f530 f530Var;
        boolean z;
        boolean z2 = mkm0Var.e;
        List list = mkm0Var.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(334486973);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(mkm0Var) ? 4 : 2) | i;
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
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 f530Var2 = c530.a;
            if (z2) {
                btsVar.e0(377482341);
                f530Var = pw91.l(f530Var2, pw91.o(btsVar), 14);
                btsVar.t(false);
            } else {
                btsVar.e0(377550541);
                btsVar.t(false);
                f530Var = f530Var2;
            }
            boolean k = btsVar.k(list);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((okm0) it.next()).c != null) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                Q = Boolean.valueOf(z);
                btsVar.o0(Q);
            }
            f530 c = fj91.c(an91.o(an91.m(f530Var, 16.0f, 0.0f, 2), 0.0f, ((Boolean) Q).booleanValue() ? 8.0f : 0.0f, 0.0f, 0.0f, 13), IntrinsicSize.Max);
            lhl0 a = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            if (!z2) {
                f530Var2 = new x2y(1.0f, true);
            }
            f530 f530Var3 = f530Var2;
            btsVar.e0(-1269571402);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                b((okm0) it2.next(), mkm0Var.d, f530Var3.k(ljs0.b), tlsVar3, tlsVar4, btsVar, (i2 << 6) & 64512);
                tlsVar3 = tlsVar;
                tlsVar4 = tlsVar2;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(mkm0Var, tlsVar, tlsVar2, i, 25);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (defpackage.jl40.l(r15.Q(), java.lang.Integer.valueOf(r13)) == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(okm0 okm0Var, qkm0 qkm0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        long j;
        dmw0 dmw0Var;
        f530 f530Var2;
        wls wlsVar;
        j690 j690Var;
        c530 c530Var;
        o430 o430Var;
        ma6 ma6Var;
        tls tlsVar3 = tlsVar2;
        uo5 uo5Var = x4c.b;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1166244169);
        dmw0 dmw0Var2 = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(okm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qkm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = okm0Var.e;
            boolean z2 = okm0Var.d;
            if (!z) {
                btsVar.e0(1589860647);
                ldc ldcVar = qkm0Var != null ? qkm0Var.c : null;
                if (ldcVar == null) {
                    btsVar.e0(-225807504);
                    long d = ((el51) btsVar.m(gl51.a)).d();
                    btsVar.t(false);
                    j = d;
                } else {
                    btsVar.e0(-225808837);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                btsVar.t(false);
            } else if (z2) {
                btsVar.e0(1589938984);
                ldc ldcVar2 = qkm0Var != null ? qkm0Var.a : null;
                if (ldcVar2 == null) {
                    btsVar.e0(-225804977);
                    j = ((el51) btsVar.m(gl51.a)).c();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-225806310);
                    btsVar.t(false);
                    j = ldcVar2.a;
                }
                btsVar.t(false);
            } else {
                btsVar.e0(1590004549);
                ldc ldcVar3 = qkm0Var != null ? qkm0Var.b : null;
                if (ldcVar3 == null) {
                    btsVar.e0(-225802800);
                    j = ((el51) btsVar.m(gl51.a)).d();
                    btsVar.t(false);
                } else {
                    btsVar.e0(-225804195);
                    btsVar.t(false);
                    j = ldcVar3.a;
                }
                btsVar.t(false);
            }
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            c530 c530Var2 = c530.a;
            if (z2) {
                if ((qkm0Var != null ? qkm0Var.d : null) != null) {
                    ma6 ma6Var2 = qkm0Var.d;
                    dmw0Var = dmw0Var2;
                    f530Var2 = aab1.a(ma6Var2.b, ma6Var2.a, c530Var2, b);
                    ContentAlignment contentAlignment = qkm0Var == null ? qkm0Var.f : null;
                    int i3 = contentAlignment != null ? -1 : lkm0.a[contentAlignment.ordinal()];
                    int i4 = i3 == 1 ? i3 != 2 ? 17 : 8388613 : 8388611;
                    ContentAlignment contentAlignment2 = qkm0Var == null ? qkm0Var.g : null;
                    int i5 = contentAlignment2 != null ? lkm0.a[contentAlignment2.ordinal()] : -1;
                    uo5 uo5Var2 = i5 == 1 ? i5 != 2 ? x4c.c : x4c.w : uo5Var;
                    z910 d2 = pi6.d(uo5Var, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    int i6 = i4;
                    f530 d3 = androidx.compose.ui.b.d(btsVar, f530Var);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (dmw0Var != null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    uo5 uo5Var3 = uo5Var2;
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar2 = androidx.compose.ui.node.d.f;
                    qje.W(btsVar, wlsVar2, d2);
                    wls wlsVar3 = androidx.compose.ui.node.d.e;
                    qje.W(btsVar, wlsVar3, o);
                    wls wlsVar4 = androidx.compose.ui.node.d.g;
                    if (btsVar.S) {
                        wlsVar = wlsVar3;
                    } else {
                        wlsVar = wlsVar3;
                    }
                    b64.z(hashCode, btsVar, hashCode, wlsVar4);
                    wls wlsVar5 = androidx.compose.ui.node.d.d;
                    qje.W(btsVar, wlsVar5, d3);
                    if (qkm0Var == null || (j690Var = qkm0Var.e) == null) {
                        j690.a.getClass();
                        j690Var = wfz.J;
                    }
                    float f = (qkm0Var == null || (ma6Var = qkm0Var.d) == null) ? 0.0f : ma6Var.b;
                    f530 b2 = m4m0.b(ymb1.l(an91.k(ljs0.c.k(f530Var2), f), b), j, b);
                    boolean z3 = okm0Var.e;
                    int i7 = i2 & 14;
                    boolean z4 = ((i2 & 7168) == 2048) | (i7 == 4);
                    Object Q = btsVar.Q();
                    o430 o430Var2 = did.a;
                    if (z4 || Q == o430Var2) {
                        Q = new o8k0(29, tlsVar, okm0Var);
                        btsVar.o0(Q);
                    }
                    f530 j2 = an91.j(q791.d(b2, z3, null, null, (sls) Q, 14), j690Var);
                    boolean z5 = i7 == 4;
                    Object Q2 = btsVar.Q();
                    if (z5 || Q2 == o430Var2) {
                        Q2 = new g8m0(18, okm0Var);
                        btsVar.o0(Q2);
                    }
                    f530 b3 = fnq0.b(j2, false, (tls) Q2);
                    sic a = qic.a(lr20.g, x4c.H, btsVar, 54);
                    int i8 = i2;
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar, b3);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar2, a);
                    qje.W(btsVar, wlsVar, o2);
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
                    }
                    qje.W(btsVar, wlsVar5, d4);
                    float f2 = f;
                    zgb1.a(okm0Var.a, ljs0.c(c530Var2, 1.0f), i6, false, null, null, false, null, btsVar, 48, 248);
                    CharSequence charSequence = okm0Var.b;
                    if (charSequence == null) {
                        btsVar.e0(1449467990);
                        btsVar.t(false);
                        c530Var = c530Var2;
                    } else {
                        btsVar.e0(1449467991);
                        c530Var = c530Var2;
                        zgb1.a(charSequence, ljs0.c(an91.o(c530Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13), 1.0f), i6, false, null, null, false, null, btsVar, 48, 248);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    qj4 qj4Var = okm0Var.c;
                    if (qj4Var == null) {
                        btsVar.e0(509852413);
                        btsVar.t(false);
                        o430Var = o430Var2;
                    } else {
                        btsVar.e0(509852414);
                        f530 a2 = cj6.a.a(sm91.f(c530Var, 0.0f, z2 ? -8.0f : f2 - 8.0f, 1), uo5Var3);
                        Object Q3 = btsVar.Q();
                        o430Var = o430Var2;
                        if (Q3 == o430Var) {
                            Q3 = new teb(20);
                            btsVar.o0(Q3);
                        }
                        y3b1.c(qj4Var.a, fnq0.a(a2, (tls) Q3), qj4Var.b, qj4Var.c, btsVar, 0, 16);
                        btsVar = btsVar;
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    boolean z6 = ((57344 & i8) == 16384) | (i7 == 4);
                    Object Q4 = btsVar.Q();
                    if (z6 || Q4 == o430Var) {
                        tlsVar3 = tlsVar2;
                        Q4 = new ScalableSelectorKt$ScalableSelectorOption$2$1(tlsVar3, okm0Var, null);
                        btsVar.o0(Q4);
                    } else {
                        tlsVar3 = tlsVar2;
                    }
                    zpn.e(btsVar, (wls) Q4, zy11.a);
                }
            }
            dmw0Var = dmw0Var2;
            f530Var2 = c530Var2;
            if (qkm0Var == null) {
            }
            if (contentAlignment != null) {
            }
            if (i3 == 1) {
            }
            if (qkm0Var == null) {
            }
            if (contentAlignment2 != null) {
            }
            if (i5 == 1) {
            }
            z910 d22 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            int i62 = i4;
            f530 d32 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (dmw0Var != null) {
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(okm0Var, qkm0Var, f530Var, tlsVar, tlsVar3, i, 3);
        }
    }
}
