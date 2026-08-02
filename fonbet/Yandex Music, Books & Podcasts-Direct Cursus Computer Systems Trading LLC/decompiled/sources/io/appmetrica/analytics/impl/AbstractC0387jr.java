package io.appmetrica.analytics.impl;

import com.yandex.auth.LegacyAccountType;

/* renamed from: io.appmetrica.analytics.impl.jr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0387jr {
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
