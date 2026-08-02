package defpackage;

/* loaded from: classes5.dex */
public final class gjd extends ijd {
    public final dkd a;

    public gjd(dkd dkdVar) {
        this.a = dkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjd) && this.a.equals(((gjd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Foreground";
    }
}
