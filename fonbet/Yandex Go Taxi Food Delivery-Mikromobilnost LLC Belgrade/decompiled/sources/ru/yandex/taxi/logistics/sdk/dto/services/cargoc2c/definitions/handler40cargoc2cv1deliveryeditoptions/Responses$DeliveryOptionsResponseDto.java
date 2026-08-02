package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryeditoptions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ConfirmationWindowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.StoragePeriodOptionsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001d\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001f"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;", "deliveryOptions", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;)V", "component1", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;", "component2", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto;", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;", "getAction", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;", "getDeliveryOptions", "ActionDto", "DeliveryOptionsDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DeliveryOptionsResponseDto {
    private final ActionDto action;
    private final DeliveryOptionsDto deliveryOptions;

    public Responses$DeliveryOptionsResponseDto(@Json(name = "action") ActionDto actionDto, @Json(name = "delivery_options") DeliveryOptionsDto deliveryOptionsDto) {
        this.action = actionDto;
        this.deliveryOptions = deliveryOptionsDto;
    }

    public static /* synthetic */ Responses$DeliveryOptionsResponseDto copy$default(Responses$DeliveryOptionsResponseDto responses$DeliveryOptionsResponseDto, ActionDto actionDto, DeliveryOptionsDto deliveryOptionsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            actionDto = responses$DeliveryOptionsResponseDto.action;
        }
        if ((i & 2) != 0) {
            deliveryOptionsDto = responses$DeliveryOptionsResponseDto.deliveryOptions;
        }
        return responses$DeliveryOptionsResponseDto.copy(actionDto, deliveryOptionsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final DeliveryOptionsDto getDeliveryOptions() {
        return this.deliveryOptions;
    }

    public final Responses$DeliveryOptionsResponseDto copy(@Json(name = "action") ActionDto action, @Json(name = "delivery_options") DeliveryOptionsDto deliveryOptions) {
        return new Responses$DeliveryOptionsResponseDto(action, deliveryOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Responses$DeliveryOptionsResponseDto)) {
            return false;
        }
        Responses$DeliveryOptionsResponseDto responses$DeliveryOptionsResponseDto = (Responses$DeliveryOptionsResponseDto) other;
        return jl40.l(this.action, responses$DeliveryOptionsResponseDto.action) && jl40.l(this.deliveryOptions, responses$DeliveryOptionsResponseDto.deliveryOptions);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final DeliveryOptionsDto getDeliveryOptions() {
        return this.deliveryOptions;
    }

    public int hashCode() {
        ActionDto actionDto = this.action;
        return this.deliveryOptions.hashCode() + ((actionDto == null ? 0 : actionDto.hashCode()) * 31);
    }

    public String toString() {
        return "DeliveryOptionsResponseDto(action=" + this.action + ", deliveryOptions=" + this.deliveryOptions + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;", "", "Action_ConfirmationWindowDto", "Unknown_ActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto$Action_ConfirmationWindowDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto$Unknown_ActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ActionDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto$Action_ConfirmationWindowDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ConfirmationWindowDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ConfirmationWindowDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ConfirmationWindowDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto$Action_ConfirmationWindowDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action_ConfirmationWindowDto extends ActionDto {
            public final String a;
            public final ConfirmationWindowDto b;

            public Action_ConfirmationWindowDto(@Json(name = "type") String str, ConfirmationWindowDto confirmationWindowDto) {
                this.a = str;
                this.b = confirmationWindowDto;
            }

            public final Action_ConfirmationWindowDto copy(@Json(name = "type") String type, ConfirmationWindowDto value) {
                return new Action_ConfirmationWindowDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action_ConfirmationWindowDto)) {
                    return false;
                }
                Action_ConfirmationWindowDto action_ConfirmationWindowDto = (Action_ConfirmationWindowDto) obj;
                return this.a.equals(action_ConfirmationWindowDto.a) && this.b.equals(action_ConfirmationWindowDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Action_ConfirmationWindowDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto$Unknown_ActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$ActionDto$Unknown_ActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ActionDto extends ActionDto {
            public final String a;

            public Unknown_ActionDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ActionDto copy(@Json(name = "type") String type) {
                return new Unknown_ActionDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ActionDto) && jl40.l(this.a, ((Unknown_ActionDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ActionDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ActionDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ActionDto(int i) {
                this("unknown");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;", "", "DeliveryOptions_StorageOptionsDto", "Unknown_DeliveryOptionsDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto$DeliveryOptions_StorageOptionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto$Unknown_DeliveryOptionsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DeliveryOptionsDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto$DeliveryOptions_StorageOptionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/StoragePeriodOptionsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/StoragePeriodOptionsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/StoragePeriodOptionsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto$DeliveryOptions_StorageOptionsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DeliveryOptions_StorageOptionsDto extends DeliveryOptionsDto {
            public final String a;
            public final StoragePeriodOptionsDto b;

            public DeliveryOptions_StorageOptionsDto(@Json(name = "type") String str, StoragePeriodOptionsDto storagePeriodOptionsDto) {
                this.a = str;
                this.b = storagePeriodOptionsDto;
            }

            public final DeliveryOptions_StorageOptionsDto copy(@Json(name = "type") String type, StoragePeriodOptionsDto value) {
                return new DeliveryOptions_StorageOptionsDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeliveryOptions_StorageOptionsDto)) {
                    return false;
                }
                DeliveryOptions_StorageOptionsDto deliveryOptions_StorageOptionsDto = (DeliveryOptions_StorageOptionsDto) obj;
                return this.a.equals(deliveryOptions_StorageOptionsDto.a) && this.b.equals(deliveryOptions_StorageOptionsDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "DeliveryOptions_StorageOptionsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto$Unknown_DeliveryOptionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryeditoptions/Responses$DeliveryOptionsResponseDto$DeliveryOptionsDto$Unknown_DeliveryOptionsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_DeliveryOptionsDto extends DeliveryOptionsDto {
            public final String a;

            public Unknown_DeliveryOptionsDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_DeliveryOptionsDto copy(@Json(name = "type") String type) {
                return new Unknown_DeliveryOptionsDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_DeliveryOptionsDto) && jl40.l(this.a, ((Unknown_DeliveryOptionsDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_DeliveryOptionsDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_DeliveryOptionsDto() {
                this(0);
            }

            public /* synthetic */ Unknown_DeliveryOptionsDto(int i) {
                this("unknown");
            }
        }
    }
}
