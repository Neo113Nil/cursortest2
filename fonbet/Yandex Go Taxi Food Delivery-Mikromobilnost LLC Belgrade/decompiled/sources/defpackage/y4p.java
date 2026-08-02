package defpackage;

/* loaded from: classes6.dex */
public final class y4p {
    public final String a;
    public final String b;

    public y4p(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4p)) {
            return false;
        }
        y4p y4pVar = (y4p) obj;
        return jl40.l(this.a, y4pVar.a) && jl40.l(this.b, y4pVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public y4p() {
        this(0);
    }

    public /* synthetic */ y4p(int i) {
        this("", null);
    }
}
