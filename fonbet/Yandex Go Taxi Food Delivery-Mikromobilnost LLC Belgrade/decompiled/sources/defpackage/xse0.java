package defpackage;

import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xse0 {
    public final ihv0 a;
    public final ijv0 b;
    public final k9s0 c;
    public final pv0 d;
    public final RouteData$Continuation e;
    public final boolean f;

    public /* synthetic */ xse0(ihv0 ihv0Var, ijv0 ijv0Var, k9s0 k9s0Var, int i) {
        this((i & 1) != 0 ? ghv0.a : ihv0Var, (i & 2) != 0 ? null : ijv0Var, (i & 4) != 0 ? null : k9s0Var, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xse0)) {
            return false;
        }
        xse0 xse0Var = (xse0) obj;
        return jl40.l(this.a, xse0Var.a) && jl40.l(this.b, xse0Var.b) && jl40.l(this.c, xse0Var.c) && jl40.l(this.d, xse0Var.d) && this.e == xse0Var.e && this.f == xse0Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ijv0 ijv0Var = this.b;
        int hashCode2 = (hashCode + (ijv0Var == null ? 0 : ijv0Var.hashCode())) * 31;
        k9s0 k9s0Var = this.c;
        int hashCode3 = (hashCode2 + (k9s0Var == null ? 0 : k9s0Var.hashCode())) * 31;
        pv0 pv0Var = this.d;
        int hashCode4 = (hashCode3 + (pv0Var == null ? 0 : pv0Var.hashCode())) * 31;
        RouteData$Continuation routeData$Continuation = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (routeData$Continuation != null ? routeData$Continuation.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PreorderSummaryOpenParams(expandState=" + this.a + ", origin=" + this.b + ", showSummaryParams=" + this.c + ", sourceAddressInfo=" + this.d + ", routeContinuation=" + this.e + ", openedByDeeplink=" + this.f + Extension.C_BRAKE;
    }

    public xse0(ihv0 ihv0Var, ijv0 ijv0Var, k9s0 k9s0Var, pv0 pv0Var, RouteData$Continuation routeData$Continuation, boolean z) {
        this.a = ihv0Var;
        this.b = ijv0Var;
        this.c = k9s0Var;
        this.d = pv0Var;
        this.e = routeData$Continuation;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xse0() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }
}
