package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rqv0 implements uqv0 {
    public final sgx0 a;
    public final SummaryExpandReason b;
    public final Runnable c;

    public rqv0(sgx0 sgx0Var, SummaryExpandReason summaryExpandReason, p7h p7hVar) {
        this.a = sgx0Var;
        this.b = summaryExpandReason;
        this.c = p7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqv0)) {
            return false;
        }
        rqv0 rqv0Var = (rqv0) obj;
        return jl40.l(this.a, rqv0Var.a) && this.b == rqv0Var.b && jl40.l(this.c, rqv0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Runnable runnable = this.c;
        return hashCode + (runnable == null ? 0 : runnable.hashCode());
    }

    public final String toString() {
        return "ShowTariffCard(tariffOffer=" + this.a + ", reason=" + this.b + ", actionOnOpened=" + this.c + Extension.C_BRAKE;
    }
}
