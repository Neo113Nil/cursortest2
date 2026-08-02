package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.ybsdk.widgets.common.j;
import defpackage.l8x;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.Regex;

/* loaded from: classes12.dex */
public final /* synthetic */ class wu40 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ wu40(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aa10 w;
        int i = this.a;
        Object obj4 = did.a;
        final sls slsVar = this.b;
        zx40 zx40Var = null;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    k3r k3rVar = ljs0.c;
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, k3rVar);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    sya1.a(vza1.c(), q791.b(an91.k(ljs0.n(c530Var, 56.0f, 64.0f), 16.0f), null, null, false, null, new awk0(0), this.b, 12), null, null, btsVar, 0, 12);
                    uic uicVar = uic.a;
                    oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
                    ffb1.c(SpinnerSize.LARGE, uicVar.a(x4c.H, c530Var), null, null, btsVar, 6, 12);
                    oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    iab1.a(null, null, null, null, null, null, this.b, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj3).getClass();
                bts btsVar3 = (bts) ((fid) obj2);
                btsVar3.e0(-756081143);
                jrv jrvVar = (jrv) btsVar3.m(lrv.a);
                if (jrvVar instanceof prv) {
                    btsVar3.e0(-1604682242);
                } else {
                    btsVar3.e0(-1604549624);
                    Object Q = btsVar3.Q();
                    Object obj5 = Q;
                    if (Q == obj4) {
                        obj5 = ly3.i(btsVar3);
                    }
                    zx40Var = (zx40) obj5;
                }
                btsVar3.t(false);
                f530 a2 = q791.a(c530.a, zx40Var, jrvVar, true, null, null, this.b);
                btsVar3.t(false);
                return a2;
            case 3:
                tic ticVar = (tic) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ticVar) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    vpa1.a(an91.o(ticVar.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, this.b, wwg.S(367939781, false, cdp.a, btsVar4), btsVar4, 24960, 2);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                tic ticVar2 = (tic) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(ticVar2) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    vpa1.a(an91.o(ticVar2.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, this.b, wwg.S(367939781, false, odp.a, btsVar5), btsVar5, 24960, 2);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                tic ticVar3 = (tic) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ticVar3) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar5;
                if (btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    vpa1.a(an91.o(ticVar3.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, this.b, wwg.S(367939781, false, pwz.a, btsVar6), btsVar6, 24960, 2);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar7 = (bts) ((fid) obj2);
                btsVar7.e0(-388044197);
                Object Q2 = btsVar7.Q();
                Object obj6 = Q2;
                if (Q2 == obj4) {
                    Object j = f.j(Boolean.TRUE);
                    btsVar7.o0(j);
                    obj6 = j;
                }
                final oz40 oz40Var = (oz40) obj6;
                Object Q3 = btsVar7.Q();
                Object obj7 = Q3;
                if (Q3 == obj4) {
                    Object j2 = f.j(null);
                    btsVar7.o0(j2);
                    obj7 = j2;
                }
                final oz40 oz40Var2 = (oz40) obj7;
                Object Q4 = btsVar7.Q();
                Object obj8 = Q4;
                if (Q4 == obj4) {
                    Object j3 = zpn.j(EmptyCoroutineContext.a, btsVar7);
                    btsVar7.o0(j3);
                    obj8 = j3;
                }
                final tse tseVar = (tse) obj8;
                boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                boolean k = btsVar7.k(slsVar) | btsVar7.e(tseVar) | btsVar7.d(600L);
                Object Q5 = btsVar7.Q();
                Object obj9 = Q5;
                if (k || Q5 == obj4) {
                    Object obj10 = new sls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.a
                        @Override // defpackage.sls
                        public final Object invoke() {
                            oz40 oz40Var3 = oz40Var;
                            if (((Boolean) oz40Var3.getValue()).booleanValue()) {
                                sls.this.invoke();
                                oz40Var3.setValue(Boolean.FALSE);
                                oz40 oz40Var4 = oz40Var2;
                                l8x l8xVar = (l8x) oz40Var4.getValue();
                                if (l8xVar != null) {
                                    l8xVar.a(null);
                                }
                                oz40Var4.setValue(tje.N(tseVar, null, null, new ModifierExtKt$debounceClickable$1$1$1$1(600L, oz40Var3, null), 3));
                            }
                            return zy11.a;
                        }
                    };
                    btsVar7.o0(obj10);
                    obj9 = obj10;
                }
                f530 d2 = q791.d(f530Var, booleanValue, null, null, (sls) obj9, 14);
                btsVar7.t(false);
                return d2;
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                if (((Regex) j.a.c.getValue()).h((CharSequence) obj2)) {
                    return null;
                }
                slsVar.invoke();
                return charSequence;
            case 8:
                tic ticVar4 = (tic) obj;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((bts) fidVar6).k(ticVar4) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar6;
                if (btsVar8.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                    vpa1.a(an91.o(ticVar4.a(x4c.G, c530Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, this.b, wwg.S(367939781, false, kd30.a, btsVar8), btsVar8, 24960, 2);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar7;
                if (btsVar9.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    mab1.a(null, null, null, null, null, null, this.b, btsVar9, 0, 63);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            default:
                k kVar = (k) obj;
                x910 x910Var = (x910) obj2;
                n8e n8eVar = (n8e) obj3;
                float f = ((y7m) slsVar.invoke()).a;
                o l0 = x910Var.l0(n8e.b(0, n8eVar.a, 0, p8e.f(y7m.b(f, Float.NaN) ? 0 : kVar.f0(f), n8eVar.a), 0, 11));
                w = kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new q83(l0, 13));
                return w;
        }
    }
}
