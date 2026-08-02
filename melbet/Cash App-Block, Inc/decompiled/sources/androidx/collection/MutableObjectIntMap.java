package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.ULong;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MutableObjectIntMap {
    public int _capacity;
    public int _size;
    public int growthLimit;
    public Object[] keys;
    public long[] metadata;
    public int[] values;

    public MutableObjectIntMap(int i) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = IntSetKt.EmptyIntArray;
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
        ArraysKt___ArraysJvmKt.fill(this.keys, 0, this._capacity, null);
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutableObjectIntMap)) {
            return false;
        }
        MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) obj;
        if (mutableObjectIntMap._size != this._size) {
            return false;
        }
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int findKeyIndex = mutableObjectIntMap.findKeyIndex(obj2);
                            if (findKeyIndex < 0 || i5 != mutableObjectIntMap.values[findKeyIndex]) {
                                break loop0;
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

    public final int findIndex(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this._capacity;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i4);
                long j8 = 255;
                if (this.growthLimit != 0 || ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this._capacity;
                    if (i14 > 8) {
                        int i15 = 8;
                        long j9 = this._size;
                        ULong.Companion companion = ULong.Companion;
                        if (Long.compareUnsigned(j9 * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.metadata;
                            int i16 = this._capacity;
                            Object[] objArr2 = this.keys;
                            int[] iArr = this.values;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j10 = j8;
                                long j11 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr4);
                            int i20 = lastIndex - 1;
                            long j12 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[lastIndex] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j13 = (jArr4[i22] >> i23) & j;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int findFirstAvailableSlot2 = findFirstAvailableSlot(i24);
                                    int i25 = i24 & i16;
                                    long j14 = j12;
                                    if (((findFirstAvailableSlot2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i19;
                                        j12 = j14;
                                    } else {
                                        int i26 = i19;
                                        int i27 = findFirstAvailableSlot2 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (findFirstAvailableSlot2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[findFirstAvailableSlot2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[findFirstAvailableSlot2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[findFirstAvailableSlot2];
                                            objArr[findFirstAvailableSlot2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[findFirstAvailableSlot2];
                                            iArr[findFirstAvailableSlot2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        i19 = i26;
                                        j12 = j14;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
                            findFirstAvailableSlot = findFirstAvailableSlot(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int nextCapacity = ScatterMapKt.nextCapacity(this._capacity);
                    long[] jArr5 = this.metadata;
                    Object[] objArr3 = this.keys;
                    int[] iArr2 = this.values;
                    int i30 = this._capacity;
                    initializeStorage(nextCapacity);
                    long[] jArr6 = this.metadata;
                    Object[] objArr4 = this.keys;
                    int[] iArr3 = this.values;
                    int i31 = this._capacity;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int findFirstAvailableSlot3 = findFirstAvailableSlot(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j16 = i33 & 127;
                            int i34 = findFirstAvailableSlot3 >> 3;
                            int i35 = (findFirstAvailableSlot3 & 7) << 3;
                            long j17 = (jArr[i34] & (~(255 << i35))) | (j16 << i35);
                            jArr[i34] = j17;
                            jArr[(((findFirstAvailableSlot3 - 7) & i31) + (i31 & 7)) >> 3] = j17;
                            objArr4[findFirstAvailableSlot3] = obj4;
                            iArr3[findFirstAvailableSlot3] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    findFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i36 = this.growthLimit;
                long[] jArr7 = this.metadata;
                int i37 = findFirstAvailableSlot >> 3;
                long j18 = jArr7[i37];
                int i38 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this._capacity;
                long j19 = (j18 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j19;
                jArr7[(((findFirstAvailableSlot - 7) & i39) + (i39 & 7)) >> 3] = j19;
                return ~findFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int findKeyIndex(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int hashCode() {
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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
        this.keys = new Object[max];
        this.values = new int[max];
    }

    public final void removeValueAt(int i) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.keys[i] = null;
    }

    public final void set(int i, Object obj) {
        int findIndex = findIndex(obj);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        }
        this.keys[findIndex] = obj;
        this.values[findIndex] = i;
    }

    public final String toString() {
        if (this._size == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ MutableObjectIntMap() {
        this(6);
    }
}
