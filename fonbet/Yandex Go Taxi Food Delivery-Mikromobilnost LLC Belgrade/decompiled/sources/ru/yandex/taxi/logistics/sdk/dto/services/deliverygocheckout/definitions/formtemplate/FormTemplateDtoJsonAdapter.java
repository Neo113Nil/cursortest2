package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formtemplate;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.WidgetDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formtemplate/FormTemplateDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formtemplate/FormTemplateDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "listOfWidgetDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormTemplateDtoJsonAdapter extends JsonAdapter<FormTemplateDto> {
    private final JsonAdapter<List<WidgetDto>> listOfWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "widgets");
    private final JsonAdapter<String> stringAdapter;

    public FormTemplateDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.listOfWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, WidgetDto.class), emptySet, "widgets");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormTemplateDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<WidgetDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfWidgetDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("widgets", "widgets", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (list != null) {
            return new FormTemplateDto(str, list);
        }
        throw Util.missingProperty("widgets", "widgets", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormTemplateDto formTemplateDto) {
        FormTemplateDto formTemplateDto2 = formTemplateDto;
        if (formTemplateDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formTemplateDto2.getId());
        jsonWriter.name("widgets");
        this.listOfWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) formTemplateDto2.getWidgets());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(FormTemplateDto)");
    }
}
