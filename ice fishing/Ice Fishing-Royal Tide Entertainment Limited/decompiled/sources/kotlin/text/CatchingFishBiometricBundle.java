package kotlin.text;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CatchingFishBiometricBundle {
    public static Method CatchingFish = null;
    public static Method CatchingFishAnimationMockk = null;
    public static Field CatchingFishCoroutineFlow = null;
    public static final CatchingFishAppCompatPayPal CatchingFishEspressoTesting;
    public static boolean CatchingFishFragmentHandler = false;
    public static boolean CatchingFishJetpackCompose = false;
    public static Method CatchingFishLayout = null;
    public static boolean CatchingFishNavigation = false;
    public static final CatchingFishAppCompatPayPal CatchingFishOkHttp;
    public static boolean CatchingFishRoomDatabase;
    public static Method CatchingFishStateLiveData;
    public static final CatchingFishAppCompatPayPal[] CatchingFishUnitTesting;
    public static final CatchingFishWebsocketGradle[] CatchingFishParcelableFAB = new CatchingFishWebsocketGradle[0];
    public static final CatchingFishLiveDataGson CatchingFishSnackbar = new CatchingFishLiveDataGson();
    public static final CatchingFishGsonBiometric CatchingFishCoroutine = new CatchingFishGsonBiometric();
    public static final CatchingFishFluxWorkManager CatchingFishReduxKtor = new CatchingFishFluxWorkManager("REMOVED_TASK", 1);
    public static final CatchingFishFluxWorkManager CatchingFishDaggerWebsocket = new CatchingFishFluxWorkManager("CLOSED_EMPTY", 1);
    public static final Object CatchingFishWorkManager = new Object();
    public static final StackTraceElement[] CatchingFishViewModelScope = new StackTraceElement[0];
    public static final Object CatchingFishViewModelFAB = new Object();
    public static final CatchingFishRoomGradleRoom CatchingFishCloudMessaging = new CatchingFishRoomGradleRoom(0, new long[0], new Object[0]);

    static {
        CatchingFishAppCompatPayPal catchingFishAppCompatPayPal = new CatchingFishAppCompatPayPal("CLIENT_TELEMETRY");
        CatchingFishEspressoTesting = catchingFishAppCompatPayPal;
        CatchingFishAppCompatPayPal catchingFishAppCompatPayPal2 = new CatchingFishAppCompatPayPal("CLIENT_NOTIFICATION_TELEMETRY");
        CatchingFishOkHttp = catchingFishAppCompatPayPal2;
        CatchingFishUnitTesting = new CatchingFishAppCompatPayPal[]{catchingFishAppCompatPayPal, catchingFishAppCompatPayPal2};
    }

    public static final String CatchingFish(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static CatchingFishToolbarGlide CatchingFishAnimationMockk(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, int i, ArrayList arrayList, CatchingFishToolbarGlide catchingFishToolbarGlide) {
        int i2;
        int i3 = i == 0 ? catchingFishDaggerRetrofit.CatchingFishView : catchingFishDaggerRetrofit.CatchingFishServiceMVIJUnit;
        if (i3 != -1 && (catchingFishToolbarGlide == null || i3 != catchingFishToolbarGlide.CatchingFishSnackbar)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                CatchingFishToolbarGlide catchingFishToolbarGlide2 = (CatchingFishToolbarGlide) arrayList.get(i4);
                if (catchingFishToolbarGlide2.CatchingFishSnackbar == i3) {
                    if (catchingFishToolbarGlide != null) {
                        catchingFishToolbarGlide.CatchingFishCoroutine(i, catchingFishToolbarGlide2);
                        arrayList.remove(catchingFishToolbarGlide);
                    }
                    catchingFishToolbarGlide = catchingFishToolbarGlide2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return catchingFishToolbarGlide;
        }
        if (catchingFishToolbarGlide == null) {
            if (catchingFishDaggerRetrofit instanceof CatchingFishRetrofitHandler) {
                CatchingFishRetrofitHandler catchingFishRetrofitHandler = (CatchingFishRetrofitHandler) catchingFishDaggerRetrofit;
                int i5 = 0;
                while (true) {
                    if (i5 >= catchingFishRetrofitHandler.CatchingFishGraphQLGlide) {
                        i2 = -1;
                        break;
                    }
                    CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = catchingFishRetrofitHandler.CatchingFishFABLayout[i5];
                    if ((i == 0 && (i2 = catchingFishDaggerRetrofit2.CatchingFishView) != -1) || (i == 1 && (i2 = catchingFishDaggerRetrofit2.CatchingFishServiceMVIJUnit) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        CatchingFishToolbarGlide catchingFishToolbarGlide3 = (CatchingFishToolbarGlide) arrayList.get(i6);
                        if (catchingFishToolbarGlide3.CatchingFishSnackbar == i2) {
                            catchingFishToolbarGlide = catchingFishToolbarGlide3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (catchingFishToolbarGlide == null) {
                catchingFishToolbarGlide = new CatchingFishToolbarGlide();
                catchingFishToolbarGlide.CatchingFishParcelableFAB = new ArrayList();
                catchingFishToolbarGlide.CatchingFishReduxKtor = null;
                catchingFishToolbarGlide.CatchingFishDaggerWebsocket = -1;
                int i7 = CatchingFishToolbarGlide.CatchingFishWorkManager;
                CatchingFishToolbarGlide.CatchingFishWorkManager = i7 + 1;
                catchingFishToolbarGlide.CatchingFishSnackbar = i7;
                catchingFishToolbarGlide.CatchingFishCoroutine = i;
            }
            arrayList.add(catchingFishToolbarGlide);
        }
        int i8 = catchingFishToolbarGlide.CatchingFishSnackbar;
        ArrayList arrayList2 = catchingFishToolbarGlide.CatchingFishParcelableFAB;
        if (arrayList2.contains(catchingFishDaggerRetrofit)) {
            return catchingFishToolbarGlide;
        }
        arrayList2.add(catchingFishDaggerRetrofit);
        if (catchingFishDaggerRetrofit instanceof CatchingFishViewModelMockk) {
            CatchingFishViewModelMockk catchingFishViewModelMockk = (CatchingFishViewModelMockk) catchingFishDaggerRetrofit;
            catchingFishViewModelMockk.CatchingFishWidget.CatchingFishCoroutine(catchingFishViewModelMockk.CatchingFishKtorService == 0 ? 1 : 0, arrayList, catchingFishToolbarGlide);
        }
        if (i == 0) {
            catchingFishDaggerRetrofit.CatchingFishView = i8;
            catchingFishDaggerRetrofit.CatchingFishSensorManager.CatchingFishCoroutine(i, arrayList, catchingFishToolbarGlide);
            catchingFishDaggerRetrofit.CatchingFishDagger.CatchingFishCoroutine(i, arrayList, catchingFishToolbarGlide);
        } else {
            catchingFishDaggerRetrofit.CatchingFishServiceMVIJUnit = i8;
            catchingFishDaggerRetrofit.CatchingFishEspressoMockk.CatchingFishCoroutine(i, arrayList, catchingFishToolbarGlide);
            catchingFishDaggerRetrofit.CatchingFishHandler.CatchingFishCoroutine(i, arrayList, catchingFishToolbarGlide);
            catchingFishDaggerRetrofit.CatchingFishCameraXIntent.CatchingFishCoroutine(i, arrayList, catchingFishToolbarGlide);
        }
        catchingFishDaggerRetrofit.CatchingFishMotionLayout.CatchingFishCoroutine(i, arrayList, catchingFishToolbarGlide);
        return catchingFishToolbarGlide;
    }

    public static void CatchingFishCameraXIntent(int i, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        float f = catchingFishDaggerRetrofit.CatchingFishCustomViewJUnit;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit.CatchingFishEspressoMockk;
        int CatchingFishReduxKtor2 = catchingFishStripeAPIJUnit.CatchingFishWorkManager.CatchingFishReduxKtor();
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit.CatchingFishCameraXIntent;
        int CatchingFishReduxKtor3 = catchingFishStripeAPIJUnit2.CatchingFishWorkManager.CatchingFishReduxKtor();
        int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor2;
        int CatchingFishDaggerWebsocket3 = CatchingFishReduxKtor3 - catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket();
        if (CatchingFishReduxKtor2 == CatchingFishReduxKtor3) {
            f = 0.5f;
        } else {
            CatchingFishReduxKtor2 = CatchingFishDaggerWebsocket2;
            CatchingFishReduxKtor3 = CatchingFishDaggerWebsocket3;
        }
        int CatchingFishCloudMessaging2 = catchingFishDaggerRetrofit.CatchingFishCloudMessaging();
        int i2 = (CatchingFishReduxKtor3 - CatchingFishReduxKtor2) - CatchingFishCloudMessaging2;
        if (CatchingFishReduxKtor2 > CatchingFishReduxKtor3) {
            i2 = (CatchingFishReduxKtor2 - CatchingFishReduxKtor3) - CatchingFishCloudMessaging2;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = CatchingFishReduxKtor2 + i3;
        int i5 = i4 + CatchingFishCloudMessaging2;
        if (CatchingFishReduxKtor2 > CatchingFishReduxKtor3) {
            i4 = CatchingFishReduxKtor2 - i3;
            i5 = i4 - CatchingFishCloudMessaging2;
        }
        catchingFishDaggerRetrofit.CatchingFishDagger(i4, i5);
        CatchingFishLayoutInflater(i + 1, catchingFishRetrofitDagger, catchingFishDaggerRetrofit);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    public static final CatchingFishKtorToastRedux CatchingFishCardViewView(CatchingFishAppCompatWidget catchingFishAppCompatWidget, int i) {
        if (!catchingFishAppCompatWidget.CatchingFish) {
            catchingFishAppCompatWidget.CatchingFish = true;
            try {
                CatchingFishCardViewFlux CatchingFishCardViewView = catchingFishAppCompatWidget.CatchingFishCardViewView();
                CatchingFishHiltSnackbar catchingFishHiltSnackbar = new CatchingFishHiltSnackbar(i);
                CatchingFishViewManifest focusOwner = ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner();
                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = ((CatchingFishExoPlayerOkHttp) focusOwner).CatchingFishViewModelFAB;
                CatchingFishCardViewView.CatchingFishFragmentHandler.CatchingFishFragmentHandler(catchingFishHiltSnackbar);
                CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = ((CatchingFishExoPlayerOkHttp) focusOwner).CatchingFishViewModelFAB;
                boolean z = catchingFishHiltSnackbar.CatchingFishSnackbar;
                CatchingFishKtorToastRedux catchingFishKtorToastRedux = CatchingFishKtorToastRedux.CatchingFishDaggerWebsocket;
                if (z) {
                    CatchingFishMVIMoshiMVP catchingFishMVIMoshiMVP = CatchingFishMVIMoshiMVP.CatchingFishSnackbar;
                    return catchingFishKtorToastRedux;
                }
                if (catchingFishAppCompatWidget2 != catchingFishAppCompatWidget3 && catchingFishAppCompatWidget3 != null) {
                    return CatchingFishMVIMoshiMVP.CatchingFishReduxKtor == CatchingFishMVIMoshiMVP.CatchingFishCoroutine ? catchingFishKtorToastRedux : CatchingFishKtorToastRedux.CatchingFishWorkManager;
                }
            } finally {
                catchingFishAppCompatWidget.CatchingFish = false;
            }
        }
        return CatchingFishKtorToastRedux.CatchingFishReduxKtor;
    }

    public static boolean CatchingFishCloudMessaging(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = CatchingFishToolbarEspresso.CatchingFishReduxKtor;
        CatchingFishToolbarEspresso catchingFishToolbarEspresso = (CatchingFishToolbarEspresso) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (catchingFishToolbarEspresso == null) {
            catchingFishToolbarEspresso = new CatchingFishToolbarEspresso();
            catchingFishToolbarEspresso.CatchingFishParcelableFAB = null;
            catchingFishToolbarEspresso.CatchingFishSnackbar = null;
            catchingFishToolbarEspresso.CatchingFishCoroutine = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, catchingFishToolbarEspresso);
        }
        WeakReference weakReference2 = catchingFishToolbarEspresso.CatchingFishCoroutine;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        catchingFishToolbarEspresso.CatchingFishCoroutine = new WeakReference(keyEvent);
        if (catchingFishToolbarEspresso.CatchingFishSnackbar == null) {
            catchingFishToolbarEspresso.CatchingFishSnackbar = new SparseArray();
        }
        SparseArray sparseArray = catchingFishToolbarEspresso.CatchingFishSnackbar;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final void CatchingFishCoroutine(CatchingFishLayoutGlide catchingFishLayoutGlide, CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishToolbarToast catchingFishToolbarToast) {
        AutoCloseable autoCloseable;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewModelIntent, "registry");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarToast, "lifecycle");
        CatchingFishEspressoMVPGson catchingFishEspressoMVPGson = catchingFishLayoutGlide.CatchingFishParcelableFAB;
        if (catchingFishEspressoMVPGson != null) {
            synchronized (catchingFishEspressoMVPGson.CatchingFishParcelableFAB) {
                autoCloseable = (AutoCloseable) catchingFishEspressoMVPGson.CatchingFishSnackbar.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        CatchingFishGsonWidget catchingFishGsonWidget = (CatchingFishGsonWidget) autoCloseable;
        if (catchingFishGsonWidget == null || catchingFishGsonWidget.CatchingFishWorkManager) {
            return;
        }
        catchingFishGsonWidget.CatchingFishLayout(catchingFishToolbarToast, catchingFishViewModelIntent);
        CatchingFishMockkFirebase catchingFishMockkFirebase = catchingFishToolbarToast.CatchingFishReduxKtor;
        if (catchingFishMockkFirebase == CatchingFishMockkFirebase.CatchingFishDaggerWebsocket || catchingFishMockkFirebase.compareTo(CatchingFishMockkFirebase.CatchingFishViewModelScope) >= 0) {
            catchingFishViewModelIntent.CatchingFishMVPRobolectric();
        } else {
            catchingFishToolbarToast.CatchingFishParcelableFAB(new CatchingFishLiveDataPicasso(catchingFishToolbarToast, catchingFishViewModelIntent));
        }
    }

    public static final long CatchingFishCoroutineFlow(CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        DragEvent dragEvent = (DragEvent) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean CatchingFishCustomView(CatchingFishAppCompatWidget catchingFishAppCompatWidget) {
        CatchingFishFABToast catchingFishFABToast;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle2;
        CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp = (CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner();
        CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB;
        CatchingFishFABBiometric CatchingFishMVPRobolectric = catchingFishAppCompatWidget.CatchingFishMVPRobolectric();
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        if (catchingFishAppCompatWidget2 == catchingFishAppCompatWidget) {
            catchingFishAppCompatWidget.CatchingFishPayPal(CatchingFishMVPRobolectric, CatchingFishMVPRobolectric);
            return true;
        }
        if (catchingFishAppCompatWidget2 != null || ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishParcelableFAB.CatchingFishMVPRobolectric()) {
            if (catchingFishAppCompatWidget2 != null) {
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishAppCompatWidget2.CatchingFishReduxKtor;
                catchingFishFABToast = new CatchingFishFABToast(new CatchingFishAppCompatWidget[16]);
                if (!catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                }
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget2);
                while (CatchingFishJobScheduler != null) {
                    if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB3 != null) {
                            if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                                for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB4 = catchingFishFABStripeAPIFAB3; catchingFishFABStripeAPIFAB4 != null; catchingFishFABStripeAPIFAB4 = null) {
                                    if (catchingFishFABStripeAPIFAB4 instanceof CatchingFishAppCompatWidget) {
                                        catchingFishFABToast.CatchingFishSnackbar((CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB4);
                                    }
                                }
                            }
                            catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishViewModelFAB;
                        }
                    }
                    CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                    catchingFishFABStripeAPIFAB3 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle2 = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle2.CatchingFishLayout;
                }
            } else {
                catchingFishFABToast = null;
            }
            CatchingFishAppCompatWidget[] catchingFishAppCompatWidgetArr = new CatchingFishAppCompatWidget[16];
            if (!catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
            }
            CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB;
            CatchingFishBiometricRoom CatchingFishJobScheduler2 = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
            boolean z = true;
            int i = 0;
            while (CatchingFishJobScheduler2 != null) {
                if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler2.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                    while (catchingFishFABStripeAPIFAB5 != null) {
                        if ((catchingFishFABStripeAPIFAB5.CatchingFishWorkManager & 1024) != 0) {
                            for (CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB6 = catchingFishFABStripeAPIFAB5; catchingFishFABStripeAPIFAB6 != null; catchingFishFABStripeAPIFAB6 = null) {
                                if (catchingFishFABStripeAPIFAB6 instanceof CatchingFishAppCompatWidget) {
                                    CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB6;
                                    Boolean valueOf = catchingFishFABToast != null ? Boolean.valueOf(catchingFishFABToast.CatchingFishLayout(catchingFishAppCompatWidget3)) : null;
                                    if (valueOf == null || !valueOf.booleanValue()) {
                                        int i2 = i + 1;
                                        if (catchingFishAppCompatWidgetArr.length < i2) {
                                            int length = catchingFishAppCompatWidgetArr.length;
                                            ?? r9 = new Object[Math.max(i2, length * 2)];
                                            System.arraycopy(catchingFishAppCompatWidgetArr, 0, r9, 0, length);
                                            catchingFishAppCompatWidgetArr = r9;
                                        }
                                        catchingFishAppCompatWidgetArr[i] = catchingFishAppCompatWidget3;
                                        i = i2;
                                    }
                                    if (catchingFishAppCompatWidget3 == catchingFishAppCompatWidget2) {
                                        z = false;
                                    }
                                }
                            }
                        }
                        catchingFishFABStripeAPIFAB5 = catchingFishFABStripeAPIFAB5.CatchingFishViewModelFAB;
                    }
                }
                CatchingFishJobScheduler2 = CatchingFishJobScheduler2.CatchingFishRoomDatabase();
                catchingFishFABStripeAPIFAB5 = (CatchingFishJobScheduler2 == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler2.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
            }
            if (!z || catchingFishAppCompatWidget2 == null || CatchingFishLayout(catchingFishAppCompatWidget2, false)) {
                CatchingFishHiltMVPToast.CatchingFishCardViewView(catchingFishAppCompatWidget, new CatchingFishViewPagerRedux(2, catchingFishAppCompatWidget));
                int ordinal = catchingFishAppCompatWidget.CatchingFishMVPRobolectric().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                throw new CatchingFishBiometricView();
                            }
                        }
                    }
                    ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishWorkManager(catchingFishAppCompatWidget);
                }
                CatchingFishFABBiometric catchingFishFABBiometric = CatchingFishFABBiometric.CatchingFishViewModelScope;
                CatchingFishFABBiometric catchingFishFABBiometric2 = CatchingFishFABBiometric.CatchingFishDaggerWebsocket;
                if (catchingFishFABToast != null) {
                    int i3 = catchingFishFABToast.CatchingFishWorkManager - 1;
                    Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                    if (i3 < objArr.length) {
                        while (i3 >= 0) {
                            CatchingFishAppCompatWidget catchingFishAppCompatWidget4 = (CatchingFishAppCompatWidget) objArr[i3];
                            if (catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB != catchingFishAppCompatWidget) {
                                break;
                            }
                            catchingFishAppCompatWidget4.CatchingFishPayPal(catchingFishFABBiometric2, catchingFishFABBiometric);
                            i3--;
                        }
                    }
                }
                int i4 = i - 1;
                int length2 = catchingFishAppCompatWidgetArr.length;
                CatchingFishFABBiometric catchingFishFABBiometric3 = CatchingFishFABBiometric.CatchingFishReduxKtor;
                if (i4 < length2) {
                    while (i4 >= 0) {
                        CatchingFishAppCompatWidget catchingFishAppCompatWidget5 = catchingFishAppCompatWidgetArr[i4];
                        if (catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB != catchingFishAppCompatWidget) {
                            break;
                        }
                        catchingFishAppCompatWidget5.CatchingFishPayPal(catchingFishAppCompatWidget5 == catchingFishAppCompatWidget2 ? catchingFishFABBiometric3 : catchingFishFABBiometric, catchingFishFABBiometric2);
                        i4--;
                    }
                }
                if (catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB == catchingFishAppCompatWidget) {
                    catchingFishAppCompatWidget.CatchingFishPayPal(CatchingFishMVPRobolectric, catchingFishFABBiometric3);
                    if (catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB != catchingFishAppCompatWidget) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void CatchingFishDagger(int i, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2, boolean z) {
        float f = catchingFishDaggerRetrofit2.CatchingFishRedux;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit2.CatchingFishSensorManager;
        int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket() + catchingFishStripeAPIJUnit.CatchingFishWorkManager.CatchingFishReduxKtor();
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit2.CatchingFishDagger;
        int CatchingFishReduxKtor2 = catchingFishStripeAPIJUnit2.CatchingFishWorkManager.CatchingFishReduxKtor() - catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket();
        if (CatchingFishReduxKtor2 >= CatchingFishDaggerWebsocket2) {
            int CatchingFishRoomDatabase2 = catchingFishDaggerRetrofit2.CatchingFishRoomDatabase();
            if (catchingFishDaggerRetrofit2.CatchingFishMockkOkHttp != 8) {
                int i2 = catchingFishDaggerRetrofit2.CatchingFishNavigation;
                if (i2 == 2) {
                    CatchingFishRoomDatabase2 = (int) (catchingFishDaggerRetrofit2.CatchingFishRedux * 0.5f * (catchingFishDaggerRetrofit instanceof CatchingFishGsonAppCompat ? catchingFishDaggerRetrofit.CatchingFishRoomDatabase() : catchingFishDaggerRetrofit.CatchingFishAppCompat.CatchingFishRoomDatabase()));
                } else if (i2 == 0) {
                    CatchingFishRoomDatabase2 = CatchingFishReduxKtor2 - CatchingFishDaggerWebsocket2;
                }
                CatchingFishRoomDatabase2 = Math.max(catchingFishDaggerRetrofit2.CatchingFishCoroutineFlow, CatchingFishRoomDatabase2);
                int i3 = catchingFishDaggerRetrofit2.CatchingFishDaggerHiltFAB;
                if (i3 > 0) {
                    CatchingFishRoomDatabase2 = Math.min(i3, CatchingFishRoomDatabase2);
                }
            }
            int i4 = CatchingFishDaggerWebsocket2 + ((int) ((f * ((CatchingFishReduxKtor2 - CatchingFishDaggerWebsocket2) - CatchingFishRoomDatabase2)) + 0.5f));
            catchingFishDaggerRetrofit2.CatchingFishEspressoMockk(i4, CatchingFishRoomDatabase2 + i4);
            CatchingFishSpannableWidget(i + 1, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2, z);
        }
    }

    public static final void CatchingFishDaggerHiltFAB(Throwable th, CatchingFishManifestMockk catchingFishManifestMockk) {
        try {
            CatchingFishDaggerMVI catchingFishDaggerMVI = (CatchingFishDaggerMVI) catchingFishManifestMockk.CatchingFishCoroutineFlow(CatchingFishMoshiFluxMoshi.CatchingFishViewModelScope);
            if (catchingFishDaggerMVI != null) {
                catchingFishDaggerMVI.CatchingFishLayout(th, catchingFishManifestMockk);
            } else {
                CatchingFishXMLLayoutGlide.CatchingFishDaggerHiltFAB(th, catchingFishManifestMockk);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                CatchingFishAdMobFAB.CatchingFishViewModelFAB(runtimeException, th);
                th = runtimeException;
            }
            CatchingFishXMLLayoutGlide.CatchingFishDaggerHiltFAB(th, catchingFishManifestMockk);
        }
    }

    public static final int CatchingFishDaggerWebsocket(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static void CatchingFishEspressoMockk(int i, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, boolean z) {
        float f = catchingFishDaggerRetrofit.CatchingFishRedux;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit.CatchingFishSensorManager;
        int CatchingFishReduxKtor2 = catchingFishStripeAPIJUnit.CatchingFishWorkManager.CatchingFishReduxKtor();
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit.CatchingFishDagger;
        int CatchingFishReduxKtor3 = catchingFishStripeAPIJUnit2.CatchingFishWorkManager.CatchingFishReduxKtor();
        int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor2;
        int CatchingFishDaggerWebsocket3 = CatchingFishReduxKtor3 - catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket();
        if (CatchingFishReduxKtor2 == CatchingFishReduxKtor3) {
            f = 0.5f;
        } else {
            CatchingFishReduxKtor2 = CatchingFishDaggerWebsocket2;
            CatchingFishReduxKtor3 = CatchingFishDaggerWebsocket3;
        }
        int CatchingFishRoomDatabase2 = catchingFishDaggerRetrofit.CatchingFishRoomDatabase();
        int i2 = (CatchingFishReduxKtor3 - CatchingFishReduxKtor2) - CatchingFishRoomDatabase2;
        if (CatchingFishReduxKtor2 > CatchingFishReduxKtor3) {
            i2 = (CatchingFishReduxKtor2 - CatchingFishReduxKtor3) - CatchingFishRoomDatabase2;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + CatchingFishReduxKtor2;
        int i4 = i3 + CatchingFishRoomDatabase2;
        if (CatchingFishReduxKtor2 > CatchingFishReduxKtor3) {
            i4 = i3 - CatchingFishRoomDatabase2;
        }
        catchingFishDaggerRetrofit.CatchingFishEspressoMockk(i3, i4);
        CatchingFishSpannableWidget(i + 1, catchingFishRetrofitDagger, catchingFishDaggerRetrofit, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean CatchingFishEspressoTesting(CatchingFishFABGraphQL catchingFishFABGraphQL, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (catchingFishFABGraphQL != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return catchingFishFABGraphQL.CatchingFishSnackbar(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!CatchingFishNavigation) {
                            try {
                                CatchingFish = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            CatchingFishNavigation = true;
                        }
                        Method method = CatchingFish;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (CatchingFishFABCameraX.CatchingFishCoroutine(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!CatchingFishJetpackCompose) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        CatchingFishCoroutineFlow = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    CatchingFishJetpackCompose = true;
                }
                Field field = CatchingFishCoroutineFlow;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (CatchingFishFABCameraX.CatchingFishCoroutine(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && CatchingFishFABCameraX.CatchingFishCoroutine(view, keyEvent)) || catchingFishFABGraphQL.CatchingFishSnackbar(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final Object CatchingFishFragmentFactory(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CatchingFishWebsocketGradle CatchingFishFragmentHandler(CatchingFishWebsocketGradle catchingFishWebsocketGradle, CatchingFishWebsocketGradle catchingFishWebsocketGradle2, CatchingFishMockkView catchingFishMockkView) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkView, "<this>");
        if (catchingFishMockkView instanceof CatchingFishMoshiCameraX) {
            return ((CatchingFishMoshiCameraX) catchingFishMockkView).CatchingFishCloudMessaging(catchingFishWebsocketGradle, catchingFishWebsocketGradle2);
        }
        CatchingFishManifestMockk context = catchingFishWebsocketGradle2.getContext();
        return context == CatchingFishPayPalDataStore.CatchingFishReduxKtor ? new CatchingFishLifecycleView(catchingFishWebsocketGradle2, catchingFishWebsocketGradle, catchingFishMockkView) : new CatchingFishHiltViewFlux(catchingFishWebsocketGradle2, context, catchingFishMockkView, catchingFishWebsocketGradle);
    }

    public static final String CatchingFishGradleManifest(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        Object CatchingFishViewModelFAB2;
        if (catchingFishWebsocketGradle instanceof CatchingFishPayPalRoom) {
            return ((CatchingFishPayPalRoom) catchingFishWebsocketGradle).toString();
        }
        try {
            CatchingFishViewModelFAB2 = catchingFishWebsocketGradle + '@' + CatchingFish(catchingFishWebsocketGradle);
        } catch (Throwable th) {
            CatchingFishViewModelFAB2 = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        if (CatchingFishMVILayoutBundle.CatchingFishParcelableFAB(CatchingFishViewModelFAB2) != null) {
            CatchingFishViewModelFAB2 = catchingFishWebsocketGradle.getClass().getName() + '@' + CatchingFish(catchingFishWebsocketGradle);
        }
        return (String) CatchingFishViewModelFAB2;
    }

    public static void CatchingFishHandler(int i, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2) {
        float f = catchingFishDaggerRetrofit2.CatchingFishCustomViewJUnit;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = catchingFishDaggerRetrofit2.CatchingFishEspressoMockk;
        int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket() + catchingFishStripeAPIJUnit.CatchingFishWorkManager.CatchingFishReduxKtor();
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = catchingFishDaggerRetrofit2.CatchingFishCameraXIntent;
        int CatchingFishReduxKtor2 = catchingFishStripeAPIJUnit2.CatchingFishWorkManager.CatchingFishReduxKtor() - catchingFishStripeAPIJUnit2.CatchingFishDaggerWebsocket();
        if (CatchingFishReduxKtor2 >= CatchingFishDaggerWebsocket2) {
            int CatchingFishCloudMessaging2 = catchingFishDaggerRetrofit2.CatchingFishCloudMessaging();
            if (catchingFishDaggerRetrofit2.CatchingFishMockkOkHttp != 8) {
                int i2 = catchingFishDaggerRetrofit2.CatchingFish;
                if (i2 == 2) {
                    CatchingFishCloudMessaging2 = (int) (f * 0.5f * (catchingFishDaggerRetrofit instanceof CatchingFishGsonAppCompat ? catchingFishDaggerRetrofit.CatchingFishCloudMessaging() : catchingFishDaggerRetrofit.CatchingFishAppCompat.CatchingFishCloudMessaging()));
                } else if (i2 == 0) {
                    CatchingFishCloudMessaging2 = CatchingFishReduxKtor2 - CatchingFishDaggerWebsocket2;
                }
                CatchingFishCloudMessaging2 = Math.max(catchingFishDaggerRetrofit2.CatchingFishParcelableFlux, CatchingFishCloudMessaging2);
                int i3 = catchingFishDaggerRetrofit2.CatchingFishGsonAppCompat;
                if (i3 > 0) {
                    CatchingFishCloudMessaging2 = Math.min(i3, CatchingFishCloudMessaging2);
                }
            }
            int i4 = CatchingFishDaggerWebsocket2 + ((int) ((f * ((CatchingFishReduxKtor2 - CatchingFishDaggerWebsocket2) - CatchingFishCloudMessaging2)) + 0.5f));
            catchingFishDaggerRetrofit2.CatchingFishDagger(i4, CatchingFishCloudMessaging2 + i4);
            CatchingFishLayoutInflater(i + 1, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2);
        }
    }

    public static Object CatchingFishJetpackCompose(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return CatchingFishJobScheduler.CatchingFishCoroutine(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (CatchingFishToolbar.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final boolean CatchingFishJobScheduler(CatchingFishHiltFAB catchingFishHiltFAB, CatchingFishHiltFAB catchingFishHiltFAB2) {
        if (catchingFishHiltFAB == null) {
            return true;
        }
        if (catchingFishHiltFAB instanceof CatchingFishHiltFAB) {
            return !catchingFishHiltFAB.CatchingFishSnackbar() || catchingFishHiltFAB.equals(catchingFishHiltFAB2) || CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishHiltFAB.CatchingFishCoroutine, catchingFishHiltFAB2.CatchingFishCoroutine);
        }
        return false;
    }

    public static final boolean CatchingFishLayout(CatchingFishAppCompatWidget catchingFishAppCompatWidget, boolean z) {
        int ordinal = catchingFishAppCompatWidget.CatchingFishMVPRobolectric().ordinal();
        CatchingFishFABBiometric catchingFishFABBiometric = CatchingFishFABBiometric.CatchingFishViewModelScope;
        if (ordinal == 0) {
            ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishWorkManager(null);
            catchingFishAppCompatWidget.CatchingFishPayPal(CatchingFishFABBiometric.CatchingFishReduxKtor, catchingFishFABBiometric);
            return true;
        }
        if (ordinal == 1) {
            CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB = CatchingFishGsonCardView.CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget);
            if (!(CatchingFishDaggerHiltFAB != null ? CatchingFishLayout(CatchingFishDaggerHiltFAB, z) : true)) {
                return false;
            }
            catchingFishAppCompatWidget.CatchingFishPayPal(CatchingFishFABBiometric.CatchingFishDaggerWebsocket, catchingFishFABBiometric);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new CatchingFishBiometricView();
        }
        if (z) {
            ((CatchingFishExoPlayerOkHttp) ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner()).CatchingFishWorkManager(null);
            catchingFishAppCompatWidget.CatchingFishPayPal(CatchingFishFABBiometric.CatchingFishWorkManager, catchingFishFABBiometric);
        }
        return z;
    }

    public static void CatchingFishLayoutInflater(int i, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        boolean z;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4;
        if (catchingFishDaggerRetrofit.CatchingFishUnitTesting) {
            return;
        }
        if (!(catchingFishDaggerRetrofit instanceof CatchingFishGsonAppCompat) && catchingFishDaggerRetrofit.CatchingFishCardViewRealm() && CatchingFishViewModelFAB(catchingFishDaggerRetrofit)) {
            CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
        }
        CatchingFishStripeAPIJUnit CatchingFishLayout2 = catchingFishDaggerRetrofit.CatchingFishLayout(3);
        CatchingFishStripeAPIJUnit CatchingFishLayout3 = catchingFishDaggerRetrofit.CatchingFishLayout(5);
        int CatchingFishReduxKtor2 = CatchingFishLayout2.CatchingFishReduxKtor();
        int CatchingFishReduxKtor3 = CatchingFishLayout3.CatchingFishReduxKtor();
        HashSet hashSet = CatchingFishLayout2.CatchingFishParcelableFAB;
        if (hashSet != null && CatchingFishLayout2.CatchingFishCoroutine) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit5 = (CatchingFishStripeAPIJUnit) it.next();
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = catchingFishStripeAPIJUnit5.CatchingFishReduxKtor;
                int i2 = i + 1;
                boolean CatchingFishViewModelFAB2 = CatchingFishViewModelFAB(catchingFishDaggerRetrofit2);
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit6 = catchingFishDaggerRetrofit2.CatchingFishEspressoMockk;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit7 = catchingFishDaggerRetrofit2.CatchingFishCameraXIntent;
                if (catchingFishDaggerRetrofit2.CatchingFishCardViewRealm() && CatchingFishViewModelFAB2) {
                    CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit2, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
                }
                boolean z2 = (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit6 && (catchingFishStripeAPIJUnit4 = catchingFishStripeAPIJUnit7.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit4.CatchingFishCoroutine) || (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit7 && (catchingFishStripeAPIJUnit3 = catchingFishStripeAPIJUnit6.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit3.CatchingFishCoroutine);
                int i3 = catchingFishDaggerRetrofit2.CatchingFishGlideWidgetKtor[1];
                if (i3 != 3 || CatchingFishViewModelFAB2) {
                    if (!catchingFishDaggerRetrofit2.CatchingFishCardViewRealm()) {
                        if (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit6 && catchingFishStripeAPIJUnit7.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit6.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor2;
                            catchingFishDaggerRetrofit2.CatchingFishDagger(CatchingFishDaggerWebsocket2, catchingFishDaggerRetrofit2.CatchingFishCloudMessaging() + CatchingFishDaggerWebsocket2);
                            CatchingFishLayoutInflater(i2, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2);
                        } else if (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit7 && catchingFishStripeAPIJUnit6.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket3 = CatchingFishReduxKtor2 - catchingFishStripeAPIJUnit7.CatchingFishDaggerWebsocket();
                            catchingFishDaggerRetrofit2.CatchingFishDagger(CatchingFishDaggerWebsocket3 - catchingFishDaggerRetrofit2.CatchingFishCloudMessaging(), CatchingFishDaggerWebsocket3);
                            CatchingFishLayoutInflater(i2, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2);
                        } else if (z2 && !catchingFishDaggerRetrofit2.CatchingFishGsonAppCompat()) {
                            CatchingFishCameraXIntent(i2, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2);
                        }
                    }
                } else if (i3 == 3 && catchingFishDaggerRetrofit2.CatchingFishGsonAppCompat >= 0 && catchingFishDaggerRetrofit2.CatchingFishParcelableFlux >= 0 && (catchingFishDaggerRetrofit2.CatchingFishMockkOkHttp == 8 || (catchingFishDaggerRetrofit2.CatchingFish == 0 && catchingFishDaggerRetrofit2.CatchingFishJUnitRealm == 0.0f))) {
                    if (!catchingFishDaggerRetrofit2.CatchingFishGsonAppCompat() && !catchingFishDaggerRetrofit2.CatchingFishMutableLiveData && z2 && !catchingFishDaggerRetrofit2.CatchingFishGsonAppCompat()) {
                        CatchingFishHandler(i2, catchingFishDaggerRetrofit, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (catchingFishDaggerRetrofit instanceof CatchingFishViewModelMockk) {
            return;
        }
        HashSet hashSet2 = CatchingFishLayout3.CatchingFishParcelableFAB;
        if (hashSet2 != null && CatchingFishLayout3.CatchingFishCoroutine) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit8 = (CatchingFishStripeAPIJUnit) it2.next();
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3 = catchingFishStripeAPIJUnit8.CatchingFishReduxKtor;
                int i4 = i + 1;
                boolean CatchingFishViewModelFAB3 = CatchingFishViewModelFAB(catchingFishDaggerRetrofit3);
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit9 = catchingFishDaggerRetrofit3.CatchingFishEspressoMockk;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit10 = catchingFishDaggerRetrofit3.CatchingFishCameraXIntent;
                if (catchingFishDaggerRetrofit3.CatchingFishCardViewRealm() && CatchingFishViewModelFAB3) {
                    CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit3, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
                }
                boolean z4 = (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit9 && (catchingFishStripeAPIJUnit2 = catchingFishStripeAPIJUnit10.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit2.CatchingFishCoroutine) || (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit10 && (catchingFishStripeAPIJUnit = catchingFishStripeAPIJUnit9.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit.CatchingFishCoroutine);
                int i5 = catchingFishDaggerRetrofit3.CatchingFishGlideWidgetKtor[1];
                if (i5 != 3 || CatchingFishViewModelFAB3) {
                    if (!catchingFishDaggerRetrofit3.CatchingFishCardViewRealm()) {
                        if (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit9 && catchingFishStripeAPIJUnit10.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket4 = catchingFishStripeAPIJUnit9.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor3;
                            catchingFishDaggerRetrofit3.CatchingFishDagger(CatchingFishDaggerWebsocket4, catchingFishDaggerRetrofit3.CatchingFishCloudMessaging() + CatchingFishDaggerWebsocket4);
                            CatchingFishLayoutInflater(i4, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3);
                        } else if (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit10 && catchingFishStripeAPIJUnit9.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket5 = CatchingFishReduxKtor3 - catchingFishStripeAPIJUnit10.CatchingFishDaggerWebsocket();
                            catchingFishDaggerRetrofit3.CatchingFishDagger(CatchingFishDaggerWebsocket5 - catchingFishDaggerRetrofit3.CatchingFishCloudMessaging(), CatchingFishDaggerWebsocket5);
                            CatchingFishLayoutInflater(i4, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3);
                        } else if (z4 && !catchingFishDaggerRetrofit3.CatchingFishGsonAppCompat()) {
                            CatchingFishCameraXIntent(i4, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3);
                        }
                    }
                } else if (i5 == 3 && catchingFishDaggerRetrofit3.CatchingFishGsonAppCompat >= 0 && catchingFishDaggerRetrofit3.CatchingFishParcelableFlux >= 0 && (catchingFishDaggerRetrofit3.CatchingFishMockkOkHttp == 8 || (catchingFishDaggerRetrofit3.CatchingFish == 0 && catchingFishDaggerRetrofit3.CatchingFishJUnitRealm == 0.0f))) {
                    if (!catchingFishDaggerRetrofit3.CatchingFishGsonAppCompat() && !catchingFishDaggerRetrofit3.CatchingFishMutableLiveData && z4 && !catchingFishDaggerRetrofit3.CatchingFishGsonAppCompat()) {
                        CatchingFishHandler(i4, catchingFishDaggerRetrofit, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3);
                    }
                }
            }
        }
        CatchingFishStripeAPIJUnit CatchingFishLayout4 = catchingFishDaggerRetrofit.CatchingFishLayout(6);
        if (CatchingFishLayout4.CatchingFishParcelableFAB != null && CatchingFishLayout4.CatchingFishCoroutine) {
            int CatchingFishReduxKtor4 = CatchingFishLayout4.CatchingFishReduxKtor();
            Iterator it3 = CatchingFishLayout4.CatchingFishParcelableFAB.iterator();
            while (it3.hasNext()) {
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit11 = (CatchingFishStripeAPIJUnit) it3.next();
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit4 = catchingFishStripeAPIJUnit11.CatchingFishReduxKtor;
                int i6 = i + 1;
                boolean CatchingFishViewModelFAB4 = CatchingFishViewModelFAB(catchingFishDaggerRetrofit4);
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit12 = catchingFishDaggerRetrofit4.CatchingFishHandler;
                if (catchingFishDaggerRetrofit4.CatchingFishCardViewRealm() && CatchingFishViewModelFAB4) {
                    CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit4, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
                }
                if (catchingFishDaggerRetrofit4.CatchingFishGlideWidgetKtor[z3 ? 1 : 0] != 3 || CatchingFishViewModelFAB4) {
                    if (!catchingFishDaggerRetrofit4.CatchingFishCardViewRealm()) {
                        if (catchingFishStripeAPIJUnit11 == catchingFishStripeAPIJUnit12) {
                            int CatchingFishDaggerWebsocket6 = catchingFishStripeAPIJUnit11.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor4;
                            if (catchingFishDaggerRetrofit4.CatchingFishFragmentFactory) {
                                int i7 = CatchingFishDaggerWebsocket6 - catchingFishDaggerRetrofit4.CatchingFishMoshiDaggerHilt;
                                int i8 = catchingFishDaggerRetrofit4.CatchingFishStateFlow + i7;
                                catchingFishDaggerRetrofit4.CatchingFishStripeAPI = i7;
                                catchingFishDaggerRetrofit4.CatchingFishEspressoMockk.CatchingFishEspressoTesting(i7);
                                catchingFishDaggerRetrofit4.CatchingFishCameraXIntent.CatchingFishEspressoTesting(i8);
                                catchingFishStripeAPIJUnit12.CatchingFishEspressoTesting(CatchingFishDaggerWebsocket6);
                                z = z3 ? 1 : 0;
                                catchingFishDaggerRetrofit4.CatchingFishEspressoTesting = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            CatchingFishLayoutInflater(i6, catchingFishRetrofitDagger, catchingFishDaggerRetrofit4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        catchingFishDaggerRetrofit.CatchingFishUnitTesting = z3;
    }

    public static final CatchingFishKtorToastRedux CatchingFishMVPRobolectric(CatchingFishAppCompatWidget catchingFishAppCompatWidget, int i) {
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        CatchingFishFABBiometric CatchingFishMVPRobolectric = catchingFishAppCompatWidget.CatchingFishMVPRobolectric();
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB2 = catchingFishAppCompatWidget.CatchingFishReduxKtor;
        int ordinal = CatchingFishMVPRobolectric.ordinal();
        CatchingFishKtorToastRedux catchingFishKtorToastRedux = CatchingFishKtorToastRedux.CatchingFishReduxKtor;
        if (ordinal != 0) {
            if (ordinal == 1) {
                CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB = CatchingFishGsonCardView.CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget);
                if (CatchingFishDaggerHiltFAB != null) {
                    return CatchingFishPayPal(CatchingFishDaggerHiltFAB, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new CatchingFishBiometricView();
                }
                if (!catchingFishFABStripeAPIFAB2.CatchingFishRoomDatabase) {
                    CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                }
                CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB2.CatchingFishViewModelFAB;
                CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
                loop0: while (true) {
                    if (CatchingFishJobScheduler == null) {
                        catchingFishFABStripeAPIFAB = null;
                        break;
                    }
                    if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 1024) != 0) {
                        while (catchingFishFABStripeAPIFAB3 != null) {
                            if ((catchingFishFABStripeAPIFAB3.CatchingFishWorkManager & 1024) != 0) {
                                catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB3;
                                while (catchingFishFABStripeAPIFAB != null) {
                                    if (catchingFishFABStripeAPIFAB instanceof CatchingFishAppCompatWidget) {
                                        break loop0;
                                    }
                                    catchingFishFABStripeAPIFAB = null;
                                }
                            }
                            catchingFishFABStripeAPIFAB3 = catchingFishFABStripeAPIFAB3.CatchingFishViewModelFAB;
                        }
                    }
                    CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                    catchingFishFABStripeAPIFAB3 = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
                }
                CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = (CatchingFishAppCompatWidget) catchingFishFABStripeAPIFAB;
                if (catchingFishAppCompatWidget2 == null) {
                    return catchingFishKtorToastRedux;
                }
                int ordinal2 = catchingFishAppCompatWidget2.CatchingFishMVPRobolectric().ordinal();
                if (ordinal2 == 0) {
                    return CatchingFishCardViewView(catchingFishAppCompatWidget2, i);
                }
                if (ordinal2 == 1) {
                    return CatchingFishMVPRobolectric(catchingFishAppCompatWidget2, i);
                }
                if (ordinal2 == 2) {
                    return CatchingFishKtorToastRedux.CatchingFishDaggerWebsocket;
                }
                if (ordinal2 != 3) {
                    throw new CatchingFishBiometricView();
                }
                CatchingFishKtorToastRedux CatchingFishMVPRobolectric2 = CatchingFishMVPRobolectric(catchingFishAppCompatWidget2, i);
                CatchingFishKtorToastRedux catchingFishKtorToastRedux2 = CatchingFishMVPRobolectric2 != catchingFishKtorToastRedux ? CatchingFishMVPRobolectric2 : null;
                return catchingFishKtorToastRedux2 == null ? CatchingFishCardViewView(catchingFishAppCompatWidget2, i) : catchingFishKtorToastRedux2;
            }
        }
        return catchingFishKtorToastRedux;
    }

    public static boolean CatchingFishMotionLayout(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final CatchingFishLifecycleRedux CatchingFishMutableLiveData(int i, CatchingFishMockkView catchingFishMockkView, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
        if (CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
            CatchingFishPayPalService = new CatchingFishLifecycleRedux(i, catchingFishMockkView, true);
            catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
        }
        CatchingFishLifecycleRedux catchingFishLifecycleRedux = (CatchingFishLifecycleRedux) CatchingFishPayPalService;
        if (!catchingFishLifecycleRedux.CatchingFishWorkManager.equals(catchingFishMockkView)) {
            catchingFishLifecycleRedux.CatchingFishWorkManager = catchingFishMockkView;
            if (catchingFishLifecycleRedux.CatchingFishDaggerWebsocket) {
                CatchingFishHiltFAB catchingFishHiltFAB = catchingFishLifecycleRedux.CatchingFishViewModelScope;
                if (catchingFishHiltFAB != null) {
                    CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI = catchingFishHiltFAB.CatchingFishParcelableFAB;
                    if (catchingFishLayoutStripeAPI != null) {
                        catchingFishLayoutStripeAPI.CatchingFishUnitTesting(catchingFishHiltFAB, null);
                    }
                    catchingFishLifecycleRedux.CatchingFishViewModelScope = null;
                }
                ArrayList arrayList = catchingFishLifecycleRedux.CatchingFishViewModelFAB;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        CatchingFishHiltFAB catchingFishHiltFAB2 = (CatchingFishHiltFAB) arrayList.get(i2);
                        CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI2 = catchingFishHiltFAB2.CatchingFishParcelableFAB;
                        if (catchingFishLayoutStripeAPI2 != null) {
                            catchingFishLayoutStripeAPI2.CatchingFishUnitTesting(catchingFishHiltFAB2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return catchingFishLifecycleRedux;
    }

    public static final String[] CatchingFishNavigation(CatchingFishMVPRobolectric catchingFishMVPRobolectric) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMVPRobolectric, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((CatchingFishSharedFlowMVVM) catchingFishMVPRobolectric).CatchingFishSnackbar.toArray(new String[0]);
    }

    public static final CatchingFishLayoutViewPager CatchingFishOkHttp(CatchingFishLayoutViewPager catchingFishLayoutViewPager) {
        if (catchingFishLayoutViewPager instanceof CatchingFishReduxMVI) {
            return catchingFishLayoutViewPager;
        }
        if (!(catchingFishLayoutViewPager instanceof CatchingFishSnackbarOkHttp)) {
            return new CatchingFishSnackbarOkHttp(catchingFishLayoutViewPager);
        }
        ((CatchingFishSnackbarOkHttp) catchingFishLayoutViewPager).getClass();
        return catchingFishLayoutViewPager;
    }

    public static Object CatchingFishParcelable(CatchingFishMockkView catchingFishMockkView, Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkView, "<this>");
        CatchingFishManifestMockk context = catchingFishWebsocketGradle.getContext();
        Object catchingFishMockkSnackbar = context == CatchingFishPayPalDataStore.CatchingFishReduxKtor ? new CatchingFishMockkSnackbar(catchingFishWebsocketGradle) : new CatchingFishJUnitFAB(catchingFishWebsocketGradle, context);
        CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(2, catchingFishMockkView);
        return catchingFishMockkView.CatchingFishDaggerWebsocket(obj, catchingFishMockkSnackbar);
    }

    public static final CatchingFishSharedFlowMVVM CatchingFishParcelableFAB(String str) {
        Set singleton = Collections.singleton(str);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(singleton, "singleton(...)");
        return new CatchingFishSharedFlowMVVM(singleton);
    }

    public static CatchingFishWebsocketGradle CatchingFishParcelableFlux(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebsocketGradle, "<this>");
        CatchingFishStateFlowGson catchingFishStateFlowGson = catchingFishWebsocketGradle instanceof CatchingFishStateFlowGson ? (CatchingFishStateFlowGson) catchingFishWebsocketGradle : null;
        if (catchingFishStateFlowGson == null || (catchingFishWebsocketGradle = catchingFishStateFlowGson.CatchingFishWorkManager) != null) {
            return catchingFishWebsocketGradle;
        }
        CatchingFishAndroidXJUnit catchingFishAndroidXJUnit = (CatchingFishAndroidXJUnit) catchingFishStateFlowGson.getContext().CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket);
        CatchingFishWebsocketGradle catchingFishPayPalRoom = catchingFishAndroidXJUnit != null ? new CatchingFishPayPalRoom((CatchingFishToastGradle) catchingFishAndroidXJUnit, catchingFishStateFlowGson) : catchingFishStateFlowGson;
        catchingFishStateFlowGson.CatchingFishWorkManager = catchingFishPayPalRoom;
        return catchingFishPayPalRoom;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    public static final CatchingFishKtorToastRedux CatchingFishPayPal(CatchingFishAppCompatWidget catchingFishAppCompatWidget, int i) {
        int ordinal = catchingFishAppCompatWidget.CatchingFishMVPRobolectric().ordinal();
        CatchingFishKtorToastRedux catchingFishKtorToastRedux = CatchingFishKtorToastRedux.CatchingFishReduxKtor;
        if (ordinal != 0) {
            CatchingFishKtorToastRedux catchingFishKtorToastRedux2 = CatchingFishKtorToastRedux.CatchingFishDaggerWebsocket;
            if (ordinal == 1) {
                CatchingFishAppCompatWidget CatchingFishDaggerHiltFAB = CatchingFishGsonCardView.CatchingFishDaggerHiltFAB(catchingFishAppCompatWidget);
                if (CatchingFishDaggerHiltFAB == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CatchingFishKtorToastRedux CatchingFishPayPal = CatchingFishPayPal(CatchingFishDaggerHiltFAB, i);
                if (CatchingFishPayPal == catchingFishKtorToastRedux) {
                    CatchingFishPayPal = null;
                }
                if (CatchingFishPayPal != null) {
                    return CatchingFishPayPal;
                }
                if (catchingFishAppCompatWidget.CatchingFishNavigation) {
                    return catchingFishKtorToastRedux;
                }
                catchingFishAppCompatWidget.CatchingFishNavigation = true;
                try {
                    CatchingFishCardViewFlux CatchingFishCardViewView = catchingFishAppCompatWidget.CatchingFishCardViewView();
                    CatchingFishHiltSnackbar catchingFishHiltSnackbar = new CatchingFishHiltSnackbar(i);
                    CatchingFishViewManifest focusOwner = ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishAppCompatWidget)).getFocusOwner();
                    CatchingFishAppCompatWidget catchingFishAppCompatWidget2 = ((CatchingFishExoPlayerOkHttp) focusOwner).CatchingFishViewModelFAB;
                    CatchingFishCardViewView.CatchingFishCloudMessaging.CatchingFishFragmentHandler(catchingFishHiltSnackbar);
                    CatchingFishAppCompatWidget catchingFishAppCompatWidget3 = ((CatchingFishExoPlayerOkHttp) focusOwner).CatchingFishViewModelFAB;
                    if (!catchingFishHiltSnackbar.CatchingFishSnackbar) {
                        return (catchingFishAppCompatWidget2 == catchingFishAppCompatWidget3 || catchingFishAppCompatWidget3 == null) ? catchingFishKtorToastRedux : CatchingFishMVIMoshiMVP.CatchingFishReduxKtor == CatchingFishMVIMoshiMVP.CatchingFishCoroutine ? catchingFishKtorToastRedux2 : CatchingFishKtorToastRedux.CatchingFishWorkManager;
                    }
                    CatchingFishMVIMoshiMVP catchingFishMVIMoshiMVP = CatchingFishMVIMoshiMVP.CatchingFishSnackbar;
                    return catchingFishKtorToastRedux2;
                } finally {
                    catchingFishAppCompatWidget.CatchingFishNavigation = false;
                }
            }
            if (ordinal == 2) {
                return catchingFishKtorToastRedux2;
            }
            if (ordinal != 3) {
                throw new CatchingFishBiometricView();
            }
        }
        return catchingFishKtorToastRedux;
    }

    public static final CatchingFishRealmIntent CatchingFishPayPalLiveData(CatchingFishEspressoPayPal catchingFishEspressoPayPal, CatchingFishFABCoroutine catchingFishFABCoroutine, CatchingFishRealmParcelable catchingFishRealmParcelable, Float f) {
        CatchingFishMVIRobolectric.CatchingFishParcelableFAB.getClass();
        CatchingFishMVPService catchingFishMVPService = CatchingFishMVPService.CatchingFishParcelableFAB;
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(16, catchingFishEspressoPayPal, CatchingFishPayPalDataStore.CatchingFishReduxKtor);
        CatchingFishHandlerAndroidX CatchingFishLayout2 = CatchingFishFirebaseDagger.CatchingFishLayout(f);
        CatchingFishManifestMockk catchingFishManifestMockk = (CatchingFishManifestMockk) catchingFishViewModelIntent.CatchingFishWorkManager;
        CatchingFishLayoutViewPager catchingFishLayoutViewPager = (CatchingFishLayoutViewPager) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        CatchingFishFABManifest catchingFishFABManifest = catchingFishRealmParcelable.equals(CatchingFishViewAnimation.CatchingFishParcelableFAB) ? CatchingFishFABManifest.CatchingFishReduxKtor : CatchingFishFABManifest.CatchingFishViewModelScope;
        CatchingFishWidgetView catchingFishWidgetView = new CatchingFishWidgetView(catchingFishRealmParcelable, catchingFishLayoutViewPager, CatchingFishLayout2, f, null);
        CatchingFishManifestMockk CatchingFishJetpackCompose2 = CatchingFishRobolectricHilt.CatchingFishJetpackCompose(catchingFishFABCoroutine.CatchingFishParcelableFAB(), catchingFishManifestMockk, true);
        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
        if (CatchingFishJetpackCompose2 != catchingFishGlideGson && CatchingFishJetpackCompose2.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket) == null) {
            CatchingFishJetpackCompose2 = CatchingFishJetpackCompose2.CatchingFishAnimationMockk(catchingFishGlideGson);
        }
        CatchingFishCloudMessaging catchingFishFluxHilt = catchingFishFABManifest == CatchingFishFABManifest.CatchingFishDaggerWebsocket ? new CatchingFishFluxHilt(CatchingFishJetpackCompose2, catchingFishWidgetView) : new CatchingFishFragmentRealm(CatchingFishJetpackCompose2, true);
        catchingFishFluxHilt.CatchingFishCustomViewJUnit(catchingFishFABManifest, catchingFishFluxHilt, catchingFishWidgetView);
        return new CatchingFishRealmIntent(CatchingFishLayout2);
    }

    public static final View CatchingFishPayPalService(CatchingFishLayoutContext catchingFishLayoutContext) {
        if (!((CatchingFishFABStripeAPIFAB) catchingFishLayoutContext).CatchingFishReduxKtor.CatchingFishRoomDatabase) {
            CatchingFishFluxGradle.CatchingFishSnackbar("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) CatchingFishMVVMBundleFAB.CatchingFishParcelableFAB(CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishLayoutContext));
    }

    public static CatchingFishToastLifecycle CatchingFishReduxKtor() {
        CatchingFishToastLifecycle catchingFishToastLifecycle = CatchingFishToastLifecycle.CatchingFishEspressoTesting;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishToastLifecycle);
        CatchingFishToastLifecycle catchingFishToastLifecycle2 = catchingFishToastLifecycle.CatchingFishWorkManager;
        if (catchingFishToastLifecycle2 == null) {
            long nanoTime = System.nanoTime();
            CatchingFishToastLifecycle.CatchingFishLayout.await(CatchingFishToastLifecycle.CatchingFishFragmentHandler, TimeUnit.MILLISECONDS);
            CatchingFishToastLifecycle catchingFishToastLifecycle3 = CatchingFishToastLifecycle.CatchingFishEspressoTesting;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishToastLifecycle3);
            if (catchingFishToastLifecycle3.CatchingFishWorkManager != null || System.nanoTime() - nanoTime < CatchingFishToastLifecycle.CatchingFishCloudMessaging) {
                return null;
            }
            return CatchingFishToastLifecycle.CatchingFishEspressoTesting;
        }
        long nanoTime2 = catchingFishToastLifecycle2.CatchingFishViewModelScope - System.nanoTime();
        if (nanoTime2 > 0) {
            CatchingFishToastLifecycle.CatchingFishLayout.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        CatchingFishToastLifecycle catchingFishToastLifecycle4 = CatchingFishToastLifecycle.CatchingFishEspressoTesting;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishToastLifecycle4);
        catchingFishToastLifecycle4.CatchingFishWorkManager = catchingFishToastLifecycle2.CatchingFishWorkManager;
        catchingFishToastLifecycle2.CatchingFishWorkManager = null;
        return catchingFishToastLifecycle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object CatchingFishRoomDatabase(CatchingFishLayoutViewPager catchingFishLayoutViewPager, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishPicassoSnackbar catchingFishPicassoSnackbar;
        int i;
        CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps;
        CatchingFishUnitTestingGson e;
        CatchingFishCameraXRedux catchingFishCameraXRedux;
        if (catchingFishStateFlowGson instanceof CatchingFishPicassoSnackbar) {
            catchingFishPicassoSnackbar = (CatchingFishPicassoSnackbar) catchingFishStateFlowGson;
            int i2 = catchingFishPicassoSnackbar.CatchingFishFragmentHandler;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishPicassoSnackbar.CatchingFishFragmentHandler = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishPicassoSnackbar.CatchingFishLayout;
                i = catchingFishPicassoSnackbar.CatchingFishFragmentHandler;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps2 = new CatchingFishRoomGoogleMaps();
                    CatchingFishCameraXRedux catchingFishCameraXRedux2 = new CatchingFishCameraXRedux(2, catchingFishRoomGoogleMaps2);
                    try {
                        catchingFishPicassoSnackbar.CatchingFishViewModelScope = catchingFishRoomGoogleMaps2;
                        catchingFishPicassoSnackbar.CatchingFishViewModelFAB = catchingFishCameraXRedux2;
                        catchingFishPicassoSnackbar.CatchingFishFragmentHandler = 1;
                        Object CatchingFishCoroutine2 = catchingFishLayoutViewPager.CatchingFishCoroutine(catchingFishCameraXRedux2, catchingFishPicassoSnackbar);
                        Object obj2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (CatchingFishCoroutine2 == obj2) {
                            return obj2;
                        }
                        catchingFishRoomGoogleMaps = catchingFishRoomGoogleMaps2;
                    } catch (CatchingFishUnitTestingGson e2) {
                        catchingFishRoomGoogleMaps = catchingFishRoomGoogleMaps2;
                        e = e2;
                        catchingFishCameraXRedux = catchingFishCameraXRedux2;
                        if (e.CatchingFishReduxKtor != catchingFishCameraXRedux) {
                            throw e;
                        }
                        return catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catchingFishCameraXRedux = catchingFishPicassoSnackbar.CatchingFishViewModelFAB;
                    catchingFishRoomGoogleMaps = catchingFishPicassoSnackbar.CatchingFishViewModelScope;
                    try {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    } catch (CatchingFishUnitTestingGson e3) {
                        e = e3;
                        if (e.CatchingFishReduxKtor != catchingFishCameraXRedux) {
                        }
                        return catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                    }
                }
                return catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
            }
        }
        catchingFishPicassoSnackbar = new CatchingFishPicassoSnackbar(catchingFishStateFlowGson);
        Object obj3 = catchingFishPicassoSnackbar.CatchingFishLayout;
        i = catchingFishPicassoSnackbar.CatchingFishFragmentHandler;
        if (i != 0) {
        }
        return catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
    }

    public static final void CatchingFishSensorManager(CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit, CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt) {
        Object CatchingFishViewModelScope2 = catchingFishMVIGraphQLHilt.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishWorkManager);
        if (CatchingFishViewModelScope2 == null) {
            CatchingFishViewModelScope2 = null;
        }
        if (CatchingFishViewModelScope2 != null) {
            throw new ClassCastException();
        }
        ArrayList arrayList = new ArrayList();
        Object CatchingFishViewModelScope3 = catchingFishMVIGraphQLHilt.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishDaggerWebsocket);
        if ((CatchingFishViewModelScope3 != null ? CatchingFishViewModelScope3 : null) != null) {
            List CatchingFishFragmentHandler2 = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
            int size = CatchingFishFragmentHandler2.size();
            for (int i = 0; i < size; i++) {
                CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler2.get(i);
                if (catchingFishMVIGraphQLHilt2.CatchingFishCloudMessaging().CatchingFishReduxKtor.CatchingFishCoroutine(CatchingFishServiceMVI.CatchingFishMVPRobolectric)) {
                    arrayList.add(catchingFishMVIGraphQLHilt2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean CatchingFishViewModelScope4 = CatchingFishViewModelScope(arrayList);
        catchingFishViewJUnitJUnit.CatchingFishParcelableFAB.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(CatchingFishViewModelScope4 ? 1 : arrayList.size(), CatchingFishViewModelScope4 ? arrayList.size() : 1, false, 0));
    }

    public static final CatchingFishFluxFirebase CatchingFishSnackbar() {
        Paint paint = new Paint(7);
        CatchingFishFluxFirebase catchingFishFluxFirebase = new CatchingFishFluxFirebase();
        catchingFishFluxFirebase.CatchingFishSnackbar = paint;
        catchingFishFluxFirebase.CatchingFishParcelableFAB = 3;
        return catchingFishFluxFirebase;
    }

    public static void CatchingFishSpannableWidget(int i, CatchingFishRetrofitDagger catchingFishRetrofitDagger, CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, boolean z) {
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2;
        boolean z2;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4;
        if (catchingFishDaggerRetrofit.CatchingFishOkHttp) {
            return;
        }
        if (!(catchingFishDaggerRetrofit instanceof CatchingFishGsonAppCompat) && catchingFishDaggerRetrofit.CatchingFishCardViewRealm() && CatchingFishViewModelFAB(catchingFishDaggerRetrofit)) {
            CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
        }
        CatchingFishStripeAPIJUnit CatchingFishLayout2 = catchingFishDaggerRetrofit.CatchingFishLayout(2);
        CatchingFishStripeAPIJUnit CatchingFishLayout3 = catchingFishDaggerRetrofit.CatchingFishLayout(4);
        int CatchingFishReduxKtor2 = CatchingFishLayout2.CatchingFishReduxKtor();
        int CatchingFishReduxKtor3 = CatchingFishLayout3.CatchingFishReduxKtor();
        HashSet hashSet = CatchingFishLayout2.CatchingFishParcelableFAB;
        if (hashSet != null && CatchingFishLayout2.CatchingFishCoroutine) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit5 = (CatchingFishStripeAPIJUnit) it.next();
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = catchingFishStripeAPIJUnit5.CatchingFishReduxKtor;
                int i2 = i + 1;
                boolean CatchingFishViewModelFAB2 = CatchingFishViewModelFAB(catchingFishDaggerRetrofit2);
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit6 = catchingFishDaggerRetrofit2.CatchingFishSensorManager;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit7 = catchingFishDaggerRetrofit2.CatchingFishDagger;
                if (catchingFishDaggerRetrofit2.CatchingFishCardViewRealm() && CatchingFishViewModelFAB2) {
                    z2 = true;
                    CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit2, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
                } else {
                    z2 = true;
                }
                boolean z3 = ((catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit6 && (catchingFishStripeAPIJUnit4 = catchingFishStripeAPIJUnit7.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit4.CatchingFishCoroutine) || (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit7 && (catchingFishStripeAPIJUnit3 = catchingFishStripeAPIJUnit6.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit3.CatchingFishCoroutine)) ? z2 : false;
                int i3 = catchingFishDaggerRetrofit2.CatchingFishGlideWidgetKtor[0];
                if (i3 != 3 || CatchingFishViewModelFAB2) {
                    if (!catchingFishDaggerRetrofit2.CatchingFishCardViewRealm()) {
                        if (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit6 && catchingFishStripeAPIJUnit7.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket2 = catchingFishStripeAPIJUnit6.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor2;
                            catchingFishDaggerRetrofit2.CatchingFishEspressoMockk(CatchingFishDaggerWebsocket2, catchingFishDaggerRetrofit2.CatchingFishRoomDatabase() + CatchingFishDaggerWebsocket2);
                            CatchingFishSpannableWidget(i2, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2, z);
                        } else if (catchingFishStripeAPIJUnit5 == catchingFishStripeAPIJUnit7 && catchingFishStripeAPIJUnit6.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket3 = CatchingFishReduxKtor2 - catchingFishStripeAPIJUnit7.CatchingFishDaggerWebsocket();
                            catchingFishDaggerRetrofit2.CatchingFishEspressoMockk(CatchingFishDaggerWebsocket3 - catchingFishDaggerRetrofit2.CatchingFishRoomDatabase(), CatchingFishDaggerWebsocket3);
                            CatchingFishSpannableWidget(i2, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2, z);
                        } else if (z3 && !catchingFishDaggerRetrofit2.CatchingFishParcelableFlux()) {
                            CatchingFishEspressoMockk(i2, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2, z);
                        }
                    }
                } else if (i3 == 3 && catchingFishDaggerRetrofit2.CatchingFishDaggerHiltFAB >= 0 && catchingFishDaggerRetrofit2.CatchingFishCoroutineFlow >= 0 && (catchingFishDaggerRetrofit2.CatchingFishMockkOkHttp == 8 || (catchingFishDaggerRetrofit2.CatchingFishNavigation == 0 && catchingFishDaggerRetrofit2.CatchingFishJUnitRealm == 0.0f))) {
                    if (!catchingFishDaggerRetrofit2.CatchingFishParcelableFlux() && !catchingFishDaggerRetrofit2.CatchingFishMutableLiveData && z3 && !catchingFishDaggerRetrofit2.CatchingFishParcelableFlux()) {
                        CatchingFishDagger(i2, catchingFishDaggerRetrofit, catchingFishRetrofitDagger, catchingFishDaggerRetrofit2, z);
                    }
                }
            }
        }
        if (catchingFishDaggerRetrofit instanceof CatchingFishViewModelMockk) {
            return;
        }
        HashSet hashSet2 = CatchingFishLayout3.CatchingFishParcelableFAB;
        if (hashSet2 != null && CatchingFishLayout3.CatchingFishCoroutine) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit8 = (CatchingFishStripeAPIJUnit) it2.next();
                CatchingFishDaggerRetrofit catchingFishDaggerRetrofit3 = catchingFishStripeAPIJUnit8.CatchingFishReduxKtor;
                int i4 = i + 1;
                boolean CatchingFishViewModelFAB3 = CatchingFishViewModelFAB(catchingFishDaggerRetrofit3);
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit9 = catchingFishDaggerRetrofit3.CatchingFishSensorManager;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit10 = catchingFishDaggerRetrofit3.CatchingFishDagger;
                if (catchingFishDaggerRetrofit3.CatchingFishCardViewRealm() && CatchingFishViewModelFAB3) {
                    CatchingFishGsonAppCompat.CatchingFishStateFlow(catchingFishDaggerRetrofit3, catchingFishRetrofitDagger, new CatchingFishGsonBiometric());
                }
                boolean z4 = (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit9 && (catchingFishStripeAPIJUnit2 = catchingFishStripeAPIJUnit10.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit2.CatchingFishCoroutine) || (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit10 && (catchingFishStripeAPIJUnit = catchingFishStripeAPIJUnit9.CatchingFishWorkManager) != null && catchingFishStripeAPIJUnit.CatchingFishCoroutine);
                int i5 = catchingFishDaggerRetrofit3.CatchingFishGlideWidgetKtor[0];
                if (i5 != 3 || CatchingFishViewModelFAB3) {
                    if (!catchingFishDaggerRetrofit3.CatchingFishCardViewRealm()) {
                        if (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit9 && catchingFishStripeAPIJUnit10.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket4 = catchingFishStripeAPIJUnit9.CatchingFishDaggerWebsocket() + CatchingFishReduxKtor3;
                            catchingFishDaggerRetrofit3.CatchingFishEspressoMockk(CatchingFishDaggerWebsocket4, catchingFishDaggerRetrofit3.CatchingFishRoomDatabase() + CatchingFishDaggerWebsocket4);
                            CatchingFishSpannableWidget(i4, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3, z);
                        } else if (catchingFishStripeAPIJUnit8 == catchingFishStripeAPIJUnit10 && catchingFishStripeAPIJUnit9.CatchingFishWorkManager == null) {
                            int CatchingFishDaggerWebsocket5 = CatchingFishReduxKtor3 - catchingFishStripeAPIJUnit10.CatchingFishDaggerWebsocket();
                            catchingFishDaggerRetrofit3.CatchingFishEspressoMockk(CatchingFishDaggerWebsocket5 - catchingFishDaggerRetrofit3.CatchingFishRoomDatabase(), CatchingFishDaggerWebsocket5);
                            CatchingFishSpannableWidget(i4, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3, z);
                        } else if (z4 && !catchingFishDaggerRetrofit3.CatchingFishParcelableFlux()) {
                            CatchingFishEspressoMockk(i4, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3, z);
                        }
                    }
                } else if (i5 == 3 && catchingFishDaggerRetrofit3.CatchingFishDaggerHiltFAB >= 0 && catchingFishDaggerRetrofit3.CatchingFishCoroutineFlow >= 0) {
                    if (catchingFishDaggerRetrofit3.CatchingFishMockkOkHttp == 8 || (catchingFishDaggerRetrofit3.CatchingFishNavigation == 0 && catchingFishDaggerRetrofit3.CatchingFishJUnitRealm == 0.0f)) {
                        if (!catchingFishDaggerRetrofit3.CatchingFishParcelableFlux() && !catchingFishDaggerRetrofit3.CatchingFishMutableLiveData && z4 && !catchingFishDaggerRetrofit3.CatchingFishParcelableFlux()) {
                            CatchingFishDagger(i4, catchingFishDaggerRetrofit, catchingFishRetrofitDagger, catchingFishDaggerRetrofit3, z);
                        }
                    }
                }
            }
        }
        catchingFishDaggerRetrofit.CatchingFishOkHttp = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object CatchingFishStateLiveData(CatchingFishLayoutViewPager catchingFishLayoutViewPager, CatchingFishMockkView catchingFishMockkView, CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishToastFAB catchingFishToastFAB;
        int i;
        CatchingFishMockkView catchingFishMockkView2;
        CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps;
        CatchingFishUnitTestingGson e;
        CatchingFishOkHttpGlide catchingFishOkHttpGlide;
        Object obj;
        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishAdMobFAB.CatchingFishViewModelScope;
        if (catchingFishStateFlowGson instanceof CatchingFishToastFAB) {
            catchingFishToastFAB = (CatchingFishToastFAB) catchingFishStateFlowGson;
            int i2 = catchingFishToastFAB.CatchingFishCloudMessaging;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishToastFAB.CatchingFishCloudMessaging = i2 - Integer.MIN_VALUE;
                Object obj2 = catchingFishToastFAB.CatchingFishFragmentHandler;
                i = catchingFishToastFAB.CatchingFishCloudMessaging;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                    CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps2 = new CatchingFishRoomGoogleMaps();
                    catchingFishRoomGoogleMaps2.CatchingFishReduxKtor = catchingFishFluxWorkManager;
                    CatchingFishOkHttpGlide catchingFishOkHttpGlide2 = new CatchingFishOkHttpGlide(catchingFishMockkView, catchingFishRoomGoogleMaps2);
                    try {
                        catchingFishToastFAB.CatchingFishViewModelScope = (CatchingFishMVIBundle) catchingFishMockkView;
                        catchingFishToastFAB.CatchingFishViewModelFAB = catchingFishRoomGoogleMaps2;
                        catchingFishToastFAB.CatchingFishLayout = catchingFishOkHttpGlide2;
                        catchingFishToastFAB.CatchingFishCloudMessaging = 1;
                        Object CatchingFishCoroutine2 = catchingFishLayoutViewPager.CatchingFishCoroutine(catchingFishOkHttpGlide2, catchingFishToastFAB);
                        Object obj3 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (CatchingFishCoroutine2 == obj3) {
                            return obj3;
                        }
                        catchingFishMockkView2 = catchingFishMockkView;
                        catchingFishRoomGoogleMaps = catchingFishRoomGoogleMaps2;
                    } catch (CatchingFishUnitTestingGson e2) {
                        catchingFishMockkView2 = catchingFishMockkView;
                        catchingFishRoomGoogleMaps = catchingFishRoomGoogleMaps2;
                        e = e2;
                        catchingFishOkHttpGlide = catchingFishOkHttpGlide2;
                        if (e.CatchingFishReduxKtor != catchingFishOkHttpGlide) {
                            throw e;
                        }
                        obj = catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                        if (obj == catchingFishFluxWorkManager) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catchingFishOkHttpGlide = catchingFishToastFAB.CatchingFishLayout;
                    catchingFishRoomGoogleMaps = catchingFishToastFAB.CatchingFishViewModelFAB;
                    catchingFishMockkView2 = (CatchingFishMockkView) catchingFishToastFAB.CatchingFishViewModelScope;
                    try {
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                    } catch (CatchingFishUnitTestingGson e3) {
                        e = e3;
                        if (e.CatchingFishReduxKtor != catchingFishOkHttpGlide) {
                        }
                        obj = catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                        if (obj == catchingFishFluxWorkManager) {
                        }
                    }
                }
                obj = catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
                if (obj == catchingFishFluxWorkManager) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + catchingFishMockkView2);
            }
        }
        catchingFishToastFAB = new CatchingFishToastFAB(catchingFishStateFlowGson);
        Object obj22 = catchingFishToastFAB.CatchingFishFragmentHandler;
        i = catchingFishToastFAB.CatchingFishCloudMessaging;
        if (i != 0) {
        }
        obj = catchingFishRoomGoogleMaps.CatchingFishReduxKtor;
        if (obj == catchingFishFluxWorkManager) {
        }
    }

    public static void CatchingFishUnitTesting(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!CatchingFishRoomDatabase) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    CatchingFishAnimationMockk = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    CatchingFishStateLiveData = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    CatchingFishAnimationMockk = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    CatchingFishStateLiveData = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = CatchingFishAnimationMockk;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = CatchingFishStateLiveData;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            CatchingFishRoomDatabase = true;
        }
        if (z) {
            try {
                Method method4 = CatchingFishAnimationMockk;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = CatchingFishStateLiveData) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static boolean CatchingFishViewModelFAB(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit) {
        int[] iArr = catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor;
        int i = iArr[0];
        int i2 = iArr[1];
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = catchingFishDaggerRetrofit.CatchingFishAppCompat;
        CatchingFishGsonAppCompat catchingFishGsonAppCompat = catchingFishDaggerRetrofit2 != null ? (CatchingFishGsonAppCompat) catchingFishDaggerRetrofit2 : null;
        if (catchingFishGsonAppCompat != null) {
            int i3 = catchingFishGsonAppCompat.CatchingFishGlideWidgetKtor[0];
        }
        if (catchingFishGsonAppCompat != null) {
            int i4 = catchingFishGsonAppCompat.CatchingFishGlideWidgetKtor[1];
        }
        boolean z = i == 1 || catchingFishDaggerRetrofit.CatchingFishPayPal() || i == 2 || (i == 3 && catchingFishDaggerRetrofit.CatchingFishNavigation == 0 && catchingFishDaggerRetrofit.CatchingFishJUnitRealm == 0.0f && catchingFishDaggerRetrofit.CatchingFishJetpackCompose(0)) || (i == 3 && catchingFishDaggerRetrofit.CatchingFishNavigation == 1 && catchingFishDaggerRetrofit.CatchingFishCoroutineFlow(0, catchingFishDaggerRetrofit.CatchingFishRoomDatabase()));
        boolean z2 = i2 == 1 || catchingFishDaggerRetrofit.CatchingFishCardViewView() || i2 == 2 || (i2 == 3 && catchingFishDaggerRetrofit.CatchingFish == 0 && catchingFishDaggerRetrofit.CatchingFishJUnitRealm == 0.0f && catchingFishDaggerRetrofit.CatchingFishJetpackCompose(1)) || (i2 == 3 && catchingFishDaggerRetrofit.CatchingFish == 1 && catchingFishDaggerRetrofit.CatchingFishCoroutineFlow(1, catchingFishDaggerRetrofit.CatchingFishCloudMessaging()));
        return (catchingFishDaggerRetrofit.CatchingFishJUnitRealm > 0.0f && (z || z2)) || (z && z2);
    }

    public static final boolean CatchingFishViewModelScope(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(arrayList);
                int i = 0;
                while (i < CatchingFishMotionLayout) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt = (CatchingFishMVIGraphQLHilt) obj2;
                    CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = (CatchingFishMVIGraphQLHilt) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope().CatchingFishParcelableFAB() >> 32)) - Float.intBitsToFloat((int) (catchingFishMVIGraphQLHilt.CatchingFishViewModelScope().CatchingFishParcelableFAB() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope().CatchingFishParcelableFAB() & 4294967295L)) - Float.intBitsToFloat((int) (catchingFishMVIGraphQLHilt.CatchingFishViewModelScope().CatchingFishParcelableFAB() & 4294967295L)));
                    arrayList2.add(new CatchingFishToolbarMVIMVVM((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((CatchingFishToolbarMVIMVVM) CatchingFishCameraXCameraX.CatchingFishStateFlow(list)).CatchingFishParcelableFAB;
            } else {
                if (list.isEmpty()) {
                    CatchingFishReduxFirebase.CatchingFishSnackbar("Empty collection can't be reduced.");
                }
                Object CatchingFishStateFlow = CatchingFishCameraXCameraX.CatchingFishStateFlow(list);
                int CatchingFishMotionLayout2 = CatchingFishToastCustomView.CatchingFishMotionLayout(list);
                if (1 <= CatchingFishMotionLayout2) {
                    int i2 = 1;
                    while (true) {
                        CatchingFishStateFlow = new CatchingFishToolbarMVIMVVM(CatchingFishToolbarMVIMVVM.CatchingFishCoroutine(((CatchingFishToolbarMVIMVVM) CatchingFishStateFlow).CatchingFishParcelableFAB, ((CatchingFishToolbarMVIMVVM) list.get(i2)).CatchingFishParcelableFAB));
                        if (i2 == CatchingFishMotionLayout2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((CatchingFishToolbarMVIMVVM) CatchingFishStateFlow).CatchingFishParcelableFAB;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static CatchingFishLayoutViewPager CatchingFishWorkManager(CatchingFishLayoutViewPager catchingFishLayoutViewPager, int i) {
        CatchingFishCoroutineToast catchingFishCoroutineToast;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
        }
        if (i == -1) {
            i = 0;
            catchingFishCoroutineToast = CatchingFishCoroutineToast.CatchingFishDaggerWebsocket;
        } else {
            catchingFishCoroutineToast = CatchingFishCoroutineToast.CatchingFishReduxKtor;
        }
        boolean z = catchingFishLayoutViewPager instanceof CatchingFishMVIAndroidXKtor;
        CatchingFishPayPalDataStore catchingFishPayPalDataStore = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
        return z ? ((CatchingFishMVIAndroidXKtor) catchingFishLayoutViewPager).CatchingFishDaggerWebsocket(catchingFishPayPalDataStore, i, catchingFishCoroutineToast) : new CatchingFishRoomPicasso(catchingFishLayoutViewPager, catchingFishPayPalDataStore, i, catchingFishCoroutineToast);
    }

    public abstract void CatchingFishCardViewRealm(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle);

    public abstract void CatchingFishGsonAppCompat(Throwable th);
}
