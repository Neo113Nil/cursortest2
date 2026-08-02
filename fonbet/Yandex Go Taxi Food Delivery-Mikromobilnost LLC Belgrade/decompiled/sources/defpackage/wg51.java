package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wg51 extends sg51 {
    public final Throwable b;
    public final Map c;

    public wg51(Throwable th, Map map) {
        super(map);
        this.b = th;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg51)) {
            return false;
        }
        wg51 wg51Var = (wg51) obj;
        return jl40.l(this.b, wg51Var.b) && this.c.equals(wg51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(throwable=" + this.b + ", params=" + this.c + Extension.C_BRAKE;
    }
}
