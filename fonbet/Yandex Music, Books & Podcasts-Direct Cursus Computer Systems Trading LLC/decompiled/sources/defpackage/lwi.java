package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class lwi {
    public final sgr a;
    public final Object b;

    public lwi(sgr sgrVar) {
        this.b = null;
        o2g.O(sgrVar, "status");
        this.a = sgrVar;
        o2g.H(sgrVar, "cannot use OK status: %s", !sgrVar.g());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lwi.class == obj.getClass()) {
            lwi lwiVar = (lwi) obj;
            if (hdg.S(this.a, lwiVar.a) && hdg.S(this.b, lwiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            z0j Y = ezf.Y(this);
            Y.q(obj, DeviceService.KEY_CONFIG);
            return Y.toString();
        }
        z0j Y2 = ezf.Y(this);
        Y2.q(this.a, "error");
        return Y2.toString();
    }

    public lwi(Object obj) {
        this.b = obj;
        this.a = null;
    }
}
