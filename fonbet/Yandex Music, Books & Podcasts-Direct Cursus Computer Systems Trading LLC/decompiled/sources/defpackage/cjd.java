package defpackage;

/* loaded from: classes5.dex */
public final class cjd extends ijd {
    public final dkd a;

    public cjd(dkd dkdVar) {
        this.a = dkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjd) && this.a.equals(((cjd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Background";
    }
}
