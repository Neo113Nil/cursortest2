package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import defpackage.oal;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0933a extends uif implements Function0 {
    public final /* synthetic */ C0936d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933a(C0936d c0936d) {
        super(0);
        this.a = c0936d;
    }

    public static final void a(C0936d c0936d) {
        ((C0955x) c0936d.b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        return new oal(1, this.a);
    }
}
