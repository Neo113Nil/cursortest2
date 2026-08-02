package com.squareup.cash.google.pay;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/GooglePayActivationPresenter_VisaExtrasJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/GooglePayActivationPresenter$VisaExtras;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayActivationPresenter_VisaExtrasJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public GooglePayActivationPresenter_VisaExtrasJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("panReferenceID", "tokenReferenceID");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "panReferenceID");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("panReferenceID", "panReferenceID", jsonReader);
                    }
                } else if (selectName == 1 && (str2 = (String) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("tokenReferenceID", "tokenReferenceID", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("panReferenceID", "panReferenceID", jsonReader);
        }
        if (str2 != null) {
            return new GooglePayActivationPresenter$VisaExtras(str, str2);
        }
        throw Util.missingProperty("tokenReferenceID", "tokenReferenceID", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GooglePayActivationPresenter$VisaExtras googlePayActivationPresenter$VisaExtras = (GooglePayActivationPresenter$VisaExtras) obj;
        jsonWriter.getClass();
        if (googlePayActivationPresenter$VisaExtras == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("panReferenceID");
        String str = googlePayActivationPresenter$VisaExtras.panReferenceID;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("tokenReferenceID");
        jsonAdapter.toJson(jsonWriter, googlePayActivationPresenter$VisaExtras.tokenReferenceID);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(61, "GeneratedJsonAdapter(GooglePayActivationPresenter.VisaExtras)");
    }
}
