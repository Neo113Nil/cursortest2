package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0932b2 extends BaseRequestConfig.ComponentLoader {
    public C0932b2(Context context) {
        super(context, context.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0936c2 load(C0947f1 c0947f1) {
        C0936c2 c0936c2 = (C0936c2) super.load((C0932b2) c0947f1);
        H0 h0 = (H0) c0947f1.componentArguments;
        c0936c2.b = h0.b;
        c0936c2.a = h0.a;
        c0936c2.setRetryPolicyConfig(h0.c);
        return c0936c2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0936c2();
    }

    public final C0936c2 a() {
        return new C0936c2();
    }
}
