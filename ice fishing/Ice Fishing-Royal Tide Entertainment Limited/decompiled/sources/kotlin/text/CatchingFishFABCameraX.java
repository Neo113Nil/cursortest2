package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishFABCameraX {
    public static boolean CatchingFishCoroutine = false;
    public static WeakHashMap CatchingFishParcelableFAB;
    public static Field CatchingFishSnackbar;
    public static final int[] CatchingFishReduxKtor = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final CatchingFishParcelableView CatchingFishDaggerWebsocket = new CatchingFishParcelableView();
    public static final CatchingFishToolbarDagger CatchingFishWorkManager = new CatchingFishToolbarDagger();

    public static void CatchingFishAnimationMockk(View view, CatchingFishReduxLayout catchingFishReduxLayout) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(catchingFishReduxLayout != null ? new CatchingFishOkHttpMVP(catchingFishReduxLayout) : null);
            return;
        }
        PathInterpolator pathInterpolator = CatchingFishAdMobCameraXFAB.CatchingFishDaggerWebsocket;
        View.OnApplyWindowInsetsListener catchingFishGlideAdMobHilt = catchingFishReduxLayout != null ? new CatchingFishGlideAdMobHilt(view, catchingFishReduxLayout) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, catchingFishGlideAdMobHilt);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(catchingFishGlideAdMobHilt);
        }
    }

    public static void CatchingFishCloudMessaging(View view, CatchingFishBundleContext catchingFishBundleContext, CatchingFishFluxBiometric catchingFishFluxBiometric) {
        CatchingFishBundleContext catchingFishBundleContext2 = new CatchingFishBundleContext(null, catchingFishBundleContext.CatchingFishSnackbar, null, catchingFishFluxBiometric, catchingFishBundleContext.CatchingFishCoroutine);
        View.AccessibilityDelegate CatchingFishReduxKtor2 = CatchingFishReduxKtor(view);
        CatchingFishAndroidX catchingFishAndroidX = CatchingFishReduxKtor2 == null ? null : CatchingFishReduxKtor2 instanceof CatchingFishAppCompat ? ((CatchingFishAppCompat) CatchingFishReduxKtor2).CatchingFishParcelableFAB : new CatchingFishAndroidX(CatchingFishReduxKtor2);
        if (catchingFishAndroidX == null) {
            catchingFishAndroidX = new CatchingFishAndroidX();
        }
        CatchingFishOkHttp(view, catchingFishAndroidX);
        CatchingFishFragmentHandler(view, catchingFishBundleContext2.CatchingFishParcelableFAB());
        CatchingFishWorkManager(view).add(catchingFishBundleContext2);
        CatchingFishViewModelFAB(view, 0);
    }

    public static boolean CatchingFishCoroutine(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = CatchingFishToolbarEspresso.CatchingFishReduxKtor;
        CatchingFishToolbarEspresso catchingFishToolbarEspresso = (CatchingFishToolbarEspresso) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (catchingFishToolbarEspresso == null) {
            catchingFishToolbarEspresso = new CatchingFishToolbarEspresso();
            catchingFishToolbarEspresso.CatchingFishParcelableFAB = null;
            catchingFishToolbarEspresso.CatchingFishSnackbar = null;
            catchingFishToolbarEspresso.CatchingFishCoroutine = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, catchingFishToolbarEspresso);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = catchingFishToolbarEspresso.CatchingFishParcelableFAB;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = CatchingFishToolbarEspresso.CatchingFishReduxKtor;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (catchingFishToolbarEspresso.CatchingFishParcelableFAB == null) {
                            catchingFishToolbarEspresso.CatchingFishParcelableFAB = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = CatchingFishToolbarEspresso.CatchingFishReduxKtor;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                catchingFishToolbarEspresso.CatchingFishParcelableFAB.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    catchingFishToolbarEspresso.CatchingFishParcelableFAB.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View CatchingFishParcelableFAB2 = catchingFishToolbarEspresso.CatchingFishParcelableFAB(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (CatchingFishParcelableFAB2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (catchingFishToolbarEspresso.CatchingFishSnackbar == null) {
                    catchingFishToolbarEspresso.CatchingFishSnackbar = new SparseArray();
                }
                catchingFishToolbarEspresso.CatchingFishSnackbar.put(keyCode, new WeakReference(CatchingFishParcelableFAB2));
            }
        }
        return CatchingFishParcelableFAB2 != null;
    }

    public static CharSequence CatchingFishDaggerWebsocket(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = CatchingFishHandlerMoshi.CatchingFishParcelableFAB(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void CatchingFishEspressoTesting(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishEspressoGson.CatchingFishSnackbar(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void CatchingFishFragmentHandler(View view, int i) {
        ArrayList CatchingFishWorkManager2 = CatchingFishWorkManager(view);
        for (int i2 = 0; i2 < CatchingFishWorkManager2.size(); i2++) {
            if (((CatchingFishBundleContext) CatchingFishWorkManager2.get(i2)).CatchingFishParcelableFAB() == i) {
                CatchingFishWorkManager2.remove(i2);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CatchingFishMVIOkHttp CatchingFishLayout(View view, CatchingFishMVIOkHttp catchingFishMVIOkHttp) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(catchingFishMVIOkHttp);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return CatchingFishRoomToastMVVM.CatchingFishSnackbar(view, catchingFishMVIOkHttp);
        }
        CatchingFishFABAndroidXKtor catchingFishFABAndroidXKtor = (CatchingFishFABAndroidXKtor) view.getTag(R.id.tag_on_receive_content_listener);
        CatchingFishServiceMVPRedux catchingFishServiceMVPRedux = CatchingFishDaggerWebsocket;
        if (catchingFishFABAndroidXKtor == null) {
            if (view instanceof CatchingFishServiceMVPRedux) {
                catchingFishServiceMVPRedux = (CatchingFishServiceMVPRedux) view;
            }
            return catchingFishServiceMVPRedux.CatchingFishParcelableFAB(catchingFishMVIOkHttp);
        }
        CatchingFishMVIOkHttp CatchingFishParcelableFAB2 = CatchingFishFABAndroidXKtor.CatchingFishParcelableFAB(view, catchingFishMVIOkHttp);
        if (CatchingFishParcelableFAB2 == null) {
            return null;
        }
        if (view instanceof CatchingFishServiceMVPRedux) {
            catchingFishServiceMVPRedux = (CatchingFishServiceMVPRedux) view;
        }
        return catchingFishServiceMVPRedux.CatchingFishParcelableFAB(CatchingFishParcelableFAB2);
    }

    public static void CatchingFishOkHttp(View view, CatchingFishAndroidX catchingFishAndroidX) {
        if (catchingFishAndroidX == null && (CatchingFishReduxKtor(view) instanceof CatchingFishAppCompat)) {
            catchingFishAndroidX = new CatchingFishAndroidX();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(catchingFishAndroidX == null ? null : catchingFishAndroidX.CatchingFishSnackbar);
    }

    public static CatchingFishIntentMVPDagger CatchingFishParcelableFAB(View view) {
        if (CatchingFishParcelableFAB == null) {
            CatchingFishParcelableFAB = new WeakHashMap();
        }
        CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = (CatchingFishIntentMVPDagger) CatchingFishParcelableFAB.get(view);
        if (catchingFishIntentMVPDagger != null) {
            return catchingFishIntentMVPDagger;
        }
        CatchingFishIntentMVPDagger catchingFishIntentMVPDagger2 = new CatchingFishIntentMVPDagger(view);
        CatchingFishParcelableFAB.put(view, catchingFishIntentMVPDagger2);
        return catchingFishIntentMVPDagger2;
    }

    public static View.AccessibilityDelegate CatchingFishReduxKtor(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return CatchingFishEspressoGson.CatchingFishParcelableFAB(view);
        }
        if (CatchingFishCoroutine) {
            return null;
        }
        if (CatchingFishSnackbar == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                CatchingFishSnackbar = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                CatchingFishCoroutine = true;
                return null;
            }
        }
        try {
            Object obj = CatchingFishSnackbar.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            CatchingFishCoroutine = true;
            return null;
        }
    }

    public static void CatchingFishSnackbar(View view, CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        WindowInsets CatchingFishWorkManager2 = catchingFishKtorPicassoMVVM.CatchingFishWorkManager();
        if (CatchingFishWorkManager2 != null) {
            WindowInsets CatchingFishParcelableFAB2 = Build.VERSION.SDK_INT >= 30 ? CatchingFishHiltViewRedux.CatchingFishParcelableFAB(view, CatchingFishWorkManager2) : CatchingFishFABAdMobHilt.CatchingFishParcelableFAB(view, CatchingFishWorkManager2);
            if (CatchingFishParcelableFAB2.equals(CatchingFishWorkManager2)) {
                return;
            }
            CatchingFishKtorPicassoMVVM.CatchingFishViewModelScope(view, CatchingFishParcelableFAB2);
        }
    }

    public static void CatchingFishUnitTesting(View view, CharSequence charSequence) {
        new CatchingFishFABMVVMWidget(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).CatchingFishWorkManager(view, charSequence);
        CatchingFishToolbarDagger catchingFishToolbarDagger = CatchingFishWorkManager;
        if (charSequence == null) {
            catchingFishToolbarDagger.CatchingFishReduxKtor.remove(view);
            view.removeOnAttachStateChangeListener(catchingFishToolbarDagger);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(catchingFishToolbarDagger);
        } else {
            catchingFishToolbarDagger.CatchingFishReduxKtor.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(catchingFishToolbarDagger);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(catchingFishToolbarDagger);
            }
        }
    }

    public static void CatchingFishViewModelFAB(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = CatchingFishDaggerWebsocket(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(CatchingFishDaggerWebsocket(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(CatchingFishDaggerWebsocket(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static String[] CatchingFishViewModelScope(CatchingFishAdMobGlide catchingFishAdMobGlide) {
        return Build.VERSION.SDK_INT >= 31 ? CatchingFishRoomToastMVVM.CatchingFishParcelableFAB(catchingFishAdMobGlide) : (String[]) catchingFishAdMobGlide.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static ArrayList CatchingFishWorkManager(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }
}
