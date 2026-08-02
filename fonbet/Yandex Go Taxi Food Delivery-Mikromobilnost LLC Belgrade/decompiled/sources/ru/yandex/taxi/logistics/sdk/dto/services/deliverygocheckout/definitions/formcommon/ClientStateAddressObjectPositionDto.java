package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ClientStateAddressObjectPositionDto;", "", "formStateKey", "", "addressPointType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ClientStateAddressObjectPositionDto$AddressPointTypeDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ClientStateAddressObjectPositionDto$AddressPointTypeDto;)V", "getFormStateKey", "()Ljava/lang/String;", "getAddressPointType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ClientStateAddressObjectPositionDto$AddressPointTypeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AddressPointTypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientStateAddressObjectPositionDto {
    private final AddressPointTypeDto addressPointType;
    private final String formStateKey;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ClientStateAddressObjectPositionDto$AddressPointTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "DESTINATION", Card.CARD_TYPE_TRANSIT, "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddressPointTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AddressPointTypeDto[] $VALUES;

        @Json(name = "source")
        public static final AddressPointTypeDto SOURCE = new AddressPointTypeDto("SOURCE", 0);

        @Json(name = "destination")
        public static final AddressPointTypeDto DESTINATION = new AddressPointTypeDto("DESTINATION", 1);

        @Json(name = "transit")
        public static final AddressPointTypeDto TRANSIT = new AddressPointTypeDto(Card.CARD_TYPE_TRANSIT, 2);

        private static final /* synthetic */ AddressPointTypeDto[] $values() {
            return new AddressPointTypeDto[]{SOURCE, DESTINATION, TRANSIT};
        }

        static {
            AddressPointTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private AddressPointTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AddressPointTypeDto valueOf(String str) {
            return (AddressPointTypeDto) Enum.valueOf(AddressPointTypeDto.class, str);
        }

        public static AddressPointTypeDto[] values() {
            return (AddressPointTypeDto[]) $VALUES.clone();
        }
    }

    public ClientStateAddressObjectPositionDto(@Json(name = "form_state_key") String str, @Json(name = "address_point_type") AddressPointTypeDto addressPointTypeDto) {
        this.formStateKey = str;
        this.addressPointType = addressPointTypeDto;
    }

    public static /* synthetic */ ClientStateAddressObjectPositionDto copy$default(ClientStateAddressObjectPositionDto clientStateAddressObjectPositionDto, String str, AddressPointTypeDto addressPointTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientStateAddressObjectPositionDto.formStateKey;
        }
        if ((i & 2) != 0) {
            addressPointTypeDto = clientStateAddressObjectPositionDto.addressPointType;
        }
        return clientStateAddressObjectPositionDto.copy(str, addressPointTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressPointTypeDto getAddressPointType() {
        return this.addressPointType;
    }

    public final ClientStateAddressObjectPositionDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "address_point_type") AddressPointTypeDto addressPointType) {
        return new ClientStateAddressObjectPositionDto(formStateKey, addressPointType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientStateAddressObjectPositionDto)) {
            return false;
        }
        ClientStateAddressObjectPositionDto clientStateAddressObjectPositionDto = (ClientStateAddressObjectPositionDto) other;
        return jl40.l(this.formStateKey, clientStateAddressObjectPositionDto.formStateKey) && this.addressPointType == clientStateAddressObjectPositionDto.addressPointType;
    }

    public final AddressPointTypeDto getAddressPointType() {
        return this.addressPointType;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public int hashCode() {
        return this.addressPointType.hashCode() + (this.formStateKey.hashCode() * 31);
    }

    public String toString() {
        return "ClientStateAddressObjectPositionDto(formStateKey=" + this.formStateKey + ", addressPointType=" + this.addressPointType + Extension.C_BRAKE;
    }
}
