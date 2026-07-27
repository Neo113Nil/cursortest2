package x;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0293c f3076c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0293c f3077d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0293c f3078e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0293c f3079f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3081b;

    static {
        new C0293c(null, 1, null);
        new C0293c(null, 2, null);
        new C0293c(null, 4, null);
        new C0293c(null, 8, null);
        new C0293c(null, 16, null);
        new C0293c(null, 32, null);
        new C0293c(null, 64, null);
        new C0293c(null, 128, null);
        new C0293c(null, 256, AbstractC0299i.class);
        new C0293c(null, 512, AbstractC0299i.class);
        new C0293c(null, 1024, AbstractC0300j.class);
        new C0293c(null, 2048, AbstractC0300j.class);
        f3076c = new C0293c(null, 4096, null);
        f3077d = new C0293c(null, 8192, null);
        new C0293c(null, 16384, null);
        new C0293c(null, 32768, null);
        new C0293c(null, 65536, null);
        new C0293c(null, 131072, n.class);
        new C0293c(null, 262144, null);
        new C0293c(null, 524288, null);
        new C0293c(null, 1048576, null);
        new C0293c(null, 2097152, o.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, l.class);
        f3078e = new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f3079f = new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new C0293c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new C0293c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new C0293c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new C0293c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new C0293c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, m.class);
        new C0293c(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, AbstractC0301k.class);
        new C0293c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new C0293c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new C0293c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new C0293c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new C0293c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new C0293c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new C0293c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new C0293c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new C0293c(i2 >= 34 ? AbstractC0296f.a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    public C0293c(Object obj, int i2, Class cls) {
        this.f3081b = i2;
        if (obj == null) {
            this.f3080a = new AccessibilityNodeInfo.AccessibilityAction(i2, null);
        } else {
            this.f3080a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0293c)) {
            return false;
        }
        Object obj2 = ((C0293c) obj).f3080a;
        Object obj3 = this.f3080a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f3080a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b2 = C0298h.b(this.f3081b);
        if (b2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3080a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b2);
        return sb.toString();
    }
}
