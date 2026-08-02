package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PaidWaitingInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PaidWaitingInfoDtoJsonAdapter extends JsonAdapter<PaidWaitingInfoDto> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("free_waiting_until", "waiting_price", "paid_waiting_title");
    private final JsonAdapter<String> stringAdapter;

    public PaidWaitingInfoDtoJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "freeWaitingUntil");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "waitingPrice");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "paidWaitingTitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaidWaitingInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("freeWaitingUntil", "free_waiting_until", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paidWaitingTitle", "paid_waiting_title", jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty("freeWaitingUntil", "free_waiting_until", jsonReader);
        }
        long longValue = l.longValue();
        if (str2 != null) {
            return new PaidWaitingInfoDto(longValue, str, str2);
        }
        throw Util.missingProperty("paidWaitingTitle", "paid_waiting_title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaidWaitingInfoDto paidWaitingInfoDto) {
        PaidWaitingInfoDto paidWaitingInfoDto2 = paidWaitingInfoDto;
        if (paidWaitingInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("free_waiting_until");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(paidWaitingInfoDto2.getFreeWaitingUntil()));
        jsonWriter.name("waiting_price");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paidWaitingInfoDto2.getWaitingPrice());
        jsonWriter.name("paid_waiting_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paidWaitingInfoDto2.getPaidWaitingTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(PaidWaitingInfoDto)");
    }
}
