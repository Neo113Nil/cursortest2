package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishBundleLiveData extends CatchingFish {
    public final CatchingFishToastView CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishBundleLiveData(CatchingFishToastView catchingFishToastView, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishToastView;
    }

    @Override // kotlin.text.CatchingFish
    public final int CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket.CatchingFishEspressoTesting;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.clear();
                break;
            default:
                this.CatchingFishDaggerWebsocket.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(entry, "element");
                return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket(entry);
            default:
                return this.CatchingFishDaggerWebsocket.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishToastView catchingFishToastView = this.CatchingFishDaggerWebsocket;
                catchingFishToastView.getClass();
                return new CatchingFishFABFABGradle(catchingFishToastView, 0);
            default:
                CatchingFishToastView catchingFishToastView2 = this.CatchingFishDaggerWebsocket;
                catchingFishToastView2.getClass();
                return new CatchingFishFABFABGradle(catchingFishToastView2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    CatchingFishFirebaseDagger.CatchingFishNavigation(entry, "element");
                    CatchingFishToastView catchingFishToastView = this.CatchingFishDaggerWebsocket;
                    catchingFishToastView.getClass();
                    catchingFishToastView.CatchingFishSnackbar();
                    int CatchingFishViewModelScope = catchingFishToastView.CatchingFishViewModelScope(entry.getKey());
                    if (CatchingFishViewModelScope >= 0) {
                        Object[] objArr = catchingFishToastView.CatchingFishDaggerWebsocket;
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
                        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(objArr[CatchingFishViewModelScope], entry.getValue())) {
                            catchingFishToastView.CatchingFishCloudMessaging(CatchingFishViewModelScope);
                            break;
                        }
                    }
                }
                break;
            default:
                CatchingFishToastView catchingFishToastView2 = this.CatchingFishDaggerWebsocket;
                catchingFishToastView2.CatchingFishSnackbar();
                int CatchingFishViewModelScope2 = catchingFishToastView2.CatchingFishViewModelScope(obj);
                if (CatchingFishViewModelScope2 >= 0) {
                    catchingFishToastView2.CatchingFishCloudMessaging(CatchingFishViewModelScope2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                this.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
                break;
            default:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                this.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                this.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
                break;
            default:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                this.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
                break;
        }
        return super.retainAll(collection);
    }
}
