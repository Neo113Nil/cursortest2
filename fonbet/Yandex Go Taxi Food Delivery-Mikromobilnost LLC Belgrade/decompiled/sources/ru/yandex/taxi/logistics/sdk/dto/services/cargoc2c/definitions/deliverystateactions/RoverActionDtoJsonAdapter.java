package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RoverActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/RoverActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto;", "nullableStateModalDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RoverActionDtoJsonAdapter extends JsonAdapter<RoverActionDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<StateModalDto> nullableStateModalDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action", "title", "payload", "confirmation_modal");
    private final JsonAdapter<String> stringAdapter;

    public RoverActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "payload");
        this.nullableStateModalDtoAdapter = moshi.adapter(StateModalDto.class, emptySet, "confirmationModal");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoverActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Object obj = null;
        StateModalDto stateModalDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull("payload", "payload", jsonReader);
                }
            } else if (selectName == 3) {
                stateModalDto = this.nullableStateModalDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (obj != null) {
            return new RoverActionDto(str, str2, obj, stateModalDto);
        }
        throw Util.missingProperty("payload", "payload", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoverActionDto roverActionDto) {
        RoverActionDto roverActionDto2 = roverActionDto;
        if (roverActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roverActionDto2.getAction());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roverActionDto2.getTitle());
        jsonWriter.name("payload");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) roverActionDto2.getPayload());
        jsonWriter.name("confirmation_modal");
        this.nullableStateModalDtoAdapter.toJson(jsonWriter, (JsonWriter) roverActionDto2.getConfirmationModal());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(RoverActionDto)");
    }
}
