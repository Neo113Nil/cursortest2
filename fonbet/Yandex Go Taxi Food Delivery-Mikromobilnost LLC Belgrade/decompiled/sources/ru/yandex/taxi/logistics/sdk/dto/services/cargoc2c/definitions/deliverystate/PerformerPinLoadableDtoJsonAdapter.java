package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerPinLoadableDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerPinLoadableDto$AnchorDto;", "anchorDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PerformerPinLoadableDtoJsonAdapter extends JsonAdapter<PerformerPinLoadableDto> {
    private final JsonAdapter<PerformerPinLoadableDto.AnchorDto> anchorDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image_tag", "rotatable", "anchor");
    private final JsonAdapter<String> stringAdapter;

    public PerformerPinLoadableDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "imageTag");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "rotatable");
        this.anchorDtoAdapter = moshi.adapter(PerformerPinLoadableDto.AnchorDto.class, emptySet, "anchor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PerformerPinLoadableDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Boolean bool = null;
        PerformerPinLoadableDto.AnchorDto anchorDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("imageTag", "image_tag", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("rotatable", "rotatable", jsonReader);
                }
            } else if (selectName == 2 && (anchorDto = this.anchorDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("anchor", "anchor", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("imageTag", "image_tag", jsonReader);
        }
        if (bool == null) {
            throw Util.missingProperty("rotatable", "rotatable", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (anchorDto != null) {
            return new PerformerPinLoadableDto(str, booleanValue, anchorDto);
        }
        throw Util.missingProperty("anchor", "anchor", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PerformerPinLoadableDto performerPinLoadableDto) {
        PerformerPinLoadableDto performerPinLoadableDto2 = performerPinLoadableDto;
        if (performerPinLoadableDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image_tag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) performerPinLoadableDto2.getImageTag());
        jsonWriter.name("rotatable");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(performerPinLoadableDto2.getRotatable()));
        jsonWriter.name("anchor");
        this.anchorDtoAdapter.toJson(jsonWriter, (JsonWriter) performerPinLoadableDto2.getAnchor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(PerformerPinLoadableDto)");
    }
}
