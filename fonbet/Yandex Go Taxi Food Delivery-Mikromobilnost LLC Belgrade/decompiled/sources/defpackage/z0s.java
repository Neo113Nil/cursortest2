package defpackage;

import android.R;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.layers.presentation.walkroute.e;
import ru.yandex.taxi.masstransit.model.BoardingWagon;

/* loaded from: classes6.dex */
public abstract class z0s {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.controlX1, R.attr.controlY1, R.attr.controlX2, R.attr.controlY2, R.attr.pathData};

    public static final void a(f711 f711Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-639636170);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(f711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(1368941232);
            c(f711Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(1369006704);
            b(f711Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(f711Var, f530Var, z, i, 22);
        }
    }

    public static final void b(f711 f711Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1797647081);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(f711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = q2h0.mt_train_car_selected;
            int i5 = q2h0.mt_train_car;
            String obj = f711Var.b.toString();
            f530 o = an91.o(an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 16.0f, 0.0f, 8.0f, 5), 56.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean k = btsVar.k(obj);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new il01(obj, 7);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(o, (tls) Q);
            lhl0 a3 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, a2);
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
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            d(f711Var, i4, i5, btsVar, i2 & 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vx11(f711Var, f530Var, i, i3);
        }
    }

    public static final void c(f711 f711Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(558780918);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(f711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i4 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i5 = q2h0.mt_train_car_selected_v2;
            int i6 = q2h0.mt_train_car_v2;
            f530 o = an91.o(an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13), a5l0.a - 4.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean e2 = btsVar.e(f711Var);
            Object Q = btsVar.Q();
            if (e2 || Q == did.a) {
                Q = new wx11(i4, f711Var);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(o, (tls) Q);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, a2);
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
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            e(f711Var, i5, i6, btsVar, i2 & 14);
            String obj = f711Var.b.toString();
            if (obj.length() > 0) {
                btsVar.e0(350443005);
                jeb1.f(obj, an91.o(c530.a, 0.0f, 4.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 432, 0, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(350626742);
                btsVar.t(false);
            }
            i3 = 1;
            btsVar.t(true);
        } else {
            i3 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vx11(f711Var, f530Var, i, i3);
        }
    }

    public static final void d(f711 f711Var, int i, int i2, fid fidVar, int i3) {
        int i4;
        int i5;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(265951869);
        if ((i3 & 6) == 0) {
            i4 = (btsVar.e(f711Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i;
            i4 |= btsVar.c(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & 384) == 0) {
            i6 = i2;
            i4 |= btsVar.c(i6) ? 256 : 128;
        } else {
            i6 = i2;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            pa90 k = vfc.k(q2h0.mt_train_start, 0, -1411607277, btsVar, false);
            c530 c530Var = c530.a;
            o4b1.b(k, null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            Set set = f711Var.a;
            o4b1.b(vfc.k(set.contains(BoardingWagon.HEAD) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            o4b1.b(vfc.k(set.contains(BoardingWagon.NEAR_THE_HEAD) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            o4b1.b(vfc.k(set.contains(BoardingWagon.MIDDLE) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            o4b1.b(vfc.k(set.contains(BoardingWagon.NEAR_THE_TAIL) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            o4b1.b(vfc.k(set.contains(BoardingWagon.TAIL) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            o4b1.b(vfc.k(q2h0.mt_train_end, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx11(f711Var, i5, i6, i3, 1);
        }
    }

    public static final void e(f711 f711Var, int i, int i2, fid fidVar, int i3) {
        int i4;
        int i5;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1576934119);
        if ((i3 & 6) == 0) {
            i4 = (btsVar.e(f711Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i;
            i4 |= btsVar.c(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & 384) == 0) {
            i6 = i2;
            i4 |= btsVar.c(i6) ? 256 : 128;
        } else {
            i6 = i2;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
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
            o4b1.b(vfc.k(q2h0.mt_train_start_v2, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, 0.5f));
            Set set = f711Var.a;
            o4b1.b(vfc.k(set.contains(BoardingWagon.HEAD) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, 0.33333334f));
            o4b1.b(vfc.k(set.contains(BoardingWagon.NEAR_THE_HEAD) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, 0.33333334f));
            o4b1.b(vfc.k(set.contains(BoardingWagon.MIDDLE) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, 0.33333334f));
            o4b1.b(vfc.k(set.contains(BoardingWagon.NEAR_THE_TAIL) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, 0.33333334f));
            o4b1.b(vfc.k(set.contains(BoardingWagon.TAIL) ? i5 : i6, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, 0.0f));
            o4b1.b(vfc.k(q2h0.mt_train_end_v2, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 56, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx11(f711Var, i5, i6, i3, 0);
        }
    }

    public static q4g f(z541 z541Var, e eVar) {
        z541Var.getClass();
        eVar.getClass();
        q4g q4gVar = new q4g(5);
        qcg qcgVar = new qcg(z541Var, 4);
        q4gVar.b = qcgVar;
        int i = 0;
        q4gVar.c = new w7u(qcgVar, new qcg(z541Var, 6), new qcg(z541Var, i), new qcg(z541Var, 1), 10);
        q4gVar.w = new qcg(z541Var, 3);
        q4gVar.x = i5m.b(new e641(new qcg(z541Var, 5), new qcg(z541Var, 2), i));
        int i2 = 7;
        q4gVar.y = i5m.b(new f241((w7u) q4gVar.c, i5m.b(new pso0((qcg) q4gVar.w, (xvf0) q4gVar.x, n3w.a(eVar), i2)), (qcg) q4gVar.b, new qcg(z541Var, i2)));
        return q4gVar;
    }

    public static jl80 g() {
        return kl80.a;
    }
}
