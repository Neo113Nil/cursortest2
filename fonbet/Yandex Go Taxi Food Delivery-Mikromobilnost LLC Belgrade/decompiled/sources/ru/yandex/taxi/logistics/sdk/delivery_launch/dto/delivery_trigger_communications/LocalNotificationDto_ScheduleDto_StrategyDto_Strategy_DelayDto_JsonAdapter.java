package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto_ScheduleDto_StrategyDto_Strategy_DelayDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_DelayDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalNotificationDto_ScheduleDto_StrategyDto_Strategy_DelayDto_JsonAdapter extends JsonAdapter<LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto> {
    private final JsonAdapter<DelayStrategyDto> delegateAdapter;

    public LocalNotificationDto_ScheduleDto_StrategyDto_Strategy_DelayDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(DelayStrategyDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto fromJson(JsonReader jsonReader) {
        DelayStrategyDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto("delay", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto strategy_DelayDto) {
        LocalNotificationDto.ScheduleDto.StrategyDto.Strategy_DelayDto strategy_DelayDto2 = strategy_DelayDto;
        if (strategy_DelayDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) strategy_DelayDto2.b);
    }
}
