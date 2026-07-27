package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCameraXMVP {
    public final long CatchingFishCoroutine;
    public final CatchingFishBundleMVI CatchingFishDaggerWebsocket;
    public final CatchingFishDataStoreAdMob CatchingFishLayout;
    public final int CatchingFishParcelableFAB;
    public final CatchingFishStateFlowDagger CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;
    public final int CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final CatchingFishHiltMVVMHandler CatchingFishWorkManager;

    public CatchingFishCameraXMVP(int i, int i2, long j, CatchingFishStateFlowDagger catchingFishStateFlowDagger, CatchingFishBundleMVI catchingFishBundleMVI, CatchingFishHiltMVVMHandler catchingFishHiltMVVMHandler, int i3, int i4, CatchingFishDataStoreAdMob catchingFishDataStoreAdMob) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = j;
        this.CatchingFishReduxKtor = catchingFishStateFlowDagger;
        this.CatchingFishDaggerWebsocket = catchingFishBundleMVI;
        this.CatchingFishWorkManager = catchingFishHiltMVVMHandler;
        this.CatchingFishViewModelScope = i3;
        this.CatchingFishViewModelFAB = i4;
        this.CatchingFishLayout = catchingFishDataStoreAdMob;
        if (CatchingFishCameraXFlux.CatchingFishParcelableFAB(j, CatchingFishCameraXFlux.CatchingFishCoroutine) || CatchingFishCameraXFlux.CatchingFishCoroutine(j) >= 0.0f) {
            return;
        }
        CatchingFishReduxAsyncTask.CatchingFishSnackbar("lineHeight can't be negative (" + CatchingFishCameraXFlux.CatchingFishCoroutine(j) + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishCameraXMVP)) {
            return false;
        }
        CatchingFishCameraXMVP catchingFishCameraXMVP = (CatchingFishCameraXMVP) obj;
        return this.CatchingFishParcelableFAB == catchingFishCameraXMVP.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishCameraXMVP.CatchingFishSnackbar && CatchingFishCameraXFlux.CatchingFishParcelableFAB(this.CatchingFishCoroutine, catchingFishCameraXMVP.CatchingFishCoroutine) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishCameraXMVP.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishCameraXMVP.CatchingFishDaggerWebsocket) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishWorkManager, catchingFishCameraXMVP.CatchingFishWorkManager) && this.CatchingFishViewModelScope == catchingFishCameraXMVP.CatchingFishViewModelScope && this.CatchingFishViewModelFAB == catchingFishCameraXMVP.CatchingFishViewModelFAB && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishLayout, catchingFishCameraXMVP.CatchingFishLayout);
    }

    public final int hashCode() {
        int CatchingFishViewModelScope = CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishSnackbar, Integer.hashCode(this.CatchingFishParcelableFAB) * 31, 31);
        CatchingFishBundleBiometric[] catchingFishBundleBiometricArr = CatchingFishCameraXFlux.CatchingFishSnackbar;
        int CatchingFishViewModelFAB = CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishViewModelScope, 31, this.CatchingFishCoroutine);
        CatchingFishStateFlowDagger catchingFishStateFlowDagger = this.CatchingFishReduxKtor;
        int hashCode = (CatchingFishViewModelFAB + (catchingFishStateFlowDagger != null ? catchingFishStateFlowDagger.hashCode() : 0)) * 31;
        CatchingFishBundleMVI catchingFishBundleMVI = this.CatchingFishDaggerWebsocket;
        int hashCode2 = (hashCode + (catchingFishBundleMVI != null ? catchingFishBundleMVI.hashCode() : 0)) * 31;
        CatchingFishHiltMVVMHandler catchingFishHiltMVVMHandler = this.CatchingFishWorkManager;
        int CatchingFishViewModelScope2 = CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishViewModelFAB, CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishViewModelScope, (hashCode2 + (catchingFishHiltMVVMHandler != null ? catchingFishHiltMVVMHandler.hashCode() : 0)) * 31, 31), 31);
        CatchingFishDataStoreAdMob catchingFishDataStoreAdMob = this.CatchingFishLayout;
        return CatchingFishViewModelScope2 + (catchingFishDataStoreAdMob != null ? catchingFishDataStoreAdMob.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) CatchingFishDatabindingMVI.CatchingFishParcelableFAB(this.CatchingFishParcelableFAB)) + ", textDirection=" + ((Object) CatchingFishAndroidXMVP.CatchingFishParcelableFAB(this.CatchingFishSnackbar)) + ", lineHeight=" + ((Object) CatchingFishCameraXFlux.CatchingFishReduxKtor(this.CatchingFishCoroutine)) + ", textIndent=" + this.CatchingFishReduxKtor + ", platformStyle=" + this.CatchingFishDaggerWebsocket + ", lineHeightStyle=" + this.CatchingFishWorkManager + ", lineBreak=" + ((Object) CatchingFishMVIParcelable.CatchingFishParcelableFAB(this.CatchingFishViewModelScope)) + ", hyphens=" + ((Object) CatchingFishGlideOkHttpHilt.CatchingFishParcelableFAB(this.CatchingFishViewModelFAB)) + ", textMotion=" + this.CatchingFishLayout + ')';
    }
}
