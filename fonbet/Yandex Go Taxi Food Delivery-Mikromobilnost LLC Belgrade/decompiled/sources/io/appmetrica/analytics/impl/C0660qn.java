package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0660qn implements ServiceComponentModuleReporter {
    public final S5 a;
    public final Ln b;

    public /* synthetic */ C0660qn(S5 s5, Ln ln, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s5, (i & 2) != 0 ? new Ln() : ln);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.b.getClass();
        this.a.a(Ln.a(serviceModuleCounterReport));
    }

    public C0660qn(S5 s5, Ln ln) {
        this.a = s5;
        this.b = ln;
    }
}
