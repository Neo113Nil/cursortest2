package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailRichCheckControlDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailRichCheckControlDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "nullableStringAdapter", "", "intAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrailRichCheckControlDtoJsonAdapter extends JsonAdapter<TrailRichCheckControlDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("key", "value", "action", "action_on_unselect", "unselected_text", "metrica_label", "width", "presentation_id");
    private final JsonAdapter<String> stringAdapter;

    public TrailRichCheckControlDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "key");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "unselectedText");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "width");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailRichCheckControlDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        Object obj = null;
        TapActionDto tapActionDto = null;
        TapActionDto tapActionDto2 = null;
        AttributedTextDto attributedTextDto = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            Integer num2 = num;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("key", "key", jsonReader);
                }
                if (obj == null) {
                    throw Util.missingProperty("value__", "value", jsonReader);
                }
                if (attributedTextDto == null) {
                    throw Util.missingProperty("unselectedText", "unselected_text", jsonReader);
                }
                if (num2 != null) {
                    return new TrailRichCheckControlDto(str, obj, tapActionDto, tapActionDto2, attributedTextDto, str2, num2.intValue(), str3);
                }
                throw Util.missingProperty("width", "width", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("key", "key", jsonReader);
                    }
                    break;
                case 1:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull("value__", "value", jsonReader);
                    }
                    break;
                case 2:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    tapActionDto2 = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("unselectedText", "unselected_text", jsonReader);
                    }
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    Integer fromJson = this.intAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("width", "width", jsonReader);
                    }
                    num = fromJson;
                    continue;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
            num = num2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailRichCheckControlDto trailRichCheckControlDto) {
        TrailRichCheckControlDto trailRichCheckControlDto2 = trailRichCheckControlDto;
        if (trailRichCheckControlDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getKey());
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getValue());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getAction());
        jsonWriter.name("action_on_unselect");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getActionOnUnselect());
        jsonWriter.name("unselected_text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getUnselectedText());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getMetricaLabel());
        jsonWriter.name("width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(trailRichCheckControlDto2.getWidth()));
        jsonWriter.name("presentation_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailRichCheckControlDto2.getPresentationId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(TrailRichCheckControlDto)");
    }
}
