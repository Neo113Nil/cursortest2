package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: g, reason: collision with root package name */
    public c f5123g;

    /* renamed from: h, reason: collision with root package name */
    public c f5124h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f5125i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f5126j = 0;

    public c a(Object obj) {
        c cVar = this.f5123g;
        while (cVar != null && !cVar.f5116g.equals(obj)) {
            cVar = cVar.f5118i;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a6 = a(obj);
        if (a6 == null) {
            return null;
        }
        this.f5126j--;
        WeakHashMap weakHashMap = this.f5125i;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a6);
            }
        }
        c cVar = a6.f5119j;
        if (cVar != null) {
            cVar.f5118i = a6.f5118i;
        } else {
            this.f5123g = a6.f5118i;
        }
        c cVar2 = a6.f5118i;
        if (cVar2 != null) {
            cVar2.f5119j = cVar;
        } else {
            this.f5124h = cVar;
        }
        a6.f5118i = null;
        a6.f5119j = null;
        return a6.f5117h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f5126j != fVar.f5126j) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f5123g, this.f5124h, 0);
        this.f5125i.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
