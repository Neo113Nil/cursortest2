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
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAdMobEspresso;
import kotlin.text.CatchingFishAppCompatRealm;
import kotlin.text.CatchingFishBiometricPayPal;
import kotlin.text.CatchingFishDataStoreKtor;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFABRobolectric;
import kotlin.text.CatchingFishGradleDagger;
import kotlin.text.CatchingFishGsonIntent;
import kotlin.text.CatchingFishGsonRealm;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishIntentJUnit;
import kotlin.text.CatchingFishKtorDataStore;
import kotlin.text.CatchingFishMVVMAdMob;
import kotlin.text.CatchingFishMockkHiltRealm;
import kotlin.text.CatchingFishReduxGlide;
import kotlin.text.CatchingFishSnackbarCameraX;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishWidgetFAB;
import kotlin.text.CatchingFishWidgetMVIGradle;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends CatchingFishKtorDataStore implements CatchingFishWidgetMVIGradle {
    public final CatchingFishIntentJUnit CatchingFish;
    public final CatchingFishViewModelIntent CatchingFishCardViewView;
    public int CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public final CatchingFishGsonRealm CatchingFishDagger;
    public final CatchingFishAppCompatRealm CatchingFishDaggerHiltFAB;
    public int[] CatchingFishEspressoMockk;
    public boolean CatchingFishFragmentFactory;
    public final BitSet CatchingFishGsonAppCompat;
    public final int CatchingFishJetpackCompose;
    public final Rect CatchingFishJobScheduler;
    public final int CatchingFishMVPRobolectric;
    public CatchingFishBiometricPayPal CatchingFishMutableLiveData;
    public final CatchingFishIntentJUnit CatchingFishNavigation;
    public final CatchingFishMockkHiltRealm CatchingFishPayPalService;
    public final CatchingFishGsonIntent[] CatchingFishRoomDatabase;
    public final boolean CatchingFishSensorManager;
    public boolean CatchingFishSpannableWidget;
    public final int CatchingFishStateLiveData;
    public boolean CatchingFishParcelableFlux = false;
    public int CatchingFishCardViewRealm = -1;
    public int CatchingFishPayPal = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.CatchingFishStateLiveData = -1;
        this.CatchingFishSpannableWidget = false;
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(17);
        this.CatchingFishCardViewView = catchingFishViewModelIntent;
        this.CatchingFishMVPRobolectric = 2;
        this.CatchingFishJobScheduler = new Rect();
        this.CatchingFishPayPalService = new CatchingFishMockkHiltRealm(this);
        this.CatchingFishSensorManager = true;
        this.CatchingFishDagger = new CatchingFishGsonRealm(14, this);
        CatchingFishAdMobEspresso CatchingFishSensorManager = CatchingFishKtorDataStore.CatchingFishSensorManager(context, attributeSet, i, i2);
        int i3 = CatchingFishSensorManager.CatchingFishParcelableFAB;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        CatchingFishCoroutine(null);
        if (i3 != this.CatchingFishJetpackCompose) {
            this.CatchingFishJetpackCompose = i3;
            CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishNavigation;
            this.CatchingFishNavigation = this.CatchingFish;
            this.CatchingFish = catchingFishIntentJUnit;
            CatchingFishRetrofit();
        }
        int i4 = CatchingFishSensorManager.CatchingFishSnackbar;
        CatchingFishCoroutine(null);
        if (i4 != this.CatchingFishStateLiveData) {
            catchingFishViewModelIntent.CatchingFishReduxKtor();
            CatchingFishRetrofit();
            this.CatchingFishStateLiveData = i4;
            this.CatchingFishGsonAppCompat = new BitSet(this.CatchingFishStateLiveData);
            this.CatchingFishRoomDatabase = new CatchingFishGsonIntent[this.CatchingFishStateLiveData];
            for (int i5 = 0; i5 < this.CatchingFishStateLiveData; i5++) {
                this.CatchingFishRoomDatabase[i5] = new CatchingFishGsonIntent(this, i5);
            }
            CatchingFishRetrofit();
        }
        boolean z = CatchingFishSensorManager.CatchingFishCoroutine;
        CatchingFishCoroutine(null);
        CatchingFishBiometricPayPal catchingFishBiometricPayPal = this.CatchingFishMutableLiveData;
        if (catchingFishBiometricPayPal != null && catchingFishBiometricPayPal.CatchingFishCloudMessaging != z) {
            catchingFishBiometricPayPal.CatchingFishCloudMessaging = z;
        }
        this.CatchingFishSpannableWidget = z;
        CatchingFishRetrofit();
        CatchingFishAppCompatRealm catchingFishAppCompatRealm = new CatchingFishAppCompatRealm();
        catchingFishAppCompatRealm.CatchingFishParcelableFAB = true;
        catchingFishAppCompatRealm.CatchingFishWorkManager = 0;
        catchingFishAppCompatRealm.CatchingFishViewModelScope = 0;
        this.CatchingFishDaggerHiltFAB = catchingFishAppCompatRealm;
        this.CatchingFishNavigation = CatchingFishIntentJUnit.CatchingFishParcelableFAB(this, this.CatchingFishJetpackCompose);
        this.CatchingFish = CatchingFishIntentJUnit.CatchingFishParcelableFAB(this, 1 - this.CatchingFishJetpackCompose);
    }

    public static int CatchingFishAccessibility(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFish(Context context, AttributeSet attributeSet) {
        return new CatchingFishDataStoreKtor(context, attributeSet);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishAndroidX(int i, int i2) {
        CatchingFishCardView(i, i2, 4);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishAnimation(int i, int i2) {
        CatchingFishCardView(i, i2, 1);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishAnimationMockk(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        boolean z = !this.CatchingFishSensorManager;
        return CatchingFishHiltMVPToast.CatchingFishFragmentHandler(catchingFishReduxGlide, this.CatchingFishNavigation, CatchingFishDaggerAppCompat(z), CatchingFishMVPHandler(z), this, this.CatchingFishSensorManager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.CatchingFishJetpackCompose == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.CatchingFishJetpackCompose == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (CatchingFishStripeAPIWidget() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (CatchingFishStripeAPIWidget() == false) goto L37;
     */
    @Override // kotlin.text.CatchingFishKtorDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View CatchingFishAppCompat(View view, int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        View view2;
        int i2;
        if (CatchingFishDaggerHiltFAB() != 0) {
            RecyclerView recyclerView = this.CatchingFishSnackbar;
            if (recyclerView == null || (view2 = recyclerView.CatchingFishPayPal(view)) == null || ((ArrayList) this.CatchingFishParcelableFAB.CatchingFishViewModelScope).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                CatchingFishIntent();
                if (i == 1) {
                    if (this.CatchingFishJetpackCompose != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (this.CatchingFishJetpackCompose != 1) {
                    }
                    i2 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 != Integer.MIN_VALUE) {
                    CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) view2.getLayoutParams();
                    catchingFishDataStoreKtor.getClass();
                    CatchingFishGsonIntent catchingFishGsonIntent = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket;
                    int CatchingFishToolbar = i2 == 1 ? CatchingFishToolbar() : CatchingFishContextToast();
                    CatchingFishGradleFirebase(CatchingFishToolbar, catchingFishReduxGlide);
                    CatchingFishFragment(i2);
                    CatchingFishAppCompatRealm catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
                    catchingFishAppCompatRealm.CatchingFishCoroutine = catchingFishAppCompatRealm.CatchingFishReduxKtor + CatchingFishToolbar;
                    catchingFishAppCompatRealm.CatchingFishSnackbar = (int) (this.CatchingFishNavigation.CatchingFishEspressoTesting() * 0.33333334f);
                    catchingFishAppCompatRealm.CatchingFishViewModelFAB = true;
                    catchingFishAppCompatRealm.CatchingFishParcelableFAB = false;
                    CatchingFishKtor(catchingFishSnackbarCameraX, catchingFishAppCompatRealm, catchingFishReduxGlide);
                    this.CatchingFishCustomView = this.CatchingFishParcelableFlux;
                    View CatchingFishViewModelFAB = catchingFishGsonIntent.CatchingFishViewModelFAB(CatchingFishToolbar, i2);
                    if (CatchingFishViewModelFAB != null && CatchingFishViewModelFAB != view2) {
                        return CatchingFishViewModelFAB;
                    }
                    if (CatchingFishJUnitIntent(i2)) {
                        for (int i3 = this.CatchingFishStateLiveData - 1; i3 >= 0; i3--) {
                            View CatchingFishViewModelFAB2 = this.CatchingFishRoomDatabase[i3].CatchingFishViewModelFAB(CatchingFishToolbar, i2);
                            if (CatchingFishViewModelFAB2 != null && CatchingFishViewModelFAB2 != view2) {
                                return CatchingFishViewModelFAB2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.CatchingFishStateLiveData; i4++) {
                            View CatchingFishViewModelFAB3 = this.CatchingFishRoomDatabase[i4].CatchingFishViewModelFAB(CatchingFishToolbar, i2);
                            if (CatchingFishViewModelFAB3 != null && CatchingFishViewModelFAB3 != view2) {
                                return CatchingFishViewModelFAB3;
                            }
                        }
                    }
                    boolean z = (this.CatchingFishSpannableWidget ^ true) == (i2 == -1);
                    View CatchingFishRoomDatabase = CatchingFishRoomDatabase(z ? catchingFishGsonIntent.CatchingFishCoroutine() : catchingFishGsonIntent.CatchingFishReduxKtor());
                    if (CatchingFishRoomDatabase != null && CatchingFishRoomDatabase != view2) {
                        return CatchingFishRoomDatabase;
                    }
                    if (CatchingFishJUnitIntent(i2)) {
                        for (int i5 = this.CatchingFishStateLiveData - 1; i5 >= 0; i5--) {
                            if (i5 != catchingFishGsonIntent.CatchingFishDaggerWebsocket) {
                                View CatchingFishRoomDatabase2 = CatchingFishRoomDatabase(z ? this.CatchingFishRoomDatabase[i5].CatchingFishCoroutine() : this.CatchingFishRoomDatabase[i5].CatchingFishReduxKtor());
                                if (CatchingFishRoomDatabase2 != null && CatchingFishRoomDatabase2 != view2) {
                                    return CatchingFishRoomDatabase2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.CatchingFishStateLiveData; i6++) {
                            View CatchingFishRoomDatabase3 = CatchingFishRoomDatabase(z ? this.CatchingFishRoomDatabase[i6].CatchingFishCoroutine() : this.CatchingFishRoomDatabase[i6].CatchingFishReduxKtor());
                            if (CatchingFishRoomDatabase3 != null && CatchingFishRoomDatabase3 != view2) {
                                return CatchingFishRoomDatabase3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean CatchingFishCameraX() {
        int CatchingFishContextToast;
        if (CatchingFishDaggerHiltFAB() != 0 && this.CatchingFishMVPRobolectric != 0 && this.CatchingFishViewModelScope) {
            if (this.CatchingFishParcelableFlux) {
                CatchingFishContextToast = CatchingFishToolbar();
                CatchingFishContextToast();
            } else {
                CatchingFishContextToast = CatchingFishContextToast();
                CatchingFishToolbar();
            }
            if (CatchingFishContextToast == 0 && CatchingFishLifecycleHilt() != null) {
                this.CatchingFishCardViewView.CatchingFishReduxKtor();
                this.CatchingFishWorkManager = true;
                CatchingFishRetrofit();
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishCameraXIntent() {
        return this.CatchingFishMVPRobolectric != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCardView(int i, int i2, int i3) {
        int i4;
        int i5;
        CatchingFishViewModelIntent catchingFishViewModelIntent;
        int[] iArr;
        ArrayList arrayList;
        CatchingFishMVVMAdMob catchingFishMVVMAdMob;
        int i6;
        int CatchingFishToolbar = this.CatchingFishParcelableFlux ? CatchingFishToolbar() : CatchingFishContextToast();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                catchingFishViewModelIntent = this.CatchingFishCardViewView;
                iArr = (int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                catchingFishMVVMAdMob = (CatchingFishMVVMAdMob) ((ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager).get(size);
                                if (catchingFishMVVMAdMob.CatchingFishReduxKtor == i5) {
                                    break;
                                }
                            }
                        }
                        catchingFishMVVMAdMob = null;
                        if (catchingFishMVVMAdMob != null) {
                            ((ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager).remove(catchingFishMVVMAdMob);
                        }
                        int size2 = ((ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((CatchingFishMVVMAdMob) ((ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager).get(i7)).CatchingFishReduxKtor >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            CatchingFishMVVMAdMob catchingFishMVVMAdMob2 = (CatchingFishMVVMAdMob) ((ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager).get(i7);
                            ((ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager).remove(i7);
                            i6 = catchingFishMVVMAdMob2.CatchingFishReduxKtor;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).length;
                            } else {
                                Arrays.fill((int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket, i5, Math.min(i6 + 1, ((int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket).length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    catchingFishViewModelIntent.CatchingFish(i, i2);
                } else if (i3 == 2) {
                    catchingFishViewModelIntent.CatchingFishJetpackCompose(i, i2);
                } else if (i3 == 8) {
                    catchingFishViewModelIntent.CatchingFishJetpackCompose(i, 1);
                    catchingFishViewModelIntent.CatchingFish(i2, 1);
                }
                if (i4 > CatchingFishToolbar) {
                    return;
                }
                if (i5 <= (this.CatchingFishParcelableFlux ? CatchingFishContextToast() : CatchingFishToolbar())) {
                    CatchingFishRetrofit();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        catchingFishViewModelIntent = this.CatchingFishCardViewView;
        iArr = (int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        if (iArr != null) {
            arrayList = (ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager;
            if (arrayList != null) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > CatchingFishToolbar) {
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishCloudMessaging(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishLifecycle(catchingFishReduxGlide);
    }

    public final int CatchingFishContextToast() {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        return CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(0));
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishCoroutine(String str) {
        if (this.CatchingFishMutableLiveData == null) {
            super.CatchingFishCoroutine(str);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishCustomViewJUnit(Parcelable parcelable) {
        if (parcelable instanceof CatchingFishBiometricPayPal) {
            CatchingFishBiometricPayPal catchingFishBiometricPayPal = (CatchingFishBiometricPayPal) parcelable;
            this.CatchingFishMutableLiveData = catchingFishBiometricPayPal;
            if (this.CatchingFishCardViewRealm != -1) {
                catchingFishBiometricPayPal.CatchingFishViewModelScope = null;
                catchingFishBiometricPayPal.CatchingFishWorkManager = 0;
                catchingFishBiometricPayPal.CatchingFishReduxKtor = -1;
                catchingFishBiometricPayPal.CatchingFishDaggerWebsocket = -1;
                catchingFishBiometricPayPal.CatchingFishViewModelScope = null;
                catchingFishBiometricPayPal.CatchingFishWorkManager = 0;
                catchingFishBiometricPayPal.CatchingFishViewModelFAB = 0;
                catchingFishBiometricPayPal.CatchingFishLayout = null;
                catchingFishBiometricPayPal.CatchingFishFragmentHandler = null;
            }
            CatchingFishRetrofit();
        }
    }

    public final View CatchingFishDaggerAppCompat(boolean z) {
        int CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishCloudMessaging();
        int CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope();
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        View view = null;
        for (int i = 0; i < CatchingFishDaggerHiltFAB; i++) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i);
            int CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow);
            if (this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow) > CatchingFishCloudMessaging && CatchingFishDaggerWebsocket < CatchingFishViewModelScope) {
                if (CatchingFishDaggerWebsocket >= CatchingFishCloudMessaging || !z) {
                    return CatchingFishCoroutineFlow;
                }
                if (view == null) {
                    view = CatchingFishCoroutineFlow;
                }
            }
        }
        return view;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final Parcelable CatchingFishDaggerMVVM() {
        int CatchingFishLayout;
        int CatchingFishCloudMessaging;
        int[] iArr;
        CatchingFishBiometricPayPal catchingFishBiometricPayPal = this.CatchingFishMutableLiveData;
        if (catchingFishBiometricPayPal != null) {
            CatchingFishBiometricPayPal catchingFishBiometricPayPal2 = new CatchingFishBiometricPayPal();
            catchingFishBiometricPayPal2.CatchingFishWorkManager = catchingFishBiometricPayPal.CatchingFishWorkManager;
            catchingFishBiometricPayPal2.CatchingFishReduxKtor = catchingFishBiometricPayPal.CatchingFishReduxKtor;
            catchingFishBiometricPayPal2.CatchingFishDaggerWebsocket = catchingFishBiometricPayPal.CatchingFishDaggerWebsocket;
            catchingFishBiometricPayPal2.CatchingFishViewModelScope = catchingFishBiometricPayPal.CatchingFishViewModelScope;
            catchingFishBiometricPayPal2.CatchingFishViewModelFAB = catchingFishBiometricPayPal.CatchingFishViewModelFAB;
            catchingFishBiometricPayPal2.CatchingFishLayout = catchingFishBiometricPayPal.CatchingFishLayout;
            catchingFishBiometricPayPal2.CatchingFishCloudMessaging = catchingFishBiometricPayPal.CatchingFishCloudMessaging;
            catchingFishBiometricPayPal2.CatchingFishEspressoTesting = catchingFishBiometricPayPal.CatchingFishEspressoTesting;
            catchingFishBiometricPayPal2.CatchingFishOkHttp = catchingFishBiometricPayPal.CatchingFishOkHttp;
            catchingFishBiometricPayPal2.CatchingFishFragmentHandler = catchingFishBiometricPayPal.CatchingFishFragmentHandler;
            return catchingFishBiometricPayPal2;
        }
        CatchingFishBiometricPayPal catchingFishBiometricPayPal3 = new CatchingFishBiometricPayPal();
        catchingFishBiometricPayPal3.CatchingFishCloudMessaging = this.CatchingFishSpannableWidget;
        catchingFishBiometricPayPal3.CatchingFishEspressoTesting = this.CatchingFishCustomView;
        catchingFishBiometricPayPal3.CatchingFishOkHttp = this.CatchingFishFragmentFactory;
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishCardViewView;
        if (catchingFishViewModelIntent == null || (iArr = (int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket) == null) {
            catchingFishBiometricPayPal3.CatchingFishViewModelFAB = 0;
        } else {
            catchingFishBiometricPayPal3.CatchingFishLayout = iArr;
            catchingFishBiometricPayPal3.CatchingFishViewModelFAB = iArr.length;
            catchingFishBiometricPayPal3.CatchingFishFragmentHandler = (ArrayList) catchingFishViewModelIntent.CatchingFishWorkManager;
        }
        if (CatchingFishDaggerHiltFAB() <= 0) {
            catchingFishBiometricPayPal3.CatchingFishReduxKtor = -1;
            catchingFishBiometricPayPal3.CatchingFishDaggerWebsocket = -1;
            catchingFishBiometricPayPal3.CatchingFishWorkManager = 0;
            return catchingFishBiometricPayPal3;
        }
        catchingFishBiometricPayPal3.CatchingFishReduxKtor = this.CatchingFishCustomView ? CatchingFishToolbar() : CatchingFishContextToast();
        View CatchingFishMVPHandler = this.CatchingFishParcelableFlux ? CatchingFishMVPHandler(true) : CatchingFishDaggerAppCompat(true);
        catchingFishBiometricPayPal3.CatchingFishDaggerWebsocket = CatchingFishMVPHandler != null ? CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishMVPHandler) : -1;
        int i = this.CatchingFishStateLiveData;
        catchingFishBiometricPayPal3.CatchingFishWorkManager = i;
        catchingFishBiometricPayPal3.CatchingFishViewModelScope = new int[i];
        for (int i2 = 0; i2 < this.CatchingFishStateLiveData; i2++) {
            if (this.CatchingFishCustomView) {
                CatchingFishLayout = this.CatchingFishRoomDatabase[i2].CatchingFishViewModelScope(Integer.MIN_VALUE);
                if (CatchingFishLayout != Integer.MIN_VALUE) {
                    CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishViewModelScope();
                    CatchingFishLayout -= CatchingFishCloudMessaging;
                    catchingFishBiometricPayPal3.CatchingFishViewModelScope[i2] = CatchingFishLayout;
                } else {
                    catchingFishBiometricPayPal3.CatchingFishViewModelScope[i2] = CatchingFishLayout;
                }
            } else {
                CatchingFishLayout = this.CatchingFishRoomDatabase[i2].CatchingFishLayout(Integer.MIN_VALUE);
                if (CatchingFishLayout != Integer.MIN_VALUE) {
                    CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishCloudMessaging();
                    CatchingFishLayout -= CatchingFishCloudMessaging;
                    catchingFishBiometricPayPal3.CatchingFishViewModelScope[i2] = CatchingFishLayout;
                } else {
                    catchingFishBiometricPayPal3.CatchingFishViewModelScope[i2] = CatchingFishLayout;
                }
            }
        }
        return catchingFishBiometricPayPal3;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishJetpackCompose == 1;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishDataStoreIntent(AccessibilityEvent accessibilityEvent) {
        super.CatchingFishDataStoreIntent(accessibilityEvent);
        if (CatchingFishDaggerHiltFAB() > 0) {
            View CatchingFishDaggerAppCompat = CatchingFishDaggerAppCompat(false);
            View CatchingFishMVPHandler = CatchingFishMVPHandler(false);
            if (CatchingFishDaggerAppCompat == null || CatchingFishMVPHandler == null) {
                return;
            }
            int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishDaggerAppCompat);
            int CatchingFishPayPalService2 = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishMVPHandler);
            if (CatchingFishPayPalService < CatchingFishPayPalService2) {
                accessibilityEvent.setFromIndex(CatchingFishPayPalService);
                accessibilityEvent.setToIndex(CatchingFishPayPalService2);
            } else {
                accessibilityEvent.setFromIndex(CatchingFishPayPalService2);
                accessibilityEvent.setToIndex(CatchingFishPayPalService);
            }
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishDynamicFeature(RecyclerView recyclerView, int i) {
        CatchingFishFABRobolectric catchingFishFABRobolectric = new CatchingFishFABRobolectric(recyclerView.getContext());
        catchingFishFABRobolectric.CatchingFishParcelableFAB = i;
        CatchingFishPayPalHandler(catchingFishFABRobolectric);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishEspressoTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        boolean z = !this.CatchingFishSensorManager;
        return CatchingFishHiltMVPToast.CatchingFishFragmentHandler(catchingFishReduxGlide, this.CatchingFishNavigation, CatchingFishDaggerAppCompat(z), CatchingFishMVPHandler(z), this, this.CatchingFishSensorManager);
    }

    public final int CatchingFishExoPlayer(int i) {
        int CatchingFishViewModelScope = this.CatchingFishRoomDatabase[0].CatchingFishViewModelScope(i);
        for (int i2 = 1; i2 < this.CatchingFishStateLiveData; i2++) {
            int CatchingFishViewModelScope2 = this.CatchingFishRoomDatabase[i2].CatchingFishViewModelScope(i);
            if (CatchingFishViewModelScope2 > CatchingFishViewModelScope) {
                CatchingFishViewModelScope = CatchingFishViewModelScope2;
            }
        }
        return CatchingFishViewModelScope;
    }

    public final void CatchingFishFragment(int i) {
        CatchingFishAppCompatRealm catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
        catchingFishAppCompatRealm.CatchingFishDaggerWebsocket = i;
        catchingFishAppCompatRealm.CatchingFishReduxKtor = this.CatchingFishParcelableFlux != (i == -1) ? -1 : 1;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishFragmentHandler(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        boolean z = !this.CatchingFishSensorManager;
        return CatchingFishHiltMVPToast.CatchingFishViewModelFAB(catchingFishReduxGlide, this.CatchingFishNavigation, CatchingFishDaggerAppCompat(z), CatchingFishMVPHandler(z), this, this.CatchingFishSensorManager);
    }

    public final void CatchingFishGlideMVP(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z) {
        int CatchingFishCloudMessaging;
        int CatchingFishMaterialDesign = CatchingFishMaterialDesign(Integer.MAX_VALUE);
        if (CatchingFishMaterialDesign != Integer.MAX_VALUE && (CatchingFishCloudMessaging = CatchingFishMaterialDesign - this.CatchingFishNavigation.CatchingFishCloudMessaging()) > 0) {
            int CatchingFishKtorRealmView = CatchingFishCloudMessaging - CatchingFishKtorRealmView(CatchingFishCloudMessaging, catchingFishSnackbarCameraX, catchingFishReduxGlide);
            if (!z || CatchingFishKtorRealmView <= 0) {
                return;
            }
            this.CatchingFishNavigation.CatchingFishAnimationMockk(-CatchingFishKtorRealmView);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishGlideWidgetKtor(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishKtorRealmView(i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
    }

    public final void CatchingFishGradle(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishAppCompatRealm catchingFishAppCompatRealm) {
        if (!catchingFishAppCompatRealm.CatchingFishParcelableFAB || catchingFishAppCompatRealm.CatchingFishLayout) {
            return;
        }
        if (catchingFishAppCompatRealm.CatchingFishSnackbar == 0) {
            if (catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == -1) {
                CatchingFishJUnitViewPager(catchingFishSnackbarCameraX, catchingFishAppCompatRealm.CatchingFishViewModelScope);
                return;
            } else {
                CatchingFishToolbarEspresso(catchingFishSnackbarCameraX, catchingFishAppCompatRealm.CatchingFishWorkManager);
                return;
            }
        }
        int i = 1;
        if (catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == -1) {
            int i2 = catchingFishAppCompatRealm.CatchingFishWorkManager;
            int CatchingFishLayout = this.CatchingFishRoomDatabase[0].CatchingFishLayout(i2);
            while (i < this.CatchingFishStateLiveData) {
                int CatchingFishLayout2 = this.CatchingFishRoomDatabase[i].CatchingFishLayout(i2);
                if (CatchingFishLayout2 > CatchingFishLayout) {
                    CatchingFishLayout = CatchingFishLayout2;
                }
                i++;
            }
            int i3 = i2 - CatchingFishLayout;
            CatchingFishJUnitViewPager(catchingFishSnackbarCameraX, i3 < 0 ? catchingFishAppCompatRealm.CatchingFishViewModelScope : catchingFishAppCompatRealm.CatchingFishViewModelScope - Math.min(i3, catchingFishAppCompatRealm.CatchingFishSnackbar));
            return;
        }
        int i4 = catchingFishAppCompatRealm.CatchingFishViewModelScope;
        int CatchingFishViewModelScope = this.CatchingFishRoomDatabase[0].CatchingFishViewModelScope(i4);
        while (i < this.CatchingFishStateLiveData) {
            int CatchingFishViewModelScope2 = this.CatchingFishRoomDatabase[i].CatchingFishViewModelScope(i4);
            if (CatchingFishViewModelScope2 < CatchingFishViewModelScope) {
                CatchingFishViewModelScope = CatchingFishViewModelScope2;
            }
            i++;
        }
        int i5 = CatchingFishViewModelScope - catchingFishAppCompatRealm.CatchingFishViewModelScope;
        CatchingFishToolbarEspresso(catchingFishSnackbarCameraX, i5 < 0 ? catchingFishAppCompatRealm.CatchingFishWorkManager : Math.min(i5, catchingFishAppCompatRealm.CatchingFishSnackbar) + catchingFishAppCompatRealm.CatchingFishWorkManager);
    }

    public final void CatchingFishGradleFirebase(int i, CatchingFishReduxGlide catchingFishReduxGlide) {
        int i2;
        int i3;
        int i4;
        CatchingFishAppCompatRealm catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
        boolean z = false;
        catchingFishAppCompatRealm.CatchingFishSnackbar = 0;
        catchingFishAppCompatRealm.CatchingFishCoroutine = i;
        CatchingFishFABRobolectric catchingFishFABRobolectric = this.CatchingFishDaggerWebsocket;
        if (catchingFishFABRobolectric == null || !catchingFishFABRobolectric.CatchingFishDaggerWebsocket || (i4 = catchingFishReduxGlide.CatchingFishParcelableFAB) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.CatchingFishParcelableFlux == (i4 < i)) {
                i2 = this.CatchingFishNavigation.CatchingFishEspressoTesting();
                i3 = 0;
            } else {
                i3 = this.CatchingFishNavigation.CatchingFishEspressoTesting();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView == null || !recyclerView.CatchingFishFragmentHandler) {
            catchingFishAppCompatRealm.CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishWorkManager() + i2;
            catchingFishAppCompatRealm.CatchingFishWorkManager = -i3;
        } else {
            catchingFishAppCompatRealm.CatchingFishWorkManager = this.CatchingFishNavigation.CatchingFishCloudMessaging() - i3;
            catchingFishAppCompatRealm.CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope() + i2;
        }
        catchingFishAppCompatRealm.CatchingFishViewModelFAB = false;
        catchingFishAppCompatRealm.CatchingFishParcelableFAB = true;
        if (this.CatchingFishNavigation.CatchingFishLayout() == 0 && this.CatchingFishNavigation.CatchingFishWorkManager() == 0) {
            z = true;
        }
        catchingFishAppCompatRealm.CatchingFishLayout = z;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishGradleManifest(int i) {
        super.CatchingFishGradleManifest(i);
        for (int i2 = 0; i2 < this.CatchingFishStateLiveData; i2++) {
            CatchingFishGsonIntent catchingFishGsonIntent = this.CatchingFishRoomDatabase[i2];
            int i3 = catchingFishGsonIntent.CatchingFishSnackbar;
            if (i3 != Integer.MIN_VALUE) {
                catchingFishGsonIntent.CatchingFishSnackbar = i3 + i;
            }
            int i4 = catchingFishGsonIntent.CatchingFishCoroutine;
            if (i4 != Integer.MIN_VALUE) {
                catchingFishGsonIntent.CatchingFishCoroutine = i4 + i;
            }
        }
    }

    public final void CatchingFishHiltBundle(View view, int i, int i2) {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        Rect rect = this.CatchingFishJobScheduler;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.CatchingFishEspressoMockk(view));
        }
        CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) view.getLayoutParams();
        int CatchingFishAccessibility = CatchingFishAccessibility(i, ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).rightMargin + rect.right);
        int CatchingFishAccessibility2 = CatchingFishAccessibility(i2, ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).bottomMargin + rect.bottom);
        if (CatchingFishWebSocketMockk(view, CatchingFishAccessibility, CatchingFishAccessibility2, catchingFishDataStoreKtor)) {
            view.measure(CatchingFishAccessibility, CatchingFishAccessibility2);
        }
    }

    public final void CatchingFishIntent() {
        if (this.CatchingFishJetpackCompose == 1 || !CatchingFishStripeAPIWidget()) {
            this.CatchingFishParcelableFlux = this.CatchingFishSpannableWidget;
        } else {
            this.CatchingFishParcelableFlux = !this.CatchingFishSpannableWidget;
        }
    }

    public final boolean CatchingFishJUnitIntent(int i) {
        if (this.CatchingFishJetpackCompose == 0) {
            return (i == -1) != this.CatchingFishParcelableFlux;
        }
        return ((i == -1) == this.CatchingFishParcelableFlux) == CatchingFishStripeAPIWidget();
    }

    public final void CatchingFishJUnitLiveData(CatchingFishGsonIntent catchingFishGsonIntent, int i, int i2) {
        int i3 = catchingFishGsonIntent.CatchingFishReduxKtor;
        int i4 = catchingFishGsonIntent.CatchingFishDaggerWebsocket;
        if (i != -1) {
            int i5 = catchingFishGsonIntent.CatchingFishCoroutine;
            if (i5 == Integer.MIN_VALUE) {
                catchingFishGsonIntent.CatchingFishParcelableFAB();
                i5 = catchingFishGsonIntent.CatchingFishCoroutine;
            }
            if (i5 - i3 >= i2) {
                this.CatchingFishGsonAppCompat.set(i4, false);
                return;
            }
            return;
        }
        int i6 = catchingFishGsonIntent.CatchingFishSnackbar;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) catchingFishGsonIntent.CatchingFishWorkManager).get(0);
            CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) view.getLayoutParams();
            catchingFishGsonIntent.CatchingFishSnackbar = ((StaggeredGridLayoutManager) catchingFishGsonIntent.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishDaggerWebsocket(view);
            catchingFishDataStoreKtor.getClass();
            i6 = catchingFishGsonIntent.CatchingFishSnackbar;
        }
        if (i6 + i3 <= i2) {
            this.CatchingFishGsonAppCompat.set(i4, false);
        }
    }

    public final void CatchingFishJUnitViewPager(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, int i) {
        for (int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB() - 1; CatchingFishDaggerHiltFAB >= 0; CatchingFishDaggerHiltFAB--) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB);
            if (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow) < i || this.CatchingFishNavigation.CatchingFishUnitTesting(CatchingFishCoroutineFlow) < i) {
                return;
            }
            CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) CatchingFishCoroutineFlow.getLayoutParams();
            catchingFishDataStoreKtor.getClass();
            if (((ArrayList) catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishWorkManager).size() == 1) {
                return;
            }
            CatchingFishGsonIntent catchingFishGsonIntent = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket;
            ArrayList arrayList = (ArrayList) catchingFishGsonIntent.CatchingFishWorkManager;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            CatchingFishDataStoreKtor catchingFishDataStoreKtor2 = (CatchingFishDataStoreKtor) view.getLayoutParams();
            catchingFishDataStoreKtor2.CatchingFishDaggerWebsocket = null;
            if (catchingFishDataStoreKtor2.CatchingFishParcelableFAB.CatchingFishViewModelFAB() || catchingFishDataStoreKtor2.CatchingFishParcelableFAB.CatchingFishCloudMessaging()) {
                catchingFishGsonIntent.CatchingFishReduxKtor -= ((StaggeredGridLayoutManager) catchingFishGsonIntent.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishCoroutine(view);
            }
            if (size == 1) {
                catchingFishGsonIntent.CatchingFishSnackbar = Integer.MIN_VALUE;
            }
            catchingFishGsonIntent.CatchingFishCoroutine = Integer.MIN_VALUE;
            CatchingFishFirebase(CatchingFishCoroutineFlow, catchingFishSnackbarCameraX);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFishJetpackCompose(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new CatchingFishDataStoreKtor((ViewGroup.MarginLayoutParams) layoutParams) : new CatchingFishDataStoreKtor(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0267, code lost:
    
        CatchingFishGradle(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CatchingFishKtor(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishAppCompatRealm catchingFishAppCompatRealm, CatchingFishReduxGlide catchingFishReduxGlide) {
        CatchingFishGsonIntent catchingFishGsonIntent;
        ?? r8;
        int CatchingFishLayout;
        int CatchingFishCoroutine;
        int CatchingFishCloudMessaging;
        int CatchingFishCoroutine2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.CatchingFishGsonAppCompat.set(0, this.CatchingFishStateLiveData, true);
        CatchingFishAppCompatRealm catchingFishAppCompatRealm2 = this.CatchingFishDaggerHiltFAB;
        int i6 = catchingFishAppCompatRealm2.CatchingFishLayout ? catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == 1 ? catchingFishAppCompatRealm.CatchingFishViewModelScope + catchingFishAppCompatRealm.CatchingFishSnackbar : catchingFishAppCompatRealm.CatchingFishWorkManager - catchingFishAppCompatRealm.CatchingFishSnackbar;
        int i7 = catchingFishAppCompatRealm.CatchingFishDaggerWebsocket;
        for (int i8 = 0; i8 < this.CatchingFishStateLiveData; i8++) {
            if (!((ArrayList) this.CatchingFishRoomDatabase[i8].CatchingFishWorkManager).isEmpty()) {
                CatchingFishJUnitLiveData(this.CatchingFishRoomDatabase[i8], i7, i6);
            }
        }
        int CatchingFishViewModelScope = this.CatchingFishParcelableFlux ? this.CatchingFishNavigation.CatchingFishViewModelScope() : this.CatchingFishNavigation.CatchingFishCloudMessaging();
        boolean z = false;
        while (true) {
            int i9 = catchingFishAppCompatRealm.CatchingFishCoroutine;
            if (i9 < 0 || i9 >= catchingFishReduxGlide.CatchingFishSnackbar() || (!catchingFishAppCompatRealm2.CatchingFishLayout && this.CatchingFishGsonAppCompat.isEmpty())) {
                break;
            }
            View CatchingFishReduxKtor = catchingFishSnackbarCameraX.CatchingFishReduxKtor(catchingFishAppCompatRealm.CatchingFishCoroutine);
            catchingFishAppCompatRealm.CatchingFishCoroutine += catchingFishAppCompatRealm.CatchingFishReduxKtor;
            CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) CatchingFishReduxKtor.getLayoutParams();
            int CatchingFishSnackbar = catchingFishDataStoreKtor.CatchingFishParcelableFAB.CatchingFishSnackbar();
            CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishCardViewView;
            int[] iArr = (int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
            int i10 = (iArr == null || CatchingFishSnackbar >= iArr.length) ? -1 : iArr[CatchingFishSnackbar];
            if (i10 == -1) {
                if (CatchingFishJUnitIntent(catchingFishAppCompatRealm.CatchingFishDaggerWebsocket)) {
                    i3 = this.CatchingFishStateLiveData - i5;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.CatchingFishStateLiveData;
                    i3 = i4;
                }
                CatchingFishGsonIntent catchingFishGsonIntent2 = null;
                if (catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == i5) {
                    int CatchingFishCloudMessaging2 = this.CatchingFishNavigation.CatchingFishCloudMessaging();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        CatchingFishGsonIntent catchingFishGsonIntent3 = this.CatchingFishRoomDatabase[i3];
                        int CatchingFishViewModelScope2 = catchingFishGsonIntent3.CatchingFishViewModelScope(CatchingFishCloudMessaging2);
                        if (CatchingFishViewModelScope2 < i11) {
                            i11 = CatchingFishViewModelScope2;
                            catchingFishGsonIntent2 = catchingFishGsonIntent3;
                        }
                        i3 += i;
                    }
                } else {
                    int CatchingFishViewModelScope3 = this.CatchingFishNavigation.CatchingFishViewModelScope();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        CatchingFishGsonIntent catchingFishGsonIntent4 = this.CatchingFishRoomDatabase[i3];
                        int CatchingFishLayout2 = catchingFishGsonIntent4.CatchingFishLayout(CatchingFishViewModelScope3);
                        if (CatchingFishLayout2 > i12) {
                            catchingFishGsonIntent2 = catchingFishGsonIntent4;
                            i12 = CatchingFishLayout2;
                        }
                        i3 += i;
                    }
                }
                catchingFishGsonIntent = catchingFishGsonIntent2;
                catchingFishViewModelIntent.CatchingFishViewModelFAB(CatchingFishSnackbar);
                ((int[]) catchingFishViewModelIntent.CatchingFishDaggerWebsocket)[CatchingFishSnackbar] = catchingFishGsonIntent.CatchingFishDaggerWebsocket;
            } else {
                catchingFishGsonIntent = this.CatchingFishRoomDatabase[i10];
            }
            catchingFishDataStoreKtor.CatchingFishDaggerWebsocket = catchingFishGsonIntent;
            if (catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == 1) {
                r8 = 0;
                CatchingFishSnackbar(CatchingFishReduxKtor, -1, false);
            } else {
                r8 = 0;
                CatchingFishSnackbar(CatchingFishReduxKtor, 0, false);
            }
            if (this.CatchingFishJetpackCompose == 1) {
                CatchingFishHiltBundle(CatchingFishReduxKtor, CatchingFishKtorDataStore.CatchingFishSpannableWidget(r8, this.CatchingFishCoroutineFlow, this.CatchingFishEspressoTesting, r8, ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).width), CatchingFishKtorDataStore.CatchingFishSpannableWidget(true, this.CatchingFishAnimationMockk, this.CatchingFishOkHttp, CatchingFishCustomView() + CatchingFishJobScheduler(), ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).height));
            } else {
                CatchingFishHiltBundle(CatchingFishReduxKtor, CatchingFishKtorDataStore.CatchingFishSpannableWidget(true, this.CatchingFishUnitTesting, this.CatchingFishEspressoTesting, CatchingFishMutableLiveData() + CatchingFishFragmentFactory(), ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).width), CatchingFishKtorDataStore.CatchingFishSpannableWidget(false, this.CatchingFishCoroutineFlow, this.CatchingFishOkHttp, 0, ((ViewGroup.MarginLayoutParams) catchingFishDataStoreKtor).height));
            }
            if (catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == 1) {
                CatchingFishCoroutine = catchingFishGsonIntent.CatchingFishViewModelScope(CatchingFishViewModelScope);
                CatchingFishLayout = this.CatchingFishNavigation.CatchingFishCoroutine(CatchingFishReduxKtor) + CatchingFishCoroutine;
            } else {
                CatchingFishLayout = catchingFishGsonIntent.CatchingFishLayout(CatchingFishViewModelScope);
                CatchingFishCoroutine = CatchingFishLayout - this.CatchingFishNavigation.CatchingFishCoroutine(CatchingFishReduxKtor);
            }
            if (catchingFishAppCompatRealm.CatchingFishDaggerWebsocket == 1) {
                CatchingFishGsonIntent catchingFishGsonIntent5 = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket;
                catchingFishGsonIntent5.getClass();
                CatchingFishDataStoreKtor catchingFishDataStoreKtor2 = (CatchingFishDataStoreKtor) CatchingFishReduxKtor.getLayoutParams();
                catchingFishDataStoreKtor2.CatchingFishDaggerWebsocket = catchingFishGsonIntent5;
                ArrayList arrayList = (ArrayList) catchingFishGsonIntent5.CatchingFishWorkManager;
                arrayList.add(CatchingFishReduxKtor);
                catchingFishGsonIntent5.CatchingFishCoroutine = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    catchingFishGsonIntent5.CatchingFishSnackbar = Integer.MIN_VALUE;
                }
                if (catchingFishDataStoreKtor2.CatchingFishParcelableFAB.CatchingFishViewModelFAB() || catchingFishDataStoreKtor2.CatchingFishParcelableFAB.CatchingFishCloudMessaging()) {
                    catchingFishGsonIntent5.CatchingFishReduxKtor = ((StaggeredGridLayoutManager) catchingFishGsonIntent5.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishCoroutine(CatchingFishReduxKtor) + catchingFishGsonIntent5.CatchingFishReduxKtor;
                }
            } else {
                CatchingFishGsonIntent catchingFishGsonIntent6 = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket;
                catchingFishGsonIntent6.getClass();
                CatchingFishDataStoreKtor catchingFishDataStoreKtor3 = (CatchingFishDataStoreKtor) CatchingFishReduxKtor.getLayoutParams();
                catchingFishDataStoreKtor3.CatchingFishDaggerWebsocket = catchingFishGsonIntent6;
                ArrayList arrayList2 = (ArrayList) catchingFishGsonIntent6.CatchingFishWorkManager;
                arrayList2.add(0, CatchingFishReduxKtor);
                catchingFishGsonIntent6.CatchingFishSnackbar = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    catchingFishGsonIntent6.CatchingFishCoroutine = Integer.MIN_VALUE;
                }
                if (catchingFishDataStoreKtor3.CatchingFishParcelableFAB.CatchingFishViewModelFAB() || catchingFishDataStoreKtor3.CatchingFishParcelableFAB.CatchingFishCloudMessaging()) {
                    catchingFishGsonIntent6.CatchingFishReduxKtor = ((StaggeredGridLayoutManager) catchingFishGsonIntent6.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishCoroutine(CatchingFishReduxKtor) + catchingFishGsonIntent6.CatchingFishReduxKtor;
                }
            }
            if (CatchingFishStripeAPIWidget() && this.CatchingFishJetpackCompose == 1) {
                CatchingFishCoroutine2 = this.CatchingFish.CatchingFishViewModelScope() - (((this.CatchingFishStateLiveData - 1) - catchingFishGsonIntent.CatchingFishDaggerWebsocket) * this.CatchingFishCoroutineFlow);
                CatchingFishCloudMessaging = CatchingFishCoroutine2 - this.CatchingFish.CatchingFishCoroutine(CatchingFishReduxKtor);
            } else {
                CatchingFishCloudMessaging = this.CatchingFish.CatchingFishCloudMessaging() + (catchingFishGsonIntent.CatchingFishDaggerWebsocket * this.CatchingFishCoroutineFlow);
                CatchingFishCoroutine2 = this.CatchingFish.CatchingFishCoroutine(CatchingFishReduxKtor) + CatchingFishCloudMessaging;
            }
            if (this.CatchingFishJetpackCompose == 1) {
                CatchingFishKtorDataStore.CatchingFishPayPalLiveData(CatchingFishReduxKtor, CatchingFishCloudMessaging, CatchingFishCoroutine, CatchingFishCoroutine2, CatchingFishLayout);
            } else {
                CatchingFishKtorDataStore.CatchingFishPayPalLiveData(CatchingFishReduxKtor, CatchingFishCoroutine, CatchingFishCloudMessaging, CatchingFishLayout, CatchingFishCoroutine2);
            }
            CatchingFishJUnitLiveData(catchingFishGsonIntent, catchingFishAppCompatRealm2.CatchingFishDaggerWebsocket, i6);
            CatchingFishGradle(catchingFishSnackbarCameraX, catchingFishAppCompatRealm2);
            if (catchingFishAppCompatRealm2.CatchingFishViewModelFAB && CatchingFishReduxKtor.hasFocusable()) {
                this.CatchingFishGsonAppCompat.set(catchingFishGsonIntent.CatchingFishDaggerWebsocket, false);
            }
            i5 = 1;
            z = true;
            i4 = 0;
        }
        int CatchingFishCloudMessaging3 = catchingFishAppCompatRealm2.CatchingFishDaggerWebsocket == -1 ? this.CatchingFishNavigation.CatchingFishCloudMessaging() - CatchingFishMaterialDesign(this.CatchingFishNavigation.CatchingFishCloudMessaging()) : CatchingFishExoPlayer(this.CatchingFishNavigation.CatchingFishViewModelScope()) - this.CatchingFishNavigation.CatchingFishViewModelScope();
        if (CatchingFishCloudMessaging3 > 0) {
            return Math.min(catchingFishAppCompatRealm.CatchingFishSnackbar, CatchingFishCloudMessaging3);
        }
        return 0;
    }

    public final int CatchingFishKtorRealmView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0 || i == 0) {
            return 0;
        }
        CatchingFishRetrofitCameraX(i, catchingFishReduxGlide);
        CatchingFishAppCompatRealm catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
        int CatchingFishKtor = CatchingFishKtor(catchingFishSnackbarCameraX, catchingFishAppCompatRealm, catchingFishReduxGlide);
        if (catchingFishAppCompatRealm.CatchingFishSnackbar >= CatchingFishKtor) {
            i = i < 0 ? -CatchingFishKtor : CatchingFishKtor;
        }
        this.CatchingFishNavigation.CatchingFishAnimationMockk(-i);
        this.CatchingFishCustomView = this.CatchingFishParcelableFlux;
        catchingFishAppCompatRealm.CatchingFishSnackbar = 0;
        CatchingFishGradle(catchingFishSnackbarCameraX, catchingFishAppCompatRealm);
        return i;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishLayoutInflater() {
        this.CatchingFishCardViewView.CatchingFishReduxKtor();
        for (int i = 0; i < this.CatchingFishStateLiveData; i++) {
            this.CatchingFishRoomDatabase[i].CatchingFishSnackbar();
        }
    }

    public final int CatchingFishLifecycle(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        boolean z = !this.CatchingFishSensorManager;
        return CatchingFishHiltMVPToast.CatchingFishLayout(catchingFishReduxGlide, this.CatchingFishNavigation, CatchingFishDaggerAppCompat(z), CatchingFishMVPHandler(z), this, this.CatchingFishSensorManager, this.CatchingFishParcelableFlux);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View CatchingFishLifecycleHilt() {
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        int i = CatchingFishDaggerHiltFAB - 1;
        BitSet bitSet = new BitSet(this.CatchingFishStateLiveData);
        bitSet.set(0, this.CatchingFishStateLiveData, true);
        char c = (this.CatchingFishJetpackCompose == 1 && CatchingFishStripeAPIWidget()) ? (char) 1 : (char) 65535;
        if (this.CatchingFishParcelableFlux) {
            CatchingFishDaggerHiltFAB = -1;
        } else {
            i = 0;
        }
        int i2 = i < CatchingFishDaggerHiltFAB ? 1 : -1;
        while (i != CatchingFishDaggerHiltFAB) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i);
            CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) CatchingFishCoroutineFlow.getLayoutParams();
            if (bitSet.get(catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket)) {
                CatchingFishGsonIntent catchingFishGsonIntent = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket;
                if (this.CatchingFishParcelableFlux) {
                    int i3 = catchingFishGsonIntent.CatchingFishCoroutine;
                    if (i3 == Integer.MIN_VALUE) {
                        catchingFishGsonIntent.CatchingFishParcelableFAB();
                        i3 = catchingFishGsonIntent.CatchingFishCoroutine;
                    }
                    if (i3 < this.CatchingFishNavigation.CatchingFishViewModelScope()) {
                        ArrayList arrayList = (ArrayList) catchingFishGsonIntent.CatchingFishWorkManager;
                        ((CatchingFishDataStoreKtor) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return CatchingFishCoroutineFlow;
                    }
                } else {
                    int i4 = catchingFishGsonIntent.CatchingFishSnackbar;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) catchingFishGsonIntent.CatchingFishWorkManager).get(0);
                        CatchingFishDataStoreKtor catchingFishDataStoreKtor2 = (CatchingFishDataStoreKtor) view.getLayoutParams();
                        catchingFishGsonIntent.CatchingFishSnackbar = ((StaggeredGridLayoutManager) catchingFishGsonIntent.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishDaggerWebsocket(view);
                        catchingFishDataStoreKtor2.getClass();
                        i4 = catchingFishGsonIntent.CatchingFishSnackbar;
                    }
                    if (i4 > this.CatchingFishNavigation.CatchingFishCloudMessaging()) {
                        ((CatchingFishDataStoreKtor) ((View) ((ArrayList) catchingFishGsonIntent.CatchingFishWorkManager).get(0)).getLayoutParams()).getClass();
                        return CatchingFishCoroutineFlow;
                    }
                }
                bitSet.clear(catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket);
            }
            i += i2;
            if (i != CatchingFishDaggerHiltFAB) {
                View CatchingFishCoroutineFlow2 = CatchingFishCoroutineFlow(i);
                if (this.CatchingFishParcelableFlux) {
                    int CatchingFishSnackbar = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow);
                    int CatchingFishSnackbar2 = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow2);
                    if (CatchingFishSnackbar < CatchingFishSnackbar2) {
                        return CatchingFishCoroutineFlow;
                    }
                    if (CatchingFishSnackbar == CatchingFishSnackbar2) {
                        if ((catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket - ((CatchingFishDataStoreKtor) CatchingFishCoroutineFlow2.getLayoutParams()).CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket >= 0) == (c >= 0)) {
                            return CatchingFishCoroutineFlow;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow);
                    int CatchingFishDaggerWebsocket2 = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow2);
                    if (CatchingFishDaggerWebsocket > CatchingFishDaggerWebsocket2) {
                        return CatchingFishCoroutineFlow;
                    }
                    if (CatchingFishDaggerWebsocket == CatchingFishDaggerWebsocket2) {
                        if ((catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket - ((CatchingFishDataStoreKtor) CatchingFishCoroutineFlow2.getLayoutParams()).CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final void CatchingFishLiveDataRoom(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z) {
        int CatchingFishViewModelScope;
        int CatchingFishExoPlayer = CatchingFishExoPlayer(Integer.MIN_VALUE);
        if (CatchingFishExoPlayer != Integer.MIN_VALUE && (CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope() - CatchingFishExoPlayer) > 0) {
            int i = CatchingFishViewModelScope - (-CatchingFishKtorRealmView(-CatchingFishViewModelScope, catchingFishSnackbarCameraX, catchingFishReduxGlide));
            if (!z || i <= 0) {
                return;
            }
            this.CatchingFishNavigation.CatchingFishAnimationMockk(i);
        }
    }

    public final View CatchingFishMVPHandler(boolean z) {
        int CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishCloudMessaging();
        int CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope();
        View view = null;
        for (int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB() - 1; CatchingFishDaggerHiltFAB >= 0; CatchingFishDaggerHiltFAB--) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB);
            int CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow);
            int CatchingFishSnackbar = this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow);
            if (CatchingFishSnackbar > CatchingFishCloudMessaging && CatchingFishDaggerWebsocket < CatchingFishViewModelScope) {
                if (CatchingFishSnackbar <= CatchingFishViewModelScope || !z) {
                    return CatchingFishCoroutineFlow;
                }
                if (view == null) {
                    view = CatchingFishCoroutineFlow;
                }
            }
        }
        return view;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMVVMAppCompat() {
        this.CatchingFishCardViewView.CatchingFishReduxKtor();
        CatchingFishRetrofit();
    }

    public final int CatchingFishMaterialDesign(int i) {
        int CatchingFishLayout = this.CatchingFishRoomDatabase[0].CatchingFishLayout(i);
        for (int i2 = 1; i2 < this.CatchingFishStateLiveData; i2++) {
            int CatchingFishLayout2 = this.CatchingFishRoomDatabase[i2].CatchingFishLayout(i);
            if (CatchingFishLayout2 < CatchingFishLayout) {
                CatchingFishLayout = CatchingFishLayout2;
            }
        }
        return CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMockkOkHttp(int i) {
        if (i == 0) {
            CatchingFishCameraX();
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMoshiDaggerHilt(int i, int i2) {
        CatchingFishCardView(i, i2, 2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMotionLayout(int i) {
        super.CatchingFishMotionLayout(i);
        for (int i2 = 0; i2 < this.CatchingFishStateLiveData; i2++) {
            CatchingFishGsonIntent catchingFishGsonIntent = this.CatchingFishRoomDatabase[i2];
            int i3 = catchingFishGsonIntent.CatchingFishSnackbar;
            if (i3 != Integer.MIN_VALUE) {
                catchingFishGsonIntent.CatchingFishSnackbar = i3 + i;
            }
            int i4 = catchingFishGsonIntent.CatchingFishCoroutine;
            if (i4 != Integer.MIN_VALUE) {
                catchingFishGsonIntent.CatchingFishCoroutine = i4 + i;
            }
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFishNavigation() {
        return this.CatchingFishJetpackCompose == 0 ? new CatchingFishDataStoreKtor(-2, -1) : new CatchingFishDataStoreKtor(-1, -2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishNavigationGson(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        CatchingFishWebsocket(catchingFishSnackbarCameraX, catchingFishReduxGlide, true);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishOkHttp(CatchingFishReduxGlide catchingFishReduxGlide) {
        if (CatchingFishDaggerHiltFAB() == 0) {
            return 0;
        }
        boolean z = !this.CatchingFishSensorManager;
        return CatchingFishHiltMVPToast.CatchingFishViewModelFAB(catchingFishReduxGlide, this.CatchingFishNavigation, CatchingFishDaggerAppCompat(z), CatchingFishMVPHandler(z), this, this.CatchingFishSensorManager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < CatchingFishContextToast()) != r3.CatchingFishParcelableFlux) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.CatchingFishParcelableFlux != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // kotlin.text.CatchingFishWidgetMVIGradle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF CatchingFishParcelableFAB(int i) {
        int i2 = -1;
        if (CatchingFishDaggerHiltFAB() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.CatchingFishJetpackCompose == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.CatchingFishSnackbar;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.CatchingFishDagger);
        }
        for (int i = 0; i < this.CatchingFishStateLiveData; i++) {
            this.CatchingFishRoomDatabase[i].CatchingFishSnackbar();
        }
        recyclerView.requestLayout();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishRedux(CatchingFishReduxGlide catchingFishReduxGlide) {
        this.CatchingFishCardViewRealm = -1;
        this.CatchingFishPayPal = Integer.MIN_VALUE;
        this.CatchingFishMutableLiveData = null;
        this.CatchingFishPayPalService.CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishReduxKtor() {
        return this.CatchingFishJetpackCompose == 0;
    }

    public final void CatchingFishRetrofitCameraX(int i, CatchingFishReduxGlide catchingFishReduxGlide) {
        int CatchingFishContextToast;
        int i2;
        if (i > 0) {
            CatchingFishContextToast = CatchingFishToolbar();
            i2 = 1;
        } else {
            CatchingFishContextToast = CatchingFishContextToast();
            i2 = -1;
        }
        CatchingFishAppCompatRealm catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
        catchingFishAppCompatRealm.CatchingFishParcelableFAB = true;
        CatchingFishGradleFirebase(CatchingFishContextToast, catchingFishReduxGlide);
        CatchingFishFragment(i2);
        catchingFishAppCompatRealm.CatchingFishCoroutine = CatchingFishContextToast + catchingFishAppCompatRealm.CatchingFishReduxKtor;
        catchingFishAppCompatRealm.CatchingFishSnackbar = Math.abs(i);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishServiceMVIJUnit(int i) {
        CatchingFishBiometricPayPal catchingFishBiometricPayPal = this.CatchingFishMutableLiveData;
        if (catchingFishBiometricPayPal != null && catchingFishBiometricPayPal.CatchingFishReduxKtor != i) {
            catchingFishBiometricPayPal.CatchingFishViewModelScope = null;
            catchingFishBiometricPayPal.CatchingFishWorkManager = 0;
            catchingFishBiometricPayPal.CatchingFishReduxKtor = -1;
            catchingFishBiometricPayPal.CatchingFishDaggerWebsocket = -1;
        }
        this.CatchingFishCardViewRealm = i;
        this.CatchingFishPayPal = Integer.MIN_VALUE;
        CatchingFishRetrofit();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishSharedFlow() {
        return this.CatchingFishMutableLiveData == null;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishStateFlowIntent(Rect rect, int i, int i2) {
        int CatchingFishViewModelScope;
        int CatchingFishViewModelScope2;
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData() + CatchingFishFragmentFactory();
        int CatchingFishCustomView = CatchingFishCustomView() + CatchingFishJobScheduler();
        int i3 = this.CatchingFishJetpackCompose;
        int i4 = this.CatchingFishStateLiveData;
        if (i3 == 1) {
            int height = rect.height() + CatchingFishCustomView;
            RecyclerView recyclerView = this.CatchingFishSnackbar;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            CatchingFishViewModelScope2 = CatchingFishKtorDataStore.CatchingFishViewModelScope(i2, height, recyclerView.getMinimumHeight());
            CatchingFishViewModelScope = CatchingFishKtorDataStore.CatchingFishViewModelScope(i, (this.CatchingFishCoroutineFlow * i4) + CatchingFishMutableLiveData, this.CatchingFishSnackbar.getMinimumWidth());
        } else {
            int width = rect.width() + CatchingFishMutableLiveData;
            RecyclerView recyclerView2 = this.CatchingFishSnackbar;
            WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            CatchingFishViewModelScope = CatchingFishKtorDataStore.CatchingFishViewModelScope(i, width, recyclerView2.getMinimumWidth());
            CatchingFishViewModelScope2 = CatchingFishKtorDataStore.CatchingFishViewModelScope(i2, (this.CatchingFishCoroutineFlow * i4) + CatchingFishCustomView, this.CatchingFishSnackbar.getMinimumHeight());
        }
        this.CatchingFishSnackbar.setMeasuredDimension(CatchingFishViewModelScope, CatchingFishViewModelScope2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishStripeAPI(int i, int i2) {
        CatchingFishCardView(i, i2, 8);
    }

    public final boolean CatchingFishStripeAPIWidget() {
        return CatchingFishMVPRobolectric() == 1;
    }

    public final int CatchingFishToolbar() {
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        if (CatchingFishDaggerHiltFAB == 0) {
            return 0;
        }
        return CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB - 1));
    }

    public final void CatchingFishToolbarEspresso(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, int i) {
        while (CatchingFishDaggerHiltFAB() > 0) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(0);
            if (this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow) > i || this.CatchingFishNavigation.CatchingFishOkHttp(CatchingFishCoroutineFlow) > i) {
                return;
            }
            CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) CatchingFishCoroutineFlow.getLayoutParams();
            catchingFishDataStoreKtor.getClass();
            if (((ArrayList) catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishWorkManager).size() == 1) {
                return;
            }
            CatchingFishGsonIntent catchingFishGsonIntent = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket;
            ArrayList arrayList = (ArrayList) catchingFishGsonIntent.CatchingFishWorkManager;
            View view = (View) arrayList.remove(0);
            CatchingFishDataStoreKtor catchingFishDataStoreKtor2 = (CatchingFishDataStoreKtor) view.getLayoutParams();
            catchingFishDataStoreKtor2.CatchingFishDaggerWebsocket = null;
            if (arrayList.size() == 0) {
                catchingFishGsonIntent.CatchingFishCoroutine = Integer.MIN_VALUE;
            }
            if (catchingFishDataStoreKtor2.CatchingFishParcelableFAB.CatchingFishViewModelFAB() || catchingFishDataStoreKtor2.CatchingFishParcelableFAB.CatchingFishCloudMessaging()) {
                catchingFishGsonIntent.CatchingFishReduxKtor -= ((StaggeredGridLayoutManager) catchingFishGsonIntent.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishCoroutine(view);
            }
            catchingFishGsonIntent.CatchingFishSnackbar = Integer.MIN_VALUE;
            CatchingFishFirebase(CatchingFishCoroutineFlow, catchingFishSnackbarCameraX);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishUnitTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishLifecycle(catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishKtorRealmView(i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishViewModelFAB(int i, int i2, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        CatchingFishAppCompatRealm catchingFishAppCompatRealm;
        int CatchingFishViewModelScope;
        int i3;
        if (this.CatchingFishJetpackCompose != 0) {
            i = i2;
        }
        if (CatchingFishDaggerHiltFAB() == 0 || i == 0) {
            return;
        }
        CatchingFishRetrofitCameraX(i, catchingFishReduxGlide);
        int[] iArr = this.CatchingFishEspressoMockk;
        if (iArr == null || iArr.length < this.CatchingFishStateLiveData) {
            this.CatchingFishEspressoMockk = new int[this.CatchingFishStateLiveData];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.CatchingFishStateLiveData;
            catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
            if (i4 >= i6) {
                break;
            }
            if (catchingFishAppCompatRealm.CatchingFishReduxKtor == -1) {
                CatchingFishViewModelScope = catchingFishAppCompatRealm.CatchingFishWorkManager;
                i3 = this.CatchingFishRoomDatabase[i4].CatchingFishLayout(CatchingFishViewModelScope);
            } else {
                CatchingFishViewModelScope = this.CatchingFishRoomDatabase[i4].CatchingFishViewModelScope(catchingFishAppCompatRealm.CatchingFishViewModelScope);
                i3 = catchingFishAppCompatRealm.CatchingFishViewModelScope;
            }
            int i7 = CatchingFishViewModelScope - i3;
            if (i7 >= 0) {
                this.CatchingFishEspressoMockk[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.CatchingFishEspressoMockk, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = catchingFishAppCompatRealm.CatchingFishCoroutine;
            if (i9 < 0 || i9 >= catchingFishReduxGlide.CatchingFishSnackbar()) {
                return;
            }
            catchingFishWidgetFAB.CatchingFishParcelableFAB(catchingFishAppCompatRealm.CatchingFishCoroutine, this.CatchingFishEspressoMockk[i8]);
            catchingFishAppCompatRealm.CatchingFishCoroutine += catchingFishAppCompatRealm.CatchingFishReduxKtor;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r11 < CatchingFishContextToast()) != r16.CatchingFishParcelableFlux) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0416, code lost:
    
        if (CatchingFishCameraX() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.CatchingFishParcelableFlux != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishWebsocket(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z) {
        CatchingFishBiometricPayPal catchingFishBiometricPayPal;
        int i;
        int i2;
        boolean z2;
        CatchingFishBiometricPayPal catchingFishBiometricPayPal2 = this.CatchingFishMutableLiveData;
        CatchingFishMockkHiltRealm catchingFishMockkHiltRealm = this.CatchingFishPayPalService;
        if (!(catchingFishBiometricPayPal2 == null && this.CatchingFishCardViewRealm == -1) && catchingFishReduxGlide.CatchingFishSnackbar() == 0) {
            CatchingFishReduxMoshi(catchingFishSnackbarCameraX);
            catchingFishMockkHiltRealm.CatchingFishParcelableFAB();
            return;
        }
        boolean z3 = catchingFishMockkHiltRealm.CatchingFishDaggerWebsocket;
        StaggeredGridLayoutManager staggeredGridLayoutManager = catchingFishMockkHiltRealm.CatchingFishViewModelScope;
        boolean z4 = true;
        boolean z5 = (z3 && this.CatchingFishCardViewRealm == -1 && this.CatchingFishMutableLiveData == null) ? false : true;
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishCardViewView;
        if (z5) {
            catchingFishMockkHiltRealm.CatchingFishParcelableFAB();
            CatchingFishBiometricPayPal catchingFishBiometricPayPal3 = this.CatchingFishMutableLiveData;
            if (catchingFishBiometricPayPal3 != null) {
                int i3 = catchingFishBiometricPayPal3.CatchingFishWorkManager;
                if (i3 > 0) {
                    if (i3 == this.CatchingFishStateLiveData) {
                        for (int i4 = 0; i4 < this.CatchingFishStateLiveData; i4++) {
                            this.CatchingFishRoomDatabase[i4].CatchingFishSnackbar();
                            CatchingFishBiometricPayPal catchingFishBiometricPayPal4 = this.CatchingFishMutableLiveData;
                            int i5 = catchingFishBiometricPayPal4.CatchingFishViewModelScope[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += catchingFishBiometricPayPal4.CatchingFishEspressoTesting ? this.CatchingFishNavigation.CatchingFishViewModelScope() : this.CatchingFishNavigation.CatchingFishCloudMessaging();
                            }
                            CatchingFishGsonIntent catchingFishGsonIntent = this.CatchingFishRoomDatabase[i4];
                            catchingFishGsonIntent.CatchingFishSnackbar = i5;
                            catchingFishGsonIntent.CatchingFishCoroutine = i5;
                        }
                    } else {
                        catchingFishBiometricPayPal3.CatchingFishViewModelScope = null;
                        catchingFishBiometricPayPal3.CatchingFishWorkManager = 0;
                        catchingFishBiometricPayPal3.CatchingFishViewModelFAB = 0;
                        catchingFishBiometricPayPal3.CatchingFishLayout = null;
                        catchingFishBiometricPayPal3.CatchingFishFragmentHandler = null;
                        catchingFishBiometricPayPal3.CatchingFishReduxKtor = catchingFishBiometricPayPal3.CatchingFishDaggerWebsocket;
                    }
                }
                CatchingFishBiometricPayPal catchingFishBiometricPayPal5 = this.CatchingFishMutableLiveData;
                this.CatchingFishFragmentFactory = catchingFishBiometricPayPal5.CatchingFishOkHttp;
                boolean z6 = catchingFishBiometricPayPal5.CatchingFishCloudMessaging;
                CatchingFishCoroutine(null);
                CatchingFishBiometricPayPal catchingFishBiometricPayPal6 = this.CatchingFishMutableLiveData;
                if (catchingFishBiometricPayPal6 != null && catchingFishBiometricPayPal6.CatchingFishCloudMessaging != z6) {
                    catchingFishBiometricPayPal6.CatchingFishCloudMessaging = z6;
                }
                this.CatchingFishSpannableWidget = z6;
                CatchingFishRetrofit();
                CatchingFishIntent();
                CatchingFishBiometricPayPal catchingFishBiometricPayPal7 = this.CatchingFishMutableLiveData;
                int i6 = catchingFishBiometricPayPal7.CatchingFishReduxKtor;
                if (i6 != -1) {
                    this.CatchingFishCardViewRealm = i6;
                    catchingFishMockkHiltRealm.CatchingFishCoroutine = catchingFishBiometricPayPal7.CatchingFishEspressoTesting;
                } else {
                    catchingFishMockkHiltRealm.CatchingFishCoroutine = this.CatchingFishParcelableFlux;
                }
                if (catchingFishBiometricPayPal7.CatchingFishViewModelFAB > 1) {
                    catchingFishViewModelIntent.CatchingFishDaggerWebsocket = catchingFishBiometricPayPal7.CatchingFishLayout;
                    catchingFishViewModelIntent.CatchingFishWorkManager = catchingFishBiometricPayPal7.CatchingFishFragmentHandler;
                }
            } else {
                CatchingFishIntent();
                catchingFishMockkHiltRealm.CatchingFishCoroutine = this.CatchingFishParcelableFlux;
            }
            if (!catchingFishReduxGlide.CatchingFishViewModelScope && (i2 = this.CatchingFishCardViewRealm) != -1) {
                if (i2 < 0 || i2 >= catchingFishReduxGlide.CatchingFishSnackbar()) {
                    this.CatchingFishCardViewRealm = -1;
                    this.CatchingFishPayPal = Integer.MIN_VALUE;
                } else {
                    CatchingFishBiometricPayPal catchingFishBiometricPayPal8 = this.CatchingFishMutableLiveData;
                    if (catchingFishBiometricPayPal8 == null || catchingFishBiometricPayPal8.CatchingFishReduxKtor == -1 || catchingFishBiometricPayPal8.CatchingFishWorkManager < 1) {
                        View CatchingFishRoomDatabase = CatchingFishRoomDatabase(this.CatchingFishCardViewRealm);
                        if (CatchingFishRoomDatabase != null) {
                            catchingFishMockkHiltRealm.CatchingFishParcelableFAB = this.CatchingFishParcelableFlux ? CatchingFishToolbar() : CatchingFishContextToast();
                            if (this.CatchingFishPayPal != Integer.MIN_VALUE) {
                                if (catchingFishMockkHiltRealm.CatchingFishCoroutine) {
                                    catchingFishMockkHiltRealm.CatchingFishSnackbar = (this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishPayPal) - this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishRoomDatabase);
                                } else {
                                    catchingFishMockkHiltRealm.CatchingFishSnackbar = (this.CatchingFishNavigation.CatchingFishCloudMessaging() + this.CatchingFishPayPal) - this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRoomDatabase);
                                }
                            } else if (this.CatchingFishNavigation.CatchingFishCoroutine(CatchingFishRoomDatabase) > this.CatchingFishNavigation.CatchingFishEspressoTesting()) {
                                catchingFishMockkHiltRealm.CatchingFishSnackbar = catchingFishMockkHiltRealm.CatchingFishCoroutine ? this.CatchingFishNavigation.CatchingFishViewModelScope() : this.CatchingFishNavigation.CatchingFishCloudMessaging();
                            } else {
                                int CatchingFishDaggerWebsocket = this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishRoomDatabase) - this.CatchingFishNavigation.CatchingFishCloudMessaging();
                                if (CatchingFishDaggerWebsocket < 0) {
                                    catchingFishMockkHiltRealm.CatchingFishSnackbar = -CatchingFishDaggerWebsocket;
                                } else {
                                    int CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope() - this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishRoomDatabase);
                                    if (CatchingFishViewModelScope < 0) {
                                        catchingFishMockkHiltRealm.CatchingFishSnackbar = CatchingFishViewModelScope;
                                    } else {
                                        catchingFishMockkHiltRealm.CatchingFishSnackbar = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.CatchingFishCardViewRealm;
                            catchingFishMockkHiltRealm.CatchingFishParcelableFAB = i7;
                            int i8 = this.CatchingFishPayPal;
                            if (i8 == Integer.MIN_VALUE) {
                                if (CatchingFishDaggerHiltFAB() == 0) {
                                }
                                catchingFishMockkHiltRealm.CatchingFishCoroutine = z2;
                                catchingFishMockkHiltRealm.CatchingFishSnackbar = z2 ? staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishViewModelScope() : staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishCloudMessaging();
                            } else if (catchingFishMockkHiltRealm.CatchingFishCoroutine) {
                                catchingFishMockkHiltRealm.CatchingFishSnackbar = staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishViewModelScope() - i8;
                            } else {
                                catchingFishMockkHiltRealm.CatchingFishSnackbar = staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishCloudMessaging() + i8;
                            }
                            catchingFishMockkHiltRealm.CatchingFishReduxKtor = true;
                        }
                    } else {
                        catchingFishMockkHiltRealm.CatchingFishSnackbar = Integer.MIN_VALUE;
                        catchingFishMockkHiltRealm.CatchingFishParcelableFAB = this.CatchingFishCardViewRealm;
                    }
                    catchingFishMockkHiltRealm.CatchingFishDaggerWebsocket = true;
                }
            }
            if (this.CatchingFishCustomView) {
                int CatchingFishSnackbar = catchingFishReduxGlide.CatchingFishSnackbar();
                for (int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB() - 1; CatchingFishDaggerHiltFAB >= 0; CatchingFishDaggerHiltFAB--) {
                    i = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB));
                    if (i >= 0 && i < CatchingFishSnackbar) {
                        break;
                    }
                }
                i = 0;
                catchingFishMockkHiltRealm.CatchingFishParcelableFAB = i;
                catchingFishMockkHiltRealm.CatchingFishSnackbar = Integer.MIN_VALUE;
                catchingFishMockkHiltRealm.CatchingFishDaggerWebsocket = true;
            } else {
                int CatchingFishSnackbar2 = catchingFishReduxGlide.CatchingFishSnackbar();
                int CatchingFishDaggerHiltFAB2 = CatchingFishDaggerHiltFAB();
                for (int i9 = 0; i9 < CatchingFishDaggerHiltFAB2; i9++) {
                    int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow(i9));
                    if (CatchingFishPayPalService >= 0 && CatchingFishPayPalService < CatchingFishSnackbar2) {
                        i = CatchingFishPayPalService;
                        break;
                    }
                }
                i = 0;
                catchingFishMockkHiltRealm.CatchingFishParcelableFAB = i;
                catchingFishMockkHiltRealm.CatchingFishSnackbar = Integer.MIN_VALUE;
                catchingFishMockkHiltRealm.CatchingFishDaggerWebsocket = true;
            }
        }
        if (this.CatchingFishMutableLiveData == null && this.CatchingFishCardViewRealm == -1 && (catchingFishMockkHiltRealm.CatchingFishCoroutine != this.CatchingFishCustomView || CatchingFishStripeAPIWidget() != this.CatchingFishFragmentFactory)) {
            catchingFishViewModelIntent.CatchingFishReduxKtor();
            catchingFishMockkHiltRealm.CatchingFishReduxKtor = true;
        }
        if (CatchingFishDaggerHiltFAB() > 0 && ((catchingFishBiometricPayPal = this.CatchingFishMutableLiveData) == null || catchingFishBiometricPayPal.CatchingFishWorkManager < 1)) {
            if (catchingFishMockkHiltRealm.CatchingFishReduxKtor) {
                for (int i10 = 0; i10 < this.CatchingFishStateLiveData; i10++) {
                    this.CatchingFishRoomDatabase[i10].CatchingFishSnackbar();
                    int i11 = catchingFishMockkHiltRealm.CatchingFishSnackbar;
                    if (i11 != Integer.MIN_VALUE) {
                        CatchingFishGsonIntent catchingFishGsonIntent2 = this.CatchingFishRoomDatabase[i10];
                        catchingFishGsonIntent2.CatchingFishSnackbar = i11;
                        catchingFishGsonIntent2.CatchingFishCoroutine = i11;
                    }
                }
            } else if (z5 || catchingFishMockkHiltRealm.CatchingFishWorkManager == null) {
                for (int i12 = 0; i12 < this.CatchingFishStateLiveData; i12++) {
                    CatchingFishGsonIntent catchingFishGsonIntent3 = this.CatchingFishRoomDatabase[i12];
                    boolean z7 = this.CatchingFishParcelableFlux;
                    int i13 = catchingFishMockkHiltRealm.CatchingFishSnackbar;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) catchingFishGsonIntent3.CatchingFishViewModelScope;
                    int CatchingFishViewModelScope2 = z7 ? catchingFishGsonIntent3.CatchingFishViewModelScope(Integer.MIN_VALUE) : catchingFishGsonIntent3.CatchingFishLayout(Integer.MIN_VALUE);
                    catchingFishGsonIntent3.CatchingFishSnackbar();
                    if (CatchingFishViewModelScope2 != Integer.MIN_VALUE && ((!z7 || CatchingFishViewModelScope2 >= staggeredGridLayoutManager2.CatchingFishNavigation.CatchingFishViewModelScope()) && (z7 || CatchingFishViewModelScope2 <= staggeredGridLayoutManager2.CatchingFishNavigation.CatchingFishCloudMessaging()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            CatchingFishViewModelScope2 += i13;
                        }
                        catchingFishGsonIntent3.CatchingFishCoroutine = CatchingFishViewModelScope2;
                        catchingFishGsonIntent3.CatchingFishSnackbar = CatchingFishViewModelScope2;
                    }
                }
                CatchingFishGsonIntent[] catchingFishGsonIntentArr = this.CatchingFishRoomDatabase;
                int length = catchingFishGsonIntentArr.length;
                int[] iArr = catchingFishMockkHiltRealm.CatchingFishWorkManager;
                if (iArr == null || iArr.length < length) {
                    catchingFishMockkHiltRealm.CatchingFishWorkManager = new int[staggeredGridLayoutManager.CatchingFishRoomDatabase.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    catchingFishMockkHiltRealm.CatchingFishWorkManager[i14] = catchingFishGsonIntentArr[i14].CatchingFishLayout(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.CatchingFishStateLiveData; i15++) {
                    CatchingFishGsonIntent catchingFishGsonIntent4 = this.CatchingFishRoomDatabase[i15];
                    catchingFishGsonIntent4.CatchingFishSnackbar();
                    int i16 = catchingFishMockkHiltRealm.CatchingFishWorkManager[i15];
                    catchingFishGsonIntent4.CatchingFishSnackbar = i16;
                    catchingFishGsonIntent4.CatchingFishCoroutine = i16;
                }
            }
        }
        CatchingFishStateLiveData(catchingFishSnackbarCameraX);
        CatchingFishAppCompatRealm catchingFishAppCompatRealm = this.CatchingFishDaggerHiltFAB;
        catchingFishAppCompatRealm.CatchingFishParcelableFAB = false;
        int CatchingFishEspressoTesting = this.CatchingFish.CatchingFishEspressoTesting();
        this.CatchingFishCoroutineFlow = CatchingFishEspressoTesting / this.CatchingFishStateLiveData;
        View.MeasureSpec.makeMeasureSpec(CatchingFishEspressoTesting, this.CatchingFish.CatchingFishLayout());
        CatchingFishGradleFirebase(catchingFishMockkHiltRealm.CatchingFishParcelableFAB, catchingFishReduxGlide);
        if (catchingFishMockkHiltRealm.CatchingFishCoroutine) {
            CatchingFishFragment(-1);
            CatchingFishKtor(catchingFishSnackbarCameraX, catchingFishAppCompatRealm, catchingFishReduxGlide);
            CatchingFishFragment(1);
            catchingFishAppCompatRealm.CatchingFishCoroutine = catchingFishMockkHiltRealm.CatchingFishParcelableFAB + catchingFishAppCompatRealm.CatchingFishReduxKtor;
            CatchingFishKtor(catchingFishSnackbarCameraX, catchingFishAppCompatRealm, catchingFishReduxGlide);
        } else {
            CatchingFishFragment(1);
            CatchingFishKtor(catchingFishSnackbarCameraX, catchingFishAppCompatRealm, catchingFishReduxGlide);
            CatchingFishFragment(-1);
            catchingFishAppCompatRealm.CatchingFishCoroutine = catchingFishMockkHiltRealm.CatchingFishParcelableFAB + catchingFishAppCompatRealm.CatchingFishReduxKtor;
            CatchingFishKtor(catchingFishSnackbarCameraX, catchingFishAppCompatRealm, catchingFishReduxGlide);
        }
        if (this.CatchingFish.CatchingFishLayout() != 1073741824) {
            int CatchingFishDaggerHiltFAB3 = CatchingFishDaggerHiltFAB();
            float f = 0.0f;
            for (int i17 = 0; i17 < CatchingFishDaggerHiltFAB3; i17++) {
                View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i17);
                float CatchingFishCoroutine = this.CatchingFish.CatchingFishCoroutine(CatchingFishCoroutineFlow);
                if (CatchingFishCoroutine >= f) {
                    ((CatchingFishDataStoreKtor) CatchingFishCoroutineFlow.getLayoutParams()).getClass();
                    f = Math.max(f, CatchingFishCoroutine);
                }
            }
            int i18 = this.CatchingFishCoroutineFlow;
            int round = Math.round(f * this.CatchingFishStateLiveData);
            if (this.CatchingFish.CatchingFishLayout() == Integer.MIN_VALUE) {
                round = Math.min(round, this.CatchingFish.CatchingFishEspressoTesting());
            }
            this.CatchingFishCoroutineFlow = round / this.CatchingFishStateLiveData;
            View.MeasureSpec.makeMeasureSpec(round, this.CatchingFish.CatchingFishLayout());
            if (this.CatchingFishCoroutineFlow != i18) {
                for (int i19 = 0; i19 < CatchingFishDaggerHiltFAB3; i19++) {
                    View CatchingFishCoroutineFlow2 = CatchingFishCoroutineFlow(i19);
                    CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) CatchingFishCoroutineFlow2.getLayoutParams();
                    catchingFishDataStoreKtor.getClass();
                    if (CatchingFishStripeAPIWidget() && this.CatchingFishJetpackCompose == 1) {
                        int i20 = -((this.CatchingFishStateLiveData - 1) - catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket);
                        CatchingFishCoroutineFlow2.offsetLeftAndRight((this.CatchingFishCoroutineFlow * i20) - (i20 * i18));
                    } else {
                        int i21 = catchingFishDataStoreKtor.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
                        int i22 = this.CatchingFishCoroutineFlow * i21;
                        int i23 = i21 * i18;
                        if (this.CatchingFishJetpackCompose == 1) {
                            CatchingFishCoroutineFlow2.offsetLeftAndRight(i22 - i23);
                        } else {
                            CatchingFishCoroutineFlow2.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (CatchingFishDaggerHiltFAB() > 0) {
            if (this.CatchingFishParcelableFlux) {
                CatchingFishLiveDataRoom(catchingFishSnackbarCameraX, catchingFishReduxGlide, true);
                CatchingFishGlideMVP(catchingFishSnackbarCameraX, catchingFishReduxGlide, false);
            } else {
                CatchingFishGlideMVP(catchingFishSnackbarCameraX, catchingFishReduxGlide, true);
                CatchingFishLiveDataRoom(catchingFishSnackbarCameraX, catchingFishReduxGlide, false);
            }
        }
        if (z && !catchingFishReduxGlide.CatchingFishViewModelScope && this.CatchingFishMVPRobolectric != 0 && CatchingFishDaggerHiltFAB() > 0 && CatchingFishLifecycleHilt() != null) {
            RecyclerView recyclerView = this.CatchingFishSnackbar;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.CatchingFishDagger);
            }
        }
        z4 = false;
        if (catchingFishReduxGlide.CatchingFishViewModelScope) {
            catchingFishMockkHiltRealm.CatchingFishParcelableFAB();
        }
        this.CatchingFishCustomView = catchingFishMockkHiltRealm.CatchingFishCoroutine;
        this.CatchingFishFragmentFactory = CatchingFishStripeAPIWidget();
        if (z4) {
            catchingFishMockkHiltRealm.CatchingFishParcelableFAB();
            CatchingFishWebsocket(catchingFishSnackbarCameraX, catchingFishReduxGlide, false);
        }
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishWorkManager(CatchingFishGradleDagger catchingFishGradleDagger) {
        return catchingFishGradleDagger instanceof CatchingFishDataStoreKtor;
    }
}
