package com.squareup.cash.pools.backend.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/pools/backend/api/ParticipantJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/pools/backend/api/Participant;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParticipantJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter participantTypeAdapter;

    public ParticipantJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("type", "addedAt", "customerToken", "fullName", "profilePhotoUrl");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.participantTypeAdapter = moshi.adapter(ParticipantType.class, emptySet, "type");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "addedAt");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "customerToken");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        ParticipantType participantType = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                participantType = (ParticipantType) this.participantTypeAdapter.fromJson(jsonReader);
                if (participantType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName != 1) {
                JsonAdapter jsonAdapter = this.nullableStringAdapter;
                if (selectName == 2) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                } else if (selectName == 3) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                } else if (selectName == 4) {
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                }
            } else {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (participantType != null) {
            return new Participant(participantType, l, str, str2, str3);
        }
        throw Util.missingProperty("type", "type", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Participant participant = (Participant) obj;
        jsonWriter.getClass();
        if (participant == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.participantTypeAdapter.toJson(jsonWriter, participant.f1187type);
        jsonWriter.name("addedAt");
        this.nullableLongAdapter.toJson(jsonWriter, participant.addedAt);
        jsonWriter.name("customerToken");
        String str = participant.customerToken;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("fullName");
        jsonAdapter.toJson(jsonWriter, participant.fullName);
        jsonWriter.name("profilePhotoUrl");
        jsonAdapter.toJson(jsonWriter, participant.profilePhotoUrl);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(33, "GeneratedJsonAdapter(Participant)");
    }
}
