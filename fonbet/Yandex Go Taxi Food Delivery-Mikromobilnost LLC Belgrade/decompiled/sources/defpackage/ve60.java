package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class ve60 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.i(ph.g);
        whVar.q(false);
        if (view instanceof ViewGroup) {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription == null || contentDescription.length() == 0) {
                List h = vng.h((ViewGroup) view);
                if (h.isEmpty()) {
                    return;
                }
                whVar.t(a.X(h, null, null, null, null, 63));
            }
        }
    }
}
