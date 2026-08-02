package defpackage;

/* loaded from: classes2.dex */
public final class smd {
    public final String a;
    public final hha0 b;

    public smd(String str, hha0 hha0Var) {
        this.a = str;
        this.b = hha0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smd)) {
            return false;
        }
        smd smdVar = (smd) obj;
        return this.a.equals(smdVar.a) && this.b.equals(smdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoBadge(__typename=" + this.a + ", paymentPromoBadge=" + this.b + ')';
    }
}
