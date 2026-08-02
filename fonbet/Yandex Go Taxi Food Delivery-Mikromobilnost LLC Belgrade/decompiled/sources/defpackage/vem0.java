package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vem0 {
    public final u8j0 a;

    public vem0(u8j0 u8j0Var) {
        this.a = u8j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vem0) && this.a.equals(((vem0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SbpBanksState(sbpBanksStateStatus=" + this.a + Extension.C_BRAKE;
    }
}
