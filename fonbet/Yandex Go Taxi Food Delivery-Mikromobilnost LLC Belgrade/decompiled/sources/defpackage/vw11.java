package defpackage;

/* loaded from: classes12.dex */
public final class vw11 implements xw11 {
    public final String a;

    public vw11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw11) && jl40.l(this.a, ((vw11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
