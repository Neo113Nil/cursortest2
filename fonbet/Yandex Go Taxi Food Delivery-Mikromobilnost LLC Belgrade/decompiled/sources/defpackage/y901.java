package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y901 {
    public final hhg a;
    public final String b;
    public final Object c;

    public y901(hhg hhgVar, String str, Object obj) {
        this.a = hhgVar;
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y901)) {
            return false;
        }
        y901 y901Var = (y901) obj;
        return this.a.equals(y901Var.a) && jl40.l(this.b, y901Var.b) && jl40.l(this.c, y901Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailButtonModel(action=");
        sb.append(this.a);
        sb.append(", accessibilityLabel=null, metricaLabel=");
        sb.append(this.b);
        sb.append(", meta=");
        return x4e.h(sb, this.c, Extension.C_BRAKE);
    }
}
