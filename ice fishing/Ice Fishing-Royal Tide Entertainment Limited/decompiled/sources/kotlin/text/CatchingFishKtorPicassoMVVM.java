package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishKtorPicassoMVVM {
    public static final CatchingFishKtorPicassoMVVM CatchingFishSnackbar;
    public final CatchingFishFragmentHilt CatchingFishParcelableFAB;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            CatchingFishSnackbar = CatchingFishMVIViewPager.CatchingFishParcelableFlux;
        } else if (i >= 30) {
            CatchingFishSnackbar = CatchingFishMoshiStripeAPI.CatchingFishSpannableWidget;
        } else {
            CatchingFishSnackbar = CatchingFishFragmentHilt.CatchingFishSnackbar;
        }
    }

    public CatchingFishKtorPicassoMVVM(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.CatchingFishParcelableFAB = new CatchingFishGsonSnackbar(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.CatchingFishParcelableFAB = new CatchingFishMVIViewPager(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.CatchingFishParcelableFAB = new CatchingFishLifecycleWidget(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.CatchingFishParcelableFAB = new CatchingFishMoshiStripeAPI(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.CatchingFishParcelableFAB = new CatchingFishFABMVVMFAB(this, windowInsets);
        } else if (i >= 28) {
            this.CatchingFishParcelableFAB = new CatchingFishAdMobRetrofit(this, windowInsets);
        } else {
            this.CatchingFishParcelableFAB = new CatchingFishMVPMVPHilt(this, windowInsets);
        }
    }

    public static CatchingFishReduxPayPal CatchingFishDaggerWebsocket(CatchingFishReduxPayPal catchingFishReduxPayPal, int i, int i2, int i3, int i4) {
        int max = Math.max(0, catchingFishReduxPayPal.CatchingFishParcelableFAB - i);
        int max2 = Math.max(0, catchingFishReduxPayPal.CatchingFishSnackbar - i2);
        int max3 = Math.max(0, catchingFishReduxPayPal.CatchingFishCoroutine - i3);
        int max4 = Math.max(0, catchingFishReduxPayPal.CatchingFishReduxKtor - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? catchingFishReduxPayPal : CatchingFishReduxPayPal.CatchingFishSnackbar(max, max2, max3, max4);
    }

    public static CatchingFishKtorPicassoMVVM CatchingFishViewModelScope(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = new CatchingFishKtorPicassoMVVM(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB = CatchingFishStripeAPIHilt.CatchingFishParcelableFAB(view);
            CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
            catchingFishFragmentHilt.CatchingFishGsonAppCompat(CatchingFishParcelableFAB);
            View rootView = view.getRootView();
            catchingFishFragmentHilt.CatchingFishReduxKtor(rootView);
            catchingFishFragmentHilt.CatchingFishStateLiveData(rootView);
            catchingFishFragmentHilt.CatchingFishRoomDatabase();
            catchingFishFragmentHilt.CatchingFishPayPal(view.getWindowSystemUiVisibility());
        }
        return catchingFishKtorPicassoMVVM;
    }

    public final int CatchingFishCoroutine() {
        return this.CatchingFishParcelableFAB.CatchingFishUnitTesting().CatchingFishCoroutine;
    }

    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishParcelableFAB.CatchingFishUnitTesting().CatchingFishReduxKtor;
    }

    public final int CatchingFishReduxKtor() {
        return this.CatchingFishParcelableFAB.CatchingFishUnitTesting().CatchingFishSnackbar;
    }

    public final int CatchingFishSnackbar() {
        return this.CatchingFishParcelableFAB.CatchingFishUnitTesting().CatchingFishParcelableFAB;
    }

    public final WindowInsets CatchingFishWorkManager() {
        CatchingFishFragmentHilt catchingFishFragmentHilt = this.CatchingFishParcelableFAB;
        if (catchingFishFragmentHilt instanceof CatchingFishRealmMoshiFAB) {
            return ((CatchingFishRealmMoshiFAB) catchingFishFragmentHilt).CatchingFishCoroutine;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishKtorPicassoMVVM) {
            return Objects.equals(this.CatchingFishParcelableFAB, ((CatchingFishKtorPicassoMVVM) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        CatchingFishFragmentHilt catchingFishFragmentHilt = this.CatchingFishParcelableFAB;
        if (catchingFishFragmentHilt == null) {
            return 0;
        }
        return catchingFishFragmentHilt.hashCode();
    }

    public CatchingFishKtorPicassoMVVM(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        if (catchingFishKtorPicassoMVVM != null) {
            CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 && (catchingFishFragmentHilt instanceof CatchingFishGsonSnackbar)) {
                this.CatchingFishParcelableFAB = new CatchingFishGsonSnackbar(this, (CatchingFishGsonSnackbar) catchingFishFragmentHilt);
            } else if (i >= 34 && (catchingFishFragmentHilt instanceof CatchingFishMVIViewPager)) {
                this.CatchingFishParcelableFAB = new CatchingFishMVIViewPager(this, (CatchingFishMVIViewPager) catchingFishFragmentHilt);
            } else if (i >= 31 && (catchingFishFragmentHilt instanceof CatchingFishLifecycleWidget)) {
                this.CatchingFishParcelableFAB = new CatchingFishLifecycleWidget(this, (CatchingFishLifecycleWidget) catchingFishFragmentHilt);
            } else if (i >= 30 && (catchingFishFragmentHilt instanceof CatchingFishMoshiStripeAPI)) {
                this.CatchingFishParcelableFAB = new CatchingFishMoshiStripeAPI(this, (CatchingFishMoshiStripeAPI) catchingFishFragmentHilt);
            } else if (i >= 29 && (catchingFishFragmentHilt instanceof CatchingFishFABMVVMFAB)) {
                this.CatchingFishParcelableFAB = new CatchingFishFABMVVMFAB(this, (CatchingFishFABMVVMFAB) catchingFishFragmentHilt);
            } else if (i >= 28 && (catchingFishFragmentHilt instanceof CatchingFishAdMobRetrofit)) {
                this.CatchingFishParcelableFAB = new CatchingFishAdMobRetrofit(this, (CatchingFishAdMobRetrofit) catchingFishFragmentHilt);
            } else if (catchingFishFragmentHilt instanceof CatchingFishMVPMVPHilt) {
                this.CatchingFishParcelableFAB = new CatchingFishMVPMVPHilt(this, (CatchingFishMVPMVPHilt) catchingFishFragmentHilt);
            } else if (catchingFishFragmentHilt instanceof CatchingFishRealmMoshiFAB) {
                this.CatchingFishParcelableFAB = new CatchingFishRealmMoshiFAB(this, (CatchingFishRealmMoshiFAB) catchingFishFragmentHilt);
            } else {
                this.CatchingFishParcelableFAB = new CatchingFishFragmentHilt(this);
            }
            catchingFishFragmentHilt.CatchingFishDaggerWebsocket(this);
            return;
        }
        this.CatchingFishParcelableFAB = new CatchingFishFragmentHilt(this);
    }
}
