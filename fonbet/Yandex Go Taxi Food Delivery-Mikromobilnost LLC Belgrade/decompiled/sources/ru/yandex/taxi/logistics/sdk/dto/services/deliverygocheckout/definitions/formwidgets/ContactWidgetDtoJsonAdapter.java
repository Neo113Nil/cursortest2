package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.ContactWidgetDto;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "nullableResultPositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto$ContactPositionDto;", "nullableContactPositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "nullableTextParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactPrefillDto;", "nullableContactPrefillDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "nullableHorizontalPaddingsDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactWidgetDtoJsonAdapter extends JsonAdapter<ContactWidgetDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<ContactWidgetDto.ContactPositionDto> nullableContactPositionDtoAdapter;
    private final JsonAdapter<ContactPrefillDto> nullableContactPrefillDtoAdapter;
    private final JsonAdapter<HorizontalPaddingsDto> nullableHorizontalPaddingsDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<ResultPositionDto> nullableResultPositionDtoAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TextParametersDto> nullableTextParametersDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "route_point_index", "result_position", "contact_position", "selected_description", "unselected_description", "contact_style", "selected_lead", "unselected_lead", "trail", "unselected_trail", "prefill", "horizontal_paddings", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public ContactWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "routePointIndex");
        this.nullableResultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "resultPosition");
        this.nullableContactPositionDtoAdapter = moshi.adapter(ContactWidgetDto.ContactPositionDto.class, emptySet, "contactPosition");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "selectedDescription");
        this.nullableTextParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "contactStyle");
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "selectedLead");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail");
        this.nullableContactPrefillDtoAdapter = moshi.adapter(ContactPrefillDto.class, emptySet, "prefill");
        this.nullableHorizontalPaddingsDtoAdapter = moshi.adapter(HorizontalPaddingsDto.class, emptySet, "horizontalPaddings");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContactWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        ResultPositionDto resultPositionDto = null;
        ContactWidgetDto.ContactPositionDto contactPositionDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        TextParametersDto textParametersDto = null;
        SlotLeadDto slotLeadDto = null;
        SlotLeadDto slotLeadDto2 = null;
        SlotTrailDto slotTrailDto = null;
        SlotTrailDto slotTrailDto2 = null;
        ContactPrefillDto contactPrefillDto = null;
        HorizontalPaddingsDto horizontalPaddingsDto = null;
        String str2 = null;
        Object obj = null;
        while (true) {
            String str3 = str;
            Integer num2 = num;
            ResultPositionDto resultPositionDto2 = resultPositionDto;
            ContactWidgetDto.ContactPositionDto contactPositionDto2 = contactPositionDto;
            if (!jsonReader.hasNext()) {
                AttributedTextDto attributedTextDto3 = attributedTextDto;
                jsonReader.endObject();
                if (str3 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (attributedTextDto3 == null) {
                    throw Util.missingProperty("selectedDescription", "selected_description", jsonReader);
                }
                if (attributedTextDto2 != null) {
                    return new ContactWidgetDto(str3, num2, resultPositionDto2, contactPositionDto2, attributedTextDto3, attributedTextDto2, textParametersDto, slotLeadDto, slotLeadDto2, slotTrailDto, slotTrailDto2, contactPrefillDto, horizontalPaddingsDto, str2, obj);
                }
                throw Util.missingProperty("unselectedDescription", "unselected_description", jsonReader);
            }
            AttributedTextDto attributedTextDto4 = attributedTextDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    attributedTextDto = attributedTextDto4;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 2:
                    resultPositionDto = this.nullableResultPositionDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    contactPositionDto = contactPositionDto2;
                case 3:
                    contactPositionDto = this.nullableContactPositionDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                case 4:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("selectedDescription", "selected_description", jsonReader);
                    }
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 5:
                    attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto2 == null) {
                        throw Util.unexpectedNull("unselectedDescription", "unselected_description", jsonReader);
                    }
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 6:
                    textParametersDto = this.nullableTextParametersDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 7:
                    slotLeadDto = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 8:
                    slotLeadDto2 = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 9:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 10:
                    slotTrailDto2 = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 11:
                    contactPrefillDto = this.nullableContactPrefillDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 12:
                    horizontalPaddingsDto = this.nullableHorizontalPaddingsDtoAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 13:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                case 14:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
                default:
                    attributedTextDto = attributedTextDto4;
                    str = str3;
                    num = num2;
                    resultPositionDto = resultPositionDto2;
                    contactPositionDto = contactPositionDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContactWidgetDto contactWidgetDto) {
        ContactWidgetDto contactWidgetDto2 = contactWidgetDto;
        if (contactWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getWidgetId());
        jsonWriter.name("route_point_index");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getRoutePointIndex());
        jsonWriter.name("result_position");
        this.nullableResultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getResultPosition());
        jsonWriter.name("contact_position");
        this.nullableContactPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getContactPosition());
        jsonWriter.name("selected_description");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getSelectedDescription());
        jsonWriter.name("unselected_description");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getUnselectedDescription());
        jsonWriter.name("contact_style");
        this.nullableTextParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getContactStyle());
        jsonWriter.name("selected_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getSelectedLead());
        jsonWriter.name("unselected_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getUnselectedLead());
        jsonWriter.name("trail");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getTrail());
        jsonWriter.name("unselected_trail");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getUnselectedTrail());
        jsonWriter.name("prefill");
        this.nullableContactPrefillDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getPrefill());
        jsonWriter.name("horizontal_paddings");
        this.nullableHorizontalPaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getHorizontalPaddings());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) contactWidgetDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ContactWidgetDto)");
    }
}
