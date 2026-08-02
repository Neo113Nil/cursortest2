package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00012Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jh\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u000bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;", "", "widgetId", "", "text", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;", "textAlignment", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "height", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "accessibilityInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;)V", "getWidgetId", "()Ljava/lang/String;", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;", "getTextAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "getAccessibilityInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;", "equals", "", "other", "hashCode", "toString", "TextDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextWidgetDto {
    private final AccessibilityInfoDto accessibilityInfo;
    private final TapActionDto action;
    private final Integer height;
    private final String metricaLabel;
    private final PaddingsDto paddings;
    private final TextDto text;
    private final ContentAlignmentDto textAlignment;
    private final String widgetId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto$TextDto;", "", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/g", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/h", "ru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/i", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TextDto {
    }

    public TextWidgetDto(@Json(name = "widget_id") String str, @Json(name = "text") TextDto textDto, @Json(name = "text_alignment") ContentAlignmentDto contentAlignmentDto, @Json(name = "paddings") PaddingsDto paddingsDto, @Json(name = "height") Integer num, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str2, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfoDto) {
        this.widgetId = str;
        this.text = textDto;
        this.textAlignment = contentAlignmentDto;
        this.paddings = paddingsDto;
        this.height = num;
        this.action = tapActionDto;
        this.metricaLabel = str2;
        this.accessibilityInfo = accessibilityInfoDto;
    }

    public static /* synthetic */ TextWidgetDto copy$default(TextWidgetDto textWidgetDto, String str, TextDto textDto, ContentAlignmentDto contentAlignmentDto, PaddingsDto paddingsDto, Integer num, TapActionDto tapActionDto, String str2, AccessibilityInfoDto accessibilityInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            textDto = textWidgetDto.text;
        }
        if ((i & 4) != 0) {
            contentAlignmentDto = textWidgetDto.textAlignment;
        }
        if ((i & 8) != 0) {
            paddingsDto = textWidgetDto.paddings;
        }
        if ((i & 16) != 0) {
            num = textWidgetDto.height;
        }
        if ((i & 32) != 0) {
            tapActionDto = textWidgetDto.action;
        }
        if ((i & 64) != 0) {
            str2 = textWidgetDto.metricaLabel;
        }
        if ((i & 128) != 0) {
            accessibilityInfoDto = textWidgetDto.accessibilityInfo;
        }
        String str3 = str2;
        AccessibilityInfoDto accessibilityInfoDto2 = accessibilityInfoDto;
        Integer num2 = num;
        TapActionDto tapActionDto2 = tapActionDto;
        return textWidgetDto.copy(str, textDto, contentAlignmentDto, paddingsDto, num2, tapActionDto2, str3, accessibilityInfoDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDto getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final ContentAlignmentDto getTextAlignment() {
        return this.textAlignment;
    }

    /* renamed from: component4, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHeight() {
        return this.height;
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
    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final TextWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "text") TextDto text, @Json(name = "text_alignment") ContentAlignmentDto textAlignment, @Json(name = "paddings") PaddingsDto paddings, @Json(name = "height") Integer height, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfo) {
        return new TextWidgetDto(widgetId, text, textAlignment, paddings, height, action, metricaLabel, accessibilityInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextWidgetDto)) {
            return false;
        }
        TextWidgetDto textWidgetDto = (TextWidgetDto) other;
        return jl40.l(this.widgetId, textWidgetDto.widgetId) && jl40.l(this.text, textWidgetDto.text) && this.textAlignment == textWidgetDto.textAlignment && jl40.l(this.paddings, textWidgetDto.paddings) && jl40.l(this.height, textWidgetDto.height) && jl40.l(this.action, textWidgetDto.action) && jl40.l(this.metricaLabel, textWidgetDto.metricaLabel) && jl40.l(this.accessibilityInfo, textWidgetDto.accessibilityInfo);
    }

    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final TextDto getText() {
        return this.text;
    }

    public final ContentAlignmentDto getTextAlignment() {
        return this.textAlignment;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.text.hashCode() + (this.widgetId.hashCode() * 31)) * 31;
        ContentAlignmentDto contentAlignmentDto = this.textAlignment;
        int hashCode2 = (this.paddings.hashCode() + ((hashCode + (contentAlignmentDto == null ? 0 : contentAlignmentDto.hashCode())) * 31)) * 31;
        Integer num = this.height;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode4 = (hashCode3 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        AccessibilityInfoDto accessibilityInfoDto = this.accessibilityInfo;
        return hashCode5 + (accessibilityInfoDto != null ? accessibilityInfoDto.hashCode() : 0);
    }

    public String toString() {
        return "TextWidgetDto(widgetId=" + this.widgetId + ", text=" + this.text + ", textAlignment=" + this.textAlignment + ", paddings=" + this.paddings + ", height=" + this.height + ", action=" + this.action + ", metricaLabel=" + this.metricaLabel + ", accessibilityInfo=" + this.accessibilityInfo + Extension.C_BRAKE;
    }
}
