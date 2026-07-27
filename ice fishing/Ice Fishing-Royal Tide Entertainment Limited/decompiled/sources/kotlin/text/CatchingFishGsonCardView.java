package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class CatchingFishGsonCardView {
    public static boolean CatchingFish;
    public static int CatchingFishJetpackCompose;
    public static Context CatchingFishParcelableFAB;
    public static Boolean CatchingFishSnackbar;
    public static final int[] CatchingFishCoroutine = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] CatchingFishReduxKtor = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] CatchingFishDaggerWebsocket = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] CatchingFishWorkManager = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] CatchingFishViewModelScope = {R.attr.drawable};
    public static final int[] CatchingFishViewModelFAB = {R.attr.name, R.attr.animation};
    public static final Object[] CatchingFishLayout = new Object[0];
    public static final CatchingFishFluxWorkManager CatchingFishFragmentHandler = new CatchingFishFluxWorkManager("UNDEFINED", 1);
    public static final CatchingFishFluxWorkManager CatchingFishCloudMessaging = new CatchingFishFluxWorkManager("REUSABLE_CLAIMED", 1);
    public static final CatchingFishWidgetContext CatchingFishEspressoTesting = new CatchingFishWidgetContext();
    public static final int[] CatchingFishOkHttp = {R.attr.theme, com.catchingfish.fishcatcherpro.R.attr.theme};
    public static final int[] CatchingFishUnitTesting = {com.catchingfish.fishcatcherpro.R.attr.materialThemeOverlay};
    public static final StackTraceElement[] CatchingFishAnimationMockk = new StackTraceElement[0];
    public static final int[] CatchingFishStateLiveData = {R.attr.state_enabled, R.attr.state_pressed};
    public static final Object CatchingFishRoomDatabase = new Object();
    public static final Object CatchingFishNavigation = new Object();

    public static final Integer CatchingFish(CatchingFishAnimationMVP catchingFishAnimationMVP, CatchingFishMVIWebSocket catchingFishMVIWebSocket, int i, int i2) {
        Integer CatchingFish2;
        int[] iArr = catchingFishAnimationMVP.CatchingFishSnackbar;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (catchingFishAnimationMVP.CatchingFishFragmentHandler(i) && catchingFishAnimationMVP.CatchingFishLayout(i) == 206 && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishAnimationMVP.CatchingFishStateLiveData(iArr, i), CatchingFishUnitTestingFlux.CatchingFishDaggerWebsocket)) {
                Object CatchingFishViewModelFAB2 = catchingFishAnimationMVP.CatchingFishViewModelFAB(i, 0);
                CatchingFishLayoutGradleMVP catchingFishLayoutGradleMVP = CatchingFishViewModelFAB2 instanceof CatchingFishLayoutGradleMVP ? (CatchingFishLayoutGradleMVP) CatchingFishViewModelFAB2 : null;
                if (catchingFishLayoutGradleMVP != null && catchingFishLayoutGradleMVP.CatchingFishReduxKtor.equals(catchingFishMVIWebSocket)) {
                    return Integer.valueOf(i);
                }
            }
            if (catchingFishAnimationMVP.CatchingFishReduxKtor(i) && (CatchingFish2 = CatchingFish(catchingFishAnimationMVP, catchingFishMVIWebSocket, i + 1, i3)) != null) {
                return Integer.valueOf(CatchingFish2.intValue());
            }
            i = i3;
        }
    }

    public static boolean CatchingFishAnimationMockk(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = CatchingFishAnimationMockk(file2) && z;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.text.CatchingFishFABHandler, kotlin.text.CatchingFishManifestKtor] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList CatchingFishCameraXIntent(CatchingFishAnimationMVP catchingFishAnimationMVP, int i, Integer num) {
        ?? catchingFishFABHandler = new CatchingFishFABHandler(catchingFishAnimationMVP);
        int CatchingFishRoomDatabase2 = catchingFishAnimationMVP.CatchingFishRoomDatabase(i);
        CatchingFishMockkPicasso CatchingFishParcelableFAB2 = catchingFishAnimationMVP.CatchingFishParcelableFAB(i);
        while (i >= 0) {
            catchingFishFABHandler.CatchingFishReduxKtor(catchingFishAnimationMVP.CatchingFishParcelableFAB.CatchingFishViewModelScope(i), num);
            if (CatchingFishRoomDatabase2 >= 0) {
                CatchingFishMockkPicasso catchingFishMockkPicasso = CatchingFishParcelableFAB2;
                CatchingFishParcelableFAB2 = catchingFishAnimationMVP.CatchingFishParcelableFAB(CatchingFishRoomDatabase2);
                i = CatchingFishRoomDatabase2;
                CatchingFishRoomDatabase2 = catchingFishAnimationMVP.CatchingFishRoomDatabase(CatchingFishRoomDatabase2);
                num = catchingFishMockkPicasso;
            } else {
                i = CatchingFishRoomDatabase2;
                num = CatchingFishParcelableFAB2;
            }
        }
        return (ArrayList) catchingFishFABHandler.CatchingFishParcelableFAB;
    }

    public static final String CatchingFishCardViewRealm(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, Resources resources) {
        int ordinal;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        Object CatchingFishViewModelScope2 = catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishSnackbar);
        String str = null;
        if (CatchingFishViewModelScope2 == null) {
            CatchingFishViewModelScope2 = null;
        }
        CatchingFishPayPalService catchingFishPayPalService = catchingFishMVPMotionLayout2.CatchingFishReduxKtor;
        Object CatchingFishViewModelScope3 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCustomView);
        if (CatchingFishViewModelScope3 == null) {
            CatchingFishViewModelScope3 = null;
        }
        CatchingFishBundleEspresso catchingFishBundleEspresso = (CatchingFishBundleEspresso) CatchingFishViewModelScope3;
        Object CatchingFishViewModelScope4 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutineFlow);
        if (CatchingFishViewModelScope4 == null) {
            CatchingFishViewModelScope4 = null;
        }
        if (catchingFishBundleEspresso != null && (ordinal = catchingFishBundleEspresso.ordinal()) != 0 && ordinal != 1) {
            if (ordinal != 2) {
                throw new CatchingFishBiometricView();
            }
            if (CatchingFishViewModelScope2 == null) {
                CatchingFishViewModelScope2 = resources.getString(com.catchingfish.fishcatcherpro.R.string.indeterminate);
            }
        }
        Object CatchingFishViewModelScope5 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishMVPRobolectric);
        if (CatchingFishViewModelScope5 == null) {
            CatchingFishViewModelScope5 = null;
        }
        Boolean bool = (Boolean) CatchingFishViewModelScope5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (CatchingFishViewModelScope2 == null) {
                CatchingFishViewModelScope2 = booleanValue ? resources.getString(com.catchingfish.fishcatcherpro.R.string.selected) : resources.getString(com.catchingfish.fishcatcherpro.R.string.not_selected);
            }
        }
        Object CatchingFishViewModelScope6 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutine);
        if (CatchingFishViewModelScope6 == null) {
            CatchingFishViewModelScope6 = null;
        }
        CatchingFishMVVMCustomView catchingFishMVVMCustomView = (CatchingFishMVVMCustomView) CatchingFishViewModelScope6;
        if (catchingFishMVVMCustomView != null) {
            if (catchingFishMVVMCustomView != CatchingFishMVVMCustomView.CatchingFishCoroutine) {
                if (CatchingFishViewModelScope2 == null) {
                    CatchingFishManifestIntent catchingFishManifestIntent = catchingFishMVVMCustomView.CatchingFishSnackbar;
                    float f = catchingFishManifestIntent.CatchingFishSnackbar;
                    float f2 = catchingFishManifestIntent.CatchingFishParcelableFAB;
                    float f3 = f - f2 == 0.0f ? 0.0f : (catchingFishMVVMCustomView.CatchingFishParcelableFAB - f2) / (f - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    CatchingFishViewModelScope2 = resources.getString(com.catchingfish.fishcatcherpro.R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : CatchingFishOkHttpFAB.CatchingFishLayout(Math.round(f3 * 100), 1, 99)));
                }
            } else if (CatchingFishViewModelScope2 == null) {
                CatchingFishViewModelScope2 = resources.getString(com.catchingfish.fishcatcherpro.R.string.in_progress);
            }
        }
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishPayPal;
        if (catchingFishPayPalService.CatchingFishCoroutine(catchingFishGraphQLLayout)) {
            CatchingFishPayPalService catchingFishPayPalService2 = new CatchingFishMVIGraphQLHilt(catchingFishMVIGraphQLHilt.CatchingFishParcelableFAB, true, catchingFishMVIGraphQLHilt.CatchingFishCoroutine, catchingFishMVPMotionLayout2).CatchingFishCloudMessaging().CatchingFishReduxKtor;
            Object CatchingFishViewModelScope7 = catchingFishPayPalService2.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishParcelableFAB);
            if (CatchingFishViewModelScope7 == null) {
                CatchingFishViewModelScope7 = null;
            }
            Collection collection = (Collection) CatchingFishViewModelScope7;
            if (collection == null || collection.isEmpty()) {
                Object CatchingFishViewModelScope8 = catchingFishPayPalService2.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishParcelableFlux);
                if (CatchingFishViewModelScope8 == null) {
                    CatchingFishViewModelScope8 = null;
                }
                Collection collection2 = (Collection) CatchingFishViewModelScope8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object CatchingFishViewModelScope9 = catchingFishPayPalService2.CatchingFishViewModelScope(catchingFishGraphQLLayout);
                    if (CatchingFishViewModelScope9 == null) {
                        CatchingFishViewModelScope9 = null;
                    }
                    CharSequence charSequence = (CharSequence) CatchingFishViewModelScope9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.catchingfish.fishcatcherpro.R.string.state_empty);
                    }
                }
            }
            CatchingFishViewModelScope2 = str;
        }
        return (String) CatchingFishViewModelScope2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CatchingFishCardViewView(CatchingFishFABWorkManager catchingFishFABWorkManager) {
        if (((CatchingFishFABStripeAPIFAB) catchingFishFABWorkManager).CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishXMLLayoutGlide.CatchingFishMutableLiveData(catchingFishFABWorkManager, 1).CatchingFishMVPHandler();
        }
    }

    public static int CatchingFishCloudMessaging(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new CatchingFishToastStripeAPI(context).CatchingFishParcelableFAB.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final long CatchingFishCoroutine(int i) {
        long j = (i << 32) | (0 & 4294967295L);
        int i2 = CatchingFishEspressoFAB.CatchingFishAnimationMockk;
        return j;
    }

    public static CatchingFishToastKtor CatchingFishCoroutineFlow(String str, CatchingFishManifestDagger catchingFishManifestDagger) {
        CatchingFishCardViewKtor CatchingFishParcelableFAB2 = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishSpannableWidget.class);
        CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket = 1;
        CatchingFishParcelableFAB2.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(Context.class));
        CatchingFishParcelableFAB2.CatchingFishWorkManager = new CatchingFishXMLLayoutOkHttp(2, str, catchingFishManifestDagger);
        return CatchingFishParcelableFAB2.CatchingFishSnackbar();
    }

    public static final boolean CatchingFishCustomView(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        CatchingFishBiometricRoom catchingFishBiometricRoom;
        CatchingFishDaggerToolbar catchingFishDaggerToolbar;
        CatchingFishBiometricRoom catchingFishBiometricRoom2;
        CatchingFishDaggerToolbar catchingFishDaggerToolbar2 = catchingFishAppCompatWidget.CatchingFishCloudMessaging;
        return (catchingFishDaggerToolbar2 == null || (catchingFishBiometricRoom = catchingFishDaggerToolbar2.CatchingFishRoomDatabase) == null || !catchingFishBiometricRoom.CatchingFishFragmentFactory() || (catchingFishDaggerToolbar = catchingFishAppCompatWidget.CatchingFishCloudMessaging) == null || (catchingFishBiometricRoom2 = catchingFishDaggerToolbar.CatchingFishRoomDatabase) == null || !catchingFishBiometricRoom2.CatchingFishCustomView()) ? false : true;
    }

    public static String CatchingFishDagger(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat(i)) + ", " + CatchingFishXMLLayoutGlide.CatchingFishHandler(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        boolean z = catchingFishAppCompatWidget.CatchingFishReduxKtor.CatchingFishRoomDatabase;
        if (z) {
            if (!z) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitChildren called on an unattached node");
            }
            CatchingFishFABToast catchingFishFABToast = new CatchingFishFABToast(new CatchingFishFABStripeAPIFAB[16]);
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishFABStripeAPIFAB.CatchingFishLayout;
            if (catchingFishFABStripeAPIFAB2 == null) {
                CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB);
            } else {
                catchingFishFABToast.CatchingFishSnackbar(catchingFishFABStripeAPIFAB2);
            }
            loop0: while (true) {
                int i = catchingFishFABToast.CatchingFishWorkManager;
                if (i == 0) {
                    break;
                }
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = (CatchingFishFABStripeAPIFAB) catchingFishFABToast.CatchingFishFragmentHandler(i - 1);
                if ((catchingFishFABStripeAPIFAB3.CatchingFishViewModelScope & 1024) == 0) {
                    CatchingFishXMLLayoutGlide.CatchingFishWorkManager(catchingFishFABToast, catchingFishFABStripeAPIFAB3);
                } else {
                    while (true) {
                        if (catchingFishFABStripeAPIFAB3 == null) {
                            break;
                        }
                        if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                            while (catchingFishFABStripeAPIFAB3 != null) {
                                if (catchingFishFABStripeAPIFAB3 instanceof CatchingFishAppCompatWidget) {
                                    CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB3;
                                    if (catchingFishAppCompatWidget2.CatchingFishReduxKtor.CatchingFishRoomDatabase) {
                                        int ordinal = catchingFishAppCompatWidget2.CatchingFishMVPRobolectric().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            throw new CatchingFishBiometricView();
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                catchingFishFABStripeAPIFAB3 = null;
                            }
                        } else {
                            catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishLayout;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean CatchingFishDaggerWebsocket(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, Resources resources) {
        Object CatchingFishViewModelScope2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishParcelableFAB);
        if (CatchingFishViewModelScope2 == null) {
            CatchingFishViewModelScope2 = null;
        }
        List list = (List) CatchingFishViewModelScope2;
        return !CatchingFishAdMobFAB.CatchingFishPayPal(catchingFishMVIGraphQLHilt) && (catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishWorkManager || (catchingFishMVIGraphQLHilt.CatchingFishAnimationMockk() && ((list != null ? (String) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list) : null) != null || CatchingFishPayPal(catchingFishMVIGraphQLHilt) != null || CatchingFishCardViewRealm(catchingFishMVIGraphQLHilt, resources) != null || CatchingFishGsonAppCompat(catchingFishMVIGraphQLHilt))));
    }

    public static final Object[] CatchingFishEspressoMockk(Collection collection, Object[] objArr) {
        Object[] objArr2;
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static List CatchingFishFragmentFactory(Object obj) {
        List singletonList = Collections.singletonList(obj);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final Bundle CatchingFishFragmentHandler(CatchingFishGsonWorkManager... catchingFishGsonWorkManagerArr) {
        Bundle bundle = new Bundle(catchingFishGsonWorkManagerArr.length);
        for (CatchingFishGsonWorkManager catchingFishGsonWorkManager : catchingFishGsonWorkManagerArr) {
            String str = (String) catchingFishGsonWorkManager.CatchingFishReduxKtor;
            Object obj = catchingFishGsonWorkManager.CatchingFishDaggerWebsocket;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final boolean CatchingFishGsonAppCompat(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        Object CatchingFishViewModelScope2 = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCustomView);
        if (CatchingFishViewModelScope2 == null) {
            CatchingFishViewModelScope2 = null;
        }
        CatchingFishBundleEspresso catchingFishBundleEspresso = (CatchingFishBundleEspresso) CatchingFishViewModelScope2;
        CatchingFishPayPalService catchingFishPayPalService = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor.CatchingFishReduxKtor;
        Object CatchingFishViewModelScope3 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCoroutineFlow);
        if (CatchingFishViewModelScope3 == null) {
            CatchingFishViewModelScope3 = null;
        }
        boolean z = catchingFishBundleEspresso != null;
        Object CatchingFishViewModelScope4 = catchingFishPayPalService.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishMVPRobolectric);
        if (((Boolean) (CatchingFishViewModelScope4 != null ? CatchingFishViewModelScope4 : null)) != null) {
            return true;
        }
        return z;
    }

    public static Context CatchingFishHandler(Context context, AttributeSet attributeSet, int i, int i2) {
        return CatchingFishPayPalLiveData(context, attributeSet, i, i2, new int[0]);
    }

    public static final CatchingFishFluxExoPlayer CatchingFishJetpackCompose(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        CatchingFishDaggerToolbar catchingFishDaggerToolbar = catchingFishAppCompatWidget.CatchingFishCloudMessaging;
        return catchingFishDaggerToolbar != null ? CatchingFishLayoutRoomFAB.CatchingFishParcelableFlux(catchingFishDaggerToolbar).CatchingFishStateLiveData(catchingFishDaggerToolbar, false) : CatchingFishFluxExoPlayer.CatchingFishDaggerWebsocket;
    }

    public static final void CatchingFishJobScheduler(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        if (!(catchingFishWebsocketGradle instanceof CatchingFishPayPalRoom)) {
            catchingFishWebsocketGradle.CatchingFishViewModelFAB(obj);
            return;
        }
        CatchingFishPayPalRoom catchingFishPayPalRoom = (CatchingFishPayPalRoom) catchingFishWebsocketGradle;
        CatchingFishToastGradle catchingFishToastGradle = catchingFishPayPalRoom.CatchingFishViewModelScope;
        Throwable CatchingFishParcelableFAB2 = CatchingFishMVILayoutBundle.CatchingFishParcelableFAB(obj);
        Object catchingFishStripeAPIMVI = CatchingFishParcelableFAB2 == null ? obj : new CatchingFishStripeAPIMVI(CatchingFishParcelableFAB2, false);
        CatchingFishStateFlowGson catchingFishStateFlowGson = catchingFishPayPalRoom.CatchingFishViewModelFAB;
        if (catchingFishToastGradle.CatchingFishMVPRobolectric(catchingFishStateFlowGson.getContext())) {
            catchingFishPayPalRoom.CatchingFishLayout = catchingFishStripeAPIMVI;
            catchingFishPayPalRoom.CatchingFishWorkManager = 1;
            catchingFishToastGradle.CatchingFishCardViewView(catchingFishStateFlowGson.getContext(), catchingFishPayPalRoom);
            return;
        }
        CatchingFishReduxMockkView CatchingFishParcelableFAB3 = CatchingFishMVVMOkHttp.CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB3.CatchingFishWorkManager >= 4294967296L) {
            catchingFishPayPalRoom.CatchingFishLayout = catchingFishStripeAPIMVI;
            catchingFishPayPalRoom.CatchingFishWorkManager = 1;
            CatchingFishParcelableFAB3.CatchingFishMutableLiveData(catchingFishPayPalRoom);
            return;
        }
        CatchingFishParcelableFAB3.CatchingFishPayPalService(true);
        try {
            CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) catchingFishStateFlowGson.getContext().CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
            if (catchingFishRoomViewGson == null || catchingFishRoomViewGson.CatchingFishSnackbar()) {
                Object obj2 = catchingFishPayPalRoom.CatchingFishFragmentHandler;
                CatchingFishManifestMockk context = catchingFishStateFlowGson.getContext();
                Object CatchingFishRecyclerView = CatchingFishAdMobFAB.CatchingFishRecyclerView(context, obj2);
                CatchingFishToastIntent CatchingFishAnimation = CatchingFishRecyclerView != CatchingFishAdMobFAB.CatchingFishStateLiveData ? CatchingFishRobolectricHilt.CatchingFishAnimation(catchingFishStateFlowGson, context, CatchingFishRecyclerView) : null;
                try {
                    catchingFishStateFlowGson.CatchingFishViewModelFAB(obj);
                } finally {
                    if (CatchingFishAnimation == null || CatchingFishAnimation.CatchingFishDaggerMVVM()) {
                        CatchingFishAdMobFAB.CatchingFishEspressoMockk(context, CatchingFishRecyclerView);
                    }
                }
            } else {
                catchingFishPayPalRoom.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(catchingFishRoomViewGson.CatchingFishNavigation()));
            }
            while (CatchingFishParcelableFAB3.CatchingFishEspressoMockk()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.CatchingFishFABHandler, kotlin.text.CatchingFishManifestKtor] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.text.CatchingFishMockkPicasso] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List CatchingFishLayout(CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, Integer num, int i, Integer num2) {
        int i2;
        CatchingFishBundleGradle catchingFishBundleGradle;
        if (catchingFishGoogleMapsMVP.CatchingFishSpannableWidget || catchingFishGoogleMapsMVP.CatchingFishAnimationMockk() == 0) {
            return CatchingFishViewPagerDagger.CatchingFishReduxKtor;
        }
        ?? catchingFishFABHandler = new CatchingFishFABHandler(catchingFishGoogleMapsMVP);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = catchingFishGoogleMapsMVP.CatchingFishDaggerHiltFAB;
            if (i2 < 0) {
                i2 = catchingFishGoogleMapsMVP.CatchingFishMVPRobolectric(catchingFishGoogleMapsMVP.CatchingFishSnackbar, i);
            }
        }
        if (num == 0) {
            int CatchingFishCameraXIntent = catchingFishGoogleMapsMVP.CatchingFishLayout - catchingFishGoogleMapsMVP.CatchingFishCameraXIntent(catchingFishGoogleMapsMVP.CatchingFishSnackbar, catchingFishGoogleMapsMVP.CatchingFishRoomDatabase(i));
            CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = catchingFishGoogleMapsMVP.CatchingFish;
            num = Integer.valueOf(CatchingFishCameraXIntent + ((catchingFishLayoutGsonRoom == null || (catchingFishBundleGradle = (CatchingFishBundleGradle) catchingFishLayoutGsonRoom.CatchingFishSnackbar(i)) == null) ? 0 : catchingFishBundleGradle.CatchingFishSnackbar));
        }
        while (i >= 0) {
            catchingFishFABHandler.CatchingFishReduxKtor(catchingFishGoogleMapsMVP.CatchingFishHandler(i), num);
            num = catchingFishGoogleMapsMVP.CatchingFishSnackbar(i);
            if (i2 >= 0) {
                int i3 = i2;
                i2 = catchingFishGoogleMapsMVP.CatchingFishMVPRobolectric(catchingFishGoogleMapsMVP.CatchingFishSnackbar, i2);
                i = i3;
            } else {
                i = i2;
            }
        }
        return (ArrayList) catchingFishFABHandler.CatchingFishParcelableFAB;
    }

    public static final boolean CatchingFishMVPRobolectric(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static int CatchingFishMutableLiveData(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            throw new IllegalArgumentException("x (" + i + ") must be > 0");
        }
        switch (CatchingFishFABSnackbar.CatchingFishParcelableFAB[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final CatchingFishAppCompatWidget CatchingFishNavigation(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishViewModelFAB;
        if (catchingFishAppCompatWidget2 == null || !catchingFishAppCompatWidget2.CatchingFishRoomDatabase) {
            return null;
        }
        return catchingFishAppCompatWidget2;
    }

    public static CatchingFishToastKtor CatchingFishOkHttp(String str, String str2) {
        CatchingFishSpannableWidget catchingFishSpannableWidget = new CatchingFishSpannableWidget(str, str2);
        CatchingFishCardViewKtor CatchingFishParcelableFAB2 = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishSpannableWidget.class);
        CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket = 1;
        CatchingFishParcelableFAB2.CatchingFishWorkManager = new CatchingFishLayoutCoroutine(1, catchingFishSpannableWidget);
        return CatchingFishParcelableFAB2.CatchingFishSnackbar();
    }

    public static final CatchingFishFABCoroutine CatchingFishParcelableFAB(CatchingFishManifestMockk catchingFishManifestMockk) {
        if (catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout) == null) {
            catchingFishManifestMockk = catchingFishManifestMockk.CatchingFishAnimationMockk(new CatchingFishSpannableDagger(null));
        }
        return new CatchingFishFABCoroutine(catchingFishManifestMockk);
    }

    public static Set CatchingFishParcelableFlux() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final CatchingFishWebsocketDagger CatchingFishPayPal(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishMVPMotionLayout catchingFishMVPMotionLayout = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        CatchingFishGraphQLLayout catchingFishGraphQLLayout = CatchingFishServiceMVI.CatchingFishParcelableFAB;
        CatchingFishWebsocketDagger catchingFishWebsocketDagger = (CatchingFishWebsocketDagger) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVPMotionLayout, CatchingFishServiceMVI.CatchingFishPayPal);
        List list = (List) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(catchingFishMVIGraphQLHilt.CatchingFishReduxKtor, CatchingFishServiceMVI.CatchingFishParcelableFlux);
        return catchingFishWebsocketDagger == null ? list != null ? (CatchingFishWebsocketDagger) CatchingFishCameraXCameraX.CatchingFishJUnitRealm(list) : null : catchingFishWebsocketDagger;
    }

    public static Context CatchingFishPayPalLiveData(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishUnitTesting, i, i2);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof CatchingFishGraphQLManifest) && ((CatchingFishGraphQLManifest) context).CatchingFishParcelableFAB == i3;
        if (i3 == 0 || z) {
            return context;
        }
        CatchingFishGraphQLManifest catchingFishGraphQLManifest = new CatchingFishGraphQLManifest(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = obtainStyledAttributes2.getResourceId(i4, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                catchingFishGraphQLManifest.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, CatchingFishOkHttp);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            catchingFishGraphQLManifest.getTheme().applyStyle(resourceId, true);
        }
        return catchingFishGraphQLManifest;
    }

    public static ColorStateList CatchingFishPayPalService(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(CatchingFishStateLiveData, 0));
        }
        return colorStateList;
    }

    public static final boolean CatchingFishReduxKtor(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        CatchingFishMVPMotionLayout CatchingFishCloudMessaging2 = catchingFishMVIGraphQLHilt.CatchingFishCloudMessaging();
        return !CatchingFishCloudMessaging2.CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishLayout);
    }

    public static final boolean CatchingFishRoomDatabase(long j, long j2) {
        return j == j2;
    }

    public static final Object[] CatchingFishSensorManager(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "collection");
        int size = collection.size();
        Object[] objArr = CatchingFishLayout;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
                return copyOf;
            }
            i = i2;
        }
    }

    public static CatchingFishMockkWebSocket CatchingFishSnackbar() {
        return new CatchingFishMockkWebSocket(1.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.CatchingFishCoroutine == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList CatchingFishSpannableWidget(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        CatchingFishBundleGson catchingFishBundleGson;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        CatchingFishMoshiAppCompat catchingFishMoshiAppCompat = new CatchingFishMoshiAppCompat(resources, theme);
        synchronized (CatchingFishFABAsyncTask.CatchingFishCoroutine) {
            try {
                SparseArray sparseArray = (SparseArray) CatchingFishFABAsyncTask.CatchingFishSnackbar.get(catchingFishMoshiAppCompat);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (catchingFishBundleGson = (CatchingFishBundleGson) sparseArray.get(i)) != null) {
                    if (catchingFishBundleGson.CatchingFishSnackbar.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (catchingFishBundleGson.CatchingFishCoroutine != 0) {
                            }
                            colorStateList2 = catchingFishBundleGson.CatchingFishParcelableFAB;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = CatchingFishDaggerHandler.CatchingFishParcelableFAB(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (CatchingFishFABAsyncTask.CatchingFishCoroutine) {
            try {
                WeakHashMap weakHashMap = CatchingFishFABAsyncTask.CatchingFishSnackbar;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(catchingFishMoshiAppCompat);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(catchingFishMoshiAppCompat, sparseArray2);
                }
                sparseArray2.append(i, new CatchingFishBundleGson(colorStateList, catchingFishMoshiAppCompat.CatchingFishParcelableFAB.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r1.CatchingFishLayout(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005d, B:20:0x0071, B:22:0x0079, B:32:0x0048, B:35:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.text.CatchingFishIntentMVP] */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.text.CatchingFishIntentMVP] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object CatchingFishStateLiveData(CatchingFishIntentManifest catchingFishIntentManifest, CatchingFishViewPagerGradle catchingFishViewPagerGradle, boolean z, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishGsonManifest catchingFishGsonManifest;
        int i;
        CatchingFishMVVMCardView catchingFishMVVMCardView;
        CatchingFishViewPagerGradle catchingFishViewPagerGradle2;
        CatchingFishMVVMCardView catchingFishMVVMCardView2;
        CatchingFishIntentManifest catchingFishIntentManifest2;
        try {
            if (catchingFishStateFlowGson instanceof CatchingFishGsonManifest) {
                catchingFishGsonManifest = (CatchingFishGsonManifest) catchingFishStateFlowGson;
                int i2 = catchingFishGsonManifest.CatchingFishEspressoTesting;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    catchingFishGsonManifest.CatchingFishEspressoTesting = i2 - Integer.MIN_VALUE;
                    Object obj = catchingFishGsonManifest.CatchingFishCloudMessaging;
                    i = catchingFishGsonManifest.CatchingFishEspressoTesting;
                    CancellationException cancellationException = null;
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (i != 0) {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        if (catchingFishIntentManifest instanceof CatchingFishPicassoMVP) {
                            throw ((CatchingFishPicassoMVP) catchingFishIntentManifest).CatchingFishReduxKtor;
                        }
                        CatchingFishPicassoCameraX catchingFishPicassoCameraX = catchingFishViewPagerGradle.CatchingFishViewModelScope;
                        catchingFishPicassoCameraX.getClass();
                        catchingFishMVVMCardView = new CatchingFishMVVMCardView(catchingFishPicassoCameraX);
                        catchingFishViewPagerGradle = catchingFishViewPagerGradle;
                        catchingFishGsonManifest.CatchingFishViewModelScope = catchingFishIntentManifest;
                        catchingFishGsonManifest.CatchingFishViewModelFAB = catchingFishViewPagerGradle;
                        catchingFishGsonManifest.CatchingFishLayout = catchingFishMVVMCardView;
                        catchingFishGsonManifest.CatchingFishFragmentHandler = z;
                        catchingFishGsonManifest.CatchingFishEspressoTesting = 1;
                        obj = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishGsonManifest);
                        if (obj != catchingFishXMLLayoutMockk) {
                        }
                    } else if (i == 1) {
                        z = catchingFishGsonManifest.CatchingFishFragmentHandler;
                        catchingFishMVVMCardView2 = catchingFishGsonManifest.CatchingFishLayout;
                        ?? r8 = catchingFishGsonManifest.CatchingFishViewModelFAB;
                        catchingFishIntentManifest2 = catchingFishGsonManifest.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        catchingFishViewPagerGradle2 = r8;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = catchingFishGsonManifest.CatchingFishFragmentHandler;
                        catchingFishMVVMCardView2 = catchingFishGsonManifest.CatchingFishLayout;
                        ?? r82 = catchingFishGsonManifest.CatchingFishViewModelFAB;
                        catchingFishIntentManifest2 = catchingFishGsonManifest.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        CatchingFishViewPagerGradle catchingFishViewPagerGradle3 = r82;
                        CatchingFishIntentManifest catchingFishIntentManifest3 = catchingFishIntentManifest2;
                        catchingFishMVVMCardView = catchingFishMVVMCardView2;
                        catchingFishIntentManifest = catchingFishIntentManifest3;
                        catchingFishViewPagerGradle = catchingFishViewPagerGradle3;
                        catchingFishGsonManifest.CatchingFishViewModelScope = catchingFishIntentManifest;
                        catchingFishGsonManifest.CatchingFishViewModelFAB = catchingFishViewPagerGradle;
                        catchingFishGsonManifest.CatchingFishLayout = catchingFishMVVMCardView;
                        catchingFishGsonManifest.CatchingFishFragmentHandler = z;
                        catchingFishGsonManifest.CatchingFishEspressoTesting = 1;
                        obj = catchingFishMVVMCardView.CatchingFishSnackbar(catchingFishGsonManifest);
                        if (obj != catchingFishXMLLayoutMockk) {
                            return catchingFishXMLLayoutMockk;
                        }
                        CatchingFishMVVMCardView catchingFishMVVMCardView3 = catchingFishMVVMCardView;
                        catchingFishIntentManifest2 = catchingFishIntentManifest;
                        catchingFishMVVMCardView2 = catchingFishMVVMCardView3;
                        catchingFishViewPagerGradle2 = catchingFishViewPagerGradle;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                catchingFishViewPagerGradle2.CatchingFishCoroutine(null);
                            }
                            return CatchingFishRealmContext.CatchingFishParcelableFAB;
                        }
                        Object CatchingFishCoroutine2 = catchingFishMVVMCardView2.CatchingFishCoroutine();
                        catchingFishGsonManifest.CatchingFishViewModelScope = catchingFishIntentManifest2;
                        catchingFishGsonManifest.CatchingFishViewModelFAB = catchingFishViewPagerGradle2;
                        catchingFishGsonManifest.CatchingFishLayout = catchingFishMVVMCardView2;
                        catchingFishGsonManifest.CatchingFishFragmentHandler = z;
                        catchingFishGsonManifest.CatchingFishEspressoTesting = 2;
                        catchingFishViewPagerGradle3 = catchingFishViewPagerGradle2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        catchingFishGsonManifest = new CatchingFishGsonManifest(catchingFishStateFlowGson);
        Object obj2 = catchingFishGsonManifest.CatchingFishCloudMessaging;
        i = catchingFishGsonManifest.CatchingFishEspressoTesting;
        CancellationException cancellationException2 = null;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }

    public static Handler CatchingFishUnitTesting(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return CatchingFishRobolectricFlux.CatchingFishParcelableFAB(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static CatchingFishCameraXGson CatchingFishWorkManager(CatchingFishCameraXGson catchingFishCameraXGson) {
        catchingFishCameraXGson.CatchingFishViewModelScope();
        catchingFishCameraXGson.CatchingFishWorkManager = true;
        return catchingFishCameraXGson.CatchingFishDaggerWebsocket > 0 ? catchingFishCameraXGson : CatchingFishCameraXGson.CatchingFishViewModelScope;
    }

    public abstract List CatchingFishEspressoTesting(String str, List list);

    public CatchingFishMVPUnitTesting CatchingFishViewModelFAB(Context context, Looper looper, CatchingFishViewWorkManager catchingFishViewWorkManager, Object obj, CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP, CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public CatchingFishMVPUnitTesting CatchingFishViewModelScope(Context context, Looper looper, CatchingFishViewWorkManager catchingFishViewWorkManager, Object obj, CatchingFishJUnitPicasso catchingFishJUnitPicasso, CatchingFishHandlerBundle catchingFishHandlerBundle) {
        return CatchingFishViewModelFAB(context, looper, catchingFishViewWorkManager, obj, (CatchingFishAdMobDaggerMVP) catchingFishJUnitPicasso, (CatchingFishAdMobDaggerMVP) catchingFishHandlerBundle);
    }
}
