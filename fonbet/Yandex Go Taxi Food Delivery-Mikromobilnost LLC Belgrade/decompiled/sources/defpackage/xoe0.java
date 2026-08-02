package defpackage;

import com.yandex.go.zone.model.Zone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class xoe0 implements zoe0 {
    public final Zone a;
    public final pzt0 b;

    public xoe0(Zone zone, pzt0 pzt0Var) {
        this.a = zone;
        this.b = pzt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe0)) {
            return false;
        }
        xoe0 xoe0Var = (xoe0) obj;
        return jl40.l(this.a, xoe0Var.a) && this.b.equals(xoe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreloadRunning(zone=" + this.a + ", job=" + this.b + Extension.C_BRAKE;
    }
}
