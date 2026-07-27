package kotlin.text;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitRealm<S> extends CatchingFishRoomSnackbar {
    public CatchingFishBundleGlide CatchingFishAndroidX;
    public int CatchingFishAnimation;
    public View CatchingFishCustomViewJUnit;
    public View CatchingFishDaggerMVVM;
    public AccessibilityManager CatchingFishFirebase;
    public CatchingFishCardViewOkHttp CatchingFishMVVMAppCompat;
    public View CatchingFishMockkOkHttp;
    public int CatchingFishMoshiDaggerHilt;
    public RecyclerView CatchingFishNavigationGson;
    public MaterialButton CatchingFishPicasso;
    public RecyclerView CatchingFishRedux;
    public View CatchingFishReduxMoshi;
    public CatchingFishLiveDataMVI CatchingFishStripeAPI;

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final View CatchingFish(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        CatchingFishCardViewGraphQL catchingFishCardViewGraphQL;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(CatchingFishViewModelFAB(), this.CatchingFishAnimation);
        this.CatchingFishAndroidX = new CatchingFishBundleGlide(contextThemeWrapper, 12);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.CatchingFishFirebase = (AccessibilityManager) CatchingFishCardViewView().getSystemService("accessibility");
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = this.CatchingFishMVVMAppCompat.CatchingFishReduxKtor;
        if (CatchingFishLiveDataContext.CatchingFishSensorManager(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.catchingfish.fishcatcherpro.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.catchingfish.fishcatcherpro.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = CatchingFishCardViewView().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = CatchingFishJUnitCoroutine.CatchingFishReduxKtor;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.catchingfish.fishcatcherpro.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.mtrl_calendar_days_of_week);
        CatchingFishFABCameraX.CatchingFishOkHttp(gridView, new CatchingFishBiometricFlux(0));
        int i4 = this.CatchingFishMVVMAppCompat.CatchingFishViewModelFAB;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new CatchingFishJUnitAdMob(i4) : new CatchingFishJUnitAdMob()));
        gridView.setNumColumns(catchingFishLiveDataMVI.CatchingFishViewModelScope);
        gridView.setEnabled(false);
        this.CatchingFishRedux = (RecyclerView) inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.mtrl_calendar_months);
        this.CatchingFishRedux.setLayoutManager(new CatchingFishMVIRoomPicasso(this, i2, i2));
        this.CatchingFishRedux.setTag("MONTHS_VIEW_GROUP_TAG");
        com.google.android.material.datepicker.CatchingFishUnitTestingGson catchingFishUnitTestingGson = new com.google.android.material.datepicker.CatchingFishUnitTestingGson(contextThemeWrapper, this.CatchingFishMVVMAppCompat, new CatchingFishViewPagerMockk(18, this));
        this.CatchingFishRedux.setAdapter(catchingFishUnitTestingGson);
        int integer = contextThemeWrapper.getResources().getInteger(com.catchingfish.fishcatcherpro.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.mtrl_calendar_year_selector_frame);
        this.CatchingFishNavigationGson = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.CatchingFishNavigationGson.setLayoutManager(new GridLayoutManager(integer));
            this.CatchingFishNavigationGson.setAdapter(new CatchingFishMVVMSnackbar(this));
            RecyclerView recyclerView4 = this.CatchingFishNavigationGson;
            CatchingFishStripeAPIGson catchingFishStripeAPIGson = new CatchingFishStripeAPIGson();
            CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
            CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null);
            recyclerView4.CatchingFishViewModelScope(catchingFishStripeAPIGson);
        }
        View findViewById = inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.month_navigation_fragment_toggle);
        CatchingFishCardViewOkHttp catchingFishCardViewOkHttp = catchingFishUnitTestingGson.CatchingFishReduxKtor;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.month_navigation_fragment_toggle);
            this.CatchingFishPicasso = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            CatchingFishFABCameraX.CatchingFishOkHttp(this.CatchingFishPicasso, new CatchingFishIntentFragment(2, this));
            View findViewById2 = inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.month_navigation_previous);
            this.CatchingFishCustomViewJUnit = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.month_navigation_next);
            this.CatchingFishDaggerMVVM = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.CatchingFishMockkOkHttp = inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.mtrl_calendar_year_selector_frame);
            this.CatchingFishReduxMoshi = inflate.findViewById(com.catchingfish.fishcatcherpro.R.id.mtrl_calendar_day_selector_frame);
            CatchingFishJobScheduler(1);
            this.CatchingFishPicasso.setText(this.CatchingFishStripeAPI.CatchingFishCoroutine());
            this.CatchingFishRedux.CatchingFishViewModelFAB(new CatchingFishBundleManifest(this, catchingFishUnitTestingGson));
            this.CatchingFishPicasso.setOnClickListener(new CatchingFishToolbarCameraX(2, this));
            this.CatchingFishDaggerMVVM.setOnClickListener(new CatchingFishViewService(this, catchingFishUnitTestingGson, 1));
            this.CatchingFishCustomViewJUnit.setOnClickListener(new CatchingFishViewService(this, catchingFishUnitTestingGson, 0));
            CatchingFishPayPalService(catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishReduxKtor(this.CatchingFishStripeAPI));
        }
        if (!CatchingFishLiveDataContext.CatchingFishSensorManager(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (catchingFishCardViewGraphQL = new CatchingFishCardViewGraphQL()).CatchingFishParcelableFAB) != (recyclerView = this.CatchingFishRedux)) {
            CatchingFishMVVMEspresso catchingFishMVVMEspresso = catchingFishCardViewGraphQL.CatchingFishSnackbar;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.CatchingFishDaggerMVVM;
                if (arrayList != null) {
                    arrayList.remove(catchingFishMVVMEspresso);
                }
                catchingFishCardViewGraphQL.CatchingFishParcelableFAB.setOnFlingListener(null);
            }
            catchingFishCardViewGraphQL.CatchingFishParcelableFAB = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                catchingFishCardViewGraphQL.CatchingFishParcelableFAB.CatchingFishViewModelFAB(catchingFishMVVMEspresso);
                catchingFishCardViewGraphQL.CatchingFishParcelableFAB.setOnFlingListener(catchingFishCardViewGraphQL);
                new Scroller(catchingFishCardViewGraphQL.CatchingFishParcelableFAB.getContext(), new DecelerateInterpolator());
                catchingFishCardViewGraphQL.CatchingFishWorkManager();
            }
        }
        this.CatchingFishRedux.CatchingFishMVVMAppCompat(catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishReduxKtor(this.CatchingFishStripeAPI));
        CatchingFishFABCameraX.CatchingFishOkHttp(this.CatchingFishRedux, new CatchingFishBiometricFlux(1));
        return inflate;
    }

    public final void CatchingFishJobScheduler(int i) {
        this.CatchingFishMoshiDaggerHilt = i;
        if (i == 2) {
            this.CatchingFishNavigationGson.getLayoutManager().CatchingFishServiceMVIJUnit(this.CatchingFishStripeAPI.CatchingFishWorkManager - ((CatchingFishMVVMSnackbar) this.CatchingFishNavigationGson.getAdapter()).CatchingFishReduxKtor.CatchingFishMVVMAppCompat.CatchingFishReduxKtor.CatchingFishWorkManager);
            this.CatchingFishMockkOkHttp.setVisibility(0);
            this.CatchingFishReduxMoshi.setVisibility(8);
            this.CatchingFishCustomViewJUnit.setVisibility(8);
            this.CatchingFishDaggerMVVM.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.CatchingFishMockkOkHttp.setVisibility(8);
            this.CatchingFishReduxMoshi.setVisibility(0);
            this.CatchingFishCustomViewJUnit.setVisibility(0);
            this.CatchingFishDaggerMVVM.setVisibility(0);
            CatchingFishMutableLiveData(this.CatchingFishStripeAPI);
        }
    }

    public final void CatchingFishMutableLiveData(CatchingFishLiveDataMVI catchingFishLiveDataMVI) {
        com.google.android.material.datepicker.CatchingFishUnitTestingGson catchingFishUnitTestingGson = (com.google.android.material.datepicker.CatchingFishUnitTestingGson) this.CatchingFishRedux.getAdapter();
        int CatchingFishReduxKtor = catchingFishUnitTestingGson.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishReduxKtor(catchingFishLiveDataMVI);
        AccessibilityManager accessibilityManager = this.CatchingFishFirebase;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int CatchingFishReduxKtor2 = CatchingFishReduxKtor - catchingFishUnitTestingGson.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishReduxKtor(this.CatchingFishStripeAPI);
            boolean z = Math.abs(CatchingFishReduxKtor2) > 3;
            boolean z2 = CatchingFishReduxKtor2 > 0;
            this.CatchingFishStripeAPI = catchingFishLiveDataMVI;
            if (z && z2) {
                this.CatchingFishRedux.CatchingFishMVVMAppCompat(CatchingFishReduxKtor - 3);
                this.CatchingFishRedux.post(new CatchingFishServiceEspresso(CatchingFishReduxKtor, 3, this));
            } else if (z) {
                this.CatchingFishRedux.CatchingFishMVVMAppCompat(CatchingFishReduxKtor + 3);
                this.CatchingFishRedux.post(new CatchingFishServiceEspresso(CatchingFishReduxKtor, 3, this));
            } else {
                this.CatchingFishRedux.post(new CatchingFishServiceEspresso(CatchingFishReduxKtor, 3, this));
            }
        } else {
            this.CatchingFishStripeAPI = catchingFishLiveDataMVI;
            this.CatchingFishRedux.CatchingFishMVVMAppCompat(CatchingFishReduxKtor);
        }
        CatchingFishPayPalService(CatchingFishReduxKtor);
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishNavigation(Bundle bundle) {
        super.CatchingFishNavigation(bundle);
        if (bundle == null) {
            bundle = this.CatchingFishLayout;
        }
        this.CatchingFishAnimation = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.CatchingFishMVVMAppCompat = (CatchingFishCardViewOkHttp) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.CatchingFishStripeAPI = (CatchingFishLiveDataMVI) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final void CatchingFishPayPalService(int i) {
        this.CatchingFishDaggerMVVM.setEnabled(i + 1 < this.CatchingFishRedux.getAdapter().CatchingFishParcelableFAB());
        this.CatchingFishCustomViewJUnit.setEnabled(i - 1 >= 0);
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishSpannableWidget(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.CatchingFishAnimation);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.CatchingFishMVVMAppCompat);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.CatchingFishStripeAPI);
    }
}
