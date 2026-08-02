package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import defpackage.sls;
import io.appmetrica.analytics.screenshot.impl.C1096a;
import io.appmetrica.analytics.screenshot.impl.C1099d;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1096a extends Lambda implements sls {
    public final /* synthetic */ C1099d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096a(C1099d c1099d) {
        super(0);
        this.a = c1099d;
    }

    public static final void a(C1099d c1099d) {
        ((C1115u) c1099d.b).a("AndroidApiScreenshotCaptor");
    }

    @Override // defpackage.sls
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C1099d c1099d = this.a;
        return new Activity.ScreenCaptureCallback() { // from class: cg61
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C1096a.a(C1099d.this);
            }
        };
    }
}
