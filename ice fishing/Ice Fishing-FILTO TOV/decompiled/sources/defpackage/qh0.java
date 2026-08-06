package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qh0 extends we1 {
    public final LinkedHashMap Yi7zF1RB1 = new LinkedHashMap();

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        ki1.Y6hRI1cF8(16);
        long j = identityHashCode & 4294967295L;
        if (j >= 0) {
            ki1.Y6hRI1cF8(16);
            concat = Long.toString(j, 16);
            concat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            ki1.Y6hRI1cF8(16);
            String l = Long.toString(j2, 16);
            l.getClass();
            ki1.Y6hRI1cF8(16);
            String l2 = Long.toString(j3, 16);
            l2.getClass();
            concat = l.concat(l2);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        Iterator it = this.Yi7zF1RB1.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.we1
    public final void xqGvceK5x() {
        LinkedHashMap linkedHashMap = this.Yi7zF1RB1;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ef1) it.next()).GWasM1elztuh();
        }
        linkedHashMap.clear();
    }
}
