package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.qC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3793qC implements Map, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final C3793qC f33993z = new C3793qC(null, new Object[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public transient C3631nC f33994n;

    /* renamed from: u, reason: collision with root package name */
    public transient C3685oC f33995u;

    /* renamed from: v, reason: collision with root package name */
    public transient C3739pC f33996v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object f33997w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f33998x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f33999y;

    public C3793qC(Object obj, Object[] objArr, int i) {
        this.f33997w = obj;
        this.f33998x = objArr;
        this.f33999y = i;
    }

    public static C3793qC a(Map map) {
        if ((map instanceof C3793qC) && !(map instanceof SortedMap)) {
            C3793qC c3793qC = (C3793qC) map;
            c3793qC.getClass();
            return c3793qC;
        }
        Set entrySet = map.entrySet();
        C3516l5 c3516l5 = new C3516l5(entrySet != null ? entrySet.size() : 4);
        c3516l5.m(entrySet);
        return c3516l5.s(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019c  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3793qC e(int i, Object[] objArr, C3516l5 c3516l5) {
        int i4;
        boolean z6;
        char c9;
        Object obj;
        char c10;
        short[] sArr;
        int i6;
        boolean z9;
        ?? r17;
        boolean z10;
        boolean z11;
        int i9 = i;
        Object[] objArr2 = objArr;
        if (i9 == 0) {
            return f33993z;
        }
        int i10 = 1;
        Object obj2 = null;
        boolean z12 = false;
        if (i9 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new C3793qC(null, objArr2, 1);
        }
        AbstractC2792Sd.L(i9, objArr2.length >> 1);
        int j6 = XB.j(i9);
        char c11 = 2;
        if (i9 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i9 = 1;
            i4 = 1;
            z11 = false;
        } else {
            int i11 = j6 - 1;
            if (j6 <= 128) {
                byte[] bArr = new byte[j6];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i9) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj3 = objArr2[i15];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i15 ^ i10];
                    Objects.requireNonNull(obj4);
                    int n9 = AbstractC2659Kg.n(obj3.hashCode());
                    while (true) {
                        int i16 = n9 & i11;
                        i6 = i10;
                        z9 = z12;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i14;
                            if (i13 < i12) {
                                objArr2[i14] = obj3;
                                objArr2[i14 ^ 1] = obj4;
                            }
                            i13++;
                        } else {
                            if (obj3.equals(objArr2[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj5 = objArr2[i18];
                                Objects.requireNonNull(obj5);
                                obj2 = new SB(obj3, obj4, obj5);
                                objArr2[i18] = obj4;
                                break;
                            }
                            n9 = i16 + 1;
                            i10 = i6;
                            z12 = z9;
                        }
                    }
                    i12++;
                    i10 = i6;
                    z12 = z9;
                }
                i4 = i10;
                z6 = z12;
                if (i13 == i9) {
                    obj2 = bArr;
                    z11 = z6;
                } else {
                    sArr = new Object[3];
                    sArr[z6 ? 1 : 0] = bArr;
                    sArr[i4] = Integer.valueOf(i13);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z11 = z6;
                }
            } else {
                i4 = 1;
                z6 = false;
                if (j6 > 32768) {
                    int[] iArr = new int[j6];
                    Arrays.fill(iArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i9) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object obj6 = objArr2[i22];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i22 ^ 1];
                        Objects.requireNonNull(obj7);
                        int n10 = AbstractC2659Kg.n(obj6.hashCode());
                        while (true) {
                            int i23 = n10 & i11;
                            int i24 = iArr[i23];
                            if (i24 == -1) {
                                iArr[i23] = i21;
                                if (i20 < i19) {
                                    objArr2[i21] = obj6;
                                    objArr2[i21 ^ 1] = obj7;
                                }
                                i20++;
                                c10 = c11;
                            } else {
                                c10 = c11;
                                if (obj6.equals(objArr2[i24])) {
                                    int i25 = i24 ^ 1;
                                    Object obj8 = objArr2[i25];
                                    Objects.requireNonNull(obj8);
                                    SB sb = new SB(obj6, obj7, obj8);
                                    objArr2[i25] = obj7;
                                    obj2 = sb;
                                    break;
                                }
                                n10 = i23 + 1;
                                c11 = c10;
                            }
                        }
                        i19++;
                        c11 = c10;
                    }
                    c9 = c11;
                    if (i20 == i9) {
                        obj = iArr;
                        r17 = z6;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i20);
                        objArr3[c9] = obj2;
                        obj = objArr3;
                        r17 = z6;
                    }
                    z10 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z10) {
                        Object[] objArr4 = (Object[]) obj;
                        SB sb2 = (SB) objArr4[c9];
                        if (c3516l5 == null) {
                            throw sb2.a();
                        }
                        c3516l5.f32489v = sb2;
                        Object obj10 = objArr4[r17];
                        int intValue = ((Integer) objArr4[i4]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i9 = intValue;
                    }
                    return new C3793qC(obj9, objArr2, i9);
                }
                sArr = new short[j6];
                Arrays.fill(sArr, (short) -1);
                int i26 = 0;
                for (int i27 = 0; i27 < i9; i27++) {
                    int i28 = i26 + i26;
                    int i29 = i27 + i27;
                    Object obj11 = objArr2[i29];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i29 ^ 1];
                    Objects.requireNonNull(obj12);
                    int n11 = AbstractC2659Kg.n(obj11.hashCode());
                    while (true) {
                        int i30 = n11 & i11;
                        char c12 = (char) sArr[i30];
                        if (c12 == 65535) {
                            sArr[i30] = (short) i28;
                            if (i26 < i27) {
                                objArr2[i28] = obj11;
                                objArr2[i28 ^ 1] = obj12;
                            }
                            i26++;
                        } else {
                            if (obj11.equals(objArr2[c12])) {
                                int i31 = c12 ^ 1;
                                Object obj13 = objArr2[i31];
                                Objects.requireNonNull(obj13);
                                SB sb3 = new SB(obj11, obj12, obj13);
                                objArr2[i31] = obj12;
                                obj2 = sb3;
                                break;
                            }
                            n11 = i30 + 1;
                        }
                    }
                }
                if (i26 != i9) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i26), obj2};
                    z11 = z6;
                }
                obj2 = sArr;
                z11 = z6;
            }
        }
        c9 = 2;
        obj = obj2;
        r17 = z11;
        z10 = obj instanceof Object[];
        Object obj92 = obj;
        if (z10) {
        }
        return new C3793qC(obj92, objArr2, i9);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final XB entrySet() {
        C3631nC c3631nC = this.f33994n;
        if (c3631nC != null) {
            return c3631nC;
        }
        C3631nC c3631nC2 = new C3631nC(this, this.f33998x, this.f33999y);
        this.f33994n = c3631nC2;
        return c3631nC2;
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
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NB values() {
        C3739pC c3739pC = this.f33996v;
        if (c3739pC != null) {
            return c3739pC;
        }
        C3739pC c3739pC2 = new C3739pC(this.f33998x, 1, this.f33999y);
        this.f33996v = c3739pC2;
        return c3739pC2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return SK.u(obj, this);
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
            int i = this.f33999y;
            Object[] objArr = this.f33998x;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f33997w;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int n9 = AbstractC2659Kg.n(obj.hashCode());
                        while (true) {
                            int i4 = n9 & length;
                            int i6 = bArr[i4] & 255;
                            if (i6 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            n9 = i4 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int n10 = AbstractC2659Kg.n(obj.hashCode());
                        while (true) {
                            int i9 = n10 & length2;
                            char c9 = (char) sArr[i9];
                            if (c9 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c9])) {
                                obj2 = objArr[c9 ^ 1];
                                break;
                            }
                            n10 = i9 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int n11 = AbstractC2659Kg.n(obj.hashCode());
                        while (true) {
                            int i10 = n11 & length3;
                            int i11 = iArr[i10];
                            if (i11 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            n11 = i10 + 1;
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
        return AbstractC2659Kg.t(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C3685oC c3685oC = this.f33995u;
        if (c3685oC != null) {
            return c3685oC;
        }
        C3685oC c3685oC2 = new C3685oC(this, new C3739pC(this.f33998x, 0, this.f33999y));
        this.f33995u = c3685oC2;
        return c3685oC2;
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
        return this.f33999y;
    }

    public final String toString() {
        int i = this.f33999y;
        MA.q(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C3631nC) entrySet()).iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
