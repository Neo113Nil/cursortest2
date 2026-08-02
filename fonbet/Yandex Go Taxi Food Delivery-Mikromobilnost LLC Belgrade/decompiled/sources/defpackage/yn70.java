package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yn70 implements zn70 {
    public final hn70 a;
    public final a741 b;
    public final boolean c;
    public final yl70 d;
    public final dub e;
    public final List f;
    public final g401 g;
    public final boolean h;
    public final String i;

    public /* synthetic */ yn70(hn70 hn70Var, a741 a741Var, yl70 yl70Var, dub dubVar, List list, g401 g401Var, int i) {
        this((i & 1) != 0 ? null : hn70Var, (i & 2) != 0 ? null : a741Var, false, (i & 8) != 0 ? null : yl70Var, (i & 16) != 0 ? null : dubVar, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : g401Var, false, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn70)) {
            return false;
        }
        yn70 yn70Var = (yn70) obj;
        return jl40.l(this.a, yn70Var.a) && jl40.l(this.b, yn70Var.b) && this.c == yn70Var.c && jl40.l(this.d, yn70Var.d) && jl40.l(this.e, yn70Var.e) && jl40.l(this.f, yn70Var.f) && jl40.l(this.g, yn70Var.g) && this.h == yn70Var.h && jl40.l(this.i, yn70Var.i);
    }

    public final int hashCode() {
        hn70 hn70Var = this.a;
        int hashCode = (hn70Var == null ? 0 : hn70Var.hashCode()) * 31;
        a741 a741Var = this.b;
        int e = unr0.e((hashCode + (a741Var == null ? 0 : a741Var.hashCode())) * 31, 31, this.c);
        yl70 yl70Var = this.d;
        int hashCode2 = (e + (yl70Var == null ? 0 : yl70Var.hashCode())) * 31;
        dub dubVar = this.e;
        int hashCode3 = (hashCode2 + (dubVar == null ? 0 : dubVar.hashCode())) * 31;
        List list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        g401 g401Var = this.g;
        return this.i.hashCode() + unr0.e((hashCode4 + (g401Var != null ? g401Var.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(header=");
        sb.append(this.a);
        sb.append(", walkingInfo=");
        sb.append(this.b);
        sb.append(", showSkeleton=");
        sb.append(this.c);
        sb.append(", actionButtons=");
        sb.append(this.d);
        sb.append(", circleButtons=");
        sb.append(this.e);
        sb.append(", bottomSections=");
        sb.append(this.f);
        sb.append(", rating=");
        sb.append(this.g);
        sb.append(", isShimmering=");
        sb.append(this.h);
        sb.append(", backButtonBadgeText=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }

    public yn70(hn70 hn70Var, a741 a741Var, boolean z, yl70 yl70Var, dub dubVar, List list, g401 g401Var, boolean z2, String str) {
        this.a = hn70Var;
        this.b = a741Var;
        this.c = z;
        this.d = yl70Var;
        this.e = dubVar;
        this.f = list;
        this.g = g401Var;
        this.h = z2;
        this.i = str;
    }

    public yn70() {
        this(null, null, null, null, null, null, 511);
    }
}
