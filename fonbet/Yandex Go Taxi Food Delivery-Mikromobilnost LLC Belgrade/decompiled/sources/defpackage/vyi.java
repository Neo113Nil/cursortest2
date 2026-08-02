package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class vyi extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    public /* synthetic */ vyi(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.a;
        Integer num = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(new ph(16, c.G(num.intValue(), view)));
                whVar.p("android.widget.Button");
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(num != null ? new ph(16, c.G(num.intValue(), view)) : ph.g);
                whVar.p("android.widget.Button");
                break;
        }
    }
}
