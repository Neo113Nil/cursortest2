package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lq implements Cloneable {
    public /* synthetic */ long[] MdtA4re8;
    public /* synthetic */ boolean NCTxEWno;
    public /* synthetic */ int VgvYg0wo;
    public /* synthetic */ Object[] wxUZMvaN;

    public lq() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.MdtA4re8 = new long[i4];
        this.wxUZMvaN = new Object[i4];
    }

    public final long MdtA4re8(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.VgvYg0wo)) {
            m1.sjUBp5pO(q70.VgvYg0wo("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.NCTxEWno) {
            long[] jArr = this.MdtA4re8;
            Object[] objArr = this.wxUZMvaN;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != w30.VgvYg0wo) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.NCTxEWno = false;
            this.VgvYg0wo = i3;
        }
        return this.MdtA4re8[i];
    }

    public final Object NCTxEWno(long j) {
        Object obj;
        int b2ZJblxo = le0.b2ZJblxo(this.MdtA4re8, this.VgvYg0wo, j);
        if (b2ZJblxo < 0 || (obj = this.wxUZMvaN[b2ZJblxo]) == w30.VgvYg0wo) {
            return null;
        }
        return obj;
    }

    public final Object P7K7Inc8(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.VgvYg0wo)) {
            m1.sjUBp5pO(q70.VgvYg0wo("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.NCTxEWno) {
            long[] jArr = this.MdtA4re8;
            Object[] objArr = this.wxUZMvaN;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != w30.VgvYg0wo) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.NCTxEWno = false;
            this.VgvYg0wo = i3;
        }
        return this.wxUZMvaN[i];
    }

    public final int VgvYg0wo() {
        if (this.NCTxEWno) {
            int i = this.VgvYg0wo;
            long[] jArr = this.MdtA4re8;
            Object[] objArr = this.wxUZMvaN;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != w30.VgvYg0wo) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.NCTxEWno = false;
            this.VgvYg0wo = i2;
        }
        return this.VgvYg0wo;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        lq lqVar = (lq) clone;
        lqVar.MdtA4re8 = (long[]) this.MdtA4re8.clone();
        lqVar.wxUZMvaN = (Object[]) this.wxUZMvaN.clone();
        return lqVar;
    }

    public final void qoPGr6Ce() {
        int i = this.VgvYg0wo;
        Object[] objArr = this.wxUZMvaN;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.VgvYg0wo = 0;
        this.NCTxEWno = false;
    }

    public final String toString() {
        if (VgvYg0wo() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.VgvYg0wo * 28);
        sb.append('{');
        int i = this.VgvYg0wo;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(MdtA4re8(i2));
            sb.append('=');
            Object P7K7Inc8 = P7K7Inc8(i2);
            if (P7K7Inc8 != sb) {
                sb.append(P7K7Inc8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void wxUZMvaN(long j, Object obj) {
        Object obj2 = w30.VgvYg0wo;
        int b2ZJblxo = le0.b2ZJblxo(this.MdtA4re8, this.VgvYg0wo, j);
        if (b2ZJblxo >= 0) {
            this.wxUZMvaN[b2ZJblxo] = obj;
            return;
        }
        int i = ~b2ZJblxo;
        int i2 = this.VgvYg0wo;
        if (i < i2) {
            Object[] objArr = this.wxUZMvaN;
            if (objArr[i] == obj2) {
                this.MdtA4re8[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.NCTxEWno) {
            long[] jArr = this.MdtA4re8;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.wxUZMvaN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.NCTxEWno = false;
                this.VgvYg0wo = i3;
                i = ~le0.b2ZJblxo(this.MdtA4re8, i3, j);
            }
        }
        int i5 = this.VgvYg0wo;
        if (i5 >= this.MdtA4re8.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.MdtA4re8 = Arrays.copyOf(this.MdtA4re8, i9);
            this.wxUZMvaN = Arrays.copyOf(this.wxUZMvaN, i9);
        }
        int i10 = this.VgvYg0wo - i;
        if (i10 != 0) {
            long[] jArr2 = this.MdtA4re8;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.wxUZMvaN;
            a1.VGmz0ccI(objArr3, objArr3, i11, i, this.VgvYg0wo);
        }
        this.MdtA4re8[i] = j;
        this.wxUZMvaN[i] = obj;
        this.VgvYg0wo++;
    }
}
