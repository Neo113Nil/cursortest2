package kotlin.text;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public class CatchingFishMVPFABView extends Dialog implements CatchingFishToastFlux, CatchingFishJUnitLiveData {
    public final CatchingFishViewModelIntent CatchingFishDaggerWebsocket;
    public CatchingFishToolbarToast CatchingFishReduxKtor;
    public final CatchingFishKtorHiltIntent CatchingFishViewModelScope;
    public final CatchingFishKtorHiltIntent CatchingFishWorkManager;

    public CatchingFishMVPFABView(Context context, int i) {
        super(context, i);
        this.CatchingFishDaggerWebsocket = new CatchingFishViewModelIntent(new CatchingFishMoshiBundle(this, new CatchingFishFluxPicasso(6, this)), 14);
        final int i2 = 0;
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishJUnitGlide(this) { // from class: kotlin.text.CatchingFishToastViewPager
            public final /* synthetic */ CatchingFishMVPFABView CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // kotlin.text.CatchingFishJUnitGlide
            public final Object CatchingFishParcelableFAB() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishRealmViewPager catchingFishRealmViewPager = new CatchingFishRealmViewPager();
                        this.CatchingFishDaggerWebsocket.CatchingFishCoroutine().CatchingFishSnackbar().CatchingFishCoroutine.CatchingFishSnackbar(catchingFishRealmViewPager);
                        return catchingFishRealmViewPager;
                    default:
                        return new CatchingFishFluxCameraX(new CatchingFishMVPLayout(9, this.CatchingFishDaggerWebsocket));
                }
            }
        });
        final int i3 = 1;
        this.CatchingFishViewModelScope = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishJUnitGlide(this) { // from class: kotlin.text.CatchingFishToastViewPager
            public final /* synthetic */ CatchingFishMVPFABView CatchingFishDaggerWebsocket;

            {
                this.CatchingFishDaggerWebsocket = this;
            }

            @Override // kotlin.text.CatchingFishJUnitGlide
            public final Object CatchingFishParcelableFAB() {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishRealmViewPager catchingFishRealmViewPager = new CatchingFishRealmViewPager();
                        this.CatchingFishDaggerWebsocket.CatchingFishCoroutine().CatchingFishSnackbar().CatchingFishCoroutine.CatchingFishSnackbar(catchingFishRealmViewPager);
                        return catchingFishRealmViewPager;
                    default:
                        return new CatchingFishFluxCameraX(new CatchingFishMVPLayout(9, this.CatchingFishDaggerWebsocket));
                }
            }
        });
    }

    public static void CatchingFishSnackbar(CatchingFishMVPFABView catchingFishMVPFABView) {
        super.onBackPressed();
    }

    public final CatchingFishFluxCameraX CatchingFishCoroutine() {
        return (CatchingFishFluxCameraX) this.CatchingFishViewModelScope.getValue();
    }

    @Override // kotlin.text.CatchingFishToastFlux
    public final CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast != null) {
            return catchingFishToolbarToast;
        }
        CatchingFishToolbarToast catchingFishToolbarToast2 = new CatchingFishToolbarToast(this);
        this.CatchingFishReduxKtor = catchingFishToolbarToast2;
        return catchingFishToolbarToast2;
    }

    @Override // kotlin.text.CatchingFishJUnitLiveData
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB() {
        return (CatchingFishViewModelIntent) this.CatchingFishDaggerWebsocket.CatchingFishWorkManager;
    }

    public final void CatchingFishReduxKtor() {
        Window window = getWindow();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(window);
        View decorView = window.getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        CatchingFishHiltMVPToast.CatchingFishFragmentFactory(decorView, this);
        Window window2 = getWindow();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(window2);
        View decorView2 = window2.getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(window3);
        View decorView3 = window3.getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView3, "getDecorView(...)");
        CatchingFishOkHttpFAB.CatchingFishRecyclerView(decorView3, this);
        Window window4 = getWindow();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(window4);
        View decorView4 = window4.getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishReduxKtor();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((CatchingFishRealmViewPager) this.CatchingFishWorkManager.getValue()).CatchingFishParcelableFAB();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            CatchingFishFluxCameraX CatchingFishCoroutine = CatchingFishCoroutine();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            CatchingFishCoroutine.CatchingFishCoroutine(onBackInvokedDispatcher);
        }
        this.CatchingFishDaggerWebsocket.CatchingFishDaggerHiltFAB(bundle);
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast == null) {
            catchingFishToolbarToast = new CatchingFishToolbarToast(this);
            this.CatchingFishReduxKtor = catchingFishToolbarToast;
        }
        catchingFishToolbarToast.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(onSaveInstanceState, "onSaveInstanceState(...)");
        this.CatchingFishDaggerWebsocket.CatchingFishSpannableWidget(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast == null) {
            catchingFishToolbarToast = new CatchingFishToolbarToast(this);
            this.CatchingFishReduxKtor = catchingFishToolbarToast;
        }
        catchingFishToolbarToast.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        CatchingFishToolbarToast catchingFishToolbarToast = this.CatchingFishReduxKtor;
        if (catchingFishToolbarToast == null) {
            catchingFishToolbarToast = new CatchingFishToolbarToast(this);
            this.CatchingFishReduxKtor = catchingFishToolbarToast;
        }
        catchingFishToolbarToast.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_DESTROY);
        this.CatchingFishReduxKtor = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        CatchingFishReduxKtor();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishReduxKtor();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishReduxKtor();
        super.setContentView(view, layoutParams);
    }
}
