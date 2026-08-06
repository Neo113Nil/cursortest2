package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class Nl implements A6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ol f4835b;

    public Nl(Ol ol, StartupParamsCallback startupParamsCallback) {
        this.f4835b = ol;
        this.f4834a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.A6
    public final void a(int i2, Bundle bundle) {
        this.f4835b.b(bundle, this.f4834a);
    }
}
