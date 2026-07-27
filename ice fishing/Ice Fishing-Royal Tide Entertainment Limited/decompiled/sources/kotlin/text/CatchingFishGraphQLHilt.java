package kotlin.text;

import android.os.Looper;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class CatchingFishGraphQLHilt {
    public static final Object CatchingFishFragmentHandler = new Object();
    public volatile Object CatchingFishDaggerWebsocket;
    public boolean CatchingFishLayout;
    public boolean CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public volatile Object CatchingFishWorkManager;
    public final Object CatchingFishParcelableFAB = new Object();
    public final CatchingFishLiveDataViewMVI CatchingFishSnackbar = new CatchingFishLiveDataViewMVI();
    public int CatchingFishCoroutine = 0;

    public CatchingFishGraphQLHilt() {
        Object obj = CatchingFishFragmentHandler;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishViewModelScope = -1;
    }

    public static void CatchingFishParcelableFAB(String str) {
        ((CatchingFishJobSchedulerFAB) CatchingFishJobSchedulerFAB.CatchingFishRedux().CatchingFishParcelableFAB).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishOkHttp("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void CatchingFishCoroutine(CatchingFishParcelableRoom catchingFishParcelableRoom) {
        if (this.CatchingFishViewModelFAB) {
            this.CatchingFishLayout = true;
            return;
        }
        this.CatchingFishViewModelFAB = true;
        do {
            this.CatchingFishLayout = false;
            if (catchingFishParcelableRoom != null) {
                CatchingFishSnackbar(catchingFishParcelableRoom);
                catchingFishParcelableRoom = null;
            } else {
                CatchingFishLiveDataViewMVI catchingFishLiveDataViewMVI = this.CatchingFishSnackbar;
                catchingFishLiveDataViewMVI.getClass();
                CatchingFishCoroutineKtor catchingFishCoroutineKtor = new CatchingFishCoroutineKtor(catchingFishLiveDataViewMVI);
                catchingFishLiveDataViewMVI.CatchingFishWorkManager.put(catchingFishCoroutineKtor, Boolean.FALSE);
                while (catchingFishCoroutineKtor.hasNext()) {
                    CatchingFishSnackbar((CatchingFishParcelableRoom) ((Map.Entry) catchingFishCoroutineKtor.next()).getValue());
                    if (this.CatchingFishLayout) {
                        break;
                    }
                }
            }
        } while (this.CatchingFishLayout);
        this.CatchingFishViewModelFAB = false;
    }

    public final void CatchingFishSnackbar(CatchingFishParcelableRoom catchingFishParcelableRoom) {
        if (catchingFishParcelableRoom.CatchingFishSnackbar) {
            int i = catchingFishParcelableRoom.CatchingFishCoroutine;
            int i2 = this.CatchingFishViewModelScope;
            if (i >= i2) {
                return;
            }
            catchingFishParcelableRoom.CatchingFishCoroutine = i2;
            CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishParcelableRoom.CatchingFishParcelableFAB;
            Object obj = this.CatchingFishDaggerWebsocket;
            catchingFishViewPagerMockk.getClass();
            CatchingFishToastFlux catchingFishToastFlux = (CatchingFishToastFlux) obj;
            CatchingFishPayPalMVP catchingFishPayPalMVP = (CatchingFishPayPalMVP) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
            if (catchingFishToastFlux == null || !catchingFishPayPalMVP.CatchingFishAndroidX) {
                return;
            }
            View CatchingFishMVPRobolectric = catchingFishPayPalMVP.CatchingFishMVPRobolectric();
            if (CatchingFishMVPRobolectric.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (catchingFishPayPalMVP.CatchingFishDaggerMVVM != null) {
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(3)) {
                    Objects.toString(catchingFishPayPalMVP.CatchingFishDaggerMVVM);
                }
                catchingFishPayPalMVP.CatchingFishDaggerMVVM.setContentView(CatchingFishMVPRobolectric);
            }
        }
    }
}
