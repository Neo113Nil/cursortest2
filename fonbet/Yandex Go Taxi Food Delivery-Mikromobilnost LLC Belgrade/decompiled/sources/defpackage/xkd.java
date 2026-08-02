package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.Price;

/* loaded from: classes2.dex */
public final class xkd {
    public final long a;
    public final Price b;
    public final Price c;

    public xkd(long j, Price price, Price price2) {
        this.a = j;
        this.b = price;
        this.c = price2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkd)) {
            return false;
        }
        xkd xkdVar = (xkd) obj;
        return this.a == xkdVar.a && this.b.equals(xkdVar.b) && jl40.l(this.c, xkdVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Price price = this.c;
        return hashCode + (price == null ? 0 : price.hashCode());
    }

    public final String toString() {
        return "Invoice(timestamp=" + this.a + ", price=" + this.b + ", maxPoints=" + this.c + ')';
    }
}
