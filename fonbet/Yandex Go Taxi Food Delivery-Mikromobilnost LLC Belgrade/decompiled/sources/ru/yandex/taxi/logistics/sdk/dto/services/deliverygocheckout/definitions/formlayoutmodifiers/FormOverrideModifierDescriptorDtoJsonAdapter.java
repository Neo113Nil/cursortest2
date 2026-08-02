package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers;

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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormOverrideModifierDescriptorDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormOverrideModifierDescriptorDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "anyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto;", "listOfFormLayoutModifierDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormOverrideModifierDescriptorDtoJsonAdapter extends JsonAdapter<FormOverrideModifierDescriptorDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<List<FormLayoutModifierDto>> listOfFormLayoutModifierDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("match", "modifiers");

    public FormOverrideModifierDescriptorDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "match");
        this.listOfFormLayoutModifierDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormLayoutModifierDto.class), emptySet, "modifiers");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormOverrideModifierDescriptorDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Object obj = null;
        List<FormLayoutModifierDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull("match", "match", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfFormLayoutModifierDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("modifiers", "modifiers", jsonReader);
            }
        }
        jsonReader.endObject();
        if (obj == null) {
            throw Util.missingProperty("match", "match", jsonReader);
        }
        if (list != null) {
            return new FormOverrideModifierDescriptorDto(obj, list);
        }
        throw Util.missingProperty("modifiers", "modifiers", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormOverrideModifierDescriptorDto formOverrideModifierDescriptorDto) {
        FormOverrideModifierDescriptorDto formOverrideModifierDescriptorDto2 = formOverrideModifierDescriptorDto;
        if (formOverrideModifierDescriptorDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("match");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) formOverrideModifierDescriptorDto2.getMatch());
        jsonWriter.name("modifiers");
        this.listOfFormLayoutModifierDtoAdapter.toJson(jsonWriter, (JsonWriter) formOverrideModifierDescriptorDto2.getModifiers());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(FormOverrideModifierDescriptorDto)");
    }
}
