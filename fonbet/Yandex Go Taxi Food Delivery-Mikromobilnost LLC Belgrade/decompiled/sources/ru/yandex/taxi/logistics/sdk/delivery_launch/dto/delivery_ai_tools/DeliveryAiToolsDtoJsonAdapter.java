package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.DeliveryAiToolsDto;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR(\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "nullableMapOfStringStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto$MatchesDto;", "nullableListOfMatchesDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryAiToolsDtoJsonAdapter extends JsonAdapter<DeliveryAiToolsDto> {
    private final JsonAdapter<List<DeliveryAiToolsDto.MatchesDto>> nullableListOfMatchesDtoAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("l10n", "matches");

    public DeliveryAiToolsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Map.class, String.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableMapOfStringStringAdapter = moshi.adapter(newParameterizedType, emptySet, "l10n");
        this.nullableListOfMatchesDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DeliveryAiToolsDto.MatchesDto.class), emptySet, "matches");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryAiToolsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Map<String, String> map = null;
        List<DeliveryAiToolsDto.MatchesDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = this.nullableListOfMatchesDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new DeliveryAiToolsDto(map, list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryAiToolsDto deliveryAiToolsDto) {
        DeliveryAiToolsDto deliveryAiToolsDto2 = deliveryAiToolsDto;
        if (deliveryAiToolsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("l10n");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryAiToolsDto2.getL10n());
        jsonWriter.name("matches");
        this.nullableListOfMatchesDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryAiToolsDto2.getMatches());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(DeliveryAiToolsDto)");
    }
}
