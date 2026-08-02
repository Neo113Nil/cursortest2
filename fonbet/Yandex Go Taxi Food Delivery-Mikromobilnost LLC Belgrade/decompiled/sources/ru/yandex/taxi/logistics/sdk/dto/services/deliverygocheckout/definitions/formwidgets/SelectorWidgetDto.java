package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorWidgetDto;", "", "widgetId", "", "formStateKey", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorOptionDto;", "metricaLabel", "bottomText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "disabledUnselect", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Z)V", "getWidgetId", "()Ljava/lang/String;", "getFormStateKey", "getOptions", "()Ljava/util/List;", "getMetricaLabel", "getBottomText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getDisabledUnselect", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectorWidgetDto {
    private final AttributedTextDto bottomText;
    private final boolean disabledUnselect;
    private final String formStateKey;
    private final String metricaLabel;
    private final List<SelectorOptionDto> options;
    private final String widgetId;

    public SelectorWidgetDto(@Json(name = "widget_id") String str, @Json(name = "form_state_key") String str2, @Json(name = "options") List<SelectorOptionDto> list, @Json(name = "metrica_label") String str3, @Json(name = "bottom_text") AttributedTextDto attributedTextDto, @Json(name = "disabled_unselect") boolean z) {
        this.widgetId = str;
        this.formStateKey = str2;
        this.options = list;
        this.metricaLabel = str3;
        this.bottomText = attributedTextDto;
        this.disabledUnselect = z;
    }

    public static /* synthetic */ SelectorWidgetDto copy$default(SelectorWidgetDto selectorWidgetDto, String str, String str2, List list, String str3, AttributedTextDto attributedTextDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectorWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = selectorWidgetDto.formStateKey;
        }
        if ((i & 4) != 0) {
            list = selectorWidgetDto.options;
        }
        if ((i & 8) != 0) {
            str3 = selectorWidgetDto.metricaLabel;
        }
        if ((i & 16) != 0) {
            attributedTextDto = selectorWidgetDto.bottomText;
        }
        if ((i & 32) != 0) {
            z = selectorWidgetDto.disabledUnselect;
        }
        AttributedTextDto attributedTextDto2 = attributedTextDto;
        boolean z2 = z;
        return selectorWidgetDto.copy(str, str2, list, str3, attributedTextDto2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<SelectorOptionDto> component3() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final AttributedTextDto getBottomText() {
        return this.bottomText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisabledUnselect() {
        return this.disabledUnselect;
    }

    public final SelectorWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "form_state_key") String formStateKey, @Json(name = "options") List<SelectorOptionDto> options, @Json(name = "metrica_label") String metricaLabel, @Json(name = "bottom_text") AttributedTextDto bottomText, @Json(name = "disabled_unselect") boolean disabledUnselect) {
        return new SelectorWidgetDto(widgetId, formStateKey, options, metricaLabel, bottomText, disabledUnselect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectorWidgetDto)) {
            return false;
        }
        SelectorWidgetDto selectorWidgetDto = (SelectorWidgetDto) other;
        return jl40.l(this.widgetId, selectorWidgetDto.widgetId) && jl40.l(this.formStateKey, selectorWidgetDto.formStateKey) && jl40.l(this.options, selectorWidgetDto.options) && jl40.l(this.metricaLabel, selectorWidgetDto.metricaLabel) && jl40.l(this.bottomText, selectorWidgetDto.bottomText) && this.disabledUnselect == selectorWidgetDto.disabledUnselect;
    }

    public final AttributedTextDto getBottomText() {
        return this.bottomText;
    }

    public final boolean getDisabledUnselect() {
        return this.disabledUnselect;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<SelectorOptionDto> getOptions() {
        return this.options;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(unr0.b(this.widgetId.hashCode() * 31, 31, this.formStateKey), 31, this.options);
        String str = this.metricaLabel;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        AttributedTextDto attributedTextDto = this.bottomText;
        return Boolean.hashCode(this.disabledUnselect) + ((hashCode + (attributedTextDto != null ? attributedTextDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.formStateKey;
        List<SelectorOptionDto> list = this.options;
        String str3 = this.metricaLabel;
        AttributedTextDto attributedTextDto = this.bottomText;
        boolean z = this.disabledUnselect;
        StringBuilder v = b64.v("SelectorWidgetDto(widgetId=", str, ", formStateKey=", str2, ", options=");
        oyr.D(", metricaLabel=", str3, ", bottomText=", v, list);
        v.append(attributedTextDto);
        v.append(", disabledUnselect=");
        v.append(z);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ SelectorWidgetDto(String str, String str2, List list, String str3, AttributedTextDto attributedTextDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, attributedTextDto, (i & 32) != 0 ? false : z);
    }
}
