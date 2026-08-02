package defpackage;

/* loaded from: classes6.dex */
public final class gya {
    public double a;
    public double b;
    public double c;

    public gya(double d) {
        this.a = Double.NaN;
        this.a = Math.exp(Math.log(0.5d) / d);
    }

    public final void a(double d) {
        double pow = Math.pow(this.a, 0.1d);
        double d2 = (pow * this.b) + ((1 - pow) * d);
        if (Double.isNaN(d2)) {
            return;
        }
        this.b = d2;
        this.c += 0.1d;
    }
}
