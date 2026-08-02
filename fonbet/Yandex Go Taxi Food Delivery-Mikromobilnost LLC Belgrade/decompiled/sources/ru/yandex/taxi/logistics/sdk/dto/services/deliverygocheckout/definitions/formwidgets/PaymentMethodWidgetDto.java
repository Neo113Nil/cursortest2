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

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006,"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentMethodWidgetDto;", "", "widgetId", "", "titleStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "subtitle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "additionalBody", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "trail", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "availablePaymentTypes", "", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;Ljava/util/List;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getTitleStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getSubtitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getAdditionalBody", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "getTrail", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "getAvailablePaymentTypes", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentMethodWidgetDto {
    private final SlotBodyDto additionalBody;
    private final List<String> availablePaymentTypes;
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final TextParametersDto titleStyle;
    private final SlotTrailDto trail;
    private final String widgetId;

    public PaymentMethodWidgetDto(@Json(name = "widget_id") String str, @Json(name = "title_style") TextParametersDto textParametersDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto, @Json(name = "additional_body") SlotBodyDto slotBodyDto, @Json(name = "trail") SlotTrailDto slotTrailDto, @Json(name = "available_payment_types") List<String> list, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.titleStyle = textParametersDto;
        this.subtitle = attributedTextDto;
        this.additionalBody = slotBodyDto;
        this.trail = slotTrailDto;
        this.availablePaymentTypes = list;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ PaymentMethodWidgetDto copy$default(PaymentMethodWidgetDto paymentMethodWidgetDto, String str, TextParametersDto textParametersDto, AttributedTextDto attributedTextDto, SlotBodyDto slotBodyDto, SlotTrailDto slotTrailDto, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            textParametersDto = paymentMethodWidgetDto.titleStyle;
        }
        if ((i & 4) != 0) {
            attributedTextDto = paymentMethodWidgetDto.subtitle;
        }
        if ((i & 8) != 0) {
            slotBodyDto = paymentMethodWidgetDto.additionalBody;
        }
        if ((i & 16) != 0) {
            slotTrailDto = paymentMethodWidgetDto.trail;
        }
        if ((i & 32) != 0) {
            list = paymentMethodWidgetDto.availablePaymentTypes;
        }
        if ((i & 64) != 0) {
            str2 = paymentMethodWidgetDto.metricaLabel;
        }
        List list2 = list;
        String str3 = str2;
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        AttributedTextDto attributedTextDto2 = attributedTextDto;
        return paymentMethodWidgetDto.copy(str, textParametersDto, attributedTextDto2, slotBodyDto, slotTrailDto2, list2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final TextParametersDto getTitleStyle() {
        return this.titleStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final SlotBodyDto getAdditionalBody() {
        return this.additionalBody;
    }

    /* renamed from: component5, reason: from getter */
    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final List<String> component6() {
        return this.availablePaymentTypes;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaymentMethodWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "title_style") TextParametersDto titleStyle, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "additional_body") SlotBodyDto additionalBody, @Json(name = "trail") SlotTrailDto trail, @Json(name = "available_payment_types") List<String> availablePaymentTypes, @Json(name = "metrica_label") String metricaLabel) {
        return new PaymentMethodWidgetDto(widgetId, titleStyle, subtitle, additionalBody, trail, availablePaymentTypes, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodWidgetDto)) {
            return false;
        }
        PaymentMethodWidgetDto paymentMethodWidgetDto = (PaymentMethodWidgetDto) other;
        return jl40.l(this.widgetId, paymentMethodWidgetDto.widgetId) && jl40.l(this.titleStyle, paymentMethodWidgetDto.titleStyle) && jl40.l(this.subtitle, paymentMethodWidgetDto.subtitle) && jl40.l(this.additionalBody, paymentMethodWidgetDto.additionalBody) && jl40.l(this.trail, paymentMethodWidgetDto.trail) && jl40.l(this.availablePaymentTypes, paymentMethodWidgetDto.availablePaymentTypes) && jl40.l(this.metricaLabel, paymentMethodWidgetDto.metricaLabel);
    }

    public final SlotBodyDto getAdditionalBody() {
        return this.additionalBody;
    }

    public final List<String> getAvailablePaymentTypes() {
        return this.availablePaymentTypes;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final TextParametersDto getTitleStyle() {
        return this.titleStyle;
    }

    public final SlotTrailDto getTrail() {
        return this.trail;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.titleStyle.hashCode() + (this.widgetId.hashCode() * 31)) * 31;
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        SlotBodyDto slotBodyDto = this.additionalBody;
        int hashCode3 = (hashCode2 + (slotBodyDto == null ? 0 : slotBodyDto.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail;
        int c = unr0.c((hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31, 31, this.availablePaymentTypes);
        String str = this.metricaLabel;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        TextParametersDto textParametersDto = this.titleStyle;
        AttributedTextDto attributedTextDto = this.subtitle;
        SlotBodyDto slotBodyDto = this.additionalBody;
        SlotTrailDto slotTrailDto = this.trail;
        List<String> list = this.availablePaymentTypes;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("PaymentMethodWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", titleStyle=");
        sb.append(textParametersDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto);
        sb.append(", additionalBody=");
        sb.append(slotBodyDto);
        sb.append(", trail=");
        sb.append(slotTrailDto);
        sb.append(", availablePaymentTypes=");
        sb.append(list);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
