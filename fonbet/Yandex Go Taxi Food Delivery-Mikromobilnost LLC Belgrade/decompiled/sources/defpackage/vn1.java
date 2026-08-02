package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vn1 {
    public final lvi0 a;
    public final fz b;

    public vn1(lvi0 lvi0Var, fz fzVar) {
        this.a = lvi0Var;
        this.b = fzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn1)) {
            return false;
        }
        vn1 vn1Var = (vn1) obj;
        return this.a.equals(vn1Var.a) && this.b.equals(vn1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AiChatWidgetState(icon=" + this.a + ", actionWithAnalyticsData=" + this.b + Extension.C_BRAKE;
    }
}
