package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Ag implements InterfaceC0780v {
    @Override // io.appmetrica.analytics.impl.InterfaceC0780v
    public final Map<String, String> a(Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
