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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TrailButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto$ButtonStyleDto;", "buttonStyleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "tapActionDtoAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrailButtonDtoJsonAdapter extends JsonAdapter<TrailButtonDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<TrailButtonDto.ButtonStyleDto> buttonStyleDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "accessibility_label", "button_style", "action", "presentation_id", "metrica_label", Constants.REFERRER_API_META);
    private final JsonAdapter<TapActionDto> tapActionDtoAdapter;

    public TrailButtonDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "accessibilityLabel");
        this.buttonStyleDtoAdapter = moshi.adapter(TrailButtonDto.ButtonStyleDto.class, emptySet, "buttonStyle");
        this.tapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailButtonDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        String str = null;
        TrailButtonDto.ButtonStyleDto buttonStyleDto = null;
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
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    buttonStyleDto = this.buttonStyleDtoAdapter.fromJson(jsonReader);
                    if (buttonStyleDto == null) {
                        throw Util.unexpectedNull("buttonStyle", "button_style", jsonReader);
                    }
                    break;
                case 3:
                    tapActionDto = this.tapActionDtoAdapter.fromJson(jsonReader);
                    if (tapActionDto == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (attributedTextDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (buttonStyleDto == null) {
            throw Util.missingProperty("buttonStyle", "button_style", jsonReader);
        }
        if (tapActionDto != null) {
            return new TrailButtonDto(attributedTextDto, str, buttonStyleDto, tapActionDto, str2, str3, obj);
        }
        throw Util.missingProperty("action", "action", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailButtonDto trailButtonDto) {
        TrailButtonDto trailButtonDto2 = trailButtonDto;
        if (trailButtonDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getTitle());
        jsonWriter.name("accessibility_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getAccessibilityLabel());
        jsonWriter.name("button_style");
        this.buttonStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getButtonStyle());
        jsonWriter.name("action");
        this.tapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getAction());
        jsonWriter.name("presentation_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getPresentationId());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) trailButtonDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(TrailButtonDto)");
    }
}
