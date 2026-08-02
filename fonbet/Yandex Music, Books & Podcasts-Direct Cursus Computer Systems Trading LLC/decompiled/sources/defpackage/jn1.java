package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class jn1 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ jn1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                on1.b(48, (hq5) obj3, d.d(vci.a, 1.0f), this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 129) != 128)) {
                    vci vciVar = vci.a;
                    yci u = xp3.u(d.m(vciVar, 32), ugo.a);
                    boolean z = this.b;
                    ivf.k(0, 0, oq5Var, u, z);
                    ivf.l(z, d.r(a.q(vciVar, 8, 0.0f, 16, 0.0f, 10), 80), nu0.j(), oq5Var, 48, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 2:
                View view = (View) obj;
                kqv kqvVar = (kqv) obj2;
                bme bmeVar = (bme) obj4;
                view.getClass();
                kqvVar.getClass();
                ((cme) obj3).getClass();
                if (bmeVar != null) {
                    zne g = kqvVar.a.g(519);
                    g.getClass();
                    int i = g.b;
                    int i2 = this.b ? g.d : 0;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = bmeVar.a;
                        marginLayoutParams.topMargin = bmeVar.b + i;
                        marginLayoutParams.rightMargin = bmeVar.c;
                        marginLayoutParams.bottomMargin = bmeVar.d + i2;
                        view.setLayoutParams(marginLayoutParams);
                        break;
                    }
                } else {
                    break;
                }
            case 3:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                hq5 hq5Var2 = (hq5) obj3;
                if ((((Integer) obj4).intValue() & 129) == 128) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                qgg.b(this.b, zpd.n, d.r(vci.a, 156), hq5Var2, 432, 0);
            case 4:
                ((Integer) obj2).getClass();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                if ((intValue2 & 129) == 128) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                ivf.l(this.b, d.r(vci.a, 56), nu0.j(), hq5Var3, 48, 0);
            case 5:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 129) != 128)) {
                    e9q.i(48, 4, oq5Var4, null, this.b, true);
                } else {
                    oq5Var4.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hq5 hq5Var5 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue4 & 1, (intValue4 & 129) != 128)) {
                    ivf.l(this.b, d.r(vci.a, 56), nu0.j(), oq5Var5, 48, 0);
                } else {
                    oq5Var5.S();
                }
                break;
        }
        return Unit.a;
    }
}
