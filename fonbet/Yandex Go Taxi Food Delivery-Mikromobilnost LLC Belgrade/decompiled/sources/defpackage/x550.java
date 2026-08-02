package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class x550 implements t2v {
    public final wfp0 a;
    public final String b;

    public x550(wfp0 wfp0Var, String str) {
        this.a = wfp0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x550)) {
            return false;
        }
        x550 x550Var = (x550) obj;
        return this.a.equals(x550Var.a) && jl40.l(this.b, x550Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NavigateToFragment(fragmentScreen=" + this.a + ", tag=" + this.b + Extension.C_BRAKE;
    }
}
