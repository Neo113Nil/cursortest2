package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishWidgetLifecycle extends CatchingFishXMLLayoutBundle implements CatchingFishServiceMoshi {
    public final boolean CatchingFishFragmentHandler;

    public CatchingFishWidgetLifecycle(int i, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.CatchingFishFragmentHandler = false;
    }

    public final CatchingFishMVVMDataStore CatchingFishViewModelFAB() {
        if (this.CatchingFishFragmentHandler) {
            return this;
        }
        CatchingFishMVVMDataStore catchingFishMVVMDataStore = this.CatchingFishReduxKtor;
        if (catchingFishMVVMDataStore != null) {
            return catchingFishMVVMDataStore;
        }
        CatchingFishMVVMDataStore CatchingFishWorkManager = CatchingFishWorkManager();
        this.CatchingFishReduxKtor = CatchingFishWorkManager;
        return CatchingFishWorkManager;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishWidgetLifecycle) {
            CatchingFishWidgetLifecycle catchingFishWidgetLifecycle = (CatchingFishWidgetLifecycle) obj;
            return CatchingFishViewModelScope().equals(catchingFishWidgetLifecycle.CatchingFishViewModelScope()) && this.CatchingFishViewModelScope.equals(catchingFishWidgetLifecycle.CatchingFishViewModelScope) && this.CatchingFishViewModelFAB.equals(catchingFishWidgetLifecycle.CatchingFishViewModelFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishWidgetLifecycle.CatchingFishDaggerWebsocket);
        }
        if (obj instanceof CatchingFishServiceMoshi) {
            return obj.equals(CatchingFishViewModelFAB());
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishViewModelFAB.hashCode() + ((this.CatchingFishViewModelScope.hashCode() + (CatchingFishViewModelScope().hashCode() * 31)) * 31);
    }

    public final String toString() {
        CatchingFishMVVMDataStore CatchingFishViewModelFAB = CatchingFishViewModelFAB();
        return CatchingFishViewModelFAB != this ? CatchingFishViewModelFAB.toString() : CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("property "), this.CatchingFishViewModelScope, " (Kotlin reflection is not available)");
    }
}
