package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class vsn extends cee {
    public static final vsn g = new vsn(0, null, new Object[0]);
    private static final long serialVersionUID = 0;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public vsn(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static vsn g(int i, Object[] objArr, x0 x0Var) {
        if (i == 0) {
            return g;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new vsn(1, null, objArr);
        }
        o2g.P(i, objArr.length >> 1);
        Object h = h(objArr, i, hee.t(i), 0);
        if (h instanceof Object[]) {
            Object[] objArr2 = (Object[]) h;
            aee aeeVar = (aee) objArr2[2];
            if (x0Var == null) {
                throw aeeVar.a();
            }
            x0Var.d = aeeVar;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            h = obj;
            i = intValue;
        }
        return new vsn(i, h, objArr);
    }

    public static Object h(Object[] objArr, int i, int i2, int i3) {
        aee aeeVar = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int I = ltg.I(obj.hashCode());
                while (true) {
                    int i9 = I & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                    } else {
                        if (obj.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj3 = objArr[i11];
                            Objects.requireNonNull(obj3);
                            aeeVar = new aee(obj, obj2, obj3);
                            objArr[i11] = obj2;
                            break;
                        }
                        I = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), aeeVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int I2 = ltg.I(obj4.hashCode());
                while (true) {
                    int i15 = I2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                    } else {
                        if (obj4.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj6 = objArr[i17];
                            Objects.requireNonNull(obj6);
                            aeeVar = new aee(obj4, obj5, obj6);
                            objArr[i17] = obj5;
                            break;
                        }
                        I2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), aeeVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int I3 = ltg.I(obj7.hashCode());
            while (true) {
                int i21 = I3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                } else {
                    if (obj7.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj9 = objArr[i23];
                        Objects.requireNonNull(obj9);
                        aeeVar = new aee(obj7, obj8, obj9);
                        objArr[i23] = obj8;
                        break;
                    }
                    I3 = i21 + 1;
                }
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), aeeVar};
    }

    public static Object i(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int I = ltg.I(obj2.hashCode());
            while (true) {
                int i3 = I & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                I = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int I2 = ltg.I(obj2.hashCode());
            while (true) {
                int i5 = I2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                I2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int I3 = ltg.I(obj2.hashCode());
            while (true) {
                int i7 = I3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                I3 = i7 + 1;
            }
        }
    }

    @Override // defpackage.cee
    public final ssn b() {
        return new ssn(this, this.e, 0, this.f);
    }

    @Override // defpackage.cee
    public final tsn c() {
        return new tsn(this, new usn(0, this.f, this.e));
    }

    @Override // defpackage.cee
    public final qde d() {
        return new usn(1, this.f, this.e);
    }

    @Override // defpackage.cee, java.util.Map
    public final Object get(Object obj) {
        Object i = i(this.d, this.e, this.f, 0, obj);
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // defpackage.cee
    public Object writeReplace() {
        return super.writeReplace();
    }
}
