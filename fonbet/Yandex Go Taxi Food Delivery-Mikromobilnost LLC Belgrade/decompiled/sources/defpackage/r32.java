package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes.dex */
public final class r32 {
    public static final o32 Companion = new o32();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new i22(2)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ r32(String str, int i, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, m32.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r32)) {
            return false;
        }
        r32 r32Var = (r32) obj;
        return jl40.l(this.a, r32Var.a) && jl40.l(this.b, r32Var.b) && jl40.l(this.c, r32Var.c) && jl40.l(this.d, r32Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n.l(", idempotencyKey=", this.d, Extension.C_BRAKE, b64.v("AnalyticsEvent(type=", this.a, ", name=", this.b, ", params="), this.c);
    }
}
