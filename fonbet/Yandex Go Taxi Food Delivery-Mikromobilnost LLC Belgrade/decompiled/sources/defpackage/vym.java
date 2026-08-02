package defpackage;

/* loaded from: classes12.dex */
public final class vym implements wym {
    public final String a;
    public final String b;

    public vym(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vym)) {
            return false;
        }
        vym vymVar = (vym) obj;
        return jl40.l(this.a, vymVar.a) && jl40.l(this.b, vymVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
