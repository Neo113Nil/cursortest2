package kotlin.text;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewParent;
import com.catchingfish.fishcatcherpro.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CatchingFishLayoutRoom {
    public static final long CatchingFish(double d) {
        return CatchingFishCardViewRealm(4294967296L, (float) d);
    }

    public static final CatchingFishNavigationRedux CatchingFishAnimationMockk(CatchingFishManifestMockk catchingFishManifestMockk) {
        CatchingFishNavigationRedux catchingFishNavigationRedux = (CatchingFishNavigationRedux) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishLayout);
        if (catchingFishNavigationRedux != null) {
            return catchingFishNavigationRedux;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final long CatchingFishCardViewRealm(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        CatchingFishBundleBiometric[] catchingFishBundleBiometricArr = CatchingFishCameraXFlux.CatchingFishSnackbar;
        return floatToRawIntBits;
    }

    public static final void CatchingFishCardViewView(CatchingFishPayPalService catchingFishPayPalService, Object obj) {
        boolean z;
        long[] jArr = catchingFishPayPalService.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = catchingFishPayPalService.CatchingFishSnackbar[i4];
                        Object obj3 = catchingFishPayPalService.CatchingFishCoroutine[i4];
                        if (obj3 instanceof CatchingFishServiceBundle) {
                            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) obj3;
                            catchingFishServiceBundle.CatchingFishCloudMessaging(obj);
                            z = catchingFishServiceBundle.CatchingFishViewModelScope();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            catchingFishPayPalService.CatchingFishEspressoTesting(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void CatchingFishCloudMessaging(CatchingFishGlideRoom catchingFishGlideRoom, CatchingFishPayPalViewModel catchingFishPayPalViewModel) {
        int size = catchingFishPayPalViewModel.CatchingFishOkHttp.size();
        for (int i = 0; i < size; i++) {
            CatchingFishMockkGradle catchingFishMockkGradle = (CatchingFishMockkGradle) catchingFishPayPalViewModel.CatchingFishOkHttp.get(i);
            if (catchingFishMockkGradle instanceof CatchingFishCustomViewMockk) {
                CatchingFishHandlerEspresso catchingFishHandlerEspresso = new CatchingFishHandlerEspresso();
                CatchingFishCustomViewMockk catchingFishCustomViewMockk = (CatchingFishCustomViewMockk) catchingFishMockkGradle;
                catchingFishHandlerEspresso.CatchingFishReduxKtor = catchingFishCustomViewMockk.CatchingFishDaggerWebsocket;
                catchingFishHandlerEspresso.CatchingFishUnitTesting = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFish.CatchingFishParcelableFAB.setFillType(catchingFishCustomViewMockk.CatchingFishWorkManager == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishSnackbar = catchingFishCustomViewMockk.CatchingFishViewModelScope;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishCoroutine = catchingFishCustomViewMockk.CatchingFishViewModelFAB;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishViewModelScope = catchingFishCustomViewMockk.CatchingFishLayout;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishDaggerWebsocket = catchingFishCustomViewMockk.CatchingFishFragmentHandler;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishWorkManager = catchingFishCustomViewMockk.CatchingFishCloudMessaging;
                catchingFishHandlerEspresso.CatchingFishAnimationMockk = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishViewModelFAB = catchingFishCustomViewMockk.CatchingFishEspressoTesting;
                catchingFishHandlerEspresso.CatchingFishAnimationMockk = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishLayout = catchingFishCustomViewMockk.CatchingFishOkHttp;
                catchingFishHandlerEspresso.CatchingFishAnimationMockk = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishFragmentHandler = catchingFishCustomViewMockk.CatchingFishUnitTesting;
                catchingFishHandlerEspresso.CatchingFishAnimationMockk = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishCloudMessaging = catchingFishCustomViewMockk.CatchingFishAnimationMockk;
                catchingFishHandlerEspresso.CatchingFishStateLiveData = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishEspressoTesting = catchingFishCustomViewMockk.CatchingFishStateLiveData;
                catchingFishHandlerEspresso.CatchingFishStateLiveData = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishHandlerEspresso.CatchingFishOkHttp = catchingFishCustomViewMockk.CatchingFishRoomDatabase;
                catchingFishHandlerEspresso.CatchingFishStateLiveData = true;
                catchingFishHandlerEspresso.CatchingFishCoroutine();
                catchingFishGlideRoom.CatchingFishDaggerWebsocket(i, catchingFishHandlerEspresso);
            } else if (catchingFishMockkGradle instanceof CatchingFishPayPalViewModel) {
                CatchingFishGlideRoom catchingFishGlideRoom2 = new CatchingFishGlideRoom();
                CatchingFishPayPalViewModel catchingFishPayPalViewModel2 = (CatchingFishPayPalViewModel) catchingFishMockkGradle;
                catchingFishGlideRoom2.CatchingFishCloudMessaging = catchingFishPayPalViewModel2.CatchingFishReduxKtor;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishEspressoTesting = catchingFishPayPalViewModel2.CatchingFishDaggerWebsocket;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishAnimationMockk = catchingFishPayPalViewModel2.CatchingFishViewModelFAB;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishStateLiveData = catchingFishPayPalViewModel2.CatchingFishLayout;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishRoomDatabase = catchingFishPayPalViewModel2.CatchingFishFragmentHandler;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishNavigation = catchingFishPayPalViewModel2.CatchingFishCloudMessaging;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishOkHttp = catchingFishPayPalViewModel2.CatchingFishWorkManager;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishUnitTesting = catchingFishPayPalViewModel2.CatchingFishViewModelScope;
                catchingFishGlideRoom2.CatchingFish = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                catchingFishGlideRoom2.CatchingFishWorkManager = catchingFishPayPalViewModel2.CatchingFishEspressoTesting;
                catchingFishGlideRoom2.CatchingFishViewModelScope = true;
                catchingFishGlideRoom2.CatchingFishCoroutine();
                CatchingFishCloudMessaging(catchingFishGlideRoom2, catchingFishPayPalViewModel2);
                catchingFishGlideRoom.CatchingFishDaggerWebsocket(i, catchingFishGlideRoom2);
            }
        }
    }

    public static final boolean CatchingFishCoroutine(long j) {
        return !CatchingFishFirebaseDagger.CatchingFishCardViewView(j, 9223372034707292159L);
    }

    public static int CatchingFishCoroutineFlow(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static final void CatchingFishCustomView(CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB, int i, Object obj) {
        catchingFishSpannableMVIFAB.CatchingFishDaggerWebsocket[(catchingFishSpannableMVIFAB.CatchingFishWorkManager - catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[catchingFishSpannableMVIFAB.CatchingFishSnackbar - 1].CatchingFishSnackbar) + i] = obj;
    }

    public static final int CatchingFishDaggerHiltFAB(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] CatchingFishDaggerWebsocket(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, objArr2, 0, i, 6);
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final CatchingFishFABToast CatchingFishEspressoTesting() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = CatchingFishGlideJUnit.CatchingFishSnackbar;
        CatchingFishFABToast catchingFishFABToast = (CatchingFishFABToast) catchingFishAsyncTaskDagger.get();
        if (catchingFishFABToast != null) {
            return catchingFishFABToast;
        }
        CatchingFishFABToast catchingFishFABToast2 = new CatchingFishFABToast(new CatchingFishDaggerMVP[0]);
        catchingFishAsyncTaskDagger.CatchingFishStripeAPI(catchingFishFABToast2);
        return catchingFishFABToast2;
    }

    public static final void CatchingFishFragmentFactory(CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB, int i, Object obj, int i2, Object obj2) {
        int i3 = catchingFishSpannableMVIFAB.CatchingFishWorkManager - catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[catchingFishSpannableMVIFAB.CatchingFishSnackbar - 1].CatchingFishSnackbar;
        Object[] objArr = catchingFishSpannableMVIFAB.CatchingFishDaggerWebsocket;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static CatchingFishPayPalService CatchingFishFragmentHandler() {
        long[] jArr = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        return new CatchingFishPayPalService();
    }

    public static CatchingFishAsyncTaskIntent CatchingFishGsonAppCompat(Object obj) {
        return new CatchingFishAsyncTaskIntent(obj, CatchingFishGradleMVVM.CatchingFishJetpackCompose);
    }

    public static final long CatchingFishJetpackCompose(int i) {
        return CatchingFishCardViewRealm(4294967296L, i);
    }

    public static int CatchingFishLayout(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, CatchingFishJUnitFlux.CatchingFishSnackbar(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int CatchingFishMVPRobolectric(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static final Object CatchingFishMutableLiveData(CatchingFishLifecycleGlide catchingFishLifecycleGlide, CatchingFishLifecycleGlide catchingFishLifecycleGlide2, CatchingFishMockkView catchingFishMockkView) {
        Object catchingFishStripeAPIMVI;
        Object CatchingFishParcelable;
        try {
            CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(2, catchingFishMockkView);
            catchingFishStripeAPIMVI = catchingFishMockkView.CatchingFishDaggerWebsocket(catchingFishLifecycleGlide2, catchingFishLifecycleGlide);
        } catch (Throwable th) {
            catchingFishStripeAPIMVI = new CatchingFishStripeAPIMVI(th, false);
        }
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (catchingFishStripeAPIMVI == catchingFishXMLLayoutMockk || (CatchingFishParcelable = catchingFishLifecycleGlide.CatchingFishParcelable(catchingFishStripeAPIMVI)) == CatchingFishXMLLayoutGlide.CatchingFishWorkManager) {
            return catchingFishXMLLayoutMockk;
        }
        if (CatchingFishParcelable instanceof CatchingFishStripeAPIMVI) {
            throw ((CatchingFishStripeAPIMVI) CatchingFishParcelable).CatchingFishParcelableFAB;
        }
        return CatchingFishXMLLayoutGlide.CatchingFishPayPalLiveData(CatchingFishParcelable);
    }

    public static final CatchingFishJUnitXMLLayout CatchingFishNavigation(CatchingFishJUnitXMLLayout catchingFishJUnitXMLLayout) {
        CatchingFishBiometricRoom catchingFishBiometricRoom = catchingFishJUnitXMLLayout.CatchingFishRoomDatabase.CatchingFishRoomDatabase;
        while (true) {
            CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            CatchingFishBiometricRoom catchingFishBiometricRoom2 = null;
            if ((CatchingFishRoomDatabase != null ? CatchingFishRoomDatabase.CatchingFishFragmentHandler : null) == null) {
                CatchingFishJUnitXMLLayout CatchingFishWebSocketMockk = ((CatchingFishDaggerToolbar) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishViewModelFAB).CatchingFishWebSocketMockk();
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishWebSocketMockk);
                return CatchingFishWebSocketMockk;
            }
            CatchingFishBiometricRoom CatchingFishRoomDatabase2 = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            if (CatchingFishRoomDatabase2 != null) {
                catchingFishBiometricRoom2 = CatchingFishRoomDatabase2.CatchingFishFragmentHandler;
            }
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishBiometricRoom2);
            CatchingFishBiometricRoom CatchingFishRoomDatabase3 = catchingFishBiometricRoom.CatchingFishRoomDatabase();
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(CatchingFishRoomDatabase3);
            catchingFishBiometricRoom = CatchingFishRoomDatabase3.CatchingFishFragmentHandler;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishBiometricRoom);
        }
    }

    public static boolean CatchingFishOkHttp(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int CatchingFishParcelableFAB(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    public static final boolean CatchingFishParcelableFlux(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final boolean CatchingFishPayPal(CatchingFishPayPalService catchingFishPayPalService, Object obj, Object obj2) {
        Object CatchingFishViewModelScope = catchingFishPayPalService.CatchingFishViewModelScope(obj);
        if (CatchingFishViewModelScope == null) {
            return false;
        }
        if (!(CatchingFishViewModelScope instanceof CatchingFishServiceBundle)) {
            if (!CatchingFishViewModelScope.equals(obj2)) {
                return false;
            }
            catchingFishPayPalService.CatchingFishCloudMessaging(obj);
            return true;
        }
        CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) CatchingFishViewModelScope;
        boolean CatchingFishCloudMessaging = catchingFishServiceBundle.CatchingFishCloudMessaging(obj2);
        if (CatchingFishCloudMessaging && catchingFishServiceBundle.CatchingFishViewModelScope()) {
            catchingFishPayPalService.CatchingFishCloudMessaging(obj);
        }
        return CatchingFishCloudMessaging;
    }

    public static final float CatchingFishReduxKtor(CatchingFishEspressoViewFAB catchingFishEspressoViewFAB, boolean z, CatchingFishFABAndroidX[] catchingFishFABAndroidXArr, float f) {
        float f2 = Float.NaN;
        for (CatchingFishFABAndroidX catchingFishFABAndroidX : catchingFishFABAndroidXArr) {
            float CatchingFishSnackbar = catchingFishEspressoViewFAB.CatchingFishSnackbar(catchingFishFABAndroidX);
            if (!Float.isNaN(f2)) {
                int i = z != (CatchingFishSnackbar > f2) ? i + 1 : 0;
            }
            f2 = CatchingFishSnackbar;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static SharedPreferences CatchingFishRoomDatabase(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final Object[] CatchingFishSnackbar(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, objArr2, 0, i, 6);
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean CatchingFishSpannableWidget(float f, float f2, CatchingFishMoshiRealm catchingFishMoshiRealm) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        Path path = new Path();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            CatchingFishMVVMStripeAPI.CatchingFishParcelableFAB("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = new RectF();
        rectF.set(f3, f4, f5, f6);
        path.addRect(rectF, Path.Direction.CCW);
        Path path2 = new Path();
        Path.Op op = Path.Op.INTERSECT;
        if (!(catchingFishMoshiRealm instanceof CatchingFishMoshiRealm)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.op(catchingFishMoshiRealm.CatchingFishParcelableFAB, path, op);
        boolean isEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !isEmpty;
    }

    public static final ViewParent CatchingFishStateLiveData(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final float CatchingFishUnitTesting(CatchingFishManifestMockk catchingFishManifestMockk) {
        float f;
        CatchingFishNavigationRoom catchingFishNavigationRoom = (CatchingFishNavigationRoom) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishGradleMVVM.CatchingFishNavigation);
        if (catchingFishNavigationRoom != null) {
            CatchingFishRoomPayPal catchingFishRoomPayPal = catchingFishNavigationRoom.CatchingFishReduxKtor;
            f = ((CatchingFishStateFlowMoshi) CatchingFishIntentBundle.CatchingFishJetpackCompose(catchingFishRoomPayPal.CatchingFishDaggerWebsocket, catchingFishRoomPayPal)).CatchingFishCoroutine;
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            return f;
        }
        CatchingFishAsyncTaskKtor.CatchingFishSnackbar("negative scale factor");
        return f;
    }

    public static void CatchingFishViewModelFAB(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void CatchingFishViewModelScope(CatchingFishPayPalService catchingFishPayPalService, Object obj, Object obj2) {
        int CatchingFishWorkManager = catchingFishPayPalService.CatchingFishWorkManager(obj);
        boolean z = CatchingFishWorkManager < 0;
        Object obj3 = z ? null : catchingFishPayPalService.CatchingFishCoroutine[CatchingFishWorkManager];
        if (obj3 != null) {
            if (obj3 instanceof CatchingFishServiceBundle) {
                ((CatchingFishServiceBundle) obj3).CatchingFishParcelableFAB(obj2);
            } else if (obj3 != obj2) {
                CatchingFishServiceBundle catchingFishServiceBundle = new CatchingFishServiceBundle();
                catchingFishServiceBundle.CatchingFishParcelableFAB(obj3);
                catchingFishServiceBundle.CatchingFishParcelableFAB(obj2);
                obj2 = catchingFishServiceBundle;
            }
            obj2 = obj3;
        }
        if (!z) {
            catchingFishPayPalService.CatchingFishCoroutine[CatchingFishWorkManager] = obj2;
            return;
        }
        int i = ~CatchingFishWorkManager;
        catchingFishPayPalService.CatchingFishSnackbar[i] = obj;
        catchingFishPayPalService.CatchingFishCoroutine[i] = obj2;
    }

    public static final Object[] CatchingFishWorkManager(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, objArr2, 0, i, 6);
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
