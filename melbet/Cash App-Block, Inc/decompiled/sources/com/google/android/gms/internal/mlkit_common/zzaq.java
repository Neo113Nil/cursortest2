package com.google.android.gms.internal.mlkit_common;

import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzaq implements Map, Serializable {
    public static final zzaq zza = new zzaq(new Object[0], null, 0);
    public transient zzan zza$1;
    public final transient Object[] zzb;
    public transient zzao zzb$1;
    public final transient Object zzc;
    public transient zzap zzc$1;
    public final transient int zzd;

    public zzaq(Object[] objArr, Object obj, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01be  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaq zzg(int i, Object[] objArr, HuffmanTreeGroup huffmanTreeGroup) {
        int i2;
        boolean z;
        int i3;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        boolean z4;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return zza;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new zzaq(objArr2, null, 1);
        }
        Room.zzb(i5, objArr2.length >> 1);
        char c3 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                a$$ExternalSyntheticBUOutline0.m$3("collection too large");
                return null;
            }
        }
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj3 = objArr2[i11];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i11 ^ i6];
                    Objects.requireNonNull(obj4);
                    int zza2 = zzy.zza(obj3.hashCode());
                    while (true) {
                        int i12 = zza2 & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr2[i10] = obj3;
                                objArr2[i10 ^ 1] = obj4;
                            }
                            i9++;
                        } else {
                            if (obj3.equals(objArr2[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj5 = objArr2[i14];
                                Objects.requireNonNull(obj5);
                                zzag zzagVar = new zzag(obj3, obj4, obj5);
                                objArr2[i14] = obj4;
                                obj2 = zzagVar;
                                break;
                            }
                            zza2 = i12 + 1;
                            z5 = z2;
                            i6 = i4;
                        }
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    c = 2;
                    obj = bArr;
                    r16 = z;
                    z3 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z3) {
                        Object[] objArr3 = (Object[]) obj;
                        zzag zzagVar2 = (zzag) objArr3[c];
                        if (huffmanTreeGroup == null) {
                            throw zzagVar2.zza();
                        }
                        huffmanTreeGroup.trees = zzagVar2;
                        Object obj7 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i3]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj6 = obj7;
                        i5 = intValue;
                    }
                    return new zzaq(objArr2, obj6, i5);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = obj2;
                obj2 = sArr;
                z4 = z;
            } else {
                z = false;
                i3 = 1;
                if (i2 > 32768) {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i5) {
                        int i17 = i16 + i16;
                        int i18 = i15 + i15;
                        Object obj8 = objArr2[i18];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj9);
                        int zza3 = zzy.zza(obj8.hashCode());
                        while (true) {
                            int i19 = zza3 & i7;
                            int i20 = iArr[i19];
                            if (i20 == -1) {
                                iArr[i19] = i17;
                                if (i16 < i15) {
                                    objArr2[i17] = obj8;
                                    objArr2[i17 ^ 1] = obj9;
                                }
                                i16++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj8.equals(objArr2[i20])) {
                                    int i21 = i20 ^ 1;
                                    Object obj10 = objArr2[i21];
                                    Objects.requireNonNull(obj10);
                                    zzag zzagVar3 = new zzag(obj8, obj9, obj10);
                                    objArr2[i21] = obj9;
                                    obj2 = zzagVar3;
                                    break;
                                }
                                zza3 = i19 + 1;
                                c3 = c2;
                            }
                        }
                        i15++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i16 == i5) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i16);
                        objArr4[c] = obj2;
                        obj = objArr4;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z3) {
                    }
                    return new zzaq(objArr2, obj62, i5);
                }
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj11 = objArr2[i25];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i25 ^ 1];
                    Objects.requireNonNull(obj12);
                    int zza4 = zzy.zza(obj11.hashCode());
                    while (true) {
                        int i26 = zza4 & i7;
                        char c4 = (char) sArr[i26];
                        if (c4 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArr2[i24] = obj11;
                                objArr2[i24 ^ 1] = obj12;
                            }
                            i22++;
                        } else {
                            if (obj11.equals(objArr2[c4])) {
                                int i27 = c4 ^ 1;
                                Object obj13 = objArr2[i27];
                                Objects.requireNonNull(obj13);
                                zzag zzagVar4 = new zzag(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                obj2 = zzagVar4;
                                break;
                            }
                            zza4 = i26 + 1;
                        }
                    }
                }
                if (i22 != i5) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
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
        Object obj622 = obj;
        if (z3) {
        }
        return new zzaq(objArr2, obj622, i5);
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
        zzap zzapVar = this.zzc$1;
        if (zzapVar == null) {
            zzapVar = new zzap(1, this.zzd, this.zzb);
            this.zzc$1 = zzapVar;
        }
        return zzapVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzan zzanVar = this.zza$1;
        if (zzanVar != null) {
            return zzanVar;
        }
        zzan zzanVar2 = new zzan(this, this.zzb, this.zzd);
        this.zza$1 = zzanVar2;
        return zzanVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
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
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
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
        zzan zzanVar = this.zza$1;
        if (zzanVar == null) {
            zzanVar = new zzan(this, this.zzb, this.zzd);
            this.zza$1 = zzanVar;
        }
        Iterator it = zzanVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zzao zzaoVar = this.zzb$1;
        if (zzaoVar != null) {
            return zzaoVar;
        }
        zzao zzaoVar2 = new zzao(this, new zzap(0, this.zzd, this.zzb));
        this.zzb$1 = zzaoVar2;
        return zzaoVar2;
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
        return this.zzd;
    }

    public final String toString() {
        int i = this.zzd;
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((zzan) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzap zzapVar = this.zzc$1;
        if (zzapVar != null) {
            return zzapVar;
        }
        zzap zzapVar2 = new zzap(1, this.zzd, this.zzb);
        this.zzc$1 = zzapVar2;
        return zzapVar2;
    }
}
