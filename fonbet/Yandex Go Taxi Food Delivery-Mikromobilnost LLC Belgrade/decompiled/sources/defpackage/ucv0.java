package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.address.experiment.e;
import ru.yandex.taxi.address.experiment.q;

/* loaded from: classes14.dex */
public final class ucv0 {
    public final nct0 a;
    public final q b;
    public final wiq0 c;

    public ucv0(nct0 nct0Var, q qVar, wiq0 wiq0Var) {
        this.a = nct0Var;
        this.b = qVar;
        this.c = wiq0Var;
    }

    public final q81 a() {
        fnx0 n = ((k) this.c).n();
        mi31 mi31Var = n != null ? n.a : null;
        e b = this.b.b(mi31Var != null ? mi31Var.b : null, mi31Var != null ? mi31Var.f : null, null);
        if (((Boolean) this.a.b.getValue()).booleanValue()) {
            return p81.a;
        }
        return new o81(b != null);
    }
}
