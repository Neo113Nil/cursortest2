package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import io.appmetrica.analytics.MviTouchEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0491nf extends uif implements Function1 {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ MviTouchEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491nf(MviScreen mviScreen, MviTouchEvent mviTouchEvent) {
        super(1);
        this.a = mviScreen;
        this.b = mviTouchEvent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onTouchEvent(this.a, this.b);
        return Unit.a;
    }
}
