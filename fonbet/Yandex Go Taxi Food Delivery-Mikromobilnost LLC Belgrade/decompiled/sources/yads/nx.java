package yads;

import defpackage.cw00;
import defpackage.d871;
import defpackage.jha1;
import defpackage.ny61;
import defpackage.q8a1;
import defpackage.rh71;
import defpackage.tja1;
import defpackage.w4a1;
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

/* loaded from: classes7.dex */
public final class nx extends AbstractMap implements Serializable {
    public static final Object C = new Object();
    public transient rh71 A;
    public transient cw00 B;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] w;
    public transient int x = Math.min(Math.max(8, 1), 1073741823);
    public transient int y;
    public transient rh71 z;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(q8a1.c(readInt, "Invalid size: "));
        }
        if (!(readInt >= 0)) {
            ny61.g("Expected size must be >= 0");
            return;
        }
        this.x = Math.min(Math.max(readInt, 1), 1073741823);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map f = f();
        Iterator it = f != null ? f.entrySet().iterator() : new d871(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final int a(int i, int i2, int i3, int i4) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            ny61.g(q8a1.c(i2, "must be power of 2 between 2^1 and 2^30: "));
            return 0;
        }
        Object obj = i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        int i5 = i2 - 1;
        if (i4 != 0) {
            jha1.c(i3 & i5, i4 + 1, obj);
        }
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        for (int i6 = 0; i6 <= i; i6++) {
            int a = jha1.a(i6, obj2);
            while (a != 0) {
                int i7 = a - 1;
                int i8 = iArr2[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int a2 = jha1.a(i10, obj);
                jha1.c(i10, a, obj);
                iArr2[i7] = ((~i5) & i9) | (a2 & i5);
                a = i8 & i;
            }
        }
        this.a = obj;
        this.x = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.x & (-32));
        return i5;
    }

    public final int b(Object obj) {
        if (j()) {
            return -1;
        }
        int a = w4a1.a(obj == null ? 0 : obj.hashCode());
        int i = (1 << (this.x & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int a2 = jha1.a(a & i, obj2);
        if (a2 == 0) {
            return -1;
        }
        int i2 = ~i;
        int i3 = a & i2;
        do {
            int i4 = a2 - 1;
            int[] iArr = this.b;
            Objects.requireNonNull(iArr);
            int i5 = iArr[i4];
            if ((i5 & i2) == i3 && tja1.a(obj, c(i4))) {
                return i4;
            }
            a2 = i5 & i;
        } while (a2 != 0);
        return -1;
    }

    public final Object c(int i) {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (j()) {
            return;
        }
        this.x += 32;
        Map f = f();
        if (f != null) {
            this.x = Math.min(Math.max(size(), 3), 1073741823);
            f.clear();
            this.a = null;
            this.y = 0;
            return;
        }
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        Arrays.fill(objArr, 0, this.y, (Object) null);
        Object[] objArr2 = this.w;
        Objects.requireNonNull(objArr2);
        Arrays.fill(objArr2, 0, this.y, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        Arrays.fill(iArr, 0, this.y, 0);
        this.y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f = f();
        return f != null ? f.containsKey(obj) : b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f = f();
        if (f != null) {
            return f.containsValue(obj);
        }
        for (int i = 0; i < this.y; i++) {
            if (tja1.a(obj, h(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        rh71 rh71Var = this.A;
        if (rh71Var != null) {
            return rh71Var;
        }
        rh71 rh71Var2 = new rh71(this, 0);
        this.A = rh71Var2;
        return rh71Var2;
    }

    public final Map f() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void g(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = objArr;
        Object[] objArr3 = this.w;
        Objects.requireNonNull(objArr3);
        Object[] objArr4 = objArr3;
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr2[i] = null;
            objArr4[i] = null;
            iArr2[i] = 0;
            return;
        }
        Object obj2 = objArr2[i3];
        objArr2[i] = obj2;
        objArr4[i] = objArr4[i3];
        objArr2[i3] = null;
        objArr4[i3] = null;
        iArr2[i] = iArr2[i3];
        iArr2[i3] = 0;
        int a = w4a1.a(obj2 != null ? obj2.hashCode() : 0) & i2;
        int a2 = jha1.a(a, obj);
        if (a2 == size) {
            jha1.c(a, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = a2 - 1;
            int i5 = iArr2[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr2[i4] = ((~i2) & i5) | ((i + 1) & i2);
                return;
            }
            a2 = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f = f();
        if (f != null) {
            return f.get(obj);
        }
        int b = b(obj);
        if (b == -1) {
            return null;
        }
        return h(b);
    }

    public final Object h(int i) {
        Object[] objArr = this.w;
        Objects.requireNonNull(objArr);
        return objArr[i];
    }

    public final Object i(Object obj) {
        boolean j = j();
        Object obj2 = C;
        if (j) {
            return obj2;
        }
        int i = (1 << (this.x & 31)) - 1;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        int b = jha1.b(obj, null, i, obj3, iArr2, objArr, null);
        if (b == -1) {
            return obj2;
        }
        Object h = h(b);
        g(b, i);
        this.y--;
        this.x += 32;
        return h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean j() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        rh71 rh71Var = this.z;
        if (rh71Var != null) {
            return rh71Var;
        }
        rh71 rh71Var2 = new rh71(this, 1);
        this.z = rh71Var2;
        return rh71Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r13 = -1;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 32;
        if (j()) {
            if (!j()) {
                ny61.r("Arrays already allocated");
                return null;
            }
            int i4 = this.x;
            int max = Math.max(i4 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            if (max2 < 2 || max2 > 1073741824 || Integer.highestOneBit(max2) != max2) {
                ny61.g(q8a1.c(max2, "must be power of 2 between 2^1 and 2^30: "));
                return null;
            }
            this.a = max2 <= 256 ? new byte[max2] : max2 <= 65536 ? new short[max2] : new int[max2];
            this.x = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.x & (-32));
            this.b = new int[i4];
            this.c = new Object[i4];
            this.w = new Object[i4];
        }
        Map f = f();
        if (f != null) {
            return f.put(obj, obj2);
        }
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        Object[] objArr2 = this.w;
        Objects.requireNonNull(objArr2);
        int i5 = this.y;
        int i6 = i5 + 1;
        int a = w4a1.a(obj == null ? 0 : obj.hashCode());
        int i7 = 1 << (this.x & 31);
        int i8 = i7 - 1;
        int i9 = a & i8;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int a2 = jha1.a(i9, obj3);
        if (a2 == 0) {
            if (i6 > i8) {
                i8 = a(i8, i7 * (i8 < 32 ? 4 : 2), a, i5);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                jha1.c(i9, i6, obj4);
            }
            i = 1;
        } else {
            int i10 = ~i8;
            i = 1;
            int i11 = a & i10;
            int i12 = 0;
            while (true) {
                int i13 = a2 - 1;
                int i14 = iArr[i13];
                int i15 = i3;
                int i16 = i14 & i10;
                if (i16 == i11 && tja1.a(obj, objArr[i13])) {
                    Object obj5 = objArr2[i13];
                    objArr2[i13] = obj2;
                    return obj5;
                }
                int i17 = i14 & i8;
                int[] iArr2 = iArr;
                int i18 = i12 + 1;
                if (i17 != 0) {
                    i12 = i18;
                    a2 = i17;
                    iArr = iArr2;
                    i3 = i15;
                } else if (i18 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1 << (this.x & 31), 1.0f);
                    if (!isEmpty()) {
                        i2 = 0;
                        while (i2 >= 0) {
                            linkedHashMap.put(c(i2), h(i2));
                            i2++;
                            if (i2 < this.y) {
                            }
                        }
                        this.a = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.w = null;
                        this.x += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    i2 = -1;
                } else if (i6 > i8) {
                    i8 = a(i8, i7 * (i8 < i15 ? 4 : 2), a, i5);
                } else {
                    iArr2[i13] = (i6 & i8) | i16;
                }
            }
        }
        int[] iArr3 = this.b;
        Objects.requireNonNull(iArr3);
        int length = iArr3.length;
        if (i6 > length) {
            int i19 = i;
            int min = Math.min(1073741823, (Math.max(i19, length >>> 1) + length) | i19);
            if (min != length) {
                int[] iArr4 = this.b;
                Objects.requireNonNull(iArr4);
                this.b = Arrays.copyOf(iArr4, min);
                Object[] objArr3 = this.c;
                Objects.requireNonNull(objArr3);
                this.c = Arrays.copyOf(objArr3, min);
                Object[] objArr4 = this.w;
                Objects.requireNonNull(objArr4);
                this.w = Arrays.copyOf(objArr4, min);
            }
        }
        int i20 = (~i8) & a;
        int[] iArr5 = this.b;
        Objects.requireNonNull(iArr5);
        iArr5[i5] = i20;
        Object[] objArr5 = this.c;
        Objects.requireNonNull(objArr5);
        objArr5[i5] = obj;
        Object[] objArr6 = this.w;
        Objects.requireNonNull(objArr6);
        objArr6[i5] = obj2;
        this.y = i6;
        this.x += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f = f();
        if (f != null) {
            return f.remove(obj);
        }
        Object i = i(obj);
        if (i == C) {
            return null;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f = f();
        return f != null ? f.size() : this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        cw00 cw00Var = this.B;
        if (cw00Var != null) {
            return cw00Var;
        }
        cw00 cw00Var2 = new cw00(3, this);
        this.B = cw00Var2;
        return cw00Var2;
    }
}
