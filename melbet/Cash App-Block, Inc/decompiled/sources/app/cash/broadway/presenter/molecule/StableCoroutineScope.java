package app.cash.broadway.presenter.molecule;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class StableCoroutineScope implements CoroutineScope {
    public final /* synthetic */ CoroutineScope $$delegate_0;

    public StableCoroutineScope(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.$$delegate_0 = coroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
