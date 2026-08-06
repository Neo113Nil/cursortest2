package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ji1 extends ts0 implements Serializable {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public int JFJ3QoxA;
    public int encWxUiV2;
    public int mOu10nynGul;
    public int rQPn8YBR;

    public ji1(int i, int i2) {
        int i3 = ~i;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
        this.encWxUiV2 = 0;
        this.mOu10nynGul = 0;
        this.JFJ3QoxA = i3;
        this.rQPn8YBR = (i << 10) ^ (i2 >>> 4);
        if ((i | i2 | i3) == 0) {
            o4.mE4lRynR("Initial state must have at least one non-zero element.");
            throw null;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            X1lG3V04pd();
        }
    }

    @Override // defpackage.ts0
    public final int GWasM1elztuh(int i) {
        return (X1lG3V04pd() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.ts0
    public final int X1lG3V04pd() {
        int i = this.EljAMC1QTz;
        int i2 = i ^ (i >>> 2);
        this.EljAMC1QTz = this.AvO7iQsrTN;
        this.AvO7iQsrTN = this.encWxUiV2;
        this.encWxUiV2 = this.mOu10nynGul;
        int i3 = this.JFJ3QoxA;
        this.mOu10nynGul = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.JFJ3QoxA = i4;
        int i5 = this.rQPn8YBR + 362437;
        this.rQPn8YBR = i5;
        return i4 + i5;
    }
}
