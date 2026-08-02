package defpackage;

/* loaded from: classes7.dex */
public final class uan {
    public double a;
    public double b;
    public double c;

    public uan(double d) {
        this.a = Double.NaN;
        this.a = Math.exp(Math.log(0.5d) / d);
    }

    public final void a(double d, double d2) {
        double pow = Math.pow(this.a, d);
        double d3 = (pow * this.b) + ((1.0d - pow) * d2);
        if (Double.isNaN(d3)) {
            return;
        }
        this.b = d3;
        this.c += d;
    }
}
