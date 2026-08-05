package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a5 {
    public a5 NCTxEWno;
    public long qoPGr6Ce = 0;

    public final void MdtA4re8() {
        if (this.NCTxEWno == null) {
            this.NCTxEWno = new a5();
        }
    }

    public final int NCTxEWno(int i) {
        a5 a5Var = this.NCTxEWno;
        if (a5Var == null) {
            long j = this.qoPGr6Ce;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.qoPGr6Ce);
        }
        return Long.bitCount(this.qoPGr6Ce) + a5Var.NCTxEWno(i - 64);
    }

    public final boolean P7K7Inc8(int i) {
        if (i >= 64) {
            MdtA4re8();
            return this.NCTxEWno.P7K7Inc8(i - 64);
        }
        long j = 1 << i;
        long j2 = this.qoPGr6Ce;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.qoPGr6Ce = j3;
        long j4 = j - 1;
        this.qoPGr6Ce = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        a5 a5Var = this.NCTxEWno;
        if (a5Var != null) {
            if (a5Var.wxUZMvaN(0)) {
                Qr9iLBAD(63);
            }
            this.NCTxEWno.P7K7Inc8(0);
        }
        return z;
    }

    public final void Qr9iLBAD(int i) {
        if (i < 64) {
            this.qoPGr6Ce |= 1 << i;
        } else {
            MdtA4re8();
            this.NCTxEWno.Qr9iLBAD(i - 64);
        }
    }

    public final void VgvYg0wo(int i, boolean z) {
        if (i >= 64) {
            MdtA4re8();
            this.NCTxEWno.VgvYg0wo(i - 64, z);
            return;
        }
        long j = this.qoPGr6Ce;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.qoPGr6Ce = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            Qr9iLBAD(i);
        } else {
            qoPGr6Ce(i);
        }
        if (z2 || this.NCTxEWno != null) {
            MdtA4re8();
            this.NCTxEWno.VgvYg0wo(0, z2);
        }
    }

    public final void b2ZJblxo() {
        this.qoPGr6Ce = 0L;
        a5 a5Var = this.NCTxEWno;
        if (a5Var != null) {
            a5Var.b2ZJblxo();
        }
    }

    public final void qoPGr6Ce(int i) {
        if (i < 64) {
            this.qoPGr6Ce &= ~(1 << i);
            return;
        }
        a5 a5Var = this.NCTxEWno;
        if (a5Var != null) {
            a5Var.qoPGr6Ce(i - 64);
        }
    }

    public final String toString() {
        if (this.NCTxEWno == null) {
            return Long.toBinaryString(this.qoPGr6Ce);
        }
        return this.NCTxEWno.toString() + "xx" + Long.toBinaryString(this.qoPGr6Ce);
    }

    public final boolean wxUZMvaN(int i) {
        if (i < 64) {
            return ((1 << i) & this.qoPGr6Ce) != 0;
        }
        MdtA4re8();
        return this.NCTxEWno.wxUZMvaN(i - 64);
    }
}
