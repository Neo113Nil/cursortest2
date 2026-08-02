package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class wjt0 {
    public final xvw a;
    public final uq40 b;
    public final pd61 c;
    public final e d;

    public wjt0(xvw xvwVar, uq40 uq40Var, pd61 pd61Var, e eVar) {
        this.a = xvwVar;
        this.b = uq40Var;
        this.c = pd61Var;
        this.d = eVar;
    }

    public final void a() {
        this.a.a();
        uq40 uq40Var = this.b;
        biv0 biv0Var = uq40Var.A;
        jpv0 b = biv0Var.b();
        b.getClass();
        if (b instanceof fpv0) {
            jpv0 b2 = biv0Var.b();
            b2.getClass();
            if ((b2 instanceof fpv0) && uq40Var.d()) {
                tit0 tit0Var = uq40Var.n;
                jr40 jr40Var = tit0Var.p;
                wq40 wq40Var = tit0Var.q;
                if (jr40Var != null && wq40Var != null) {
                    uq40Var.e(jr40Var, wq40Var, true);
                }
            }
        } else {
            uq40Var.c(ModalViewOrigin.SUMMARY);
        }
        this.c.b();
        if (uq40Var.d()) {
            return;
        }
        this.d.e(false);
    }
}
