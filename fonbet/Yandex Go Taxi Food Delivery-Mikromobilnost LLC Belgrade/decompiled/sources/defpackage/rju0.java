package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.Price;

/* loaded from: classes2.dex */
public final class rju0 {
    public final String a;
    public final Price b;
    public final int c;

    public rju0(String str, Price price, int i) {
        this.a = str;
        this.b = price;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rju0)) {
            return false;
        }
        rju0 rju0Var = (rju0) obj;
        return jl40.l(this.a, rju0Var.a) && this.b.equals(rju0Var.b) && this.c == rju0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plan(period=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", quantity=");
        return oyr.s(sb, this.c, ')');
    }
}
