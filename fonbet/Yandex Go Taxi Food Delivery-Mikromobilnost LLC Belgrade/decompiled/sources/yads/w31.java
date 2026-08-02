package yads;

import defpackage.ela1;
import defpackage.jr71;
import defpackage.mja1;
import defpackage.p481;
import defpackage.wr71;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public abstract class w31 implements Map, Serializable {
    public transient yk2 a;
    public transient zk2 b;
    public transient al2 c;

    public static w31 a(HashMap hashMap) {
        int size;
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z = entrySet instanceof Collection;
        int size2 = (z ? entrySet.size() : 4) * 2;
        Object[] objArr = new Object[size2];
        if (z && (size = entrySet.size() * 2) > size2) {
            objArr = Arrays.copyOf(objArr, jr71.a(size2, size));
        }
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            int i3 = i2 * 2;
            if (i3 > objArr.length) {
                objArr = Arrays.copyOf(objArr, jr71.a(objArr.length, i3));
            }
            ela1.b(key, value);
            int i4 = i * 2;
            objArr[i4] = key;
            objArr[i4 + 1] = value;
            i = i2;
        }
        return bl2.f(i, objArr);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yk2 entrySet() {
        yk2 yk2Var = this.a;
        if (yk2Var != null) {
            return yk2Var;
        }
        bl2 bl2Var = (bl2) this;
        yk2 yk2Var2 = new yk2(bl2Var, bl2Var.x, bl2Var.y);
        this.a = yk2Var2;
        return yk2Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        al2 al2Var = this.c;
        if (al2Var == null) {
            bl2 bl2Var = (bl2) this;
            al2 al2Var2 = new al2(1, bl2Var.y, bl2Var.x);
            this.c = al2Var2;
            al2Var = al2Var2;
        }
        return al2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return mja1.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((bl2) this).y == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zk2 zk2Var = this.b;
        if (zk2Var != null) {
            return zk2Var;
        }
        bl2 bl2Var = (bl2) this;
        zk2 zk2Var2 = new zk2(bl2Var, new al2(0, bl2Var.y, bl2Var.x));
        this.b = zk2Var2;
        return zk2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((bl2) this).y;
        ela1.a(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        wr71 it = entrySet().iterator();
        boolean z = true;
        while (true) {
            p481 p481Var = (p481) it;
            if (!p481Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) p481Var.next();
            if (!z) {
                sb.append(Extension.FIX_SPACE);
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        al2 al2Var = this.c;
        if (al2Var != null) {
            return al2Var;
        }
        bl2 bl2Var = (bl2) this;
        al2 al2Var2 = new al2(1, bl2Var.y, bl2Var.x);
        this.c = al2Var2;
        return al2Var2;
    }

    public Object writeReplace() {
        return new v31(this);
    }
}
