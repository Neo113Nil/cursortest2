package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class p70 {
    public Object[] MdtA4re8;
    public int[] NCTxEWno;
    public int wxUZMvaN;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p70(p70 p70Var) {
        this(0);
        int i = p70Var.wxUZMvaN;
        NCTxEWno(this.wxUZMvaN + i);
        if (this.wxUZMvaN != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(p70Var.P7K7Inc8(i2), p70Var.jb9XjC4I(i2));
            }
        } else if (i > 0) {
            a1.ESscZ9M1(0, 0, i, p70Var.NCTxEWno, this.NCTxEWno);
            a1.VGmz0ccI(p70Var.MdtA4re8, this.MdtA4re8, 0, 0, i << 1);
            this.wxUZMvaN = i;
        }
    }

    public final int MdtA4re8(int i, Object obj) {
        int i2 = this.wxUZMvaN;
        if (i2 == 0) {
            return -1;
        }
        int P7K7Inc8 = le0.P7K7Inc8(i2, i, this.NCTxEWno);
        if (P7K7Inc8 < 0 || fn.qoPGr6Ce(obj, this.MdtA4re8[P7K7Inc8 << 1])) {
            return P7K7Inc8;
        }
        int i3 = P7K7Inc8 + 1;
        while (i3 < i2 && this.NCTxEWno[i3] == i) {
            if (fn.qoPGr6Ce(obj, this.MdtA4re8[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = P7K7Inc8 - 1; i4 >= 0 && this.NCTxEWno[i4] == i; i4--) {
            if (fn.qoPGr6Ce(obj, this.MdtA4re8[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void NCTxEWno(int i) {
        int i2 = this.wxUZMvaN;
        int[] iArr = this.NCTxEWno;
        if (iArr.length < i) {
            this.NCTxEWno = Arrays.copyOf(iArr, i);
            this.MdtA4re8 = Arrays.copyOf(this.MdtA4re8, i * 2);
        }
        if (this.wxUZMvaN != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object P7K7Inc8(int i) {
        boolean z = false;
        if (i >= 0 && i < this.wxUZMvaN) {
            z = true;
        }
        if (z) {
            return this.MdtA4re8[i << 1];
        }
        m1.sjUBp5pO(q70.VgvYg0wo("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final Object Qr9iLBAD(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.wxUZMvaN) {
            z = true;
        }
        if (!z) {
            m1.sjUBp5pO(q70.VgvYg0wo("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.MdtA4re8;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int VgvYg0wo() {
        int i = this.wxUZMvaN;
        if (i == 0) {
            return -1;
        }
        int P7K7Inc8 = le0.P7K7Inc8(i, 0, this.NCTxEWno);
        if (P7K7Inc8 < 0 || this.MdtA4re8[P7K7Inc8 << 1] == null) {
            return P7K7Inc8;
        }
        int i2 = P7K7Inc8 + 1;
        while (i2 < i && this.NCTxEWno[i2] == 0) {
            if (this.MdtA4re8[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = P7K7Inc8 - 1; i3 >= 0 && this.NCTxEWno[i3] == 0; i3--) {
            if (this.MdtA4re8[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object b2ZJblxo(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.wxUZMvaN)) {
            m1.sjUBp5pO(q70.VgvYg0wo("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.MdtA4re8;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.NCTxEWno;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                a1.ESscZ9M1(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.MdtA4re8;
                a1.VGmz0ccI(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.MdtA4re8;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.NCTxEWno = Arrays.copyOf(iArr, i7);
            this.MdtA4re8 = Arrays.copyOf(this.MdtA4re8, i7 << 1);
            if (i2 != this.wxUZMvaN) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                a1.ESscZ9M1(0, 0, i, iArr, this.NCTxEWno);
                a1.VGmz0ccI(objArr, this.MdtA4re8, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                a1.ESscZ9M1(i, i8, i2, iArr, this.NCTxEWno);
                a1.VGmz0ccI(objArr, this.MdtA4re8, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.wxUZMvaN) {
            throw new ConcurrentModificationException();
        }
        this.wxUZMvaN = i4;
        return obj;
    }

    public final void clear() {
        int i = this.wxUZMvaN;
        if (i > 0) {
            this.NCTxEWno = le0.MdtA4re8;
            this.MdtA4re8 = le0.wxUZMvaN;
            i = 0;
            this.wxUZMvaN = 0;
        }
        if (i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return wxUZMvaN(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return qoPGr6Ce(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof p70) {
                int i = this.wxUZMvaN;
                if (i != ((p70) obj).wxUZMvaN) {
                    return false;
                }
                p70 p70Var = (p70) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object P7K7Inc8 = P7K7Inc8(i2);
                    Object jb9XjC4I = jb9XjC4I(i2);
                    Object obj2 = p70Var.get(P7K7Inc8);
                    if (jb9XjC4I == null) {
                        if (obj2 != null || !p70Var.containsKey(P7K7Inc8)) {
                            return false;
                        }
                    } else if (!jb9XjC4I.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.wxUZMvaN != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.wxUZMvaN;
            for (int i4 = 0; i4 < i3; i4++) {
                Object P7K7Inc82 = P7K7Inc8(i4);
                Object jb9XjC4I2 = jb9XjC4I(i4);
                Object obj3 = ((Map) obj).get(P7K7Inc82);
                if (jb9XjC4I2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(P7K7Inc82)) {
                        return false;
                    }
                } else if (!jb9XjC4I2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int wxUZMvaN = wxUZMvaN(obj);
        if (wxUZMvaN >= 0) {
            return this.MdtA4re8[(wxUZMvaN << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int wxUZMvaN = wxUZMvaN(obj);
        return wxUZMvaN >= 0 ? this.MdtA4re8[(wxUZMvaN << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.NCTxEWno;
        Object[] objArr = this.MdtA4re8;
        int i = this.wxUZMvaN;
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
        return this.wxUZMvaN <= 0;
    }

    public final Object jb9XjC4I(int i) {
        boolean z = false;
        if (i >= 0 && i < this.wxUZMvaN) {
            z = true;
        }
        if (z) {
            return this.MdtA4re8[(i << 1) + 1];
        }
        m1.sjUBp5pO(q70.VgvYg0wo("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.wxUZMvaN;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int MdtA4re8 = obj != null ? MdtA4re8(hashCode, obj) : VgvYg0wo();
        if (MdtA4re8 >= 0) {
            int i2 = (MdtA4re8 << 1) + 1;
            Object[] objArr = this.MdtA4re8;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~MdtA4re8;
        int[] iArr = this.NCTxEWno;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.NCTxEWno = Arrays.copyOf(iArr, i4);
            this.MdtA4re8 = Arrays.copyOf(this.MdtA4re8, i4 << 1);
            if (i != this.wxUZMvaN) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.NCTxEWno;
            int i5 = i3 + 1;
            a1.ESscZ9M1(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.MdtA4re8;
            a1.VGmz0ccI(objArr2, objArr2, i5 << 1, i3 << 1, this.wxUZMvaN << 1);
        }
        int i6 = this.wxUZMvaN;
        if (i == i6) {
            int[] iArr3 = this.NCTxEWno;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.MdtA4re8;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.wxUZMvaN = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final int qoPGr6Ce(Object obj) {
        int i = this.wxUZMvaN * 2;
        Object[] objArr = this.MdtA4re8;
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

    public final boolean remove(Object obj, Object obj2) {
        int wxUZMvaN = wxUZMvaN(obj);
        if (wxUZMvaN < 0 || !fn.qoPGr6Ce(obj2, jb9XjC4I(wxUZMvaN))) {
            return false;
        }
        b2ZJblxo(wxUZMvaN);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int wxUZMvaN = wxUZMvaN(obj);
        if (wxUZMvaN < 0 || !fn.qoPGr6Ce(obj2, jb9XjC4I(wxUZMvaN))) {
            return false;
        }
        Qr9iLBAD(wxUZMvaN, obj3);
        return true;
    }

    public final int size() {
        return this.wxUZMvaN;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.wxUZMvaN * 28);
        sb.append('{');
        int i = this.wxUZMvaN;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object P7K7Inc8 = P7K7Inc8(i2);
            if (P7K7Inc8 != sb) {
                sb.append(P7K7Inc8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object jb9XjC4I = jb9XjC4I(i2);
            if (jb9XjC4I != sb) {
                sb.append(jb9XjC4I);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int wxUZMvaN(Object obj) {
        return obj == null ? VgvYg0wo() : MdtA4re8(obj.hashCode(), obj);
    }

    public Object remove(Object obj) {
        int wxUZMvaN = wxUZMvaN(obj);
        if (wxUZMvaN >= 0) {
            return b2ZJblxo(wxUZMvaN);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int wxUZMvaN = wxUZMvaN(obj);
        if (wxUZMvaN >= 0) {
            return Qr9iLBAD(wxUZMvaN, obj2);
        }
        return null;
    }

    public p70(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = le0.MdtA4re8;
        } else {
            iArr = new int[i];
        }
        this.NCTxEWno = iArr;
        if (i == 0) {
            objArr = le0.wxUZMvaN;
        } else {
            objArr = new Object[i << 1];
        }
        this.MdtA4re8 = objArr;
    }
}
