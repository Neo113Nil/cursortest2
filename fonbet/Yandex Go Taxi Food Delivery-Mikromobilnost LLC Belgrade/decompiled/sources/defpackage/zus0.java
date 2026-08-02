package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zus0 implements jvs0, r1c {
    public final lvi0 a;
    public final x9x0 b;
    public final String c;

    public zus0(lvi0 lvi0Var, x9x0 x9x0Var, String str) {
        this.a = lvi0Var;
        this.b = x9x0Var;
        this.c = str;
    }

    @Override // defpackage.r1c
    public final b151 b() {
        return this.b;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zus0)) {
            return false;
        }
        zus0 zus0Var = (zus0) obj;
        return this.a.equals(zus0Var.a) && this.b.equals(zus0Var.b) && jl40.l(this.c, zus0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailIconButton(icon=");
        sb.append(this.a);
        sb.append(", onShownAnalyticsData=null, widgetAction=");
        sb.append(this.b);
        sb.append(", presentationId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
