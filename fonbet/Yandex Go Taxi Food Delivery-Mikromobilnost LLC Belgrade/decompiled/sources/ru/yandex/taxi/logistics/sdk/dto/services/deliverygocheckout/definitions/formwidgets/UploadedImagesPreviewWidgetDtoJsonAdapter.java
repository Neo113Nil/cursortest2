package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.UploadedImagesPreviewWidgetDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "nullableResultPositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto$SizeDto;", "sizeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "nullablePaddingsDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadedImagesPreviewWidgetDtoJsonAdapter extends JsonAdapter<UploadedImagesPreviewWidgetDto> {
    private volatile Constructor<UploadedImagesPreviewWidgetDto> constructorRef;
    private final JsonAdapter<PaddingsDto> nullablePaddingsDtoAdapter;
    private final JsonAdapter<ResultPositionDto> nullableResultPositionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "form_state_key", "result_position", "size", "content_paddings", "metrica_label");
    private final JsonAdapter<UploadedImagesPreviewWidgetDto.SizeDto> sizeDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public UploadedImagesPreviewWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableResultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "resultPosition");
        this.sizeDtoAdapter = moshi.adapter(UploadedImagesPreviewWidgetDto.SizeDto.class, emptySet, "size");
        this.nullablePaddingsDtoAdapter = moshi.adapter(PaddingsDto.class, emptySet, "contentPaddings");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UploadedImagesPreviewWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        ResultPositionDto resultPositionDto = null;
        UploadedImagesPreviewWidgetDto.SizeDto sizeDto = null;
        PaddingsDto paddingsDto = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("formStateKey", "form_state_key", jsonReader);
                    }
                    break;
                case 2:
                    resultPositionDto = this.nullableResultPositionDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    sizeDto = this.sizeDtoAdapter.fromJson(jsonReader);
                    if (sizeDto == null) {
                        throw Util.unexpectedNull("size", "size", jsonReader);
                    }
                    i = -9;
                    break;
                case 4:
                    paddingsDto = this.nullablePaddingsDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            String str4 = str3;
            PaddingsDto paddingsDto2 = paddingsDto;
            UploadedImagesPreviewWidgetDto.SizeDto sizeDto2 = sizeDto;
            ResultPositionDto resultPositionDto2 = resultPositionDto;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw Util.missingProperty("widgetId", "widget_id", jsonReader);
            }
            if (str5 != null) {
                return new UploadedImagesPreviewWidgetDto(str6, str5, resultPositionDto2, sizeDto2, paddingsDto2, str4);
            }
            throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
        }
        String str7 = str3;
        PaddingsDto paddingsDto3 = paddingsDto;
        UploadedImagesPreviewWidgetDto.SizeDto sizeDto3 = sizeDto;
        ResultPositionDto resultPositionDto3 = resultPositionDto;
        String str8 = str2;
        String str9 = str;
        Constructor<UploadedImagesPreviewWidgetDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UploadedImagesPreviewWidgetDto.class.getDeclaredConstructor(String.class, String.class, ResultPositionDto.class, UploadedImagesPreviewWidgetDto.SizeDto.class, PaddingsDto.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str9 == null) {
            throw Util.missingProperty("widgetId", "widget_id", jsonReader);
        }
        if (str8 != null) {
            return constructor.newInstance(str9, str8, resultPositionDto3, sizeDto3, paddingsDto3, str7, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("formStateKey", "form_state_key", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UploadedImagesPreviewWidgetDto uploadedImagesPreviewWidgetDto) {
        UploadedImagesPreviewWidgetDto uploadedImagesPreviewWidgetDto2 = uploadedImagesPreviewWidgetDto;
        if (uploadedImagesPreviewWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadedImagesPreviewWidgetDto2.getWidgetId());
        jsonWriter.name("form_state_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) uploadedImagesPreviewWidgetDto2.getFormStateKey());
        jsonWriter.name("result_position");
        this.nullableResultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) uploadedImagesPreviewWidgetDto2.getResultPosition());
        jsonWriter.name("size");
        this.sizeDtoAdapter.toJson(jsonWriter, (JsonWriter) uploadedImagesPreviewWidgetDto2.getSize());
        jsonWriter.name("content_paddings");
        this.nullablePaddingsDtoAdapter.toJson(jsonWriter, (JsonWriter) uploadedImagesPreviewWidgetDto2.getContentPaddings());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) uploadedImagesPreviewWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(UploadedImagesPreviewWidgetDto)");
    }
}
