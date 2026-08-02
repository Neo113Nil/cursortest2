package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormStateRestoreModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormStateRestoreModel;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "", "mapOfStringAnyAdapter", "", "Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormRestoreAddressModel;", "listOfFormRestoreAddressModelAdapter", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormStateRestoreModelJsonAdapter extends JsonAdapter<FormStateRestoreModel> {
    private final JsonAdapter<List<FormRestoreAddressModel>> listOfFormRestoreAddressModelAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("mode", "scenario", "stateMap", "route", "pickupPointsRoute");
    private final JsonAdapter<String> stringAdapter;

    public FormStateRestoreModelJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "mode");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "scenario");
        this.mapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "stateMap");
        this.listOfFormRestoreAddressModelAdapter = moshi.adapter(Types.newParameterizedType(List.class, FormRestoreAddressModel.class), emptySet, "route");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormStateRestoreModel fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, Object> map = null;
        List<FormRestoreAddressModel> list = null;
        List<FormRestoreAddressModel> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("mode", "mode", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                map = this.mapOfStringAnyAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("stateMap", "stateMap", jsonReader);
                }
            } else if (selectName == 3) {
                list = this.listOfFormRestoreAddressModelAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("route", "route", jsonReader);
                }
            } else if (selectName == 4 && (list2 = this.listOfFormRestoreAddressModelAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("pickupPointsRoute", "pickupPointsRoute", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("mode", "mode", jsonReader);
        }
        if (map == null) {
            throw Util.missingProperty("stateMap", "stateMap", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("route", "route", jsonReader);
        }
        if (list2 != null) {
            return new FormStateRestoreModel(str, str2, map, list, list2);
        }
        throw Util.missingProperty("pickupPointsRoute", "pickupPointsRoute", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormStateRestoreModel formStateRestoreModel) {
        FormStateRestoreModel formStateRestoreModel2 = formStateRestoreModel;
        if (formStateRestoreModel2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("mode");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formStateRestoreModel2.getMode());
        jsonWriter.name("scenario");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formStateRestoreModel2.getScenario());
        jsonWriter.name("stateMap");
        this.mapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) formStateRestoreModel2.getStateMap());
        jsonWriter.name("route");
        this.listOfFormRestoreAddressModelAdapter.toJson(jsonWriter, (JsonWriter) formStateRestoreModel2.getRoute());
        jsonWriter.name("pickupPointsRoute");
        this.listOfFormRestoreAddressModelAdapter.toJson(jsonWriter, (JsonWriter) formStateRestoreModel2.getPickupPointsRoute());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(FormStateRestoreModel)");
    }
}
