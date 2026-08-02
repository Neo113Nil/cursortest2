package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.ui.zoom.compose.a;

/* loaded from: classes6.dex */
public abstract class qe61 {
    public static final byk0 a = cyk0.b(12);
    public static final byk0 b = cyk0.b(3);

    public static final void a(f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1877285657);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            xab1.a(f530Var.k(ljs0.c), null, wwg.S(1601311293, true, new asr0(7, tlsVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m28(f530Var, tlsVar, i, i2);
        }
    }

    public static final void b(int i, ehr0 ehr0Var, String str, sls slsVar, sls slsVar2, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-287512008);
        int i3 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.k(str) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024) | (btsVar.e(slsVar2) ? 16384 : 8192);
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar = (tse) Q;
            f530 c = bzk0.c(hbb1.b(ljs0.m(c530.a, 48.0f), dbb1.b(btsVar), ehr0Var, false, 12), AppColor$Palette.BgFloating, ehr0Var);
            boolean e = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | btsVar.e(tseVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new a(tseVar, slsVar, slsVar2);
                btsVar.o0(Q2);
            }
            f530 a2 = exw0.a(c, zy11.a, (PointerInputEventHandler) Q2);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a2);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            o4b1.b(mt71.m(i, i3 & 14, btsVar), str, null, null, mhe.f, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar), 5), btsVar, 24584 | ((i3 >> 3) & 112), 44);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(i, ehr0Var, str, slsVar, slsVar2, i2);
        }
    }

    public static final void c(int i, fid fidVar, tls tlsVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-539872418);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a2 = qic.a(new i43(1.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.d, d);
            int i3 = dzg0.ic_plus;
            String e = ohb1.e(btsVar, kyh0.mt_zoom_in_map_content_description);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new fc01(29, tlsVar);
                btsVar.o0(Q);
            }
            sls slsVar2 = (sls) Q;
            boolean z2 = i4 == 32;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new pe61(1, tlsVar);
                btsVar.o0(Q2);
            }
            b(i3, a, e, slsVar2, (sls) Q2, btsVar, 48);
            int i5 = dzg0.ic_minus;
            String e2 = ohb1.e(btsVar, kyh0.mt_zoom_out_map_content_description);
            boolean z3 = i4 == 32;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new pe61(3, tlsVar);
                btsVar.o0(Q3);
            }
            sls slsVar3 = (sls) Q3;
            boolean z4 = i4 == 32;
            Object Q4 = btsVar.Q();
            if (z4 || Q4 == o430Var) {
                Q4 = new pe61(4, tlsVar);
                btsVar.o0(Q4);
            }
            b(i5, b, e2, slsVar3, (sls) Q4, btsVar, 48);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new reg0(f530Var, tlsVar, i, 2);
        }
    }
}
