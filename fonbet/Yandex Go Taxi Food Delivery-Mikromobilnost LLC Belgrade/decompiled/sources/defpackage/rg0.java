package defpackage;

import com.yandex.go.payments.addmethod.ui.home.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class rg0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mh0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ rg0(mh0 mh0Var, tls tlsVar) {
        this.b = mh0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        mh0 mh0Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(mh0Var, tlsVar, (fid) obj, vng.O(1));
                break;
            default:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    vh0 vh0Var = mh0Var.h;
                    wh0 wh0Var = vh0Var != null ? vh0Var.b : null;
                    if (wh0Var != null) {
                        btsVar.e0(451465724);
                        boolean k = btsVar.k(tlsVar) | btsVar.k(wh0Var);
                        Object Q = btsVar.Q();
                        if (k || Q == did.a) {
                            Q = new tg0(tlsVar, wh0Var, 0);
                            btsVar.o0(Q);
                        }
                        jeb1.f(wh0Var.a, an91.m(q791.d(c530.a, false, null, null, (sls) Q, 15), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16380);
                        btsVar.t(false);
                        break;
                    } else {
                        btsVar.e0(451465723);
                        btsVar.t(false);
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ rg0(mh0 mh0Var, tls tlsVar, int i) {
        this.b = mh0Var;
        this.c = tlsVar;
    }
}
