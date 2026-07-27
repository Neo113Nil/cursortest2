package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S extends androidx.lifecycle.S {

    /* renamed from: g, reason: collision with root package name */
    public static final Q f4884g = new Q(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4888d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4885a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4886b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4887c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4889e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4890f = false;

    public S(boolean z3) {
        this.f4888d = z3;
    }

    public final void b(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (N.E(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0475s);
        }
        c(abstractComponentCallbacksC0475s.f5066x);
    }

    public final void c(String str) {
        HashMap hashMap = this.f4886b;
        S s9 = (S) hashMap.get(str);
        if (s9 != null) {
            s9.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f4887c;
        androidx.lifecycle.X x9 = (androidx.lifecycle.X) hashMap2.get(str);
        if (x9 != null) {
            x9.a();
            hashMap2.remove(str);
        }
    }

    public final void d(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (this.f4890f) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4885a.remove(abstractComponentCallbacksC0475s.f5066x) == null || !N.E(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0475s);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s9 = (S) obj;
            if (this.f4885a.equals(s9.f4885a) && this.f4886b.equals(s9.f4886b) && this.f4887c.equals(s9.f4887c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4887c.hashCode() + ((this.f4886b.hashCode() + (this.f4885a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        if (N.E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4889e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4885a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4886b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4887c.keySet().iterator();
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
