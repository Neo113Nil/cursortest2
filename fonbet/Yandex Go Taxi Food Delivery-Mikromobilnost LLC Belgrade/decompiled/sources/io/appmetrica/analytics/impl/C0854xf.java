package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0854xf extends Lambda implements tls {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ MviTimestamp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0854xf(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        super(1);
        this.a = mviScreen;
        this.b = mviTimestamp;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onFirstFrameDrawn(this.a, this.b);
        return zy11.a;
    }
}
