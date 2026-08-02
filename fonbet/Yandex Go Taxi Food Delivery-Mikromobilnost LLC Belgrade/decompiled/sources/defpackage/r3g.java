package defpackage;

import android.content.Context;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.communications.stories.domain.a;
import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class r3g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ r3g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                return ((c0g) i6rVar).M2();
            case 1:
                RequirementsChangedNotifier requirementsChangedNotifier = (RequirementsChangedNotifier) ((c0g) i6rVar).z.Sj.get();
                q5z.h(requirementsChangedNotifier);
                return requirementsChangedNotifier;
            case 2:
                return ((c0g) i6rVar).O2();
            case 3:
                oep0 n = ((c0g) i6rVar).n();
                q5z.h(n);
                return n;
            case 4:
                return ((c0g) i6rVar).Q2();
            case 5:
                return ((c0g) i6rVar).R2();
            case 6:
                return new bpw(((c0g) i6rVar).A.a.t3);
            case 7:
                return (c4r0) ((c0g) i6rVar).z.qk.get();
            case 8:
                q830 q830Var = (q830) ((c0g) i6rVar).A.a.r3.get();
                q5z.h(q830Var);
                return q830Var;
            case 9:
                po21 e3 = ((c0g) i6rVar).e3();
                q5z.h(e3);
                return e3;
            case 10:
                o k3 = ((c0g) i6rVar).k3();
                q5z.h(k3);
                return k3;
            case 11:
                Context H1 = ((c0g) i6rVar).H1();
                q5z.h(H1);
                return H1;
            case 12:
                h410 h410Var = (h410) ((c0g) i6rVar).lz.get();
                q5z.h(h410Var);
                return h410Var;
            case 13:
                return new pj((pho) ((c0g) i6rVar).A.a.a.d0.get());
            case 14:
                w030 B5 = ((c0g) i6rVar).B5();
                q5z.h(B5);
                return B5;
            case 15:
                return (a) ((c0g) i6rVar).gd.get();
            case 16:
                o I6 = ((c0g) i6rVar).I6();
                q5z.h(I6);
                return I6;
            case 17:
                yp2 yp2Var = (yp2) ((c0g) i6rVar).z.kk.get();
                q5z.h(yp2Var);
                return yp2Var;
            case 18:
                tt2 k = ((c0g) i6rVar).k();
                q5z.h(k);
                return k;
            case 19:
                Context H12 = ((c0g) i6rVar).H1();
                q5z.h(H12);
                return H12;
            case 20:
                xdf o1 = ((c0g) i6rVar).o1();
                q5z.h(o1);
                return o1;
            case 21:
                c b = ((c0g) i6rVar).b();
                q5z.h(b);
                return b;
            case 22:
                y50 y0 = ((c0g) i6rVar).y0();
                q5z.h(y0);
                return y0;
            case 23:
                on2 l3 = ((c0g) i6rVar).l3();
                q5z.h(l3);
                return l3;
            case 24:
                pav e = ((c0g) i6rVar).e();
                q5z.h(e);
                return e;
            case 25:
                j5z j5zVar = (j5z) ((c0g) i6rVar).z.f0.get();
                q5z.h(j5zVar);
                return j5zVar;
            case 26:
                h410 h410Var2 = (h410) ((c0g) i6rVar).lz.get();
                q5z.h(h410Var2);
                return h410Var2;
            case 27:
                w030 B52 = ((c0g) i6rVar).B5();
                q5z.h(B52);
                return B52;
            case 28:
                return new h((fq30) ((c0g) i6rVar).A.a.Z4.get());
            default:
                tj60 tj60Var = (tj60) ((c0g) i6rVar).t7.get();
                q5z.h(tj60Var);
                return tj60Var;
        }
    }
}
