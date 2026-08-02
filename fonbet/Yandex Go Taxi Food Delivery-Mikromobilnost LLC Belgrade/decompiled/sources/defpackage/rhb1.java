package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.a;

/* loaded from: classes5.dex */
public abstract class rhb1 {
    public static final void a(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1035848248);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            to5 to5Var = x4c.E;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(ljs0.g(c530Var, 56.0f, 0.0f, 2), 1.0f);
            lhl0 a = khl0.a(lr20.a, to5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qgy.b(charSequence, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 12.0f, 16.0f), null, uh6.E(24), 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).e.d, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 12266);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 2, charSequence);
        }
    }

    public static final void b(int i, fid fidVar, f530 f530Var, List list) {
        f530 f530Var2;
        boolean z;
        boolean z2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2028844151);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(list) ? 32 : 16;
        }
        boolean z3 = false;
        boolean z4 = true;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar, c530Var2);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(1576364492);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sqn sqnVar = (sqn) it.next();
                if (sqnVar instanceof wsy0) {
                    btsVar.e0(1622738296);
                    wsy0 wsy0Var = (wsy0) sqnVar;
                    String str = wsy0Var.a;
                    lzr lzrVar = wsy0Var.b;
                    int i3 = wsy0Var.c;
                    eyr eyrVar = wsy0Var.e;
                    bts btsVar2 = btsVar;
                    c530Var = c530Var2;
                    z = z3;
                    z2 = z4;
                    wqy0.b(str, null, ((el51) btsVar.m(gl51.a)).n(), wsy0Var.d, new hzr(i3), lzrVar, eyrVar, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar2, 0, 3120, 120706);
                    btsVar = btsVar2;
                    btsVar.t(z);
                } else {
                    z = z3;
                    z2 = z4;
                    c530Var = c530Var2;
                    if (!(sqnVar instanceof h5v)) {
                        throw unr0.y(1576365753, btsVar, z);
                    }
                    btsVar.e0(1576380185);
                    s3b1.f(((h5v) sqnVar).a, null, null, btsVar, 0, 6);
                    btsVar.t(z);
                }
                z3 = z;
                z4 = z2;
                c530Var2 = c530Var;
            }
            btsVar.t(z3);
            btsVar.t(z4);
            f530Var2 = c530Var2;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(f530Var2, list, i, 7);
        }
    }

    public static final void c(s2v0 s2v0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-310403163);
        int i2 = (btsVar.k(s2v0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            int i3 = 5;
            if (z || Q == did.a) {
                Q = new xyz(i3, s2v0Var);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 d = q791.d(c530Var, false, null, null, (sls) Q, 15);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            ymb1.f(s2v0Var.a, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65534);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.q(c530Var, 4.0f));
            o4b1.b(mt71.m(wzg0.ic_chevron_right_circle, 0, btsVar), null, null, null, null, 0.0f, new c36(((el51) btsVar.m(gl51.a)).j(), 5), btsVar, 48, 60);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(s2v0Var, i, 22);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        if (defpackage.jl40.l(r9.Q(), java.lang.Integer.valueOf(r11)) == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(f530 f530Var, ome omeVar, v4v v4vVar, vq0 vq0Var, List list, s2v0 s2v0Var, fid fidVar, int i, int i2) {
        ome omeVar2;
        int i3;
        v4v v4vVar2;
        int i4;
        vq0 vq0Var2;
        int i5;
        s2v0 s2v0Var2;
        int i6;
        f530 f530Var2;
        ome omeVar3;
        v4v v4vVar3;
        vq0 vq0Var3;
        s2v0 s2v0Var3;
        int i7;
        vq0 vq0Var4;
        s2v0 s2v0Var4;
        v4v v4vVar4;
        boolean z;
        c530 c530Var;
        vq0 vq0Var5;
        s2v0 s2v0Var5;
        ome omeVar4;
        wls wlsVar;
        so5 so5Var;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1856034608);
        dmw0 dmw0Var = btsVar.a;
        int i8 = i | 6;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i | 54;
            omeVar2 = omeVar;
        } else {
            omeVar2 = omeVar;
            i3 = i8 | (btsVar.k(omeVar2) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i4 = i3 | 384;
            v4vVar2 = v4vVar;
        } else {
            v4vVar2 = v4vVar;
            i4 = i3 | (btsVar.k(v4vVar2) ? 256 : 128);
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i5 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
            vq0Var2 = vq0Var;
        } else {
            vq0Var2 = vq0Var;
            i5 = i4 | (btsVar.k(vq0Var2) ? 2048 : 1024);
        }
        int i12 = i5 | (btsVar.e(list) ? 16384 : 8192);
        int i13 = i2 & 32;
        if (i13 != 0) {
            i6 = i12 | ImageMetadata.EDGE_MODE;
            s2v0Var2 = s2v0Var;
        } else {
            s2v0Var2 = s2v0Var;
            i6 = i12 | (btsVar.k(s2v0Var2) ? 131072 : 65536);
        }
        if (btsVar.V(i6 & 1, (74899 & i6) != 74898)) {
            if (i9 != 0) {
                omeVar2 = null;
            }
            if (i10 != 0) {
                v4vVar2 = null;
            }
            vq0 vq0Var6 = i11 != 0 ? null : vq0Var2;
            s2v0 s2v0Var6 = i13 != 0 ? null : s2v0Var2;
            c530 c530Var2 = c530.a;
            f530 o = an91.o(c530Var2, 8.0f, 0.0f, 16.0f, 0.0f, 10);
            so5 so5Var2 = x4c.G;
            sic a = qic.a(lr20.c, so5Var2, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o2);
            wls wlsVar4 = d.g;
            if (btsVar.S) {
                i7 = i6;
            } else {
                i7 = i6;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar4);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                vq0Var4 = vq0Var6;
                s2v0Var4 = s2v0Var6;
                v4vVar4 = v4vVar2;
                z = true;
                btsVar.e0(543910300);
                btsVar.t(false);
            } else {
                btsVar.e0(542923043);
                v4v v4vVar5 = v4vVar2;
                f530 d2 = hi91.d(ljs0.e(ljs0.c(c530Var2, 1.0f), 64.0f), false, null, 3);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new teb(20);
                    btsVar.o0(Q);
                }
                f530 b = fnq0.b(d2, true, (tls) Q);
                lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar, 54);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = b.d(btsVar, b);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar2, a2);
                qje.W(btsVar, wlsVar3, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
                }
                qje.W(btsVar, wlsVar5, d3);
                if (v4vVar5 == null) {
                    btsVar.e0(-812567757);
                    btsVar.t(false);
                    v4vVar4 = v4vVar5;
                    vq0Var4 = vq0Var6;
                    omeVar4 = omeVar2;
                    s2v0Var5 = s2v0Var6;
                    wlsVar = wlsVar3;
                    so5Var = so5Var2;
                } else {
                    btsVar.e0(-812567756);
                    s2v0Var5 = s2v0Var6;
                    omeVar4 = omeVar2;
                    wlsVar = wlsVar3;
                    vq0Var4 = vq0Var6;
                    so5Var = so5Var2;
                    s3b1.f(v4vVar5, ljs0.m(c530Var2, 48.0f), null, btsVar, 0, 4);
                    v4vVar4 = v4vVar5;
                    nnm.s(c530Var2, 8.0f, btsVar, false);
                }
                x2y x2yVar = new x2y(1.0f, true);
                sic a3 = qic.a(lr20.e, so5Var, btsVar, 6);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o4 = btsVar.o();
                f530 d4 = b.d(btsVar, x2yVar);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar2, a3);
                qje.W(btsVar, wlsVar, o4);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar, hashCode3, wlsVar4);
                }
                qje.W(btsVar, wlsVar5, d4);
                b((i7 >> 9) & 112, btsVar, null, list);
                if (s2v0Var5 == null) {
                    btsVar.e0(-1903647412);
                    z2 = false;
                    btsVar.t(false);
                    s2v0Var4 = s2v0Var5;
                } else {
                    z2 = false;
                    btsVar.e0(-1903647411);
                    s2v0Var4 = s2v0Var5;
                    c(s2v0Var4, btsVar, 0);
                    btsVar.t(false);
                }
                btsVar.t(true);
                if (omeVar4 == null) {
                    btsVar.e0(-811996644);
                    btsVar.t(z2);
                    omeVar2 = omeVar4;
                } else {
                    btsVar.e0(-811996643);
                    omeVar2 = omeVar4;
                    a.a(omeVar2, btsVar, (i7 >> 3) & 14);
                    btsVar.t(z2);
                }
                z = true;
                btsVar.t(true);
                btsVar.t(z2);
            }
            if (vq0Var4 != null) {
                btsVar.e0(543968797);
                vq0Var5 = vq0Var4;
                c530Var = c530Var2;
                ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a.a(vq0Var5.c, vq0Var5.d, null, vq0Var5.e, vq0Var5.g, vq0Var5.h, btsVar, 0, 4);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                vq0Var5 = vq0Var4;
                btsVar.e0(544254524);
                btsVar.t(false);
            }
            btsVar.t(z);
            s2v0Var3 = s2v0Var4;
            vq0Var3 = vq0Var5;
            omeVar3 = omeVar2;
            f530Var2 = c530Var;
            v4vVar3 = v4vVar4;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            omeVar3 = omeVar2;
            v4vVar3 = v4vVar2;
            vq0Var3 = vq0Var2;
            s2v0Var3 = s2v0Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(f530Var2, omeVar3, v4vVar3, vq0Var3, list, s2v0Var3, i, i2);
        }
    }

    public static final String e(Object obj) {
        if (obj instanceof Character) {
            return String.valueOf(obj);
        }
        StringBuilder sb = new StringBuilder();
        jason.statham.utils.a.a(sb, obj);
        return sb.toString();
    }
}
