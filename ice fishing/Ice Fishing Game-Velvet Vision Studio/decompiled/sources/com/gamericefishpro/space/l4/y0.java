package com.gamericefishpro.space.l4;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements CoroutineContext.Element {
    public final y0 d;
    public final c0 e;

    public y0(y0 y0Var, c0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.d = y0Var;
        this.e = instance;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public final void a(c0 candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.e == candidate) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        y0 y0Var = this.d;
        if (y0Var != null) {
            y0Var.a(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return x0.d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element j(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext o(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object w(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }
}
