package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class c9 implements Iterable, Serializable {
    public static final c9 AvO7iQsrTN = new c9(i30.Yi7zF1RB1);
    public static final k61 encWxUiV2;
    public final byte[] EljAMC1QTz;
    public int OOA6hdeuvCS = 0;

    static {
        encWxUiV2 = r8u5JxottJCl.GWasM1elztuh() ? new k61(18) : new k61(17);
    }

    public c9(byte[] bArr) {
        bArr.getClass();
        this.EljAMC1QTz = bArr;
    }

    public static c9 X1lG3V04pd(byte[] bArr, int i, int i2) {
        byte[] copyOfRange;
        Yi7zF1RB1(i, i + i2, bArr.length);
        switch (encWxUiV2.OOA6hdeuvCS) {
            case 17:
                copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                copyOfRange = new byte[i2];
                System.arraycopy(bArr, i, copyOfRange, 0, i2);
                break;
        }
        return new c9(copyOfRange);
    }

    public static int Yi7zF1RB1(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            o4.uFEq9NpZ(mr0.encWxUiV2("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("Beginning index larger than ending index: ", i, ", ", i2));
            return 0;
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("End index: ", i2, " >= ", i3));
        return 0;
    }

    public byte AvO7iQsrTN(int i) {
        return this.EljAMC1QTz[i];
    }

    public int EljAMC1QTz() {
        return 0;
    }

    public byte GWasM1elztuh(int i) {
        return this.EljAMC1QTz[i];
    }

    public void OOA6hdeuvCS(byte[] bArr, int i) {
        System.arraycopy(this.EljAMC1QTz, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c9) || size() != ((c9) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return obj.equals(this);
        }
        c9 c9Var = (c9) obj;
        int i = this.OOA6hdeuvCS;
        int i2 = c9Var.OOA6hdeuvCS;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c9Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c9Var.size()) {
            StringBuilder rQPn8YBR = mr0.rQPn8YBR("Ran off end of other: 0, ", size, ", ");
            rQPn8YBR.append(c9Var.size());
            throw new IllegalArgumentException(rQPn8YBR.toString());
        }
        byte[] bArr = c9Var.EljAMC1QTz;
        int EljAMC1QTz = EljAMC1QTz() + size;
        int EljAMC1QTz2 = EljAMC1QTz();
        int EljAMC1QTz3 = c9Var.EljAMC1QTz();
        while (EljAMC1QTz2 < EljAMC1QTz) {
            if (this.EljAMC1QTz[EljAMC1QTz2] != bArr[EljAMC1QTz3]) {
                return false;
            }
            EljAMC1QTz2++;
            EljAMC1QTz3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.OOA6hdeuvCS;
        if (i != 0) {
            return i;
        }
        int size = size();
        int EljAMC1QTz = EljAMC1QTz();
        int i2 = size;
        for (int i3 = EljAMC1QTz; i3 < EljAMC1QTz + size; i3++) {
            i2 = (i2 * 31) + this.EljAMC1QTz[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.OOA6hdeuvCS = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a9(this);
    }

    public int size() {
        return this.EljAMC1QTz.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = b70.mE4lRynR(this);
        } else {
            int Yi7zF1RB1 = Yi7zF1RB1(0, 47, size());
            concat = b70.mE4lRynR(Yi7zF1RB1 == 0 ? AvO7iQsrTN : new b9(this.EljAMC1QTz, EljAMC1QTz(), Yi7zF1RB1)).concat("...");
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + concat + "\">";
    }
}
