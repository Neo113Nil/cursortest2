package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4778f implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public C4775c f39539n;

    /* renamed from: u, reason: collision with root package name */
    public C4775c f39540u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f39541v = new WeakHashMap();

    /* renamed from: w, reason: collision with root package name */
    public int f39542w = 0;

    public C4775c a(Object obj) {
        C4775c c4775c = this.f39539n;
        while (c4775c != null && !c4775c.f39532n.equals(obj)) {
            c4775c = c4775c.f39534v;
        }
        return c4775c;
    }

    public Object c(Object obj) {
        C4775c a9 = a(obj);
        if (a9 == null) {
            return null;
        }
        this.f39542w--;
        WeakHashMap weakHashMap = this.f39541v;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC4777e) it.next()).a(a9);
            }
        }
        C4775c c4775c = a9.f39535w;
        if (c4775c != null) {
            c4775c.f39534v = a9.f39534v;
        } else {
            this.f39539n = a9.f39534v;
        }
        C4775c c4775c2 = a9.f39534v;
        if (c4775c2 != null) {
            c4775c2.f39535w = c4775c;
        } else {
            this.f39540u = c4775c;
        }
        a9.f39534v = null;
        a9.f39535w = null;
        return a9.f39533u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C4774b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C4778f)) {
            return false;
        }
        C4778f c4778f = (C4778f) obj;
        if (this.f39542w != c4778f.f39542w) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c4778f.iterator();
        while (true) {
            C4774b c4774b = (C4774b) it;
            if (!c4774b.hasNext()) {
                break;
            }
            C4774b c4774b2 = (C4774b) it2;
            if (!c4774b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4774b.next();
            Object next = c4774b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C4774b c4774b = (C4774b) it;
            if (!c4774b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c4774b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4774b c4774b = new C4774b(this.f39539n, this.f39540u, 0);
        this.f39541v.put(c4774b, Boolean.FALSE);
        return c4774b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C4774b c4774b = (C4774b) it;
            if (!c4774b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c4774b.next()).toString());
            if (c4774b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
