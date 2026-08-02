package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

/* loaded from: classes10.dex */
public final class wso extends AccessibilityNodeProviderCompat {
    public final /* synthetic */ xso b;

    public wso(xso xsoVar) {
        this.b = xsoVar;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final wh b(int i) {
        return new wh(AccessibilityNodeInfo.obtain(this.b.i(i).a));
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final wh d(int i) {
        xso xsoVar = this.b;
        int i2 = i == 2 ? xsoVar.A : xsoVar.B;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return b(i2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final boolean e(int i, int i2, Bundle bundle) {
        int i3;
        xso xsoVar = this.b;
        View view = xsoVar.y;
        if (i == -1) {
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return xsoVar.o(i);
        }
        if (i2 == 2) {
            return xsoVar.a(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return xsoVar.k(i, i2, bundle);
            }
            if (xsoVar.A != i) {
                return false;
            }
            xsoVar.A = Integer.MIN_VALUE;
            view.invalidate();
            xsoVar.p(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = xsoVar.x;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = xsoVar.A) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            xsoVar.A = Integer.MIN_VALUE;
            view.invalidate();
            xsoVar.p(i3, 65536);
        }
        xsoVar.A = i;
        view.invalidate();
        xsoVar.p(i, 32768);
        return true;
    }
}
