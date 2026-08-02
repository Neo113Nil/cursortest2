package defpackage;

/* loaded from: classes10.dex */
public final class sb30 implements s820 {
    public final int a;

    public sb30(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb30) && this.a == ((sb30) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
