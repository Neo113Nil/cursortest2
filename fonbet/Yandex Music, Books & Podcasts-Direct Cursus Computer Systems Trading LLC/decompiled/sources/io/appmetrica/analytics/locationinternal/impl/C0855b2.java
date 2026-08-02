package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0855b2 extends BaseRequestConfig.ComponentLoader {
    public C0855b2(@NonNull Context context) {
        super(context, context.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0859c2 load(@NonNull C0870f1 c0870f1) {
        C0859c2 c0859c2 = (C0859c2) super.load((C0855b2) c0870f1);
        H0 h0 = (H0) c0870f1.componentArguments;
        c0859c2.b = h0.b;
        c0859c2.a = h0.a;
        c0859c2.setRetryPolicyConfig(h0.c);
        return c0859c2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C0859c2();
    }

    @NonNull
    public final C0859c2 a() {
        return new C0859c2();
    }
}
