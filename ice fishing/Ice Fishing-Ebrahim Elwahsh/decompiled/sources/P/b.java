package P;

import O.X;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final F3.l f2659a;

    public b(F3.l lVar) {
        this.f2659a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f2659a.equals(((b) obj).f2659a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2659a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z8) {
        F3.m mVar = (F3.m) this.f2659a.f1041u;
        AutoCompleteTextView autoCompleteTextView = mVar.f1045h;
        if (autoCompleteTextView == null || W2.e.l(autoCompleteTextView)) {
            return;
        }
        int i = z8 ? 2 : 1;
        WeakHashMap weakHashMap = X.f2240a;
        mVar.f1087d.setImportantForAccessibility(i);
    }
}
