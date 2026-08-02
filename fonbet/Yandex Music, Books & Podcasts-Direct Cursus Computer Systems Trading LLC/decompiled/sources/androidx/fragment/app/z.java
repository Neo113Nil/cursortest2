package androidx.fragment.app;

import android.util.Log;
import defpackage.bfu;
import defpackage.jfu;
import defpackage.s40;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z extends bfu {
    public static final s40 q = new s40(14);
    public final boolean n;
    public final HashMap k = new HashMap();
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public boolean o = false;
    public boolean p = false;

    public z(boolean z) {
        this.n = z;
    }

    public final void G(o oVar, boolean z) {
        if (y.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        J(oVar.mWho, z);
    }

    public final void H(String str, boolean z) {
        if (y.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        J(str, z);
    }

    public final void J(String str, boolean z) {
        HashMap hashMap = this.l;
        z zVar = (z) hashMap.get(str);
        if (zVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(zVar.l.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zVar.H((String) it.next(), true);
                }
            }
            zVar.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.m;
        jfu jfuVar = (jfu) hashMap2.get(str);
        if (jfuVar != null) {
            jfuVar.a();
            hashMap2.remove(str);
        }
    }

    public final void K(o oVar) {
        if (this.p) {
            if (y.M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.k.remove(oVar.mWho) == null || !y.M(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
        }
    }

    public final void a(o oVar) {
        if (this.p) {
            if (y.M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = oVar.mWho;
        HashMap hashMap = this.k;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(oVar.mWho, oVar);
        if (y.M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + oVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.k.equals(zVar.k) && this.l.equals(zVar.l) && this.m.equals(zVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + (this.k.hashCode() * 31)) * 31);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        if (y.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.o = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.l.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.m.keySet().iterator();
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
