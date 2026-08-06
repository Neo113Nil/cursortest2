package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ic0 implements Map, Serializable, r40 {
    public static final ic0 Mjvvu5DE;
    public int[] AvO7iQsrTN;
    public int E7jCp8Ls;
    public Object[] EljAMC1QTz;
    public int JFJ3QoxA;
    public Object[] OOA6hdeuvCS;
    public jc0 WIEu4Ya2g8;
    public int XnEVoBF0td1l;
    public boolean YmKjaVtbfp5Z;
    public int[] encWxUiV2;
    public kc0 iwATDS1i01k;
    public int mOu10nynGul;
    public int rQPn8YBR;
    public jc0 uFEq9NpZ;

    static {
        ic0 ic0Var = new ic0(0);
        ic0Var.YmKjaVtbfp5Z = true;
        Mjvvu5DE = ic0Var;
    }

    public ic0(int i) {
        if (i < 0) {
            o4.mE4lRynR("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.OOA6hdeuvCS = objArr;
        this.EljAMC1QTz = null;
        this.AvO7iQsrTN = iArr;
        this.encWxUiV2 = new int[highestOneBit];
        this.mOu10nynGul = 2;
        this.JFJ3QoxA = 0;
        this.rQPn8YBR = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int AvO7iQsrTN(Object obj) {
        int i = this.JFJ3QoxA;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.AvO7iQsrTN[i] >= 0) {
                Object[] objArr = this.EljAMC1QTz;
                objArr.getClass();
                if (o30.rQPn8YBR(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int EljAMC1QTz(Object obj) {
        int encWxUiV2 = encWxUiV2(obj);
        int i = this.mOu10nynGul;
        while (true) {
            int i2 = this.encWxUiV2[encWxUiV2];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (o30.rQPn8YBR(this.OOA6hdeuvCS[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            encWxUiV2 = encWxUiV2 == 0 ? this.encWxUiV2.length - 1 : encWxUiV2 - 1;
        }
    }

    public final int GWasM1elztuh(Object obj) {
        Yi7zF1RB1();
        while (true) {
            int encWxUiV2 = encWxUiV2(obj);
            int i = this.mOu10nynGul * 2;
            int length = this.encWxUiV2.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.encWxUiV2;
                int i3 = iArr[encWxUiV2];
                if (i3 == 0) {
                    int i4 = this.JFJ3QoxA;
                    Object[] objArr = this.OOA6hdeuvCS;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.JFJ3QoxA = i5;
                        objArr[i4] = obj;
                        this.AvO7iQsrTN[i4] = encWxUiV2;
                        iArr[encWxUiV2] = i5;
                        this.XnEVoBF0td1l++;
                        this.E7jCp8Ls++;
                        if (i2 > this.mOu10nynGul) {
                            this.mOu10nynGul = i2;
                        }
                        return i4;
                    }
                    OOA6hdeuvCS(1);
                } else {
                    if (o30.rQPn8YBR(this.OOA6hdeuvCS[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        mOu10nynGul(this.encWxUiV2.length * 2);
                        break;
                    }
                    encWxUiV2 = encWxUiV2 == 0 ? this.encWxUiV2.length - 1 : encWxUiV2 - 1;
                }
            }
        }
    }

    public final void JFJ3QoxA(int i) {
        int i2;
        int i3;
        int encWxUiV2;
        int[] iArr;
        Object[] objArr = this.OOA6hdeuvCS;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.EljAMC1QTz;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.AvO7iQsrTN[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.encWxUiV2.length - 1 : i4 - 1;
                int[] iArr2 = this.encWxUiV2;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.mOu10nynGul) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    encWxUiV2 = encWxUiV2(this.OOA6hdeuvCS[i3]) - i4;
                    iArr = this.encWxUiV2;
                }
            } while ((encWxUiV2 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.AvO7iQsrTN[i3] = i5;
        }
        this.AvO7iQsrTN[i] = -1;
        this.XnEVoBF0td1l--;
        this.E7jCp8Ls++;
    }

    public final void OOA6hdeuvCS(int i) {
        Object[] objArr = this.OOA6hdeuvCS;
        int length = objArr.length;
        int i2 = this.JFJ3QoxA;
        int i3 = length - i2;
        int i4 = i2 - this.XnEVoBF0td1l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            X1lG3V04pd(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.OOA6hdeuvCS = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.EljAMC1QTz;
            this.EljAMC1QTz = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.AvO7iQsrTN = Arrays.copyOf(this.AvO7iQsrTN, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.encWxUiV2.length) {
                mOu10nynGul(highestOneBit);
            }
        }
    }

    public final void X1lG3V04pd(boolean z) {
        int i;
        Object[] objArr = this.EljAMC1QTz;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.JFJ3QoxA;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.AvO7iQsrTN;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.OOA6hdeuvCS;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.encWxUiV2[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        o50.ozMwhSAI(this.OOA6hdeuvCS, i3, i);
        if (objArr != null) {
            o50.ozMwhSAI(objArr, i3, this.JFJ3QoxA);
        }
        this.JFJ3QoxA = i3;
    }

    public final void Yi7zF1RB1() {
        if (this.YmKjaVtbfp5Z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        Yi7zF1RB1();
        int i = this.JFJ3QoxA - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.AvO7iQsrTN;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.encWxUiV2[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        o50.ozMwhSAI(this.OOA6hdeuvCS, 0, this.JFJ3QoxA);
        Object[] objArr = this.EljAMC1QTz;
        if (objArr != null) {
            o50.ozMwhSAI(objArr, 0, this.JFJ3QoxA);
        }
        this.XnEVoBF0td1l = 0;
        this.JFJ3QoxA = 0;
        this.E7jCp8Ls++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return EljAMC1QTz(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return AvO7iQsrTN(obj) >= 0;
    }

    public final int encWxUiV2(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.rQPn8YBR;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        jc0 jc0Var = this.WIEu4Ya2g8;
        if (jc0Var != null) {
            return jc0Var;
        }
        jc0 jc0Var2 = new jc0(this, 0);
        this.WIEu4Ya2g8 = jc0Var2;
        return jc0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.XnEVoBF0td1l == map.size() && xqGvceK5x(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int EljAMC1QTz = EljAMC1QTz(obj);
        if (EljAMC1QTz < 0) {
            return null;
        }
        Object[] objArr = this.EljAMC1QTz;
        objArr.getClass();
        return objArr[EljAMC1QTz];
    }

    @Override // java.util.Map
    public final int hashCode() {
        fc0 fc0Var = new fc0(this, 0);
        int i = 0;
        while (fc0Var.hasNext()) {
            int i2 = fc0Var.OOA6hdeuvCS;
            ic0 ic0Var = (ic0) fc0Var.encWxUiV2;
            if (i2 >= ic0Var.JFJ3QoxA) {
                o4.E7jCp8Ls();
                return 0;
            }
            fc0Var.OOA6hdeuvCS = i2 + 1;
            fc0Var.EljAMC1QTz = i2;
            Object obj = ic0Var.OOA6hdeuvCS[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ic0Var.EljAMC1QTz;
            objArr.getClass();
            Object obj2 = objArr[fc0Var.EljAMC1QTz];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fc0Var.X1lG3V04pd();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.XnEVoBF0td1l == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jc0 jc0Var = this.uFEq9NpZ;
        if (jc0Var != null) {
            return jc0Var;
        }
        jc0 jc0Var2 = new jc0(this, 1);
        this.uFEq9NpZ = jc0Var2;
        return jc0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.AvO7iQsrTN[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mOu10nynGul(int i) {
        this.E7jCp8Ls++;
        int i2 = 0;
        if (this.JFJ3QoxA > this.XnEVoBF0td1l) {
            X1lG3V04pd(false);
        }
        this.encWxUiV2 = new int[i];
        this.rQPn8YBR = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.JFJ3QoxA) {
            int i3 = i2 + 1;
            int encWxUiV2 = encWxUiV2(this.OOA6hdeuvCS[i2]);
            int i4 = this.mOu10nynGul;
            while (true) {
                int[] iArr = this.encWxUiV2;
                if (iArr[encWxUiV2] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    o4.jivtDDk9H("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                encWxUiV2 = encWxUiV2 == 0 ? iArr.length - 1 : encWxUiV2 - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Yi7zF1RB1();
        int GWasM1elztuh = GWasM1elztuh(obj);
        Object[] objArr = this.EljAMC1QTz;
        if (objArr == null) {
            int length = this.OOA6hdeuvCS.length;
            if (length < 0) {
                o4.mE4lRynR("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.EljAMC1QTz = objArr;
        }
        if (GWasM1elztuh >= 0) {
            objArr[GWasM1elztuh] = obj2;
            return null;
        }
        int i = (-GWasM1elztuh) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        Yi7zF1RB1();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        OOA6hdeuvCS(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int GWasM1elztuh = GWasM1elztuh(entry.getKey());
            Object[] objArr = this.EljAMC1QTz;
            if (objArr == null) {
                int length = this.OOA6hdeuvCS.length;
                if (length < 0) {
                    o4.mE4lRynR("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.EljAMC1QTz = objArr;
                }
            }
            if (GWasM1elztuh >= 0) {
                objArr[GWasM1elztuh] = entry.getValue();
            } else {
                int i = (-GWasM1elztuh) - 1;
                if (!o30.rQPn8YBR(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Yi7zF1RB1();
        int EljAMC1QTz = EljAMC1QTz(obj);
        if (EljAMC1QTz < 0) {
            return null;
        }
        Object[] objArr = this.EljAMC1QTz;
        objArr.getClass();
        Object obj2 = objArr[EljAMC1QTz];
        JFJ3QoxA(EljAMC1QTz);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.XnEVoBF0td1l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.XnEVoBF0td1l * 3) + 2);
        sb.append("{");
        int i = 0;
        fc0 fc0Var = new fc0(this, 0);
        while (fc0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = fc0Var.OOA6hdeuvCS;
            ic0 ic0Var = (ic0) fc0Var.encWxUiV2;
            if (i2 >= ic0Var.JFJ3QoxA) {
                o4.E7jCp8Ls();
                return null;
            }
            fc0Var.OOA6hdeuvCS = i2 + 1;
            fc0Var.EljAMC1QTz = i2;
            Object obj = ic0Var.OOA6hdeuvCS[i2];
            if (obj == ic0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ic0Var.EljAMC1QTz;
            objArr.getClass();
            Object obj2 = objArr[fc0Var.EljAMC1QTz];
            if (obj2 == ic0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            fc0Var.X1lG3V04pd();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        kc0 kc0Var = this.iwATDS1i01k;
        if (kc0Var != null) {
            return kc0Var;
        }
        kc0 kc0Var2 = new kc0(this);
        this.iwATDS1i01k = kc0Var2;
        return kc0Var2;
    }

    public final boolean xqGvceK5x(Collection collection) {
        boolean rQPn8YBR;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int EljAMC1QTz = EljAMC1QTz(entry.getKey());
                    if (EljAMC1QTz < 0) {
                        rQPn8YBR = false;
                    } else {
                        Object[] objArr = this.EljAMC1QTz;
                        objArr.getClass();
                        rQPn8YBR = o30.rQPn8YBR(objArr[EljAMC1QTz], entry.getValue());
                    }
                    if (!rQPn8YBR) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }
}
