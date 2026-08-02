package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q8q0 implements pre {
    public final String a;
    public final v7q0 b;

    public q8q0(v7q0 v7q0Var, String str) {
        this.a = str;
        this.b = v7q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8q0)) {
            return false;
        }
        q8q0 q8q0Var = (q8q0) obj;
        return jl40.l(this.a, q8q0Var.a) && jl40.l(this.b, q8q0Var.b);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "segment";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v7q0 v7q0Var = this.b;
        return hashCode + (v7q0Var == null ? 0 : v7q0Var.hashCode());
    }

    public final String toString() {
        return "SegmentRemoteCoreWidget(id=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
