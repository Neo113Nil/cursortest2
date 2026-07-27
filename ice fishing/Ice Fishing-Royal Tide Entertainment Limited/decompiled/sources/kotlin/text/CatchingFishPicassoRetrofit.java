package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishPicassoRetrofit extends CatchingFishXMLLayoutBundle implements CatchingFishDaggerStateFlow, CatchingFishMVVMDataStore, CatchingFishIntentAnimation {
    public final int CatchingFishCloudMessaging;
    public final int CatchingFishFragmentHandler;

    public CatchingFishPicassoRetrofit(int i, Class cls, String str, String str2, int i2) {
        this(i, CatchingFishRetrofitGson.CatchingFishReduxKtor, cls, str, str2, i2, 0);
    }

    @Override // kotlin.text.CatchingFishDaggerStateFlow
    public final int CatchingFishSnackbar() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishXMLLayoutBundle
    public final CatchingFishMVVMDataStore CatchingFishWorkManager() {
        CatchingFishContextFlux.CatchingFishParcelableFAB.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishPicassoRetrofit) {
            CatchingFishPicassoRetrofit catchingFishPicassoRetrofit = (CatchingFishPicassoRetrofit) obj;
            return this.CatchingFishViewModelScope.equals(catchingFishPicassoRetrofit.CatchingFishViewModelScope) && this.CatchingFishViewModelFAB.equals(catchingFishPicassoRetrofit.CatchingFishViewModelFAB) && this.CatchingFishCloudMessaging == catchingFishPicassoRetrofit.CatchingFishCloudMessaging && this.CatchingFishFragmentHandler == catchingFishPicassoRetrofit.CatchingFishFragmentHandler && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishPicassoRetrofit.CatchingFishDaggerWebsocket) && CatchingFishViewModelScope().equals(catchingFishPicassoRetrofit.CatchingFishViewModelScope());
        }
        if (!(obj instanceof CatchingFishPicassoRetrofit)) {
            return false;
        }
        CatchingFishMVVMDataStore catchingFishMVVMDataStore = this.CatchingFishReduxKtor;
        if (catchingFishMVVMDataStore == null) {
            CatchingFishWorkManager();
            this.CatchingFishReduxKtor = this;
            catchingFishMVVMDataStore = this;
        }
        return obj.equals(catchingFishMVVMDataStore);
    }

    public final int hashCode() {
        CatchingFishViewModelScope();
        return this.CatchingFishViewModelFAB.hashCode() + ((this.CatchingFishViewModelScope.hashCode() + (CatchingFishViewModelScope().hashCode() * 31)) * 31);
    }

    public final String toString() {
        CatchingFishMVVMDataStore catchingFishMVVMDataStore = this.CatchingFishReduxKtor;
        if (catchingFishMVVMDataStore == null) {
            CatchingFishWorkManager();
            this.CatchingFishReduxKtor = this;
            catchingFishMVVMDataStore = this;
        }
        if (catchingFishMVVMDataStore != this) {
            return catchingFishMVVMDataStore.toString();
        }
        String str = this.CatchingFishViewModelScope;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : CatchingFishMVPLiveData.CatchingFishOkHttp("function ", str, " (Kotlin reflection is not available)");
    }

    public CatchingFishPicassoRetrofit(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.CatchingFishFragmentHandler = i;
        this.CatchingFishCloudMessaging = 0;
    }
}
