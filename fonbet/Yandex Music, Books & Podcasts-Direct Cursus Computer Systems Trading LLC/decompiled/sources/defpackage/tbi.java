package defpackage;

/* loaded from: classes.dex */
public final class tbi {
    public final a9p a = a9p.a;
    public final boolean b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tbi) {
            return this.a == ((tbi) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
