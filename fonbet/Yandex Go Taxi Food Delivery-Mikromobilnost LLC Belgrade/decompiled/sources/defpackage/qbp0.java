package defpackage;

/* loaded from: classes8.dex */
public final class qbp0 {
    public final long a;
    public final double b;

    public qbp0(long j, double d) {
        this.a = j;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == qbp0.class) {
            qbp0 qbp0Var = (qbp0) obj;
            if (this.a == qbp0Var.a && this.b == qbp0Var.b) {
                return true;
            }
        }
        return false;
    }
}
