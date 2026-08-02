package androidx.datastore.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class UpdatingDataContextElement implements CoroutineContext.Element {
    public final DataStoreImpl instance;
    public final UpdatingDataContextElement parent;

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl dataStoreImpl) {
        this.parent = updatingDataContextElement;
        this.instance = dataStoreImpl;
    }

    public final void checkNotUpdating(DataStoreImpl dataStoreImpl) {
        if (this.instance == dataStoreImpl) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(dataStoreImpl);
        }
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
        return UpdatingDataContextElement$Companion$Key.INSTANCE;
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
