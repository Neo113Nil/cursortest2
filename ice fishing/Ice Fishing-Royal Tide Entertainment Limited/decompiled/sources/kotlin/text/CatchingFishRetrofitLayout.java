package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitLayout implements Iterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishRetrofitLayout(Object obj, Map map) {
        this.CatchingFishReduxKtor = 2;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishViewModelScope = map;
    }

    public void CatchingFishParcelableFAB() {
        Object CatchingFishFragmentHandler;
        CatchingFishMVIAnimation catchingFishMVIAnimation = (CatchingFishMVIAnimation) this.CatchingFishViewModelScope;
        if (this.CatchingFishDaggerWebsocket == -2) {
            CatchingFishFragmentHandler = catchingFishMVIAnimation.CatchingFishParcelableFAB.CatchingFishParcelableFAB();
        } else {
            CatchingFishServiceHandler catchingFishServiceHandler = catchingFishMVIAnimation.CatchingFishSnackbar;
            Object obj = this.CatchingFishWorkManager;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj);
            CatchingFishFragmentHandler = catchingFishServiceHandler.CatchingFishFragmentHandler(obj);
        }
        this.CatchingFishWorkManager = CatchingFishFragmentHandler;
        this.CatchingFishDaggerWebsocket = CatchingFishFragmentHandler == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.CatchingFishDaggerWebsocket < 0) {
                    CatchingFishParcelableFAB();
                }
                return this.CatchingFishDaggerWebsocket == 1;
            case 1:
                return ((CatchingFishViewDagger) this.CatchingFishWorkManager).hasNext();
            default:
                return this.CatchingFishDaggerWebsocket < ((Map) this.CatchingFishViewModelScope).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.CatchingFishDaggerWebsocket < 0) {
                    CatchingFishParcelableFAB();
                }
                if (this.CatchingFishDaggerWebsocket == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.CatchingFishWorkManager;
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.CatchingFishDaggerWebsocket = -1;
                return obj;
            case 1:
                return ((CatchingFishViewDagger) this.CatchingFishWorkManager).next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.CatchingFishWorkManager;
                this.CatchingFishDaggerWebsocket++;
                Object obj3 = ((Map) this.CatchingFishViewModelScope).get(obj2);
                if (obj3 != null) {
                    this.CatchingFishWorkManager = ((CatchingFishWorkManagerGson) obj3).CatchingFishSnackbar;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.CatchingFishDaggerWebsocket;
                if (i != -1) {
                    ((CatchingFishAppCompatHilt) this.CatchingFishViewModelScope).CatchingFishDaggerWebsocket.CatchingFishEspressoTesting(i);
                    this.CatchingFishDaggerWebsocket = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public CatchingFishRetrofitLayout(CatchingFishMVIAnimation catchingFishMVIAnimation) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishViewModelScope = catchingFishMVIAnimation;
        this.CatchingFishDaggerWebsocket = -2;
    }

    public CatchingFishRetrofitLayout(CatchingFishAppCompatHilt catchingFishAppCompatHilt) {
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishViewModelScope = catchingFishAppCompatHilt;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = CatchingFishToastHiltBundle.CatchingFishGsonAppCompat(new CatchingFishRealmAnimation(catchingFishAppCompatHilt, this, null));
    }
}
