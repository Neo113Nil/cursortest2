package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.design.ChipsComponent;

/* loaded from: classes5.dex */
public final class xqb extends AccessibilityDelegateCompat {
    public final /* synthetic */ ChipsComponent a;

    public xqb(ChipsComponent chipsComponent) {
        this.a = chipsComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        String actionDescription;
        zqb zqbVar;
        zqb zqbVar2;
        zqb zqbVar3;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.p("android.widget.Button");
        ChipsComponent chipsComponent = this.a;
        actionDescription = chipsComponent.getActionDescription();
        if (actionDescription != null) {
            whVar.b(new ph(16, actionDescription));
        }
        zqbVar = chipsComponent.currentState;
        zqbVar.getClass();
        zqbVar2 = chipsComponent.currentState;
        String str = zqbVar2.d;
        if (str == null) {
            zqbVar3 = chipsComponent.currentState;
            str = ((Object) zqbVar3.b) + " ";
        }
        whVar.t(str);
    }
}
