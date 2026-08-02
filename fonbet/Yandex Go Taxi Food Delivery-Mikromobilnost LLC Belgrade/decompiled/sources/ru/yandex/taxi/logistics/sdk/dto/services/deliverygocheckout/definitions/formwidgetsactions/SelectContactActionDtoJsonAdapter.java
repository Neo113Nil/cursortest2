package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectContactActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectContactActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "resultPositionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectContactActionDtoJsonAdapter extends JsonAdapter<SelectContactActionDto> {
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("position", "action_on_contact_selected");
    private final JsonAdapter<ResultPositionDto> resultPositionDtoAdapter;

    public SelectContactActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.resultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "position");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "actionOnContactSelected");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SelectContactActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ResultPositionDto resultPositionDto = null;
        TapActionDto tapActionDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                resultPositionDto = this.resultPositionDtoAdapter.fromJson(jsonReader);
                if (resultPositionDto == null) {
                    throw Util.unexpectedNull("position", "position", jsonReader);
                }
            } else if (selectName == 1) {
                tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (resultPositionDto != null) {
            return new SelectContactActionDto(resultPositionDto, tapActionDto);
        }
        throw Util.missingProperty("position", "position", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SelectContactActionDto selectContactActionDto) {
        SelectContactActionDto selectContactActionDto2 = selectContactActionDto;
        if (selectContactActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("position");
        this.resultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) selectContactActionDto2.getPosition());
        jsonWriter.name("action_on_contact_selected");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) selectContactActionDto2.getActionOnContactSelected());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(SelectContactActionDto)");
    }
}
