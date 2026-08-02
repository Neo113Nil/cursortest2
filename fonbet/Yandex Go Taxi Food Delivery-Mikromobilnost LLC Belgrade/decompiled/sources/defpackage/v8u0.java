package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v8u0 {
    public final String a;
    public final String b;

    public v8u0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8u0)) {
            return false;
        }
        v8u0 v8u0Var = (v8u0) obj;
        return jl40.l(this.a, v8u0Var.a) && jl40.l(this.b, v8u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("StatusPageDataEntity(title=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }
}
