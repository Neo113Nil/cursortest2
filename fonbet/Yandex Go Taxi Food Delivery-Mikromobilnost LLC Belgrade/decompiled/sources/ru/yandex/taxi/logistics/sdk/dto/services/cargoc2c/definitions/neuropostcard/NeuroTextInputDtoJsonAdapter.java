package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "nullableNeuroPostcardImageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "nullableAttributedTextDtoAdapter", "", "nullableStringAdapter", "", "nullableIntAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputStopWordsItemDto;", "nullableListOfNeuroTextInputStopWordsItemDtoAdapter", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputHintDto;", "nullableListOfNeuroTextInputHintDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroTextInputDtoJsonAdapter extends JsonAdapter<NeuroTextInputDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<NeuroTextInputHintDto>> nullableListOfNeuroTextInputHintDtoAdapter;
    private final JsonAdapter<List<NeuroTextInputStopWordsItemDto>> nullableListOfNeuroTextInputStopWordsItemDtoAdapter;
    private final JsonAdapter<NeuroPostcardImageDto> nullableNeuroPostcardImageDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", "title", "subtitle", "max_symbols_input_message", "max_symbols_input_metrica_label", "input_max_symbols", "prohibited_words", "placeholder", "hints", "button_title", "button_subtitle", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public NeuroTextInputDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableNeuroPostcardImageDtoAdapter = moshi.adapter(NeuroPostcardImageDto.class, emptySet, "image");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "maxSymbolsInputMetricaLabel");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "inputMaxSymbols");
        this.nullableListOfNeuroTextInputStopWordsItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, NeuroTextInputStopWordsItemDto.class), emptySet, "prohibitedWords");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "placeholder");
        this.nullableListOfNeuroTextInputHintDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, NeuroTextInputHintDto.class), emptySet, "hints");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NeuroTextInputDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        NeuroPostcardImageDto neuroPostcardImageDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        AttributedTextDto attributedTextDto3 = null;
        String str = null;
        Integer num = null;
        List<NeuroTextInputStopWordsItemDto> list = null;
        String str2 = null;
        List<NeuroTextInputHintDto> list2 = null;
        AttributedTextDto attributedTextDto4 = null;
        AttributedTextDto attributedTextDto5 = null;
        String str3 = null;
        while (true) {
            NeuroPostcardImageDto neuroPostcardImageDto2 = neuroPostcardImageDto;
            AttributedTextDto attributedTextDto6 = attributedTextDto;
            if (!jsonReader.hasNext()) {
                AttributedTextDto attributedTextDto7 = attributedTextDto2;
                jsonReader.endObject();
                if (attributedTextDto6 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("placeholder", "placeholder", jsonReader);
                }
                if (attributedTextDto4 != null) {
                    return new NeuroTextInputDto(neuroPostcardImageDto2, attributedTextDto6, attributedTextDto7, attributedTextDto3, str, num, list, str2, list2, attributedTextDto4, attributedTextDto5, str3);
                }
                throw Util.missingProperty("buttonTitle", "button_title", jsonReader);
            }
            AttributedTextDto attributedTextDto8 = attributedTextDto2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 0:
                    neuroPostcardImageDto = this.nullableNeuroPostcardImageDtoAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    attributedTextDto = attributedTextDto6;
                case 1:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                case 2:
                    attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 3:
                    attributedTextDto3 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 4:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 6:
                    list = this.nullableListOfNeuroTextInputStopWordsItemDtoAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 7:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("placeholder", "placeholder", jsonReader);
                    }
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 8:
                    list2 = this.nullableListOfNeuroTextInputHintDtoAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 9:
                    attributedTextDto4 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto4 == null) {
                        throw Util.unexpectedNull("buttonTitle", "button_title", jsonReader);
                    }
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 10:
                    attributedTextDto5 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
                default:
                    attributedTextDto2 = attributedTextDto8;
                    neuroPostcardImageDto = neuroPostcardImageDto2;
                    attributedTextDto = attributedTextDto6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NeuroTextInputDto neuroTextInputDto) {
        NeuroTextInputDto neuroTextInputDto2 = neuroTextInputDto;
        if (neuroTextInputDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.nullableNeuroPostcardImageDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getImage());
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getSubtitle());
        jsonWriter.name("max_symbols_input_message");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getMaxSymbolsInputMessage());
        jsonWriter.name("max_symbols_input_metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getMaxSymbolsInputMetricaLabel());
        jsonWriter.name("input_max_symbols");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getInputMaxSymbols());
        jsonWriter.name("prohibited_words");
        this.nullableListOfNeuroTextInputStopWordsItemDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getProhibitedWords());
        jsonWriter.name("placeholder");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getPlaceholder());
        jsonWriter.name("hints");
        this.nullableListOfNeuroTextInputHintDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getHints());
        jsonWriter.name("button_title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getButtonTitle());
        jsonWriter.name("button_subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getButtonSubtitle());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) neuroTextInputDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(NeuroTextInputDto)");
    }
}
