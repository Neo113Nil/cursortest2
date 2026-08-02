package defpackage;

import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import ru.yandex.taxi.preorder.source.domain.d;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class xit0 {
    public final yit0 a;
    public final biv0 b;
    public final d c;
    public final tit0 d;
    public final xj0 e;
    public final ou7 f;
    public final e g;
    public final uet0 h;
    public final kqv0 i;

    public xit0(yit0 yit0Var, biv0 biv0Var, d dVar, tit0 tit0Var, xj0 xj0Var, ou7 ou7Var, e eVar, uet0 uet0Var, kqv0 kqv0Var) {
        this.a = yit0Var;
        this.b = biv0Var;
        this.c = dVar;
        this.d = tit0Var;
        this.e = xj0Var;
        this.f = ou7Var;
        this.g = eVar;
        this.h = uet0Var;
        this.i = kqv0Var;
    }

    public final boolean a() {
        jpv0 b = this.b.b();
        b.getClass();
        if (b instanceof fpv0) {
            return false;
        }
        this.a.a(MapPositionAction.CENTER_ON_USER_LOCATION);
        this.c.a.a = false;
        this.d.m = false;
        this.e.a.Hg();
        return true;
    }

    public final void b(bov0 bov0Var) {
        ou7 ou7Var = this.f;
        if (ou7Var.b() || !ou7Var.a()) {
            this.h.a();
            return;
        }
        jpv0 b = this.b.b();
        b.getClass();
        if (b instanceof hpv0) {
            return;
        }
        this.i.a();
        this.a.c(bov0Var);
        this.g.f();
    }
}
