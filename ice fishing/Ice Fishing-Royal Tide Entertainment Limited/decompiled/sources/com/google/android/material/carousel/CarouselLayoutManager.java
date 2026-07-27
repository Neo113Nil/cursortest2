package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import kotlin.text.CatchingFishAdMobSnackbar;
import kotlin.text.CatchingFishFluxGoogleMaps;
import kotlin.text.CatchingFishGradleDagger;
import kotlin.text.CatchingFishKtorDataStore;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishReduxGlide;
import kotlin.text.CatchingFishReduxToolbar;
import kotlin.text.CatchingFishSnackbarCameraX;
import kotlin.text.CatchingFishSnackbarPicasso;
import kotlin.text.CatchingFishViewPagerKtor;
import kotlin.text.CatchingFishWidgetMVIGradle;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends CatchingFishKtorDataStore implements CatchingFishWidgetMVIGradle {
    public final View.OnLayoutChangeListener CatchingFishNavigation;
    public CatchingFishAdMobSnackbar CatchingFishRoomDatabase;
    public final CatchingFishReduxToolbar CatchingFishStateLiveData;

    public CarouselLayoutManager() {
        CatchingFishReduxToolbar catchingFishReduxToolbar = new CatchingFishReduxToolbar();
        new CatchingFishFluxGoogleMaps();
        this.CatchingFishNavigation = new View.OnLayoutChangeListener() { // from class: kotlin.text.CatchingFishManifestPicasso
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new CatchingFishMVPLayout(6, CarouselLayoutManager.this));
            }
        };
        this.CatchingFishStateLiveData = catchingFishReduxToolbar;
        CatchingFishRetrofit();
        CatchingFishMVPHandler(0);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishAnimation(int i, int i2) {
        CatchingFishCardViewView();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishAnimationMockk(CatchingFishReduxGlide catchingFishReduxGlide) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0027, code lost:
    
        if (r6 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0031, code lost:
    
        if (CatchingFishKtor() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0035, code lost:
    
        if (r6 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003e, code lost:
    
        if (CatchingFishKtor() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.text.CatchingFishKtorDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View CatchingFishAppCompat(View view, int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        char c;
        if (CatchingFishDaggerHiltFAB() == 0) {
            return null;
        }
        int i2 = this.CatchingFishRoomDatabase.CatchingFishParcelableFAB;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                        }
                        c = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c = 0;
                    }
                }
                if (c == 0) {
                    return null;
                }
                if (c == 65535) {
                    if (CatchingFishKtorDataStore.CatchingFishPayPalService(view) == 0) {
                        return null;
                    }
                    int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0)) - 1;
                    if (CatchingFishPayPalService < 0 || CatchingFishPayPalService >= CatchingFishCardViewView()) {
                        return CatchingFishCoroutineFlow(CatchingFishKtor() ? CatchingFishDaggerHiltFAB() - 1 : 0);
                    }
                    this.CatchingFishRoomDatabase.CatchingFishParcelableFAB();
                    throw null;
                }
                if (CatchingFishKtorDataStore.CatchingFishPayPalService(view) == CatchingFishCardViewView() - 1) {
                    return null;
                }
                int CatchingFishPayPalService2 = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB() - 1)) + 1;
                if (CatchingFishPayPalService2 < 0 || CatchingFishPayPalService2 >= CatchingFishCardViewView()) {
                    return CatchingFishCoroutineFlow(CatchingFishKtor() ? 0 : CatchingFishDaggerHiltFAB() - 1);
                }
                this.CatchingFishRoomDatabase.CatchingFishParcelableFAB();
                throw null;
            }
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    public final float CatchingFishCameraX(float f, float f2) {
        return CatchingFishKtor() ? f - f2 : f + f2;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishCameraXIntent() {
        return true;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishCloudMessaging(CatchingFishReduxGlide catchingFishReduxGlide) {
        return 0;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishDaggerWebsocket() {
        return !CatchingFishLifecycle();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishDataStoreIntent(AccessibilityEvent accessibilityEvent) {
        super.CatchingFishDataStoreIntent(accessibilityEvent);
        if (CatchingFishDaggerHiltFAB() > 0) {
            accessibilityEvent.setFromIndex(CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0)));
            accessibilityEvent.setToIndex(CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB() - 1)));
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishDynamicFeature(RecyclerView recyclerView, int i) {
        CatchingFishViewPagerKtor catchingFishViewPagerKtor = new CatchingFishViewPagerKtor(this, recyclerView.getContext());
        catchingFishViewPagerKtor.CatchingFishParcelableFAB = i;
        CatchingFishPayPalHandler(catchingFishViewPagerKtor);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishEspressoTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return 0;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishFragmentHandler(CatchingFishReduxGlide catchingFishReduxGlide) {
        CatchingFishDaggerHiltFAB();
        return 0;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishGlideWidgetKtor(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (!CatchingFishDaggerWebsocket() || CatchingFishDaggerHiltFAB() == 0 || i == 0) {
            return 0;
        }
        catchingFishSnackbarCameraX.CatchingFishReduxKtor(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishGradleLiveData(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishGsonAppCompat(View view, Rect rect) {
        super.CatchingFishGsonAppCompat(view, rect);
        rect.centerY();
        if (CatchingFishLifecycle()) {
            rect.centerX();
        }
        throw null;
    }

    public final boolean CatchingFishKtor() {
        return CatchingFishLifecycle() && CatchingFishMVPRobolectric() == 1;
    }

    public final boolean CatchingFishLifecycle() {
        return this.CatchingFishRoomDatabase.CatchingFishParcelableFAB == 0;
    }

    public final void CatchingFishMVPHandler(int i) {
        CatchingFishAdMobSnackbar catchingFishAdMobSnackbar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("invalid orientation:", i));
        }
        CatchingFishCoroutine(null);
        CatchingFishAdMobSnackbar catchingFishAdMobSnackbar2 = this.CatchingFishRoomDatabase;
        if (catchingFishAdMobSnackbar2 == null || i != catchingFishAdMobSnackbar2.CatchingFishParcelableFAB) {
            if (i == 0) {
                catchingFishAdMobSnackbar = new CatchingFishAdMobSnackbar(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                catchingFishAdMobSnackbar = new CatchingFishAdMobSnackbar(this, 0);
            }
            this.CatchingFishRoomDatabase = catchingFishAdMobSnackbar;
            CatchingFishRetrofit();
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMVVMAppCompat() {
        CatchingFishCardViewView();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMoshiDaggerHilt(int i, int i2) {
        CatchingFishCardViewView();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFishNavigation() {
        return new CatchingFishGradleDagger(-2, -2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishNavigationGson(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (catchingFishReduxGlide.CatchingFishSnackbar() > 0) {
            if ((CatchingFishLifecycle() ? this.CatchingFishUnitTesting : this.CatchingFishAnimationMockk) > 0.0f) {
                CatchingFishKtor();
                catchingFishSnackbarCameraX.CatchingFishReduxKtor(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        CatchingFishReduxMoshi(catchingFishSnackbarCameraX);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishOkHttp(CatchingFishReduxGlide catchingFishReduxGlide) {
        CatchingFishDaggerHiltFAB();
        return 0;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishParcelable(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        CatchingFishReduxToolbar catchingFishReduxToolbar = this.CatchingFishStateLiveData;
        float f = catchingFishReduxToolbar.CatchingFishParcelableFAB;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        catchingFishReduxToolbar.CatchingFishParcelableFAB = f;
        float f2 = catchingFishReduxToolbar.CatchingFishSnackbar;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        catchingFishReduxToolbar.CatchingFishSnackbar = f2;
        CatchingFishRetrofit();
        recyclerView.addOnLayoutChangeListener(this.CatchingFishNavigation);
    }

    @Override // kotlin.text.CatchingFishWidgetMVIGradle
    public final PointF CatchingFishParcelableFAB(int i) {
        return null;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishRecyclerView(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.CatchingFishNavigation);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishRedux(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return;
        }
        CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0));
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishReduxKtor() {
        return CatchingFishLifecycle();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishServiceMVIJUnit(int i) {
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishUnitTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return 0;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (!CatchingFishLifecycle() || CatchingFishDaggerHiltFAB() == 0 || i == 0) {
            return 0;
        }
        catchingFishSnackbarCameraX.CatchingFishReduxKtor(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new CatchingFishFluxGoogleMaps();
        this.CatchingFishNavigation = new View.OnLayoutChangeListener() { // from class: kotlin.text.CatchingFishManifestPicasso
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                view.post(new CatchingFishMVPLayout(6, CarouselLayoutManager.this));
            }
        };
        this.CatchingFishStateLiveData = new CatchingFishReduxToolbar();
        CatchingFishRetrofit();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishSnackbar);
            obtainStyledAttributes.getInt(0, 0);
            CatchingFishRetrofit();
            CatchingFishMVPHandler(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
