package ru.yandex.taxi.logistics.sdk.management.localstate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries_HiddenDeliveriesDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries$HiddenDeliveriesData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/management/localstate/HiddenDeliveries$HiddenDelivery;", "listOfHiddenDeliveryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk-management-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HiddenDeliveries_HiddenDeliveriesDataJsonAdapter extends JsonAdapter<HiddenDeliveries$HiddenDeliveriesData> {
    public static final int $stable = 8;
    private volatile Constructor<HiddenDeliveries$HiddenDeliveriesData> constructorRef;
    private final JsonAdapter<List<HiddenDeliveries$HiddenDelivery>> listOfHiddenDeliveryAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("markedDeliveries");

    public HiddenDeliveries_HiddenDeliveriesDataJsonAdapter(Moshi moshi) {
        this.listOfHiddenDeliveryAdapter = moshi.adapter(Types.newParameterizedType(List.class, HiddenDeliveries$HiddenDelivery.class), EmptySet.a, "markedDeliveries");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final HiddenDeliveries$HiddenDeliveriesData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<HiddenDeliveries$HiddenDelivery> list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfHiddenDeliveryAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("markedDeliveries", "markedDeliveries", jsonReader);
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new HiddenDeliveries$HiddenDeliveriesData(list);
        }
        Constructor<HiddenDeliveries$HiddenDeliveriesData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HiddenDeliveries$HiddenDeliveriesData.class.getDeclaredConstructor(List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(list, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, HiddenDeliveries$HiddenDeliveriesData hiddenDeliveries$HiddenDeliveriesData) {
        HiddenDeliveries$HiddenDeliveriesData hiddenDeliveries$HiddenDeliveriesData2 = hiddenDeliveries$HiddenDeliveriesData;
        if (hiddenDeliveries$HiddenDeliveriesData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("markedDeliveries");
        this.listOfHiddenDeliveryAdapter.toJson(jsonWriter, (JsonWriter) hiddenDeliveries$HiddenDeliveriesData2.getMarkedDeliveries());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(HiddenDeliveries.HiddenDeliveriesData)");
    }
}
