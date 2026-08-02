package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import defpackage.i3y;
import defpackage.n05;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1099d implements B {
    public final ClientContext a;
    public final C b;
    public volatile C1104i c;
    public final i3y d = kotlin.a.a(new C1096a(this));

    public C1099d(ClientContext clientContext, C c) {
        this.a = clientContext;
        this.b = c;
    }

    public static final Activity.ScreenCaptureCallback d(C1099d c1099d) {
        return n05.d(c1099d.d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.B
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.a.getActivityLifecycleRegistry().registerListener(new C1098c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.B
    public final void a(C1106k c1106k) {
        this.c = c1106k != null ? c1106k.b : null;
    }
}
