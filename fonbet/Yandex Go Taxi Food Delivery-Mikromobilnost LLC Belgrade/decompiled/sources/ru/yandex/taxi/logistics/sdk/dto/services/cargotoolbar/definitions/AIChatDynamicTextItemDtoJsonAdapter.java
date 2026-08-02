package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/AIChatDynamicTextItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/AIChatDynamicTextItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AIChatDynamicTextItemDtoJsonAdapter extends JsonAdapter<AIChatDynamicTextItemDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("display_time_ms", "dynamic_text");

    public AIChatDynamicTextItemDtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "displayTimeMs");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "dynamicText");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AIChatDynamicTextItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        AttributedTextDto attributedTextDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("displayTimeMs", "display_time_ms", jsonReader);
                }
            } else if (selectName == 1 && (attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("dynamicText", "dynamic_text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("displayTimeMs", "display_time_ms", jsonReader);
        }
        int intValue = num.intValue();
        if (attributedTextDto != null) {
            return new AIChatDynamicTextItemDto(intValue, attributedTextDto);
        }
        throw Util.missingProperty("dynamicText", "dynamic_text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AIChatDynamicTextItemDto aIChatDynamicTextItemDto) {
        AIChatDynamicTextItemDto aIChatDynamicTextItemDto2 = aIChatDynamicTextItemDto;
        if (aIChatDynamicTextItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("display_time_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(aIChatDynamicTextItemDto2.getDisplayTimeMs()));
        jsonWriter.name("dynamic_text");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) aIChatDynamicTextItemDto2.getDynamicText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(AIChatDynamicTextItemDto)");
    }
}
