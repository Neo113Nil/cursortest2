package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAdapter", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V2FormAsyncTaskRequestDtoJsonAdapter extends JsonAdapter<V2FormAsyncTaskRequestDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("task_id", ClidProvider.STATE, "task_params");
    private final JsonAdapter<String> stringAdapter;

    public V2FormAsyncTaskRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "taskId");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, ClidProvider.STATE);
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "taskParams");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final V2FormAsyncTaskRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("taskId", "task_id", jsonReader);
                }
            } else if (selectName == 1) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
                }
            } else if (selectName == 2) {
                obj2 = this.nullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("taskId", "task_id", jsonReader);
        }
        if (obj != null) {
            return new V2FormAsyncTaskRequestDto(str, obj, obj2);
        }
        throw Util.missingProperty(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, V2FormAsyncTaskRequestDto v2FormAsyncTaskRequestDto) {
        V2FormAsyncTaskRequestDto v2FormAsyncTaskRequestDto2 = v2FormAsyncTaskRequestDto;
        if (v2FormAsyncTaskRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("task_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) v2FormAsyncTaskRequestDto2.getTaskId());
        jsonWriter.name(ClidProvider.STATE);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) v2FormAsyncTaskRequestDto2.getState());
        jsonWriter.name("task_params");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) v2FormAsyncTaskRequestDto2.getTaskParams());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(V2FormAsyncTaskRequestDto)");
    }
}
