package defpackage;

/* loaded from: classes14.dex */
public final class qgw extends tgw {
    public final String a;

    public qgw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgw) && jl40.l(this.a, ((qgw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
