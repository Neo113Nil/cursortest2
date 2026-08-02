package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/LinearGradientDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/LinearGradientDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/GradientStopDto;", "listOfGradientStopDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinearGradientDtoJsonAdapter extends JsonAdapter<LinearGradientDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<List<GradientStopDto>> listOfGradientStopDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("stops", "angleDeg");

    public LinearGradientDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, GradientStopDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfGradientStopDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "stops");
        this.doubleAdapter = moshi.adapter(Double.TYPE, emptySet, "angleDeg");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LinearGradientDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<GradientStopDto> list = null;
        Double d = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfGradientStopDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("stops", "stops", jsonReader);
                }
            } else if (selectName == 1 && (d = this.doubleAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("angleDeg", "angleDeg", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("stops", "stops", jsonReader);
        }
        if (d != null) {
            return new LinearGradientDto(list, d.doubleValue());
        }
        throw Util.missingProperty("angleDeg", "angleDeg", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LinearGradientDto linearGradientDto) {
        LinearGradientDto linearGradientDto2 = linearGradientDto;
        if (linearGradientDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stops");
        this.listOfGradientStopDtoAdapter.toJson(jsonWriter, (JsonWriter) linearGradientDto2.getStops());
        jsonWriter.name("angleDeg");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(linearGradientDto2.getAngleDeg()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(LinearGradientDto)");
    }
}
