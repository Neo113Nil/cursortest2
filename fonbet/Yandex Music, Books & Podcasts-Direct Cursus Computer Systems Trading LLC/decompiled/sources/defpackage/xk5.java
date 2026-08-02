package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class xk5 extends AbstractMap implements Serializable {
    public static final Object j = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient vk5 g;
    public transient vk5 h;
    public transient e8 i;

    public static xk5 a() {
        xk5 xk5Var = new xk5();
        xk5Var.f(3);
        return xk5Var;
    }

    public static xk5 b(int i) {
        xk5 xk5Var = new xk5();
        xk5Var.f(i);
        return xk5Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(k5r.i(readInt, "Invalid size: "));
        }
        f(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map c = c();
        Iterator it = c != null ? c.entrySet().iterator() : new uk5(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map c = c();
        if (c != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            c.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f, (Object) null);
        Arrays.fill(l(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c = c();
        return c != null ? c.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c = c();
        if (c != null) {
            return c.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (hdg.S(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int J = ltg.J(obj);
        int d = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int X = vwb.X(J & d, obj2);
        if (X == 0) {
            return -1;
        }
        int i = ~d;
        int i2 = J & i;
        do {
            int i3 = X - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && hdg.S(obj, k()[i3])) {
                return i3;
            }
            X = i4 & d;
        } while (X != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        vk5 vk5Var = this.h;
        if (vk5Var != null) {
            return vk5Var;
        }
        vk5 vk5Var2 = new vk5(this, 0);
        this.h = vk5Var2;
        return vk5Var2;
    }

    public final void f(int i) {
        o2g.J("Expected size must be >= 0", i >= 0);
        this.e = Math.min(Math.max(i, 1), 1073741823);
    }

    public final void g(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j2 = j();
        Object[] k = k();
        Object[] l = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            k[i] = null;
            l[i] = null;
            j2[i] = 0;
            return;
        }
        Object obj2 = k[i3];
        k[i] = obj2;
        l[i] = l[i3];
        k[i3] = null;
        l[i3] = null;
        j2[i] = j2[i3];
        j2[i3] = 0;
        int J = ltg.J(obj2) & i2;
        int X = vwb.X(J, obj);
        if (X == size) {
            vwb.Y(J, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = X - 1;
            int i5 = j2[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                j2[i4] = vwb.R(i5, i + 1, i2);
                return;
            }
            X = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c = c();
        if (c != null) {
            return c.get(obj);
        }
        int e = e(obj);
        if (e == -1) {
            return null;
        }
        return l()[e];
    }

    public final boolean h() {
        return this.a == null;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int d = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int U = vwb.U(obj, null, d, obj2, j(), k(), null);
            if (U != -1) {
                Object obj3 = l()[U];
                g(U, d);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        vk5 vk5Var = this.g;
        if (vk5Var != null) {
            return vk5Var;
        }
        vk5 vk5Var2 = new vk5(this, 1);
        this.g = vk5Var2;
        return vk5Var2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int o(int i, int i2, int i3, int i4) {
        Object M = vwb.M(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            vwb.Y(i3 & i5, i4 + 1, M);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] j2 = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int X = vwb.X(i6, obj);
            while (X != 0) {
                int i7 = X - 1;
                int i8 = j2[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int X2 = vwb.X(i10, M);
                vwb.Y(i10, X, M);
                j2[i7] = vwb.R(i9, X2, i5);
                X = i8 & i;
            }
        }
        this.a = M;
        this.e = vwb.R(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 32;
        int i4 = 1;
        if (h()) {
            o2g.U("Arrays already allocated", h());
            int i5 = this.e;
            int max = Math.max(i5 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = vwb.M(max2);
            this.e = vwb.R(this.e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.b = new int[i5];
            this.c = new Object[i5];
            this.d = new Object[i5];
        }
        Map c = c();
        if (c != null) {
            return c.put(obj, obj2);
        }
        int[] j2 = j();
        Object[] k = k();
        Object[] l = l();
        int i6 = this.f;
        int i7 = i6 + 1;
        int J = ltg.J(obj);
        int d = d();
        int i8 = J & d;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int X = vwb.X(i8, obj3);
        if (X == 0) {
            if (i7 > d) {
                d = o(d, (d + 1) * (d < 32 ? 4 : 2), J, i6);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                vwb.Y(i8, i7, obj4);
            }
            i = 1;
        } else {
            int i9 = ~d;
            int i10 = J & i9;
            int i11 = 0;
            while (true) {
                int i12 = X - i4;
                i = i4;
                int i13 = j2[i12];
                int i14 = i3;
                if ((i13 & i9) == i10 && hdg.S(obj, k[i12])) {
                    Object obj5 = l[i12];
                    l[i12] = obj2;
                    return obj5;
                }
                int i15 = i13 & d;
                int i16 = i11 + 1;
                if (i15 != 0) {
                    i11 = i16;
                    X = i15;
                    i4 = i;
                    i3 = i14;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (!isEmpty()) {
                            i2 = 0;
                            while (i2 >= 0) {
                                linkedHashMap.put(k()[i2], l()[i2]);
                                int i17 = i2 + 1;
                                if (i17 < this.f) {
                                    i2 = i17;
                                }
                            }
                            this.a = linkedHashMap;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i2 = -1;
                        while (i2 >= 0) {
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i7 > d) {
                        d = o(d, (d + 1) * (d < i14 ? 4 : 2), J, i6);
                    } else {
                        j2[i12] = vwb.R(i13, i7, d);
                    }
                }
            }
        }
        int length = j().length;
        if (i7 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                this.b = Arrays.copyOf(j(), min);
                this.c = Arrays.copyOf(k(), min);
                this.d = Arrays.copyOf(l(), min);
            }
        }
        j()[i6] = vwb.R(J, 0, d);
        k()[i6] = obj;
        l()[i6] = obj2;
        this.f = i7;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c = c();
        if (c != null) {
            return c.remove(obj);
        }
        Object i = i(obj);
        if (i == j) {
            return null;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c = c();
        return c != null ? c.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e8 e8Var = this.i;
        if (e8Var != null) {
            return e8Var;
        }
        e8 e8Var2 = new e8(1, this);
        this.i = e8Var2;
        return e8Var2;
    }
}
