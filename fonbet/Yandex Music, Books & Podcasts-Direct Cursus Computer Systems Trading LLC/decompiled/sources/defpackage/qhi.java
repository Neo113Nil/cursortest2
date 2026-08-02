package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class qhi {
    public static final long a = c3x.h(4294432512L);

    public static final void a(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1203075817);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            irf.r(a0g.E(2131232103, 0, oq5Var), null, xp3.u(d.c(yciVar, 1.0f), ugo.a), null, null, 0.0f, null, oq5Var, 48, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, qmu qmuVar, yci yciVar, boolean z, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        qmu qmuVar2;
        iz2 iz2Var;
        ?? r10;
        ?? r102;
        boolean z3;
        oq5 oq5Var;
        iz2 iz2Var2 = b2c.f;
        qmuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1793805736);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.d(qmuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (oq5Var2.g(z2) ? 2048 : 1024);
        }
        if ((i4 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            qmuVar2 = qmuVar;
            z3 = z2;
            oq5Var = oq5Var2;
        } else {
            boolean z4 = i5 != 0 ? true : z2;
            iz2 iz2Var3 = b2c.b;
            kfh d = ug3.d(iz2Var3, false);
            int i6 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            w4k E = a0g.E(2131232100, 0, oq5Var2);
            vci vciVar = vci.a;
            int i7 = i4;
            irf.r(E, null, d.c(vciVar, 1.0f), null, null, 0.0f, null, oq5Var2, 432, 120);
            yci c = d.c(vciVar, 0.7f);
            iz2 iz2Var4 = b2c.g;
            b bVar = b.a;
            yci u = xp3.u(bVar.a(c, iz2Var4), ugo.a);
            kfh d2 = ug3.d(iz2Var3, false);
            int i8 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, u);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var2, i8, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            w1g.k(str, d.c(vciVar, 1.0f), bcx.b, bcx.c, bcx.d, null, null, 0.0f, 0, oq5Var2, (i7 & 14) | 224688);
            oq5 oq5Var3 = oq5Var2;
            if (z4) {
                qmuVar2 = qmuVar;
                if (qmuVar2 != qmu.a) {
                    oq5Var3.Z(664910409);
                    iz2Var = iz2Var2;
                    u1g.l(oq5Var3, androidx.compose.foundation.a.b(bVar.a(d.c(vciVar, 1.0f), iz2Var), ((dq0) oq5Var3.j(eq0.a)).c.d, vnj.i));
                    r10 = 0;
                    oq5Var3.p(r10);
                    iz2 iz2Var5 = iz2Var;
                    irf.r(a0g.E(2131232102, r10, oq5Var3), null, d.c(vciVar, 1.0f), null, null, 0.0f, null, oq5Var3, 432, 120);
                    if (qmuVar2 == qmu.a) {
                        oq5Var3.Z(665441532);
                        orl.a(384, 0, a, oq5Var3, bVar.a(vciVar, iz2Var5), qmuVar2 == qmu.c);
                        r102 = 0;
                    } else {
                        r102 = 0;
                        oq5Var3.Z(659450782);
                    }
                    oq5Var3.p(r102);
                    oq5Var3.p(true);
                    irf.r(a0g.E(2131232101, r102, oq5Var3), null, d.c(vciVar, 1.0f), null, null, 0.0f, null, oq5Var3, 432, 120);
                    oq5Var3.p(true);
                    z3 = z4;
                    oq5Var = oq5Var3;
                }
            } else {
                qmuVar2 = qmuVar;
            }
            iz2Var = iz2Var2;
            r10 = 0;
            oq5Var3.Z(659450782);
            oq5Var3.p(r10);
            iz2 iz2Var52 = iz2Var;
            irf.r(a0g.E(2131232102, r10, oq5Var3), null, d.c(vciVar, 1.0f), null, null, 0.0f, null, oq5Var3, 432, 120);
            if (qmuVar2 == qmu.a) {
            }
            oq5Var3.p(r102);
            oq5Var3.p(true);
            irf.r(a0g.E(2131232101, r102, oq5Var3), null, d.c(vciVar, 1.0f), null, null, 0.0f, null, oq5Var3, 432, 120);
            oq5Var3.p(true);
            z3 = z4;
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu0(str, qmuVar2, yciVar, z3, i, i2, 4);
        }
    }

    public static final void c(rhi rhiVar, owu owuVar, yci yciVar, o0k o0kVar, boolean z, e9g e9gVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        o0k o0kVar2;
        e9g e9gVar2;
        boolean z2;
        oq5 oq5Var;
        e9g e9gVar3;
        boolean z3;
        yci yciVar3;
        o0k o0kVar3;
        owuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1084447312);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(rhiVar) : oq5Var2.h(rhiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(owuVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if (((221184 | i3) & 74899) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar3 = yciVar;
            o0kVar3 = o0kVar;
            z3 = z;
            e9gVar3 = e9gVar;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            boolean z4 = true;
            if ((i & 1) == 0 || oq5Var2.y()) {
                float f = 8;
                q0k q0kVar = new q0k(16, f, 4, f);
                e9g e9gVar4 = e9g.a;
                yciVar2 = vci.a;
                o0kVar2 = q0kVar;
                e9gVar2 = e9gVar4;
                z2 = true;
            } else {
                oq5Var2.S();
                yciVar2 = yciVar;
                o0kVar2 = o0kVar;
                e9gVar2 = e9gVar;
                z2 = true;
                z4 = z;
            }
            oq5Var2.q();
            aqi M = gld.M(owuVar.c(), oq5Var2);
            long j = ((dq0) oq5Var2.j(eq0.a)).c.c;
            qmu qmuVar = (qmu) M.getValue();
            qmu qmuVar2 = qmu.a;
            if (qmuVar == qmuVar2) {
                j = d85.m;
            }
            yci a2 = androidx.compose.ui.platform.a.a(yciVar2, "wave_list_item");
            if (((qmu) M.getValue()) == qmuVar2) {
                z2 = false;
            }
            yci c = com.yandex.music.core.ui.compose.b.c(a2, "wave_list_item_selected", Boolean.valueOf(z2));
            boolean h = oq5Var2.h(owuVar) | oq5Var2.f(M);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                K = new phi(owuVar, M, 0);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            ngg.i((Function0) K, c, ild.C(-945249390, new s43(rhiVar, e9gVar2, z4, M, 12), oq5Var2), false, j, null, null, 0.0f, o0kVar2, ild.C(-1259554837, new ykf(8, rhiVar), oq5Var2), oq5Var, 806879616, 168);
            e9gVar3 = e9gVar2;
            z3 = z4;
            yciVar3 = yciVar2;
            o0kVar3 = o0kVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(rhiVar, owuVar, yciVar3, o0kVar3, z3, e9gVar3, i);
        }
    }
}
