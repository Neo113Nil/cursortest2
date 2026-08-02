package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;", "", "widgetId", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitleStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "unselectedPaymentText", "buttonSize", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "availablePaymentTypes", "", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitleStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getUnselectedPaymentText", "getButtonSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", "getBackgroundColor", "getAvailablePaymentTypes", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentButtonWidgetDto {
    private final List<String> availablePaymentTypes;
    private final String backgroundColor;
    private final ButtonSizeDto buttonSize;
    private final String metricaLabel;
    private final TextParametersDto subtitleStyle;
    private final AttributedTextDto title;
    private final String unselectedPaymentText;
    private final String widgetId;

    public PaymentButtonWidgetDto(@Json(name = "widget_id") String str, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle_style") TextParametersDto textParametersDto, @Json(name = "unselected_payment_text") String str2, @Json(name = "button_size") ButtonSizeDto buttonSizeDto, @Json(name = "background_color") String str3, @Json(name = "available_payment_types") List<String> list, @Json(name = "metrica_label") String str4) {
        this.widgetId = str;
        this.title = attributedTextDto;
        this.subtitleStyle = textParametersDto;
        this.unselectedPaymentText = str2;
        this.buttonSize = buttonSizeDto;
        this.backgroundColor = str3;
        this.availablePaymentTypes = list;
        this.metricaLabel = str4;
    }

    public static /* synthetic */ PaymentButtonWidgetDto copy$default(PaymentButtonWidgetDto paymentButtonWidgetDto, String str, AttributedTextDto attributedTextDto, TextParametersDto textParametersDto, String str2, ButtonSizeDto buttonSizeDto, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentButtonWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            attributedTextDto = paymentButtonWidgetDto.title;
        }
        if ((i & 4) != 0) {
            textParametersDto = paymentButtonWidgetDto.subtitleStyle;
        }
        if ((i & 8) != 0) {
            str2 = paymentButtonWidgetDto.unselectedPaymentText;
        }
        if ((i & 16) != 0) {
            buttonSizeDto = paymentButtonWidgetDto.buttonSize;
        }
        if ((i & 32) != 0) {
            str3 = paymentButtonWidgetDto.backgroundColor;
        }
        if ((i & 64) != 0) {
            list = paymentButtonWidgetDto.availablePaymentTypes;
        }
        if ((i & 128) != 0) {
            str4 = paymentButtonWidgetDto.metricaLabel;
        }
        List list2 = list;
        String str5 = str4;
        ButtonSizeDto buttonSizeDto2 = buttonSizeDto;
        String str6 = str3;
        return paymentButtonWidgetDto.copy(str, attributedTextDto, textParametersDto, str2, buttonSizeDto2, str6, list2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextParametersDto getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnselectedPaymentText() {
        return this.unselectedPaymentText;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonSizeDto getButtonSize() {
        return this.buttonSize;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<String> component7() {
        return this.availablePaymentTypes;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaymentButtonWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle_style") TextParametersDto subtitleStyle, @Json(name = "unselected_payment_text") String unselectedPaymentText, @Json(name = "button_size") ButtonSizeDto buttonSize, @Json(name = "background_color") String backgroundColor, @Json(name = "available_payment_types") List<String> availablePaymentTypes, @Json(name = "metrica_label") String metricaLabel) {
        return new PaymentButtonWidgetDto(widgetId, title, subtitleStyle, unselectedPaymentText, buttonSize, backgroundColor, availablePaymentTypes, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentButtonWidgetDto)) {
            return false;
        }
        PaymentButtonWidgetDto paymentButtonWidgetDto = (PaymentButtonWidgetDto) other;
        return jl40.l(this.widgetId, paymentButtonWidgetDto.widgetId) && jl40.l(this.title, paymentButtonWidgetDto.title) && jl40.l(this.subtitleStyle, paymentButtonWidgetDto.subtitleStyle) && jl40.l(this.unselectedPaymentText, paymentButtonWidgetDto.unselectedPaymentText) && this.buttonSize == paymentButtonWidgetDto.buttonSize && jl40.l(this.backgroundColor, paymentButtonWidgetDto.backgroundColor) && jl40.l(this.availablePaymentTypes, paymentButtonWidgetDto.availablePaymentTypes) && jl40.l(this.metricaLabel, paymentButtonWidgetDto.metricaLabel);
    }

    public final List<String> getAvailablePaymentTypes() {
        return this.availablePaymentTypes;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonSizeDto getButtonSize() {
        return this.buttonSize;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TextParametersDto getSubtitleStyle() {
        return this.subtitleStyle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public final String getUnselectedPaymentText() {
        return this.unselectedPaymentText;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.title;
        int b = unr0.b((this.subtitleStyle.hashCode() + ((hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31)) * 31, 31, this.unselectedPaymentText);
        ButtonSizeDto buttonSizeDto = this.buttonSize;
        int c = unr0.c(unr0.b((b + (buttonSizeDto == null ? 0 : buttonSizeDto.hashCode())) * 31, 31, this.backgroundColor), 31, this.availablePaymentTypes);
        String str = this.metricaLabel;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        AttributedTextDto attributedTextDto = this.title;
        TextParametersDto textParametersDto = this.subtitleStyle;
        String str2 = this.unselectedPaymentText;
        ButtonSizeDto buttonSizeDto = this.buttonSize;
        String str3 = this.backgroundColor;
        List<String> list = this.availablePaymentTypes;
        String str4 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("PaymentButtonWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(attributedTextDto);
        sb.append(", subtitleStyle=");
        sb.append(textParametersDto);
        sb.append(", unselectedPaymentText=");
        sb.append(str2);
        sb.append(", buttonSize=");
        sb.append(buttonSizeDto);
        sb.append(", backgroundColor=");
        sb.append(str3);
        sb.append(", availablePaymentTypes=");
        return n.l(", metricaLabel=", str4, Extension.C_BRAKE, sb, list);
    }
}
