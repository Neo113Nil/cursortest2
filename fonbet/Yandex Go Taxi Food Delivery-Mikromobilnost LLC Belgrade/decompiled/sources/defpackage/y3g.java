package defpackage;

import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.payments.data.p;
import ru.yandex.taxi.masstransit.trains.config.a;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class y3g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ y3g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                return ((c0g) i6rVar).M5();
            case 1:
                return ((c0g) i6rVar).N5();
            case 2:
                zuj0 c = ((c0g) i6rVar).c();
                q5z.h(c);
                return c;
            case 3:
                return (p) ((c0g) i6rVar).z.rj.get();
            case 4:
                k7x0 s6 = ((c0g) i6rVar).s6();
                q5z.h(s6);
                return s6;
            case 5:
                pwy0 w6 = ((c0g) i6rVar).w6();
                q5z.h(w6);
                return w6;
            case 6:
                return (a) ((c0g) i6rVar).dy.get();
            case 7:
                return ((c0g) i6rVar).x6();
            case 8:
                return ((c0g) i6rVar).A6();
            case 9:
                return new b611((pho) ((c0g) i6rVar).z.d0.get());
            case 10:
                lg21 lg21Var = (lg21) ((c0g) i6rVar).z.u5.get();
                q5z.h(lg21Var);
                return lg21Var;
            case 11:
                tt2 tt2Var = (tt2) ((c0g) i6rVar).z.n.get();
                q5z.h(tt2Var);
                return tt2Var;
            case 12:
                jj3 jj3Var = (jj3) ((c0g) i6rVar).T7.get();
                q5z.h(jj3Var);
                return jj3Var;
            case 13:
                return (ypc) ((c0g) i6rVar).Wd.get();
            case 14:
                xdf o1 = ((c0g) i6rVar).o1();
                q5z.h(o1);
                return o1;
            case 15:
                return ((c0g) i6rVar).z.j1();
            case 16:
                pho T1 = ((c0g) i6rVar).T1();
                q5z.h(T1);
                return T1;
            case 17:
                h hVar = (h) ((c0g) i6rVar).z.i4.get();
                q5z.h(hVar);
                return hVar;
            case 18:
                c b = ((c0g) i6rVar).b();
                q5z.h(b);
                return b;
            case 19:
                on2 l3 = ((c0g) i6rVar).l3();
                q5z.h(l3);
                return l3;
            case 20:
                okv okvVar = (okv) ((c0g) i6rVar).A.a.w3.get();
                q5z.h(okvVar);
                return okvVar;
            case 21:
                ah00 B = ((c0g) i6rVar).B();
                q5z.h(B);
                return B;
            case 22:
                e f = ((c0g) i6rVar).f();
                q5z.h(f);
                return f;
            case 23:
                return (cg30) ((c0g) i6rVar).ey.get();
            case 24:
                return (tw30) ((c0g) i6rVar).hD.get();
            case 25:
                wr40 wr40Var = (wr40) ((c0g) i6rVar).z.Ko.get();
                q5z.h(wr40Var);
                return wr40Var;
            case 26:
                return ((c0g) i6rVar).F5();
            case 27:
                return ((c0g) i6rVar).z.a1();
            case 28:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                c0g c0gVar = d0gVar.b;
                return new d((e) c0gVar.J9.get(), c0gVar.F5(), d0gVar.a.o());
            default:
                yu40 H5 = ((c0g) i6rVar).H5();
                q5z.h(H5);
                return H5;
        }
    }
}
