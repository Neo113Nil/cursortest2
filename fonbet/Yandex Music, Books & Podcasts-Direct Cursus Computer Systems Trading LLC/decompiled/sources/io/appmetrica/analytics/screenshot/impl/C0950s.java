package io.appmetrica.analytics.screenshot.impl;

import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0950s extends uif implements Function0 {
    public final /* synthetic */ C0953v a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950s(C0953v c0953v) {
        super(0);
        this.a = c0953v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C0955x) this.a.b).a("ContentObserverScreenshotCaptor");
        return Unit.a;
    }
}
