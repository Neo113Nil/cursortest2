package defpackage;

/* loaded from: classes6.dex */
public final class zmx0 {
    public final String a;

    public zmx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmx0) && jl40.l(this.a, ((zmx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
