package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/trigger_communications/abandoned_cart/data/model/AbandonedCartDeliveredNotificationDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/logistics/sdk/cargo_form/impl/trigger_communications/abandoned_cart/data/model/AbandonedCartDeliveredNotificationDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AbandonedCartDeliveredNotificationDtoJsonAdapter extends JsonAdapter<AbandonedCartDeliveredNotificationDto> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "delivered_time_millis");
    private final JsonAdapter<String> stringAdapter;

    public AbandonedCartDeliveredNotificationDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "deliveredTimeMillis");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AbandonedCartDeliveredNotificationDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Long l = null;
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
            } else if (selectName == 1 && (l = this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("deliveredTimeMillis", "delivered_time_millis", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (l != null) {
            return new AbandonedCartDeliveredNotificationDto(str, l.longValue());
        }
        throw Util.missingProperty("deliveredTimeMillis", "delivered_time_millis", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto) {
        AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto2 = abandonedCartDeliveredNotificationDto;
        if (abandonedCartDeliveredNotificationDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) abandonedCartDeliveredNotificationDto2.getId());
        jsonWriter.name("delivered_time_millis");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(abandonedCartDeliveredNotificationDto2.getDeliveredTimeMillis()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(AbandonedCartDeliveredNotificationDto)");
    }
}
