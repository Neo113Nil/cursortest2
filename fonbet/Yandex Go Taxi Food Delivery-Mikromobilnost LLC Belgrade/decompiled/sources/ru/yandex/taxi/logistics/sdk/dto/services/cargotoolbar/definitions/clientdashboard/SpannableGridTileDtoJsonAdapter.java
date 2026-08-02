package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpannableGridTileDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpannableGridTileDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "tileDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SpannableGridTileDtoJsonAdapter extends JsonAdapter<SpannableGridTileDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("tile", "column", "row", "width", "height");
    private final JsonAdapter<TileDto> tileDtoAdapter;

    public SpannableGridTileDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.tileDtoAdapter = moshi.adapter(TileDto.class, emptySet, "tile");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "column");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SpannableGridTileDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        TileDto tileDto = null;
        Integer num3 = null;
        Integer num4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                tileDto = this.tileDtoAdapter.fromJson(jsonReader);
                if (tileDto == null) {
                    throw Util.unexpectedNull("tile", "tile", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("column", "column", jsonReader);
                }
            } else if (selectName == 2) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("row", "row", jsonReader);
                }
            } else if (selectName == 3) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("width", "width", jsonReader);
                }
            } else if (selectName == 4 && (num4 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("height", "height", jsonReader);
            }
        }
        jsonReader.endObject();
        Integer num5 = num2;
        if (tileDto == null) {
            throw Util.missingProperty("tile", "tile", jsonReader);
        }
        if (num == null) {
            throw Util.missingProperty("column", "column", jsonReader);
        }
        int intValue = num.intValue();
        if (num5 == null) {
            throw Util.missingProperty("row", "row", jsonReader);
        }
        int intValue2 = num5.intValue();
        if (num3 == null) {
            throw Util.missingProperty("width", "width", jsonReader);
        }
        int intValue3 = num3.intValue();
        if (num4 != null) {
            return new SpannableGridTileDto(tileDto, intValue, intValue2, intValue3, num4.intValue());
        }
        throw Util.missingProperty("height", "height", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SpannableGridTileDto spannableGridTileDto) {
        SpannableGridTileDto spannableGridTileDto2 = spannableGridTileDto;
        if (spannableGridTileDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("tile");
        this.tileDtoAdapter.toJson(jsonWriter, (JsonWriter) spannableGridTileDto2.getTile());
        jsonWriter.name("column");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(spannableGridTileDto2.getColumn()));
        jsonWriter.name("row");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(spannableGridTileDto2.getRow()));
        jsonWriter.name("width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(spannableGridTileDto2.getWidth()));
        jsonWriter.name("height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(spannableGridTileDto2.getHeight()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(SpannableGridTileDto)");
    }
}
