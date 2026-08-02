package defpackage;

import java.util.ArrayList;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.data.g;

/* loaded from: classes9.dex */
public final class tqm0 {
    public final y7u a;
    public final g b;

    public tqm0(y7u y7uVar, g gVar) {
        this.a = y7uVar;
        this.b = gVar;
    }

    public final void a(sqm0 sqm0Var) {
        r0 r0Var = this.b.a;
        Pair pair = (Pair) r0Var.getValue();
        Pair pair2 = ibn0.a;
        r0Var.m(null, new Pair((sqm0) pair.f(), sqm0Var));
        qrq0 qrq0Var = y7u.b;
        ArrayList g = vms.g(uh6.C(sqm0Var), new q2m0(18));
        cne0 cne0Var = this.a.a;
        cne0Var.u("scooters", !g.isEmpty());
        cne0Var.r("scooters_statuses", vms.e("scooters", g));
    }
}
