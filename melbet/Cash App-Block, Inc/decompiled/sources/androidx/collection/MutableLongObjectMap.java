package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.ULong;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes.dex */
public final class MutableLongObjectMap {
    public int _capacity;
    public int _size;
    public int growthLimit;
    public long[] keys;
    public long[] metadata;
    public Object[] values;

    public MutableLongObjectMap(int i) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.EmptyLongArray;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
        } else {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt___ArraysJvmKt.fill(this.values, 0, this._capacity, null);
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutableLongObjectMap)) {
            return false;
        }
        MutableLongObjectMap mutableLongObjectMap = (MutableLongObjectMap) obj;
        if (mutableLongObjectMap._size != this._size) {
            return false;
        }
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (mutableLongObjectMap.get(j2) != null || !mutableLongObjectMap.containsKey(j2)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(mutableLongObjectMap.get(j2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int findAbsoluteInsertIndex(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        Object[] objArr;
        int i3;
        long[] jArr3;
        int i4 = -862048943;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this._capacity;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr4 = this.metadata;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j6 = ((jArr4[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr4[i11] >>> i12);
            long j7 = i7;
            int i14 = i10;
            int i15 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                int i16 = i4;
                if (this.keys[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i6);
                if (this.growthLimit != 0 || ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this._capacity;
                    if (i18 > 8) {
                        j4 = 128;
                        long j10 = this._size;
                        ULong.Companion companion = ULong.Companion;
                        if (Long.compareUnsigned(j10 * 32, i18 * 25) <= 0) {
                            long[] jArr5 = this.metadata;
                            int i19 = this._capacity;
                            long[] jArr6 = this.keys;
                            Object[] objArr2 = this.values;
                            int i20 = (i19 + 7) >> 3;
                            j2 = 255;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j11 = jArr5[i21] & (-9187201950435737472L);
                                jArr5[i21] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i21++;
                                i13 = i13;
                                i15 = i15;
                                j7 = j7;
                            }
                            j3 = j7;
                            i = i15;
                            int i22 = i13;
                            char c = 7;
                            int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr5);
                            int i23 = lastIndex - 1;
                            long j12 = 72057594037927935L;
                            jArr5[i23] = (jArr5[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[lastIndex] = jArr5[i];
                            int i24 = i;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j13 = (jArr5[i25] >> i26) & 255;
                                if (j13 != 128 && j13 == 254) {
                                    int hashCode2 = Long.hashCode(jArr6[i24]) * i17;
                                    int i27 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int findFirstAvailableSlot2 = findFirstAvailableSlot(i27);
                                    int i28 = i27 & i19;
                                    char c2 = c;
                                    if (((findFirstAvailableSlot2 - i28) & i19) / 8 == ((i24 - i28) & i19) / 8) {
                                        int i29 = i22;
                                        j5 = j12;
                                        jArr5[i25] = ((r9 & 127) << i26) | (jArr5[i25] & (~(255 << i26)));
                                        jArr5[jArr5.length - i29] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        i22 = i29;
                                        c = c2;
                                    } else {
                                        int i30 = i22;
                                        j5 = j12;
                                        int i31 = findFirstAvailableSlot2 >> 3;
                                        long j14 = jArr5[i31];
                                        int i32 = (findFirstAvailableSlot2 & 7) << 3;
                                        if (((j14 >> i32) & 255) == 128) {
                                            i3 = i30;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i31] = (j14 & (~(255 << i32))) | ((r9 & 127) << i32);
                                            jArr5[i25] = (jArr5[i25] & (~(255 << i26))) | (128 << i26);
                                            jArr3[findFirstAvailableSlot2] = jArr3[i24];
                                            jArr3[i24] = 0;
                                            objArr[findFirstAvailableSlot2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            objArr = objArr2;
                                            i3 = i30;
                                            jArr3 = jArr6;
                                            jArr5[i31] = ((r9 & 127) << i32) | (j14 & (~(255 << i32)));
                                            long j15 = jArr3[findFirstAvailableSlot2];
                                            jArr3[findFirstAvailableSlot2] = jArr3[i24];
                                            jArr3[i24] = j15;
                                            Object obj = objArr[findFirstAvailableSlot2];
                                            objArr[findFirstAvailableSlot2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        jArr6 = jArr3;
                                        i22 = i3;
                                        c = c2;
                                        objArr2 = objArr;
                                    }
                                    j12 = j5;
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i22;
                            this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
                            findFirstAvailableSlot = findFirstAvailableSlot(i6);
                        }
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    int nextCapacity = ScatterMapKt.nextCapacity(this._capacity);
                    long[] jArr7 = this.metadata;
                    long[] jArr8 = this.keys;
                    Object[] objArr3 = this.values;
                    int i33 = this._capacity;
                    initializeStorage(nextCapacity);
                    long[] jArr9 = this.metadata;
                    long[] jArr10 = this.keys;
                    Object[] objArr4 = this.values;
                    int i34 = this._capacity;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr7[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j4) {
                            long j16 = jArr8[i35];
                            int hashCode3 = Long.hashCode(j16) * i17;
                            int i36 = hashCode3 ^ (hashCode3 << 16);
                            int findFirstAvailableSlot3 = findFirstAvailableSlot(i36 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j17 = i36 & 127;
                            int i37 = findFirstAvailableSlot3 >> 3;
                            int i38 = (findFirstAvailableSlot3 & 7) << 3;
                            long j18 = (jArr[i37] & (~(255 << i38))) | (j17 << i38);
                            jArr[i37] = j18;
                            jArr[(((findFirstAvailableSlot3 - 7) & i34) + (i34 & 7)) >> 3] = j18;
                            jArr10[findFirstAvailableSlot3] = j16;
                            objArr4[findFirstAvailableSlot3] = objArr3[i35];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i35++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    findFirstAvailableSlot = findFirstAvailableSlot(i6);
                }
                this._size++;
                int i39 = this.growthLimit;
                long[] jArr11 = this.metadata;
                int i40 = findFirstAvailableSlot >> 3;
                long j19 = jArr11[i40];
                int i41 = (findFirstAvailableSlot & 7) << 3;
                if (((j19 >> i41) & j2) != j4) {
                    i2 = i;
                }
                this.growthLimit = i39 - i2;
                int i42 = this._capacity;
                long j20 = (j19 & (~(j2 << i41))) | (j3 << i41);
                jArr11[i40] = j20;
                jArr11[(((findFirstAvailableSlot - 7) & i42) + (i42 & 7)) >> 3] = j20;
                return findFirstAvailableSlot;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    public final int findFirstAvailableSlot(int i) {
        int i2 = this._capacity;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return this.values[i];
        }
        return null;
    }

    public final int hashCode() {
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        long j2 = jArr[i5];
                        Object obj = objArr[i5];
                        i2 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final void initializeStorage(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i)) : 0;
        this._capacity = max;
        if (max == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
        this.keys = new long[max];
        this.values = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0) {
            return null;
        }
        this._size--;
        long[] jArr2 = this.metadata;
        int i9 = this._capacity;
        int i10 = i >> 3;
        int i11 = (i & 7) << 3;
        long j5 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j5;
        jArr2[(((i - 7) & i9) + (i9 & 7)) >> 3] = j5;
        Object[] objArr = this.values;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void set(Object obj, long j) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(j);
        this.keys[findAbsoluteInsertIndex] = j;
        this.values[findAbsoluteInsertIndex] = obj;
    }

    public final String toString() {
        int i;
        int i2;
        if (this._size == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ MutableLongObjectMap() {
        this(6);
    }
}
