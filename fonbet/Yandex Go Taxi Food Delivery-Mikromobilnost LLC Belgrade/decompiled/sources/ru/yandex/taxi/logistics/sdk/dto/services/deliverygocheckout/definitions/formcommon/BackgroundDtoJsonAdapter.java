package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundContentDto;", "listOfBackgroundContentDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundDtoJsonAdapter extends JsonAdapter<BackgroundDto> {
    private final JsonAdapter<List<BackgroundContentDto>> listOfBackgroundContentDtoAdapter;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("content", "paddings");

    public BackgroundDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, BackgroundContentDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfBackgroundContentDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "content");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "paddings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BackgroundDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<BackgroundContentDto> list = null;
        PaddingsDto paddingsDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfBackgroundContentDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("content", "content", jsonReader);
                }
            } else if (selectName == 1) {
                paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new BackgroundDto(list, paddingsDto);
        }
        throw Util.missingProperty("content", "content", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BackgroundDto backgroundDto) {
        BackgroundDto backgroundDto2 = backgroundDto;
        if (backgroundDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content");
        this.listOfBackgroundContentDtoAdapter.toJson(jsonWriter, (JsonWriter) backgroundDto2.getContent());
        jsonWriter.name("paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) backgroundDto2.getPaddings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(BackgroundDto)");
    }
}
