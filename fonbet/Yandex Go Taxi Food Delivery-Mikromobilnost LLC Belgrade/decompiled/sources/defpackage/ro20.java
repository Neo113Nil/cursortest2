package defpackage;

import com.yandex.mob.d;
import com.yandex.mob.data.c;
import com.yandex.mob.domain.m;
import com.yandex.mob.domain.n;
import com.yandex.mob.network.b;
import com.yandex.mob.reporting.a;

/* loaded from: classes8.dex */
public final class ro20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo20 b;

    public /* synthetic */ ro20(yo20 yo20Var, int i) {
        this.a = i;
        this.b = yo20Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        yo20 yo20Var = this.b;
        switch (i) {
            case 0:
                return yo20Var.i;
            case 1:
                return d.g(yo20Var.x.b);
            case 2:
                return (a) yo20Var.D.b.H.getValue();
            case 3:
                return yo20Var.g;
            case 4:
                return new b(d.h(yo20Var.y.b), d.f(yo20Var.A.b));
            case 5:
                return new m(yo20Var.b, (n) yo20Var.C.invoke(), yo20Var.e, d.g(yo20Var.x.b));
            case 6:
                lo20 lo20Var = yo20Var.n;
                return new vy21();
            case 7:
                return yo20Var.l;
            case 8:
                return yo20Var.m;
            case 9:
                return yo20Var.f;
            case 10:
                return (com.yandex.mob.m) yo20Var.u.b.B.getValue();
            case 11:
                return d.h(yo20Var.y.b);
            case 12:
                return (c) yo20Var.B.invoke();
            case 13:
                return yo20Var.a;
            case 14:
                return yo20Var.j;
            case 15:
                return (a041) yo20Var.v.invoke();
            case 16:
                return (z160) yo20Var.w.invoke();
            default:
                return d.f(yo20Var.A.b);
        }
    }
}
