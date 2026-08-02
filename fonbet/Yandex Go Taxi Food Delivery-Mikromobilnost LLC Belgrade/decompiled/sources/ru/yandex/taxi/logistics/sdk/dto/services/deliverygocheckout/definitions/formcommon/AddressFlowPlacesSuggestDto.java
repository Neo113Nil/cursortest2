package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto;", "", "mode", "", "cardsOverMapRevealing", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto$CardsOverMapRevealingDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto$CardsOverMapRevealingDto;)V", "getMode", "()Ljava/lang/String;", "getCardsOverMapRevealing", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto$CardsOverMapRevealingDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CardsOverMapRevealingDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressFlowPlacesSuggestDto {
    private final CardsOverMapRevealingDto cardsOverMapRevealing;
    private final String mode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowPlacesSuggestDto$CardsOverMapRevealingDto;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COMPACT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardsOverMapRevealingDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CardsOverMapRevealingDto[] $VALUES;

        @Json(name = "expanded")
        public static final CardsOverMapRevealingDto EXPANDED = new CardsOverMapRevealingDto("EXPANDED", 0);

        @Json(name = "compact")
        public static final CardsOverMapRevealingDto COMPACT = new CardsOverMapRevealingDto("COMPACT", 1);

        private static final /* synthetic */ CardsOverMapRevealingDto[] $values() {
            return new CardsOverMapRevealingDto[]{EXPANDED, COMPACT};
        }

        static {
            CardsOverMapRevealingDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private CardsOverMapRevealingDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CardsOverMapRevealingDto valueOf(String str) {
            return (CardsOverMapRevealingDto) Enum.valueOf(CardsOverMapRevealingDto.class, str);
        }

        public static CardsOverMapRevealingDto[] values() {
            return (CardsOverMapRevealingDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddressFlowPlacesSuggestDto(String str, CardsOverMapRevealingDto cardsOverMapRevealingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CardsOverMapRevealingDto.COMPACT : cardsOverMapRevealingDto);
    }

    public static /* synthetic */ AddressFlowPlacesSuggestDto copy$default(AddressFlowPlacesSuggestDto addressFlowPlacesSuggestDto, String str, CardsOverMapRevealingDto cardsOverMapRevealingDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressFlowPlacesSuggestDto.mode;
        }
        if ((i & 2) != 0) {
            cardsOverMapRevealingDto = addressFlowPlacesSuggestDto.cardsOverMapRevealing;
        }
        return addressFlowPlacesSuggestDto.copy(str, cardsOverMapRevealingDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final CardsOverMapRevealingDto getCardsOverMapRevealing() {
        return this.cardsOverMapRevealing;
    }

    public final AddressFlowPlacesSuggestDto copy(@Json(name = "mode") String mode, @Json(name = "cards_over_map_revealing") CardsOverMapRevealingDto cardsOverMapRevealing) {
        return new AddressFlowPlacesSuggestDto(mode, cardsOverMapRevealing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFlowPlacesSuggestDto)) {
            return false;
        }
        AddressFlowPlacesSuggestDto addressFlowPlacesSuggestDto = (AddressFlowPlacesSuggestDto) other;
        return jl40.l(this.mode, addressFlowPlacesSuggestDto.mode) && this.cardsOverMapRevealing == addressFlowPlacesSuggestDto.cardsOverMapRevealing;
    }

    public final CardsOverMapRevealingDto getCardsOverMapRevealing() {
        return this.cardsOverMapRevealing;
    }

    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.cardsOverMapRevealing.hashCode() + (this.mode.hashCode() * 31);
    }

    public String toString() {
        return "AddressFlowPlacesSuggestDto(mode=" + this.mode + ", cardsOverMapRevealing=" + this.cardsOverMapRevealing + Extension.C_BRAKE;
    }

    public AddressFlowPlacesSuggestDto(@Json(name = "mode") String str, @Json(name = "cards_over_map_revealing") CardsOverMapRevealingDto cardsOverMapRevealingDto) {
        this.mode = str;
        this.cardsOverMapRevealing = cardsOverMapRevealingDto;
    }
}
