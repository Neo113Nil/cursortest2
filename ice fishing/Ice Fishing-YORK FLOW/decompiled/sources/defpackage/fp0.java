package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fp0 extends defpackage.iu1 {
    public final java.util.LinkedHashMap giKS3J6vZuNy = new java.util.LinkedHashMap();

    @Override // defpackage.iu1
    public final void JhCgjQRTAOCT() {
        java.util.LinkedHashMap linkedHashMap = this.giKS3J6vZuNy;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((defpackage.qu1) it.next()).ZpBGe2uQfcn8();
        }
        linkedHashMap.clear();
    }

    public final java.lang.String toString() {
        java.lang.String concat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavControllerViewModel{");
        int identityHashCode = java.lang.System.identityHashCode(this);
        defpackage.jr0.XntWc4eZSQ8j(16);
        long j = identityHashCode & 4294967295L;
        if (j >= 0) {
            defpackage.jr0.XntWc4eZSQ8j(16);
            concat = java.lang.Long.toString(j, 16);
            concat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            defpackage.jr0.XntWc4eZSQ8j(16);
            java.lang.String l = java.lang.Long.toString(j2, 16);
            l.getClass();
            defpackage.jr0.XntWc4eZSQ8j(16);
            java.lang.String l2 = java.lang.Long.toString(j3, 16);
            l2.getClass();
            concat = l.concat(l2);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        java.util.Iterator it = this.giKS3J6vZuNy.keySet().iterator();
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
