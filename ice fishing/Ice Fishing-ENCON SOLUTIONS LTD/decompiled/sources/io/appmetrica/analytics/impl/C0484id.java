package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484id extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0613nd f6187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f6188b;

    public C0484id(C0613nd c0613nd, ModuleEvent moduleEvent) {
        this.f6187a = c0613nd;
        this.f6188b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0613nd.a(this.f6187a).reportEvent(this.f6188b);
    }
}
