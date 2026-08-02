package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "textParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", "nullableButtonSizeDtoAdapter", "", "listOfStringAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentButtonWidgetDtoJsonAdapter extends JsonAdapter<PaymentButtonWidgetDto> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<ButtonSizeDto> nullableButtonSizeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "title", "subtitle_style", "unselected_payment_text", "button_size", "background_color", "available_payment_types", "metrica_label");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TextParametersDto> textParametersDtoAdapter;

    public PaymentButtonWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.textParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "subtitleStyle");
        this.nullableButtonSizeDtoAdapter = moshi.adapter(ButtonSizeDto.class, emptySet, "buttonSize");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "availablePaymentTypes");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentButtonWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AttributedTextDto attributedTextDto = null;
        TextParametersDto textParametersDto = null;
        String str2 = null;
        ButtonSizeDto buttonSizeDto = null;
        String str3 = null;
        List<String> list = null;
        String str4 = null;
        while (true) {
            String str5 = str;
            AttributedTextDto attributedTextDto2 = attributedTextDto;
            TextParametersDto textParametersDto2 = textParametersDto;
            String str6 = str2;
            if (!jsonReader.hasNext()) {
                ButtonSizeDto buttonSizeDto2 = buttonSizeDto;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (textParametersDto2 == null) {
                    throw Util.missingProperty("subtitleStyle", "subtitle_style", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("unselectedPaymentText", "unselected_payment_text", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
                if (list != null) {
                    return new PaymentButtonWidgetDto(str5, attributedTextDto2, textParametersDto2, str6, buttonSizeDto2, str3, list, str4);
                }
                throw Util.missingProperty("availablePaymentTypes", "available_payment_types", jsonReader);
            }
            ButtonSizeDto buttonSizeDto3 = buttonSizeDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    buttonSizeDto = buttonSizeDto3;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                case 1:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                case 2:
                    textParametersDto = this.textParametersDtoAdapter.fromJson(jsonReader);
                    if (textParametersDto == null) {
                        throw Util.unexpectedNull("subtitleStyle", "subtitle_style", jsonReader);
                    }
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    str2 = str6;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("unselectedPaymentText", "unselected_payment_text", jsonReader);
                    }
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                case 4:
                    buttonSizeDto = this.nullableButtonSizeDtoAdapter.fromJson(jsonReader);
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                case 5:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                case 6:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("availablePaymentTypes", "available_payment_types", jsonReader);
                    }
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
                default:
                    buttonSizeDto = buttonSizeDto3;
                    str = str5;
                    attributedTextDto = attributedTextDto2;
                    textParametersDto = textParametersDto2;
                    str2 = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentButtonWidgetDto paymentButtonWidgetDto) {
        PaymentButtonWidgetDto paymentButtonWidgetDto2 = paymentButtonWidgetDto;
        if (paymentButtonWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getWidgetId());
        jsonWriter.name("title");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getTitle());
        jsonWriter.name("subtitle_style");
        this.textParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getSubtitleStyle());
        jsonWriter.name("unselected_payment_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getUnselectedPaymentText());
        jsonWriter.name("button_size");
        this.nullableButtonSizeDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getButtonSize());
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getBackgroundColor());
        jsonWriter.name("available_payment_types");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getAvailablePaymentTypes());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentButtonWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(PaymentButtonWidgetDto)");
    }
}
