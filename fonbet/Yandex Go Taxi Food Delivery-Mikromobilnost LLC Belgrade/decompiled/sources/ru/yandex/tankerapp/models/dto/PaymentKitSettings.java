package ru.yandex.tankerapp.models.dto;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u001f !B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitSettings;", "Ljava/io/Serializable;", "", "merchantId", "", "isSBPAvailable", "isNewSBPTokenAvailable", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payment;", "preferredPayment", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Merchant;", "merchant", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payer;", "payer", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payment;Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Merchant;Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payer;)V", "Ljava/lang/String;", "getMerchantId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "c", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payment;", "getPreferredPayment", "()Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payment;", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Merchant;", "a", "()Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Merchant;", "Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payer;", "b", "()Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payer;", "Payer", "Payment", "Merchant", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentKitSettings implements Serializable {

    @ysq0("isNewSBPTokenAvailable")
    private final Boolean isNewSBPTokenAvailable;

    @ysq0("isSBPAvailable")
    private final Boolean isSBPAvailable;

    @ysq0("merchant")
    private final Merchant merchant;

    @ysq0("merchantId")
    private final String merchantId;

    @ysq0("payer")
    private final Payer payer;

    @ysq0("preferredPayment")
    private final Payment preferredPayment;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Merchant;", "Ljava/io/Serializable;", "", "serviceToken", "localizedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getLocalizedName", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Merchant implements Serializable {

        @ysq0("localizedName")
        private final String localizedName;

        @ysq0("serviceToken")
        private final String serviceToken;

        public Merchant(String str, String str2) {
            this.serviceToken = str;
            this.localizedName = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getServiceToken() {
            return this.serviceToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Merchant)) {
                return false;
            }
            Merchant merchant = (Merchant) obj;
            return jl40.l(this.serviceToken, merchant.serviceToken) && jl40.l(this.localizedName, merchant.localizedName);
        }

        public final int hashCode() {
            int hashCode = this.serviceToken.hashCode() * 31;
            String str = this.localizedName;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return unr0.p("Merchant(serviceToken=", this.serviceToken, ", localizedName=", this.localizedName, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payer;", "Ljava/io/Serializable;", "", "oauthToken", "uid", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payer implements Serializable {

        @ysq0("email")
        private final String email;

        @ysq0("oauthToken")
        private final String oauthToken;

        @ysq0("uid")
        private final String uid;

        public Payer(String str, String str2, String str3) {
            this.oauthToken = str;
            this.uid = str2;
            this.email = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: b, reason: from getter */
        public final String getOauthToken() {
            return this.oauthToken;
        }

        /* renamed from: c, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payer)) {
                return false;
            }
            Payer payer = (Payer) obj;
            return jl40.l(this.oauthToken, payer.oauthToken) && jl40.l(this.uid, payer.uid) && jl40.l(this.email, payer.email);
        }

        public final int hashCode() {
            int b = unr0.b(this.oauthToken.hashCode() * 31, 31, this.uid);
            String str = this.email;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            String str = this.oauthToken;
            String str2 = this.uid;
            return oyr.t(b64.v("Payer(oauthToken=", str, ", uid=", str2, ", email="), this.email, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/tankerapp/models/dto/PaymentKitSettings$Payment;", "Ljava/io/Serializable;", "", "type", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getId", "car_tech_payment_sdk_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payment implements Serializable {

        @ysq0("id")
        private final String id;

        @ysq0("type")
        private final String type;

        public Payment(String str, String str2) {
            this.type = str;
            this.id = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj;
            return jl40.l(this.type, payment.type) && jl40.l(this.id, payment.id);
        }

        public final int hashCode() {
            return this.id.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("Payment(type=", this.type, ", id=", this.id, Extension.C_BRAKE);
        }
    }

    public PaymentKitSettings(String str, Boolean bool, Boolean bool2, Payment payment, Merchant merchant, Payer payer) {
        this.merchantId = str;
        this.isSBPAvailable = bool;
        this.isNewSBPTokenAvailable = bool2;
        this.preferredPayment = payment;
        this.merchant = merchant;
        this.payer = payer;
    }

    /* renamed from: a, reason: from getter */
    public final Merchant getMerchant() {
        return this.merchant;
    }

    /* renamed from: b, reason: from getter */
    public final Payer getPayer() {
        return this.payer;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getIsNewSBPTokenAvailable() {
        return this.isNewSBPTokenAvailable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentKitSettings)) {
            return false;
        }
        PaymentKitSettings paymentKitSettings = (PaymentKitSettings) obj;
        return jl40.l(this.merchantId, paymentKitSettings.merchantId) && jl40.l(this.isSBPAvailable, paymentKitSettings.isSBPAvailable) && jl40.l(this.isNewSBPTokenAvailable, paymentKitSettings.isNewSBPTokenAvailable) && jl40.l(this.preferredPayment, paymentKitSettings.preferredPayment) && jl40.l(this.merchant, paymentKitSettings.merchant) && jl40.l(this.payer, paymentKitSettings.payer);
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getIsSBPAvailable() {
        return this.isSBPAvailable;
    }

    public final int hashCode() {
        String str = this.merchantId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isSBPAvailable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isNewSBPTokenAvailable;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Payment payment = this.preferredPayment;
        return this.payer.hashCode() + ((this.merchant.hashCode() + ((hashCode3 + (payment != null ? payment.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PaymentKitSettings(merchantId=" + this.merchantId + ", isSBPAvailable=" + this.isSBPAvailable + ", isNewSBPTokenAvailable=" + this.isNewSBPTokenAvailable + ", preferredPayment=" + this.preferredPayment + ", merchant=" + this.merchant + ", payer=" + this.payer + Extension.C_BRAKE;
    }
}
