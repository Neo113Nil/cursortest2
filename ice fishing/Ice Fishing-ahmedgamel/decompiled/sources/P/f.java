package P;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f2394e = new f(1);

    /* renamed from: f, reason: collision with root package name */
    public static final f f2395f = new f(2);

    /* renamed from: g, reason: collision with root package name */
    public static final f f2396g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f2397h;
    public static final f i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f2398j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f2399k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f2400l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f2401m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f2402n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2404b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2405c;

    /* renamed from: d, reason: collision with root package name */
    public final u f2406d;

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
        f2396g = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(256, n.class);
        new f(512, n.class);
        new f(1024, o.class);
        new f(2048, o.class);
        f2397h = new f(4096);
        i = new f(8192);
        new f(16384);
        new f(32768);
        new f(com.anythink.basead.exoplayer.b.aX);
        new f(131072, s.class);
        f2398j = new f(262144);
        f2399k = new f(524288);
        f2400l = new f(com.anythink.basead.exoplayer.h.o.f7742d);
        new f(2097152, t.class);
        int i6 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, q.class);
        f2401m = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2402n = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i6 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i6 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new f(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i6 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, r.class);
        new f(i6 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, p.class);
        if (i6 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i6 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new f(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(i6 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i6 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new f(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new f(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i6 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new f(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i6 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new f(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i6 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new f(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new f(i6 >= 34 ? i.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public f(int i6) {
        this(null, i6, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2403a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f2403a;
        Object obj3 = this.f2403a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2403a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = k.d(this.f2404b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2403a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public f(int i6, Class cls) {
        this(null, i6, null, null, cls);
    }

    public f(Object obj, int i6, String str, u uVar, Class cls) {
        this.f2404b = i6;
        this.f2406d = uVar;
        if (obj == null) {
            this.f2403a = new AccessibilityNodeInfo.AccessibilityAction(i6, str);
        } else {
            this.f2403a = obj;
        }
        this.f2405c = cls;
    }
}
