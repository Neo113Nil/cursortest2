package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDescriptorDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDescriptorDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "anyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto;", "formOverrideDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormDescriptorDtoJsonAdapter extends JsonAdapter<FormDescriptorDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<FormOverrideDto> formOverrideDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("match", "override");

    public FormDescriptorDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "match");
        this.formOverrideDtoAdapter = moshi.adapter(FormOverrideDto.class, emptySet, "override");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormDescriptorDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Object obj = null;
        FormOverrideDto formOverrideDto = null;
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
            } else if (selectName == 1 && (formOverrideDto = this.formOverrideDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("override_", "override", jsonReader);
            }
        }
        jsonReader.endObject();
        if (obj == null) {
            throw Util.missingProperty("match", "match", jsonReader);
        }
        if (formOverrideDto != null) {
            return new FormDescriptorDto(obj, formOverrideDto);
        }
        throw Util.missingProperty("override_", "override", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormDescriptorDto formDescriptorDto) {
        FormDescriptorDto formDescriptorDto2 = formDescriptorDto;
        if (formDescriptorDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("match");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) formDescriptorDto2.getMatch());
        jsonWriter.name("override");
        this.formOverrideDtoAdapter.toJson(jsonWriter, (JsonWriter) formDescriptorDto2.getOverride());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(FormDescriptorDto)");
    }
}
