package defpackage;

/* loaded from: classes5.dex */
public final class u7a {
    public final String a;

    public u7a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7a) && this.a.equals(((u7a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("DonationGoal(title=", this.a, ")");
    }
}
