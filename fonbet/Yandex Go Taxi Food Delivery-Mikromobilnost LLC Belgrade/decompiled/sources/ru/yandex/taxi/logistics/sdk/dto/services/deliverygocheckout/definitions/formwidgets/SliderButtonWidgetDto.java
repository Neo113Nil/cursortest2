package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonWidgetDto;", "", "widgetId", "", "isEnabled", "", "normalContent", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonContentDto;", "loadingFormContent", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;ZLru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonContentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonContentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "()Z", "getNormalContent", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonContentDto;", "getLoadingFormContent", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SliderButtonWidgetDto {
    private final TapActionDto action;
    private final boolean isEnabled;
    private final SliderButtonContentDto loadingFormContent;
    private final String metricaLabel;
    private final SliderButtonContentDto normalContent;
    private final String widgetId;

    public SliderButtonWidgetDto(@Json(name = "widget_id") String str, @Json(name = "is_enabled") boolean z, @Json(name = "normal_content") SliderButtonContentDto sliderButtonContentDto, @Json(name = "loading_form_content") SliderButtonContentDto sliderButtonContentDto2, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.isEnabled = z;
        this.normalContent = sliderButtonContentDto;
        this.loadingFormContent = sliderButtonContentDto2;
        this.action = tapActionDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ SliderButtonWidgetDto copy$default(SliderButtonWidgetDto sliderButtonWidgetDto, String str, boolean z, SliderButtonContentDto sliderButtonContentDto, SliderButtonContentDto sliderButtonContentDto2, TapActionDto tapActionDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sliderButtonWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            z = sliderButtonWidgetDto.isEnabled;
        }
        if ((i & 4) != 0) {
            sliderButtonContentDto = sliderButtonWidgetDto.normalContent;
        }
        if ((i & 8) != 0) {
            sliderButtonContentDto2 = sliderButtonWidgetDto.loadingFormContent;
        }
        if ((i & 16) != 0) {
            tapActionDto = sliderButtonWidgetDto.action;
        }
        if ((i & 32) != 0) {
            str2 = sliderButtonWidgetDto.metricaLabel;
        }
        TapActionDto tapActionDto2 = tapActionDto;
        String str3 = str2;
        return sliderButtonWidgetDto.copy(str, z, sliderButtonContentDto, sliderButtonContentDto2, tapActionDto2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final SliderButtonContentDto getNormalContent() {
        return this.normalContent;
    }

    /* renamed from: component4, reason: from getter */
    public final SliderButtonContentDto getLoadingFormContent() {
        return this.loadingFormContent;
    }

    /* renamed from: component5, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SliderButtonWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "is_enabled") boolean isEnabled, @Json(name = "normal_content") SliderButtonContentDto normalContent, @Json(name = "loading_form_content") SliderButtonContentDto loadingFormContent, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new SliderButtonWidgetDto(widgetId, isEnabled, normalContent, loadingFormContent, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderButtonWidgetDto)) {
            return false;
        }
        SliderButtonWidgetDto sliderButtonWidgetDto = (SliderButtonWidgetDto) other;
        return jl40.l(this.widgetId, sliderButtonWidgetDto.widgetId) && this.isEnabled == sliderButtonWidgetDto.isEnabled && jl40.l(this.normalContent, sliderButtonWidgetDto.normalContent) && jl40.l(this.loadingFormContent, sliderButtonWidgetDto.loadingFormContent) && jl40.l(this.action, sliderButtonWidgetDto.action) && jl40.l(this.metricaLabel, sliderButtonWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final SliderButtonContentDto getLoadingFormContent() {
        return this.loadingFormContent;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SliderButtonContentDto getNormalContent() {
        return this.normalContent;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.normalContent.hashCode() + unr0.e(this.widgetId.hashCode() * 31, 31, this.isEnabled)) * 31;
        SliderButtonContentDto sliderButtonContentDto = this.loadingFormContent;
        int hashCode2 = (this.action.hashCode() + ((hashCode + (sliderButtonContentDto == null ? 0 : sliderButtonContentDto.hashCode())) * 31)) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.widgetId;
        boolean z = this.isEnabled;
        SliderButtonContentDto sliderButtonContentDto = this.normalContent;
        SliderButtonContentDto sliderButtonContentDto2 = this.loadingFormContent;
        TapActionDto tapActionDto = this.action;
        String str2 = this.metricaLabel;
        StringBuilder l = oo31.l("SliderButtonWidgetDto(widgetId=", str, ", isEnabled=", ", normalContent=", z);
        l.append(sliderButtonContentDto);
        l.append(", loadingFormContent=");
        l.append(sliderButtonContentDto2);
        l.append(", action=");
        l.append(tapActionDto);
        l.append(", metricaLabel=");
        l.append(str2);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public /* synthetic */ SliderButtonWidgetDto(String str, boolean z, SliderButtonContentDto sliderButtonContentDto, SliderButtonContentDto sliderButtonContentDto2, TapActionDto tapActionDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, sliderButtonContentDto, sliderButtonContentDto2, tapActionDto, str2);
    }
}
