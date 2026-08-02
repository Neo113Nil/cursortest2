package defpackage;

import io.appmetrica.analytics.BuildConfig;

/* loaded from: classes4.dex */
public enum adk {
    Internal(BuildConfig.SDK_BUILD_FLAVOR),
    External("external");

    public final String a;

    adk(String str) {
        this.a = str;
    }
}
