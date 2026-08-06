package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tz implements z11 {
    public final /* synthetic */ int GWasM1elztuh;
    public static final tz Yi7zF1RB1 = new tz(0);
    public static final tz X1lG3V04pd = new tz(1);

    public /* synthetic */ tz(int i) {
        this.GWasM1elztuh = i;
    }

    @Override // defpackage.z11
    public final z50 GWasM1elztuh(long j, p50 p50Var, el elVar) {
        switch (this.GWasM1elztuh) {
            case 0:
                float rezfBrjOrqK = elVar.rezfBrjOrqK(30.0f);
                return new an0(new kt0(0.0f, -rezfBrjOrqK, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + rezfBrjOrqK));
            case 1:
                float rezfBrjOrqK2 = elVar.rezfBrjOrqK(30.0f);
                return new an0(new kt0(-rezfBrjOrqK2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + rezfBrjOrqK2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new an0(w60.EljAMC1QTz(0L, j));
        }
    }

    public String toString() {
        switch (this.GWasM1elztuh) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
