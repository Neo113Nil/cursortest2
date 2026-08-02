package defpackage;

/* loaded from: classes4.dex */
public final class e92 {
    public final int a;
    public final int b;
    public final yzi c;
    public final qx1 d;

    public e92(int i, int i2, yzi yziVar, qx1 qx1Var) {
        yziVar.getClass();
        qx1Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = yziVar;
        this.d = qx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e92)) {
            return false;
        }
        e92 e92Var = (e92) obj;
        return this.a == e92Var.a && this.b == e92Var.b && this.c == e92Var.c && this.d == e92Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("AutoQualityParams(measuredNetworkSpeedKbps=", h6r.a(this.a), ", estimatedNetworkSpeedKbps=", h6r.a(this.b), ", networkType=");
        m.append(this.c);
        m.append(", audioOutputType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
