package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto_ProgressIndicatorDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$ProgressIndicatorDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "colorDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MissionProgressDto_ProgressIndicatorDtoJsonAdapter extends JsonAdapter<MissionProgressDto.ProgressIndicatorDto> {
    private final JsonAdapter<ColorDto> colorDtoAdapter;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("progress", "fill_color", "track_color");

    public MissionProgressDto_ProgressIndicatorDtoJsonAdapter(Moshi moshi) {
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.doubleAdapter = moshi.adapter(cls, emptySet, "progress");
        this.colorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "fillColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MissionProgressDto.ProgressIndicatorDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        ColorDto colorDto = null;
        ColorDto colorDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("progress", "progress", jsonReader);
                }
            } else if (selectName == 1) {
                colorDto = this.colorDtoAdapter.fromJson(jsonReader);
                if (colorDto == null) {
                    throw Util.unexpectedNull("fillColor", "fill_color", jsonReader);
                }
            } else if (selectName == 2 && (colorDto2 = this.colorDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("trackColor", "track_color", jsonReader);
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("progress", "progress", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (colorDto == null) {
            throw Util.missingProperty("fillColor", "fill_color", jsonReader);
        }
        if (colorDto2 != null) {
            return new MissionProgressDto.ProgressIndicatorDto(doubleValue, colorDto, colorDto2);
        }
        throw Util.missingProperty("trackColor", "track_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MissionProgressDto.ProgressIndicatorDto progressIndicatorDto) {
        MissionProgressDto.ProgressIndicatorDto progressIndicatorDto2 = progressIndicatorDto;
        if (progressIndicatorDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("progress");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(progressIndicatorDto2.getProgress()));
        jsonWriter.name("fill_color");
        this.colorDtoAdapter.toJson(jsonWriter, (JsonWriter) progressIndicatorDto2.getFillColor());
        jsonWriter.name("track_color");
        this.colorDtoAdapter.toJson(jsonWriter, (JsonWriter) progressIndicatorDto2.getTrackColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(MissionProgressDto.ProgressIndicatorDto)");
    }
}
