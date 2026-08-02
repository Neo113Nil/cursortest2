package defpackage;

/* loaded from: classes3.dex */
public final class zfr implements z3h {
    public final mn0 a;

    public zfr(mn0 mn0Var) {
        this.a = mn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfr) && this.a.equals(((zfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StaticLyricsUiData(lyricsText=" + ((Object) this.a) + ")";
    }
}
