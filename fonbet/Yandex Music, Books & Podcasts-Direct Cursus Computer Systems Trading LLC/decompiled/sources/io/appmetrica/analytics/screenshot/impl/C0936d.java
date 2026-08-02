package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import defpackage.arf;
import defpackage.btf;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0936d implements T {
    public final ClientContext a;
    public final U b;
    public volatile C0942j c;
    public final arf d = btf.b(new C0933a(this));

    public C0936d(@NotNull ClientContext clientContext, @NotNull U u) {
        this.a = clientContext;
        this.b = u;
    }

    public static final Activity.ScreenCaptureCallback d(C0936d c0936d) {
        return (Activity.ScreenCaptureCallback) c0936d.d.getValue();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.a.getActivityLifecycleRegistry().registerListener(new C0935c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0945m c0945m) {
        this.c = c0945m != null ? c0945m.a : null;
    }
}
