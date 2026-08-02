package com.google.common.collect;

import androidx.core.os.BundleKt;
import androidx.tracing.Trace;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes.dex */
public final class RegularImmutableMap implements Map, Serializable {
    public static final RegularImmutableMap EMPTY = new RegularImmutableMap(new Object[0], null, 0);
    public final transient Object[] alternatingKeysAndValues;
    public transient EntrySet entrySet;
    public final transient Object hashTable;
    public transient KeySet keySet;
    public final transient int size;
    public transient KeysOrValuesAsList values;

    /* loaded from: classes4.dex */
    public final class EntrySet extends ImmutableSet {
        public final transient Object[] alternatingKeysAndValues;
        public final transient RegularImmutableMap map;
        public final transient int size;

        public EntrySet(RegularImmutableMap regularImmutableMap, Object[] objArr, int i) {
            this.map = regularImmutableMap;
            this.alternatingKeysAndValues = objArr;
            this.size = i;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(int i, Object[] objArr) {
            return asList().copyIntoArray(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList createAsList() {
            return new ImmutableList() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i) {
                    EntrySet entrySet = EntrySet.this;
                    Trace.checkElementIndex(i, entrySet.size);
                    Object[] objArr = entrySet.alternatingKeysAndValues;
                    int i2 = i * 2;
                    Object obj = objArr[i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i2 + 1];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public final boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.size;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final UnmodifiableIterator iterator() {
            return asList().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.size;
        }
    }

    public final class KeySet extends ImmutableSet {
        public final transient KeysOrValuesAsList list;
        public final transient RegularImmutableMap map;

        public KeySet(RegularImmutableMap regularImmutableMap, KeysOrValuesAsList keysOrValuesAsList) {
            this.map = regularImmutableMap;
            this.list = keysOrValuesAsList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int copyIntoArray(int i, Object[] objArr) {
            return this.list.copyIntoArray(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final UnmodifiableIterator iterator() {
            return this.list.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.map.size;
        }
    }

    public final class KeysOrValuesAsList extends ImmutableList {
        public final transient Object[] alternatingKeysAndValues;
        public final transient int offset;
        public final transient int size;

        public KeysOrValuesAsList(int i, int i2, Object[] objArr) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            Trace.checkElementIndex(i, this.size);
            Object obj = this.alternatingKeysAndValues[(i * 2) + this.offset];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.size;
        }
    }

    public RegularImmutableMap(Object[] objArr, Object obj, int i) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    public static StatusLine builder() {
        return new StatusLine(4);
    }

    public static RegularImmutableMap copyOf(Map map) {
        if ((map instanceof RegularImmutableMap) && !(map instanceof SortedMap)) {
            return (RegularImmutableMap) map;
        }
        Set entrySet = map.entrySet();
        StatusLine statusLine = new StatusLine(entrySet instanceof Collection ? entrySet.size() : 4);
        statusLine.putAll(entrySet);
        return statusLine.build(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RegularImmutableMap create(int i, Object[] objArr, StatusLine statusLine) {
        boolean z;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return EMPTY;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new RegularImmutableMap(objArr2, null, 1);
        }
        Trace.checkPositionIndex(i4, objArr2.length >> 1);
        int chooseTableSize = ImmutableSet.chooseTableSize(i4);
        char c3 = 2;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i2 = 1;
        } else {
            int i6 = chooseTableSize - 1;
            if (chooseTableSize <= 128) {
                byte[] bArr = new byte[chooseTableSize];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj3 = objArr2[i9];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i9 ^ i5];
                    Objects.requireNonNull(obj4);
                    int smear = BundleKt.smear(obj3.hashCode());
                    while (true) {
                        int i11 = smear & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArr2[i10] = obj3;
                                objArr2[i10 ^ 1] = obj4;
                            }
                            i8++;
                        } else {
                            if (obj3.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj5 = objArr2[i13];
                                Objects.requireNonNull(obj5);
                                obj2 = new ImmutableMap$Builder$DuplicateKey(obj3, obj4, obj5);
                                objArr2[i13] = obj4;
                                break;
                            }
                            smear = i11 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    obj2 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (chooseTableSize > 32768) {
                    int[] iArr = new int[chooseTableSize];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i14 * 2;
                        int i17 = i15 * 2;
                        Object obj6 = objArr2[i16];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i16 ^ 1];
                        Objects.requireNonNull(obj7);
                        int smear2 = BundleKt.smear(obj6.hashCode());
                        while (true) {
                            int i18 = smear2 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i17;
                                if (i15 < i14) {
                                    objArr2[i17] = obj6;
                                    objArr2[i17 ^ 1] = obj7;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj8 = objArr2[i20];
                                    Objects.requireNonNull(obj8);
                                    obj2 = new ImmutableMap$Builder$DuplicateKey(obj6, obj7, obj8);
                                    objArr2[i20] = obj7;
                                    break;
                                }
                                smear2 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z3) {
                        Object[] objArr4 = (Object[]) obj;
                        ImmutableMap$Builder$DuplicateKey immutableMap$Builder$DuplicateKey = (ImmutableMap$Builder$DuplicateKey) objArr4[c];
                        if (statusLine == null) {
                            throw immutableMap$Builder$DuplicateKey.exception();
                        }
                        statusLine.message = immutableMap$Builder$DuplicateKey;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                        obj9 = obj10;
                        i4 = intValue;
                    }
                    return new RegularImmutableMap(objArr2, obj9, i4);
                }
                sArr = new short[chooseTableSize];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i22 * 2;
                    int i24 = i21 * 2;
                    Object obj11 = objArr2[i23];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i23 ^ 1];
                    Objects.requireNonNull(obj12);
                    int smear3 = BundleKt.smear(obj11.hashCode());
                    while (true) {
                        int i25 = smear3 & i6;
                        int i26 = sArr[i25] & HPKE.aead_EXPORT_ONLY;
                        if (i26 == 65535) {
                            sArr[i25] = (short) i24;
                            if (i21 < i22) {
                                objArr2[i24] = obj11;
                                objArr2[i24 ^ 1] = obj12;
                            }
                            i21++;
                        } else {
                            if (obj11.equals(objArr2[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj13 = objArr2[i27];
                                Objects.requireNonNull(obj13);
                                obj2 = new ImmutableMap$Builder$DuplicateKey(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                break;
                            }
                            smear3 = i25 + 1;
                        }
                    }
                }
                if (i21 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                    z4 = z;
                }
                obj2 = sArr;
                z4 = z;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj92 = obj;
        if (z3) {
        }
        return new RegularImmutableMap(objArr2, obj92, i4);
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
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final ImmutableSet entrySet() {
        EntrySet entrySet = this.entrySet;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet(this, this.alternatingKeysAndValues, this.size);
        this.entrySet = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.alternatingKeysAndValues;
            if (this.size == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.hashTable;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int smear = BundleKt.smear(obj.hashCode());
                        while (true) {
                            int i = smear & length;
                            int i2 = bArr[i] & 255;
                            if (i2 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i2])) {
                                obj2 = objArr[i2 ^ 1];
                                break;
                            }
                            smear = i + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int smear2 = BundleKt.smear(obj.hashCode());
                        while (true) {
                            int i3 = smear2 & length2;
                            int i4 = sArr[i3] & HPKE.aead_EXPORT_ONLY;
                            if (i4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                                break;
                            }
                            smear2 = i3 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int smear3 = BundleKt.smear(obj.hashCode());
                        while (true) {
                            int i5 = smear3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            smear3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return Maps.hashCodeImpl(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final ImmutableSet keySet() {
        KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet(this, new KeysOrValuesAsList(0, this.size, this.alternatingKeysAndValues));
        this.keySet = keySet2;
        return keySet2;
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

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final String toString() {
        return Maps.toStringImpl(this);
    }

    @Override // java.util.Map
    public final ImmutableCollection values() {
        KeysOrValuesAsList keysOrValuesAsList = this.values;
        if (keysOrValuesAsList != null) {
            return keysOrValuesAsList;
        }
        KeysOrValuesAsList keysOrValuesAsList2 = new KeysOrValuesAsList(1, this.size, this.alternatingKeysAndValues);
        this.values = keysOrValuesAsList2;
        return keysOrValuesAsList2;
    }
}
