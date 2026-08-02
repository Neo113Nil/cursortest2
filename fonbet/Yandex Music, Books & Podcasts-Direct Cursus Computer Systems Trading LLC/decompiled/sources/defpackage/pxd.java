package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* loaded from: classes3.dex */
public final /* synthetic */ class pxd implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ uk6 c;

    public /* synthetic */ pxd(uk6 uk6Var, View view, int i) {
        this.a = i;
        this.c = uk6Var;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.c).lambda$disableIfTouchExplorationEnabled$0(this.b, z);
                break;
            default:
                ((HideViewOnScrollBehavior) this.c).lambda$disableIfTouchExplorationEnabled$0(this.b, z);
                break;
        }
    }
}
