package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Af extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ MviTimestamp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Af(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        super(1);
        this.a = mviScreen;
        this.b = mviTimestamp;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onStart(this.a, this.b);
        return zy11.a;
    }
}
