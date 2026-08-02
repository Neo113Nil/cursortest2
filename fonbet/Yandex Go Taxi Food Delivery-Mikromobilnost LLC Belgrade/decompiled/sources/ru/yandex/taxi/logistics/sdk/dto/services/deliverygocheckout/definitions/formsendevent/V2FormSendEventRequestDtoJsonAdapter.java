package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent;

import com.adjust.sdk.Constants;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/V2FormSendEventRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/V2FormSendEventRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "anyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", "formEventPayloadDtoAdapter", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V2FormSendEventRequestDtoJsonAdapter extends JsonAdapter<V2FormSendEventRequestDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<FormEventPayloadDto> formEventPayloadDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("mode", "scenario", ClidProvider.STATE, "event_payload", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public V2FormSendEventRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "scenario");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, ClidProvider.STATE);
        this.formEventPayloadDtoAdapter = moshi.adapter(FormEventPayloadDto.class, emptySet, "eventPayload");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final V2FormSendEventRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Object obj = null;
        FormEventPayloadDto formEventPayloadDto = null;
        Object obj2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("mode", "mode", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                obj = this.anyAdapter.fromJson(jsonReader);
                if (obj == null) {
                    throw Util.unexpectedNull(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
                }
            } else if (selectName == 3) {
                formEventPayloadDto = this.formEventPayloadDtoAdapter.fromJson(jsonReader);
                if (formEventPayloadDto == null) {
                    throw Util.unexpectedNull("eventPayload", "event_payload", jsonReader);
                }
            } else if (selectName == 4) {
                obj2 = this.nullableAnyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("mode", "mode", jsonReader);
        }
        if (obj == null) {
            throw Util.missingProperty(ClidProvider.STATE, ClidProvider.STATE, jsonReader);
        }
        if (formEventPayloadDto != null) {
            return new V2FormSendEventRequestDto(str, str2, obj, formEventPayloadDto, obj2);
        }
        throw Util.missingProperty("eventPayload", "event_payload", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, V2FormSendEventRequestDto v2FormSendEventRequestDto) {
        V2FormSendEventRequestDto v2FormSendEventRequestDto2 = v2FormSendEventRequestDto;
        if (v2FormSendEventRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) v2FormSendEventRequestDto2.getMode());
        jsonWriter.name("scenario");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) v2FormSendEventRequestDto2.getScenario());
        jsonWriter.name(ClidProvider.STATE);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) v2FormSendEventRequestDto2.getState());
        jsonWriter.name("event_payload");
        this.formEventPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) v2FormSendEventRequestDto2.getEventPayload());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) v2FormSendEventRequestDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(V2FormSendEventRequestDto)");
    }
}
