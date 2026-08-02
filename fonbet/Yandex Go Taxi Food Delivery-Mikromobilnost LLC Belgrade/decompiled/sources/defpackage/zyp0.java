package defpackage;

import flex.engine.section.model.ReusePolicy;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class zyp0 {
    public final pyp0 a;
    public final ReusePolicy b;

    public zyp0(pyp0 pyp0Var, ReusePolicy reusePolicy) {
        this.a = pyp0Var;
        this.b = reusePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zyp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        zyp0 zyp0Var = (zyp0) obj;
        return jl40.l(this.a, zyp0Var.a) && this.b == zyp0Var.b;
    }

    public final int hashCode() {
        pyp0 pyp0Var = this.a;
        return this.b.hashCode() + ((pyp0Var != null ? pyp0Var.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "LoadingSettings(loadingSection=" + this.a + ", sectionReusePolicy=" + this.b + Extension.C_BRAKE;
    }

    public zyp0() {
        this(null, ReusePolicy.FALLBACK_TO_NATIVE);
    }
}
