package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes.dex */
public final class Vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f5263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5264b;

    public Vh(C0437gi c0437gi, ModuleEvent moduleEvent) {
        this.f5264b = c0437gi;
        this.f5263a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5264b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportEvent(this.f5263a);
    }
}
