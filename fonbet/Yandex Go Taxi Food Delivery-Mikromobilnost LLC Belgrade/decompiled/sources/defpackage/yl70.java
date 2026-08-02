package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yl70 {
    public final m301 a;
    public final m301 b;

    public /* synthetic */ yl70(m301 m301Var, int i) {
        this((m301) null, (i & 2) != 0 ? null : m301Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl70)) {
            return false;
        }
        yl70 yl70Var = (yl70) obj;
        return jl40.l(this.a, yl70Var.a) && jl40.l(this.b, yl70Var.b);
    }

    public final int hashCode() {
        m301 m301Var = this.a;
        int hashCode = (m301Var == null ? 0 : m301Var.hashCode()) * 31;
        m301 m301Var2 = this.b;
        return hashCode + (m301Var2 != null ? m301Var2.hashCode() : 0);
    }

    public final String toString() {
        return "OrderCardActionButtonsUiState(primaryButton=" + this.a + ", secondaryButton=" + this.b + Extension.C_BRAKE;
    }

    public yl70() {
        this((m301) null, 3);
    }

    public yl70(m301 m301Var, m301 m301Var2) {
        this.a = m301Var;
        this.b = m301Var2;
    }
}
