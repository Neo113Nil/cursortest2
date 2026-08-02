package defpackage;

/* loaded from: classes5.dex */
public final class njd extends pjd {
    public final dkd a;

    public njd(dkd dkdVar) {
        this.a = dkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njd) && this.a.equals(((njd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Foreground";
    }
}
