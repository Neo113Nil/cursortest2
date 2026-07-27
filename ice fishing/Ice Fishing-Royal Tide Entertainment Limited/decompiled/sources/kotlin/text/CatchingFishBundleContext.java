package kotlin.text;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class CatchingFishBundleContext {
    public static final CatchingFishBundleContext CatchingFishCloudMessaging;
    public static final CatchingFishBundleContext CatchingFishDaggerWebsocket;
    public static final CatchingFishBundleContext CatchingFishEspressoTesting;
    public static final CatchingFishBundleContext CatchingFishFragmentHandler;
    public static final CatchingFishBundleContext CatchingFishLayout;
    public static final CatchingFishBundleContext CatchingFishOkHttp;
    public static final CatchingFishBundleContext CatchingFishUnitTesting;
    public static final CatchingFishBundleContext CatchingFishViewModelFAB;
    public static final CatchingFishBundleContext CatchingFishViewModelScope;
    public static final CatchingFishBundleContext CatchingFishWorkManager;
    public final Class CatchingFishCoroutine;
    public final Object CatchingFishParcelableFAB;
    public final CatchingFishFluxBiometric CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x025b, code lost:
    
        if ((r0 < 36 ? r0 * 100000 : android.os.Build.VERSION.SDK_INT_FULL) >= 3600001) goto L67;
     */
    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        boolean z = true;
        new CatchingFishBundleContext((String) null, 1);
        new CatchingFishBundleContext((String) null, 2);
        new CatchingFishBundleContext((String) null, 4);
        new CatchingFishBundleContext((String) null, 8);
        CatchingFishDaggerWebsocket = new CatchingFishBundleContext((String) null, 16);
        new CatchingFishBundleContext((String) null, 32);
        CatchingFishWorkManager = new CatchingFishBundleContext((String) null, 64);
        CatchingFishViewModelScope = new CatchingFishBundleContext((String) null, 128);
        new CatchingFishBundleContext(256, CatchingFishAsyncTaskOkHttp.class);
        new CatchingFishBundleContext(512, CatchingFishAsyncTaskOkHttp.class);
        new CatchingFishBundleContext(1024, CatchingFishAnimationFAB.class);
        new CatchingFishBundleContext(2048, CatchingFishAnimationFAB.class);
        CatchingFishViewModelFAB = new CatchingFishBundleContext((String) null, 4096);
        CatchingFishLayout = new CatchingFishBundleContext((String) null, 8192);
        new CatchingFishBundleContext((String) null, 16384);
        new CatchingFishBundleContext((String) null, 32768);
        new CatchingFishBundleContext((String) null, 65536);
        new CatchingFishBundleContext(131072, CatchingFishStateFlow.class);
        CatchingFishFragmentHandler = new CatchingFishBundleContext((String) null, 262144);
        CatchingFishCloudMessaging = new CatchingFishBundleContext((String) null, 524288);
        CatchingFishEspressoTesting = new CatchingFishBundleContext((String) null, 1048576);
        new CatchingFishBundleContext(2097152, CatchingFishFABMotionLayout.class);
        new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, CatchingFishReduxBundle.class);
        CatchingFishOkHttp = new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        CatchingFishUnitTesting = new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new CatchingFishBundleContext(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new CatchingFishBundleContext(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new CatchingFishBundleContext(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new CatchingFishBundleContext(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new CatchingFishBundleContext(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, CatchingFishFluxMoshi.class);
        new CatchingFishBundleContext(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, CatchingFishWorkManager.class);
        if (i >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new CatchingFishBundleContext(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new CatchingFishBundleContext(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new CatchingFishBundleContext(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new CatchingFishBundleContext(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new CatchingFishBundleContext(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new CatchingFishBundleContext(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new CatchingFishBundleContext(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new CatchingFishBundleContext(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new CatchingFishBundleContext(i >= 34 ? CatchingFishDataStore.CatchingFishParcelableFAB() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = CatchingFishCameraXToolbar.CatchingFishParcelableFAB;
        if (i >= 36) {
        }
        z = false;
        new CatchingFishBundleContext(z ? CatchingFishMVIRetrofit.CatchingFishParcelableFAB() : null, R.id.ALT, null, null, null);
    }

    public CatchingFishBundleContext(String str, int i) {
        this(null, i, str, null, null);
    }

    public final int CatchingFishParcelableFAB() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.CatchingFishParcelableFAB).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CatchingFishBundleContext)) {
            return false;
        }
        Object obj2 = ((CatchingFishBundleContext) obj).CatchingFishParcelableFAB;
        Object obj3 = this.CatchingFishParcelableFAB;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.CatchingFishParcelableFAB;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String CatchingFishReduxKtor = CatchingFishViewJUnitJUnit.CatchingFishReduxKtor(this.CatchingFishSnackbar);
        if (CatchingFishReduxKtor.equals("ACTION_UNKNOWN")) {
            Object obj = this.CatchingFishParcelableFAB;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                CatchingFishReduxKtor = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(CatchingFishReduxKtor);
        return sb.toString();
    }

    public CatchingFishBundleContext(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public CatchingFishBundleContext(Object obj, int i, CharSequence charSequence, CatchingFishFluxBiometric catchingFishFluxBiometric, Class cls) {
        this.CatchingFishSnackbar = i;
        this.CatchingFishReduxKtor = catchingFishFluxBiometric;
        if (obj == null) {
            this.CatchingFishParcelableFAB = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.CatchingFishParcelableFAB = obj;
        }
        this.CatchingFishCoroutine = cls;
    }
}
