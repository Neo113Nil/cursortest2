package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class s741 extends AccessibilityDelegateCompat {
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.p("android.widget.CheckBox");
        whVar.i(ph.g);
        whVar.q(false);
        whVar.m(true);
        whVar.n(1);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            CharSequence contentDescription = viewGroup.getContentDescription();
            if (contentDescription == null || contentDescription.length() == 0) {
                List h = vng.h(viewGroup);
                if (h.isEmpty()) {
                    return;
                }
                whVar.t(a.X(h, null, null, null, null, 63));
            }
        }
    }
}
