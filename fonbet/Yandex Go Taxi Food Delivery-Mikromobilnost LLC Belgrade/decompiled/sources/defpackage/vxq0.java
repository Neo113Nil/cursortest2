package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vxq0 {
    public final txq0 a;

    public vxq0(txq0 txq0Var) {
        this.a = txq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxq0)) {
            return false;
        }
        vxq0 vxq0Var = (vxq0) obj;
        EmptyList emptyList = EmptyList.a;
        if (!emptyList.equals(emptyList) || !this.a.equals(vxq0Var.a)) {
            return false;
        }
        r2l0 r2l0Var = r2l0.a;
        return r2l0Var.equals(r2l0Var);
    }

    public final int hashCode() {
        return 962;
    }

    public final String toString() {
        return "ServicesSection(serviceIcons=" + EmptyList.a + ", allButton=" + this.a + ", servicesData=" + r2l0.a + Extension.C_BRAKE;
    }
}
