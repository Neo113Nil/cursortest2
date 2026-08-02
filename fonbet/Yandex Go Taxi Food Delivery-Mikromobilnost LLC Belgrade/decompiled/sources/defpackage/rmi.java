package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rmi implements zlj0 {
    public final e95 a;

    public rmi(e95 e95Var) {
        this.a = e95Var;
    }

    @Override // defpackage.zlj0
    public final e95 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmi) && this.a.equals(((rmi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeliveryRequirementUiState(itemState=" + this.a + Extension.C_BRAKE;
    }
}
