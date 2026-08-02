package defpackage;

import com.yandex.go.scooters.domain.f0;
import com.yandex.go.scooters.qr.preview.domain.b;
import ru.yandex.taxi.scooters.data.p;
import ru.yandex.taxi.walkroute.a;

/* loaded from: classes13.dex */
public final class r5n0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final e7g d;
    public final xvf0 e;
    public final xvf0 f;

    public r5n0(xvf0 xvf0Var, j7g j7gVar, e7g e7gVar, l7g l7gVar, m7g m7gVar) {
        this.a = 1;
        this.b = xvf0Var;
        this.c = j7gVar;
        this.d = e7gVar;
        this.e = l7gVar;
        this.f = m7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        e7g e7gVar = this.d;
        switch (i) {
            case 0:
                return new q5n0((tt2) e7gVar.get(), (n6n0) xvf0Var4.get(), (y5p0) xvf0Var3.get(), (s6n0) xvf0Var2.get(), (z2o0) xvf0Var.get());
            case 1:
                return new v0o0((euo0) xvf0Var4.get(), (tse) xvf0Var3.get(), (tt2) e7gVar.get(), (fva0) xvf0Var2.get(), (p) xvf0Var.get());
            case 2:
                return new b((tt2) e7gVar.get(), (jro0) xvf0Var4.get(), (lmo0) xvf0Var3.get(), (uoo0) xvf0Var2.get(), (lqo0) xvf0Var.get());
            default:
                return new f0((tt2) e7gVar.get(), (a) xvf0Var4.get(), (po21) xvf0Var3.get(), (huo0) xvf0Var2.get(), (fon0) xvf0Var.get());
        }
    }

    public /* synthetic */ r5n0(e7g e7gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.d = e7gVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }
}
