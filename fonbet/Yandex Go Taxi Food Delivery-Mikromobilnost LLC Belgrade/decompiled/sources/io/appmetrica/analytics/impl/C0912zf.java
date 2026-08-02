package io.appmetrica.analytics.impl;

import android.view.KeyEvent;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0912zf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ KeyEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0912zf(MviScreen mviScreen, KeyEvent keyEvent) {
        super(1);
        this.a = mviScreen;
        this.b = keyEvent;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onKeyEvent(this.a, this.b);
        return zy11.a;
    }
}
