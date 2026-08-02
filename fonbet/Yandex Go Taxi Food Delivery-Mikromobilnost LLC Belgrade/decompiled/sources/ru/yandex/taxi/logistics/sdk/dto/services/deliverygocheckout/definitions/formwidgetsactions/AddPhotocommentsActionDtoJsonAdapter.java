package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.UploadImagesConstrainsDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddPhotocommentsActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddPhotocommentsActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;", "uploadImagesConstrainsDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "resultPositionDtoAdapter", "", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddPhotocommentsActionDtoJsonAdapter extends JsonAdapter<AddPhotocommentsActionDto> {
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("constrains", "position", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<ResultPositionDto> resultPositionDtoAdapter;
    private final JsonAdapter<UploadImagesConstrainsDto> uploadImagesConstrainsDtoAdapter;

    public AddPhotocommentsActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.uploadImagesConstrainsDtoAdapter = moshi.adapter(UploadImagesConstrainsDto.class, emptySet, "constrains");
        this.resultPositionDtoAdapter = moshi.adapter(ResultPositionDto.class, emptySet, "position");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddPhotocommentsActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        UploadImagesConstrainsDto uploadImagesConstrainsDto = null;
        ResultPositionDto resultPositionDto = null;
        String str = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                uploadImagesConstrainsDto = this.uploadImagesConstrainsDtoAdapter.fromJson(jsonReader);
                if (uploadImagesConstrainsDto == null) {
                    throw Util.unexpectedNull("constrains", "constrains", jsonReader);
                }
            } else if (selectName == 1) {
                resultPositionDto = this.resultPositionDtoAdapter.fromJson(jsonReader);
                if (resultPositionDto == null) {
                    throw Util.unexpectedNull("position", "position", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                obj = this.nullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (uploadImagesConstrainsDto == null) {
            throw Util.missingProperty("constrains", "constrains", jsonReader);
        }
        if (resultPositionDto != null) {
            return new AddPhotocommentsActionDto(uploadImagesConstrainsDto, resultPositionDto, str, obj);
        }
        throw Util.missingProperty("position", "position", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddPhotocommentsActionDto addPhotocommentsActionDto) {
        AddPhotocommentsActionDto addPhotocommentsActionDto2 = addPhotocommentsActionDto;
        if (addPhotocommentsActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("constrains");
        this.uploadImagesConstrainsDtoAdapter.toJson(jsonWriter, (JsonWriter) addPhotocommentsActionDto2.getConstrains());
        jsonWriter.name("position");
        this.resultPositionDtoAdapter.toJson(jsonWriter, (JsonWriter) addPhotocommentsActionDto2.getPosition());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) addPhotocommentsActionDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) addPhotocommentsActionDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(AddPhotocommentsActionDto)");
    }
}
