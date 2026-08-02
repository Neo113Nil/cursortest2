package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/TimeslotDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/TimeslotDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TimeslotDtoJsonAdapter extends JsonAdapter<TimeslotDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TimeslotDto> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "timestamp_from", "timestamp_to", "price_subtitle", "is_paid");
    private final JsonAdapter<String> stringAdapter;

    public TimeslotDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "timestampFrom");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "priceSubtitle");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPaid");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TimeslotDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        String str = null;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("timestampFrom", "timestamp_from", jsonReader);
                }
            } else if (selectName == 2) {
                l2 = this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    throw Util.unexpectedNull("timestampTo", "timestamp_to", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isPaid", "is_paid", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            if (str == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (l == null) {
                throw Util.missingProperty("timestampFrom", "timestamp_from", jsonReader);
            }
            long longValue = l.longValue();
            if (l2 == null) {
                throw Util.missingProperty("timestampTo", "timestamp_to", jsonReader);
            }
            return new TimeslotDto(str, longValue, l2.longValue(), str2, bool2.booleanValue());
        }
        Constructor<TimeslotDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = TimeslotDto.class.getDeclaredConstructor(String.class, cls3, cls3, String.class, Boolean.TYPE, cls, cls2);
            this.constructorRef = constructor;
        }
        Constructor<TimeslotDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (l == null) {
            throw Util.missingProperty("timestampFrom", "timestamp_from", jsonReader);
        }
        if (l2 == null) {
            throw Util.missingProperty("timestampTo", "timestamp_to", jsonReader);
        }
        return constructor2.newInstance(str, l, l2, str2, bool2, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TimeslotDto timeslotDto) {
        TimeslotDto timeslotDto2 = timeslotDto;
        if (timeslotDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) timeslotDto2.getTitle());
        jsonWriter.name("timestamp_from");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(timeslotDto2.getTimestampFrom()));
        jsonWriter.name("timestamp_to");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(timeslotDto2.getTimestampTo()));
        jsonWriter.name("price_subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) timeslotDto2.getPriceSubtitle());
        jsonWriter.name("is_paid");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(timeslotDto2.isPaid()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(TimeslotDto)");
    }
}
