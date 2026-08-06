package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0965f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0962c f8024a;

    /* renamed from: b, reason: collision with root package name */
    public C0962c f8025b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f8026c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f8027d = 0;

    public C0962c a(Object obj) {
        C0962c c0962c = this.f8024a;
        while (c0962c != null && !c0962c.f8017a.equals(obj)) {
            c0962c = c0962c.f8019c;
        }
        return c0962c;
    }

    public Object b(Object obj) {
        C0962c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f8027d--;
        WeakHashMap weakHashMap = this.f8026c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0964e) it.next()).a(a2);
            }
        }
        C0962c c0962c = a2.f8020d;
        if (c0962c != null) {
            c0962c.f8019c = a2.f8019c;
        } else {
            this.f8024a = a2.f8019c;
        }
        C0962c c0962c2 = a2.f8019c;
        if (c0962c2 != null) {
            c0962c2.f8020d = c0962c;
        } else {
            this.f8025b = c0962c;
        }
        a2.f8019c = null;
        a2.f8020d = null;
        return a2.f8018b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((j.C0961b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0965f)) {
            return false;
        }
        C0965f c0965f = (C0965f) obj;
        if (this.f8027d != c0965f.f8027d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0965f.iterator();
        while (true) {
            C0961b c0961b = (C0961b) it;
            if (!c0961b.hasNext()) {
                break;
            }
            C0961b c0961b2 = (C0961b) it2;
            if (!c0961b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0961b.next();
            Object next = c0961b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0961b c0961b = (C0961b) it;
            if (!c0961b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c0961b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0961b c0961b = new C0961b(this.f8024a, this.f8025b, 0);
        this.f8026c.put(c0961b, Boolean.FALSE);
        return c0961b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0961b c0961b = (C0961b) it;
            if (!c0961b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0961b.next()).toString());
            if (c0961b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
