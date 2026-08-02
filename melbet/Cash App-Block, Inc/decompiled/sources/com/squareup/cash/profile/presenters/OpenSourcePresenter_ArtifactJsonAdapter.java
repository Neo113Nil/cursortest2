package com.squareup.cash.profile.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$Artifact;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/profile/presenters/OpenSourcePresenter_ArtifactJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/profile/presenters/OpenSourcePresenter$Artifact;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OpenSourcePresenter_ArtifactJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableListOfSpdxLicenseAdapter;
    public final JsonAdapter nullableListOfUnknownLicenseAdapter;
    public final JsonAdapter nullableScmAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public OpenSourcePresenter_ArtifactJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("groupId", "artifactId", "version", "name", "spdxLicenses", "unknownLicenses", "scm");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "groupId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableListOfSpdxLicenseAdapter = moshi.adapter(Types.newParameterizedType(List.class, OpenSourcePresenter$Artifact.SpdxLicense.class), emptySet, "spdxLicenses");
        this.nullableListOfUnknownLicenseAdapter = moshi.adapter(Types.newParameterizedType(List.class, OpenSourcePresenter$Artifact.UnknownLicense.class), emptySet, "unknownLicenses");
        this.nullableScmAdapter = moshi.adapter(OpenSourcePresenter$Artifact.Scm.class, emptySet, "scm");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        OpenSourcePresenter$Artifact.Scm scm = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("groupId", "groupId", jsonReader);
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("artifactId", "artifactId", jsonReader);
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("version", "version", jsonReader);
                    }
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    list = (List) this.nullableListOfSpdxLicenseAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    list2 = (List) this.nullableListOfUnknownLicenseAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    scm = (OpenSourcePresenter$Artifact.Scm) this.nullableScmAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -121) {
            OpenSourcePresenter$Artifact.Scm scm2 = scm;
            List list3 = list2;
            List list4 = list;
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            String str8 = str;
            if (str8 == null) {
                throw Util.missingProperty("groupId", "groupId", jsonReader);
            }
            if (str7 == null) {
                throw Util.missingProperty("artifactId", "artifactId", jsonReader);
            }
            if (str6 != null) {
                return new OpenSourcePresenter$Artifact(str8, str7, str6, str5, list4, list3, scm2);
            }
            throw Util.missingProperty("version", "version", jsonReader);
        }
        OpenSourcePresenter$Artifact.Scm scm3 = scm;
        List list5 = list2;
        List list6 = list;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OpenSourcePresenter$Artifact.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, List.class, OpenSourcePresenter$Artifact.Scm.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor constructor2 = constructor;
        if (str12 == null) {
            throw Util.missingProperty("groupId", "groupId", jsonReader);
        }
        if (str11 == null) {
            throw Util.missingProperty("artifactId", "artifactId", jsonReader);
        }
        if (str10 == null) {
            throw Util.missingProperty("version", "version", jsonReader);
        }
        Object newInstance = constructor2.newInstance(str12, str11, str10, str9, list6, list5, scm3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (OpenSourcePresenter$Artifact) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        OpenSourcePresenter$Artifact openSourcePresenter$Artifact = (OpenSourcePresenter$Artifact) obj;
        jsonWriter.getClass();
        if (openSourcePresenter$Artifact == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("groupId");
        String str = openSourcePresenter$Artifact.groupId;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("artifactId");
        jsonAdapter.toJson(jsonWriter, openSourcePresenter$Artifact.artifactId);
        jsonWriter.name("version");
        jsonAdapter.toJson(jsonWriter, openSourcePresenter$Artifact.version);
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, openSourcePresenter$Artifact.name);
        jsonWriter.name("spdxLicenses");
        this.nullableListOfSpdxLicenseAdapter.toJson(jsonWriter, openSourcePresenter$Artifact.spdxLicenses);
        jsonWriter.name("unknownLicenses");
        this.nullableListOfUnknownLicenseAdapter.toJson(jsonWriter, openSourcePresenter$Artifact.unknownLicenses);
        jsonWriter.name("scm");
        this.nullableScmAdapter.toJson(jsonWriter, openSourcePresenter$Artifact.scm);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(OpenSourcePresenter.Artifact)");
    }
}
