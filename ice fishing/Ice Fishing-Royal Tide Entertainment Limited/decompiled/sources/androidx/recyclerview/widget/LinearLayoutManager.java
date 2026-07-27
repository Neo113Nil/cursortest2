package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.CatchingFishAdMobEspresso;
import kotlin.text.CatchingFishAdMobToolbar;
import kotlin.text.CatchingFishFABRobolectric;
import kotlin.text.CatchingFishGradleDagger;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishIntentJUnit;
import kotlin.text.CatchingFishKtorDataStore;
import kotlin.text.CatchingFishLifecycleFAB;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishPayPalCardView;
import kotlin.text.CatchingFishRealmRetrofit;
import kotlin.text.CatchingFishReduxGlide;
import kotlin.text.CatchingFishReduxWidget;
import kotlin.text.CatchingFishSnackbarCameraX;
import kotlin.text.CatchingFishWidgetFAB;
import kotlin.text.CatchingFishWidgetMVIGradle;

/* loaded from: classes.dex */
public class LinearLayoutManager extends CatchingFishKtorDataStore implements CatchingFishWidgetMVIGradle {
    public boolean CatchingFish;
    public CatchingFishRealmRetrofit CatchingFishCardViewRealm;
    public final CatchingFishReduxWidget CatchingFishCardViewView;
    public boolean CatchingFishCoroutineFlow;
    public final int[] CatchingFishCustomView;
    public boolean CatchingFishDaggerHiltFAB;
    public int CatchingFishGsonAppCompat;
    public final boolean CatchingFishJetpackCompose;
    public final int CatchingFishMVPRobolectric;
    public CatchingFishIntentJUnit CatchingFishNavigation;
    public int CatchingFishParcelableFlux;
    public final CatchingFishAdMobToolbar CatchingFishPayPal;
    public CatchingFishLifecycleFAB CatchingFishRoomDatabase;
    public final boolean CatchingFishSpannableWidget;
    public int CatchingFishStateLiveData;

    public LinearLayoutManager(int i) {
        this.CatchingFishStateLiveData = 1;
        this.CatchingFishJetpackCompose = false;
        this.CatchingFishCoroutineFlow = false;
        this.CatchingFishDaggerHiltFAB = false;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishParcelableFlux = -1;
        this.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        this.CatchingFishCardViewRealm = null;
        this.CatchingFishPayPal = new CatchingFishAdMobToolbar();
        this.CatchingFishCardViewView = new CatchingFishReduxWidget();
        this.CatchingFishMVPRobolectric = 2;
        this.CatchingFishCustomView = new int[2];
        CatchingFishJUnitLiveData(i);
        CatchingFishCoroutine(null);
        if (this.CatchingFishJetpackCompose) {
            this.CatchingFishJetpackCompose = false;
            CatchingFishRetrofit();
        }
    }

    public void CatchingFishAccessibility(boolean z) {
        CatchingFishCoroutine(null);
        if (this.CatchingFishDaggerHiltFAB == z) {
            return;
        }
        this.CatchingFishDaggerHiltFAB = z;
        CatchingFishRetrofit();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public int CatchingFishAnimationMockk(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishDaggerAppCompat(catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public View CatchingFishAppCompat(View view, int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        int CatchingFishLiveDataRoom;
        CatchingFishFragment();
        if (CatchingFishDaggerHiltFAB() != 0 && (CatchingFishLiveDataRoom = CatchingFishLiveDataRoom(i)) != Integer.MIN_VALUE) {
            CatchingFishGlideMVP();
            CatchingFishManifest(CatchingFishLiveDataRoom, (int) (this.CatchingFishNavigation.CatchingFishEspressoTesting() * 0.33333334f), false, catchingFishReduxGlide);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB.CatchingFishViewModelScope = Integer.MIN_VALUE;
            catchingFishLifecycleFAB.CatchingFishParcelableFAB = false;
            CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB, catchingFishReduxGlide, true);
            View CatchingFishCardView = CatchingFishLiveDataRoom == -1 ? this.CatchingFishCoroutineFlow ? CatchingFishCardView(CatchingFishDaggerHiltFAB() - 1, -1) : CatchingFishCardView(0, CatchingFishDaggerHiltFAB()) : this.CatchingFishCoroutineFlow ? CatchingFishCardView(0, CatchingFishDaggerHiltFAB()) : CatchingFishCardView(CatchingFishDaggerHiltFAB() - 1, -1);
            View CatchingFishRetrofitCameraX = CatchingFishLiveDataRoom == -1 ? CatchingFishRetrofitCameraX() : CatchingFishJUnitIntent();
            if (!CatchingFishRetrofitCameraX.hasFocusable()) {
                return CatchingFishCardView;
            }
            if (CatchingFishCardView != null) {
                return CatchingFishRetrofitCameraX;
            }
        }
        return null;
    }

    public void CatchingFishCameraX(CatchingFishReduxGlide catchingFishReduxGlide, int[] iArr) {
        int i;
        int CatchingFishEspressoTesting = catchingFishReduxGlide.CatchingFishParcelableFAB != -1 ? this.CatchingFishNavigation.CatchingFishEspressoTesting() : 0;
        if (this.CatchingFishRoomDatabase.CatchingFishWorkManager == -1) {
            i = 0;
        } else {
            i = CatchingFishEspressoTesting;
            CatchingFishEspressoTesting = 0;
        }
        iArr[0] = CatchingFishEspressoTesting;
        iArr[1] = i;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishCameraXIntent() {
        return true;
    }

    public final View CatchingFishCardView(int i, int i2) {
        int i3;
        int i4;
        CatchingFishGlideMVP();
        if (i2 <= i && i2 >= i) {
            return CatchingFishCoroutineFlow(i);
        }
        if (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow(i)) < this.CatchingFishNavigation.CatchingFishCloudMessaging()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.CatchingFishStateLiveData == 0 ? this.CatchingFishCoroutine.CatchingFishLayout(i, i2, i3, i4) : this.CatchingFishReduxKtor.CatchingFishLayout(i, i2, i3, i4);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public int CatchingFishCloudMessaging(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishMVPHandler(catchingFishReduxGlide);
    }

    public final int CatchingFishContextToast(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishLifecycleFAB catchingFishLifecycleFAB, CatchingFishReduxGlide catchingFishReduxGlide, boolean z) {
        int i;
        int i2 = catchingFishLifecycleFAB.CatchingFishCoroutine;
        int i3 = catchingFishLifecycleFAB.CatchingFishViewModelScope;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                catchingFishLifecycleFAB.CatchingFishViewModelScope = i3 + i2;
            }
            CatchingFishIntent(catchingFishSnackbarCameraX, catchingFishLifecycleFAB);
        }
        int i4 = catchingFishLifecycleFAB.CatchingFishCoroutine + catchingFishLifecycleFAB.CatchingFishViewModelFAB;
        while (true) {
            if ((!catchingFishLifecycleFAB.CatchingFishEspressoTesting && i4 <= 0) || (i = catchingFishLifecycleFAB.CatchingFishReduxKtor) < 0 || i >= catchingFishReduxGlide.CatchingFishSnackbar()) {
                break;
            }
            CatchingFishReduxWidget catchingFishReduxWidget = this.CatchingFishCardViewView;
            catchingFishReduxWidget.CatchingFishParcelableFAB = 0;
            catchingFishReduxWidget.CatchingFishSnackbar = false;
            catchingFishReduxWidget.CatchingFishCoroutine = false;
            catchingFishReduxWidget.CatchingFishReduxKtor = false;
            CatchingFishJUnitViewPager(catchingFishSnackbarCameraX, catchingFishReduxGlide, catchingFishLifecycleFAB, catchingFishReduxWidget);
            if (!catchingFishReduxWidget.CatchingFishSnackbar) {
                int i5 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                int i6 = catchingFishReduxWidget.CatchingFishParcelableFAB;
                catchingFishLifecycleFAB.CatchingFishSnackbar = (catchingFishLifecycleFAB.CatchingFishWorkManager * i6) + i5;
                if (!catchingFishReduxWidget.CatchingFishCoroutine || catchingFishLifecycleFAB.CatchingFishCloudMessaging != null || !catchingFishReduxGlide.CatchingFishViewModelScope) {
                    catchingFishLifecycleFAB.CatchingFishCoroutine -= i6;
                    i4 -= i6;
                }
                int i7 = catchingFishLifecycleFAB.CatchingFishViewModelScope;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    catchingFishLifecycleFAB.CatchingFishViewModelScope = i8;
                    int i9 = catchingFishLifecycleFAB.CatchingFishCoroutine;
                    if (i9 < 0) {
                        catchingFishLifecycleFAB.CatchingFishViewModelScope = i8 + i9;
                    }
                    CatchingFishIntent(catchingFishSnackbarCameraX, catchingFishLifecycleFAB);
                }
                if (z && catchingFishReduxWidget.CatchingFishReduxKtor) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - catchingFishLifecycleFAB.CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishCoroutine(String str) {
        if (this.CatchingFishCardViewRealm == null) {
            super.CatchingFishCoroutine(str);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishCustomViewJUnit(Parcelable parcelable) {
        if (parcelable instanceof CatchingFishRealmRetrofit) {
            CatchingFishRealmRetrofit catchingFishRealmRetrofit = (CatchingFishRealmRetrofit) parcelable;
            this.CatchingFishCardViewRealm = catchingFishRealmRetrofit;
            if (this.CatchingFishParcelableFlux != -1) {
                catchingFishRealmRetrofit.CatchingFishReduxKtor = -1;
            }
            CatchingFishRetrofit();
        }
    }

    public final int CatchingFishDaggerAppCompat(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        CatchingFishGlideMVP();
        CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishNavigation;
        boolean z = !this.CatchingFishSpannableWidget;
        return CatchingFishHiltMVPToast.CatchingFishFragmentHandler(catchingFishReduxGlide, catchingFishIntentJUnit, CatchingFishExoPlayer(z), CatchingFishToolbar(z), this, this.CatchingFishSpannableWidget);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final Parcelable CatchingFishDaggerMVVM() {
        CatchingFishRealmRetrofit catchingFishRealmRetrofit = this.CatchingFishCardViewRealm;
        if (catchingFishRealmRetrofit != null) {
            CatchingFishRealmRetrofit catchingFishRealmRetrofit2 = new CatchingFishRealmRetrofit();
            catchingFishRealmRetrofit2.CatchingFishReduxKtor = catchingFishRealmRetrofit.CatchingFishReduxKtor;
            catchingFishRealmRetrofit2.CatchingFishDaggerWebsocket = catchingFishRealmRetrofit.CatchingFishDaggerWebsocket;
            catchingFishRealmRetrofit2.CatchingFishWorkManager = catchingFishRealmRetrofit.CatchingFishWorkManager;
            return catchingFishRealmRetrofit2;
        }
        CatchingFishRealmRetrofit catchingFishRealmRetrofit3 = new CatchingFishRealmRetrofit();
        if (CatchingFishDaggerHiltFAB() <= 0) {
            catchingFishRealmRetrofit3.CatchingFishReduxKtor = -1;
            return catchingFishRealmRetrofit3;
        }
        CatchingFishGlideMVP();
        boolean z = this.CatchingFish ^ this.CatchingFishCoroutineFlow;
        catchingFishRealmRetrofit3.CatchingFishWorkManager = z;
        if (z) {
            View CatchingFishJUnitIntent = CatchingFishJUnitIntent();
            catchingFishRealmRetrofit3.CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishJUnitIntent);
            catchingFishRealmRetrofit3.CatchingFishReduxKtor = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishJUnitIntent);
            return catchingFishRealmRetrofit3;
        }
        View CatchingFishRetrofitCameraX = CatchingFishRetrofitCameraX();
        catchingFishRealmRetrofit3.CatchingFishReduxKtor = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishRetrofitCameraX);
        catchingFishRealmRetrofit3.CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRetrofitCameraX) - this.CatchingFishNavigation.CatchingFishCloudMessaging();
        return catchingFishRealmRetrofit3;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishStateLiveData == 1;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishDataStoreIntent(AccessibilityEvent accessibilityEvent) {
        super.CatchingFishDataStoreIntent(accessibilityEvent);
        if (CatchingFishDaggerHiltFAB() > 0) {
            View CatchingFishLifecycleHilt = CatchingFishLifecycleHilt(0, CatchingFishDaggerHiltFAB(), false);
            accessibilityEvent.setFromIndex(CatchingFishLifecycleHilt == null ? -1 : CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishLifecycleHilt));
            accessibilityEvent.setToIndex(CatchingFishMaterialDesign());
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public void CatchingFishDynamicFeature(RecyclerView recyclerView, int i) {
        CatchingFishFABRobolectric catchingFishFABRobolectric = new CatchingFishFABRobolectric(recyclerView.getContext());
        catchingFishFABRobolectric.CatchingFishParcelableFAB = i;
        CatchingFishPayPalHandler(catchingFishFABRobolectric);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public int CatchingFishEspressoTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishDaggerAppCompat(catchingFishReduxGlide);
    }

    public final View CatchingFishExoPlayer(boolean z) {
        return this.CatchingFishCoroutineFlow ? CatchingFishLifecycleHilt(CatchingFishDaggerHiltFAB() - 1, -1, z) : CatchingFishLifecycleHilt(0, CatchingFishDaggerHiltFAB(), z);
    }

    public final void CatchingFishFragment() {
        if (this.CatchingFishStateLiveData == 1 || !CatchingFishGradle()) {
            this.CatchingFishCoroutineFlow = this.CatchingFishJetpackCompose;
        } else {
            this.CatchingFishCoroutineFlow = !this.CatchingFishJetpackCompose;
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishFragmentHandler(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishKtor(catchingFishReduxGlide);
    }

    public final void CatchingFishGlide(int i, int i2) {
        this.CatchingFishRoomDatabase.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishViewModelScope() - i2;
        CatchingFishLifecycleFAB catchingFishLifecycleFAB = this.CatchingFishRoomDatabase;
        catchingFishLifecycleFAB.CatchingFishDaggerWebsocket = this.CatchingFishCoroutineFlow ? -1 : 1;
        catchingFishLifecycleFAB.CatchingFishReduxKtor = i;
        catchingFishLifecycleFAB.CatchingFishWorkManager = 1;
        catchingFishLifecycleFAB.CatchingFishSnackbar = i2;
        catchingFishLifecycleFAB.CatchingFishViewModelScope = Integer.MIN_VALUE;
    }

    public final void CatchingFishGlideMVP() {
        if (this.CatchingFishRoomDatabase == null) {
            CatchingFishLifecycleFAB catchingFishLifecycleFAB = new CatchingFishLifecycleFAB();
            catchingFishLifecycleFAB.CatchingFishParcelableFAB = true;
            catchingFishLifecycleFAB.CatchingFishViewModelFAB = 0;
            catchingFishLifecycleFAB.CatchingFishLayout = 0;
            catchingFishLifecycleFAB.CatchingFishCloudMessaging = null;
            this.CatchingFishRoomDatabase = catchingFishLifecycleFAB;
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public int CatchingFishGlideWidgetKtor(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (this.CatchingFishStateLiveData == 0) {
            return 0;
        }
        return CatchingFishGradleFirebase(i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
    }

    public final boolean CatchingFishGradle() {
        return CatchingFishMVPRobolectric() == 1;
    }

    public final int CatchingFishGradleFirebase(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() != 0 && i != 0) {
            CatchingFishGlideMVP();
            this.CatchingFishRoomDatabase.CatchingFishParcelableFAB = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            CatchingFishManifest(i2, abs, true, catchingFishReduxGlide);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB = this.CatchingFishRoomDatabase;
            int CatchingFishContextToast = CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB, catchingFishReduxGlide, false) + catchingFishLifecycleFAB.CatchingFishViewModelScope;
            if (CatchingFishContextToast >= 0) {
                if (abs > CatchingFishContextToast) {
                    i = i2 * CatchingFishContextToast;
                }
                this.CatchingFishNavigation.CatchingFishAnimationMockk(-i);
                this.CatchingFishRoomDatabase.CatchingFishFragmentHandler = i;
                return i;
            }
        }
        return 0;
    }

    public final int CatchingFishHiltBundle(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z) {
        int CatchingFishViewModelScope;
        int CatchingFishViewModelScope2 = this.CatchingFishNavigation.CatchingFishViewModelScope() - i;
        if (CatchingFishViewModelScope2 <= 0) {
            return 0;
        }
        int i2 = -CatchingFishGradleFirebase(-CatchingFishViewModelScope2, catchingFishSnackbarCameraX, catchingFishReduxGlide);
        int i3 = i + i2;
        if (!z || (CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope() - i3) <= 0) {
            return i2;
        }
        this.CatchingFishNavigation.CatchingFishAnimationMockk(CatchingFishViewModelScope);
        return CatchingFishViewModelScope + i2;
    }

    public final void CatchingFishIntent(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishLifecycleFAB catchingFishLifecycleFAB) {
        if (!catchingFishLifecycleFAB.CatchingFishParcelableFAB || catchingFishLifecycleFAB.CatchingFishEspressoTesting) {
            return;
        }
        int i = catchingFishLifecycleFAB.CatchingFishViewModelScope;
        int i2 = catchingFishLifecycleFAB.CatchingFishLayout;
        if (catchingFishLifecycleFAB.CatchingFishWorkManager == -1) {
            int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            if (i < 0) {
                return;
            }
            int CatchingFishWorkManager = (this.CatchingFishNavigation.CatchingFishWorkManager() - i) + i2;
            if (this.CatchingFishCoroutineFlow) {
                for (int i3 = 0; i3 < CatchingFishDaggerHiltFAB; i3++) {
                    View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i3);
                    if (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow) < CatchingFishWorkManager || this.CatchingFishNavigation.CatchingFishUnitTesting(CatchingFishCoroutineFlow) < CatchingFishWorkManager) {
                        CatchingFishKtorRealmView(catchingFishSnackbarCameraX, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = CatchingFishDaggerHiltFAB - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View CatchingFishCoroutineFlow2 = CatchingFishCoroutineFlow(i5);
                if (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow2) < CatchingFishWorkManager || this.CatchingFishNavigation.CatchingFishUnitTesting(CatchingFishCoroutineFlow2) < CatchingFishWorkManager) {
                    CatchingFishKtorRealmView(catchingFishSnackbarCameraX, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
        if (!this.CatchingFishCoroutineFlow) {
            for (int i7 = 0; i7 < CatchingFishDaggerHiltFAB2; i7++) {
                View CatchingFishCoroutineFlow3 = CatchingFishCoroutineFlow(i7);
                if (this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow3) > i6 || this.CatchingFishNavigation.CatchingFishOkHttp(CatchingFishCoroutineFlow3) > i6) {
                    CatchingFishKtorRealmView(catchingFishSnackbarCameraX, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = CatchingFishDaggerHiltFAB2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View CatchingFishCoroutineFlow4 = CatchingFishCoroutineFlow(i9);
            if (this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow4) > i6 || this.CatchingFishNavigation.CatchingFishOkHttp(CatchingFishCoroutineFlow4) > i6) {
                CatchingFishKtorRealmView(catchingFishSnackbarCameraX, i8, i9);
                return;
            }
        }
    }

    public final View CatchingFishJUnitIntent() {
        return CatchingFishCoroutineFlow(this.CatchingFishCoroutineFlow ? 0 : CatchingFishDaggerHiltFAB() - 1);
    }

    public final void CatchingFishJUnitLiveData(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("invalid orientation:", i));
        }
        CatchingFishCoroutine(null);
        if (i != this.CatchingFishStateLiveData || this.CatchingFishNavigation == null) {
            CatchingFishIntentJUnit CatchingFishParcelableFAB = CatchingFishIntentJUnit.CatchingFishParcelableFAB(this, i);
            this.CatchingFishNavigation = CatchingFishParcelableFAB;
            this.CatchingFishPayPal.CatchingFishParcelableFAB = CatchingFishParcelableFAB;
            this.CatchingFishStateLiveData = i;
            CatchingFishRetrofit();
        }
    }

    public void CatchingFishJUnitViewPager(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishLifecycleFAB catchingFishLifecycleFAB, CatchingFishReduxWidget catchingFishReduxWidget) {
        int i;
        int i2;
        int i3;
        int i4;
        View CatchingFishSnackbar = catchingFishLifecycleFAB.CatchingFishSnackbar(catchingFishSnackbarCameraX);
        if (CatchingFishSnackbar == null) {
            catchingFishReduxWidget.CatchingFishSnackbar = true;
            return;
        }
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) CatchingFishSnackbar.getLayoutParams();
        if (catchingFishLifecycleFAB.CatchingFishCloudMessaging == null) {
            if (this.CatchingFishCoroutineFlow == (catchingFishLifecycleFAB.CatchingFishWorkManager == -1)) {
                CatchingFishSnackbar(CatchingFishSnackbar, -1, false);
            } else {
                CatchingFishSnackbar(CatchingFishSnackbar, 0, false);
            }
        } else {
            if (this.CatchingFishCoroutineFlow == (catchingFishLifecycleFAB.CatchingFishWorkManager == -1)) {
                CatchingFishSnackbar(CatchingFishSnackbar, -1, true);
            } else {
                CatchingFishSnackbar(CatchingFishSnackbar, 0, true);
            }
        }
        CatchingFishGradleDagger catchingFishGradleDagger2 = (CatchingFishGradleDagger) CatchingFishSnackbar.getLayoutParams();
        Rect CatchingFishEspressoMockk = this.CatchingFishSnackbar.CatchingFishEspressoMockk(CatchingFishSnackbar);
        int i5 = CatchingFishEspressoMockk.left + CatchingFishEspressoMockk.right;
        int i6 = CatchingFishEspressoMockk.top + CatchingFishEspressoMockk.bottom;
        int CatchingFishSpannableWidget = CatchingFishKtorDataStore.CatchingFishSpannableWidget(CatchingFishReduxKtor(), this.CatchingFishUnitTesting, this.CatchingFishEspressoTesting, CatchingFishMutableLiveData() + CatchingFishFragmentFactory() + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).width);
        int CatchingFishSpannableWidget2 = CatchingFishKtorDataStore.CatchingFishSpannableWidget(CatchingFishDaggerWebsocket(), this.CatchingFishAnimationMockk, this.CatchingFishOkHttp, CatchingFishCustomView() + CatchingFishJobScheduler() + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).height);
        if (CatchingFishWebSocketMockk(CatchingFishSnackbar, CatchingFishSpannableWidget, CatchingFishSpannableWidget2, catchingFishGradleDagger2)) {
            CatchingFishSnackbar.measure(CatchingFishSpannableWidget, CatchingFishSpannableWidget2);
        }
        catchingFishReduxWidget.CatchingFishParcelableFAB = this.CatchingFishNavigation.CatchingFishCoroutine(CatchingFishSnackbar);
        if (this.CatchingFishStateLiveData == 1) {
            if (CatchingFishGradle()) {
                i4 = this.CatchingFishUnitTesting - CatchingFishMutableLiveData();
                i = i4 - this.CatchingFishNavigation.CatchingFishReduxKtor(CatchingFishSnackbar);
            } else {
                i = CatchingFishFragmentFactory();
                i4 = this.CatchingFishNavigation.CatchingFishReduxKtor(CatchingFishSnackbar) + i;
            }
            if (catchingFishLifecycleFAB.CatchingFishWorkManager == -1) {
                i2 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                i3 = i2 - catchingFishReduxWidget.CatchingFishParcelableFAB;
            } else {
                i3 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                i2 = catchingFishReduxWidget.CatchingFishParcelableFAB + i3;
            }
        } else {
            int CatchingFishJobScheduler = CatchingFishJobScheduler();
            int CatchingFishReduxKtor = this.CatchingFishNavigation.CatchingFishReduxKtor(CatchingFishSnackbar) + CatchingFishJobScheduler;
            if (catchingFishLifecycleFAB.CatchingFishWorkManager == -1) {
                int i7 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                int i8 = i7 - catchingFishReduxWidget.CatchingFishParcelableFAB;
                i4 = i7;
                i2 = CatchingFishReduxKtor;
                i = i8;
                i3 = CatchingFishJobScheduler;
            } else {
                int i9 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                int i10 = catchingFishReduxWidget.CatchingFishParcelableFAB + i9;
                i = i9;
                i2 = CatchingFishReduxKtor;
                i3 = CatchingFishJobScheduler;
                i4 = i10;
            }
        }
        CatchingFishKtorDataStore.CatchingFishPayPalLiveData(CatchingFishSnackbar, i, i3, i4, i2);
        if (catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishViewModelFAB() || catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishCloudMessaging()) {
            catchingFishReduxWidget.CatchingFishCoroutine = true;
        }
        catchingFishReduxWidget.CatchingFishReduxKtor = CatchingFishSnackbar.hasFocusable();
    }

    public final int CatchingFishKtor(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        CatchingFishGlideMVP();
        CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishNavigation;
        boolean z = !this.CatchingFishSpannableWidget;
        return CatchingFishHiltMVPToast.CatchingFishViewModelFAB(catchingFishReduxGlide, catchingFishIntentJUnit, CatchingFishExoPlayer(z), CatchingFishToolbar(z), this, this.CatchingFishSpannableWidget);
    }

    public final void CatchingFishKtorRealmView(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i);
                CatchingFishRetrofitMVI(i);
                catchingFishSnackbarCameraX.CatchingFishViewModelScope(CatchingFishCoroutineFlow);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View CatchingFishCoroutineFlow2 = CatchingFishCoroutineFlow(i3);
            CatchingFishRetrofitMVI(i3);
            catchingFishSnackbarCameraX.CatchingFishViewModelScope(CatchingFishCoroutineFlow2);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishLayout(int i, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        boolean z;
        int i2;
        CatchingFishRealmRetrofit catchingFishRealmRetrofit = this.CatchingFishCardViewRealm;
        if (catchingFishRealmRetrofit == null || (i2 = catchingFishRealmRetrofit.CatchingFishReduxKtor) < 0) {
            CatchingFishFragment();
            z = this.CatchingFishCoroutineFlow;
            i2 = this.CatchingFishParcelableFlux;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = catchingFishRealmRetrofit.CatchingFishWorkManager;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.CatchingFishMVPRobolectric && i2 >= 0 && i2 < i; i4++) {
            catchingFishWidgetFAB.CatchingFishParcelableFAB(i2, 0);
            i2 += i3;
        }
    }

    public void CatchingFishLifecycle(CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishLifecycleFAB catchingFishLifecycleFAB, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        int i = catchingFishLifecycleFAB.CatchingFishReduxKtor;
        if (i < 0 || i >= catchingFishReduxGlide.CatchingFishSnackbar()) {
            return;
        }
        catchingFishWidgetFAB.CatchingFishParcelableFAB(i, Math.max(0, catchingFishLifecycleFAB.CatchingFishViewModelScope));
    }

    public final View CatchingFishLifecycleHilt(int i, int i2, boolean z) {
        CatchingFishGlideMVP();
        int i3 = z ? 24579 : 320;
        return this.CatchingFishStateLiveData == 0 ? this.CatchingFishCoroutine.CatchingFishLayout(i, i2, i3, 320) : this.CatchingFishReduxKtor.CatchingFishLayout(i, i2, i3, 320);
    }

    public final int CatchingFishLiveDataRoom(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.CatchingFishStateLiveData == 1) ? 1 : Integer.MIN_VALUE : this.CatchingFishStateLiveData == 0 ? 1 : Integer.MIN_VALUE : this.CatchingFishStateLiveData == 1 ? -1 : Integer.MIN_VALUE : this.CatchingFishStateLiveData == 0 ? -1 : Integer.MIN_VALUE : (this.CatchingFishStateLiveData != 1 && CatchingFishGradle()) ? -1 : 1 : (this.CatchingFishStateLiveData != 1 && CatchingFishGradle()) ? 1 : -1;
    }

    public final int CatchingFishMVPHandler(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        CatchingFishGlideMVP();
        CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishNavigation;
        boolean z = !this.CatchingFishSpannableWidget;
        return CatchingFishHiltMVPToast.CatchingFishLayout(catchingFishReduxGlide, catchingFishIntentJUnit, CatchingFishExoPlayer(z), CatchingFishToolbar(z), this, this.CatchingFishSpannableWidget, this.CatchingFishCoroutineFlow);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishMVPReduxContext() {
        if (this.CatchingFishOkHttp != 1073741824 && this.CatchingFishEspressoTesting != 1073741824) {
            int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            for (int i = 0; i < CatchingFishDaggerHiltFAB; i++) {
                ViewGroup.LayoutParams layoutParams = CatchingFishCoroutineFlow(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void CatchingFishManifest(int i, int i2, boolean z, CatchingFishReduxGlide catchingFishReduxGlide) {
        int CatchingFishCloudMessaging;
        this.CatchingFishRoomDatabase.CatchingFishEspressoTesting = this.CatchingFishNavigation.CatchingFishLayout() == 0 && this.CatchingFishNavigation.CatchingFishWorkManager() == 0;
        this.CatchingFishRoomDatabase.CatchingFishWorkManager = i;
        int[] iArr = this.CatchingFishCustomView;
        iArr[0] = 0;
        iArr[1] = 0;
        CatchingFishCameraX(catchingFishReduxGlide, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        CatchingFishLifecycleFAB catchingFishLifecycleFAB = this.CatchingFishRoomDatabase;
        int i3 = z2 ? max2 : max;
        catchingFishLifecycleFAB.CatchingFishViewModelFAB = i3;
        if (!z2) {
            max = max2;
        }
        catchingFishLifecycleFAB.CatchingFishLayout = max;
        if (z2) {
            catchingFishLifecycleFAB.CatchingFishViewModelFAB = this.CatchingFishNavigation.CatchingFishViewModelFAB() + i3;
            View CatchingFishJUnitIntent = CatchingFishJUnitIntent();
            CatchingFishLifecycleFAB catchingFishLifecycleFAB2 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB2.CatchingFishDaggerWebsocket = this.CatchingFishCoroutineFlow ? -1 : 1;
            int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishJUnitIntent);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB3 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB2.CatchingFishReduxKtor = CatchingFishPayPalService + catchingFishLifecycleFAB3.CatchingFishDaggerWebsocket;
            catchingFishLifecycleFAB3.CatchingFishSnackbar = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishJUnitIntent);
            CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishJUnitIntent) - this.CatchingFishNavigation.CatchingFishViewModelScope();
        } else {
            View CatchingFishRetrofitCameraX = CatchingFishRetrofitCameraX();
            CatchingFishLifecycleFAB catchingFishLifecycleFAB4 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB4.CatchingFishViewModelFAB = this.CatchingFishNavigation.CatchingFishCloudMessaging() + catchingFishLifecycleFAB4.CatchingFishViewModelFAB;
            CatchingFishLifecycleFAB catchingFishLifecycleFAB5 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB5.CatchingFishDaggerWebsocket = this.CatchingFishCoroutineFlow ? 1 : -1;
            int CatchingFishPayPalService2 = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishRetrofitCameraX);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB6 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB5.CatchingFishReduxKtor = CatchingFishPayPalService2 + catchingFishLifecycleFAB6.CatchingFishDaggerWebsocket;
            catchingFishLifecycleFAB6.CatchingFishSnackbar = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRetrofitCameraX);
            CatchingFishCloudMessaging = (-this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRetrofitCameraX)) + this.CatchingFishNavigation.CatchingFishCloudMessaging();
        }
        CatchingFishLifecycleFAB catchingFishLifecycleFAB7 = this.CatchingFishRoomDatabase;
        catchingFishLifecycleFAB7.CatchingFishCoroutine = i2;
        if (z) {
            catchingFishLifecycleFAB7.CatchingFishCoroutine = i2 - CatchingFishCloudMessaging;
        }
        catchingFishLifecycleFAB7.CatchingFishViewModelScope = CatchingFishCloudMessaging;
    }

    public final int CatchingFishMaterialDesign() {
        View CatchingFishLifecycleHilt = CatchingFishLifecycleHilt(CatchingFishDaggerHiltFAB() - 1, -1, false);
        if (CatchingFishLifecycleHilt == null) {
            return -1;
        }
        return CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishLifecycleHilt);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public CatchingFishGradleDagger CatchingFishNavigation() {
        return new CatchingFishGradleDagger(-2, -2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public void CatchingFishNavigationGson(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        View view;
        View view2;
        View CatchingFishStripeAPIWidget;
        int i;
        int CatchingFishDaggerWebsocket;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int CatchingFishHiltBundle;
        int i6;
        View CatchingFishRoomDatabase;
        int CatchingFishDaggerWebsocket2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.CatchingFishCardViewRealm == null && this.CatchingFishParcelableFlux == -1) && catchingFishReduxGlide.CatchingFishSnackbar() == 0) {
            CatchingFishReduxMoshi(catchingFishSnackbarCameraX);
            return;
        }
        CatchingFishRealmRetrofit catchingFishRealmRetrofit = this.CatchingFishCardViewRealm;
        if (catchingFishRealmRetrofit != null && (i8 = catchingFishRealmRetrofit.CatchingFishReduxKtor) >= 0) {
            this.CatchingFishParcelableFlux = i8;
        }
        CatchingFishGlideMVP();
        this.CatchingFishRoomDatabase.CatchingFishParcelableFAB = false;
        CatchingFishFragment();
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.CatchingFishParcelableFAB.CatchingFishViewModelScope).contains(view)) {
            view = null;
        }
        CatchingFishAdMobToolbar catchingFishAdMobToolbar = this.CatchingFishPayPal;
        if (!catchingFishAdMobToolbar.CatchingFishDaggerWebsocket || this.CatchingFishParcelableFlux != -1 || this.CatchingFishCardViewRealm != null) {
            catchingFishAdMobToolbar.CatchingFishReduxKtor();
            catchingFishAdMobToolbar.CatchingFishReduxKtor = this.CatchingFishCoroutineFlow ^ this.CatchingFishDaggerHiltFAB;
            if (!catchingFishReduxGlide.CatchingFishViewModelScope && (i = this.CatchingFishParcelableFlux) != -1) {
                if (i < 0 || i >= catchingFishReduxGlide.CatchingFishSnackbar()) {
                    this.CatchingFishParcelableFlux = -1;
                    this.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
                } else {
                    int i10 = this.CatchingFishParcelableFlux;
                    catchingFishAdMobToolbar.CatchingFishSnackbar = i10;
                    CatchingFishRealmRetrofit catchingFishRealmRetrofit2 = this.CatchingFishCardViewRealm;
                    if (catchingFishRealmRetrofit2 != null && catchingFishRealmRetrofit2.CatchingFishReduxKtor >= 0) {
                        boolean z = catchingFishRealmRetrofit2.CatchingFishWorkManager;
                        catchingFishAdMobToolbar.CatchingFishReduxKtor = z;
                        if (z) {
                            catchingFishAdMobToolbar.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishCardViewRealm.CatchingFishDaggerWebsocket;
                        } else {
                            catchingFishAdMobToolbar.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishCloudMessaging() + this.CatchingFishCardViewRealm.CatchingFishDaggerWebsocket;
                        }
                    } else if (this.CatchingFishGsonAppCompat == Integer.MIN_VALUE) {
                        View CatchingFishRoomDatabase2 = CatchingFishRoomDatabase(i10);
                        if (CatchingFishRoomDatabase2 == null) {
                            if (CatchingFishDaggerHiltFAB() > 0) {
                                catchingFishAdMobToolbar.CatchingFishReduxKtor = (this.CatchingFishParcelableFlux < CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0))) == this.CatchingFishCoroutineFlow;
                            }
                            catchingFishAdMobToolbar.CatchingFishParcelableFAB();
                        } else if (this.CatchingFishNavigation.CatchingFishCoroutine(CatchingFishRoomDatabase2) > this.CatchingFishNavigation.CatchingFishEspressoTesting()) {
                            catchingFishAdMobToolbar.CatchingFishParcelableFAB();
                        } else if (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRoomDatabase2) - this.CatchingFishNavigation.CatchingFishCloudMessaging() < 0) {
                            catchingFishAdMobToolbar.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishCloudMessaging();
                            catchingFishAdMobToolbar.CatchingFishReduxKtor = false;
                        } else if (this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishRoomDatabase2) < 0) {
                            catchingFishAdMobToolbar.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishViewModelScope();
                            catchingFishAdMobToolbar.CatchingFishReduxKtor = true;
                        } else {
                            if (catchingFishAdMobToolbar.CatchingFishReduxKtor) {
                                int CatchingFishSnackbar = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishRoomDatabase2);
                                CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishNavigation;
                                CatchingFishDaggerWebsocket = (Integer.MIN_VALUE == catchingFishIntentJUnit.CatchingFishParcelableFAB ? 0 : catchingFishIntentJUnit.CatchingFishEspressoTesting() - catchingFishIntentJUnit.CatchingFishParcelableFAB) + CatchingFishSnackbar;
                            } else {
                                CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRoomDatabase2);
                            }
                            catchingFishAdMobToolbar.CatchingFishCoroutine = CatchingFishDaggerWebsocket;
                        }
                    } else {
                        boolean z2 = this.CatchingFishCoroutineFlow;
                        catchingFishAdMobToolbar.CatchingFishReduxKtor = z2;
                        if (z2) {
                            catchingFishAdMobToolbar.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishGsonAppCompat;
                        } else {
                            catchingFishAdMobToolbar.CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishCloudMessaging() + this.CatchingFishGsonAppCompat;
                        }
                    }
                    catchingFishAdMobToolbar.CatchingFishDaggerWebsocket = true;
                }
            }
            if (CatchingFishDaggerHiltFAB() != 0) {
                RecyclerView recyclerView2 = this.CatchingFishSnackbar;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.CatchingFishParcelableFAB.CatchingFishViewModelScope).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view2.getLayoutParams();
                    if (!catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishViewModelFAB() && catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishSnackbar() >= 0 && catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishSnackbar() < catchingFishReduxGlide.CatchingFishSnackbar()) {
                        catchingFishAdMobToolbar.CatchingFishCoroutine(view2, CatchingFishKtorDataStore.CatchingFishPayPalService(view2));
                        catchingFishAdMobToolbar.CatchingFishDaggerWebsocket = true;
                    }
                }
                boolean z3 = this.CatchingFish;
                boolean z4 = this.CatchingFishDaggerHiltFAB;
                if (z3 == z4 && (CatchingFishStripeAPIWidget = CatchingFishStripeAPIWidget(catchingFishSnackbarCameraX, catchingFishReduxGlide, catchingFishAdMobToolbar.CatchingFishReduxKtor, z4)) != null) {
                    catchingFishAdMobToolbar.CatchingFishSnackbar(CatchingFishStripeAPIWidget, CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishStripeAPIWidget));
                    if (!catchingFishReduxGlide.CatchingFishViewModelScope && CatchingFishSharedFlow()) {
                        int CatchingFishDaggerWebsocket3 = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishStripeAPIWidget);
                        int CatchingFishSnackbar2 = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishStripeAPIWidget);
                        int CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishCloudMessaging();
                        int CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope();
                        boolean z5 = CatchingFishSnackbar2 <= CatchingFishCloudMessaging && CatchingFishDaggerWebsocket3 < CatchingFishCloudMessaging;
                        boolean z6 = CatchingFishDaggerWebsocket3 >= CatchingFishViewModelScope && CatchingFishSnackbar2 > CatchingFishViewModelScope;
                        if (z5 || z6) {
                            if (catchingFishAdMobToolbar.CatchingFishReduxKtor) {
                                CatchingFishCloudMessaging = CatchingFishViewModelScope;
                            }
                            catchingFishAdMobToolbar.CatchingFishCoroutine = CatchingFishCloudMessaging;
                        }
                    }
                    catchingFishAdMobToolbar.CatchingFishDaggerWebsocket = true;
                }
            }
            catchingFishAdMobToolbar.CatchingFishParcelableFAB();
            catchingFishAdMobToolbar.CatchingFishSnackbar = this.CatchingFishDaggerHiltFAB ? catchingFishReduxGlide.CatchingFishSnackbar() - 1 : 0;
            catchingFishAdMobToolbar.CatchingFishDaggerWebsocket = true;
        } else if (view != null && (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(view) >= this.CatchingFishNavigation.CatchingFishViewModelScope() || this.CatchingFishNavigation.CatchingFishSnackbar(view) <= this.CatchingFishNavigation.CatchingFishCloudMessaging())) {
            catchingFishAdMobToolbar.CatchingFishCoroutine(view, CatchingFishKtorDataStore.CatchingFishPayPalService(view));
        }
        CatchingFishLifecycleFAB catchingFishLifecycleFAB = this.CatchingFishRoomDatabase;
        catchingFishLifecycleFAB.CatchingFishWorkManager = catchingFishLifecycleFAB.CatchingFishFragmentHandler >= 0 ? 1 : -1;
        int[] iArr = this.CatchingFishCustomView;
        iArr[0] = 0;
        iArr[1] = 0;
        CatchingFishCameraX(catchingFishReduxGlide, iArr);
        int CatchingFishCloudMessaging2 = this.CatchingFishNavigation.CatchingFishCloudMessaging() + Math.max(0, iArr[0]);
        int CatchingFishViewModelFAB = this.CatchingFishNavigation.CatchingFishViewModelFAB() + Math.max(0, iArr[1]);
        if (catchingFishReduxGlide.CatchingFishViewModelScope && (i6 = this.CatchingFishParcelableFlux) != -1 && this.CatchingFishGsonAppCompat != Integer.MIN_VALUE && (CatchingFishRoomDatabase = CatchingFishRoomDatabase(i6)) != null) {
            if (this.CatchingFishCoroutineFlow) {
                i7 = this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishRoomDatabase);
                CatchingFishDaggerWebsocket2 = this.CatchingFishGsonAppCompat;
            } else {
                CatchingFishDaggerWebsocket2 = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRoomDatabase) - this.CatchingFishNavigation.CatchingFishCloudMessaging();
                i7 = this.CatchingFishGsonAppCompat;
            }
            int i11 = i7 - CatchingFishDaggerWebsocket2;
            if (i11 > 0) {
                CatchingFishCloudMessaging2 += i11;
            } else {
                CatchingFishViewModelFAB -= i11;
            }
        }
        if (!catchingFishAdMobToolbar.CatchingFishReduxKtor ? !this.CatchingFishCoroutineFlow : this.CatchingFishCoroutineFlow) {
            i9 = 1;
        }
        CatchingFishToolbarEspresso(catchingFishSnackbarCameraX, catchingFishReduxGlide, catchingFishAdMobToolbar, i9);
        CatchingFishStateLiveData(catchingFishSnackbarCameraX);
        this.CatchingFishRoomDatabase.CatchingFishEspressoTesting = this.CatchingFishNavigation.CatchingFishLayout() == 0 && this.CatchingFishNavigation.CatchingFishWorkManager() == 0;
        this.CatchingFishRoomDatabase.getClass();
        this.CatchingFishRoomDatabase.CatchingFishLayout = 0;
        if (catchingFishAdMobToolbar.CatchingFishReduxKtor) {
            CatchingFishServiceRetrofit(catchingFishAdMobToolbar.CatchingFishSnackbar, catchingFishAdMobToolbar.CatchingFishCoroutine);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB2 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB2.CatchingFishViewModelFAB = CatchingFishCloudMessaging2;
            CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB2, catchingFishReduxGlide, false);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB3 = this.CatchingFishRoomDatabase;
            i3 = catchingFishLifecycleFAB3.CatchingFishSnackbar;
            int i12 = catchingFishLifecycleFAB3.CatchingFishReduxKtor;
            int i13 = catchingFishLifecycleFAB3.CatchingFishCoroutine;
            if (i13 > 0) {
                CatchingFishViewModelFAB += i13;
            }
            CatchingFishGlide(catchingFishAdMobToolbar.CatchingFishSnackbar, catchingFishAdMobToolbar.CatchingFishCoroutine);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB4 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB4.CatchingFishViewModelFAB = CatchingFishViewModelFAB;
            catchingFishLifecycleFAB4.CatchingFishReduxKtor += catchingFishLifecycleFAB4.CatchingFishDaggerWebsocket;
            CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB4, catchingFishReduxGlide, false);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB5 = this.CatchingFishRoomDatabase;
            i2 = catchingFishLifecycleFAB5.CatchingFishSnackbar;
            int i14 = catchingFishLifecycleFAB5.CatchingFishCoroutine;
            if (i14 > 0) {
                CatchingFishServiceRetrofit(i12, i3);
                CatchingFishLifecycleFAB catchingFishLifecycleFAB6 = this.CatchingFishRoomDatabase;
                catchingFishLifecycleFAB6.CatchingFishViewModelFAB = i14;
                CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB6, catchingFishReduxGlide, false);
                i3 = this.CatchingFishRoomDatabase.CatchingFishSnackbar;
            }
        } else {
            CatchingFishGlide(catchingFishAdMobToolbar.CatchingFishSnackbar, catchingFishAdMobToolbar.CatchingFishCoroutine);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB7 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB7.CatchingFishViewModelFAB = CatchingFishViewModelFAB;
            CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB7, catchingFishReduxGlide, false);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB8 = this.CatchingFishRoomDatabase;
            i2 = catchingFishLifecycleFAB8.CatchingFishSnackbar;
            int i15 = catchingFishLifecycleFAB8.CatchingFishReduxKtor;
            int i16 = catchingFishLifecycleFAB8.CatchingFishCoroutine;
            if (i16 > 0) {
                CatchingFishCloudMessaging2 += i16;
            }
            CatchingFishServiceRetrofit(catchingFishAdMobToolbar.CatchingFishSnackbar, catchingFishAdMobToolbar.CatchingFishCoroutine);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB9 = this.CatchingFishRoomDatabase;
            catchingFishLifecycleFAB9.CatchingFishViewModelFAB = CatchingFishCloudMessaging2;
            catchingFishLifecycleFAB9.CatchingFishReduxKtor += catchingFishLifecycleFAB9.CatchingFishDaggerWebsocket;
            CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB9, catchingFishReduxGlide, false);
            CatchingFishLifecycleFAB catchingFishLifecycleFAB10 = this.CatchingFishRoomDatabase;
            int i17 = catchingFishLifecycleFAB10.CatchingFishSnackbar;
            int i18 = catchingFishLifecycleFAB10.CatchingFishCoroutine;
            if (i18 > 0) {
                CatchingFishGlide(i15, i2);
                CatchingFishLifecycleFAB catchingFishLifecycleFAB11 = this.CatchingFishRoomDatabase;
                catchingFishLifecycleFAB11.CatchingFishViewModelFAB = i18;
                CatchingFishContextToast(catchingFishSnackbarCameraX, catchingFishLifecycleFAB11, catchingFishReduxGlide, false);
                i2 = this.CatchingFishRoomDatabase.CatchingFishSnackbar;
            }
            i3 = i17;
        }
        if (CatchingFishDaggerHiltFAB() > 0) {
            if (this.CatchingFishCoroutineFlow ^ this.CatchingFishDaggerHiltFAB) {
                int CatchingFishHiltBundle2 = CatchingFishHiltBundle(i2, catchingFishSnackbarCameraX, catchingFishReduxGlide, true);
                i4 = i3 + CatchingFishHiltBundle2;
                i5 = i2 + CatchingFishHiltBundle2;
                CatchingFishHiltBundle = CatchingFishWebsocket(i4, catchingFishSnackbarCameraX, catchingFishReduxGlide, false);
            } else {
                int CatchingFishWebsocket = CatchingFishWebsocket(i3, catchingFishSnackbarCameraX, catchingFishReduxGlide, true);
                i4 = i3 + CatchingFishWebsocket;
                i5 = i2 + CatchingFishWebsocket;
                CatchingFishHiltBundle = CatchingFishHiltBundle(i5, catchingFishSnackbarCameraX, catchingFishReduxGlide, false);
            }
            i3 = i4 + CatchingFishHiltBundle;
            i2 = i5 + CatchingFishHiltBundle;
        }
        if (catchingFishReduxGlide.CatchingFishCloudMessaging && CatchingFishDaggerHiltFAB() != 0 && !catchingFishReduxGlide.CatchingFishViewModelScope && CatchingFishSharedFlow()) {
            List list2 = catchingFishSnackbarCameraX.CatchingFishReduxKtor;
            int size = list2.size();
            int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) list2.get(i21);
                boolean CatchingFishViewModelFAB2 = catchingFishPayPalCardView.CatchingFishViewModelFAB();
                View view3 = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                if (!CatchingFishViewModelFAB2) {
                    if ((catchingFishPayPalCardView.CatchingFishSnackbar() < CatchingFishPayPalService) != this.CatchingFishCoroutineFlow) {
                        i19 += this.CatchingFishNavigation.CatchingFishCoroutine(view3);
                    } else {
                        i20 += this.CatchingFishNavigation.CatchingFishCoroutine(view3);
                    }
                }
            }
            this.CatchingFishRoomDatabase.CatchingFishCloudMessaging = list2;
            if (i19 > 0) {
                CatchingFishServiceRetrofit(CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishRetrofitCameraX()), i3);
                CatchingFishLifecycleFAB catchingFishLifecycleFAB12 = this.CatchingFishRoomDatabase;
                catchingFishLifecycleFAB12.CatchingFishViewModelFAB = i19;
                catchingFishLifecycleFAB12.CatchingFishCoroutine = 0;
                catchingFishLifecycleFAB12.CatchingFishParcelableFAB(null);
                CatchingFishContextToast(catchingFishSnackbarCameraX, this.CatchingFishRoomDatabase, catchingFishReduxGlide, false);
            }
            if (i20 > 0) {
                CatchingFishGlide(CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishJUnitIntent()), i2);
                CatchingFishLifecycleFAB catchingFishLifecycleFAB13 = this.CatchingFishRoomDatabase;
                catchingFishLifecycleFAB13.CatchingFishViewModelFAB = i20;
                catchingFishLifecycleFAB13.CatchingFishCoroutine = 0;
                list = null;
                catchingFishLifecycleFAB13.CatchingFishParcelableFAB(null);
                CatchingFishContextToast(catchingFishSnackbarCameraX, this.CatchingFishRoomDatabase, catchingFishReduxGlide, false);
            } else {
                list = null;
            }
            this.CatchingFishRoomDatabase.CatchingFishCloudMessaging = list;
        }
        if (catchingFishReduxGlide.CatchingFishViewModelScope) {
            catchingFishAdMobToolbar.CatchingFishReduxKtor();
        } else {
            CatchingFishIntentJUnit catchingFishIntentJUnit2 = this.CatchingFishNavigation;
            catchingFishIntentJUnit2.CatchingFishParcelableFAB = catchingFishIntentJUnit2.CatchingFishEspressoTesting();
        }
        this.CatchingFish = this.CatchingFishDaggerHiltFAB;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishOkHttp(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishKtor(catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishWidgetMVIGradle
    public final PointF CatchingFishParcelableFAB(int i) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return null;
        }
        int i2 = (i < CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0))) != this.CatchingFishCoroutineFlow ? -1 : 1;
        return this.CatchingFishStateLiveData == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public void CatchingFishRedux(CatchingFishReduxGlide catchingFishReduxGlide) {
        this.CatchingFishCardViewRealm = null;
        this.CatchingFishParcelableFlux = -1;
        this.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        this.CatchingFishPayPal.CatchingFishReduxKtor();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishReduxKtor() {
        return this.CatchingFishStateLiveData == 0;
    }

    public final View CatchingFishRetrofitCameraX() {
        return CatchingFishCoroutineFlow(this.CatchingFishCoroutineFlow ? CatchingFishDaggerHiltFAB() - 1 : 0);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final View CatchingFishRoomDatabase(int i) {
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        if (CatchingFishDaggerHiltFAB == 0) {
            return null;
        }
        int CatchingFishPayPalService = i - CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0));
        if (CatchingFishPayPalService >= 0 && CatchingFishPayPalService < CatchingFishDaggerHiltFAB) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(CatchingFishPayPalService);
            if (CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow) == i) {
                return CatchingFishCoroutineFlow;
            }
        }
        return super.CatchingFishRoomDatabase(i);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishServiceMVIJUnit(int i) {
        this.CatchingFishParcelableFlux = i;
        this.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        CatchingFishRealmRetrofit catchingFishRealmRetrofit = this.CatchingFishCardViewRealm;
        if (catchingFishRealmRetrofit != null) {
            catchingFishRealmRetrofit.CatchingFishReduxKtor = -1;
        }
        CatchingFishRetrofit();
    }

    public final void CatchingFishServiceRetrofit(int i, int i2) {
        this.CatchingFishRoomDatabase.CatchingFishCoroutine = i2 - this.CatchingFishNavigation.CatchingFishCloudMessaging();
        CatchingFishLifecycleFAB catchingFishLifecycleFAB = this.CatchingFishRoomDatabase;
        catchingFishLifecycleFAB.CatchingFishReduxKtor = i;
        catchingFishLifecycleFAB.CatchingFishDaggerWebsocket = this.CatchingFishCoroutineFlow ? 1 : -1;
        catchingFishLifecycleFAB.CatchingFishWorkManager = -1;
        catchingFishLifecycleFAB.CatchingFishSnackbar = i2;
        catchingFishLifecycleFAB.CatchingFishViewModelScope = Integer.MIN_VALUE;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public boolean CatchingFishSharedFlow() {
        return this.CatchingFishCardViewRealm == null && this.CatchingFish == this.CatchingFishDaggerHiltFAB;
    }

    public View CatchingFishStripeAPIWidget(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        CatchingFishGlideMVP();
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        if (z2) {
            i2 = CatchingFishDaggerHiltFAB() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = CatchingFishDaggerHiltFAB;
            i2 = 0;
            i3 = 1;
        }
        int CatchingFishSnackbar = catchingFishReduxGlide.CatchingFishSnackbar();
        int CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishCloudMessaging();
        int CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i2);
            int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow);
            int CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow);
            int CatchingFishSnackbar2 = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow);
            if (CatchingFishPayPalService >= 0 && CatchingFishPayPalService < CatchingFishSnackbar) {
                if (!((CatchingFishGradleDagger) CatchingFishCoroutineFlow.getLayoutParams()).CatchingFishParcelableFAB.CatchingFishViewModelFAB()) {
                    boolean z3 = CatchingFishSnackbar2 <= CatchingFishCloudMessaging && CatchingFishDaggerWebsocket < CatchingFishCloudMessaging;
                    boolean z4 = CatchingFishDaggerWebsocket >= CatchingFishViewModelScope && CatchingFishSnackbar2 > CatchingFishViewModelScope;
                    if (!z3 && !z4) {
                        return CatchingFishCoroutineFlow;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = CatchingFishCoroutineFlow;
                        }
                        view2 = CatchingFishCoroutineFlow;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = CatchingFishCoroutineFlow;
                        }
                        view2 = CatchingFishCoroutineFlow;
                    }
                } else if (view3 == null) {
                    view3 = CatchingFishCoroutineFlow;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final View CatchingFishToolbar(boolean z) {
        return this.CatchingFishCoroutineFlow ? CatchingFishLifecycleHilt(0, CatchingFishDaggerHiltFAB(), z) : CatchingFishLifecycleHilt(CatchingFishDaggerHiltFAB() - 1, -1, z);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public int CatchingFishUnitTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishMVPHandler(catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public int CatchingFishView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (this.CatchingFishStateLiveData == 1) {
            return 0;
        }
        return CatchingFishGradleFirebase(i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishViewModelFAB(int i, int i2, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        if (this.CatchingFishStateLiveData != 0) {
            i = i2;
        }
        if (CatchingFishDaggerHiltFAB() == 0 || i == 0) {
            return;
        }
        CatchingFishGlideMVP();
        CatchingFishManifest(i > 0 ? 1 : -1, Math.abs(i), true, catchingFishReduxGlide);
        CatchingFishLifecycle(catchingFishReduxGlide, this.CatchingFishRoomDatabase, catchingFishWidgetFAB);
    }

    public final int CatchingFishWebsocket(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z) {
        int CatchingFishCloudMessaging;
        int CatchingFishCloudMessaging2 = i - this.CatchingFishNavigation.CatchingFishCloudMessaging();
        if (CatchingFishCloudMessaging2 <= 0) {
            return 0;
        }
        int i2 = -CatchingFishGradleFirebase(CatchingFishCloudMessaging2, catchingFishSnackbarCameraX, catchingFishReduxGlide);
        int i3 = i + i2;
        if (!z || (CatchingFishCloudMessaging = i3 - this.CatchingFishNavigation.CatchingFishCloudMessaging()) <= 0) {
            return i2;
        }
        this.CatchingFishNavigation.CatchingFishAnimationMockk(-CatchingFishCloudMessaging);
        return i2 - CatchingFishCloudMessaging;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.CatchingFishStateLiveData = 1;
        this.CatchingFishJetpackCompose = false;
        this.CatchingFishCoroutineFlow = false;
        this.CatchingFishDaggerHiltFAB = false;
        this.CatchingFishSpannableWidget = true;
        this.CatchingFishParcelableFlux = -1;
        this.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        this.CatchingFishCardViewRealm = null;
        this.CatchingFishPayPal = new CatchingFishAdMobToolbar();
        this.CatchingFishCardViewView = new CatchingFishReduxWidget();
        this.CatchingFishMVPRobolectric = 2;
        this.CatchingFishCustomView = new int[2];
        CatchingFishAdMobEspresso CatchingFishSensorManager = CatchingFishKtorDataStore.CatchingFishSensorManager(context, attributeSet, i, i2);
        CatchingFishJUnitLiveData(CatchingFishSensorManager.CatchingFishParcelableFAB);
        boolean z = CatchingFishSensorManager.CatchingFishCoroutine;
        CatchingFishCoroutine(null);
        if (z != this.CatchingFishJetpackCompose) {
            this.CatchingFishJetpackCompose = z;
            CatchingFishRetrofit();
        }
        CatchingFishAccessibility(CatchingFishSensorManager.CatchingFishReduxKtor);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishRecyclerView(RecyclerView recyclerView) {
    }

    public void CatchingFishToolbarEspresso(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishAdMobToolbar catchingFishAdMobToolbar, int i) {
    }
}
