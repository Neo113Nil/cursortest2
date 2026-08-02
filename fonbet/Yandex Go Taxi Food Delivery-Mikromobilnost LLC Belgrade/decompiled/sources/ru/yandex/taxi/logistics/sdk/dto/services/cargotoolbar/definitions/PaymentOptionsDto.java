package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto;", "", "paymentType", "", "paymentId", "alertPopup", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto$AlertPopupDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto$AlertPopupDto;)V", "getPaymentType", "()Ljava/lang/String;", "getPaymentId", "getAlertPopup", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto$AlertPopupDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AlertPopupDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentOptionsDto {
    private final AlertPopupDto alertPopup;
    private final String paymentId;
    private final String paymentType;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto$AlertPopupDto;", "", "title", "", Constants.KEY_MESSAGE, "primaryButtonText", "secondaryButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getPrimaryButtonText", "getSecondaryButtonText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlertPopupDto {
        private final String message;
        private final String primaryButtonText;
        private final String secondaryButtonText;
        private final String title;

        public AlertPopupDto(@Json(name = "title") String str, @Json(name = "message") String str2, @Json(name = "primary_button_text") String str3, @Json(name = "secondary_button_text") String str4) {
            this.title = str;
            this.message = str2;
            this.primaryButtonText = str3;
            this.secondaryButtonText = str4;
        }

        public static /* synthetic */ AlertPopupDto copy$default(AlertPopupDto alertPopupDto, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alertPopupDto.title;
            }
            if ((i & 2) != 0) {
                str2 = alertPopupDto.message;
            }
            if ((i & 4) != 0) {
                str3 = alertPopupDto.primaryButtonText;
            }
            if ((i & 8) != 0) {
                str4 = alertPopupDto.secondaryButtonText;
            }
            return alertPopupDto.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public final AlertPopupDto copy(@Json(name = "title") String title, @Json(name = "message") String message, @Json(name = "primary_button_text") String primaryButtonText, @Json(name = "secondary_button_text") String secondaryButtonText) {
            return new AlertPopupDto(title, message, primaryButtonText, secondaryButtonText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertPopupDto)) {
                return false;
            }
            AlertPopupDto alertPopupDto = (AlertPopupDto) other;
            return jl40.l(this.title, alertPopupDto.title) && jl40.l(this.message, alertPopupDto.message) && jl40.l(this.primaryButtonText, alertPopupDto.primaryButtonText) && jl40.l(this.secondaryButtonText, alertPopupDto.secondaryButtonText);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        public final String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.message;
            int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.primaryButtonText);
            String str2 = this.secondaryButtonText;
            return b + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.message;
            return g8e.r(b64.v("AlertPopupDto(title=", str, ", message=", str2, ", primaryButtonText="), this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, Extension.C_BRAKE);
        }
    }

    public PaymentOptionsDto(@Json(name = "payment_type") String str, @Json(name = "payment_id") String str2, @Json(name = "alert_popup") AlertPopupDto alertPopupDto) {
        this.paymentType = str;
        this.paymentId = str2;
        this.alertPopup = alertPopupDto;
    }

    public static /* synthetic */ PaymentOptionsDto copy$default(PaymentOptionsDto paymentOptionsDto, String str, String str2, AlertPopupDto alertPopupDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentOptionsDto.paymentType;
        }
        if ((i & 2) != 0) {
            str2 = paymentOptionsDto.paymentId;
        }
        if ((i & 4) != 0) {
            alertPopupDto = paymentOptionsDto.alertPopup;
        }
        return paymentOptionsDto.copy(str, str2, alertPopupDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component3, reason: from getter */
    public final AlertPopupDto getAlertPopup() {
        return this.alertPopup;
    }

    public final PaymentOptionsDto copy(@Json(name = "payment_type") String paymentType, @Json(name = "payment_id") String paymentId, @Json(name = "alert_popup") AlertPopupDto alertPopup) {
        return new PaymentOptionsDto(paymentType, paymentId, alertPopup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOptionsDto)) {
            return false;
        }
        PaymentOptionsDto paymentOptionsDto = (PaymentOptionsDto) other;
        return jl40.l(this.paymentType, paymentOptionsDto.paymentType) && jl40.l(this.paymentId, paymentOptionsDto.paymentId) && jl40.l(this.alertPopup, paymentOptionsDto.alertPopup);
    }

    public final AlertPopupDto getAlertPopup() {
        return this.alertPopup;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public int hashCode() {
        int b = unr0.b(this.paymentType.hashCode() * 31, 31, this.paymentId);
        AlertPopupDto alertPopupDto = this.alertPopup;
        return b + (alertPopupDto == null ? 0 : alertPopupDto.hashCode());
    }

    public String toString() {
        String str = this.paymentType;
        String str2 = this.paymentId;
        AlertPopupDto alertPopupDto = this.alertPopup;
        StringBuilder v = b64.v("PaymentOptionsDto(paymentType=", str, ", paymentId=", str2, ", alertPopup=");
        v.append(alertPopupDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
