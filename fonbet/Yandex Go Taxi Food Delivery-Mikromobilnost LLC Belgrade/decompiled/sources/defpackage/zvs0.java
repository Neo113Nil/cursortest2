package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zvs0 implements fws0 {
    public final v7q0 a;
    public final String b;

    public zvs0(v7q0 v7q0Var, String str) {
        this.a = v7q0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvs0)) {
            return false;
        }
        zvs0 zvs0Var = (zvs0) obj;
        return this.a.equals(zvs0Var.a) && jl40.l(this.b, zvs0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrailSegmentControl(action=" + this.a + ", presentationId=" + this.b + Extension.C_BRAKE;
    }
}
