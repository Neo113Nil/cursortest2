package defpackage;

import coil3.graphics.EnumC0136DataSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class t3v0 implements mev {
    public final q7v a;
    public final gev b;
    public final EnumC0136DataSource c;
    public final ii10 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public t3v0(q7v q7vVar, gev gevVar, EnumC0136DataSource enumC0136DataSource, ii10 ii10Var, String str, boolean z, boolean z2) {
        this.a = q7vVar;
        this.b = gevVar;
        this.c = enumC0136DataSource;
        this.d = ii10Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3v0)) {
            return false;
        }
        t3v0 t3v0Var = (t3v0) obj;
        return jl40.l(this.a, t3v0Var.a) && jl40.l(this.b, t3v0Var.b) && this.c == t3v0Var.c && jl40.l(this.d, t3v0Var.d) && jl40.l(this.e, t3v0Var.e) && this.f == t3v0Var.f && this.g == t3v0Var.g;
    }

    @Override // defpackage.mev
    public final q7v f() {
        return this.a;
    }

    @Override // defpackage.mev
    public final gev getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ii10 ii10Var = this.d;
        int hashCode2 = (hashCode + (ii10Var == null ? 0 : ii10Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + unr0.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        tse0.y(this.e, ", isSampled=", ", isPlaceholderCached=", sb, this.f);
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
