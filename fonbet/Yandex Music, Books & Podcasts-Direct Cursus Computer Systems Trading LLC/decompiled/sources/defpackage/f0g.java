package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.plus.bdui.plus.action.a0;
import com.yandex.plus.bdui.plus.action.z;
import com.yandex.plus.bdui.query.b;
import com.yandex.plus.bdui.query.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class f0g implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ f0g(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w4k E;
        int i = this.a;
        vci vciVar = vci.a;
        int i2 = 19;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(ua5Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                u1g.l(hq5Var, d.e(vciVar, 30));
                oq5 oq5Var2 = (oq5) hq5Var;
                if (((ma5) oq5Var2.j(pa5.a)).g()) {
                    oq5Var2.Z(-1568093196);
                    E = a0g.E(R.drawable.ic_likes_light, 0, hq5Var);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(-1568171595);
                    E = a0g.E(R.drawable.ic_likes_dark, 0, hq5Var);
                    oq5Var2.p(false);
                }
                w4k w4kVar = E;
                gz2 gz2Var = b2c.o;
                wa5 wa5Var = (wa5) ua5Var;
                irf.r(w4kVar, null, wa5Var.a(vciVar, gz2Var), null, null, 0.0f, null, hq5Var, 48, 120);
                float f = 24;
                u1g.l(hq5Var, d.e(vciVar, f));
                String M = rvf.M(R.string.like_bottom_sheet_title, hq5Var);
                ges c = nu0.c();
                agr agrVar = eq0.a;
                float f2 = 420;
                xcs.b(M, wa5Var.a(d.d(d.t(a.o(vciVar, f, 0.0f, 2), 0.0f, f2, 1), 1.0f), gz2Var), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c, hq5Var, 0, 0, 65016);
                u1g.l(hq5Var, d.e(vciVar, 12));
                xcs.b(rvf.M(R.string.like_bottom_sheet_main_text, hq5Var), wa5Var.a(d.d(d.t(a.o(vciVar, f, 0.0f, 2), 0.0f, f2, 1), 1.0f), gz2Var), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), hq5Var, 0, 0, 65016);
                u1g.l(hq5Var, d.e(vciVar, f));
                hdg.b(rvf.M(R.string.like_bottom_sheet_button_title, hq5Var), this.b, wa5Var.a(vciVar, gz2Var), null, null, hq5Var, 0, 24);
                u1g.l(hq5Var, d.e(vciVar, 32));
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                hdg.o(rvf.M(R.string.listen, hq5Var2), this.b, d.d(vciVar, 1.0f), 0.0f, hq5Var2, 384, 8);
                return Unit.a;
            case 2:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                ga6 ga6Var = (ga6) obj3;
                mfhVar.getClass();
                ffhVar.getClass();
                Integer num = (Integer) function0.invoke();
                ksk M2 = ffhVar.M(num == null ? ga6Var.a : ga6.b(ga6Var.a, 0, 0, num.intValue(), 0, 11));
                return mfh.m0(mfhVar, M2.a, M2.b, new zj(M2, 5));
            case 3:
                mfh mfhVar2 = (mfh) obj;
                ffh ffhVar2 = (ffh) obj2;
                mfhVar2.getClass();
                ffhVar2.getClass();
                ksk M3 = ffhVar2.M(((ga6) obj3).a);
                return mfh.m0(mfhVar2, M3.a, M3.b, new avi(i2, function0, M3));
            case 4:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (function0 != null) {
                        oq5Var3.Z(132074892);
                        y5g.M(function0, null, oq5Var3, 0, 2);
                    } else {
                        oq5Var3.Z(129306282);
                    }
                    oq5Var3.p(false);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 5:
                yci yciVar = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar.getClass();
                oq5 oq5Var4 = (oq5) ((hq5) obj2);
                oq5Var4.Z(-2022949915);
                String M4 = rvf.M(R.string.overflow_menu_content_description, oq5Var4);
                boolean f3 = oq5Var4.f(M4) | oq5Var4.f(function0);
                Object K = oq5Var4.K();
                if (f3 || K == gq5.a) {
                    K = new n4u(M4, function0, 0);
                    oq5Var4.k0(K);
                }
                yci b = nfp.b(yciVar, false, (Function1) K);
                oq5Var4.p(false);
                return b;
            case 6:
                wsv wsvVar = (wsv) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                wsvVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var4).f(wsvVar) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                if (wsvVar instanceof ssv) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    oq5Var6.Z(-2035017535);
                    y7g.i((ssv) wsvVar, this.b, null, oq5Var6, intValue3 & 14, 4);
                    oq5Var6.p(false);
                } else {
                    if (!(wsvVar instanceof vsv)) {
                        throw vz1.i((oq5) hq5Var4, -65647967, false);
                    }
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    oq5Var7.Z(-65637693);
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 7:
                z zVar = (z) obj;
                e eVar = (e) obj2;
                zVar.getClass();
                eVar.getClass();
                return ((com.yandex.plus.bdui.a) function0.invoke()).d(eVar, zVar.e, (com.yandex.plus.bdui.document.e) obj3);
            default:
                a0 a0Var = (a0) obj;
                b bVar = (b) obj2;
                a0Var.getClass();
                bVar.getClass();
                return ((com.yandex.plus.bdui.a) function0.invoke()).e(bVar, a0Var.e);
        }
    }
}
