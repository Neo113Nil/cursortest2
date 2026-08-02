package P;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import i1.C4585b;
import java.util.List;

/* loaded from: classes.dex */
public class l extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C4585b f2342a;

    public l(C4585b c4585b) {
        this.f2342a = c4585b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        k k9 = this.f2342a.k(i);
        if (k9 == null) {
            return null;
        }
        return k9.f2340a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2342a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        k m9 = this.f2342a.m(i);
        if (m9 == null) {
            return null;
        }
        return m9.f2340a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i4, Bundle bundle) {
        return this.f2342a.r(i, i4, bundle);
    }
}
