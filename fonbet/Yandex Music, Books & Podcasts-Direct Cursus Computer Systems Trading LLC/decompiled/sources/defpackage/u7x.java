package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class u7x implements Map, Serializable {
    public static final u7x h;
    public static final u7x i;
    public final /* synthetic */ int a;
    public final transient Object b;
    public final transient Object[] c;
    public final transient int d;
    public transient AbstractCollection e;
    public transient AbstractCollection f;
    public transient AbstractCollection g;

    static {
        int i2 = 0;
        Object obj = null;
        h = new u7x(i2, 0, obj, new Object[0]);
        i = new u7x(i2, 1, obj, new Object[0]);
    }

    public /* synthetic */ u7x(int i2, int i3, Object obj, Object[] objArr) {
        this.a = i3;
        this.b = obj;
        this.c = objArr;
        this.d = i2;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:695)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static void a(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7x.a(java.util.Set):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019f  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u7x b(int i2, Object[] objArr, w2r w2rVar) {
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
        int i5 = i2;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return h;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new u7x(i6, 0, obj2, objArr2);
        }
        hag.M(i5, objArr2.length >> 1);
        int s = u6x.s(i5);
        char c3 = 2;
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z4 = false;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = s - 1;
            if (s <= 128) {
                byte[] bArr = new byte[s];
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
                    int L = neg.L(obj3.hashCode());
                    while (true) {
                        int i12 = L & i7;
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
                                j6x j6xVar = new j6x(obj3, obj4, obj5);
                                objArr2[i14] = obj4;
                                obj2 = j6xVar;
                                break;
                            }
                            L = i12 + 1;
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
                    obj2 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i3] = Integer.valueOf(i9);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i3 = 1;
                if (s > 32768) {
                    int[] iArr = new int[s];
                    Arrays.fill(iArr, -1);
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i5) {
                        int i17 = i16 + i16;
                        int i18 = i15 + i15;
                        Object obj6 = objArr2[i18];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj7);
                        int L2 = neg.L(obj6.hashCode());
                        while (true) {
                            int i19 = L2 & i7;
                            int i20 = iArr[i19];
                            if (i20 == -1) {
                                iArr[i19] = i17;
                                if (i16 < i15) {
                                    objArr2[i17] = obj6;
                                    objArr2[i17 ^ 1] = obj7;
                                }
                                i16++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i20])) {
                                    int i21 = i20 ^ 1;
                                    Object obj8 = objArr2[i21];
                                    Objects.requireNonNull(obj8);
                                    j6x j6xVar2 = new j6x(obj6, obj7, obj8);
                                    objArr2[i21] = obj7;
                                    obj2 = j6xVar2;
                                    break;
                                }
                                L2 = i19 + 1;
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
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i16);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z3) {
                        Object[] objArr4 = (Object[]) obj;
                        j6x j6xVar3 = (j6x) objArr4[c];
                        if (w2rVar == null) {
                            throw j6xVar3.a();
                        }
                        w2rVar.d = j6xVar3;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i3]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i5 = intValue;
                    }
                    return new u7x(i5, 0, obj9, objArr2);
                }
                sArr = new short[s];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj11 = objArr2[i25];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i25 ^ 1];
                    Objects.requireNonNull(obj12);
                    int L3 = neg.L(obj11.hashCode());
                    while (true) {
                        int i26 = L3 & i7;
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
                                j6x j6xVar4 = new j6x(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                obj2 = j6xVar4;
                                break;
                            }
                            L3 = i26 + 1;
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
        Object obj92 = obj;
        if (z3) {
        }
        return new u7x(i5, 0, obj92, objArr2);
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                t7x t7xVar = (t7x) this.g;
                if (t7xVar == null) {
                    t7xVar = new t7x(1, this.d, this.c);
                    this.g = t7xVar;
                }
                return t7xVar.contains(obj);
            default:
                gdx gdxVar = (gdx) this.g;
                if (gdxVar == null) {
                    gdxVar = new gdx(1, this.d, this.c);
                    this.g = gdxVar;
                }
                return gdxVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                r7x r7xVar = (r7x) this.e;
                if (r7xVar != null) {
                    return r7xVar;
                }
                r7x r7xVar2 = new r7x(this, this.c, this.d);
                this.e = r7xVar2;
                return r7xVar2;
            default:
                adx adxVar = (adx) this.e;
                if (adxVar != null) {
                    return adxVar;
                }
                adx adxVar2 = new adx(this, this.c, this.d);
                this.e = adxVar2;
                return adxVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a4  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    int i2 = this.d;
                    Object[] objArr = this.c;
                    if (i2 == 1) {
                        Object obj4 = objArr[0];
                        Objects.requireNonNull(obj4);
                        if (obj4.equals(obj)) {
                            obj2 = objArr[1];
                            Objects.requireNonNull(obj2);
                            if (obj2 != null) {
                                return null;
                            }
                            return obj2;
                        }
                    } else {
                        Object obj5 = this.b;
                        if (obj5 != null) {
                            if (obj5 instanceof byte[]) {
                                byte[] bArr = (byte[]) obj5;
                                int length = bArr.length - 1;
                                int L = neg.L(obj.hashCode());
                                while (true) {
                                    int i3 = L & length;
                                    int i4 = bArr[i3] & 255;
                                    if (i4 != 255) {
                                        if (obj.equals(objArr[i4])) {
                                            obj2 = objArr[i4 ^ 1];
                                        } else {
                                            L = i3 + 1;
                                        }
                                    }
                                }
                            } else if (obj5 instanceof short[]) {
                                short[] sArr = (short[]) obj5;
                                int length2 = sArr.length - 1;
                                int L2 = neg.L(obj.hashCode());
                                while (true) {
                                    int i5 = L2 & length2;
                                    char c = (char) sArr[i5];
                                    if (c != 65535) {
                                        if (obj.equals(objArr[c])) {
                                            obj2 = objArr[c ^ 1];
                                        } else {
                                            L2 = i5 + 1;
                                        }
                                    }
                                }
                                if (obj2 != null) {
                                }
                            } else {
                                int[] iArr = (int[]) obj5;
                                int length3 = iArr.length - 1;
                                int L3 = neg.L(obj.hashCode());
                                while (true) {
                                    int i6 = L3 & length3;
                                    int i7 = iArr[i6];
                                    if (i7 != -1) {
                                        if (obj.equals(objArr[i7])) {
                                            obj2 = objArr[i7 ^ 1];
                                        } else {
                                            L3 = i6 + 1;
                                        }
                                    }
                                }
                                if (obj2 != null) {
                                }
                            }
                        }
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
            default:
                if (obj != null) {
                    int i8 = this.d;
                    Object[] objArr2 = this.c;
                    if (i8 == 1) {
                        Object obj6 = objArr2[0];
                        Objects.requireNonNull(obj6);
                        if (obj6.equals(obj)) {
                            obj3 = objArr2[1];
                            Objects.requireNonNull(obj3);
                            if (obj3 != null) {
                                return null;
                            }
                            return obj3;
                        }
                    } else {
                        Object obj7 = this.b;
                        if (obj7 != null) {
                            if (obj7 instanceof byte[]) {
                                byte[] bArr2 = (byte[]) obj7;
                                int length4 = bArr2.length - 1;
                                int b0 = ezf.b0(obj.hashCode());
                                while (true) {
                                    int i9 = b0 & length4;
                                    int i10 = bArr2[i9] & 255;
                                    if (i10 != 255) {
                                        if (obj.equals(objArr2[i10])) {
                                            obj3 = objArr2[i10 ^ 1];
                                        } else {
                                            b0 = i9 + 1;
                                        }
                                    }
                                }
                                if (obj3 != null) {
                                }
                            } else if (obj7 instanceof short[]) {
                                short[] sArr2 = (short[]) obj7;
                                int length5 = sArr2.length - 1;
                                int b02 = ezf.b0(obj.hashCode());
                                while (true) {
                                    int i11 = b02 & length5;
                                    char c2 = (char) sArr2[i11];
                                    if (c2 != 65535) {
                                        if (obj.equals(objArr2[c2])) {
                                            obj3 = objArr2[c2 ^ 1];
                                        } else {
                                            b02 = i11 + 1;
                                        }
                                    }
                                }
                            } else {
                                int[] iArr2 = (int[]) obj7;
                                int length6 = iArr2.length - 1;
                                int b03 = ezf.b0(obj.hashCode());
                                while (true) {
                                    int i12 = b03 & length6;
                                    int i13 = iArr2[i12];
                                    if (i13 != -1) {
                                        if (obj.equals(objArr2[i13])) {
                                            obj3 = objArr2[i13 ^ 1];
                                        } else {
                                            b03 = i12 + 1;
                                        }
                                    }
                                }
                                if (obj3 != null) {
                                }
                            }
                        }
                    }
                }
                obj3 = null;
                if (obj3 != null) {
                }
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                r7x r7xVar = (r7x) this.e;
                if (r7xVar == null) {
                    r7xVar = new r7x(this, this.c, this.d);
                    this.e = r7xVar;
                }
                Iterator it = r7xVar.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i2 += next != null ? next.hashCode() : 0;
                }
                return i2;
            default:
                adx adxVar = (adx) this.e;
                if (adxVar == null) {
                    adxVar = new adx(this, this.c, this.d);
                    this.e = adxVar;
                }
                Iterator it2 = adxVar.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i3 += next2 != null ? next2.hashCode() : 0;
                }
                return i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                }
                break;
            default:
                if (size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                s7x s7xVar = (s7x) this.f;
                if (s7xVar != null) {
                    return s7xVar;
                }
                s7x s7xVar2 = new s7x(this, new t7x(0, this.d, this.c));
                this.f = s7xVar2;
                return s7xVar2;
            default:
                ddx ddxVar = (ddx) this.f;
                if (ddxVar != null) {
                    return ddxVar;
                }
                ddx ddxVar2 = new ddx(this, new gdx(0, this.d, this.c));
                this.f = ddxVar2;
                return ddxVar2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return this.d;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i2 = this.d;
                wdg.a0(i2, "size");
                StringBuilder sb = new StringBuilder((int) Math.min(i2 * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((r7x) entrySet()).iterator();
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
            default:
                int i3 = this.d;
                if (i3 < 0) {
                    xq0.x(k5r.i(i3, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(i3 * 8, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((adx) entrySet()).iterator();
                boolean z2 = true;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                t7x t7xVar = (t7x) this.g;
                if (t7xVar != null) {
                    return t7xVar;
                }
                t7x t7xVar2 = new t7x(1, this.d, this.c);
                this.g = t7xVar2;
                return t7xVar2;
            default:
                gdx gdxVar = (gdx) this.g;
                if (gdxVar != null) {
                    return gdxVar;
                }
                gdx gdxVar2 = new gdx(1, this.d, this.c);
                this.g = gdxVar2;
                return gdxVar2;
        }
    }
}
