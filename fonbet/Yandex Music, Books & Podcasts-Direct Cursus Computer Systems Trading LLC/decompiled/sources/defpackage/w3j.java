package defpackage;

/* loaded from: classes3.dex */
public final class w3j implements x3j {
    public final rrl a;

    public w3j(rrl rrlVar) {
        this.a = rrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3j) && this.a.equals(((w3j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(playlist=" + this.a + ")";
    }
}
