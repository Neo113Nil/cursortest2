package kotlinx.coroutines.flow.internal;

import defpackage.fse;
import defpackage.l8x;
import defpackage.mqq0;
import defpackage.q5z;
import defpackage.qnq0;
import defpackage.sb2;
import defpackage.seu;
import defpackage.tfi0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class d extends a {
    public final tpr w;
    public final int x;

    public d(int i, int i2, fse fseVar, tpr tprVar, BufferOverflow bufferOverflow) {
        super(fseVar, i2, bufferOverflow);
        this.w = tprVar;
        this.x = i;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final String d() {
        return "concurrency=" + this.x;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object e(y6f0 y6f0Var, Continuation continuation) {
        Object collect = this.w.collect(new c((l8x) continuation.get_context().get(seu.C), qnq0.a(this.x), y6f0Var, new mqq0(y6f0Var)), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a h(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return new d(this.x, i, fseVar, this.w, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final tfi0 j(tse tseVar) {
        wls channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        x6f0 x6f0Var = new x6f0(q5z.M(tseVar, this.a), sb2.a(this.b, bufferOverflow, null, 4));
        x6f0Var.m0(coroutineStart, x6f0Var, channelFlow$collectToFun$1);
        return x6f0Var;
    }
}
