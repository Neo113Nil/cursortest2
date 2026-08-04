package com.gamericefishpro.space.si;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.ti.e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final com.gamericefishpro.space.ri.s v;
    public final boolean w;

    public /* synthetic */ b(com.gamericefishpro.space.ri.s sVar, boolean z) {
        this(sVar, z, kotlin.coroutines.g.d, -3, com.gamericefishpro.space.ri.a.d);
    }

    @Override // com.gamericefishpro.space.ti.e, com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) throws Throwable {
        if (this.e != -3) {
            Object objA = super.a(fVar, aVar);
            return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
        }
        boolean z = this.w;
        if (z && y.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object objG = e0.g(fVar, this.v, z, aVar);
        return objG == com.gamericefishpro.space.uh.a.d ? objG : Unit.a;
    }

    @Override // com.gamericefishpro.space.ti.e
    public final String c() {
        return "channel=" + this.v;
    }

    @Override // com.gamericefishpro.space.ti.e
    public final Object d(com.gamericefishpro.space.ri.q qVar, com.gamericefishpro.space.b0.o oVar) throws Throwable {
        Object objG = e0.g(new com.gamericefishpro.space.ti.w(qVar), this.v, this.w, oVar);
        return objG == com.gamericefishpro.space.uh.a.d ? objG : Unit.a;
    }

    @Override // com.gamericefishpro.space.ti.e
    public final com.gamericefishpro.space.ti.e e(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        return new b(this.v, this.w, coroutineContext, i, aVar);
    }

    @Override // com.gamericefishpro.space.ti.e
    public final e f() {
        return new b(this.v, this.w);
    }

    @Override // com.gamericefishpro.space.ti.e
    public final com.gamericefishpro.space.ri.s g(com.gamericefishpro.space.pi.x xVar) {
        if (this.w && y.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.e == -3 ? this.v : super.g(xVar);
    }

    public b(com.gamericefishpro.space.ri.s sVar, boolean z, CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        super(coroutineContext, i, aVar);
        this.v = sVar;
        this.w = z;
    }
}
