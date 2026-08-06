package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Yc implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f5429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f5430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f5431c;

    public Yc(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f5429a = remoteConfigExtensionConfiguration;
        this.f5430b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f5431c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.f5431c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f5430b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f5431c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f5430b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f5430b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f5431c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f5430b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.f5431c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f5429a;
    }
}
