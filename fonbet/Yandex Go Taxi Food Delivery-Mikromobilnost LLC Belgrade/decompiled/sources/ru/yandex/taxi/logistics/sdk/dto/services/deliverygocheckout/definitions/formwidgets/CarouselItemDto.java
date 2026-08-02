package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010)\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0003\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "textAlignment", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "contentPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/Object;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getTextAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "getContentPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CarouselItemDto {
    private final TapActionDto action;
    private final BackgroundDto background;
    private final PaddingsDto contentPaddings;
    private final Object meta;
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final ContentAlignmentDto textAlignment;
    private final AttributedTextDto title;

    public CarouselItemDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "text_alignment") ContentAlignmentDto contentAlignmentDto, @Json(name = "content_paddings") PaddingsDto paddingsDto, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.textAlignment = contentAlignmentDto;
        this.contentPaddings = paddingsDto;
        this.background = backgroundDto;
        this.action = tapActionDto;
        this.metricaLabel = str;
        this.meta = obj;
    }

    public static /* synthetic */ CarouselItemDto copy$default(CarouselItemDto carouselItemDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, ContentAlignmentDto contentAlignmentDto, PaddingsDto paddingsDto, BackgroundDto backgroundDto, TapActionDto tapActionDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            attributedTextDto = carouselItemDto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = carouselItemDto.subtitle;
        }
        if ((i & 4) != 0) {
            contentAlignmentDto = carouselItemDto.textAlignment;
        }
        if ((i & 8) != 0) {
            paddingsDto = carouselItemDto.contentPaddings;
        }
        if ((i & 16) != 0) {
            backgroundDto = carouselItemDto.background;
        }
        if ((i & 32) != 0) {
            tapActionDto = carouselItemDto.action;
        }
        if ((i & 64) != 0) {
            str = carouselItemDto.metricaLabel;
        }
        if ((i & 128) != 0) {
            obj = carouselItemDto.meta;
        }
        String str2 = str;
        Object obj3 = obj;
        BackgroundDto backgroundDto2 = backgroundDto;
        TapActionDto tapActionDto2 = tapActionDto;
        return carouselItemDto.copy(attributedTextDto, attributedTextDto2, contentAlignmentDto, paddingsDto, backgroundDto2, tapActionDto2, str2, obj3);
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
    public final ContentAlignmentDto getTextAlignment() {
        return this.textAlignment;
    }

    /* renamed from: component4, reason: from getter */
    public final PaddingsDto getContentPaddings() {
        return this.contentPaddings;
    }

    /* renamed from: component5, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
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

    public final CarouselItemDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "text_alignment") ContentAlignmentDto textAlignment, @Json(name = "content_paddings") PaddingsDto contentPaddings, @Json(name = "background") BackgroundDto background, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new CarouselItemDto(title, subtitle, textAlignment, contentPaddings, background, action, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselItemDto)) {
            return false;
        }
        CarouselItemDto carouselItemDto = (CarouselItemDto) other;
        return jl40.l(this.title, carouselItemDto.title) && jl40.l(this.subtitle, carouselItemDto.subtitle) && this.textAlignment == carouselItemDto.textAlignment && jl40.l(this.contentPaddings, carouselItemDto.contentPaddings) && jl40.l(this.background, carouselItemDto.background) && jl40.l(this.action, carouselItemDto.action) && jl40.l(this.metricaLabel, carouselItemDto.metricaLabel) && jl40.l(this.meta, carouselItemDto.meta);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final PaddingsDto getContentPaddings() {
        return this.contentPaddings;
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

    public final ContentAlignmentDto getTextAlignment() {
        return this.textAlignment;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        ContentAlignmentDto contentAlignmentDto = this.textAlignment;
        int hashCode3 = (hashCode2 + (contentAlignmentDto == null ? 0 : contentAlignmentDto.hashCode())) * 31;
        PaddingsDto paddingsDto = this.contentPaddings;
        int hashCode4 = (hashCode3 + (paddingsDto == null ? 0 : paddingsDto.hashCode())) * 31;
        BackgroundDto backgroundDto = this.background;
        int hashCode5 = (hashCode4 + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode6 = (hashCode5 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode7 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        ContentAlignmentDto contentAlignmentDto = this.textAlignment;
        PaddingsDto paddingsDto = this.contentPaddings;
        BackgroundDto backgroundDto = this.background;
        TapActionDto tapActionDto = this.action;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("CarouselItemDto(title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", textAlignment=");
        sb.append(contentAlignmentDto);
        sb.append(", contentPaddings=");
        sb.append(paddingsDto);
        sb.append(", background=");
        sb.append(backgroundDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str, ", meta=", obj, Extension.C_BRAKE);
    }
}
