package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class t6k0 {
    public static final t6k0 c = new t6k0("", EmptyList.a);
    public final String a;
    public final List b;

    public t6k0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6k0)) {
            return false;
        }
        t6k0 t6k0Var = (t6k0) obj;
        return this.a.equals(t6k0Var.a) && this.b.equals(t6k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("PricesWithOffer(offerId=", this.a, ", prices=", Extension.C_BRAKE, this.b);
    }
}
