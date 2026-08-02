package io.appmetrica.analytics.impl;

import defpackage.eta;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class zr {
    public static boolean a(String str) {
        UUID uuid;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuid = UUID.fromString(b(str));
        } catch (Throwable unused) {
            uuid = null;
        }
        return uuid != null;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        eta.k(0, 8, str, "-", sb);
        eta.k(8, 12, str, "-", sb);
        eta.k(12, 16, str, "-", sb);
        eta.k(16, 20, str, "-", sb);
        sb.append(str.substring(20, 32));
        return sb.toString();
    }
}
