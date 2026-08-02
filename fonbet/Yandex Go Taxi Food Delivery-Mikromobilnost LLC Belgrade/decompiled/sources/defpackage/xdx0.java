package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xdx0 implements bex0 {
    public final xlj0 a;

    public xdx0(xlj0 xlj0Var) {
        this.a = xlj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdx0) && jl40.l(this.a, ((xdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequirementAction(requirementUiAction=" + this.a + Extension.C_BRAKE;
    }
}
