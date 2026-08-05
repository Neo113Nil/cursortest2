package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a80 implements Cloneable {
    public /* synthetic */ int[] MdtA4re8;
    public /* synthetic */ boolean NCTxEWno;
    public /* synthetic */ int VgvYg0wo;
    public /* synthetic */ Object[] wxUZMvaN;

    public a80(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.MdtA4re8 = new int[i5];
        this.wxUZMvaN = new Object[i5];
    }

    public final int MdtA4re8() {
        if (this.NCTxEWno) {
            ej0.amk52bBQ(this);
        }
        return this.VgvYg0wo;
    }

    public final void NCTxEWno(int i, Object obj) {
        int P7K7Inc8 = le0.P7K7Inc8(this.VgvYg0wo, i, this.MdtA4re8);
        if (P7K7Inc8 >= 0) {
            this.wxUZMvaN[P7K7Inc8] = obj;
            return;
        }
        int i2 = ~P7K7Inc8;
        int i3 = this.VgvYg0wo;
        if (i2 < i3) {
            Object[] objArr = this.wxUZMvaN;
            if (objArr[i2] == ej0.ow5vqvCr) {
                this.MdtA4re8[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.NCTxEWno && i3 >= this.MdtA4re8.length) {
            ej0.amk52bBQ(this);
            i2 = ~le0.P7K7Inc8(this.VgvYg0wo, i, this.MdtA4re8);
        }
        int i4 = this.VgvYg0wo;
        if (i4 >= this.MdtA4re8.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.MdtA4re8 = Arrays.copyOf(this.MdtA4re8, i8);
            this.wxUZMvaN = Arrays.copyOf(this.wxUZMvaN, i8);
        }
        int i9 = this.VgvYg0wo;
        if (i9 - i2 != 0) {
            int[] iArr = this.MdtA4re8;
            int i10 = i2 + 1;
            a1.ESscZ9M1(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.wxUZMvaN;
            a1.VGmz0ccI(objArr2, objArr2, i10, i2, this.VgvYg0wo);
        }
        this.MdtA4re8[i2] = i;
        this.wxUZMvaN[i2] = obj;
        this.VgvYg0wo++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        a80 a80Var = (a80) clone;
        a80Var.MdtA4re8 = (int[]) this.MdtA4re8.clone();
        a80Var.wxUZMvaN = (Object[]) this.wxUZMvaN.clone();
        return a80Var;
    }

    public final int qoPGr6Ce(int i) {
        if (this.NCTxEWno) {
            ej0.amk52bBQ(this);
        }
        return this.MdtA4re8[i];
    }

    public final String toString() {
        if (MdtA4re8() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.VgvYg0wo * 28);
        sb.append('{');
        int i = this.VgvYg0wo;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(qoPGr6Ce(i2));
            sb.append('=');
            Object wxUZMvaN = wxUZMvaN(i2);
            if (wxUZMvaN != this) {
                sb.append(wxUZMvaN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object wxUZMvaN(int i) {
        if (this.NCTxEWno) {
            ej0.amk52bBQ(this);
        }
        Object[] objArr = this.wxUZMvaN;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
