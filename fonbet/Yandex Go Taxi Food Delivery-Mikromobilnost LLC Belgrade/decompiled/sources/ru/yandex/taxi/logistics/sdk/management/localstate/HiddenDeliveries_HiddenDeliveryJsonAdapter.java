package ru.yandex.taxi.logistics.sdk.management.localstate;

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
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries_HiddenDeliveryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries$HiddenDelivery;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk-management-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HiddenDeliveries_HiddenDeliveryJsonAdapter extends JsonAdapter<HiddenDeliveries$HiddenDelivery> {
    public static final int $stable = 8;
    private volatile Constructor<HiddenDeliveries$HiddenDelivery> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(MetaDataField.DATE_FIELD, "id", "revision");
    private final JsonAdapter<String> stringAdapter;

    public HiddenDeliveries_HiddenDeliveryJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, MetaDataField.DATE_FIELD);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "revision");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HiddenDeliveries$HiddenDelivery fromJson(JsonReader jsonReader) {
        Integer num = 0;
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(MetaDataField.DATE_FIELD, MetaDataField.DATE_FIELD, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("deliveryId", "id", jsonReader);
                }
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("revision", "revision", jsonReader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (l == null) {
                throw Util.missingProperty(MetaDataField.DATE_FIELD, MetaDataField.DATE_FIELD, jsonReader);
            }
            long longValue = l.longValue();
            if (str != null) {
                return new HiddenDeliveries$HiddenDelivery(longValue, str, num.intValue());
            }
            throw Util.missingProperty("deliveryId", "id", jsonReader);
        }
        Constructor<HiddenDeliveries$HiddenDelivery> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = HiddenDeliveries$HiddenDelivery.class.getDeclaredConstructor(Long.TYPE, String.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (l == null) {
            throw Util.missingProperty(MetaDataField.DATE_FIELD, MetaDataField.DATE_FIELD, jsonReader);
        }
        if (str != null) {
            return constructor.newInstance(l, str, num, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("deliveryId", "id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HiddenDeliveries$HiddenDelivery hiddenDeliveries$HiddenDelivery) {
        HiddenDeliveries$HiddenDelivery hiddenDeliveries$HiddenDelivery2 = hiddenDeliveries$HiddenDelivery;
        if (hiddenDeliveries$HiddenDelivery2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(MetaDataField.DATE_FIELD);
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(hiddenDeliveries$HiddenDelivery2.getDate()));
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) hiddenDeliveries$HiddenDelivery2.getDeliveryId());
        jsonWriter.name("revision");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(hiddenDeliveries$HiddenDelivery2.getRevision()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(HiddenDeliveries.HiddenDelivery)");
    }
}
