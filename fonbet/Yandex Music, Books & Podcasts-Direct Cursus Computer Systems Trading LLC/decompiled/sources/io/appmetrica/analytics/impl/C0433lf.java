package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTimestamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0433lf extends uif implements Function1 {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ MviTimestamp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0433lf(MviScreen mviScreen, MviTimestamp mviTimestamp) {
        super(1);
        this.a = mviScreen;
        this.b = mviTimestamp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onStart(this.a, this.b);
        return Unit.a;
    }
}
