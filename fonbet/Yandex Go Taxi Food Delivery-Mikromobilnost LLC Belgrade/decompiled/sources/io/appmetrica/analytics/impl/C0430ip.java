package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: io.appmetrica.analytics.impl.ip, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0430ip implements InterfaceC0875y7 {
    public final /* synthetic */ StartupParamsCallback a;
    public final /* synthetic */ C0459jp b;

    public C0430ip(C0459jp c0459jp, StartupParamsCallback startupParamsCallback) {
        this.b = c0459jp;
        this.a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0875y7
    public final void a(int i, Bundle bundle) {
        this.b.b(bundle, this.a);
    }
}
