package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "", "PaymentItem_LocalPaymentItemDto", "PaymentItem_RemotePaymentItemDto", "Unknown_PaymentItemDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$PaymentItem_LocalPaymentItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$PaymentItem_RemotePaymentItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$Unknown_PaymentItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class PaymentItemDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$PaymentItem_LocalPaymentItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/LocalPaymentItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/LocalPaymentItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/LocalPaymentItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$PaymentItem_LocalPaymentItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentItem_LocalPaymentItemDto extends PaymentItemDto {
        public final String a;
        public final LocalPaymentItemDto b;

        public PaymentItem_LocalPaymentItemDto(@Json(name = "type") String str, LocalPaymentItemDto localPaymentItemDto) {
            this.a = str;
            this.b = localPaymentItemDto;
        }

        public final PaymentItem_LocalPaymentItemDto copy(@Json(name = "type") String type, LocalPaymentItemDto value) {
            return new PaymentItem_LocalPaymentItemDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentItem_LocalPaymentItemDto)) {
                return false;
            }
            PaymentItem_LocalPaymentItemDto paymentItem_LocalPaymentItemDto = (PaymentItem_LocalPaymentItemDto) obj;
            return this.a.equals(paymentItem_LocalPaymentItemDto.a) && this.b.equals(paymentItem_LocalPaymentItemDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentItem_LocalPaymentItemDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$PaymentItem_RemotePaymentItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RemotePaymentItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RemotePaymentItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RemotePaymentItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$PaymentItem_RemotePaymentItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentItem_RemotePaymentItemDto extends PaymentItemDto {
        public final String a;
        public final RemotePaymentItemDto b;

        public PaymentItem_RemotePaymentItemDto(@Json(name = "type") String str, RemotePaymentItemDto remotePaymentItemDto) {
            this.a = str;
            this.b = remotePaymentItemDto;
        }

        public final PaymentItem_RemotePaymentItemDto copy(@Json(name = "type") String type, RemotePaymentItemDto value) {
            return new PaymentItem_RemotePaymentItemDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentItem_RemotePaymentItemDto)) {
                return false;
            }
            PaymentItem_RemotePaymentItemDto paymentItem_RemotePaymentItemDto = (PaymentItem_RemotePaymentItemDto) obj;
            return this.a.equals(paymentItem_RemotePaymentItemDto.a) && this.b.equals(paymentItem_RemotePaymentItemDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentItem_RemotePaymentItemDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$Unknown_PaymentItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto$Unknown_PaymentItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_PaymentItemDto extends PaymentItemDto {
        public final String a;

        public Unknown_PaymentItemDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_PaymentItemDto copy(@Json(name = "type") String type) {
            return new Unknown_PaymentItemDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_PaymentItemDto) && jl40.l(this.a, ((Unknown_PaymentItemDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_PaymentItemDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_PaymentItemDto() {
            this(0);
        }

        public /* synthetic */ Unknown_PaymentItemDto(int i) {
            this("unknown");
        }
    }
}
