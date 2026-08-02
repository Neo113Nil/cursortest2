package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailRadioControlDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailRadioControlDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "anyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrailRadioControlDtoJsonAdapter extends JsonAdapter<TrailRadioControlDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TrailRadioControlDto> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(BackendConfig.Restrictions.ENABLED, "key", "value", "action", "action_on_unselect", "disabled_unselect", "presentation_id", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public TrailRadioControlDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, BackendConfig.Restrictions.ENABLED);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "key");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "value");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "presentationId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TrailRadioControlDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        Object obj = null;
        TapActionDto tapActionDto = null;
        TapActionDto tapActionDto2 = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    i &= -2;
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("key", "key", jsonReader);
                    }
                    break;
                case 2:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull("value__", "value", jsonReader);
                    }
                    break;
                case 3:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    tapActionDto2 = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("disabledUnselect", "disabled_unselect", jsonReader);
                    }
                    i &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -34) {
            boolean booleanValue = bool2.booleanValue();
            if (str == null) {
                throw Util.missingProperty("key", "key", jsonReader);
            }
            if (obj == null) {
                throw Util.missingProperty("value__", "value", jsonReader);
            }
            return new TrailRadioControlDto(booleanValue, str, obj, tapActionDto, tapActionDto2, bool3.booleanValue(), str2, str3);
        }
        Constructor<TrailRadioControlDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = TrailRadioControlDto.class.getDeclaredConstructor(cls3, String.class, Object.class, TapActionDto.class, TapActionDto.class, cls3, String.class, String.class, cls, cls2);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("key", "key", jsonReader);
        }
        if (obj == null) {
            throw Util.missingProperty("value__", "value", jsonReader);
        }
        return constructor.newInstance(bool2, str, obj, tapActionDto, tapActionDto2, bool3, str2, str3, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TrailRadioControlDto trailRadioControlDto) {
        TrailRadioControlDto trailRadioControlDto2 = trailRadioControlDto;
        if (trailRadioControlDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(trailRadioControlDto2.getEnabled()));
        jsonWriter.name("key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) trailRadioControlDto2.getKey());
        jsonWriter.name("value");
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) trailRadioControlDto2.getValue());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailRadioControlDto2.getAction());
        jsonWriter.name("action_on_unselect");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) trailRadioControlDto2.getActionOnUnselect());
        jsonWriter.name("disabled_unselect");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(trailRadioControlDto2.getDisabledUnselect()));
        jsonWriter.name("presentation_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailRadioControlDto2.getPresentationId());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) trailRadioControlDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(TrailRadioControlDto)");
    }
}
