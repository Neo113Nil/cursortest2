package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormContactInputLayoutDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormContactInputLayoutDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhoneSelectionScreenConfigDto;", "nullablePhoneSelectionScreenConfigDtoAdapter", "", "nullableBooleanAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DetailFormContactInputLayoutDtoJsonAdapter extends JsonAdapter<DetailFormContactInputLayoutDto> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<PhoneSelectionScreenConfigDto> nullablePhoneSelectionScreenConfigDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "selection_screen", "is_locked", "current_value", "edit_field_name", "select_contact_button_title");

    public DetailFormContactInputLayoutDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullablePhoneSelectionScreenConfigDtoAdapter = moshi.adapter(PhoneSelectionScreenConfigDto.class, emptySet, "selectionScreen");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isLocked");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DetailFormContactInputLayoutDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    phoneSelectionScreenConfigDto = this.nullablePhoneSelectionScreenConfigDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new DetailFormContactInputLayoutDto(str, phoneSelectionScreenConfigDto, bool, str2, str3, str4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DetailFormContactInputLayoutDto detailFormContactInputLayoutDto) {
        DetailFormContactInputLayoutDto detailFormContactInputLayoutDto2 = detailFormContactInputLayoutDto;
        if (detailFormContactInputLayoutDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) detailFormContactInputLayoutDto2.getTitle());
        jsonWriter.name("selection_screen");
        this.nullablePhoneSelectionScreenConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormContactInputLayoutDto2.getSelectionScreen());
        jsonWriter.name("is_locked");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) detailFormContactInputLayoutDto2.isLocked());
        jsonWriter.name("current_value");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) detailFormContactInputLayoutDto2.getCurrentValue());
        jsonWriter.name("edit_field_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) detailFormContactInputLayoutDto2.getEditFieldName());
        jsonWriter.name("select_contact_button_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) detailFormContactInputLayoutDto2.getSelectContactButtonTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(DetailFormContactInputLayoutDto)");
    }
}
