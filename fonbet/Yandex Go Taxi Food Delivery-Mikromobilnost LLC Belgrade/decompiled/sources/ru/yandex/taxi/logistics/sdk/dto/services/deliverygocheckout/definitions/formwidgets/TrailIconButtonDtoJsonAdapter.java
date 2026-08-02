package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailIconButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailIconButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "tapActionDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrailIconButtonDtoJsonAdapter extends JsonAdapter<TrailIconButtonDto> {
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "accessibility_label", "action", "presentation_id", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TapActionDto> tapActionDtoAdapter;

    public TrailIconButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "image");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "accessibilityLabel");
        this.tapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "presentationId");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailIconButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ImageDto imageDto = null;
        String str = null;
        TapActionDto tapActionDto = null;
        String str2 = null;
        String str3 = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                    if (imageDto == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("accessibilityLabel", "accessibility_label", jsonReader);
                    }
                    break;
                case 2:
                    tapActionDto = this.tapActionDtoAdapter.fromJson(jsonReader);
                    if (tapActionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (imageDto == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("accessibilityLabel", "accessibility_label", jsonReader);
        }
        if (tapActionDto != null) {
            return new TrailIconButtonDto(imageDto, str, tapActionDto, str2, str3, obj);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailIconButtonDto trailIconButtonDto) {
        TrailIconButtonDto trailIconButtonDto2 = trailIconButtonDto;
        if (trailIconButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) trailIconButtonDto2.getImage());
        jsonWriter.name("accessibility_label");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) trailIconButtonDto2.getAccessibilityLabel());
        jsonWriter.name("action");
        this.tapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailIconButtonDto2.getAction());
        jsonWriter.name("presentation_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailIconButtonDto2.getPresentationId());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailIconButtonDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) trailIconButtonDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(TrailIconButtonDto)");
    }
}
