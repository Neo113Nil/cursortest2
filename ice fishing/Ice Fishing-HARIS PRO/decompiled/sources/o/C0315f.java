package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0315f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0312c f4124a;

    /* renamed from: b, reason: collision with root package name */
    public C0312c f4125b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f4126c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f4127d = 0;

    public C0312c a(Object obj) {
        C0312c c0312c = this.f4124a;
        while (c0312c != null && !c0312c.f4117a.equals(obj)) {
            c0312c = c0312c.f4119c;
        }
        return c0312c;
    }

    public Object b(Object obj) {
        C0312c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f4127d--;
        WeakHashMap weakHashMap = this.f4126c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0314e) it.next()).a(a2);
            }
        }
        C0312c c0312c = a2.f4120d;
        if (c0312c != null) {
            c0312c.f4119c = a2.f4119c;
        } else {
            this.f4124a = a2.f4119c;
        }
        C0312c c0312c2 = a2.f4119c;
        if (c0312c2 != null) {
            c0312c2.f4120d = c0312c;
        } else {
            this.f4125b = c0312c;
        }
        a2.f4119c = null;
        a2.f4120d = null;
        return a2.f4118b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C0311b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0315f)) {
            return false;
        }
        C0315f c0315f = (C0315f) obj;
        if (this.f4127d != c0315f.f4127d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0315f.iterator();
        while (true) {
            C0311b c0311b = (C0311b) it;
            if (!c0311b.hasNext()) {
                break;
            }
            C0311b c0311b2 = (C0311b) it2;
            if (!c0311b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0311b.next();
            Object next = c0311b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C0311b c0311b = (C0311b) it;
            if (!c0311b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c0311b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0311b c0311b = new C0311b(this.f4124a, this.f4125b, 0);
        this.f4126c.put(c0311b, Boolean.FALSE);
        return c0311b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0311b c0311b = (C0311b) it;
            if (!c0311b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0311b.next()).toString());
            if (c0311b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
