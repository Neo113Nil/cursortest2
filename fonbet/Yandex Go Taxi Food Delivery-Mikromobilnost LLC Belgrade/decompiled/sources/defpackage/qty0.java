package defpackage;

import android.os.SystemClock;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qty0 {
    public final String a;
    public final String b;
    public final long c;
    public int d;
    public final i3y e;

    public qty0(nty0 nty0Var) {
        String str = nty0Var.a;
        String str2 = nty0Var.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = str;
        this.b = str2;
        this.c = elapsedRealtime;
        this.d = 0;
        this.e = a.a(new oew0(21, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qty0)) {
            return false;
        }
        qty0 qty0Var = (qty0) obj;
        return jl40.l(this.a, qty0Var.a) && jl40.l(this.b, qty0Var.b) && this.c == qty0Var.c && this.d == qty0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        int i = this.d;
        StringBuilder v = b64.v("ActiveSuggestMetrics(query=", this.a, ", queryId=", this.b, ", startTime=");
        vfc.y(v, this.c, ", shownItemCount=", i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
