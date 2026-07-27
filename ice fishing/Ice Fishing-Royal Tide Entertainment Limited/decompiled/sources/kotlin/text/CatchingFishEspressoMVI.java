package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishEspressoMVI implements ListIterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishEspressoMVI(CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, int i2) {
        this(catchingFishStripeAPIOkHttp, (i2 & 1) != 0 ? 0 : i, 0, catchingFishStripeAPIOkHttp.CatchingFishReduxKtor.CatchingFishSnackbar);
        this.CatchingFishReduxKtor = 0;
    }

    public void CatchingFishCoroutine() {
        if (CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose((CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB) != this.CatchingFishViewModelScope) {
            throw new ConcurrentModificationException();
        }
    }

    public void CatchingFishParcelableFAB() {
        int i;
        i = ((AbstractList) ((CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB).CatchingFishViewModelFAB).modCount;
        if (i != this.CatchingFishViewModelScope) {
            throw new ConcurrentModificationException();
        }
    }

    public void CatchingFishSnackbar() {
        int i;
        i = ((AbstractList) ((CatchingFishCameraXGson) this.CatchingFishViewModelFAB)).modCount;
        if (i != this.CatchingFishViewModelScope) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                CatchingFishParcelableFAB();
                CatchingFishWebSocketMVP catchingFishWebSocketMVP = (CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB;
                int i3 = this.CatchingFishDaggerWebsocket;
                this.CatchingFishDaggerWebsocket = i3 + 1;
                catchingFishWebSocketMVP.add(i3, obj);
                this.CatchingFishWorkManager = -1;
                i = ((AbstractList) catchingFishWebSocketMVP).modCount;
                this.CatchingFishViewModelScope = i;
                return;
            case 2:
                CatchingFishSnackbar();
                CatchingFishCameraXGson catchingFishCameraXGson = (CatchingFishCameraXGson) this.CatchingFishViewModelFAB;
                int i4 = this.CatchingFishDaggerWebsocket;
                this.CatchingFishDaggerWebsocket = i4 + 1;
                catchingFishCameraXGson.add(i4, obj);
                this.CatchingFishWorkManager = -1;
                i2 = ((AbstractList) catchingFishCameraXGson).modCount;
                this.CatchingFishViewModelScope = i2;
                return;
            default:
                CatchingFishCoroutine();
                CatchingFishViewPagerIntent catchingFishViewPagerIntent = (CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB;
                catchingFishViewPagerIntent.add(this.CatchingFishDaggerWebsocket + 1, obj);
                this.CatchingFishWorkManager = -1;
                this.CatchingFishDaggerWebsocket++;
                this.CatchingFishViewModelScope = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.CatchingFishDaggerWebsocket < this.CatchingFishViewModelScope;
            case 1:
                return this.CatchingFishDaggerWebsocket < ((CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB).CatchingFishWorkManager;
            case 2:
                return this.CatchingFishDaggerWebsocket < ((CatchingFishCameraXGson) this.CatchingFishViewModelFAB).CatchingFishDaggerWebsocket;
            default:
                return this.CatchingFishDaggerWebsocket < ((CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.CatchingFishDaggerWebsocket > this.CatchingFishWorkManager) {
                }
                break;
            case 1:
                if (this.CatchingFishDaggerWebsocket > 0) {
                }
                break;
            case 2:
                if (this.CatchingFishDaggerWebsocket > 0) {
                }
                break;
            default:
                if (this.CatchingFishDaggerWebsocket >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishBundleGradle catchingFishBundleGradle = ((CatchingFishStripeAPIOkHttp) this.CatchingFishViewModelFAB).CatchingFishReduxKtor;
                int i = this.CatchingFishDaggerWebsocket;
                this.CatchingFishDaggerWebsocket = i + 1;
                Object CatchingFishDaggerWebsocket = catchingFishBundleGradle.CatchingFishDaggerWebsocket(i);
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishDaggerWebsocket, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (CatchingFishFABStripeAPIFAB) CatchingFishDaggerWebsocket;
            case 1:
                CatchingFishParcelableFAB();
                int i2 = this.CatchingFishDaggerWebsocket;
                CatchingFishWebSocketMVP catchingFishWebSocketMVP = (CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB;
                if (i2 >= catchingFishWebSocketMVP.CatchingFishWorkManager) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishDaggerWebsocket = i2 + 1;
                this.CatchingFishWorkManager = i2;
                return catchingFishWebSocketMVP.CatchingFishReduxKtor[catchingFishWebSocketMVP.CatchingFishDaggerWebsocket + i2];
            case 2:
                CatchingFishSnackbar();
                int i3 = this.CatchingFishDaggerWebsocket;
                CatchingFishCameraXGson catchingFishCameraXGson = (CatchingFishCameraXGson) this.CatchingFishViewModelFAB;
                if (i3 >= catchingFishCameraXGson.CatchingFishDaggerWebsocket) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishDaggerWebsocket = i3 + 1;
                this.CatchingFishWorkManager = i3;
                return catchingFishCameraXGson.CatchingFishReduxKtor[i3];
            default:
                CatchingFishCoroutine();
                int i4 = this.CatchingFishDaggerWebsocket + 1;
                this.CatchingFishWorkManager = i4;
                CatchingFishViewPagerIntent catchingFishViewPagerIntent = (CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB;
                CatchingFishXMLLayoutGlide.CatchingFishLayout(i4, catchingFishViewPagerIntent.size());
                Object obj = catchingFishViewPagerIntent.get(i4);
                this.CatchingFishDaggerWebsocket = i4;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.CatchingFishDaggerWebsocket - this.CatchingFishWorkManager;
            case 1:
                return this.CatchingFishDaggerWebsocket;
            case 2:
                return this.CatchingFishDaggerWebsocket;
            default:
                return this.CatchingFishDaggerWebsocket + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishBundleGradle catchingFishBundleGradle = ((CatchingFishStripeAPIOkHttp) this.CatchingFishViewModelFAB).CatchingFishReduxKtor;
                int i = this.CatchingFishDaggerWebsocket - 1;
                this.CatchingFishDaggerWebsocket = i;
                Object CatchingFishDaggerWebsocket = catchingFishBundleGradle.CatchingFishDaggerWebsocket(i);
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishDaggerWebsocket, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (CatchingFishFABStripeAPIFAB) CatchingFishDaggerWebsocket;
            case 1:
                CatchingFishParcelableFAB();
                int i2 = this.CatchingFishDaggerWebsocket;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.CatchingFishDaggerWebsocket = i3;
                this.CatchingFishWorkManager = i3;
                CatchingFishWebSocketMVP catchingFishWebSocketMVP = (CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB;
                return catchingFishWebSocketMVP.CatchingFishReduxKtor[catchingFishWebSocketMVP.CatchingFishDaggerWebsocket + i3];
            case 2:
                CatchingFishSnackbar();
                int i4 = this.CatchingFishDaggerWebsocket;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.CatchingFishDaggerWebsocket = i5;
                this.CatchingFishWorkManager = i5;
                return ((CatchingFishCameraXGson) this.CatchingFishViewModelFAB).CatchingFishReduxKtor[i5];
            default:
                CatchingFishCoroutine();
                int i6 = this.CatchingFishDaggerWebsocket;
                CatchingFishViewPagerIntent catchingFishViewPagerIntent = (CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB;
                CatchingFishXMLLayoutGlide.CatchingFishLayout(i6, catchingFishViewPagerIntent.size());
                int i7 = this.CatchingFishDaggerWebsocket;
                this.CatchingFishWorkManager = i7;
                this.CatchingFishDaggerWebsocket--;
                return catchingFishViewPagerIntent.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i = this.CatchingFishDaggerWebsocket - this.CatchingFishWorkManager;
                break;
            case 1:
                i = this.CatchingFishDaggerWebsocket;
                break;
            case 2:
                i = this.CatchingFishDaggerWebsocket;
                break;
            default:
                return this.CatchingFishDaggerWebsocket;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                CatchingFishWebSocketMVP catchingFishWebSocketMVP = (CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB;
                CatchingFishParcelableFAB();
                int i3 = this.CatchingFishWorkManager;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                catchingFishWebSocketMVP.CatchingFishSnackbar(i3);
                this.CatchingFishDaggerWebsocket = this.CatchingFishWorkManager;
                this.CatchingFishWorkManager = -1;
                i = ((AbstractList) catchingFishWebSocketMVP).modCount;
                this.CatchingFishViewModelScope = i;
                return;
            case 2:
                CatchingFishCameraXGson catchingFishCameraXGson = (CatchingFishCameraXGson) this.CatchingFishViewModelFAB;
                CatchingFishSnackbar();
                int i4 = this.CatchingFishWorkManager;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                catchingFishCameraXGson.CatchingFishSnackbar(i4);
                this.CatchingFishDaggerWebsocket = this.CatchingFishWorkManager;
                this.CatchingFishWorkManager = -1;
                i2 = ((AbstractList) catchingFishCameraXGson).modCount;
                this.CatchingFishViewModelScope = i2;
                return;
            default:
                CatchingFishCoroutine();
                CatchingFishViewPagerIntent catchingFishViewPagerIntent = (CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB;
                catchingFishViewPagerIntent.remove(this.CatchingFishWorkManager);
                this.CatchingFishDaggerWebsocket--;
                this.CatchingFishWorkManager = -1;
                this.CatchingFishViewModelScope = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                CatchingFishParcelableFAB();
                int i = this.CatchingFishWorkManager;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((CatchingFishWebSocketMVP) this.CatchingFishViewModelFAB).set(i, obj);
                return;
            case 2:
                CatchingFishSnackbar();
                int i2 = this.CatchingFishWorkManager;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((CatchingFishCameraXGson) this.CatchingFishViewModelFAB).set(i2, obj);
                return;
            default:
                CatchingFishViewPagerIntent catchingFishViewPagerIntent = (CatchingFishViewPagerIntent) this.CatchingFishViewModelFAB;
                CatchingFishCoroutine();
                int i3 = this.CatchingFishWorkManager;
                if (i3 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                catchingFishViewPagerIntent.set(i3, obj);
                this.CatchingFishViewModelScope = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
                return;
        }
    }

    public CatchingFishEspressoMVI(CatchingFishCameraXGson catchingFishCameraXGson, int i) {
        int i2;
        this.CatchingFishReduxKtor = 2;
        this.CatchingFishViewModelFAB = catchingFishCameraXGson;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = -1;
        i2 = ((AbstractList) catchingFishCameraXGson).modCount;
        this.CatchingFishViewModelScope = i2;
    }

    public CatchingFishEspressoMVI(CatchingFishViewPagerIntent catchingFishViewPagerIntent, int i) {
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishViewModelFAB = catchingFishViewPagerIntent;
        this.CatchingFishDaggerWebsocket = i - 1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelScope = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
    }

    public CatchingFishEspressoMVI(CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp, int i, int i2, int i3) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishViewModelFAB = catchingFishStripeAPIOkHttp;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = i2;
        this.CatchingFishViewModelScope = i3;
    }

    public CatchingFishEspressoMVI(CatchingFishWebSocketMVP catchingFishWebSocketMVP, int i) {
        int i2;
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishViewModelFAB = catchingFishWebSocketMVP;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = -1;
        i2 = ((AbstractList) catchingFishWebSocketMVP).modCount;
        this.CatchingFishViewModelScope = i2;
    }
}
