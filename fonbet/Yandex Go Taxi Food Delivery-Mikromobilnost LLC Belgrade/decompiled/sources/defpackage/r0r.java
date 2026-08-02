package defpackage;

/* loaded from: classes10.dex */
public final class r0r {
    public final r64 a;
    public final r64 b;

    public r0r(r64 r64Var) {
        this.a = r64Var;
        this.b = r64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0r)) {
            return false;
        }
        return this.b.equals(((r0r) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
