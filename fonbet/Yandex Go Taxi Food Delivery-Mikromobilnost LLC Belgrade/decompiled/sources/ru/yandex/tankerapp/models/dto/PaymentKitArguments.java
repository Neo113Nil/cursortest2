package ru.yandex.tankerapp.models.dto;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitArguments;", "Ljava/io/Serializable;", "", "trustId", "Lru/yandex/tankerapp/models/dto/PaymentKitArguments$PaymentOption;", "paymentOption", "<init>", "(Ljava/lang/String;Lru/yandex/tankerapp/models/dto/PaymentKitArguments$PaymentOption;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lru/yandex/tankerapp/models/dto/PaymentKitArguments$PaymentOption;", "a", "()Lru/yandex/tankerapp/models/dto/PaymentKitArguments$PaymentOption;", "PaymentOption", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitArguments implements Serializable {

    @ysq0("paymentOption")
    private final PaymentOption paymentOption;

    @ysq0("trustId")
    private final String trustId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitArguments$PaymentOption;", "", "<init>", "(Ljava/lang/String;I)V", "Sbp", "NewSbp", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentOption {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentOption[] $VALUES;

        @ysq0("newSbp")
        public static final PaymentOption NewSbp;

        @ysq0("sbp")
        public static final PaymentOption Sbp;

        static {
            PaymentOption paymentOption = new PaymentOption("Sbp", 0);
            Sbp = paymentOption;
            PaymentOption paymentOption2 = new PaymentOption("NewSbp", 1);
            NewSbp = paymentOption2;
            PaymentOption[] paymentOptionArr = {paymentOption, paymentOption2};
            $VALUES = paymentOptionArr;
            $ENTRIES = a.a(paymentOptionArr);
        }

        private PaymentOption(String str, int i) {
        }

        public static PaymentOption valueOf(String str) {
            return (PaymentOption) Enum.valueOf(PaymentOption.class, str);
        }

        public static PaymentOption[] values() {
            return (PaymentOption[]) $VALUES.clone();
        }
    }

    public PaymentKitArguments(String str, PaymentOption paymentOption) {
        this.trustId = str;
        this.paymentOption = paymentOption;
    }

    /* renamed from: a, reason: from getter */
    public final PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    /* renamed from: b, reason: from getter */
    public final String getTrustId() {
        return this.trustId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitArguments)) {
            return false;
        }
        PaymentKitArguments paymentKitArguments = (PaymentKitArguments) obj;
        return jl40.l(this.trustId, paymentKitArguments.trustId) && this.paymentOption == paymentKitArguments.paymentOption;
    }

    public final int hashCode() {
        int hashCode = this.trustId.hashCode() * 31;
        PaymentOption paymentOption = this.paymentOption;
        return hashCode + (paymentOption == null ? 0 : paymentOption.hashCode());
    }

    public final String toString() {
        return "PaymentKitArguments(trustId=" + this.trustId + ", paymentOption=" + this.paymentOption + Extension.C_BRAKE;
    }
}
