package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import java.util.function.Consumer;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.routeselector.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class xb00 implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yb00 b;
    public final /* synthetic */ bov0 c;
    public final /* synthetic */ boolean w;

    public /* synthetic */ xb00(boolean z, yb00 yb00Var, bov0 bov0Var, boolean z2) {
        this.a = z;
        this.b = yb00Var;
        this.c = bov0Var;
        this.w = z2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        yb00 yb00Var = this.b;
        p pVar = yb00Var.i;
        if (this.a) {
            pVar.a(bov0.e, false);
            return;
        }
        e eVar = yb00Var.e;
        if (eVar.a.a().c() && yb00Var.f.a() && yb00Var.c.g()) {
            eVar.h(SourcePointMode.ROUTE, true, false);
        }
        ((a) yb00Var.d.b.get()).i();
        pVar.a(this.c, this.w);
    }
}
