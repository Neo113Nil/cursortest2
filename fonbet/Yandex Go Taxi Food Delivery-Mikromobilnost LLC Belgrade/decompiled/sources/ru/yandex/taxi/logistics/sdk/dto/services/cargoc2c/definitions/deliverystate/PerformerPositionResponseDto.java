package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.gpssignal.definitions.GpsPositionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto;", "", "position", "Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;", "pin", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "bubbleText", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;Ljava/lang/String;)V", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;", "getPin", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "getBubbleText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PinDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PerformerPositionResponseDto {
    private final String bubbleText;
    private final PinDto pin;
    private final GpsPositionDto position;

    public PerformerPositionResponseDto(@Json(name = "position") GpsPositionDto gpsPositionDto, @Json(name = "pin") PinDto pinDto, @Json(name = "bubble_text") String str) {
        this.position = gpsPositionDto;
        this.pin = pinDto;
        this.bubbleText = str;
    }

    public static /* synthetic */ PerformerPositionResponseDto copy$default(PerformerPositionResponseDto performerPositionResponseDto, GpsPositionDto gpsPositionDto, PinDto pinDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            gpsPositionDto = performerPositionResponseDto.position;
        }
        if ((i & 2) != 0) {
            pinDto = performerPositionResponseDto.pin;
        }
        if ((i & 4) != 0) {
            str = performerPositionResponseDto.bubbleText;
        }
        return performerPositionResponseDto.copy(gpsPositionDto, pinDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final GpsPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final PinDto getPin() {
        return this.pin;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final PerformerPositionResponseDto copy(@Json(name = "position") GpsPositionDto position, @Json(name = "pin") PinDto pin, @Json(name = "bubble_text") String bubbleText) {
        return new PerformerPositionResponseDto(position, pin, bubbleText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformerPositionResponseDto)) {
            return false;
        }
        PerformerPositionResponseDto performerPositionResponseDto = (PerformerPositionResponseDto) other;
        return jl40.l(this.position, performerPositionResponseDto.position) && jl40.l(this.pin, performerPositionResponseDto.pin) && jl40.l(this.bubbleText, performerPositionResponseDto.bubbleText);
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final PinDto getPin() {
        return this.pin;
    }

    public final GpsPositionDto getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = this.position.hashCode() * 31;
        PinDto pinDto = this.pin;
        int hashCode2 = (hashCode + (pinDto == null ? 0 : pinDto.hashCode())) * 31;
        String str = this.bubbleText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        GpsPositionDto gpsPositionDto = this.position;
        PinDto pinDto = this.pin;
        String str = this.bubbleText;
        StringBuilder sb = new StringBuilder("PerformerPositionResponseDto(position=");
        sb.append(gpsPositionDto);
        sb.append(", pin=");
        sb.append(pinDto);
        sb.append(", bubbleText=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "", "Pin_DefaultDto", "Pin_LoadableDto", "Unknown_PinDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Pin_DefaultDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Pin_LoadableDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Unknown_PinDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PinDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Pin_DefaultDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinDefaultDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinDefaultDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinDefaultDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Pin_DefaultDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pin_DefaultDto extends PinDto {
            public final String a;
            public final PerformerPinDefaultDto b;

            public Pin_DefaultDto(@Json(name = "type") String str, PerformerPinDefaultDto performerPinDefaultDto) {
                this.a = str;
                this.b = performerPinDefaultDto;
            }

            /* renamed from: a, reason: from getter */
            public final PerformerPinDefaultDto getB() {
                return this.b;
            }

            public final Pin_DefaultDto copy(@Json(name = "type") String type, PerformerPinDefaultDto value) {
                return new Pin_DefaultDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pin_DefaultDto)) {
                    return false;
                }
                Pin_DefaultDto pin_DefaultDto = (Pin_DefaultDto) obj;
                return this.a.equals(pin_DefaultDto.a) && this.b.equals(pin_DefaultDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Pin_DefaultDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Pin_LoadableDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Pin_LoadableDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pin_LoadableDto extends PinDto {
            public final String a;
            public final PerformerPinLoadableDto b;

            public Pin_LoadableDto(@Json(name = "type") String str, PerformerPinLoadableDto performerPinLoadableDto) {
                this.a = str;
                this.b = performerPinLoadableDto;
            }

            /* renamed from: a, reason: from getter */
            public final PerformerPinLoadableDto getB() {
                return this.b;
            }

            public final Pin_LoadableDto copy(@Json(name = "type") String type, PerformerPinLoadableDto value) {
                return new Pin_LoadableDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pin_LoadableDto)) {
                    return false;
                }
                Pin_LoadableDto pin_LoadableDto = (Pin_LoadableDto) obj;
                return this.a.equals(pin_LoadableDto.a) && this.b.equals(pin_LoadableDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Pin_LoadableDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Unknown_PinDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPositionResponseDto$PinDto$Unknown_PinDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_PinDto extends PinDto {
            public final String a;

            public Unknown_PinDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_PinDto copy(@Json(name = "type") String type) {
                return new Unknown_PinDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_PinDto) && jl40.l(this.a, ((Unknown_PinDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_PinDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_PinDto() {
                this(0);
            }

            public /* synthetic */ Unknown_PinDto(int i) {
                this("unknown");
            }
        }
    }
}
