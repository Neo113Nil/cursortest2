package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class akp {
    public final deg a;
    public final Object b;

    public akp(deg degVar, Object obj) {
        this.a = degVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && akp.class == obj.getClass()) {
            akp akpVar = (akp) obj;
            if (hdg.S(this.a, akpVar.a) && hdg.S(this.b, akpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "provider");
        Y.q(this.b, DeviceService.KEY_CONFIG);
        return Y.toString();
    }
}
