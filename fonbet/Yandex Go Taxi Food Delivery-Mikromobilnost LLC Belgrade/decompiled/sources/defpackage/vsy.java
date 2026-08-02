package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.SwitchComponent;

/* loaded from: classes9.dex */
public final class vsy extends AccessibilityDelegateCompat {
    public final /* synthetic */ ListItemWithBadgeComponent a;

    public vsy(ListItemWithBadgeComponent listItemWithBadgeComponent) {
        this.a = listItemWithBadgeComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        SwitchComponent switchComponent;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ListItemWithBadgeComponent listItemWithBadgeComponent = this.a;
        switchComponent = listItemWithBadgeComponent.toggle;
        if (switchComponent != null) {
            accessibilityEvent.setChecked(listItemWithBadgeComponent.isChecked());
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        SwitchComponent switchComponent;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        ListItemWithBadgeComponent listItemWithBadgeComponent = this.a;
        switchComponent = listItemWithBadgeComponent.toggle;
        if (switchComponent != null) {
            whVar.m(true);
            whVar.n(listItemWithBadgeComponent.isChecked() ? 1 : 0);
            whVar.p("android.widget.Switch");
        }
    }
}
