package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishHiltToast implements Iterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelFAB;
    public final /* synthetic */ int CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishHiltToast(int i) {
        this.CatchingFishReduxKtor = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishDaggerWebsocket < this.CatchingFishReduxKtor;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object CatchingFishWorkManager;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.CatchingFishDaggerWebsocket;
        switch (this.CatchingFishViewModelScope) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishWorkManager = ((CatchingFishCameraXRetrofit) this.CatchingFishViewModelFAB).CatchingFishWorkManager(i);
                break;
            case 1:
                CatchingFishWorkManager = ((CatchingFishCameraXRetrofit) this.CatchingFishViewModelFAB).CatchingFishLayout(i);
                break;
            default:
                CatchingFishWorkManager = ((CatchingFishRoomStateFlow) this.CatchingFishViewModelFAB).CatchingFishDaggerWebsocket[i];
                break;
        }
        this.CatchingFishDaggerWebsocket++;
        this.CatchingFishWorkManager = true;
        return CatchingFishWorkManager;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.CatchingFishWorkManager) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.CatchingFishDaggerWebsocket - 1;
        this.CatchingFishDaggerWebsocket = i;
        switch (this.CatchingFishViewModelScope) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishCameraXRetrofit) this.CatchingFishViewModelFAB).CatchingFishViewModelScope(i);
                break;
            case 1:
                ((CatchingFishCameraXRetrofit) this.CatchingFishViewModelFAB).CatchingFishViewModelScope(i);
                break;
            default:
                ((CatchingFishRoomStateFlow) this.CatchingFishViewModelFAB).CatchingFishParcelableFAB(i);
                break;
        }
        this.CatchingFishReduxKtor--;
        this.CatchingFishWorkManager = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishHiltToast(CatchingFishRoomStateFlow catchingFishRoomStateFlow) {
        this(catchingFishRoomStateFlow.CatchingFishWorkManager);
        this.CatchingFishViewModelScope = 2;
        this.CatchingFishViewModelFAB = catchingFishRoomStateFlow;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishHiltToast(CatchingFishCameraXRetrofit catchingFishCameraXRetrofit, int i) {
        this(catchingFishCameraXRetrofit.CatchingFishWorkManager);
        this.CatchingFishViewModelScope = i;
        switch (i) {
            case 1:
                this.CatchingFishViewModelFAB = catchingFishCameraXRetrofit;
                this(catchingFishCameraXRetrofit.CatchingFishWorkManager);
                break;
            default:
                this.CatchingFishViewModelFAB = catchingFishCameraXRetrofit;
                break;
        }
    }
}
