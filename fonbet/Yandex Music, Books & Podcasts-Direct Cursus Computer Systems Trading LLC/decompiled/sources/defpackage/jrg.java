package defpackage;

/* loaded from: classes5.dex */
public final class jrg extends org {
    public final zhp a;

    public jrg(zhp zhpVar) {
        this.a = zhpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrg) && this.a.equals(((jrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.json badly formatted with " + vut.U(this.a);
    }
}
