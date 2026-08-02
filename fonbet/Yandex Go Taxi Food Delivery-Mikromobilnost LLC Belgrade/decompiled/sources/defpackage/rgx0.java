package defpackage;

/* loaded from: classes2.dex */
public final class rgx0 {
    public final String a;

    public rgx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgx0) && this.a.equals(((rgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Tariff(name="), this.a, ')');
    }
}
