package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yus0 implements jvs0 {
    public final lvi0 a;
    public final String b;

    public yus0(lvi0 lvi0Var, String str) {
        this.a = lvi0Var;
        this.b = str;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yus0)) {
            return false;
        }
        yus0 yus0Var = (yus0) obj;
        return this.a.equals(yus0Var.a) && jl40.l(this.b, yus0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrailIcon(icon=" + this.a + ", onShownAnalyticsData=null, presentationId=" + this.b + Extension.C_BRAKE;
    }
}
