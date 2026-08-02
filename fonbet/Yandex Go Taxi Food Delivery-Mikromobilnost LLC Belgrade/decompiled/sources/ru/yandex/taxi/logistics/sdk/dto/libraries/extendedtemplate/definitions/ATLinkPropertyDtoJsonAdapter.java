package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;", "aTTextPropertyDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ATLinkPropertyDtoJsonAdapter extends JsonAdapter<ATLinkPropertyDto> {
    private final JsonAdapter<ATTextPropertyDto> aTTextPropertyDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("link", "text");
    private final JsonAdapter<String> stringAdapter;

    public ATLinkPropertyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "link");
        this.aTTextPropertyDtoAdapter = moshi.adapter(ATTextPropertyDto.class, emptySet, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ATLinkPropertyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ATTextPropertyDto aTTextPropertyDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("link", "link", jsonReader);
                }
            } else if (selectName == 1 && (aTTextPropertyDto = this.aTTextPropertyDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("text", "text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("link", "link", jsonReader);
        }
        if (aTTextPropertyDto != null) {
            return new ATLinkPropertyDto(str, aTTextPropertyDto);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ATLinkPropertyDto aTLinkPropertyDto) {
        ATLinkPropertyDto aTLinkPropertyDto2 = aTLinkPropertyDto;
        if (aTLinkPropertyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("link");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aTLinkPropertyDto2.getLink());
        jsonWriter.name("text");
        this.aTTextPropertyDtoAdapter.toJson(jsonWriter, (JsonWriter) aTLinkPropertyDto2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(ATLinkPropertyDto)");
    }
}
