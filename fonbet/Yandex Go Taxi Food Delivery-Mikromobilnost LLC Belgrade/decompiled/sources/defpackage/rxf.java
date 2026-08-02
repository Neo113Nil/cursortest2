package defpackage;

import android.content.Context;
import com.yandex.go.chargers.error.data.a;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class rxf implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ rxf(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                ip11 u = ((c0g) i6rVar).u();
                q5z.h(u);
                return u;
            case 1:
                iy11 iy11Var = (iy11) ((c0g) i6rVar).z.I3.get();
                q5z.h(iy11Var);
                return iy11Var;
            case 2:
                ky11 ky11Var = (ky11) ((c0g) i6rVar).z.b4.get();
                q5z.h(ky11Var);
                return ky11Var;
            case 3:
                lg21 d3 = ((c0g) i6rVar).d3();
                q5z.h(d3);
                return d3;
            case 4:
                fn21 fn21Var = (fn21) ((c0g) i6rVar).z.a0.get();
                q5z.h(fn21Var);
                return fn21Var;
            case 5:
                po21 e3 = ((c0g) i6rVar).e3();
                q5z.h(e3);
                return e3;
            case 6:
                return ((c0g) i6rVar).D6();
            case 7:
                vp21 vp21Var = (vp21) ((c0g) i6rVar).z.a0.get();
                q5z.h(vp21Var);
                return vp21Var;
            case 8:
                return ((c0g) i6rVar).E6();
            case 9:
                c0g c0gVar = (c0g) i6rVar;
                c0gVar.getClass();
                return c0gVar;
            case 10:
                y50 y0 = ((c0g) i6rVar).y0();
                q5z.h(y0);
                return y0;
            case 11:
                return ((c0g) i6rVar).c2();
            case 12:
                zzf zzfVar = ((c0g) i6rVar).z;
                return new a((wnt) zzfVar.q.get(), (tt2) zzfVar.n.get());
            case 13:
                on2 on2Var = (on2) ((c0g) i6rVar).A.a.a.w0.get();
                on2Var.getClass();
                ChargersFeedbackApi chargersFeedbackApi = (ChargersFeedbackApi) on2Var.a(GoApiName.TaxiV4, ChargersFeedbackApi.class);
                q5z.i(chargersFeedbackApi);
                return chargersFeedbackApi;
            case 14:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                c0g c0gVar2 = d0gVar.b;
                return new j6a((pav) d0gVar.a.p3.get(), (tj60) c0gVar2.t7.get(), (Context) c0gVar2.U.get());
            case 15:
                Context e2 = ((c0g) i6rVar).e2();
                q5z.h(e2);
                return e2;
            case 16:
                c r2 = ((c0g) i6rVar).r2();
                q5z.h(r2);
                return r2;
            case 17:
                return (kuo0) ((c0g) i6rVar).Qd.get();
            case 18:
                pwy0 c3 = ((c0g) i6rVar).c3();
                q5z.h(c3);
                return c3;
            case 19:
                rqo l1 = ((c0g) i6rVar).l1();
                q5z.h(l1);
                return l1;
            case 20:
                return ((c0g) i6rVar).u1();
            case 21:
                w3b0 v1 = ((c0g) i6rVar).v1();
                q5z.h(v1);
                return v1;
            case 22:
                tt2 k = ((c0g) i6rVar).k();
                q5z.h(k);
                return k;
            case 23:
                lx4 y1 = ((c0g) i6rVar).y1();
                q5z.h(y1);
                return y1;
            case 24:
                mxb D1 = ((c0g) i6rVar).D1();
                q5z.h(D1);
                return D1;
            case 25:
                r8h E1 = ((c0g) i6rVar).E1();
                q5z.h(E1);
                return E1;
            case 26:
                pdc F1 = ((c0g) i6rVar).F1();
                q5z.h(F1);
                return F1;
            case 27:
                Context H1 = ((c0g) i6rVar).H1();
                q5z.h(H1);
                return H1;
            case 28:
                com.yandex.go.navigation.screen.c S = ((c0g) i6rVar).S();
                q5z.h(S);
                return S;
            default:
                fif K1 = ((c0g) i6rVar).K1();
                q5z.h(K1);
                return K1;
        }
    }
}
