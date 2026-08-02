package defpackage;

import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uj60 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Long e;

    public /* synthetic */ uj60(String str, int i, String str2, boolean z) {
        this(str, str2, (i & 4) != 0 ? false : z, false, null);
    }

    public final String a() {
        String o = g8e.o("profile:", this.a);
        String o2 = g8e.o("channel:", this.b);
        String str = this.c ? "inapp" : null;
        String str2 = this.d ? "meeting" : null;
        Long l = this.e;
        return a.X(j73.A(new String[]{o, o2, str, str2, l != null ? qv10.j(l.longValue(), "uniqueid:") : null}), "_##_", null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj60)) {
            return false;
        }
        uj60 uj60Var = (uj60) obj;
        return jl40.l(this.a, uj60Var.a) && jl40.l(this.b, uj60Var.b) && this.c == uj60Var.c && this.d == uj60Var.d && jl40.l(this.e, uj60Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("NotificationTag(profileId=", this.a, ", channelId=", this.b, ", isInApp=");
        nnm.v(", isMeeting=", ", uniqueId=", v, this.c, this.d);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public uj60(String str, String str2, boolean z, boolean z2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = l;
    }
}
