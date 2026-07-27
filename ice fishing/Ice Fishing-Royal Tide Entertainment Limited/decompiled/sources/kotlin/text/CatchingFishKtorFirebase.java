package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishKtorFirebase {
    public static int CatchingFishCloudMessaging;
    public static final CatchingFishMoshiFluxMoshi CatchingFishEspressoTesting = new CatchingFishMoshiFluxMoshi(20);
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final int CatchingFishFragmentHandler;
    public final boolean CatchingFishLayout;
    public final String CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;
    public final int CatchingFishViewModelFAB;
    public final long CatchingFishViewModelScope;
    public final CatchingFishPayPalViewModel CatchingFishWorkManager;

    public CatchingFishKtorFirebase(String str, float f, float f2, float f3, float f4, CatchingFishPayPalViewModel catchingFishPayPalViewModel, long j, int i, boolean z) {
        int i2;
        synchronized (CatchingFishEspressoTesting) {
            i2 = CatchingFishCloudMessaging;
            CatchingFishCloudMessaging = i2 + 1;
        }
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = f;
        this.CatchingFishCoroutine = f2;
        this.CatchingFishReduxKtor = f3;
        this.CatchingFishDaggerWebsocket = f4;
        this.CatchingFishWorkManager = catchingFishPayPalViewModel;
        this.CatchingFishViewModelScope = j;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = z;
        this.CatchingFishFragmentHandler = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishKtorFirebase)) {
            return false;
        }
        CatchingFishKtorFirebase catchingFishKtorFirebase = (CatchingFishKtorFirebase) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishKtorFirebase.CatchingFishParcelableFAB) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishSnackbar, catchingFishKtorFirebase.CatchingFishSnackbar) && CatchingFishHiltWorkManager.CatchingFishParcelableFAB(this.CatchingFishCoroutine, catchingFishKtorFirebase.CatchingFishCoroutine) && this.CatchingFishReduxKtor == catchingFishKtorFirebase.CatchingFishReduxKtor && this.CatchingFishDaggerWebsocket == catchingFishKtorFirebase.CatchingFishDaggerWebsocket && this.CatchingFishWorkManager.equals(catchingFishKtorFirebase.CatchingFishWorkManager) && CatchingFishToastFragment.CatchingFishCoroutine(this.CatchingFishViewModelScope, catchingFishKtorFirebase.CatchingFishViewModelScope) && this.CatchingFishViewModelFAB == catchingFishKtorFirebase.CatchingFishViewModelFAB && this.CatchingFishLayout == catchingFishKtorFirebase.CatchingFishLayout;
    }

    public final int hashCode() {
        int hashCode = (this.CatchingFishWorkManager.hashCode() + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishReduxKtor, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishSnackbar, this.CatchingFishParcelableFAB.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return Boolean.hashCode(this.CatchingFishLayout) + CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishViewModelFAB, CatchingFishMVPLiveData.CatchingFishViewModelFAB(hashCode, 31, this.CatchingFishViewModelScope), 31);
    }
}
