package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4794f implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public C4791c f39706n;

    /* renamed from: u, reason: collision with root package name */
    public C4791c f39707u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f39708v = new WeakHashMap();

    /* renamed from: w, reason: collision with root package name */
    public int f39709w = 0;

    public C4791c a(Object obj) {
        C4791c c4791c = this.f39706n;
        while (c4791c != null && !c4791c.f39699n.equals(obj)) {
            c4791c = c4791c.f39701v;
        }
        return c4791c;
    }

    public Object c(Object obj) {
        C4791c a9 = a(obj);
        if (a9 == null) {
            return null;
        }
        this.f39709w--;
        WeakHashMap weakHashMap = this.f39708v;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC4793e) it.next()).a(a9);
            }
        }
        C4791c c4791c = a9.f39702w;
        if (c4791c != null) {
            c4791c.f39701v = a9.f39701v;
        } else {
            this.f39706n = a9.f39701v;
        }
        C4791c c4791c2 = a9.f39701v;
        if (c4791c2 != null) {
            c4791c2.f39702w = c4791c;
        } else {
            this.f39707u = c4791c;
        }
        a9.f39701v = null;
        a9.f39702w = null;
        return a9.f39700u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C4790b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C4794f)) {
            return false;
        }
        C4794f c4794f = (C4794f) obj;
        if (this.f39709w != c4794f.f39709w) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c4794f.iterator();
        while (true) {
            C4790b c4790b = (C4790b) it;
            if (!c4790b.hasNext()) {
                break;
            }
            C4790b c4790b2 = (C4790b) it2;
            if (!c4790b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4790b.next();
            Object next = c4790b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C4790b c4790b = (C4790b) it;
            if (!c4790b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c4790b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4790b c4790b = new C4790b(this.f39706n, this.f39707u, 0);
        this.f39708v.put(c4790b, Boolean.FALSE);
        return c4790b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C4790b c4790b = (C4790b) it;
            if (!c4790b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c4790b.next()).toString());
            if (c4790b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
