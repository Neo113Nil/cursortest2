package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xec0 implements yec0 {
    public final CharSequence a;
    public final fr b;
    public final String c;
    public final String d;
    public final wec0 e;
    public final uec0 f;
    public final boolean g;

    public xec0(CharSequence charSequence, fr frVar, String str, String str2, wec0 wec0Var, uec0 uec0Var, boolean z) {
        this.a = charSequence;
        this.b = frVar;
        this.c = str;
        this.d = str2;
        this.e = wec0Var;
        this.f = uec0Var;
        this.g = z;
    }

    @Override // defpackage.yec0
    public final boolean a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xec0)) {
            return false;
        }
        xec0 xec0Var = (xec0) obj;
        return jl40.l(this.a, xec0Var.a) && jl40.l(this.b, xec0Var.b) && jl40.l(this.c, xec0Var.c) && jl40.l(this.d, xec0Var.d) && jl40.l(this.e, xec0Var.e) && jl40.l(this.f, xec0Var.f) && this.g == xec0Var.g;
    }

    @Override // defpackage.yec0
    public final uec0 getState() {
        return this.f;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        fr frVar = this.b;
        int hashCode2 = (hashCode + (frVar == null ? 0 : frVar.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wec0 wec0Var = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((hashCode4 + (wec0Var != null ? wec0Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Visible(title=");
        sb.append((Object) this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", leadImageTag=");
        g8e.D(sb, this.c, ", leadImageUrl=", this.d, ", collapsedButton=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", isHapticEnabled=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
