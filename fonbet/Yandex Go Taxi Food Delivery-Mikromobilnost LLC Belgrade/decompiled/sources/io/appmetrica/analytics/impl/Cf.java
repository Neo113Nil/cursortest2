package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTouchEvent;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class Cf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ MviTouchEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cf(MviScreen mviScreen, MviTouchEvent mviTouchEvent) {
        super(1);
        this.a = mviScreen;
        this.b = mviTouchEvent;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onTouchEvent(this.a, this.b);
        return zy11.a;
    }
}
