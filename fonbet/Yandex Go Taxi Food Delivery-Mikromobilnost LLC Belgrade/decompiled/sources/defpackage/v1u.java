package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v1u {
    public static final v1u h;
    public final List a;
    public final boolean b;
    public final int c;
    public final List d;
    public final kdc e;
    public final String f;
    public final bzy0 g;

    static {
        EmptyList emptyList = EmptyList.a;
        h = new v1u(emptyList, 0, emptyList, null, null, 96);
    }

    public /* synthetic */ v1u(List list, int i, List list2, kdc kdcVar, bzy0 bzy0Var, int i2) {
        this(list, false, i, list2, kdcVar, "", (i2 & 64) != 0 ? null : bzy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1u)) {
            return false;
        }
        v1u v1uVar = (v1u) obj;
        return jl40.l(this.a, v1uVar.a) && this.b == v1uVar.b && this.c == v1uVar.c && jl40.l(this.d, v1uVar.d) && jl40.l(this.e, v1uVar.e) && jl40.l(this.f, v1uVar.f) && jl40.l(this.g, v1uVar.g);
    }

    public final int hashCode() {
        int c = unr0.c(oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        kdc kdcVar = this.e;
        int b = unr0.b((c + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31, this.f);
        bzy0 bzy0Var = this.g;
        return b + (bzy0Var != null ? bzy0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GroundSubtitleState(available=" + this.a + ", isAllPeriodical=" + this.b + ", unavailableCount=" + this.c + ", texts=" + this.d + ", color=" + this.e + ", direction=" + this.f + ", threadVariantsState=" + this.g + Extension.C_BRAKE;
    }

    public v1u(List list, boolean z, int i, List list2, kdc kdcVar, String str, bzy0 bzy0Var) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = list2;
        this.e = kdcVar;
        this.f = str;
        this.g = bzy0Var;
    }
}
