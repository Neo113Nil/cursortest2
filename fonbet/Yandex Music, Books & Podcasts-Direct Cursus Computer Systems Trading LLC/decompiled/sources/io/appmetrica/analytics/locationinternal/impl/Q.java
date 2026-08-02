package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class Q {
    public static int a(ApplicationState applicationState) {
        if (applicationState != null) {
            int i = P.a[applicationState.ordinal()];
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 2;
            }
        }
        return 1;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VISIBLE" : "BACKGROUND" : "UNKNOWN";
    }

    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "bg";
        }
        if (i == 3) {
            return "visible";
        }
        throw null;
    }
}
