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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AddressFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.AddressWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "nullableResultPositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto$AddressPositionDto;", "addressPositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowDto;", "nullableAddressFlowDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "nullableTextParametersDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressWidgetDtoJsonAdapter extends JsonAdapter<AddressWidgetDto> {
    private final JsonAdapter<AddressWidgetDto.AddressPositionDto> addressPositionDtoAdapter;
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<AddressFlowDto> nullableAddressFlowDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonAdapter<ResultPositionDto> nullableResultPositionDtoAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonAdapter<TextParametersDto> nullableTextParametersDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "route_point_index", "result_position", "address_position", "flow", "selected_description", "unselected_description", "address_style", "selected_lead", "unselected_lead", "trail", "action", "paddings", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public AddressWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "routePointIndex");
        this.nullableResultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "resultPosition");
        this.addressPositionDtoAdapter = moshi.adapter(AddressWidgetDto.AddressPositionDto.class, emptySet, "addressPosition");
        this.nullableAddressFlowDtoAdapter = moshi.adapter(AddressFlowDto.class, emptySet, "flow");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "selectedDescription");
        this.nullableTextParametersDtoAdapter = moshi.adapter(TextParametersDto.class, emptySet, "addressStyle");
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "selectedLead");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        ResultPositionDto resultPositionDto = null;
        AddressWidgetDto.AddressPositionDto addressPositionDto = null;
        AddressFlowDto addressFlowDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        TextParametersDto textParametersDto = null;
        SlotLeadDto slotLeadDto = null;
        SlotLeadDto slotLeadDto2 = null;
        SlotTrailDto slotTrailDto = null;
        TapActionDto tapActionDto = null;
        PaddingsDto paddingsDto = null;
        String str2 = null;
        Object obj = null;
        while (true) {
            Integer num2 = num;
            String str3 = str;
            ResultPositionDto resultPositionDto2 = resultPositionDto;
            AddressWidgetDto.AddressPositionDto addressPositionDto2 = addressPositionDto;
            AddressFlowDto addressFlowDto2 = addressFlowDto;
            AttributedTextDto attributedTextDto3 = attributedTextDto;
            AttributedTextDto attributedTextDto4 = attributedTextDto2;
            TextParametersDto textParametersDto2 = textParametersDto;
            if (!jsonReader.hasNext()) {
                SlotLeadDto slotLeadDto3 = slotLeadDto;
                jsonReader.endObject();
                if (str3 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (num2 == null) {
                    throw Util.missingProperty("routePointIndex", "route_point_index", jsonReader);
                }
                int intValue = num2.intValue();
                if (addressPositionDto2 == null) {
                    throw Util.missingProperty("addressPosition", "address_position", jsonReader);
                }
                if (attributedTextDto3 == null) {
                    throw Util.missingProperty("selectedDescription", "selected_description", jsonReader);
                }
                if (attributedTextDto4 != null) {
                    return new AddressWidgetDto(str3, intValue, resultPositionDto2, addressPositionDto2, addressFlowDto2, attributedTextDto3, attributedTextDto4, textParametersDto2, slotLeadDto3, slotLeadDto2, slotTrailDto, tapActionDto, paddingsDto, str2, obj);
                }
                throw Util.missingProperty("unselectedDescription", "unselected_description", jsonReader);
            }
            SlotLeadDto slotLeadDto4 = slotLeadDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("routePointIndex", "route_point_index", jsonReader);
                    }
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 2:
                    resultPositionDto = this.nullableResultPositionDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 3:
                    AddressWidgetDto.AddressPositionDto fromJson = this.addressPositionDtoAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("addressPosition", "address_position", jsonReader);
                    }
                    addressPositionDto = fromJson;
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 4:
                    addressFlowDto = this.nullableAddressFlowDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 5:
                    AttributedTextDto fromJson2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("selectedDescription", "selected_description", jsonReader);
                    }
                    attributedTextDto = fromJson2;
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 6:
                    AttributedTextDto fromJson3 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (fromJson3 == null) {
                        throw Util.unexpectedNull("unselectedDescription", "unselected_description", jsonReader);
                    }
                    attributedTextDto2 = fromJson3;
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    textParametersDto = textParametersDto2;
                case 7:
                    textParametersDto = this.nullableTextParametersDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                case 8:
                    slotLeadDto = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 9:
                    slotLeadDto2 = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 10:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 11:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 12:
                    paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 13:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                case 14:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
                default:
                    num = num2;
                    slotLeadDto = slotLeadDto4;
                    str = str3;
                    resultPositionDto = resultPositionDto2;
                    addressPositionDto = addressPositionDto2;
                    addressFlowDto = addressFlowDto2;
                    attributedTextDto = attributedTextDto3;
                    attributedTextDto2 = attributedTextDto4;
                    textParametersDto = textParametersDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressWidgetDto addressWidgetDto) {
        AddressWidgetDto addressWidgetDto2 = addressWidgetDto;
        if (addressWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getWidgetId());
        jsonWriter.name("route_point_index");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(addressWidgetDto2.getRoutePointIndex()));
        jsonWriter.name("result_position");
        this.nullableResultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getResultPosition());
        jsonWriter.name("address_position");
        this.addressPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getAddressPosition());
        jsonWriter.name("flow");
        this.nullableAddressFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getFlow());
        jsonWriter.name("selected_description");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getSelectedDescription());
        jsonWriter.name("unselected_description");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getUnselectedDescription());
        jsonWriter.name("address_style");
        this.nullableTextParametersDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getAddressStyle());
        jsonWriter.name("selected_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getSelectedLead());
        jsonWriter.name("unselected_lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getUnselectedLead());
        jsonWriter.name("trail");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getTrail());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getAction());
        jsonWriter.name("paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getPaddings());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) addressWidgetDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(AddressWidgetDto)");
    }
}
