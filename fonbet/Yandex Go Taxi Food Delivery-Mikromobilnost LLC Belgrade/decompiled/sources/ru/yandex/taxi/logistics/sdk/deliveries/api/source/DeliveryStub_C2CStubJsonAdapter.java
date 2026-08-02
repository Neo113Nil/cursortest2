package ru.yandex.taxi.logistics.sdk.deliveries.api.source;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub_C2CStubJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/deliveries/api/source/DeliveryStub$C2CStub;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "intAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk-deliveries"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveryStub_C2CStubJsonAdapter extends JsonAdapter<DeliveryStub$C2CStub> {
    private volatile Constructor<DeliveryStub$C2CStub> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("localUuid", "deliveryId", "revision", ClidProvider.TIMESTAMP);
    private final JsonAdapter<UUID> uUIDAdapter;

    public DeliveryStub_C2CStubJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.uUIDAdapter = moshi.adapter(UUID.class, emptySet, "localUuid");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "revision");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryStub$C2CStub fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Long l = 0L;
        UUID uuid = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                uuid = this.uUIDAdapter.fromJson(jsonReader);
                if (uuid == null) {
                    throw Util.unexpectedNull("localUuid", "localUuid", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("revision", "revision", jsonReader);
                }
                i &= -5;
            } else if (selectName == 3) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -15) {
            if (uuid == null) {
                throw Util.missingProperty("localUuid", "localUuid", jsonReader);
            }
            return new DeliveryStub$C2CStub(uuid, str, num.intValue(), l.longValue());
        }
        Constructor<DeliveryStub$C2CStub> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Integer.TYPE;
            constructor = DeliveryStub$C2CStub.class.getDeclaredConstructor(UUID.class, String.class, cls3, cls, cls3, cls2);
            this.constructorRef = constructor;
        }
        if (uuid != null) {
            return constructor.newInstance(uuid, str, num, l, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("localUuid", "localUuid", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryStub$C2CStub deliveryStub$C2CStub) {
        DeliveryStub$C2CStub deliveryStub$C2CStub2 = deliveryStub$C2CStub;
        if (deliveryStub$C2CStub2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("localUuid");
        this.uUIDAdapter.toJson(jsonWriter, (JsonWriter) deliveryStub$C2CStub2.getLocalUuid());
        jsonWriter.name("deliveryId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryStub$C2CStub2.getDeliveryId());
        jsonWriter.name("revision");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(deliveryStub$C2CStub2.getRevision()));
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(deliveryStub$C2CStub2.getTimestamp()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(DeliveryStub.C2CStub)");
    }
}
