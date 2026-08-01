package P;

import O.K;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Q.a f881a;

    public b(Q.a aVar) {
        this.f881a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f881a.equals(((b) obj).f881a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f881a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        V0.k kVar = (V0.k) this.f881a.f926a;
        AutoCompleteTextView autoCompleteTextView = kVar.f1282h;
        if (autoCompleteTextView == null || R.j.M(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = K.f747a;
        kVar.f1321d.setImportantForAccessibility(i);
    }
}
