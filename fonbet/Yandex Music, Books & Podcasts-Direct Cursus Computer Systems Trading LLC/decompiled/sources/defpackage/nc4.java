package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public final class nc4 extends sc4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(nc4.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final qln d;
    public final boolean e;

    public /* synthetic */ nc4(qln qlnVar, boolean z) {
        this(qlnVar, z, g.a, -3, oi3.a);
    }

    @Override // defpackage.sc4, defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        if (this.b != -3) {
            Object collect = super.collect(rjcVar, continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
        boolean z = this.e;
        if (z && f.getAndSet(this, 1) == 1) {
            xq0.q("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object H = xv.H(rjcVar, this.d, z, continuation);
        return H == nm6.a ? H : Unit.a;
    }

    @Override // defpackage.sc4
    public final String d() {
        return "channel=" + this.d;
    }

    @Override // defpackage.sc4
    public final Object e(ltm ltmVar, Continuation continuation) {
        Object H = xv.H(new ngp(ltmVar), this.d, this.e, continuation);
        return H == nm6.a ? H : Unit.a;
    }

    @Override // defpackage.sc4
    public final sc4 f(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return new nc4(this.d, this.e, coroutineContext, i, oi3Var);
    }

    @Override // defpackage.sc4
    public final pjc h() {
        return new nc4(this.d, this.e);
    }

    @Override // defpackage.sc4
    public final qln i(mm6 mm6Var) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.i(mm6Var);
        }
        xq0.q("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public nc4(qln qlnVar, boolean z, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        super(coroutineContext, i, oi3Var);
        this.d = qlnVar;
        this.e = z;
    }
}
