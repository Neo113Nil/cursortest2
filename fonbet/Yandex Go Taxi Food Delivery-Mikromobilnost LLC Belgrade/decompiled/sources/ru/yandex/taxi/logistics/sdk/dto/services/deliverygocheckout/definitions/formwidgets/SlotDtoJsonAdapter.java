package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.SlotLeadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SlotLeadDto;", "nullableSlotLeadDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "slotBodyDtoAdapter", "nullableSlotBodyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "nullableSlotTrailDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotStyleDto;", "nullableSlotStyleDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$StateDependedStylesDto;", "nullableListOfStateDependedStylesDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto$SizeDto;", "sizeDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotDtoJsonAdapter extends JsonAdapter<SlotDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SlotDto> constructorRef;
    private final JsonAdapter<List<SlotDto.StateDependedStylesDto>> nullableListOfStateDependedStylesDtoAdapter;
    private final JsonAdapter<SlotBodyDto> nullableSlotBodyDtoAdapter;
    private final JsonAdapter<SlotLeadDto> nullableSlotLeadDtoAdapter;
    private final JsonAdapter<SlotStyleDto> nullableSlotStyleDtoAdapter;
    private final JsonAdapter<SlotTrailDto> nullableSlotTrailDtoAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lead", "body1", "body2", "body3", "trail1", "trail2", "action", BackendConfig.Restrictions.ENABLED, "style", "state_depended_styles", "size");
    private final JsonAdapter<SlotDto.SizeDto> sizeDtoAdapter;
    private final JsonAdapter<SlotBodyDto> slotBodyDtoAdapter;

    public SlotDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableSlotLeadDtoAdapter = moshi.adapter(SlotLeadDto.class, emptySet, "lead");
        this.slotBodyDtoAdapter = moshi.adapter(SlotBodyDto.class, emptySet, "body1");
        this.nullableSlotBodyDtoAdapter = moshi.adapter(SlotBodyDto.class, emptySet, "body2");
        this.nullableSlotTrailDtoAdapter = moshi.adapter(SlotTrailDto.class, emptySet, "trail1");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
        this.nullableSlotStyleDtoAdapter = moshi.adapter(SlotStyleDto.class, emptySet, "style");
        this.nullableListOfStateDependedStylesDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SlotDto.StateDependedStylesDto.class), emptySet, "stateDependedStyles");
        this.sizeDtoAdapter = moshi.adapter(SlotDto.SizeDto.class, emptySet, "size");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SlotDto fromJson(JsonReader jsonReader) {
        SlotBodyDto slotBodyDto;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        SlotBodyDto slotBodyDto2 = null;
        Boolean bool2 = bool;
        SlotBodyDto slotBodyDto3 = null;
        SlotLeadDto slotLeadDto = null;
        SlotTrailDto slotTrailDto = null;
        TapActionDto tapActionDto = null;
        SlotTrailDto slotTrailDto2 = null;
        SlotStyleDto slotStyleDto = null;
        List<SlotDto.StateDependedStylesDto> list = null;
        SlotDto.SizeDto sizeDto = null;
        int i = -1;
        SlotBodyDto slotBodyDto4 = null;
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
                    slotBodyDto3 = this.slotBodyDtoAdapter.fromJson(jsonReader);
                    if (slotBodyDto3 == null) {
                        throw Util.unexpectedNull("body1", "body1", jsonReader);
                    }
                    break;
                case 2:
                    slotBodyDto2 = this.nullableSlotBodyDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    slotBodyDto4 = this.nullableSlotBodyDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    slotTrailDto2 = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    slotTrailDto = this.nullableSlotTrailDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    i &= -129;
                    break;
                case 8:
                    slotStyleDto = this.nullableSlotStyleDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    list = this.nullableListOfStateDependedStylesDtoAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    sizeDto = this.sizeDtoAdapter.fromJson(jsonReader);
                    if (sizeDto == null) {
                        throw Util.unexpectedNull("size", "size", jsonReader);
                    }
                    i &= -1025;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -1153) {
            if (slotBodyDto3 == null) {
                throw Util.missingProperty("body1", "body1", jsonReader);
            }
            return new SlotDto(slotLeadDto, slotBodyDto3, slotBodyDto2, slotBodyDto4, slotTrailDto2, slotTrailDto, tapActionDto, bool2.booleanValue(), slotStyleDto, list, sizeDto);
        }
        Constructor<SlotDto> constructor = this.constructorRef;
        if (constructor == null) {
            slotBodyDto = slotBodyDto3;
            constructor = SlotDto.class.getDeclaredConstructor(SlotLeadDto.class, SlotBodyDto.class, SlotBodyDto.class, SlotBodyDto.class, SlotTrailDto.class, SlotTrailDto.class, TapActionDto.class, Boolean.TYPE, SlotStyleDto.class, List.class, SlotDto.SizeDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            slotBodyDto = slotBodyDto3;
        }
        Constructor<SlotDto> constructor2 = constructor;
        if (slotBodyDto == null) {
            throw Util.missingProperty("body1", "body1", jsonReader);
        }
        return constructor2.newInstance(slotLeadDto, slotBodyDto, slotBodyDto2, slotBodyDto4, slotTrailDto2, slotTrailDto, tapActionDto, bool2, slotStyleDto, list, sizeDto, Integer.valueOf(i), null);
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
        jsonWriter.name("trail2");
        this.nullableSlotTrailDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getTrail2());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getAction());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(slotDto2.getEnabled()));
        jsonWriter.name("style");
        this.nullableSlotStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getStyle());
        jsonWriter.name("state_depended_styles");
        this.nullableListOfStateDependedStylesDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getStateDependedStyles());
        jsonWriter.name("size");
        this.sizeDtoAdapter.toJson(jsonWriter, (JsonWriter) slotDto2.getSize());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(SlotDto)");
    }
}
