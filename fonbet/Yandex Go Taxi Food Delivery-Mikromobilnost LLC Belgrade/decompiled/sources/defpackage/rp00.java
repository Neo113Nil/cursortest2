package defpackage;

import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes9.dex */
public final class rp00 implements qp00 {
    public final qqo a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final r0 c;
    public final r0 d;

    public rp00(rqo rqoVar) {
        this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.OPTIMISE_CARS_ON_MAP_ANIMATION);
        Boolean bool = Boolean.FALSE;
        this.c = bvf0.c(bool);
        this.d = bvf0.c(bool);
    }

    public final void a(Object obj) {
        this.b.add(obj);
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void b(Object obj) {
        this.b.remove(obj);
        qv10.B(!r0.isEmpty(), this.c, null);
    }
}
