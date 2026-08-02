package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhotocommentsConfigDtoJsonAdapter extends JsonAdapter<PhotocommentsConfigDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("max_photo_width", "max_photo_height", "max_point_photocomments");

    public PhotocommentsConfigDtoJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.a, "maxPhotoWidth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PhotocommentsConfigDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("maxPhotoWidth", "max_photo_width", jsonReader);
                }
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("maxPhotoHeight", "max_photo_height", jsonReader);
                }
            } else if (selectName == 2 && (num3 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("maxPointPhotocomments", "max_point_photocomments", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("maxPhotoWidth", "max_photo_width", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("maxPhotoHeight", "max_photo_height", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (num3 != null) {
            return new PhotocommentsConfigDto(intValue, intValue2, num3.intValue());
        }
        throw Util.missingProperty("maxPointPhotocomments", "max_point_photocomments", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PhotocommentsConfigDto photocommentsConfigDto) {
        PhotocommentsConfigDto photocommentsConfigDto2 = photocommentsConfigDto;
        if (photocommentsConfigDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("max_photo_width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(photocommentsConfigDto2.getMaxPhotoWidth()));
        jsonWriter.name("max_photo_height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(photocommentsConfigDto2.getMaxPhotoHeight()));
        jsonWriter.name("max_point_photocomments");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(photocommentsConfigDto2.getMaxPointPhotocomments()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(PhotocommentsConfigDto)");
    }
}
