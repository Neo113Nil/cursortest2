package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.v1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements v1 {
    public final Object d;
    public final ThreadLocal e;
    public final v i;

    public u(com.gamericefishpro.space.u5.q qVar, ThreadLocal threadLocal) {
        this.d = qVar;
        this.e = threadLocal;
        this.i = new v(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(kotlin.coroutines.f fVar) {
        return this.i.equals(fVar) ? kotlin.coroutines.g.d : this;
    }

    @Override // com.gamericefishpro.space.pi.v1
    public final Object M(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.e;
        Object obj = threadLocal.get();
        threadLocal.set(this.d);
        return obj;
    }

    public final void a(Object obj) {
        this.e.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.i;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element j(kotlin.coroutines.f fVar) {
        if (this.i.equals(fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext o(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.d + ", threadLocal = " + this.e + ')';
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object w(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }
}
