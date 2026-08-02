package defpackage;

import com.yandex.go.repositories.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.orderforanother.repository.a;

/* loaded from: classes6.dex */
public final class wz41 extends ad5 {
    public final e A;
    public final qv70 B;
    public final f0 x;
    public final f0 y;
    public final a z;

    public wz41(f0 f0Var, f0 f0Var2, a aVar, e eVar, qv70 qv70Var) {
        super(mz41.class);
        this.x = f0Var;
        this.y = f0Var2;
        this.z = aVar;
        this.A = eVar;
        this.B = qv70Var;
    }

    public static final Object Kg(wz41 wz41Var, Continuation continuation) {
        kj Ig = wz41Var.y.a.Ig();
        if (Ig != null) {
            return Ig;
        }
        f0 f0Var = wz41Var.x;
        f0Var.getClass();
        return f0.a(f0Var, (ContinuationImpl) continuation);
    }

    public final void Lg() {
        ((mz41) Dg()).re(i0h0.ic_passenger_yourself);
    }
}
