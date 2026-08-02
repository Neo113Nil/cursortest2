package com.squareup.cash.mri.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mri.android.MobileRuntimeIntegrityWorker;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/mri/android/MobileRuntimeIntegrityWorker_ComputationalIntegrityJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/mri/android/MobileRuntimeIntegrityWorker$ComputationalIntegrityJson;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MobileRuntimeIntegrityWorker_ComputationalIntegrityJsonJsonAdapter extends JsonAdapter {
    public final JsonAdapter intAdapter;
    public final JsonAdapter longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public MobileRuntimeIntegrityWorker_ComputationalIntegrityJsonJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("wall_clock_ms", "cpu_time_ms", "input_timestamp_ms", "memory_cost_kb", "time_cost", "parallelism", "output_hash");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "wallClockMs");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "memoryCostKb");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "outputHash");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        while (true) {
            Long l4 = l;
            Long l5 = l2;
            Long l6 = l3;
            Integer num4 = num;
            Integer num5 = num2;
            Integer num6 = num3;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (l4 == null) {
                    throw Util.missingProperty("wallClockMs", "wall_clock_ms", jsonReader);
                }
                long longValue = l4.longValue();
                if (l5 == null) {
                    throw Util.missingProperty("cpuTimeMs", "cpu_time_ms", jsonReader);
                }
                long longValue2 = l5.longValue();
                if (l6 == null) {
                    throw Util.missingProperty("inputTimestampMs", "input_timestamp_ms", jsonReader);
                }
                long longValue3 = l6.longValue();
                if (num4 == null) {
                    throw Util.missingProperty("memoryCostKb", "memory_cost_kb", jsonReader);
                }
                int intValue = num4.intValue();
                if (num5 == null) {
                    throw Util.missingProperty("timeCost", "time_cost", jsonReader);
                }
                int intValue2 = num5.intValue();
                if (num6 == null) {
                    throw Util.missingProperty("parallelism", "parallelism", jsonReader);
                }
                int intValue3 = num6.intValue();
                if (str != null) {
                    return new MobileRuntimeIntegrityWorker.ComputationalIntegrityJson(longValue, longValue2, longValue3, intValue, intValue2, intValue3, str);
                }
                throw Util.missingProperty("outputHash", "output_hash", jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.longAdapter;
            JsonAdapter jsonAdapter2 = this.intAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                case 0:
                    l = (Long) jsonAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("wallClockMs", "wall_clock_ms", jsonReader);
                    }
                    l2 = l5;
                    l3 = l6;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                case 1:
                    l2 = (Long) jsonAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("cpuTimeMs", "cpu_time_ms", jsonReader);
                    }
                    l = l4;
                    l3 = l6;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                case 2:
                    l3 = (Long) jsonAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        throw Util.unexpectedNull("inputTimestampMs", "input_timestamp_ms", jsonReader);
                    }
                    l = l4;
                    l2 = l5;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                case 3:
                    num = (Integer) jsonAdapter2.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("memoryCostKb", "memory_cost_kb", jsonReader);
                    }
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    num2 = num5;
                    num3 = num6;
                case 4:
                    num2 = (Integer) jsonAdapter2.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("timeCost", "time_cost", jsonReader);
                    }
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    num = num4;
                    num3 = num6;
                case 5:
                    Integer num7 = (Integer) jsonAdapter2.fromJson(jsonReader);
                    if (num7 == null) {
                        throw Util.unexpectedNull("parallelism", "parallelism", jsonReader);
                    }
                    num3 = num7;
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    num = num4;
                    num2 = num5;
                case 6:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("outputHash", "output_hash", jsonReader);
                    }
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                default:
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        MobileRuntimeIntegrityWorker.ComputationalIntegrityJson computationalIntegrityJson = (MobileRuntimeIntegrityWorker.ComputationalIntegrityJson) obj;
        jsonWriter.getClass();
        if (computationalIntegrityJson == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("wall_clock_ms");
        long j = computationalIntegrityJson.wallClockMs;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "cpu_time_ms");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(computationalIntegrityJson.cpuTimeMs, jsonAdapter, jsonWriter, "input_timestamp_ms");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(computationalIntegrityJson.inputTimestampMs, jsonAdapter, jsonWriter, "memory_cost_kb");
        Integer valueOf = Integer.valueOf(computationalIntegrityJson.memoryCostKb);
        JsonAdapter jsonAdapter2 = this.intAdapter;
        jsonAdapter2.toJson(jsonWriter, valueOf);
        jsonWriter.name("time_cost");
        jsonAdapter2.toJson(jsonWriter, Integer.valueOf(computationalIntegrityJson.timeCost));
        jsonWriter.name("parallelism");
        jsonAdapter2.toJson(jsonWriter, Integer.valueOf(computationalIntegrityJson.parallelism));
        jsonWriter.name("output_hash");
        this.stringAdapter.toJson(jsonWriter, computationalIntegrityJson.outputHash);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(77, "GeneratedJsonAdapter(MobileRuntimeIntegrityWorker.ComputationalIntegrityJson)");
    }
}
