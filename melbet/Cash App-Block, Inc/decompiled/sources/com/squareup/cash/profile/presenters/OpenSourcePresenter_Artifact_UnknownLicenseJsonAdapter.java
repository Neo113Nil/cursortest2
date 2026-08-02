package com.squareup.cash.profile.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$Artifact;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/profile/presenters/OpenSourcePresenter_Artifact_UnknownLicenseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/profile/presenters/OpenSourcePresenter$Artifact$UnknownLicense;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OpenSourcePresenter_Artifact_UnknownLicenseJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public OpenSourcePresenter_Artifact_UnknownLicenseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "url");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "name");
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
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                } else if (selectName == 1 && (str2 = (String) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("url", "url", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 != null) {
            return new OpenSourcePresenter$Artifact.UnknownLicense(str, str2);
        }
        throw Util.missingProperty("url", "url", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        OpenSourcePresenter$Artifact.UnknownLicense unknownLicense = (OpenSourcePresenter$Artifact.UnknownLicense) obj;
        jsonWriter.getClass();
        if (unknownLicense == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        String str = unknownLicense.name;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("url");
        jsonAdapter.toJson(jsonWriter, unknownLicense.url);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(65, "GeneratedJsonAdapter(OpenSourcePresenter.Artifact.UnknownLicense)");
    }
}
