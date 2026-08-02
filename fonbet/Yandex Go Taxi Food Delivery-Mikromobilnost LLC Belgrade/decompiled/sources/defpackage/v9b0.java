package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v9b0 implements x9b0 {
    public final bdb0 a;
    public final cdb0 b;

    public v9b0(bdb0 bdb0Var, cdb0 cdb0Var) {
        this.a = bdb0Var;
        this.b = cdb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9b0)) {
            return false;
        }
        v9b0 v9b0Var = (v9b0) obj;
        return this.a.equals(v9b0Var.a) && this.b.equals(v9b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(note=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
