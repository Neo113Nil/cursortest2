package ru.yandex.tankerapp.fintech.models.dto;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003 !\"B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings;", "Ljava/io/Serializable;", "merchantId", "", "preferredPayment", "Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payment;", "merchant", "Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Merchant;", "payer", "Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payer;", "<init>", "(Ljava/lang/String;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payment;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Merchant;Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payer;)V", "getMerchantId", "()Ljava/lang/String;", "getPreferredPayment", "()Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payment;", "getMerchant", "()Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Merchant;", "getPayer", "()Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Payer", "Payment", "Merchant", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FintechSdkSettings implements Serializable {

    @ysq0("merchant")
    private final Merchant merchant;

    @ysq0("merchantId")
    private final String merchantId;

    @ysq0("payer")
    private final Payer payer;

    @ysq0("preferredPayment")
    private final Payment preferredPayment;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Merchant;", "Ljava/io/Serializable;", "serviceToken", "", "localizedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getServiceToken", "()Ljava/lang/String;", "getLocalizedName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Merchant implements Serializable {

        @ysq0("localizedName")
        private final String localizedName;

        @ysq0("serviceToken")
        private final String serviceToken;

        public Merchant(String str, String str2) {
            this.serviceToken = str;
            this.localizedName = str2;
        }

        public static /* synthetic */ Merchant copy$default(Merchant merchant, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchant.serviceToken;
            }
            if ((i & 2) != 0) {
                str2 = merchant.localizedName;
            }
            return merchant.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getServiceToken() {
            return this.serviceToken;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocalizedName() {
            return this.localizedName;
        }

        public final Merchant copy(String serviceToken, String localizedName) {
            return new Merchant(serviceToken, localizedName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Merchant)) {
                return false;
            }
            Merchant merchant = (Merchant) other;
            return jl40.l(this.serviceToken, merchant.serviceToken) && jl40.l(this.localizedName, merchant.localizedName);
        }

        public final String getLocalizedName() {
            return this.localizedName;
        }

        public final String getServiceToken() {
            return this.serviceToken;
        }

        public int hashCode() {
            int hashCode = this.serviceToken.hashCode() * 31;
            String str = this.localizedName;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("Merchant(serviceToken=", this.serviceToken, ", localizedName=", this.localizedName, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payer;", "Ljava/io/Serializable;", "oauthToken", "", "uid", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOauthToken", "()Ljava/lang/String;", "getUid", "getEmail", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static /* synthetic */ Payer copy$default(Payer payer, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payer.oauthToken;
            }
            if ((i & 2) != 0) {
                str2 = payer.uid;
            }
            if ((i & 4) != 0) {
                str3 = payer.email;
            }
            return payer.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOauthToken() {
            return this.oauthToken;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Payer copy(String oauthToken, String uid, String email) {
            return new Payer(oauthToken, uid, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payer)) {
                return false;
            }
            Payer payer = (Payer) other;
            return jl40.l(this.oauthToken, payer.oauthToken) && jl40.l(this.uid, payer.uid) && jl40.l(this.email, payer.email);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getOauthToken() {
            return this.oauthToken;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            int b = unr0.b(this.oauthToken.hashCode() * 31, 31, this.uid);
            String str = this.email;
            return b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.oauthToken;
            String str2 = this.uid;
            return oyr.t(b64.v("Payer(oauthToken=", str, ", uid=", str2, ", email="), this.email, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/tankerapp/fintech/models/dto/FintechSdkSettings$Payment;", "Ljava/io/Serializable;", "type", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech_sdk_interface_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payment implements Serializable {

        @ysq0("id")
        private final String id;

        @ysq0("type")
        private final String type;

        public Payment(String str, String str2) {
            this.type = str;
            this.id = str2;
        }

        public static /* synthetic */ Payment copy$default(Payment payment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payment.type;
            }
            if ((i & 2) != 0) {
                str2 = payment.id;
            }
            return payment.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Payment copy(String type, String id) {
            return new Payment(type, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return jl40.l(this.type, payment.type) && jl40.l(this.id, payment.id);
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.id.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("Payment(type=", this.type, ", id=", this.id, Extension.C_BRAKE);
        }
    }

    public FintechSdkSettings(String str, Payment payment, Merchant merchant, Payer payer) {
        this.merchantId = str;
        this.preferredPayment = payment;
        this.merchant = merchant;
        this.payer = payer;
    }

    public static /* synthetic */ FintechSdkSettings copy$default(FintechSdkSettings fintechSdkSettings, String str, Payment payment, Merchant merchant, Payer payer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fintechSdkSettings.merchantId;
        }
        if ((i & 2) != 0) {
            payment = fintechSdkSettings.preferredPayment;
        }
        if ((i & 4) != 0) {
            merchant = fintechSdkSettings.merchant;
        }
        if ((i & 8) != 0) {
            payer = fintechSdkSettings.payer;
        }
        return fintechSdkSettings.copy(str, payment, merchant, payer);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: component2, reason: from getter */
    public final Payment getPreferredPayment() {
        return this.preferredPayment;
    }

    /* renamed from: component3, reason: from getter */
    public final Merchant getMerchant() {
        return this.merchant;
    }

    /* renamed from: component4, reason: from getter */
    public final Payer getPayer() {
        return this.payer;
    }

    public final FintechSdkSettings copy(String merchantId, Payment preferredPayment, Merchant merchant, Payer payer) {
        return new FintechSdkSettings(merchantId, preferredPayment, merchant, payer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechSdkSettings)) {
            return false;
        }
        FintechSdkSettings fintechSdkSettings = (FintechSdkSettings) other;
        return jl40.l(this.merchantId, fintechSdkSettings.merchantId) && jl40.l(this.preferredPayment, fintechSdkSettings.preferredPayment) && jl40.l(this.merchant, fintechSdkSettings.merchant) && jl40.l(this.payer, fintechSdkSettings.payer);
    }

    public final Merchant getMerchant() {
        return this.merchant;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final Payer getPayer() {
        return this.payer;
    }

    public final Payment getPreferredPayment() {
        return this.preferredPayment;
    }

    public int hashCode() {
        String str = this.merchantId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Payment payment = this.preferredPayment;
        return this.payer.hashCode() + ((this.merchant.hashCode() + ((hashCode + (payment != null ? payment.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "FintechSdkSettings(merchantId=" + this.merchantId + ", preferredPayment=" + this.preferredPayment + ", merchant=" + this.merchant + ", payer=" + this.payer + Extension.C_BRAKE;
    }
}
