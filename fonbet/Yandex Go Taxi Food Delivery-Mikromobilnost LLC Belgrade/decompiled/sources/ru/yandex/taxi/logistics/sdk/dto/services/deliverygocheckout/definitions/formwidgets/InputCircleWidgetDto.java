package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00017By\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u00068"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto;", "", "widgetId", "", "inputValue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleInputValueDto;", "minValueTitle", "valueText", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormattableTextDto;", "gradientColors", "", "formStateKey", "subtitle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto$IconDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleInputValueDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormattableTextDto;Ljava/util/List;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto$IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getInputValue", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleInputValueDto;", "getMinValueTitle", "getValueText", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormattableTextDto;", "getGradientColors", "()Ljava/util/List;", "getFormStateKey", "getSubtitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto$IconDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "IconDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InputCircleWidgetDto {
    private final TapActionDto action;
    private final String formStateKey;
    private final List<String> gradientColors;
    private final IconDto icon;
    private final InputCircleInputValueDto inputValue;
    private final String metricaLabel;
    private final String minValueTitle;
    private final AttributedTextDto subtitle;
    private final FormattableTextDto valueText;
    private final String widgetId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto$IconDto;", "", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/d", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/e", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/f", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class IconDto {
    }

    public InputCircleWidgetDto(@Json(name = "widget_id") String str, @Json(name = "input_value") InputCircleInputValueDto inputCircleInputValueDto, @Json(name = "min_value_title") String str2, @Json(name = "value_text") FormattableTextDto formattableTextDto, @Json(name = "gradient_colors") List<String> list, @Json(name = "form_state_key") String str3, @Json(name = "subtitle") AttributedTextDto attributedTextDto, @Json(name = "icon") IconDto iconDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str4) {
        this.widgetId = str;
        this.inputValue = inputCircleInputValueDto;
        this.minValueTitle = str2;
        this.valueText = formattableTextDto;
        this.gradientColors = list;
        this.formStateKey = str3;
        this.subtitle = attributedTextDto;
        this.icon = iconDto;
        this.action = tapActionDto;
        this.metricaLabel = str4;
    }

    public static /* synthetic */ InputCircleWidgetDto copy$default(InputCircleWidgetDto inputCircleWidgetDto, String str, InputCircleInputValueDto inputCircleInputValueDto, String str2, FormattableTextDto formattableTextDto, List list, String str3, AttributedTextDto attributedTextDto, IconDto iconDto, TapActionDto tapActionDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputCircleWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            inputCircleInputValueDto = inputCircleWidgetDto.inputValue;
        }
        if ((i & 4) != 0) {
            str2 = inputCircleWidgetDto.minValueTitle;
        }
        if ((i & 8) != 0) {
            formattableTextDto = inputCircleWidgetDto.valueText;
        }
        if ((i & 16) != 0) {
            list = inputCircleWidgetDto.gradientColors;
        }
        if ((i & 32) != 0) {
            str3 = inputCircleWidgetDto.formStateKey;
        }
        if ((i & 64) != 0) {
            attributedTextDto = inputCircleWidgetDto.subtitle;
        }
        if ((i & 128) != 0) {
            iconDto = inputCircleWidgetDto.icon;
        }
        if ((i & 256) != 0) {
            tapActionDto = inputCircleWidgetDto.action;
        }
        if ((i & 512) != 0) {
            str4 = inputCircleWidgetDto.metricaLabel;
        }
        TapActionDto tapActionDto2 = tapActionDto;
        String str5 = str4;
        AttributedTextDto attributedTextDto2 = attributedTextDto;
        IconDto iconDto2 = iconDto;
        List list2 = list;
        String str6 = str3;
        return inputCircleWidgetDto.copy(str, inputCircleInputValueDto, str2, formattableTextDto, list2, str6, attributedTextDto2, iconDto2, tapActionDto2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final InputCircleInputValueDto getInputValue() {
        return this.inputValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMinValueTitle() {
        return this.minValueTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final FormattableTextDto getValueText() {
        return this.valueText;
    }

    public final List<String> component5() {
        return this.gradientColors;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component7, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final IconDto getIcon() {
        return this.icon;
    }

    /* renamed from: component9, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    public final InputCircleWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "input_value") InputCircleInputValueDto inputValue, @Json(name = "min_value_title") String minValueTitle, @Json(name = "value_text") FormattableTextDto valueText, @Json(name = "gradient_colors") List<String> gradientColors, @Json(name = "form_state_key") String formStateKey, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "icon") IconDto icon, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new InputCircleWidgetDto(widgetId, inputValue, minValueTitle, valueText, gradientColors, formStateKey, subtitle, icon, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCircleWidgetDto)) {
            return false;
        }
        InputCircleWidgetDto inputCircleWidgetDto = (InputCircleWidgetDto) other;
        return jl40.l(this.widgetId, inputCircleWidgetDto.widgetId) && jl40.l(this.inputValue, inputCircleWidgetDto.inputValue) && jl40.l(this.minValueTitle, inputCircleWidgetDto.minValueTitle) && jl40.l(this.valueText, inputCircleWidgetDto.valueText) && jl40.l(this.gradientColors, inputCircleWidgetDto.gradientColors) && jl40.l(this.formStateKey, inputCircleWidgetDto.formStateKey) && jl40.l(this.subtitle, inputCircleWidgetDto.subtitle) && jl40.l(this.icon, inputCircleWidgetDto.icon) && jl40.l(this.action, inputCircleWidgetDto.action) && jl40.l(this.metricaLabel, inputCircleWidgetDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<String> getGradientColors() {
        return this.gradientColors;
    }

    public final IconDto getIcon() {
        return this.icon;
    }

    public final InputCircleInputValueDto getInputValue() {
        return this.inputValue;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getMinValueTitle() {
        return this.minValueTitle;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final FormattableTextDto getValueText() {
        return this.valueText;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int b = unr0.b(unr0.c((this.valueText.hashCode() + unr0.b((this.inputValue.hashCode() + (this.widgetId.hashCode() * 31)) * 31, 31, this.minValueTitle)) * 31, 31, this.gradientColors), 31, this.formStateKey);
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode = (b + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        IconDto iconDto = this.icon;
        int hashCode2 = (hashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode3 = (hashCode2 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        InputCircleInputValueDto inputCircleInputValueDto = this.inputValue;
        String str2 = this.minValueTitle;
        FormattableTextDto formattableTextDto = this.valueText;
        List<String> list = this.gradientColors;
        String str3 = this.formStateKey;
        AttributedTextDto attributedTextDto = this.subtitle;
        IconDto iconDto = this.icon;
        TapActionDto tapActionDto = this.action;
        String str4 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("InputCircleWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", inputValue=");
        sb.append(inputCircleInputValueDto);
        sb.append(", minValueTitle=");
        sb.append(str2);
        sb.append(", valueText=");
        sb.append(formattableTextDto);
        sb.append(", gradientColors=");
        oyr.D(", formStateKey=", str3, ", subtitle=", sb, list);
        sb.append(attributedTextDto);
        sb.append(", icon=");
        sb.append(iconDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", metricaLabel=");
        sb.append(str4);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
