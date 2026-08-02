package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r380 {
    public final n380 a;
    public final sq00 b;
    public final p0c0 c;

    public r380(n380 n380Var, sq00 sq00Var, p0c0 p0c0Var) {
        this.a = n380Var;
        this.b = sq00Var;
        this.c = p0c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r380)) {
            return false;
        }
        r380 r380Var = (r380) obj;
        return jl40.l(this.a, r380Var.a) && jl40.l(this.b, r380Var.b) && this.c.equals(r380Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sq00 sq00Var = this.b;
        return this.c.hashCode() + ((hashCode + (sq00Var == null ? 0 : sq00Var.hashCode())) * 31);
    }

    public final String toString() {
        return "OrderPinV2StateWithStyle(orderPinV2State=" + this.a + ", copterPinOverride=" + this.b + ", pinStyle=" + this.c + Extension.C_BRAKE;
    }
}
