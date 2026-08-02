package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxsa0;", "Lw96;", "Companion", "wsa0", "vsa0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class xsa0 extends w96 {
    public static final wsa0 Companion = new wsa0();
    public static final xsa0 e = new xsa0(0);
    public final boolean b;
    public final long c;
    public final boolean d;

    public /* synthetic */ xsa0(int i, boolean z, long j, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 10000L;
        } else {
            this.c = j;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsa0)) {
            return false;
        }
        xsa0 xsa0Var = (xsa0) obj;
        return this.b == xsa0Var.b && this.c == xsa0Var.c && this.d == xsa0Var.d;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv10.c(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingOrdersEndpointExperiment(enabled=");
        sb.append(this.b);
        sb.append(", pollingRequestDelayMs=");
        sb.append(this.c);
        return xra1.a(sb, ", awaitOnStartup=", this.d, Extension.C_BRAKE);
    }

    public xsa0(int i) {
        this.b = false;
        this.c = 10000L;
        this.d = false;
    }

    public xsa0() {
        this(0);
    }
}
