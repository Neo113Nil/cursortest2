package defpackage;

import com.yandex.go.payments.paymentlist.domain.subtitles.replacement.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class uba0 {
    public static final uba0 g = new uba0((cz51) null, (uk10) null, (nsd0) null, (b) null, (w9a0) null, 52);
    public final cz51 a;
    public final us51 b;
    public final nsd0 c;
    public final x9a0 d;
    public final w9a0 e;
    public final sls f;

    public /* synthetic */ uba0(cz51 cz51Var, uk10 uk10Var, nsd0 nsd0Var, b bVar, w9a0 w9a0Var, int i) {
        this((i & 1) != 0 ? null : cz51Var, (i & 2) != 0 ? null : uk10Var, (i & 4) != 0 ? null : nsd0Var, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : w9a0Var, (sls) null);
    }

    public static uba0 a(uba0 uba0Var, nsd0 nsd0Var, x9a0 x9a0Var, sls slsVar, int i) {
        cz51 cz51Var = uba0Var.a;
        us51 us51Var = uba0Var.b;
        if ((i & 4) != 0) {
            nsd0Var = uba0Var.c;
        }
        nsd0 nsd0Var2 = nsd0Var;
        if ((i & 8) != 0) {
            x9a0Var = uba0Var.d;
        }
        x9a0 x9a0Var2 = x9a0Var;
        w9a0 w9a0Var = uba0Var.e;
        if ((i & 32) != 0) {
            slsVar = uba0Var.f;
        }
        uba0Var.getClass();
        return new uba0(cz51Var, us51Var, nsd0Var2, x9a0Var2, w9a0Var, slsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uba0)) {
            return false;
        }
        uba0 uba0Var = (uba0) obj;
        return jl40.l(this.a, uba0Var.a) && jl40.l(this.b, uba0Var.b) && jl40.l(this.c, uba0Var.c) && jl40.l(this.d, uba0Var.d) && jl40.l(this.e, uba0Var.e) && jl40.l(this.f, uba0Var.f);
    }

    public final int hashCode() {
        cz51 cz51Var = this.a;
        int hashCode = (cz51Var == null ? 0 : cz51Var.hashCode()) * 31;
        us51 us51Var = this.b;
        int hashCode2 = (hashCode + (us51Var == null ? 0 : us51Var.hashCode())) * 31;
        nsd0 nsd0Var = this.c;
        int hashCode3 = (hashCode2 + (nsd0Var == null ? 0 : nsd0Var.hashCode())) * 31;
        x9a0 x9a0Var = this.d;
        int hashCode4 = (hashCode3 + (x9a0Var == null ? 0 : x9a0Var.hashCode())) * 31;
        w9a0 w9a0Var = this.e;
        int hashCode5 = (hashCode4 + (w9a0Var == null ? 0 : w9a0Var.hashCode())) * 31;
        sls slsVar = this.f;
        return hashCode5 + (slsVar != null ? slsVar.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethodsListOptionalDependencies(ybWalletTopUpAmountInteractor=" + this.a + ", ybNotificationInteractor=" + this.b + ", eventsListener=" + this.c + ", paymentMethodsCustomSubtitleInteractor=" + this.d + ", paymentMethodsCustomIconInfoFactory=" + this.e + ", onExternalCardLinkingClick=" + this.f + Extension.C_BRAKE;
    }

    public uba0() {
        this((cz51) null, (uk10) null, (nsd0) null, (b) null, (w9a0) null, 63);
    }

    public uba0(cz51 cz51Var, us51 us51Var, nsd0 nsd0Var, x9a0 x9a0Var, w9a0 w9a0Var, sls slsVar) {
        this.a = cz51Var;
        this.b = us51Var;
        this.c = nsd0Var;
        this.d = x9a0Var;
        this.e = w9a0Var;
        this.f = slsVar;
    }
}
