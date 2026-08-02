package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.t;
import com.yandex.music.core.ui.compose.b;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xk(nii niiVar, s61 s61Var, k61 k61Var) {
        this.a = 5;
        this.b = niiVar;
        this.c = s61Var;
        this.d = k61Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        iz1 iz1Var = (iz1) this.b;
        fvf fvfVar = (fvf) this.c;
        dz1 dz1Var = (dz1) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (iz1Var instanceof hz1) {
            oq5Var.Z(1728734335);
            qwp.b(fvfVar, o0kVar, ((hz1) iz1Var).a, dz1Var, oq5Var, (intValue << 3) & 112);
            oq5Var.p(false);
        } else if (Intrinsics.d(iz1Var, fz1.a)) {
            oq5Var.Z(1729029238);
            q5g.d(o0kVar, R.string.collection_audiobooks_empty_screen, oq5Var, intValue & 14);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(iz1Var, gz1.a)) {
                throw vz1.i(oq5Var, -636972169, false);
            }
            oq5Var.Z(1729277455);
            yci c = d.c(a.q(vci.a, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f);
            kfh d = ug3.d(b2c.f, false);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            c3x.m(0, 3, 0L, oq5Var, null);
            oq5Var.p(true);
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b93 b93Var = (b93) this.b;
        v83 v83Var = (v83) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(b93Var, z83.b)) {
            oq5Var.Z(442998502);
            oq5Var.p(false);
        } else if (b93Var instanceof a93) {
            oq5Var.Z(1953955944);
            qwp.c(((a93) b93Var).a, v83Var, fvfVar, o0kVar, oq5Var, (intValue << 9) & 7168);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(b93Var, z83.a)) {
                throw vz1.i(oq5Var, 1953951619, false);
            }
            oq5Var.Z(1953964350);
            fgq.n(0, oq5Var, androidx.compose.ui.platform.a.a(d.c(a.l(vci.a, o0kVar), 1.0f), "collection_downloaded_chapters_empty"), rvf.M(R.string.downloaded_books_empty, oq5Var));
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        va3 va3Var = (va3) this.b;
        jab jabVar = (jab) this.c;
        u0s u0sVar = (u0s) this.d;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            boolean h = oq5Var.h(va3Var) | oq5Var.h(jabVar) | oq5Var.h(u0sVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new f93(va3Var, jabVar, u0sVar, 2);
                oq5Var.k0(K);
            }
            v3g.i((Function0) K, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        df4 df4Var = (df4) this.b;
        um0 um0Var = (um0) this.c;
        d85 d85Var = (d85) this.d;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        float c = cVar.c();
        float f = ef4.c;
        int i = (int) ((c - f) / (ef4.b + ef4.a));
        vci vciVar = vci.a;
        yci o = a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2);
        boolean z = false;
        ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
        oq5 oq5Var2 = (oq5) hq5Var;
        int i2 = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        yci H = vnj.H(hq5Var, o);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        g0g.U(hq5Var, a, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
            ouj.x(i2, oq5Var2, i2, kb5Var);
        }
        g0g.U(hq5Var, H, wp5.d);
        if (((Configuration) oq5Var2.j(AndroidCompositionLocals_androidKt.a)).screenHeightDp <= 640) {
            f = ef4.d;
        }
        u1g.l(hq5Var, d.e(vciVar, f));
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = CollectionsKt.q0(df4Var.d, i);
            oq5Var2.k0(K);
        }
        String str = df4Var.b;
        pas pasVar = df4Var.a;
        int size = ((ArrayList) xz0.w(new Object[]{str, pasVar.a, pasVar.b, pasVar.d})).size();
        oq5Var2.Z(669322556);
        int i3 = 0;
        for (Object obj4 : (List) K) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                u75.n();
                throw null;
            }
            cf4 cf4Var = (cf4) obj4;
            hq5 hq5Var2 = hq5Var;
            vm0 b = fn0.b(i3 + size, 0.0f, um0Var, hq5Var2, 0, 2);
            String str2 = cf4Var.a;
            String str3 = cf4Var.b;
            Integer valueOf = df4Var.c ? Integer.valueOf(i4) : null;
            boolean z2 = cf4Var.d == etq.b;
            yci q = a.q(vciVar, 0.0f, 0.0f, 0.0f, ef4.a, 7);
            vci vciVar2 = vciVar;
            boolean f2 = oq5Var2.f(b);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == kjnVar) {
                K2 = new la1(b, 14);
                oq5Var2.k0(K2);
            }
            hq5Var = hq5Var2;
            bkp.L(str2, valueOf, cf4Var.c, d85Var, wyf.s(q, (Function0) K2), 0.0f, str3, z2, hq5Var, 48);
            oq5Var2 = oq5Var2;
            kjnVar = kjnVar;
            z = false;
            vciVar = vciVar2;
            i3 = i4;
        }
        oq5 oq5Var3 = oq5Var2;
        oq5Var3.p(z);
        oq5Var3.p(true);
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        xu4 xu4Var = (xu4) this.b;
        fvf fvfVar = (fvf) this.c;
        pu4 pu4Var = (pu4) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            boolean d = Intrinsics.d(xu4Var, vu4.a);
            vci vciVar = vci.a;
            if (d) {
                oq5Var.Z(1360178131);
                ild.g(a.l(vciVar, o0kVar), oq5Var, 0);
                oq5Var.p(false);
            } else if (xu4Var instanceof wu4) {
                oq5Var.Z(1360338649);
                wu4 wu4Var = (wu4) xu4Var;
                xee.e(wu4Var.a, wu4Var.b, fvfVar, o0kVar, pu4Var, oq5Var, (intValue << 9) & 7168);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(xu4Var, uu4.a)) {
                    throw vz1.i(oq5Var, 1290801773, false);
                }
                oq5Var.Z(1360693754);
                yci c = d.c(a.l(vciVar, o0kVar), 1.0f);
                kfh d2 = ug3.d(b2c.c, false);
                int i = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var, i, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                float f = 16;
                xcs.b(rvf.M(R.string.collection_albums_empty, oq5Var), androidx.compose.ui.platform.a.a(a.q(vciVar, f, 64, f, 0.0f, 8), "collection_albums_empty"), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65016);
                oq5Var.p(true);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        cw4 cw4Var = (cw4) this.b;
        tv4 tv4Var = (tv4) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(cw4Var, aw4.a)) {
            oq5Var.Z(-726556946);
            lxe.d(o0kVar, null, oq5Var, intValue & 14);
            oq5Var.p(false);
        } else if (cw4Var instanceof bw4) {
            oq5Var.Z(-726551815);
            irf.k(((bw4) cw4Var).a, tv4Var, fvfVar, o0kVar, oq5Var, (intValue << 9) & 7168);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(cw4Var, zv4.a)) {
                throw vz1.i(oq5Var, -726557951, false);
            }
            oq5Var.Z(-1047959752);
            vci vciVar = vci.a;
            yci c = d.c(a.l(vciVar, o0kVar), 1.0f);
            kfh d = ug3.d(b2c.c, false);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f = 16;
            xcs.b(rvf.M(R.string.collection_artists_empty, oq5Var), androidx.compose.ui.platform.a.a(a.q(vciVar, f, 64, f, 0.0f, 8), "collection_artists_empty"), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65016);
            oq5Var.p(true);
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        l65 l65Var = (l65) this.b;
        fvf fvfVar = (fvf) this.c;
        k65 k65Var = (k65) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            fgq.h(l65Var.a, l65Var.b, fvfVar, o0kVar, k65Var, oq5Var, (intValue << 9) & 7168);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        o0k o0kVar = (o0k) this.b;
        tsf tsfVar = (tsf) this.c;
        ut5 ut5Var = (ut5) this.d;
        bu5 bu5Var = (bu5) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        bu5Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bu5Var) : ((oq5) hq5Var).h(bu5Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        boolean z = bu5Var instanceof zt5;
        vci vciVar = vci.a;
        if (z) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1179613973);
            float f = 16;
            leu.f(tsfVar, ((zt5) bu5Var).a, ut5Var, ghh.C(ghh.C(o0kVar, zs4.g(oq5Var2)), ogp.A(oq5Var2)), a.q(vciVar, f, 0.0f, f, f, 2), oq5Var2, 24576);
            oq5Var2.p(false);
        } else {
            if (!bu5Var.equals(au5.a)) {
                throw vz1.i((oq5) hq5Var, -1423527247, false);
            }
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-1178835346);
            ut5Var.getClass();
            oq5Var3.Z(-1381251639);
            nmj nmjVar = ut5Var.f;
            t tVar = ut5Var.b;
            tmb tmbVar = ut5Var.e;
            boolean h = oq5Var3.h(ut5Var);
            Object K = oq5Var3.K();
            if (h || K == gq5.a) {
                K = new ti1(2, ut5Var);
                oq5Var3.k0(K);
            }
            jmj b = nmjVar.b((dmj) K, tVar, tmbVar, 1, oq5Var3, 36352);
            oq5Var3.p(false);
            ivf.g(b, d.x(bfg.Q(d.c(a.l(vciVar, ghh.C(ghh.C(o0kVar, zs4.g(oq5Var3)), ogp.A(oq5Var3))), 1.0f), bfg.C(oq5Var3), false, 14), b2c.f, 2), false, null, oq5Var3, 0, 12);
            oq5Var3.p(false);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r12.K(), java.lang.Integer.valueOf(r13)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj, Object obj2, Object obj3) {
        Function2 function2;
        Function2 function22;
        iz2 iz2Var;
        boolean z;
        iz2 iz2Var2;
        boolean z2;
        Function2 function23 = (Function2) this.b;
        Function2 function24 = (Function2) this.c;
        Function2 function25 = (Function2) this.d;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        iz2 iz2Var3 = b2c.b;
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        float f = 8;
        float f2 = ((cma) yhn.a(new cma((cVar.d() - (2 * f)) / 3), new cma(0))).a;
        vci vciVar = vci.a;
        yci d = d.d(vciVar, 1.0f);
        x2i x2iVar = qx0.a;
        nho a = lho.a(qx0.h(f, b2c.n), b2c.k, hq5Var, 6);
        oq5 oq5Var2 = (oq5) hq5Var;
        int i = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        yci H = vnj.H(hq5Var, d);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        kb5 kb5Var = wp5.f;
        g0g.U(hq5Var, a, kb5Var);
        kb5 kb5Var2 = wp5.e;
        g0g.U(hq5Var, l, kb5Var2);
        kb5 kb5Var3 = wp5.g;
        if (oq5Var2.O) {
            function2 = function25;
        } else {
            function2 = function25;
        }
        ouj.x(i, oq5Var2, i, kb5Var3);
        kb5 kb5Var4 = wp5.d;
        g0g.U(hq5Var, H, kb5Var4);
        if (function23 != null) {
            oq5Var2.Z(-295798860);
            yci r = d.r(vciVar, f2);
            kfh d2 = ug3.d(iz2Var3, false);
            int i2 = oq5Var2.P;
            function22 = function24;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(hq5Var, r);
            oq5Var2.d0();
            iz2Var = iz2Var3;
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(hq5Var, d2, kb5Var);
            g0g.U(hq5Var, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var3);
            }
            g0g.U(hq5Var, H2, kb5Var4);
            function23.invoke(hq5Var, 0);
            oq5Var2.p(true);
            z = false;
        } else {
            function22 = function24;
            iz2Var = iz2Var3;
            z = false;
            oq5Var2.Z(-305392430);
        }
        oq5Var2.p(z);
        if (function22 != null) {
            oq5Var2.Z(-295632421);
            yci r2 = d.r(vciVar, f2);
            iz2Var2 = iz2Var;
            kfh d3 = ug3.d(iz2Var2, z);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H3 = vnj.H(hq5Var, r2);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(hq5Var, d3, kb5Var);
            g0g.U(hq5Var, l3, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            g0g.U(hq5Var, H3, kb5Var4);
            function22.invoke(hq5Var, 0);
            oq5Var2.p(true);
            z = false;
        } else {
            iz2Var2 = iz2Var;
            oq5Var2.Z(-305392430);
        }
        oq5Var2.p(z);
        if (function2 != null) {
            oq5Var2.Z(-295468617);
            yci r3 = d.r(vciVar, f2);
            kfh d4 = ug3.d(iz2Var2, z);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l4 = oq5Var2.l();
            yci H4 = vnj.H(hq5Var, r3);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(hq5Var, d4, kb5Var);
            g0g.U(hq5Var, l4, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            g0g.U(hq5Var, H4, kb5Var4);
            function2.invoke(hq5Var, 0);
            z2 = true;
            oq5Var2.p(true);
            z = false;
        } else {
            z2 = true;
            oq5Var2.Z(-305392430);
        }
        oq5Var2.p(z);
        oq5Var2.p(z2);
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        mda mdaVar = (mda) this.b;
        hda hdaVar = (hda) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(mdaVar, kda.b)) {
            oq5Var.Z(-788204607);
            oq5Var.p(false);
        } else if (mdaVar instanceof lda) {
            oq5Var.Z(113124525);
            bkp.M(((lda) mdaVar).a, hdaVar, fvfVar, o0kVar, oq5Var, (intValue << 9) & 7168);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(mdaVar, kda.a)) {
                throw vz1.i(oq5Var, 113119955, false);
            }
            oq5Var.Z(113133058);
            fgq.n(0, oq5Var, androidx.compose.ui.platform.a.a(d.c(a.l(vci.a, o0kVar), 1.0f), "collection_downloaded_albums_empty"), rvf.M(R.string.downloaded_albums_empty, oq5Var));
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        eea eeaVar = (eea) this.b;
        yda ydaVar = (yda) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(eeaVar, cea.a)) {
            oq5Var.Z(1981898151);
            oq5Var.p(false);
        } else {
            if (!(eeaVar instanceof dea)) {
                throw vz1.i(oq5Var, 756667061, false);
            }
            oq5Var.Z(756672042);
            fgq.l(((dea) eeaVar).a, ydaVar, fvfVar, o0kVar, oq5Var, (intValue << 9) & 7168);
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        wea weaVar = (wea) this.b;
        tea teaVar = (tea) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(weaVar, uea.b)) {
            oq5Var.Z(-1716249689);
            oq5Var.p(false);
        } else if (weaVar instanceof vea) {
            oq5Var.Z(221734937);
            vea veaVar = (vea) weaVar;
            vut.m(veaVar.b, veaVar.a, teaVar, fvfVar, o0kVar, oq5Var, (intValue << 12) & 57344);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(weaVar, uea.a)) {
                throw vz1.i(oq5Var, 221730431, false);
            }
            oq5Var.Z(221744991);
            fgq.n(0, oq5Var, androidx.compose.ui.platform.a.a(d.c(a.l(vci.a, o0kVar), 1.0f), "collection_downloaded_audiobooks_empty"), rvf.M(R.string.downloaded_books_empty, oq5Var));
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        xfa xfaVar = (xfa) this.b;
        rfa rfaVar = (rfa) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(xfaVar, vfa.b)) {
            oq5Var.Z(-391587683);
            oq5Var.p(false);
        } else if (xfaVar instanceof wfa) {
            oq5Var.Z(1927033967);
            wfa wfaVar = (wfa) xfaVar;
            i4w.i(wfaVar.a, wfaVar.b, wfaVar.c, rfaVar, fvfVar, o0kVar, oq5Var, (intValue << 15) & 458752);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(xfaVar, vfa.a)) {
                throw vz1.i(oq5Var, 1927029515, false);
            }
            oq5Var.Z(1927045346);
            fgq.n(0, oq5Var, androidx.compose.ui.platform.a.a(d.c(a.l(vci.a, o0kVar), 1.0f), "collection_downloaded_kids_empty"), rvf.M(R.string.downloaded_kids_empty, oq5Var));
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        cia ciaVar = (cia) this.b;
        xha xhaVar = (xha) this.c;
        fvf fvfVar = (fvf) this.d;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(ciaVar, aia.b)) {
            oq5Var.Z(1281391774);
            oq5Var.p(false);
        } else if (ciaVar instanceof bia) {
            oq5Var.Z(1703905199);
            bia biaVar = (bia) ciaVar;
            u2x.k(biaVar.a, biaVar.b, xhaVar, fvfVar, o0kVar, oq5Var, (intValue << 12) & 57344);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(ciaVar, aia.a)) {
                throw vz1.i(oq5Var, 1703901782, false);
            }
            oq5Var.Z(1703915474);
            fgq.n(0, oq5Var, androidx.compose.ui.platform.a.a(d.c(a.l(vci.a, o0kVar), 1.0f), "collection_downloaded_podcasts_empty"), rvf.M(R.string.downloaded_podcasts_empty, oq5Var));
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        lxa lxaVar = (lxa) this.b;
        oxa oxaVar = (oxa) this.c;
        txa txaVar = (txa) this.d;
        nls nlsVar = (nls) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        nlsVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(nlsVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
        }
        mm6 mm6Var = ((fs5) K).a;
        boolean h = oq5Var2.h(lxaVar);
        Object K2 = oq5Var2.K();
        if (h || K2 == kjnVar) {
            K2 = new at5(21, lxaVar);
            oq5Var2.k0(K2);
        }
        Function1 function1 = (Function1) K2;
        oq5Var2.a0(419377738);
        kfu a = rpg.a(oq5Var2);
        if (a == null) {
            xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        bfu R = ngg.R(ern.a(xxa.class), a, null, k5r.g(xxa.class, new p97(1), function1), a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var2);
        oq5Var2.p(false);
        xxa xxaVar = (xxa) R;
        Object K3 = oq5Var2.K();
        if (K3 == kjnVar) {
            K3 = new sxa(xxaVar, oxaVar, txaVar, mm6Var);
            oq5Var2.k0(K3);
        }
        ild.j(nlsVar, (sxa) K3, oq5Var2, (intValue & 14) | 64);
        return Unit.a;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d41 d41Var;
        Object k3Var;
        ArrayList arrayList;
        fvf fvfVar;
        ges gesVar;
        String str;
        int i = this.a;
        vci vciVar = vci.a;
        Object obj4 = gq5.a;
        int i2 = 14;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                nsh nshVar = (nsh) obj7;
                mqs mqsVar = (mqs) obj6;
                sai saiVar = (sai) obj5;
                bci bciVar = (bci) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                yk ykVar = (yk) nshVar.b;
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f = oq5Var2.f(saiVar);
                Object K = oq5Var2.K();
                if (f || K == obj4) {
                    K = new c3(0, saiVar, sai.class, "hide", "hide()V", 0, 5);
                    oq5Var2.k0(K);
                }
                Function0 function0 = (Function0) ((h9f) K);
                dl dlVar = ykVar.a;
                mqsVar.getClass();
                function0.getClass();
                Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
                Object K2 = oq5Var2.K();
                if (K2 == obj4) {
                    K2 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
                }
                mm6 mm6Var = ((fs5) K2).a;
                boolean f2 = oq5Var2.f(context) | oq5Var2.f(function0);
                Object K3 = oq5Var2.K();
                if (f2 || K3 == obj4) {
                    context.getClass();
                    K3 = new el(context, function0);
                    oq5Var2.k0(K3);
                }
                el elVar = (el) K3;
                boolean f3 = oq5Var2.f(mqsVar) | oq5Var2.f(elVar);
                Object K4 = oq5Var2.K();
                if (f3 || K4 == obj4) {
                    K4 = new il(mqsVar, dlVar, elVar, mm6Var);
                    oq5Var2.k0(K4);
                }
                il ilVar = (il) K4;
                aqi Q = szf.Q(ilVar.d, oq5Var2);
                ml mlVar = (ml) Q.getValue();
                if (Intrinsics.d(mlVar, kl.a)) {
                    oq5Var2.Z(1944502504);
                    oq5Var2.p(false);
                } else {
                    if (!Intrinsics.d(mlVar, ll.a) && !(mlVar instanceof jl)) {
                        throw vz1.i(oq5Var2, 1944500709, false);
                    }
                    oq5Var2.Z(150169681);
                    jf0.a(new qzm[0], (pu0) nshVar.c, false, ild.C(508543709, new x3(2, bciVar, ilVar, Q), oq5Var2), oq5Var2, 0, 4);
                    oq5Var2.p(false);
                }
                return Unit.a;
            case 1:
                ml mlVar2 = (ml) obj7;
                fvf fvfVar2 = (fvf) obj6;
                il ilVar2 = (il) obj5;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                if (Intrinsics.d(mlVar2, kl.a) || Intrinsics.d(mlVar2, ll.a)) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(-774211581);
                    j66.c(0, oq5Var4);
                    oq5Var4.p(false);
                } else {
                    if (!(mlVar2 instanceof jl)) {
                        throw vz1.i((oq5) hq5Var2, -1964639885, false);
                    }
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(-774057232);
                    q0k c = a.c(0.0f, 0.0f, 0.0f, 32, 7);
                    boolean h = oq5Var5.h(ilVar2) | oq5Var5.h(mlVar2);
                    Object K5 = oq5Var5.K();
                    if (h || K5 == obj4) {
                        K5 = new kc(2, mlVar2, ilVar2);
                        oq5Var5.k0(K5);
                    }
                    weo.g(null, fvfVar2, c, null, null, null, false, (Function1) K5, oq5Var5, 384, 249);
                    oq5Var5.p(false);
                }
                return Unit.a;
            case 2:
                gy7 gy7Var = (gy7) obj7;
                ht htVar = (ht) obj6;
                sai saiVar2 = (sai) obj5;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var7 = (oq5) hq5Var3;
                boolean h2 = oq5Var7.h(htVar) | oq5Var7.f(saiVar2);
                Object K6 = oq5Var7.K();
                if (h2 || K6 == obj4) {
                    K6 = new kc(4, htVar, saiVar2);
                    oq5Var7.k0(K6);
                }
                pd.k(gy7Var, (Function1) K6, null, oq5Var7, 8);
                return Unit.a;
            case 3:
                c50 c50Var = (c50) obj7;
                v40 v40Var = (v40) obj6;
                fvf fvfVar3 = (fvf) obj5;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var8 = (oq5) hq5Var4;
                if (!oq5Var8.P(intValue4 & 1, (intValue4 & 19) != 18)) {
                    oq5Var8.S();
                } else if (Intrinsics.d(c50Var, a50.b)) {
                    oq5Var8.Z(-1868756034);
                    oq5Var8.p(false);
                } else if (c50Var instanceof b50) {
                    oq5Var8.Z(771004422);
                    ox6.b(((b50) c50Var).a, v40Var, fvfVar3, o0kVar, oq5Var8, (intValue4 << 9) & 7168);
                    oq5Var8.p(false);
                } else {
                    if (!Intrinsics.d(c50Var, a50.a)) {
                        throw vz1.i(oq5Var8, 771000343, false);
                    }
                    oq5Var8.Z(771012392);
                    fgq.n(0, oq5Var8, androidx.compose.ui.platform.a.a(d.c(a.l(vciVar, o0kVar), 1.0f), "collection_downloaded_audiobooks_empty"), rvf.M(R.string.downloaded_books_empty, oq5Var8));
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 4:
                t41 t41Var = (t41) obj7;
                d41 d41Var2 = (d41) obj6;
                fvf fvfVar4 = (fvf) obj5;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var9 = (oq5) hq5Var5;
                if (!oq5Var9.P(intValue5 & 1, (intValue5 & 19) != 18)) {
                    oq5Var9.S();
                } else if (Intrinsics.d(t41Var, s41.a)) {
                    oq5Var9.Z(-1140227930);
                    yci l = a.l(vciVar, o0kVar2);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var9, 0);
                    int i3 = oq5Var9.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var9.l();
                    yci H = vnj.H(oq5Var9, l);
                    xp5.T.getClass();
                    Function0 function02 = wp5.b;
                    oq5Var9.d0();
                    if (oq5Var9.O) {
                        oq5Var9.k(function02);
                    } else {
                        oq5Var9.n0();
                    }
                    g0g.U(oq5Var9, a, wp5.f);
                    g0g.U(oq5Var9, l2, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var9.O || !Intrinsics.d(oq5Var9.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var9, i3, kb5Var);
                    }
                    g0g.U(oq5Var9, H, wp5.d);
                    pm0.a(null, vnj.a, oq5Var9, 48, 1);
                    oq5Var9.p(true);
                    oq5Var9.p(false);
                } else if (t41Var instanceof r41) {
                    oq5Var9.Z(-1139638217);
                    boolean z = ((r41) t41Var).c;
                    boolean h3 = oq5Var9.h(d41Var2);
                    Object K7 = oq5Var9.K();
                    if (h3 || K7 == obj4) {
                        d41Var = d41Var2;
                        K7 = new zy(0, d41Var, d41.class, "onRefresh", "onRefresh()V", 0, 26);
                        oq5Var9.k0(K7);
                    } else {
                        d41Var = d41Var2;
                    }
                    bfg.f(z, (Function0) ((h9f) K7), o0kVar2, null, false, ild.C(-1397861296, new wl(fvfVar4, o0kVar2, t41Var, d41Var, 11), oq5Var9), oq5Var9, ((intValue5 << 6) & 896) | 196608, 24);
                    oq5Var9.p(false);
                } else {
                    if (!Intrinsics.d(t41Var, q41.a)) {
                        throw vz1.i(oq5Var9, -1976444746, false);
                    }
                    oq5Var9.Z(-1138387677);
                    yci l3 = a.l(d.c(vciVar, 1.0f), o0kVar2);
                    kfh d = ug3.d(b2c.f, false);
                    int i4 = oq5Var9.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var9.l();
                    yci H2 = vnj.H(oq5Var9, l3);
                    xp5.T.getClass();
                    Function0 function03 = wp5.b;
                    oq5Var9.d0();
                    if (oq5Var9.O) {
                        oq5Var9.k(function03);
                    } else {
                        oq5Var9.n0();
                    }
                    g0g.U(oq5Var9, d, wp5.f);
                    g0g.U(oq5Var9, l4, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var9.O || !Intrinsics.d(oq5Var9.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var9, i4, kb5Var2);
                    }
                    g0g.U(oq5Var9, H2, wp5.d);
                    ivf.g(d41Var2.e(oq5Var9), null, false, null, oq5Var9, 0, 14);
                    oq5Var9.p(true);
                    oq5Var9.p(false);
                }
                return Unit.a;
            case 5:
                nii niiVar = (nii) obj7;
                final s61 s61Var = (s61) obj6;
                final k61 k61Var = (k61) obj5;
                c cVar = (c) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(cVar) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                final float A = w1g.A(cVar.e(), hq5Var6);
                jf0.m(niiVar, s61Var.a.size(), 1, Integer.MAX_VALUE, ild.C(-896189926, new tyc() { // from class: j61
                    @Override // defpackage.tyc
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
                        int i5;
                        int intValue7 = ((Integer) obj8).intValue();
                        int intValue8 = ((Integer) obj9).intValue();
                        int intValue9 = ((Integer) obj10).intValue();
                        hq5 hq5Var7 = (hq5) obj11;
                        int intValue10 = ((Integer) obj12).intValue();
                        if ((intValue10 & 6) == 0) {
                            i5 = (((oq5) hq5Var7).d(intValue7) ? 4 : 2) | intValue10;
                        } else {
                            i5 = intValue10;
                        }
                        if ((intValue10 & 48) == 0) {
                            i5 |= ((oq5) hq5Var7).d(intValue8) ? 32 : 16;
                        }
                        if ((intValue10 & 384) == 0) {
                            i5 |= ((oq5) hq5Var7).d(intValue9) ? 256 : 128;
                        }
                        if ((i5 & 1171) == 1170) {
                            oq5 oq5Var11 = (oq5) hq5Var7;
                            if (oq5Var11.z()) {
                                oq5Var11.S();
                                return Unit.a;
                            }
                        }
                        m7a m7aVar = (m7a) s61.this.a.get(intValue7);
                        spd spdVar = new spd(intValue8, intValue9, intValue7);
                        s7a K8 = xee.K(m7aVar);
                        yci b = b.b(a.o(d.d(vci.a, 1.0f), 16, 0.0f, 2), intValue7);
                        oq5 oq5Var12 = (oq5) hq5Var7;
                        k61 k61Var2 = k61Var;
                        boolean h4 = oq5Var12.h(k61Var2) | oq5Var12.h(m7aVar) | oq5Var12.h(spdVar);
                        Object K9 = oq5Var12.K();
                        kjn kjnVar = gq5.a;
                        if (h4 || K9 == kjnVar) {
                            K9 = new x3(15, k61Var2, m7aVar, spdVar);
                            oq5Var12.k0(K9);
                        }
                        yci b2 = com.yandex.music.core.ui.compose.a.b(b, null, 0L, 0.0f, null, (Function2) K9, 15);
                        boolean h5 = oq5Var12.h(k61Var2) | oq5Var12.h(m7aVar) | oq5Var12.h(spdVar);
                        Object K10 = oq5Var12.K();
                        if (h5 || K10 == kjnVar) {
                            K10 = new vd(3, k61Var2, m7aVar, spdVar);
                            oq5Var12.k0(K10);
                        }
                        qld.i(K8, A, (Function0) K10, b2, null, oq5Var12, 24576);
                        return Unit.a;
                    }
                }, hq5Var6), androidx.compose.ui.platform.a.a(vciVar, "donations_horizontal_pager"), null, 0.0f, 0.0f, hq5Var6, 28032, 480);
                return Unit.a;
            case 6:
                qxp qxpVar = (qxp) obj7;
                c91 c91Var = (c91) obj6;
                l81 l81Var = (l81) obj5;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue7 & 17) == 16) {
                    oq5 oq5Var11 = (oq5) hq5Var7;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                Object obj8 = qxpVar.a;
                irf.r(a0g.E(2131231902, 0, hq5Var7), null, d.m(androidx.compose.ui.platform.a.a(a.q(vci.a, 16, 0.0f, 12, 0.0f, 10), "familiar_you_icon"), 80), null, null, 0.0f, null, hq5Var7, 432, 120);
                String str2 = c91Var.a;
                String str3 = c91Var.b;
                oq5 oq5Var12 = (oq5) hq5Var7;
                boolean h4 = oq5Var12.h(l81Var) | oq5Var12.f(c91Var);
                Object K8 = oq5Var12.K();
                if (h4 || K8 == obj4) {
                    K8 = new x61(l81Var, c91Var, 0);
                    oq5Var12.k0(K8);
                }
                irf.h(str2, null, str3, null, (Function0) K8, false, null, false, null, oq5Var12, 0, 490);
                return Unit.a;
            case 7:
                o0k o0kVar3 = (o0k) obj7;
                fvf fvfVar5 = (fvf) obj6;
                t71 t71Var = (t71) obj5;
                c81 c81Var = (c81) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                c81Var.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var8).f(c81Var) ? 4 : 2;
                }
                oq5 oq5Var13 = (oq5) hq5Var8;
                if (!oq5Var13.P(intValue8 & 1, (intValue8 & 19) != 18)) {
                    oq5Var13.S();
                } else if (c81Var.d) {
                    oq5Var13.Z(-1798437014);
                    bkp.H(d.d(vciVar, 1.0f), oq5Var13, 6);
                    oq5Var13.p(false);
                } else if (c81Var.b.isEmpty() && c81Var.c.isEmpty()) {
                    oq5Var13.Z(-1798220076);
                    xcs.b(rvf.M(R.string.artist_familiar_collection_no_tracks, oq5Var13), androidx.compose.ui.platform.a.a(a.m(a.l(vciVar, o0kVar3), 16), "familiar_collection_empty_text"), ((dq0) oq5Var13.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var13, 0, 0, 65528);
                    oq5Var13.p(false);
                } else {
                    oq5Var13.Z(-1797631479);
                    yci a2 = androidx.compose.ui.platform.a.a(vciVar, "familiar_collection_list");
                    boolean h5 = oq5Var13.h(t71Var) | ((intValue8 & 14) == 4);
                    Object K9 = oq5Var13.K();
                    if (h5 || K9 == obj4) {
                        K9 = new kc(i2, c81Var, t71Var);
                        oq5Var13.k0(K9);
                    }
                    weo.f(a2, fvfVar5, o0kVar3, null, null, null, false, null, (Function1) K9, oq5Var13, 6, 504);
                    oq5Var13.p(false);
                }
                return Unit.a;
            case 8:
                b81 b81Var = (b81) obj7;
                ArrayList arrayList2 = (ArrayList) obj6;
                Function1 function1 = (Function1) obj5;
                hq5 hq5Var9 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                fvf a3 = hvf.a(0, 0, hq5Var9, 0, 3);
                oq5 oq5Var14 = (oq5) hq5Var9;
                boolean f4 = oq5Var14.f(arrayList2) | oq5Var14.d(b81Var.ordinal()) | oq5Var14.f(a3);
                Object K10 = oq5Var14.K();
                if (f4 || K10 == obj4) {
                    arrayList = arrayList2;
                    k3Var = new k3(arrayList, b81Var, a3, (Continuation) null, 15);
                    fvfVar = a3;
                    oq5Var14.k0(k3Var);
                } else {
                    k3Var = K10;
                    fvfVar = a3;
                    arrayList = arrayList2;
                }
                gld.w(oq5Var14, b81Var, (Function2) k3Var);
                float f5 = 16;
                float f6 = 8;
                q0k q0kVar = new q0k(f5, f6, f5, f6);
                boolean f7 = oq5Var14.f(arrayList) | oq5Var14.d(b81Var.ordinal()) | oq5Var14.f(function1);
                Object K11 = oq5Var14.K();
                if (f7 || K11 == obj4) {
                    K11 = new g3(7, arrayList, b81Var, function1);
                    oq5Var14.k0(K11);
                }
                weo.i(vci.a, fvfVar, q0kVar, false, null, null, null, false, null, (Function1) K11, oq5Var14, 390, 504);
                return Unit.a;
            case 9:
                vm vmVar = (vm) obj7;
                fvf fvfVar6 = (fvf) obj6;
                t71 t71Var2 = (t71) obj5;
                d81 d81Var = (d81) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                d81Var.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var10).f(d81Var) ? 4 : 2;
                }
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (!oq5Var15.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    oq5Var15.S();
                } else if (d81Var.c) {
                    oq5Var15.Z(-501507414);
                    bkp.H(d.d(vciVar, 1.0f), oq5Var15, 6);
                    oq5Var15.p(false);
                } else if (d81Var.b.isEmpty()) {
                    oq5Var15.Z(-501292956);
                    xcs.b(rvf.M(R.string.artist_familiar_wave_no_tracks, oq5Var15), a.m(a.l(vciVar, vmVar), 16), ((dq0) oq5Var15.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var15, 0, 0, 65528);
                    oq5Var15.p(false);
                } else {
                    oq5Var15.Z(-500856879);
                    yci a4 = androidx.compose.ui.platform.a.a(vciVar, "familiar_wave_track_list");
                    boolean h6 = oq5Var15.h(t71Var2) | ((intValue9 & 14) == 4);
                    Object K12 = oq5Var15.K();
                    if (h6 || K12 == obj4) {
                        K12 = new kc(15, d81Var, t71Var2);
                        oq5Var15.k0(K12);
                    }
                    weo.f(a4, fvfVar6, vmVar, null, null, null, false, null, (Function1) K12, oq5Var15, 6, 504);
                    oq5Var15.p(false);
                }
                return Unit.a;
            case 10:
                ka1 ka1Var = (ka1) obj7;
                yci yciVar = (yci) obj6;
                Function0 function04 = (Function0) obj5;
                uvd uvdVar = (uvd) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                uvdVar.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= (intValue10 & 8) == 0 ? ((oq5) hq5Var11).f(uvdVar) : ((oq5) hq5Var11).h(uvdVar) ? 4 : 2;
                }
                if ((intValue10 & 19) == 18) {
                    oq5 oq5Var16 = (oq5) hq5Var11;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        return Unit.a;
                    }
                }
                bkp.R(uvdVar, ka1Var.b, function04, androidx.compose.ui.platform.a.a(yciVar, "title"), nu0.e(), hq5Var11, intValue10 & 14, 0);
                return Unit.a;
            case 11:
                yci yciVar2 = (yci) obj7;
                aqi aqiVar = (aqi) obj6;
                String str4 = (String) obj5;
                c cVar2 = (c) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var12).f(cVar2) ? 4 : 2;
                }
                oq5 oq5Var17 = (oq5) hq5Var12;
                if (oq5Var17.P(intValue11 & 1, (intValue11 & 19) != 18)) {
                    yci a5 = androidx.compose.animation.b.a(yciVar2, null, 3);
                    String M = rvf.M(R.string.expand_more, oq5Var17);
                    Object K13 = oq5Var17.K();
                    if (K13 == obj4) {
                        K13 = vz1.h(oq5Var17);
                    }
                    uoi uoiVar = (uoi) K13;
                    boolean f8 = oq5Var17.f(aqiVar);
                    Object K14 = oq5Var17.K();
                    if (f8 || K14 == obj4) {
                        K14 = new jc(aqiVar, 2);
                        oq5Var17.k0(K14);
                    }
                    yci d2 = androidx.compose.foundation.a.d(a5, uoiVar, null, false, M, null, (Function0) K14, 20);
                    ta5 a6 = sa5.a(qx0.c, b2c.n, oq5Var17, 0);
                    int i5 = oq5Var17.P;
                    androidx.compose.runtime.internal.a l5 = oq5Var17.l();
                    yci H3 = vnj.H(oq5Var17, d2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var17.d0();
                    if (oq5Var17.O) {
                        oq5Var17.k(grbVar);
                    } else {
                        oq5Var17.n0();
                    }
                    g0g.U(oq5Var17, a6, wp5.f);
                    g0g.U(oq5Var17, l5, wp5.e);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var17.O || !Intrinsics.d(oq5Var17.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var17, i5, kb5Var3);
                    }
                    g0g.U(oq5Var17, H3, wp5.d);
                    ges j = nu0.j();
                    int b = eeh.b(200 / ff7.P(j.b.c, oq5Var17));
                    ids O = o5g.O(0, 1, oq5Var17);
                    boolean f9 = oq5Var17.f(str4);
                    Object K15 = oq5Var17.K();
                    if (f9 || K15 == obj4) {
                        gesVar = j;
                        K15 = ids.a(O, str4, gesVar, 0, false, 0, cVar2.b, 988);
                        str = str4;
                        oq5Var17.k0(K15);
                    } else {
                        str = str4;
                        gesVar = j;
                    }
                    cds cdsVar = (cds) K15;
                    agr agrVar = eq0.a;
                    xcs.b(str, null, ((dq0) oq5Var17.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, !((Boolean) aqiVar.getValue()).booleanValue() ? b : Integer.MAX_VALUE, 0, null, gesVar, oq5Var17, 0, 48, 55290);
                    if (((Boolean) aqiVar.getValue()).booleanValue() || cdsVar.b.f <= b) {
                        oq5Var17.Z(936409628);
                    } else {
                        oq5Var17.Z(939093267);
                        xcs.b(vz1.o(vciVar, 2, oq5Var17, R.string.expand_more, oq5Var17), null, ((dq0) oq5Var17.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var17, 0, 0, 65530);
                    }
                    oq5Var17.p(false);
                    oq5Var17.p(true);
                } else {
                    oq5Var17.S();
                }
                return Unit.a;
            case 12:
                u51 u51Var = (u51) obj7;
                m71 m71Var = (m71) obj6;
                sai saiVar3 = (sai) obj5;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue12 & 17) == 16) {
                    oq5 oq5Var18 = (oq5) hq5Var13;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        return Unit.a;
                    }
                }
                yci a0 = gut.a0(vciVar);
                oq5 oq5Var19 = (oq5) hq5Var13;
                boolean f10 = oq5Var19.f(m71Var) | oq5Var19.f(saiVar3);
                Object K16 = oq5Var19.K();
                if (f10 || K16 == obj4) {
                    K16 = new hb(23, m71Var, saiVar3);
                    oq5Var19.k0(K16);
                }
                sj2.a(u51Var, (Function0) K16, a0, oq5Var19, 0);
                return Unit.a;
            case 13:
                return a(obj, obj2, obj3);
            case 14:
                pyc pycVar = (pyc) obj7;
                Function2 function2 = (Function2) obj6;
                Function2 function22 = (Function2) obj5;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((oq5) hq5Var14).f(zknVar) ? 4 : 2;
                }
                if ((intValue13 & 19) == 18) {
                    oq5 oq5Var20 = (oq5) hq5Var14;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var21 = (oq5) hq5Var14;
                    oq5Var21.Z(1957456977);
                    pycVar.invoke(((as1) k).a, oq5Var21, 0);
                    oq5Var21.p(false);
                } else if (Intrinsics.d(k, xr1.a) || (k instanceof zr1)) {
                    oq5 oq5Var22 = (oq5) hq5Var14;
                    oq5Var22.Z(1957614333);
                    function2.invoke(oq5Var22, 0);
                    oq5Var22.p(false);
                } else {
                    if (!(k instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var14, -352500911, false);
                    }
                    oq5 oq5Var23 = (oq5) hq5Var14;
                    oq5Var23.Z(1957715455);
                    function22.invoke(oq5Var23, 0);
                    oq5Var23.p(false);
                }
                return Unit.a;
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return k(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return p(obj, obj2, obj3);
            case 25:
                return q(obj, obj2, obj3);
            case 26:
                return r(obj, obj2, obj3);
            case 27:
                return s(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj, obj2, obj3);
            default:
                keb kebVar = (keb) obj7;
                heb hebVar = (heb) obj6;
                fvf fvfVar7 = (fvf) obj5;
                o0k o0kVar4 = (o0k) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                o0kVar4.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var15).f(o0kVar4) ? 4 : 2;
                }
                oq5 oq5Var24 = (oq5) hq5Var15;
                if (!oq5Var24.P(intValue14 & 1, (intValue14 & 19) != 18)) {
                    oq5Var24.S();
                } else if (Intrinsics.d(kebVar, ieb.b)) {
                    oq5Var24.Z(-466954008);
                    oq5Var24.p(false);
                } else if (kebVar instanceof jeb) {
                    oq5Var24.Z(-1539081646);
                    ff7.l(((jeb) kebVar).a, hebVar, fvfVar7, o0kVar4, oq5Var24, (intValue14 << 9) & 7168);
                    oq5Var24.p(false);
                } else {
                    if (!Intrinsics.d(kebVar, ieb.a)) {
                        throw vz1.i(oq5Var24, -1539085315, false);
                    }
                    oq5Var24.Z(-1539072925);
                    fgq.n(0, oq5Var24, d.c(a.l(vciVar, o0kVar4), 1.0f), rvf.M(R.string.downloaded_podcasts_empty, oq5Var24));
                    oq5Var24.p(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ xk(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
