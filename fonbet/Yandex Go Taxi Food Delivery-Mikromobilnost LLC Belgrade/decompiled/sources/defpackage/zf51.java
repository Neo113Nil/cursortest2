package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zf51 {
    public final ArrayList a;
    public final ArrayList b;
    public final kvt0 c;
    public final n2m0 d;

    public zf51(ArrayList arrayList, ArrayList arrayList2, kvt0 kvt0Var, n2m0 n2m0Var) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = kvt0Var;
        this.d = n2m0Var;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final n2m0 c() {
        return this.d;
    }

    public final kvt0 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf51)) {
            return false;
        }
        zf51 zf51Var = (zf51) obj;
        return this.a.equals(zf51Var.a) && this.b.equals(zf51Var.b) && jl40.l(this.c, zf51Var.c) && jl40.l(this.d, zf51Var.d);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        kvt0 kvt0Var = this.c;
        int hashCode = (b + (kvt0Var == null ? 0 : kvt0Var.hashCode())) * 31;
        n2m0 n2m0Var = this.d;
        return hashCode + (n2m0Var != null ? n2m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "YBPaymentMethodsResponse(paymentMethods=" + this.a + ", promos=" + this.b + ", splitInfo=" + this.c + ", saverInfo=" + this.d + Extension.C_BRAKE;
    }
}
