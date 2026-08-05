package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hj extends ng0 {
    public static final gj Qr9iLBAD = new gj(0);
    public final boolean VgvYg0wo;
    public final HashMap NCTxEWno = new HashMap();
    public final HashMap MdtA4re8 = new HashMap();
    public final HashMap wxUZMvaN = new HashMap();
    public boolean P7K7Inc8 = false;
    public boolean b2ZJblxo = false;

    public hj(boolean z) {
        this.VgvYg0wo = z;
    }

    public final void P7K7Inc8(String str, boolean z) {
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        b2ZJblxo(str, z);
    }

    public final void Qr9iLBAD(li liVar) {
        if (this.b2ZJblxo) {
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.NCTxEWno.remove(liVar.P7K7Inc8) == null || !ej.ytu5o6f4(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + liVar);
        }
    }

    public final void VgvYg0wo(li liVar, boolean z) {
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + liVar);
        }
        b2ZJblxo(liVar.P7K7Inc8, z);
    }

    public final void b2ZJblxo(String str, boolean z) {
        HashMap hashMap = this.MdtA4re8;
        hj hjVar = (hj) hashMap.get(str);
        if (hjVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(hjVar.MdtA4re8.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    hjVar.P7K7Inc8((String) obj, true);
                }
            }
            hjVar.wxUZMvaN();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.wxUZMvaN;
        ug0 ug0Var = (ug0) hashMap2.get(str);
        if (ug0Var != null) {
            ug0Var.qoPGr6Ce();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj.class != obj.getClass()) {
            return false;
        }
        hj hjVar = (hj) obj;
        return this.NCTxEWno.equals(hjVar.NCTxEWno) && this.MdtA4re8.equals(hjVar.MdtA4re8) && this.wxUZMvaN.equals(hjVar.wxUZMvaN);
    }

    public final int hashCode() {
        return this.wxUZMvaN.hashCode() + ((this.MdtA4re8.hashCode() + (this.NCTxEWno.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.NCTxEWno.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.MdtA4re8.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.wxUZMvaN.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.ng0
    public final void wxUZMvaN() {
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.P7K7Inc8 = true;
    }
}
