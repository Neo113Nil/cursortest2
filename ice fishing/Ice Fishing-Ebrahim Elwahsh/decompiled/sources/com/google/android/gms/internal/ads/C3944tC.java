package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.tC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3944tC implements Map, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final C3944tC f34377z = new C3944tC(null, new Object[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public transient C3783qC f34378n;

    /* renamed from: u, reason: collision with root package name */
    public transient C3836rC f34379u;

    /* renamed from: v, reason: collision with root package name */
    public transient C3890sC f34380v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object f34381w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f34382x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f34383y;

    public C3944tC(Object obj, Object[] objArr, int i) {
        this.f34381w = obj;
        this.f34382x = objArr;
        this.f34383y = i;
    }

    public static C3944tC a(Map map) {
        if ((map instanceof C3944tC) && !(map instanceof SortedMap)) {
            C3944tC c3944tC = (C3944tC) map;
            c3944tC.getClass();
            return c3944tC;
        }
        Set entrySet = map.entrySet();
        C3398j5 c3398j5 = new C3398j5(entrySet != null ? entrySet.size() : 4);
        c3398j5.n(entrySet);
        return c3398j5.s(true);
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
    public static C3944tC e(int i, Object[] objArr, C3398j5 c3398j5) {
        int i4;
        boolean z8;
        char c4;
        Object obj;
        char c9;
        short[] sArr;
        int i9;
        boolean z9;
        ?? r17;
        boolean z10;
        boolean z11;
        int i10 = i;
        Object[] objArr2 = objArr;
        if (i10 == 0) {
            return f34377z;
        }
        int i11 = 1;
        Object obj2 = null;
        boolean z12 = false;
        if (i10 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new C3944tC(null, objArr2, 1);
        }
        PA.b0(i10, objArr2.length >> 1);
        int j9 = AbstractC2917aC.j(i10);
        char c10 = 2;
        if (i10 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i10 = 1;
            i4 = 1;
            z11 = false;
        } else {
            int i12 = j9 - 1;
            if (j9 <= 128) {
                byte[] bArr = new byte[j9];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj3 = objArr2[i16];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i16 ^ i11];
                    Objects.requireNonNull(obj4);
                    int n9 = AbstractC3194fG.n(obj3.hashCode());
                    while (true) {
                        int i17 = n9 & i12;
                        i9 = i11;
                        z9 = z12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i14 < i13) {
                                objArr2[i15] = obj3;
                                objArr2[i15 ^ 1] = obj4;
                            }
                            i14++;
                        } else {
                            if (obj3.equals(objArr2[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj5 = objArr2[i19];
                                Objects.requireNonNull(obj5);
                                obj2 = new VB(obj3, obj4, obj5);
                                objArr2[i19] = obj4;
                                break;
                            }
                            n9 = i17 + 1;
                            i11 = i9;
                            z12 = z9;
                        }
                    }
                    i13++;
                    i11 = i9;
                    z12 = z9;
                }
                i4 = i11;
                z8 = z12;
                if (i14 == i10) {
                    obj2 = bArr;
                    z11 = z8;
                } else {
                    sArr = new Object[3];
                    sArr[z8 ? 1 : 0] = bArr;
                    sArr[i4] = Integer.valueOf(i14);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z11 = z8;
                }
            } else {
                i4 = 1;
                z8 = false;
                if (j9 > 32768) {
                    int[] iArr = new int[j9];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i10) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj6 = objArr2[i23];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i23 ^ 1];
                        Objects.requireNonNull(obj7);
                        int n10 = AbstractC3194fG.n(obj6.hashCode());
                        while (true) {
                            int i24 = n10 & i12;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArr2[i22] = obj6;
                                    objArr2[i22 ^ 1] = obj7;
                                }
                                i21++;
                                c9 = c10;
                            } else {
                                c9 = c10;
                                if (obj6.equals(objArr2[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj8 = objArr2[i26];
                                    Objects.requireNonNull(obj8);
                                    VB vb = new VB(obj6, obj7, obj8);
                                    objArr2[i26] = obj7;
                                    obj2 = vb;
                                    break;
                                }
                                n10 = i24 + 1;
                                c10 = c9;
                            }
                        }
                        i20++;
                        c10 = c9;
                    }
                    c4 = c10;
                    if (i21 == i10) {
                        obj = iArr;
                        r17 = z8;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c4] = obj2;
                        obj = objArr3;
                        r17 = z8;
                    }
                    z10 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z10) {
                        Object[] objArr4 = (Object[]) obj;
                        VB vb2 = (VB) objArr4[c4];
                        if (c3398j5 == null) {
                            throw vb2.a();
                        }
                        c3398j5.f32085v = vb2;
                        Object obj10 = objArr4[r17];
                        int intValue = ((Integer) objArr4[i4]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i10 = intValue;
                    }
                    return new C3944tC(obj9, objArr2, i10);
                }
                sArr = new short[j9];
                Arrays.fill(sArr, (short) -1);
                int i27 = 0;
                for (int i28 = 0; i28 < i10; i28++) {
                    int i29 = i27 + i27;
                    int i30 = i28 + i28;
                    Object obj11 = objArr2[i30];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i30 ^ 1];
                    Objects.requireNonNull(obj12);
                    int n11 = AbstractC3194fG.n(obj11.hashCode());
                    while (true) {
                        int i31 = n11 & i12;
                        char c11 = (char) sArr[i31];
                        if (c11 == 65535) {
                            sArr[i31] = (short) i29;
                            if (i27 < i28) {
                                objArr2[i29] = obj11;
                                objArr2[i29 ^ 1] = obj12;
                            }
                            i27++;
                        } else {
                            if (obj11.equals(objArr2[c11])) {
                                int i32 = c11 ^ 1;
                                Object obj13 = objArr2[i32];
                                Objects.requireNonNull(obj13);
                                VB vb3 = new VB(obj11, obj12, obj13);
                                objArr2[i32] = obj12;
                                obj2 = vb3;
                                break;
                            }
                            n11 = i31 + 1;
                        }
                    }
                }
                if (i27 != i10) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i27), obj2};
                    z11 = z8;
                }
                obj2 = sArr;
                z11 = z8;
            }
        }
        c4 = 2;
        obj = obj2;
        r17 = z11;
        z10 = obj instanceof Object[];
        Object obj92 = obj;
        if (z10) {
        }
        return new C3944tC(obj92, objArr2, i10);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC2917aC entrySet() {
        C3783qC c3783qC = this.f34378n;
        if (c3783qC != null) {
            return c3783qC;
        }
        C3783qC c3783qC2 = new C3783qC(this, this.f34382x, this.f34383y);
        this.f34378n = c3783qC2;
        return c3783qC2;
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
    public final QB values() {
        C3890sC c3890sC = this.f34380v;
        if (c3890sC != null) {
            return c3890sC;
        }
        C3890sC c3890sC2 = new C3890sC(this.f34382x, 1, this.f34383y);
        this.f34380v = c3890sC2;
        return c3890sC2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC3217fl.A(obj, this);
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
            int i = this.f34383y;
            Object[] objArr = this.f34382x;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f34381w;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int n9 = AbstractC3194fG.n(obj.hashCode());
                        while (true) {
                            int i4 = n9 & length;
                            int i9 = bArr[i4] & 255;
                            if (i9 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            n9 = i4 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int n10 = AbstractC3194fG.n(obj.hashCode());
                        while (true) {
                            int i10 = n10 & length2;
                            char c4 = (char) sArr[i10];
                            if (c4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c4])) {
                                obj2 = objArr[c4 ^ 1];
                                break;
                            }
                            n10 = i10 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int n11 = AbstractC3194fG.n(obj.hashCode());
                        while (true) {
                            int i11 = n11 & length3;
                            int i12 = iArr[i11];
                            if (i12 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            n11 = i11 + 1;
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
        return AbstractC3194fG.s(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C3836rC c3836rC = this.f34379u;
        if (c3836rC != null) {
            return c3836rC;
        }
        C3836rC c3836rC2 = new C3836rC(this, new C3890sC(this.f34382x, 0, this.f34383y));
        this.f34379u = c3836rC2;
        return c3836rC2;
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
        return this.f34383y;
    }

    public final String toString() {
        int i = this.f34383y;
        AbstractC2720Pd.p(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C3783qC) entrySet()).iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z8) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z8 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
