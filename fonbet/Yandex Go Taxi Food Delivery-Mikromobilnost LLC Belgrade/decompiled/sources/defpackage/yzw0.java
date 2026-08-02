package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.management.deliveries.SwitchingDeliveriesSource$special$$inlined$flatMapLatest$1;
import ru.yandex.taxi.logistics.sdk.management.i;

/* loaded from: classes9.dex */
public final class yzw0 implements qr50 {
    public final muh a;
    public final i b;
    public final xzw0 c;
    public final eci0 d;

    public yzw0(muh muhVar, i iVar, st2 st2Var) {
        this.a = muhVar;
        this.b = iVar;
        ike a = bvf0.a(cvw.U(jl40.a(), st2Var.b));
        this.c = new xzw0();
        this.d = e.O(e.X(muhVar.b, new SwitchingDeliveriesSource$special$$inlined$flatMapLatest$1(null, this)), a, wsr0.a(xsr0.a, 3), 1);
    }

    @Override // defpackage.qr50
    public final Object a(ContinuationImpl continuationImpl) {
        Object a = c((luh) this.a.b.a.getValue()).a(continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    @Override // defpackage.qr50
    public final tpr b() {
        return this.d;
    }

    public final qr50 c(luh luhVar) {
        if (luhVar instanceof juh) {
            return this.b;
        }
        if (luhVar instanceof iuh) {
            return ((iuh) luhVar).a;
        }
        if (luhVar instanceof kuh) {
            return this.c;
        }
        w511.b();
        return null;
    }
}
