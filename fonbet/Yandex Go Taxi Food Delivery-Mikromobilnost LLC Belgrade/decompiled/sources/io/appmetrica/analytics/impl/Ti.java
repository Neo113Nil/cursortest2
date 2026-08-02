package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class Ti {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "gpl";
        }
        if (i == 3) {
            return "hms-content-provider";
        }
        if (i == 4) {
            return CoreConstants.Transport.RUSTORE;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RS" : "HMS" : "GP" : "UNKNOWN";
    }
}
