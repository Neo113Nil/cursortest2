package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qok0 {
    public final pok0 a;
    public final boolean b;

    public qok0(pok0 pok0Var, boolean z) {
        this.a = pok0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qok0)) {
            return false;
        }
        qok0 qok0Var = (qok0) obj;
        return jl40.l(this.a, qok0Var.a) && this.b == qok0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RideCardTimelineOptionButtonUiState(titleInfo=" + this.a + ", isLoading=" + this.b + Extension.C_BRAKE;
    }
}
