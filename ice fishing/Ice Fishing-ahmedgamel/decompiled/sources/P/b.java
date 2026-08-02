package P;

import O.X;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final J3.l f2324a;

    public b(J3.l lVar) {
        this.f2324a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f2324a.equals(((b) obj).f2324a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2324a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z6) {
        J3.m mVar = (J3.m) this.f2324a.f1484u;
        AutoCompleteTextView autoCompleteTextView = mVar.f1488h;
        if (autoCompleteTextView == null || com.bumptech.glide.e.e(autoCompleteTextView)) {
            return;
        }
        int i = z6 ? 2 : 1;
        WeakHashMap weakHashMap = X.f2142a;
        mVar.f1530d.setImportantForAccessibility(i);
    }
}
