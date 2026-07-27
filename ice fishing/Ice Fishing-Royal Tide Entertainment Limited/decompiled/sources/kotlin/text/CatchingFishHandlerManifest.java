package kotlin.text;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class CatchingFishHandlerManifest implements Map, CatchingFishCardViewFAB {
    public CatchingFishKtorOkHttp CatchingFishDaggerWebsocket;
    public final CatchingFishPayPalService CatchingFishReduxKtor;
    public CatchingFishMVPToastIntent CatchingFishViewModelScope;
    public CatchingFishKtorOkHttp CatchingFishWorkManager;

    public CatchingFishHandlerManifest(CatchingFishPayPalService catchingFishPayPalService) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalService, "parent");
        this.CatchingFishReduxKtor = catchingFishPayPalService;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishCoroutine(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        CatchingFishKtorOkHttp catchingFishKtorOkHttp = this.CatchingFishDaggerWebsocket;
        if (catchingFishKtorOkHttp != null) {
            return catchingFishKtorOkHttp;
        }
        CatchingFishKtorOkHttp catchingFishKtorOkHttp2 = new CatchingFishKtorOkHttp(this.CatchingFishReduxKtor, 0);
        this.CatchingFishDaggerWebsocket = catchingFishKtorOkHttp2;
        return catchingFishKtorOkHttp2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishHandlerManifest.class != obj.getClass()) {
            return false;
        }
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, ((CatchingFishHandlerManifest) obj).CatchingFishReduxKtor);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishViewModelScope(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.CatchingFishLayout();
    }

    @Override // java.util.Map
    public final Set keySet() {
        CatchingFishKtorOkHttp catchingFishKtorOkHttp = this.CatchingFishWorkManager;
        if (catchingFishKtorOkHttp != null) {
            return catchingFishKtorOkHttp;
        }
        CatchingFishKtorOkHttp catchingFishKtorOkHttp2 = new CatchingFishKtorOkHttp(this.CatchingFishReduxKtor, 1);
        this.CatchingFishWorkManager = catchingFishKtorOkHttp2;
        return catchingFishKtorOkHttp2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
    }

    public final String toString() {
        return this.CatchingFishReduxKtor.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        CatchingFishMVPToastIntent catchingFishMVPToastIntent = this.CatchingFishViewModelScope;
        if (catchingFishMVPToastIntent != null) {
            return catchingFishMVPToastIntent;
        }
        CatchingFishMVPToastIntent catchingFishMVPToastIntent2 = new CatchingFishMVPToastIntent(this.CatchingFishReduxKtor);
        this.CatchingFishViewModelScope = catchingFishMVPToastIntent2;
        return catchingFishMVPToastIntent2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
