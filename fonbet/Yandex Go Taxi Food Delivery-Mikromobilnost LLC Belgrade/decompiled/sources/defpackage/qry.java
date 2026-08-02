package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes5.dex */
public final class qry extends AccessibilityDelegateCompat {
    public final /* synthetic */ ListItemCheckComponent a;

    public qry(ListItemCheckComponent listItemCheckComponent) {
        this.a = listItemCheckComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.getIsChecked());
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        whVar.n(this.a.getIsChecked() ? 1 : 0);
        whVar.p("android.widget.CheckBox");
    }
}
