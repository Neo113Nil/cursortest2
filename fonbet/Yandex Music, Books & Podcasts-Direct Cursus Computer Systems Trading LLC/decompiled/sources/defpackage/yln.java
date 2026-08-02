package defpackage;

/* loaded from: classes4.dex */
public final class yln extends bmn {
    public final vln a;

    public yln(vln vlnVar) {
        this.a = vlnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yln) && this.a == ((yln) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(code=" + this.a + ")";
    }
}
