package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultDeliveryEventDtoJsonAdapter extends JsonAdapter<DefaultDeliveryEventDto> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("delivery_id", "commit_revision", "web_tracking_url");
    private final JsonAdapter<String> stringAdapter;

    public DefaultDeliveryEventDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "commitRevision");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "webTrackingUrl");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DefaultDeliveryEventDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new DefaultDeliveryEventDto(str, num, str2);
        }
        throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DefaultDeliveryEventDto defaultDeliveryEventDto) {
        DefaultDeliveryEventDto defaultDeliveryEventDto2 = defaultDeliveryEventDto;
        if (defaultDeliveryEventDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) defaultDeliveryEventDto2.getDeliveryId());
        jsonWriter.name("commit_revision");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) defaultDeliveryEventDto2.getCommitRevision());
        jsonWriter.name("web_tracking_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) defaultDeliveryEventDto2.getWebTrackingUrl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(DefaultDeliveryEventDto)");
    }
}
