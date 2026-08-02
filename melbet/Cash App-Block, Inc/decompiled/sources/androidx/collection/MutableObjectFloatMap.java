package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MutableObjectFloatMap {
    public int _capacity;
    public int _size;
    public int growthLimit;
    public long[] metadata = ScatterMapKt.EmptyGroup;
    public Object[] keys = ContainerHelpersKt.EMPTY_OBJECTS;
    public float[] values = FloatSetKt.EmptyFloatArray;

    public MutableObjectFloatMap(int i) {
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
        if (!(obj instanceof MutableObjectFloatMap)) {
            return false;
        }
        MutableObjectFloatMap mutableObjectFloatMap = (MutableObjectFloatMap) obj;
        if (mutableObjectFloatMap._size != this._size) {
            return false;
        }
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                            float f = fArr[i4];
                            int findKeyIndex = mutableObjectFloatMap.findKeyIndex(obj2);
                            if (findKeyIndex < 0 || f != mutableObjectFloatMap.values[findKeyIndex]) {
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
        float[] fArr = this.values;
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
                        i2 += Float.hashCode(fArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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
        this.values = new float[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r2 = findFirstAvailableSlot(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r37.growthLimit != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (((r37.metadata[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r2 = r37._capacity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        r3 = r37._size;
        r18 = kotlin.ULong.Companion;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (java.lang.Long.compareUnsigned(r3 * 32, r2 * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r2 = r37.metadata;
        r3 = r37._capacity;
        r4 = r37.keys;
        r6 = r37.values;
        r7 = (r3 + 7) >> 3;
        r23 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        r27 = r11;
        r9 = 7;
        r7 = kotlin.collections.ArraysKt___ArraysKt.getLastIndex(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r7 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
    
        if (r10 == 254) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0134, code lost:
    
        r10 = r10 * r20;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r25 = findFirstAvailableSlot(r11);
        r11 = r11 & r3;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014f, code lost:
    
        if ((((r25 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0173, code lost:
    
        r32 = r12;
        r9 = r25 >> 3;
        r11 = r2[r9];
        r13 = (r25 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0183, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0185, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r25] = r34[r7];
        r34[r7] = null;
        r6[r25] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d5, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r26;
        r9 = r29;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r3 = r34[r25];
        r34[r25] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r25];
        r6[r25] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r32 = r12;
        r2[r8] = ((r10 & 127) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r29;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ec, code lost:
    
        r37.growthLimit = androidx.collection.ScatterMapKt.loadedCapacity(r37._capacity) - r37._size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027a, code lost:
    
        r2 = findFirstAvailableSlot(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027e, code lost:
    
        r37._size++;
        r1 = r37.growthLimit;
        r3 = r37.metadata;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0296, code lost:
    
        if (((r5 >> r7) & r23) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0298, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029a, code lost:
    
        r37.growthLimit = r1 - r15;
        r1 = r37._capacity;
        r5 = (r5 & (~(r23 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fb, code lost:
    
        r23 = 255;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0205, code lost:
    
        r2 = androidx.collection.ScatterMapKt.nextCapacity(r37._capacity);
        r3 = r37.metadata;
        r4 = r37.keys;
        r6 = r37.values;
        r7 = r37._capacity;
        initializeStorage(r2);
        r2 = r37.metadata;
        r8 = r37.keys;
        r9 = r37.values;
        r10 = r37._capacity;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021f, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x022e, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0230, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0232, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0234, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023a, code lost:
    
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = findFirstAvailableSlot(r13 >>> 7);
        r17 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0273, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0239, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0271, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0202, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a2, code lost:
    
        r23 = 255;
        r27 = r11;
        r18 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void set(String str, float f) {
        int i;
        int i2;
        String str2 = str;
        int i3 = -862048943;
        int hashCode = (str2 != null ? str2.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this._capacity;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = i6;
            int i12 = i6;
            int i13 = 0;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = -9187201950435737472L;
            long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                int i14 = i3;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], str2)) {
                    i2 = numberOfTrailingZeros;
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                    i3 = i14;
                }
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            str2 = str;
            i6 = i12;
            i3 = i;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        this.keys[i2] = str;
        this.values[i2] = f;
    }

    public final String toString() {
        if (this._size == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
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
}
