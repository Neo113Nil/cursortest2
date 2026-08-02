package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;

/* loaded from: classes2.dex */
public final class uzc0 implements wzc0 {
    public final PlusAcquisitionPaymentAnalytics$Params a;
    public final pzc0 b;

    public uzc0(PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, pzc0 pzc0Var) {
        this.a = plusAcquisitionPaymentAnalytics$Params;
        this.b = pzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzc0)) {
            return false;
        }
        uzc0 uzc0Var = (uzc0) obj;
        return jl40.l(this.a, uzc0Var.a) && this.b.equals(uzc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OneTariff(analyticsParams=" + this.a + ", buttonSectionOffer=" + this.b + ')';
    }
}
