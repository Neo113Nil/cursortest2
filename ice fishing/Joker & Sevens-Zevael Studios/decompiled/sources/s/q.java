package s;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f6317a;

    /* renamed from: b, reason: collision with root package name */
    public final b4.l f6318b;

    /* renamed from: c, reason: collision with root package name */
    public final u7.d f6319c;

    /* renamed from: d, reason: collision with root package name */
    public int f6320d;

    /* renamed from: e, reason: collision with root package name */
    public int f6321e;

    /* renamed from: f, reason: collision with root package name */
    public int f6322f;

    public q(int i10) {
        this.f6317a = i10;
        if (i10 <= 0) {
            t.a.c("maxSize <= 0");
            throw null;
        }
        this.f6318b = new b4.l(1);
        this.f6319c = new u7.d();
    }

    public final Object a(Object obj) {
        pc.j.e(obj, "key");
        synchronized (this.f6319c) {
            b4.l lVar = this.f6318b;
            lVar.getClass();
            Object obj2 = lVar.f997a.get(obj);
            if (obj2 != null) {
                this.f6321e++;
                return obj2;
            }
            this.f6322f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        pc.j.e(obj, "key");
        synchronized (this.f6319c) {
            this.f6320d++;
            b4.l lVar = this.f6318b;
            lVar.getClass();
            put = lVar.f997a.put(obj, obj2);
            if (put != null) {
                this.f6320d--;
            }
        }
        int i10 = this.f6317a;
        while (true) {
            synchronized (this.f6319c) {
                try {
                    if (this.f6320d < 0 || (this.f6318b.f997a.isEmpty() && this.f6320d != 0)) {
                        break;
                    }
                    if (this.f6320d <= i10 || this.f6318b.f997a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.f6318b.f997a.entrySet();
                    pc.j.d(entrySet, "<get-entries>(...)");
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    b4.l lVar2 = this.f6318b;
                    lVar2.getClass();
                    pc.j.e(key, "key");
                    lVar2.f997a.remove(key);
                    int i11 = this.f6320d;
                    pc.j.e(value, "value");
                    this.f6320d = i11 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f6319c) {
            try {
                int i10 = this.f6321e;
                int i11 = this.f6322f + i10;
                str = "LruCache[maxSize=" + this.f6317a + ",hits=" + this.f6321e + ",misses=" + this.f6322f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
