package kotlin.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {
    public final f d;

    public a(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.d = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext K(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element j(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext o(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object w(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }
}
