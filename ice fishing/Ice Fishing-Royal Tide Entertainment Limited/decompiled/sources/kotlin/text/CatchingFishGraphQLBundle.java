package kotlin.text;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLBundle extends ViewGroup.MarginLayoutParams {
    public int CatchingFish;
    public boolean CatchingFishAndroidX;
    public boolean CatchingFishAnimation;
    public int CatchingFishAnimationMockk;
    public int CatchingFishAppCompat;
    public int CatchingFishCameraXIntent;
    public int CatchingFishCardViewRealm;
    public int CatchingFishCardViewView;
    public int CatchingFishCloudMessaging;
    public float CatchingFishCoroutine;
    public int CatchingFishCoroutineFlow;
    public int CatchingFishCustomView;
    public boolean CatchingFishCustomViewJUnit;
    public int CatchingFishDagger;
    public int CatchingFishDaggerHiltFAB;
    public int CatchingFishDaggerMVVM;
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishDataStoreIntent;
    public int CatchingFishEspressoMockk;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFirebase;
    public float CatchingFishFragmentFactory;
    public int CatchingFishFragmentHandler;
    public CatchingFishDaggerRetrofit CatchingFishGlideWidgetKtor;
    public float CatchingFishGradleLiveData;
    public int CatchingFishGradleManifest;
    public int CatchingFishGsonAppCompat;
    public int CatchingFishHandler;
    public boolean CatchingFishJUnitRealm;
    public int CatchingFishJetpackCompose;
    public String CatchingFishJobScheduler;
    public int CatchingFishLayout;
    public int CatchingFishLayoutInflater;
    public int CatchingFishMVPRobolectric;
    public String CatchingFishMVVMAppCompat;
    public int CatchingFishMockkOkHttp;
    public boolean CatchingFishMoshiDaggerHilt;
    public int CatchingFishMotionLayout;
    public float CatchingFishMutableLiveData;
    public float CatchingFishNavigation;
    public boolean CatchingFishNavigationGson;
    public int CatchingFishOkHttp;
    public float CatchingFishParcelable;
    public int CatchingFishParcelableFAB;
    public int CatchingFishParcelableFlux;
    public int CatchingFishPayPal;
    public int CatchingFishPayPalLiveData;
    public float CatchingFishPayPalService;
    public int CatchingFishPicasso;
    public float CatchingFishRecyclerView;
    public boolean CatchingFishRedux;
    public boolean CatchingFishReduxKtor;
    public int CatchingFishReduxMoshi;
    public int CatchingFishRetrofit;
    public int CatchingFishRetrofitMVI;
    public int CatchingFishRoomDatabase;
    public float CatchingFishSensorManager;
    public float CatchingFishServiceMVIJUnit;
    public int CatchingFishSnackbar;
    public int CatchingFishSpannableWidget;
    public int CatchingFishStateFlow;
    public int CatchingFishStateLiveData;
    public int CatchingFishStripeAPI;
    public int CatchingFishUnitTesting;
    public int CatchingFishView;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public final void CatchingFishParcelableFAB() {
        this.CatchingFishRedux = false;
        this.CatchingFishMoshiDaggerHilt = true;
        this.CatchingFishAndroidX = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.CatchingFishJUnitRealm) {
            this.CatchingFishMoshiDaggerHilt = false;
            if (this.CatchingFishCameraXIntent == 0) {
                this.CatchingFishCameraXIntent = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.CatchingFishAnimation) {
            this.CatchingFishAndroidX = false;
            if (this.CatchingFishHandler == 0) {
                this.CatchingFishHandler = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.CatchingFishMoshiDaggerHilt = false;
            if (i == 0 && this.CatchingFishCameraXIntent == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.CatchingFishJUnitRealm = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.CatchingFishAndroidX = false;
            if (i2 == 0 && this.CatchingFishHandler == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.CatchingFishAnimation = true;
            }
        }
        if (this.CatchingFishCoroutine == -1.0f && this.CatchingFishParcelableFAB == -1 && this.CatchingFishSnackbar == -1) {
            return;
        }
        this.CatchingFishRedux = true;
        this.CatchingFishMoshiDaggerHilt = true;
        this.CatchingFishAndroidX = true;
        if (!(this.CatchingFishGlideWidgetKtor instanceof CatchingFishViewModelMockk)) {
            this.CatchingFishGlideWidgetKtor = new CatchingFishViewModelMockk();
        }
        ((CatchingFishViewModelMockk) this.CatchingFishGlideWidgetKtor).CatchingFishRecyclerView(this.CatchingFishStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.CatchingFishReduxMoshi = -1;
        this.CatchingFishPicasso = -1;
        this.CatchingFishDaggerMVVM = -1;
        this.CatchingFishMockkOkHttp = -1;
        this.CatchingFishFirebase = this.CatchingFishSpannableWidget;
        this.CatchingFishRetrofitMVI = this.CatchingFishGsonAppCompat;
        float f = this.CatchingFishFragmentFactory;
        this.CatchingFishGradleLiveData = f;
        int i8 = this.CatchingFishParcelableFAB;
        this.CatchingFishRetrofit = i8;
        int i9 = this.CatchingFishSnackbar;
        this.CatchingFishView = i9;
        float f2 = this.CatchingFishCoroutine;
        this.CatchingFishServiceMVIJUnit = f2;
        if (z2) {
            int i10 = this.CatchingFish;
            if (i10 != -1) {
                this.CatchingFishReduxMoshi = i10;
            } else {
                int i11 = this.CatchingFishJetpackCompose;
                if (i11 != -1) {
                    this.CatchingFishPicasso = i11;
                }
                i2 = this.CatchingFishCoroutineFlow;
                if (i2 != -1) {
                    this.CatchingFishMockkOkHttp = i2;
                    z = true;
                }
                i3 = this.CatchingFishDaggerHiltFAB;
                if (i3 != -1) {
                    this.CatchingFishDaggerMVVM = i3;
                    z = true;
                }
                i4 = this.CatchingFishPayPal;
                if (i4 != Integer.MIN_VALUE) {
                    this.CatchingFishRetrofitMVI = i4;
                }
                i5 = this.CatchingFishCardViewView;
                if (i5 != Integer.MIN_VALUE) {
                    this.CatchingFishFirebase = i5;
                }
                if (z) {
                    this.CatchingFishGradleLiveData = 1.0f - f;
                }
                if (this.CatchingFishRedux && this.CatchingFishStateFlow == 1 && this.CatchingFishReduxKtor) {
                    if (f2 == -1.0f) {
                        this.CatchingFishServiceMVIJUnit = 1.0f - f2;
                        this.CatchingFishRetrofit = -1;
                        this.CatchingFishView = -1;
                    } else if (i8 != -1) {
                        this.CatchingFishView = i8;
                        this.CatchingFishRetrofit = -1;
                        this.CatchingFishServiceMVIJUnit = -1.0f;
                    } else if (i9 != -1) {
                        this.CatchingFishRetrofit = i9;
                        this.CatchingFishView = -1;
                        this.CatchingFishServiceMVIJUnit = -1.0f;
                    }
                }
            }
            z = true;
            i2 = this.CatchingFishCoroutineFlow;
            if (i2 != -1) {
            }
            i3 = this.CatchingFishDaggerHiltFAB;
            if (i3 != -1) {
            }
            i4 = this.CatchingFishPayPal;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.CatchingFishCardViewView;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z) {
            }
            if (this.CatchingFishRedux) {
                if (f2 == -1.0f) {
                }
            }
        } else {
            int i12 = this.CatchingFish;
            if (i12 != -1) {
                this.CatchingFishMockkOkHttp = i12;
            }
            int i13 = this.CatchingFishJetpackCompose;
            if (i13 != -1) {
                this.CatchingFishDaggerMVVM = i13;
            }
            int i14 = this.CatchingFishCoroutineFlow;
            if (i14 != -1) {
                this.CatchingFishReduxMoshi = i14;
            }
            int i15 = this.CatchingFishDaggerHiltFAB;
            if (i15 != -1) {
                this.CatchingFishPicasso = i15;
            }
            int i16 = this.CatchingFishPayPal;
            if (i16 != Integer.MIN_VALUE) {
                this.CatchingFishFirebase = i16;
            }
            int i17 = this.CatchingFishCardViewView;
            if (i17 != Integer.MIN_VALUE) {
                this.CatchingFishRetrofitMVI = i17;
            }
        }
        if (this.CatchingFishCoroutineFlow == -1 && this.CatchingFishDaggerHiltFAB == -1 && this.CatchingFishJetpackCompose == -1 && this.CatchingFish == -1) {
            int i18 = this.CatchingFishViewModelScope;
            if (i18 != -1) {
                this.CatchingFishReduxMoshi = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.CatchingFishViewModelFAB;
                if (i19 != -1) {
                    this.CatchingFishPicasso = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.CatchingFishDaggerWebsocket;
            if (i20 != -1) {
                this.CatchingFishDaggerMVVM = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.CatchingFishWorkManager;
            if (i21 != -1) {
                this.CatchingFishMockkOkHttp = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
