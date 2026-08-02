package ru.yandex.tankerapp.models.dto;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitSelectAndPay;", "Ljava/io/Serializable;", "", "preferredPaymentId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitSelectAndPay implements Serializable {

    @ysq0("preferredPaymentId")
    private final String preferredPaymentId;

    public PaymentKitSelectAndPay(String str) {
        this.preferredPaymentId = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getPreferredPaymentId() {
        return this.preferredPaymentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentKitSelectAndPay) && jl40.l(this.preferredPaymentId, ((PaymentKitSelectAndPay) obj).preferredPaymentId);
    }

    public final int hashCode() {
        String str = this.preferredPaymentId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("PaymentKitSelectAndPay(preferredPaymentId=", this.preferredPaymentId, Extension.C_BRAKE);
    }
}
