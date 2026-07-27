package kotlin.text;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.chip.Chip;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishWidgetFragment extends CatchingFishServiceHilt {
    public final /* synthetic */ int CatchingFishCloudMessaging;
    public final /* synthetic */ CatchingFishAndroidX CatchingFishEspressoTesting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishWidgetFragment(CatchingFishAndroidX catchingFishAndroidX, int i) {
        super(4);
        this.CatchingFishCloudMessaging = i;
        this.CatchingFishEspressoTesting = catchingFishAndroidX;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r11 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x08eb, code lost:
    
        if (r8 == false) goto L383;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x08c6 A[LOOP:12: B:553:0x08a5->B:562:0x08c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x08d1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.text.CatchingFishViewPagerDagger] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Collection, java.util.List] */
    @Override // kotlin.text.CatchingFishServiceHilt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishViewJUnitJUnit CatchingFish(int i) {
        CatchingFishFABViewModel catchingFishFABViewModel;
        AccessibilityNodeInfo accessibilityNodeInfo;
        CatchingFishGradleCameraX catchingFishGradleCameraX;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        CatchingFishViewAdMobMoshi catchingFishViewAdMobMoshi;
        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask;
        Resources resources;
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout;
        CatchingFishPayPalService catchingFishPayPalService;
        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        CatchingFishFABViewModel catchingFishFABViewModel2;
        boolean z;
        CatchingFishSnackbarToast catchingFishSnackbarToast;
        CatchingFishSnackbarToast catchingFishSnackbarToast2;
        CatchingFishSnackbarToast catchingFishSnackbarToast3;
        String CatchingFishJetpackCompose;
        CatchingFishMVVMCustomView catchingFishMVVMCustomView;
        Object CatchingFishViewModelScope;
        Bundle bundle;
        CatchingFishGradleCameraX catchingFishGradleCameraX2;
        CatchingFishHiltBundle CatchingFishGsonAppCompat;
        boolean z2;
        boolean z3;
        char c;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        ArrayList arrayList2;
        CatchingFishLayoutAdMob catchingFishLayoutAdMob;
        int i2;
        int i3;
        boolean z6;
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2;
        boolean z7;
        CatchingFishToolbarToast CatchingFishDaggerWebsocket;
        switch (this.CatchingFishCloudMessaging) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel3 = (CatchingFishFABViewModel) this.CatchingFishEspressoTesting;
                AccessibilityManager accessibilityManager = catchingFishFABViewModel3.CatchingFishViewModelScope;
                CatchingFishGradleCameraX catchingFishGradleCameraX3 = catchingFishFABViewModel3.CatchingFishReduxKtor;
                CatchingFishWidgetAdMob viewTreeOwners = catchingFishGradleCameraX3.getViewTreeOwners();
                if (((viewTreeOwners == null || (CatchingFishDaggerWebsocket = viewTreeOwners.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket()) == null) ? null : CatchingFishDaggerWebsocket.CatchingFishReduxKtor) != CatchingFishMockkFirebase.CatchingFishReduxKtor) {
                    CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishFABViewModel3.CatchingFish().CatchingFishSnackbar(i);
                    if (catchingFishMoshiKtor != null) {
                        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt3 = catchingFishMoshiKtor.CatchingFishParcelableFAB;
                        Object CatchingFishViewModelScope2 = catchingFishMVIGraphQLHilt3.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishOkHttp);
                        if (CatchingFishViewModelScope2 == null) {
                            CatchingFishViewModelScope2 = null;
                        }
                        boolean CatchingFishOkHttp = CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewModelScope2, Boolean.TRUE);
                        if (CatchingFishOkHttp) {
                            if (Build.VERSION.SDK_INT >= 34) {
                                z7 = CatchingFishDataStore.CatchingFishViewModelFAB(accessibilityManager);
                                break;
                            } else {
                                z7 = true;
                                break;
                            }
                        }
                        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                        CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit2 = new CatchingFishViewJUnitJUnit(obtain);
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 34) {
                            CatchingFishDataStore.CatchingFishFragmentHandler(obtain, CatchingFishOkHttp);
                        } else {
                            catchingFishViewJUnitJUnit2.CatchingFishViewModelFAB(64, CatchingFishOkHttp);
                        }
                        if (i == -1) {
                            Object parentForAccessibility = catchingFishGradleCameraX3.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            catchingFishViewJUnitJUnit2.CatchingFishSnackbar = -1;
                            obtain.setParent(view);
                        } else {
                            CatchingFishMVIGraphQLHilt CatchingFishEspressoTesting = catchingFishMVIGraphQLHilt3.CatchingFishEspressoTesting();
                            Integer valueOf = CatchingFishEspressoTesting != null ? Integer.valueOf(CatchingFishEspressoTesting.CatchingFishViewModelScope) : null;
                            if (valueOf == null) {
                                CatchingFishFluxGradle.CatchingFishCoroutine("semanticsNode " + i + " has null parent");
                                throw new CatchingFishBiometricView();
                            }
                            int intValue = valueOf.intValue();
                            if (intValue == catchingFishGradleCameraX3.getSemanticsOwner().CatchingFishParcelableFAB().CatchingFishViewModelScope) {
                                intValue = -1;
                            }
                            catchingFishViewJUnitJUnit2.CatchingFishSnackbar = intValue;
                            obtain.setParent(catchingFishGradleCameraX3, intValue);
                        }
                        catchingFishViewJUnitJUnit2.CatchingFishCoroutine = i;
                        obtain.setSource(catchingFishGradleCameraX3, i);
                        CatchingFishSnackbarLayout catchingFishSnackbarLayout = catchingFishMoshiKtor.CatchingFishSnackbar;
                        long CatchingFish = catchingFishGradleCameraX3.CatchingFish((Float.floatToRawIntBits(catchingFishSnackbarLayout.CatchingFishParcelableFAB) << 32) | (Float.floatToRawIntBits(catchingFishSnackbarLayout.CatchingFishSnackbar) & 4294967295L));
                        long CatchingFish2 = catchingFishGradleCameraX3.CatchingFish((Float.floatToRawIntBits(catchingFishSnackbarLayout.CatchingFishReduxKtor) & 4294967295L) | (Float.floatToRawIntBits(catchingFishSnackbarLayout.CatchingFishCoroutine) << 32));
                        int i5 = (int) (CatchingFish >> 32);
                        int i6 = (int) (CatchingFish2 >> 32);
                        int i7 = (int) (CatchingFish & 4294967295L);
                        int i8 = (int) (CatchingFish2 & 4294967295L);
                        AccessibilityNodeInfo accessibilityNodeInfo5 = obtain;
                        accessibilityNodeInfo5.setBoundsInScreen(new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6))), (int) Math.floor(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)))));
                        CatchingFishViewAdMobMoshi catchingFishViewAdMobMoshi2 = catchingFishFABViewModel3.CatchingFishEspressoMockk;
                        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask2 = catchingFishFABViewModel3.CatchingFish;
                        Resources resources2 = catchingFishGradleCameraX3.getContext().getResources();
                        catchingFishViewJUnitJUnit2.CatchingFishLayout("android.view.View");
                        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt3;
                        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout2 = catchingFishMVIGraphQLHilt4.CatchingFishReduxKtor;
                        CatchingFishPayPalService catchingFishPayPalService2 = catchingFishMVPMotionLayout2.CatchingFishReduxKtor;
                        if (catchingFishPayPalService2.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishPayPal)) {
                            catchingFishViewJUnitJUnit2.CatchingFishLayout("android.widget.EditText");
                        }
                        if (catchingFishPayPalService2.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishParcelableFlux)) {
                            catchingFishViewJUnitJUnit2.CatchingFishLayout("android.widget.TextView");
                        }
                        Object CatchingFishViewModelScope3 = catchingFishPayPalService2.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutineFlow);
                        if (CatchingFishViewModelScope3 == null) {
                            CatchingFishViewModelScope3 = null;
                        }
                        if (((CatchingFishToastToastRoom) CatchingFishViewModelScope3) != null && ((catchingFishMVIGraphQLHilt4.CatchingFishDaggerWebsocket || CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt4).isEmpty()) && (catchingFishMVIGraphQLHilt4.CatchingFishAnimationMockk() || catchingFishMVPMotionLayout2.CatchingFishWorkManager))) {
                            catchingFishViewJUnitJUnit2.CatchingFishLayout("android.widget.ImageView");
                        }
                        accessibilityNodeInfo5.setPackageName(catchingFishGradleCameraX3.getContext().getPackageName());
                        accessibilityNodeInfo5.setImportantForAccessibility(CatchingFishAdMobFAB.CatchingFishCardViewView(catchingFishMVIGraphQLHilt4));
                        boolean CatchingFishViewModelFAB = i4 >= 34 ? CatchingFishDataStore.CatchingFishViewModelFAB(accessibilityManager) : true;
                        List CatchingFishFragmentHandler = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt4);
                        int size = CatchingFishFragmentHandler.size();
                        boolean z8 = CatchingFishViewModelFAB;
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            AccessibilityNodeInfo accessibilityNodeInfo6 = catchingFishViewJUnitJUnit2.CatchingFishParcelableFAB;
                            if (i10 < size) {
                                List list = CatchingFishFragmentHandler;
                                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt5 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler.get(i10);
                                int i11 = size;
                                CatchingFishReduxLifecycle CatchingFish3 = catchingFishFABViewModel3.CatchingFish();
                                int i12 = i10;
                                int i13 = catchingFishMVIGraphQLHilt5.CatchingFishViewModelScope;
                                if (CatchingFish3.CatchingFishParcelableFAB(i13)) {
                                    CatchingFishHiltBundle catchingFishHiltBundle = catchingFishGradleCameraX3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(catchingFishMVIGraphQLHilt5.CatchingFishCoroutine);
                                    if (i13 != -1) {
                                        if (catchingFishHiltBundle != null) {
                                            accessibilityNodeInfo5.addChild(catchingFishHiltBundle);
                                        } else {
                                            CatchingFishMoshiKtor catchingFishMoshiKtor2 = (CatchingFishMoshiKtor) catchingFishFABViewModel3.CatchingFish().CatchingFishSnackbar(i13);
                                            if (catchingFishMoshiKtor2 == null || (catchingFishMVIGraphQLHilt2 = catchingFishMoshiKtor2.CatchingFishParcelableFAB) == null) {
                                                z6 = false;
                                            } else {
                                                Object CatchingFishViewModelScope4 = catchingFishMVIGraphQLHilt2.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishOkHttp);
                                                if (CatchingFishViewModelScope4 == null) {
                                                    CatchingFishViewModelScope4 = null;
                                                }
                                                z6 = CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewModelScope4, Boolean.TRUE);
                                            }
                                            if (z8 || !z6) {
                                                accessibilityNodeInfo6.addChild(catchingFishGradleCameraX3, i13);
                                            }
                                        }
                                        catchingFishViewAdMobMoshi2.CatchingFishWorkManager(i13, i9);
                                        i9++;
                                    }
                                }
                                i10 = i12 + 1;
                                size = i11;
                                CatchingFishFragmentHandler = list;
                            } else {
                                if (i == catchingFishFABViewModel3.CatchingFishUnitTesting) {
                                    accessibilityNodeInfo6.setAccessibilityFocused(true);
                                    catchingFishViewJUnitJUnit2.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishViewModelScope);
                                } else {
                                    accessibilityNodeInfo6.setAccessibilityFocused(false);
                                    catchingFishViewJUnitJUnit2.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishWorkManager);
                                }
                                CatchingFishWebsocketDagger CatchingFishPayPal = CatchingFishGsonCardView.CatchingFishPayPal(catchingFishMVIGraphQLHilt4);
                                if (CatchingFishPayPal != null) {
                                    catchingFishGradleCameraX3.getFontFamilyResolver();
                                    CatchingFishOkHttpFlux density = catchingFishGradleCameraX3.getDensity();
                                    CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = catchingFishFABViewModel3.CatchingFishMutableLiveData;
                                    catchingFishGradleCameraX = catchingFishGradleCameraX3;
                                    String str = CatchingFishPayPal.CatchingFishDaggerWebsocket;
                                    catchingFishGsonAsyncTask = catchingFishGsonAsyncTask2;
                                    List list2 = CatchingFishPayPal.CatchingFishReduxKtor;
                                    SpannableString spannableString2 = new SpannableString(str);
                                    ArrayList arrayList3 = CatchingFishPayPal.CatchingFishWorkManager;
                                    if (arrayList3 != null) {
                                        int size2 = arrayList3.size();
                                        catchingFishFABViewModel = catchingFishFABViewModel3;
                                        int i14 = 0;
                                        while (i14 < size2) {
                                            ArrayList arrayList4 = arrayList3;
                                            CatchingFishFluxNavigation catchingFishFluxNavigation = (CatchingFishFluxNavigation) arrayList3.get(i14);
                                            int i15 = i14;
                                            CatchingFishContextLayout catchingFishContextLayout = (CatchingFishContextLayout) catchingFishFluxNavigation.CatchingFishParcelableFAB;
                                            int i16 = size2;
                                            CatchingFishToastToast catchingFishToastToast = catchingFishContextLayout.CatchingFishParcelableFAB;
                                            int i17 = catchingFishFluxNavigation.CatchingFishSnackbar;
                                            int i18 = catchingFishFluxNavigation.CatchingFishCoroutine;
                                            Resources resources3 = resources2;
                                            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt6 = catchingFishMVIGraphQLHilt4;
                                            long CatchingFishCoroutine = catchingFishToastToast.CatchingFishCoroutine();
                                            AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo5;
                                            CatchingFishViewAdMobMoshi catchingFishViewAdMobMoshi3 = catchingFishViewAdMobMoshi2;
                                            long j = catchingFishContextLayout.CatchingFishSnackbar;
                                            CatchingFishFragmentToolbar catchingFishFragmentToolbar = catchingFishContextLayout.CatchingFishCoroutine;
                                            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout3 = catchingFishMVPMotionLayout2;
                                            CatchingFishLayoutAdMob catchingFishLayoutAdMob2 = catchingFishContextLayout.CatchingFishViewModelFAB;
                                            AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfo6;
                                            CatchingFishLayoutMVPMVVM catchingFishLayoutMVPMVVM = catchingFishContextLayout.CatchingFishLayout;
                                            CatchingFishPayPalService catchingFishPayPalService3 = catchingFishPayPalService2;
                                            CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit3 = catchingFishViewJUnitJUnit2;
                                            long j2 = catchingFishContextLayout.CatchingFishFragmentHandler;
                                            CatchingFishToastMVVMGson catchingFishToastMVVMGson = catchingFishContextLayout.CatchingFishCloudMessaging;
                                            if (!CatchingFishToastFragment.CatchingFishCoroutine(CatchingFishCoroutine, catchingFishToastToast.CatchingFishCoroutine())) {
                                                catchingFishToastToast = CatchingFishCoroutine != 16 ? new CatchingFishServiceToast(CatchingFishCoroutine) : CatchingFishMVPExoPlayer.CatchingFishEspressoTesting;
                                            }
                                            long CatchingFishCoroutine2 = catchingFishToastToast.CatchingFishCoroutine();
                                            if (CatchingFishCoroutine2 != 16) {
                                                spannableString2.setSpan(new ForegroundColorSpan(CatchingFishFirebaseDagger.CatchingFishStateFlow(CatchingFishCoroutine2)), i17, i18, 33);
                                            }
                                            long CatchingFishSnackbar = CatchingFishCameraXFlux.CatchingFishSnackbar(j);
                                            if (CatchingFishBundleBiometric.CatchingFishParcelableFAB(CatchingFishSnackbar, 4294967296L)) {
                                                spannableString2.setSpan(new AbsoluteSizeSpan(CatchingFishLayoutRoom.CatchingFishMVPRobolectric(density.CatchingFishPayPalService(j)), false), i17, i18, 33);
                                                i2 = 33;
                                                catchingFishLayoutAdMob = catchingFishLayoutAdMob2;
                                            } else {
                                                catchingFishLayoutAdMob = catchingFishLayoutAdMob2;
                                                if (CatchingFishBundleBiometric.CatchingFishParcelableFAB(CatchingFishSnackbar, 8589934592L)) {
                                                    RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(CatchingFishCameraXFlux.CatchingFishCoroutine(j));
                                                    i2 = 33;
                                                    spannableString2.setSpan(relativeSizeSpan, i17, i18, 33);
                                                } else {
                                                    i2 = 33;
                                                }
                                            }
                                            if (catchingFishFragmentToolbar != null) {
                                                spannableString2.setSpan(new StyleSpan(CatchingFishAdMobFAB.CatchingFishParcelableFlux(catchingFishFragmentToolbar, 0)), i17, i18, i2);
                                            }
                                            if (catchingFishToastMVVMGson != null) {
                                                int i19 = catchingFishToastMVVMGson.CatchingFishParcelableFAB;
                                                if ((i19 | 1) == i19) {
                                                    spannableString2.setSpan(new UnderlineSpan(), i17, i18, i2);
                                                }
                                                if ((i19 | 2) == i19) {
                                                    spannableString2.setSpan(new StrikethroughSpan(), i17, i18, i2);
                                                }
                                            }
                                            if (catchingFishLayoutAdMob != null) {
                                                spannableString2.setSpan(new ScaleXSpan(catchingFishLayoutAdMob.CatchingFishParcelableFAB), i17, i18, i2);
                                            }
                                            if (catchingFishLayoutMVPMVVM != null) {
                                                ArrayList arrayList5 = new ArrayList(CatchingFishLayoutToast.CatchingFishParcelable(catchingFishLayoutMVPMVVM));
                                                Iterator it = catchingFishLayoutMVPMVVM.CatchingFishReduxKtor.iterator();
                                                while (it.hasNext()) {
                                                    arrayList5.add(((CatchingFishRoomAdMob) it.next()).CatchingFishParcelableFAB);
                                                }
                                                Locale[] localeArr = (Locale[]) arrayList5.toArray(new Locale[0]);
                                                i3 = 33;
                                                spannableString2.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i17, i18, 33);
                                            } else {
                                                i3 = 33;
                                            }
                                            if (j2 != 16) {
                                                spannableString2.setSpan(new BackgroundColorSpan(CatchingFishFirebaseDagger.CatchingFishStateFlow(j2)), i17, i18, i3);
                                            }
                                            i14 = i15 + 1;
                                            arrayList3 = arrayList4;
                                            size2 = i16;
                                            resources2 = resources3;
                                            catchingFishMVIGraphQLHilt4 = catchingFishMVIGraphQLHilt6;
                                            accessibilityNodeInfo5 = accessibilityNodeInfo7;
                                            catchingFishViewAdMobMoshi2 = catchingFishViewAdMobMoshi3;
                                            catchingFishMVPMotionLayout2 = catchingFishMVPMotionLayout3;
                                            accessibilityNodeInfo6 = accessibilityNodeInfo8;
                                            catchingFishViewJUnitJUnit2 = catchingFishViewJUnitJUnit3;
                                            catchingFishPayPalService2 = catchingFishPayPalService3;
                                        }
                                    } else {
                                        catchingFishFABViewModel = catchingFishFABViewModel3;
                                    }
                                    accessibilityNodeInfo = accessibilityNodeInfo6;
                                    accessibilityNodeInfo2 = accessibilityNodeInfo5;
                                    catchingFishViewAdMobMoshi = catchingFishViewAdMobMoshi2;
                                    resources = resources2;
                                    catchingFishMVIGraphQLHilt = catchingFishMVIGraphQLHilt4;
                                    catchingFishMVPMotionLayout = catchingFishMVPMotionLayout2;
                                    catchingFishPayPalService = catchingFishPayPalService2;
                                    CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit4 = catchingFishViewJUnitJUnit2;
                                    int length = str.length();
                                    ?? r1 = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
                                    if (list2 != null) {
                                        arrayList = new ArrayList(list2.size());
                                        int size3 = list2.size();
                                        for (int i20 = 0; i20 < size3; i20++) {
                                            Object obj = list2.get(i20);
                                            CatchingFishFluxNavigation catchingFishFluxNavigation2 = (CatchingFishFluxNavigation) obj;
                                            if ((catchingFishFluxNavigation2.CatchingFishParcelableFAB instanceof CatchingFishJUnitCameraX) && CatchingFishGsonBundle.CatchingFishParcelableFAB(0, length, catchingFishFluxNavigation2.CatchingFishSnackbar, catchingFishFluxNavigation2.CatchingFishCoroutine)) {
                                                arrayList.add(obj);
                                            }
                                        }
                                    } else {
                                        arrayList = r1;
                                    }
                                    int size4 = arrayList.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        CatchingFishFluxNavigation catchingFishFluxNavigation3 = (CatchingFishFluxNavigation) arrayList.get(i21);
                                        CatchingFishJUnitCameraX catchingFishJUnitCameraX = (CatchingFishJUnitCameraX) catchingFishFluxNavigation3.CatchingFishParcelableFAB;
                                        int i22 = catchingFishFluxNavigation3.CatchingFishSnackbar;
                                        int i23 = catchingFishFluxNavigation3.CatchingFishCoroutine;
                                        if (!(catchingFishJUnitCameraX instanceof CatchingFishJUnitCameraX)) {
                                            throw new CatchingFishBiometricView();
                                        }
                                        spannableString2.setSpan(new TtsSpan.VerbatimBuilder(catchingFishJUnitCameraX.CatchingFishParcelableFAB).build(), i22, i23, 33);
                                    }
                                    int length2 = str.length();
                                    if (list2 != null) {
                                        arrayList2 = new ArrayList(list2.size());
                                        int size5 = list2.size();
                                        for (int i24 = 0; i24 < size5; i24++) {
                                            Object obj2 = list2.get(i24);
                                            CatchingFishFluxNavigation catchingFishFluxNavigation4 = (CatchingFishFluxNavigation) obj2;
                                            if ((catchingFishFluxNavigation4.CatchingFishParcelableFAB instanceof CatchingFishIntentView) && CatchingFishGsonBundle.CatchingFishParcelableFAB(0, length2, catchingFishFluxNavigation4.CatchingFishSnackbar, catchingFishFluxNavigation4.CatchingFishCoroutine)) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                    } else {
                                        arrayList2 = r1;
                                    }
                                    int size6 = arrayList2.size();
                                    for (int i25 = 0; i25 < size6; i25++) {
                                        CatchingFishFluxNavigation catchingFishFluxNavigation5 = (CatchingFishFluxNavigation) arrayList2.get(i25);
                                        CatchingFishIntentView catchingFishIntentView = (CatchingFishIntentView) catchingFishFluxNavigation5.CatchingFishParcelableFAB;
                                        int i26 = catchingFishFluxNavigation5.CatchingFishSnackbar;
                                        int i27 = catchingFishFluxNavigation5.CatchingFishCoroutine;
                                        WeakHashMap weakHashMap = (WeakHashMap) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
                                        Object obj3 = weakHashMap.get(catchingFishIntentView);
                                        if (obj3 == null) {
                                            obj3 = new URLSpan(catchingFishIntentView.CatchingFishParcelableFAB);
                                            weakHashMap.put(catchingFishIntentView, obj3);
                                        }
                                        spannableString2.setSpan((URLSpan) obj3, i26, i27, 33);
                                    }
                                    int length3 = str.length();
                                    if (list2 != null) {
                                        r1 = new ArrayList(list2.size());
                                        int size7 = list2.size();
                                        for (int i28 = 0; i28 < size7; i28++) {
                                            Object obj4 = list2.get(i28);
                                            CatchingFishFluxNavigation catchingFishFluxNavigation6 = (CatchingFishFluxNavigation) obj4;
                                            if ((catchingFishFluxNavigation6.CatchingFishParcelableFAB instanceof CatchingFishOkHttpViewModel) && CatchingFishGsonBundle.CatchingFishParcelableFAB(0, length3, catchingFishFluxNavigation6.CatchingFishSnackbar, catchingFishFluxNavigation6.CatchingFishCoroutine)) {
                                                r1.add(obj4);
                                            }
                                        }
                                    }
                                    int size8 = r1.size();
                                    for (int i29 = 0; i29 < size8; i29++) {
                                        CatchingFishFluxNavigation catchingFishFluxNavigation7 = (CatchingFishFluxNavigation) r1.get(i29);
                                        int i30 = catchingFishFluxNavigation7.CatchingFishSnackbar;
                                        Object obj5 = catchingFishFluxNavigation7.CatchingFishParcelableFAB;
                                        int i31 = catchingFishFluxNavigation7.CatchingFishCoroutine;
                                        if (i30 != i31) {
                                            CatchingFishOkHttpViewModel catchingFishOkHttpViewModel = (CatchingFishOkHttpViewModel) obj5;
                                            if (catchingFishOkHttpViewModel instanceof CatchingFishCoroutineRealm) {
                                                CatchingFishCoroutineRealm catchingFishCoroutineRealm = (CatchingFishCoroutineRealm) obj5;
                                                CatchingFishFluxNavigation catchingFishFluxNavigation8 = new CatchingFishFluxNavigation(catchingFishCoroutineRealm, i30, i31, "");
                                                WeakHashMap weakHashMap2 = (WeakHashMap) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
                                                Object obj6 = weakHashMap2.get(catchingFishFluxNavigation8);
                                                if (obj6 == null) {
                                                    obj6 = new URLSpan(catchingFishCoroutineRealm.CatchingFishParcelableFAB);
                                                    weakHashMap2.put(catchingFishFluxNavigation8, obj6);
                                                }
                                                spannableString2.setSpan((URLSpan) obj6, i30, i31, 33);
                                            } else {
                                                WeakHashMap weakHashMap3 = (WeakHashMap) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
                                                Object obj7 = weakHashMap3.get(catchingFishFluxNavigation7);
                                                if (obj7 == null) {
                                                    obj7 = new CatchingFishMVIDaggerHilt(catchingFishOkHttpViewModel);
                                                    weakHashMap3.put(catchingFishFluxNavigation7, obj7);
                                                }
                                                spannableString2.setSpan((ClickableSpan) obj7, i30, i31, 33);
                                            }
                                        }
                                    }
                                    spannableString = (SpannableString) CatchingFishFABViewModel.CatchingFishEspressoMockk(spannableString2);
                                    catchingFishViewJUnitJUnit = catchingFishViewJUnitJUnit4;
                                } else {
                                    catchingFishFABViewModel = catchingFishFABViewModel3;
                                    accessibilityNodeInfo = accessibilityNodeInfo6;
                                    catchingFishGradleCameraX = catchingFishGradleCameraX3;
                                    accessibilityNodeInfo2 = accessibilityNodeInfo5;
                                    catchingFishViewAdMobMoshi = catchingFishViewAdMobMoshi2;
                                    catchingFishGsonAsyncTask = catchingFishGsonAsyncTask2;
                                    resources = resources2;
                                    catchingFishMVIGraphQLHilt = catchingFishMVIGraphQLHilt4;
                                    catchingFishMVPMotionLayout = catchingFishMVPMotionLayout2;
                                    catchingFishPayPalService = catchingFishPayPalService2;
                                    catchingFishViewJUnitJUnit = catchingFishViewJUnitJUnit2;
                                    spannableString = null;
                                }
                                catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(spannableString);
                                CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishMutableLiveData;
                                CatchingFishPayPalService catchingFishPayPalService4 = catchingFishPayPalService;
                                if (catchingFishPayPalService4.CatchingFishCoroutine(catchingFishGraphQLLayout)) {
                                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                    accessibilityNodeInfo3.setContentInvalid(true);
                                    Object CatchingFishViewModelScope5 = catchingFishPayPalService4.CatchingFishViewModelScope(catchingFishGraphQLLayout);
                                    if (CatchingFishViewModelScope5 == null) {
                                        CatchingFishViewModelScope5 = null;
                                    }
                                    accessibilityNodeInfo4 = accessibilityNodeInfo;
                                    accessibilityNodeInfo4.setError((CharSequence) CatchingFishViewModelScope5);
                                } else {
                                    accessibilityNodeInfo3 = accessibilityNodeInfo2;
                                    accessibilityNodeInfo4 = accessibilityNodeInfo;
                                }
                                Resources resources4 = resources;
                                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt7 = catchingFishMVIGraphQLHilt;
                                String CatchingFishCardViewRealm = CatchingFishGsonCardView.CatchingFishCardViewRealm(catchingFishMVIGraphQLHilt7, resources4);
                                if (Build.VERSION.SDK_INT >= 30) {
                                    CatchingFishJUnitIntent.CatchingFishFragmentHandler(accessibilityNodeInfo4, CatchingFishCardViewRealm);
                                } else {
                                    accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", CatchingFishCardViewRealm);
                                }
                                accessibilityNodeInfo4.setCheckable(CatchingFishGsonCardView.CatchingFishGsonAppCompat(catchingFishMVIGraphQLHilt7));
                                Object CatchingFishViewModelScope6 = catchingFishPayPalService4.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCustomView);
                                if (CatchingFishViewModelScope6 == null) {
                                    CatchingFishViewModelScope6 = null;
                                }
                                CatchingFishBundleEspresso catchingFishBundleEspresso = (CatchingFishBundleEspresso) CatchingFishViewModelScope6;
                                if (catchingFishBundleEspresso != null) {
                                    if (catchingFishBundleEspresso == CatchingFishBundleEspresso.CatchingFishReduxKtor) {
                                        accessibilityNodeInfo4.setChecked(true);
                                    } else if (catchingFishBundleEspresso == CatchingFishBundleEspresso.CatchingFishDaggerWebsocket) {
                                        accessibilityNodeInfo4.setChecked(false);
                                    }
                                }
                                Object CatchingFishViewModelScope7 = catchingFishPayPalService4.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishMVPRobolectric);
                                if (CatchingFishViewModelScope7 == null) {
                                    CatchingFishViewModelScope7 = null;
                                }
                                Boolean bool = (Boolean) CatchingFishViewModelScope7;
                                if (bool != null) {
                                    accessibilityNodeInfo4.setChecked(bool.booleanValue());
                                }
                                CatchingFishMVPMotionLayout catchingFishMVPMotionLayout4 = catchingFishMVPMotionLayout;
                                if (!catchingFishMVPMotionLayout4.CatchingFishWorkManager || CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt7).isEmpty()) {
                                    Object CatchingFishViewModelScope8 = catchingFishPayPalService4.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishParcelableFAB);
                                    if (CatchingFishViewModelScope8 == null) {
                                        CatchingFishViewModelScope8 = null;
                                    }
                                    List list3 = (List) CatchingFishViewModelScope8;
                                    accessibilityNodeInfo4.setContentDescription(list3 != null ? (String) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list3) : null);
                                }
                                Object CatchingFishViewModelScope9 = catchingFishPayPalService4.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishDaggerHiltFAB);
                                if (CatchingFishViewModelScope9 == null) {
                                    CatchingFishViewModelScope9 = null;
                                }
                                String str2 = (String) CatchingFishViewModelScope9;
                                if (str2 != null) {
                                    CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt8 = catchingFishMVIGraphQLHilt7;
                                    while (true) {
                                        if (catchingFishMVIGraphQLHilt8 != null) {
                                            CatchingFishMVPMotionLayout catchingFishMVPMotionLayout5 = catchingFishMVIGraphQLHilt8.CatchingFishReduxKtor;
                                            CatchingFishGraphQLLayout catchingFishGraphQLLayout2 = CatchingFishRoomBundle.CatchingFishParcelableFAB;
                                            if (catchingFishMVPMotionLayout5.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout2)) {
                                                z5 = ((Boolean) catchingFishMVPMotionLayout5.CatchingFishSnackbar(catchingFishGraphQLLayout2)).booleanValue();
                                            } else {
                                                catchingFishMVIGraphQLHilt8 = catchingFishMVIGraphQLHilt8.CatchingFishEspressoTesting();
                                            }
                                        } else {
                                            z5 = false;
                                        }
                                    }
                                    if (z5) {
                                        accessibilityNodeInfo3.setViewIdResourceName(str2);
                                    }
                                }
                                char c2 = 2;
                                if (((CatchingFishRealmContext) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishViewModelFAB)) != null) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        accessibilityNodeInfo4.setHeading(true);
                                    } else {
                                        catchingFishViewJUnitJUnit.CatchingFishViewModelFAB(2, true);
                                    }
                                }
                                if (i != -1) {
                                    int CatchingFishReduxKtor = catchingFishViewAdMobMoshi.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7.CatchingFishViewModelScope);
                                    if (CatchingFishReduxKtor != -1) {
                                        accessibilityNodeInfo3.setDrawingOrder(CatchingFishReduxKtor);
                                    }
                                }
                                accessibilityNodeInfo3.setPassword(catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishFragmentFactory));
                                accessibilityNodeInfo3.setEditable(catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishJobScheduler));
                                Integer num = (Integer) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishPayPalService);
                                accessibilityNodeInfo4.setMaxTextLength(num != null ? num.intValue() : -1);
                                accessibilityNodeInfo4.setEnabled(CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7));
                                CatchingFishGraphQLLayout catchingFishGraphQLLayout3 = CatchingFishServiceMVI.CatchingFishCloudMessaging;
                                accessibilityNodeInfo4.setFocusable(catchingFishPayPalService4.CatchingFishCoroutine(catchingFishGraphQLLayout3));
                                if (accessibilityNodeInfo3.isFocusable()) {
                                    accessibilityNodeInfo4.setFocused(((Boolean) catchingFishMVPMotionLayout4.CatchingFishSnackbar(catchingFishGraphQLLayout3)).booleanValue());
                                    if (accessibilityNodeInfo3.isFocused()) {
                                        catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(2);
                                        catchingFishFABViewModel2 = catchingFishFABViewModel;
                                        catchingFishFABViewModel2.CatchingFishAnimationMockk = i;
                                    } else {
                                        catchingFishFABViewModel2 = catchingFishFABViewModel;
                                        z = true;
                                        catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(1);
                                        accessibilityNodeInfo4.setVisibleToUser(CatchingFishAdMobFAB.CatchingFishPayPal(catchingFishMVIGraphQLHilt7) ^ z);
                                        CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishFragmentHandler));
                                        accessibilityNodeInfo4.setClickable(false);
                                        catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishSnackbar);
                                        if (catchingFishSnackbarToast != null) {
                                            CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishMVPRobolectric), Boolean.TRUE);
                                            accessibilityNodeInfo4.setClickable(true);
                                            if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7) && accessibilityNodeInfo3.isClickable()) {
                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast.CatchingFishParcelableFAB, 16));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        catchingFishSnackbarToast2 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishCoroutine);
                                        if (catchingFishSnackbarToast2 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7)) {
                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast2.CatchingFishParcelableFAB, 32));
                                            }
                                        }
                                        catchingFishSnackbarToast3 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishUnitTesting);
                                        if (catchingFishSnackbarToast3 != null) {
                                            catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast3.CatchingFishParcelableFAB, 16384));
                                        }
                                        if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7)) {
                                            CatchingFishSnackbarToast catchingFishSnackbarToast4 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishLayout);
                                            if (catchingFishSnackbarToast4 != null) {
                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast4.CatchingFishParcelableFAB, 2097152));
                                            }
                                            CatchingFishSnackbarToast catchingFishSnackbarToast5 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishOkHttp);
                                            if (catchingFishSnackbarToast5 != null) {
                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast5.CatchingFishParcelableFAB, R.id.accessibilityActionImeEnter));
                                            }
                                            CatchingFishSnackbarToast catchingFishSnackbarToast6 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishAnimationMockk);
                                            if (catchingFishSnackbarToast6 != null) {
                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast6.CatchingFishParcelableFAB, 65536));
                                            }
                                            CatchingFishSnackbarToast catchingFishSnackbarToast7 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishStateLiveData);
                                            if (catchingFishSnackbarToast7 != null && accessibilityNodeInfo3.isFocused()) {
                                                ClipDescription primaryClipDescription = catchingFishGradleCameraX.m8getClipboardManager().CatchingFishParcelableFAB.getPrimaryClipDescription();
                                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                    catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast7.CatchingFishParcelableFAB, 32768));
                                                }
                                            }
                                        }
                                        CatchingFishJetpackCompose = CatchingFishFABViewModel.CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt7);
                                        if (!(CatchingFishJetpackCompose != null || CatchingFishJetpackCompose.length() == 0)) {
                                            accessibilityNodeInfo3.setTextSelection(catchingFishFABViewModel2.CatchingFishNavigation(catchingFishMVIGraphQLHilt7), catchingFishFABViewModel2.CatchingFishRoomDatabase(catchingFishMVIGraphQLHilt7));
                                            CatchingFishSnackbarToast catchingFishSnackbarToast8 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishViewModelFAB);
                                            catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast8 != null ? catchingFishSnackbarToast8.CatchingFishParcelableFAB : null, 131072));
                                            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(256);
                                            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            List list4 = (List) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishParcelableFAB);
                                            if ((list4 == null || list4.isEmpty()) && catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishViewStripeAPI.CatchingFishParcelableFAB)) {
                                                if (!catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishPayPal) || CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, catchingFishGraphQLLayout3), Boolean.TRUE)) {
                                                    CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishMVIGraphQLHilt7.CatchingFishCoroutine.CatchingFishRoomDatabase();
                                                    while (true) {
                                                        if (CatchingFishRoomDatabase == null) {
                                                            CatchingFishRoomDatabase = null;
                                                        } else {
                                                            CatchingFishMVPMotionLayout CatchingFish4 = CatchingFishRoomDatabase.CatchingFish();
                                                            if (CatchingFish4 != null) {
                                                                c = c2;
                                                                if (CatchingFish4.CatchingFishWorkManager) {
                                                                    if (CatchingFish4.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishPayPal)) {
                                                                        z4 = true;
                                                                        if (z4) {
                                                                            CatchingFishRoomDatabase = CatchingFishRoomDatabase.CatchingFishRoomDatabase();
                                                                            c2 = c;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c = c2;
                                                            }
                                                            z4 = false;
                                                            if (z4) {
                                                            }
                                                        }
                                                    }
                                                    if (CatchingFishRoomDatabase != null) {
                                                        CatchingFishMVPMotionLayout CatchingFish5 = CatchingFishRoomDatabase.CatchingFish();
                                                        if (CatchingFish5 != null) {
                                                            Object CatchingFishViewModelScope10 = CatchingFish5.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishGraphQLLayout3);
                                                            if (CatchingFishViewModelScope10 == null) {
                                                                CatchingFishViewModelScope10 = null;
                                                            }
                                                            z3 = CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewModelScope10, Boolean.TRUE);
                                                            break;
                                                        } else {
                                                            z3 = false;
                                                            break;
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (!z2) {
                                                        accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                                    }
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        ArrayList arrayList6 = new ArrayList();
                                                        arrayList6.add("androidx.compose.ui.semantics.id");
                                                        CharSequence CatchingFishViewModelScope11 = catchingFishViewJUnitJUnit.CatchingFishViewModelScope();
                                                        if (!(CatchingFishViewModelScope11 == null || CatchingFishViewModelScope11.length() == 0) && catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishViewStripeAPI.CatchingFishParcelableFAB)) {
                                                            arrayList6.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                        }
                                                        if (catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishDaggerHiltFAB)) {
                                                            arrayList6.add("androidx.compose.ui.semantics.testTag");
                                                        }
                                                        if (catchingFishPayPalService4.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishSensorManager)) {
                                                            arrayList6.add("androidx.compose.ui.semantics.shapeType");
                                                            arrayList6.add("androidx.compose.ui.semantics.shapeRect");
                                                            arrayList6.add("androidx.compose.ui.semantics.shapeCorners");
                                                            arrayList6.add("androidx.compose.ui.semantics.shapeRegion");
                                                        }
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                            accessibilityNodeInfo3.setAvailableExtraData(arrayList6);
                                                        }
                                                    }
                                                    catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishCoroutine);
                                                    if (catchingFishMVVMCustomView != null) {
                                                        float f = catchingFishMVVMCustomView.CatchingFishParcelableFAB;
                                                        CatchingFishManifestIntent catchingFishManifestIntent = catchingFishMVVMCustomView.CatchingFishSnackbar;
                                                        CatchingFishGraphQLLayout catchingFishGraphQLLayout4 = CatchingFishViewStripeAPI.CatchingFishViewModelScope;
                                                        if (catchingFishPayPalService4.CatchingFishCoroutine(catchingFishGraphQLLayout4)) {
                                                            catchingFishViewJUnitJUnit.CatchingFishLayout("android.widget.SeekBar");
                                                        } else {
                                                            catchingFishViewJUnitJUnit.CatchingFishLayout("android.widget.ProgressBar");
                                                        }
                                                        if (catchingFishMVVMCustomView != CatchingFishMVVMCustomView.CatchingFishCoroutine) {
                                                            catchingFishViewJUnitJUnit.CatchingFishParcelableFAB.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new CatchingFishFABFlux(AccessibilityNodeInfo.RangeInfo.obtain(1, catchingFishManifestIntent.CatchingFishParcelableFAB, Float.valueOf(catchingFishManifestIntent.CatchingFishSnackbar).floatValue(), f)).CatchingFishReduxKtor);
                                                        }
                                                        if (catchingFishMVIGraphQLHilt7.CatchingFishOkHttp().CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout4) && CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7)) {
                                                            float floatValue = Float.valueOf(catchingFishManifestIntent.CatchingFishSnackbar).floatValue();
                                                            float floatValue2 = Float.valueOf(catchingFishManifestIntent.CatchingFishParcelableFAB).floatValue();
                                                            if (floatValue < floatValue2) {
                                                                floatValue = floatValue2;
                                                            }
                                                            if (f < floatValue) {
                                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishViewModelFAB);
                                                            }
                                                            float floatValue3 = Float.valueOf(catchingFishManifestIntent.CatchingFishParcelableFAB).floatValue();
                                                            float floatValue4 = Float.valueOf(catchingFishManifestIntent.CatchingFishSnackbar).floatValue();
                                                            if (floatValue3 > floatValue4) {
                                                                floatValue3 = floatValue4;
                                                            }
                                                            if (f > floatValue3) {
                                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishLayout);
                                                            }
                                                        }
                                                    }
                                                    int i32 = Build.VERSION.SDK_INT;
                                                    CatchingFishXMLLayoutGlide.CatchingFishFragmentHandler(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                                    CatchingFishBiometricBundle.CatchingFishSensorManager(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                                    CatchingFishViewModelScope = catchingFishMVIGraphQLHilt7.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishViewModelScope);
                                                    if (CatchingFishViewModelScope == null) {
                                                        CatchingFishViewModelScope = null;
                                                    }
                                                    if (CatchingFishViewModelScope == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    CatchingFishMVIGraphQLHilt CatchingFishEspressoTesting2 = catchingFishMVIGraphQLHilt7.CatchingFishEspressoTesting();
                                                    if (CatchingFishEspressoTesting2 != null) {
                                                        Object CatchingFishViewModelScope12 = CatchingFishEspressoTesting2.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishDaggerWebsocket);
                                                        if (CatchingFishViewModelScope12 == null) {
                                                            CatchingFishViewModelScope12 = null;
                                                        }
                                                        if (CatchingFishViewModelScope12 != null) {
                                                            Object CatchingFishViewModelScope13 = CatchingFishEspressoTesting2.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishWorkManager);
                                                            if ((CatchingFishViewModelScope13 != null ? CatchingFishViewModelScope13 : null) != null) {
                                                                throw new ClassCastException();
                                                            }
                                                            if (catchingFishMVIGraphQLHilt7.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishMVPRobolectric)) {
                                                                ArrayList arrayList7 = new ArrayList();
                                                                List CatchingFishFragmentHandler2 = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, CatchingFishEspressoTesting2);
                                                                int size9 = CatchingFishFragmentHandler2.size();
                                                                int i33 = 0;
                                                                for (int i34 = 0; i34 < size9; i34++) {
                                                                    CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt9 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler2.get(i34);
                                                                    if (catchingFishMVIGraphQLHilt9.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishMVPRobolectric)) {
                                                                        arrayList7.add(catchingFishMVIGraphQLHilt9);
                                                                        if (catchingFishMVIGraphQLHilt9.CatchingFishCoroutine.CatchingFishNavigation() < catchingFishMVIGraphQLHilt7.CatchingFishCoroutine.CatchingFishNavigation()) {
                                                                            i33++;
                                                                        }
                                                                    }
                                                                }
                                                                if (!arrayList7.isEmpty()) {
                                                                    boolean CatchingFishViewModelScope14 = CatchingFishBiometricBundle.CatchingFishViewModelScope(arrayList7);
                                                                    int i35 = CatchingFishViewModelScope14 ? 0 : i33;
                                                                    int i36 = CatchingFishViewModelScope14 ? i33 : 0;
                                                                    Object CatchingFishViewModelScope15 = catchingFishMVIGraphQLHilt7.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishMVPRobolectric);
                                                                    if (CatchingFishViewModelScope15 == null) {
                                                                        CatchingFishViewModelScope15 = Boolean.FALSE;
                                                                    }
                                                                    catchingFishViewJUnitJUnit.CatchingFishParcelableFAB.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i35, 1, i36, 1, false, ((Boolean) CatchingFishViewModelScope15).booleanValue()));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishServiceMVI.CatchingFish));
                                                    CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishServiceMVI.CatchingFishJetpackCompose));
                                                    if (i32 >= 29) {
                                                        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout6 = catchingFishMVIGraphQLHilt7.CatchingFishReduxKtor;
                                                        CatchingFishPayPalService catchingFishPayPalService5 = catchingFishMVPMotionLayout6.CatchingFishReduxKtor;
                                                        Object CatchingFishViewModelScope16 = catchingFishMVPMotionLayout6.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutineFlow);
                                                        if (CatchingFishViewModelScope16 == null) {
                                                            CatchingFishViewModelScope16 = null;
                                                        }
                                                        if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7)) {
                                                            Object CatchingFishViewModelScope17 = catchingFishPayPalService5.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishDaggerHiltFAB);
                                                            if (CatchingFishViewModelScope17 == null) {
                                                                CatchingFishViewModelScope17 = null;
                                                            }
                                                            CatchingFishSnackbarToast catchingFishSnackbarToast9 = (CatchingFishSnackbarToast) CatchingFishViewModelScope17;
                                                            if (catchingFishSnackbarToast9 != null) {
                                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast9.CatchingFishParcelableFAB, R.id.accessibilityActionPageUp));
                                                            }
                                                            Object CatchingFishViewModelScope18 = catchingFishPayPalService5.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishParcelableFlux);
                                                            if (CatchingFishViewModelScope18 == null) {
                                                                CatchingFishViewModelScope18 = null;
                                                            }
                                                            CatchingFishSnackbarToast catchingFishSnackbarToast10 = (CatchingFishSnackbarToast) CatchingFishViewModelScope18;
                                                            if (catchingFishSnackbarToast10 != null) {
                                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast10.CatchingFishParcelableFAB, R.id.accessibilityActionPageDown));
                                                            }
                                                            Object CatchingFishViewModelScope19 = catchingFishPayPalService5.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishSpannableWidget);
                                                            if (CatchingFishViewModelScope19 == null) {
                                                                CatchingFishViewModelScope19 = null;
                                                            }
                                                            CatchingFishSnackbarToast catchingFishSnackbarToast11 = (CatchingFishSnackbarToast) CatchingFishViewModelScope19;
                                                            if (catchingFishSnackbarToast11 != null) {
                                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast11.CatchingFishParcelableFAB, R.id.accessibilityActionPageLeft));
                                                            }
                                                            Object CatchingFishViewModelScope20 = catchingFishPayPalService5.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishGsonAppCompat);
                                                            CatchingFishSnackbarToast catchingFishSnackbarToast12 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope20 != null ? CatchingFishViewModelScope20 : null);
                                                            if (catchingFishSnackbarToast12 != null) {
                                                                catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast12.CatchingFishParcelableFAB, R.id.accessibilityActionPageRight));
                                                            }
                                                        }
                                                    }
                                                    CharSequence charSequence = (CharSequence) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishServiceMVI.CatchingFishReduxKtor);
                                                    if (i32 >= 28) {
                                                        accessibilityNodeInfo4.setPaneTitle(charSequence);
                                                    } else {
                                                        accessibilityNodeInfo4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                                    }
                                                    if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7)) {
                                                        CatchingFishSnackbarToast catchingFishSnackbarToast13 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishViewStripeAPI.CatchingFishRoomDatabase);
                                                        if (catchingFishSnackbarToast13 != null) {
                                                            catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast13.CatchingFishParcelableFAB, 262144));
                                                        }
                                                        CatchingFishSnackbarToast catchingFishSnackbarToast14 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishViewStripeAPI.CatchingFishNavigation);
                                                        if (catchingFishSnackbarToast14 != null) {
                                                            catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast14.CatchingFishParcelableFAB, 524288));
                                                        }
                                                        CatchingFishSnackbarToast catchingFishSnackbarToast15 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishViewStripeAPI.CatchingFish);
                                                        if (catchingFishSnackbarToast15 != null) {
                                                            catchingFishViewJUnitJUnit.CatchingFishSnackbar(new CatchingFishBundleContext(catchingFishSnackbarToast15.CatchingFishParcelableFAB, 1048576));
                                                        }
                                                        CatchingFishMVPMotionLayout CatchingFishOkHttp2 = catchingFishMVIGraphQLHilt7.CatchingFishOkHttp();
                                                        CatchingFishGraphQLLayout catchingFishGraphQLLayout5 = CatchingFishViewStripeAPI.CatchingFishCoroutineFlow;
                                                        if (CatchingFishOkHttp2.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishGraphQLLayout5)) {
                                                            List list5 = (List) catchingFishMVIGraphQLHilt7.CatchingFishOkHttp().CatchingFishSnackbar(catchingFishGraphQLLayout5);
                                                            int size10 = list5.size();
                                                            CatchingFishGsonLayout catchingFishGsonLayout = CatchingFishFABViewModel.CatchingFishPayPalLiveData;
                                                            if (size10 >= catchingFishGsonLayout.CatchingFishSnackbar) {
                                                                throw new IllegalStateException("Can't have more than " + catchingFishGsonLayout.CatchingFishSnackbar + " custom actions for one widget");
                                                            }
                                                            CatchingFishGsonAsyncTask catchingFishGsonAsyncTask3 = new CatchingFishGsonAsyncTask(0);
                                                            CatchingFishJUnitService CatchingFishParcelableFAB = CatchingFishGoogleMapsAdMob.CatchingFishParcelableFAB();
                                                            CatchingFishGsonAsyncTask catchingFishGsonAsyncTask4 = catchingFishGsonAsyncTask;
                                                            if (CatchingFishAdMobFAB.CatchingFishLayout(catchingFishGsonAsyncTask4.CatchingFishWorkManager, i, catchingFishGsonAsyncTask4.CatchingFishReduxKtor) >= 0) {
                                                                CatchingFishJUnitService catchingFishJUnitService = (CatchingFishJUnitService) catchingFishGsonAsyncTask4.CatchingFishCoroutine(i);
                                                                int[] iArr = catchingFishGsonLayout.CatchingFishParcelableFAB;
                                                                int i37 = catchingFishGsonLayout.CatchingFishSnackbar;
                                                                int[] iArr2 = new int[16];
                                                                int i38 = 0;
                                                                int i39 = 0;
                                                                while (i38 < i37) {
                                                                    int i40 = iArr[i38];
                                                                    int i41 = i37;
                                                                    int i42 = i39 + 1;
                                                                    CatchingFishJUnitService catchingFishJUnitService2 = catchingFishJUnitService;
                                                                    if (iArr2.length < i42) {
                                                                        iArr2 = Arrays.copyOf(iArr2, Math.max(i42, (iArr2.length * 3) / 2));
                                                                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(iArr2, "copyOf(...)");
                                                                    }
                                                                    iArr2[i39] = i40;
                                                                    i38++;
                                                                    i39 = i42;
                                                                    i37 = i41;
                                                                    catchingFishJUnitService = catchingFishJUnitService2;
                                                                }
                                                                CatchingFishJUnitService catchingFishJUnitService3 = catchingFishJUnitService;
                                                                ArrayList arrayList8 = new ArrayList();
                                                                if (list5.size() > 0) {
                                                                    CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(list5.get(0));
                                                                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishJUnitService3);
                                                                    throw null;
                                                                }
                                                                if (arrayList8.size() > 0) {
                                                                    CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(arrayList8.get(0));
                                                                    if (i39 > 0) {
                                                                        int i43 = iArr2[0];
                                                                        throw null;
                                                                    }
                                                                    CatchingFishHiltMVPToast.CatchingFishGradleManifest("Index must be between 0 and size");
                                                                    throw null;
                                                                }
                                                            } else if (list5.size() > 0) {
                                                                CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(list5.get(0));
                                                                catchingFishGsonLayout.CatchingFishSnackbar(0);
                                                                throw null;
                                                            }
                                                            catchingFishFABViewModel2.CatchingFishNavigation.CatchingFishReduxKtor(i, catchingFishGsonAsyncTask3);
                                                            catchingFishGsonAsyncTask4.CatchingFishReduxKtor(i, CatchingFishParcelableFAB);
                                                        }
                                                    }
                                                    boolean CatchingFishDaggerWebsocket2 = CatchingFishGsonCardView.CatchingFishDaggerWebsocket(catchingFishMVIGraphQLHilt7, resources4);
                                                    if (Build.VERSION.SDK_INT >= 28) {
                                                        accessibilityNodeInfo4.setScreenReaderFocusable(CatchingFishDaggerWebsocket2);
                                                    } else {
                                                        catchingFishViewJUnitJUnit.CatchingFishViewModelFAB(1, CatchingFishDaggerWebsocket2);
                                                    }
                                                    int CatchingFishReduxKtor2 = catchingFishFABViewModel2.CatchingFishCardViewView.CatchingFishReduxKtor(i);
                                                    if (CatchingFishReduxKtor2 != -1) {
                                                        CatchingFishHiltBundle CatchingFishGsonAppCompat2 = CatchingFishKtorViewModel.CatchingFishGsonAppCompat(catchingFishGradleCameraX.getAndroidViewsHandler$ui_release(), CatchingFishReduxKtor2);
                                                        if (CatchingFishGsonAppCompat2 != null) {
                                                            accessibilityNodeInfo4.setTraversalBefore(CatchingFishGsonAppCompat2);
                                                            catchingFishGradleCameraX2 = catchingFishGradleCameraX;
                                                        } else {
                                                            catchingFishGradleCameraX2 = catchingFishGradleCameraX;
                                                            accessibilityNodeInfo4.setTraversalBefore(catchingFishGradleCameraX2, CatchingFishReduxKtor2);
                                                        }
                                                        bundle = null;
                                                        catchingFishFABViewModel2.CatchingFishFragmentHandler(i, catchingFishViewJUnitJUnit, catchingFishFABViewModel2.CatchingFishCustomView, null);
                                                    } else {
                                                        bundle = null;
                                                        catchingFishGradleCameraX2 = catchingFishGradleCameraX;
                                                    }
                                                    int CatchingFishReduxKtor3 = catchingFishFABViewModel2.CatchingFishMVPRobolectric.CatchingFishReduxKtor(i);
                                                    if (CatchingFishReduxKtor3 != -1 && (CatchingFishGsonAppCompat = CatchingFishKtorViewModel.CatchingFishGsonAppCompat(catchingFishGradleCameraX2.getAndroidViewsHandler$ui_release(), CatchingFishReduxKtor3)) != null) {
                                                        accessibilityNodeInfo4.setTraversalAfter(CatchingFishGsonAppCompat);
                                                        catchingFishFABViewModel2.CatchingFishFragmentHandler(i, catchingFishViewJUnitJUnit, catchingFishFABViewModel2.CatchingFishFragmentFactory, bundle);
                                                    }
                                                    String str3 = (String) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt7.CatchingFishOkHttp(), CatchingFishRoomBundle.CatchingFishSnackbar);
                                                    if (str3 != null) {
                                                        catchingFishViewJUnitJUnit.CatchingFishLayout(str3);
                                                    }
                                                    return catchingFishViewJUnitJUnit;
                                                }
                                                z2 = true;
                                                if (!z2) {
                                                }
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishCoroutine);
                                                if (catchingFishMVVMCustomView != null) {
                                                }
                                                int i322 = Build.VERSION.SDK_INT;
                                                CatchingFishXMLLayoutGlide.CatchingFishFragmentHandler(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                                CatchingFishBiometricBundle.CatchingFishSensorManager(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                                CatchingFishViewModelScope = catchingFishMVIGraphQLHilt7.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishViewModelScope);
                                                if (CatchingFishViewModelScope == null) {
                                                }
                                                if (CatchingFishViewModelScope == null) {
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishCoroutine);
                                        if (catchingFishMVVMCustomView != null) {
                                        }
                                        int i3222 = Build.VERSION.SDK_INT;
                                        CatchingFishXMLLayoutGlide.CatchingFishFragmentHandler(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                        CatchingFishBiometricBundle.CatchingFishSensorManager(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                        CatchingFishViewModelScope = catchingFishMVIGraphQLHilt7.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishViewModelScope);
                                        if (CatchingFishViewModelScope == null) {
                                        }
                                        if (CatchingFishViewModelScope == null) {
                                        }
                                    }
                                } else {
                                    catchingFishFABViewModel2 = catchingFishFABViewModel;
                                }
                                z = true;
                                accessibilityNodeInfo4.setVisibleToUser(CatchingFishAdMobFAB.CatchingFishPayPal(catchingFishMVIGraphQLHilt7) ^ z);
                                CatchingFishMVPLiveData.CatchingFishDaggerHiltFAB(CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishFragmentHandler));
                                accessibilityNodeInfo4.setClickable(false);
                                catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishSnackbar);
                                if (catchingFishSnackbarToast != null) {
                                }
                                accessibilityNodeInfo4.setLongClickable(false);
                                catchingFishSnackbarToast2 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishCoroutine);
                                if (catchingFishSnackbarToast2 != null) {
                                }
                                catchingFishSnackbarToast3 = (CatchingFishSnackbarToast) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishViewStripeAPI.CatchingFishUnitTesting);
                                if (catchingFishSnackbarToast3 != null) {
                                }
                                if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt7)) {
                                }
                                CatchingFishJetpackCompose = CatchingFishFABViewModel.CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt7);
                                if (!(CatchingFishJetpackCompose != null || CatchingFishJetpackCompose.length() == 0)) {
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout4, CatchingFishServiceMVI.CatchingFishCoroutine);
                                if (catchingFishMVVMCustomView != null) {
                                }
                                int i32222 = Build.VERSION.SDK_INT;
                                CatchingFishXMLLayoutGlide.CatchingFishFragmentHandler(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                CatchingFishBiometricBundle.CatchingFishSensorManager(catchingFishViewJUnitJUnit, catchingFishMVIGraphQLHilt7);
                                CatchingFishViewModelScope = catchingFishMVIGraphQLHilt7.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishViewModelScope);
                                if (CatchingFishViewModelScope == null) {
                                }
                                if (CatchingFishViewModelScope == null) {
                                }
                            }
                        }
                    } else if (!accessibilityManager.isEnabled()) {
                        return new CatchingFishViewJUnitJUnit(AccessibilityNodeInfo.obtain());
                    }
                } else if (!accessibilityManager.isEnabled()) {
                    return new CatchingFishViewJUnitJUnit(AccessibilityNodeInfo.obtain());
                }
                return null;
            default:
                return new CatchingFishViewJUnitJUnit(AccessibilityNodeInfo.obtain(((CatchingFishGlideKtor) this.CatchingFishEspressoTesting).CatchingFishUnitTesting(i).CatchingFishParcelableFAB));
        }
    }

    @Override // kotlin.text.CatchingFishServiceHilt
    public final CatchingFishViewJUnitJUnit CatchingFishJetpackCompose(int i) {
        switch (this.CatchingFishCloudMessaging) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel = (CatchingFishFABViewModel) this.CatchingFishEspressoTesting;
                if (i != 1) {
                    if (i == 2) {
                        return CatchingFish(catchingFishFABViewModel.CatchingFishUnitTesting);
                    }
                    throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unknown focus type: ", i));
                }
                int i2 = catchingFishFABViewModel.CatchingFishAnimationMockk;
                if (i2 == Integer.MIN_VALUE) {
                    return null;
                }
                return CatchingFish(i2);
            default:
                CatchingFishGlideKtor catchingFishGlideKtor = (CatchingFishGlideKtor) this.CatchingFishEspressoTesting;
                int i3 = i == 2 ? catchingFishGlideKtor.CatchingFishCloudMessaging : catchingFishGlideKtor.CatchingFishEspressoTesting;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return CatchingFish(i3);
        }
    }

    @Override // kotlin.text.CatchingFishServiceHilt
    public void CatchingFishNavigation(int i, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit, String str, Bundle bundle) {
        switch (this.CatchingFishCloudMessaging) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishFABViewModel) this.CatchingFishEspressoTesting).CatchingFishFragmentHandler(i, catchingFishViewJUnitJUnit, str, bundle);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0382, code lost:
    
        if (((java.lang.Boolean) r1.CatchingFishDaggerWebsocket(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r7))).booleanValue() == true) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0233, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0693, code lost:
    
        if (r1 != 16) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        if (r7 == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0713  */
    @Override // kotlin.text.CatchingFishServiceHilt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishParcelableFlux(int i, int i2, Bundle bundle) {
        boolean z;
        CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt;
        boolean z2;
        Integer num;
        CatchingFishAccessibility catchingFishAccessibility;
        int i3;
        int i4;
        CatchingFishJUnitGlide catchingFishJUnitGlide;
        int i5;
        int i6;
        CatchingFishJUnitGlide catchingFishJUnitGlide2;
        CatchingFishJUnitGlide catchingFishJUnitGlide3;
        CatchingFishJUnitGlide catchingFishJUnitGlide4;
        CatchingFishServiceHandler catchingFishServiceHandler;
        CatchingFishJUnitGlide catchingFishJUnitGlide5;
        CatchingFishJUnitGlide catchingFishJUnitGlide6;
        CatchingFishJUnitGlide catchingFishJUnitGlide7;
        CatchingFishJUnitGlide catchingFishJUnitGlide8;
        CatchingFishJUnitGlide catchingFishJUnitGlide9;
        CatchingFishServiceHandler catchingFishServiceHandler2;
        CatchingFishSnackbarToast catchingFishSnackbarToast;
        long j;
        Object CatchingFishViewModelScope;
        CatchingFishServiceHandler catchingFishServiceHandler3;
        CatchingFishJUnitGlide catchingFishJUnitGlide10;
        CatchingFishJUnitGlide catchingFishJUnitGlide11;
        CatchingFishJUnitGlide catchingFishJUnitGlide12;
        CatchingFishJUnitGlide catchingFishJUnitGlide13;
        CatchingFishJUnitGlide catchingFishJUnitGlide14;
        boolean z3;
        int i7;
        int i8 = this.CatchingFishCloudMessaging;
        CatchingFishAndroidX catchingFishAndroidX = this.CatchingFishEspressoTesting;
        boolean z4 = false;
        switch (i8) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel = (CatchingFishFABViewModel) catchingFishAndroidX;
                AccessibilityManager accessibilityManager = catchingFishFABViewModel.CatchingFishViewModelScope;
                CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishFABViewModel.CatchingFishReduxKtor;
                CatchingFishMoshiKtor catchingFishMoshiKtor = (CatchingFishMoshiKtor) catchingFishFABViewModel.CatchingFish().CatchingFishSnackbar(i);
                if (catchingFishMoshiKtor == null || (catchingFishMVIGraphQLHilt = catchingFishMoshiKtor.CatchingFishParcelableFAB) == null) {
                    z = false;
                } else {
                    CatchingFishBiometricRoom catchingFishBiometricRoom = catchingFishMVIGraphQLHilt.CatchingFishCoroutine;
                    int i9 = catchingFishMVIGraphQLHilt.CatchingFishViewModelScope;
                    CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
                    CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout.CatchingFishReduxKtor;
                    Object CatchingFishViewModelScope2 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishOkHttp);
                    if (CatchingFishViewModelScope2 == null) {
                        CatchingFishViewModelScope2 = null;
                    }
                    Boolean bool = Boolean.TRUE;
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewModelScope2, bool)) {
                        if (Build.VERSION.SDK_INT < 34) {
                            z3 = true;
                            break;
                        } else {
                            z3 = CatchingFishDataStore.CatchingFishViewModelFAB(accessibilityManager);
                            break;
                        }
                    }
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 == 256 || i2 == 512) {
                                if (bundle != null) {
                                    int i10 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                    boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                    boolean z6 = i2 == 256;
                                    Integer num2 = catchingFishFABViewModel.CatchingFishCoroutineFlow;
                                    if (num2 == null || i9 != num2.intValue()) {
                                        catchingFishFABViewModel.CatchingFishJetpackCompose = -1;
                                        catchingFishFABViewModel.CatchingFishCoroutineFlow = Integer.valueOf(i9);
                                    }
                                    String CatchingFishJetpackCompose = CatchingFishFABViewModel.CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt);
                                    if (CatchingFishJetpackCompose != null && CatchingFishJetpackCompose.length() != 0) {
                                        String CatchingFishJetpackCompose2 = CatchingFishFABViewModel.CatchingFishJetpackCompose(catchingFishMVIGraphQLHilt);
                                        if (CatchingFishJetpackCompose2 != null && CatchingFishJetpackCompose2.length() != 0) {
                                            if (i10 == 1) {
                                                Locale locale = catchingFishGradleCameraX.getContext().getResources().getConfiguration().locale;
                                                if (CatchingFishCoroutineFAB.CatchingFishDaggerWebsocket == null) {
                                                    CatchingFishCoroutineFAB catchingFishCoroutineFAB = new CatchingFishCoroutineFAB(0);
                                                    catchingFishCoroutineFAB.CatchingFishReduxKtor = BreakIterator.getCharacterInstance(locale);
                                                    CatchingFishCoroutineFAB.CatchingFishDaggerWebsocket = catchingFishCoroutineFAB;
                                                }
                                                CatchingFishCoroutineFAB catchingFishCoroutineFAB2 = CatchingFishCoroutineFAB.CatchingFishDaggerWebsocket;
                                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishCoroutineFAB2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                                catchingFishCoroutineFAB2.CatchingFishLayout(CatchingFishJetpackCompose2);
                                                catchingFishAccessibility = catchingFishCoroutineFAB2;
                                            } else if (i10 != 2) {
                                                if (i10 != 4) {
                                                    if (i10 != 8) {
                                                        break;
                                                    } else {
                                                        if (CatchingFishExoPlayerJUnit.CatchingFishCoroutine == null) {
                                                            CatchingFishExoPlayerJUnit.CatchingFishCoroutine = new CatchingFishExoPlayerJUnit();
                                                        }
                                                        CatchingFishExoPlayerJUnit catchingFishExoPlayerJUnit = CatchingFishExoPlayerJUnit.CatchingFishCoroutine;
                                                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishExoPlayerJUnit, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                                        catchingFishExoPlayerJUnit.CatchingFishParcelableFAB = CatchingFishJetpackCompose2;
                                                        catchingFishAccessibility = catchingFishExoPlayerJUnit;
                                                    }
                                                }
                                                if (catchingFishPayPalService.CatchingFishCoroutine(CatchingFishViewStripeAPI.CatchingFishParcelableFAB)) {
                                                    CatchingFishKtorViewModel.CatchingFishRoomDatabase(catchingFishMVPMotionLayout);
                                                }
                                            } else {
                                                Locale locale2 = catchingFishGradleCameraX.getContext().getResources().getConfiguration().locale;
                                                if (CatchingFishCoroutineFAB.CatchingFishWorkManager == null) {
                                                    CatchingFishCoroutineFAB catchingFishCoroutineFAB3 = new CatchingFishCoroutineFAB(1);
                                                    catchingFishCoroutineFAB3.CatchingFishReduxKtor = BreakIterator.getWordInstance(locale2);
                                                    CatchingFishCoroutineFAB.CatchingFishWorkManager = catchingFishCoroutineFAB3;
                                                }
                                                CatchingFishCoroutineFAB catchingFishCoroutineFAB4 = CatchingFishCoroutineFAB.CatchingFishWorkManager;
                                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishCoroutineFAB4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                                catchingFishCoroutineFAB4.CatchingFishLayout(CatchingFishJetpackCompose2);
                                                catchingFishAccessibility = catchingFishCoroutineFAB4;
                                            }
                                            if (catchingFishAccessibility != null) {
                                                int CatchingFishRoomDatabase = catchingFishFABViewModel.CatchingFishRoomDatabase(catchingFishMVIGraphQLHilt);
                                                if (CatchingFishRoomDatabase == -1) {
                                                    CatchingFishRoomDatabase = z6 ? 0 : CatchingFishJetpackCompose.length();
                                                }
                                                int[] CatchingFishReduxKtor = z6 ? catchingFishAccessibility.CatchingFishReduxKtor(CatchingFishRoomDatabase) : catchingFishAccessibility.CatchingFishViewModelFAB(CatchingFishRoomDatabase);
                                                if (CatchingFishReduxKtor != null) {
                                                    int i11 = CatchingFishReduxKtor[0];
                                                    int i12 = CatchingFishReduxKtor[1];
                                                    if (z5 && !catchingFishPayPalService.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishParcelableFAB) && catchingFishPayPalService.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishPayPal)) {
                                                        i3 = catchingFishFABViewModel.CatchingFishNavigation(catchingFishMVIGraphQLHilt);
                                                        if (i3 == -1) {
                                                            i3 = z6 ? i11 : i12;
                                                        }
                                                        i4 = z6 ? i12 : i11;
                                                    } else {
                                                        i3 = z6 ? i12 : i11;
                                                        i4 = i3;
                                                    }
                                                    catchingFishFABViewModel.CatchingFishGsonAppCompat = new CatchingFishToastMVI(catchingFishMVIGraphQLHilt, z6 ? 256 : 512, i10, i11, i12, SystemClock.uptimeMillis());
                                                    z2 = true;
                                                    catchingFishFABViewModel.CatchingFishMutableLiveData(catchingFishMVIGraphQLHilt, i3, i4, true);
                                                }
                                            }
                                        }
                                        catchingFishAccessibility = null;
                                        if (catchingFishAccessibility != null) {
                                        }
                                    }
                                }
                            } else if (i2 == 16384) {
                                Object CatchingFishViewModelScope3 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishUnitTesting);
                                CatchingFishSnackbarToast catchingFishSnackbarToast2 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope3 == null ? null : CatchingFishViewModelScope3);
                                if (catchingFishSnackbarToast2 != null && (catchingFishJUnitGlide = (CatchingFishJUnitGlide) catchingFishSnackbarToast2.CatchingFishSnackbar) != null) {
                                    return ((Boolean) catchingFishJUnitGlide.CatchingFishParcelableFAB()).booleanValue();
                                }
                            } else {
                                if (i2 == 131072) {
                                    if (bundle != null) {
                                        i5 = -1;
                                        i6 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                    } else {
                                        i5 = -1;
                                        i6 = -1;
                                    }
                                    boolean CatchingFishMutableLiveData = catchingFishFABViewModel.CatchingFishMutableLiveData(catchingFishMVIGraphQLHilt, i6, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i5) : -1, false);
                                    if (!CatchingFishMutableLiveData) {
                                        return CatchingFishMutableLiveData;
                                    }
                                    CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, catchingFishFABViewModel.CatchingFishSpannableWidget(i9), 0, null, 12);
                                    return CatchingFishMutableLiveData;
                                }
                                if (CatchingFishGsonCardView.CatchingFishReduxKtor(catchingFishMVIGraphQLHilt)) {
                                    if (i2 == 1) {
                                        if (catchingFishGradleCameraX.isInTouchMode()) {
                                            catchingFishGradleCameraX.requestFocusFromTouch();
                                        }
                                        Object CatchingFishViewModelScope4 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishJetpackCompose);
                                        CatchingFishSnackbarToast catchingFishSnackbarToast3 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope4 == null ? null : CatchingFishViewModelScope4);
                                        if (catchingFishSnackbarToast3 != null && (catchingFishJUnitGlide2 = (CatchingFishJUnitGlide) catchingFishSnackbarToast3.CatchingFishSnackbar) != null) {
                                            return ((Boolean) catchingFishJUnitGlide2.CatchingFishParcelableFAB()).booleanValue();
                                        }
                                    } else if (i2 != 2) {
                                        switch (i2) {
                                            case 16:
                                                Object CatchingFishViewModelScope5 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishSnackbar);
                                                if (CatchingFishViewModelScope5 == null) {
                                                    CatchingFishViewModelScope5 = null;
                                                }
                                                CatchingFishSnackbarToast catchingFishSnackbarToast4 = (CatchingFishSnackbarToast) CatchingFishViewModelScope5;
                                                Boolean bool2 = (catchingFishSnackbarToast4 == null || (catchingFishJUnitGlide3 = (CatchingFishJUnitGlide) catchingFishSnackbarToast4.CatchingFishSnackbar) == null) ? null : (Boolean) catchingFishJUnitGlide3.CatchingFishParcelableFAB();
                                                CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i, 1, null, 12);
                                                if (bool2 != null) {
                                                    return bool2.booleanValue();
                                                }
                                                break;
                                            case 32:
                                                Object CatchingFishViewModelScope6 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishCoroutine);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast5 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope6 == null ? null : CatchingFishViewModelScope6);
                                                if (catchingFishSnackbarToast5 != null && (catchingFishJUnitGlide4 = (CatchingFishJUnitGlide) catchingFishSnackbarToast5.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide4.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            case 4096:
                                            case 8192:
                                                boolean z7 = i2 == 4096;
                                                boolean z8 = i2 == 8192;
                                                if (i2 == 16908345) {
                                                }
                                                if (i2 == 16908347) {
                                                }
                                                if (i2 == 16908344) {
                                                }
                                                if (i2 == 16908346) {
                                                }
                                                if (z7 || z8) {
                                                    Object CatchingFishViewModelScope7 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutine);
                                                    if (CatchingFishViewModelScope7 == null) {
                                                        CatchingFishViewModelScope7 = null;
                                                    }
                                                    CatchingFishMVVMCustomView catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) CatchingFishViewModelScope7;
                                                    Object CatchingFishViewModelScope8 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishViewModelScope);
                                                    if (CatchingFishViewModelScope8 == null) {
                                                        CatchingFishViewModelScope8 = null;
                                                    }
                                                    CatchingFishSnackbarToast catchingFishSnackbarToast6 = (CatchingFishSnackbarToast) CatchingFishViewModelScope8;
                                                    if (catchingFishMVVMCustomView != null) {
                                                        CatchingFishManifestIntent catchingFishManifestIntent = catchingFishMVVMCustomView.CatchingFishSnackbar;
                                                        if (catchingFishSnackbarToast6 != null) {
                                                            float f = catchingFishManifestIntent.CatchingFishSnackbar;
                                                            float f2 = catchingFishManifestIntent.CatchingFishParcelableFAB;
                                                            float f3 = f < f2 ? f2 : f;
                                                            if (f2 <= f) {
                                                                f = f2;
                                                            }
                                                            float f4 = (f3 - f) / 20;
                                                            if (z8) {
                                                                f4 = -f4;
                                                            }
                                                            CatchingFishServiceHandler catchingFishServiceHandler4 = (CatchingFishServiceHandler) catchingFishSnackbarToast6.CatchingFishSnackbar;
                                                            if (catchingFishServiceHandler4 != null) {
                                                                return ((Boolean) catchingFishServiceHandler4.CatchingFishFragmentHandler(Float.valueOf(catchingFishMVVMCustomView.CatchingFishParcelableFAB + f4))).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                                CatchingFishFluxExoPlayer CatchingFishCloudMessaging = CatchingFishLayoutRoomFAB.CatchingFishCloudMessaging((CatchingFishGlideHandler) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelScope);
                                                float f5 = CatchingFishCloudMessaging.CatchingFishCoroutine - CatchingFishCloudMessaging.CatchingFishParcelableFAB;
                                                float f6 = CatchingFishCloudMessaging.CatchingFishReduxKtor - CatchingFishCloudMessaging.CatchingFishSnackbar;
                                                Float.floatToRawIntBits(f5);
                                                Float.floatToRawIntBits(f6);
                                                ArrayList arrayList = new ArrayList();
                                                Object CatchingFishViewModelScope9 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishCardViewRealm);
                                                if (CatchingFishViewModelScope9 == null) {
                                                    CatchingFishViewModelScope9 = null;
                                                }
                                                CatchingFishSnackbarToast catchingFishSnackbarToast7 = (CatchingFishSnackbarToast) CatchingFishViewModelScope9;
                                                if (catchingFishSnackbarToast7 != null && (catchingFishServiceHandler = (CatchingFishServiceHandler) catchingFishSnackbarToast7.CatchingFishSnackbar) != null && ((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(arrayList)).booleanValue()) {
                                                }
                                                Object CatchingFishViewModelScope10 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishReduxKtor);
                                                if (CatchingFishViewModelScope10 == null) {
                                                    CatchingFishViewModelScope10 = null;
                                                }
                                                if (((CatchingFishSnackbarToast) CatchingFishViewModelScope10) != null) {
                                                    Object CatchingFishViewModelScope11 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFish);
                                                    if (CatchingFishViewModelScope11 == null) {
                                                        CatchingFishViewModelScope11 = null;
                                                    }
                                                    if (CatchingFishViewModelScope11 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Object CatchingFishViewModelScope12 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishJetpackCompose);
                                                    if ((CatchingFishViewModelScope12 == null ? null : CatchingFishViewModelScope12) != null) {
                                                        throw new ClassCastException();
                                                    }
                                                }
                                                break;
                                            case 32768:
                                                Object CatchingFishViewModelScope13 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishStateLiveData);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast8 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope13 == null ? null : CatchingFishViewModelScope13);
                                                if (catchingFishSnackbarToast8 != null && (catchingFishJUnitGlide5 = (CatchingFishJUnitGlide) catchingFishSnackbarToast8.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide5.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            case 65536:
                                                Object CatchingFishViewModelScope14 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishAnimationMockk);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast9 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope14 == null ? null : CatchingFishViewModelScope14);
                                                if (catchingFishSnackbarToast9 != null && (catchingFishJUnitGlide6 = (CatchingFishJUnitGlide) catchingFishSnackbarToast9.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide6.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            case 262144:
                                                Object CatchingFishViewModelScope15 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishRoomDatabase);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast10 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope15 == null ? null : CatchingFishViewModelScope15);
                                                if (catchingFishSnackbarToast10 != null && (catchingFishJUnitGlide7 = (CatchingFishJUnitGlide) catchingFishSnackbarToast10.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide7.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            case 524288:
                                                Object CatchingFishViewModelScope16 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishNavigation);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast11 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope16 == null ? null : CatchingFishViewModelScope16);
                                                if (catchingFishSnackbarToast11 != null && (catchingFishJUnitGlide8 = (CatchingFishJUnitGlide) catchingFishSnackbarToast11.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide8.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            case 1048576:
                                                Object CatchingFishViewModelScope17 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFish);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast12 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope17 == null ? null : CatchingFishViewModelScope17);
                                                if (catchingFishSnackbarToast12 != null && (catchingFishJUnitGlide9 = (CatchingFishJUnitGlide) catchingFishSnackbarToast12.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide9.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            case 2097152:
                                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                                Object CatchingFishViewModelScope18 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishLayout);
                                                if (CatchingFishViewModelScope18 == null) {
                                                    CatchingFishViewModelScope18 = null;
                                                }
                                                CatchingFishSnackbarToast catchingFishSnackbarToast13 = (CatchingFishSnackbarToast) CatchingFishViewModelScope18;
                                                if (catchingFishSnackbarToast13 != null && (catchingFishServiceHandler2 = (CatchingFishServiceHandler) catchingFishSnackbarToast13.CatchingFishSnackbar) != null) {
                                                    if (string == null) {
                                                        string = "";
                                                    }
                                                    return ((Boolean) catchingFishServiceHandler2.CatchingFishFragmentHandler(new CatchingFishWebsocketDagger(string, null))).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionShowOnScreen:
                                                CatchingFishMVIGraphQLHilt CatchingFishEspressoTesting = catchingFishMVIGraphQLHilt.CatchingFishEspressoTesting();
                                                if (CatchingFishEspressoTesting != null) {
                                                    Object CatchingFishViewModelScope19 = CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishReduxKtor);
                                                    if (CatchingFishViewModelScope19 == null) {
                                                        CatchingFishViewModelScope19 = null;
                                                    }
                                                    catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope19;
                                                    while (CatchingFishEspressoTesting != null && catchingFishSnackbarToast == null) {
                                                        CatchingFishEspressoTesting = CatchingFishEspressoTesting.CatchingFishEspressoTesting();
                                                        if (CatchingFishEspressoTesting != null) {
                                                            Object CatchingFishViewModelScope20 = CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishReduxKtor);
                                                            if (CatchingFishViewModelScope20 == null) {
                                                                CatchingFishViewModelScope20 = null;
                                                            }
                                                            catchingFishSnackbarToast = (CatchingFishSnackbarToast) CatchingFishViewModelScope20;
                                                        }
                                                    }
                                                    if (CatchingFishEspressoTesting == null) {
                                                        CatchingFishFluxExoPlayer CatchingFishViewModelScope21 = catchingFishMVIGraphQLHilt.CatchingFishViewModelScope();
                                                        return catchingFishGradleCameraX.requestRectangleOnScreen(new Rect((int) Math.floor(CatchingFishViewModelScope21.CatchingFishParcelableFAB), (int) Math.floor(CatchingFishViewModelScope21.CatchingFishSnackbar), CatchingFishLayoutRoom.CatchingFishMVPRobolectric((float) Math.ceil(CatchingFishViewModelScope21.CatchingFishCoroutine)), CatchingFishLayoutRoom.CatchingFishMVPRobolectric((float) Math.ceil(CatchingFishViewModelScope21.CatchingFishReduxKtor))));
                                                    }
                                                    CatchingFishPayPalService catchingFishPayPalService2 = CatchingFishEspressoTesting.CatchingFishReduxKtor.CatchingFishReduxKtor;
                                                    CatchingFishBiometricRoom catchingFishBiometricRoom2 = CatchingFishEspressoTesting.CatchingFishCoroutine;
                                                    CatchingFishFluxExoPlayer CatchingFishCloudMessaging2 = CatchingFishLayoutRoomFAB.CatchingFishCloudMessaging((CatchingFishGlideHandler) catchingFishBiometricRoom2.CatchingFishJobScheduler.CatchingFishViewModelScope);
                                                    CatchingFishMockkCoroutine CatchingFishEspressoTesting2 = ((CatchingFishGlideHandler) catchingFishBiometricRoom2.CatchingFishJobScheduler.CatchingFishViewModelScope).CatchingFishEspressoTesting();
                                                    long CatchingFishEspressoMockk = CatchingFishEspressoTesting2 != null ? ((CatchingFishDaggerToolbar) CatchingFishEspressoTesting2).CatchingFishEspressoMockk(0L) : 0L;
                                                    int i13 = (int) (CatchingFishEspressoMockk >> 32);
                                                    float intBitsToFloat = Float.intBitsToFloat(i13) + CatchingFishCloudMessaging2.CatchingFishParcelableFAB;
                                                    int i14 = (int) (CatchingFishEspressoMockk & 4294967295L);
                                                    float intBitsToFloat2 = Float.intBitsToFloat(i14) + CatchingFishCloudMessaging2.CatchingFishSnackbar;
                                                    float intBitsToFloat3 = Float.intBitsToFloat(i13) + CatchingFishCloudMessaging2.CatchingFishCoroutine;
                                                    float intBitsToFloat4 = Float.intBitsToFloat(i14) + CatchingFishCloudMessaging2.CatchingFishReduxKtor;
                                                    CatchingFishDaggerToolbar CatchingFishReduxKtor2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor();
                                                    if (CatchingFishReduxKtor2 != null) {
                                                        if (!CatchingFishReduxKtor2.CatchingFishRealmKtorRealm().CatchingFishRoomDatabase) {
                                                            CatchingFishReduxKtor2 = null;
                                                        }
                                                        if (CatchingFishReduxKtor2 != null) {
                                                            j = CatchingFishReduxKtor2.CatchingFishEspressoMockk(0L);
                                                            CatchingFishDaggerToolbar CatchingFishReduxKtor3 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor();
                                                            CatchingFishFluxExoPlayer CatchingFishReduxKtor4 = CatchingFishToastHiltBundle.CatchingFishReduxKtor(j, CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(CatchingFishReduxKtor3 != null ? CatchingFishReduxKtor3.CatchingFishWorkManager : 0L));
                                                            CatchingFishViewModelScope = catchingFishPayPalService2.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFish);
                                                            if (CatchingFishViewModelScope == null) {
                                                                CatchingFishViewModelScope = null;
                                                            }
                                                            if (CatchingFishViewModelScope == null) {
                                                                throw new ClassCastException();
                                                            }
                                                            Object CatchingFishViewModelScope22 = catchingFishPayPalService2.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishJetpackCompose);
                                                            if ((CatchingFishViewModelScope22 == null ? null : CatchingFishViewModelScope22) != null) {
                                                                throw new ClassCastException();
                                                            }
                                                            float f7 = CatchingFishReduxKtor4.CatchingFishParcelableFAB - intBitsToFloat;
                                                            float f8 = CatchingFishReduxKtor4.CatchingFishCoroutine - intBitsToFloat3;
                                                            if (Math.signum(f7) != Math.signum(f8)) {
                                                                f7 = 0.0f;
                                                            } else if (Math.abs(f7) >= Math.abs(f8)) {
                                                                f7 = f8;
                                                            }
                                                            if (catchingFishBiometricRoom.CatchingFishPayPal == CatchingFishGradleMVPKtor.CatchingFishDaggerWebsocket) {
                                                                f7 = -f7;
                                                            }
                                                            float f9 = CatchingFishReduxKtor4.CatchingFishSnackbar - intBitsToFloat2;
                                                            float f10 = CatchingFishReduxKtor4.CatchingFishReduxKtor - intBitsToFloat4;
                                                            float f11 = Math.signum(f9) == Math.signum(f10) ? Math.abs(f9) < Math.abs(f10) ? f9 : f10 : 0.0f;
                                                            if (catchingFishSnackbarToast != null) {
                                                                CatchingFishMockkView catchingFishMockkView = (CatchingFishMockkView) catchingFishSnackbarToast.CatchingFishSnackbar;
                                                                if (catchingFishMockkView != null) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    j = 0;
                                                    CatchingFishDaggerToolbar CatchingFishReduxKtor32 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor();
                                                    CatchingFishFluxExoPlayer CatchingFishReduxKtor42 = CatchingFishToastHiltBundle.CatchingFishReduxKtor(j, CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(CatchingFishReduxKtor32 != null ? CatchingFishReduxKtor32.CatchingFishWorkManager : 0L));
                                                    CatchingFishViewModelScope = catchingFishPayPalService2.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFish);
                                                    if (CatchingFishViewModelScope == null) {
                                                    }
                                                    if (CatchingFishViewModelScope == null) {
                                                    }
                                                }
                                                catchingFishSnackbarToast = null;
                                                break;
                                            case R.id.accessibilityActionSetProgress:
                                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                    Object CatchingFishViewModelScope23 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishViewModelScope);
                                                    CatchingFishSnackbarToast catchingFishSnackbarToast14 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope23 == null ? null : CatchingFishViewModelScope23);
                                                    if (catchingFishSnackbarToast14 != null && (catchingFishServiceHandler3 = (CatchingFishServiceHandler) catchingFishSnackbarToast14.CatchingFishSnackbar) != null) {
                                                        return ((Boolean) catchingFishServiceHandler3.CatchingFishFragmentHandler(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                                    }
                                                }
                                                break;
                                            case R.id.accessibilityActionImeEnter:
                                                Object CatchingFishViewModelScope24 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishOkHttp);
                                                CatchingFishSnackbarToast catchingFishSnackbarToast15 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope24 == null ? null : CatchingFishViewModelScope24);
                                                if (catchingFishSnackbarToast15 != null && (catchingFishJUnitGlide10 = (CatchingFishJUnitGlide) catchingFishSnackbarToast15.CatchingFishSnackbar) != null) {
                                                    return ((Boolean) catchingFishJUnitGlide10.CatchingFishParcelableFAB()).booleanValue();
                                                }
                                                break;
                                            default:
                                                switch (i2) {
                                                    case R.id.accessibilityActionScrollUp:
                                                    case R.id.accessibilityActionScrollLeft:
                                                    case R.id.accessibilityActionScrollDown:
                                                    case R.id.accessibilityActionScrollRight:
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case R.id.accessibilityActionPageUp:
                                                                Object CatchingFishViewModelScope25 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishDaggerHiltFAB);
                                                                CatchingFishSnackbarToast catchingFishSnackbarToast16 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope25 == null ? null : CatchingFishViewModelScope25);
                                                                if (catchingFishSnackbarToast16 != null && (catchingFishJUnitGlide11 = (CatchingFishJUnitGlide) catchingFishSnackbarToast16.CatchingFishSnackbar) != null) {
                                                                    return ((Boolean) catchingFishJUnitGlide11.CatchingFishParcelableFAB()).booleanValue();
                                                                }
                                                                break;
                                                            case R.id.accessibilityActionPageDown:
                                                                Object CatchingFishViewModelScope26 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishParcelableFlux);
                                                                CatchingFishSnackbarToast catchingFishSnackbarToast17 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope26 == null ? null : CatchingFishViewModelScope26);
                                                                if (catchingFishSnackbarToast17 != null && (catchingFishJUnitGlide12 = (CatchingFishJUnitGlide) catchingFishSnackbarToast17.CatchingFishSnackbar) != null) {
                                                                    return ((Boolean) catchingFishJUnitGlide12.CatchingFishParcelableFAB()).booleanValue();
                                                                }
                                                                break;
                                                            case R.id.accessibilityActionPageLeft:
                                                                Object CatchingFishViewModelScope27 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishSpannableWidget);
                                                                CatchingFishSnackbarToast catchingFishSnackbarToast18 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope27 == null ? null : CatchingFishViewModelScope27);
                                                                if (catchingFishSnackbarToast18 != null && (catchingFishJUnitGlide13 = (CatchingFishJUnitGlide) catchingFishSnackbarToast18.CatchingFishSnackbar) != null) {
                                                                    return ((Boolean) catchingFishJUnitGlide13.CatchingFishParcelableFAB()).booleanValue();
                                                                }
                                                                break;
                                                            case R.id.accessibilityActionPageRight:
                                                                Object CatchingFishViewModelScope28 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishGsonAppCompat);
                                                                CatchingFishSnackbarToast catchingFishSnackbarToast19 = (CatchingFishSnackbarToast) (CatchingFishViewModelScope28 == null ? null : CatchingFishViewModelScope28);
                                                                if (catchingFishSnackbarToast19 != null && (catchingFishJUnitGlide14 = (CatchingFishJUnitGlide) catchingFishSnackbarToast19.CatchingFishSnackbar) != null) {
                                                                    return ((Boolean) catchingFishJUnitGlide14.CatchingFishParcelableFAB()).booleanValue();
                                                                }
                                                                break;
                                                            default:
                                                                CatchingFishGsonAsyncTask catchingFishGsonAsyncTask = (CatchingFishGsonAsyncTask) catchingFishFABViewModel.CatchingFishNavigation.CatchingFishCoroutine(i);
                                                                if (catchingFishGsonAsyncTask != null && ((CharSequence) catchingFishGsonAsyncTask.CatchingFishCoroutine(i2)) != null) {
                                                                    Object CatchingFishViewModelScope29 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishViewStripeAPI.CatchingFishCoroutineFlow);
                                                                    List list = (List) (CatchingFishViewModelScope29 == null ? null : CatchingFishViewModelScope29);
                                                                    if (list != null && list.size() > 0) {
                                                                        list.get(0).getClass();
                                                                        throw new ClassCastException();
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                }
                                        }
                                    } else {
                                        Object CatchingFishViewModelScope30 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCloudMessaging);
                                        if (CatchingFishViewModelScope30 == null) {
                                            CatchingFishViewModelScope30 = null;
                                        }
                                        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishViewModelScope30, bool)) {
                                            ((CatchingFishExoPlayerOkHttp) catchingFishGradleCameraX.getFocusOwner()).CatchingFishSnackbar(8, false, true);
                                            return true;
                                        }
                                    }
                                }
                            }
                            z = false;
                        } else {
                            z2 = true;
                            z = false;
                            if (catchingFishFABViewModel.CatchingFishUnitTesting == i) {
                                catchingFishFABViewModel.CatchingFishUnitTesting = Integer.MIN_VALUE;
                                catchingFishGradleCameraX.invalidate();
                                CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i, 65536, null, 12);
                            }
                        }
                        return z2;
                    }
                    z2 = true;
                    z = false;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        int i15 = catchingFishFABViewModel.CatchingFishUnitTesting;
                        if (!(i15 == i)) {
                            if (i15 != Integer.MIN_VALUE) {
                                num = null;
                                CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i15, 65536, null, 12);
                            } else {
                                num = null;
                            }
                            catchingFishFABViewModel.CatchingFishUnitTesting = i;
                            catchingFishGradleCameraX.invalidate();
                            CatchingFishFABViewModel.CatchingFishPayPal(catchingFishFABViewModel, i, 32768, num, 12);
                            return z2;
                        }
                    }
                }
                return z;
            default:
                CatchingFishGlideKtor catchingFishGlideKtor = (CatchingFishGlideKtor) catchingFishAndroidX;
                Chip chip = catchingFishGlideKtor.CatchingFishLayout;
                if (i == -1) {
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    return chip.performAccessibilityAction(i2, bundle);
                }
                if (i2 == 1) {
                    return catchingFishGlideKtor.CatchingFishRoomDatabase(i);
                }
                if (i2 == 2) {
                    return catchingFishGlideKtor.CatchingFishFragmentHandler(i);
                }
                if (i2 == 64) {
                    AccessibilityManager accessibilityManager2 = catchingFishGlideKtor.CatchingFishViewModelFAB;
                    if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i7 = catchingFishGlideKtor.CatchingFishCloudMessaging) != i) {
                        if (i7 != Integer.MIN_VALUE) {
                            catchingFishGlideKtor.CatchingFishCloudMessaging = Integer.MIN_VALUE;
                            chip.invalidate();
                            catchingFishGlideKtor.CatchingFishNavigation(i7, 65536);
                        }
                        catchingFishGlideKtor.CatchingFishCloudMessaging = i;
                        chip.invalidate();
                        catchingFishGlideKtor.CatchingFishNavigation(i, 32768);
                        return true;
                    }
                } else if (i2 != 128) {
                    Chip chip2 = catchingFishGlideKtor.CatchingFishUnitTesting;
                    if (i2 == 16) {
                        if (i == 0) {
                            return chip2.performClick();
                        }
                        if (i == 1) {
                            chip2.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip2.CatchingFishCloudMessaging;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip2);
                                z4 = true;
                            }
                            if (chip2.CatchingFishDaggerHiltFAB) {
                                chip2.CatchingFishCoroutineFlow.CatchingFishNavigation(1, 1);
                            }
                        }
                    }
                } else if (catchingFishGlideKtor.CatchingFishCloudMessaging == i) {
                    catchingFishGlideKtor.CatchingFishCloudMessaging = Integer.MIN_VALUE;
                    chip.invalidate();
                    catchingFishGlideKtor.CatchingFishNavigation(i, 65536);
                    return true;
                }
                return z4;
        }
    }
}
