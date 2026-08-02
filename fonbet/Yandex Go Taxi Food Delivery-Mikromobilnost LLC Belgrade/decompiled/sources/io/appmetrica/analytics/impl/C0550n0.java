package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import defpackage.oyr;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0550n0 implements Vr {
    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Tr(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new Tr(this, true, "");
        } catch (Throwable unused) {
            return new Tr(this, false, oyr.p("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
