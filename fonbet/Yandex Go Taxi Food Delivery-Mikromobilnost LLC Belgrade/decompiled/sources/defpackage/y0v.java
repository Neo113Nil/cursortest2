package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class y0v extends c1v {
    public final h111 a;

    public y0v(h111 h111Var) {
        this.a = h111Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0v) && jl40.l(this.a, ((y0v) obj).a);
    }

    public final int hashCode() {
        h111 h111Var = this.a;
        if (h111Var == null) {
            return 0;
        }
        return h111Var.hashCode();
    }

    public final String toString() {
        return "Loading(uiState=" + this.a + Extension.C_BRAKE;
    }
}
