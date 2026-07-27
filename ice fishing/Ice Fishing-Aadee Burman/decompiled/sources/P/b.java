package P;

import O.X;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final H3.l f2393a;

    public b(H3.l lVar) {
        this.f2393a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f2393a.equals(((b) obj).f2393a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2393a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        H3.m mVar = (H3.m) this.f2393a.f1128u;
        AutoCompleteTextView autoCompleteTextView = mVar.f1132h;
        if (autoCompleteTextView == null || d6.c.j(autoCompleteTextView)) {
            return;
        }
        int i = z3 ? 2 : 1;
        WeakHashMap weakHashMap = X.f2054a;
        mVar.f1174d.setImportantForAccessibility(i);
    }
}
