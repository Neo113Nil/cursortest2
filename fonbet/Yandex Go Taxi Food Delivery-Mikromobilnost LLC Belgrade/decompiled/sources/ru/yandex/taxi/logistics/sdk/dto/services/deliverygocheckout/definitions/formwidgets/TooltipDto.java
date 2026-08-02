package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto;", "", "text", "", "position", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto$PositionDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto$PositionDto;)V", "getText", "()Ljava/lang/String;", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto$PositionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PositionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TooltipDto {
    private final PositionDto position;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TooltipDto$PositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "BELOW", "ABOVE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PositionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PositionDto[] $VALUES;

        @Json(name = "below")
        public static final PositionDto BELOW = new PositionDto("BELOW", 0);

        @Json(name = "above")
        public static final PositionDto ABOVE = new PositionDto("ABOVE", 1);

        private static final /* synthetic */ PositionDto[] $values() {
            return new PositionDto[]{BELOW, ABOVE};
        }

        static {
            PositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PositionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PositionDto valueOf(String str) {
            return (PositionDto) Enum.valueOf(PositionDto.class, str);
        }

        public static PositionDto[] values() {
            return (PositionDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TooltipDto(String str, PositionDto positionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? PositionDto.BELOW : positionDto);
    }

    public static /* synthetic */ TooltipDto copy$default(TooltipDto tooltipDto, String str, PositionDto positionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tooltipDto.text;
        }
        if ((i & 2) != 0) {
            positionDto = tooltipDto.position;
        }
        return tooltipDto.copy(str, positionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionDto getPosition() {
        return this.position;
    }

    public final TooltipDto copy(@Json(name = "text") String text, @Json(name = "position") PositionDto position) {
        return new TooltipDto(text, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipDto)) {
            return false;
        }
        TooltipDto tooltipDto = (TooltipDto) other;
        return jl40.l(this.text, tooltipDto.text) && this.position == tooltipDto.position;
    }

    public final PositionDto getPosition() {
        return this.position;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.position.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "TooltipDto(text=" + this.text + ", position=" + this.position + Extension.C_BRAKE;
    }

    public TooltipDto(@Json(name = "text") String str, @Json(name = "position") PositionDto positionDto) {
        this.text = str;
        this.position = positionDto;
    }
}
