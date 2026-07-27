package kotlin.text;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLDagger implements OnBackAnimationCallback {
    public final /* synthetic */ CatchingFishWidgetFirebase CatchingFishParcelableFAB;

    public CatchingFishGraphQLDagger(CatchingFishWidgetFirebase catchingFishWidgetFirebase) {
        this.CatchingFishParcelableFAB = catchingFishWidgetFirebase;
    }

    public final void onBackCancelled() {
        CatchingFishWidgetFirebase catchingFishWidgetFirebase = this.CatchingFishParcelableFAB;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishWidgetFirebase.CatchingFishParcelableFAB;
        if (catchingFishFluxFluxBundle == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!catchingFishWidgetFirebase.CatchingFishSnackbar) {
            catchingFishFluxFluxBundle.CatchingFishViewModelScope(catchingFishWidgetFirebase, null);
        }
        CatchingFishReduxSharedFlow catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        catchingFishReduxSharedFlow.getClass();
        if (catchingFishWidgetFirebase.equals(catchingFishReduxSharedFlow.CatchingFishViewModelFAB) && -1 == catchingFishReduxSharedFlow.CatchingFishViewModelScope) {
            if (catchingFishReduxSharedFlow.CatchingFishWorkManager == null) {
                catchingFishReduxSharedFlow.CatchingFishCoroutine(-1);
            }
            catchingFishReduxSharedFlow.CatchingFishWorkManager = null;
            catchingFishReduxSharedFlow.CatchingFishViewModelScope = 0;
            catchingFishReduxSharedFlow.CatchingFishViewModelFAB = null;
            CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = catchingFishReduxSharedFlow.CatchingFishParcelableFAB;
            catchingFishHandlerAndroidX.getClass();
            catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, CatchingFishParcelableFAB.CatchingFishLayout);
        }
        catchingFishWidgetFirebase.CatchingFishSnackbar = false;
    }

    public final void onBackInvoked() {
        this.CatchingFishParcelableFAB.CatchingFishParcelableFAB();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(backEvent, "backEvent");
        CatchingFishHiltBiometric CatchingFishParcelableFAB = CatchingFishDaggerBiometric.CatchingFishParcelableFAB(backEvent);
        CatchingFishWidgetFirebase catchingFishWidgetFirebase = this.CatchingFishParcelableFAB;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishWidgetFirebase.CatchingFishParcelableFAB;
        if (catchingFishFluxFluxBundle == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (catchingFishWidgetFirebase.CatchingFishSnackbar) {
            CatchingFishReduxSharedFlow catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
            catchingFishReduxSharedFlow.getClass();
            if (catchingFishWidgetFirebase.equals(catchingFishReduxSharedFlow.CatchingFishViewModelFAB) && -1 == catchingFishReduxSharedFlow.CatchingFishViewModelScope) {
                if (catchingFishReduxSharedFlow.CatchingFishWorkManager == null) {
                    catchingFishReduxSharedFlow.CatchingFishCoroutine(-1);
                }
                CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = catchingFishReduxSharedFlow.CatchingFishParcelableFAB;
                CatchingFishGradleRoom catchingFishGradleRoom = new CatchingFishGradleRoom(CatchingFishParcelableFAB);
                catchingFishHandlerAndroidX.getClass();
                catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, catchingFishGradleRoom);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(backEvent, "backEvent");
        CatchingFishHiltBiometric CatchingFishParcelableFAB = CatchingFishDaggerBiometric.CatchingFishParcelableFAB(backEvent);
        CatchingFishWidgetFirebase catchingFishWidgetFirebase = this.CatchingFishParcelableFAB;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishWidgetFirebase.CatchingFishParcelableFAB;
        if (catchingFishFluxFluxBundle == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (catchingFishWidgetFirebase.CatchingFishSnackbar) {
            return;
        }
        catchingFishFluxFluxBundle.CatchingFishViewModelScope(catchingFishWidgetFirebase, CatchingFishParcelableFAB);
        catchingFishWidgetFirebase.CatchingFishSnackbar = true;
    }
}
