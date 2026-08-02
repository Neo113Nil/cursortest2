package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class vt80 implements pw80 {
    public static final ut80 Companion = new ut80();
    public final String a;
    public final String b;
    public final String c;
    public final exe0 d;

    public /* synthetic */ vt80(int i, String str, String str2, String str3, exe0 exe0Var) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, tt80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = exe0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt80)) {
            return false;
        }
        vt80 vt80Var = (vt80) obj;
        return jl40.l(this.a, vt80Var.a) && jl40.l(this.b, vt80Var.b) && jl40.l(this.c, vt80Var.c) && jl40.l(this.d, vt80Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        exe0 exe0Var = this.d;
        return hashCode + (exe0Var != null ? exe0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OpenSmart(trackId=" + this.a + ", url=" + this.b + ", broadcastId=" + this.c + ", options=" + this.d + ')';
    }
}
