package com.squareup.cash.pools.backend.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/pools/backend/api/PoolAppletPreviewJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/pools/backend/api/PoolAppletPreview;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PoolAppletPreviewJsonAdapter extends JsonAdapter {
    public final JsonAdapter floatAdapter;
    public final JsonAdapter listOfParticipantAdapter;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public PoolAppletPreviewJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "participants", "progressPercent", "balance", "goal");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.listOfParticipantAdapter = moshi.adapter(Types.newParameterizedType(List.class, Participant.class), emptySet, "participants");
        this.floatAdapter = moshi.adapter(Float.TYPE, emptySet, "progressPercent");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "balance");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Float f = null;
        Long l = null;
        String str = null;
        List list = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                list = (List) this.listOfParticipantAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("participants", "participants", jsonReader);
                }
            } else if (selectName != 2) {
                JsonAdapter jsonAdapter = this.longAdapter;
                if (selectName == 3) {
                    l = (Long) jsonAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("balance", "balance", jsonReader);
                    }
                } else if (selectName == 4 && (l2 = (Long) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("goal", "goal", jsonReader);
                }
            } else {
                f = (Float) this.floatAdapter.fromJson(jsonReader);
                if (f == null) {
                    throw Util.unexpectedNull("progressPercent", "progressPercent", jsonReader);
                }
            }
        }
        jsonReader.endObject();
        Long l3 = l;
        if (list == null) {
            throw Util.missingProperty("participants", "participants", jsonReader);
        }
        if (f == null) {
            throw Util.missingProperty("progressPercent", "progressPercent", jsonReader);
        }
        float floatValue = f.floatValue();
        if (l3 == null) {
            throw Util.missingProperty("balance", "balance", jsonReader);
        }
        long longValue = l3.longValue();
        if (l2 != null) {
            return new PoolAppletPreview(str, list, floatValue, longValue, l2.longValue());
        }
        throw Util.missingProperty("goal", "goal", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        PoolAppletPreview poolAppletPreview = (PoolAppletPreview) obj;
        jsonWriter.getClass();
        if (poolAppletPreview == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, poolAppletPreview.name);
        jsonWriter.name("participants");
        this.listOfParticipantAdapter.toJson(jsonWriter, poolAppletPreview.participants);
        jsonWriter.name("progressPercent");
        this.floatAdapter.toJson(jsonWriter, Float.valueOf(poolAppletPreview.progressPercent));
        jsonWriter.name("balance");
        long j = poolAppletPreview.balance;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "goal");
        jsonAdapter.toJson(jsonWriter, Long.valueOf(poolAppletPreview.goal));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(PoolAppletPreview)");
    }
}
