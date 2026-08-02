package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import io.appmetrica.analytics.impl.C0553n3;

/* loaded from: classes9.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(C0553n3.g),
    VISIBLE("visible");

    private final String a;

    ApplicationState(String str) {
        this.a = str;
    }

    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public String getStringValue() {
        return this.a;
    }
}
