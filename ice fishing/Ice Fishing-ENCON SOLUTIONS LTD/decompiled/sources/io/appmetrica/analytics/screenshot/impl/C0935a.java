package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C0935a;
import io.appmetrica.analytics.screenshot.impl.C0938d;
import t1.InterfaceC1046a;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935a extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0938d f7628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0935a(C0938d c0938d) {
        super(0);
        this.f7628a = c0938d;
    }

    public static final void a(C0938d c0938d) {
        ((C0957x) c0938d.f7634b).a("AndroidApiScreenshotCaptor");
    }

    @Override // t1.InterfaceC1046a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C0938d c0938d = this.f7628a;
        return new Activity.ScreenCaptureCallback() { // from class: N0.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C0935a.a(C0938d.this);
            }
        };
    }
}
