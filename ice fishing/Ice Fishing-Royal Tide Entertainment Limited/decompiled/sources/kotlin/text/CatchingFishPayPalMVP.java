package kotlin.text;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public class CatchingFishPayPalMVP extends CatchingFishGoogleMapsMoshi implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean CatchingFishAndroidX;
    public final CatchingFishReduxRoom CatchingFishAnimation;
    public final CatchingFishViewPagerMockk CatchingFishCustomViewJUnit;
    public Dialog CatchingFishDaggerMVVM;
    public boolean CatchingFishFirebase;
    public final CatchingFishSnackbarKtor CatchingFishJUnitRealm;
    public int CatchingFishMVVMAppCompat;
    public boolean CatchingFishMockkOkHttp;
    public boolean CatchingFishMoshiDaggerHilt;
    public int CatchingFishNavigationGson;
    public boolean CatchingFishPicasso;
    public boolean CatchingFishRedux;
    public boolean CatchingFishReduxMoshi;
    public int CatchingFishStripeAPI;

    public CatchingFishPayPalMVP() {
        new CatchingFishGsonRealm(6, this);
        this.CatchingFishJUnitRealm = new CatchingFishSnackbarKtor(this);
        this.CatchingFishAnimation = new CatchingFishReduxRoom(this);
        this.CatchingFishMVVMAppCompat = 0;
        this.CatchingFishStripeAPI = 0;
        this.CatchingFishMoshiDaggerHilt = true;
        this.CatchingFishAndroidX = true;
        this.CatchingFishNavigationGson = -1;
        this.CatchingFishCustomViewJUnit = new CatchingFishViewPagerMockk(4, this);
        this.CatchingFishFirebase = false;
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishAnimationMockk() {
        this.CatchingFishMutableLiveData = true;
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishCardViewRealm(Bundle bundle) {
        Bundle bundle2;
        this.CatchingFishMutableLiveData = true;
        if (this.CatchingFishDaggerMVVM == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.CatchingFishDaggerMVVM.onRestoreInstanceState(bundle2);
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishCoroutineFlow() {
        this.CatchingFishMutableLiveData = true;
        if (!this.CatchingFishPicasso && !this.CatchingFishReduxMoshi) {
            this.CatchingFishReduxMoshi = true;
        }
        CatchingFishGraphQLHilt catchingFishGraphQLHilt = this.CatchingFishParcelable;
        catchingFishGraphQLHilt.getClass();
        CatchingFishGraphQLHilt.CatchingFishParcelableFAB("removeObserver");
        CatchingFishParcelableRoom catchingFishParcelableRoom = (CatchingFishParcelableRoom) catchingFishGraphQLHilt.CatchingFishSnackbar.CatchingFishSnackbar(this.CatchingFishCustomViewJUnit);
        if (catchingFishParcelableRoom == null) {
            return;
        }
        catchingFishParcelableRoom.CatchingFishParcelableFAB(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:10:0x0018, B:12:0x0024, B:18:0x003c, B:20:0x0042, B:21:0x004c, B:23:0x002e, B:25:0x0034, B:26:0x0039, B:27:0x0064), top: B:9:0x0018 }] */
    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater CatchingFishDaggerHiltFAB(Bundle bundle) {
        Context CatchingFishViewModelFAB;
        LayoutInflater CatchingFishDaggerHiltFAB = super.CatchingFishDaggerHiltFAB(bundle);
        boolean z = this.CatchingFishAndroidX;
        if (z && !this.CatchingFishRedux) {
            if (z && !this.CatchingFishFirebase) {
                try {
                    this.CatchingFishRedux = true;
                    Dialog CatchingFishMutableLiveData = CatchingFishMutableLiveData();
                    this.CatchingFishDaggerMVVM = CatchingFishMutableLiveData;
                    if (this.CatchingFishAndroidX) {
                        int i = this.CatchingFishMVVMAppCompat;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = CatchingFishMutableLiveData.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                CatchingFishViewModelFAB = CatchingFishViewModelFAB();
                                if (CatchingFishViewModelFAB != null) {
                                    this.CatchingFishDaggerMVVM.setOwnerActivity((Activity) CatchingFishViewModelFAB);
                                }
                                this.CatchingFishDaggerMVVM.setCancelable(this.CatchingFishMoshiDaggerHilt);
                                this.CatchingFishDaggerMVVM.setOnCancelListener(this.CatchingFishJUnitRealm);
                                this.CatchingFishDaggerMVVM.setOnDismissListener(this.CatchingFishAnimation);
                                this.CatchingFishFirebase = true;
                            }
                        }
                        CatchingFishMutableLiveData.requestWindowFeature(1);
                        CatchingFishViewModelFAB = CatchingFishViewModelFAB();
                        if (CatchingFishViewModelFAB != null) {
                        }
                        this.CatchingFishDaggerMVVM.setCancelable(this.CatchingFishMoshiDaggerHilt);
                        this.CatchingFishDaggerMVVM.setOnCancelListener(this.CatchingFishJUnitRealm);
                        this.CatchingFishDaggerMVVM.setOnDismissListener(this.CatchingFishAnimation);
                        this.CatchingFishFirebase = true;
                    } else {
                        this.CatchingFishDaggerMVVM = null;
                    }
                    this.CatchingFishRedux = false;
                } catch (Throwable th) {
                    this.CatchingFishRedux = false;
                    throw th;
                }
            }
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                toString();
            }
            Dialog dialog = this.CatchingFishDaggerMVVM;
            if (dialog != null) {
                return CatchingFishDaggerHiltFAB.cloneInContext(dialog.getContext());
            }
        } else if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            toString();
        }
        return CatchingFishDaggerHiltFAB;
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public void CatchingFishGsonAppCompat() {
        this.CatchingFishMutableLiveData = true;
        Dialog dialog = this.CatchingFishDaggerMVVM;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishJetpackCompose() {
        this.CatchingFishMutableLiveData = true;
        Dialog dialog = this.CatchingFishDaggerMVVM;
        if (dialog != null) {
            this.CatchingFishMockkOkHttp = true;
            dialog.setOnDismissListener(null);
            this.CatchingFishDaggerMVVM.dismiss();
            if (!this.CatchingFishReduxMoshi) {
                onDismiss(this.CatchingFishDaggerMVVM);
            }
            this.CatchingFishDaggerMVVM = null;
            this.CatchingFishFirebase = false;
        }
    }

    public Dialog CatchingFishMutableLiveData() {
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(3)) {
            toString();
        }
        return new CatchingFishMVPFABView(CatchingFishCardViewView(), this.CatchingFishStripeAPI);
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public void CatchingFishNavigation(Bundle bundle) {
        super.CatchingFishNavigation(bundle);
        new Handler();
        this.CatchingFishAndroidX = this.CatchingFishCardViewRealm == 0;
        if (bundle != null) {
            this.CatchingFishMVVMAppCompat = bundle.getInt("android:style", 0);
            this.CatchingFishStripeAPI = bundle.getInt("android:theme", 0);
            this.CatchingFishMoshiDaggerHilt = bundle.getBoolean("android:cancelable", true);
            this.CatchingFishAndroidX = bundle.getBoolean("android:showsDialog", this.CatchingFishAndroidX);
            this.CatchingFishNavigationGson = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public void CatchingFishParcelableFlux() {
        this.CatchingFishMutableLiveData = true;
        Dialog dialog = this.CatchingFishDaggerMVVM;
        if (dialog != null) {
            this.CatchingFishMockkOkHttp = false;
            dialog.show();
            View decorView = this.CatchingFishDaggerMVVM.getWindow().getDecorView();
            CatchingFishHiltMVPToast.CatchingFishFragmentFactory(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            CatchingFishOkHttpFAB.CatchingFishRecyclerView(decorView, this);
        }
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishPayPal(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.CatchingFishPayPal(layoutInflater, viewGroup, bundle);
        if (this.CatchingFishPayPalService != null || this.CatchingFishDaggerMVVM == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.CatchingFishDaggerMVVM.onRestoreInstanceState(bundle2);
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishRoomDatabase(Context context) {
        Object obj;
        super.CatchingFishRoomDatabase(context);
        CatchingFishGraphQLHilt catchingFishGraphQLHilt = this.CatchingFishParcelable;
        catchingFishGraphQLHilt.getClass();
        CatchingFishGraphQLHilt.CatchingFishParcelableFAB("observeForever");
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishCustomViewJUnit;
        CatchingFishParcelableRoom catchingFishParcelableRoom = new CatchingFishParcelableRoom(catchingFishGraphQLHilt, catchingFishViewPagerMockk);
        CatchingFishLiveDataViewMVI catchingFishLiveDataViewMVI = catchingFishGraphQLHilt.CatchingFishSnackbar;
        CatchingFishPayPalGraphQL CatchingFishParcelableFAB = catchingFishLiveDataViewMVI.CatchingFishParcelableFAB(catchingFishViewPagerMockk);
        if (CatchingFishParcelableFAB != null) {
            obj = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
        } else {
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = new CatchingFishPayPalGraphQL(catchingFishViewPagerMockk, catchingFishParcelableRoom);
            catchingFishLiveDataViewMVI.CatchingFishViewModelScope++;
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2 = catchingFishLiveDataViewMVI.CatchingFishDaggerWebsocket;
            if (catchingFishPayPalGraphQL2 == null) {
                catchingFishLiveDataViewMVI.CatchingFishReduxKtor = catchingFishPayPalGraphQL;
                catchingFishLiveDataViewMVI.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL;
            } else {
                catchingFishPayPalGraphQL2.CatchingFishWorkManager = catchingFishPayPalGraphQL;
                catchingFishPayPalGraphQL.CatchingFishViewModelScope = catchingFishPayPalGraphQL2;
                catchingFishLiveDataViewMVI.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL;
            }
            obj = null;
        }
        if (((CatchingFishParcelableRoom) obj) == null) {
            catchingFishParcelableRoom.CatchingFishParcelableFAB(true);
        }
        if (this.CatchingFishPicasso) {
            return;
        }
        this.CatchingFishReduxMoshi = false;
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final CatchingFishRobolectricHilt CatchingFishSnackbar() {
        return new CatchingFishMVVMNavigation(this, new CatchingFishGsonJUnitRoom(this));
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public void CatchingFishSpannableWidget(Bundle bundle) {
        Dialog dialog = this.CatchingFishDaggerMVVM;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.CatchingFishMVVMAppCompat;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.CatchingFishStripeAPI;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.CatchingFishMoshiDaggerHilt;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.CatchingFishAndroidX;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.CatchingFishNavigationGson;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.CatchingFishMockkOkHttp) {
            return;
        }
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(3)) {
            toString();
        }
        if (this.CatchingFishReduxMoshi) {
            return;
        }
        this.CatchingFishReduxMoshi = true;
        this.CatchingFishPicasso = false;
        Dialog dialog = this.CatchingFishDaggerMVVM;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.CatchingFishDaggerMVVM.dismiss();
        }
        this.CatchingFishMockkOkHttp = true;
        if (this.CatchingFishNavigationGson >= 0) {
            CatchingFishToastSharedFlow CatchingFishFragmentHandler = CatchingFishFragmentHandler();
            int i = this.CatchingFishNavigationGson;
            if (i < 0) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Bad id: ", i));
            }
            CatchingFishFragmentHandler.CatchingFishSpannableWidget(new CatchingFishParcelableJUnit(CatchingFishFragmentHandler, i), true);
            this.CatchingFishNavigationGson = -1;
            return;
        }
        CatchingFishCameraXEspresso catchingFishCameraXEspresso = new CatchingFishCameraXEspresso(CatchingFishFragmentHandler());
        catchingFishCameraXEspresso.CatchingFishAnimationMockk = true;
        CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishCoroutineFlow;
        if (catchingFishToastSharedFlow == null || catchingFishToastSharedFlow == catchingFishCameraXEspresso.CatchingFishStateLiveData) {
            catchingFishCameraXEspresso.CatchingFishSnackbar(new CatchingFishPicassoFAB(3, this));
            catchingFishCameraXEspresso.CatchingFishReduxKtor(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
