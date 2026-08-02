package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qws0 {
    public final List a;
    public final boolean b;

    public qws0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qws0)) {
            return false;
        }
        qws0 qws0Var = (qws0) obj;
        return this.a.equals(qws0Var.a) && this.b == qws0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "SlotsState(slots=", ", isLoading=", Extension.C_BRAKE, this.b);
    }
}
