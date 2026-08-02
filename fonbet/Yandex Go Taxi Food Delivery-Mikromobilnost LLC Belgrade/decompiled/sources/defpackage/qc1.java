package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qc1 extends s151 {
    public final boolean a;
    public final uc1 b;
    public final String c;
    public final Object d;

    public qc1(boolean z, uc1 uc1Var, String str, Object obj) {
        this.a = z;
        this.b = uc1Var;
        this.c = str;
        this.d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc1)) {
            return false;
        }
        qc1 qc1Var = (qc1) obj;
        return this.a == qc1Var.a && jl40.l(this.b, qc1Var.b) && jl40.l(this.c, qc1Var.c) && jl40.l(this.d, qc1Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.d;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsBannerModel(showWhenSectionCollapsed=");
        sb.append(this.a);
        sb.append(", adsBannerSettings=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return tse0.l(sb, this.c, ", meta=", this.d, Extension.C_BRAKE);
    }
}
