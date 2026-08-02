package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class yh {
    public static Boolean b;
    public final boolean a;

    public yh(boolean z) {
        this.a = z;
    }

    public final boolean a(Context context) {
        if (!this.a) {
            return false;
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool == null) {
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            b = accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE;
        }
        return b.booleanValue();
    }
}
