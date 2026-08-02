package defpackage;

/* loaded from: classes3.dex */
public final class c7n {
    public final String a;
    public final b7n b;

    public c7n(String str, b7n b7nVar) {
        this.a = str;
        this.b = b7nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7n)) {
            return false;
        }
        c7n c7nVar = (c7n) obj;
        return this.a.equals(c7nVar.a) && this.b == c7nVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Parsed(tableName=" + this.a + ", kind=" + this.b + ")";
    }
}
