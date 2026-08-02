package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto;", "", "text", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "textColor", "anchor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto$AnchorDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto$AnchorDto;)V", "getText", "()Ljava/lang/String;", "getBackgroundColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getTextColor", "getAnchor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto$AnchorDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AnchorDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CornerBadgeDto {
    private final AnchorDto anchor;
    private final ColorDto backgroundColor;
    private final String text;
    private final ColorDto textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CornerBadgeDto$AnchorDto;", "", "<init>", "(Ljava/lang/String;I)V", "UPPER_RIGHT", "LOWER_RIGHT", "UPPER_LEFT", "LOWER_LEFT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnchorDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnchorDto[] $VALUES;

        @Json(name = "upper-right")
        public static final AnchorDto UPPER_RIGHT = new AnchorDto("UPPER_RIGHT", 0);

        @Json(name = "lower-right")
        public static final AnchorDto LOWER_RIGHT = new AnchorDto("LOWER_RIGHT", 1);

        @Json(name = "upper-left")
        public static final AnchorDto UPPER_LEFT = new AnchorDto("UPPER_LEFT", 2);

        @Json(name = "lower-left")
        public static final AnchorDto LOWER_LEFT = new AnchorDto("LOWER_LEFT", 3);

        private static final /* synthetic */ AnchorDto[] $values() {
            return new AnchorDto[]{UPPER_RIGHT, LOWER_RIGHT, UPPER_LEFT, LOWER_LEFT};
        }

        static {
            AnchorDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnchorDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AnchorDto valueOf(String str) {
            return (AnchorDto) Enum.valueOf(AnchorDto.class, str);
        }

        public static AnchorDto[] values() {
            return (AnchorDto[]) $VALUES.clone();
        }
    }

    public CornerBadgeDto(@Json(name = "text") String str, @Json(name = "background_color") ColorDto colorDto, @Json(name = "text_color") ColorDto colorDto2, @Json(name = "anchor") AnchorDto anchorDto) {
        this.text = str;
        this.backgroundColor = colorDto;
        this.textColor = colorDto2;
        this.anchor = anchorDto;
    }

    public static /* synthetic */ CornerBadgeDto copy$default(CornerBadgeDto cornerBadgeDto, String str, ColorDto colorDto, ColorDto colorDto2, AnchorDto anchorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cornerBadgeDto.text;
        }
        if ((i & 2) != 0) {
            colorDto = cornerBadgeDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            colorDto2 = cornerBadgeDto.textColor;
        }
        if ((i & 8) != 0) {
            anchorDto = cornerBadgeDto.anchor;
        }
        return cornerBadgeDto.copy(str, colorDto, colorDto2, anchorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorDto getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorDto getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final CornerBadgeDto copy(@Json(name = "text") String text, @Json(name = "background_color") ColorDto backgroundColor, @Json(name = "text_color") ColorDto textColor, @Json(name = "anchor") AnchorDto anchor) {
        return new CornerBadgeDto(text, backgroundColor, textColor, anchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CornerBadgeDto)) {
            return false;
        }
        CornerBadgeDto cornerBadgeDto = (CornerBadgeDto) other;
        return jl40.l(this.text, cornerBadgeDto.text) && jl40.l(this.backgroundColor, cornerBadgeDto.backgroundColor) && jl40.l(this.textColor, cornerBadgeDto.textColor) && this.anchor == cornerBadgeDto.anchor;
    }

    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final ColorDto getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getText() {
        return this.text;
    }

    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        ColorDto colorDto = this.backgroundColor;
        int hashCode2 = (hashCode + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        ColorDto colorDto2 = this.textColor;
        int hashCode3 = (hashCode2 + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
        AnchorDto anchorDto = this.anchor;
        return hashCode3 + (anchorDto != null ? anchorDto.hashCode() : 0);
    }

    public String toString() {
        return "CornerBadgeDto(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", anchor=" + this.anchor + Extension.C_BRAKE;
    }
}
