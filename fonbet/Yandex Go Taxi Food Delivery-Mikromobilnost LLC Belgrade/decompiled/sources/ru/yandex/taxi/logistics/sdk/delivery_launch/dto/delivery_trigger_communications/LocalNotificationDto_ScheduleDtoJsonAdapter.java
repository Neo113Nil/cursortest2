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
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto_ScheduleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "strategyDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/CommunicationWindowDto;", "communicationWindowDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalNotificationDto_ScheduleDtoJsonAdapter extends JsonAdapter<LocalNotificationDto.ScheduleDto> {
    private final JsonAdapter<CommunicationWindowDto> communicationWindowDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("strategy", "communication_window");
    private final JsonAdapter<LocalNotificationDto.ScheduleDto.StrategyDto> strategyDtoAdapter;

    public LocalNotificationDto_ScheduleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.strategyDtoAdapter = moshi.adapter(LocalNotificationDto.ScheduleDto.StrategyDto.class, emptySet, "strategy");
        this.communicationWindowDtoAdapter = moshi.adapter(CommunicationWindowDto.class, emptySet, "communicationWindow");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalNotificationDto.ScheduleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        LocalNotificationDto.ScheduleDto.StrategyDto strategyDto = null;
        CommunicationWindowDto communicationWindowDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                strategyDto = this.strategyDtoAdapter.fromJson(jsonReader);
                if (strategyDto == null) {
                    throw Util.unexpectedNull("strategy", "strategy", jsonReader);
                }
            } else if (selectName == 1 && (communicationWindowDto = this.communicationWindowDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("communicationWindow", "communication_window", jsonReader);
            }
        }
        jsonReader.endObject();
        if (strategyDto == null) {
            throw Util.missingProperty("strategy", "strategy", jsonReader);
        }
        if (communicationWindowDto != null) {
            return new LocalNotificationDto.ScheduleDto(strategyDto, communicationWindowDto);
        }
        throw Util.missingProperty("communicationWindow", "communication_window", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalNotificationDto.ScheduleDto scheduleDto) {
        LocalNotificationDto.ScheduleDto scheduleDto2 = scheduleDto;
        if (scheduleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("strategy");
        this.strategyDtoAdapter.toJson(jsonWriter, (JsonWriter) scheduleDto2.getStrategy());
        jsonWriter.name("communication_window");
        this.communicationWindowDtoAdapter.toJson(jsonWriter, (JsonWriter) scheduleDto2.getCommunicationWindow());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(LocalNotificationDto.ScheduleDto)");
    }
}
