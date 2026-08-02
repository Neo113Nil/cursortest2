package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000fHÆ\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u000e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\u000e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto;Ljava/lang/String;Ljava/lang/Object;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrollableItemDto {
    private final TapActionDto action;
    private final String backgroundColor;
    private final ScrollableItemBadgeDto badge;
    private final ImageDto image;
    private final Object meta;
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    public ScrollableItemDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "background_color") String str, @Json(name = "image") ImageDto imageDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "badge") ScrollableItemBadgeDto scrollableItemBadgeDto, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.backgroundColor = str;
        this.image = imageDto;
        this.action = tapActionDto;
        this.badge = scrollableItemBadgeDto;
        this.metricaLabel = str2;
        this.meta = obj;
    }

    public static /* synthetic */ ScrollableItemDto copy$default(ScrollableItemDto scrollableItemDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, String str, ImageDto imageDto, TapActionDto tapActionDto, ScrollableItemBadgeDto scrollableItemBadgeDto, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            attributedTextDto = scrollableItemDto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = scrollableItemDto.subtitle;
        }
        if ((i & 4) != 0) {
            str = scrollableItemDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            imageDto = scrollableItemDto.image;
        }
        if ((i & 16) != 0) {
            tapActionDto = scrollableItemDto.action;
        }
        if ((i & 32) != 0) {
            scrollableItemBadgeDto = scrollableItemDto.badge;
        }
        if ((i & 64) != 0) {
            str2 = scrollableItemDto.metricaLabel;
        }
        if ((i & 128) != 0) {
            obj = scrollableItemDto.meta;
        }
        String str3 = str2;
        Object obj3 = obj;
        TapActionDto tapActionDto2 = tapActionDto;
        ScrollableItemBadgeDto scrollableItemBadgeDto2 = scrollableItemBadgeDto;
        return scrollableItemDto.copy(attributedTextDto, attributedTextDto2, str, imageDto, tapActionDto2, scrollableItemBadgeDto2, str3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final ScrollableItemBadgeDto getBadge() {
        return this.badge;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final ScrollableItemDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "background_color") String backgroundColor, @Json(name = "image") ImageDto image, @Json(name = "action") TapActionDto action, @Json(name = "badge") ScrollableItemBadgeDto badge, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new ScrollableItemDto(title, subtitle, backgroundColor, image, action, badge, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableItemDto)) {
            return false;
        }
        ScrollableItemDto scrollableItemDto = (ScrollableItemDto) other;
        return jl40.l(this.title, scrollableItemDto.title) && jl40.l(this.subtitle, scrollableItemDto.subtitle) && jl40.l(this.backgroundColor, scrollableItemDto.backgroundColor) && jl40.l(this.image, scrollableItemDto.image) && jl40.l(this.action, scrollableItemDto.action) && jl40.l(this.badge, scrollableItemDto.badge) && jl40.l(this.metricaLabel, scrollableItemDto.metricaLabel) && jl40.l(this.meta, scrollableItemDto.meta);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ScrollableItemBadgeDto getBadge() {
        return this.badge;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (this.image.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode4 = (hashCode3 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        ScrollableItemBadgeDto scrollableItemBadgeDto = this.badge;
        int hashCode5 = (hashCode4 + (scrollableItemBadgeDto == null ? 0 : scrollableItemBadgeDto.hashCode())) * 31;
        String str2 = this.metricaLabel;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode6 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        String str = this.backgroundColor;
        ImageDto imageDto = this.image;
        TapActionDto tapActionDto = this.action;
        ScrollableItemBadgeDto scrollableItemBadgeDto = this.badge;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("ScrollableItemDto(title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", image=");
        sb.append(imageDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", badge=");
        sb.append(scrollableItemBadgeDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str2, ", meta=", obj, Extension.C_BRAKE);
    }
}
