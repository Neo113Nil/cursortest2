package kotlin.text;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineKtor extends CatchingFishPicassoMockk implements Iterator {
    public boolean CatchingFishDaggerWebsocket = true;
    public CatchingFishPayPalGraphQL CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishLiveDataViewMVI CatchingFishWorkManager;

    public CatchingFishCoroutineKtor(CatchingFishLiveDataViewMVI catchingFishLiveDataViewMVI) {
        this.CatchingFishWorkManager = catchingFishLiveDataViewMVI;
    }

    @Override // kotlin.text.CatchingFishPicassoMockk
    public final void CatchingFishParcelableFAB(CatchingFishPayPalGraphQL catchingFishPayPalGraphQL) {
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2 = this.CatchingFishReduxKtor;
        if (catchingFishPayPalGraphQL == catchingFishPayPalGraphQL2) {
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL3 = catchingFishPayPalGraphQL2.CatchingFishViewModelScope;
            this.CatchingFishReduxKtor = catchingFishPayPalGraphQL3;
            this.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.CatchingFishDaggerWebsocket) {
            return this.CatchingFishWorkManager.CatchingFishReduxKtor != null;
        }
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = this.CatchingFishReduxKtor;
        return (catchingFishPayPalGraphQL == null || catchingFishPayPalGraphQL.CatchingFishWorkManager == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishDaggerWebsocket = false;
            this.CatchingFishReduxKtor = this.CatchingFishWorkManager.CatchingFishReduxKtor;
        } else {
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = this.CatchingFishReduxKtor;
            this.CatchingFishReduxKtor = catchingFishPayPalGraphQL != null ? catchingFishPayPalGraphQL.CatchingFishWorkManager : null;
        }
        return this.CatchingFishReduxKtor;
    }
}
