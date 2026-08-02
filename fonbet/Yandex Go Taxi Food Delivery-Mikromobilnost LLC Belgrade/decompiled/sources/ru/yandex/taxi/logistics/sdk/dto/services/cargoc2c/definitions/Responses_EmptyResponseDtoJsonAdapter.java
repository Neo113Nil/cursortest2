package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses_EmptyResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$EmptyResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Responses_EmptyResponseDtoJsonAdapter extends JsonAdapter<Responses$EmptyResponseDto> {
    private final JsonReader.Options options = JsonReader.Options.of(new String[0]);

    public Responses_EmptyResponseDtoJsonAdapter(Moshi moshi) {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$EmptyResponseDto] */
    @Override // com.squareup.moshi.JsonAdapter
    public final Responses$EmptyResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(this.options) == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new Object() { // from class: ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$EmptyResponseDto
        };
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Responses$EmptyResponseDto responses$EmptyResponseDto) {
        if (responses$EmptyResponseDto == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(Responses.EmptyResponseDto)");
    }
}
