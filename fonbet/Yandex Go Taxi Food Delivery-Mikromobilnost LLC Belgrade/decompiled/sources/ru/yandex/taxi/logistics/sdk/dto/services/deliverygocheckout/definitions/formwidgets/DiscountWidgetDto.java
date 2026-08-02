package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000eHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DiscountWidgetDto;", "", "widgetId", "", "leadImage", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "trailImage", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/Object;)V", "getWidgetId", "()Ljava/lang/String;", "getLeadImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getBackgroundColor", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getTrailImage", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DiscountWidgetDto {
    private final TapActionDto action;
    private final String backgroundColor;
    private final ImageDto leadImage;
    private final Object meta;
    private final String metricaLabel;
    private final AttributedTextDto text;
    private final ImageDto trailImage;
    private final String widgetId;

    public DiscountWidgetDto(@Json(name = "widget_id") String str, @Json(name = "lead_image") ImageDto imageDto, @Json(name = "background_color") String str2, @Json(name = "text") AttributedTextDto attributedTextDto, @Json(name = "trail_image") ImageDto imageDto2, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str3, @Json(name = "meta") Object obj) {
        this.widgetId = str;
        this.leadImage = imageDto;
        this.backgroundColor = str2;
        this.text = attributedTextDto;
        this.trailImage = imageDto2;
        this.action = tapActionDto;
        this.metricaLabel = str3;
        this.meta = obj;
    }

    public static /* synthetic */ DiscountWidgetDto copy$default(DiscountWidgetDto discountWidgetDto, String str, ImageDto imageDto, String str2, AttributedTextDto attributedTextDto, ImageDto imageDto2, TapActionDto tapActionDto, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = discountWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            imageDto = discountWidgetDto.leadImage;
        }
        if ((i & 4) != 0) {
            str2 = discountWidgetDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            attributedTextDto = discountWidgetDto.text;
        }
        if ((i & 16) != 0) {
            imageDto2 = discountWidgetDto.trailImage;
        }
        if ((i & 32) != 0) {
            tapActionDto = discountWidgetDto.action;
        }
        if ((i & 64) != 0) {
            str3 = discountWidgetDto.metricaLabel;
        }
        if ((i & 128) != 0) {
            obj = discountWidgetDto.meta;
        }
        String str4 = str3;
        Object obj3 = obj;
        ImageDto imageDto3 = imageDto2;
        TapActionDto tapActionDto2 = tapActionDto;
        return discountWidgetDto.copy(str, imageDto, str2, attributedTextDto, imageDto3, tapActionDto2, str4, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDto getLeadImage() {
        return this.leadImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final ImageDto getTrailImage() {
        return this.trailImage;
    }

    /* renamed from: component6, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final DiscountWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "lead_image") ImageDto leadImage, @Json(name = "background_color") String backgroundColor, @Json(name = "text") AttributedTextDto text, @Json(name = "trail_image") ImageDto trailImage, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new DiscountWidgetDto(widgetId, leadImage, backgroundColor, text, trailImage, action, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountWidgetDto)) {
            return false;
        }
        DiscountWidgetDto discountWidgetDto = (DiscountWidgetDto) other;
        return jl40.l(this.widgetId, discountWidgetDto.widgetId) && jl40.l(this.leadImage, discountWidgetDto.leadImage) && jl40.l(this.backgroundColor, discountWidgetDto.backgroundColor) && jl40.l(this.text, discountWidgetDto.text) && jl40.l(this.trailImage, discountWidgetDto.trailImage) && jl40.l(this.action, discountWidgetDto.action) && jl40.l(this.metricaLabel, discountWidgetDto.metricaLabel) && jl40.l(this.meta, discountWidgetDto.meta);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ImageDto getLeadImage() {
        return this.leadImage;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AttributedTextDto getText() {
        return this.text;
    }

    public final ImageDto getTrailImage() {
        return this.trailImage;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        ImageDto imageDto = this.leadImage;
        int e = ly3.e(this.text, unr0.b((hashCode + (imageDto == null ? 0 : imageDto.hashCode())) * 31, 31, this.backgroundColor), 31);
        ImageDto imageDto2 = this.trailImage;
        int hashCode2 = (e + (imageDto2 == null ? 0 : imageDto2.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode3 = (hashCode2 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        ImageDto imageDto = this.leadImage;
        String str2 = this.backgroundColor;
        AttributedTextDto attributedTextDto = this.text;
        ImageDto imageDto2 = this.trailImage;
        TapActionDto tapActionDto = this.action;
        String str3 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("DiscountWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", leadImage=");
        sb.append(imageDto);
        sb.append(", backgroundColor=");
        sb.append(str2);
        sb.append(", text=");
        sb.append(attributedTextDto);
        sb.append(", trailImage=");
        sb.append(imageDto2);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str3, ", meta=", obj, Extension.C_BRAKE);
    }
}
