package defpackage;

/* loaded from: classes5.dex */
public final class luo {
    public final long a;
    public final double b;

    public luo(long j, double d) {
        this.a = j;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == luo.class) {
            luo luoVar = (luo) obj;
            if (this.a == luoVar.a && this.b == luoVar.b) {
                return true;
            }
        }
        return false;
    }
}
