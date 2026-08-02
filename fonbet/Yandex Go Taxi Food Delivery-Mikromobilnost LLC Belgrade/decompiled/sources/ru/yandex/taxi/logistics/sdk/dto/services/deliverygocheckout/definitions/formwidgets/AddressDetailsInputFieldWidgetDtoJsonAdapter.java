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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.HorizontalPaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "resultPositionDtoAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsBubbleDto;", "nullableAddressDetailsBubbleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsFieldTypeDto;", "addressDetailsFieldTypeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/HorizontalPaddingsDto;", "nullableHorizontalPaddingsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressDetailsInputFieldWidgetDtoJsonAdapter extends JsonAdapter<AddressDetailsInputFieldWidgetDto> {
    private final JsonAdapter<AddressDetailsFieldTypeDto> addressDetailsFieldTypeDtoAdapter;
    private final JsonAdapter<AddressDetailsBubbleDto> nullableAddressDetailsBubbleDtoAdapter;
    private final JsonAdapter<HorizontalPaddingsDto> nullableHorizontalPaddingsDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "result_position", "placeholder", "bubble", "field", "trail1", "horizontal_paddings");
    private final JsonAdapter<ResultPositionDto> resultPositionDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public AddressDetailsInputFieldWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.resultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "resultPosition");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "placeholder");
        this.nullableAddressDetailsBubbleDtoAdapter = moshi.adapter(AddressDetailsBubbleDto.class, emptySet, "bubble");
        this.addressDetailsFieldTypeDtoAdapter = moshi.adapter(AddressDetailsFieldTypeDto.class, emptySet, "field");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail1");
        this.nullableHorizontalPaddingsDtoAdapter = moshi.adapter(HorizontalPaddingsDto.class, emptySet, "horizontalPaddings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressDetailsInputFieldWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ResultPositionDto resultPositionDto = null;
        String str2 = null;
        AddressDetailsBubbleDto addressDetailsBubbleDto = null;
        AddressDetailsFieldTypeDto addressDetailsFieldTypeDto = null;
        SlotTrailDto slotTrailDto = null;
        HorizontalPaddingsDto horizontalPaddingsDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    break;
                case 1:
                    resultPositionDto = this.resultPositionDtoAdapter.fromJson(jsonReader);
                    if (resultPositionDto == null) {
                        throw Util.unexpectedNull("resultPosition", "result_position", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    addressDetailsBubbleDto = this.nullableAddressDetailsBubbleDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    addressDetailsFieldTypeDto = this.addressDetailsFieldTypeDtoAdapter.fromJson(jsonReader);
                    if (addressDetailsFieldTypeDto == null) {
                        throw Util.unexpectedNull("field_", "field", jsonReader);
                    }
                    break;
                case 5:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    horizontalPaddingsDto = this.nullableHorizontalPaddingsDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (resultPositionDto == null) {
            throw Util.missingProperty("resultPosition", "result_position", jsonReader);
        }
        if (addressDetailsFieldTypeDto != null) {
            return new AddressDetailsInputFieldWidgetDto(str, resultPositionDto, str2, addressDetailsBubbleDto, addressDetailsFieldTypeDto, slotTrailDto, horizontalPaddingsDto);
        }
        throw Util.missingProperty("field_", "field", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressDetailsInputFieldWidgetDto addressDetailsInputFieldWidgetDto) {
        AddressDetailsInputFieldWidgetDto addressDetailsInputFieldWidgetDto2 = addressDetailsInputFieldWidgetDto;
        if (addressDetailsInputFieldWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getWidgetId());
        jsonWriter.name("result_position");
        this.resultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getResultPosition());
        jsonWriter.name("placeholder");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getPlaceholder());
        jsonWriter.name("bubble");
        this.nullableAddressDetailsBubbleDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getBubble());
        jsonWriter.name("field");
        this.addressDetailsFieldTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getField());
        jsonWriter.name("trail1");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getTrail1());
        jsonWriter.name("horizontal_paddings");
        this.nullableHorizontalPaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsInputFieldWidgetDto2.getHorizontalPaddings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(AddressDetailsInputFieldWidgetDto)");
    }
}
