package androidx.room.coroutines;

import com.bumptech.glide.GlideBuilder$1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ConnectionElement implements CoroutineContext.Element {
    public static final GlideBuilder$1 Key = new GlideBuilder$1();
    public final PooledConnectionImpl connectionWrapper;

    public ConnectionElement(PooledConnectionImpl pooledConnectionImpl) {
        pooledConnectionImpl.getClass();
        this.connectionWrapper = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
