package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class jte {
    public final String a;
    public final ite b;
    public final long c;
    public final pue d;

    public jte(String str, ite iteVar, long j, owe oweVar) {
        this.a = str;
        this.b = iteVar;
        this.c = j;
        this.d = oweVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jte)) {
            return false;
        }
        jte jteVar = (jte) obj;
        return hdg.S(this.a, jteVar.a) && hdg.S(this.b, jteVar.b) && this.c == jteVar.c && hdg.S(null, null) && hdg.S(this.d, jteVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.d});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, DeviceService.KEY_DESC);
        Y.q(this.b, "severity");
        Y.n(this.c, "timestampNanos");
        Y.q(null, "channelRef");
        Y.q(this.d, "subchannelRef");
        return Y.toString();
    }
}
