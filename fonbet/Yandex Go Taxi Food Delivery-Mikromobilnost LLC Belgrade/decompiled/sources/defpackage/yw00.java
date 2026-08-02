package defpackage;

/* loaded from: classes11.dex */
public final class yw00 extends tkn {
    public final float a;

    public yw00(float f) {
        this.a = f - 0.001f;
    }

    @Override // defpackage.tkn
    public final void b(float f, float f2, float f3, bir0 bir0Var) {
        double d = this.a;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(sqrt, 2.0d));
        bir0Var.e(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, 0.0f);
        bir0Var.d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        bir0Var.d(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
