package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArBoxesSmartCameraDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArBoxesSmartCameraDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArSmartCameraBoxSizeDto;", "listOfArSmartCameraBoxSizeDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ArBoxesSmartCameraDtoJsonAdapter extends JsonAdapter<ArBoxesSmartCameraDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<List<ArSmartCameraBoxSizeDto>> listOfArSmartCameraBoxSizeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("screen_title", "surface_scan_text", "box_sizes", "form_state_box_size_key", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public ArBoxesSmartCameraDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "screenTitle");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "surfaceScanText");
        this.listOfArSmartCameraBoxSizeDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ArSmartCameraBoxSizeDto.class), emptySet, "boxSizes");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ArBoxesSmartCameraDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        String str = null;
        List<ArSmartCameraBoxSizeDto> list = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            AttributedTextDto attributedTextDto2 = attributedTextDto;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                if (attributedTextDto == null) {
                    throw Util.unexpectedNull("screenTitle", "screen_title", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("surfaceScanText", "surface_scan_text", jsonReader);
                }
            } else if (selectName == 2) {
                list = this.listOfArSmartCameraBoxSizeDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("boxSizes", "box_sizes", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("formStateBoxSizeKey", "form_state_box_size_key", jsonReader);
                }
            } else if (selectName == 4) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
            attributedTextDto = attributedTextDto2;
        }
        AttributedTextDto attributedTextDto3 = attributedTextDto;
        jsonReader.endObject();
        if (attributedTextDto3 == null) {
            throw Util.missingProperty("screenTitle", "screen_title", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("surfaceScanText", "surface_scan_text", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("boxSizes", "box_sizes", jsonReader);
        }
        if (str2 != null) {
            return new ArBoxesSmartCameraDto(attributedTextDto3, str, list, str2, str3);
        }
        throw Util.missingProperty("formStateBoxSizeKey", "form_state_box_size_key", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ArBoxesSmartCameraDto arBoxesSmartCameraDto) {
        ArBoxesSmartCameraDto arBoxesSmartCameraDto2 = arBoxesSmartCameraDto;
        if (arBoxesSmartCameraDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("screen_title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) arBoxesSmartCameraDto2.getScreenTitle());
        jsonWriter.name("surface_scan_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) arBoxesSmartCameraDto2.getSurfaceScanText());
        jsonWriter.name("box_sizes");
        this.listOfArSmartCameraBoxSizeDtoAdapter.toJson(jsonWriter, (JsonWriter) arBoxesSmartCameraDto2.getBoxSizes());
        jsonWriter.name("form_state_box_size_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) arBoxesSmartCameraDto2.getFormStateBoxSizeKey());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) arBoxesSmartCameraDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ArBoxesSmartCameraDto)");
    }
}
