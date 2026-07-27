package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishReduxGlide {
    public boolean CatchingFishCloudMessaging;
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public long CatchingFishOkHttp;
    public int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public int CatchingFishUnitTesting;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public final void CatchingFishParcelableFAB(int i) {
        if ((this.CatchingFishReduxKtor & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.CatchingFishReduxKtor));
    }

    public final int CatchingFishSnackbar() {
        return this.CatchingFishViewModelScope ? this.CatchingFishSnackbar - this.CatchingFishCoroutine : this.CatchingFishDaggerWebsocket;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.CatchingFishParcelableFAB + ", mData=null, mItemCount=" + this.CatchingFishDaggerWebsocket + ", mIsMeasuring=" + this.CatchingFishLayout + ", mPreviousLayoutItemCount=" + this.CatchingFishSnackbar + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.CatchingFishCoroutine + ", mStructureChanged=" + this.CatchingFishWorkManager + ", mInPreLayout=" + this.CatchingFishViewModelScope + ", mRunSimpleAnimations=" + this.CatchingFishFragmentHandler + ", mRunPredictiveAnimations=" + this.CatchingFishCloudMessaging + '}';
    }
}
