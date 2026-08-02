package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class rl7 {
    public static final ql7 Companion = new ql7();
    public static final i3y[] n = {a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(1)), null, null, null, null, null, null, null, null, null, null, null, null};
    public final Map a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final xw80 h;
    public final qpv i;
    public final yg7 j;
    public final ng7 k;
    public boolean l;
    public boolean m;

    public /* synthetic */ rl7(int i, Map map, String str, String str2, String str3, String str4, boolean z, String str5, xw80 xw80Var, qpv qpvVar, yg7 yg7Var, ng7 ng7Var, boolean z2, boolean z3) {
        if (1663 != (i & 1663)) {
            qje.Z(i, 1663, pl7.a.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = xw80Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = qpvVar;
        }
        this.j = yg7Var;
        this.k = ng7Var;
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z2;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl7)) {
            return false;
        }
        rl7 rl7Var = (rl7) obj;
        return jl40.l(this.a, rl7Var.a) && jl40.l(this.b, rl7Var.b) && jl40.l(this.c, rl7Var.c) && jl40.l(this.d, rl7Var.d) && jl40.l(this.e, rl7Var.e) && this.f == rl7Var.f && jl40.l(this.g, rl7Var.g) && jl40.l(this.h, rl7Var.h) && jl40.l(this.i, rl7Var.i) && jl40.l(this.j, rl7Var.j) && jl40.l(this.k, rl7Var.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        xw80 xw80Var = this.h;
        int hashCode = (b + (xw80Var == null ? 0 : xw80Var.hashCode())) * 31;
        qpv qpvVar = this.i;
        return this.k.hashCode() + ((this.j.hashCode() + ((hashCode + (qpvVar != null ? qpvVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsGoStartArgs(strings=");
        sb.append(this.a);
        sb.append(", authToken=");
        sb.append(this.b);
        sb.append(", userId=");
        g8e.D(sb, this.c, ", acceptLanguage=", this.d, ", userAgent=");
        tse0.y(this.e, ", isTesting=", ", baseUrl=", sb, this.f);
        sb.append(this.g);
        sb.append(", outgoingCallArgs=");
        sb.append(this.h);
        sb.append(", incomingCallArgs=");
        sb.append(this.i);
        sb.append(", callExperimentsArgs=");
        sb.append(this.j);
        sb.append(", callConfigsArgs=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public rl7(Map map, String str, String str2, String str3, String str4, boolean z, String str5, xw80 xw80Var, qpv qpvVar, yg7 yg7Var, ng7 ng7Var) {
        this.a = map;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = xw80Var;
        this.i = qpvVar;
        this.j = yg7Var;
        this.k = ng7Var;
    }
}
