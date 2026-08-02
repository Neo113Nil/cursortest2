package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wh0 {
    public final String a;
    public final jh0 b;

    public wh0(String str, jh0 jh0Var) {
        this.a = str;
        this.b = jh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return jl40.l(this.a, wh0Var.a) && this.b.equals(wh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrailButtonUiState(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
