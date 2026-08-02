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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.GridItemDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutPositionDto;", "gridLayoutPositionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;", "contentDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "nullableGridLayoutSizeDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GridItemDtoJsonAdapter extends JsonAdapter<GridItemDto> {
    private final JsonAdapter<GridItemDto.ContentDto> contentDtoAdapter;
    private final JsonAdapter<GridLayoutPositionDto> gridLayoutPositionDtoAdapter;
    private final JsonAdapter<GridLayoutSizeDto> nullableGridLayoutSizeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("position", "content", "size");

    public GridItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.gridLayoutPositionDtoAdapter = moshi.adapter(GridLayoutPositionDto.class, emptySet, "position");
        this.contentDtoAdapter = moshi.adapter(GridItemDto.ContentDto.class, emptySet, "content");
        this.nullableGridLayoutSizeDtoAdapter = moshi.adapter(GridLayoutSizeDto.class, emptySet, "size");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GridItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        GridLayoutPositionDto gridLayoutPositionDto = null;
        GridItemDto.ContentDto contentDto = null;
        GridLayoutSizeDto gridLayoutSizeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                gridLayoutPositionDto = this.gridLayoutPositionDtoAdapter.fromJson(jsonReader);
                if (gridLayoutPositionDto == null) {
                    throw Util.unexpectedNull("position", "position", jsonReader);
                }
            } else if (selectName == 1) {
                contentDto = this.contentDtoAdapter.fromJson(jsonReader);
                if (contentDto == null) {
                    throw Util.unexpectedNull("content", "content", jsonReader);
                }
            } else if (selectName == 2) {
                gridLayoutSizeDto = this.nullableGridLayoutSizeDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (gridLayoutPositionDto == null) {
            throw Util.missingProperty("position", "position", jsonReader);
        }
        if (contentDto != null) {
            return new GridItemDto(gridLayoutPositionDto, contentDto, gridLayoutSizeDto);
        }
        throw Util.missingProperty("content", "content", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GridItemDto gridItemDto) {
        GridItemDto gridItemDto2 = gridItemDto;
        if (gridItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("position");
        this.gridLayoutPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) gridItemDto2.getPosition());
        jsonWriter.name("content");
        this.contentDtoAdapter.toJson(jsonWriter, (JsonWriter) gridItemDto2.getContent());
        jsonWriter.name("size");
        this.nullableGridLayoutSizeDtoAdapter.toJson(jsonWriter, (JsonWriter) gridItemDto2.getSize());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(GridItemDto)");
    }
}
