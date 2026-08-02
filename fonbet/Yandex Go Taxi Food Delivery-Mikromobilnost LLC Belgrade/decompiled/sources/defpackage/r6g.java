package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsApi;
import ru.yandex.taxi.checkin.a;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes14.dex */
public final class r6g implements xvf0 {
    public final /* synthetic */ int a;
    public final f0g b;

    public /* synthetic */ r6g(f0g f0gVar, int i) {
        this.a = i;
        this.b = f0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        f0g f0gVar = this.b;
        switch (i) {
            case 0:
                de deVar = (de) f0gVar.x.a.e6.get();
                q5z.h(deVar);
                return deVar;
            case 1:
                je jeVar = (je) f0gVar.x.a.d6.get();
                q5z.h(jeVar);
                return jeVar;
            case 2:
                ci70 ci70Var = (ci70) f0gVar.w.Ma.get();
                q5z.h(ci70Var);
                return ci70Var;
            case 3:
                tt2 k = f0gVar.k();
                q5z.h(k);
                return k;
            case 4:
                return f0gVar.L();
            case 5:
                lx4 lx4Var = (lx4) f0gVar.w.Y.get();
                q5z.h(lx4Var);
                return lx4Var;
            case 6:
                w1y0 w1y0Var = (w1y0) f0gVar.H4.get();
                q5z.h(w1y0Var);
                return w1y0Var;
            case 7:
                f0gVar.getClass();
                return new eg7();
            case 8:
                return (pg7) f0gVar.x.Fw.get();
            case 9:
                x1y0 x1y0Var = (x1y0) f0gVar.U5.get();
                q5z.h(x1y0Var);
                return x1y0Var;
            case 10:
                x980 x980Var = f0gVar.a;
                q5z.h(x980Var);
                return x980Var;
            case 11:
                k48 k48Var = (k48) f0gVar.x.a.C5.get();
                q5z.h(k48Var);
                return k48Var;
            case 12:
                return f0gVar.x.C1();
            case 13:
                edk0 edk0Var = (edk0) f0gVar.w.xr.get();
                q5z.h(edk0Var);
                return edk0Var;
            case 14:
                y1y0 y1y0Var = (y1y0) f0gVar.v4.get();
                q5z.h(y1y0Var);
                return y1y0Var;
            case 15:
                z1y0 z1y0Var = (z1y0) f0gVar.C0.get();
                q5z.h(z1y0Var);
                return z1y0Var;
            case 16:
                a2y0 a2y0Var = (a2y0) f0gVar.N4.get();
                q5z.h(a2y0Var);
                return a2y0Var;
            case 17:
                on2 on2Var = (on2) f0gVar.x.a.a.w0.get();
                on2Var.getClass();
                ChangeRequirementsApi changeRequirementsApi = (ChangeRequirementsApi) on2Var.a(GoApiName.TaxiV4, ChangeRequirementsApi.class);
                q5z.i(changeRequirementsApi);
                return changeRequirementsApi;
            case 18:
                b2y0 b2y0Var = (b2y0) f0gVar.X4.get();
                q5z.h(b2y0Var);
                return b2y0Var;
            case 19:
                c2y0 c2y0Var = (c2y0) f0gVar.c0.get();
                q5z.h(c2y0Var);
                return c2y0Var;
            case 20:
                return (a) f0gVar.w.yn.get();
            case 21:
                pdc pdcVar = (pdc) f0gVar.w.Ye.get();
                q5z.h(pdcVar);
                return pdcVar;
            case 22:
                return (ypc) f0gVar.x.Wd.get();
            case 23:
                return new ydk0((htc) f0gVar.R5.a);
            case 24:
                ru.yandex.taxi.communications.data.a aVar = (ru.yandex.taxi.communications.data.a) f0gVar.w.Uh.get();
                q5z.h(aVar);
                return aVar;
            case 25:
                d2y0 d2y0Var = (d2y0) f0gVar.L0.get();
                q5z.h(d2y0Var);
                return d2y0Var;
            case 26:
                Context context = (Context) f0gVar.x.U.get();
                q5z.h(context);
                return context;
            case 27:
                xdf o1 = f0gVar.o1();
                q5z.h(o1);
                return o1;
            case 28:
                f0gVar.getClass();
                return new crg();
            default:
                p0h p0hVar = (p0h) f0gVar.T5.get();
                q5z.h(p0hVar);
                return p0hVar;
        }
    }
}
