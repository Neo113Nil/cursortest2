package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class m21 {
    public int AvO7iQsrTN;
    public int[] OOA6hdeuvCS = fb1.Yi7zF1RB1;
    public Object[] EljAMC1QTz = fb1.xqGvceK5x;

    public final Object AvO7iQsrTN(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.AvO7iQsrTN) {
            z = true;
        }
        if (!z) {
            o4.mE4lRynR(mr0.AvO7iQsrTN("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.EljAMC1QTz;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object EljAMC1QTz(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.AvO7iQsrTN)) {
            o4.mE4lRynR(mr0.AvO7iQsrTN("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.EljAMC1QTz;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.OOA6hdeuvCS;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                d5.MjxSquD6Av(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.EljAMC1QTz;
                d5.Fm8W7vP7q(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.EljAMC1QTz;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.OOA6hdeuvCS = Arrays.copyOf(iArr, i7);
            this.EljAMC1QTz = Arrays.copyOf(this.EljAMC1QTz, i7 << 1);
            if (i2 != this.AvO7iQsrTN) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                d5.MjxSquD6Av(iArr, this.OOA6hdeuvCS, 0, 0, i);
                d5.Fm8W7vP7q(objArr, this.EljAMC1QTz, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                d5.MjxSquD6Av(iArr, this.OOA6hdeuvCS, i, i8, i2);
                d5.Fm8W7vP7q(objArr, this.EljAMC1QTz, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.AvO7iQsrTN) {
            throw new ConcurrentModificationException();
        }
        this.AvO7iQsrTN = i4;
        return obj;
    }

    public final int GWasM1elztuh(Object obj) {
        int i = this.AvO7iQsrTN * 2;
        Object[] objArr = this.EljAMC1QTz;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object OOA6hdeuvCS(int i) {
        boolean z = false;
        if (i >= 0 && i < this.AvO7iQsrTN) {
            z = true;
        }
        if (z) {
            return this.EljAMC1QTz[i << 1];
        }
        o4.mE4lRynR(mr0.AvO7iQsrTN("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int X1lG3V04pd(Object obj) {
        return obj == null ? xqGvceK5x() : Yi7zF1RB1(obj.hashCode(), obj);
    }

    public final int Yi7zF1RB1(int i, Object obj) {
        int i2 = this.AvO7iQsrTN;
        if (i2 == 0) {
            return -1;
        }
        int uFEq9NpZ = fb1.uFEq9NpZ(this.OOA6hdeuvCS, i2, i);
        if (uFEq9NpZ < 0 || o30.rQPn8YBR(obj, this.EljAMC1QTz[uFEq9NpZ << 1])) {
            return uFEq9NpZ;
        }
        int i3 = uFEq9NpZ + 1;
        while (i3 < i2 && this.OOA6hdeuvCS[i3] == i) {
            if (o30.rQPn8YBR(obj, this.EljAMC1QTz[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = uFEq9NpZ - 1; i4 >= 0 && this.OOA6hdeuvCS[i4] == i; i4--) {
            if (o30.rQPn8YBR(obj, this.EljAMC1QTz[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.AvO7iQsrTN > 0) {
            this.OOA6hdeuvCS = fb1.Yi7zF1RB1;
            this.EljAMC1QTz = fb1.xqGvceK5x;
            this.AvO7iQsrTN = 0;
        }
        if (this.AvO7iQsrTN > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return X1lG3V04pd(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return GWasM1elztuh(obj) >= 0;
    }

    public final Object encWxUiV2(int i) {
        boolean z = false;
        if (i >= 0 && i < this.AvO7iQsrTN) {
            z = true;
        }
        if (z) {
            return this.EljAMC1QTz[(i << 1) + 1];
        }
        o4.mE4lRynR(mr0.AvO7iQsrTN("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof m21) {
                int i = this.AvO7iQsrTN;
                if (i != ((m21) obj).AvO7iQsrTN) {
                    return false;
                }
                m21 m21Var = (m21) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object OOA6hdeuvCS = OOA6hdeuvCS(i2);
                    Object encWxUiV2 = encWxUiV2(i2);
                    Object obj2 = m21Var.get(OOA6hdeuvCS);
                    if (encWxUiV2 == null) {
                        if (obj2 != null || !m21Var.containsKey(OOA6hdeuvCS)) {
                            return false;
                        }
                    } else if (!encWxUiV2.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.AvO7iQsrTN != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.AvO7iQsrTN;
            for (int i4 = 0; i4 < i3; i4++) {
                Object OOA6hdeuvCS2 = OOA6hdeuvCS(i4);
                Object encWxUiV22 = encWxUiV2(i4);
                Object obj3 = ((Map) obj).get(OOA6hdeuvCS2);
                if (encWxUiV22 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(OOA6hdeuvCS2)) {
                        return false;
                    }
                } else if (!encWxUiV22.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        if (X1lG3V04pd >= 0) {
            return this.EljAMC1QTz[(X1lG3V04pd << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        return X1lG3V04pd >= 0 ? this.EljAMC1QTz[(X1lG3V04pd << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.OOA6hdeuvCS;
        Object[] objArr = this.EljAMC1QTz;
        int i = this.AvO7iQsrTN;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.AvO7iQsrTN <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.AvO7iQsrTN;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int Yi7zF1RB1 = obj != null ? Yi7zF1RB1(hashCode, obj) : xqGvceK5x();
        if (Yi7zF1RB1 >= 0) {
            int i2 = (Yi7zF1RB1 << 1) + 1;
            Object[] objArr = this.EljAMC1QTz;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~Yi7zF1RB1;
        int[] iArr = this.OOA6hdeuvCS;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.OOA6hdeuvCS = Arrays.copyOf(iArr, i4);
            this.EljAMC1QTz = Arrays.copyOf(this.EljAMC1QTz, i4 << 1);
            if (i != this.AvO7iQsrTN) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.OOA6hdeuvCS;
            int i5 = i3 + 1;
            d5.MjxSquD6Av(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.EljAMC1QTz;
            d5.Fm8W7vP7q(objArr2, objArr2, i5 << 1, i3 << 1, this.AvO7iQsrTN << 1);
        }
        int i6 = this.AvO7iQsrTN;
        if (i == i6) {
            int[] iArr3 = this.OOA6hdeuvCS;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.EljAMC1QTz;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.AvO7iQsrTN = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        if (X1lG3V04pd < 0 || !o30.rQPn8YBR(obj2, encWxUiV2(X1lG3V04pd))) {
            return false;
        }
        EljAMC1QTz(X1lG3V04pd);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        if (X1lG3V04pd < 0 || !o30.rQPn8YBR(obj2, encWxUiV2(X1lG3V04pd))) {
            return false;
        }
        AvO7iQsrTN(X1lG3V04pd, obj3);
        return true;
    }

    public final int size() {
        return this.AvO7iQsrTN;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.AvO7iQsrTN * 28);
        sb.append('{');
        int i = this.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object OOA6hdeuvCS = OOA6hdeuvCS(i2);
            if (OOA6hdeuvCS != sb) {
                sb.append(OOA6hdeuvCS);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object encWxUiV2 = encWxUiV2(i2);
            if (encWxUiV2 != sb) {
                sb.append(encWxUiV2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int xqGvceK5x() {
        int i = this.AvO7iQsrTN;
        if (i == 0) {
            return -1;
        }
        int uFEq9NpZ = fb1.uFEq9NpZ(this.OOA6hdeuvCS, i, 0);
        if (uFEq9NpZ < 0 || this.EljAMC1QTz[uFEq9NpZ << 1] == null) {
            return uFEq9NpZ;
        }
        int i2 = uFEq9NpZ + 1;
        while (i2 < i && this.OOA6hdeuvCS[i2] == 0) {
            if (this.EljAMC1QTz[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = uFEq9NpZ - 1; i3 >= 0 && this.OOA6hdeuvCS[i3] == 0; i3--) {
            if (this.EljAMC1QTz[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public Object remove(Object obj) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        if (X1lG3V04pd >= 0) {
            return EljAMC1QTz(X1lG3V04pd);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int X1lG3V04pd = X1lG3V04pd(obj);
        if (X1lG3V04pd >= 0) {
            return AvO7iQsrTN(X1lG3V04pd, obj2);
        }
        return null;
    }
}
