package io.appmetrica.analytics.locationinternal.impl;

import defpackage.scc;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0988t1 extends RemoteConfigExtensionConfiguration {
    public final RemoteConfigUpdateListener a;

    public C0988t1(RemoteConfigUpdateListener<LocationConfig> remoteConfigUpdateListener) {
        this.a = remoteConfigUpdateListener;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
    public final Map<String, Integer> getBlocks() {
        return kotlin.collections.b.i(new Pair("lc", 1), new Pair("tht", 1));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
    public final List<String> getFeatures() {
        return scc.g("lc", "lbs", "wa", "wc", "ca", "cai", "caico", "gplc", "tht");
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
    public final JsonParser<LocationConfig> getJsonParser() {
        return new N0();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
    public final Converter<LocationConfig, byte[]> getProtobufConverter() {
        return new C0935c1();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
    public final RemoteConfigUpdateListener<LocationConfig> getRemoteConfigUpdateListener() {
        return this.a;
    }
}
