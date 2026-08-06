package defpackage;

/* loaded from: classes.dex */
public class ra implements java.lang.Iterable, java.io.Serializable {
    public static final defpackage.ra AARZUJiTa = new defpackage.ra(defpackage.q70.oh6vYeIP);
    public static final defpackage.ad1 EXtogiMhuM;
    public int adDC3e2L = 0;
    public final byte[] xiZrDbcSW0;

    static {
        EXtogiMhuM = defpackage.v.IHQe1A4L2xu() ? new defpackage.ad1(18) : new defpackage.ad1(17);
    }

    public ra(byte[] bArr) {
        bArr.getClass();
        this.xiZrDbcSW0 = bArr;
    }

    public static int oh6vYeIP(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            defpackage.db.cnag84Bm(defpackage.fx0.riuEU0zW4(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static defpackage.ra r1MBDhnF(byte[] bArr, int i, int i2) {
        byte[] copyOfRange;
        oh6vYeIP(i, i + i2, bArr.length);
        switch (EXtogiMhuM.adDC3e2L) {
            case 17:
                copyOfRange = java.util.Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                copyOfRange = new byte[i2];
                java.lang.System.arraycopy(bArr, i, copyOfRange, 0, i2);
                break;
        }
        return new defpackage.ra(copyOfRange);
    }

    public byte AARZUJiTa(int i) {
        return this.xiZrDbcSW0[i];
    }

    public byte IHQe1A4L2xu(int i) {
        return this.xiZrDbcSW0[i];
    }

    public void adDC3e2L(int i, byte[] bArr) {
        java.lang.System.arraycopy(this.xiZrDbcSW0, 0, bArr, 0, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ra) || size() != ((defpackage.ra) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof defpackage.ra)) {
            return obj.equals(this);
        }
        defpackage.ra raVar = (defpackage.ra) obj;
        int i = this.adDC3e2L;
        int i2 = raVar.adDC3e2L;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > raVar.size()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > raVar.size()) {
            java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(size, "Ran off end of other: 0, ", ", ");
            JlrlGoKF.append(raVar.size());
            throw new java.lang.IllegalArgumentException(JlrlGoKF.toString());
        }
        byte[] bArr = raVar.xiZrDbcSW0;
        int xiZrDbcSW0 = xiZrDbcSW0() + size;
        int xiZrDbcSW02 = xiZrDbcSW0();
        int xiZrDbcSW03 = raVar.xiZrDbcSW0();
        while (xiZrDbcSW02 < xiZrDbcSW0) {
            if (this.xiZrDbcSW0[xiZrDbcSW02] != bArr[xiZrDbcSW03]) {
                return false;
            }
            xiZrDbcSW02++;
            xiZrDbcSW03++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.adDC3e2L;
        if (i != 0) {
            return i;
        }
        int size = size();
        int xiZrDbcSW0 = xiZrDbcSW0();
        int i2 = size;
        for (int i3 = xiZrDbcSW0; i3 < xiZrDbcSW0 + size; i3++) {
            i2 = (i2 * 31) + this.xiZrDbcSW0[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.adDC3e2L = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.pa(this);
    }

    public int size() {
        return this.xiZrDbcSW0.length;
    }

    public final java.lang.String toString() {
        java.lang.String concat;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = defpackage.c80.kd6TUFXn(this);
        } else {
            int oh6vYeIP = oh6vYeIP(0, 47, size());
            concat = defpackage.c80.kd6TUFXn(oh6vYeIP == 0 ? AARZUJiTa : new defpackage.qa(this.xiZrDbcSW0, xiZrDbcSW0(), oh6vYeIP)).concat("...");
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + concat + "\">";
    }

    public int xiZrDbcSW0() {
        return 0;
    }
}
