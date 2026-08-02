package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.design.SwitchComponent;

/* loaded from: classes9.dex */
public final class zyw0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ SwitchComponent a;

    public zyw0(SwitchComponent switchComponent) {
        this.a = switchComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        z = this.a.isChecked;
        accessibilityEvent.setChecked(z);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        z = this.a.isChecked;
        whVar.o(z);
        whVar.p("android.widget.Switch");
    }
}
