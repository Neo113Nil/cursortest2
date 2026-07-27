package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitDagger {
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public final ConstraintLayout CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public final /* synthetic */ ConstraintLayout CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishRetrofitDagger(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.CatchingFishViewModelFAB = constraintLayout;
        this.CatchingFishParcelableFAB = constraintLayout2;
    }

    public static boolean CatchingFishParcelableFAB(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void CatchingFishSnackbar(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, CatchingFishGsonBiometric catchingFishGsonBiometric) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (catchingFishDaggerRetrofit == null) {
            return;
        }
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit.CatchingFishDagger;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit.CatchingFishSensorManager;
        if (catchingFishDaggerRetrofit.CatchingFishMockkOkHttp == 8) {
            catchingFishGsonBiometric.CatchingFishDaggerWebsocket = 0;
            catchingFishGsonBiometric.CatchingFishWorkManager = 0;
            catchingFishGsonBiometric.CatchingFishViewModelScope = 0;
            return;
        }
        if (catchingFishDaggerRetrofit.CatchingFishAppCompat == null) {
            return;
        }
        CatchingFishViewRoom catchingFishViewRoom = ConstraintLayout.CatchingFish;
        int i2 = catchingFishGsonBiometric.CatchingFishParcelableFAB;
        int i3 = catchingFishGsonBiometric.CatchingFishSnackbar;
        int i4 = catchingFishGsonBiometric.CatchingFishCoroutine;
        int i5 = catchingFishGsonBiometric.CatchingFishReduxKtor;
        int i6 = this.CatchingFishSnackbar + this.CatchingFishCoroutine;
        int i7 = this.CatchingFishReduxKtor;
        View view = catchingFishDaggerRetrofit.CatchingFishDaggerMVVM;
        int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(i2);
        if (CatchingFishParcelableFlux == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (CatchingFishParcelableFlux == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.CatchingFishWorkManager, i7, -2);
        } else if (CatchingFishParcelableFlux == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.CatchingFishWorkManager, i7, -2);
            boolean z2 = catchingFishDaggerRetrofit.CatchingFishNavigation == 1;
            int i8 = catchingFishGsonBiometric.CatchingFishFragmentHandler;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
                if (catchingFishGsonBiometric.CatchingFishFragmentHandler == 2 || !z2 || ((z2 && z3) || catchingFishDaggerRetrofit.CatchingFishPayPal())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(catchingFishDaggerRetrofit.CatchingFishRoomDatabase(), 1073741824);
                }
            }
        } else if (CatchingFishParcelableFlux != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.CatchingFishWorkManager;
            int i10 = catchingFishStripeAPIJUnit2 != null ? catchingFishStripeAPIJUnit2.CatchingFishViewModelScope : 0;
            if (catchingFishStripeAPIJUnit != null) {
                i10 += catchingFishStripeAPIJUnit.CatchingFishViewModelScope;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int CatchingFishParcelableFlux2 = CatchingFishMVPLiveData.CatchingFishParcelableFlux(i3);
        if (CatchingFishParcelableFlux2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (CatchingFishParcelableFlux2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.CatchingFishViewModelScope, i6, -2);
        } else if (CatchingFishParcelableFlux2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.CatchingFishViewModelScope, i6, -2);
            boolean z4 = catchingFishDaggerRetrofit.CatchingFish == 1;
            int i11 = catchingFishGsonBiometric.CatchingFishFragmentHandler;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
                if (catchingFishGsonBiometric.CatchingFishFragmentHandler == 2 || !z4 || ((z4 && z5) || catchingFishDaggerRetrofit.CatchingFishCardViewView())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(catchingFishDaggerRetrofit.CatchingFishCloudMessaging(), 1073741824);
                }
            }
        } else if (CatchingFishParcelableFlux2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.CatchingFishViewModelScope;
            int i13 = catchingFishStripeAPIJUnit2 != null ? catchingFishDaggerRetrofit.CatchingFishEspressoMockk.CatchingFishViewModelScope : 0;
            if (catchingFishStripeAPIJUnit != null) {
                i13 += catchingFishDaggerRetrofit.CatchingFishCameraXIntent.CatchingFishViewModelScope;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = (CatchingFishGsonAppCompat) catchingFishDaggerRetrofit.CatchingFishAppCompat;
        ConstraintLayout constraintLayout = this.CatchingFishViewModelFAB;
        if (catchingFishGsonAppCompat != null && CatchingFishRobolectricHilt.CatchingFishNavigation(constraintLayout.CatchingFishEspressoTesting, 256) && view.getMeasuredWidth() == catchingFishDaggerRetrofit.CatchingFishRoomDatabase() && view.getMeasuredWidth() < catchingFishGsonAppCompat.CatchingFishRoomDatabase() && view.getMeasuredHeight() == catchingFishDaggerRetrofit.CatchingFishCloudMessaging() && view.getMeasuredHeight() < catchingFishGsonAppCompat.CatchingFishCloudMessaging() && view.getBaseline() == catchingFishDaggerRetrofit.CatchingFishMoshiDaggerHilt && !catchingFishDaggerRetrofit.CatchingFishCardViewRealm() && CatchingFishParcelableFAB(catchingFishDaggerRetrofit.CatchingFishJobScheduler, makeMeasureSpec, catchingFishDaggerRetrofit.CatchingFishRoomDatabase()) && CatchingFishParcelableFAB(catchingFishDaggerRetrofit.CatchingFishPayPalService, makeMeasureSpec2, catchingFishDaggerRetrofit.CatchingFishCloudMessaging())) {
            catchingFishGsonBiometric.CatchingFishDaggerWebsocket = catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
            catchingFishGsonBiometric.CatchingFishWorkManager = catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
            catchingFishGsonBiometric.CatchingFishViewModelScope = catchingFishDaggerRetrofit.CatchingFishMoshiDaggerHilt;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f;
        boolean z11 = z7 && catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f;
        if (view == null) {
            return;
        }
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) view.getLayoutParams();
        int i14 = catchingFishGsonBiometric.CatchingFishFragmentHandler;
        if (i14 != 1 && i14 != 2 && z6 && catchingFishDaggerRetrofit.CatchingFishNavigation == 0 && z7 && catchingFishDaggerRetrofit.CatchingFish == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            max = 0;
        } else {
            if ((view instanceof CatchingFishContextDagger) && (catchingFishDaggerRetrofit instanceof CatchingFishBiometricOkHttp)) {
                ((CatchingFishContextDagger) view).CatchingFishFragmentHandler((CatchingFishBiometricOkHttp) catchingFishDaggerRetrofit, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            catchingFishDaggerRetrofit.CatchingFishJobScheduler = makeMeasureSpec;
            catchingFishDaggerRetrofit.CatchingFishPayPalService = makeMeasureSpec2;
            catchingFishDaggerRetrofit.CatchingFishViewModelScope = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = catchingFishDaggerRetrofit.CatchingFishCoroutineFlow;
            int max2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB;
            if (i16 > 0) {
                max2 = Math.min(i16, max2);
            }
            int i17 = catchingFishDaggerRetrofit.CatchingFishParcelableFlux;
            max = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = catchingFishDaggerRetrofit.CatchingFishGsonAppCompat;
            if (i19 > 0) {
                max = Math.min(i19, max);
            }
            if (!CatchingFishRobolectricHilt.CatchingFishNavigation(constraintLayout.CatchingFishEspressoTesting, 1)) {
                if (z10 && z8) {
                    max2 = (int) ((max * catchingFishDaggerRetrofit.CatchingFishJUnitRealm) + 0.5f);
                } else if (z11 && z9) {
                    max = (int) ((max2 / catchingFishDaggerRetrofit.CatchingFishJUnitRealm) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z = false;
            } else {
                if (measuredWidth2 != max2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                catchingFishDaggerRetrofit.CatchingFishJobScheduler = makeMeasureSpec;
                catchingFishDaggerRetrofit.CatchingFishPayPalService = makeMeasureSpec3;
                z = false;
                catchingFishDaggerRetrofit.CatchingFishViewModelScope = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        catchingFishGsonBiometric.CatchingFishLayout = (measuredWidth == catchingFishGsonBiometric.CatchingFishCoroutine && max == catchingFishGsonBiometric.CatchingFishReduxKtor) ? z : true;
        boolean z13 = catchingFishGraphQLBundle.CatchingFishNavigationGson ? true : z12;
        if (z13 && baseline != -1 && catchingFishDaggerRetrofit.CatchingFishMoshiDaggerHilt != baseline) {
            catchingFishGsonBiometric.CatchingFishLayout = true;
        }
        catchingFishGsonBiometric.CatchingFishDaggerWebsocket = measuredWidth;
        catchingFishGsonBiometric.CatchingFishWorkManager = max;
        catchingFishGsonBiometric.CatchingFishViewModelFAB = z13;
        catchingFishGsonBiometric.CatchingFishViewModelScope = baseline;
    }
}
