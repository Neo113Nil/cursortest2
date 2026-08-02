package defpackage;

/* loaded from: classes10.dex */
public final class tl21 {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final int b;
    public final boolean c;

    static {
        new tl21("", 0);
    }

    public tl21(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = evu0.J(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tl21.class.equals(obj.getClass())) {
            return false;
        }
        tl21 tl21Var = (tl21) obj;
        return this.b == tl21Var.b && this.c == tl21Var.c && jl40.l(this.a, tl21Var.a);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31;
    }
}
