package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0462mf extends uif implements Function1 {
    public final /* synthetic */ MviScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462mf(MviScreen mviScreen) {
        super(1);
        this.a = mviScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onStop(this.a);
        return Unit.a;
    }
}
