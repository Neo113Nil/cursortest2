package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r011 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final MapBuilder d;

    public r011(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("has_pending_top_ups", Boolean.valueOf(z));
        mapBuilder.put("has_debt", Boolean.valueOf(z2));
        mapBuilder.put("has_insufficient_funds", Boolean.valueOf(z3));
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r011)) {
            return false;
        }
        r011 r011Var = (r011) obj;
        return this.a == r011Var.a && this.b == r011Var.b && this.c == r011Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("TransportCardBalance(hasPendingTopUps=", ", hasDebt=", ", hasInsufficientFunds=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
