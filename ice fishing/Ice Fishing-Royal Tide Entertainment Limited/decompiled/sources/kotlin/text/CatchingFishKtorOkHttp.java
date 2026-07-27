package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishKtorOkHttp implements Set, CatchingFishCardViewFAB {
    public final CatchingFishPayPalService CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public CatchingFishKtorOkHttp(CatchingFishPayPalService catchingFishPayPalService, int i) {
        this.CatchingFishReduxKtor = i;
        switch (i) {
            case 1:
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalService, "parent");
                this.CatchingFishDaggerWebsocket = catchingFishPayPalService;
                break;
            default:
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalService, "parent");
                this.CatchingFishDaggerWebsocket = catchingFishPayPalService;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(entry, "element");
                return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope(entry.getKey()), entry.getValue());
            default:
                return this.CatchingFishDaggerWebsocket.CatchingFishCoroutine(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!this.CatchingFishDaggerWebsocket.CatchingFishCoroutine(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket.CatchingFishLayout();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishToastHiltBundle.CatchingFishGsonAppCompat(new CatchingFishMockkHandler(this, null));
            default:
                return CatchingFishToastHiltBundle.CatchingFishGsonAppCompat(new CatchingFishMVPRealm(this, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.CatchingFishReduxKtor) {
        }
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
                break;
            default:
                CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
                break;
        }
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
