package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ym implements ServiceComponentModuleReporter {
    public final P5 a;
    public final C0672tn b;

    public /* synthetic */ Ym(P5 p5, C0672tn c0672tn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(p5, (i & 2) != 0 ? new C0672tn() : c0672tn);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(@NotNull ServiceModuleCounterReport serviceModuleCounterReport) {
        this.b.getClass();
        this.a.a(C0672tn.a(serviceModuleCounterReport));
    }

    public Ym(@NotNull P5 p5, @NotNull C0672tn c0672tn) {
        this.a = p5;
        this.b = c0672tn;
    }
}
