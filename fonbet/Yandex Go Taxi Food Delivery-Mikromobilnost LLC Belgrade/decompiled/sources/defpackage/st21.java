package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class st21 {
    public final long a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final Map j;

    public st21(long j, String str, long j2, int i, int i2, int i3, String str2, String str3, String str4, Map map) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st21)) {
            return false;
        }
        st21 st21Var = (st21) obj;
        return this.a == st21Var.a && jl40.l(this.b, st21Var.b) && this.c == st21Var.c && this.d == st21Var.d && this.e == st21Var.e && this.f == st21Var.f && jl40.l(this.g, st21Var.g) && jl40.l(this.h, st21Var.h) && jl40.l(this.i, st21Var.i) && jl40.l(this.j, st21Var.j);
    }

    public final int hashCode() {
        int b = oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, qv10.c(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31);
        String str = this.g;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.j;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("UserStatusEntity(internalId=", this.a, ", guid=", this.b);
        x4e.A(this.c, ", timestamp=", ", availability=", k);
        vfc.u(this.d, this.e, ", notificationMode=", ", duration=", k);
        smw0.t(this.f, ", customText=", this.g, ", customEmoji=", k);
        g8e.D(k, this.h, ", customIcon=", this.i, ", locales=");
        return b64.r(k, this.j, Extension.C_BRAKE);
    }
}
