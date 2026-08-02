package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010$\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jg\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetAIChatDto;", "", "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "dynamicText", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/AIChatDynamicTextItemDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "leadImage", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "trailImage", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "metricaLabel", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Ljava/lang/Object;Ljava/lang/String;)V", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getDynamicText", "()Ljava/util/List;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getLeadImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getTrailImage", "getMeta", "()Ljava/lang/Object;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StickyWidgetAIChatDto {
    private final ActionDto action;
    private final List<AIChatDynamicTextItemDto> dynamicText;
    private final IconDto leadImage;
    private final Object meta;
    private final String metricaLabel;
    private final AttributedTextDto text;
    private final IconDto trailImage;

    public StickyWidgetAIChatDto(@Json(name = "text") AttributedTextDto attributedTextDto, @Json(name = "dynamic_text") List<AIChatDynamicTextItemDto> list, @Json(name = "action") ActionDto actionDto, @Json(name = "lead_image") IconDto iconDto, @Json(name = "trail_image") IconDto iconDto2, @Json(name = "meta") Object obj, @Json(name = "metrica_label") String str) {
        this.text = attributedTextDto;
        this.dynamicText = list;
        this.action = actionDto;
        this.leadImage = iconDto;
        this.trailImage = iconDto2;
        this.meta = obj;
        this.metricaLabel = str;
    }

    public static /* synthetic */ StickyWidgetAIChatDto copy$default(StickyWidgetAIChatDto stickyWidgetAIChatDto, AttributedTextDto attributedTextDto, List list, ActionDto actionDto, IconDto iconDto, IconDto iconDto2, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            attributedTextDto = stickyWidgetAIChatDto.text;
        }
        if ((i & 2) != 0) {
            list = stickyWidgetAIChatDto.dynamicText;
        }
        if ((i & 4) != 0) {
            actionDto = stickyWidgetAIChatDto.action;
        }
        if ((i & 8) != 0) {
            iconDto = stickyWidgetAIChatDto.leadImage;
        }
        if ((i & 16) != 0) {
            iconDto2 = stickyWidgetAIChatDto.trailImage;
        }
        if ((i & 32) != 0) {
            obj = stickyWidgetAIChatDto.meta;
        }
        if ((i & 64) != 0) {
            str = stickyWidgetAIChatDto.metricaLabel;
        }
        Object obj3 = obj;
        String str2 = str;
        IconDto iconDto3 = iconDto2;
        ActionDto actionDto2 = actionDto;
        return stickyWidgetAIChatDto.copy(attributedTextDto, list, actionDto2, iconDto, iconDto3, obj3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getText() {
        return this.text;
    }

    public final List<AIChatDynamicTextItemDto> component2() {
        return this.dynamicText;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDto getLeadImage() {
        return this.leadImage;
    }

    /* renamed from: component5, reason: from getter */
    public final IconDto getTrailImage() {
        return this.trailImage;
    }

    /* renamed from: component6, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final StickyWidgetAIChatDto copy(@Json(name = "text") AttributedTextDto text, @Json(name = "dynamic_text") List<AIChatDynamicTextItemDto> dynamicText, @Json(name = "action") ActionDto action, @Json(name = "lead_image") IconDto leadImage, @Json(name = "trail_image") IconDto trailImage, @Json(name = "meta") Object meta, @Json(name = "metrica_label") String metricaLabel) {
        return new StickyWidgetAIChatDto(text, dynamicText, action, leadImage, trailImage, meta, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyWidgetAIChatDto)) {
            return false;
        }
        StickyWidgetAIChatDto stickyWidgetAIChatDto = (StickyWidgetAIChatDto) other;
        return jl40.l(this.text, stickyWidgetAIChatDto.text) && jl40.l(this.dynamicText, stickyWidgetAIChatDto.dynamicText) && jl40.l(this.action, stickyWidgetAIChatDto.action) && jl40.l(this.leadImage, stickyWidgetAIChatDto.leadImage) && jl40.l(this.trailImage, stickyWidgetAIChatDto.trailImage) && jl40.l(this.meta, stickyWidgetAIChatDto.meta) && jl40.l(this.metricaLabel, stickyWidgetAIChatDto.metricaLabel);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final List<AIChatDynamicTextItemDto> getDynamicText() {
        return this.dynamicText;
    }

    public final IconDto getLeadImage() {
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

    public final IconDto getTrailImage() {
        return this.trailImage;
    }

    public int hashCode() {
        AttributedTextDto attributedTextDto = this.text;
        int hashCode = (attributedTextDto == null ? 0 : attributedTextDto.hashCode()) * 31;
        List<AIChatDynamicTextItemDto> list = this.dynamicText;
        int hashCode2 = (this.action.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        IconDto iconDto = this.leadImage;
        int hashCode3 = (hashCode2 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        IconDto iconDto2 = this.trailImage;
        int hashCode4 = (hashCode3 + (iconDto2 == null ? 0 : iconDto2.hashCode())) * 31;
        Object obj = this.meta;
        int hashCode5 = (hashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.text;
        List<AIChatDynamicTextItemDto> list = this.dynamicText;
        ActionDto actionDto = this.action;
        IconDto iconDto = this.leadImage;
        IconDto iconDto2 = this.trailImage;
        Object obj = this.meta;
        String str = this.metricaLabel;
        StringBuilder sb = new StringBuilder("StickyWidgetAIChatDto(text=");
        sb.append(attributedTextDto);
        sb.append(", dynamicText=");
        sb.append(list);
        sb.append(", action=");
        sb.append(actionDto);
        sb.append(", leadImage=");
        sb.append(iconDto);
        sb.append(", trailImage=");
        sb.append(iconDto2);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
