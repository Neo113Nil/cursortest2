package P;

import O.AbstractC0042s;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class d {
    public static final d e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f882f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f883g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f884h;
    public static final d i;
    public static final d j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f885k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f886l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f888b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f889c;

    /* renamed from: d, reason: collision with root package name */
    public final o f890d;

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
        new d((String) null, 1);
        new d((String) null, 2);
        new d((String) null, 4);
        new d((String) null, 8);
        e = new d((String) null, 16);
        new d((String) null, 32);
        new d((String) null, 64);
        new d((String) null, 128);
        new d(256, h.class);
        new d(512, h.class);
        new d(1024, i.class);
        new d(2048, i.class);
        f882f = new d((String) null, 4096);
        f883g = new d((String) null, 8192);
        new d((String) null, 16384);
        new d((String) null, 32768);
        new d((String) null, 65536);
        new d(131072, m.class);
        f884h = new d((String) null, 262144);
        i = new d((String) null, 524288);
        j = new d((String) null, 1048576);
        new d(2097152, n.class);
        int i2 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.class);
        f885k = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f886l = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction16;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
        new d(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction15;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, j.class);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction14;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction13;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction5 = accessibilityAction12;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction6 = accessibilityAction11;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction7 = accessibilityAction10;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction8 = accessibilityAction9;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new d(i2 >= 34 ? AbstractC0042s.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(String str, int i2) {
        this(null, i2, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f887a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f887a;
        Object obj3 = this.f887a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f887a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = f.d(this.f888b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f887a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public d(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public d(Object obj, int i2, String str, o oVar, Class cls) {
        this.f888b = i2;
        this.f890d = oVar;
        if (obj == null) {
            this.f887a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f887a = obj;
        }
        this.f889c = cls;
    }
}
