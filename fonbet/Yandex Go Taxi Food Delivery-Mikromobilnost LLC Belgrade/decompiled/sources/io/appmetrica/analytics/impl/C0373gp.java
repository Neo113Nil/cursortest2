package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.gp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0373gp extends HashMap {
    public C0373gp() {
        put(EnumC0315ep.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC0315ep.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC0315ep.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
