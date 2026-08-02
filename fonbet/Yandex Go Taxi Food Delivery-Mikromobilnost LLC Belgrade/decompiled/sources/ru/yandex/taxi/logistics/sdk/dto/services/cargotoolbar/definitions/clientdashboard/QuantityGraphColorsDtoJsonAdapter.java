package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphColorsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphColorsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "nullableColorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QuantityGraphColorsDtoJsonAdapter extends JsonAdapter<QuantityGraphColorsDto> {
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("quantity_color", "caption_color", "graph_color", "graph_color_accent");

    public QuantityGraphColorsDtoJsonAdapter(Moshi moshi) {
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, EmptySet.a, "quantityColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final QuantityGraphColorsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        ColorDto colorDto3 = null;
        ColorDto colorDto4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                colorDto2 = this.nullableColorDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                colorDto3 = this.nullableColorDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                colorDto4 = this.nullableColorDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new QuantityGraphColorsDto(colorDto, colorDto2, colorDto3, colorDto4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, QuantityGraphColorsDto quantityGraphColorsDto) {
        QuantityGraphColorsDto quantityGraphColorsDto2 = quantityGraphColorsDto;
        if (quantityGraphColorsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("quantity_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) quantityGraphColorsDto2.getQuantityColor());
        jsonWriter.name("caption_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) quantityGraphColorsDto2.getCaptionColor());
        jsonWriter.name("graph_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) quantityGraphColorsDto2.getGraphColor());
        jsonWriter.name("graph_color_accent");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) quantityGraphColorsDto2.getGraphColorAccent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(QuantityGraphColorsDto)");
    }
}
