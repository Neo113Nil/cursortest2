package defpackage;

import android.os.SystemClock;
import com.yandex.go.search.perf.AddressesListPointType;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v91 {
    public final String a;
    public final long b;
    public final i8v0 c;
    public final String d;
    public final AddressesListPointType e;

    public v91(String str, AddressesListPointType addressesListPointType) {
        String uuid = UUID.randomUUID().toString();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = uuid;
        this.b = elapsedRealtime;
        this.c = i8v0.a;
        this.d = str;
        this.e = addressesListPointType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v91)) {
            return false;
        }
        v91 v91Var = (v91) obj;
        return jl40.l(this.a, v91Var.a) && this.b == v91Var.b && jl40.l(this.c, v91Var.c) && jl40.l(this.d, v91Var.d) && this.e == v91Var.e;
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        this.c.getClass();
        return this.e.hashCode() + unr0.b((501025921 + c) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder l = x4e.l("AddressesListUpdatePerfIntent(uuid=", this.a, ", intentTimeMs=", this.b);
        l.append(", openReason=");
        l.append(this.c);
        l.append(", sourceScreen=");
        l.append(this.d);
        l.append(", pointType=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
