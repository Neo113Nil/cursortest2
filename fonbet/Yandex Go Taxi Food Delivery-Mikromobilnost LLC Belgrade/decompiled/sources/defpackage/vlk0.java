package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes14.dex */
public final class vlk0 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.q(true);
        whVar.y(false);
        whVar.w(false);
        whVar.v(true);
        whVar.i(ph.g);
        whVar.i(ph.h);
        whVar.i(ph.e);
        whVar.p(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
    }
}
