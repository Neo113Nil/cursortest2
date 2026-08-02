package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S extends androidx.lifecycle.S {

    /* renamed from: g, reason: collision with root package name */
    public static final Q f4852g = new Q(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4856d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4853a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4854b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4855c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4857e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4858f = false;

    public S(boolean z6) {
        this.f4856d = z6;
    }

    public final void b(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (N.E(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0479s);
        }
        c(abstractComponentCallbacksC0479s.f5034x);
    }

    public final void c(String str) {
        HashMap hashMap = this.f4854b;
        S s9 = (S) hashMap.get(str);
        if (s9 != null) {
            s9.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f4855c;
        androidx.lifecycle.X x9 = (androidx.lifecycle.X) hashMap2.get(str);
        if (x9 != null) {
            x9.a();
            hashMap2.remove(str);
        }
    }

    public final void d(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (this.f4858f) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4853a.remove(abstractComponentCallbacksC0479s.f5034x) == null || !N.E(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0479s);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s9 = (S) obj;
            if (this.f4853a.equals(s9.f4853a) && this.f4854b.equals(s9.f4854b) && this.f4855c.equals(s9.f4855c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4855c.hashCode() + ((this.f4854b.hashCode() + (this.f4853a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        if (N.E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4857e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4853a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4854b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4855c.keySet().iterator();
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
