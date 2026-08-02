package defpackage;

/* loaded from: classes.dex */
public final class tfi implements n2i {
    public final int a;

    public tfi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfi) && this.a == ((tfi) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
