package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vct0 extends yct0 {
    public final List a;

    public vct0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vct0) && jl40.l(this.a, ((vct0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("BackendSourceReceived(deliveryOrders=", Extension.C_BRAKE, this.a);
    }
}
