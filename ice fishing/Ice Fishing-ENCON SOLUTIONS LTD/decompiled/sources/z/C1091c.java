package z;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091c {

    /* renamed from: c, reason: collision with root package name */
    public static final C1091c f8611c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1091c f8612d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1091c f8613e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1091c f8614f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8615a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8616b;

    static {
        new C1091c(null, 1, null);
        new C1091c(null, 2, null);
        new C1091c(null, 4, null);
        new C1091c(null, 8, null);
        new C1091c(null, 16, null);
        new C1091c(null, 32, null);
        new C1091c(null, 64, null);
        new C1091c(null, 128, null);
        new C1091c(null, 256, AbstractC1097i.class);
        new C1091c(null, 512, AbstractC1097i.class);
        new C1091c(null, 1024, AbstractC1098j.class);
        new C1091c(null, 2048, AbstractC1098j.class);
        f8611c = new C1091c(null, Base64Utils.IO_BUFFER_SIZE, null);
        f8612d = new C1091c(null, 8192, null);
        new C1091c(null, 16384, null);
        new C1091c(null, 32768, null);
        new C1091c(null, 65536, null);
        new C1091c(null, 131072, n.class);
        new C1091c(null, 262144, null);
        new C1091c(null, 524288, null);
        new C1091c(null, 1048576, null);
        new C1091c(null, 2097152, o.class);
        int i2 = Build.VERSION.SDK_INT;
        new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, AbstractC1100l.class);
        f8613e = new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f8614f = new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new C1091c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new C1091c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new C1091c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new C1091c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new C1091c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, AbstractC1101m.class);
        new C1091c(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, AbstractC1099k.class);
        new C1091c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new C1091c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new C1091c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new C1091c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new C1091c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new C1091c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new C1091c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new C1091c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new C1091c(i2 >= 34 ? AbstractC1094f.a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    public C1091c(Object obj, int i2, Class cls) {
        this.f8616b = i2;
        if (obj == null) {
            this.f8615a = new AccessibilityNodeInfo.AccessibilityAction(i2, null);
        } else {
            this.f8615a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1091c)) {
            return false;
        }
        Object obj2 = ((C1091c) obj).f8615a;
        Object obj3 = this.f8615a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f8615a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b2 = C1096h.b(this.f8616b);
        if (b2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f8615a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b2);
        return sb.toString();
    }
}
