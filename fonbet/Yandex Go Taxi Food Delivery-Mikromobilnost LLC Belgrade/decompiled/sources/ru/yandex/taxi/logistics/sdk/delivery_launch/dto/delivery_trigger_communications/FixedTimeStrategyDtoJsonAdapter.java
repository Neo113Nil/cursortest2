package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.FixedTimeStrategyDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto$TypeDto;", "typeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;", "timeDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FixedTimeStrategyDtoJsonAdapter extends JsonAdapter<FixedTimeStrategyDto> {
    private final JsonReader.Options options = JsonReader.Options.of("type", RemoteBioParameters.TIME);
    private final JsonAdapter<TimeDto> timeDtoAdapter;
    private final JsonAdapter<FixedTimeStrategyDto.TypeDto> typeDtoAdapter;

    public FixedTimeStrategyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.typeDtoAdapter = moshi.adapter(FixedTimeStrategyDto.TypeDto.class, emptySet, "type");
        this.timeDtoAdapter = moshi.adapter(TimeDto.class, emptySet, RemoteBioParameters.TIME);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FixedTimeStrategyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        FixedTimeStrategyDto.TypeDto typeDto = null;
        TimeDto timeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                typeDto = this.typeDtoAdapter.fromJson(jsonReader);
                if (typeDto == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1 && (timeDto = this.timeDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(RemoteBioParameters.TIME, RemoteBioParameters.TIME, jsonReader);
            }
        }
        jsonReader.endObject();
        if (typeDto == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (timeDto != null) {
            return new FixedTimeStrategyDto(typeDto, timeDto);
        }
        throw Util.missingProperty(RemoteBioParameters.TIME, RemoteBioParameters.TIME, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FixedTimeStrategyDto fixedTimeStrategyDto) {
        FixedTimeStrategyDto fixedTimeStrategyDto2 = fixedTimeStrategyDto;
        if (fixedTimeStrategyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.typeDtoAdapter.toJson(jsonWriter, (JsonWriter) fixedTimeStrategyDto2.getType());
        jsonWriter.name(RemoteBioParameters.TIME);
        this.timeDtoAdapter.toJson(jsonWriter, (JsonWriter) fixedTimeStrategyDto2.getTime());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(FixedTimeStrategyDto)");
    }
}
