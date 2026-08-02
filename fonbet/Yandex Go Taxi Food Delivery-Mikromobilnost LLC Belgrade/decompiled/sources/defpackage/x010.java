package defpackage;

import ru.yandex.taxi.masstransit.deeplink.b;
import ru.yandex.taxi.masstransit.deeplink.e;
import ru.yandex.taxi.masstransit.deeplink.f;

/* loaded from: classes9.dex */
public final class x010 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final sp00 d;

    public /* synthetic */ x010(b8w b8wVar, x7y0 x7y0Var, sp00 sp00Var, int i) {
        this.a = i;
        this.b = b8wVar;
        this.c = x7y0Var;
        this.d = sp00Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        sp00 sp00Var = this.d;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new b((h010) xvf0Var2.get(), (x111) xvf0Var.get(), (f) sp00Var.get());
            default:
                return new e((h010) xvf0Var2.get(), (x111) xvf0Var.get(), (f) sp00Var.get());
        }
    }
}
