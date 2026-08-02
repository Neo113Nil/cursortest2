package androidx.collection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class MutableLongIntMap {
    public int _capacity;
    public int _size;
    public int growthLimit;
    public long[] metadata = ScatterMapKt.EmptyGroup;
    public long[] keys = LongSetKt.EmptyLongArray;
    public int[] values = IntSetKt.EmptyIntArray;

    public MutableLongIntMap(int i) {
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutableLongIntMap)) {
            return false;
        }
        MutableLongIntMap mutableLongIntMap = (MutableLongIntMap) obj;
        if (mutableLongIntMap._size != this._size) {
            return false;
        }
        long[] jArr = this.keys;
        int[] iArr = this.values;
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
                            int i5 = iArr[i4];
                            int findKeyIndex = mutableLongIntMap.findKeyIndex(j2);
                            if (findKeyIndex < 0 || i5 != mutableLongIntMap.values[findKeyIndex]) {
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

    public final int findKeyIndex(long j) {
        int hashCode = Long.hashCode(j) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (i2 * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.keys[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int get(long j) {
        int findKeyIndex = findKeyIndex(j);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        OptionalProvider$$ExternalSyntheticLambda0.m(Recorder$$ExternalSyntheticOutline2.m(j, "Cannot find value for key "));
        return 0;
    }

    public final int hashCode() {
        long[] jArr = this.keys;
        int[] iArr = this.values;
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
                        i2 += Integer.hashCode(iArr[i5]) ^ Long.hashCode(j2);
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
        this.values = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        r1 = findFirstAvailableSlot(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r38.growthLimit != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (((r38.metadata[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        r1 = r38._capacity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        r20 = 128;
        r4 = r38._size;
        r2 = kotlin.ULong.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        if (java.lang.Long.compareUnsigned(r4 * 32, r1 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        r1 = r38.metadata;
        r2 = r38._capacity;
        r4 = r38.keys;
        r5 = r38.values;
        r6 = (r2 + 7) >> 3;
        r25 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r7 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        r29 = r10;
        r27 = r12;
        r11 = r13;
        r8 = 7;
        r6 = kotlin.collections.ArraysKt___ArraysKt.getLastIndex(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r27];
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        if (r6 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011e, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = findFirstAvailableSlot(r10);
        r10 = r10 & r2;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016e, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0181, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d2, code lost:
    
        r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r28;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ad, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r28;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ea, code lost:
    
        r18 = r11;
        r38.growthLimit = androidx.collection.ScatterMapKt.loadedCapacity(r38._capacity) - r38._size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027c, code lost:
    
        r1 = findFirstAvailableSlot(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0280, code lost:
    
        r38._size++;
        r2 = r38.growthLimit;
        r3 = r38.metadata;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0298, code lost:
    
        if (((r5 >> r7) & r25) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029b, code lost:
    
        r18 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029d, code lost:
    
        r38.growthLimit = r2 - r18;
        r2 = r38._capacity;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fb, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0209, code lost:
    
        r1 = androidx.collection.ScatterMapKt.nextCapacity(r38._capacity);
        r2 = r38.metadata;
        r4 = r38.keys;
        r5 = r38.values;
        r6 = r38._capacity;
        initializeStorage(r1);
        r1 = r38.metadata;
        r7 = r38.keys;
        r8 = r38.values;
        r9 = r38._capacity;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0224, code lost:
    
        if (r10 >= r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0233, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = findFirstAvailableSlot(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0276, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0273, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0206, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0098, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void set(int i, long j) {
        int i2;
        int i3;
        int i4 = -862048943;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this._capacity;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j2 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j3 = i7;
            int i14 = i10;
            int i15 = 0;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j5) >> 3)) & i8;
                int i16 = i4;
                if (this.keys[numberOfTrailingZeros] == j) {
                    i3 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                    i4 = i16;
                }
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i2;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.keys[i3] = j;
        this.values[i3] = i;
    }

    public final String toString() {
        int i;
        int i2;
        if (this._size == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.keys;
        int[] iArr = this.values;
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
                            int i8 = iArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i8);
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
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
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
}
