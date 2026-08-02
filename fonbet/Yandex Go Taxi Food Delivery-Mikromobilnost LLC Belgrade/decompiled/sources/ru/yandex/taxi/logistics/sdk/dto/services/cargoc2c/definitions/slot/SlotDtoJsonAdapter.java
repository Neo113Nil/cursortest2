package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail.SlotTrailDto;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;", "slotBodyDtoAdapter", "nullableSlotBodyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "nullableActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDto;", "nullableSlotStyleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto$SizeDto;", "sizeDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SlotDtoJsonAdapter extends JsonAdapter<SlotDto> {
    private volatile Constructor<SlotDto> constructorRef;
    private final JsonAdapter<ActionDto> nullableActionDtoAdapter;
    private final JsonAdapter<SlotBodyDto> nullableSlotBodyDtoAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonAdapter<SlotStyleDto> nullableSlotStyleDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lead", "body1", "body2", "body3", "trail1", "action", "style", "size");
    private final JsonAdapter<SlotDto.SizeDto> sizeDtoAdapter;
    private final JsonAdapter<SlotBodyDto> slotBodyDtoAdapter;

    public SlotDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "lead");
        this.slotBodyDtoAdapter = moshi.adapter(SlotBodyDto.class, emptySet, "body1");
        this.nullableSlotBodyDtoAdapter = moshi.adapter(SlotBodyDto.class, emptySet, "body2");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail1");
        this.nullableActionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.nullableSlotStyleDtoAdapter = moshi.adapter(SlotStyleDto.class, emptySet, "style");
        this.sizeDtoAdapter = moshi.adapter(SlotDto.SizeDto.class, emptySet, "size");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SlotDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        SlotLeadDto slotLeadDto = null;
        SlotBodyDto slotBodyDto = null;
        SlotBodyDto slotBodyDto2 = null;
        SlotBodyDto slotBodyDto3 = null;
        SlotTrailDto slotTrailDto = null;
        ActionDto actionDto = null;
        SlotStyleDto slotStyleDto = null;
        SlotDto.SizeDto sizeDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    slotLeadDto = this.nullableSlotLeadDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    slotBodyDto = this.slotBodyDtoAdapter.fromJson(jsonReader);
                    if (slotBodyDto == null) {
                        throw Util.unexpectedNull("body1", "body1", jsonReader);
                    }
                    break;
                case 2:
                    slotBodyDto2 = this.nullableSlotBodyDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    slotBodyDto3 = this.nullableSlotBodyDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    actionDto = this.nullableActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    slotStyleDto = this.nullableSlotStyleDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    sizeDto = this.sizeDtoAdapter.fromJson(jsonReader);
                    if (sizeDto == null) {
                        throw Util.unexpectedNull("size", "size", jsonReader);
                    }
                    i = -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -129) {
            SlotDto.SizeDto sizeDto2 = sizeDto;
            SlotStyleDto slotStyleDto2 = slotStyleDto;
            ActionDto actionDto2 = actionDto;
            SlotTrailDto slotTrailDto2 = slotTrailDto;
            SlotBodyDto slotBodyDto4 = slotBodyDto3;
            SlotBodyDto slotBodyDto5 = slotBodyDto2;
            SlotBodyDto slotBodyDto6 = slotBodyDto;
            SlotLeadDto slotLeadDto2 = slotLeadDto;
            if (slotBodyDto6 != null) {
                return new SlotDto(slotLeadDto2, slotBodyDto6, slotBodyDto5, slotBodyDto4, slotTrailDto2, actionDto2, slotStyleDto2, sizeDto2);
            }
            throw Util.missingProperty("body1", "body1", jsonReader);
        }
        SlotDto.SizeDto sizeDto3 = sizeDto;
        SlotStyleDto slotStyleDto3 = slotStyleDto;
        ActionDto actionDto3 = actionDto;
        SlotTrailDto slotTrailDto3 = slotTrailDto;
        SlotBodyDto slotBodyDto7 = slotBodyDto3;
        SlotBodyDto slotBodyDto8 = slotBodyDto2;
        SlotBodyDto slotBodyDto9 = slotBodyDto;
        SlotLeadDto slotLeadDto3 = slotLeadDto;
        Constructor<SlotDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SlotDto.class.getDeclaredConstructor(SlotLeadDto.class, SlotBodyDto.class, SlotBodyDto.class, SlotBodyDto.class, SlotTrailDto.class, ActionDto.class, SlotStyleDto.class, SlotDto.SizeDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (slotBodyDto9 != null) {
            return constructor.newInstance(slotLeadDto3, slotBodyDto9, slotBodyDto8, slotBodyDto7, slotTrailDto3, actionDto3, slotStyleDto3, sizeDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("body1", "body1", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SlotDto slotDto) {
        SlotDto slotDto2 = slotDto;
        if (slotDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lead");
        this.nullableSlotLeadDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getLead());
        jsonWriter.name("body1");
        this.slotBodyDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getBody1());
        jsonWriter.name("body2");
        this.nullableSlotBodyDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getBody2());
        jsonWriter.name("body3");
        this.nullableSlotBodyDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getBody3());
        jsonWriter.name("trail1");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getTrail1());
        jsonWriter.name("action");
        this.nullableActionDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getAction());
        jsonWriter.name("style");
        this.nullableSlotStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getStyle());
        jsonWriter.name("size");
        this.sizeDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getSize());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(SlotDto)");
    }
}
