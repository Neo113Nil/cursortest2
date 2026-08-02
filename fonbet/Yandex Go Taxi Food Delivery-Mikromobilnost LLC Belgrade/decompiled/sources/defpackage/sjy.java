package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.zalogin.LinkAccountInteractor$subscribe$$inlined$safeCollectIn$1;
import ru.yandex.taxi.zalogin.g;
import ru.yandex.taxi.zalogin.j;

/* loaded from: classes10.dex */
public final class sjy {
    public final f a;
    public final j b;
    public final fhz c;
    public final tt2 d;
    public final hbp0 e;
    public rjy f;
    public pzt0 g;
    public pzt0 h;

    public sjy(f fVar, j jVar, fhz fhzVar, tt2 tt2Var) {
        this.a = fVar;
        this.b = jVar;
        this.c = fhzVar;
        this.d = tt2Var;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.e = hbp0Var;
        hbp0Var.a();
    }

    public final void a(Consumer consumer) {
        rjy rjyVar = this.f;
        if (rjyVar != null) {
            consumer.accept(rjyVar);
        }
    }

    public final void b(rjy rjyVar) {
        this.f = rjyVar;
        this.h = tje.N(this.e, null, null, new LinkAccountInteractor$subscribe$$inlined$safeCollectIn$1(new g(this.b.g), null, this), 3);
    }

    public final void c() {
        this.f = null;
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }
}
