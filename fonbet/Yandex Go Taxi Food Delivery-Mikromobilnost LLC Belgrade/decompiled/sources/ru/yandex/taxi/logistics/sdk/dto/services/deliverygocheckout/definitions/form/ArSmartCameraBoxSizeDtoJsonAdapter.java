package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArSmartCameraBoxSizeDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArSmartCameraBoxSizeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ArSmartCameraBoxSizeDtoJsonAdapter extends JsonAdapter<ArSmartCameraBoxSizeDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "height_cm", "width_cm", "depth_cm");

    public ArSmartCameraBoxSizeDtoJsonAdapter(Moshi moshi) {
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.a, "id");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ArSmartCameraBoxSizeDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("heightCm", "height_cm", jsonReader);
                }
            } else if (selectName == 2) {
                num3 = this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("widthCm", "width_cm", jsonReader);
                }
            } else if (selectName == 3 && (num4 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("depthCm", "depth_cm", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("heightCm", "height_cm", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (num3 == null) {
            throw Util.missingProperty("widthCm", "width_cm", jsonReader);
        }
        int intValue3 = num3.intValue();
        if (num4 != null) {
            return new ArSmartCameraBoxSizeDto(intValue, intValue2, intValue3, num4.intValue());
        }
        throw Util.missingProperty("depthCm", "depth_cm", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ArSmartCameraBoxSizeDto arSmartCameraBoxSizeDto) {
        ArSmartCameraBoxSizeDto arSmartCameraBoxSizeDto2 = arSmartCameraBoxSizeDto;
        if (arSmartCameraBoxSizeDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(arSmartCameraBoxSizeDto2.getId()));
        jsonWriter.name("height_cm");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(arSmartCameraBoxSizeDto2.getHeightCm()));
        jsonWriter.name("width_cm");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(arSmartCameraBoxSizeDto2.getWidthCm()));
        jsonWriter.name("depth_cm");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(arSmartCameraBoxSizeDto2.getDepthCm()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(ArSmartCameraBoxSizeDto)");
    }
}
