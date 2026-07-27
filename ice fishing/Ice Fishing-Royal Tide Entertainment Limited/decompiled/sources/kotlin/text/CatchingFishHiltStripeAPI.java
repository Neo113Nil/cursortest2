package kotlin.text;

import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishHiltStripeAPI extends CatchingFishReduxLayout implements Runnable, CatchingFishLiveDataDagger, View.OnAttachStateChangeListener {
    public CatchingFishKtorPicassoMVVM CatchingFishLayout;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public final CatchingFishServiceMockk CatchingFishWorkManager;

    public CatchingFishHiltStripeAPI(CatchingFishServiceMockk catchingFishServiceMockk) {
        super(!catchingFishServiceMockk.CatchingFish ? 1 : 0);
        this.CatchingFishWorkManager = catchingFishServiceMockk;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishDaggerWebsocket(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit) {
        this.CatchingFishViewModelScope = true;
        this.CatchingFishViewModelFAB = true;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishReduxKtor(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit) {
        this.CatchingFishViewModelScope = false;
        this.CatchingFishViewModelFAB = false;
        CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishLayout;
        if (catchingFishGoogleMapsJUnit.CatchingFishParcelableFAB.CatchingFishSnackbar() != 0 && catchingFishKtorPicassoMVVM != null) {
            CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
            CatchingFishServiceMockk catchingFishServiceMockk = this.CatchingFishWorkManager;
            catchingFishServiceMockk.CatchingFishNavigation.CatchingFishWorkManager(CatchingFishOkHttpFAB.CatchingFishAnimation(catchingFishFragmentHilt.CatchingFishLayout(8)));
            catchingFishServiceMockk.CatchingFishRoomDatabase.CatchingFishWorkManager(CatchingFishOkHttpFAB.CatchingFishAnimation(catchingFishFragmentHilt.CatchingFishLayout(8)));
            CatchingFishServiceMockk.CatchingFishParcelableFAB(catchingFishServiceMockk, catchingFishKtorPicassoMVVM);
        }
        this.CatchingFishLayout = null;
    }

    @Override // kotlin.text.CatchingFishLiveDataDagger
    public final CatchingFishKtorPicassoMVVM CatchingFishStateLiveData(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        this.CatchingFishLayout = catchingFishKtorPicassoMVVM;
        CatchingFishServiceMockk catchingFishServiceMockk = this.CatchingFishWorkManager;
        CatchingFishGsonGradle catchingFishGsonGradle = catchingFishServiceMockk.CatchingFishRoomDatabase;
        CatchingFishFragmentHilt catchingFishFragmentHilt = catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB;
        catchingFishGsonGradle.CatchingFishWorkManager(CatchingFishOkHttpFAB.CatchingFishAnimation(catchingFishFragmentHilt.CatchingFishLayout(8)));
        if (this.CatchingFishViewModelScope) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.CatchingFishViewModelFAB) {
            catchingFishServiceMockk.CatchingFishNavigation.CatchingFishWorkManager(CatchingFishOkHttpFAB.CatchingFishAnimation(catchingFishFragmentHilt.CatchingFishLayout(8)));
            CatchingFishServiceMockk.CatchingFishParcelableFAB(catchingFishServiceMockk, catchingFishKtorPicassoMVVM);
        }
        return catchingFishServiceMockk.CatchingFish ? CatchingFishKtorPicassoMVVM.CatchingFishSnackbar : catchingFishKtorPicassoMVVM;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishViewModelIntent CatchingFishViewModelScope(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        this.CatchingFishViewModelScope = false;
        return catchingFishViewModelIntent;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishKtorPicassoMVVM CatchingFishWorkManager(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, List list) {
        CatchingFishServiceMockk catchingFishServiceMockk = this.CatchingFishWorkManager;
        CatchingFishServiceMockk.CatchingFishParcelableFAB(catchingFishServiceMockk, catchingFishKtorPicassoMVVM);
        return catchingFishServiceMockk.CatchingFish ? CatchingFishKtorPicassoMVVM.CatchingFishSnackbar : catchingFishKtorPicassoMVVM;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.CatchingFishViewModelScope) {
            this.CatchingFishViewModelScope = false;
            this.CatchingFishViewModelFAB = false;
            CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM = this.CatchingFishLayout;
            if (catchingFishKtorPicassoMVVM != null) {
                CatchingFishServiceMockk catchingFishServiceMockk = this.CatchingFishWorkManager;
                catchingFishServiceMockk.CatchingFishNavigation.CatchingFishWorkManager(CatchingFishOkHttpFAB.CatchingFishAnimation(catchingFishKtorPicassoMVVM.CatchingFishParcelableFAB.CatchingFishLayout(8)));
                CatchingFishServiceMockk.CatchingFishParcelableFAB(catchingFishServiceMockk, catchingFishKtorPicassoMVVM);
                this.CatchingFishLayout = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
