package com.gamericefishpro.space.ua;

import com.gamericefishpro.space.f1.z;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Map, Serializable {
    public static final m z = new m(0, null, new Object[0]);
    public transient j d;
    public transient k e;
    public transient l i;
    public final transient Object v;
    public final transient Object[] w;
    public final transient int y;

    public m(int i, Object obj, Object[] objArr) {
        this.v = obj;
        this.w = objArr;
        this.y = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static m a(int i, Object[] objArr, z zVar) {
        boolean z2;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z3;
        int i3;
        ?? r16;
        boolean z4;
        ?? r4;
        Object[] objArr2;
        e eVar;
        boolean z5;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return z;
        }
        e eVar2 = null;
        ?? r5 = 0;
        e eVar3 = null;
        e eVar4 = null;
        boolean z6 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new m(1, null, objArrCopyOf);
        }
        com.gamericefishpro.space.wa.b.k(i4, objArrCopyOf.length >> 1);
        int i6 = f.i(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i7 = i6 - 1;
            if (i6 <= 128) {
                byte[] bArr = new byte[i6];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i4) {
                    int i10 = i8 * 2;
                    int i11 = i9 * 2;
                    Object obj = objArrCopyOf[i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i10 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iE = com.gamericefishpro.space.b9.a.E(obj.hashCode());
                    while (true) {
                        int i12 = iE & i7;
                        z3 = z6;
                        i3 = i5;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i11;
                            if (i9 < i8) {
                                objArrCopyOf[i11] = obj;
                                objArrCopyOf[i11 ^ 1] = obj2;
                            }
                            i9++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj3 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            eVar3 = new e(obj, obj2, obj3);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iE = i12 + 1;
                        z6 = z3;
                        i5 = i3;
                    }
                    i8++;
                    z6 = z3;
                    i5 = i3;
                }
                z2 = z6;
                i2 = i5;
                if (i9 == i4) {
                    r5 = bArr;
                    z5 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i9);
                    sArr[2] = eVar3;
                    r5 = sArr;
                    z5 = z2;
                }
            } else {
                z2 = false;
                i2 = 1;
                if (i6 <= 32768) {
                    sArr = new short[i6];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i4; i16++) {
                        int i17 = i16 * 2;
                        int i18 = i15 * 2;
                        Object obj4 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iE2 = com.gamericefishpro.space.b9.a.E(obj4.hashCode());
                        while (true) {
                            int i19 = iE2 & i7;
                            int i20 = sArr[i19] & 65535;
                            if (i20 == 65535) {
                                sArr[i19] = (short) i18;
                                if (i15 < i16) {
                                    objArrCopyOf[i18] = obj4;
                                    objArrCopyOf[i18 ^ 1] = obj5;
                                }
                                i15++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                                int i21 = ~i20;
                                Object obj6 = objArrCopyOf[i21 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                eVar4 = new e(obj4, obj5, obj6);
                                objArrCopyOf[i21 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iE2 = i19 + 1;
                        }
                    }
                    if (i15 == i4) {
                        r5 = sArr;
                        z5 = z2;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i15), eVar4};
                        z5 = z2;
                    }
                } else {
                    int[] iArr = new int[i6];
                    Arrays.fill(iArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i4) {
                        int i24 = i22 * 2;
                        int i25 = i23 * 2;
                        Object obj7 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iE3 = com.gamericefishpro.space.b9.a.E(obj7.hashCode());
                        while (true) {
                            int i26 = iE3 & i7;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i25;
                                if (i23 < i22) {
                                    objArrCopyOf[i25] = obj7;
                                    objArrCopyOf[i25 ^ 1] = obj8;
                                }
                                i23++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i27])) {
                                int i28 = i27 ^ 1;
                                Object obj9 = objArrCopyOf[i28];
                                Objects.requireNonNull(obj9);
                                eVar2 = new e(obj7, obj8, obj9);
                                objArrCopyOf[i28] = obj8;
                                break;
                            }
                            iE3 = i26 + 1;
                            c3 = c2;
                        }
                        i22++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i23 == i4) {
                        r3 = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i23);
                        objArr3[c] = eVar2;
                        r3 = objArr3;
                        r16 = z2;
                    }
                }
            }
            z4 = r3 instanceof Object[];
            r4 = r3;
            if (z4) {
                objArr2 = (Object[]) r3;
                eVar = (e) objArr2[c];
                if (zVar != null) {
                    throw eVar.a();
                }
                zVar.c = eVar;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new m(i4, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z5 = false;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z5;
        z4 = r3 instanceof Object[];
        r4 = r3;
        if (z4) {
            objArr2 = (Object[]) r3;
            eVar = (e) objArr2[c];
            if (zVar != null) {
                throw eVar.a();
            }
            zVar.c = eVar;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new m(i4, r4, objArrCopyOf);
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
        l lVar = this.i;
        if (lVar == null) {
            lVar = new l(this.w, 1, this.y);
            this.i = lVar;
        }
        return lVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.d;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, this.w, this.y);
        this.d = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((f) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.w;
            if (this.y == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.v;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iE = com.gamericefishpro.space.b9.a.E(obj.hashCode());
                    while (true) {
                        int i = iE & length;
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iE = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iE2 = com.gamericefishpro.space.b9.a.E(obj.hashCode());
                    while (true) {
                        int i3 = iE2 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iE2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iE3 = com.gamericefishpro.space.b9.a.E(obj.hashCode());
                    while (true) {
                        int i5 = iE3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iE3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        j jVar = this.d;
        if (jVar == null) {
            jVar = new j(this, this.w, this.y);
            this.d = jVar;
        }
        Iterator it = jVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.e;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, new l(this.w, 0, this.y));
        this.e = kVar2;
        return kVar2;
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
        return this.y;
    }

    public final String toString() {
        int i = this.y;
        com.gamericefishpro.space.a.a.e(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        com.gamericefishpro.space.h9.g gVarN = ((j) entrySet()).iterator();
        boolean z2 = true;
        while (true) {
            b bVar = (b) gVarN;
            if (!bVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z2 = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.i;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.w, 1, this.y);
        this.i = lVar2;
        return lVar2;
    }
}
