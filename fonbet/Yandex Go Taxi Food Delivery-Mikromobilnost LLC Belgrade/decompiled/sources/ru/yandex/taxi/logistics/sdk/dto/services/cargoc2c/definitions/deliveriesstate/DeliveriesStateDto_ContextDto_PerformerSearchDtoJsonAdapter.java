package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate.DeliveriesStateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchStatusDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.MapAnimationDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto_ContextDto_PerformerSearchDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchStatusDto;", "nullableListOfDynamicSearchStatusDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/MapAnimationDto;", "nullableMapAnimationDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveriesStateDto_ContextDto_PerformerSearchDtoJsonAdapter extends JsonAdapter<DeliveriesStateDto.ContextDto.PerformerSearchDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<DynamicSearchStatusDto>> nullableListOfDynamicSearchStatusDtoAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<MapAnimationDto> nullableMapAnimationDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_in_progress", "estimate", "dynamic_search_statuses", "map_animation");

    public DeliveriesStateDto_ContextDto_PerformerSearchDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isInProgress");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "estimate");
        this.nullableListOfDynamicSearchStatusDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DynamicSearchStatusDto.class), emptySet, "dynamicSearchStatuses");
        this.nullableMapAnimationDtoAdapter = moshi.adapter(MapAnimationDto.class, emptySet, "mapAnimation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveriesStateDto.ContextDto.PerformerSearchDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Long l = null;
        List<DynamicSearchStatusDto> list = null;
        MapAnimationDto mapAnimationDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isInProgress", "is_in_progress", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                list = this.nullableListOfDynamicSearchStatusDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                mapAnimationDto = this.nullableMapAnimationDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool != null) {
            return new DeliveriesStateDto.ContextDto.PerformerSearchDto(bool.booleanValue(), l, list, mapAnimationDto);
        }
        throw Util.missingProperty("isInProgress", "is_in_progress", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveriesStateDto.ContextDto.PerformerSearchDto performerSearchDto) {
        DeliveriesStateDto.ContextDto.PerformerSearchDto performerSearchDto2 = performerSearchDto;
        if (performerSearchDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_in_progress");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(performerSearchDto2.isInProgress()));
        jsonWriter.name("estimate");
        this.nullableLongAdapter.toJson(jsonWriter, (JsonWriter) performerSearchDto2.getEstimate());
        jsonWriter.name("dynamic_search_statuses");
        this.nullableListOfDynamicSearchStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) performerSearchDto2.getDynamicSearchStatuses());
        jsonWriter.name("map_animation");
        this.nullableMapAnimationDtoAdapter.toJson(jsonWriter, (JsonWriter) performerSearchDto2.getMapAnimation());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(70, "GeneratedJsonAdapter(DeliveriesStateDto.ContextDto.PerformerSearchDto)");
    }
}
