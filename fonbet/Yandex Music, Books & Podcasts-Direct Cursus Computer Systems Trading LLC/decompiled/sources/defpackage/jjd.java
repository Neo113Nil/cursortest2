package defpackage;

/* loaded from: classes5.dex */
public final class jjd extends pjd {
    public final dkd a;

    public jjd(dkd dkdVar) {
        this.a = dkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjd) && this.a.equals(((jjd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Background";
    }
}
