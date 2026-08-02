package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class w3l0 {
    public final Zone a;
    public final List b;

    public w3l0(Zone zone, List list) {
        this.a = zone;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w3l0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w3l0 w3l0Var = (w3l0) obj;
        if (jl40.l(this.a, w3l0Var.a)) {
            return gtq0.G(this.b, w3l0Var.b);
        }
        return false;
    }

    public final String toString() {
        return "RouteInfo(zone=" + this.a + ", route=" + a.X(this.b, " -> ", null, null, new qda0(29), 30) + Extension.C_BRAKE;
    }
}
