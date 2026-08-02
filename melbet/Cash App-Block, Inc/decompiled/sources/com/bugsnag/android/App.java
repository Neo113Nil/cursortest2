package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.dag.Provider;

/* loaded from: classes.dex */
public class App implements JsonStream.Streamable {
    public final String binaryArch;
    public final Provider buildUuidProvider;
    public final String codeBundleId;
    public final String id;
    public final String releaseStage;

    /* renamed from: type, reason: collision with root package name */
    public final String f936type;
    public final String version;
    public final Number versionCode;

    public App(String str, String str2, String str3, String str4, String str5, Provider provider, String str6, Number number) {
        this.binaryArch = str;
        this.id = str2;
        this.releaseStage = str3;
        this.version = str4;
        this.codeBundleId = str5;
        this.f936type = str6;
        this.versionCode = number;
        this.buildUuidProvider = provider;
    }

    public void serialiseFields$bugsnag_android_core_release(JsonStream jsonStream) {
        jsonStream.name("binaryArch");
        jsonStream.value(this.binaryArch);
        jsonStream.name("buildUUID");
        Provider provider = this.buildUuidProvider;
        jsonStream.value(provider != null ? (String) provider.getOrNull() : null);
        jsonStream.name("codeBundleId");
        jsonStream.value(this.codeBundleId);
        jsonStream.name("id");
        jsonStream.value(this.id);
        jsonStream.name("releaseStage");
        jsonStream.value(this.releaseStage);
        jsonStream.name("type");
        jsonStream.value(this.f936type);
        jsonStream.name("version");
        jsonStream.value(this.version);
        jsonStream.name("versionCode");
        jsonStream.value(this.versionCode);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        serialiseFields$bugsnag_android_core_release(jsonStream);
        jsonStream.endObject();
    }
}
