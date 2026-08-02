package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto_ScheduleDto_StrategyDto_Strategy_FixedTimeDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_FixedTimeDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalNotificationDto_ScheduleDto_StrategyDto_Strategy_FixedTimeDto_JsonAdapter extends JsonAdapter<LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto> {
    private final JsonAdapter<FixedTimeStrategyDto> delegateAdapter;

    public LocalNotificationDto_ScheduleDto_StrategyDto_Strategy_FixedTimeDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(FixedTimeStrategyDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto fromJson(JsonReader jsonReader) {
        FixedTimeStrategyDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto("fixed_time", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto strategy_FixedTimeDto) {
        LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_FixedTimeDto strategy_FixedTimeDto2 = strategy_FixedTimeDto;
        if (strategy_FixedTimeDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) strategy_FixedTimeDto2.b);
    }
}
