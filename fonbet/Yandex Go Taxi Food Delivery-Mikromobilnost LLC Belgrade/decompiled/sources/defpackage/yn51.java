package defpackage;

import com.yandex.go.payments.domain.i0;
import com.yandex.go.yb.data.e;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.token.a;

/* loaded from: classes.dex */
public final class yn51 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ yn51(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new xn51((fn21) this.c.get(), (a) this.b.get());
            case 1:
                return new eq51((u) this.b.get(), (oz01) this.c.get());
            case 2:
                return new r400(18);
            case 3:
                return new hu51((tt2) this.c.get(), (rqo) this.b.get());
            case 4:
                return new py51((e) this.b.get(), (qy51) this.c.get());
            case 5:
                return new dc61((g) this.b.get(), (im51) this.c.get());
            case 6:
                return new ru.yandex.taxi.preorder.source.sourcepointzone.a((o) this.b.get(), (b) this.c.get());
            case 7:
                return new a441(8, (i0) this.b.get(), i5m.a(this.c));
            case 8:
                return new id61((wnt) this.b.get(), (tt2) this.c.get());
            default:
                return new ae61((dne0) this.b.get(), (b03) this.c.get());
        }
    }
}
