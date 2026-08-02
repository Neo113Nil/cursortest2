package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.LocalNotificationDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto_TriggersDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto$EntryPointsDto;", "nullableListOfEntryPointsDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalNotificationDto_TriggersDtoJsonAdapter extends JsonAdapter<LocalNotificationDto.TriggersDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<LocalNotificationDto.TriggersDto> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<LocalNotificationDto.TriggersDto.EntryPointsDto>> nullableListOfEntryPointsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("modes", "entry_points", "require_point_a", "require_point_b", "is_pvz_points");

    public LocalNotificationDto_TriggersDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "modes");
        this.nullableListOfEntryPointsDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, LocalNotificationDto.TriggersDto.EntryPointsDto.class), emptySet, "entryPoints");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "requirePointA");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalNotificationDto.TriggersDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        List<String> list = null;
        List<LocalNotificationDto.TriggersDto.EntryPointsDto> list2 = null;
        int i = -1;
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
            } else if (selectName == 1) {
                list2 = this.nullableListOfEntryPointsDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("requirePointA", "require_point_a", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                bool3 = this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    throw Util.unexpectedNull("requirePointB", "require_point_b", jsonReader);
                }
                i &= -9;
            } else if (selectName == 4) {
                bool4 = this.booleanAdapter.fromJson(jsonReader);
                if (bool4 == null) {
                    throw Util.unexpectedNull("isPvzPoints", "is_pvz_points", jsonReader);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -29) {
            if (list == null) {
                throw Util.missingProperty("modes", "modes", jsonReader);
            }
            return new LocalNotificationDto.TriggersDto(list, list2, bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
        }
        Constructor<LocalNotificationDto.TriggersDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = LocalNotificationDto.TriggersDto.class.getDeclaredConstructor(List.class, List.class, cls3, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, list2, bool2, bool3, bool4, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("modes", "modes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalNotificationDto.TriggersDto triggersDto) {
        LocalNotificationDto.TriggersDto triggersDto2 = triggersDto;
        if (triggersDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("modes");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) triggersDto2.getModes());
        jsonWriter.name("entry_points");
        this.nullableListOfEntryPointsDtoAdapter.toJson(jsonWriter, (JsonWriter) triggersDto2.getEntryPoints());
        jsonWriter.name("require_point_a");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(triggersDto2.getRequirePointA()));
        jsonWriter.name("require_point_b");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(triggersDto2.getRequirePointB()));
        jsonWriter.name("is_pvz_points");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(triggersDto2.isPvzPoints()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(LocalNotificationDto.TriggersDto)");
    }
}
