package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xw3 {
    public final ih6 a;

    public xw3(ih6 ih6Var) {
        this.a = ih6Var;
    }

    public final ih6 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw3) && jl40.l(this.a, ((xw3) obj).a);
    }

    public final int hashCode() {
        ih6 ih6Var = this.a;
        if (ih6Var == null) {
            return 0;
        }
        return ih6Var.hashCode();
    }

    public final String toString() {
        return "AutoTopupPaymentMethodsViewState(bottomSheetViewState=" + this.a + Extension.C_BRAKE;
    }
}
