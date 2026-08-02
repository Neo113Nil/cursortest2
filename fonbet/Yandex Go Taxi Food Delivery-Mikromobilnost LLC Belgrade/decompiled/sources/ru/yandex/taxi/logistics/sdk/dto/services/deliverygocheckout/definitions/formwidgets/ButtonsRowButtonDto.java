package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto;", "", "width", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "payload", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;)V", "getWidth", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "getPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PayloadDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonsRowButtonDto {
    private final PayloadDto payload;
    private final ButtonsRowButtonWidthDto width;

    public ButtonsRowButtonDto(@Json(name = "width") ButtonsRowButtonWidthDto buttonsRowButtonWidthDto, @Json(name = "payload") PayloadDto payloadDto) {
        this.width = buttonsRowButtonWidthDto;
        this.payload = payloadDto;
    }

    public static /* synthetic */ ButtonsRowButtonDto copy$default(ButtonsRowButtonDto buttonsRowButtonDto, ButtonsRowButtonWidthDto buttonsRowButtonWidthDto, PayloadDto payloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonsRowButtonWidthDto = buttonsRowButtonDto.width;
        }
        if ((i & 2) != 0) {
            payloadDto = buttonsRowButtonDto.payload;
        }
        return buttonsRowButtonDto.copy(buttonsRowButtonWidthDto, payloadDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonsRowButtonWidthDto getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final PayloadDto getPayload() {
        return this.payload;
    }

    public final ButtonsRowButtonDto copy(@Json(name = "width") ButtonsRowButtonWidthDto width, @Json(name = "payload") PayloadDto payload) {
        return new ButtonsRowButtonDto(width, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsRowButtonDto)) {
            return false;
        }
        ButtonsRowButtonDto buttonsRowButtonDto = (ButtonsRowButtonDto) other;
        return jl40.l(this.width, buttonsRowButtonDto.width) && jl40.l(this.payload, buttonsRowButtonDto.payload);
    }

    public final PayloadDto getPayload() {
        return this.payload;
    }

    public final ButtonsRowButtonWidthDto getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.width.hashCode() * 31);
    }

    public String toString() {
        return "ButtonsRowButtonDto(width=" + this.width + ", payload=" + this.payload + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "", "Payload_PaymentButtonDto", "Payload_ActionButtonDto", "Unknown_PayloadDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Payload_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Payload_PaymentButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Unknown_PayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PayloadDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Payload_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Payload_ActionButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Payload_ActionButtonDto extends PayloadDto {
            public final String a;
            public final ActionButtonDto b;

            public Payload_ActionButtonDto(@Json(name = "type") String str, ActionButtonDto actionButtonDto) {
                this.a = str;
                this.b = actionButtonDto;
            }

            public final Payload_ActionButtonDto copy(@Json(name = "type") String type, ActionButtonDto value) {
                return new Payload_ActionButtonDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Payload_ActionButtonDto)) {
                    return false;
                }
                Payload_ActionButtonDto payload_ActionButtonDto = (Payload_ActionButtonDto) obj;
                return this.a.equals(payload_ActionButtonDto.a) && this.b.equals(payload_ActionButtonDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Payload_ActionButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Payload_PaymentButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Payload_PaymentButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Payload_PaymentButtonDto extends PayloadDto {
            public final String a;
            public final PaymentButtonWidgetDto b;

            public Payload_PaymentButtonDto(@Json(name = "type") String str, PaymentButtonWidgetDto paymentButtonWidgetDto) {
                this.a = str;
                this.b = paymentButtonWidgetDto;
            }

            public final Payload_PaymentButtonDto copy(@Json(name = "type") String type, PaymentButtonWidgetDto value) {
                return new Payload_PaymentButtonDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Payload_PaymentButtonDto)) {
                    return false;
                }
                Payload_PaymentButtonDto payload_PaymentButtonDto = (Payload_PaymentButtonDto) obj;
                return this.a.equals(payload_PaymentButtonDto.a) && this.b.equals(payload_PaymentButtonDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Payload_PaymentButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Unknown_PayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto$PayloadDto$Unknown_PayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_PayloadDto extends PayloadDto {
            public final String a;

            public Unknown_PayloadDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_PayloadDto copy(@Json(name = "type") String type) {
                return new Unknown_PayloadDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_PayloadDto) && jl40.l(this.a, ((Unknown_PayloadDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_PayloadDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_PayloadDto() {
                this(0);
            }

            public /* synthetic */ Unknown_PayloadDto(int i) {
                this("unknown");
            }
        }
    }
}
