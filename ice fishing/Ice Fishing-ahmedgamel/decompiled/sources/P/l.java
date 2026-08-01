package P;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import g1.C4522b;
import java.util.List;

/* loaded from: classes.dex */
public class l extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C4522b f2411a;

    public l(C4522b c4522b) {
        this.f2411a = c4522b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        k y7 = this.f2411a.y(i);
        if (y7 == null) {
            return null;
        }
        return y7.f2409a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2411a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        k B9 = this.f2411a.B(i);
        if (B9 == null) {
            return null;
        }
        return B9.f2409a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i6, Bundle bundle) {
        return this.f2411a.T(i, i6, bundle);
    }
}
