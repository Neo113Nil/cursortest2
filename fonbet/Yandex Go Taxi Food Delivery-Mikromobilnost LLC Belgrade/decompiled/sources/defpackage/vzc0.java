package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;

/* loaded from: classes2.dex */
public final class vzc0 implements wzc0 {
    public final PlusAcquisitionPaymentAnalytics$Params a;
    public final pzc0 b;
    public final pzc0 c;

    public vzc0(PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, pzc0 pzc0Var, pzc0 pzc0Var2) {
        this.a = plusAcquisitionPaymentAnalytics$Params;
        this.b = pzc0Var;
        this.c = pzc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzc0)) {
            return false;
        }
        vzc0 vzc0Var = (vzc0) obj;
        return jl40.l(this.a, vzc0Var.a) && this.b.equals(vzc0Var.b) && this.c.equals(vzc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TwoTariffs(analyticsParams=" + this.a + ", buttonSectionOffer1=" + this.b + ", buttonSectionOffer2=" + this.c + ')';
    }
}
