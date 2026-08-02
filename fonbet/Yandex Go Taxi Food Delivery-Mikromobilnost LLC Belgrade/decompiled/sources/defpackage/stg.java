package defpackage;

/* loaded from: classes13.dex */
public final class stg {
    public final String a;
    public final String b;
    public final String c;
    public final t0a0 d;
    public final boolean e;
    public final cgb1 f;

    public stg(String str, String str2, String str3, t0a0 t0a0Var, cgb1 cgb1Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = t0a0Var;
        this.e = z;
        this.f = cgb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        stg stgVar = (stg) obj;
        return jl40.l(this.a, stgVar.a) && jl40.l(this.b, stgVar.b) && jl40.l(this.c, stgVar.c) && this.e == stgVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        String str2 = this.c;
        return unr0.e((b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }
}
