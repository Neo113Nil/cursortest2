package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.yandex.plus.home.feature.webviews.internal.simple.contract.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class olu implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ olu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kb5 kb5Var;
        kb5 kb5Var2;
        grb grbVar;
        oq5 oq5Var;
        int i = this.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                nlu nluVar = (nlu) obj;
                int intValue = ((Integer) obj3).intValue();
                nluVar.getClass();
                o2g.s(nluVar, (hoq) obj4, null, (hq5) obj2, intValue & 14);
                break;
            case 1:
                rmu rmuVar = (rmu) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                qkl qklVar = (qkl) obj3;
                str.getClass();
                rmuVar.getClass();
                if (qklVar != null) {
                    hjl hjlVar = rmuVar.c;
                    thj thjVar = qklVar.b;
                    gjl gjlVar = qklVar.a;
                    hjlVar.e(booleanValue, str, thjVar, gjlVar.b, gjlVar.a, null);
                }
                break;
            case 2:
                nru nruVar = (nru) obj4;
                hq5 hq5Var = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var;
                boolean h = oq5Var3.h(nruVar);
                Object K = oq5Var3.K();
                if (h || K == kjnVar) {
                    K = new j6u(0, nruVar, nru.class, "onSearchClick", "onSearchClick()V", 0, 18);
                    oq5Var3.k0(K);
                }
                aae.a((Function0) ((h9f) K), null, false, cxb.g, oq5Var3, 24576, 14);
            case 3:
                onu onuVar = (onu) obj4;
                yci yciVar = (yci) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                yciVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var2).f(yciVar) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                z0v.a(ltg.k, ltg.l, ltg.m, false, false, yciVar, onuVar, hq5Var2, ((intValue3 << 15) & 458752) | 28086, 0);
            case 4:
                g1v g1vVar = (g1v) obj4;
                f1v f1vVar = (f1v) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                f1vVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var3).d(f1vVar.ordinal()) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                g1vVar.a.getClass();
                oq5 oq5Var6 = (oq5) hq5Var3;
                oq5Var6.Z(-1694044225);
                oq5Var6.p(false);
                oq5Var6.Z(-139758045);
                p1g.a("https://avatars.mds.yandex.net/get-music-misc/28592/img.69a1896e2e417b6d0f42f9a4/orig", null, d.c(xv.z(vciVar, 0.5f), 1.0f), null, null, null, hd6.a, 0.0f, null, 0, oq5Var6, 1572912, 952);
                oq5Var6.p(false);
            case 5:
                b7v b7vVar = (b7v) obj4;
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                int L = mfhVar.L(b7vVar.a);
                ksk M = ffhVar.M(ga6.b(((ga6) obj3).a, 0, 0, 0, 10000, 3));
                int L2 = mfhVar.L(b7vVar.c);
                if (L2 < 1) {
                    L2 = 1;
                }
                int i2 = M.a;
                break;
            case 6:
                w4k w4kVar = (w4k) obj;
                int intValue5 = ((Integer) obj3).intValue();
                w4kVar.getClass();
                wjv.h((qo6) obj4, w4kVar, (hq5) obj2, (intValue5 << 3) & 112);
                break;
            case 7:
                bov bovVar = (bov) obj4;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var4).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var7 = (oq5) hq5Var4;
                if (oq5Var7.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    yci l = a.l(d.c(vciVar, 1.0f), o0kVar);
                    iz2 iz2Var = b2c.b;
                    kfh d = ug3.d(iz2Var, false);
                    int i3 = oq5Var7.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var7.l();
                    yci H = vnj.H(oq5Var7, l);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var7.d0();
                    if (oq5Var7.O) {
                        oq5Var7.k(grbVar2);
                    } else {
                        oq5Var7.n0();
                    }
                    kb5 kb5Var3 = wp5.f;
                    g0g.U(oq5Var7, d, kb5Var3);
                    kb5 kb5Var4 = wp5.e;
                    g0g.U(oq5Var7, l2, kb5Var4);
                    kb5 kb5Var5 = wp5.g;
                    if (oq5Var7.O || !Intrinsics.d(oq5Var7.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var7, i3, kb5Var5);
                    }
                    kb5 kb5Var6 = wp5.d;
                    g0g.U(oq5Var7, H, kb5Var6);
                    uht uhtVar = (uht) gld.M(bovVar.c, oq5Var7).getValue();
                    boolean h2 = oq5Var7.h(bovVar);
                    Object K2 = oq5Var7.K();
                    if (h2 || K2 == kjnVar) {
                        kb5Var = kb5Var5;
                        kb5Var2 = kb5Var3;
                        grbVar = grbVar2;
                        K2 = new vlv(1, bovVar, bov.class, "onWidgetColorSelected", "onWidgetColorSelected(Lcom/yandex/music/screen/widget_settings/api/UiWidgetColorType;)V", 0, 1);
                        oq5Var7.k0(K2);
                    } else {
                        kb5Var = kb5Var5;
                        grbVar = grbVar2;
                        kb5Var2 = kb5Var3;
                    }
                    y1g.v(uhtVar, (Function1) ((h9f) K2), null, oq5Var7, 0);
                    yci a = b.a.a(d.g(vciVar, 80, 0.0f, 2), b2c.i);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i4 = oq5Var7.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var7.l();
                    yci H2 = vnj.H(oq5Var7, a);
                    oq5Var7.d0();
                    if (oq5Var7.O) {
                        oq5Var7.k(grbVar);
                    } else {
                        oq5Var7.n0();
                    }
                    g0g.U(oq5Var7, d2, kb5Var2);
                    g0g.U(oq5Var7, l3, kb5Var4);
                    if (oq5Var7.O || !Intrinsics.d(oq5Var7.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var7, i4, kb5Var);
                    }
                    g0g.U(oq5Var7, H2, kb5Var6);
                    String M2 = rvf.M(R.string.widget_settings_apply_button, oq5Var7);
                    boolean h3 = oq5Var7.h(bovVar);
                    Object K3 = oq5Var7.K();
                    if (h3 || K3 == kjnVar) {
                        oq5Var = oq5Var7;
                        vtu vtuVar = new vtu(0, bovVar, bov.class, "onCloseClick", "onCloseClick()V", 0, 9);
                        oq5Var.k0(vtuVar);
                        K3 = vtuVar;
                    } else {
                        oq5Var = oq5Var7;
                    }
                    hdg.b(M2, (Function0) ((h9f) K3), androidx.compose.ui.platform.a.a(vciVar, "apply_button"), null, null, oq5Var, 384, 24);
                    oq5Var.p(true);
                    oq5Var.p(true);
                } else {
                    oq5Var7.S();
                }
                break;
            case 8:
                ((Integer) obj3).intValue();
                ((am0) obj).getClass();
                hdg.C((wvv) obj4, (hq5) obj2, 0);
                break;
            case 9:
                Integer num = (Integer) obj4;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue7 & 17) == 16) {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                wcs.b(rvf.M(num.intValue(), hq5Var5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) ((oq5) hq5Var5).j(vdt.a)).o, hq5Var5, 0, 0, 65534);
            case 10:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int intValue9 = ((Integer) obj3).intValue();
                spannableStringBuilder.getClass();
                spannableStringBuilder.setSpan(new com.yandex.plus.home.common.utils.spantext.a((Drawable) obj4), intValue8, intValue9, 34);
                break;
            default:
                String str2 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                str2.getClass();
                ((c) obj4).k.invoke(new com.yandex.plus.home.feature.webviews.internalapi.toolbar.b(str2, (String) obj2, booleanValue2));
                break;
        }
        return Unit.a;
    }
}
