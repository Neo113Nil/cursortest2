package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hu extends ng0 {
    public final LinkedHashMap NCTxEWno = new LinkedHashMap();

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        le0.Qr9iLBAD(16);
        long j = identityHashCode & 4294967295L;
        if (j >= 0) {
            le0.Qr9iLBAD(16);
            concat = Long.toString(j, 16);
            concat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            le0.Qr9iLBAD(16);
            String l = Long.toString(j2, 16);
            l.getClass();
            le0.Qr9iLBAD(16);
            String l2 = Long.toString(j3, 16);
            l2.getClass();
            concat = l.concat(l2);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        Iterator it = this.NCTxEWno.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.ng0
    public final void wxUZMvaN() {
        LinkedHashMap linkedHashMap = this.NCTxEWno;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ug0) it.next()).qoPGr6Ce();
        }
        linkedHashMap.clear();
    }
}
