package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formtemplate.FormTemplateDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDescriptorDto;", "listOfFormDescriptorDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formtemplate/FormTemplateDto;", "nullableListOfFormTemplateDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V2FormResponseDtoJsonAdapter extends JsonAdapter<V2FormResponseDto> {
    private final JsonAdapter<List<FormDescriptorDto>> listOfFormDescriptorDtoAdapter;
    private final JsonAdapter<List<FormTemplateDto>> nullableListOfFormTemplateDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("descriptors", "templates");

    public V2FormResponseDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, FormDescriptorDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfFormDescriptorDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "descriptors");
        this.nullableListOfFormTemplateDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormTemplateDto.class), emptySet, "templates");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final V2FormResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<FormDescriptorDto> list = null;
        List<FormTemplateDto> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfFormDescriptorDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("descriptors", "descriptors", jsonReader);
                }
            } else if (selectName == 1) {
                list2 = this.nullableListOfFormTemplateDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new V2FormResponseDto(list, list2);
        }
        throw Util.missingProperty("descriptors", "descriptors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, V2FormResponseDto v2FormResponseDto) {
        V2FormResponseDto v2FormResponseDto2 = v2FormResponseDto;
        if (v2FormResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("descriptors");
        this.listOfFormDescriptorDtoAdapter.toJson(jsonWriter, (JsonWriter) v2FormResponseDto2.getDescriptors());
        jsonWriter.name("templates");
        this.nullableListOfFormTemplateDtoAdapter.toJson(jsonWriter, (JsonWriter) v2FormResponseDto2.getTemplates());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(V2FormResponseDto)");
    }
}
