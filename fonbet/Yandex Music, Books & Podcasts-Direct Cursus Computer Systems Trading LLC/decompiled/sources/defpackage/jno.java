package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class jno implements Iterable {
    public gno a;
    public gno b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public gno a(Object obj) {
        gno gnoVar = this.a;
        while (gnoVar != null && !gnoVar.a.equals(obj)) {
            gnoVar = gnoVar.c;
        }
        return gnoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.fno) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jno)) {
            return false;
        }
        jno jnoVar = (jno) obj;
        if (this.d != jnoVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = jnoVar.iterator();
        while (true) {
            fno fnoVar = (fno) it;
            if (!fnoVar.hasNext()) {
                break;
            }
            fno fnoVar2 = (fno) it2;
            if (!fnoVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) fnoVar.next();
            Object next = fnoVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public Object g(Object obj) {
        gno a = a(obj);
        if (a == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((ino) it.next()).a(a);
            }
        }
        gno gnoVar = a.d;
        gno gnoVar2 = a.c;
        if (gnoVar != null) {
            gnoVar.c = gnoVar2;
        } else {
            this.a = gnoVar2;
        }
        gno gnoVar3 = a.c;
        if (gnoVar3 != null) {
            gnoVar3.d = gnoVar;
        } else {
            this.b = gnoVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            fno fnoVar = (fno) it;
            if (!fnoVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) fnoVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fno fnoVar = new fno(this.a, this.b, 0);
        this.c.put(fnoVar, Boolean.FALSE);
        return fnoVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            fno fnoVar = (fno) it;
            if (!fnoVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) fnoVar.next()).toString());
            if (fnoVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
