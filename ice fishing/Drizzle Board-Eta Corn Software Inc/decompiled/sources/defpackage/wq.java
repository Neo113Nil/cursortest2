package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wq implements Map, Serializable, xn {
    public static final wq lDXGDhIF;
    public Object[] MdtA4re8;
    public Object[] NCTxEWno;
    public xq OnDfzHZD;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public int[] VgvYg0wo;
    public int b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public xq k3x7lurq;
    public yq ow5vqvCr;
    public int[] wxUZMvaN;
    public boolean ygLcUYwZ;

    static {
        wq wqVar = new wq(0);
        wqVar.ygLcUYwZ = true;
        lDXGDhIF = wqVar;
    }

    public wq(int i) {
        if (i < 0) {
            m1.sjUBp5pO("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.NCTxEWno = objArr;
        this.MdtA4re8 = null;
        this.wxUZMvaN = iArr;
        this.VgvYg0wo = new int[highestOneBit];
        this.P7K7Inc8 = 2;
        this.b2ZJblxo = 0;
        this.Qr9iLBAD = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final void MdtA4re8() {
        if (this.ygLcUYwZ) {
            throw new UnsupportedOperationException();
        }
    }

    public final wq NCTxEWno() {
        MdtA4re8();
        this.ygLcUYwZ = true;
        if (this.eVhOlqcC > 0) {
            return this;
        }
        wq wqVar = lDXGDhIF;
        wqVar.getClass();
        return wqVar;
    }

    public final void P7K7Inc8(int i) {
        Object[] objArr = this.NCTxEWno;
        int length = objArr.length;
        int i2 = this.b2ZJblxo;
        int i3 = length - i2;
        int i4 = i2 - this.eVhOlqcC;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            wxUZMvaN(true);
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
            this.NCTxEWno = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.MdtA4re8;
            this.MdtA4re8 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.wxUZMvaN = Arrays.copyOf(this.wxUZMvaN, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.VgvYg0wo.length) {
                eVhOlqcC(highestOneBit);
            }
        }
    }

    public final int Qr9iLBAD(Object obj) {
        int i = this.b2ZJblxo;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.wxUZMvaN[i] >= 0) {
                Object[] objArr = this.MdtA4re8;
                objArr.getClass();
                if (fn.qoPGr6Ce(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final boolean VgvYg0wo(Collection collection) {
        boolean qoPGr6Ce;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int b2ZJblxo = b2ZJblxo(entry.getKey());
                    if (b2ZJblxo < 0) {
                        qoPGr6Ce = false;
                    } else {
                        Object[] objArr = this.MdtA4re8;
                        objArr.getClass();
                        qoPGr6Ce = fn.qoPGr6Ce(objArr[b2ZJblxo], entry.getValue());
                    }
                    if (!qoPGr6Ce) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final int b2ZJblxo(Object obj) {
        int jb9XjC4I = jb9XjC4I(obj);
        int i = this.P7K7Inc8;
        while (true) {
            int i2 = this.VgvYg0wo[jb9XjC4I];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (fn.qoPGr6Ce(this.NCTxEWno[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            jb9XjC4I = jb9XjC4I == 0 ? this.VgvYg0wo.length - 1 : jb9XjC4I - 1;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        MdtA4re8();
        int i = this.b2ZJblxo - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.wxUZMvaN;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.VgvYg0wo[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        fn.lwWCatUu(this.NCTxEWno, 0, this.b2ZJblxo);
        Object[] objArr = this.MdtA4re8;
        if (objArr != null) {
            fn.lwWCatUu(objArr, 0, this.b2ZJblxo);
        }
        this.eVhOlqcC = 0;
        this.b2ZJblxo = 0;
        this.jb9XjC4I++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b2ZJblxo(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return Qr9iLBAD(obj) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.wxUZMvaN[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void eVhOlqcC(int i) {
        this.jb9XjC4I++;
        int i2 = 0;
        if (this.b2ZJblxo > this.eVhOlqcC) {
            wxUZMvaN(false);
        }
        this.VgvYg0wo = new int[i];
        this.Qr9iLBAD = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.b2ZJblxo) {
            int i3 = i2 + 1;
            int jb9XjC4I = jb9XjC4I(this.NCTxEWno[i2]);
            int i4 = this.P7K7Inc8;
            while (true) {
                int[] iArr = this.VgvYg0wo;
                if (iArr[jb9XjC4I] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    m1.Ey6iv0m0("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                jb9XjC4I = jb9XjC4I == 0 ? iArr.length - 1 : jb9XjC4I - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        xq xqVar = this.OnDfzHZD;
        if (xqVar != null) {
            return xqVar;
        }
        xq xqVar2 = new xq(this, 0);
        this.OnDfzHZD = xqVar2;
        return xqVar2;
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
        return this.eVhOlqcC == map.size() && VgvYg0wo(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int b2ZJblxo = b2ZJblxo(obj);
        if (b2ZJblxo < 0) {
            return null;
        }
        Object[] objArr = this.MdtA4re8;
        objArr.getClass();
        return objArr[b2ZJblxo];
    }

    @Override // java.util.Map
    public final int hashCode() {
        tq tqVar = new tq(this, 0);
        int i = 0;
        while (tqVar.hasNext()) {
            int i2 = tqVar.NCTxEWno;
            wq wqVar = (wq) tqVar.VgvYg0wo;
            if (i2 >= wqVar.b2ZJblxo) {
                throw new NoSuchElementException();
            }
            tqVar.NCTxEWno = i2 + 1;
            tqVar.MdtA4re8 = i2;
            Object obj = wqVar.NCTxEWno[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = wqVar.MdtA4re8;
            objArr.getClass();
            Object obj2 = objArr[tqVar.MdtA4re8];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            tqVar.VgvYg0wo();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.eVhOlqcC == 0;
    }

    public final int jb9XjC4I(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.Qr9iLBAD;
    }

    public final void k3x7lurq(int i) {
        int i2;
        int i3;
        int jb9XjC4I;
        int[] iArr;
        Object[] objArr = this.NCTxEWno;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.MdtA4re8;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.wxUZMvaN[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.VgvYg0wo.length - 1 : i4 - 1;
                int[] iArr2 = this.VgvYg0wo;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.P7K7Inc8) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    jb9XjC4I = jb9XjC4I(this.NCTxEWno[i3]) - i4;
                    iArr = this.VgvYg0wo;
                }
            } while ((jb9XjC4I & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.wxUZMvaN[i3] = i5;
        }
        this.wxUZMvaN[i] = -1;
        this.eVhOlqcC--;
        this.jb9XjC4I++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xq xqVar = this.k3x7lurq;
        if (xqVar != null) {
            return xqVar;
        }
        xq xqVar2 = new xq(this, 1);
        this.k3x7lurq = xqVar2;
        return xqVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        MdtA4re8();
        int qoPGr6Ce = qoPGr6Ce(obj);
        Object[] objArr = this.MdtA4re8;
        if (objArr == null) {
            int length = this.NCTxEWno.length;
            if (length < 0) {
                m1.sjUBp5pO("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.MdtA4re8 = objArr;
        }
        if (qoPGr6Ce >= 0) {
            objArr[qoPGr6Ce] = obj2;
            return null;
        }
        int i = (-qoPGr6Ce) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        MdtA4re8();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        P7K7Inc8(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int qoPGr6Ce = qoPGr6Ce(entry.getKey());
            Object[] objArr = this.MdtA4re8;
            if (objArr == null) {
                int length = this.NCTxEWno.length;
                if (length < 0) {
                    m1.sjUBp5pO("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.MdtA4re8 = objArr;
                }
            }
            if (qoPGr6Ce >= 0) {
                objArr[qoPGr6Ce] = entry.getValue();
            } else {
                int i = (-qoPGr6Ce) - 1;
                if (!fn.qoPGr6Ce(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    public final int qoPGr6Ce(Object obj) {
        MdtA4re8();
        while (true) {
            int jb9XjC4I = jb9XjC4I(obj);
            int i = this.P7K7Inc8 * 2;
            int length = this.VgvYg0wo.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.VgvYg0wo;
                int i3 = iArr[jb9XjC4I];
                if (i3 == 0) {
                    int i4 = this.b2ZJblxo;
                    Object[] objArr = this.NCTxEWno;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.b2ZJblxo = i5;
                        objArr[i4] = obj;
                        this.wxUZMvaN[i4] = jb9XjC4I;
                        iArr[jb9XjC4I] = i5;
                        this.eVhOlqcC++;
                        this.jb9XjC4I++;
                        if (i2 > this.P7K7Inc8) {
                            this.P7K7Inc8 = i2;
                        }
                        return i4;
                    }
                    P7K7Inc8(1);
                } else {
                    if (fn.qoPGr6Ce(this.NCTxEWno[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        eVhOlqcC(this.VgvYg0wo.length * 2);
                        break;
                    }
                    jb9XjC4I = jb9XjC4I == 0 ? this.VgvYg0wo.length - 1 : jb9XjC4I - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        MdtA4re8();
        int b2ZJblxo = b2ZJblxo(obj);
        if (b2ZJblxo < 0) {
            return null;
        }
        Object[] objArr = this.MdtA4re8;
        objArr.getClass();
        Object obj2 = objArr[b2ZJblxo];
        k3x7lurq(b2ZJblxo);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.eVhOlqcC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.eVhOlqcC * 3) + 2);
        sb.append("{");
        int i = 0;
        tq tqVar = new tq(this, 0);
        while (tqVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = tqVar.NCTxEWno;
            wq wqVar = (wq) tqVar.VgvYg0wo;
            if (i2 >= wqVar.b2ZJblxo) {
                throw new NoSuchElementException();
            }
            tqVar.NCTxEWno = i2 + 1;
            tqVar.MdtA4re8 = i2;
            Object obj = wqVar.NCTxEWno[i2];
            if (obj == wqVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = wqVar.MdtA4re8;
            objArr.getClass();
            Object obj2 = objArr[tqVar.MdtA4re8];
            if (obj2 == wqVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            tqVar.VgvYg0wo();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        yq yqVar = this.ow5vqvCr;
        if (yqVar != null) {
            return yqVar;
        }
        yq yqVar2 = new yq(this);
        this.ow5vqvCr = yqVar2;
        return yqVar2;
    }

    public final void wxUZMvaN(boolean z) {
        int i;
        Object[] objArr = this.MdtA4re8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b2ZJblxo;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.wxUZMvaN;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.NCTxEWno;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.VgvYg0wo[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        fn.lwWCatUu(this.NCTxEWno, i3, i);
        if (objArr != null) {
            fn.lwWCatUu(objArr, i3, this.b2ZJblxo);
        }
        this.b2ZJblxo = i3;
    }

    public wq() {
        this(8);
    }
}
