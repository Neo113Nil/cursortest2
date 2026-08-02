package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto;", "", "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "anchor", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto$AnchorDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto$AnchorDto;)V", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getBackgroundColor", "()Ljava/lang/String;", "getAnchor", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto$AnchorDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AnchorDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrollableItemBadgeDto {
    private final AnchorDto anchor;
    private final String backgroundColor;
    private final AttributedTextDto text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto$AnchorDto;", "", "<init>", "(Ljava/lang/String;I)V", "TRAILING", "LEADING", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnchorDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnchorDto[] $VALUES;

        @Json(name = "trailing")
        public static final AnchorDto TRAILING = new AnchorDto("TRAILING", 0);

        @Json(name = "leading")
        public static final AnchorDto LEADING = new AnchorDto("LEADING", 1);

        private static final /* synthetic */ AnchorDto[] $values() {
            return new AnchorDto[]{TRAILING, LEADING};
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

    public ScrollableItemBadgeDto(@Json(name = "text") AttributedTextDto attributedTextDto, @Json(name = "background_color") String str, @Json(name = "anchor") AnchorDto anchorDto) {
        this.text = attributedTextDto;
        this.backgroundColor = str;
        this.anchor = anchorDto;
    }

    public static /* synthetic */ ScrollableItemBadgeDto copy$default(ScrollableItemBadgeDto scrollableItemBadgeDto, AttributedTextDto attributedTextDto, String str, AnchorDto anchorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = scrollableItemBadgeDto.text;
        }
        if ((i & 2) != 0) {
            str = scrollableItemBadgeDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            anchorDto = scrollableItemBadgeDto.anchor;
        }
        return scrollableItemBadgeDto.copy(attributedTextDto, str, anchorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final ScrollableItemBadgeDto copy(@Json(name = "text") AttributedTextDto text, @Json(name = "background_color") String backgroundColor, @Json(name = "anchor") AnchorDto anchor) {
        return new ScrollableItemBadgeDto(text, backgroundColor, anchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableItemBadgeDto)) {
            return false;
        }
        ScrollableItemBadgeDto scrollableItemBadgeDto = (ScrollableItemBadgeDto) other;
        return jl40.l(this.text, scrollableItemBadgeDto.text) && jl40.l(this.backgroundColor, scrollableItemBadgeDto.backgroundColor) && this.anchor == scrollableItemBadgeDto.anchor;
    }

    public final AnchorDto getAnchor() {
        return this.anchor;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AttributedTextDto getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnchorDto anchorDto = this.anchor;
        return hashCode2 + (anchorDto != null ? anchorDto.hashCode() : 0);
    }

    public String toString() {
        return "ScrollableItemBadgeDto(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", anchor=" + this.anchor + Extension.C_BRAKE;
    }
}
