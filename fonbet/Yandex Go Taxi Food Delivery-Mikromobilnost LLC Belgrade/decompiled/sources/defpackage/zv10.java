package defpackage;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class zv10 {
    public final HistoryRequest a;
    public final long b;

    public zv10(HistoryRequest historyRequest, long j, int i) {
        historyRequest = (i & 1) != 0 ? null : historyRequest;
        j = (i & 2) != 0 ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : j;
        this.a = historyRequest;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv10)) {
            return false;
        }
        zv10 zv10Var = (zv10) obj;
        return jl40.l(this.a, zv10Var.a) && this.b == zv10Var.b;
    }

    public final int hashCode() {
        HistoryRequest historyRequest = this.a;
        return Long.hashCode(this.b) + ((historyRequest == null ? 0 : historyRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "Schedule(request=" + this.a + ", nextRequestIn=" + this.b + Extension.C_BRAKE;
    }

    public zv10() {
        this(null, 0L, 3);
    }
}
