package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/RawTablesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/RawTablesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RawTablesDtoJsonAdapter extends JsonAdapter<RawTablesDto> {
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("processing_events", "client_order", "offer", "order", "orderhistory_deleted_client_order", "provider_processing_events", "payer_context", "clients_feedbacks", "clients_polls");

    public RawTablesDtoJsonAdapter(Moshi moshi) {
        this.nullableAnyAdapter = moshi.adapter(Object.class, EmptySet.a, "processingEvents");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RawTablesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    obj2 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    obj3 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    obj4 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    obj5 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    obj6 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    obj7 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    obj8 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    obj9 = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new RawTablesDto(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RawTablesDto rawTablesDto) {
        RawTablesDto rawTablesDto2 = rawTablesDto;
        if (rawTablesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("processing_events");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getProcessingEvents());
        jsonWriter.name("client_order");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getClientOrder());
        jsonWriter.name("offer");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getOffer());
        jsonWriter.name("order");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getOrder());
        jsonWriter.name("orderhistory_deleted_client_order");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getOrderhistoryDeletedClientOrder());
        jsonWriter.name("provider_processing_events");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getProviderProcessingEvents());
        jsonWriter.name("payer_context");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getPayerContext());
        jsonWriter.name("clients_feedbacks");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getClientsFeedbacks());
        jsonWriter.name("clients_polls");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) rawTablesDto2.getClientsPolls());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(RawTablesDto)");
    }
}
