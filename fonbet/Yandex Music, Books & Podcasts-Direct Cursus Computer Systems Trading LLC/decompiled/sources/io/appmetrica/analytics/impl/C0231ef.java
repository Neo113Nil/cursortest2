package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0231ef extends uif implements Function1 {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231ef(MviScreen mviScreen, Set set) {
        super(1);
        this.a = mviScreen;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).confirmReporting(this.a, this.b);
        return Unit.a;
    }
}
