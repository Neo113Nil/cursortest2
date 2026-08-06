package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gg0 {
    public float GWasM1elztuh = 0.0f;
    public float Yi7zF1RB1 = 0.0f;
    public float X1lG3V04pd = 0.0f;
    public float xqGvceK5x = 0.0f;

    public final void GWasM1elztuh(float f, float f2, float f3, float f4) {
        this.GWasM1elztuh = Math.max(f, this.GWasM1elztuh);
        this.Yi7zF1RB1 = Math.max(f2, this.Yi7zF1RB1);
        this.X1lG3V04pd = Math.min(f3, this.X1lG3V04pd);
        this.xqGvceK5x = Math.min(f4, this.xqGvceK5x);
    }

    public final void X1lG3V04pd(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.GWasM1elztuh += intBitsToFloat;
        this.Yi7zF1RB1 += intBitsToFloat2;
        this.X1lG3V04pd += intBitsToFloat;
        this.xqGvceK5x += intBitsToFloat2;
    }

    public final boolean Yi7zF1RB1() {
        return (this.GWasM1elztuh >= this.X1lG3V04pd) | (this.Yi7zF1RB1 >= this.xqGvceK5x);
    }

    public final String toString() {
        return "MutableRect(" + fb1.ZCWXqiC0(this.GWasM1elztuh) + ", " + fb1.ZCWXqiC0(this.Yi7zF1RB1) + ", " + fb1.ZCWXqiC0(this.X1lG3V04pd) + ", " + fb1.ZCWXqiC0(this.xqGvceK5x) + ')';
    }
}
