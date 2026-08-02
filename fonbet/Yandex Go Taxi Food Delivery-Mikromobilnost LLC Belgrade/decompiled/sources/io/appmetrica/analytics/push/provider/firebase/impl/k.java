package io.appmetrica.analytics.push.provider.firebase.impl;

import android.content.Context;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class k extends n {
    public static final String c;

    static {
        Locale locale = Locale.US;
        c = "Expected two identifiers: google_app_id and gcm_defaultSenderId in resources. Use gradle plugin com.google.gms.google-services in your application build.gradle and add google-services.json in your project. See more at https://appmetrica.io/docs/mobile-sdk-dg/push/android-initialize.html";
    }

    public k(Context context) {
        super(context, c);
    }

    @Override // io.appmetrica.analytics.push.provider.firebase.impl.n
    public final String a() {
        return CoreUtils.getStringFromResources(this.a, "google_api_key");
    }

    @Override // io.appmetrica.analytics.push.provider.firebase.impl.n
    public final String b() {
        return CoreUtils.getStringFromResources(this.a, "google_app_id");
    }

    @Override // io.appmetrica.analytics.push.provider.firebase.impl.n
    public final String c() {
        return CoreUtils.getStringFromResources(this.a, "project_id");
    }

    @Override // io.appmetrica.analytics.push.provider.firebase.impl.n
    public final String d() {
        return CoreUtils.getStringFromResources(this.a, "gcm_defaultSenderId");
    }
}
