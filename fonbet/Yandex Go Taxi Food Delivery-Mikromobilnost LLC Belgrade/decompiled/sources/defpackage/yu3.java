package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yu3 implements zu3 {
    public final pdq0 a;

    public yu3(pdq0 pdq0Var) {
        this.a = pdq0Var;
    }

    public final pdq0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu3) && this.a.equals(((yu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPaymentOption(selectPaymentMethodViewState=" + this.a + Extension.C_BRAKE;
    }
}
