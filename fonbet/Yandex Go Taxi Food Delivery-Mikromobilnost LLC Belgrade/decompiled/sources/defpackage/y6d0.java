package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes2.dex */
public final class y6d0 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.p("android.widget.Button");
        whVar.b(ph.g);
    }
}
