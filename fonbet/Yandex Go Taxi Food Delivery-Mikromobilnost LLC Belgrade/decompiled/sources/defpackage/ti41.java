package defpackage;

/* loaded from: classes2.dex */
public final class ti41 implements vi41 {
    public final String a;

    public ti41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti41) && jl40.l(this.a, ((ti41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Unknown(rawMessage="), this.a, ')');
    }
}
