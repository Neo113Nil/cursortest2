package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class v2h implements ex1 {
    public final pex0 a;

    public v2h(pex0 pex0Var) {
        this.a = pex0Var;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2h) && this.a.equals(((v2h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeeplinkOption(tariff=" + this.a + Extension.C_BRAKE;
    }
}
