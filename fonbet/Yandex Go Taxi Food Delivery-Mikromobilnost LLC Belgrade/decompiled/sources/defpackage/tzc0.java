package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;

/* loaded from: classes2.dex */
public final class tzc0 implements wzc0 {
    public final PlusAcquisitionPaymentAnalytics$Params a;
    public final pzc0 b;

    public tzc0(PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, pzc0 pzc0Var) {
        this.a = plusAcquisitionPaymentAnalytics$Params;
        this.b = pzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzc0)) {
            return false;
        }
        tzc0 tzc0Var = (tzc0) obj;
        return jl40.l(this.a, tzc0Var.a) && jl40.l(this.b, tzc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompositeOffer(analyticsParams=" + this.a + ", buttonSectionOffer=" + this.b + ')';
    }
}
