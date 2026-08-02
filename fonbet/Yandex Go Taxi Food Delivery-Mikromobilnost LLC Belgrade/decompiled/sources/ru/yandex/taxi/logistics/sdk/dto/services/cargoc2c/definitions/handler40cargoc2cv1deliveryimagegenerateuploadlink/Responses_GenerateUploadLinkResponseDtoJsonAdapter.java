package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/Responses_GenerateUploadLinkResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/Responses$GenerateUploadLinkResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Responses_GenerateUploadLinkResponseDtoJsonAdapter extends JsonAdapter<Responses$GenerateUploadLinkResponseDto> {
    private final JsonReader.Options options = JsonReader.Options.of(StateEntry.COLUMN_PATH, "upload_url", "download_url");
    private final JsonAdapter<String> stringAdapter;

    public Responses_GenerateUploadLinkResponseDtoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, StateEntry.COLUMN_PATH);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Responses$GenerateUploadLinkResponseDto fromJson(JsonReader jsonReader) {
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(StateEntry.COLUMN_PATH, StateEntry.COLUMN_PATH, jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("uploadUrl", "upload_url", jsonReader);
                }
            } else if (selectName == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("downloadUrl", "download_url", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty(StateEntry.COLUMN_PATH, StateEntry.COLUMN_PATH, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("uploadUrl", "upload_url", jsonReader);
        }
        if (str3 != null) {
            return new Responses$GenerateUploadLinkResponseDto(str, str2, str3);
        }
        throw Util.missingProperty("downloadUrl", "download_url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto) {
        Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto2 = responses$GenerateUploadLinkResponseDto;
        if (responses$GenerateUploadLinkResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(StateEntry.COLUMN_PATH);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) responses$GenerateUploadLinkResponseDto2.getPath());
        jsonWriter.name("upload_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) responses$GenerateUploadLinkResponseDto2.getUploadUrl());
        jsonWriter.name("download_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) responses$GenerateUploadLinkResponseDto2.getDownloadUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(Responses.GenerateUploadLinkResponseDto)");
    }
}
