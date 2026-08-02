package defpackage;

/* loaded from: classes3.dex */
public final class zrj {
    public final String a;

    public zrj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrj) && this.a.equals(((zrj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Misspell(suggest=", this.a, ")");
    }
}
