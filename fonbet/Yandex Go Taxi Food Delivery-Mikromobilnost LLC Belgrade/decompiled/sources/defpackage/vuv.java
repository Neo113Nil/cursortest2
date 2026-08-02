package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vuv {
    public final boolean a;
    public final j6 b;
    public final String c;
    public final jxq0 d;
    public final List e;
    public final utv f;
    public final boolean g;

    public vuv(boolean z, j6 j6Var, String str, jxq0 jxq0Var, List list, utv utvVar, boolean z2) {
        this.a = z;
        this.b = j6Var;
        this.c = str;
        this.d = jxq0Var;
        this.e = list;
        this.f = utvVar;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuv)) {
            return false;
        }
        vuv vuvVar = (vuv) obj;
        return this.a == vuvVar.a && jl40.l(this.b, vuvVar.b) && jl40.l(this.c, vuvVar.c) && jl40.l(this.d, vuvVar.d) && jl40.l(this.e, vuvVar.e) && jl40.l(this.f, vuvVar.f) && this.g == vuvVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        jxq0 jxq0Var = this.d;
        int c = unr0.c((hashCode2 + (jxq0Var == null ? 0 : jxq0Var.hashCode())) * 31, 31, this.e);
        utv utvVar = this.f;
        return Boolean.hashCode(this.g) + ((c + (utvVar != null ? utvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InformationUiState(isPending=");
        sb.append(this.a);
        sb.append(", about=");
        sb.append(this.b);
        sb.append(", regionText=");
        sb.append(this.c);
        sb.append(", applicationService=");
        sb.append(this.d);
        sb.append(", services=");
        sb.append(this.e);
        sb.append(", event=");
        sb.append(this.f);
        sb.append(", reversedTransition=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
