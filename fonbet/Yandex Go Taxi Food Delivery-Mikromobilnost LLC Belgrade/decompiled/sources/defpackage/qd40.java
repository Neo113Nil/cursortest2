package defpackage;

import defpackage.vb40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qd40 implements td40 {
    public final vb40.m a;

    static {
        uc40 uc40Var = vb40.m.Companion;
    }

    public qd40(vb40.m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd40) && jl40.l(this.a, ((qd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnTariffClick(tariffInfoDialog=" + this.a + Extension.C_BRAKE;
    }
}
