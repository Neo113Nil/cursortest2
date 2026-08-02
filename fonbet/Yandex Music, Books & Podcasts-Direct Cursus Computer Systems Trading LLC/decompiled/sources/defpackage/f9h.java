package defpackage;

import androidx.core.app.q;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f9h implements Map, Serializable, n9f {

    @NotNull
    public static final b9h n = new b9h(null);
    public static final f9h o;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public zlk j;
    public h9h k;
    public g9h l;
    public boolean m;

    static {
        f9h f9hVar = new f9h(0);
        f9hVar.m = true;
        o = f9hVar;
    }

    public f9h(int i) {
        if (i < 0) {
            xq0.x("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        n.getClass();
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[highestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (!this.m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        eip eipVar = new eip();
        eipVar.a = this;
        return eipVar;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j = j(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[j];
                if (i3 <= 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f = i5;
                        objArr[i4] = obj;
                        this.c[i4] = j;
                        iArr[j] = i5;
                        this.i++;
                        this.h++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (Intrinsics.d(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.d.length * 2);
                        break;
                    }
                    j = j == 0 ? this.d.length - 1 : j - 1;
                }
            }
        }
    }

    public final f9h b() {
        c();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        f9h f9hVar = o;
        f9hVar.getClass();
        return f9hVar;
    }

    public final void c() {
        if (this.m) {
            q.i();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        o8g.L(0, this.f, this.a);
        Object[] objArr = this.b;
        if (objArr != null) {
            o8g.L(0, this.f, objArr);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        o8g.L(i3, i, this.a);
        if (objArr != null) {
            o8g.L(i3, this.f, objArr);
        }
        this.f = i3;
    }

    public final boolean e(Collection collection) {
        boolean d;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int h = h(entry.getKey());
                    if (h < 0) {
                        d = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        d = Intrinsics.d(objArr[h], entry.getValue());
                    }
                    if (!d) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g9h g9hVar = this.l;
        if (g9hVar != null) {
            return g9hVar;
        }
        g9h g9hVar2 = new g9h(this);
        this.l = g9hVar2;
        return g9hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && e(map.entrySet());
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            b7 b7Var = a.a;
            int length2 = objArr.length;
            b7Var.getClass();
            int e = b7.e(length2, i5);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            this.a = Arrays.copyOf(objArr2, e);
            Object[] objArr3 = this.b;
            this.b = objArr3 != null ? Arrays.copyOf(objArr3, e) : null;
            this.c = Arrays.copyOf(this.c, e);
            n.getClass();
            int highestOneBit = Integer.highestOneBit((e >= 1 ? e : 1) * 3);
            if (highestOneBit > this.d.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[h];
    }

    public final int h(Object obj) {
        int j = j(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.d(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? this.d.length - 1 : j - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c9h c9hVar = new c9h(this, 0);
        int i = 0;
        while (c9hVar.hasNext()) {
            int i2 = c9hVar.a;
            f9h f9hVar = (f9h) c9hVar.d;
            if (i2 >= f9hVar.f) {
                wvs.n();
                return 0;
            }
            c9hVar.a = i2 + 1;
            c9hVar.b = i2;
            Object obj = f9hVar.a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f9hVar.b;
            objArr.getClass();
            Object obj2 = objArr[c9hVar.b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c9hVar.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (Intrinsics.d(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i) {
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            d(false);
        }
        this.d = new int[i];
        n.getClass();
        this.g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int j = j(this.a[i2]);
            int i4 = this.e;
            while (true) {
                int[] iArr = this.d;
                if (iArr[j] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    xq0.q("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                j = j == 0 ? iArr.length - 1 : j - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        zlk zlkVar = this.j;
        if (zlkVar != null) {
            return zlkVar;
        }
        zlk zlkVar2 = new zlk(2, this);
        this.j = zlkVar2;
        return zlkVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.c[i];
        int i3 = this.e * 2;
        int length = this.d.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.d.length - 1 : i2 - 1;
            i5++;
            int i7 = this.e;
            int[] iArr = this.d;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
            } else {
                int i9 = i8 - 1;
                int j = j(this.a[i9]) - i2;
                int[] iArr2 = this.d;
                if ((j & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.c[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.d[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                xq0.x("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    xq0.x("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!Intrinsics.d(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h = h(obj);
        if (h < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[h];
        l(h);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        c9h c9hVar = new c9h(this, 0);
        while (c9hVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c9hVar.a;
            f9h f9hVar = (f9h) c9hVar.d;
            if (i2 >= f9hVar.f) {
                wvs.n();
                return null;
            }
            c9hVar.a = i2 + 1;
            c9hVar.b = i2;
            Object obj = f9hVar.a[i2];
            if (obj == f9hVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = f9hVar.b;
            objArr.getClass();
            Object obj2 = objArr[c9hVar.b];
            if (obj2 == f9hVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c9hVar.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        h9h h9hVar = this.k;
        if (h9hVar != null) {
            return h9hVar;
        }
        h9h h9hVar2 = new h9h(0, this);
        this.k = h9hVar2;
        return h9hVar2;
    }

    public f9h() {
        this(8);
    }
}
