package defpackage;

/* loaded from: classes2.dex */
public final class w3v0 implements y3v0 {
    public final r3v0 a;

    public w3v0(r3v0 r3v0Var) {
        this.a = r3v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3v0) && this.a.equals(((w3v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NativeContent(content=" + this.a + ')';
    }
}
