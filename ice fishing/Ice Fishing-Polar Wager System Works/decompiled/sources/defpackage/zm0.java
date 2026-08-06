package defpackage;

/* loaded from: classes.dex */
public final class zm0 extends defpackage.vm1 {
    public final java.util.LinkedHashMap oh6vYeIP = new java.util.LinkedHashMap();

    @Override // defpackage.vm1
    public final void F7NU4MC0GW() {
        java.util.LinkedHashMap linkedHashMap = this.oh6vYeIP;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((defpackage.bn1) it.next()).IHQe1A4L2xu();
        }
        linkedHashMap.clear();
    }

    public final java.lang.String toString() {
        java.lang.String concat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavControllerViewModel{");
        int identityHashCode = java.lang.System.identityHashCode(this);
        defpackage.x70.G3OKOH3wZRC(16);
        long j = identityHashCode & 4294967295L;
        if (j >= 0) {
            defpackage.x70.G3OKOH3wZRC(16);
            concat = java.lang.Long.toString(j, 16);
            concat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            defpackage.x70.G3OKOH3wZRC(16);
            java.lang.String l = java.lang.Long.toString(j2, 16);
            l.getClass();
            defpackage.x70.G3OKOH3wZRC(16);
            java.lang.String l2 = java.lang.Long.toString(j3, 16);
            l2.getClass();
            concat = l.concat(l2);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        java.util.Iterator it = this.oh6vYeIP.keySet().iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
