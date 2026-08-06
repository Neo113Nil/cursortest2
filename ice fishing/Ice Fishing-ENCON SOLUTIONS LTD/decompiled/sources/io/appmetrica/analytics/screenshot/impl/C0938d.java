package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import h1.C0237g;
import h1.InterfaceC0233c;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7633a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7634b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0944j f7635c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0233c f7636d = R1.d.y(new C0935a(this));

    public C0938d(ClientContext clientContext, U u2) {
        this.f7633a = clientContext;
        this.f7634b = u2;
    }

    public static final Activity.ScreenCaptureCallback d(C0938d c0938d) {
        return N0.b.c(((C0237g) c0938d.f7636d).a());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0947m c0947m) {
        this.f7635c = c0947m != null ? c0947m.f7664a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f7633a.getActivityLifecycleRegistry().registerListener(new C0937c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
