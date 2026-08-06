package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.impl.C0913z2;

/* loaded from: classes.dex */
public enum ApplicationState {
    UNKNOWN(CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE),
    BACKGROUND(C0913z2.f7266g),
    VISIBLE("visible");


    /* renamed from: a, reason: collision with root package name */
    private final String f3786a;

    ApplicationState(String str) {
        this.f3786a = str;
    }

    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f3786a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public String getStringValue() {
        return this.f3786a;
    }
}
