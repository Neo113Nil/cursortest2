package kotlin.text;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.PermissionRequest;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVPLayout implements Runnable {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVPLayout(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    private final void CatchingFishParcelableFAB() {
        long j;
        CatchingFishWidgetViewModel catchingFishWidgetViewModel = (CatchingFishWidgetViewModel) this.CatchingFishDaggerWebsocket;
        while (true) {
            long nanoTime = System.nanoTime();
            synchronized (catchingFishWidgetViewModel) {
                try {
                    Iterator it = catchingFishWidgetViewModel.CatchingFishReduxKtor.iterator();
                    CatchingFishAdMobGson catchingFishAdMobGson = null;
                    long j2 = Long.MIN_VALUE;
                    int i = 0;
                    int i2 = 0;
                    while (it.hasNext()) {
                        CatchingFishAdMobGson catchingFishAdMobGson2 = (CatchingFishAdMobGson) it.next();
                        if (catchingFishWidgetViewModel.CatchingFishSnackbar(catchingFishAdMobGson2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - catchingFishAdMobGson2.CatchingFishRoomDatabase;
                            if (j3 > j2) {
                                catchingFishAdMobGson = catchingFishAdMobGson2;
                                j2 = j3;
                            }
                        }
                    }
                    j = catchingFishWidgetViewModel.CatchingFishSnackbar;
                    if (j2 < j && i <= catchingFishWidgetViewModel.CatchingFishParcelableFAB) {
                        if (i > 0) {
                            j -= j2;
                        } else if (i2 <= 0) {
                            catchingFishWidgetViewModel.CatchingFishWorkManager = false;
                            j = -1;
                        }
                    }
                    catchingFishWidgetViewModel.CatchingFishReduxKtor.remove(catchingFishAdMobGson);
                    CatchingFishEspressoDagger.CatchingFishCoroutine(catchingFishAdMobGson.CatchingFishDaggerWebsocket);
                    j = 0;
                } finally {
                }
            }
            if (j == -1) {
                return;
            }
            if (j > 0) {
                long j4 = j / 1000000;
                long j5 = j - (1000000 * j4);
                synchronized (catchingFishWidgetViewModel) {
                    try {
                        catchingFishWidgetViewModel.wait(j4, (int) j5);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private final void CatchingFishSnackbar() {
        CatchingFishSensorManager catchingFishSensorManager = (CatchingFishSensorManager) this.CatchingFishDaggerWebsocket;
        synchronized (((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope)) {
            SharedPreferences.Editor edit = ((SharedPreferences) catchingFishSensorManager.CatchingFishReduxKtor).edit();
            String str = (String) catchingFishSensorManager.CatchingFishDaggerWebsocket;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) catchingFishSensorManager.CatchingFishViewModelScope).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) catchingFishSensorManager.CatchingFishWorkManager);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0381 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i3 = 10;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishMVVMContext catchingFishMVVMContext = 1;
                Activity activity = (Activity) this.CatchingFishDaggerWebsocket;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = CatchingFishKtorFragment.CatchingFishViewModelScope;
                Method method = CatchingFishKtorFragment.CatchingFishWorkManager;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i4 != 26 && i4 != 27) || method != null) && (CatchingFishKtorFragment.CatchingFishDaggerWebsocket != null || CatchingFishKtorFragment.CatchingFishReduxKtor != null)) {
                    try {
                        Object obj2 = CatchingFishKtorFragment.CatchingFishCoroutine.get(activity);
                        if (obj2 != null && (obj = CatchingFishKtorFragment.CatchingFishSnackbar.get(activity)) != null) {
                            Application application = activity.getApplication();
                            CatchingFishMVVMContext catchingFishMVVMContext2 = new CatchingFishMVVMContext(activity);
                            application.registerActivityLifecycleCallbacks(catchingFishMVVMContext2);
                            handler.post(new CatchingFishService(i3, catchingFishMVVMContext2, obj2, false));
                            Application application2 = (i4 == 26 || i4 == 27) ? 1 : null;
                            int i5 = 11;
                            try {
                                if (application2 != null) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application2 = application;
                                        catchingFishMVVMContext = catchingFishMVVMContext2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application2 = application;
                                        catchingFishMVVMContext = catchingFishMVVMContext2;
                                        handler.post(new CatchingFishService(i5, application2, catchingFishMVVMContext, false));
                                        throw th;
                                    }
                                } else {
                                    application2 = application;
                                    catchingFishMVVMContext = catchingFishMVVMContext2;
                                    activity.recreate();
                                }
                                handler.post(new CatchingFishService(i5, application2, catchingFishMVVMContext, false));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                CatchingFishGradleCameraX catchingFishGradleCameraX = (CatchingFishGradleCameraX) this.CatchingFishDaggerWebsocket;
                catchingFishGradleCameraX.CatchingFishPayPalHandler = false;
                MotionEvent motionEvent = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                catchingFishGradleCameraX.CatchingFishMutableLiveData(motionEvent);
                return;
            case 2:
                CatchingFishFABViewModel catchingFishFABViewModel = (CatchingFishFABViewModel) this.CatchingFishDaggerWebsocket;
                Trace.beginSection("measureAndLayout");
                try {
                    catchingFishFABViewModel.CatchingFishReduxKtor.CatchingFishJetpackCompose(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        catchingFishFABViewModel.CatchingFishOkHttp();
                        Trace.endSection();
                        catchingFishFABViewModel.CatchingFishSensorManager = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 3:
                CatchingFishFAB catchingFishFAB = (CatchingFishFAB) this.CatchingFishDaggerWebsocket;
                boolean CatchingFishViewModelFAB = catchingFishFAB.CatchingFishViewModelFAB();
                CatchingFishGradleCameraX catchingFishGradleCameraX2 = catchingFishFAB.CatchingFishReduxKtor;
                if (CatchingFishViewModelFAB) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        catchingFishGradleCameraX2.CatchingFishJetpackCompose(true);
                        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = catchingFishFAB.CatchingFishAnimationMockk;
                        int[] iArr = catchingFishLayoutGsonRoom.CatchingFishSnackbar;
                        long[] jArr = catchingFishLayoutGsonRoom.CatchingFishParcelableFAB;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((255 & j) < 128) {
                                            int i10 = iArr[(i6 << 3) + i9];
                                            if (!catchingFishFAB.CatchingFishViewModelScope().CatchingFishParcelableFAB(i10)) {
                                                i = i7;
                                                i2 = i9;
                                                catchingFishFAB.CatchingFishViewModelScope.add(new CatchingFishSharedFlowFlux(i10, catchingFishFAB.CatchingFishUnitTesting, CatchingFishXMLLayoutFlux.CatchingFishDaggerWebsocket, null));
                                                catchingFishFAB.CatchingFishCloudMessaging.CatchingFish(CatchingFishRealmContext.CatchingFishParcelableFAB);
                                                j >>= i;
                                                i9 = i2 + 1;
                                                i7 = i;
                                            }
                                        }
                                        i = i7;
                                        i2 = i9;
                                        j >>= i;
                                        i9 = i2 + 1;
                                        i7 = i;
                                    }
                                    if (i8 != i7) {
                                    }
                                }
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        catchingFishFAB.CatchingFishFragmentHandler(catchingFishGradleCameraX2.getSemanticsOwner().CatchingFishParcelableFAB(), catchingFishFAB.CatchingFishStateLiveData);
                        Trace.endSection();
                        catchingFishFAB.CatchingFishWorkManager(catchingFishFAB.CatchingFishViewModelScope());
                        catchingFishFAB.CatchingFishUnitTesting();
                        catchingFishFAB.CatchingFishRoomDatabase = false;
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    } finally {
                    }
                }
                return;
            case 4:
                CatchingFishReduxDataStore catchingFishReduxDataStore = (CatchingFishReduxDataStore) ((CatchingFishReduxDataStore) this.CatchingFishDaggerWebsocket).CatchingFishCoroutine.CatchingFishDaggerWebsocket;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = catchingFishReduxDataStore.CatchingFishSnackbar;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    CatchingFishRealmHiltHilt catchingFishRealmHiltHilt = (CatchingFishRealmHiltHilt) arrayList3.get(i11);
                    if (catchingFishRealmHiltHilt != null) {
                        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = catchingFishReduxDataStore.CatchingFishParcelableFAB;
                        Long l = (Long) catchingFishGraphQLRealmFAB.get(catchingFishRealmHiltHilt);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                catchingFishGraphQLRealmFAB.remove(catchingFishRealmHiltHilt);
                            }
                        }
                        long j2 = catchingFishRealmHiltHilt.CatchingFishWorkManager;
                        if (j2 == 0) {
                            catchingFishRealmHiltHilt.CatchingFishWorkManager = uptimeMillis;
                            catchingFishRealmHiltHilt.CatchingFishCoroutine(catchingFishRealmHiltHilt.CatchingFishSnackbar);
                        } else {
                            long j3 = uptimeMillis - j2;
                            catchingFishRealmHiltHilt.CatchingFishWorkManager = uptimeMillis;
                            float f = CatchingFishRealmHiltHilt.CatchingFishSnackbar().CatchingFishViewModelScope;
                            long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                            if (catchingFishRealmHiltHilt.CatchingFishEspressoTesting) {
                                float f2 = catchingFishRealmHiltHilt.CatchingFishCloudMessaging;
                                if (f2 != Float.MAX_VALUE) {
                                    arrayList2 = arrayList3;
                                    catchingFishRealmHiltHilt.CatchingFishFragmentHandler.CatchingFishLayout = f2;
                                    catchingFishRealmHiltHilt.CatchingFishCloudMessaging = Float.MAX_VALUE;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                catchingFishRealmHiltHilt.CatchingFishSnackbar = (float) catchingFishRealmHiltHilt.CatchingFishFragmentHandler.CatchingFishLayout;
                                catchingFishRealmHiltHilt.CatchingFishParcelableFAB = 0.0f;
                                catchingFishRealmHiltHilt.CatchingFishEspressoTesting = false;
                            } else {
                                arrayList2 = arrayList3;
                                if (catchingFishRealmHiltHilt.CatchingFishCloudMessaging != Float.MAX_VALUE) {
                                    long j5 = j4 / 2;
                                    CatchingFishReduxToolbar CatchingFishParcelableFAB = catchingFishRealmHiltHilt.CatchingFishFragmentHandler.CatchingFishParcelableFAB(catchingFishRealmHiltHilt.CatchingFishSnackbar, catchingFishRealmHiltHilt.CatchingFishParcelableFAB, j5);
                                    CatchingFishHandlerMVI catchingFishHandlerMVI = catchingFishRealmHiltHilt.CatchingFishFragmentHandler;
                                    catchingFishHandlerMVI.CatchingFishLayout = catchingFishRealmHiltHilt.CatchingFishCloudMessaging;
                                    catchingFishRealmHiltHilt.CatchingFishCloudMessaging = Float.MAX_VALUE;
                                    CatchingFishReduxToolbar CatchingFishParcelableFAB2 = catchingFishHandlerMVI.CatchingFishParcelableFAB(CatchingFishParcelableFAB.CatchingFishParcelableFAB, CatchingFishParcelableFAB.CatchingFishSnackbar, j5);
                                    catchingFishRealmHiltHilt.CatchingFishSnackbar = CatchingFishParcelableFAB2.CatchingFishParcelableFAB;
                                    catchingFishRealmHiltHilt.CatchingFishParcelableFAB = CatchingFishParcelableFAB2.CatchingFishSnackbar;
                                } else {
                                    CatchingFishReduxToolbar CatchingFishParcelableFAB3 = catchingFishRealmHiltHilt.CatchingFishFragmentHandler.CatchingFishParcelableFAB(catchingFishRealmHiltHilt.CatchingFishSnackbar, catchingFishRealmHiltHilt.CatchingFishParcelableFAB, j4);
                                    catchingFishRealmHiltHilt.CatchingFishSnackbar = CatchingFishParcelableFAB3.CatchingFishParcelableFAB;
                                    catchingFishRealmHiltHilt.CatchingFishParcelableFAB = CatchingFishParcelableFAB3.CatchingFishSnackbar;
                                }
                                float max = Math.max(catchingFishRealmHiltHilt.CatchingFishSnackbar, -3.4028235E38f);
                                catchingFishRealmHiltHilt.CatchingFishSnackbar = max;
                                catchingFishRealmHiltHilt.CatchingFishSnackbar = Math.min(max, Float.MAX_VALUE);
                                float f3 = catchingFishRealmHiltHilt.CatchingFishParcelableFAB;
                                CatchingFishHandlerMVI catchingFishHandlerMVI2 = catchingFishRealmHiltHilt.CatchingFishFragmentHandler;
                                catchingFishHandlerMVI2.getClass();
                                if (Math.abs(f3) >= catchingFishHandlerMVI2.CatchingFishDaggerWebsocket || Math.abs(r4 - ((float) catchingFishHandlerMVI2.CatchingFishLayout)) >= catchingFishHandlerMVI2.CatchingFishReduxKtor) {
                                    z = false;
                                    float min = Math.min(catchingFishRealmHiltHilt.CatchingFishSnackbar, Float.MAX_VALUE);
                                    catchingFishRealmHiltHilt.CatchingFishSnackbar = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    catchingFishRealmHiltHilt.CatchingFishSnackbar = max2;
                                    catchingFishRealmHiltHilt.CatchingFishCoroutine(max2);
                                    if (z) {
                                        continue;
                                    } else {
                                        ArrayList arrayList4 = catchingFishRealmHiltHilt.CatchingFishViewModelFAB;
                                        catchingFishRealmHiltHilt.CatchingFishDaggerWebsocket = false;
                                        CatchingFishReduxDataStore CatchingFishSnackbar = CatchingFishRealmHiltHilt.CatchingFishSnackbar();
                                        CatchingFishSnackbar.CatchingFishParcelableFAB.remove(catchingFishRealmHiltHilt);
                                        ArrayList arrayList5 = CatchingFishSnackbar.CatchingFishSnackbar;
                                        int indexOf = arrayList5.indexOf(catchingFishRealmHiltHilt);
                                        if (indexOf >= 0) {
                                            arrayList5.set(indexOf, null);
                                            CatchingFishSnackbar.CatchingFishWorkManager = true;
                                        }
                                        catchingFishRealmHiltHilt.CatchingFishWorkManager = 0L;
                                        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                            if (arrayList4.get(i12) != null) {
                                                arrayList4.get(i12).getClass();
                                                throw new ClassCastException();
                                            }
                                        }
                                        for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                            if (arrayList4.get(size) == null) {
                                                arrayList4.remove(size);
                                            }
                                        }
                                    }
                                    i11++;
                                    arrayList3 = arrayList2;
                                } else {
                                    catchingFishRealmHiltHilt.CatchingFishSnackbar = (float) catchingFishRealmHiltHilt.CatchingFishFragmentHandler.CatchingFishLayout;
                                    catchingFishRealmHiltHilt.CatchingFishParcelableFAB = 0.0f;
                                }
                            }
                            z = true;
                            float min2 = Math.min(catchingFishRealmHiltHilt.CatchingFishSnackbar, Float.MAX_VALUE);
                            catchingFishRealmHiltHilt.CatchingFishSnackbar = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            catchingFishRealmHiltHilt.CatchingFishSnackbar = max22;
                            catchingFishRealmHiltHilt.CatchingFishCoroutine(max22);
                            if (z) {
                            }
                            i11++;
                            arrayList3 = arrayList2;
                        }
                    }
                    arrayList2 = arrayList3;
                    i11++;
                    arrayList3 = arrayList2;
                }
                ArrayList arrayList6 = arrayList3;
                if (catchingFishReduxDataStore.CatchingFishWorkManager) {
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        ArrayList arrayList7 = arrayList6;
                        if (arrayList7.get(size2) == null) {
                            arrayList7.remove(size2);
                        }
                        size2--;
                        arrayList6 = arrayList7;
                    }
                    arrayList = arrayList6;
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        CatchingFishBundleGlide catchingFishBundleGlide = catchingFishReduxDataStore.CatchingFishViewModelFAB;
                        ValueAnimator.unregisterDurationScaleChangeListener((CatchingFishAnimationMoshi) catchingFishBundleGlide.CatchingFishDaggerWebsocket);
                        catchingFishBundleGlide.CatchingFishDaggerWebsocket = null;
                    }
                    catchingFishReduxDataStore.CatchingFishWorkManager = false;
                } else {
                    arrayList = arrayList6;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) catchingFishReduxDataStore.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket).postFrameCallback(new CatchingFishMotionLayoutFAB(catchingFishReduxDataStore.CatchingFishReduxKtor));
                    return;
                }
                return;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                PermissionRequest permissionRequest = (PermissionRequest) this.CatchingFishDaggerWebsocket;
                permissionRequest.grant(permissionRequest.getResources());
                return;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                ((CarouselLayoutManager) this.CatchingFishDaggerWebsocket).CatchingFishRetrofit();
                return;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                ((CatchingFishServiceCardView) this.CatchingFishDaggerWebsocket).CatchingFishJetpackCompose(true);
                return;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishAndroidXRoom catchingFishAndroidXRoom = (CatchingFishAndroidXRoom) this.CatchingFishDaggerWebsocket;
                Runnable runnable = catchingFishAndroidXRoom.CatchingFishDaggerWebsocket;
                if (runnable != null) {
                    runnable.run();
                    catchingFishAndroidXRoom.CatchingFishDaggerWebsocket = null;
                    return;
                }
                return;
            case 9:
                CatchingFishMVPFABView.CatchingFishSnackbar((CatchingFishMVPFABView) this.CatchingFishDaggerWebsocket);
                return;
            case 10:
                CatchingFishJUnitBundle catchingFishJUnitBundle = (CatchingFishJUnitBundle) this.CatchingFishDaggerWebsocket;
                boolean isPopupShowing = catchingFishJUnitBundle.CatchingFishViewModelFAB.isPopupShowing();
                catchingFishJUnitBundle.CatchingFishJetpackCompose(isPopupShowing);
                catchingFishJUnitBundle.CatchingFishOkHttp = isPopupShowing;
                return;
            case 11:
                CatchingFishIntentLiveData catchingFishIntentLiveData = (CatchingFishIntentLiveData) this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishIntentLiveData.CatchingFishReduxKtor) {
                    try {
                        if (catchingFishIntentLiveData.CatchingFishViewModelFAB == null) {
                            return;
                        }
                        try {
                            CatchingFishRetrofitHiltFAB CatchingFishCoroutine = catchingFishIntentLiveData.CatchingFishCoroutine();
                            int i13 = CatchingFishCoroutine.CatchingFishWorkManager;
                            if (i13 == 2) {
                                synchronized (catchingFishIntentLiveData.CatchingFishReduxKtor) {
                                }
                            }
                            if (i13 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i13 + ")");
                            }
                            try {
                                int i14 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                CatchingFishWidgetContext catchingFishWidgetContext = catchingFishIntentLiveData.CatchingFishCoroutine;
                                Context context = catchingFishIntentLiveData.CatchingFishParcelableFAB;
                                catchingFishWidgetContext.getClass();
                                CatchingFishRetrofitHiltFAB[] catchingFishRetrofitHiltFABArr = {CatchingFishCoroutine};
                                CatchingFishDaggerBiometric catchingFishDaggerBiometric = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB;
                                CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface CatchingFishFragmentHandler = CatchingFishGraphQLAdMob.CatchingFishParcelableFAB.CatchingFishFragmentHandler(context, catchingFishRetrofitHiltFABArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer CatchingFishJetpackCompose = CatchingFishKtorViewModel.CatchingFishJetpackCompose(CatchingFishCoroutine.CatchingFishParcelableFAB, catchingFishIntentLiveData.CatchingFishParcelableFAB);
                                    if (CatchingFishJetpackCompose == null || CatchingFishFragmentHandler == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle(CatchingFishFragmentHandler, CatchingFishKtorViewModel.CatchingFishParcelableFlux(CatchingFishJetpackCompose));
                                        Trace.endSection();
                                        synchronized (catchingFishIntentLiveData.CatchingFishReduxKtor) {
                                            try {
                                                CatchingFishBiometricBundle catchingFishBiometricBundle = catchingFishIntentLiveData.CatchingFishViewModelFAB;
                                                if (catchingFishBiometricBundle != null) {
                                                    catchingFishBiometricBundle.CatchingFishCardViewRealm(catchingFishFluxFluxBundle);
                                                }
                                            } finally {
                                            }
                                        }
                                        catchingFishIntentLiveData.CatchingFishSnackbar();
                                        return;
                                    } finally {
                                        int i15 = CatchingFishCoroutineMVP.CatchingFishParcelableFAB;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th4) {
                            synchronized (catchingFishIntentLiveData.CatchingFishReduxKtor) {
                                try {
                                    CatchingFishBiometricBundle catchingFishBiometricBundle2 = catchingFishIntentLiveData.CatchingFishViewModelFAB;
                                    if (catchingFishBiometricBundle2 != null) {
                                        catchingFishBiometricBundle2.CatchingFishGsonAppCompat(th4);
                                    }
                                    catchingFishIntentLiveData.CatchingFishSnackbar();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 12:
                ((MainActivity) this.CatchingFishDaggerWebsocket).CatchingFishEspressoMockk.CatchingFishParcelableFAB("android.permission.POST_NOTIFICATIONS");
                return;
            case 13:
                MaterialButton.CatchingFishParcelableFAB((MaterialButton) this.CatchingFishDaggerWebsocket);
                return;
            case 14:
                CatchingFishReduxCardView catchingFishReduxCardView = (CatchingFishReduxCardView) this.CatchingFishDaggerWebsocket;
                CatchingFishToolbarToast catchingFishToolbarToast = catchingFishReduxCardView.CatchingFishLayout;
                if (catchingFishReduxCardView.CatchingFishDaggerWebsocket == 0) {
                    catchingFishReduxCardView.CatchingFishWorkManager = true;
                    catchingFishToolbarToast.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_PAUSE);
                }
                if (catchingFishReduxCardView.CatchingFishReduxKtor == 0 && catchingFishReduxCardView.CatchingFishWorkManager) {
                    catchingFishToolbarToast.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_STOP);
                    catchingFishReduxCardView.CatchingFishViewModelScope = true;
                    return;
                }
                return;
            case 15:
                ((CatchingFishContextRoom) this.CatchingFishDaggerWebsocket).CatchingFishOkHttp();
                return;
            case 16:
                CatchingFishParcelableFAB();
                return;
            case 17:
                CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = (CatchingFishWidgetMVVMAdMob) this.CatchingFishDaggerWebsocket;
                do {
                    try {
                    } catch (IOException e) {
                        catchingFishWidgetMVVMAdMob.CatchingFishCoroutine(e);
                        return;
                    }
                } while (catchingFishWidgetMVVMAdMob.CatchingFishWorkManager());
                return;
            case 18:
                CatchingFishKtorFlux catchingFishKtorFlux = (CatchingFishKtorFlux) this.CatchingFishDaggerWebsocket;
                if (((Boolean) catchingFishKtorFlux.CatchingFishReduxKtor.CatchingFishParcelableFAB()).booleanValue()) {
                    return;
                }
                catchingFishKtorFlux.CatchingFishParcelableFAB();
                return;
            case 19:
                CatchingFishSnackbar();
                return;
            case 20:
                CatchingFishFluxGraphQL catchingFishFluxGraphQL = (CatchingFishFluxGraphQL) this.CatchingFishDaggerWebsocket;
                catchingFishFluxGraphQL.CatchingFishCoroutine = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) catchingFishFluxGraphQL.CatchingFishDaggerWebsocket;
                CatchingFishCameraXHandler catchingFishCameraXHandler = sideSheetBehavior.CatchingFishLayout;
                if (catchingFishCameraXHandler != null && catchingFishCameraXHandler.CatchingFishWorkManager()) {
                    catchingFishFluxGraphQL.CatchingFishParcelableFAB(catchingFishFluxGraphQL.CatchingFishSnackbar);
                    return;
                } else {
                    if (sideSheetBehavior.CatchingFishViewModelFAB == 2) {
                        sideSheetBehavior.CatchingFishNavigation(catchingFishFluxGraphQL.CatchingFishSnackbar);
                        return;
                    }
                    return;
                }
            case 21:
                ((TextInputLayout) this.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB.requestLayout();
                return;
            case 22:
                View view = (View) this.CatchingFishDaggerWebsocket;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 23:
                CatchingFishBundleKtorFlux catchingFishBundleKtorFlux = (CatchingFishBundleKtorFlux) this.CatchingFishDaggerWebsocket;
                catchingFishBundleKtorFlux.CatchingFishParcelableFAB.getAction();
                catchingFishBundleKtorFlux.CatchingFishSnackbar.CatchingFishCoroutine(null);
                return;
            default:
                CatchingFishMVIAppCompat catchingFishMVIAppCompat = (CatchingFishMVIAppCompat) this.CatchingFishDaggerWebsocket;
                ((CatchingFishMVIView) catchingFishMVIAppCompat.CatchingFishReduxKtor).CatchingFishEspressoTesting(new CatchingFishLayoutCoroutine(13, catchingFishMVIAppCompat));
                return;
        }
    }
}
