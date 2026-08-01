package Z;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class P extends androidx.lifecycle.Q {

    /* renamed from: h, reason: collision with root package name */
    public static final O f1466h = new O(0);
    public final boolean e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1467b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1468c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1469d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1470f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1471g = false;

    public P(boolean z2) {
        this.e = z2;
    }

    @Override // androidx.lifecycle.Q
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1470f = true;
    }

    public final void c(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, boolean z2) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0070s);
        }
        e(abstractComponentCallbacksC0070s.e, z2);
    }

    public final void d(String str, boolean z2) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z2);
    }

    public final void e(String str, boolean z2) {
        HashMap hashMap = this.f1468c;
        P p2 = (P) hashMap.get(str);
        if (p2 != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(p2.f1468c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p2.d((String) it.next(), true);
                }
            }
            p2.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1469d;
        androidx.lifecycle.U u2 = (androidx.lifecycle.U) hashMap2.get(str);
        if (u2 != null) {
            u2.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        P p2 = (P) obj;
        return this.f1467b.equals(p2.f1467b) && this.f1468c.equals(p2.f1468c) && this.f1469d.equals(p2.f1469d);
    }

    public final void f(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (this.f1471g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1467b.remove(abstractComponentCallbacksC0070s.e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0070s);
        }
    }

    public final int hashCode() {
        return this.f1469d.hashCode() + ((this.f1468c.hashCode() + (this.f1467b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1467b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1468c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1469d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
