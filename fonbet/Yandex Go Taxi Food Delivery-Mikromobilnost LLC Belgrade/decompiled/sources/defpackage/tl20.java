package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tl20 extends xl20 {
    public final Object a;
    public final hr20 b;

    public tl20(Object obj, hr20 hr20Var) {
        this.a = obj;
        this.b = hr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl20)) {
            return false;
        }
        tl20 tl20Var = (tl20) obj;
        return jl40.l(this.a, tl20Var.a) && this.b.equals(tl20Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "MobApiResponse(dto=" + this.a + ", headers=" + this.b + Extension.C_BRAKE;
    }
}
