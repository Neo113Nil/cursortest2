package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.div.state.db.StateEntry;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostcardSourceInfoDtoJsonAdapter extends JsonAdapter<PostcardSourceInfoDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("user_message", StateEntry.COLUMN_PATH, "download_url");
    private final JsonAdapter<String> stringAdapter;

    public PostcardSourceInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "userMessage");
        this.stringAdapter = moshi.adapter(String.class, emptySet, StateEntry.COLUMN_PATH);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PostcardSourceInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(StateEntry.COLUMN_PATH, StateEntry.COLUMN_PATH, jsonReader);
                }
            } else if (selectName == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("downloadUrl", "download_url", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            throw Util.missingProperty(StateEntry.COLUMN_PATH, StateEntry.COLUMN_PATH, jsonReader);
        }
        if (str3 != null) {
            return new PostcardSourceInfoDto(str, str2, str3);
        }
        throw Util.missingProperty("downloadUrl", "download_url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PostcardSourceInfoDto postcardSourceInfoDto) {
        PostcardSourceInfoDto postcardSourceInfoDto2 = postcardSourceInfoDto;
        if (postcardSourceInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("user_message");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) postcardSourceInfoDto2.getUserMessage());
        jsonWriter.name(StateEntry.COLUMN_PATH);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) postcardSourceInfoDto2.getPath());
        jsonWriter.name("download_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) postcardSourceInfoDto2.getDownloadUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(PostcardSourceInfoDto)");
    }
}
