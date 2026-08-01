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
public final class C3770qC implements Map, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final C3770qC f33209z = new C3770qC(null, new Object[0], 0);

    /* renamed from: n, reason: collision with root package name */
    public transient C3608nC f33210n;

    /* renamed from: u, reason: collision with root package name */
    public transient C3662oC f33211u;

    /* renamed from: v, reason: collision with root package name */
    public transient C3716pC f33212v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object f33213w;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f33214x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f33215y;

    public C3770qC(Object obj, Object[] objArr, int i) {
        this.f33213w = obj;
        this.f33214x = objArr;
        this.f33215y = i;
    }

    public static C3770qC a(Map map) {
        if ((map instanceof C3770qC) && !(map instanceof SortedMap)) {
            C3770qC c3770qC = (C3770qC) map;
            c3770qC.getClass();
            return c3770qC;
        }
        Set entrySet = map.entrySet();
        C3493l5 c3493l5 = new C3493l5(entrySet != null ? entrySet.size() : 4);
        c3493l5.m(entrySet);
        return c3493l5.s(true);
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
    public static C3770qC e(int i, Object[] objArr, C3493l5 c3493l5) {
        int i6;
        boolean z3;
        char c9;
        Object obj;
        char c10;
        short[] sArr;
        int i9;
        boolean z6;
        ?? r17;
        boolean z9;
        boolean z10;
        int i10 = i;
        Object[] objArr2 = objArr;
        if (i10 == 0) {
            return f33209z;
        }
        int i11 = 1;
        Object obj2 = null;
        boolean z11 = false;
        if (i10 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new C3770qC(null, objArr2, 1);
        }
        AbstractC2772Sd.L(i10, objArr2.length >> 1);
        int j6 = XB.j(i10);
        char c11 = 2;
        if (i10 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            i10 = 1;
            i6 = 1;
            z10 = false;
        } else {
            int i12 = j6 - 1;
            if (j6 <= 128) {
                byte[] bArr = new byte[j6];
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
                    int n9 = AbstractC2639Kg.n(obj3.hashCode());
                    while (true) {
                        int i17 = n9 & i12;
                        i9 = i11;
                        z6 = z11;
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
                                obj2 = new SB(obj3, obj4, obj5);
                                objArr2[i19] = obj4;
                                break;
                            }
                            n9 = i17 + 1;
                            i11 = i9;
                            z11 = z6;
                        }
                    }
                    i13++;
                    i11 = i9;
                    z11 = z6;
                }
                i6 = i11;
                z3 = z11;
                if (i14 == i10) {
                    obj2 = bArr;
                    z10 = z3;
                } else {
                    sArr = new Object[3];
                    sArr[z3 ? 1 : 0] = bArr;
                    sArr[i6] = Integer.valueOf(i14);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z10 = z3;
                }
            } else {
                i6 = 1;
                z3 = false;
                if (j6 > 32768) {
                    int[] iArr = new int[j6];
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
                        int n10 = AbstractC2639Kg.n(obj6.hashCode());
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
                                c10 = c11;
                            } else {
                                c10 = c11;
                                if (obj6.equals(objArr2[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj8 = objArr2[i26];
                                    Objects.requireNonNull(obj8);
                                    SB sb = new SB(obj6, obj7, obj8);
                                    objArr2[i26] = obj7;
                                    obj2 = sb;
                                    break;
                                }
                                n10 = i24 + 1;
                                c11 = c10;
                            }
                        }
                        i20++;
                        c11 = c10;
                    }
                    c9 = c11;
                    if (i21 == i10) {
                        obj = iArr;
                        r17 = z3;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c9] = obj2;
                        obj = objArr3;
                        r17 = z3;
                    }
                    z9 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z9) {
                        Object[] objArr4 = (Object[]) obj;
                        SB sb2 = (SB) objArr4[c9];
                        if (c3493l5 == null) {
                            throw sb2.a();
                        }
                        c3493l5.f31709v = sb2;
                        Object obj10 = objArr4[r17];
                        int intValue = ((Integer) objArr4[i6]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i10 = intValue;
                    }
                    return new C3770qC(obj9, objArr2, i10);
                }
                sArr = new short[j6];
                Arrays.fill(sArr, (short) -1);
                int i27 = 0;
                for (int i28 = 0; i28 < i10; i28++) {
                    int i29 = i27 + i27;
                    int i30 = i28 + i28;
                    Object obj11 = objArr2[i30];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i30 ^ 1];
                    Objects.requireNonNull(obj12);
                    int n11 = AbstractC2639Kg.n(obj11.hashCode());
                    while (true) {
                        int i31 = n11 & i12;
                        char c12 = (char) sArr[i31];
                        if (c12 == 65535) {
                            sArr[i31] = (short) i29;
                            if (i27 < i28) {
                                objArr2[i29] = obj11;
                                objArr2[i29 ^ 1] = obj12;
                            }
                            i27++;
                        } else {
                            if (obj11.equals(objArr2[c12])) {
                                int i32 = c12 ^ 1;
                                Object obj13 = objArr2[i32];
                                Objects.requireNonNull(obj13);
                                SB sb3 = new SB(obj11, obj12, obj13);
                                objArr2[i32] = obj12;
                                obj2 = sb3;
                                break;
                            }
                            n11 = i31 + 1;
                        }
                    }
                }
                if (i27 != i10) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i27), obj2};
                    z10 = z3;
                }
                obj2 = sArr;
                z10 = z3;
            }
        }
        c9 = 2;
        obj = obj2;
        r17 = z10;
        z9 = obj instanceof Object[];
        Object obj92 = obj;
        if (z9) {
        }
        return new C3770qC(obj92, objArr2, i10);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final XB entrySet() {
        C3608nC c3608nC = this.f33210n;
        if (c3608nC != null) {
            return c3608nC;
        }
        C3608nC c3608nC2 = new C3608nC(this, this.f33214x, this.f33215y);
        this.f33210n = c3608nC2;
        return c3608nC2;
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
        C3716pC c3716pC = this.f33212v;
        if (c3716pC != null) {
            return c3716pC;
        }
        C3716pC c3716pC2 = new C3716pC(this.f33214x, 1, this.f33215y);
        this.f33212v = c3716pC2;
        return c3716pC2;
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
            int i = this.f33215y;
            Object[] objArr = this.f33214x;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f33213w;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int n9 = AbstractC2639Kg.n(obj.hashCode());
                        while (true) {
                            int i6 = n9 & length;
                            int i9 = bArr[i6] & 255;
                            if (i9 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            n9 = i6 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int n10 = AbstractC2639Kg.n(obj.hashCode());
                        while (true) {
                            int i10 = n10 & length2;
                            char c9 = (char) sArr[i10];
                            if (c9 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c9])) {
                                obj2 = objArr[c9 ^ 1];
                                break;
                            }
                            n10 = i10 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int n11 = AbstractC2639Kg.n(obj.hashCode());
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
        return AbstractC2639Kg.t(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C3662oC c3662oC = this.f33211u;
        if (c3662oC != null) {
            return c3662oC;
        }
        C3662oC c3662oC2 = new C3662oC(this, new C3716pC(this.f33214x, 0, this.f33215y));
        this.f33211u = c3662oC2;
        return c3662oC2;
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
        return this.f33215y;
    }

    public final String toString() {
        int i = this.f33215y;
        MA.q(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C3608nC) entrySet()).iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
