package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardConsumerInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardContentDto;", "postcardContentDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PostcardConsumerInfoDtoJsonAdapter extends JsonAdapter<PostcardConsumerInfoDto> {
    private final JsonReader.Options options = JsonReader.Options.of("content", "user_message", "summary_postcard", "cell_title");
    private final JsonAdapter<PostcardContentDto> postcardContentDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PostcardConsumerInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.postcardContentDtoAdapter = moshi.adapter(PostcardContentDto.class, emptySet, "content");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "userMessage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PostcardConsumerInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PostcardContentDto postcardContentDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                postcardContentDto = this.postcardContentDtoAdapter.fromJson(jsonReader);
                if (postcardContentDto == null) {
                    throw Util.unexpectedNull("content", "content", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("userMessage", "user_message", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("summaryPostcard", "summary_postcard", jsonReader);
                }
            } else if (selectName == 3 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("cellTitle", "cell_title", jsonReader);
            }
        }
        jsonReader.endObject();
        if (postcardContentDto == null) {
            throw Util.missingProperty("content", "content", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("userMessage", "user_message", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("summaryPostcard", "summary_postcard", jsonReader);
        }
        if (str3 != null) {
            return new PostcardConsumerInfoDto(postcardContentDto, str, str2, str3);
        }
        throw Util.missingProperty("cellTitle", "cell_title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PostcardConsumerInfoDto postcardConsumerInfoDto) {
        PostcardConsumerInfoDto postcardConsumerInfoDto2 = postcardConsumerInfoDto;
        if (postcardConsumerInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content");
        this.postcardContentDtoAdapter.toJson(jsonWriter, (JsonWriter) postcardConsumerInfoDto2.getContent());
        jsonWriter.name("user_message");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) postcardConsumerInfoDto2.getUserMessage());
        jsonWriter.name("summary_postcard");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) postcardConsumerInfoDto2.getSummaryPostcard());
        jsonWriter.name("cell_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) postcardConsumerInfoDto2.getCellTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(PostcardConsumerInfoDto)");
    }
}
