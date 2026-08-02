package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wdx0 implements bex0 {
    public final qn40 a;

    public wdx0(qn40 qn40Var) {
        this.a = qn40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdx0) && jl40.l(this.a, ((wdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiTariffOptionAction(multiTariffOptionUiAction=" + this.a + Extension.C_BRAKE;
    }
}
