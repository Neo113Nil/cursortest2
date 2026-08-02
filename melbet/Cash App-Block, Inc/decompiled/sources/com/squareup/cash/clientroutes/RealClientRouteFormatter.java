package com.squareup.cash.clientroutes;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class RealClientRouteFormatter {
    public final ClientRoutesConfig clientRoutesConfig;
    public final RealUriFormatter uriFormatter;

    public RealClientRouteFormatter(ClientRoutesConfig clientRoutesConfig, int i) {
        clientRoutesConfig = (i & 1) != 0 ? ClientRoutesConfig.standard : clientRoutesConfig;
        clientRoutesConfig.getClass();
        this.clientRoutesConfig = clientRoutesConfig;
        this.uriFormatter = RealUriFormatter.INSTANCE;
    }

    public final String format(ClientRouteSpec clientRouteSpec, Map map, String str) {
        clientRouteSpec.getClass();
        map.getClass();
        this.clientRoutesConfig.getClass();
        String pathFormat = clientRouteSpec.getPathFormat();
        List parameterNames = clientRouteSpec.getParameterNames();
        AccountRequirement accountRequirement = clientRouteSpec.getAccountRequirement();
        this.uriFormatter.getClass();
        return RealUriFormatter.format("https", "internal.cash.app", pathFormat, parameterNames, map, str, accountRequirement);
    }
}
