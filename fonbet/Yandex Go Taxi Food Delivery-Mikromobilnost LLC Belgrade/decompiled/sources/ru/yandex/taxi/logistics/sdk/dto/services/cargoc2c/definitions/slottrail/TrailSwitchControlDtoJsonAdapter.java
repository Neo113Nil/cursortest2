package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailSwitchControlDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailSwitchControlDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "actionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableActionDtoAdapter", "", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrailSwitchControlDtoJsonAdapter extends JsonAdapter<TrailSwitchControlDto> {
    private final JsonAdapter<ActionDto> actionDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TrailSwitchControlDto> constructorRef;
    private final JsonAdapter<ActionDto> nullableActionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("action", "action_on_unselect", "metrica_label", "selected", BackendConfig.Restrictions.ENABLED);

    public TrailSwitchControlDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.actionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.nullableActionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "actionOnUnselect");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "selected");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailSwitchControlDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        ActionDto actionDto = null;
        ActionDto actionDto2 = null;
        String str = null;
        Boolean bool3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                actionDto = this.actionDtoAdapter.fromJson(jsonReader);
                if (actionDto == null) {
                    throw Util.unexpectedNull("action", "action", jsonReader);
                }
            } else if (selectName == 1) {
                actionDto2 = this.nullableActionDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                bool3 = this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    throw Util.unexpectedNull("selected", "selected", jsonReader);
                }
            } else if (selectName == 4) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (actionDto == null) {
                throw Util.missingProperty("action", "action", jsonReader);
            }
            if (bool3 == null) {
                throw Util.missingProperty("selected", "selected", jsonReader);
            }
            return new TrailSwitchControlDto(actionDto, actionDto2, str, bool3.booleanValue(), bool2.booleanValue());
        }
        Constructor<TrailSwitchControlDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = TrailSwitchControlDto.class.getDeclaredConstructor(ActionDto.class, ActionDto.class, String.class, cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
        }
        if (actionDto == null) {
            throw Util.missingProperty("action", "action", jsonReader);
        }
        if (bool3 != null) {
            return constructor.newInstance(actionDto, actionDto2, str, bool3, bool2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("selected", "selected", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailSwitchControlDto trailSwitchControlDto) {
        TrailSwitchControlDto trailSwitchControlDto2 = trailSwitchControlDto;
        if (trailSwitchControlDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("action");
        this.actionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailSwitchControlDto2.getAction());
        jsonWriter.name("action_on_unselect");
        this.nullableActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailSwitchControlDto2.getActionOnUnselect());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailSwitchControlDto2.getMetricaLabel());
        jsonWriter.name("selected");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(trailSwitchControlDto2.getSelected()));
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(trailSwitchControlDto2.getEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(TrailSwitchControlDto)");
    }
}
