package x;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0287c f3081c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0287c f3082d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0287c f3083e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0287c f3084f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3086b;

    static {
        new C0287c(null, 1, null);
        new C0287c(null, 2, null);
        new C0287c(null, 4, null);
        new C0287c(null, 8, null);
        new C0287c(null, 16, null);
        new C0287c(null, 32, null);
        new C0287c(null, 64, null);
        new C0287c(null, 128, null);
        new C0287c(null, 256, AbstractC0293i.class);
        new C0287c(null, 512, AbstractC0293i.class);
        new C0287c(null, 1024, AbstractC0294j.class);
        new C0287c(null, 2048, AbstractC0294j.class);
        f3081c = new C0287c(null, 4096, null);
        f3082d = new C0287c(null, 8192, null);
        new C0287c(null, 16384, null);
        new C0287c(null, 32768, null);
        new C0287c(null, 65536, null);
        new C0287c(null, 131072, n.class);
        new C0287c(null, 262144, null);
        new C0287c(null, 524288, null);
        new C0287c(null, 1048576, null);
        new C0287c(null, 2097152, o.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, l.class);
        f3083e = new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f3084f = new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new C0287c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new C0287c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new C0287c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new C0287c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new C0287c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, m.class);
        new C0287c(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, AbstractC0295k.class);
        new C0287c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new C0287c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new C0287c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new C0287c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new C0287c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new C0287c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new C0287c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new C0287c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new C0287c(i2 >= 34 ? AbstractC0290f.a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    public C0287c(Object obj, int i2, Class cls) {
        this.f3086b = i2;
        if (obj == null) {
            this.f3085a = new AccessibilityNodeInfo.AccessibilityAction(i2, null);
        } else {
            this.f3085a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0287c)) {
            return false;
        }
        Object obj2 = ((C0287c) obj).f3085a;
        Object obj3 = this.f3085a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f3085a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b2 = C0292h.b(this.f3086b);
        if (b2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3085a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b2);
        return sb.toString();
    }
}
