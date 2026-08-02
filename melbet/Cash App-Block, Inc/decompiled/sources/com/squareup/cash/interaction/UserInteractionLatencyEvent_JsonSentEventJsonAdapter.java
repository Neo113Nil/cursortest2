package com.squareup.cash.interaction;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.interaction.UserInteractionLatencyEvent;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/interaction/UserInteractionLatencyEvent_JsonSentEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/interaction/UserInteractionLatencyEvent$JsonSentEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserInteractionLatencyEvent_JsonSentEventJsonAdapter extends JsonAdapter {
    public final JsonAdapter anyAdapter;
    public final JsonAdapter longAdapter;
    public final JsonReader.Options options;

    public UserInteractionLatencyEvent_JsonSentEventJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("t", "e");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "t");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, "e");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Long l = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("t", "t", jsonReader);
                }
            } else if (selectName == 1 && (obj = this.anyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("e", "e", jsonReader);
            }
        }
        jsonReader.endObject();
        if (l == null) {
            throw Util.missingProperty("t", "t", jsonReader);
        }
        long longValue = l.longValue();
        if (obj != null) {
            return new UserInteractionLatencyEvent.JsonSentEvent(obj, longValue);
        }
        throw Util.missingProperty("e", "e", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        UserInteractionLatencyEvent.JsonSentEvent jsonSentEvent = (UserInteractionLatencyEvent.JsonSentEvent) obj;
        jsonWriter.getClass();
        if (jsonSentEvent == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("t");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(jsonSentEvent.t, this.longAdapter, jsonWriter, "e");
        this.anyAdapter.toJson(jsonWriter, jsonSentEvent.e);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(63, "GeneratedJsonAdapter(UserInteractionLatencyEvent.JsonSentEvent)");
    }
}
