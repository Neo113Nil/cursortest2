package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.DeliveryAiToolsDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto_MatchesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/DeliveryAiToolsDto$MatchesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiWidgetsConfigDto;", "aiWidgetsConfigDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryAiToolsDto_MatchesDtoJsonAdapter extends JsonAdapter<DeliveryAiToolsDto.MatchesDto> {
    private final JsonAdapter<AiWidgetsConfigDto> aiWidgetsConfigDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("modes", ConfigConstants.CONFIG);

    public DeliveryAiToolsDto_MatchesDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "modes");
        this.aiWidgetsConfigDtoAdapter = moshi.adapter(AiWidgetsConfigDto.class, emptySet, ConfigConstants.CONFIG);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryAiToolsDto.MatchesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        AiWidgetsConfigDto aiWidgetsConfigDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("modes", "modes", jsonReader);
                }
            } else if (selectName == 1 && (aiWidgetsConfigDto = this.aiWidgetsConfigDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(ConfigConstants.CONFIG, ConfigConstants.CONFIG, jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("modes", "modes", jsonReader);
        }
        if (aiWidgetsConfigDto != null) {
            return new DeliveryAiToolsDto.MatchesDto(list, aiWidgetsConfigDto);
        }
        throw Util.missingProperty(ConfigConstants.CONFIG, ConfigConstants.CONFIG, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryAiToolsDto.MatchesDto matchesDto) {
        DeliveryAiToolsDto.MatchesDto matchesDto2 = matchesDto;
        if (matchesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("modes");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) matchesDto2.getModes());
        jsonWriter.name(ConfigConstants.CONFIG);
        this.aiWidgetsConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) matchesDto2.getConfig());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(DeliveryAiToolsDto.MatchesDto)");
    }
}
