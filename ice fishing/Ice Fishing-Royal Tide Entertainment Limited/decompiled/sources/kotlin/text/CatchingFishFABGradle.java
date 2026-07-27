package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishFABGradle extends AbstractCollection implements Collection, CatchingFishViewAndroidX {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFABGradle(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishToastView) this.CatchingFishDaggerWebsocket).clear();
                break;
            default:
                ((CatchingFishHiltGraphQL) this.CatchingFishDaggerWebsocket).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((CatchingFishToastView) this.CatchingFishDaggerWebsocket).containsValue(obj);
            default:
                return ((CatchingFishHiltGraphQL) this.CatchingFishDaggerWebsocket).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((CatchingFishToastView) this.CatchingFishDaggerWebsocket).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishToastView catchingFishToastView = (CatchingFishToastView) this.CatchingFishDaggerWebsocket;
                catchingFishToastView.getClass();
                return new CatchingFishFABFABGradle(catchingFishToastView, 2);
            default:
                CatchingFishHiltGraphQL catchingFishHiltGraphQL = (CatchingFishHiltGraphQL) this.CatchingFishDaggerWebsocket;
                CatchingFishRetrofitOkHttp[] catchingFishRetrofitOkHttpArr = new CatchingFishRetrofitOkHttp[8];
                for (int i = 0; i < 8; i++) {
                    catchingFishRetrofitOkHttpArr[i] = new CatchingFishFABAdMobOkHttp(2);
                }
                return new CatchingFishReduxDaggerHilt(catchingFishHiltGraphQL, catchingFishRetrofitOkHttpArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishToastView catchingFishToastView = (CatchingFishToastView) this.CatchingFishDaggerWebsocket;
                catchingFishToastView.CatchingFishSnackbar();
                int CatchingFishViewModelFAB = catchingFishToastView.CatchingFishViewModelFAB(obj);
                if (CatchingFishViewModelFAB < 0) {
                    return false;
                }
                catchingFishToastView.CatchingFishCloudMessaging(CatchingFishViewModelFAB);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                ((CatchingFishToastView) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
                ((CatchingFishToastView) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((CatchingFishToastView) this.CatchingFishDaggerWebsocket).CatchingFishEspressoTesting;
            default:
                CatchingFishHiltGraphQL catchingFishHiltGraphQL = (CatchingFishHiltGraphQL) this.CatchingFishDaggerWebsocket;
                catchingFishHiltGraphQL.getClass();
                return catchingFishHiltGraphQL.CatchingFishViewModelFAB;
        }
    }
}
