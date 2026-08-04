package com.gamericefishpro.space.i9;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class w4 implements Iterable, Serializable {
    public static final w4 i = new w4(n5.b);
    public int d = 0;
    public final byte[] e;

    static {
        int i2 = r4.a;
    }

    public w4(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    public static w4 f(byte[] bArr, int i2, int i3) {
        h(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new w4(bArr2);
    }

    public static int h(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 44 + String.valueOf(i3).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i4).length());
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i4);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public byte b(int i2) {
        return this.e[i2];
    }

    public byte c(int i2) {
        return this.e[i2];
    }

    public int d() {
        return this.e.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w4) && d() == ((w4) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof w4)) {
                return obj.equals(this);
            }
            w4 w4Var = (w4) obj;
            int i2 = this.d;
            int i3 = w4Var.d;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                int iD = d();
                if (iD > w4Var.d()) {
                    int iD2 = d();
                    StringBuilder sb = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
                    sb.append("Length too large: ");
                    sb.append(iD);
                    sb.append(iD2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iD <= w4Var.d()) {
                    byte[] bArr = w4Var.e;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < iD) {
                        if (this.e[i4] == bArr[i5]) {
                            i4++;
                            i5++;
                        }
                    }
                    return true;
                }
                int iD3 = w4Var.d();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iD);
                sb2.append(", ");
                sb2.append(iD3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.d;
        if (i2 != 0) {
            return i2;
        }
        int iD = d();
        int i3 = iD;
        for (int i4 = 0; i4 < iD; i4++) {
            i3 = (i3 * 31) + this.e[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.d = i3;
        return i3;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new u4(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = com.gamericefishpro.space.a.a.I(this);
        } else {
            int iH = h(0, 47, d());
            strConcat = com.gamericefishpro.space.a.a.I(iH == 0 ? i : new v4(iH, this.e)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return com.gamericefishpro.space.t0.y0.j(sb, strConcat, "\">");
    }
}
