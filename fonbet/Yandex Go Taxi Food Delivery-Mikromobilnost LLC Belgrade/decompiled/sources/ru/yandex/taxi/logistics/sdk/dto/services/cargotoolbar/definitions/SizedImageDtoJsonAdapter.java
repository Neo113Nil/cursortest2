package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SizedImageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SizedImageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageDto;", "imageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SizedImageDtoJsonAdapter extends JsonAdapter<SizedImageDto> {
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "width", "height");

    public SizedImageDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "image");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "width");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SizedImageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ImageDto imageDto = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                if (imageDto == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("width", "width", jsonReader);
                }
            } else if (selectName == 2 && (num2 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("height", "height", jsonReader);
            }
        }
        jsonReader.endObject();
        if (imageDto == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("width", "width", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new SizedImageDto(imageDto, intValue, num2.intValue());
        }
        throw Util.missingProperty("height", "height", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SizedImageDto sizedImageDto) {
        SizedImageDto sizedImageDto2 = sizedImageDto;
        if (sizedImageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) sizedImageDto2.getImage());
        jsonWriter.name("width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(sizedImageDto2.getWidth()));
        jsonWriter.name("height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(sizedImageDto2.getHeight()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(SizedImageDto)");
    }
}
