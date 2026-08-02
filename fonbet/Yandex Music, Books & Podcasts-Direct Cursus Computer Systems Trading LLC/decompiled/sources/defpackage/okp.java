package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class okp {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final xgr e;
    public final int f;

    public okp(String str, long j, long j2, String str2, xgr xgrVar, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = xgrVar;
        this.f = i;
    }

    public static okp a(okp okpVar, long j, long j2, xgr xgrVar, int i) {
        String str = okpVar.a;
        if ((i & 2) != 0) {
            j = okpVar.b;
        }
        long j3 = j;
        String str2 = okpVar.d;
        if ((i & 16) != 0) {
            xgrVar = okpVar.e;
        }
        int i2 = okpVar.f;
        str.getClass();
        str2.getClass();
        return new okp(str, j3, j2, str2, xgrVar, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okp)) {
            return false;
        }
        okp okpVar = (okp) obj;
        return Intrinsics.d(this.a, okpVar.a) && this.b == okpVar.b && this.c == okpVar.c && Intrinsics.d(this.d, okpVar.d) && this.e == okpVar.e && this.f == okpVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + k5r.c(tlm.c(this.c, tlm.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Session(id=", this.b, this.a, ", lastStepTimestamp=");
        ouj.C(q, ", lastInteractionTimestamp=", this.c, ", userId=");
        q.append(this.d);
        q.append(", step=");
        q.append(this.e);
        q.append(", appVersionCode=");
        return f1d.i(q, this.f, ")");
    }
}
