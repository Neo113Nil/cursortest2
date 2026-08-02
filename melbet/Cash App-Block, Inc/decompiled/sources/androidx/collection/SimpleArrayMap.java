package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class SimpleArrayMap {

    /* renamed from: array, reason: collision with root package name */
    public Object[] f848array;
    public int[] hashes;
    public int size;

    public SimpleArrayMap(int i) {
        this.hashes = i == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i];
        this.f848array = i == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i << 1];
    }

    public final int __restricted$indexOfValue(Object obj) {
        int i = this.size * 2;
        Object[] objArr = this.f848array;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.f848array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size <= 0) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    public boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return __restricted$indexOfValue(obj) >= 0;
    }

    public final void ensureCapacity(int i) {
        int i2 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            this.hashes = Arrays.copyOf(iArr, i);
            this.f848array = Arrays.copyOf(this.f848array, i * 2);
        }
        if (this.size == i2) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                int i = this.size;
                if (i != ((SimpleArrayMap) obj).size) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object keyAt = keyAt(i2);
                    Object valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.size != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                Object keyAt2 = keyAt(i4);
                Object valueAt2 = valueAt(i4);
                Object obj3 = ((Map) obj).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!valueAt2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return this.f848array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? this.f848array[(indexOfKey << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.f848array;
        int i = this.size;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final int indexOf(int i, Object obj) {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(i2, i, this.hashes);
        if (binarySearch < 0 || Intrinsics.areEqual(obj, this.f848array[binarySearch << 1])) {
            return binarySearch;
        }
        int i3 = binarySearch + 1;
        while (i3 < i2 && this.hashes[i3] == i) {
            if (Intrinsics.areEqual(obj, this.f848array[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = binarySearch - 1; i4 >= 0 && this.hashes[i4] == i; i4--) {
            if (Intrinsics.areEqual(obj, this.f848array[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int indexOfKey(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj.hashCode(), obj);
    }

    public final int indexOfNull() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(i, 0, this.hashes);
        if (binarySearch < 0 || this.f848array[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i2 = binarySearch + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.f848array[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = binarySearch - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.f848array[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean isEmpty() {
        return this.size <= 0;
    }

    public final Object keyAt(int i) {
        if (i >= 0 && i < this.size) {
            return this.f848array[i << 1];
        }
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.size;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int indexOf = obj != null ? indexOf(hashCode, obj) : indexOfNull();
        if (indexOf >= 0) {
            int i2 = (indexOf << 1) + 1;
            Object[] objArr = this.f848array;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~indexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.hashes = Arrays.copyOf(iArr, i4);
            this.f848array = Arrays.copyOf(this.f848array, i4 << 1);
            if (i != this.size) {
                Drop$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(i5, iArr2, i3, i, iArr2);
            Object[] objArr2 = this.f848array;
            ArraysKt___ArraysJvmKt.copyInto(i5 << 1, i3 << 1, this.size << 1, objArr2, objArr2);
        }
        int i6 = this.size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f848array;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.size = i6 + 1;
                return null;
            }
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public void putAll(ArrayMap arrayMap) {
        int i = arrayMap.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
            }
        } else if (i > 0) {
            ArraysKt___ArraysJvmKt.copyInto(0, arrayMap.hashes, 0, i, this.hashes);
            ArraysKt___ArraysJvmKt.copyInto(0, 0, i << 1, arrayMap.f848array, this.f848array);
            this.size = i;
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey < 0 || !Intrinsics.areEqual(obj2, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public Object removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f848array;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ArraysKt___ArraysJvmKt.copyInto(i, iArr, i5, i2, iArr);
                Object[] objArr2 = this.f848array;
                ArraysKt___ArraysJvmKt.copyInto(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f848array;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.hashes = Arrays.copyOf(iArr, i7);
            this.f848array = Arrays.copyOf(this.f848array, i7 << 1);
            if (i2 != this.size) {
                Drop$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            if (i > 0) {
                ArraysKt___ArraysJvmKt.copyInto(0, iArr, 0, i, this.hashes);
                ArraysKt___ArraysJvmKt.copyInto(0, 0, i3, objArr, this.f848array);
            }
            if (i < i4) {
                int i8 = i + 1;
                ArraysKt___ArraysJvmKt.copyInto(i, iArr, i8, i2, this.hashes);
                ArraysKt___ArraysJvmKt.copyInto(i3, i8 << 1, i2 << 1, objArr, this.f848array);
            }
        }
        if (i2 == this.size) {
            this.size = i4;
            return obj;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey < 0 || !Intrinsics.areEqual(obj2, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, obj3);
        return true;
    }

    public Object setValueAt(int i, Object obj) {
        if (i < 0 || i >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f848array;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int size() {
        return this.size;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object keyAt = keyAt(i2);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object valueAt = valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object valueAt(int i) {
        if (i >= 0 && i < this.size) {
            return this.f848array[(i << 1) + 1];
        }
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, obj2);
        }
        return null;
    }
}
