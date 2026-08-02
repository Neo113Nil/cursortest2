package io.appmetrica.analytics.impl;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes4.dex */
public final class Mb implements InterfaceC0194aj {
    public final Context a;
    public final ICommonExecutor b;
    public final String c = Constants.REFERRER_API_GOOGLE;

    public Mb(Context context, ICommonExecutor iCommonExecutor) {
        this.a = context;
        this.b = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        if (!ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            wi.a(new C0252cj("Google Play Install Referrer library is not detected", null, 2, null));
            return;
        }
        Lb lb = new Lb(this.b);
        try {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(this.a).build();
            build.startConnection(new Kb(lb, build, wi));
        } catch (Throwable th) {
            C0313en c0313en = Cm.a;
            c0313en.getClass();
            c0313en.a(new Dm("Failed to get referrer from Google Play referrer library", th));
            wi.a(new C0252cj("Failed to get referrer from Google Play referrer library", th));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.c;
    }
}
