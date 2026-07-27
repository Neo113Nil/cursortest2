package kotlin.text;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishViewFABEspresso {
    public CatchingFishFluxFluxBundle CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishCardViewToast CatchingFishParcelableFAB;
    public final CatchingFishViewPagerRealm CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;

    public CatchingFishViewFABEspresso(CatchingFishViewPagerRealm catchingFishViewPagerRealm, CatchingFishCardViewToast catchingFishCardViewToast) {
        boolean z = catchingFishViewPagerRealm.CatchingFishSnackbar;
        this.CatchingFishParcelableFAB = catchingFishCardViewToast;
        this.CatchingFishSnackbar = z;
        this.CatchingFishReduxKtor = catchingFishViewPagerRealm;
        this.CatchingFishDaggerWebsocket = true;
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        if (catchingFishFluxFluxBundle == null || !((LinkedHashSet) catchingFishFluxFluxBundle.CatchingFishWorkManager).remove(this)) {
            return;
        }
        CatchingFishReduxSharedFlow catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        catchingFishReduxSharedFlow.getClass();
        if (equals(catchingFishReduxSharedFlow.CatchingFishWorkManager)) {
            catchingFishReduxSharedFlow.CatchingFishWorkManager = null;
            catchingFishReduxSharedFlow.CatchingFishViewModelScope = 0;
            catchingFishReduxSharedFlow.CatchingFishViewModelFAB = null;
        }
        catchingFishReduxSharedFlow.CatchingFishReduxKtor.remove(this);
        catchingFishReduxSharedFlow.CatchingFishDaggerWebsocket.remove(this);
        this.CatchingFishCoroutine = null;
        catchingFishReduxSharedFlow.CatchingFishSnackbar();
    }

    public final void CatchingFishSnackbar(boolean z) {
        CatchingFishReduxSharedFlow catchingFishReduxSharedFlow;
        this.CatchingFishDaggerWebsocket = z;
        boolean z2 = z && this.CatchingFishReduxKtor.CatchingFishSnackbar;
        if (this.CatchingFishSnackbar == z2) {
            return;
        }
        this.CatchingFishSnackbar = z2;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishCoroutine;
        if (catchingFishFluxFluxBundle == null || (catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket) == null) {
            return;
        }
        catchingFishReduxSharedFlow.CatchingFishSnackbar();
    }
}
