package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes3.dex */
public final class zb {
    public static Boolean b;
    public final boolean a;

    public zb(boolean z) {
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
        Boolean bool2 = b;
        bool2.getClass();
        return bool2.booleanValue();
    }
}
