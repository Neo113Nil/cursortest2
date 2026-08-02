package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vh0 {
    public final String a;
    public final wh0 b;

    public vh0(String str, wh0 wh0Var) {
        this.a = str;
        this.b = wh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh0)) {
            return false;
        }
        vh0 vh0Var = (vh0) obj;
        return jl40.l(this.a, vh0Var.a) && jl40.l(this.b, vh0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        wh0 wh0Var = this.b;
        return hashCode + (wh0Var != null ? wh0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarUiState(title=" + this.a + ", trailButton=" + this.b + Extension.C_BRAKE;
    }
}
