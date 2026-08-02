package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailTwoButtonsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailTwoButtonsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "listOfAttributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "listOfTapActionDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrailTwoButtonsDtoJsonAdapter extends JsonAdapter<TrailTwoButtonsDto> {
    private final JsonAdapter<List<AttributedTextDto>> listOfAttributedTextDtoAdapter;
    private final JsonAdapter<List<TapActionDto>> listOfTapActionDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("button_titles", "accessibility_labels", "button_actions", "presentation_id", "metrica_labels");

    public TrailTwoButtonsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, AttributedTextDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfAttributedTextDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "buttonTitles");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "accessibilityLabels");
        this.listOfTapActionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, TapActionDto.class), emptySet, "buttonActions");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "presentationId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailTwoButtonsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<AttributedTextDto> list = null;
        List<String> list2 = null;
        List<TapActionDto> list3 = null;
        String str = null;
        List<String> list4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfAttributedTextDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("buttonTitles", "button_titles", jsonReader);
                }
            } else if (selectName == 1) {
                list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                list3 = this.listOfTapActionDtoAdapter.fromJson(jsonReader);
                if (list3 == null) {
                    throw Util.unexpectedNull("buttonActions", "button_actions", jsonReader);
                }
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                list4 = this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("buttonTitles", "button_titles", jsonReader);
        }
        if (list3 != null) {
            return new TrailTwoButtonsDto(list, list2, list3, str, list4);
        }
        throw Util.missingProperty("buttonActions", "button_actions", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailTwoButtonsDto trailTwoButtonsDto) {
        TrailTwoButtonsDto trailTwoButtonsDto2 = trailTwoButtonsDto;
        if (trailTwoButtonsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("button_titles");
        this.listOfAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) trailTwoButtonsDto2.getButtonTitles());
        jsonWriter.name("accessibility_labels");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) trailTwoButtonsDto2.getAccessibilityLabels());
        jsonWriter.name("button_actions");
        this.listOfTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailTwoButtonsDto2.getButtonActions());
        jsonWriter.name("presentation_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailTwoButtonsDto2.getPresentationId());
        jsonWriter.name("metrica_labels");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) trailTwoButtonsDto2.getMetricaLabels());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(TrailTwoButtonsDto)");
    }
}
