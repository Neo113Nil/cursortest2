package P;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f2325e = new f(1);

    /* renamed from: f, reason: collision with root package name */
    public static final f f2326f = new f(2);

    /* renamed from: g, reason: collision with root package name */
    public static final f f2327g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f2328h;
    public static final f i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f2329j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f2330k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f2331l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f2332m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f2333n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2335b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2336c;

    /* renamed from: d, reason: collision with root package name */
    public final u f2337d;

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
        new f(4);
        new f(8);
        f2327g = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(256, n.class);
        new f(512, n.class);
        new f(1024, o.class);
        new f(2048, o.class);
        f2328h = new f(4096);
        i = new f(8192);
        new f(16384);
        new f(32768);
        new f(com.anythink.basead.exoplayer.b.aX);
        new f(131072, s.class);
        f2329j = new f(262144);
        f2330k = new f(524288);
        f2331l = new f(com.anythink.basead.exoplayer.h.o.f8528d);
        new f(2097152, t.class);
        int i4 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, q.class);
        f2332m = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2333n = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i4 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i4 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new f(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i4 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, r.class);
        new f(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, p.class);
        if (i4 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i4 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new f(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i4 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new f(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new f(i4 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i4 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new f(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i4 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new f(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i4 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new f(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new f(i4 >= 34 ? i.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public f(int i4) {
        this(null, i4, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2334a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f2334a;
        Object obj3 = this.f2334a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2334a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d9 = k.d(this.f2335b);
        if (d9.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2334a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d9 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d9);
        return sb.toString();
    }

    public f(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public f(Object obj, int i4, String str, u uVar, Class cls) {
        this.f2335b = i4;
        this.f2337d = uVar;
        if (obj == null) {
            this.f2334a = new AccessibilityNodeInfo.AccessibilityAction(i4, str);
        } else {
            this.f2334a = obj;
        }
        this.f2336c = cls;
    }
}
