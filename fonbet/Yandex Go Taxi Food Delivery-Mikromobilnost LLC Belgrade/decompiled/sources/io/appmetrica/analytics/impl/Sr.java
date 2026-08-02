package io.appmetrica.analytics.impl;

import defpackage.oyr;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class Sr {
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
        oyr.C(0, 8, str, "-", sb);
        oyr.C(8, 12, str, "-", sb);
        oyr.C(12, 16, str, "-", sb);
        oyr.C(16, 20, str, "-", sb);
        sb.append(str.substring(20, 32));
        return sb.toString();
    }
}
