package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w2v0 {
    public final String a;
    public final wp2 b;

    public w2v0(String str, wp2 wp2Var) {
        this.a = str;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2v0)) {
            return false;
        }
        w2v0 w2v0Var = (w2v0) obj;
        return jl40.l(this.a, w2v0Var.a) && jl40.l(this.b, w2v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleUiState(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
