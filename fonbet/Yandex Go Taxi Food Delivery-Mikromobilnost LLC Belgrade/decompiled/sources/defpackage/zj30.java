package defpackage;

import ru.yandex.taxi.masstransit.datasource.routing.f;

/* loaded from: classes6.dex */
public final class zj30 {
    public final f a;
    public final ah00 b;
    public final ak30 c;

    public zj30(f fVar, ah00 ah00Var, ak30 ak30Var) {
        this.a = fVar;
        this.b = ah00Var;
        this.c = ak30Var;
    }

    public final void a() {
        su30 d = this.a.d();
        if (d == null) {
            return;
        }
        ubo uboVar = d.g;
        fi6 fi6Var = new fi6();
        fi6Var.a(uboVar.a.d);
        fi6Var.a(uboVar.b.d);
        fi6Var.d(d.b);
        ((gh00) this.b).A(fi6Var.g(), null);
        this.c.a(false);
    }
}
