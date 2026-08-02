package io.appmetrica.analytics.networkquality.impl;

import defpackage.wls;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class d extends Lambda implements wls {
    public static final d a = new d();

    public d() {
        super(2);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new NetworkClientBuilder().withSettings((NetworkClientSettings) obj).build().newCall((Request) obj2).execute();
    }
}
