package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormHeaderLayoutDto;", "nullableDetailFormHeaderLayoutDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointLayoutDto;", "nullableDetailFormRoutePointLayoutDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "nullableListOfDetailFormRoutePointFieldLayoutDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormButtonLayoutDto;", "nullableDetailFormButtonLayoutDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDto;", "nullablePhotocommentsConfigDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/VerticalBarDto;", "nullableVerticalBarDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DetailFormLayoutDtoJsonAdapter extends JsonAdapter<DetailFormLayoutDto> {
    private final JsonAdapter<DetailFormButtonLayoutDto> nullableDetailFormButtonLayoutDtoAdapter;
    private final JsonAdapter<DetailFormHeaderLayoutDto> nullableDetailFormHeaderLayoutDtoAdapter;
    private final JsonAdapter<DetailFormRoutePointLayoutDto> nullableDetailFormRoutePointLayoutDtoAdapter;
    private final JsonAdapter<List<DetailFormRoutePointFieldLayoutDto>> nullableListOfDetailFormRoutePointFieldLayoutDtoAdapter;
    private final JsonAdapter<PhotocommentsConfigDto> nullablePhotocommentsConfigDtoAdapter;
    private final JsonAdapter<VerticalBarDto> nullableVerticalBarDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "source", "destination", "extra_fields", "button", "photocomments", "vertical_bar");

    public DetailFormLayoutDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableDetailFormHeaderLayoutDtoAdapter = moshi.adapter(DetailFormHeaderLayoutDto.class, emptySet, "header");
        this.nullableDetailFormRoutePointLayoutDtoAdapter = moshi.adapter(DetailFormRoutePointLayoutDto.class, emptySet, "source");
        this.nullableListOfDetailFormRoutePointFieldLayoutDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DetailFormRoutePointFieldLayoutDto.class), emptySet, "extraFields");
        this.nullableDetailFormButtonLayoutDtoAdapter = moshi.adapter(DetailFormButtonLayoutDto.class, emptySet, "button");
        this.nullablePhotocommentsConfigDtoAdapter = moshi.adapter(PhotocommentsConfigDto.class, emptySet, "photocomments");
        this.nullableVerticalBarDtoAdapter = moshi.adapter(VerticalBarDto.class, emptySet, "verticalBar");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DetailFormLayoutDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DetailFormHeaderLayoutDto detailFormHeaderLayoutDto = null;
        DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto = null;
        DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto2 = null;
        List<DetailFormRoutePointFieldLayoutDto> list = null;
        DetailFormButtonLayoutDto detailFormButtonLayoutDto = null;
        PhotocommentsConfigDto photocommentsConfigDto = null;
        VerticalBarDto verticalBarDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    detailFormHeaderLayoutDto = this.nullableDetailFormHeaderLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    detailFormRoutePointLayoutDto = this.nullableDetailFormRoutePointLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    detailFormRoutePointLayoutDto2 = this.nullableDetailFormRoutePointLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    list = this.nullableListOfDetailFormRoutePointFieldLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    detailFormButtonLayoutDto = this.nullableDetailFormButtonLayoutDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    photocommentsConfigDto = this.nullablePhotocommentsConfigDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    verticalBarDto = this.nullableVerticalBarDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new DetailFormLayoutDto(detailFormHeaderLayoutDto, detailFormRoutePointLayoutDto, detailFormRoutePointLayoutDto2, list, detailFormButtonLayoutDto, photocommentsConfigDto, verticalBarDto);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DetailFormLayoutDto detailFormLayoutDto) {
        DetailFormLayoutDto detailFormLayoutDto2 = detailFormLayoutDto;
        if (detailFormLayoutDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.nullableDetailFormHeaderLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getHeader());
        jsonWriter.name("source");
        this.nullableDetailFormRoutePointLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getSource());
        jsonWriter.name("destination");
        this.nullableDetailFormRoutePointLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getDestination());
        jsonWriter.name("extra_fields");
        this.nullableListOfDetailFormRoutePointFieldLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getExtraFields());
        jsonWriter.name("button");
        this.nullableDetailFormButtonLayoutDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getButton());
        jsonWriter.name("photocomments");
        this.nullablePhotocommentsConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getPhotocomments());
        jsonWriter.name("vertical_bar");
        this.nullableVerticalBarDtoAdapter.toJson(jsonWriter, (JsonWriter) detailFormLayoutDto2.getVerticalBar());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(DetailFormLayoutDto)");
    }
}
