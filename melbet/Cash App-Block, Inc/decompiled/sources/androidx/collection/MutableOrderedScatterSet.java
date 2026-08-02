package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.ULong;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class MutableOrderedScatterSet {
    public int _capacity;
    public int _size;
    public int growthLimit;
    public long[] metadata = ScatterMapKt.EmptyGroup;
    public Object[] elements = ContainerHelpersKt.EMPTY_OBJECTS;
    public long[] nodes = SieveCacheKt.EmptyNodes;
    public int head = Integer.MAX_VALUE;
    public int tail = Integer.MAX_VALUE;

    public MutableOrderedScatterSet(int i) {
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean add(Object obj) {
        int i = this._size;
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(obj);
        this.elements[findAbsoluteInsertIndex] = obj;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[findAbsoluteInsertIndex] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((findAbsoluteInsertIndex & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
        return this._size != i;
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
        ArraysKt___ArraysJvmKt.fill(this.elements, 0, this._capacity, null);
        ArraysKt___ArraysJvmKt.fill$default(this.nodes, 4611686018427387903L);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.areEqual(this.elements[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
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
        if (!(obj instanceof MutableOrderedScatterSet)) {
            return false;
        }
        MutableOrderedScatterSet mutableOrderedScatterSet = (MutableOrderedScatterSet) obj;
        if (mutableOrderedScatterSet._size != this._size) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !mutableOrderedScatterSet.contains(objArr[(i << 3) + i3])) {
                            return false;
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
        }
        return true;
    }

    public final int findAbsoluteInsertIndex(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
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
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (Intrinsics.areEqual(this.elements[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i4);
                long j9 = 255;
                if (this.growthLimit != 0 || ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this._capacity;
                    if (i13 > 8) {
                        c = 31;
                        long j10 = this._size;
                        ULong.Companion companion = ULong.Companion;
                        j3 = 128;
                        if (Long.compareUnsigned(j10 * 32, i13 * 25) <= 0) {
                            long[] jArr4 = this.metadata;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this._capacity;
                                Object[] objArr = this.elements;
                                long[] jArr5 = this.nodes;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j11 = j9;
                                    long j12 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j11;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j13 = (jArr4[i21] >> i22) & j2;
                                    if (j13 != 128 && j13 == 254) {
                                        Object obj2 = objArr[i20];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int findFirstAvailableSlot2 = findFirstAvailableSlot(i23);
                                        int i24 = i23 & i14;
                                        if (((findFirstAvailableSlot2 - i24) & i14) / 8 == ((i20 - i24) & i14) / 8) {
                                            int i25 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | ((r17 & 127) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j14 = i20;
                                                jArr6[i20] = j14 | (j14 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i25;
                                            objArr = objArr2;
                                        } else {
                                            int i26 = i14;
                                            Object[] objArr3 = objArr;
                                            int i27 = findFirstAvailableSlot2 >> 3;
                                            long j15 = jArr4[i27];
                                            int i28 = (findFirstAvailableSlot2 & 7) << 3;
                                            if (((j15 >> i28) & j2) == 128) {
                                                jArr4[i27] = (j15 & (~(j2 << i28))) | ((r17 & 127) << i28);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[findFirstAvailableSlot2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[findFirstAvailableSlot2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i29 = (int) ((jArr6[i20] >> 32) & BodyPartID.bodyIdMax);
                                                if (i29 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i29] = findFirstAvailableSlot2 | (jArr6[i29] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & BodyPartID.bodyIdMax) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | findFirstAvailableSlot2;
                                                }
                                                jArr6[findFirstAvailableSlot2] = (i20 << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i27] = ((r17 & 127) << i28) | (j15 & (~(j2 << i28)));
                                                Object obj3 = objArr3[findFirstAvailableSlot2];
                                                objArr3[findFirstAvailableSlot2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j16 = jArr5[findFirstAvailableSlot2];
                                                jArr5[findFirstAvailableSlot2] = jArr5[i20];
                                                jArr5[i20] = j16;
                                                int i30 = (int) ((jArr6[i20] >> 32) & BodyPartID.bodyIdMax);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    long j17 = findFirstAvailableSlot2;
                                                    jArr6[i30] = (jArr6[i30] & (-4294967296L)) | j17;
                                                    jArr6[i20] = (jArr6[i20] & BodyPartID.bodyIdMax) | (j17 << 32);
                                                } else {
                                                    long j18 = findFirstAvailableSlot2;
                                                    jArr6[i20] = j18 | (j18 << 32);
                                                    i30 = i20;
                                                }
                                                jArr6[findFirstAvailableSlot2] = (i30 << 32) | i20;
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
                                long[] jArr7 = this.nodes;
                                int length2 = jArr7.length;
                                for (int i31 = 0; i31 < length2; i31++) {
                                    long j19 = jArr7[i31];
                                    jArr7[i31] = (((j19 & (-4611686018427387904L)) | (((int) ((j19 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & BodyPartID.bodyIdMax))) << 31) | (((int) (j19 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & BodyPartID.bodyIdMax));
                                }
                                int i32 = this.head;
                                if (i32 != Integer.MAX_VALUE) {
                                    this.head = (int) (jArr6[i32] & BodyPartID.bodyIdMax);
                                }
                                int i33 = this.tail;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.tail = (int) (jArr6[i33] & BodyPartID.bodyIdMax);
                                }
                            }
                            findFirstAvailableSlot = findFirstAvailableSlot(i4);
                        }
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int nextCapacity = ScatterMapKt.nextCapacity(this._capacity);
                    long[] jArr8 = this.metadata;
                    Object[] objArr4 = this.elements;
                    long[] jArr9 = this.nodes;
                    int i34 = this._capacity;
                    int[] iArr = new int[i34];
                    initializeStorage(nextCapacity);
                    long[] jArr10 = this.metadata;
                    Object[] objArr5 = this.elements;
                    long[] jArr11 = this.nodes;
                    int i35 = this._capacity;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr8[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i36];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int findFirstAvailableSlot3 = findFirstAvailableSlot(i37 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j20 = i37 & 127;
                            int i38 = findFirstAvailableSlot3 >> 3;
                            int i39 = (findFirstAvailableSlot3 & 7) << 3;
                            long j21 = (jArr[i38] & (~(255 << i39))) | (j20 << i39);
                            jArr[i38] = j21;
                            jArr[(((findFirstAvailableSlot3 - 7) & i35) + (i35 & 7)) >> 3] = j21;
                            objArr5[findFirstAvailableSlot3] = obj4;
                            jArr11[findFirstAvailableSlot3] = jArr9[i36];
                            iArr[i36] = findFirstAvailableSlot3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i36++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.nodes;
                    int length3 = jArr12.length;
                    for (int i40 = 0; i40 < length3; i40++) {
                        long j22 = jArr12[i40];
                        jArr12[i40] = (((j22 & (-4611686018427387904L)) | (((int) ((j22 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j22 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i41 = this.head;
                    if (i41 != Integer.MAX_VALUE) {
                        this.head = iArr[i41];
                    }
                    int i42 = this.tail;
                    if (i42 != Integer.MAX_VALUE) {
                        this.tail = iArr[i42];
                    }
                    findFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i43 = this.growthLimit;
                long[] jArr13 = this.metadata;
                int i44 = findFirstAvailableSlot >> 3;
                long j23 = jArr13[i44];
                int i45 = (findFirstAvailableSlot & 7) << 3;
                if (((j23 >> i45) & j2) == j3) {
                    i = 1;
                }
                this.growthLimit = i43 - i;
                int i46 = this._capacity;
                long j24 = (j23 & (~(j2 << i45))) | (j << i45);
                jArr13[i44] = j24;
                jArr13[(((findFirstAvailableSlot - 7) & i46) + (i46 & 7)) >> 3] = j24;
                return findFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
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

    public final int hashCode() {
        int i = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!Intrinsics.areEqual(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final void initializeStorage(int i) {
        long[] jArr;
        long[] jArr2;
        int max = i > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i)) : 0;
        this._capacity = max;
        if (max == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.metadata = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - this._size;
        this.elements = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
        if (max == 0) {
            jArr2 = SieveCacheKt.EmptyNodes;
        } else {
            long[] jArr4 = new long[max];
            Arrays.fill(jArr4, 0, max, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.nodes = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.areEqual(this.elements[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            removeElementAt(i);
        }
        return z;
    }

    public final void removeElementAt(int i) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.elements[i] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.head = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.tail = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.contains(collection, objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i = this.tail;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
