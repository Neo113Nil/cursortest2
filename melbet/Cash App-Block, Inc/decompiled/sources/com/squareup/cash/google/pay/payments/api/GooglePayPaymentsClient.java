package com.squareup.cash.google.pay.payments.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GooglePayPaymentsClient {

    public interface PaymentResult {

        public final class Cancelled implements PaymentResult {
            public static final Cancelled INSTANCE = new Cancelled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancelled);
            }

            public final int hashCode() {
                return -2068413869;
            }

            public final String toString() {
                return "Cancelled";
            }
        }

        public final class Failure implements PaymentResult {
            public static final Failure INSTANCE = new Failure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return 32563980;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public final class Success implements PaymentResult {
            public final PaymentMethodResult paymentMethodResult;

            public Success(PaymentMethodResult paymentMethodResult) {
                this.paymentMethodResult = paymentMethodResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.paymentMethodResult.equals(((Success) obj).paymentMethodResult);
            }

            public final int hashCode() {
                return this.paymentMethodResult.hashCode();
            }

            public final String toString() {
                return "Success(paymentMethodResult=" + this.paymentMethodResult + ")";
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"com/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult", "", "", "email", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;", "paymentMethodData", "<init>", "(Ljava/lang/String;Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult;", "copy", "(Ljava/lang/String;Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;)Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;", "getPaymentMethodData", "PaymentMethodData", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class PaymentMethodResult {
        private final String email;
        private final PaymentMethodData paymentMethodData;

        public PaymentMethodResult(String str, PaymentMethodData paymentMethodData) {
            paymentMethodData.getClass();
            this.email = str;
            this.paymentMethodData = paymentMethodData;
        }

        public static /* synthetic */ PaymentMethodResult copy$default(PaymentMethodResult paymentMethodResult, String str, PaymentMethodData paymentMethodData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentMethodResult.email;
            }
            if ((i & 2) != 0) {
                paymentMethodData = paymentMethodResult.paymentMethodData;
            }
            return paymentMethodResult.copy(str, paymentMethodData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethodData getPaymentMethodData() {
            return this.paymentMethodData;
        }

        public final PaymentMethodResult copy(String email, PaymentMethodData paymentMethodData) {
            paymentMethodData.getClass();
            return new PaymentMethodResult(email, paymentMethodData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethodResult)) {
                return false;
            }
            PaymentMethodResult paymentMethodResult = (PaymentMethodResult) other;
            return Intrinsics.areEqual(this.email, paymentMethodResult.email) && Intrinsics.areEqual(this.paymentMethodData, paymentMethodResult.paymentMethodData);
        }

        public final String getEmail() {
            return this.email;
        }

        public final PaymentMethodData getPaymentMethodData() {
            return this.paymentMethodData;
        }

        public int hashCode() {
            String str = this.email;
            return this.paymentMethodData.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "PaymentMethodResult(email=" + this.email + ", paymentMethodData=" + this.paymentMethodData + ")";
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;", "", "CardInfo", "TokenizationData", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaymentMethodData {
            public final String description;
            public final CardInfo info;
            public final TokenizationData tokenizationData;

            /* renamed from: type, reason: collision with root package name */
            public final String f1138type;

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData$TokenizationData;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TokenizationData {
                public final String token;

                /* renamed from: type, reason: collision with root package name */
                public final String f1139type;

                public TokenizationData(String str, String str2) {
                    this.f1139type = str;
                    this.token = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TokenizationData)) {
                        return false;
                    }
                    TokenizationData tokenizationData = (TokenizationData) obj;
                    return this.f1139type.equals(tokenizationData.f1139type) && this.token.equals(tokenizationData.token);
                }

                public final int hashCode() {
                    return this.token.hashCode() + (this.f1139type.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("TokenizationData(type=", this.f1139type, ", token=", this.token, ")");
                }
            }

            public PaymentMethodData(String str, String str2, CardInfo cardInfo, TokenizationData tokenizationData) {
                this.f1138type = str;
                this.description = str2;
                this.info = cardInfo;
                this.tokenizationData = tokenizationData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentMethodData)) {
                    return false;
                }
                PaymentMethodData paymentMethodData = (PaymentMethodData) obj;
                return this.f1138type.equals(paymentMethodData.f1138type) && Intrinsics.areEqual(this.description, paymentMethodData.description) && this.info.equals(paymentMethodData.info) && this.tokenizationData.equals(paymentMethodData.tokenizationData);
            }

            public final int hashCode() {
                int hashCode = this.f1138type.hashCode() * 31;
                String str = this.description;
                return this.tokenizationData.hashCode() + ((this.info.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentMethodData(type=", this.f1138type, ", description=", this.description, ", info=");
                m.append(this.info);
                m.append(", tokenizationData=");
                m.append(this.tokenizationData);
                m.append(")");
                return m.toString();
            }

            @JsonClass(generateAdapter = true)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData$CardInfo;", "", "BillingAddress", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class CardInfo {
                public final BillingAddress billingAddress;
                public final String cardDetails;
                public final String cardNetwork;
                public final String cardType;

                @JsonClass(generateAdapter = true)
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData$CardInfo$BillingAddress;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class BillingAddress {
                    public final String address1;
                    public final String address2;
                    public final String address3;
                    public final String administrativeArea;
                    public final String countryCode;
                    public final String languageCode;
                    public final String locality;
                    public final String name;
                    public final String phoneNumber;
                    public final String postalCode;
                    public final String sortingCode;

                    public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
                        this.name = str;
                        this.address1 = str2;
                        this.address2 = str3;
                        this.address3 = str4;
                        this.locality = str5;
                        this.administrativeArea = str6;
                        this.postalCode = str7;
                        this.countryCode = str8;
                        this.phoneNumber = str9;
                        this.sortingCode = str10;
                        this.languageCode = str11;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof BillingAddress)) {
                            return false;
                        }
                        BillingAddress billingAddress = (BillingAddress) obj;
                        return Intrinsics.areEqual(this.name, billingAddress.name) && Intrinsics.areEqual(this.address1, billingAddress.address1) && Intrinsics.areEqual(this.address2, billingAddress.address2) && Intrinsics.areEqual(this.address3, billingAddress.address3) && Intrinsics.areEqual(this.locality, billingAddress.locality) && Intrinsics.areEqual(this.administrativeArea, billingAddress.administrativeArea) && Intrinsics.areEqual(this.postalCode, billingAddress.postalCode) && Intrinsics.areEqual(this.countryCode, billingAddress.countryCode) && Intrinsics.areEqual(this.phoneNumber, billingAddress.phoneNumber) && Intrinsics.areEqual(this.sortingCode, billingAddress.sortingCode) && Intrinsics.areEqual(this.languageCode, billingAddress.languageCode);
                    }

                    public final int hashCode() {
                        String str = this.name;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.address1;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.address2;
                        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.address3;
                        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                        String str5 = this.locality;
                        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                        String str6 = this.administrativeArea;
                        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                        String str7 = this.postalCode;
                        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                        String str8 = this.countryCode;
                        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                        String str9 = this.phoneNumber;
                        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                        String str10 = this.sortingCode;
                        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                        String str11 = this.languageCode;
                        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BillingAddress(name=", this.name, ", address1=", this.address1, ", address2=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.address2, ", address3=", this.address3, ", locality=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.locality, ", administrativeArea=", this.administrativeArea, ", postalCode=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.postalCode, ", countryCode=", this.countryCode, ", phoneNumber=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.phoneNumber, ", sortingCode=", this.sortingCode, ", languageCode=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.languageCode, ")");
                    }
                }

                public CardInfo(BillingAddress billingAddress, String str, String str2, String str3) {
                    str.getClass();
                    str2.getClass();
                    this.billingAddress = billingAddress;
                    this.cardDetails = str;
                    this.cardNetwork = str2;
                    this.cardType = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CardInfo)) {
                        return false;
                    }
                    CardInfo cardInfo = (CardInfo) obj;
                    return Intrinsics.areEqual(this.billingAddress, cardInfo.billingAddress) && Intrinsics.areEqual(this.cardDetails, cardInfo.cardDetails) && Intrinsics.areEqual(this.cardNetwork, cardInfo.cardNetwork) && Intrinsics.areEqual(this.cardType, cardInfo.cardType);
                }

                public final int hashCode() {
                    BillingAddress billingAddress = this.billingAddress;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((billingAddress == null ? 0 : billingAddress.hashCode()) * 31, 31, this.cardDetails), 31, this.cardNetwork);
                    String str = this.cardType;
                    return m + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CardInfo(billingAddress=");
                    sb.append(this.billingAddress);
                    sb.append(", cardDetails=");
                    sb.append(this.cardDetails);
                    sb.append(", cardNetwork=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cardNetwork, ", cardType=", this.cardType, ")");
                }

                public /* synthetic */ CardInfo(BillingAddress billingAddress, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(billingAddress, str, str2, (i & 8) != 0 ? null : str3);
                }
            }
        }
    }
}
