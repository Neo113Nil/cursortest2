package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class aZz0PFXp {
    public static final aZz0PFXp P7K7Inc8;
    public static final aZz0PFXp Qr9iLBAD;
    public static final aZz0PFXp VgvYg0wo;
    public static final aZz0PFXp b2ZJblxo;
    public static final aZz0PFXp wxUZMvaN;
    public final Class MdtA4re8;
    public final int NCTxEWno;
    public final Object qoPGr6Ce;

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
        new aZz0PFXp(1);
        new aZz0PFXp(2);
        new aZz0PFXp(4);
        new aZz0PFXp(8);
        wxUZMvaN = new aZz0PFXp(16);
        new aZz0PFXp(32);
        new aZz0PFXp(64);
        new aZz0PFXp(128);
        new aZz0PFXp(256, ZyZthT5G.class);
        new aZz0PFXp(512, ZyZthT5G.class);
        new aZz0PFXp(1024, bvfAo0eO.class);
        new aZz0PFXp(2048, bvfAo0eO.class);
        VgvYg0wo = new aZz0PFXp(4096);
        P7K7Inc8 = new aZz0PFXp(8192);
        new aZz0PFXp(16384);
        new aZz0PFXp(32768);
        new aZz0PFXp(65536);
        new aZz0PFXp(131072, g2aRJUAd.class);
        new aZz0PFXp(262144);
        new aZz0PFXp(524288);
        new aZz0PFXp(1048576);
        new aZz0PFXp(2097152, ESscZ9M1.class);
        new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, gmkaJpmS.class);
        b2ZJblxo = new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        Qr9iLBAD = new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = null;
        if (i >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new aZz0PFXp(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new aZz0PFXp(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new aZz0PFXp(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new aZz0PFXp(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new aZz0PFXp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, TrssYQ34.class);
        new aZz0PFXp(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, KRabZ4CU.class);
        if (i >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new aZz0PFXp(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new aZz0PFXp(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new aZz0PFXp(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new aZz0PFXp(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new aZz0PFXp(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new aZz0PFXp(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new aZz0PFXp(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new aZz0PFXp(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new aZz0PFXp(i >= 34 ? hzgxAD8d.qoPGr6Ce() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = d3.qoPGr6Ce;
        if (i >= 36) {
            if ((i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new aZz0PFXp(accessibilityAction19, R.id.ALT, null, null, null);
    }

    public aZz0PFXp(Object obj, int i, String str, VGmz0ccI vGmz0ccI, Class cls) {
        this.NCTxEWno = i;
        if (obj == null) {
            this.qoPGr6Ce = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.qoPGr6Ce = obj;
        }
        this.MdtA4re8 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aZz0PFXp)) {
            return false;
        }
        Object obj2 = ((aZz0PFXp) obj).qoPGr6Ce;
        Object obj3 = this.qoPGr6Ce;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.qoPGr6Ce;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final int qoPGr6Ce() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.qoPGr6Ce).getId();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String wxUZMvaN2 = nSmgoSB5.wxUZMvaN(this.NCTxEWno);
        if (wxUZMvaN2.equals("ACTION_UNKNOWN")) {
            Object obj = this.qoPGr6Ce;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                wxUZMvaN2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(wxUZMvaN2);
        return sb.toString();
    }

    public aZz0PFXp(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public aZz0PFXp(int i) {
        this(null, i, null, null, null);
    }
}
