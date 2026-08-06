package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cs {
    public final float GWasM1elztuh;
    public final float Yi7zF1RB1;

    public cs(float f, el elVar) {
        this.GWasM1elztuh = f;
        float Yi7zF1RB1 = elVar.Yi7zF1RB1();
        float f2 = ds.GWasM1elztuh;
        this.Yi7zF1RB1 = Yi7zF1RB1 * 386.0878f * 160.0f * 0.84f;
    }

    public final bs GWasM1elztuh(float f) {
        double Yi7zF1RB1 = Yi7zF1RB1(f);
        double d = ds.GWasM1elztuh;
        double d2 = d - 1.0d;
        return new bs(f, (float) (Math.exp((d / d2) * Yi7zF1RB1) * this.GWasM1elztuh * this.Yi7zF1RB1), (long) (Math.exp(Yi7zF1RB1 / d2) * 1000.0d));
    }

    public final double Yi7zF1RB1(float f) {
        float[] fArr = r0.GWasM1elztuh;
        return Math.log((Math.abs(f) * 0.35f) / (this.GWasM1elztuh * this.Yi7zF1RB1));
    }
}
