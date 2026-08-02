package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rdx0 implements bex0 {
    public final ob5 a;

    public rdx0(ob5 ob5Var) {
        this.a = ob5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdx0) && jl40.l(this.a, ((rdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseTariffInfoChanged(baseTariffInfoUiState=" + this.a + Extension.C_BRAKE;
    }
}
