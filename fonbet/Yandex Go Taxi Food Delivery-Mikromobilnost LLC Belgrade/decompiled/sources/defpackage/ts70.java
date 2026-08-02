package defpackage;

import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ts70 implements xs70 {
    public final String a;
    public final long b;
    public final OrderType c;

    public ts70(String str, long j, OrderType orderType) {
        this.a = str;
        this.b = j;
        this.c = orderType;
    }

    @Override // defpackage.xs70
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xs70
    public final boolean b() {
        return true;
    }

    @Override // defpackage.xs70
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts70)) {
            return false;
        }
        ts70 ts70Var = (ts70) obj;
        return jl40.l(this.a, ts70Var.a) && this.b == ts70Var.b && this.c == ts70Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Linked(orderId=", this.a, ", loadingTimeoutMs=", this.b);
        l.append(", orderType=");
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
