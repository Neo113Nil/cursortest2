package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenTrackingCardDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto$ExpansionDto;", "nullableExpansionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionOpenTrackingCardDtoJsonAdapter extends JsonAdapter<ActionOpenTrackingCardDto> {
    private final JsonAdapter<ActionOpenTrackingCardDto.ExpansionDto> nullableExpansionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "expansion", "delivery_id");
    private final JsonAdapter<String> stringAdapter;

    public ActionOpenTrackingCardDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableExpansionDtoAdapter = moshi.adapter(ActionOpenTrackingCardDto.ExpansionDto.class, emptySet, "expansion");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionOpenTrackingCardDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ActionOpenTrackingCardDto.ExpansionDto expansionDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                expansionDto = this.nullableExpansionDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 != null) {
            return new ActionOpenTrackingCardDto(str, expansionDto, str2);
        }
        throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionOpenTrackingCardDto actionOpenTrackingCardDto) {
        ActionOpenTrackingCardDto actionOpenTrackingCardDto2 = actionOpenTrackingCardDto;
        if (actionOpenTrackingCardDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenTrackingCardDto2.getTitle());
        jsonWriter.name("expansion");
        this.nullableExpansionDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenTrackingCardDto2.getExpansion());
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenTrackingCardDto2.getDeliveryId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(ActionOpenTrackingCardDto)");
    }
}
