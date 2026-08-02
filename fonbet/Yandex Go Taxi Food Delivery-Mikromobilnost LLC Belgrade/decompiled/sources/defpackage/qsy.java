package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes5.dex */
public final class qsy extends AccessibilityDelegateCompat {
    public final /* synthetic */ ListItemSwitchComponent a;

    public qsy(ListItemSwitchComponent listItemSwitchComponent) {
        this.a = listItemSwitchComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.isChecked());
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        hg.a.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        whVar.o(this.a.isChecked());
        whVar.p("android.widget.Switch");
    }
}
