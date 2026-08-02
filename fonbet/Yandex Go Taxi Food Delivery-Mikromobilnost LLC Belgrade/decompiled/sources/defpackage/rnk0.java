package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rnk0 {
    public final css0 a;
    public final String b;

    public rnk0(css0 css0Var, String str) {
        this.a = css0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnk0)) {
            return false;
        }
        rnk0 rnk0Var = (rnk0) obj;
        return jl40.l(this.a, rnk0Var.a) && jl40.l(this.b, rnk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BodyDescriptionState(bodyUiState=" + this.a + ", contentDescription=" + this.b + Extension.C_BRAKE;
    }
}
