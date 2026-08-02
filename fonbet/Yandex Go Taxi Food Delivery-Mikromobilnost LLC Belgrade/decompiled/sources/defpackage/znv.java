package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class znv implements gov {
    public static final vnv Companion = new vnv();
    public final String a;
    public final ynv b;

    public /* synthetic */ znv(int i, String str, ynv ynvVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, unv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = ynvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znv)) {
            return false;
        }
        znv znvVar = (znv) obj;
        return jl40.l(this.a, znvVar.a) && jl40.l(this.b, znvVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ynv ynvVar = this.b;
        return hashCode + (ynvVar != null ? ynvVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "UserCardResponse(trackId=" + this.a + ", defaultCard=" + this.b + ')';
    }

    public znv(String str, ynv ynvVar) {
        this.a = str;
        this.b = ynvVar;
    }
}
