package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto;", "", "mode", "", "pointIndex", "", "resultPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "cardsOverMapRevealing", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto$CardsOverMapRevealingDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto$CardsOverMapRevealingDto;)V", "getMode", "()Ljava/lang/String;", "getPointIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResultPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getCardsOverMapRevealing", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto$CardsOverMapRevealingDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto$CardsOverMapRevealingDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto;", "equals", "", "other", "hashCode", "toString", "CardsOverMapRevealingDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OpenPlacesSuggestActionDto {
    private final CardsOverMapRevealingDto cardsOverMapRevealing;
    private final String mode;
    private final Integer pointIndex;
    private final ResultPositionDto resultPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenPlacesSuggestActionDto$CardsOverMapRevealingDto;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COMPACT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public OpenPlacesSuggestActionDto(@Json(name = "mode") String str, @Json(name = "point_index") Integer num, @Json(name = "result_position") ResultPositionDto resultPositionDto, @Json(name = "cards_over_map_revealing") CardsOverMapRevealingDto cardsOverMapRevealingDto) {
        this.mode = str;
        this.pointIndex = num;
        this.resultPosition = resultPositionDto;
        this.cardsOverMapRevealing = cardsOverMapRevealingDto;
    }

    public static /* synthetic */ OpenPlacesSuggestActionDto copy$default(OpenPlacesSuggestActionDto openPlacesSuggestActionDto, String str, Integer num, ResultPositionDto resultPositionDto, CardsOverMapRevealingDto cardsOverMapRevealingDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openPlacesSuggestActionDto.mode;
        }
        if ((i & 2) != 0) {
            num = openPlacesSuggestActionDto.pointIndex;
        }
        if ((i & 4) != 0) {
            resultPositionDto = openPlacesSuggestActionDto.resultPosition;
        }
        if ((i & 8) != 0) {
            cardsOverMapRevealingDto = openPlacesSuggestActionDto.cardsOverMapRevealing;
        }
        return openPlacesSuggestActionDto.copy(str, num, resultPositionDto, cardsOverMapRevealingDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPointIndex() {
        return this.pointIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final CardsOverMapRevealingDto getCardsOverMapRevealing() {
        return this.cardsOverMapRevealing;
    }

    public final OpenPlacesSuggestActionDto copy(@Json(name = "mode") String mode, @Json(name = "point_index") Integer pointIndex, @Json(name = "result_position") ResultPositionDto resultPosition, @Json(name = "cards_over_map_revealing") CardsOverMapRevealingDto cardsOverMapRevealing) {
        return new OpenPlacesSuggestActionDto(mode, pointIndex, resultPosition, cardsOverMapRevealing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPlacesSuggestActionDto)) {
            return false;
        }
        OpenPlacesSuggestActionDto openPlacesSuggestActionDto = (OpenPlacesSuggestActionDto) other;
        return jl40.l(this.mode, openPlacesSuggestActionDto.mode) && jl40.l(this.pointIndex, openPlacesSuggestActionDto.pointIndex) && jl40.l(this.resultPosition, openPlacesSuggestActionDto.resultPosition) && this.cardsOverMapRevealing == openPlacesSuggestActionDto.cardsOverMapRevealing;
    }

    public final CardsOverMapRevealingDto getCardsOverMapRevealing() {
        return this.cardsOverMapRevealing;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Integer getPointIndex() {
        return this.pointIndex;
    }

    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        Integer num = this.pointIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ResultPositionDto resultPositionDto = this.resultPosition;
        return this.cardsOverMapRevealing.hashCode() + ((hashCode2 + (resultPositionDto != null ? resultPositionDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.mode;
        Integer num = this.pointIndex;
        ResultPositionDto resultPositionDto = this.resultPosition;
        CardsOverMapRevealingDto cardsOverMapRevealingDto = this.cardsOverMapRevealing;
        StringBuilder q = n.q("OpenPlacesSuggestActionDto(mode=", num, str, ", pointIndex=", ", resultPosition=");
        q.append(resultPositionDto);
        q.append(", cardsOverMapRevealing=");
        q.append(cardsOverMapRevealingDto);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public /* synthetic */ OpenPlacesSuggestActionDto(String str, Integer num, ResultPositionDto resultPositionDto, CardsOverMapRevealingDto cardsOverMapRevealingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, resultPositionDto, (i & 8) != 0 ? CardsOverMapRevealingDto.COMPACT : cardsOverMapRevealingDto);
    }
}
