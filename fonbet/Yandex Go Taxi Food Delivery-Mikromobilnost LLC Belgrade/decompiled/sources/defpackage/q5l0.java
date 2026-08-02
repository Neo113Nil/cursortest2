package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.stop.ui.components.RouteLineIndicatorSize;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q5l0 {
    public final RouteLineIndicatorSize a;
    public final wp2 b;

    public q5l0(RouteLineIndicatorSize routeLineIndicatorSize, wp2 wp2Var) {
        this.a = routeLineIndicatorSize;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5l0)) {
            return false;
        }
        q5l0 q5l0Var = (q5l0) obj;
        return this.a == q5l0Var.a && jl40.l(this.b, q5l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteLineIndicator(size=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
