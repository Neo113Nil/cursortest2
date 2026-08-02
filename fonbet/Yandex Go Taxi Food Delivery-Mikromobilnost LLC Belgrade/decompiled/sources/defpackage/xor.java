package defpackage;

import androidx.compose.material3.e;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderMultimodalRoutesView;

/* loaded from: classes10.dex */
public final /* synthetic */ class xor implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zls b;

    public /* synthetic */ xor(zls zlsVar, int i) {
        this.a = i;
        this.b = zlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onAttachedToWindow$lambda$1$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zls zlsVar = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 m = an91.m(ljs0.p(c530.a, e.b, 0.0f, 0.0f, 0.0f, 14), e.a, 0.0f, 2);
                    lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, m);
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
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    zlsVar.invoke(nhl0.a, btsVar, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    zlsVar.invoke(err.a, btsVar2, 6);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                onAttachedToWindow$lambda$1$1 = TaxiOrderMultimodalRoutesView.onAttachedToWindow$lambda$1$1(zlsVar, fidVar, intValue);
                return onAttachedToWindow$lambda$1$1;
        }
    }
}
