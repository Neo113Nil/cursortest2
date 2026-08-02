package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ycw0 {
    public static final ycw0 f;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        EmptyList emptyList = EmptyList.a;
        f = new ycw0(emptyList, emptyList, emptyList, emptyList, emptyList);
    }

    public ycw0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycw0)) {
            return false;
        }
        ycw0 ycw0Var = (ycw0) obj;
        return jl40.l(this.a, ycw0Var.a) && jl40.l(this.b, ycw0Var.b) && jl40.l(this.c, ycw0Var.c) && jl40.l(this.d, ycw0Var.d) && jl40.l(this.e, ycw0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = qv10.v("SuperappOrders(eatsOrders=", this.a, ", chargersOrders=", this.b, ", scootersOrders=");
        nnm.w(v, this.c, ", driveOrders=", this.d, ", deliveryOrders=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
