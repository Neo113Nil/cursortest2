package com.squareup.cash.account.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/account/backend/PrincipalAccountTokenSomeJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/account/backend/PrincipalAccountTokenSomeJson;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrincipalAccountTokenSomeJsonJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public PrincipalAccountTokenSomeJsonJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("accountToken", "switchingIdentifier");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "accountToken");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "switchingIdentifier");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("accountToken", "accountToken", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new PrincipalAccountTokenSomeJson(str, str2);
        }
        throw Util.missingProperty("accountToken", "accountToken", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        PrincipalAccountTokenSomeJson principalAccountTokenSomeJson = (PrincipalAccountTokenSomeJson) obj;
        jsonWriter.getClass();
        if (principalAccountTokenSomeJson == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("accountToken");
        this.stringAdapter.toJson(jsonWriter, principalAccountTokenSomeJson.accountToken);
        jsonWriter.name("switchingIdentifier");
        this.nullableStringAdapter.toJson(jsonWriter, principalAccountTokenSomeJson.switchingIdentifier);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(51, "GeneratedJsonAdapter(PrincipalAccountTokenSomeJson)");
    }
}
