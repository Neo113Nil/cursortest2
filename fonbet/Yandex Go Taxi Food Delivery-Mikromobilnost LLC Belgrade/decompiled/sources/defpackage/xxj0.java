package defpackage;

/* loaded from: classes15.dex */
public final class xxj0 {
    public final String a;

    public xxj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxj0) && this.a.equals(((xxj0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.p("RestrictionsEntity(userId=", this.a, ", blacklisted=true)");
    }
}
