package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

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
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto;", "triggersDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto;", "scheduleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto;", "contactPolicyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$BodyDto;", "bodyDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalNotificationDtoJsonAdapter extends JsonAdapter<LocalNotificationDto> {
    private final JsonAdapter<LocalNotificationDto.BodyDto> bodyDtoAdapter;
    private final JsonAdapter<LocalNotificationDto.ContactPolicyDto> contactPolicyDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("triggers", Constants.DEEPLINK, "schedule", "contact_policy", "body", "metrica_context");
    private final JsonAdapter<LocalNotificationDto.ScheduleDto> scheduleDtoAdapter;
    private final JsonAdapter<LocalNotificationDto.TriggersDto> triggersDtoAdapter;

    public LocalNotificationDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.triggersDtoAdapter = moshi.adapter(LocalNotificationDto.TriggersDto.class, emptySet, "triggers");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, Constants.DEEPLINK);
        this.scheduleDtoAdapter = moshi.adapter(LocalNotificationDto.ScheduleDto.class, emptySet, "schedule");
        this.contactPolicyDtoAdapter = moshi.adapter(LocalNotificationDto.ContactPolicyDto.class, emptySet, "contactPolicy");
        this.bodyDtoAdapter = moshi.adapter(LocalNotificationDto.BodyDto.class, emptySet, "body");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalNotificationDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        LocalNotificationDto.TriggersDto triggersDto = null;
        String str = null;
        LocalNotificationDto.ScheduleDto scheduleDto = null;
        LocalNotificationDto.ContactPolicyDto contactPolicyDto = null;
        LocalNotificationDto.BodyDto bodyDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    triggersDto = this.triggersDtoAdapter.fromJson(jsonReader);
                    if (triggersDto == null) {
                        throw Util.unexpectedNull("triggers", "triggers", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    scheduleDto = this.scheduleDtoAdapter.fromJson(jsonReader);
                    if (scheduleDto == null) {
                        throw Util.unexpectedNull("schedule", "schedule", jsonReader);
                    }
                    break;
                case 3:
                    contactPolicyDto = this.contactPolicyDtoAdapter.fromJson(jsonReader);
                    if (contactPolicyDto == null) {
                        throw Util.unexpectedNull("contactPolicy", "contact_policy", jsonReader);
                    }
                    break;
                case 4:
                    bodyDto = this.bodyDtoAdapter.fromJson(jsonReader);
                    if (bodyDto == null) {
                        throw Util.unexpectedNull("body", "body", jsonReader);
                    }
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (triggersDto == null) {
            throw Util.missingProperty("triggers", "triggers", jsonReader);
        }
        if (scheduleDto == null) {
            throw Util.missingProperty("schedule", "schedule", jsonReader);
        }
        if (contactPolicyDto == null) {
            throw Util.missingProperty("contactPolicy", "contact_policy", jsonReader);
        }
        if (bodyDto != null) {
            return new LocalNotificationDto(triggersDto, str, scheduleDto, contactPolicyDto, bodyDto, str2);
        }
        throw Util.missingProperty("body", "body", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalNotificationDto localNotificationDto) {
        LocalNotificationDto localNotificationDto2 = localNotificationDto;
        if (localNotificationDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("triggers");
        this.triggersDtoAdapter.toJson(jsonWriter, (JsonWriter) localNotificationDto2.getTriggers());
        jsonWriter.name(Constants.DEEPLINK);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) localNotificationDto2.getDeeplink());
        jsonWriter.name("schedule");
        this.scheduleDtoAdapter.toJson(jsonWriter, (JsonWriter) localNotificationDto2.getSchedule());
        jsonWriter.name("contact_policy");
        this.contactPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) localNotificationDto2.getContactPolicy());
        jsonWriter.name("body");
        this.bodyDtoAdapter.toJson(jsonWriter, (JsonWriter) localNotificationDto2.getBody());
        jsonWriter.name("metrica_context");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) localNotificationDto2.getMetricaContext());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(LocalNotificationDto)");
    }
}
