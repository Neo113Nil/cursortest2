package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.text.CatchingFishBiometricOkHttp;
import kotlin.text.CatchingFishContextDagger;
import kotlin.text.CatchingFishDaggerRetrofit;
import kotlin.text.CatchingFishFluxAndroidX;
import kotlin.text.CatchingFishGsonAppCompat;
import kotlin.text.CatchingFishGsonBiometric;
import kotlin.text.CatchingFishKtorRealm;
import kotlin.text.CatchingFishRetrofitDagger;
import kotlin.text.CatchingFishStripeAPIJUnit;
import kotlin.text.CatchingFishViewModelMockk;

/* loaded from: classes.dex */
public class Flow extends CatchingFishContextDagger {
    public final CatchingFishBiometricOkHttp CatchingFishOkHttp;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CatchingFishReduxKtor = new int[32];
        this.CatchingFishFragmentHandler = new HashMap();
        this.CatchingFishWorkManager = context;
        super.CatchingFishViewModelScope(attributeSet);
        CatchingFishBiometricOkHttp catchingFishBiometricOkHttp = new CatchingFishBiometricOkHttp();
        catchingFishBiometricOkHttp.CatchingFishStateFlowIntent = 0;
        catchingFishBiometricOkHttp.CatchingFishWidget = 0;
        catchingFishBiometricOkHttp.CatchingFishKtorService = 0;
        catchingFishBiometricOkHttp.CatchingFishWebSocketMockk = 0;
        catchingFishBiometricOkHttp.CatchingFishMVPReduxContext = 0;
        catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm = 0;
        catchingFishBiometricOkHttp.CatchingFishDynamicFeature = false;
        catchingFishBiometricOkHttp.CatchingFishPayPalHandler = 0;
        catchingFishBiometricOkHttp.CatchingFishSharedFlow = 0;
        catchingFishBiometricOkHttp.CatchingFishCameraX = new CatchingFishGsonBiometric();
        catchingFishBiometricOkHttp.CatchingFishLifecycle = null;
        catchingFishBiometricOkHttp.CatchingFishKtor = -1;
        catchingFishBiometricOkHttp.CatchingFishMVPHandler = -1;
        catchingFishBiometricOkHttp.CatchingFishDaggerAppCompat = -1;
        catchingFishBiometricOkHttp.CatchingFishLiveDataRoom = -1;
        catchingFishBiometricOkHttp.CatchingFishGlideMVP = -1;
        catchingFishBiometricOkHttp.CatchingFishContextToast = -1;
        catchingFishBiometricOkHttp.CatchingFishToolbar = 0.5f;
        catchingFishBiometricOkHttp.CatchingFishExoPlayer = 0.5f;
        catchingFishBiometricOkHttp.CatchingFishMaterialDesign = 0.5f;
        catchingFishBiometricOkHttp.CatchingFishCardView = 0.5f;
        catchingFishBiometricOkHttp.CatchingFishLifecycleHilt = 0.5f;
        catchingFishBiometricOkHttp.CatchingFishStripeAPIWidget = 0.5f;
        catchingFishBiometricOkHttp.CatchingFishHiltBundle = 0;
        catchingFishBiometricOkHttp.CatchingFishWebsocket = 0;
        catchingFishBiometricOkHttp.CatchingFishJUnitIntent = 2;
        catchingFishBiometricOkHttp.CatchingFishRetrofitCameraX = 2;
        catchingFishBiometricOkHttp.CatchingFishGradle = 0;
        catchingFishBiometricOkHttp.CatchingFishJUnitViewPager = -1;
        catchingFishBiometricOkHttp.CatchingFishToolbarEspresso = 0;
        catchingFishBiometricOkHttp.CatchingFishIntent = new ArrayList();
        catchingFishBiometricOkHttp.CatchingFishKtorRealmView = null;
        catchingFishBiometricOkHttp.CatchingFishFragment = null;
        catchingFishBiometricOkHttp.CatchingFishGradleFirebase = null;
        catchingFishBiometricOkHttp.CatchingFishAccessibility = 0;
        this.CatchingFishOkHttp = catchingFishBiometricOkHttp;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishSnackbar);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.CatchingFishOkHttp.CatchingFishToolbarEspresso = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    CatchingFishBiometricOkHttp catchingFishBiometricOkHttp2 = this.CatchingFishOkHttp;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    catchingFishBiometricOkHttp2.CatchingFishStateFlowIntent = dimensionPixelSize;
                    catchingFishBiometricOkHttp2.CatchingFishWidget = dimensionPixelSize;
                    catchingFishBiometricOkHttp2.CatchingFishKtorService = dimensionPixelSize;
                    catchingFishBiometricOkHttp2.CatchingFishWebSocketMockk = dimensionPixelSize;
                } else if (index == 18) {
                    CatchingFishBiometricOkHttp catchingFishBiometricOkHttp3 = this.CatchingFishOkHttp;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    catchingFishBiometricOkHttp3.CatchingFishKtorService = dimensionPixelSize2;
                    catchingFishBiometricOkHttp3.CatchingFishMVPReduxContext = dimensionPixelSize2;
                    catchingFishBiometricOkHttp3.CatchingFishRealmKtorRealm = dimensionPixelSize2;
                } else if (index == 19) {
                    this.CatchingFishOkHttp.CatchingFishWebSocketMockk = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.CatchingFishOkHttp.CatchingFishMVPReduxContext = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.CatchingFishOkHttp.CatchingFishStateFlowIntent = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.CatchingFishOkHttp.CatchingFishRealmKtorRealm = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.CatchingFishOkHttp.CatchingFishWidget = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.CatchingFishOkHttp.CatchingFishGradle = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.CatchingFishOkHttp.CatchingFishKtor = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.CatchingFishOkHttp.CatchingFishMVPHandler = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.CatchingFishOkHttp.CatchingFishDaggerAppCompat = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.CatchingFishOkHttp.CatchingFishGlideMVP = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.CatchingFishOkHttp.CatchingFishLiveDataRoom = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.CatchingFishOkHttp.CatchingFishContextToast = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.CatchingFishOkHttp.CatchingFishToolbar = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.CatchingFishOkHttp.CatchingFishMaterialDesign = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.CatchingFishOkHttp.CatchingFishLifecycleHilt = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.CatchingFishOkHttp.CatchingFishCardView = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.CatchingFishOkHttp.CatchingFishStripeAPIWidget = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.CatchingFishOkHttp.CatchingFishExoPlayer = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.CatchingFishOkHttp.CatchingFishJUnitIntent = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.CatchingFishOkHttp.CatchingFishRetrofitCameraX = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.CatchingFishOkHttp.CatchingFishHiltBundle = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.CatchingFishOkHttp.CatchingFishWebsocket = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.CatchingFishOkHttp.CatchingFishJUnitViewPager = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.CatchingFishViewModelScope = this.CatchingFishOkHttp;
        CatchingFishLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0759  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // kotlin.text.CatchingFishContextDagger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishFragmentHandler(CatchingFishBiometricOkHttp catchingFishBiometricOkHttp, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        CatchingFishKtorRealm catchingFishKtorRealm;
        char c;
        ?? r12;
        boolean z;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Object obj;
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit;
        boolean z2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3;
        ArrayList arrayList;
        int i23;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (catchingFishBiometricOkHttp == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = catchingFishBiometricOkHttp.CatchingFishGlideWidgetKtor;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4 = catchingFishBiometricOkHttp.CatchingFishEspressoMockk;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit5 = catchingFishBiometricOkHttp.CatchingFishSensorManager;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit6 = catchingFishBiometricOkHttp.CatchingFishDagger;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit7 = catchingFishBiometricOkHttp.CatchingFishCameraXIntent;
        ArrayList arrayList2 = catchingFishBiometricOkHttp.CatchingFishIntent;
        if (catchingFishBiometricOkHttp.CatchingFishGraphQLGlide > 0) {
            CatchingFishGsonBiometric catchingFishGsonBiometric = catchingFishBiometricOkHttp.CatchingFishCameraX;
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = catchingFishBiometricOkHttp.CatchingFishAppCompat;
            CatchingFishRetrofitDagger catchingFishRetrofitDagger = catchingFishDaggerRetrofit2 != null ? ((CatchingFishGsonAppCompat) catchingFishDaggerRetrofit2).CatchingFishKtorService : null;
            if (catchingFishRetrofitDagger == null) {
                catchingFishBiometricOkHttp.CatchingFishPayPalHandler = 0;
                catchingFishBiometricOkHttp.CatchingFishSharedFlow = 0;
                catchingFishBiometricOkHttp.CatchingFishDynamicFeature = false;
                setMeasuredDimension(catchingFishBiometricOkHttp.CatchingFishPayPalHandler, catchingFishBiometricOkHttp.CatchingFishSharedFlow);
            }
            int i24 = 0;
            while (i24 < catchingFishBiometricOkHttp.CatchingFishGraphQLGlide) {
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3 = catchingFishBiometricOkHttp.CatchingFishFABLayout[i24];
                if (catchingFishDaggerRetrofit3 == null) {
                    catchingFishStripeAPIJUnit = catchingFishStripeAPIJUnit5;
                } else {
                    catchingFishStripeAPIJUnit = catchingFishStripeAPIJUnit5;
                    if (!(catchingFishDaggerRetrofit3 instanceof CatchingFishViewModelMockk)) {
                        catchingFishStripeAPIJUnit2 = catchingFishStripeAPIJUnit6;
                        int CatchingFishFragmentHandler = catchingFishDaggerRetrofit3.CatchingFishFragmentHandler(0);
                        catchingFishStripeAPIJUnit3 = catchingFishStripeAPIJUnit7;
                        int CatchingFishFragmentHandler2 = catchingFishDaggerRetrofit3.CatchingFishFragmentHandler(1);
                        arrayList = arrayList2;
                        if (CatchingFishFragmentHandler == 3) {
                            i23 = i24;
                            if (catchingFishDaggerRetrofit3.CatchingFishNavigation != 1 && CatchingFishFragmentHandler2 == 3 && catchingFishDaggerRetrofit3.CatchingFish != 1) {
                                i24 = i23 + 1;
                                catchingFishStripeAPIJUnit5 = catchingFishStripeAPIJUnit;
                                catchingFishStripeAPIJUnit6 = catchingFishStripeAPIJUnit2;
                                catchingFishStripeAPIJUnit7 = catchingFishStripeAPIJUnit3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i23 = i24;
                        }
                        if (CatchingFishFragmentHandler == 3) {
                            CatchingFishFragmentHandler = 2;
                        }
                        if (CatchingFishFragmentHandler2 == 3) {
                            CatchingFishFragmentHandler2 = 2;
                        }
                        catchingFishGsonBiometric.CatchingFishParcelableFAB = CatchingFishFragmentHandler;
                        catchingFishGsonBiometric.CatchingFishSnackbar = CatchingFishFragmentHandler2;
                        catchingFishGsonBiometric.CatchingFishCoroutine = catchingFishDaggerRetrofit3.CatchingFishRoomDatabase();
                        catchingFishGsonBiometric.CatchingFishReduxKtor = catchingFishDaggerRetrofit3.CatchingFishCloudMessaging();
                        catchingFishRetrofitDagger.CatchingFishSnackbar(catchingFishDaggerRetrofit3, catchingFishGsonBiometric);
                        catchingFishDaggerRetrofit3.CatchingFishGradleManifest(catchingFishGsonBiometric.CatchingFishDaggerWebsocket);
                        catchingFishDaggerRetrofit3.CatchingFishCameraXIntent(catchingFishGsonBiometric.CatchingFishWorkManager);
                        catchingFishDaggerRetrofit3.CatchingFishSensorManager(catchingFishGsonBiometric.CatchingFishViewModelScope);
                        i24 = i23 + 1;
                        catchingFishStripeAPIJUnit5 = catchingFishStripeAPIJUnit;
                        catchingFishStripeAPIJUnit6 = catchingFishStripeAPIJUnit2;
                        catchingFishStripeAPIJUnit7 = catchingFishStripeAPIJUnit3;
                        arrayList2 = arrayList;
                    }
                }
                catchingFishStripeAPIJUnit2 = catchingFishStripeAPIJUnit6;
                catchingFishStripeAPIJUnit3 = catchingFishStripeAPIJUnit7;
                arrayList = arrayList2;
                i23 = i24;
                i24 = i23 + 1;
                catchingFishStripeAPIJUnit5 = catchingFishStripeAPIJUnit;
                catchingFishStripeAPIJUnit6 = catchingFishStripeAPIJUnit2;
                catchingFishStripeAPIJUnit7 = catchingFishStripeAPIJUnit3;
                arrayList2 = arrayList;
            }
        }
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit8 = catchingFishStripeAPIJUnit5;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit9 = catchingFishStripeAPIJUnit6;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit10 = catchingFishStripeAPIJUnit7;
        ArrayList arrayList3 = arrayList2;
        int i25 = catchingFishBiometricOkHttp.CatchingFishMVPReduxContext;
        int i26 = catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm;
        int i27 = catchingFishBiometricOkHttp.CatchingFishStateFlowIntent;
        int i28 = catchingFishBiometricOkHttp.CatchingFishWidget;
        int[] iArr3 = new int[2];
        int i29 = (size - i25) - i26;
        int i30 = catchingFishBiometricOkHttp.CatchingFishToolbarEspresso;
        if (i30 == 1) {
            i29 = (size2 - i27) - i28;
        }
        int i31 = i29;
        if (i30 == 0) {
            if (catchingFishBiometricOkHttp.CatchingFishKtor == -1) {
                i22 = 0;
                catchingFishBiometricOkHttp.CatchingFishKtor = 0;
            } else {
                i22 = 0;
            }
            i3 = i26;
            if (catchingFishBiometricOkHttp.CatchingFishMVPHandler == -1) {
                catchingFishBiometricOkHttp.CatchingFishMVPHandler = i22;
            }
        } else {
            i3 = i26;
            if (catchingFishBiometricOkHttp.CatchingFishKtor == -1) {
                catchingFishBiometricOkHttp.CatchingFishKtor = 0;
            }
            if (catchingFishBiometricOkHttp.CatchingFishMVPHandler == -1) {
                catchingFishBiometricOkHttp.CatchingFishMVPHandler = 0;
            }
        }
        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr2 = catchingFishBiometricOkHttp.CatchingFishFABLayout;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i4 = catchingFishBiometricOkHttp.CatchingFishGraphQLGlide;
            i5 = i27;
            if (i32 >= i4) {
                break;
            }
            if (catchingFishBiometricOkHttp.CatchingFishFABLayout[i32].CatchingFishMockkOkHttp == 8) {
                i33++;
            }
            i32++;
            i27 = i5;
        }
        if (i33 > 0) {
            catchingFishDaggerRetrofitArr = new CatchingFishDaggerRetrofit[i4 - i33];
            int i34 = 0;
            int i35 = 0;
            while (i34 < catchingFishBiometricOkHttp.CatchingFishGraphQLGlide) {
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit4 = catchingFishBiometricOkHttp.CatchingFishFABLayout[i34];
                CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr3 = catchingFishDaggerRetrofitArr;
                if (catchingFishDaggerRetrofit4.CatchingFishMockkOkHttp != 8) {
                    catchingFishDaggerRetrofitArr3[i35] = catchingFishDaggerRetrofit4;
                    i35++;
                }
                i34++;
                catchingFishDaggerRetrofitArr = catchingFishDaggerRetrofitArr3;
            }
            i6 = i35;
        } else {
            i6 = i4;
            catchingFishDaggerRetrofitArr = catchingFishDaggerRetrofitArr2;
        }
        catchingFishBiometricOkHttp.CatchingFishJUnitLiveData = catchingFishDaggerRetrofitArr;
        catchingFishBiometricOkHttp.CatchingFishAccessibility = i6;
        int i36 = catchingFishBiometricOkHttp.CatchingFishGradle;
        if (i36 == 0) {
            CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr4 = catchingFishDaggerRetrofitArr;
            int i37 = i6;
            i7 = i28;
            iArr = iArr3;
            i8 = size2;
            i9 = i25;
            i10 = i3;
            i11 = i5;
            int i38 = catchingFishBiometricOkHttp.CatchingFishToolbarEspresso;
            if (i37 != 0) {
                if (arrayList3.size() == 0) {
                    catchingFishKtorRealm = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i38, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                    arrayList3.add(catchingFishKtorRealm);
                } else {
                    CatchingFishKtorRealm catchingFishKtorRealm2 = (CatchingFishKtorRealm) arrayList3.get(0);
                    catchingFishKtorRealm2.CatchingFishCoroutine = 0;
                    catchingFishKtorRealm2.CatchingFishSnackbar = null;
                    catchingFishKtorRealm2.CatchingFishEspressoTesting = 0;
                    catchingFishKtorRealm2.CatchingFishOkHttp = 0;
                    catchingFishKtorRealm2.CatchingFishUnitTesting = 0;
                    catchingFishKtorRealm2.CatchingFishAnimationMockk = 0;
                    catchingFishKtorRealm2.CatchingFishStateLiveData = 0;
                    catchingFishKtorRealm2.CatchingFishWorkManager(i38, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, catchingFishBiometricOkHttp.CatchingFishMVPReduxContext, catchingFishBiometricOkHttp.CatchingFishStateFlowIntent, catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm, catchingFishBiometricOkHttp.CatchingFishWidget, i31);
                    catchingFishKtorRealm = catchingFishKtorRealm2;
                }
                for (int i39 = 0; i39 < i37; i39++) {
                    catchingFishKtorRealm.CatchingFishParcelableFAB(catchingFishDaggerRetrofitArr4[i39]);
                }
                c = 0;
                iArr[0] = catchingFishKtorRealm.CatchingFishReduxKtor();
                r12 = 1;
                iArr[1] = catchingFishKtorRealm.CatchingFishCoroutine();
                int i40 = iArr[c] + i9 + i10;
                int i41 = iArr[r12] + i11 + i7;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                catchingFishBiometricOkHttp.CatchingFishPayPalHandler = size;
                catchingFishBiometricOkHttp.CatchingFishSharedFlow = r0;
                catchingFishBiometricOkHttp.CatchingFishGradleManifest(size);
                catchingFishBiometricOkHttp.CatchingFishCameraXIntent(r0);
                catchingFishBiometricOkHttp.CatchingFishDynamicFeature = catchingFishBiometricOkHttp.CatchingFishGraphQLGlide > 0 ? r12 : false;
                setMeasuredDimension(catchingFishBiometricOkHttp.CatchingFishPayPalHandler, catchingFishBiometricOkHttp.CatchingFishSharedFlow);
            }
        } else {
            if (i36 != 1) {
                if (i36 == 2) {
                    CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr5 = catchingFishDaggerRetrofitArr;
                    int i42 = i6;
                    i7 = i28;
                    iArr = iArr3;
                    i8 = size2;
                    i9 = i25;
                    i10 = i3;
                    i11 = i5;
                    int i43 = catchingFishBiometricOkHttp.CatchingFishToolbarEspresso;
                    if (i43 == 0) {
                        int i44 = catchingFishBiometricOkHttp.CatchingFishJUnitViewPager;
                        if (i44 <= 0) {
                            int i45 = 0;
                            i16 = 0;
                            for (int i46 = 0; i46 < i42; i46++) {
                                if (i46 > 0) {
                                    i45 += catchingFishBiometricOkHttp.CatchingFishHiltBundle;
                                }
                                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit5 = catchingFishDaggerRetrofitArr5[i46];
                                if (catchingFishDaggerRetrofit5 != null) {
                                    int CatchingFishDataStoreIntent = catchingFishBiometricOkHttp.CatchingFishDataStoreIntent(catchingFishDaggerRetrofit5, i31) + i45;
                                    if (CatchingFishDataStoreIntent > i31) {
                                        break;
                                    }
                                    i16++;
                                    i45 = CatchingFishDataStoreIntent;
                                }
                            }
                        } else {
                            i16 = i44;
                        }
                        i15 = 0;
                    } else {
                        i15 = catchingFishBiometricOkHttp.CatchingFishJUnitViewPager;
                        if (i15 <= 0) {
                            int i47 = 0;
                            int i48 = 0;
                            for (int i49 = 0; i49 < i42; i49++) {
                                if (i49 > 0) {
                                    i47 += catchingFishBiometricOkHttp.CatchingFishWebsocket;
                                }
                                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit6 = catchingFishDaggerRetrofitArr5[i49];
                                if (catchingFishDaggerRetrofit6 != null) {
                                    int CatchingFishAppCompat = catchingFishBiometricOkHttp.CatchingFishAppCompat(catchingFishDaggerRetrofit6, i31) + i47;
                                    if (CatchingFishAppCompat > i31) {
                                        break;
                                    }
                                    i48++;
                                    i47 = CatchingFishAppCompat;
                                }
                            }
                            i15 = i48;
                        }
                        i16 = 0;
                    }
                    if (catchingFishBiometricOkHttp.CatchingFishGradleFirebase == null) {
                        catchingFishBiometricOkHttp.CatchingFishGradleFirebase = new int[2];
                    }
                    boolean z3 = (i15 == 0 && i43 == 1) || (i16 == 0 && i43 == 0);
                    while (!z3) {
                        if (i43 == 0) {
                            i15 = (int) Math.ceil(i42 / i16);
                        } else {
                            i16 = (int) Math.ceil(i42 / i15);
                        }
                        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr6 = catchingFishBiometricOkHttp.CatchingFishFragment;
                        if (catchingFishDaggerRetrofitArr6 == null || catchingFishDaggerRetrofitArr6.length < i16) {
                            obj = null;
                            catchingFishBiometricOkHttp.CatchingFishFragment = new CatchingFishDaggerRetrofit[i16];
                        } else {
                            obj = null;
                            Arrays.fill(catchingFishDaggerRetrofitArr6, (Object) null);
                        }
                        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr7 = catchingFishBiometricOkHttp.CatchingFishKtorRealmView;
                        if (catchingFishDaggerRetrofitArr7 == null || catchingFishDaggerRetrofitArr7.length < i15) {
                            catchingFishBiometricOkHttp.CatchingFishKtorRealmView = new CatchingFishDaggerRetrofit[i15];
                        } else {
                            Arrays.fill(catchingFishDaggerRetrofitArr7, obj);
                        }
                        for (int i50 = 0; i50 < i16; i50++) {
                            for (int i51 = 0; i51 < i15; i51++) {
                                int i52 = (i51 * i16) + i50;
                                if (i43 == 1) {
                                    i52 = (i50 * i15) + i51;
                                }
                                if (i52 < catchingFishDaggerRetrofitArr5.length && (catchingFishDaggerRetrofit = catchingFishDaggerRetrofitArr5[i52]) != null) {
                                    int CatchingFishDataStoreIntent2 = catchingFishBiometricOkHttp.CatchingFishDataStoreIntent(catchingFishDaggerRetrofit, i31);
                                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit7 = catchingFishBiometricOkHttp.CatchingFishFragment[i50];
                                    if (catchingFishDaggerRetrofit7 == null || catchingFishDaggerRetrofit7.CatchingFishRoomDatabase() < CatchingFishDataStoreIntent2) {
                                        catchingFishBiometricOkHttp.CatchingFishFragment[i50] = catchingFishDaggerRetrofit;
                                    }
                                    int CatchingFishAppCompat2 = catchingFishBiometricOkHttp.CatchingFishAppCompat(catchingFishDaggerRetrofit, i31);
                                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit8 = catchingFishBiometricOkHttp.CatchingFishKtorRealmView[i51];
                                    if (catchingFishDaggerRetrofit8 == null || catchingFishDaggerRetrofit8.CatchingFishCloudMessaging() < CatchingFishAppCompat2) {
                                        catchingFishBiometricOkHttp.CatchingFishKtorRealmView[i51] = catchingFishDaggerRetrofit;
                                    }
                                }
                            }
                        }
                        int i53 = 0;
                        for (int i54 = 0; i54 < i16; i54++) {
                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit9 = catchingFishBiometricOkHttp.CatchingFishFragment[i54];
                            if (catchingFishDaggerRetrofit9 != null) {
                                if (i54 > 0) {
                                    i53 += catchingFishBiometricOkHttp.CatchingFishHiltBundle;
                                }
                                i53 = catchingFishBiometricOkHttp.CatchingFishDataStoreIntent(catchingFishDaggerRetrofit9, i31) + i53;
                            }
                        }
                        int i55 = 0;
                        for (int i56 = 0; i56 < i15; i56++) {
                            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit10 = catchingFishBiometricOkHttp.CatchingFishKtorRealmView[i56];
                            if (catchingFishDaggerRetrofit10 != null) {
                                if (i56 > 0) {
                                    i55 += catchingFishBiometricOkHttp.CatchingFishWebsocket;
                                }
                                i55 = catchingFishBiometricOkHttp.CatchingFishAppCompat(catchingFishDaggerRetrofit10, i31) + i55;
                            }
                        }
                        iArr[0] = i53;
                        iArr[1] = i55;
                        if (i43 == 0) {
                            if (i53 > i31 && i16 > 1) {
                                i16--;
                            }
                            z3 = true;
                        } else {
                            if (i55 > i31 && i15 > 1) {
                                i15--;
                            }
                            z3 = true;
                        }
                    }
                    z = true;
                    int[] iArr4 = catchingFishBiometricOkHttp.CatchingFishGradleFirebase;
                    iArr4[0] = i16;
                    iArr4[1] = i15;
                } else if (i36 != 3) {
                    i7 = i28;
                    iArr = iArr3;
                    i8 = size2;
                    i9 = i25;
                    i10 = i3;
                    i11 = i5;
                } else {
                    int i57 = i6;
                    int i58 = catchingFishBiometricOkHttp.CatchingFishToolbarEspresso;
                    if (i57 == 0) {
                        i7 = i28;
                        iArr = iArr3;
                        i8 = size2;
                        i9 = i25;
                        i10 = i3;
                        i11 = i5;
                        z2 = true;
                    } else {
                        arrayList3.clear();
                        CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr8 = catchingFishDaggerRetrofitArr;
                        i9 = i25;
                        i7 = i28;
                        i10 = i3;
                        i11 = i5;
                        iArr = iArr3;
                        z2 = true;
                        CatchingFishKtorRealm catchingFishKtorRealm3 = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i58, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                        arrayList3.add(catchingFishKtorRealm3);
                        if (i58 == 0) {
                            int i59 = 0;
                            int i60 = 0;
                            i17 = 0;
                            int i61 = 0;
                            while (i59 < i57) {
                                i60++;
                                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit11 = catchingFishDaggerRetrofitArr8[i59];
                                int CatchingFishDataStoreIntent3 = catchingFishBiometricOkHttp.CatchingFishDataStoreIntent(catchingFishDaggerRetrofit11, i31);
                                int i62 = i58;
                                int i63 = i59;
                                if (catchingFishDaggerRetrofit11.CatchingFishGlideWidgetKtor[0] == 3) {
                                    i17++;
                                }
                                int i64 = i17;
                                boolean z4 = (i61 == i31 || (catchingFishBiometricOkHttp.CatchingFishHiltBundle + i61) + CatchingFishDataStoreIntent3 > i31) && catchingFishKtorRealm3.CatchingFishSnackbar != null;
                                if (!z4 && i63 > 0 && (i21 = catchingFishBiometricOkHttp.CatchingFishJUnitViewPager) > 0 && i60 > i21) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i19 = size2;
                                    i58 = i62;
                                    i20 = i63;
                                    catchingFishKtorRealm3 = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i58, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                                    catchingFishKtorRealm3.CatchingFishUnitTesting = i20;
                                    arrayList3.add(catchingFishKtorRealm3);
                                    i60 = 1;
                                } else {
                                    i19 = size2;
                                    i58 = i62;
                                    i20 = i63;
                                    if (i20 > 0) {
                                        i61 = catchingFishBiometricOkHttp.CatchingFishHiltBundle + CatchingFishDataStoreIntent3 + i61;
                                        catchingFishKtorRealm3.CatchingFishParcelableFAB(catchingFishDaggerRetrofit11);
                                        i59 = i20 + 1;
                                        i17 = i64;
                                        size2 = i19;
                                    }
                                }
                                i61 = CatchingFishDataStoreIntent3;
                                catchingFishKtorRealm3.CatchingFishParcelableFAB(catchingFishDaggerRetrofit11);
                                i59 = i20 + 1;
                                i17 = i64;
                                size2 = i19;
                            }
                            i8 = size2;
                        } else {
                            i8 = size2;
                            int i65 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            int i68 = 0;
                            while (i65 < i57) {
                                i66++;
                                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit12 = catchingFishDaggerRetrofitArr8[i65];
                                int CatchingFishAppCompat3 = catchingFishBiometricOkHttp.CatchingFishAppCompat(catchingFishDaggerRetrofit12, i31);
                                int i69 = i58;
                                if (catchingFishDaggerRetrofit12.CatchingFishGlideWidgetKtor[1] == 3) {
                                    i67++;
                                }
                                int i70 = i67;
                                boolean z5 = (i68 == i31 || (catchingFishBiometricOkHttp.CatchingFishWebsocket + i68) + CatchingFishAppCompat3 > i31) && catchingFishKtorRealm3.CatchingFishSnackbar != null;
                                if (!z5 && i65 > 0 && (i18 = catchingFishBiometricOkHttp.CatchingFishJUnitViewPager) > 0 && i66 > i18) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i58 = i69;
                                    catchingFishKtorRealm3 = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i58, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                                    catchingFishKtorRealm3.CatchingFishUnitTesting = i65;
                                    arrayList3.add(catchingFishKtorRealm3);
                                    i66 = 1;
                                } else {
                                    i58 = i69;
                                    if (i65 > 0) {
                                        i68 = catchingFishBiometricOkHttp.CatchingFishWebsocket + CatchingFishAppCompat3 + i68;
                                        catchingFishKtorRealm3.CatchingFishParcelableFAB(catchingFishDaggerRetrofit12);
                                        i65++;
                                        i67 = i70;
                                    }
                                }
                                i68 = CatchingFishAppCompat3;
                                catchingFishKtorRealm3.CatchingFishParcelableFAB(catchingFishDaggerRetrofit12);
                                i65++;
                                i67 = i70;
                            }
                            i17 = i67;
                        }
                        int size3 = arrayList3.size();
                        int i71 = catchingFishBiometricOkHttp.CatchingFishMVPReduxContext;
                        int i72 = catchingFishBiometricOkHttp.CatchingFishStateFlowIntent;
                        int i73 = catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm;
                        int i74 = catchingFishBiometricOkHttp.CatchingFishWidget;
                        boolean z6 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i17 > 0 && z6) {
                            for (int i75 = 0; i75 < size3; i75++) {
                                CatchingFishKtorRealm catchingFishKtorRealm4 = (CatchingFishKtorRealm) arrayList3.get(i75);
                                if (i58 == 0) {
                                    catchingFishKtorRealm4.CatchingFishDaggerWebsocket(i31 - catchingFishKtorRealm4.CatchingFishReduxKtor());
                                } else {
                                    catchingFishKtorRealm4.CatchingFishDaggerWebsocket(i31 - catchingFishKtorRealm4.CatchingFishCoroutine());
                                }
                            }
                        }
                        int i76 = i71;
                        int i77 = i72;
                        int i78 = i73;
                        int i79 = i74;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit11 = catchingFishStripeAPIJUnit8;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit12 = catchingFishStripeAPIJUnit9;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit13 = catchingFishStripeAPIJUnit10;
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit14 = catchingFishStripeAPIJUnit4;
                        int i80 = 0;
                        int i81 = 0;
                        for (int i82 = 0; i82 < size3; i82++) {
                            CatchingFishKtorRealm catchingFishKtorRealm5 = (CatchingFishKtorRealm) arrayList3.get(i82);
                            if (i58 == 0) {
                                if (i82 < size3 - 1) {
                                    catchingFishStripeAPIJUnit13 = ((CatchingFishKtorRealm) arrayList3.get(i82 + 1)).CatchingFishSnackbar.CatchingFishEspressoMockk;
                                    i79 = 0;
                                } else {
                                    i79 = catchingFishBiometricOkHttp.CatchingFishWidget;
                                    catchingFishStripeAPIJUnit13 = catchingFishStripeAPIJUnit10;
                                }
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit15 = catchingFishKtorRealm5.CatchingFishSnackbar.CatchingFishCameraXIntent;
                                catchingFishKtorRealm5.CatchingFishWorkManager(i58, catchingFishStripeAPIJUnit11, catchingFishStripeAPIJUnit14, catchingFishStripeAPIJUnit12, catchingFishStripeAPIJUnit13, i76, i77, i78, i79, i31);
                                i80 = Math.max(i80, catchingFishKtorRealm5.CatchingFishReduxKtor());
                                int CatchingFishCoroutine = catchingFishKtorRealm5.CatchingFishCoroutine() + i81;
                                if (i82 > 0) {
                                    CatchingFishCoroutine += catchingFishBiometricOkHttp.CatchingFishWebsocket;
                                }
                                i81 = CatchingFishCoroutine;
                                catchingFishStripeAPIJUnit14 = catchingFishStripeAPIJUnit15;
                                i77 = 0;
                            } else {
                                if (i82 < size3 - 1) {
                                    catchingFishStripeAPIJUnit12 = ((CatchingFishKtorRealm) arrayList3.get(i82 + 1)).CatchingFishSnackbar.CatchingFishSensorManager;
                                    i78 = 0;
                                } else {
                                    i78 = catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm;
                                    catchingFishStripeAPIJUnit12 = catchingFishStripeAPIJUnit9;
                                }
                                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit16 = catchingFishKtorRealm5.CatchingFishSnackbar.CatchingFishDagger;
                                catchingFishKtorRealm5.CatchingFishWorkManager(i58, catchingFishStripeAPIJUnit11, catchingFishStripeAPIJUnit14, catchingFishStripeAPIJUnit12, catchingFishStripeAPIJUnit13, i76, i77, i78, i79, i31);
                                int CatchingFishReduxKtor = catchingFishKtorRealm5.CatchingFishReduxKtor() + i80;
                                int max = Math.max(i81, catchingFishKtorRealm5.CatchingFishCoroutine());
                                if (i82 > 0) {
                                    CatchingFishReduxKtor += catchingFishBiometricOkHttp.CatchingFishHiltBundle;
                                }
                                i81 = max;
                                i80 = CatchingFishReduxKtor;
                                catchingFishStripeAPIJUnit11 = catchingFishStripeAPIJUnit16;
                                i76 = 0;
                            }
                        }
                        iArr[0] = i80;
                        iArr[1] = i81;
                    }
                    z = z2;
                }
                c = 0;
                r12 = z;
                int i402 = iArr[c] + i9 + i10;
                int i412 = iArr[r12] + i11 + i7;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i402, size) : mode == 0 ? i402 : 0;
                }
                int min = mode2 == 1073741824 ? i8 : mode2 == Integer.MIN_VALUE ? Math.min(i412, i8) : mode2 == 0 ? i412 : 0;
                catchingFishBiometricOkHttp.CatchingFishPayPalHandler = size;
                catchingFishBiometricOkHttp.CatchingFishSharedFlow = min;
                catchingFishBiometricOkHttp.CatchingFishGradleManifest(size);
                catchingFishBiometricOkHttp.CatchingFishCameraXIntent(min);
                catchingFishBiometricOkHttp.CatchingFishDynamicFeature = catchingFishBiometricOkHttp.CatchingFishGraphQLGlide > 0 ? r12 : false;
                setMeasuredDimension(catchingFishBiometricOkHttp.CatchingFishPayPalHandler, catchingFishBiometricOkHttp.CatchingFishSharedFlow);
            }
            i7 = i28;
            iArr = iArr3;
            i8 = size2;
            i9 = i25;
            i10 = i3;
            i11 = i5;
            int i83 = i6;
            CatchingFishDaggerRetrofit[] catchingFishDaggerRetrofitArr9 = catchingFishDaggerRetrofitArr;
            int i84 = catchingFishBiometricOkHttp.CatchingFishToolbarEspresso;
            if (i83 != 0) {
                arrayList3.clear();
                CatchingFishKtorRealm catchingFishKtorRealm6 = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i84, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                arrayList3.add(catchingFishKtorRealm6);
                if (i84 == 0) {
                    int i85 = 0;
                    i12 = 0;
                    int i86 = 0;
                    while (i85 < i83) {
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit13 = catchingFishDaggerRetrofitArr9[i85];
                        int CatchingFishDataStoreIntent4 = catchingFishBiometricOkHttp.CatchingFishDataStoreIntent(catchingFishDaggerRetrofit13, i31);
                        if (catchingFishDaggerRetrofit13.CatchingFishGlideWidgetKtor[0] == 3) {
                            i12++;
                        }
                        int i87 = i12;
                        boolean z7 = (i86 == i31 || (catchingFishBiometricOkHttp.CatchingFishHiltBundle + i86) + CatchingFishDataStoreIntent4 > i31) && catchingFishKtorRealm6.CatchingFishSnackbar != null;
                        if (!z7 && i85 > 0 && (i14 = catchingFishBiometricOkHttp.CatchingFishJUnitViewPager) > 0 && i85 % i14 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            catchingFishKtorRealm6 = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i84, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                            catchingFishKtorRealm6.CatchingFishUnitTesting = i85;
                            arrayList3.add(catchingFishKtorRealm6);
                        } else if (i85 > 0) {
                            i86 = catchingFishBiometricOkHttp.CatchingFishHiltBundle + CatchingFishDataStoreIntent4 + i86;
                            catchingFishKtorRealm6.CatchingFishParcelableFAB(catchingFishDaggerRetrofit13);
                            i85++;
                            i12 = i87;
                        }
                        i86 = CatchingFishDataStoreIntent4;
                        catchingFishKtorRealm6.CatchingFishParcelableFAB(catchingFishDaggerRetrofit13);
                        i85++;
                        i12 = i87;
                    }
                } else {
                    int i88 = 0;
                    i12 = 0;
                    int i89 = 0;
                    while (i88 < i83) {
                        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit14 = catchingFishDaggerRetrofitArr9[i88];
                        int CatchingFishAppCompat4 = catchingFishBiometricOkHttp.CatchingFishAppCompat(catchingFishDaggerRetrofit14, i31);
                        if (catchingFishDaggerRetrofit14.CatchingFishGlideWidgetKtor[1] == 3) {
                            i12++;
                        }
                        int i90 = i12;
                        boolean z8 = (i89 == i31 || (catchingFishBiometricOkHttp.CatchingFishWebsocket + i89) + CatchingFishAppCompat4 > i31) && catchingFishKtorRealm6.CatchingFishSnackbar != null;
                        if (!z8 && i88 > 0 && (i13 = catchingFishBiometricOkHttp.CatchingFishJUnitViewPager) > 0 && i88 % i13 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            catchingFishKtorRealm6 = new CatchingFishKtorRealm(catchingFishBiometricOkHttp, i84, catchingFishBiometricOkHttp.CatchingFishSensorManager, catchingFishBiometricOkHttp.CatchingFishEspressoMockk, catchingFishBiometricOkHttp.CatchingFishDagger, catchingFishBiometricOkHttp.CatchingFishCameraXIntent, i31);
                            catchingFishKtorRealm6.CatchingFishUnitTesting = i88;
                            arrayList3.add(catchingFishKtorRealm6);
                        } else if (i88 > 0) {
                            i89 = catchingFishBiometricOkHttp.CatchingFishWebsocket + CatchingFishAppCompat4 + i89;
                            catchingFishKtorRealm6.CatchingFishParcelableFAB(catchingFishDaggerRetrofit14);
                            i88++;
                            i12 = i90;
                        }
                        i89 = CatchingFishAppCompat4;
                        catchingFishKtorRealm6.CatchingFishParcelableFAB(catchingFishDaggerRetrofit14);
                        i88++;
                        i12 = i90;
                    }
                }
                int size4 = arrayList3.size();
                int i91 = catchingFishBiometricOkHttp.CatchingFishMVPReduxContext;
                int i92 = catchingFishBiometricOkHttp.CatchingFishStateFlowIntent;
                int i93 = catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm;
                int i94 = catchingFishBiometricOkHttp.CatchingFishWidget;
                boolean z9 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i12 > 0 && z9) {
                    for (int i95 = 0; i95 < size4; i95++) {
                        CatchingFishKtorRealm catchingFishKtorRealm7 = (CatchingFishKtorRealm) arrayList3.get(i95);
                        if (i84 == 0) {
                            catchingFishKtorRealm7.CatchingFishDaggerWebsocket(i31 - catchingFishKtorRealm7.CatchingFishReduxKtor());
                        } else {
                            catchingFishKtorRealm7.CatchingFishDaggerWebsocket(i31 - catchingFishKtorRealm7.CatchingFishCoroutine());
                        }
                    }
                }
                int i96 = i91;
                int i97 = i92;
                int i98 = i93;
                int i99 = i94;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit17 = catchingFishStripeAPIJUnit8;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit18 = catchingFishStripeAPIJUnit9;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit19 = catchingFishStripeAPIJUnit10;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit20 = catchingFishStripeAPIJUnit4;
                int i100 = 0;
                int i101 = 0;
                for (int i102 = 0; i102 < size4; i102++) {
                    CatchingFishKtorRealm catchingFishKtorRealm8 = (CatchingFishKtorRealm) arrayList3.get(i102);
                    if (i84 == 0) {
                        if (i102 < size4 - 1) {
                            catchingFishStripeAPIJUnit19 = ((CatchingFishKtorRealm) arrayList3.get(i102 + 1)).CatchingFishSnackbar.CatchingFishEspressoMockk;
                            i99 = 0;
                        } else {
                            i99 = catchingFishBiometricOkHttp.CatchingFishWidget;
                            catchingFishStripeAPIJUnit19 = catchingFishStripeAPIJUnit10;
                        }
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit21 = catchingFishKtorRealm8.CatchingFishSnackbar.CatchingFishCameraXIntent;
                        catchingFishKtorRealm8.CatchingFishWorkManager(i84, catchingFishStripeAPIJUnit17, catchingFishStripeAPIJUnit20, catchingFishStripeAPIJUnit18, catchingFishStripeAPIJUnit19, i96, i97, i98, i99, i31);
                        i100 = Math.max(i100, catchingFishKtorRealm8.CatchingFishReduxKtor());
                        int CatchingFishCoroutine2 = catchingFishKtorRealm8.CatchingFishCoroutine() + i101;
                        if (i102 > 0) {
                            CatchingFishCoroutine2 += catchingFishBiometricOkHttp.CatchingFishWebsocket;
                        }
                        i101 = CatchingFishCoroutine2;
                        catchingFishStripeAPIJUnit20 = catchingFishStripeAPIJUnit21;
                        i97 = 0;
                    } else {
                        if (i102 < size4 - 1) {
                            catchingFishStripeAPIJUnit18 = ((CatchingFishKtorRealm) arrayList3.get(i102 + 1)).CatchingFishSnackbar.CatchingFishSensorManager;
                            i98 = 0;
                        } else {
                            i98 = catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm;
                            catchingFishStripeAPIJUnit18 = catchingFishStripeAPIJUnit9;
                        }
                        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit22 = catchingFishKtorRealm8.CatchingFishSnackbar.CatchingFishDagger;
                        catchingFishKtorRealm8.CatchingFishWorkManager(i84, catchingFishStripeAPIJUnit17, catchingFishStripeAPIJUnit20, catchingFishStripeAPIJUnit18, catchingFishStripeAPIJUnit19, i96, i97, i98, i99, i31);
                        int CatchingFishReduxKtor2 = catchingFishKtorRealm8.CatchingFishReduxKtor() + i100;
                        int max2 = Math.max(i101, catchingFishKtorRealm8.CatchingFishCoroutine());
                        if (i102 > 0) {
                            CatchingFishReduxKtor2 += catchingFishBiometricOkHttp.CatchingFishHiltBundle;
                        }
                        i101 = max2;
                        i100 = CatchingFishReduxKtor2;
                        catchingFishStripeAPIJUnit17 = catchingFishStripeAPIJUnit22;
                        i96 = 0;
                    }
                }
                iArr[0] = i100;
                iArr[1] = i101;
            }
        }
        z = true;
        c = 0;
        r12 = z;
        int i4022 = iArr[c] + i9 + i10;
        int i4122 = iArr[r12] + i11 + i7;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        catchingFishBiometricOkHttp.CatchingFishPayPalHandler = size;
        catchingFishBiometricOkHttp.CatchingFishSharedFlow = min;
        catchingFishBiometricOkHttp.CatchingFishGradleManifest(size);
        catchingFishBiometricOkHttp.CatchingFishCameraXIntent(min);
        catchingFishBiometricOkHttp.CatchingFishDynamicFeature = catchingFishBiometricOkHttp.CatchingFishGraphQLGlide > 0 ? r12 : false;
        setMeasuredDimension(catchingFishBiometricOkHttp.CatchingFishPayPalHandler, catchingFishBiometricOkHttp.CatchingFishSharedFlow);
    }

    @Override // kotlin.text.CatchingFishKtorContext
    public final void CatchingFishViewModelFAB(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, boolean z) {
        CatchingFishBiometricOkHttp catchingFishBiometricOkHttp = this.CatchingFishOkHttp;
        int i = catchingFishBiometricOkHttp.CatchingFishKtorService;
        if (i > 0 || catchingFishBiometricOkHttp.CatchingFishWebSocketMockk > 0) {
            if (z) {
                catchingFishBiometricOkHttp.CatchingFishMVPReduxContext = catchingFishBiometricOkHttp.CatchingFishWebSocketMockk;
                catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm = i;
            } else {
                catchingFishBiometricOkHttp.CatchingFishMVPReduxContext = i;
                catchingFishBiometricOkHttp.CatchingFishRealmKtorRealm = catchingFishBiometricOkHttp.CatchingFishWebSocketMockk;
            }
        }
    }

    @Override // kotlin.text.CatchingFishKtorContext, android.view.View
    public final void onMeasure(int i, int i2) {
        CatchingFishFragmentHandler(this.CatchingFishOkHttp, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.CatchingFishOkHttp.CatchingFishMaterialDesign = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.CatchingFishOkHttp.CatchingFishDaggerAppCompat = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.CatchingFishOkHttp.CatchingFishCardView = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.CatchingFishOkHttp.CatchingFishLiveDataRoom = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.CatchingFishOkHttp.CatchingFishJUnitIntent = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.CatchingFishOkHttp.CatchingFishToolbar = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.CatchingFishOkHttp.CatchingFishHiltBundle = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.CatchingFishOkHttp.CatchingFishKtor = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.CatchingFishOkHttp.CatchingFishLifecycleHilt = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.CatchingFishOkHttp.CatchingFishGlideMVP = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.CatchingFishOkHttp.CatchingFishStripeAPIWidget = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.CatchingFishOkHttp.CatchingFishContextToast = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.CatchingFishOkHttp.CatchingFishJUnitViewPager = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.CatchingFishOkHttp.CatchingFishToolbarEspresso = i;
        requestLayout();
    }

    public void setPadding(int i) {
        CatchingFishBiometricOkHttp catchingFishBiometricOkHttp = this.CatchingFishOkHttp;
        catchingFishBiometricOkHttp.CatchingFishStateFlowIntent = i;
        catchingFishBiometricOkHttp.CatchingFishWidget = i;
        catchingFishBiometricOkHttp.CatchingFishKtorService = i;
        catchingFishBiometricOkHttp.CatchingFishWebSocketMockk = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.CatchingFishOkHttp.CatchingFishWidget = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.CatchingFishOkHttp.CatchingFishMVPReduxContext = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.CatchingFishOkHttp.CatchingFishRealmKtorRealm = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.CatchingFishOkHttp.CatchingFishStateFlowIntent = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.CatchingFishOkHttp.CatchingFishRetrofitCameraX = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.CatchingFishOkHttp.CatchingFishExoPlayer = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.CatchingFishOkHttp.CatchingFishWebsocket = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.CatchingFishOkHttp.CatchingFishMVPHandler = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.CatchingFishOkHttp.CatchingFishGradle = i;
        requestLayout();
    }
}
