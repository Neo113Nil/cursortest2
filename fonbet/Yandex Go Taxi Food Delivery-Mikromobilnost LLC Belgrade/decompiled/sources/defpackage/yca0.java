package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes8.dex */
public final class yca0 extends AccessibilityDelegateCompat {
    public static final yca0 a = new yca0();

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(view.isActivated());
        if (accessibilityEvent.getEventType() == 2048) {
            accessibilityEvent.setContentChangeTypes(64);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        whVar.o(view.isActivated());
        whVar.p("android.widget.Switch");
        whVar.D(view.getContext().getString(view.isActivated() ? kyh0.content_description_selected : kyh0.content_description_unselected));
    }
}
