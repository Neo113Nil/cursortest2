package defpackage;

import com.yandex.go.address.models.add.BackNavigationStrategy;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class w0m0 extends a1m0 {
    public final yvf0 b;
    public final ze0 c;

    public w0m0(yvf0 yvf0Var, ze0 ze0Var) {
        this.b = yvf0Var;
        this.c = ze0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        z0m0 z0m0Var = (z0m0) obj;
        String f = z0m0Var.f();
        ye0 re0Var = (f == null || f.length() == 0) ? ve0.b : new re0(f);
        BackNavigationStrategy backNavigationStrategy = deeplinkSource == DeeplinkSource.TOTW_COMMUNICATIONS ? BackNavigationStrategy.ORDER_DETAILS : BackNavigationStrategy.NONE;
        m950 m950Var = (m950) this.b.get();
        bvv bvvVar = new bvv(new zzs(z0m0Var.d(), z0m0Var.e(), 0, null, null, 28), null, re0Var, z0m0Var.b(), z0m0Var.a(), false, backNavigationStrategy, 98);
        String c = z0m0Var.c();
        ze0 ze0Var = this.c;
        if (c != null) {
            ze0Var.c(c);
        }
        ((pep0) oep0Var).f(m950Var, new ie0(bvvVar, ze0Var), hxx.a);
        return zy11.a;
    }
}
