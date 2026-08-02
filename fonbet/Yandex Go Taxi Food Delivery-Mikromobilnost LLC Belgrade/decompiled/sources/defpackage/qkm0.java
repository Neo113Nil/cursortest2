package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class qkm0 {
    public final ldc a;
    public final ldc b;
    public final ldc c;
    public final ma6 d;
    public final j690 e;
    public final ContentAlignment f;
    public final ContentAlignment g;

    public qkm0(ldc ldcVar, ldc ldcVar2, ldc ldcVar3, ma6 ma6Var, j690 j690Var, ContentAlignment contentAlignment, ContentAlignment contentAlignment2) {
        this.a = ldcVar;
        this.b = ldcVar2;
        this.c = ldcVar3;
        this.d = ma6Var;
        this.e = j690Var;
        this.f = contentAlignment;
        this.g = contentAlignment2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkm0)) {
            return false;
        }
        qkm0 qkm0Var = (qkm0) obj;
        return jl40.l(this.a, qkm0Var.a) && jl40.l(this.b, qkm0Var.b) && jl40.l(this.c, qkm0Var.c) && jl40.l(this.d, qkm0Var.d) && jl40.l(this.e, qkm0Var.e) && this.f == qkm0Var.f && this.g == qkm0Var.g;
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        int hashCode = (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31;
        ldc ldcVar2 = this.b;
        int hashCode2 = (hashCode + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31;
        ldc ldcVar3 = this.c;
        int hashCode3 = (hashCode2 + (ldcVar3 == null ? 0 : Long.hashCode(ldcVar3.a))) * 31;
        ma6 ma6Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (ma6Var != null ? ma6Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ScalableSelectorStyle(selectedColor=" + this.a + ", unselectedColor=" + this.b + ", disabledColor=" + this.c + ", border=" + this.d + ", contentPaddings=" + this.e + ", textHorizontalAlignment=" + this.f + ", badgeHorizontalAlignment=" + this.g + Extension.C_BRAKE;
    }
}
