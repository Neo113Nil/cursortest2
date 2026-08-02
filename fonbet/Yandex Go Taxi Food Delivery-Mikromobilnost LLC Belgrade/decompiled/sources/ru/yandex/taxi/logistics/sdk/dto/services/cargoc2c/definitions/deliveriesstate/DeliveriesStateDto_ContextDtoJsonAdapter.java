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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.DisplayTargetsItemDto;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto_ContextDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto$ContextDto$PerformerSearchDto;", "nullablePerformerSearchDtoAdapter", "", "nullableStringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/DisplayTargetsItemDto;", "listOfDisplayTargetsItemDtoAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveriesStateDto_ContextDtoJsonAdapter extends JsonAdapter<DeliveriesStateDto.ContextDto> {
    private final JsonAdapter<List<DisplayTargetsItemDto>> listOfDisplayTargetsItemDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DeliveriesStateDto.ContextDto.PerformerSearchDto> nullablePerformerSearchDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_performer_position_available", "is_completed", "should_track_geo", "auto_open_postcard", "restore_preorder", "performer_search", "original_order_id", "display_targets", "ads_on_map_meta");

    public DeliveriesStateDto_ContextDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isPerformerPositionAvailable");
        this.nullablePerformerSearchDtoAdapter = moshi.adapter(DeliveriesStateDto.ContextDto.PerformerSearchDto.class, emptySet, "performerSearch");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "originalOrderId");
        this.listOfDisplayTargetsItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DisplayTargetsItemDto.class), emptySet, "displayTargets");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "adsOnMapMeta");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveriesStateDto.ContextDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        DeliveriesStateDto.ContextDto.PerformerSearchDto performerSearchDto = null;
        String str = null;
        List<DisplayTargetsItemDto> list = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    performerSearchDto = this.nullablePerformerSearchDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list = this.listOfDisplayTargetsItemDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("displayTargets", "display_targets", jsonReader);
                    }
                    break;
                case 8:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new DeliveriesStateDto.ContextDto(bool, bool2, bool3, bool4, bool5, performerSearchDto, str, list, obj);
        }
        throw Util.missingProperty("displayTargets", "display_targets", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveriesStateDto.ContextDto contextDto) {
        DeliveriesStateDto.ContextDto contextDto2 = contextDto;
        if (contextDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_performer_position_available");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.isPerformerPositionAvailable());
        jsonWriter.name("is_completed");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.isCompleted());
        jsonWriter.name("should_track_geo");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getShouldTrackGeo());
        jsonWriter.name("auto_open_postcard");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getAutoOpenPostcard());
        jsonWriter.name("restore_preorder");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getRestorePreorder());
        jsonWriter.name("performer_search");
        this.nullablePerformerSearchDtoAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getPerformerSearch());
        jsonWriter.name("original_order_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getOriginalOrderId());
        jsonWriter.name("display_targets");
        this.listOfDisplayTargetsItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getDisplayTargets());
        jsonWriter.name("ads_on_map_meta");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) contextDto2.getAdsOnMapMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(DeliveriesStateDto.ContextDto)");
    }
}
