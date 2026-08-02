package defpackage;

import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$External$PreferredTrackingType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r980 {
    public final h1p a;
    public final OrderTrackingService$External$PreferredTrackingType b;

    public r980(h1p h1pVar, OrderTrackingService$External$PreferredTrackingType orderTrackingService$External$PreferredTrackingType) {
        this.a = h1pVar;
        this.b = orderTrackingService$External$PreferredTrackingType;
    }

    public final OrderTrackingService$External$PreferredTrackingType a() {
        return this.b;
    }

    public final h1p b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r980)) {
            return false;
        }
        r980 r980Var = (r980) obj;
        return jl40.l(this.a, r980Var.a) && this.b == r980Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "External(service=" + this.a + ", preferredTrackingType=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ r980(h1p h1pVar) {
        this(h1pVar, OrderTrackingService$External$PreferredTrackingType.BLANK);
    }
}
