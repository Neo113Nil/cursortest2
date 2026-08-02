package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0007HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u00069"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDto;", "", "widgetId", "", "placeholder", "formStateKey", "minValue", "", "maxValue", "caption", "invalidInputMessage", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "forceOpenKeyboard", "", "inputType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputTypeDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputTypeDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getPlaceholder", "getFormStateKey", "getMinValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxValue", "getCaption", "getInvalidInputMessage", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getForceOpenKeyboard", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInputType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputTypeDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputTypeDto;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDto;", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NumericInputWidgetDto {
    private final String caption;
    private final Boolean forceOpenKeyboard;
    private final String formStateKey;
    private final InputTypeDto inputType;
    private final AttributedTextDto invalidInputMessage;
    private final ImageDto leadIcon;
    private final Integer maxValue;
    private final String metricaLabel;
    private final Integer minValue;
    private final String placeholder;
    private final String widgetId;

    public NumericInputWidgetDto(@Json(name = "widget_id") String str, @Json(name = "placeholder") String str2, @Json(name = "form_state_key") String str3, @Json(name = "min_value") Integer num, @Json(name = "max_value") Integer num2, @Json(name = "caption") String str4, @Json(name = "invalid_input_message") AttributedTextDto attributedTextDto, @Json(name = "lead_icon") ImageDto imageDto, @Json(name = "force_open_keyboard") Boolean bool, @Json(name = "input_type") InputTypeDto inputTypeDto, @Json(name = "metrica_label") String str5) {
        this.widgetId = str;
        this.placeholder = str2;
        this.formStateKey = str3;
        this.minValue = num;
        this.maxValue = num2;
        this.caption = str4;
        this.invalidInputMessage = attributedTextDto;
        this.leadIcon = imageDto;
        this.forceOpenKeyboard = bool;
        this.inputType = inputTypeDto;
        this.metricaLabel = str5;
    }

    public static /* synthetic */ NumericInputWidgetDto copy$default(NumericInputWidgetDto numericInputWidgetDto, String str, String str2, String str3, Integer num, Integer num2, String str4, AttributedTextDto attributedTextDto, ImageDto imageDto, Boolean bool, InputTypeDto inputTypeDto, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = numericInputWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = numericInputWidgetDto.placeholder;
        }
        if ((i & 4) != 0) {
            str3 = numericInputWidgetDto.formStateKey;
        }
        if ((i & 8) != 0) {
            num = numericInputWidgetDto.minValue;
        }
        if ((i & 16) != 0) {
            num2 = numericInputWidgetDto.maxValue;
        }
        if ((i & 32) != 0) {
            str4 = numericInputWidgetDto.caption;
        }
        if ((i & 64) != 0) {
            attributedTextDto = numericInputWidgetDto.invalidInputMessage;
        }
        if ((i & 128) != 0) {
            imageDto = numericInputWidgetDto.leadIcon;
        }
        if ((i & 256) != 0) {
            bool = numericInputWidgetDto.forceOpenKeyboard;
        }
        if ((i & 512) != 0) {
            inputTypeDto = numericInputWidgetDto.inputType;
        }
        if ((i & 1024) != 0) {
            str5 = numericInputWidgetDto.metricaLabel;
        }
        InputTypeDto inputTypeDto2 = inputTypeDto;
        String str6 = str5;
        ImageDto imageDto2 = imageDto;
        Boolean bool2 = bool;
        String str7 = str4;
        AttributedTextDto attributedTextDto2 = attributedTextDto;
        Integer num3 = num2;
        String str8 = str3;
        return numericInputWidgetDto.copy(str, str2, str8, num, num3, str7, attributedTextDto2, imageDto2, bool2, inputTypeDto2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final InputTypeDto getInputType() {
        return this.inputType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMinValue() {
        return this.minValue;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: component7, reason: from getter */
    public final AttributedTextDto getInvalidInputMessage() {
        return this.invalidInputMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final ImageDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getForceOpenKeyboard() {
        return this.forceOpenKeyboard;
    }

    public final NumericInputWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "placeholder") String placeholder, @Json(name = "form_state_key") String formStateKey, @Json(name = "min_value") Integer minValue, @Json(name = "max_value") Integer maxValue, @Json(name = "caption") String caption, @Json(name = "invalid_input_message") AttributedTextDto invalidInputMessage, @Json(name = "lead_icon") ImageDto leadIcon, @Json(name = "force_open_keyboard") Boolean forceOpenKeyboard, @Json(name = "input_type") InputTypeDto inputType, @Json(name = "metrica_label") String metricaLabel) {
        return new NumericInputWidgetDto(widgetId, placeholder, formStateKey, minValue, maxValue, caption, invalidInputMessage, leadIcon, forceOpenKeyboard, inputType, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumericInputWidgetDto)) {
            return false;
        }
        NumericInputWidgetDto numericInputWidgetDto = (NumericInputWidgetDto) other;
        return jl40.l(this.widgetId, numericInputWidgetDto.widgetId) && jl40.l(this.placeholder, numericInputWidgetDto.placeholder) && jl40.l(this.formStateKey, numericInputWidgetDto.formStateKey) && jl40.l(this.minValue, numericInputWidgetDto.minValue) && jl40.l(this.maxValue, numericInputWidgetDto.maxValue) && jl40.l(this.caption, numericInputWidgetDto.caption) && jl40.l(this.invalidInputMessage, numericInputWidgetDto.invalidInputMessage) && jl40.l(this.leadIcon, numericInputWidgetDto.leadIcon) && jl40.l(this.forceOpenKeyboard, numericInputWidgetDto.forceOpenKeyboard) && jl40.l(this.inputType, numericInputWidgetDto.inputType) && jl40.l(this.metricaLabel, numericInputWidgetDto.metricaLabel);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final Boolean getForceOpenKeyboard() {
        return this.forceOpenKeyboard;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final InputTypeDto getInputType() {
        return this.inputType;
    }

    public final AttributedTextDto getInvalidInputMessage() {
        return this.invalidInputMessage;
    }

    public final ImageDto getLeadIcon() {
        return this.leadIcon;
    }

    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final Integer getMinValue() {
        return this.minValue;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.widgetId.hashCode() * 31, 31, this.placeholder), 31, this.formStateKey);
        Integer num = this.minValue;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxValue;
        int b2 = unr0.b((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.caption);
        AttributedTextDto attributedTextDto = this.invalidInputMessage;
        int hashCode2 = (b2 + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        ImageDto imageDto = this.leadIcon;
        int hashCode3 = (hashCode2 + (imageDto == null ? 0 : imageDto.hashCode())) * 31;
        Boolean bool = this.forceOpenKeyboard;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        InputTypeDto inputTypeDto = this.inputType;
        int hashCode5 = (hashCode4 + (inputTypeDto == null ? 0 : inputTypeDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.placeholder;
        String str3 = this.formStateKey;
        Integer num = this.minValue;
        Integer num2 = this.maxValue;
        String str4 = this.caption;
        AttributedTextDto attributedTextDto = this.invalidInputMessage;
        ImageDto imageDto = this.leadIcon;
        Boolean bool = this.forceOpenKeyboard;
        InputTypeDto inputTypeDto = this.inputType;
        String str5 = this.metricaLabel;
        StringBuilder v = b64.v("NumericInputWidgetDto(widgetId=", str, ", placeholder=", str2, ", formStateKey=");
        vfc.w(num, str3, ", minValue=", ", maxValue=", v);
        tse0.w(num2, ", caption=", str4, ", invalidInputMessage=", v);
        v.append(attributedTextDto);
        v.append(", leadIcon=");
        v.append(imageDto);
        v.append(", forceOpenKeyboard=");
        v.append(bool);
        v.append(", inputType=");
        v.append(inputTypeDto);
        v.append(", metricaLabel=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
