package kotlin.text;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishFluxEspresso extends CatchingFishAndroidX {
    public final CatchingFishBiometricRealm CatchingFishDaggerWebsocket;
    public final RecyclerView CatchingFishReduxKtor;

    public CatchingFishFluxEspresso(RecyclerView recyclerView) {
        this.CatchingFishReduxKtor = recyclerView;
        CatchingFishBiometricRealm catchingFishBiometricRealm = this.CatchingFishDaggerWebsocket;
        if (catchingFishBiometricRealm != null) {
            this.CatchingFishDaggerWebsocket = catchingFishBiometricRealm;
        } else {
            this.CatchingFishDaggerWebsocket = new CatchingFishBiometricRealm(this);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishCoroutine(View view, AccessibilityEvent accessibilityEvent) {
        super.CatchingFishCoroutine(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.CatchingFishReduxKtor.CatchingFishDagger()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().CatchingFishDataStoreIntent(accessibilityEvent);
        }
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.CatchingFishReduxKtor;
        if (recyclerView.CatchingFishDagger() || recyclerView.getLayoutManager() == null) {
            return;
        }
        CatchingFishKtorDataStore layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.CatchingFishSnackbar;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = recyclerView2.CatchingFishDaggerWebsocket;
        CatchingFishReduxGlide catchingFishReduxGlide = recyclerView2.CatchingFishRedux;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.CatchingFishSnackbar.canScrollHorizontally(-1)) {
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.CatchingFishSnackbar.canScrollVertically(1) || layoutManager.CatchingFishSnackbar.canScrollHorizontally(1)) {
            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.CatchingFishEspressoMockk(catchingFishSnackbarCameraX, catchingFishReduxGlide), layoutManager.CatchingFishParcelableFlux(catchingFishSnackbarCameraX, catchingFishReduxGlide), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // kotlin.text.CatchingFishAndroidX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishViewModelScope(View view, int i, Bundle bundle) {
        int CatchingFishJobScheduler;
        int CatchingFishFragmentFactory;
        if (super.CatchingFishViewModelScope(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.CatchingFishReduxKtor;
        if (!recyclerView.CatchingFishDagger() && recyclerView.getLayoutManager() != null) {
            CatchingFishKtorDataStore layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.CatchingFishSnackbar;
            CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = recyclerView2.CatchingFishDaggerWebsocket;
            if (i == 4096) {
                CatchingFishJobScheduler = recyclerView2.canScrollVertically(1) ? (layoutManager.CatchingFishAnimationMockk - layoutManager.CatchingFishJobScheduler()) - layoutManager.CatchingFishCustomView() : 0;
                if (layoutManager.CatchingFishSnackbar.canScrollHorizontally(1)) {
                    CatchingFishFragmentFactory = (layoutManager.CatchingFishUnitTesting - layoutManager.CatchingFishFragmentFactory()) - layoutManager.CatchingFishMutableLiveData();
                    if (CatchingFishJobScheduler == 0) {
                    }
                    layoutManager.CatchingFishSnackbar.CatchingFishStripeAPI(CatchingFishFragmentFactory, CatchingFishJobScheduler, true);
                    return true;
                }
                CatchingFishFragmentFactory = 0;
                if (CatchingFishJobScheduler == 0) {
                }
                layoutManager.CatchingFishSnackbar.CatchingFishStripeAPI(CatchingFishFragmentFactory, CatchingFishJobScheduler, true);
                return true;
            }
            if (i != 8192) {
                CatchingFishFragmentFactory = 0;
                CatchingFishJobScheduler = 0;
            } else {
                CatchingFishJobScheduler = recyclerView2.canScrollVertically(-1) ? -((layoutManager.CatchingFishAnimationMockk - layoutManager.CatchingFishJobScheduler()) - layoutManager.CatchingFishCustomView()) : 0;
                if (layoutManager.CatchingFishSnackbar.canScrollHorizontally(-1)) {
                    CatchingFishFragmentFactory = -((layoutManager.CatchingFishUnitTesting - layoutManager.CatchingFishFragmentFactory()) - layoutManager.CatchingFishMutableLiveData());
                }
                CatchingFishFragmentFactory = 0;
            }
            if (CatchingFishJobScheduler == 0 || CatchingFishFragmentFactory != 0) {
                layoutManager.CatchingFishSnackbar.CatchingFishStripeAPI(CatchingFishFragmentFactory, CatchingFishJobScheduler, true);
                return true;
            }
        }
        return false;
    }
}
