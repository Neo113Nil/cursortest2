package defpackage;

/* loaded from: classes4.dex */
public final class zoq implements cpq {
    public final zpq a;

    public zoq(zpq zpqVar) {
        this.a = zpqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoq) && this.a == ((zoq) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.a + ")";
    }
}
