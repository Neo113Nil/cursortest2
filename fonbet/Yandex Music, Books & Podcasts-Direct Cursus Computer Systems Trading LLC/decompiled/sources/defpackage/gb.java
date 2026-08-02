package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;

/* loaded from: classes3.dex */
public final /* synthetic */ class gb implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.a) {
            case 0:
                ((oc4) ((ltm) this.b)).c(Boolean.valueOf(z));
                break;
            case 1:
                ye0 ye0Var = (ye0) this.b;
                ye0Var.k = ye0Var.g.getEnabledAccessibilityServiceList(-1);
                break;
            default:
                wra wraVar = (wra) this.b;
                AutoCompleteTextView autoCompleteTextView = wraVar.h;
                if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
                    wraVar.d.setImportantForAccessibility(z ? 2 : 1);
                    break;
                }
                break;
        }
    }
}
