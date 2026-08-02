package defpackage;

/* loaded from: classes2.dex */
public final class yib {
    public final yf70 a;
    public final yf70 b;

    public yib(yf70 yf70Var, yf70 yf70Var2) {
        this.a = yf70Var;
        this.b = yf70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yib)) {
            return false;
        }
        yib yibVar = (yib) obj;
        return jl40.l(this.a, yibVar.a) && jl40.l(this.b, yibVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutAdditionalOffersInput(offers=" + this.a + ", passedUpsaleSteps=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yib() {
        this(r0, r0);
        vf70 vf70Var = vf70.a;
    }
}
