package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.text.CatchingFishAnimationBundle;
import kotlin.text.CatchingFishAnimationMVVM;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishBiometricOkHttp;
import kotlin.text.CatchingFishBundleGlide;
import kotlin.text.CatchingFishCameraXBundle;
import kotlin.text.CatchingFishDaggerRetrofit;
import kotlin.text.CatchingFishDataStorePayPal;
import kotlin.text.CatchingFishEspressoIntent;
import kotlin.text.CatchingFishFirebaseKtor;
import kotlin.text.CatchingFishFluxAndroidX;
import kotlin.text.CatchingFishGradleKtor;
import kotlin.text.CatchingFishGraphQLBundle;
import kotlin.text.CatchingFishGsonAppCompat;
import kotlin.text.CatchingFishHandlerOkHttp;
import kotlin.text.CatchingFishKtorContext;
import kotlin.text.CatchingFishMVIContext;
import kotlin.text.CatchingFishMVPCardView;
import kotlin.text.CatchingFishMoshiIntentGson;
import kotlin.text.CatchingFishMoshiSharedFlow;
import kotlin.text.CatchingFishMoshiSpannable;
import kotlin.text.CatchingFishRetrofitDagger;
import kotlin.text.CatchingFishRetrofitHandler;
import kotlin.text.CatchingFishRobolectricHilt;
import kotlin.text.CatchingFishToolbarRoom;
import kotlin.text.CatchingFishViewModelMockk;
import kotlin.text.CatchingFishViewRoom;
import kotlin.text.CatchingFishWidgetExoPlayer;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static CatchingFishViewRoom CatchingFish;
    public int CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public final ArrayList CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final CatchingFishRetrofitDagger CatchingFishNavigation;
    public CatchingFishAnimationBundle CatchingFishOkHttp;
    public final SparseArray CatchingFishReduxKtor;
    public final SparseArray CatchingFishRoomDatabase;
    public HashMap CatchingFishStateLiveData;
    public CatchingFishBundleGlide CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final CatchingFishGsonAppCompat CatchingFishWorkManager;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CatchingFishReduxKtor = new SparseArray();
        this.CatchingFishDaggerWebsocket = new ArrayList(4);
        this.CatchingFishWorkManager = new CatchingFishGsonAppCompat();
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishLayout = Integer.MAX_VALUE;
        this.CatchingFishFragmentHandler = Integer.MAX_VALUE;
        this.CatchingFishCloudMessaging = true;
        this.CatchingFishEspressoTesting = 257;
        this.CatchingFishOkHttp = null;
        this.CatchingFishUnitTesting = null;
        this.CatchingFishAnimationMockk = -1;
        this.CatchingFishStateLiveData = new HashMap();
        this.CatchingFishRoomDatabase = new SparseArray();
        this.CatchingFishNavigation = new CatchingFishRetrofitDagger(this, this);
        CatchingFishLayout(attributeSet, 0);
    }

    public static CatchingFishGraphQLBundle CatchingFishReduxKtor() {
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = new CatchingFishGraphQLBundle(-2, -2);
        catchingFishGraphQLBundle.CatchingFishParcelableFAB = -1;
        catchingFishGraphQLBundle.CatchingFishSnackbar = -1;
        catchingFishGraphQLBundle.CatchingFishCoroutine = -1.0f;
        catchingFishGraphQLBundle.CatchingFishReduxKtor = true;
        catchingFishGraphQLBundle.CatchingFishDaggerWebsocket = -1;
        catchingFishGraphQLBundle.CatchingFishWorkManager = -1;
        catchingFishGraphQLBundle.CatchingFishViewModelScope = -1;
        catchingFishGraphQLBundle.CatchingFishViewModelFAB = -1;
        catchingFishGraphQLBundle.CatchingFishLayout = -1;
        catchingFishGraphQLBundle.CatchingFishFragmentHandler = -1;
        catchingFishGraphQLBundle.CatchingFishCloudMessaging = -1;
        catchingFishGraphQLBundle.CatchingFishEspressoTesting = -1;
        catchingFishGraphQLBundle.CatchingFishOkHttp = -1;
        catchingFishGraphQLBundle.CatchingFishUnitTesting = -1;
        catchingFishGraphQLBundle.CatchingFishAnimationMockk = -1;
        catchingFishGraphQLBundle.CatchingFishStateLiveData = -1;
        catchingFishGraphQLBundle.CatchingFishRoomDatabase = 0;
        catchingFishGraphQLBundle.CatchingFishNavigation = 0.0f;
        catchingFishGraphQLBundle.CatchingFish = -1;
        catchingFishGraphQLBundle.CatchingFishJetpackCompose = -1;
        catchingFishGraphQLBundle.CatchingFishCoroutineFlow = -1;
        catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB = -1;
        catchingFishGraphQLBundle.CatchingFishSpannableWidget = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishParcelableFlux = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCardViewRealm = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishPayPal = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCardViewView = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishMVPRobolectric = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCustomView = 0;
        catchingFishGraphQLBundle.CatchingFishFragmentFactory = 0.5f;
        catchingFishGraphQLBundle.CatchingFishMutableLiveData = 0.5f;
        catchingFishGraphQLBundle.CatchingFishJobScheduler = null;
        catchingFishGraphQLBundle.CatchingFishPayPalService = -1.0f;
        catchingFishGraphQLBundle.CatchingFishSensorManager = -1.0f;
        catchingFishGraphQLBundle.CatchingFishEspressoMockk = 0;
        catchingFishGraphQLBundle.CatchingFishDagger = 0;
        catchingFishGraphQLBundle.CatchingFishCameraXIntent = 0;
        catchingFishGraphQLBundle.CatchingFishHandler = 0;
        catchingFishGraphQLBundle.CatchingFishPayPalLiveData = 0;
        catchingFishGraphQLBundle.CatchingFishGradleManifest = 0;
        catchingFishGraphQLBundle.CatchingFishMotionLayout = 0;
        catchingFishGraphQLBundle.CatchingFishLayoutInflater = 0;
        catchingFishGraphQLBundle.CatchingFishParcelable = 1.0f;
        catchingFishGraphQLBundle.CatchingFishRecyclerView = 1.0f;
        catchingFishGraphQLBundle.CatchingFishAppCompat = -1;
        catchingFishGraphQLBundle.CatchingFishDataStoreIntent = -1;
        catchingFishGraphQLBundle.CatchingFishStateFlow = -1;
        catchingFishGraphQLBundle.CatchingFishJUnitRealm = false;
        catchingFishGraphQLBundle.CatchingFishAnimation = false;
        catchingFishGraphQLBundle.CatchingFishMVVMAppCompat = null;
        catchingFishGraphQLBundle.CatchingFishStripeAPI = 0;
        catchingFishGraphQLBundle.CatchingFishMoshiDaggerHilt = true;
        catchingFishGraphQLBundle.CatchingFishAndroidX = true;
        catchingFishGraphQLBundle.CatchingFishNavigationGson = false;
        catchingFishGraphQLBundle.CatchingFishRedux = false;
        catchingFishGraphQLBundle.CatchingFishCustomViewJUnit = false;
        catchingFishGraphQLBundle.CatchingFishDaggerMVVM = -1;
        catchingFishGraphQLBundle.CatchingFishMockkOkHttp = -1;
        catchingFishGraphQLBundle.CatchingFishReduxMoshi = -1;
        catchingFishGraphQLBundle.CatchingFishPicasso = -1;
        catchingFishGraphQLBundle.CatchingFishFirebase = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishRetrofitMVI = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishGradleLiveData = 0.5f;
        catchingFishGraphQLBundle.CatchingFishGlideWidgetKtor = new CatchingFishDaggerRetrofit();
        return catchingFishGraphQLBundle;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static CatchingFishViewRoom getSharedValues() {
        if (CatchingFish == null) {
            CatchingFishViewRoom catchingFishViewRoom = new CatchingFishViewRoom();
            new SparseIntArray();
            new HashMap();
            CatchingFish = catchingFishViewRoom;
        }
        return CatchingFish;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCloudMessaging(CatchingFishGsonAppCompat catchingFishGsonAppCompat, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        char c;
        boolean z;
        int i7;
        int i8;
        boolean z2;
        ArrayList arrayList;
        CatchingFishRetrofitDagger catchingFishRetrofitDagger;
        int i9;
        boolean z3;
        int i10;
        int i11;
        CatchingFishRetrofitDagger catchingFishRetrofitDagger2;
        int i12;
        boolean z4;
        int i13;
        CatchingFishRetrofitDagger catchingFishRetrofitDagger3;
        CatchingFishCameraXBundle catchingFishCameraXBundle;
        CatchingFishMVPCardView catchingFishMVPCardView;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z5;
        int size;
        int i21;
        int size2;
        int i22;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i23 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        CatchingFishRetrofitDagger catchingFishRetrofitDagger4 = this.CatchingFishNavigation;
        catchingFishRetrofitDagger4.CatchingFishSnackbar = max3;
        catchingFishRetrofitDagger4.CatchingFishCoroutine = max4;
        catchingFishRetrofitDagger4.CatchingFishReduxKtor = paddingWidth;
        catchingFishRetrofitDagger4.CatchingFishDaggerWebsocket = i23;
        catchingFishRetrofitDagger4.CatchingFishWorkManager = i2;
        catchingFishRetrofitDagger4.CatchingFishViewModelScope = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i24 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i25 = size3 - paddingWidth;
        int i26 = size4 - i23;
        int i27 = catchingFishRetrofitDagger4.CatchingFishDaggerWebsocket;
        int i28 = catchingFishRetrofitDagger4.CatchingFishReduxKtor;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.CatchingFishLayout - i28, i25);
                    i24 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.CatchingFishViewModelScope);
                i4 = max;
                i24 = 2;
            } else {
                i4 = 0;
                i24 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.CatchingFishViewModelScope);
            i4 = max;
            i24 = 2;
        } else {
            i4 = i25;
            i24 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.CatchingFishFragmentHandler - i27, i26);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.CatchingFishViewModelFAB);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.CatchingFishViewModelFAB);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i26;
            i6 = 2;
        }
        int CatchingFishRoomDatabase = catchingFishGsonAppCompat.CatchingFishRoomDatabase();
        int[] iArr = catchingFishGsonAppCompat.CatchingFishMVPRobolectric;
        CatchingFishMoshiIntentGson catchingFishMoshiIntentGson = catchingFishGsonAppCompat.CatchingFishStateFlowIntent;
        int i29 = i4;
        if (i29 == CatchingFishRoomDatabase && i5 == catchingFishGsonAppCompat.CatchingFishCloudMessaging()) {
            c = 1;
        } else {
            catchingFishMoshiIntentGson.CatchingFishCoroutine = true;
            c = 1;
        }
        catchingFishGsonAppCompat.CatchingFishMVVMAppCompat = 0;
        catchingFishGsonAppCompat.CatchingFishStripeAPI = 0;
        iArr[0] = this.CatchingFishLayout - i28;
        iArr[c] = this.CatchingFishFragmentHandler - i27;
        catchingFishGsonAppCompat.CatchingFishAndroidX = 0;
        catchingFishGsonAppCompat.CatchingFishNavigationGson = 0;
        catchingFishGsonAppCompat.CatchingFishHandler(i24);
        catchingFishGsonAppCompat.CatchingFishGradleManifest(i29);
        catchingFishGsonAppCompat.CatchingFishPayPalLiveData(i6);
        catchingFishGsonAppCompat.CatchingFishCameraXIntent(i5);
        int i30 = this.CatchingFishViewModelScope - i28;
        if (i30 < 0) {
            catchingFishGsonAppCompat.CatchingFishAndroidX = 0;
        } else {
            catchingFishGsonAppCompat.CatchingFishAndroidX = i30;
        }
        int i31 = this.CatchingFishViewModelFAB - i27;
        if (i31 < 0) {
            catchingFishGsonAppCompat.CatchingFishNavigationGson = 0;
        } else {
            catchingFishGsonAppCompat.CatchingFishNavigationGson = i31;
        }
        catchingFishGsonAppCompat.CatchingFishRealmKtorRealm = max5;
        catchingFishGsonAppCompat.CatchingFishDynamicFeature = max3;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishGsonAppCompat.CatchingFishGraphQLGlide;
        CatchingFishGsonAppCompat catchingFishGsonAppCompat2 = (CatchingFishGsonAppCompat) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
        ArrayList arrayList2 = (ArrayList) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        CatchingFishRetrofitDagger catchingFishRetrofitDagger5 = catchingFishGsonAppCompat.CatchingFishKtorService;
        int size5 = catchingFishGsonAppCompat.CatchingFishFABLayout.size();
        int CatchingFishRoomDatabase2 = catchingFishGsonAppCompat.CatchingFishRoomDatabase();
        int CatchingFishCloudMessaging = catchingFishGsonAppCompat.CatchingFishCloudMessaging();
        boolean CatchingFishNavigation = CatchingFishRobolectricHilt.CatchingFishNavigation(i, 128);
        boolean z6 = CatchingFishNavigation || CatchingFishRobolectricHilt.CatchingFishNavigation(i, 64);
        if (z6) {
            int i32 = 0;
            while (i32 < size5) {
                boolean z7 = z6;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) catchingFishGsonAppCompat.CatchingFishFABLayout.get(i32);
                int i33 = i32;
                int[] iArr2 = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
                i7 = size5;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f;
                if ((catchingFishDaggerRetrofit.CatchingFishParcelableFlux() && z8) || ((catchingFishDaggerRetrofit.CatchingFishGsonAppCompat() && z8) || (catchingFishDaggerRetrofit instanceof CatchingFishBiometricOkHttp) || catchingFishDaggerRetrofit.CatchingFishParcelableFlux() || catchingFishDaggerRetrofit.CatchingFishGsonAppCompat())) {
                    i8 = 1073741824;
                    z = false;
                    break;
                } else {
                    i32 = i33 + 1;
                    z6 = z7;
                    size5 = i7;
                }
            }
        }
        z = z6;
        i7 = size5;
        i8 = 1073741824;
        boolean z9 = z & ((mode == i8 && mode2 == i8) || CatchingFishNavigation);
        if (z9) {
            int min = Math.min(iArr[0], i25);
            int min2 = Math.min(iArr[1], i26);
            int i34 = 1073741824;
            if (mode == 1073741824) {
                if (catchingFishGsonAppCompat.CatchingFishRoomDatabase() != min) {
                    catchingFishGsonAppCompat.CatchingFishGradleManifest(min);
                    catchingFishGsonAppCompat.CatchingFishStateFlowIntent.CatchingFishSnackbar = true;
                }
                i34 = 1073741824;
            }
            if (mode2 == i34 && catchingFishGsonAppCompat.CatchingFishCloudMessaging() != min2) {
                catchingFishGsonAppCompat.CatchingFishCameraXIntent(min2);
                catchingFishGsonAppCompat.CatchingFishStateFlowIntent.CatchingFishSnackbar = true;
            }
            if (mode == i34 && mode2 == i34) {
                ArrayList arrayList3 = catchingFishMoshiIntentGson.CatchingFishDaggerWebsocket;
                CatchingFishGsonAppCompat catchingFishGsonAppCompat3 = catchingFishMoshiIntentGson.CatchingFishParcelableFAB;
                if (catchingFishMoshiIntentGson.CatchingFishSnackbar || catchingFishMoshiIntentGson.CatchingFishCoroutine) {
                    ArrayList arrayList4 = catchingFishGsonAppCompat3.CatchingFishFABLayout;
                    int size6 = arrayList4.size();
                    z2 = z9;
                    int i35 = 0;
                    while (i35 < size6) {
                        Object obj = arrayList4.get(i35);
                        int i36 = i35 + 1;
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = (CatchingFishDaggerRetrofit) obj;
                        catchingFishDaggerRetrofit2.CatchingFishViewModelFAB();
                        catchingFishDaggerRetrofit2.CatchingFishParcelableFAB = false;
                        catchingFishDaggerRetrofit2.CatchingFishReduxKtor.CatchingFishUnitTesting();
                        catchingFishDaggerRetrofit2.CatchingFishDaggerWebsocket.CatchingFishOkHttp();
                        arrayList4 = arrayList4;
                        i35 = i36;
                    }
                    catchingFishGsonAppCompat3.CatchingFishViewModelFAB();
                    i16 = 0;
                    catchingFishGsonAppCompat3.CatchingFishParcelableFAB = false;
                    catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishUnitTesting();
                    catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishOkHttp();
                    catchingFishMoshiIntentGson.CatchingFishCoroutine = false;
                } else {
                    z2 = z9;
                    i16 = 0;
                }
                catchingFishMoshiIntentGson.CatchingFishSnackbar(catchingFishMoshiIntentGson.CatchingFishReduxKtor);
                catchingFishGsonAppCompat3.CatchingFishMVVMAppCompat = i16;
                int[] iArr3 = catchingFishGsonAppCompat3.CatchingFishGlideWidgetKtor;
                catchingFishGsonAppCompat3.CatchingFishStripeAPI = i16;
                int CatchingFishFragmentHandler = catchingFishGsonAppCompat3.CatchingFishFragmentHandler(i16);
                int CatchingFishFragmentHandler2 = catchingFishGsonAppCompat3.CatchingFishFragmentHandler(1);
                if (catchingFishMoshiIntentGson.CatchingFishSnackbar) {
                    catchingFishMoshiIntentGson.CatchingFishCoroutine();
                }
                int CatchingFishNavigation2 = catchingFishGsonAppCompat3.CatchingFishNavigation();
                catchingFishRetrofitDagger = catchingFishRetrofitDagger5;
                int CatchingFish2 = catchingFishGsonAppCompat3.CatchingFish();
                arrayList = arrayList2;
                catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishViewModelFAB.CatchingFishReduxKtor(CatchingFishNavigation2);
                catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishViewModelFAB.CatchingFishReduxKtor(CatchingFish2);
                catchingFishMoshiIntentGson.CatchingFishViewModelScope();
                if (CatchingFishFragmentHandler == 2 || CatchingFishFragmentHandler2 == 2) {
                    if (CatchingFishNavigation) {
                        int size7 = arrayList3.size();
                        i17 = CatchingFishNavigation2;
                        int i37 = 0;
                        while (true) {
                            if (i37 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i37);
                            i37++;
                            if (!((CatchingFishDataStorePayPal) obj2).CatchingFishCloudMessaging()) {
                                CatchingFishNavigation = false;
                                break;
                            }
                        }
                    } else {
                        i17 = CatchingFishNavigation2;
                    }
                    if (CatchingFishNavigation && CatchingFishFragmentHandler == 2) {
                        catchingFishGsonAppCompat3.CatchingFishHandler(1);
                        catchingFishGsonAppCompat3.CatchingFishGradleManifest(catchingFishMoshiIntentGson.CatchingFishReduxKtor(catchingFishGsonAppCompat3, 0));
                        catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishGsonAppCompat3.CatchingFishRoomDatabase());
                    }
                    if (CatchingFishNavigation && CatchingFishFragmentHandler2 == 2) {
                        i18 = 1;
                        catchingFishGsonAppCompat3.CatchingFishPayPalLiveData(1);
                        catchingFishGsonAppCompat3.CatchingFishCameraXIntent(catchingFishMoshiIntentGson.CatchingFishReduxKtor(catchingFishGsonAppCompat3, 1));
                        catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishGsonAppCompat3.CatchingFishCloudMessaging());
                        i19 = iArr3[0];
                        if (i19 != i18 || i19 == 4) {
                            int CatchingFishRoomDatabase3 = catchingFishGsonAppCompat3.CatchingFishRoomDatabase() + i17;
                            catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishRoomDatabase3);
                            catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(CatchingFishRoomDatabase3 - i17);
                            catchingFishMoshiIntentGson.CatchingFishViewModelScope();
                            i20 = iArr3[1];
                            if (i20 != 1 || i20 == 4) {
                                int CatchingFishCloudMessaging2 = catchingFishGsonAppCompat3.CatchingFishCloudMessaging() + CatchingFish2;
                                catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishCloudMessaging2);
                                catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(CatchingFishCloudMessaging2 - CatchingFish2);
                            }
                            catchingFishMoshiIntentGson.CatchingFishViewModelScope();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        size = arrayList3.size();
                        i21 = 0;
                        while (i21 < size) {
                            Object obj3 = arrayList3.get(i21);
                            i21++;
                            CatchingFishDataStorePayPal catchingFishDataStorePayPal = (CatchingFishDataStorePayPal) obj3;
                            if (catchingFishDataStorePayPal.CatchingFishSnackbar != catchingFishGsonAppCompat3 || catchingFishDataStorePayPal.CatchingFishViewModelScope) {
                                catchingFishDataStorePayPal.CatchingFishDaggerWebsocket();
                            }
                        }
                        size2 = arrayList3.size();
                        i22 = 0;
                        while (i22 < size2) {
                            Object obj4 = arrayList3.get(i22);
                            i22++;
                            CatchingFishDataStorePayPal catchingFishDataStorePayPal2 = (CatchingFishDataStorePayPal) obj4;
                            if (z5 || catchingFishDataStorePayPal2.CatchingFishSnackbar != catchingFishGsonAppCompat3) {
                                if (!catchingFishDataStorePayPal2.CatchingFishViewModelFAB.CatchingFishFragmentHandler || ((!catchingFishDataStorePayPal2.CatchingFishLayout.CatchingFishFragmentHandler && !(catchingFishDataStorePayPal2 instanceof CatchingFishFirebaseKtor)) || (!catchingFishDataStorePayPal2.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler && !(catchingFishDataStorePayPal2 instanceof CatchingFishEspressoIntent) && !(catchingFishDataStorePayPal2 instanceof CatchingFishFirebaseKtor)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        catchingFishGsonAppCompat3.CatchingFishHandler(CatchingFishFragmentHandler);
                        catchingFishGsonAppCompat3.CatchingFishPayPalLiveData(CatchingFishFragmentHandler2);
                        i9 = 2;
                        i15 = 1073741824;
                    }
                } else {
                    i17 = CatchingFishNavigation2;
                }
                i18 = 1;
                i19 = iArr3[0];
                if (i19 != i18) {
                }
                int CatchingFishRoomDatabase32 = catchingFishGsonAppCompat3.CatchingFishRoomDatabase() + i17;
                catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishRoomDatabase32);
                catchingFishGsonAppCompat3.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(CatchingFishRoomDatabase32 - i17);
                catchingFishMoshiIntentGson.CatchingFishViewModelScope();
                i20 = iArr3[1];
                if (i20 != 1) {
                }
                int CatchingFishCloudMessaging22 = catchingFishGsonAppCompat3.CatchingFishCloudMessaging() + CatchingFish2;
                catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishCloudMessaging22);
                catchingFishGsonAppCompat3.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishReduxKtor(CatchingFishCloudMessaging22 - CatchingFish2);
                catchingFishMoshiIntentGson.CatchingFishViewModelScope();
                z5 = true;
                size = arrayList3.size();
                i21 = 0;
                while (i21 < size) {
                }
                size2 = arrayList3.size();
                i22 = 0;
                while (i22 < size2) {
                }
                z3 = true;
                catchingFishGsonAppCompat3.CatchingFishHandler(CatchingFishFragmentHandler);
                catchingFishGsonAppCompat3.CatchingFishPayPalLiveData(CatchingFishFragmentHandler2);
                i9 = 2;
                i15 = 1073741824;
            } else {
                z2 = z9;
                arrayList = arrayList2;
                catchingFishRetrofitDagger = catchingFishRetrofitDagger5;
                CatchingFishGsonAppCompat catchingFishGsonAppCompat4 = catchingFishMoshiIntentGson.CatchingFishParcelableFAB;
                if (catchingFishMoshiIntentGson.CatchingFishSnackbar) {
                    ArrayList arrayList5 = catchingFishGsonAppCompat4.CatchingFishFABLayout;
                    int size8 = arrayList5.size();
                    int i38 = 0;
                    while (i38 < size8) {
                        Object obj5 = arrayList5.get(i38);
                        i38++;
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3 = (CatchingFishDaggerRetrofit) obj5;
                        catchingFishDaggerRetrofit3.CatchingFishViewModelFAB();
                        catchingFishDaggerRetrofit3.CatchingFishParcelableFAB = false;
                        CatchingFishCameraXBundle catchingFishCameraXBundle2 = catchingFishDaggerRetrofit3.CatchingFishReduxKtor;
                        ArrayList arrayList6 = arrayList5;
                        catchingFishCameraXBundle2.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler = false;
                        catchingFishCameraXBundle2.CatchingFishViewModelScope = false;
                        catchingFishCameraXBundle2.CatchingFishUnitTesting();
                        CatchingFishMVPCardView catchingFishMVPCardView2 = catchingFishDaggerRetrofit3.CatchingFishDaggerWebsocket;
                        catchingFishMVPCardView2.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler = false;
                        catchingFishMVPCardView2.CatchingFishViewModelScope = false;
                        catchingFishMVPCardView2.CatchingFishOkHttp();
                        arrayList5 = arrayList6;
                    }
                    i14 = 0;
                    catchingFishGsonAppCompat4.CatchingFishViewModelFAB();
                    catchingFishGsonAppCompat4.CatchingFishParcelableFAB = false;
                    CatchingFishCameraXBundle catchingFishCameraXBundle3 = catchingFishGsonAppCompat4.CatchingFishReduxKtor;
                    catchingFishCameraXBundle3.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler = false;
                    catchingFishCameraXBundle3.CatchingFishViewModelScope = false;
                    catchingFishCameraXBundle3.CatchingFishUnitTesting();
                    CatchingFishMVPCardView catchingFishMVPCardView3 = catchingFishGsonAppCompat4.CatchingFishDaggerWebsocket;
                    catchingFishMVPCardView3.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler = false;
                    catchingFishMVPCardView3.CatchingFishViewModelScope = false;
                    catchingFishMVPCardView3.CatchingFishOkHttp();
                    catchingFishMoshiIntentGson.CatchingFishCoroutine();
                } else {
                    i14 = 0;
                }
                catchingFishMoshiIntentGson.CatchingFishSnackbar(catchingFishMoshiIntentGson.CatchingFishReduxKtor);
                catchingFishGsonAppCompat4.CatchingFishMVVMAppCompat = i14;
                catchingFishGsonAppCompat4.CatchingFishStripeAPI = i14;
                catchingFishGsonAppCompat4.CatchingFishReduxKtor.CatchingFishViewModelFAB.CatchingFishReduxKtor(i14);
                catchingFishGsonAppCompat4.CatchingFishDaggerWebsocket.CatchingFishViewModelFAB.CatchingFishReduxKtor(i14);
                i15 = 1073741824;
                if (mode == 1073741824) {
                    z3 = catchingFishGsonAppCompat.CatchingFishAppCompat(i14, CatchingFishNavigation);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= catchingFishGsonAppCompat.CatchingFishAppCompat(1, CatchingFishNavigation);
                    i9++;
                }
            }
            if (z3) {
                catchingFishGsonAppCompat.CatchingFishMotionLayout(mode == i15, mode2 == i15);
            }
        } else {
            z2 = z9;
            arrayList = arrayList2;
            catchingFishRetrofitDagger = catchingFishRetrofitDagger5;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i39 = catchingFishGsonAppCompat.CatchingFishKtor;
        if (i7 > 0) {
            int size9 = catchingFishGsonAppCompat.CatchingFishFABLayout.size();
            boolean CatchingFishJUnitRealm = catchingFishGsonAppCompat.CatchingFishJUnitRealm(64);
            CatchingFishRetrofitDagger catchingFishRetrofitDagger6 = catchingFishGsonAppCompat.CatchingFishKtorService;
            for (int i40 = 0; i40 < size9; i40++) {
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit4 = (CatchingFishDaggerRetrofit) catchingFishGsonAppCompat.CatchingFishFABLayout.get(i40);
                if (!(catchingFishDaggerRetrofit4 instanceof CatchingFishViewModelMockk) && !(catchingFishDaggerRetrofit4 instanceof CatchingFishAnimationMVVM) && !catchingFishDaggerRetrofit4.CatchingFishMutableLiveData && (!CatchingFishJUnitRealm || (catchingFishCameraXBundle = catchingFishDaggerRetrofit4.CatchingFishReduxKtor) == null || (catchingFishMVPCardView = catchingFishDaggerRetrofit4.CatchingFishDaggerWebsocket) == null || !catchingFishCameraXBundle.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler || !catchingFishMVPCardView.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler)) {
                    int CatchingFishFragmentHandler3 = catchingFishDaggerRetrofit4.CatchingFishFragmentHandler(0);
                    int CatchingFishFragmentHandler4 = catchingFishDaggerRetrofit4.CatchingFishFragmentHandler(1);
                    boolean z10 = CatchingFishFragmentHandler3 == 3 && catchingFishDaggerRetrofit4.CatchingFishNavigation != 1 && CatchingFishFragmentHandler4 == 3 && catchingFishDaggerRetrofit4.CatchingFish != 1;
                    if (!z10 && catchingFishGsonAppCompat.CatchingFishJUnitRealm(1) && !(catchingFishDaggerRetrofit4 instanceof CatchingFishBiometricOkHttp)) {
                        if (CatchingFishFragmentHandler3 == 3 && catchingFishDaggerRetrofit4.CatchingFishNavigation == 0 && CatchingFishFragmentHandler4 != 3 && !catchingFishDaggerRetrofit4.CatchingFishParcelableFlux()) {
                            z10 = true;
                        }
                        if (CatchingFishFragmentHandler4 == 3 && catchingFishDaggerRetrofit4.CatchingFish == 0 && CatchingFishFragmentHandler3 != 3 && !catchingFishDaggerRetrofit4.CatchingFishParcelableFlux()) {
                            z10 = true;
                        }
                        if ((CatchingFishFragmentHandler3 == 3 || CatchingFishFragmentHandler4 == 3) && catchingFishDaggerRetrofit4.CatchingFishJUnitRealm > 0.0f) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        catchingFishAsyncTaskDagger.CatchingFishParcelable(0, catchingFishRetrofitDagger6, catchingFishDaggerRetrofit4);
                    }
                }
            }
            ConstraintLayout constraintLayout = catchingFishRetrofitDagger6.CatchingFishParcelableFAB;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.CatchingFishDaggerWebsocket;
            for (int i41 = 0; i41 < childCount2; i41++) {
                constraintLayout.getChildAt(i41);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i42 = 0; i42 < size10; i42++) {
                    ((CatchingFishKtorContext) arrayList7.get(i42)).getClass();
                }
            }
        }
        catchingFishAsyncTaskDagger.CatchingFishReduxMoshi(catchingFishGsonAppCompat);
        int size11 = arrayList.size();
        if (i7 > 0) {
            catchingFishAsyncTaskDagger.CatchingFishDaggerMVVM(catchingFishGsonAppCompat, 0, CatchingFishRoomDatabase2, CatchingFishCloudMessaging);
        }
        if (size11 > 0) {
            int[] iArr4 = catchingFishGsonAppCompat.CatchingFishGlideWidgetKtor;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int max7 = Math.max(catchingFishGsonAppCompat.CatchingFishRoomDatabase(), catchingFishGsonAppCompat2.CatchingFishAndroidX);
            int max8 = Math.max(catchingFishGsonAppCompat.CatchingFishCloudMessaging(), catchingFishGsonAppCompat2.CatchingFishNavigationGson);
            int i43 = 0;
            boolean z13 = false;
            while (i43 < size11) {
                ArrayList arrayList8 = arrayList;
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit5 = (CatchingFishDaggerRetrofit) arrayList8.get(i43);
                if (catchingFishDaggerRetrofit5 instanceof CatchingFishBiometricOkHttp) {
                    int CatchingFishRoomDatabase4 = catchingFishDaggerRetrofit5.CatchingFishRoomDatabase();
                    int CatchingFishCloudMessaging3 = catchingFishDaggerRetrofit5.CatchingFishCloudMessaging();
                    z4 = z12;
                    i13 = i43;
                    catchingFishRetrofitDagger3 = catchingFishRetrofitDagger;
                    boolean CatchingFishParcelable = z13 | catchingFishAsyncTaskDagger.CatchingFishParcelable(1, catchingFishRetrofitDagger3, catchingFishDaggerRetrofit5);
                    int CatchingFishRoomDatabase5 = catchingFishDaggerRetrofit5.CatchingFishRoomDatabase();
                    boolean z14 = CatchingFishParcelable;
                    int CatchingFishCloudMessaging4 = catchingFishDaggerRetrofit5.CatchingFishCloudMessaging();
                    if (CatchingFishRoomDatabase5 != CatchingFishRoomDatabase4) {
                        catchingFishDaggerRetrofit5.CatchingFishGradleManifest(CatchingFishRoomDatabase5);
                        if (z11 && catchingFishDaggerRetrofit5.CatchingFishNavigation() + catchingFishDaggerRetrofit5.CatchingFishDataStoreIntent > max7) {
                            max7 = Math.max(max7, catchingFishDaggerRetrofit5.CatchingFishLayout(4).CatchingFishDaggerWebsocket() + catchingFishDaggerRetrofit5.CatchingFishNavigation() + catchingFishDaggerRetrofit5.CatchingFishDataStoreIntent);
                        }
                        z14 = true;
                    }
                    if (CatchingFishCloudMessaging4 != CatchingFishCloudMessaging3) {
                        catchingFishDaggerRetrofit5.CatchingFishCameraXIntent(CatchingFishCloudMessaging4);
                        if (z4 && catchingFishDaggerRetrofit5.CatchingFish() + catchingFishDaggerRetrofit5.CatchingFishStateFlow > max8) {
                            max8 = Math.max(max8, catchingFishDaggerRetrofit5.CatchingFishLayout(5).CatchingFishDaggerWebsocket() + catchingFishDaggerRetrofit5.CatchingFish() + catchingFishDaggerRetrofit5.CatchingFishStateFlow);
                        }
                        z14 = true;
                    }
                    z13 = z14 | ((CatchingFishBiometricOkHttp) catchingFishDaggerRetrofit5).CatchingFishDynamicFeature;
                } else {
                    z4 = z12;
                    i13 = i43;
                    catchingFishRetrofitDagger3 = catchingFishRetrofitDagger;
                }
                i43 = i13 + 1;
                catchingFishRetrofitDagger = catchingFishRetrofitDagger3;
                arrayList = arrayList8;
                z12 = z4;
            }
            boolean z15 = z12;
            ArrayList arrayList9 = arrayList;
            int i44 = 0;
            while (true) {
                CatchingFishRetrofitDagger catchingFishRetrofitDagger7 = catchingFishRetrofitDagger;
                if (i44 >= 2) {
                    break;
                }
                int i45 = 0;
                while (i45 < size11) {
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit6 = (CatchingFishDaggerRetrofit) arrayList9.get(i45);
                    if ((!(catchingFishDaggerRetrofit6 instanceof CatchingFishRetrofitHandler) || (catchingFishDaggerRetrofit6 instanceof CatchingFishBiometricOkHttp)) && !(catchingFishDaggerRetrofit6 instanceof CatchingFishViewModelMockk)) {
                        i10 = size11;
                        if (catchingFishDaggerRetrofit6.CatchingFishMockkOkHttp != 8 && ((!z2 || !catchingFishDaggerRetrofit6.CatchingFishReduxKtor.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler || !catchingFishDaggerRetrofit6.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler) && !(catchingFishDaggerRetrofit6 instanceof CatchingFishBiometricOkHttp))) {
                            int CatchingFishRoomDatabase6 = catchingFishDaggerRetrofit6.CatchingFishRoomDatabase();
                            int CatchingFishCloudMessaging5 = catchingFishDaggerRetrofit6.CatchingFishCloudMessaging();
                            i11 = i45;
                            int i46 = catchingFishDaggerRetrofit6.CatchingFishMoshiDaggerHilt;
                            z13 |= catchingFishAsyncTaskDagger.CatchingFishParcelable(i44 == 1 ? 2 : 1, catchingFishRetrofitDagger7, catchingFishDaggerRetrofit6);
                            catchingFishRetrofitDagger2 = catchingFishRetrofitDagger7;
                            int CatchingFishRoomDatabase7 = catchingFishDaggerRetrofit6.CatchingFishRoomDatabase();
                            i12 = i44;
                            int CatchingFishCloudMessaging6 = catchingFishDaggerRetrofit6.CatchingFishCloudMessaging();
                            if (CatchingFishRoomDatabase7 != CatchingFishRoomDatabase6) {
                                catchingFishDaggerRetrofit6.CatchingFishGradleManifest(CatchingFishRoomDatabase7);
                                if (z11 && catchingFishDaggerRetrofit6.CatchingFishNavigation() + catchingFishDaggerRetrofit6.CatchingFishDataStoreIntent > max7) {
                                    max7 = Math.max(max7, catchingFishDaggerRetrofit6.CatchingFishLayout(4).CatchingFishDaggerWebsocket() + catchingFishDaggerRetrofit6.CatchingFishNavigation() + catchingFishDaggerRetrofit6.CatchingFishDataStoreIntent);
                                }
                                z13 = true;
                            }
                            if (CatchingFishCloudMessaging6 != CatchingFishCloudMessaging5) {
                                catchingFishDaggerRetrofit6.CatchingFishCameraXIntent(CatchingFishCloudMessaging6);
                                if (z15 && catchingFishDaggerRetrofit6.CatchingFish() + catchingFishDaggerRetrofit6.CatchingFishStateFlow > max8) {
                                    max8 = Math.max(max8, catchingFishDaggerRetrofit6.CatchingFishLayout(5).CatchingFishDaggerWebsocket() + catchingFishDaggerRetrofit6.CatchingFish() + catchingFishDaggerRetrofit6.CatchingFishStateFlow);
                                }
                                z13 = true;
                            }
                            if (catchingFishDaggerRetrofit6.CatchingFishFragmentFactory && i46 != catchingFishDaggerRetrofit6.CatchingFishMoshiDaggerHilt) {
                                z13 = true;
                            }
                            i45 = i11 + 1;
                            size11 = i10;
                            catchingFishRetrofitDagger7 = catchingFishRetrofitDagger2;
                            i44 = i12;
                        }
                    } else {
                        i10 = size11;
                    }
                    catchingFishRetrofitDagger2 = catchingFishRetrofitDagger7;
                    i12 = i44;
                    i11 = i45;
                    i45 = i11 + 1;
                    size11 = i10;
                    catchingFishRetrofitDagger7 = catchingFishRetrofitDagger2;
                    i44 = i12;
                }
                int i47 = size11;
                catchingFishRetrofitDagger = catchingFishRetrofitDagger7;
                int i48 = i44;
                if (!z13) {
                    break;
                }
                int i49 = i48 + 1;
                catchingFishAsyncTaskDagger.CatchingFishDaggerMVVM(catchingFishGsonAppCompat, i49, CatchingFishRoomDatabase2, CatchingFishCloudMessaging);
                i44 = i49;
                size11 = i47;
                z13 = false;
            }
        }
        catchingFishGsonAppCompat.CatchingFishKtor = i39;
        CatchingFishHandlerOkHttp.CatchingFishRoomDatabase = catchingFishGsonAppCompat.CatchingFishJUnitRealm(512);
    }

    public final CatchingFishDaggerRetrofit CatchingFishDaggerWebsocket(View view) {
        if (view == this) {
            return this.CatchingFishWorkManager;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof CatchingFishGraphQLBundle) {
            return ((CatchingFishGraphQLBundle) view.getLayoutParams()).CatchingFishGlideWidgetKtor;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof CatchingFishGraphQLBundle) {
            return ((CatchingFishGraphQLBundle) view.getLayoutParams()).CatchingFishGlideWidgetKtor;
        }
        return null;
    }

    public final void CatchingFishEspressoTesting(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, CatchingFishGraphQLBundle catchingFishGraphQLBundle, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.CatchingFishReduxKtor.get(i);
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = (CatchingFishDaggerRetrofit) sparseArray.get(i);
        if (catchingFishDaggerRetrofit2 == null || view == null || !(view.getLayoutParams() instanceof CatchingFishGraphQLBundle)) {
            return;
        }
        catchingFishGraphQLBundle.CatchingFishNavigationGson = true;
        if (i2 == 6) {
            CatchingFishGraphQLBundle catchingFishGraphQLBundle2 = (CatchingFishGraphQLBundle) view.getLayoutParams();
            catchingFishGraphQLBundle2.CatchingFishNavigationGson = true;
            catchingFishGraphQLBundle2.CatchingFishGlideWidgetKtor.CatchingFishFragmentFactory = true;
        }
        catchingFishDaggerRetrofit.CatchingFishLayout(6).CatchingFishSnackbar(catchingFishDaggerRetrofit2.CatchingFishLayout(i2), catchingFishGraphQLBundle.CatchingFishCustomView, catchingFishGraphQLBundle.CatchingFishMVPRobolectric, true);
        catchingFishDaggerRetrofit.CatchingFishFragmentFactory = true;
        catchingFishDaggerRetrofit.CatchingFishLayout(3).CatchingFishFragmentHandler();
        catchingFishDaggerRetrofit.CatchingFishLayout(5).CatchingFishFragmentHandler();
    }

    public final void CatchingFishFragmentHandler(int i) {
        int eventType;
        CatchingFishMVIContext catchingFishMVIContext;
        Context context = getContext();
        CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(14, false);
        catchingFishBundleGlide.CatchingFishDaggerWebsocket = new SparseArray();
        catchingFishBundleGlide.CatchingFishWorkManager = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            catchingFishMVIContext = null;
        } catch (IOException | XmlPullParserException unused) {
        }
        while (true) {
            char c = 1;
            if (eventType == 1) {
                this.CatchingFishUnitTesting = catchingFishBundleGlide;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 2) {
                    CatchingFishMVIContext catchingFishMVIContext2 = new CatchingFishMVIContext(context, xml);
                    ((SparseArray) catchingFishBundleGlide.CatchingFishDaggerWebsocket).put(catchingFishMVIContext2.CatchingFishReduxKtor, catchingFishMVIContext2);
                    catchingFishMVIContext = catchingFishMVIContext2;
                } else if (c == 3) {
                    CatchingFishWidgetExoPlayer catchingFishWidgetExoPlayer = new CatchingFishWidgetExoPlayer(context, xml);
                    if (catchingFishMVIContext != null) {
                        ((ArrayList) catchingFishMVIContext.CatchingFishWorkManager).add(catchingFishWidgetExoPlayer);
                    }
                } else if (c == 4) {
                    catchingFishBundleGlide.CatchingFishMVPRobolectric(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    public final void CatchingFishLayout(AttributeSet attributeSet, int i) {
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = this.CatchingFishWorkManager;
        catchingFishGsonAppCompat.CatchingFishDaggerMVVM = this;
        CatchingFishRetrofitDagger catchingFishRetrofitDagger = this.CatchingFishNavigation;
        catchingFishGsonAppCompat.CatchingFishKtorService = catchingFishRetrofitDagger;
        catchingFishGsonAppCompat.CatchingFishStateFlowIntent.CatchingFishWorkManager = catchingFishRetrofitDagger;
        this.CatchingFishReduxKtor.put(getId(), this);
        this.CatchingFishOkHttp = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishSnackbar, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.CatchingFishViewModelScope = obtainStyledAttributes.getDimensionPixelOffset(index, this.CatchingFishViewModelScope);
                } else if (index == 17) {
                    this.CatchingFishViewModelFAB = obtainStyledAttributes.getDimensionPixelOffset(index, this.CatchingFishViewModelFAB);
                } else if (index == 14) {
                    this.CatchingFishLayout = obtainStyledAttributes.getDimensionPixelOffset(index, this.CatchingFishLayout);
                } else if (index == 15) {
                    this.CatchingFishFragmentHandler = obtainStyledAttributes.getDimensionPixelOffset(index, this.CatchingFishFragmentHandler);
                } else if (index == 113) {
                    this.CatchingFishEspressoTesting = obtainStyledAttributes.getInt(index, this.CatchingFishEspressoTesting);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            CatchingFishFragmentHandler(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.CatchingFishUnitTesting = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        CatchingFishAnimationBundle catchingFishAnimationBundle = new CatchingFishAnimationBundle();
                        this.CatchingFishOkHttp = catchingFishAnimationBundle;
                        catchingFishAnimationBundle.CatchingFishDaggerWebsocket(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.CatchingFishOkHttp = null;
                    }
                    this.CatchingFishAnimationMockk = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        catchingFishGsonAppCompat.CatchingFishKtor = this.CatchingFishEspressoTesting;
        CatchingFishHandlerOkHttp.CatchingFishRoomDatabase = catchingFishGsonAppCompat.CatchingFishJUnitRealm(512);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishGraphQLBundle;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.CatchingFishDaggerWebsocket;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((CatchingFishKtorContext) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.CatchingFishCloudMessaging = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return CatchingFishReduxKtor();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = new CatchingFishGraphQLBundle(context, attributeSet);
        catchingFishGraphQLBundle.CatchingFishParcelableFAB = -1;
        catchingFishGraphQLBundle.CatchingFishSnackbar = -1;
        catchingFishGraphQLBundle.CatchingFishCoroutine = -1.0f;
        catchingFishGraphQLBundle.CatchingFishReduxKtor = true;
        catchingFishGraphQLBundle.CatchingFishDaggerWebsocket = -1;
        catchingFishGraphQLBundle.CatchingFishWorkManager = -1;
        catchingFishGraphQLBundle.CatchingFishViewModelScope = -1;
        catchingFishGraphQLBundle.CatchingFishViewModelFAB = -1;
        catchingFishGraphQLBundle.CatchingFishLayout = -1;
        catchingFishGraphQLBundle.CatchingFishFragmentHandler = -1;
        catchingFishGraphQLBundle.CatchingFishCloudMessaging = -1;
        catchingFishGraphQLBundle.CatchingFishEspressoTesting = -1;
        catchingFishGraphQLBundle.CatchingFishOkHttp = -1;
        catchingFishGraphQLBundle.CatchingFishUnitTesting = -1;
        catchingFishGraphQLBundle.CatchingFishAnimationMockk = -1;
        catchingFishGraphQLBundle.CatchingFishStateLiveData = -1;
        catchingFishGraphQLBundle.CatchingFishRoomDatabase = 0;
        catchingFishGraphQLBundle.CatchingFishNavigation = 0.0f;
        catchingFishGraphQLBundle.CatchingFish = -1;
        catchingFishGraphQLBundle.CatchingFishJetpackCompose = -1;
        catchingFishGraphQLBundle.CatchingFishCoroutineFlow = -1;
        catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB = -1;
        catchingFishGraphQLBundle.CatchingFishSpannableWidget = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishParcelableFlux = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCardViewRealm = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishPayPal = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCardViewView = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishMVPRobolectric = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCustomView = 0;
        catchingFishGraphQLBundle.CatchingFishFragmentFactory = 0.5f;
        catchingFishGraphQLBundle.CatchingFishMutableLiveData = 0.5f;
        catchingFishGraphQLBundle.CatchingFishJobScheduler = null;
        catchingFishGraphQLBundle.CatchingFishPayPalService = -1.0f;
        catchingFishGraphQLBundle.CatchingFishSensorManager = -1.0f;
        catchingFishGraphQLBundle.CatchingFishEspressoMockk = 0;
        catchingFishGraphQLBundle.CatchingFishDagger = 0;
        catchingFishGraphQLBundle.CatchingFishCameraXIntent = 0;
        catchingFishGraphQLBundle.CatchingFishHandler = 0;
        catchingFishGraphQLBundle.CatchingFishPayPalLiveData = 0;
        catchingFishGraphQLBundle.CatchingFishGradleManifest = 0;
        catchingFishGraphQLBundle.CatchingFishMotionLayout = 0;
        catchingFishGraphQLBundle.CatchingFishLayoutInflater = 0;
        catchingFishGraphQLBundle.CatchingFishParcelable = 1.0f;
        catchingFishGraphQLBundle.CatchingFishRecyclerView = 1.0f;
        catchingFishGraphQLBundle.CatchingFishAppCompat = -1;
        catchingFishGraphQLBundle.CatchingFishDataStoreIntent = -1;
        catchingFishGraphQLBundle.CatchingFishStateFlow = -1;
        catchingFishGraphQLBundle.CatchingFishJUnitRealm = false;
        catchingFishGraphQLBundle.CatchingFishAnimation = false;
        catchingFishGraphQLBundle.CatchingFishMVVMAppCompat = null;
        catchingFishGraphQLBundle.CatchingFishStripeAPI = 0;
        catchingFishGraphQLBundle.CatchingFishMoshiDaggerHilt = true;
        catchingFishGraphQLBundle.CatchingFishAndroidX = true;
        catchingFishGraphQLBundle.CatchingFishNavigationGson = false;
        catchingFishGraphQLBundle.CatchingFishRedux = false;
        catchingFishGraphQLBundle.CatchingFishCustomViewJUnit = false;
        catchingFishGraphQLBundle.CatchingFishDaggerMVVM = -1;
        catchingFishGraphQLBundle.CatchingFishMockkOkHttp = -1;
        catchingFishGraphQLBundle.CatchingFishReduxMoshi = -1;
        catchingFishGraphQLBundle.CatchingFishPicasso = -1;
        catchingFishGraphQLBundle.CatchingFishFirebase = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishRetrofitMVI = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishGradleLiveData = 0.5f;
        catchingFishGraphQLBundle.CatchingFishGlideWidgetKtor = new CatchingFishDaggerRetrofit();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishSnackbar);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = CatchingFishMoshiSharedFlow.CatchingFishParcelableFAB.get(index);
            switch (i2) {
                case 1:
                    catchingFishGraphQLBundle.CatchingFishStateFlow = obtainStyledAttributes.getInt(index, catchingFishGraphQLBundle.CatchingFishStateFlow);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishStateLiveData);
                    catchingFishGraphQLBundle.CatchingFishStateLiveData = resourceId;
                    if (resourceId == -1) {
                        catchingFishGraphQLBundle.CatchingFishStateLiveData = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    catchingFishGraphQLBundle.CatchingFishRoomDatabase = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishRoomDatabase);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishNavigation) % 360.0f;
                    catchingFishGraphQLBundle.CatchingFishNavigation = f;
                    if (f < 0.0f) {
                        catchingFishGraphQLBundle.CatchingFishNavigation = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    catchingFishGraphQLBundle.CatchingFishParcelableFAB = obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishGraphQLBundle.CatchingFishParcelableFAB);
                    break;
                case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                    catchingFishGraphQLBundle.CatchingFishSnackbar = obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishGraphQLBundle.CatchingFishSnackbar);
                    break;
                case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    catchingFishGraphQLBundle.CatchingFishCoroutine = obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishCoroutine);
                    break;
                case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishDaggerWebsocket);
                    catchingFishGraphQLBundle.CatchingFishDaggerWebsocket = resourceId2;
                    if (resourceId2 == -1) {
                        catchingFishGraphQLBundle.CatchingFishDaggerWebsocket = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishWorkManager);
                    catchingFishGraphQLBundle.CatchingFishWorkManager = resourceId3;
                    if (resourceId3 == -1) {
                        catchingFishGraphQLBundle.CatchingFishWorkManager = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishViewModelScope);
                    catchingFishGraphQLBundle.CatchingFishViewModelScope = resourceId4;
                    if (resourceId4 == -1) {
                        catchingFishGraphQLBundle.CatchingFishViewModelScope = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishViewModelFAB);
                    catchingFishGraphQLBundle.CatchingFishViewModelFAB = resourceId5;
                    if (resourceId5 == -1) {
                        catchingFishGraphQLBundle.CatchingFishViewModelFAB = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishLayout);
                    catchingFishGraphQLBundle.CatchingFishLayout = resourceId6;
                    if (resourceId6 == -1) {
                        catchingFishGraphQLBundle.CatchingFishLayout = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishFragmentHandler);
                    catchingFishGraphQLBundle.CatchingFishFragmentHandler = resourceId7;
                    if (resourceId7 == -1) {
                        catchingFishGraphQLBundle.CatchingFishFragmentHandler = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishCloudMessaging);
                    catchingFishGraphQLBundle.CatchingFishCloudMessaging = resourceId8;
                    if (resourceId8 == -1) {
                        catchingFishGraphQLBundle.CatchingFishCloudMessaging = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishEspressoTesting);
                    catchingFishGraphQLBundle.CatchingFishEspressoTesting = resourceId9;
                    if (resourceId9 == -1) {
                        catchingFishGraphQLBundle.CatchingFishEspressoTesting = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishOkHttp);
                    catchingFishGraphQLBundle.CatchingFishOkHttp = resourceId10;
                    if (resourceId10 == -1) {
                        catchingFishGraphQLBundle.CatchingFishOkHttp = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFish);
                    catchingFishGraphQLBundle.CatchingFish = resourceId11;
                    if (resourceId11 == -1) {
                        catchingFishGraphQLBundle.CatchingFish = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishJetpackCompose);
                    catchingFishGraphQLBundle.CatchingFishJetpackCompose = resourceId12;
                    if (resourceId12 == -1) {
                        catchingFishGraphQLBundle.CatchingFishJetpackCompose = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishCoroutineFlow);
                    catchingFishGraphQLBundle.CatchingFishCoroutineFlow = resourceId13;
                    if (resourceId13 == -1) {
                        catchingFishGraphQLBundle.CatchingFishCoroutineFlow = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB);
                    catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB = resourceId14;
                    if (resourceId14 == -1) {
                        catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    catchingFishGraphQLBundle.CatchingFishSpannableWidget = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishSpannableWidget);
                    break;
                case 22:
                    catchingFishGraphQLBundle.CatchingFishParcelableFlux = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishParcelableFlux);
                    break;
                case 23:
                    catchingFishGraphQLBundle.CatchingFishGsonAppCompat = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishGsonAppCompat);
                    break;
                case 24:
                    catchingFishGraphQLBundle.CatchingFishCardViewRealm = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishCardViewRealm);
                    break;
                case 25:
                    catchingFishGraphQLBundle.CatchingFishPayPal = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishPayPal);
                    break;
                case 26:
                    catchingFishGraphQLBundle.CatchingFishCardViewView = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishCardViewView);
                    break;
                case 27:
                    catchingFishGraphQLBundle.CatchingFishJUnitRealm = obtainStyledAttributes.getBoolean(index, catchingFishGraphQLBundle.CatchingFishJUnitRealm);
                    break;
                case 28:
                    catchingFishGraphQLBundle.CatchingFishAnimation = obtainStyledAttributes.getBoolean(index, catchingFishGraphQLBundle.CatchingFishAnimation);
                    break;
                case 29:
                    catchingFishGraphQLBundle.CatchingFishFragmentFactory = obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishFragmentFactory);
                    break;
                case 30:
                    catchingFishGraphQLBundle.CatchingFishMutableLiveData = obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishMutableLiveData);
                    break;
                case 31:
                    catchingFishGraphQLBundle.CatchingFishCameraXIntent = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    catchingFishGraphQLBundle.CatchingFishHandler = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        catchingFishGraphQLBundle.CatchingFishPayPalLiveData = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishPayPalLiveData);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, catchingFishGraphQLBundle.CatchingFishPayPalLiveData) == -2) {
                            catchingFishGraphQLBundle.CatchingFishPayPalLiveData = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        catchingFishGraphQLBundle.CatchingFishMotionLayout = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishMotionLayout);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, catchingFishGraphQLBundle.CatchingFishMotionLayout) == -2) {
                            catchingFishGraphQLBundle.CatchingFishMotionLayout = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    catchingFishGraphQLBundle.CatchingFishParcelable = Math.max(0.0f, obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishParcelable));
                    catchingFishGraphQLBundle.CatchingFishCameraXIntent = 2;
                    break;
                case 36:
                    try {
                        catchingFishGraphQLBundle.CatchingFishGradleManifest = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishGradleManifest);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, catchingFishGraphQLBundle.CatchingFishGradleManifest) == -2) {
                            catchingFishGraphQLBundle.CatchingFishGradleManifest = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        catchingFishGraphQLBundle.CatchingFishLayoutInflater = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishLayoutInflater);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, catchingFishGraphQLBundle.CatchingFishLayoutInflater) == -2) {
                            catchingFishGraphQLBundle.CatchingFishLayoutInflater = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    catchingFishGraphQLBundle.CatchingFishRecyclerView = Math.max(0.0f, obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishRecyclerView));
                    catchingFishGraphQLBundle.CatchingFishHandler = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            CatchingFishAnimationBundle.CatchingFishViewModelFAB(catchingFishGraphQLBundle, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            catchingFishGraphQLBundle.CatchingFishPayPalService = obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishPayPalService);
                            break;
                        case 46:
                            catchingFishGraphQLBundle.CatchingFishSensorManager = obtainStyledAttributes.getFloat(index, catchingFishGraphQLBundle.CatchingFishSensorManager);
                            break;
                        case 47:
                            catchingFishGraphQLBundle.CatchingFishEspressoMockk = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            catchingFishGraphQLBundle.CatchingFishDagger = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            catchingFishGraphQLBundle.CatchingFishAppCompat = obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishGraphQLBundle.CatchingFishAppCompat);
                            break;
                        case 50:
                            catchingFishGraphQLBundle.CatchingFishDataStoreIntent = obtainStyledAttributes.getDimensionPixelOffset(index, catchingFishGraphQLBundle.CatchingFishDataStoreIntent);
                            break;
                        case 51:
                            catchingFishGraphQLBundle.CatchingFishMVVMAppCompat = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishUnitTesting);
                            catchingFishGraphQLBundle.CatchingFishUnitTesting = resourceId15;
                            if (resourceId15 == -1) {
                                catchingFishGraphQLBundle.CatchingFishUnitTesting = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, catchingFishGraphQLBundle.CatchingFishAnimationMockk);
                            catchingFishGraphQLBundle.CatchingFishAnimationMockk = resourceId16;
                            if (resourceId16 == -1) {
                                catchingFishGraphQLBundle.CatchingFishAnimationMockk = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            catchingFishGraphQLBundle.CatchingFishCustomView = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishCustomView);
                            break;
                        case 55:
                            catchingFishGraphQLBundle.CatchingFishMVPRobolectric = obtainStyledAttributes.getDimensionPixelSize(index, catchingFishGraphQLBundle.CatchingFishMVPRobolectric);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    CatchingFishAnimationBundle.CatchingFishViewModelScope(catchingFishGraphQLBundle, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    CatchingFishAnimationBundle.CatchingFishViewModelScope(catchingFishGraphQLBundle, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    catchingFishGraphQLBundle.CatchingFishStripeAPI = obtainStyledAttributes.getInt(index, catchingFishGraphQLBundle.CatchingFishStripeAPI);
                                    break;
                                case 67:
                                    catchingFishGraphQLBundle.CatchingFishReduxKtor = obtainStyledAttributes.getBoolean(index, catchingFishGraphQLBundle.CatchingFishReduxKtor);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        catchingFishGraphQLBundle.CatchingFishParcelableFAB();
        return catchingFishGraphQLBundle;
    }

    public int getMaxHeight() {
        return this.CatchingFishFragmentHandler;
    }

    public int getMaxWidth() {
        return this.CatchingFishLayout;
    }

    public int getMinHeight() {
        return this.CatchingFishViewModelFAB;
    }

    public int getMinWidth() {
        return this.CatchingFishViewModelScope;
    }

    public int getOptimizationLevel() {
        return this.CatchingFishWorkManager.CatchingFishKtor;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = this.CatchingFishWorkManager;
        if (catchingFishGsonAppCompat.CatchingFishFragmentHandler == null) {
            int id2 = getId();
            if (id2 != -1) {
                catchingFishGsonAppCompat.CatchingFishFragmentHandler = getContext().getResources().getResourceEntryName(id2);
            } else {
                catchingFishGsonAppCompat.CatchingFishFragmentHandler = "parent";
            }
        }
        if (catchingFishGsonAppCompat.CatchingFishReduxMoshi == null) {
            catchingFishGsonAppCompat.CatchingFishReduxMoshi = catchingFishGsonAppCompat.CatchingFishFragmentHandler;
        }
        ArrayList arrayList = catchingFishGsonAppCompat.CatchingFishFABLayout;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = (CatchingFishDaggerRetrofit) obj;
            View view = catchingFishDaggerRetrofit.CatchingFishDaggerMVVM;
            if (view != null) {
                if (catchingFishDaggerRetrofit.CatchingFishFragmentHandler == null && (id = view.getId()) != -1) {
                    catchingFishDaggerRetrofit.CatchingFishFragmentHandler = getContext().getResources().getResourceEntryName(id);
                }
                if (catchingFishDaggerRetrofit.CatchingFishReduxMoshi == null) {
                    catchingFishDaggerRetrofit.CatchingFishReduxMoshi = catchingFishDaggerRetrofit.CatchingFishFragmentHandler;
                }
            }
        }
        catchingFishGsonAppCompat.CatchingFishUnitTesting(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) childAt.getLayoutParams();
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = catchingFishGraphQLBundle.CatchingFishGlideWidgetKtor;
            if (childAt.getVisibility() != 8 || catchingFishGraphQLBundle.CatchingFishRedux || catchingFishGraphQLBundle.CatchingFishCustomViewJUnit || isInEditMode) {
                int CatchingFishNavigation = catchingFishDaggerRetrofit.CatchingFishNavigation();
                int CatchingFish2 = catchingFishDaggerRetrofit.CatchingFish();
                childAt.layout(CatchingFishNavigation, CatchingFish2, catchingFishDaggerRetrofit.CatchingFishRoomDatabase() + CatchingFishNavigation, catchingFishDaggerRetrofit.CatchingFishCloudMessaging() + CatchingFish2);
            }
        }
        ArrayList arrayList = this.CatchingFishDaggerWebsocket;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((CatchingFishKtorContext) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x034c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit;
        int i4;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2;
        int i5;
        int i6;
        int i7;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit4;
        int i13;
        int i14;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit5;
        CatchingFishGraphQLBundle catchingFishGraphQLBundle;
        int i15;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit6;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float parseFloat;
        int i21;
        char c;
        ArrayList arrayList;
        int i22;
        ArrayList arrayList2;
        int i23;
        String str;
        int CatchingFishWorkManager;
        int i24;
        String resourceName;
        int id;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit7;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.CatchingFishCloudMessaging;
        constraintLayout.CatchingFishCloudMessaging = z3;
        int i25 = 1;
        int i26 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i27).isLayoutRequested()) {
                    constraintLayout.CatchingFishCloudMessaging = true;
                    break;
                }
                i27++;
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = constraintLayout.CatchingFishWorkManager;
        catchingFishGsonAppCompat.CatchingFishWebSocketMockk = z4;
        if (constraintLayout.CatchingFishCloudMessaging) {
            constraintLayout.CatchingFishCloudMessaging = false;
            int childCount2 = constraintLayout.getChildCount();
            int i28 = 0;
            while (true) {
                if (i28 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i28).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i28++;
                }
            }
            if (z) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i29 = 0; i29 < childCount3; i29++) {
                    CatchingFishDaggerRetrofit CatchingFishDaggerWebsocket = constraintLayout.CatchingFishDaggerWebsocket(constraintLayout.getChildAt(i29));
                    if (CatchingFishDaggerWebsocket != null) {
                        CatchingFishDaggerWebsocket.CatchingFishMVPRobolectric();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    int i30 = 0;
                    while (i30 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i30);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.CatchingFishStateLiveData == null) {
                                    constraintLayout.CatchingFishStateLiveData = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                i24 = i25;
                                try {
                                    constraintLayout.CatchingFishStateLiveData.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i24 = i25;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i24 = i25;
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.CatchingFishReduxKtor.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                catchingFishDaggerRetrofit7 = view == null ? null : ((CatchingFishGraphQLBundle) view.getLayoutParams()).CatchingFishGlideWidgetKtor;
                                catchingFishDaggerRetrofit7.CatchingFishReduxMoshi = resourceName;
                                i30++;
                                i25 = i24;
                            }
                        }
                        catchingFishDaggerRetrofit7 = catchingFishGsonAppCompat;
                        catchingFishDaggerRetrofit7.CatchingFishReduxMoshi = resourceName;
                        i30++;
                        i25 = i24;
                    }
                }
                int i31 = i25;
                if (constraintLayout.CatchingFishAnimationMockk != -1) {
                    for (int i32 = 0; i32 < childCount3; i32++) {
                        constraintLayout.getChildAt(i32).getId();
                    }
                }
                CatchingFishAnimationBundle catchingFishAnimationBundle = constraintLayout.CatchingFishOkHttp;
                if (catchingFishAnimationBundle != null) {
                    catchingFishAnimationBundle.CatchingFishParcelableFAB(constraintLayout);
                }
                catchingFishGsonAppCompat.CatchingFishFABLayout.clear();
                ArrayList arrayList3 = constraintLayout.CatchingFishDaggerWebsocket;
                int size = arrayList3.size();
                if (size > 0) {
                    int i33 = 0;
                    while (i33 < size) {
                        CatchingFishKtorContext catchingFishKtorContext = (CatchingFishKtorContext) arrayList3.get(i33);
                        HashMap hashMap = catchingFishKtorContext.CatchingFishFragmentHandler;
                        if (catchingFishKtorContext.isInEditMode()) {
                            catchingFishKtorContext.setIds(catchingFishKtorContext.CatchingFishViewModelFAB);
                        }
                        CatchingFishRetrofitHandler catchingFishRetrofitHandler = catchingFishKtorContext.CatchingFishViewModelScope;
                        if (catchingFishRetrofitHandler == null) {
                            arrayList = arrayList3;
                            i22 = size;
                        } else {
                            catchingFishRetrofitHandler.CatchingFishGraphQLGlide = i26;
                            Arrays.fill(catchingFishRetrofitHandler.CatchingFishFABLayout, obj);
                            int i34 = i26;
                            while (i34 < catchingFishKtorContext.CatchingFishDaggerWebsocket) {
                                int i35 = catchingFishKtorContext.CatchingFishReduxKtor[i34];
                                View view2 = (View) constraintLayout.CatchingFishReduxKtor.get(i35);
                                if (view2 == null && (CatchingFishWorkManager = catchingFishKtorContext.CatchingFishWorkManager(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i35))))) != 0) {
                                    catchingFishKtorContext.CatchingFishReduxKtor[i34] = CatchingFishWorkManager;
                                    hashMap.put(Integer.valueOf(CatchingFishWorkManager), str);
                                    view2 = (View) constraintLayout.CatchingFishReduxKtor.get(CatchingFishWorkManager);
                                }
                                if (view2 != null) {
                                    CatchingFishRetrofitHandler catchingFishRetrofitHandler2 = catchingFishKtorContext.CatchingFishViewModelScope;
                                    CatchingFishDaggerRetrofit CatchingFishDaggerWebsocket2 = constraintLayout.CatchingFishDaggerWebsocket(view2);
                                    catchingFishRetrofitHandler2.getClass();
                                    if (CatchingFishDaggerWebsocket2 != catchingFishRetrofitHandler2 && CatchingFishDaggerWebsocket2 != null) {
                                        int i36 = catchingFishRetrofitHandler2.CatchingFishGraphQLGlide + 1;
                                        arrayList2 = arrayList3;
                                        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr = catchingFishRetrofitHandler2.CatchingFishFABLayout;
                                        i23 = size;
                                        if (i36 > catchingFishDaggerRetrofitArr.length) {
                                            catchingFishRetrofitHandler2.CatchingFishFABLayout = (CatchingFishDaggerRetrofit[]) Arrays.copyOf(catchingFishDaggerRetrofitArr, catchingFishDaggerRetrofitArr.length * 2);
                                        }
                                        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr2 = catchingFishRetrofitHandler2.CatchingFishFABLayout;
                                        int i37 = catchingFishRetrofitHandler2.CatchingFishGraphQLGlide;
                                        catchingFishDaggerRetrofitArr2[i37] = CatchingFishDaggerWebsocket2;
                                        catchingFishRetrofitHandler2.CatchingFishGraphQLGlide = i37 + 1;
                                        i34++;
                                        arrayList3 = arrayList2;
                                        size = i23;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i23 = size;
                                i34++;
                                arrayList3 = arrayList2;
                                size = i23;
                            }
                            arrayList = arrayList3;
                            i22 = size;
                            catchingFishKtorContext.CatchingFishViewModelScope.CatchingFishRecyclerView();
                        }
                        i33++;
                        arrayList3 = arrayList;
                        size = i22;
                        obj = null;
                        i26 = 0;
                    }
                }
                int i38 = 2;
                for (int i39 = 0; i39 < childCount3; i39++) {
                    constraintLayout.getChildAt(i39);
                }
                SparseArray sparseArray = constraintLayout.CatchingFishRoomDatabase;
                sparseArray.clear();
                sparseArray.put(0, catchingFishGsonAppCompat);
                sparseArray.put(constraintLayout.getId(), catchingFishGsonAppCompat);
                for (int i40 = 0; i40 < childCount3; i40++) {
                    View childAt2 = constraintLayout.getChildAt(i40);
                    sparseArray.put(childAt2.getId(), constraintLayout.CatchingFishDaggerWebsocket(childAt2));
                }
                int i41 = 0;
                while (i41 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i41);
                    CatchingFishDaggerRetrofit CatchingFishDaggerWebsocket3 = constraintLayout.CatchingFishDaggerWebsocket(childAt3);
                    if (CatchingFishDaggerWebsocket3 != null) {
                        CatchingFishGraphQLBundle catchingFishGraphQLBundle2 = (CatchingFishGraphQLBundle) childAt3.getLayoutParams();
                        catchingFishGsonAppCompat.CatchingFishFABLayout.add(CatchingFishDaggerWebsocket3);
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit8 = CatchingFishDaggerWebsocket3.CatchingFishAppCompat;
                        if (catchingFishDaggerRetrofit8 != null) {
                            ((CatchingFishGsonAppCompat) catchingFishDaggerRetrofit8).CatchingFishFABLayout.remove(CatchingFishDaggerWebsocket3);
                            CatchingFishDaggerWebsocket3.CatchingFishMVPRobolectric();
                        }
                        CatchingFishDaggerWebsocket3.CatchingFishAppCompat = catchingFishGsonAppCompat;
                        catchingFishGraphQLBundle2.CatchingFishParcelableFAB();
                        CatchingFishDaggerWebsocket3.CatchingFishMockkOkHttp = childAt3.getVisibility();
                        CatchingFishDaggerWebsocket3.CatchingFishDaggerMVVM = childAt3;
                        if (childAt3 instanceof CatchingFishKtorContext) {
                            ((CatchingFishKtorContext) childAt3).CatchingFishViewModelFAB(CatchingFishDaggerWebsocket3, catchingFishGsonAppCompat.CatchingFishWebSocketMockk);
                        }
                        if (catchingFishGraphQLBundle2.CatchingFishRedux) {
                            CatchingFishViewModelMockk catchingFishViewModelMockk = (CatchingFishViewModelMockk) CatchingFishDaggerWebsocket3;
                            int i42 = catchingFishGraphQLBundle2.CatchingFishRetrofit;
                            int i43 = catchingFishGraphQLBundle2.CatchingFishView;
                            float f2 = catchingFishGraphQLBundle2.CatchingFishServiceMVIJUnit;
                            if (f2 == -1.0f) {
                                c = 65535;
                                if (i42 != -1) {
                                    if (i42 > -1) {
                                        catchingFishViewModelMockk.CatchingFishFABLayout = -1.0f;
                                        catchingFishViewModelMockk.CatchingFishGraphQLGlide = i42;
                                        catchingFishViewModelMockk.CatchingFishStateFlowIntent = -1;
                                    }
                                } else if (i43 != -1 && i43 > -1) {
                                    catchingFishViewModelMockk.CatchingFishFABLayout = -1.0f;
                                    catchingFishViewModelMockk.CatchingFishGraphQLGlide = -1;
                                    catchingFishViewModelMockk.CatchingFishStateFlowIntent = i43;
                                }
                                i3 = i41;
                                z2 = z;
                                i18 = i38;
                            } else if (f2 > -1.0f) {
                                catchingFishViewModelMockk.CatchingFishFABLayout = f2;
                                c = 65535;
                                catchingFishViewModelMockk.CatchingFishGraphQLGlide = -1;
                                catchingFishViewModelMockk.CatchingFishStateFlowIntent = -1;
                                i3 = i41;
                                z2 = z;
                                i18 = i38;
                            }
                        } else {
                            int i44 = catchingFishGraphQLBundle2.CatchingFishDaggerMVVM;
                            int i45 = catchingFishGraphQLBundle2.CatchingFishMockkOkHttp;
                            int i46 = catchingFishGraphQLBundle2.CatchingFishReduxMoshi;
                            int i47 = catchingFishGraphQLBundle2.CatchingFishPicasso;
                            int i48 = catchingFishGraphQLBundle2.CatchingFishFirebase;
                            int i49 = catchingFishGraphQLBundle2.CatchingFishRetrofitMVI;
                            i3 = i41;
                            float f3 = catchingFishGraphQLBundle2.CatchingFishGradleLiveData;
                            int i50 = catchingFishGraphQLBundle2.CatchingFishStateLiveData;
                            z2 = z;
                            if (i50 != -1) {
                                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit9 = (CatchingFishDaggerRetrofit) sparseArray.get(i50);
                                if (catchingFishDaggerRetrofit9 != null) {
                                    float f4 = catchingFishGraphQLBundle2.CatchingFishNavigation;
                                    CatchingFishDaggerWebsocket3.CatchingFishDaggerHiltFAB(7, 7, catchingFishGraphQLBundle2.CatchingFishRoomDatabase, 0, catchingFishDaggerRetrofit9);
                                    CatchingFishDaggerWebsocket3.CatchingFishCustomView = f4;
                                }
                                constraintLayout = this;
                                catchingFishDaggerRetrofit6 = CatchingFishDaggerWebsocket3;
                                catchingFishGraphQLBundle = catchingFishGraphQLBundle2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i44 != -1) {
                                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit10 = (CatchingFishDaggerRetrofit) sparseArray.get(i44);
                                    if (catchingFishDaggerRetrofit10 != null) {
                                        catchingFishDaggerRetrofit = CatchingFishDaggerWebsocket3;
                                        i4 = 2;
                                        catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(2, 2, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).leftMargin, i48, catchingFishDaggerRetrofit10);
                                    } else {
                                        catchingFishDaggerRetrofit = CatchingFishDaggerWebsocket3;
                                        i4 = 2;
                                    }
                                } else {
                                    catchingFishDaggerRetrofit = CatchingFishDaggerWebsocket3;
                                    i4 = 2;
                                    if (i45 != -1 && (catchingFishDaggerRetrofit2 = (CatchingFishDaggerRetrofit) sparseArray.get(i45)) != null) {
                                        catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(2, 4, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).leftMargin, i48, catchingFishDaggerRetrofit2);
                                        i5 = 2;
                                        i6 = 4;
                                        if (i46 == -1) {
                                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit11 = (CatchingFishDaggerRetrofit) sparseArray.get(i46);
                                            if (catchingFishDaggerRetrofit11 != null) {
                                                catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(i6, i5, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).rightMargin, i49, catchingFishDaggerRetrofit11);
                                            }
                                            i7 = i5;
                                        } else {
                                            i7 = i5;
                                            if (i47 != -1 && (catchingFishDaggerRetrofit3 = (CatchingFishDaggerRetrofit) sparseArray.get(i47)) != null) {
                                                catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(i6, i6, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).rightMargin, i49, catchingFishDaggerRetrofit3);
                                            }
                                        }
                                        i8 = i6;
                                        i9 = catchingFishGraphQLBundle2.CatchingFishLayout;
                                        if (i9 == -1) {
                                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit12 = (CatchingFishDaggerRetrofit) sparseArray.get(i9);
                                            if (catchingFishDaggerRetrofit12 != null) {
                                                i16 = 3;
                                                catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(3, 3, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).topMargin, catchingFishGraphQLBundle2.CatchingFishParcelableFlux, catchingFishDaggerRetrofit12);
                                            } else {
                                                i16 = 3;
                                            }
                                            i11 = i16;
                                            i12 = 5;
                                            i10 = -1;
                                        } else {
                                            int i51 = catchingFishGraphQLBundle2.CatchingFishFragmentHandler;
                                            i10 = -1;
                                            if (i51 == -1 || (catchingFishDaggerRetrofit4 = (CatchingFishDaggerRetrofit) sparseArray.get(i51)) == null) {
                                                i11 = 3;
                                                i12 = 5;
                                            } else {
                                                catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(3, 5, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).topMargin, catchingFishGraphQLBundle2.CatchingFishParcelableFlux, catchingFishDaggerRetrofit4);
                                                i11 = 3;
                                                i12 = 5;
                                            }
                                        }
                                        i13 = catchingFishGraphQLBundle2.CatchingFishCloudMessaging;
                                        if (i13 == i10) {
                                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit13 = (CatchingFishDaggerRetrofit) sparseArray.get(i13);
                                            if (catchingFishDaggerRetrofit13 != null) {
                                                int i52 = i11;
                                                catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(i12, i52, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).bottomMargin, catchingFishGraphQLBundle2.CatchingFishCardViewRealm, catchingFishDaggerRetrofit13);
                                                i14 = i52;
                                            } else {
                                                i14 = i11;
                                            }
                                        } else {
                                            i14 = i11;
                                            int i53 = catchingFishGraphQLBundle2.CatchingFishEspressoTesting;
                                            if (i53 != i10 && (catchingFishDaggerRetrofit5 = (CatchingFishDaggerRetrofit) sparseArray.get(i53)) != null) {
                                                catchingFishDaggerRetrofit.CatchingFishDaggerHiltFAB(i12, i12, ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle2).bottomMargin, catchingFishGraphQLBundle2.CatchingFishCardViewRealm, catchingFishDaggerRetrofit5);
                                            }
                                        }
                                        catchingFishGraphQLBundle = catchingFishGraphQLBundle2;
                                        i15 = catchingFishGraphQLBundle.CatchingFishOkHttp;
                                        if (i15 == -1) {
                                            constraintLayout = this;
                                            catchingFishDaggerRetrofit6 = catchingFishDaggerRetrofit;
                                            constraintLayout.CatchingFishEspressoTesting(catchingFishDaggerRetrofit6, catchingFishGraphQLBundle, sparseArray, i15, 6);
                                        } else {
                                            int i54 = catchingFishGraphQLBundle.CatchingFishUnitTesting;
                                            if (i54 != -1) {
                                                constraintLayout = this;
                                                catchingFishDaggerRetrofit6 = catchingFishDaggerRetrofit;
                                                constraintLayout.CatchingFishEspressoTesting(catchingFishDaggerRetrofit6, catchingFishGraphQLBundle, sparseArray, i54, i14);
                                            } else {
                                                int i55 = catchingFishGraphQLBundle.CatchingFishAnimationMockk;
                                                constraintLayout = this;
                                                catchingFishDaggerRetrofit6 = catchingFishDaggerRetrofit;
                                                int i56 = i12;
                                                if (i55 != -1) {
                                                    constraintLayout.CatchingFishEspressoTesting(catchingFishDaggerRetrofit6, catchingFishGraphQLBundle, sparseArray, i55, i56);
                                                }
                                                if (f3 >= 0.0f) {
                                                    catchingFishDaggerRetrofit6.CatchingFishRedux = f3;
                                                }
                                                f = catchingFishGraphQLBundle.CatchingFishMutableLiveData;
                                                if (f >= 0.0f) {
                                                    catchingFishDaggerRetrofit6.CatchingFishCustomViewJUnit = f;
                                                }
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                        }
                                        f = catchingFishGraphQLBundle.CatchingFishMutableLiveData;
                                        if (f >= 0.0f) {
                                        }
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i46 == -1) {
                                }
                                i8 = i6;
                                i9 = catchingFishGraphQLBundle2.CatchingFishLayout;
                                if (i9 == -1) {
                                }
                                i13 = catchingFishGraphQLBundle2.CatchingFishCloudMessaging;
                                if (i13 == i10) {
                                }
                                catchingFishGraphQLBundle = catchingFishGraphQLBundle2;
                                i15 = catchingFishGraphQLBundle.CatchingFishOkHttp;
                                if (i15 == -1) {
                                }
                                if (f3 >= 0.0f) {
                                }
                                f = catchingFishGraphQLBundle.CatchingFishMutableLiveData;
                                if (f >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i21 = catchingFishGraphQLBundle.CatchingFishAppCompat) != -1 || catchingFishGraphQLBundle.CatchingFishDataStoreIntent != -1)) {
                                int i57 = catchingFishGraphQLBundle.CatchingFishDataStoreIntent;
                                catchingFishDaggerRetrofit6.CatchingFishMVVMAppCompat = i21;
                                catchingFishDaggerRetrofit6.CatchingFishStripeAPI = i57;
                            }
                            if (catchingFishGraphQLBundle.CatchingFishMoshiDaggerHilt) {
                                catchingFishDaggerRetrofit6.CatchingFishHandler(i31);
                                catchingFishDaggerRetrofit6.CatchingFishGradleManifest(((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).width);
                                if (((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).width == -2) {
                                    catchingFishDaggerRetrofit6.CatchingFishHandler(i38);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).width == -1) {
                                if (catchingFishGraphQLBundle.CatchingFishJUnitRealm) {
                                    catchingFishDaggerRetrofit6.CatchingFishHandler(3);
                                } else {
                                    catchingFishDaggerRetrofit6.CatchingFishHandler(4);
                                }
                                catchingFishDaggerRetrofit6.CatchingFishLayout(i7).CatchingFishViewModelScope = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).leftMargin;
                                catchingFishDaggerRetrofit6.CatchingFishLayout(i8).CatchingFishViewModelScope = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).rightMargin;
                            } else {
                                catchingFishDaggerRetrofit6.CatchingFishHandler(3);
                                catchingFishDaggerRetrofit6.CatchingFishGradleManifest(0);
                            }
                            if (catchingFishGraphQLBundle.CatchingFishAndroidX) {
                                i17 = -1;
                                catchingFishDaggerRetrofit6.CatchingFishPayPalLiveData(1);
                                catchingFishDaggerRetrofit6.CatchingFishCameraXIntent(((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).height);
                                if (((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).height == -2) {
                                    catchingFishDaggerRetrofit6.CatchingFishPayPalLiveData(2);
                                }
                            } else {
                                i17 = -1;
                                if (((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).height == -1) {
                                    if (catchingFishGraphQLBundle.CatchingFishAnimation) {
                                        catchingFishDaggerRetrofit6.CatchingFishPayPalLiveData(3);
                                    } else {
                                        catchingFishDaggerRetrofit6.CatchingFishPayPalLiveData(4);
                                    }
                                    catchingFishDaggerRetrofit6.CatchingFishLayout(3).CatchingFishViewModelScope = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).topMargin;
                                    catchingFishDaggerRetrofit6.CatchingFishLayout(5).CatchingFishViewModelScope = ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).bottomMargin;
                                } else {
                                    catchingFishDaggerRetrofit6.CatchingFishPayPalLiveData(3);
                                    catchingFishDaggerRetrofit6.CatchingFishCameraXIntent(0);
                                }
                            }
                            String str2 = catchingFishGraphQLBundle.CatchingFishJobScheduler;
                            if (str2 == null || str2.length() == 0) {
                                catchingFishDaggerRetrofit6.CatchingFishJUnitRealm = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i19 = i17;
                                    i20 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i19 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i17;
                                    i20 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i20);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i20, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i19 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    catchingFishDaggerRetrofit6.CatchingFishJUnitRealm = parseFloat;
                                    catchingFishDaggerRetrofit6.CatchingFishAnimation = i19;
                                }
                            }
                            float f5 = catchingFishGraphQLBundle.CatchingFishPayPalService;
                            float[] fArr = catchingFishDaggerRetrofit6.CatchingFishRetrofitMVI;
                            fArr[0] = f5;
                            i31 = 1;
                            fArr[1] = catchingFishGraphQLBundle.CatchingFishSensorManager;
                            catchingFishDaggerRetrofit6.CatchingFishPicasso = catchingFishGraphQLBundle.CatchingFishEspressoMockk;
                            catchingFishDaggerRetrofit6.CatchingFishFirebase = catchingFishGraphQLBundle.CatchingFishDagger;
                            int i58 = catchingFishGraphQLBundle.CatchingFishStripeAPI;
                            if (i58 >= 0 && i58 <= 3) {
                                catchingFishDaggerRetrofit6.CatchingFishRoomDatabase = i58;
                            }
                            int i59 = catchingFishGraphQLBundle.CatchingFishCameraXIntent;
                            int i60 = catchingFishGraphQLBundle.CatchingFishPayPalLiveData;
                            int i61 = catchingFishGraphQLBundle.CatchingFishMotionLayout;
                            float f6 = catchingFishGraphQLBundle.CatchingFishParcelable;
                            catchingFishDaggerRetrofit6.CatchingFishNavigation = i59;
                            catchingFishDaggerRetrofit6.CatchingFishCoroutineFlow = i60;
                            if (i61 == Integer.MAX_VALUE) {
                                i61 = 0;
                            }
                            catchingFishDaggerRetrofit6.CatchingFishDaggerHiltFAB = i61;
                            catchingFishDaggerRetrofit6.CatchingFishSpannableWidget = f6;
                            if (f6 > 0.0f && f6 < 1.0f && i59 == 0) {
                                catchingFishDaggerRetrofit6.CatchingFishNavigation = 2;
                            }
                            int i62 = catchingFishGraphQLBundle.CatchingFishHandler;
                            int i63 = catchingFishGraphQLBundle.CatchingFishGradleManifest;
                            int i64 = catchingFishGraphQLBundle.CatchingFishLayoutInflater;
                            float f7 = catchingFishGraphQLBundle.CatchingFishRecyclerView;
                            catchingFishDaggerRetrofit6.CatchingFish = i62;
                            catchingFishDaggerRetrofit6.CatchingFishParcelableFlux = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            catchingFishDaggerRetrofit6.CatchingFishGsonAppCompat = i64;
                            catchingFishDaggerRetrofit6.CatchingFishCardViewRealm = f7;
                            if (f7 <= 0.0f || f7 >= 1.0f || i62 != 0) {
                                i18 = 2;
                            } else {
                                i18 = 2;
                                catchingFishDaggerRetrofit6.CatchingFish = 2;
                            }
                        }
                        i41 = i3 + 1;
                        i38 = i18;
                        z = z2;
                    }
                    i3 = i41;
                    z2 = z;
                    i18 = i38;
                    i41 = i3 + 1;
                    i38 = i18;
                    z = z2;
                }
            }
            if (z) {
                catchingFishGsonAppCompat.CatchingFishGraphQLGlide.CatchingFishReduxMoshi(catchingFishGsonAppCompat);
            }
        }
        catchingFishGsonAppCompat.CatchingFishMVPReduxContext.getClass();
        constraintLayout.CatchingFishCloudMessaging(catchingFishGsonAppCompat, constraintLayout.CatchingFishEspressoTesting, i, i2);
        int CatchingFishRoomDatabase = catchingFishGsonAppCompat.CatchingFishRoomDatabase();
        int CatchingFishCloudMessaging = catchingFishGsonAppCompat.CatchingFishCloudMessaging();
        boolean z5 = catchingFishGsonAppCompat.CatchingFishMVPHandler;
        boolean z6 = catchingFishGsonAppCompat.CatchingFishDaggerAppCompat;
        CatchingFishRetrofitDagger catchingFishRetrofitDagger = constraintLayout.CatchingFishNavigation;
        int i65 = catchingFishRetrofitDagger.CatchingFishDaggerWebsocket;
        int resolveSizeAndState = View.resolveSizeAndState(CatchingFishRoomDatabase + catchingFishRetrofitDagger.CatchingFishReduxKtor, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(CatchingFishCloudMessaging + i65, i2, 0) & 16777215;
        int min = Math.min(constraintLayout.CatchingFishLayout, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.CatchingFishFragmentHandler, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        CatchingFishDaggerRetrofit CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(view);
        if ((view instanceof CatchingFishGradleKtor) && !(CatchingFishDaggerWebsocket instanceof CatchingFishViewModelMockk)) {
            CatchingFishGraphQLBundle catchingFishGraphQLBundle = (CatchingFishGraphQLBundle) view.getLayoutParams();
            CatchingFishViewModelMockk catchingFishViewModelMockk = new CatchingFishViewModelMockk();
            catchingFishGraphQLBundle.CatchingFishGlideWidgetKtor = catchingFishViewModelMockk;
            catchingFishGraphQLBundle.CatchingFishRedux = true;
            catchingFishViewModelMockk.CatchingFishRecyclerView(catchingFishGraphQLBundle.CatchingFishStateFlow);
        }
        if (view instanceof CatchingFishKtorContext) {
            CatchingFishKtorContext catchingFishKtorContext = (CatchingFishKtorContext) view;
            catchingFishKtorContext.CatchingFishLayout();
            ((CatchingFishGraphQLBundle) view.getLayoutParams()).CatchingFishCustomViewJUnit = true;
            ArrayList arrayList = this.CatchingFishDaggerWebsocket;
            if (!arrayList.contains(catchingFishKtorContext)) {
                arrayList.add(catchingFishKtorContext);
            }
        }
        this.CatchingFishReduxKtor.put(view.getId(), view);
        this.CatchingFishCloudMessaging = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.CatchingFishReduxKtor.remove(view.getId());
        CatchingFishDaggerRetrofit CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(view);
        this.CatchingFishWorkManager.CatchingFishFABLayout.remove(CatchingFishDaggerWebsocket);
        CatchingFishDaggerWebsocket.CatchingFishMVPRobolectric();
        this.CatchingFishDaggerWebsocket.remove(view);
        this.CatchingFishCloudMessaging = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.CatchingFishCloudMessaging = true;
        super.requestLayout();
    }

    public void setConstraintSet(CatchingFishAnimationBundle catchingFishAnimationBundle) {
        this.CatchingFishOkHttp = catchingFishAnimationBundle;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.CatchingFishReduxKtor;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.CatchingFishFragmentHandler) {
            return;
        }
        this.CatchingFishFragmentHandler = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.CatchingFishLayout) {
            return;
        }
        this.CatchingFishLayout = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.CatchingFishViewModelFAB) {
            return;
        }
        this.CatchingFishViewModelFAB = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.CatchingFishViewModelScope) {
            return;
        }
        this.CatchingFishViewModelScope = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(CatchingFishToolbarRoom catchingFishToolbarRoom) {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishUnitTesting;
        if (catchingFishBundleGlide != null) {
            catchingFishBundleGlide.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.CatchingFishEspressoTesting = i;
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = this.CatchingFishWorkManager;
        catchingFishGsonAppCompat.CatchingFishKtor = i;
        CatchingFishHandlerOkHttp.CatchingFishRoomDatabase = catchingFishGsonAppCompat.CatchingFishJUnitRealm(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.CatchingFishReduxKtor = new SparseArray();
        this.CatchingFishDaggerWebsocket = new ArrayList(4);
        this.CatchingFishWorkManager = new CatchingFishGsonAppCompat();
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishLayout = Integer.MAX_VALUE;
        this.CatchingFishFragmentHandler = Integer.MAX_VALUE;
        this.CatchingFishCloudMessaging = true;
        this.CatchingFishEspressoTesting = 257;
        this.CatchingFishOkHttp = null;
        this.CatchingFishUnitTesting = null;
        this.CatchingFishAnimationMockk = -1;
        this.CatchingFishStateLiveData = new HashMap();
        this.CatchingFishRoomDatabase = new SparseArray();
        this.CatchingFishNavigation = new CatchingFishRetrofitDagger(this, this);
        CatchingFishLayout(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        CatchingFishGraphQLBundle catchingFishGraphQLBundle = new CatchingFishGraphQLBundle(layoutParams);
        catchingFishGraphQLBundle.CatchingFishParcelableFAB = -1;
        catchingFishGraphQLBundle.CatchingFishSnackbar = -1;
        catchingFishGraphQLBundle.CatchingFishCoroutine = -1.0f;
        catchingFishGraphQLBundle.CatchingFishReduxKtor = true;
        catchingFishGraphQLBundle.CatchingFishDaggerWebsocket = -1;
        catchingFishGraphQLBundle.CatchingFishWorkManager = -1;
        catchingFishGraphQLBundle.CatchingFishViewModelScope = -1;
        catchingFishGraphQLBundle.CatchingFishViewModelFAB = -1;
        catchingFishGraphQLBundle.CatchingFishLayout = -1;
        catchingFishGraphQLBundle.CatchingFishFragmentHandler = -1;
        catchingFishGraphQLBundle.CatchingFishCloudMessaging = -1;
        catchingFishGraphQLBundle.CatchingFishEspressoTesting = -1;
        catchingFishGraphQLBundle.CatchingFishOkHttp = -1;
        catchingFishGraphQLBundle.CatchingFishUnitTesting = -1;
        catchingFishGraphQLBundle.CatchingFishAnimationMockk = -1;
        catchingFishGraphQLBundle.CatchingFishStateLiveData = -1;
        catchingFishGraphQLBundle.CatchingFishRoomDatabase = 0;
        catchingFishGraphQLBundle.CatchingFishNavigation = 0.0f;
        catchingFishGraphQLBundle.CatchingFish = -1;
        catchingFishGraphQLBundle.CatchingFishJetpackCompose = -1;
        catchingFishGraphQLBundle.CatchingFishCoroutineFlow = -1;
        catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB = -1;
        catchingFishGraphQLBundle.CatchingFishSpannableWidget = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishParcelableFlux = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishGsonAppCompat = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCardViewRealm = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishPayPal = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCardViewView = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishMVPRobolectric = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishCustomView = 0;
        catchingFishGraphQLBundle.CatchingFishFragmentFactory = 0.5f;
        catchingFishGraphQLBundle.CatchingFishMutableLiveData = 0.5f;
        catchingFishGraphQLBundle.CatchingFishJobScheduler = null;
        catchingFishGraphQLBundle.CatchingFishPayPalService = -1.0f;
        catchingFishGraphQLBundle.CatchingFishSensorManager = -1.0f;
        catchingFishGraphQLBundle.CatchingFishEspressoMockk = 0;
        catchingFishGraphQLBundle.CatchingFishDagger = 0;
        catchingFishGraphQLBundle.CatchingFishCameraXIntent = 0;
        catchingFishGraphQLBundle.CatchingFishHandler = 0;
        catchingFishGraphQLBundle.CatchingFishPayPalLiveData = 0;
        catchingFishGraphQLBundle.CatchingFishGradleManifest = 0;
        catchingFishGraphQLBundle.CatchingFishMotionLayout = 0;
        catchingFishGraphQLBundle.CatchingFishLayoutInflater = 0;
        catchingFishGraphQLBundle.CatchingFishParcelable = 1.0f;
        catchingFishGraphQLBundle.CatchingFishRecyclerView = 1.0f;
        catchingFishGraphQLBundle.CatchingFishAppCompat = -1;
        catchingFishGraphQLBundle.CatchingFishDataStoreIntent = -1;
        catchingFishGraphQLBundle.CatchingFishStateFlow = -1;
        catchingFishGraphQLBundle.CatchingFishJUnitRealm = false;
        catchingFishGraphQLBundle.CatchingFishAnimation = false;
        catchingFishGraphQLBundle.CatchingFishMVVMAppCompat = null;
        catchingFishGraphQLBundle.CatchingFishStripeAPI = 0;
        catchingFishGraphQLBundle.CatchingFishMoshiDaggerHilt = true;
        catchingFishGraphQLBundle.CatchingFishAndroidX = true;
        catchingFishGraphQLBundle.CatchingFishNavigationGson = false;
        catchingFishGraphQLBundle.CatchingFishRedux = false;
        catchingFishGraphQLBundle.CatchingFishCustomViewJUnit = false;
        catchingFishGraphQLBundle.CatchingFishDaggerMVVM = -1;
        catchingFishGraphQLBundle.CatchingFishMockkOkHttp = -1;
        catchingFishGraphQLBundle.CatchingFishReduxMoshi = -1;
        catchingFishGraphQLBundle.CatchingFishPicasso = -1;
        catchingFishGraphQLBundle.CatchingFishFirebase = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishRetrofitMVI = Integer.MIN_VALUE;
        catchingFishGraphQLBundle.CatchingFishGradleLiveData = 0.5f;
        catchingFishGraphQLBundle.CatchingFishGlideWidgetKtor = new CatchingFishDaggerRetrofit();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) catchingFishGraphQLBundle).bottomMargin = marginLayoutParams.bottomMargin;
            catchingFishGraphQLBundle.setMarginStart(marginLayoutParams.getMarginStart());
            catchingFishGraphQLBundle.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof CatchingFishGraphQLBundle)) {
            return catchingFishGraphQLBundle;
        }
        CatchingFishGraphQLBundle catchingFishGraphQLBundle2 = (CatchingFishGraphQLBundle) layoutParams;
        catchingFishGraphQLBundle.CatchingFishParcelableFAB = catchingFishGraphQLBundle2.CatchingFishParcelableFAB;
        catchingFishGraphQLBundle.CatchingFishSnackbar = catchingFishGraphQLBundle2.CatchingFishSnackbar;
        catchingFishGraphQLBundle.CatchingFishCoroutine = catchingFishGraphQLBundle2.CatchingFishCoroutine;
        catchingFishGraphQLBundle.CatchingFishReduxKtor = catchingFishGraphQLBundle2.CatchingFishReduxKtor;
        catchingFishGraphQLBundle.CatchingFishDaggerWebsocket = catchingFishGraphQLBundle2.CatchingFishDaggerWebsocket;
        catchingFishGraphQLBundle.CatchingFishWorkManager = catchingFishGraphQLBundle2.CatchingFishWorkManager;
        catchingFishGraphQLBundle.CatchingFishViewModelScope = catchingFishGraphQLBundle2.CatchingFishViewModelScope;
        catchingFishGraphQLBundle.CatchingFishViewModelFAB = catchingFishGraphQLBundle2.CatchingFishViewModelFAB;
        catchingFishGraphQLBundle.CatchingFishLayout = catchingFishGraphQLBundle2.CatchingFishLayout;
        catchingFishGraphQLBundle.CatchingFishFragmentHandler = catchingFishGraphQLBundle2.CatchingFishFragmentHandler;
        catchingFishGraphQLBundle.CatchingFishCloudMessaging = catchingFishGraphQLBundle2.CatchingFishCloudMessaging;
        catchingFishGraphQLBundle.CatchingFishEspressoTesting = catchingFishGraphQLBundle2.CatchingFishEspressoTesting;
        catchingFishGraphQLBundle.CatchingFishOkHttp = catchingFishGraphQLBundle2.CatchingFishOkHttp;
        catchingFishGraphQLBundle.CatchingFishUnitTesting = catchingFishGraphQLBundle2.CatchingFishUnitTesting;
        catchingFishGraphQLBundle.CatchingFishAnimationMockk = catchingFishGraphQLBundle2.CatchingFishAnimationMockk;
        catchingFishGraphQLBundle.CatchingFishStateLiveData = catchingFishGraphQLBundle2.CatchingFishStateLiveData;
        catchingFishGraphQLBundle.CatchingFishRoomDatabase = catchingFishGraphQLBundle2.CatchingFishRoomDatabase;
        catchingFishGraphQLBundle.CatchingFishNavigation = catchingFishGraphQLBundle2.CatchingFishNavigation;
        catchingFishGraphQLBundle.CatchingFish = catchingFishGraphQLBundle2.CatchingFish;
        catchingFishGraphQLBundle.CatchingFishJetpackCompose = catchingFishGraphQLBundle2.CatchingFishJetpackCompose;
        catchingFishGraphQLBundle.CatchingFishCoroutineFlow = catchingFishGraphQLBundle2.CatchingFishCoroutineFlow;
        catchingFishGraphQLBundle.CatchingFishDaggerHiltFAB = catchingFishGraphQLBundle2.CatchingFishDaggerHiltFAB;
        catchingFishGraphQLBundle.CatchingFishSpannableWidget = catchingFishGraphQLBundle2.CatchingFishSpannableWidget;
        catchingFishGraphQLBundle.CatchingFishParcelableFlux = catchingFishGraphQLBundle2.CatchingFishParcelableFlux;
        catchingFishGraphQLBundle.CatchingFishGsonAppCompat = catchingFishGraphQLBundle2.CatchingFishGsonAppCompat;
        catchingFishGraphQLBundle.CatchingFishCardViewRealm = catchingFishGraphQLBundle2.CatchingFishCardViewRealm;
        catchingFishGraphQLBundle.CatchingFishPayPal = catchingFishGraphQLBundle2.CatchingFishPayPal;
        catchingFishGraphQLBundle.CatchingFishCardViewView = catchingFishGraphQLBundle2.CatchingFishCardViewView;
        catchingFishGraphQLBundle.CatchingFishMVPRobolectric = catchingFishGraphQLBundle2.CatchingFishMVPRobolectric;
        catchingFishGraphQLBundle.CatchingFishCustomView = catchingFishGraphQLBundle2.CatchingFishCustomView;
        catchingFishGraphQLBundle.CatchingFishFragmentFactory = catchingFishGraphQLBundle2.CatchingFishFragmentFactory;
        catchingFishGraphQLBundle.CatchingFishMutableLiveData = catchingFishGraphQLBundle2.CatchingFishMutableLiveData;
        catchingFishGraphQLBundle.CatchingFishJobScheduler = catchingFishGraphQLBundle2.CatchingFishJobScheduler;
        catchingFishGraphQLBundle.CatchingFishPayPalService = catchingFishGraphQLBundle2.CatchingFishPayPalService;
        catchingFishGraphQLBundle.CatchingFishSensorManager = catchingFishGraphQLBundle2.CatchingFishSensorManager;
        catchingFishGraphQLBundle.CatchingFishEspressoMockk = catchingFishGraphQLBundle2.CatchingFishEspressoMockk;
        catchingFishGraphQLBundle.CatchingFishDagger = catchingFishGraphQLBundle2.CatchingFishDagger;
        catchingFishGraphQLBundle.CatchingFishJUnitRealm = catchingFishGraphQLBundle2.CatchingFishJUnitRealm;
        catchingFishGraphQLBundle.CatchingFishAnimation = catchingFishGraphQLBundle2.CatchingFishAnimation;
        catchingFishGraphQLBundle.CatchingFishCameraXIntent = catchingFishGraphQLBundle2.CatchingFishCameraXIntent;
        catchingFishGraphQLBundle.CatchingFishHandler = catchingFishGraphQLBundle2.CatchingFishHandler;
        catchingFishGraphQLBundle.CatchingFishPayPalLiveData = catchingFishGraphQLBundle2.CatchingFishPayPalLiveData;
        catchingFishGraphQLBundle.CatchingFishMotionLayout = catchingFishGraphQLBundle2.CatchingFishMotionLayout;
        catchingFishGraphQLBundle.CatchingFishGradleManifest = catchingFishGraphQLBundle2.CatchingFishGradleManifest;
        catchingFishGraphQLBundle.CatchingFishLayoutInflater = catchingFishGraphQLBundle2.CatchingFishLayoutInflater;
        catchingFishGraphQLBundle.CatchingFishParcelable = catchingFishGraphQLBundle2.CatchingFishParcelable;
        catchingFishGraphQLBundle.CatchingFishRecyclerView = catchingFishGraphQLBundle2.CatchingFishRecyclerView;
        catchingFishGraphQLBundle.CatchingFishAppCompat = catchingFishGraphQLBundle2.CatchingFishAppCompat;
        catchingFishGraphQLBundle.CatchingFishDataStoreIntent = catchingFishGraphQLBundle2.CatchingFishDataStoreIntent;
        catchingFishGraphQLBundle.CatchingFishStateFlow = catchingFishGraphQLBundle2.CatchingFishStateFlow;
        catchingFishGraphQLBundle.CatchingFishMoshiDaggerHilt = catchingFishGraphQLBundle2.CatchingFishMoshiDaggerHilt;
        catchingFishGraphQLBundle.CatchingFishAndroidX = catchingFishGraphQLBundle2.CatchingFishAndroidX;
        catchingFishGraphQLBundle.CatchingFishNavigationGson = catchingFishGraphQLBundle2.CatchingFishNavigationGson;
        catchingFishGraphQLBundle.CatchingFishRedux = catchingFishGraphQLBundle2.CatchingFishRedux;
        catchingFishGraphQLBundle.CatchingFishDaggerMVVM = catchingFishGraphQLBundle2.CatchingFishDaggerMVVM;
        catchingFishGraphQLBundle.CatchingFishMockkOkHttp = catchingFishGraphQLBundle2.CatchingFishMockkOkHttp;
        catchingFishGraphQLBundle.CatchingFishReduxMoshi = catchingFishGraphQLBundle2.CatchingFishReduxMoshi;
        catchingFishGraphQLBundle.CatchingFishPicasso = catchingFishGraphQLBundle2.CatchingFishPicasso;
        catchingFishGraphQLBundle.CatchingFishFirebase = catchingFishGraphQLBundle2.CatchingFishFirebase;
        catchingFishGraphQLBundle.CatchingFishRetrofitMVI = catchingFishGraphQLBundle2.CatchingFishRetrofitMVI;
        catchingFishGraphQLBundle.CatchingFishGradleLiveData = catchingFishGraphQLBundle2.CatchingFishGradleLiveData;
        catchingFishGraphQLBundle.CatchingFishMVVMAppCompat = catchingFishGraphQLBundle2.CatchingFishMVVMAppCompat;
        catchingFishGraphQLBundle.CatchingFishStripeAPI = catchingFishGraphQLBundle2.CatchingFishStripeAPI;
        catchingFishGraphQLBundle.CatchingFishGlideWidgetKtor = catchingFishGraphQLBundle2.CatchingFishGlideWidgetKtor;
        return catchingFishGraphQLBundle;
    }
}
