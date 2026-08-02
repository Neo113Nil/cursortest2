package defpackage;

/* loaded from: classes14.dex */
public final class ujw {
    public final String a;
    public final String b;

    public ujw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujw)) {
            return false;
        }
        ujw ujwVar = (ujw) obj;
        return jl40.l(this.a, ujwVar.a) && jl40.l(this.b, ujwVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
