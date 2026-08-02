package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public final class zbm extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        if (DrawerLayout.includeChildForAccessibility(view)) {
            return;
        }
        whVar.A(null);
    }
}
