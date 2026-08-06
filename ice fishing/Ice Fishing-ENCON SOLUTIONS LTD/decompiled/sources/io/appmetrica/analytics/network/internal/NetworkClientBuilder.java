package io.appmetrica.analytics.network.internal;

import android.os.Bundle;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class NetworkClientBuilder extends NetworkClient.Builder {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.appmetrica.analytics.networkapi.NetworkClient$Builder] */
    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public NetworkClient build() {
        NetworkClientSettings settings = getSettings();
        Bundle applicationMetaData = NetworkClientServiceLocator.getInstance().getApplicationMetaData();
        c cVar = null;
        Iterator it = AbstractC0253j.C(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.network.custom") : null, "io.appmetrica.analytics.networkokhttp.internal.OkHttpNetworkClientBuilder", "io.appmetrica.analytics.networklegacy.internal.LegacyNetworkClientBuilder").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ?? r3 = (NetworkClient.Builder) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), NetworkClient.Builder.class);
            if (r3 != 0) {
                cVar = r3;
                break;
            }
        }
        if (cVar == null) {
            cVar = new c();
        }
        PublicLogger.Companion.getAnonymousInstance().info("Created " + cVar, new Object[0]);
        return cVar.withSettings(settings).build();
    }
}
