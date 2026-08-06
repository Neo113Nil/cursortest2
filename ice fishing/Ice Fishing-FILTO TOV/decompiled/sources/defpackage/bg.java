package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class bg {
    public final gc GWasM1elztuh;
    public final gc X1lG3V04pd;
    public final gc Yi7zF1RB1;
    public final float[] xqGvceK5x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bg(gc gcVar, gc gcVar2, int i) {
        this(gcVar2, r0, r1, r4);
        float[] fArr;
        gc AvO7iQsrTN = p.E7jCp8Ls(gcVar.Yi7zF1RB1, 12884901888L) ? qj.AvO7iQsrTN(gcVar) : gcVar;
        gc AvO7iQsrTN2 = p.E7jCp8Ls(gcVar2.Yi7zF1RB1, 12884901888L) ? qj.AvO7iQsrTN(gcVar2) : gcVar2;
        float[] fArr2 = ki1.encWxUiV2;
        if (i == 3) {
            boolean E7jCp8Ls = p.E7jCp8Ls(gcVar.Yi7zF1RB1, 12884901888L);
            boolean E7jCp8Ls2 = p.E7jCp8Ls(gcVar2.Yi7zF1RB1, 12884901888L);
            if ((!E7jCp8Ls || !E7jCp8Ls2) && (E7jCp8Ls || E7jCp8Ls2)) {
                nf1 nf1Var = ((gv0) (E7jCp8Ls ? gcVar : gcVar2)).xqGvceK5x;
                float[] GWasM1elztuh = E7jCp8Ls ? nf1Var.GWasM1elztuh() : fArr2;
                fArr2 = E7jCp8Ls2 ? nf1Var.GWasM1elztuh() : fArr2;
                fArr = new float[]{GWasM1elztuh[0] / fArr2[0], GWasM1elztuh[1] / fArr2[1], GWasM1elztuh[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long GWasM1elztuh(long j) {
        float encWxUiV2 = yb.encWxUiV2(j);
        float AvO7iQsrTN = yb.AvO7iQsrTN(j);
        float OOA6hdeuvCS = yb.OOA6hdeuvCS(j);
        float xqGvceK5x = yb.xqGvceK5x(j);
        gc gcVar = this.Yi7zF1RB1;
        long xqGvceK5x2 = gcVar.xqGvceK5x(encWxUiV2, AvO7iQsrTN, OOA6hdeuvCS);
        float intBitsToFloat = Float.intBitsToFloat((int) (xqGvceK5x2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xqGvceK5x2 & 4294967295L));
        float OOA6hdeuvCS2 = gcVar.OOA6hdeuvCS(encWxUiV2, AvO7iQsrTN, OOA6hdeuvCS);
        float[] fArr = this.xqGvceK5x;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            OOA6hdeuvCS2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.X1lG3V04pd.EljAMC1QTz(f, f2, OOA6hdeuvCS2, xqGvceK5x, this.GWasM1elztuh);
    }

    public bg(gc gcVar, gc gcVar2, gc gcVar3, float[] fArr) {
        this.GWasM1elztuh = gcVar;
        this.Yi7zF1RB1 = gcVar2;
        this.X1lG3V04pd = gcVar3;
        this.xqGvceK5x = fArr;
    }
}
