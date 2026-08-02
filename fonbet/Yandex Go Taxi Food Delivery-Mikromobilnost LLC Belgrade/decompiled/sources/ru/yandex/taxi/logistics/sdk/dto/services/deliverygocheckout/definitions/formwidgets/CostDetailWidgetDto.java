package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDetailWidgetDto;", "", "widgetId", "", "leadText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "trailText", "dotStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;)V", "getWidgetId", "()Ljava/lang/String;", "getLeadText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getTrailText", "getDotStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CostDetailWidgetDto {
    private final TextParametersDto dotStyle;
    private final AttributedTextDto leadText;
    private final PaddingsDto paddings;
    private final AttributedTextDto trailText;
    private final String widgetId;

    public CostDetailWidgetDto(@Json(name = "widget_id") String str, @Json(name = "lead_text") AttributedTextDto attributedTextDto, @Json(name = "trail_text") AttributedTextDto attributedTextDto2, @Json(name = "dot_style") TextParametersDto textParametersDto, @Json(name = "paddings") PaddingsDto paddingsDto) {
        this.widgetId = str;
        this.leadText = attributedTextDto;
        this.trailText = attributedTextDto2;
        this.dotStyle = textParametersDto;
        this.paddings = paddingsDto;
    }

    public static /* synthetic */ CostDetailWidgetDto copy$default(CostDetailWidgetDto costDetailWidgetDto, String str, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, TextParametersDto textParametersDto, PaddingsDto paddingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costDetailWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            attributedTextDto = costDetailWidgetDto.leadText;
        }
        if ((i & 4) != 0) {
            attributedTextDto2 = costDetailWidgetDto.trailText;
        }
        if ((i & 8) != 0) {
            textParametersDto = costDetailWidgetDto.dotStyle;
        }
        if ((i & 16) != 0) {
            paddingsDto = costDetailWidgetDto.paddings;
        }
        PaddingsDto paddingsDto2 = paddingsDto;
        AttributedTextDto attributedTextDto3 = attributedTextDto2;
        return costDetailWidgetDto.copy(str, attributedTextDto, attributedTextDto3, textParametersDto, paddingsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getLeadText() {
        return this.leadText;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getTrailText() {
        return this.trailText;
    }

    /* renamed from: component4, reason: from getter */
    public final TextParametersDto getDotStyle() {
        return this.dotStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final CostDetailWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "lead_text") AttributedTextDto leadText, @Json(name = "trail_text") AttributedTextDto trailText, @Json(name = "dot_style") TextParametersDto dotStyle, @Json(name = "paddings") PaddingsDto paddings) {
        return new CostDetailWidgetDto(widgetId, leadText, trailText, dotStyle, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostDetailWidgetDto)) {
            return false;
        }
        CostDetailWidgetDto costDetailWidgetDto = (CostDetailWidgetDto) other;
        return jl40.l(this.widgetId, costDetailWidgetDto.widgetId) && jl40.l(this.leadText, costDetailWidgetDto.leadText) && jl40.l(this.trailText, costDetailWidgetDto.trailText) && jl40.l(this.dotStyle, costDetailWidgetDto.dotStyle) && jl40.l(this.paddings, costDetailWidgetDto.paddings);
    }

    public final TextParametersDto getDotStyle() {
        return this.dotStyle;
    }

    public final AttributedTextDto getLeadText() {
        return this.leadText;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final AttributedTextDto getTrailText() {
        return this.trailText;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.dotStyle.hashCode() + ly3.e(this.trailText, ly3.e(this.leadText, this.widgetId.hashCode() * 31, 31), 31)) * 31;
        PaddingsDto paddingsDto = this.paddings;
        return hashCode + (paddingsDto == null ? 0 : paddingsDto.hashCode());
    }

    public String toString() {
        return "CostDetailWidgetDto(widgetId=" + this.widgetId + ", leadText=" + this.leadText + ", trailText=" + this.trailText + ", dotStyle=" + this.dotStyle + ", paddings=" + this.paddings + Extension.C_BRAKE;
    }
}
