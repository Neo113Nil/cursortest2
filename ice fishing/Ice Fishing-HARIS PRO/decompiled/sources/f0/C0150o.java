package f0;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150o extends Q {

    /* renamed from: c, reason: collision with root package name */
    public static final Z.O f2956c = new Z.O(2);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2957b = new LinkedHashMap();

    @Override // androidx.lifecycle.Q
    public final void b() {
        LinkedHashMap linkedHashMap = this.f2957b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((U) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f2957b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
