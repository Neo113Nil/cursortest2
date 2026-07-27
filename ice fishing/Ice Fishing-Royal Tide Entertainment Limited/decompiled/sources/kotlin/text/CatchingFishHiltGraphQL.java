package kotlin.text;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishHiltGraphQL extends AbstractMap implements Map, CatchingFishSnackbarMVP {
    public CatchingFishOkHttpIntent CatchingFishDaggerWebsocket;
    public CatchingFishKtorToolbar CatchingFishLayout;
    public CatchingFishWidgetContext CatchingFishReduxKtor = new CatchingFishWidgetContext();
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishHiltGraphQL(CatchingFishKtorToolbar catchingFishKtorToolbar) {
        this.CatchingFishDaggerWebsocket = catchingFishKtorToolbar.CatchingFishReduxKtor;
        this.CatchingFishViewModelFAB = catchingFishKtorToolbar.CatchingFishDaggerWebsocket;
        this.CatchingFishLayout = catchingFishKtorToolbar;
    }

    public final Object CatchingFishCoroutine(Object obj) {
        return this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void CatchingFishDaggerWebsocket(int i) {
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishViewModelScope++;
    }

    public final CatchingFishKtorToolbar CatchingFishParcelableFAB() {
        CatchingFishOkHttpIntent catchingFishOkHttpIntent = this.CatchingFishDaggerWebsocket;
        CatchingFishKtorToolbar catchingFishKtorToolbar = this.CatchingFishLayout;
        if (catchingFishOkHttpIntent != catchingFishKtorToolbar.CatchingFishReduxKtor) {
            this.CatchingFishReduxKtor = new CatchingFishWidgetContext();
            catchingFishKtorToolbar = new CatchingFishKtorToolbar(this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelFAB);
        }
        this.CatchingFishLayout = catchingFishKtorToolbar;
        return catchingFishKtorToolbar;
    }

    public final Object CatchingFishReduxKtor(Object obj) {
        this.CatchingFishWorkManager = null;
        CatchingFishOkHttpIntent CatchingFishUnitTesting = this.CatchingFishDaggerWebsocket.CatchingFishUnitTesting(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (CatchingFishUnitTesting == null) {
            CatchingFishUnitTesting = CatchingFishOkHttpIntent.CatchingFishDaggerWebsocket;
        }
        this.CatchingFishDaggerWebsocket = CatchingFishUnitTesting;
        return this.CatchingFishWorkManager;
    }

    public final boolean CatchingFishSnackbar(Object obj) {
        return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.CatchingFishDaggerWebsocket = CatchingFishOkHttpIntent.CatchingFishDaggerWebsocket;
        CatchingFishDaggerWebsocket(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CatchingFishStripeAPILayout) {
            return CatchingFishSnackbar((CatchingFishStripeAPILayout) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof CatchingFishPayPalView) {
            return super.containsValue((CatchingFishPayPalView) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new CatchingFishMVPXMLLayout(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof CatchingFishStripeAPILayout) {
            return (CatchingFishPayPalView) CatchingFishCoroutine((CatchingFishStripeAPILayout) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CatchingFishStripeAPILayout) ? obj2 : (CatchingFishPayPalView) super.getOrDefault((CatchingFishStripeAPILayout) obj, (CatchingFishPayPalView) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new CatchingFishMVPXMLLayout(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.CatchingFishWorkManager = null;
        this.CatchingFishDaggerWebsocket = this.CatchingFishDaggerWebsocket.CatchingFishEspressoTesting(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.CatchingFishWorkManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.text.CatchingFishLayoutViewAdMob] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        CatchingFishKtorToolbar catchingFishKtorToolbar = null;
        CatchingFishKtorToolbar catchingFishKtorToolbar2 = map instanceof CatchingFishLayoutViewAdMob ? (CatchingFishLayoutViewAdMob) map : null;
        if (catchingFishKtorToolbar2 == null) {
            CatchingFishHiltGraphQL catchingFishHiltGraphQL = map instanceof CatchingFishHiltGraphQL ? (CatchingFishHiltGraphQL) map : null;
            if (catchingFishHiltGraphQL != null) {
                catchingFishKtorToolbar = catchingFishHiltGraphQL.CatchingFishParcelableFAB();
            }
        } else {
            catchingFishKtorToolbar = catchingFishKtorToolbar2;
        }
        if (catchingFishKtorToolbar == null) {
            super.putAll(map);
            return;
        }
        CatchingFishRetrofitRedux catchingFishRetrofitRedux = new CatchingFishRetrofitRedux();
        catchingFishRetrofitRedux.CatchingFishParcelableFAB = 0;
        int i = this.CatchingFishViewModelFAB;
        CatchingFishOkHttpIntent catchingFishOkHttpIntent = this.CatchingFishDaggerWebsocket;
        CatchingFishOkHttpIntent catchingFishOkHttpIntent2 = catchingFishKtorToolbar.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishOkHttpIntent2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.CatchingFishDaggerWebsocket = catchingFishOkHttpIntent.CatchingFishOkHttp(catchingFishOkHttpIntent2, 0, catchingFishRetrofitRedux, this);
        int i2 = (catchingFishKtorToolbar.CatchingFishDaggerWebsocket + i) - catchingFishRetrofitRedux.CatchingFishParcelableFAB;
        if (i != i2) {
            CatchingFishDaggerWebsocket(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.CatchingFishViewModelFAB;
        CatchingFishOkHttpIntent CatchingFishAnimationMockk = this.CatchingFishDaggerWebsocket.CatchingFishAnimationMockk(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (CatchingFishAnimationMockk == null) {
            CatchingFishAnimationMockk = CatchingFishOkHttpIntent.CatchingFishDaggerWebsocket;
        }
        this.CatchingFishDaggerWebsocket = CatchingFishAnimationMockk;
        return i != this.CatchingFishViewModelFAB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.CatchingFishViewModelFAB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new CatchingFishFABGradle(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof CatchingFishStripeAPILayout) {
            return (CatchingFishPayPalView) CatchingFishReduxKtor((CatchingFishStripeAPILayout) obj);
        }
        return null;
    }
}
