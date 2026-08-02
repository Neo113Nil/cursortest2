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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto;", "listOfTextInputStopWordRuleDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "", "anyAdapter", "", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextInputStopWordsItemDtoJsonAdapter extends JsonAdapter<TextInputStopWordsItemDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<List<TextInputStopWordRuleDto>> listOfTextInputStopWordRuleDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("stop_words", "error_text", "state_value", "metrica_label");

    public TextInputStopWordsItemDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, TextInputStopWordRuleDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfTextInputStopWordRuleDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "stopWords");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "errorText");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "stateValue");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextInputStopWordsItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<TextInputStopWordRuleDto> list = null;
        AttributedTextDto attributedTextDto = null;
        Object obj = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfTextInputStopWordRuleDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("stopWords", "stop_words", jsonReader);
                }
            } else if (selectName == 1) {
                attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull("stateValue", "state_value", jsonReader);
                }
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("stopWords", "stop_words", jsonReader);
        }
        if (obj != null) {
            return new TextInputStopWordsItemDto(list, attributedTextDto, obj, str);
        }
        throw Util.missingProperty("stateValue", "state_value", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextInputStopWordsItemDto textInputStopWordsItemDto) {
        TextInputStopWordsItemDto textInputStopWordsItemDto2 = textInputStopWordsItemDto;
        if (textInputStopWordsItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stop_words");
        this.listOfTextInputStopWordRuleDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputStopWordsItemDto2.getStopWords());
        jsonWriter.name("error_text");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) textInputStopWordsItemDto2.getErrorText());
        jsonWriter.name("state_value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) textInputStopWordsItemDto2.getStateValue());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) textInputStopWordsItemDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(TextInputStopWordsItemDto)");
    }
}
