package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xus0 implements jvs0 {
    public final w0f a;
    public final String b;

    public xus0(w0f w0fVar, String str) {
        this.a = w0fVar;
        this.b = str;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 8.0f;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xus0)) {
            return false;
        }
        xus0 xus0Var = (xus0) obj;
        return this.a.equals(xus0Var.a) && jl40.l(this.b, xus0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrailCounter(state=" + this.a + ", presentationId=" + this.b + Extension.C_BRAKE;
    }
}
