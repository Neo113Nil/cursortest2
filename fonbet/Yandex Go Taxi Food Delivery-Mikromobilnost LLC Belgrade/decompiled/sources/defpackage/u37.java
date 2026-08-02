package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes10.dex */
public final class u37 extends AccessibilityDelegateCompat {
    public boolean a;
    public boolean b = true;
    public boolean c = true;

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (this.b) {
            accessibilityEvent.setChecked(this.a);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(this.b);
        whVar.v(this.c);
        if (!this.b) {
            whVar.p("android.widget.Button");
        } else {
            whVar.n(this.a ? 1 : 0);
            whVar.p("android.widget.CheckBox");
        }
    }
}
