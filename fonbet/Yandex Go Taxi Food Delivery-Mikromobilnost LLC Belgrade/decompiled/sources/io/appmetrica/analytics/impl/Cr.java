package io.appmetrica.analytics.impl;

import com.yandex.auth.LegacyAccountType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class Cr {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return LegacyAccountType.STRING_LOGIN;
        }
        if (i == 2) {
            return "logout";
        }
        if (i == 3) {
            return "switch";
        }
        if (i == 4) {
            return "update";
        }
        throw null;
    }
}
