package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445h0 implements InterfaceC0753so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C0702qo(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C0702qo(this, true, "");
        } catch (Throwable unused) {
            return new C0702qo(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
