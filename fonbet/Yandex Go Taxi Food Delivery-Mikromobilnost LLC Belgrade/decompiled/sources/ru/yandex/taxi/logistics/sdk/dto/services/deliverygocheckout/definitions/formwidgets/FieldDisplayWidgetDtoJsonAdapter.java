package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.FieldDisplayWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto$FieldPositionDto;", "fieldPositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "textParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "nullableSlotStyleDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FieldDisplayWidgetDtoJsonAdapter extends JsonAdapter<FieldDisplayWidgetDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<FieldDisplayWidgetDto.FieldPositionDto> fieldPositionDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonAdapter<SlotStyleDto> nullableSlotStyleDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "field_position", "form_state_key", "field_style", "filled_description", "filled_lead", "empty_description", "empty_lead", "trail", "action", "style", "metrica_label");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TextParametersDto> textParametersDtoAdapter;

    public FieldDisplayWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.fieldPositionDtoAdapter = moshi.adapter(FieldDisplayWidgetDto.FieldPositionDto.class, emptySet, "fieldPosition");
        this.textParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "fieldStyle");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "filledDescription");
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "filledLead");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "emptyDescription");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableSlotStyleDtoAdapter = moshi.adapter(SlotStyleDto.class, emptySet, "style");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FieldDisplayWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        FieldDisplayWidgetDto.FieldPositionDto fieldPositionDto = null;
        String str2 = null;
        TextParametersDto textParametersDto = null;
        AttributedTextDto attributedTextDto = null;
        SlotLeadDto slotLeadDto = null;
        AttributedTextDto attributedTextDto2 = null;
        SlotLeadDto slotLeadDto2 = null;
        SlotTrailDto slotTrailDto = null;
        TapActionDto tapActionDto = null;
        SlotStyleDto slotStyleDto = null;
        String str3 = null;
        while (true) {
            String str4 = str;
            FieldDisplayWidgetDto.FieldPositionDto fieldPositionDto2 = fieldPositionDto;
            String str5 = str2;
            TextParametersDto textParametersDto2 = textParametersDto;
            AttributedTextDto attributedTextDto3 = attributedTextDto;
            SlotLeadDto slotLeadDto3 = slotLeadDto;
            AttributedTextDto attributedTextDto4 = attributedTextDto2;
            SlotLeadDto slotLeadDto4 = slotLeadDto2;
            if (!jsonReader.hasNext()) {
                SlotTrailDto slotTrailDto2 = slotTrailDto;
                jsonReader.endObject();
                if (str4 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (fieldPositionDto2 == null) {
                    throw Util.missingProperty("fieldPosition", "field_position", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
                }
                if (textParametersDto2 == null) {
                    throw Util.missingProperty("fieldStyle", "field_style", jsonReader);
                }
                if (attributedTextDto4 != null) {
                    return new FieldDisplayWidgetDto(str4, fieldPositionDto2, str5, textParametersDto2, attributedTextDto3, slotLeadDto3, attributedTextDto4, slotLeadDto4, slotTrailDto2, tapActionDto, slotStyleDto, str3);
                }
                throw Util.missingProperty("emptyDescription", "empty_description", jsonReader);
            }
            SlotTrailDto slotTrailDto3 = slotTrailDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    slotTrailDto = slotTrailDto3;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 1:
                    FieldDisplayWidgetDto.FieldPositionDto fromJson = this.fieldPositionDtoAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("fieldPosition", "field_position", jsonReader);
                    }
                    fieldPositionDto = fromJson;
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 2:
                    String fromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    str2 = fromJson2;
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 3:
                    textParametersDto = this.textParametersDtoAdapter.fromJson(jsonReader);
                    if (textParametersDto == null) {
                        throw Util.unexpectedNull("fieldStyle", "field_style", jsonReader);
                    }
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 4:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 5:
                    slotLeadDto = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 6:
                    AttributedTextDto fromJson3 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (fromJson3 == null) {
                        throw Util.unexpectedNull("emptyDescription", "empty_description", jsonReader);
                    }
                    attributedTextDto2 = fromJson3;
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    slotLeadDto2 = slotLeadDto4;
                case 7:
                    slotLeadDto2 = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                case 8:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 9:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 10:
                    slotStyleDto = this.nullableSlotStyleDtoAdapter.fromJson(jsonReader);
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
                default:
                    slotTrailDto = slotTrailDto3;
                    str = str4;
                    fieldPositionDto = fieldPositionDto2;
                    str2 = str5;
                    textParametersDto = textParametersDto2;
                    attributedTextDto = attributedTextDto3;
                    slotLeadDto = slotLeadDto3;
                    attributedTextDto2 = attributedTextDto4;
                    slotLeadDto2 = slotLeadDto4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FieldDisplayWidgetDto fieldDisplayWidgetDto) {
        FieldDisplayWidgetDto fieldDisplayWidgetDto2 = fieldDisplayWidgetDto;
        if (fieldDisplayWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getWidgetId());
        jsonWriter.name("field_position");
        this.fieldPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getFieldPosition());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getFormStateKey());
        jsonWriter.name("field_style");
        this.textParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getFieldStyle());
        jsonWriter.name("filled_description");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getFilledDescription());
        jsonWriter.name("filled_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getFilledLead());
        jsonWriter.name("empty_description");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getEmptyDescription());
        jsonWriter.name("empty_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getEmptyLead());
        jsonWriter.name("trail");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getTrail());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getAction());
        jsonWriter.name("style");
        this.nullableSlotStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getStyle());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) fieldDisplayWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(FieldDisplayWidgetDto)");
    }
}
